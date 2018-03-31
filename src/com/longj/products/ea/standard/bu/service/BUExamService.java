package com.longj.products.ea.standard.bu.service;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.module.wql.core.bean.ConnectBean;

public interface BUExamService {

	/**
	 * 获取病人基本信息,包含住院病人和门诊病人两种情况
	 * 
	 * @param patientId
	 * @return
	 */
	public JSONObject getPatientBaseInfo(String patientId);

	/**
	 * 查询这个医生下，某病人的已有检查项目情况
	 * 
	 * @param conb
	 * @param doctorId
	 * @param patientId
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public JSONArray getHistoryExamList(ConnectBean conb, String doctorId, String patientId, String startTime, String endTime, String otherWhereClause) throws Exception;

	/**
	 * 保存多个检查单情况
	 * 
	 * @param conb
	 * @param formList
	 * @return
	 */
	public JSONArray saveExamFormList(ConnectBean conb, JSONArray formList) throws Exception;

	/**
	 * 更新检查单的状态及其他属性
	 * 
	 * @param conb
	 * @param jo
	 * @return
	 * @throws Exception
	 */
	public JSONArray updateExamForm(ConnectBean conb, JSONObject jo) throws Exception;

	/**
	 * 通过检查项目获取对应的收费明细情况
	 * 
	 * @param conb
	 * @param examitem_id
	 * @return
	 * @throws Exception
	 */
	public JSONArray getChargeDtlbyExamItem(ConnectBean conb, String examitem_id) throws Exception;

	/**
	 * 通过检查单的ID，获取此检查单所属的检查分类情况
	 * 
	 * @param conb
	 * @param examId
	 * @return
	 * @throws Exception
	 */
	public String getExamCategoryId(ConnectBean conb, String examId) throws Exception;

	/**
	 * 根据检查项目，获取此项目下的费用总和
	 * 
	 * @param conb
	 * @param examitem_id
	 * @return
	 * @throws Exception
	 */
	public long getExamItemPackageMoney(ConnectBean conb, String examitem_id);

	/**
	 * 获取检查分类的每日数量限制情况
	 * 
	 * @param conb
	 * @param examCategoryIds
	 * @return
	 * @throws Exception
	 */
	public Map<String, Integer> getExamCategoryDayLimit(ConnectBean conb, List<String> examCategoryIds) throws Exception;

}
