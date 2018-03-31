package com.longj.products.ea.standard.bu.service.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.wdk.WDK;
import org.wdk.core.bean.WDKLogger;
import org.wdk.core.bean.WDKTransationHandler;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLObject;
import org.wdk.module.wql.core.engine.object.WO;

import wql.WQLNames;

import com.longj.products.ea.standard.bu.BUConstant;
import com.longj.products.ea.standard.bu.BUServiceUtil;

public class BUSyncHisHandler implements WDKTransationHandler {
	private static WDKLogger logger = new WDKLogger(BUSyncHisHandler.class.getName());// 日志操作类

	JSONArray commitRows = new JSONArray();

	public JSONArray getCommitRows() {
		return commitRows;
	}

	public void setCommitRows(JSONArray commitRows) {
		this.commitRows = commitRows;
	}

	@Override
	public void transAfter(ConnectBean conb, boolean isSuccess) throws Exception {
		if (isSuccess) {
			Map<String, WO> listWO = new HashMap<String, WO>();
			Map<String, String> mapping = new HashMap<String, String>();
			Map<String, String> mappingOwnCharge = new HashMap<String, String>();
			Map<String, String[]> examtypemappackage = new HashMap<String, String[]>();
			for (int i = 0; i < commitRows.size(); i++) {
				JSONObject jo = commitRows.getJSONObject(i);

				/*
				 * 主表信息： 输入.YJXH 输入.BRID 输入.BRXM 输入.KDRQ 输入.KSDM 输入.YSDM 输入.JZXH
				 */
				String exam_type = jo.getString("exam_type");
				if (BUConstant.PATIENT_SORT_ZY.equals(exam_type)) {
					// 住院病人跳过处理，住院病人在这里不处理，做检查的时候登记签到时，自动进行扣费
					continue;
				}
				String exam_id = WDK.getUUID();
				String examitem_id = jo.getString("examitem_id");
				String YJXH = jo.getString("yjxh");

				String patient_id = jo.getString("patient_id");
				String patient_name = jo.getString("patient_name");
				String createdt = jo.getString("createdt");
				String dept_id = jo.getString("dept_id");
				String doctor_id = jo.getString("doctor_id");
				String out_id = jo.getString("out_id");
				String owncharge = jo.containsKey("owncharge")? jo.getString("owncharge"):"";
				if (out_id == null || "".equals(out_id.trim())) {
					// 门诊的就诊序号，必填，如果外部系统没有给出，这里自动给0
					out_id = "0";
				}
				String dise_id = jo.containsKey("dise_id")? jo.getString("dise_id"):"";//特殊病种的信息
				/*
				 * 从表信息： 输入明细.SBXH ,输入明细.YJXH ,输入明细.YLXH ,输入明细.XMLX ,输入明细.YJZX
				 * ,输入明细.YLDJ ,输入明细.YLSL ,输入明细.HJJE ,输入明细.FYGB ,输入明细.ZFBL
				 */

				WO wo = WQL.getWO(WQLNames.UEAHIS0001).addParam("YJXH", YJXH).addParam("BRID", patient_id).addParam("BRXM", patient_name).addParam("KDRQ", createdt).addParam("KSDM", dept_id).addParam("YSDM", doctor_id).addParam("JZXH", out_id);
				wo.addParam("ZFSY", owncharge);//是否自费
				wo.addParam("GDBZXM", dise_id);
				mappingOwnCharge.put(exam_id, owncharge);
				listWO.put(exam_id, wo);
				mapping.put(exam_id, examitem_id);
			}
			Iterator<String> it = mapping.keySet().iterator();
			List<String> inparam = new ArrayList<String>();
			while (it.hasNext()) {
				String exmaId = it.next();
				String examitem_id = mapping.get(exmaId);
				if (!inparam.contains(examitem_id)) {
					inparam.add(examitem_id);
				}
			}
			String whereValue = BUServiceUtil.getQuestionMark(inparam.size());
			WQLObject wobject = WQLObject.getWQLObject("EA_BI_ExamItem");
			ResultBean rb = wobject.query("item_id IN (" + whereValue + ")", inparam.toArray(new String[inparam.size()]), "item_id", conb);
			List<String> packageList = new ArrayList<String>();
			if (rb != null && rb.isSuccess()) {
				JSONArray examItemRows = rb.getResultJSONArray(0);
				if (examItemRows != null && examItemRows.size() > 0) {
					for (int i = 0; i < examItemRows.size(); i++) {
						JSONObject jo = examItemRows.getJSONObject(i);
						String package_id = jo.getString("package_id");
						String[] packageArray = package_id.split(",");
						packageList.addAll(Arrays.asList(packageArray));
						examtypemappackage.put(jo.getString("item_id"), packageArray);
					}
				}
			}
			Map<String, JSONArray> packageItem = new HashMap<String, JSONArray>();
			// WQLObject chargeItem =
			// WQLObject.getWQLObject("EA_BI_ChargeItem");
			ResultBean chargeRb = WQL.getWO(WQLNames.QEABIEXAM0001).addParam("flag", "101").addParam("package_ids", "'" + StringUtils.join(packageList, "','") + "'").process(conb);
			// chargeItem.query("item_id IN (select t9.item_id from EA_BI_ChargePackageItem t9 where t9.package_id IN ("+getQuestionMark(packageList.size())+"))",
			// packageList.toArray(new String[packageList.size()]), "item_id",
			// conb);
			if (chargeRb != null && chargeRb.isSuccess()) {
				JSONArray rowsw = chargeRb.getResultJSONArray(0);
				if (rowsw != null && rowsw.size() > 0) {
					for (int m = 0; m < rowsw.size(); m++) {
						JSONObject row = rowsw.getJSONObject(m);
						String package_id = row.getString("package_id");
						JSONArray existedList = null;
						if (packageItem.containsKey(package_id)) {
							existedList = packageItem.get(package_id);
						} else {
							existedList = new JSONArray();
						}
						existedList.add(row);
						packageItem.put(package_id, existedList);
					}
				}
			}

			// 以上数据准备完毕，下面开始调用远程数据库内容
			Iterator<String> it2 = mapping.keySet().iterator();

			while (it2.hasNext()) {
				String exam_id = it2.next();
				String examitem_id = mapping.get(exam_id);
				WO _wo = listWO.get(exam_id);
				JSONArray dtl = new JSONArray();
				String[] packageIds = examtypemappackage.get(examitem_id);
				for (String pid : packageIds) {
					JSONArray oldRows = packageItem.get(pid);
					if (oldRows == null || oldRows.size() == 0) {
						continue;
					}
					dtl.addAll(JSONArray.fromObject(oldRows.toString()));
				}

				if (dtl != null && dtl.size() > 0) {
					String zfsy = (String) mappingOwnCharge.get(exam_id);// 是否自费的标识
					logger.info("是否医保的标识值："+zfsy);
					_wo.addParam("dtl_count", dtl.size() + "");
					_wo.addParam("SBXH", getDtlPrimaryKeys(dtl.size()));
					_wo.addParam("YLDJ", getDtlFieldValue(dtl, "item_price"));
					_wo.addParam("YLSL", getDtlFieldValue(dtl, "item_amount"));
					_wo.addParam("HJJE", getDtlFieldValue(dtl, "hjje"));
					_wo.addParam("FYGB", getDtlFieldValue(dtl, "item_type"));
					_wo.addParam("ZFBL", getDtlFieldValue(dtl, null, "1"));//自负比例为1，代表100%自费
					//_wo.addParam("ZFSY", getDtlFieldValue(dtl, null, "1"));//前面已经插入了
					_wo.addParam("YJZX", getDtlFieldValue(dtl, null, "0"));
					_wo.addParam("XMLX", getDtlFieldValue(dtl, null, "0"));
					_wo.addParam("YLXH", getDtlFieldValue(dtl, "item_id", "0"));// HIS医疗收费序号(医疗序号)
				}else{
					_wo.addParam("dtl_count", "0");
				}
				ResultBean rb2 = _wo.process();
				if (rb2 != null && rb2.isSuccess()) {
					logger.info("同步数据成功1条");
				}else{
					System.out.println("失败了");
				}
			}
		}
	}
	
	private String[] getDtlPrimaryKeys(int count) {
		List<String> returnval = new ArrayList<String>();
		try {
			long nextval = BUServiceUtil.getNextVal("MS_YJ02", count);
			while (count > 0) {
				returnval.add(0, nextval + "");
				nextval--;
				--count;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnval.toArray(new String[returnval.size()]);
	}
	private String[] getDtlFieldValue(JSONArray dtl, String key){
		return getDtlFieldValue(dtl, key, null);
	}
			

	/**
	 * 获取明细表中某字段的值数组
	 * 
	 * @param dtl
	 * @param key
	 * @return
	 */
	private String[] getDtlFieldValue(JSONArray dtl, String key,String defalut) {
		List<String> returnVal = new ArrayList<String>();
		if (dtl != null && dtl.size() > 0) {
			for (int i = 0; i < dtl.size(); i++) {
				JSONObject row = dtl.getJSONObject(i);
				if (key!=null && row.containsKey(key)) {
					returnVal.add(row.getString(key));
				}else{
					if(defalut!=null){
						returnVal.add(defalut);
					}
				}
			}
		}
		return returnVal.toArray(new String[returnVal.size()]);
	}
}
