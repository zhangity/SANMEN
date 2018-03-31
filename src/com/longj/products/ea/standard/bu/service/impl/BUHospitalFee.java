package com.longj.products.ea.standard.bu.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.namespace.QName;

import net.sf.json.JSONObject;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.wdk.WDK;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.platform.pb.mark.PBMark;
import com.longj.products.ea.standard.bu.BUConstant;
import com.longj.products.ea.standard.bu.BUServiceUtil;

/**
 * 【住院HIS】[扣费]和[退费]接口相关类
 * 
 * @author YuBin
 * 
 */
public abstract class BUHospitalFee {
	
	
	private boolean isNeedDayLimit = true;// 是否需要每日扣费数量限制

	public boolean isNeedDayLimit() {
		return isNeedDayLimit;
	}
	public void setNeedDayLimit(boolean isNeedDayLimit) {
		this.isNeedDayLimit = isNeedDayLimit;
	}

	public static String HISPITAL_FEE_STATUS_0 = "0";// 未处理，根本未条用his系统的接口
	public static String HISPITAL_FEE_STATUS_1 = "1";// 处理成功
	public static String HISPITAL_FEE_STATUS_2 = "2";// 处理失败

	private static WDKLogger logger = new WDKLogger(BUHospitalFee.class.getName());// 日志操作类

	protected static ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

	private String examId;// 检查单的ID

	private String examCategoryId;// 检查分类ID
	
	private String examTypeId;//本次检查单的检查类型ID

	private String owncharge;// 是否自费的标识1-自费；0-医保

	protected int isjf;// 是否计费;1-计费；0-退费

	private String patient_id;// 住院病人的ID

	private String fyjson;// 费用明细的json

	private String ysdm;// 检查单的开单医生的代码；
	

	private String srgh;// 当前退费或者扣费操作的人员

	private String feeStatus;

	private Map<String, Object> params = new HashMap<String, Object>();

	public void putParam(String key, Object obj) {
		params.put(key, obj);
	}

	public Object getParam(String key) {
		return params.get(key);
	}

	private boolean isDefaultCallBack = true;

	public boolean isDefaultCallBack() {
		return isDefaultCallBack;
	}

	public void setDefaultCallBack(boolean isDefaultCallBack) {
		this.isDefaultCallBack = isDefaultCallBack;
	}

	public String getExamId() {
		return examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
	}

	public int getIsjf() {
		return isjf;
	}

	public void setIsjf(int isjf) {
		this.isjf = isjf;
	}

	public BUHospitalFee(String examId, String examCategoryId, int isjf, String patient_id, String fyjson, String ysdm, String srgh, String owncharge,String examTypeId) {
		super();
		this.examId = examId;
		this.examCategoryId = examCategoryId;
		this.isjf = isjf;
		this.patient_id = patient_id;
		this.fyjson = fyjson;
		this.ysdm = ysdm;
		this.srgh = srgh;
		this.owncharge = owncharge;
		this.examTypeId = examTypeId;
	}

	public void process() {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				String zxks = "";
				if (examTypeId != null && examTypeId.trim().length() > 0) {
					WQLObject deptRelateExamType = WQLObject.getWQLObject("EA_BI_DepartMentExamType");
					if (deptRelateExamType != null) {
						ResultBean rb = deptRelateExamType.query("examtype_id = ?", new String[] { examTypeId }, "dept_id", null);
						if (rb != null && rb.isSuccess()) {
							WQLData wd = rb.getWQLData(deptRelateExamType, 0);
							if (wd != null) {
								wd.first();
								if (wd.next()) {
									try {
										zxks = wd.getValue("dept_id");
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							}
						}
					}
				}
				boolean isDoFee = false;
				if (isjf == 1) {// 如果是扣费
					if (examCategoryId == null || "".equals(examCategoryId)) {
						isDoFee = true;
					} else {
						if (BUConstant.CHARGE_TYPE_OWN.equals(owncharge)) {
							isDoFee = true;// 如果是自费的话，也直接扣费算了，不要去判断那个数量的限制了
						} else {
							// 如果是计费，那就需要判断有没超过当日计费限制
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							int dayLimint = -1;
							if (isNeedDayLimit) {
								try {
									Calendar cal = Calendar.getInstance();
									cal.set(Calendar.AM_PM, Calendar.AM);
									cal.set(Calendar.HOUR, 0);
									cal.set(Calendar.MINUTE, 0);
									cal.set(Calendar.SECOND, 0);
									String start = sdf.format(cal.getTime());
									cal.add(Calendar.DATE, 1);
									String end = sdf.format(cal.getTime());
									List<String> examCategoryIds = new ArrayList<String>();
									examCategoryIds.add(examCategoryId);
									dayLimint = BUServiceUtil.getBUExamService2().getExamCategoryDayLimit(null, examCategoryIds).get(examCategoryId);
									if (dayLimint > -1) {
										if (dayLimint > 0) {
											WQLObject examWo = WQLObject.getWQLObject("EA_BU_Exam");
											String whereCondition = "exam_type = ? and charge_status = ? and charge_dt>='" + start + "' and patient_id = '" + patient_id + "' and charge_dt<'" + end
													+ "'  and owncharge = '0' and examitem_id IN(select t9.item_id from EA_BI_ExamItem t9 where t9.examcate_id ='" + examCategoryId + "')";
											String[] args = new String[] { BUConstant.PATIENT_SORT_ZY, BUConstant.CHARGE_STATUS_s003 };
											ResultBean historyRb = examWo.query(whereCondition, args, "exam_id", null);
											if (historyRb != null && historyRb.isSuccess()) {
												WQLData wd = historyRb.getWQLData(examWo, 0);
												int hisrotyCount = wd.getRowCount();
												if (dayLimint - hisrotyCount > 0) {
													isDoFee = true;// 还有剩余名额的话，就去扣费了
												}
											}
										} else {
											System.out.println("开单数量限制配置为0");
										}
									} else {
										isDoFee = true;// 没有每日数量限制的话，直接扣除
									}
								} catch (Exception e) {
									try {
										e.printStackTrace();
										logger.error(e);
									} catch (Exception e1) {
										e1.printStackTrace();
									}
								}
							}else{
								// 这种场景一般是护士人工操作，那么此时可以不受每日数量限制的控制
								isDoFee = true;
							}
						}
					}
				} else {
					// 如果是退费的话，就不需要进行判断了
					isDoFee = true;
					// 执行进行退费操作
				}
				// 最后一步：进行扣费或者不做任何操作
				if (isDoFee) {
					fee(zxks);
				} else {
					notFee();
				}
			}
		};
		// 丢入线程池执行
		cachedThreadPool.execute(r);

	}

	/**
	 * 未进行扣费
	 */
	private void notFee() {
		feeStatus = HISPITAL_FEE_STATUS_0;
		callBack(feeStatus);
	}

	/**
	 * 执行住院扣费或者退费的操作
	 * private String zxks;//本次检查单的执行科室，一般是医技科室的部门代号，如503等
	 * @return
	 */
	private void fee(String zxks) {
		JSONObject jo = new JSONObject();
		boolean isFeeSuccess = false;// 默认住院扣费操作失败
		try {
			String runMode = WDK.getNodeParam("run_mode");
			if ("0".equals(runMode)) {
				// 开发默认就默认扣款或者退款成功；
				isFeeSuccess = true;
			} else {

				// webserviceURL
				String service_url = "http://10.10.1.13:89/Services/WSToJCYY.asmx";
				String namespaceURI = "http://tempuri.org/";
				String methodName = "InsertInpatientExpense";
				try {
					String _service_url = WDK.getNodeParam("his_server_endpoint");
					if (_service_url != null && _service_url.trim().length() > 0) {
						service_url = _service_url;
					}

					String _namespaceURI = WDK.getNodeParam("his_server_namespace");
					if (_namespaceURI != null && _namespaceURI.trim().length() > 0) {
						namespaceURI = _namespaceURI;
					}
				} catch (Exception e) {
					logger.error(e.getMessage());
				}
				String liencesNo = BUServiceUtil.getLiencesNo();
				JSONObject param = new JSONObject();
				param.put("isjf", isjf);
				param.put("zyhm", patient_id);
				param.put("ysdm", ysdm);
				param.put("srgh", srgh);
				if (zxks == null) {
					zxks = "";// 执行科室不能为null
				}
				param.put("zxks", zxks);
				param.put("sfxm", fyjson);
				Service service = new Service();
				Call call = (Call) service.createCall();
				call.setTargetEndpointAddress(new java.net.URL(service_url));
				// 设置要调用的方法
				// http://intelink.net/是wsdl中definitions根节点的targetNamespace属性值
				call.setOperationName(new QName(namespaceURI, methodName));
				// 该方法需要的参数
				call.addParameter(new QName(namespaceURI, "checkcode"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
				call.addParameter(new QName(namespaceURI, "json"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
				// 方法的返回值类型
				call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);
				call.setUseSOAPAction(true);
				call.setSOAPActionURI(namespaceURI + methodName);
				// 调用该方法,传入 ws.GetPatientInfo("3085315", "t1", out mzhm);
				logger.info("checkcode:" + liencesNo);
				logger.info("json:" + param.toString());
				PBMark.insert(PBMark.TYPE_MSG, examId, PBMark.DIRECTION_Request, param.toString());
				Object xmlStr = call.invoke(new Object[] { liencesNo, param.toString() });
				logger.info(xmlStr.toString());
				PBMark.insert(PBMark.TYPE_MSG, examId, PBMark.DIRECTION_Response, xmlStr.toString());
				// 传出：{"patient_id":"3085315","patient_name":"金凯","sex":"1","csny":"2011/8/4 0:00:00","blhm":"3085315","sfyb":"0","sfzh":"331022201108043675"}
				if (xmlStr != null) {
					String result = (String) xmlStr.toString();
					if (result != null && result.trim().length() > 0 && result.trim().startsWith("{")) {
						jo = JSONObject.fromObject(result);
						if (jo.containsKey("IsSuccess")) {
							// {"IsSuccess":true,"Tip":""}
							isFeeSuccess = jo.getBoolean("IsSuccess");
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			feeStatus = isFeeSuccess ? HISPITAL_FEE_STATUS_1 : HISPITAL_FEE_STATUS_2;
			callBack(feeStatus);
		}
	}

	/**
	 * 内置的回调
	 * 
	 */
	protected void defaultCallBack() {
		defaultCallBack(null);
	}

	/**
	 * 内置的回调
	 * 
	 * @param otherMap
	 */
	protected void defaultCallBack(final Map<String, String> otherMap) {
		// 更新状态，如果是1，那就是扣费成功，如果是0那就是退费成功
		final String fee_status = this.isjf == 1 ? BUConstant.CHARGE_STATUS_s003 : BUConstant.CHARGE_STATUS_s004;
		Runnable r = new Runnable() {
			@Override
			public void run() {
				ConnectBean conb = null;
				boolean isSuccess = false;
				try {
					conb = ConnectBean.getConnectBean();
					conb.beginTransation();
					String chargeDt = "";
					if (BUConstant.CHARGE_STATUS_s003.equals(fee_status)) {
						chargeDt = WDK.getDateTime();
					}
					JSONObject updateJo = new JSONObject();
					updateJo.put("exam_id", examId);
					if (!HISPITAL_FEE_STATUS_0.equals(feeStatus)) {
						updateJo.put("charge_dt", chargeDt);
						updateJo.put("charge_status", fee_status);// 已签到状态
						if (otherMap != null && otherMap.size() > 0) {
							Iterator<String> it = otherMap.keySet().iterator();
							while (it.hasNext()) {
								String key = it.next();
								updateJo.put(key, otherMap.get(key));
							}
						}
						BUServiceUtil.getBUExamService().updateExamForm(conb, updateJo);
					}
					isSuccess = true;
				} catch (Exception e) {
					try {
						logger.error(e);
					} catch (Exception e1) {
					}
					isSuccess = false;
				} finally {
					if (conb != null) {
						if (isSuccess) {
							conb.commitTransation();
						} else {
							conb.rollbackTransation();
						}
					}
				}

			}
		};
		cachedThreadPool.execute(r);
	}

	/**
	 * 执行退费或者扣费后的回调方法
	 * 
	 */
	protected abstract void callBack(String feeStatus);

	public static void main(String[] arg0) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		cal.set(Calendar.AM_PM, Calendar.AM);
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		String start = sdf.format(cal.getTime());
		cal.add(Calendar.DATE, 1);
		String end = sdf.format(cal.getTime());

		System.out.println(start);
		System.out.println(end);

		System.out.println("1".equals(1));
	}
}
