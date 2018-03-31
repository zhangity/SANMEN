package com.longj.products.ea.standard.bu.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.WDK;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.core.bean.WDKTransationHandler;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLModule;
import org.wdk.module.wql.core.bean.WQLObject;
import org.wdk.module.wql.core.engine.object.WO;

import wql.WQLNames;

import com.longj.platform.busi.wdk.base.BaseActionMethod;
import com.longj.products.ea.standard.bi.bean.EAPatient;
import com.longj.products.ea.standard.bi.util.EAUtil;
import com.longj.products.ea.standard.bu.BUConstant;
import com.longj.products.ea.standard.bu.BUServiceUtil;
import com.longj.products.ea.standard.bu.service.impl.BUExamSerial;
import com.longj.products.ea.standard.bu.service.proxy.BUSerialHandler;
import com.longj.products.ea.standard.bu.service.proxy.BUSyncHisCancelHandler;
import com.longj.products.ea.standard.bu.service.proxy.BUSyncHisHandler;

/**
 * 检查单action服务
 * 
 * @author YuBin
 * 
 */
public class BUExamAction extends BaseActionMethod {

	// 日志对象
	private static WDKLogger logger = new WDKLogger(BUExamAction.class.getName());

	/**
	 * 【通用】删除action
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void delete(WDKContext context) throws Exception {
		JSONObject jo = new JSONObject();
		String mainWoName = context.getString("_MAINWONAME");
		String primaryKey = context.getString("_PRIMARYKEY");
		String ids = context.getString("_IDS");
		WQLObject wo = _WQL_GetWO(mainWoName);
		String whereClause = primaryKey + " in ('" + ids.replace(",", "','") + "')";
		ResultBean rb = _WQL_Delete(context, wo, whereClause, null);
		if (rb != null && rb.isSuccess()) {
			jo.put("code", "1");
			jo.put("desc", "删除成功");
		} else {
			jo.put("code", "0");
			jo.put("desc", "删除失败");
		}
		context.setPrintOut(jo.toString());
	}

	/**
	 * 【通用】保存数据
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void save(WDKContext context) throws Exception {
		String data = context.getString("_DATA");
		String mainWoName = context.getString("_MAINWONAME");
		String primaryKey = context.getString("_PRIMARYKEY");
		String pinyin = context.getString("_PINYIN");
		JSONObject jo = new JSONObject();
		JSONArray formList = JSONArray.fromObject(data);
		if (pinyin != null && pinyin.trim().length() > 0) {
			JSONObject pinjo = JSONObject.fromObject(pinyin);
			if (pinjo != null) {
				String chinesefield = pinjo.getString("chinesefield");
				String codefiled = pinjo.getString("targetfield");
				for (int i = 0; i < formList.size(); i++) {
					JSONObject row = formList.getJSONObject(i);
					if (row.containsKey(chinesefield)) {
						row.put(codefiled, BUServiceUtil.converterToFirstSpell(row.getString(chinesefield)));
					}
				}

			}
		}
		JSONArray rows = BUServiceUtil.getBUBaseservice(primaryKey, mainWoName).saveJSONarraArray(context.getConnectBean(), formList);
		if (rows != null && rows.size() > 0) {
			jo.put("code", "1");
			jo.put("desc", "数据保存成功");
		} else {
			jo.put("code", "0");
			jo.put("desc", "数据保存失败");
		}
		logger.info("<<<<<<<<<<<<<保存数据");
		context.setPrintOut(jo.toString());
	}

	/**
	 * 【通用】的查询数据模型数据的方法
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void query(WDKContext context) throws Exception {
		JSONArray jrows = null;
		// 获取主WO
		String mainWoName = context.getString("_MAINWONAME");
		// 获取排序
		String order = context.getString("_ORDERBY");

		String filter = context.getString("_FILTER");
		if (filter != null && filter.trim().length() > 0) {
			JSONArray rows = JSONArray.fromObject(filter);
			if (rows != null && rows.size() > 0) {
				// 暂时先不做
			}
		}
		String condition = context.getString("_CONDITION");
		// 获取WO定义
		WQLObject wo = _WQL_GetWO(mainWoName);

		WQLData dataSet = null;
		// 参数对象
		List<String> paramList = new ArrayList<String>();
		// 获取主键条件
		StringBuffer whereSql = new StringBuffer();
		if (condition != null && condition.trim().length() > 0) {
			whereSql = BUServiceUtil.appendWhereCondition(whereSql, condition);
		}
		ResultBean ret = _WQL_Query(context, wo, whereSql.toString(), paramList, order);
		dataSet = ret.getWQLData(wo, 0);
		// 放置缓存变量中
		context.setAttribute(mainWoName, dataSet);
		// 调用自定义的后置方法
		if (dataSet != null) {
			jrows = dataSet.getDataJSONArray();
		} else {
			jrows = new JSONArray();
		}
		// 返回数据到前端
		context.setPrintOut(jrows.toString());
	}

	/**
	 * 获取默认的当前的时间
	 * 
	 * @return
	 */
	private static String getDate(Date d) {
		String timestr = new String("");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		timestr = sdf.format(d);
		return timestr;
	}
	
	/**
	 * 通用方法，过滤当前检查类型下的检查项目
	 * @param context
	 * @param condition
	 * @param parentfield
	 * @param whereClause
	 * @return
	 * @throws Exception
	 */
	public JSONArray buildTreeContent(WDKContext context, String condition, String parentfield, String whereClause) throws Exception {
		JSONArray jrows = new JSONArray();
		Connection conn = context.getConnectBean().getConn();
		PreparedStatement pst1 = null;
		ResultSet rs1 = null;
		Map<String, JSONObject> mapping = new HashMap<String, JSONObject>();
		Map<String, String> parentMap = new HashMap<String, String>();
		try {
			pst1 = conn.prepareStatement("select examcate_id,examcate_name,parentid from EA_BI_ExamCategory ");
			rs1 = pst1.executeQuery();
			// WQLModule wm = WQLModule.getWQLModule("EA_BI_ExamCategory");
			// ArrayList<WQLModuleBean> list = wm.query(condition,
			// context.getConnectBean());
			if (rs1 != null) {
				while (rs1.next()) {
					JSONObject row = new JSONObject();
					String key = rs1.getString("examcate_id");
					row.put("_id", key);
					row.put("_name", rs1.getString("examcate_name"));
					row.put("_type", "0");
					String parentid = rs1.getString("parentid");
					if (parentid == null) {
						parentid = "";
					}
					row.put("_parentid", parentid);
					parentMap.put(key, parentid);
					mapping.put(key, row);
					// jrows.add(row);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs1 != null)
				try {
					rs1.close();
					rs1 = null;
				} catch (Exception e2) {
				}
			if (pst1 != null)
				try {
					pst1.close();
					pst1 = null;
				} catch (Exception e2) {
				}
		}
		// String whereClause = "examcate_id in ('"+
		// StringUtils.join(categoryList, "','") + "')";
		StringBuffer sqlBuffer = new StringBuffer("select examcate_id,item_id,item_name from EA_BI_ExamItem T0 where ");
		sqlBuffer.append(whereClause);
		sqlBuffer.append(" order by (SELECT c.ordercode FROM ea_bi_examcategory c WHERE c.examcate_id = t0.examcate_id),t0.ordercode asc");
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			pst = conn.prepareStatement(sqlBuffer.toString());
			Set<String> hashSet = new HashSet<String>();
			rs = pst.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					JSONObject row = new JSONObject();
					String parentId = rs.getString("examcate_id");
					row.put("_id", rs.getString("item_id"));
					row.put("_name", rs.getString("item_name"));
					row.put("_type", "1");
					row.put("_parentid", parentId);
					jrows.add(row);
					if (mapping.containsKey(parentId)) {
						if (!hashSet.contains(parentId)) {
							jrows.add(mapping.get(parentId));
							hashSet.add(parentId);
							recursionExamItemParent(jrows, mapping, parentMap, hashSet, parentId);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
					rs = null;
				} catch (Exception e2) {
				}
			if (pst != null)
				try {
					pst.close();
					pst = null;
				} catch (Exception e2) {
				}
		}
		return jrows;
	}

	/**
	 * 获取检查分类树,每个分类下携带检查项目
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void getExamCategoryTree(WDKContext context) throws Exception {
		JSONArray jrows = new JSONArray();
		String parentfield = "parentid";
		String examtypeId = context.getString("examtype_id");// 从web端获取检查类型uuid
		String sex = context.getString("sex");
		if (examtypeId == null || "".equals(examtypeId.trim())) {
			context.setPrintOut(jrows.toString());
			return;
		}
		String condition = null;
		if (examtypeId != null && examtypeId.trim().length() > 0) {
			/*
			 * condition = " ((examtype_id = '" + examtypeId + "' and (" +
			 * parentfield + " is null or " + parentfield + "='' or " +
			 * parentfield + "='-1')) or (" + parentfield + " is not null and "
			 * + parentfield + "<>'' and " + parentfield + "<>'-1'))";
			 */
		}
		String whereCondition = "examtype_id='" + examtypeId + "'";
		if(sex!=null && sex.trim().length()>0){
			whereCondition+=" and (item_sex='"+sex+"' or item_sex='3')";
		}
		jrows = this.buildTreeContent(context, condition, parentfield, whereCondition);
		jrows = WDK.DataFormat_Tree(jrows, "_id", "_name", "_parentid", "", "_type");
		context.setPrintOut(jrows.toString());
	}

	/**
	 * 递归获取检查项目的上级
	 * 
	 * @param jrows
	 * @param mapping
	 * @param parentMap
	 * @param hashSet
	 * @param parentId
	 */
	private void recursionExamItemParent(JSONArray jrows, Map<String, JSONObject> mapping, Map<String, String> parentMap, Set<String> hashSet, String parentId) {
		String pparentId = parentMap.get(parentId);
		if (pparentId != null && pparentId.trim().length() > 0 && !"-1".equals(pparentId)) {
			if (!hashSet.contains(pparentId)) {
				jrows.add(mapping.get(pparentId));
				hashSet.add(pparentId);
			}
			recursionExamItemParent(jrows, mapping, parentMap, hashSet, pparentId);
		}
	}

	/**
	 * 获取病人的基本信息
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void getPatientBaseInfo(WDKContext context) throws Exception {
		String patientId = context.getString("patient_id");// 病人UUID
		String patientCode = context.getString("patient_code");
		if (patientId == null || patientId.trim().length() == 0) {
			WQLObject wo = WQLObject.getWQLObject("EA_BU_Exam");
			ResultBean rb = wo.query("patient_code = ? ", new String[] { patientCode }, "exam_id", context.getConnectBean());
			if (rb != null && rb.isSuccess()) {
				WQLData wd = rb.getWQLData(wo, 0);
				if (wd != null) {
					wd.first();
					if (wd.next()) {
						patientId = wd.getValue("patient_id");
					}
				}
			}
		}
		String personId = context.getString("person_id");// 医生（职工）UUID
		String patientType = context.getString("patient_type");// 病人类型（t1:门诊;t2:住院）
		String deptId = context.getString("dept_id");// 本次就诊部门ID；
		String outId = context.getString("out_id");// HIS系统的就诊序号；
		JSONObject jo = new JSONObject();
		EAPatient pa = EAUtil.queryPatient(patientId, patientType, outId);
		jo = JSONObject.fromObject(pa);
		if (patientCode != null && patientCode.trim().length() > 0) {
			jo.put("patient_code", patientCode);
		}
		if (personId != null && personId.trim().length() > 0) {
			WQLObject wo = _WQL_GetWO("EA_BI_Person");
			if (wo != null) {
				ResultBean rb = wo.query("person_id=?", new String[] { personId }, "person_id", context.getConnectBean());
				if (rb != null && rb.isSuccess()) {
					WQLData wqlData = rb.getWQLData(wo, 0);
					if (wqlData != null) {
						wqlData.first();
						if (wqlData.next()) {
							if (deptId == null || deptId.trim().length() == 0) {
								jo.put("dept_id", wqlData.getValue("dept_id"));
								jo.put("dept_idname", wqlData.getValue("dept_idname"));
							} else {
								// 从部门的代码模型中获取对应的iD和name值
								WQLModule wm = WQLModule.getWQLModule("EA_BI_DepartMent");
								jo.put("dept_id", deptId);
								jo.put("dept_idname", wm.id2name(deptId, context.getConnectBean()));
							}
							jo.put("person_name", wqlData.getValue("person_name"));
							jo.put("person_id", wqlData.getValue("person_id"));
						}
					}
				}
			}
		}
		Date d = new Date();
		jo.put("now", getDate(d));
		Calendar nowTime = Calendar.getInstance();
		nowTime.setTime(d);
		nowTime.add(Calendar.DATE, 1);
		jo.put("tomorrow", getDate(nowTime.getTime()));
		context.setPrintOut(jo.toString());
	}

	/**
	 * 获取默认是空的gird
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void queryDefaultNullList(WDKContext context) throws Exception {
		JSONArray rows = new JSONArray();
		context.setPrintOut(rows.toString());
	}

	/**
	 * 查询本病人历史检查单信息
	 * 
	 * @param ctx
	 * @throws Exception
	 */
	public void queryHistoryExamFormList(WDKContext context) throws Exception {
		String patientId = context.getString("patient_id");
		String outId = context.getString("out_id");// 就诊号ID，如果是住院病人的话，这个值就是空
		String startTime = context.getString("start_time");
		String endTime = context.getString("end_time");
		String is_default = context.getString("is_default");
		if ("1".equals(is_default)) {
			Date d = new Date();
			startTime = getDate(d);
			endTime = getDate(d);
		}
		String otherWhere = null;
		if (outId != null && outId.trim().length() > 0) {
			otherWhere = " out_id = '" + outId + "'";// 根据门诊就诊ID过滤病人；
		}
		JSONArray rows = BUServiceUtil.getBUExamService().getHistoryExamList(context.getConnectBean(), null, patientId, startTime, endTime, otherWhere);
		context.setPrintOut(rows.toString());
	}

	/**
	 * 如果是门诊检查单，需要检查每日数量
	 * 
	 * @param ctx
	 * @throws Exception
	 */
	public boolean validateDayLimit(WDKContext ctx, JSONArray formList) throws Exception {
		// 预校验进行
		boolean isSuccess = true;// 默认校验成功
		if(formList==null||formList.size()==0){
			return isSuccess;
		}
		JSONObject result = new JSONObject();
		String patient_id = null;
		Map<String, Integer> examtypeIdMapCount = new HashMap<String, Integer>();
		String exam_type = ctx.getString("exam_type");
		if (BUConstant.PATIENT_SORT_MZ.equals(exam_type)) {// 门诊的情况还需要做预校验
			// 门诊是开单的数量 超过这个开单数量 就需要跳出提示 让医生转自费 住院的就是扣费的数量限制
			if (formList != null && formList.size() > 0) {
				for (int i = 0; i < formList.size(); i++) {
					// 需要遍历每一行数据的检查类别，根据检查类别获取对应的数量阀值，然后再根据检查类别查询下当天已经提交的检查大单的数量，如果超过阀值，不允许提交
					JSONObject row = formList.getJSONObject(i);
					String examitem_id = row.getString("examitem_id");
					String owncharge = row.getString("owncharge");
					if (BUConstant.CHARGE_TYPE_MED.equals(owncharge)) {
						// 使用医保的情况才需要进行校验
						patient_id = row.getString("patient_id");
						int old = 0;
						if (examtypeIdMapCount.containsKey(examitem_id)) {
							old = examtypeIdMapCount.get(examitem_id);
						}
						examtypeIdMapCount.put(examitem_id, ++old);
					}
				}
			}
			if (patient_id != null && patient_id.trim().length() > 0) {
				if (examtypeIdMapCount != null && examtypeIdMapCount.size() > 0) {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					// 真正执行校验
					Iterator<String> it = examtypeIdMapCount.keySet().iterator();
					List<String> list = new ArrayList<String>(examtypeIdMapCount.size());
					while (it.hasNext()) {
						String examitemId = it.next();
						list.add(examitemId);
					}
					WQLObject examItemWo = WQLObject.getWQLObject("EA_BI_ExamItem");
					// categoryWo.query("patient_id = ? and createdt = ? and ",
					// whereArgs, orderby, conb);
					Map<String, String> itemMapCat = new HashMap<String, String>();
					Map<String, JSONArray> catMapitems = new HashMap<String, JSONArray>();
					List<String> cateList = new ArrayList<String>();
					ResultBean itemRb = examItemWo.query("item_id IN (" + BUServiceUtil.getQuestionMark(list.size()) + ")", list.toArray(new String[list.size()]), "item_id", ctx.getConnectBean());
					if (itemRb != null && itemRb.isSuccess()) {
						WQLData wd = itemRb.getWQLData(examItemWo, 0);
						if (wd != null) {
							wd.first();
							while (wd.next()) {
								String cateId = wd.getValue("examcate_id");
								cateList.add(cateId);
								itemMapCat.put(wd.getValue("item_id"), cateId);
								JSONArray listItem = null;
								if (catMapitems.containsKey(cateId)) {
									listItem = catMapitems.get(cateId);
								} else {
									listItem = new JSONArray();
								}
								listItem.add(wd.getValue("item_id"));

								catMapitems.put(cateId, listItem);
							}
						}
					}
					Map<String, Integer> webCategoryMap = new HashMap<String, Integer>();
					Iterator<String> itemIt = examtypeIdMapCount.keySet().iterator();
					while (itemIt.hasNext()) {
						String itemId = itemIt.next();
						String categoryId = itemMapCat.get(itemId);
						Integer old = 0;
						if (webCategoryMap.containsKey(categoryId)) {
							old = webCategoryMap.get(categoryId);
						}
						old++;
						webCategoryMap.put(categoryId, old);
					}

					Calendar cal = Calendar.getInstance();
					cal.set(Calendar.AM_PM, Calendar.AM);
					cal.set(Calendar.HOUR, 0);
					cal.set(Calendar.MINUTE, 0);
					cal.set(Calendar.SECOND, 0);
					String start = sdf.format(cal.getTime());
					cal.add(Calendar.DATE, 1);
					String end = sdf.format(cal.getTime());
					// 结果集一
					Map<String, Integer> cateDayLimitMap = BUServiceUtil.getBUExamService2().getExamCategoryDayLimit(ctx.getConnectBean(), cateList);

					// 结果集二
					Map<String, Integer> cateTotal = new HashMap<String, Integer>();
					Map<String, String> cateNameMap = new HashMap<String, String>();
					WO wo = WQL.getWO(WQLNames.QEABUEXAM0003).addParam("flag", "3").addParam("patient_id", patient_id).addParam("start_dt", start).addParam("end_dt", end);
					ResultBean rb = wo.process(ctx.getConnectBean());
					if (rb != null && rb.isSuccess()) {
						JSONArray rows = rb.getResultJSONArray(0);
						for (int i = 0; i < rows.size(); i++) {
							JSONObject row = rows.getJSONObject(i);
							cateTotal.put(row.getString("examcate_id"), row.getInt("cnt"));
							cateNameMap.put(row.getString("examcate_id"), row.getString("examcate_idname"));
						}
					}

					Iterator<String> webCateIt = webCategoryMap.keySet().iterator();
					JSONArray descRows = new JSONArray();
					while (webCateIt.hasNext()) {
						String categoryId = webCateIt.next();
						int total = cateDayLimitMap.get(categoryId);
						if (total == -1) {
							// -1代表没有控制数量限制
							continue;
						}
						int used = 0;
						try {
							used = cateTotal.get(categoryId);
						} catch (Exception e) {
						}
						int web = webCategoryMap.get(categoryId);
						if (web > total - used) {
							//
							JSONObject jj = new JSONObject();
							isSuccess = false;
							int overflow = web - (total - used);
							jj.put("overflow", overflow);
							jj.put("examcate_id", categoryId);
							jj.put(categoryId, catMapitems.get(categoryId));
							descRows.add(jj);
						}
					}
					result.put("detail", descRows);

				}
			}
		}
		if (!isSuccess) {

			result.put("code", "0");
			result.put("desc", "其中有检查项目超过当日数量限制，请选择自费！");
		}
		ctx.setPrintOut(result.toString());
		return isSuccess;
	}
	
	/**
	 * 删除检查单，逻辑删除
	 * 
	 * @param ctx
	 * @throws Exception
	 */
	public void removeExamInfo(WDKContext ctx) throws Exception {
		JSONObject result = new JSONObject();
		JSONObject jo = new JSONObject();
		String exam_id = ctx.getString("exam_id");
		if(exam_id!=null && exam_id.trim().length()>0){
			jo.put("exam_id", exam_id);
			jo.put("form_status", BUConstant.FORM_STATUS_s002);
			BUServiceUtil.getBUExamService().updateExamForm(ctx.getConnectBean(), jo);
			result.put("code", "1");
			result.put("desc", "删除成功！");
			BUSyncHisCancelHandler hanlder2 = new BUSyncHisCancelHandler();
			hanlder2.setExam_id(exam_id);
			ctx.addTransHandler(hanlder2);
			ctx.setPrintOut(result.toString());
		}
		
	}

	/**
	 * 保存或者更新检查单的数据
	 * 
	 * @param ctx
	 * @throws Exception
	 */
	public void saveExamInfoList(WDKContext ctx) throws Exception {
		String data = ctx.getString("data");
		JSONObject jo = new JSONObject();
		JSONArray formList = JSONArray.fromObject(data);
		if (formList == null || formList.size() == 0) {
			jo.put("code", "1");
			jo.put("desc", "没有提交任何数据！");
			ctx.setPrintOut(jo.toString());
			return;
		}
		// 预校验结束了
		boolean isValidate = this.validateDayLimit(ctx, formList);
		if (isValidate) {
			// 预校验通过后，方可进行下面的操作
			SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
			String yyMMdd = sdf.format(new Date());
			if (formList != null && formList.size() > 0) {
				for (int i = 0; i < formList.size(); i++) {
					JSONObject row = formList.getJSONObject(i);
					String MZorZYStr = row.getString("exam_type");
					String MZorZY = "M";
					if (BUConstant.PATIENT_SORT_ZY.equals(MZorZYStr)) {
						MZorZY = "Z";
					}
					String examtype_id = row.getString("examtype_id");
					WQLModule wqlm = WQLModule.getWQLModule("EA_BI_ExamTypeCode");
					String examTypeCode = wqlm.id2name(examtype_id, ctx.getConnectBean());
					String code = BUExamSerial.getNextSequenceVal(ctx.getConnectBean(), examTypeCode, yyMMdd, MZorZY);
					row.put("exam_serial", code);
					row.put("yjxh", BUServiceUtil.getNextVal("MS_YJ01"));
					row.put("createdt", WDK.getDateTime());
				}
			}
			JSONArray rows = BUServiceUtil.getBUExamService().saveExamFormList(ctx.getConnectBean(), formList);
			if (rows != null && rows.size() > 0) {
				jo.put("code", "1");
				jo.put("desc", "数据保存成功");
				WDKTransationHandler hanlder = new BUSerialHandler();
				ctx.addTransHandler(hanlder);
				// 门诊检查单（提交）后，检查预约系统写HIS系统检查单信息表，将检查单导入到HIS系统。如果是【住院检查单】，则不需要调用此接口。
				BUSyncHisHandler hanlder2 = new BUSyncHisHandler();
				hanlder2.setCommitRows(formList);
				ctx.addTransHandler(hanlder2);
			} else {
				jo.put("code", "0");
				jo.put("desc", "数据保存失败");
			}
			logger.info("<<<<<<<<<<<<<保存或者更新检查单数据");
			ctx.setPrintOut(jo.toString());
		}
	}

	/**
	 * 获取某个检查单的权重
	 * 
	 * @param ctx
	 * @throws Exception
	 */
	public void getExamWeight(WDKContext ctx) throws Exception {
		String exam_id = ctx.getString("exam_id");// 检查项目ID
		String weight = "1";// 默认都是一个权重
		if (exam_id != null && exam_id.trim().length() > 0) {
			WQLObject wo = _WQL_GetWO("EA_BI_ExamItem");
			if (wo != null) {
				ResultBean rb = wo.query(" item_id = (select t9.examitem_id from EA_BU_Exam t9 where t9.exam_id = ? )", new String[] { exam_id }, "item_id", ctx.getConnectBean());
				if (rb != null && rb.isSuccess()) {
					WQLData wqlData = rb.getWQLData(wo, 0);
					if (wqlData != null) {
						wqlData.first();
						if (wqlData.next()) {
							weight = wqlData.getValue("weight");
						}
					}
				}
			}
		}
		ctx.setPrintOut(weight);// 返回权重值
	}

	/**
	 * 获取医生常用的检查项目列表
	 * 
	 * @param ctx
	 * @throws Exception
	 */
	public void getDoctorExamItemTree(WDKContext ctx) throws Exception {
		JSONArray result = new JSONArray();
		String doctor_id = ctx.getString("doctor_id");// 医生ID
		String sex = ctx.getString("sex");
		if (doctor_id != null && doctor_id.trim().length() > 0) {
			JSONArray rows = new JSONArray();
			WO wo = WQL.getWO(WQLNames.QEABUEXAM0003).addParam("flag", "1").addParam("doctor_id", doctor_id);
			if (sex != null && sex.trim().length() > 0) {
				wo.addParam("sex", sex);
			}
			JSONObject rb = wo.pageQuery(0, 10, "count desc", ctx.getConnectBean());
			if (rb != null) {
				rows = rb.getJSONArray("rows");
			}
			result = WDK.DataFormat_Tree(rows, "examitem_id", "examitem_idname", null);
		}
		ctx.setPrintOut(result.toString());
	}
}
