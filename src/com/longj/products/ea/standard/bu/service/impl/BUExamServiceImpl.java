package com.longj.products.ea.standard.bu.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;
import org.wdk.module.wql.core.engine.object.WO;

import wql.WQLNames;

import com.longj.products.ea.standard.bu.BUServiceUtil;
import com.longj.products.ea.standard.bu.service.BUBaseService;
import com.longj.products.ea.standard.bu.service.BUExamService;

public class BUExamServiceImpl extends BUBaseService implements BUExamService {
	
	public static HashMap<String, String> statusMap =new HashMap<String, String>();
	
	static{
		statusMap.put("s001", "已提交");
		statusMap.put("s002", "已删除");
		statusMap.put("s003", "已预约");
		statusMap.put("s004", "已撤销");
		statusMap.put("s005", "已签到");
		statusMap.put("s006", "开始检查");
		statusMap.put("s007", "检查结束");
		statusMap.put("s008", "已出报告");
		statusMap.put("", "");
		statusMap.put(null, "无");
	}
	
	public BUExamServiceImpl(){
		this.setWQL_OBJECT_EXAM("EA_BU_Exam");
		this.setPrimaryKey("exam_id");
		this.set_statusFieldName("form_status");
	}
	
	public BUExamServiceImpl(String primaryKey,String modulename){
		this.setWQL_OBJECT_EXAM(modulename);
		this.setPrimaryKey(primaryKey);
	}

	@Override
	public JSONObject getPatientBaseInfo(String patientId) {
		// TODO Auto-generated method stub
		JSONObject jo = new JSONObject();
		return jo;
	}

	@Override
	public JSONArray getHistoryExamList(ConnectBean conb, String doctorId,
			String patientId, String startTime, String endTime,
			String otherWhereClause) throws Exception {
		StringBuffer whereClause = new StringBuffer();
		List<String> paramList = new ArrayList<String>();
		if (patientId != null && patientId.trim().length() > 0) {
			this.appendWhereCondition(whereClause, "patient_id = ?");
			paramList.add(patientId);
		}
		if (doctorId != null && doctorId.trim().length() > 0) {
			this.appendWhereCondition(whereClause, "doctor_id = ?");
			paramList.add(doctorId);
		}
		if (startTime != null && startTime.trim().length() > 0) {
			this.appendWhereCondition(whereClause, "exam_create_dt >= ?");
			paramList.add(startTime);
		}
		if (endTime != null && endTime.trim().length() > 0) {
			this.appendWhereCondition(whereClause, "exam_create_dt <= ?");
			paramList.add(endTime);
		}
		if (otherWhereClause != null && otherWhereClause.trim().length() > 0) {
			this.appendWhereCondition(whereClause, otherWhereClause);
		}

		ResultBean rb = wqlQuery(conb,
				this.getWQLObject("V_EA_BU_Appointment"),
				whereClause.toString(), paramList, "exam_create_dt desc");
		if (rb != null && rb.isSuccess()) {
			return rb.getResultJSONArray(0);
		}
		return new JSONArray();
	}

	@Override
	public JSONArray saveExamFormList(ConnectBean conb, JSONArray formList)
			throws Exception {
		return this.saveJSONarraArray(conb, formList);
	}

	@Override
	public String getOperCode(String oldVal, String newVal, String codeModule) {
		String code = "s005";// 操作标识：默认
		if (oldVal == null || "".equals(oldVal.trim())) {
			code = "s001";// 操作标识：新建
			if ("s001".equals(newVal)) {
				code = "s004";// 操作标识：提交
			}
		} else {
			if (newVal == null || "".equals(newVal.trim())
					|| "s002".equals(newVal)) {
				code = "s003";// 操作标识：删除或者作废了
			} else if (!oldVal.equals(newVal)) {
				code = "s002";// 操作标识：变更
			}
		}
		return code;
	}

	@Override
	public String getOperDesc(String oldVal, String newVal, String codeModule) {
		StringBuilder sb = new StringBuilder();
		//WQLModule wm = WQLModule.getWQLModule("CODE_BU_FORM_STATUS");
		sb.append("将单据状态从").append(statusMap.get(oldVal) ).append("变更为").append(statusMap.get(newVal));
		return sb.toString();
	}

	@Override
	public JSONArray updateExamForm(ConnectBean conb, JSONObject jo) throws Exception {
		JSONArray rows = new JSONArray();
		rows.add(jo);
		//HashMap values = new HashMap();
		//values.put("updatedt", WDK.getDateTime());
		//wqlUpdate(conb, getWQLObject("EA_BU_Exam"), values, "exam_id=?", new String[]{"1"});
		//return null;
		return this.saveJSONarraArray(conb, rows);
	}
	
	@Override
	public JSONArray getChargeDtlbyExamItem(ConnectBean conb,String examitem_id) throws Exception{
		JSONArray jsonrows = new JSONArray();
		ResultBean rb = WQL.getWO(WQLNames.QEABIEXAM0001).addParam("flag", "103").addParam("examitem_id", examitem_id).process(conb);
		if (rb != null && rb.isSuccess()) {
			JSONArray rows = rb.getResultJSONArray(0);
			for (int i = 0; i < rows.size(); i++) {
				JSONObject jo = rows.getJSONObject(i);
				JSONObject value = new JSONObject();
				value.put("fyxh", jo.getLong("item_id"));// HIS系统中，费用明细表主键
				value.put("fysl", jo.getInt("item_amount"));// 预约系统中，填写的套餐内的费用条目数量
				jsonrows.add(value);
			}
			//fyjson = jsonrows.toString();
		}
		
		return jsonrows;
	}
	
	@Override
	public String getExamCategoryId(ConnectBean conb, String examId) throws Exception {
		String examCategoryId = null;
		WO categoryWo = WQL.getWO(WQLNames.QEABUEXAM0003).addParam("flag", "2").addParam("exam_id", examId);
		ResultBean categoryRb = categoryWo.process(conb);
		if (categoryRb != null && categoryRb.isSuccess()) {
			WQLData wdCategoty = categoryRb.getWQLData(0);
			if (wdCategoty != null) {
				wdCategoty.first();
				if (wdCategoty.next()) {
					examCategoryId = wdCategoty.getValue("examcate_id");
				}
			}
		}
		return examCategoryId;
	}
	
	@Override
	public long getExamItemPackageMoney(ConnectBean conb, String examitem_id) {
		long examprice = 0;
		if (examitem_id != null && examitem_id.trim().length() > 0) {
			ResultBean rb = WQL.getWO(WQLNames.QEABIEXAM0001).addParam("flag", "102").addParam("examitem_id", examitem_id).process(conb);
			if (rb != null && rb.isSuccess()) {
				JSONArray rows = rb.getResultJSONArray(0);
				for (int i = 0; i < rows.size(); i++) {
					JSONObject jo = rows.getJSONObject(i);
					examprice += jo.getLong("package_money");
				}
			}
		}
		return examprice;
	}
	
	@Override
	public Map<String, Integer> getExamCategoryDayLimit(ConnectBean conb, List<String> examCategoryIds) throws Exception {
		WQLObject woCategoty = WQLObject.getWQLObject("EA_BI_ExamCategory");
		Map<String, Integer> mapping = new HashMap<String, Integer>();
		ResultBean rb = woCategoty.query("examcate_id IN (" + BUServiceUtil.getQuestionMark(examCategoryIds.size()) + ")", examCategoryIds.toArray(new String[examCategoryIds.size()]), "examcate_id", conb);
		if (rb != null && rb.isSuccess()) {
			WQLData rows = rb.getWQLData(woCategoty, 0);
			if (rows != null) {
				rows.first();
				while (rows.next()) {
					String day_limint = rows.getValue("day_limit");
					String examcate_id = rows.getValue("examcate_id");
					int dayLimint = -1;
					if (day_limint != null && day_limint.trim().length() > 0) {
						dayLimint = Integer.parseInt(day_limint);
					}
					mapping.put(examcate_id, dayLimint);
				}
			}
		}
		return mapping;
	}
}
