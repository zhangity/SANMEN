package com.longj.products.ea.standard.bu.ws.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

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
import com.longj.products.ea.standard.bu.HttpClientUtil;
import com.longj.products.ea.standard.bu.ws.BasePaceAdapter;

/**
 * 传统的基本的pacs套路
 * 
 * @author YuBin
 * 
 */
public class NormalPacsAdapter extends BasePaceAdapter {
	private static WDKLogger logger = new WDKLogger(NormalPacsAdapter.class.getName());// 日志操作类
	
	/**
	 * 通过格式化获取排队号
	 * 
	 * @param rooom_code
	 * @param date
	 * @return
	 */
	private String getPacsQueueNo(String rooom_code, Date date) {
		SimpleDateFormat sdf2 = new SimpleDateFormat("ddHHmm");
		String returnStr = "";
		try {
			int intCode = Integer.parseInt(rooom_code);
			rooom_code = String.format("%02d", intCode);
			returnStr = rooom_code + sdf2.format(date);
		} catch (NumberFormatException e) {
			returnStr = rooom_code + sdf2.format(date);
		}
		return returnStr;
	}

	@Override
	public boolean _addBillSync2PacsCore(JSONObject joSrc, Map<String, String> apptRoomMap) throws Exception {
		ConnectBean conb = null;
		boolean _isSuccess = false;
		// 不管是签到成功还是失败，都要更新数据库数据
		JSONObject updateJo = new JSONObject();
		try {
			conb = ConnectBean.getConnectBean();
			conb.beginTransation();
			String examId = joSrc.getString("exam_id");// 本次操作的申请单
			if (this.isCanNotice2Pacs()) {
				JSONObject jo = buildNewJSONObject(conb, joSrc);
				Map<String, String> headerMap = new HashMap<String, String>();
				// 如果已经给了房间号，就从内存获取房间号
				if (apptRoomMap.containsKey(examId)) {
					String roomNo = apptRoomMap.get(examId);
					if (roomNo == null || "".equals(roomNo.trim())) {
						roomNo = "";
					}
					String isemergency = jo.getString("isemergency");
					if (!"1".equals(isemergency)) {
						// 非急诊的情况，才需要提前生成排队号码
						String date = joSrc.getString("appt_dt");
						String time = joSrc.getString("start_point");
						if (time == null || "".equals(time.trim()) || date == null || "".equals(date.trim())) {
							jo.put("queueNo", "");
						} else {
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							Date d = sdf.parse(date + " " + time + ":00");
							Date noew = new Date();
							if (noew.after(d)) {
								// 如果现在时间在预约时间之后，就代表过号了，那么排队号码需要采用当前最新的是爱你
								jo.put("queueNo", getPacsQueueNo(roomNo, noew));
							} else {
								jo.put("queueNo", getPacsQueueNo(roomNo, d));
							}
						}
					}else{
						jo.put("queueNo", "");
					}
					jo.put("roomNo", roomNo);

				} else {
					jo.put("roomNo", "");
				}
				PBMark.insert(PBMark.TYPE_MSG, examId, PBMark.DIRECTION_Request, jo.toString(), conb);
				String runMode = WDK.getNodeParam("run_mode");
				String responeseString = "";
				if ("0".equals(runMode)) {
					// 开发环境下默认为成功！
					responeseString = "[{\"msgCode\":\"2000\",\"msgFlag\":\"true\",\"msg\":\"登记成功\", queueID : \"00280001\"}]";
				} else {
					responeseString = HttpClientUtil.postJson4Body(this.getPacsEndpoint() + "/Interface/AppointmentReport?rnd=" + Math.random(), headerMap, jo);
				}
				PBMark.insert(PBMark.TYPE_MSG, examId, PBMark.DIRECTION_Response, responeseString, conb);
				if (responeseString != null && responeseString.trim().length() > 0) {
					logger.info("[PACS]===================[PACS]" + responeseString);
					JSONArray rows = JSONArray.fromObject(responeseString);
					if (rows != null && rows.size() > 0) {
						JSONObject result = rows.getJSONObject(0);
						String msgCode = result.getString("msgCode");
						// 签到登记成功后，更新当前数据库的状态信息
						if ("2000".equals(msgCode)) {
							_isSuccess = true;
						}
					}
				}
			} else {
				_isSuccess = false;
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
				conb.commitTransation();//提交事务
			}
		}
		return _isSuccess;
	}

	@Override
	public boolean _removeBillSync2PacsCore(ConnectBean conb,JSONObject joSrc) throws Exception {
		Map<String, String> headerMap = new HashMap<String, String>();
		String examId = joSrc.getString("exam_id");
		String apptId = joSrc.getString("appt_id");
		JSONObject jo = new JSONObject();
		jo.put("applyNo", examId);
		// 删除pacs系统中的申请单
		PBMark.insert(PBMark.TYPE_MSG, examId, PBMark.DIRECTION_Request, jo.toString(), conb);
		String runMode = WDK.getNodeParam("run_mode");
		String paramBodyStr = "";
		if ("0".equals(runMode)) {
			paramBodyStr = "[{\"msgCode\":\"2000\",\"msgFlag\":\"true\",\"msg\":\"取消成功\", queueID : \"00280001\"}]";
		} else {
			paramBodyStr = HttpClientUtil.postJson4Body(this.getPacsEndpoint() + "/Interface/DeleteReport?rnd=" + Math.random(), headerMap, jo);
		}
		boolean isSuccess = false;
		PBMark.insert(PBMark.TYPE_MSG, examId, PBMark.DIRECTION_Response, paramBodyStr, conb);
		if (paramBodyStr != null && paramBodyStr.trim().length() > 0) {
			logger.info("<<<<<<<<<<<<<" + paramBodyStr);
			JSONArray jrows = JSONArray.fromObject(paramBodyStr);
			if (jrows != null && jrows.size() > 0) {
				JSONObject result = jrows.getJSONObject(0);
				String msgCode = result.getString("msgCode");
				if ("2000".equals(msgCode)) {
					if (apptId != null && apptId.trim().length() > 0) {
						// 已有预约的话，取消掉
						 BUServiceUtil.getBUAppointmentService().cancelAppointment(conb, apptId);
					}
					JSONObject updateJo = new JSONObject();
					updateJo.put("exam_id", examId);
					updateJo.put("sign_status", "0");// 签到状态为0
					updateJo.put("form_status", BUConstant.FORM_STATUS_s004);
					/*
					if (isZyTF) {
						updateJo.put("charge_dt", "");
						updateJo.put("charge_status", BUConstant.CHARGE_STATUS_s004);// 住院退费
					}*/
					BUServiceUtil.getBUExamService().updateExamForm(conb, updateJo);
					isSuccess = true;
				}
			}
		}
		return isSuccess;
	}

	/**
	 * 根据检查预约系统的属性，构建出符合pacs系统要求的对象
	 * 
	 * @param conb
	 * @param oldJsonObject
	 * @return
	 */
	@Override
	public JSONObject buildNewJSONObject(ConnectBean conb, JSONObject oldJsonObject) {
		JSONObject returnJo = new JSONObject();
		returnJo.put("registerNo", oldJsonObject.getString("exam_id"));// 就诊登记号
		returnJo.put("applyNo", oldJsonObject.getString("exam_id"));// 检查申请单单号
		returnJo.put("hospitalCode", "0");// 检查医院编码（拍片医院），一般为乡医院
		returnJo.put("patientId", oldJsonObject.getString("patient_id"));// 患者唯一标识号
		returnJo.put("name", oldJsonObject.getString("patient_name"));// 患者姓名
		String regType = BUConstant.PATIENT_SORT_MZ.equals(oldJsonObject.getString("exam_type")) ? "0" : "1";
		returnJo.put("regType", regType);// 就诊类型，0 门诊/1 住院
		EAPatient eap = EAUtil.queryPatient(oldJsonObject.getString("patient_id"), oldJsonObject.getString("exam_type"), oldJsonObject.getString("out_id"));
		returnJo.put("sex", eap.getSex());// 患者性别，1 男/2 女/9 其他
		returnJo.put("age", eap.getAgename());// 患者年龄，pacs系统要求，必须带单位
		returnJo.put("identityCardNo", eap.getSfzh());// 身份证号
		returnJo.put("applyOrg", "三门县人民医院");//
		returnJo.put("applyDepName", oldJsonObject.getString("dept_idname"));// 申请科室（名称）
		returnJo.put("applyDepCode", oldJsonObject.getString("dept_id"));// 申请科室（ID）
		returnJo.put("itemCode", oldJsonObject.getString("examitem_idname"));// 检查项目名称
		String itemId =  oldJsonObject.getString("examitem_id");//检查项目的编码
		WQLObject wo = WQLObject.getWQLObject("EA_BI_ExamItem");
		ResultBean rb = wo.query("item_id = ?", new String[]{itemId}, "item_id", conb);
		returnJo.put("itemName","");// 多个检查部位的名称
		if (rb != null && rb.isSuccess()) {
			WQLData data = rb.getWQLData(wo, 0);
			if (data != null) {
				data.first();
				try {
					if (data.next()) {
						String parts = data.getValue("exam_part");
						parts = parts.replaceAll(",", "//");
						parts = parts.replaceAll("\n", "//");
						returnJo.put("itemName", parts);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		returnJo.put("applyDocCode", oldJsonObject.getString("doctor_id"));// 申请医生编码
		returnJo.put("applyDocName", oldJsonObject.getString("doctor_idname"));// 申请医生姓名
		returnJo.put("applyDate", WDK.getDateTime());// 开单时间，格式：yyyy-MM-dd,HH:mm:ss
		returnJo.put("examTypeCode", oldJsonObject.getString("examtype_id"));// 检查类型编码,例如,001
		returnJo.put("examType", oldJsonObject.getString("examtype_idname"));// 检查类型名称,例如CT
		returnJo.put("chiefComplaint", oldJsonObject.getString("exam_zs"));// 主诉
		returnJo.put("symptoms", oldJsonObject.getString("exam_bs"));// 症状
		returnJo.put("inspectAim", oldJsonObject.getString("exam_ct"));// 检查情况
		returnJo.put("diagName", oldJsonObject.getString("exam_zd"));// 诊断情况
		returnJo.put("isemergency", oldJsonObject.getString("isemergency"));// 是否急诊
		String examitem_id = oldJsonObject.getString("examitem_id");
		long examprice = BUServiceUtil.getBUExamService2().getExamItemPackageMoney(conb, examitem_id);
		returnJo.put("examprice", examprice + "");// 检查单对应的检查项目的套餐总和
		return returnJo;
	}

	@Override
	public boolean isCanNotice2Pacs() {
		String endpoint = WDK.getNodeParam("pacs_register_endpoint");// pacs系统对外提供的服务地址
		boolean canContinue = false;//
		if (endpoint != null && endpoint.trim().length() > 0) {
			// 不管扣费是否成功，都可以在pacs系统进行登记操作的
			canContinue = true;
		}
		return canContinue;
	}

	@Override
	public String getPacsEndpoint() {
		return WDK.getNodeParam("pacs_register_endpoint");
	}

}
