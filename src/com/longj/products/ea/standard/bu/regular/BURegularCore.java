package com.longj.products.ea.standard.bu.regular;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.engine.object.WO;

import wql.WQLNames;

public class BURegularCore {

	public static JSONArray engineLib = new JSONArray();

	/*
	 * [{ clazz:"",
	 * 
	 * }
	 * 
	 * 
	 * 
	 * ]
	 */

	public static synchronized JSONArray getEngineLib(ConnectBean conb) {
		if (engineLib == null || engineLib.size() == 0) {
			ResultBean paramRb = WQL.getWO(WQLNames.QEABIREG0002).addParam("flag", "2").process(conb);
			HashMap<String, JSONObject> mapping = new HashMap<String, JSONObject>();
			if (paramRb != null && paramRb.isSuccess()) {
				JSONArray rows = paramRb.getResultJSONArray(0);
				for (int i = 0; i < rows.size(); i++) {
					JSONObject row = rows.getJSONObject(i);
					String instId = row.getString("inst_id");
					JSONObject param = null;
					if (mapping.containsKey(instId)) {
						param = mapping.get(instId);
					} else {
						param = new JSONObject();
					}
					param.put(row.getString("param_name"), row.getString("field_value"));
					mapping.put(instId, param);
				}
			}
			ResultBean regRb = WQL.getWO(WQLNames.QEABIREG0002).addParam("flag", "1").process(conb);
			if (regRb != null && regRb.isSuccess()) {
				JSONArray rows = regRb.getResultJSONArray(0);
				for (int i = 0; i < rows.size(); i++) {
					JSONObject row = rows.getJSONObject(i);
					String instId = row.getString("inst_id");
					row.put("params", mapping.get(instId));
				}
				engineLib = rows;
			}
		
		}
		return engineLib;
	}

	/**
	 * 处理校验的真实入口
	 * 
	 * @param conb
	 * @param patinet_id
	 * @param examTypeId
	 * @param examCategoryId
	 * @param apptDt
	 * @return
	 * @throws Exception
	 */
	public static boolean process(ConnectBean conb, List<String> msg, String patinet_id, String examTypeId, String examCategoryId, Date apptDt) throws Exception {
		boolean canContinue = true;
		JSONArray lib = getEngineLib(conb);
		if (lib != null && lib.size() > 0) {
			for (int i = 0; i < lib.size(); i++) {
				JSONObject jo = lib.getJSONObject(i);
				if(!jo.containsKey("params")){
					continue;
				}
				String clazz = jo.getString("clazz");
				if (clazz != null && clazz.trim().length() > 0) {
					Class Cls = Class.forName(clazz);
					BUBaseRegular reg = (BUBaseRegular) Cls.newInstance();
					reg.setInitData(jo);
					boolean isOK = reg.matcher(conb, patinet_id, examTypeId, examCategoryId, apptDt);
					if (!isOK) {
						msg.add(reg.getInst_name());
						String errorMsg = reg.getErrorMsg();
						if (errorMsg != null && errorMsg.trim().length() > 0) {
							msg.add(errorMsg);
						}
						canContinue = false;
						break;
					}
				}

			}
		}
		return canContinue;
	}

	/**
	 * 预检查
	 * 
	 * @param conb
	 * @param msg
	 * @param examId
	 * @param appt_dt
	 * @return
	 * @throws Exception
	 */
	public static boolean preCheck(ConnectBean conb, List<String> msg, String examId, String appt_dt) throws Exception {
		boolean canContinue = true;
		if(appt_dt==null||"".equals(appt_dt.trim())){
			return canContinue;
		}

		WO wo = WQL.getWO(WQLNames.QEABUEXAM0003).addParam("flag", "2").addParam("exam_id", examId);
		ResultBean rb = wo.process(conb);
		if (rb != null && rb.isSuccess()) {
			WQLData wd = rb.getWQLData(0);
			if (wd != null) {
				wd.first();
				if (wd.next()) {
					String patinet_id = wd.getValue("patient_id");
					String examTypeId = wd.getValue("examtype_id");
					String examCategoryId = wd.getValue("examcate_id");
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
					Date apptDt = sdf.parse(appt_dt);
					canContinue = process(conb, msg, patinet_id, examTypeId, examCategoryId, apptDt);
				}
			}
		}

		return canContinue;
	}

}
