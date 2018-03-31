package com.longj.products.ea.standard.bu.ws.impl;

import java.util.Map;

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
import com.longj.products.ea.standard.bi.bean.EAPatient;
import com.longj.products.ea.standard.bi.util.EAUtil;
import com.longj.products.ea.standard.bu.BUConstant;
import com.longj.products.ea.standard.bu.BUServiceUtil;
import com.longj.products.ea.standard.bu.ws.BasePaceAdapter;

/**
 * 内镜方面pacs套路
 * 
 * @author YuBin
 * 
 */
public class EndoScopePacsAdapter extends BasePaceAdapter {
	private static WDKLogger logger = new WDKLogger(EndoScopePacsAdapter.class.getName());// 日志操作类

	// 杨浩这边的接口同步
	@Override
	public boolean _addBillSync2PacsCore(JSONObject joSrc, Map<String, String> apptRoomMap) throws Exception {
		ConnectBean conb = null;
		boolean _isSuccess = false;
		// 不管是签到成功还是失败，都要更新数据库数据
		JSONObject updateJo = new JSONObject();
		try {
			conb = ConnectBean.getConnectBean();
			conb.beginTransation();
			JSONObject jsonstr = this.buildNewJSONObject(conb, joSrc);
			String examId = joSrc.getString("exam_id");// 本次操作的申请单
			String runMode = WDK.getNodeParam("run_mode");
			String responeseString = "";
			PBMark.insert(PBMark.TYPE_MSG, examId, PBMark.DIRECTION_Request, jsonstr.toString(), conb);
			if ("0".equals(runMode)) {
				// 开发环境下默认为成功！
				responeseString = "true@取消内镜检查登记成功！";
			} else {
				if (this.isCanNotice2Pacs()) {
					String namespaceURI = "http://tempuri.org/";
					String methodName = "InsertPacsInfo";
					Service service = new Service();
					Call call = (Call) service.createCall();
					call.setTargetEndpointAddress(new java.net.URL(this.getPacsEndpoint()));
					// 设置要调用的方法
					// http://intelink.net/是wsdl中definitions根节点的targetNamespace属性值
					call.setOperationName(new QName(namespaceURI, methodName));
					// 该方法需要的参数
					call.addParameter(new QName(namespaceURI, "strlistvalue"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
					// call.addParameter("GetPatientInfoResult",
					// org.apache.axis.encoding.XMLType.XSD_STRING,
					// javax.xml.rpc.ParameterMode.OUT);
					// call.addParameter("out_id",
					// org.apache.axis.encoding.XMLType.XSD_STRING,
					// javax.xml.rpc.ParameterMode.OUT);
					// 方法的返回值类型
					call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);
					call.setUseSOAPAction(true);
					call.setSOAPActionURI(namespaceURI + methodName);
					// 调用该方法,传入 ws.GetPatientInfo("3085315", "t1", out mzhm);
					responeseString = (String) call.invoke(new Object[] { jsonstr.toString() });
				} else {
					_isSuccess = false;
				}
			}
			PBMark.insert(PBMark.TYPE_MSG, examId, PBMark.DIRECTION_Response, responeseString, conb);
			if (responeseString != null && responeseString.trim().length() > 0) {
				logger.info("[PACS]===================[PACS]" + responeseString);
				String[] infos = responeseString.split("@");
				if (infos.length > 1) {
					_isSuccess = Boolean.parseBoolean(infos[0]);
				}
			}
			updateJo.put("exam_id", examId);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
			_isSuccess = false;
		} finally {
			if (conb != null) {
				if (!_isSuccess) {
					updateJo.put("sign_status", "3");// 签到失败
				} else {
					updateJo.put("sign_status", "2");// 签到成功
					updateJo.put("form_status", BUConstant.FORM_STATUS_s005);// 已签到状态
				}
				BUServiceUtil.getBUExamService2().updateExamForm(conb, updateJo);
				conb.commitTransation();// 提交事务
			}
		}
		return _isSuccess;
	}

	@Override
	public JSONObject buildNewJSONObject(ConnectBean conb, JSONObject oldJsonObject) {
		JSONObject returnJo = new JSONObject();
		EAPatient eap = EAUtil.queryPatient(oldJsonObject.getString("patient_id"), oldJsonObject.getString("exam_type"), oldJsonObject.getString("out_id"));
		returnJo.put("SFZH", eap.getSfzh());
		String patinet_type = oldJsonObject.getString("exam_type");
		String brlx = BUConstant.PATIENT_SORT_MZ.equals(patinet_type) ? "1" : "2";
		returnJo.put("XM", oldJsonObject.getString("patient_name"));
		returnJo.put("XB", "1".equals(eap.getSex()) ? "0" : "1");// 0男1女
		returnJo.put("NL", eap.getAgename());
		returnJo.put("CSRQ", eap.getCsny());// 出生日期
		returnJo.put("HYZK", "");// 婚姻状况
		returnJo.put("ZY", "");// 职业
		if (BUConstant.PATIENT_SORT_MZ.equals(patinet_type)) {
			returnJo.put("ZYKS", oldJsonObject.getString("dept_id"));// 门诊开单科室->住院科室
			returnJo.put("ZYBQ", "");
			returnJo.put("ZYH", "");
			returnJo.put("MZH", oldJsonObject.getString("patient_code"));
		} else {
			returnJo.put("ZYBQ", oldJsonObject.getString("dept_id"));// 住院病区
			returnJo.put("ZYKS", "");
			returnJo.put("MZH", "");
			returnJo.put("ZYH", oldJsonObject.getString("patient_code"));
		}
		returnJo.put("MZKS", "");// 门诊科室,门诊没用，暂时留空
		returnJo.put("CWH", oldJsonObject.getString("bed_no"));
		returnJo.put("SQYS", oldJsonObject.getString("doctor_id"));
		returnJo.put("DZ", "");// 地址
		returnJo.put("DHHM", "");// 电话号码
		returnJo.put("GZDW", "");// 工作单位
		returnJo.put("JG", "");// 籍贯
		returnJo.put("ZW", "");// 职务
		returnJo.put("BRLX", brlx);// 病人类型（1门诊，2住院）
		returnJo.put("LCBX", oldJsonObject.getString("exam_bs"));
		returnJo.put("LCZD", oldJsonObject.getString("exam_zd"));// 诊断
		returnJo.put("YYRQ", oldJsonObject.getString("appt_date"));// 预约日期
		returnJo.put("DJRQ", WDK.getDateTime());// 登记日期
		String examtype_id = oldJsonObject.getString("examtype_id");// 检查类型
		returnJo.put("JCLX", examtype_id);// 检查类型
		String examitem_id = oldJsonObject.getString("examitem_id");
		long examprice = BUServiceUtil.getBUExamService2().getExamItemPackageMoney(conb, examitem_id);
		returnJo.put("SFJE", examprice + "");// 收费金额
		returnJo.put("SQDID", oldJsonObject.getString("exam_id"));// SQDID申请单ID
		String zxks = "";
		if (examtype_id != null && examtype_id.trim().length() > 0) {
			WQLObject deptRelateExamType = WQLObject.getWQLObject("EA_BI_DepartMentExamType");
			if (deptRelateExamType != null) {
				ResultBean rb = deptRelateExamType.query("examtype_id = ?", new String[] { examtype_id }, "dept_id", conb);
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
		returnJo.put("ZS", zxks);// 诊室(检查科室)
		return returnJo;
	}

	@Override
	public boolean isCanNotice2Pacs() {
		String endpoint = WDK.getNodeParam("endo_register_endpoint");// 胃镜检查系统对外提供的服务地址
		boolean canContinue = false;//
		if (endpoint != null && endpoint.trim().length() > 0) {
			// 不管扣费是否成功，都可以在胃镜检查系统进行登记操作的
			canContinue = true;
		}
		return canContinue;
	}

	@Override
	public String getPacsEndpoint() {
		return WDK.getNodeParam("endo_register_endpoint");
	}

	@Override
	public boolean _removeBillSync2PacsCore(ConnectBean conb, JSONObject joSrc) throws Exception {
		String namespaceURI = "http://tempuri.org/";
		String methodName = "DeletePacsInfo";
		String examId = joSrc.getString("exam_id");
		String apptId = joSrc.getString("appt_id");
		// 删除pacs系统中的申请单
		PBMark.insert(PBMark.TYPE_MSG, examId, PBMark.DIRECTION_Request, examId, conb);
		String runMode = WDK.getNodeParam("run_mode");
		String paramBodyStr = "";
		if ("0".equals(runMode)) {
			paramBodyStr = "true@取消内镜检查登记成功！";
		} else {
			Service service = new Service();
			Call call = (Call) service.createCall();
			call.setTargetEndpointAddress(new java.net.URL(this.getPacsEndpoint()));
			// 设置要调用的方法
			// http://intelink.net/是wsdl中definitions根节点的targetNamespace属性值
			call.setOperationName(new QName(namespaceURI, methodName));
			// 该方法需要的参数
			call.addParameter(new QName(namespaceURI, "Sqdid"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			// call.addParameter("GetPatientInfoResult",
			// org.apache.axis.encoding.XMLType.XSD_STRING,
			// javax.xml.rpc.ParameterMode.OUT);
			// call.addParameter("out_id",
			// org.apache.axis.encoding.XMLType.XSD_STRING,
			// javax.xml.rpc.ParameterMode.OUT);
			// 方法的返回值类型
			call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);
			call.setUseSOAPAction(true);
			call.setSOAPActionURI(namespaceURI + methodName);
			// 调用该方法,传入 ws.GetPatientInfo("3085315", "t1", out mzhm);
			paramBodyStr = (String) call.invoke(new Object[] { examId });
		}
		boolean isSuccess = false;
		PBMark.insert(PBMark.TYPE_MSG, examId, PBMark.DIRECTION_Response, paramBodyStr, conb);
		if (paramBodyStr != null && paramBodyStr.trim().length() > 0) {
			String[] infos = paramBodyStr.split("@");
			if (infos.length > 1) {
				isSuccess = Boolean.parseBoolean(infos[0]);
			}
		}
		if (isSuccess) {
			if (apptId != null && apptId.trim().length() > 0) {
				// 已有预约的话，取消掉
				BUServiceUtil.getBUAppointmentService().cancelAppointment(conb, apptId);
			}
			JSONObject updateJo = new JSONObject();
			updateJo.put("exam_id", examId);
			updateJo.put("sign_status", "0");// 签到状态为0
			updateJo.put("form_status", BUConstant.FORM_STATUS_s004);
			/*
			 * if (isZyTF) { updateJo.put("charge_dt", "");
			 * updateJo.put("charge_status", BUConstant.CHARGE_STATUS_s004);//
			 * 住院退费 }
			 */
			BUServiceUtil.getBUExamService().updateExamForm(conb, updateJo);
		}
		// false@错误信息
		return isSuccess;
	}

}
