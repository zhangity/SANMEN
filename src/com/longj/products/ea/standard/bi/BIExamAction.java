package com.longj.products.ea.standard.bi;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.WDK;
import org.wdk.core.bean.WDKContext;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLModule;
import org.wdk.module.wql.core.bean.WQLModuleBean;
import org.wdk.module.wql.core.bean.WQLObject;

import wql.WQLNames;

import com.longj.platform.busi.wdk.base.BaseActionMethod;
import com.longj.platform.busi.wdk.handler.SessionUser;
import com.longj.platform.pb.util.WQLUtil;
import com.longj.products.ea.standard.bu.action.BUExamAction;

public class BIExamAction extends BaseActionMethod {

	/**********************************************************
	 * 公共信息服务
	 *********************************************************/
	
	public static void main(String[] arg0) {
	}
	
	/**
	 * 从上周复制本设备的排班情况
	 * @param context
	 * @throws Exception
	 */
	public void copyScheduFromLastWeek(WDKContext context) throws Exception {
		JSONObject result = new JSONObject();
		result.put("code", "0");
		String week = context.getString("week");
		String first_day = context.getString("first_day");
		String device_id = context.getString("device_id");
		int weekInt = Integer.parseInt(week);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(first_day);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.DATE, -7);// 向前7天
		Date lastStart = cal.getTime();
		cal.add(Calendar.DATE, 6);// 向后6天
		Date lastEnd = cal.getTime();
		String lastStartDt = sdf.format(lastStart);
		String lastEndDt = sdf.format(lastEnd);
		WQLObject wo = WQLObject.getWQLObject("EA_BI_DeviceSchedu");
		ResultBean deleteRb = wo.query("schedu_date>=? and  device_id = ? and schedu_week = ?", new String[] { first_day, device_id, week }, "schedu_id", context.getConnectBean());
		if (deleteRb != null && deleteRb.isSuccess()) {
			WQLData oldWd = deleteRb.getWQLData(wo, 0);
			if (oldWd.getRowCount() == 0) {
				ResultBean rb = wo.query("schedu_date>=? and schedu_date<=? and device_id = ? and schedu_week = ? and status =?", new String[] { lastStartDt, lastEndDt, device_id, (weekInt - 1) + "", "1" }, "schedu_date,work_start", context.getConnectBean());
				if (rb != null && rb.isSuccess()) {
					WQLData wd = rb.getWQLData(wo, 0);
					if (wd.getRowCount() > 0) {
						// 有值才进行复制；
						// 先删除本周的记录
						wd.first();
						while (wd.next()) {
							wd.setUpdateMark();
							wd.setValue("schedu_id", WDK.getUUID());
							String olddt = wd.getValue("schedu_date");
							Date oldDate = sdf.parse(olddt);
							Calendar cal2 = Calendar.getInstance();
							cal2.setTime(oldDate);
							cal2.add(Calendar.DATE, 7);// 向后7天
							wd.setValue("schedu_date", sdf.format(cal2.getTime()));
							wd.setValue("schedu_week", week);
							wd.setValue("createdt", WDK.getDateTime());
						}
						ResultBean insertRb = wo.insert(wd, context.getConnectBean());
						if (insertRb != null && insertRb.isSuccess()) {
							result.put("code", "1");
							result.put("desc", "复制排班记录成功！");
						}
					} else {
						result.put("desc", "上周也未进行排班，无法复制！");
					}
				}
			} else {
				result.put("desc", "本周排班已经生成，不能复制，请先删除本周的排班记录！");
			}
		}
		context.setPrintOut(result.toString());
	}
	
	/**
	 * 保存【设备】-【检查项目的对应】关系
	 * @param context
	 * @throws Exception
	 */
	public void saveDeviceExamItem(WDKContext context) throws Exception {
		String device_id = context.getString("device_id");
		String rows = context.getString("rows");
		JSONObject result = new JSONObject();
		result.put("code", "0");
		result.put("desc", "保存失败");
		if (device_id != null && device_id.trim().length() > 0) {
			if (rows != null && rows.trim().length() > 0) {
				JSONArray dataset = JSONArray.fromObject(rows);
				WQLObject wo = WQLObject.getWQLObject("EA_BI_DeviceExamItem");

				ResultBean rb = wo.delete("device_id = ?", new String[] { device_id }, context.getConnectBean());
				if (rb != null && rb.isSuccess()) {
					WQLData wd = new WQLData(wo);
					if (dataset != null && dataset.size() > 0) {
						for (int i = 0; i < dataset.size(); i++) {
							wd.insert();
							JSONObject jo = dataset.getJSONObject(i);
							wd.setValue("examitem_id", jo.getString("id"));// 树节点的nodeid
							wd.setValue("ordercode", (i + 1) + "");
							wd.setValue("createdt", WDK.getDateTime());
							wd.setValue("status", "1");
							wd.setValue("device_id", device_id);

						}
						ResultBean rb2 = wo.insert(wd, context.getConnectBean());
						if (rb2 != null && rb2.isSuccess()) {
							result.put("code", "1");
							result.put("desc", "保存成功");
						}
					}else{
						result.put("code", "1");
						result.put("desc", "保存成功");
					}
				}
			}
		}
		context.setPrintOut(result.toString());
	}

	/**
	 * 未分配的树
	 * @param context
	 * @throws Exception
	 */
	public void queryTreeDeviceExamItemToDo(WDKContext context) throws Exception {
		JSONArray jrows = new JSONArray();
		String parentfield = "parentid";
		String device_id = context.getString("device_id");// 从web端获取检查类型uuid
		if (device_id == null || "".equals(device_id.trim())) {
			context.setPrintOut(jrows.toString());
			return;
		}
		String condition = null;
		if (device_id != null && device_id.trim().length() > 0) {
			/*
			 * condition = " ((examtype_id = '" + examtypeId + "' and (" +
			 * parentfield + " is null or " + parentfield + "='' or " +
			 * parentfield + "='-1')) or (" + parentfield + " is not null and "
			 * + parentfield + "<>'' and " + parentfield + "<>'-1'))";
			 */
		}
		BUExamAction service = new BUExamAction();
		jrows = service.buildTreeContent(context, condition, parentfield, "examtype_id IN (SELECT b.examtype_id FROM ea_bi_device a INNER JOIN ea_bi_devicegroup b ON a.group_id=b.group_id WHERE a.device_id='"+device_id+"') and ITEM_ID not in (select t9.examitem_id from EA_BI_DeviceExamItem t9 where t9.device_id='"+device_id+"')");
		jrows = WDK.DataFormat_Tree(jrows, "_id", "_name", "_parentid", "", "_type");
		context.setPrintOut(jrows.toString());
	}
	
	/**
	 * 已分配树
	 * @param context
	 * @throws Exception
	 */
	public void queryTreeDeviceExamItemDone(WDKContext context) throws Exception {
		JSONArray jrows = new JSONArray();
		String parentfield = "parentid";
		String device_id = context.getString("device_id");// 从web端获取检查类型uuid
		if (device_id == null || "".equals(device_id.trim())) {
			context.setPrintOut(jrows.toString());
			return;
		}
		String condition = null;
		if (device_id != null && device_id.trim().length() > 0) {
			/*
			 * condition = " ((examtype_id = '" + examtypeId + "' and (" +
			 * parentfield + " is null or " + parentfield + "='' or " +
			 * parentfield + "='-1')) or (" + parentfield + " is not null and "
			 * + parentfield + "<>'' and " + parentfield + "<>'-1'))";
			 */
		}
		BUExamAction service = new BUExamAction();
		jrows = service.buildTreeContent(context, condition, parentfield, "examtype_id IN (SELECT b.examtype_id FROM ea_bi_device a INNER JOIN ea_bi_devicegroup b ON a.group_id=b.group_id WHERE a.device_id='"+device_id+"') and ITEM_ID in (select t9.examitem_id from EA_BI_DeviceExamItem t9 where t9.device_id='"+device_id+"')");
		jrows = WDK.DataFormat_Tree(jrows, "_id", "_name", "_parentid", "", "_type");
		context.setPrintOut(jrows.toString());
	}
	
	
	/**
	 * 获取医技科人员自己可看到的设备情况
	 * @param ctx
	 * @throws Exception
	 */
	public void queryDeviceBySelf(WDKContext ctx) throws Exception {
		SessionUser user = _getSessionuser(ctx);
		String personUuid = user.getPersonuuid();
		String deptId = user.getDeptuuid();
		String orderbyfield = ctx.getParameter("orderbyfield");
		WQLObject wo = WQLObject.getWQLObject("EA_BI_Device");
		WQLObject wo2 = WQLObject.getWQLObject("EA_BU_PersonExamType");
		ResultBean rb2 = wo2.query("person_id=?", new String[] { personUuid }, "ordercode", ctx.getConnectBean());
		if (rb2 != null && rb2.isSuccess()) {
			WQLData wqlData = rb2.getWQLData(wo2, 0);
			int count = wqlData.getRowCount();
			String condition = null;
			if (count == 0) {
				condition = "group_id IN (select g.group_id from EA_BI_DeviceGroup g where g.examtype_id IN (SELECT examtype_id FROM EA_BI_DepartMentExamType WHERE dept_id = '" + deptId + "'))";
			} else {
				condition = "group_id IN (select g.group_id from EA_BI_DeviceGroup g where g.examtype_id IN (SELECT examtype_id FROM EA_BU_PersonExamType WHERE person_id='" + personUuid + "'))";
			}
			ResultBean ret = wo.pagequery(condition, null, orderbyfield, ctx.getRequest(), ctx.getConnectBean());
			JSONObject jres = ret.pageResult();
			ctx.setPrintOut(jres.toString());
		}
	}
	/**
	 * 获取医技科人员自己可看到的设备分组情况
	 * 
	 * @param ctx
	 * @throws Exception
	 */
	public void getDeviceGroupBySelf(WDKContext ctx) throws Exception {
		this.setComboBoxBySelf(ctx, "EA_BI_DeviceGroup");
	}
	
	/**
	 * 获取医技科室人员自己可维护的检查类型
	 * @param ctx
	 * @throws Exception
	 */
	public void getExamTypeBySelf(WDKContext ctx) throws Exception {
		this.setComboBoxBySelf(ctx, "EA_BI_ExamType");
	}
	
	private void setComboBoxBySelf(WDKContext ctx,String wqlmodulename) throws Exception {
		SessionUser user = _getSessionuser(ctx);
		JSONArray jrows = new JSONArray();
		String personUuid = user.getPersonuuid();
		String deptId = user.getDeptuuid();
		// WQLObject wo1 = WQLObject.getWQLObject("EA_BI_DepartMentExamType");
		WQLObject wo2 = WQLObject.getWQLObject("EA_BU_PersonExamType");
		ResultBean rb2 = wo2.query("person_id=?", new String[] { personUuid }, "ordercode", ctx.getConnectBean());
		if (rb2 != null && rb2.isSuccess()) {
			WQLData wqlData = rb2.getWQLData(wo2, 0);
			int count = wqlData.getRowCount();
			String condition = null;
			if (count == 0) {
				condition = "EXAMTYPE_ID IN (SELECT t9.examtype_id FROM EA_BI_DepartMentExamType t9 WHERE t9.dept_id = '" + deptId + "')";
			} else {
				condition = "EXAMTYPE_ID IN (SELECT t9.examtype_id FROM EA_BU_PersonExamType t9 WHERE t9.person_id='" + personUuid + "')";
			}
			WQLModule wm = WQLModule.getWQLModule(wqlmodulename);
			ArrayList<WQLModuleBean> list = wm.query(condition, ctx.getConnectBean());
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					WQLModuleBean wmb = list.get(i);
					JSONObject row = new JSONObject();
					row.put("_id", wmb.getValue());
					row.put("_name", wmb.getName());
					jrows.add(row);
				}
			}
			jrows = WDK.DataFormat_Combox(jrows, "_id", "_name");
		}
		ctx.setPrintOut(jrows.toString());
	}
	/**
	 * 排班内容的删除
	 * 
	 * @param ctx
	 * @throws Exception
	 */
	public void removeScheduAmPm(WDKContext ctx) throws Exception {
		String schedu_id = ctx.getString("schedu_id");//
		JSONObject jres = new JSONObject();
		String tablename = "EA_BU_Number";
		WQLObject Numberwo = WQLObject.getWQLObject(tablename);
		ResultBean numberrb = Numberwo.query("schedu_id = ? and appt_id<>'' and appt_id is not null ", new String[] { schedu_id }, "number_id", ctx.getConnectBean());
		if (numberrb != null && numberrb.isSuccess()) {
			WQLData wd = numberrb.getWQLData(Numberwo, 0);
			if (wd != null) {
				int userCount = wd.getRowCount();
				if (userCount > 0) {
					jres.put("code", "0");
					jres.put("desc", "删除失败！已有号被预约使用了");
				} else {
					// 全部都未使用
					WQLObject wo = WQLObject.getWQLObject("EA_BI_DeviceSchedu");
					ResultBean rb = wo.delete("schedu_id = '" + schedu_id + "'", ctx.getConnectBean());
					if (rb.isSuccess()) {
						ResultBean rb2 = Numberwo.delete("schedu_id = '" + schedu_id + "'", ctx.getConnectBean());
						if (rb2.isSuccess()) {
							jres.put("code", "1");
							jres.put("desc", "删除成功！");
						} else {
							jres.put("code", "0");
							jres.put("desc", "删除失败！");
						}
					} else {
						jres.put("code", "0");
						jres.put("desc", "删除失败！");
					}
				}
			}
		}
		ctx.setPrintOut(jres.toString());
	}
	
	public static JSONArray DataFormat_Suggest(JSONArray jrows, String idField,String textField) {
		JSONArray jrowsRes = new JSONArray();
		for (int i=0;i<jrows.size();i++) {
			JSONObject jrow = jrows.getJSONObject(i);
			String value_id = jrow.getString(idField);
			String value_text = jrow.getString(textField);
			JSONObject jrowRes = new JSONObject();
			jrowRes.put("id", value_id);
			jrowRes.put("value", value_text);
			jrowRes.put("label", value_text);
			jrowsRes.add(jrowRes);
		}
		return jrowsRes;
	}

	/**
	 * 查询收费项目的接口
	 * 
	 * @param ctx
	 * @throws Exception
	 */
	public void queryChargeItemList(WDKContext ctx) throws Exception {
		String modulecode = ctx.getString("modulecode");
		String orderbyfield = ctx.getString("orderbyfield");
		String code = ctx.getString("code");
		String condition = "1=2";
		boolean isFormat = true;
		if (code != null && code.trim().length() > 0) {
			condition = " code_py like '%" + code.trim().toUpperCase() + "%' OR code_wb like '%" + code.trim().toUpperCase() + "%' OR code_sj like '%" + code.trim().toUpperCase() + "%'";
		}
		String item_id = ctx.getString("item_id");
		if (item_id != null && item_id.trim().length() > 0) {
			condition = " item_id = '" + item_id + "' ";
			isFormat = false;
		}
		WQLObject wo = WQLObject.getWQLObject(modulecode);
		ResultBean ret = wo.query(condition, orderbyfield, ctx.getConnectBean());
		JSONArray jrows = ret.getResultJSONArray(0);
		if (isFormat) {
			JSONArray rows = DataFormat_Suggest(jrows, "item_id", "item_name");
			ctx.setPrintOut(rows.toString());
		} else {
			ctx.setPrintOut(jrows.toString());
		}
	}
	
	public void queryPersonItemList(WDKContext ctx) throws Exception {
		String modulecode = ctx.getString("modulecode");
		String orderbyfield = ctx.getString("orderbyfield");
		String code = ctx.getString("code");
		String condition = "1=2";
		boolean isFormat = true;
		if (code != null && code.trim().length() > 0) {
			String _condition = ctx.getString("condition");
			condition = " (person_id like '%" + code.trim().toUpperCase() + "%' OR code_py like '%" + code.trim().toUpperCase() + "%')";
			if (_condition != null && _condition.trim().length() > 0) {
				condition += " and " + _condition;
			}
		}
		String person_id = ctx.getString("person_id");
		if (person_id != null && person_id.trim().length() > 0) {
			condition = " person_id = '" + person_id + "' ";
			isFormat = false;
		}
		WQLObject wo = WQLObject.getWQLObject(modulecode);
		ResultBean ret = wo.query(condition, orderbyfield, ctx.getConnectBean());
		JSONArray jrows = ret.getResultJSONArray(0);
		if (isFormat) {
			JSONArray rows = DataFormat_Suggest(jrows, "person_id", "person_name");
			ctx.setPrintOut(rows.toString());
		} else {
			ctx.setPrintOut(jrows.toString());
		}
	}

	/**
	 * 新增保存检查分类
	 * 
	 * @param ctx
	 * @throws Exception
	 */
	public void category_add(WDKContext ctx) throws Exception {
		String opertype = ctx.getParameter("opertype");
		String examcate_id = ctx.getParameter("examcate_id");
		WQLObject wo = _WQL_GetWO("EA_BI_ExamCategory");
		HashMap<String, String> values = new HashMap<String, String>();
		values.put("examcate_id", ctx.getParameter("examcate_id"));
		values.put("examcate_name", ctx.getParameter("examcate_name"));
		values.put("examtype_id", ctx.getParameter("examtype_id"));
		values.put("examtype_name", ctx.getParameter("examtype_name"));
		values.put("parentid", ctx.getParameter("parentid"));
		values.put("parentname", ctx.getParameter("parentname"));
		values.put("ordercode", ctx.getParameter("ordercode"));
		values.put("createdt", WDK.getDateTime());
		values.put("status", ctx.getParameter("status"));
		values.put("remark", ctx.getParameter("remark"));
		values.put("day_limit", ctx.getParameter("day_limit"));

		JSONObject jres = new JSONObject();
		if ("update".equalsIgnoreCase(opertype)) {
			ResultBean rb = _WQL_Update(ctx, wo, values, "examcate_id='" + examcate_id + "'");
			if (rb.isSuccess()) {
				jres.put("code", "1");
				jres.put("desc", "修改成功");
			} else {
				jres.put("code", "0");
				jres.put("desc", "修改失败！");
			}
		} else {
			ResultBean rb = _WQL_Insert(ctx, wo, values);
			if (rb.isSuccess()) {
				jres.put("code", "1");
				jres.put("desc", "保存成功");
			} else {
				jres.put("code", "0");
				jres.put("desc", "保存失败！");
			}
		}
		ctx.setPrintOut(jres.toString());
	}

	/**
	 * 收费套餐对应收费明细查询
	 * 
	 * @param ctx
	 * @throws Exception
	 */
	public void chargepackageitem_query(WDKContext ctx) throws Exception {
		String package_id = ctx.getParameter("package_id");
		if (package_id == null || "".equals(package_id)) {
			ctx.setPrintOut(new JSONArray().toString());
		} else {
			ResultBean rb = WQLUtil.getWQL(WQLNames.QEABIEXAM0001).addParam("flag", "101").addParam("package_id", package_id).process(ctx.getConnectBean());
			JSONArray jrows = rb.getResultJSONArray(0);

			ctx.setPrintOut(jrows.toString());
		}
	}

	/**
	 * 收费套餐保存
	 * 
	 * @param ctx
	 * @throws Exception
	 */
	public void chargepackage_add(WDKContext ctx) throws Exception {
		String opertype = ctx.getParameter("opertype");
		String package_id = ctx.getParameter("package_id");
		WQLObject wo = _WQL_GetWO("EA_BI_ChargePackage");
		HashMap<String, String> values = new HashMap<String, String>();
		values.put("package_id", package_id);
		values.put("package_name", ctx.getParameter("package_name"));
		values.put("package_enname", ctx.getParameter("package_enname"));
		values.put("code_py", ctx.getParameter("code_py"));
		values.put("code_wb", "");
		values.put("code_sj", "");
		values.put("code_qt", "");
		values.put("mzsy", ctx.getParameter("mzsy"));
		values.put("zysy", ctx.getParameter("zysy"));
		values.put("yjsy", ctx.getParameter("yjsy"));
		values.put("bqsy", ctx.getParameter("bqsy"));
		values.put("examtype_id", ctx.getParameter("examtype_id"));
		values.put("package_itemnum", ctx.getParameter("package_itemnum"));
		values.put("package_money", ctx.getParameter("package_money"));

		values.put("ordercode", ctx.getParameter("ordercode"));
		values.put("createdt", WDK.getDateTime());
		values.put("status", ctx.getParameter("status"));
		values.put("remark", ctx.getParameter("remark"));

		JSONObject jres = new JSONObject();
		if ("update".equalsIgnoreCase(opertype)) {
			// 1.1、更新主表
			ResultBean rb = _WQL_Update(ctx, wo, values, "package_id='" + package_id + "'");
			if (rb.isSuccess()) {

				// 1.2、更新套餐关联表
				WQLObject wo2 = _WQL_GetWO("EA_BI_ChargePackageItem");
				HashMap<String, String> values2 = new HashMap<String, String>();

				// 首先删除所有关联套餐
				values2.clear();
				_WQL_Delete(ctx, wo2, "package_id='" + package_id + "'");

				// 重新关联套餐
				String item_ids = ctx.getParameter("item_ids");
				String amounts = ctx.getParameter("amounts");
				if (null != item_ids && !"".equals(item_ids.trim())) {
					String[] ids = item_ids.split(",");
					String[] amountArray = amounts.split(",");
					for (int i = 0; i < ids.length; i++) {
						String item_id = ids[i];
						values2.clear();
						values2.put("package_id", package_id);
						values2.put("item_amount", amountArray[i]);
						values2.put("item_id", item_id);
						_WQL_Insert(ctx, wo2, values2);
					}
				}
				jres.put("code", "1");
				jres.put("desc", "修改成功");
			} else {
				jres.put("code", "0");
				jres.put("desc", "修改失败！");
			}
		} else {
			ResultBean rb = _WQL_Insert(ctx, wo, values);
			if (rb.isSuccess()) {
				// 1.2、更新套餐关联表
				WQLObject wo2 = _WQL_GetWO("EA_BI_ChargePackageItem");
				HashMap<String, String> values2 = new HashMap<String, String>();

				// 首先删除所有关联套餐
				values2.clear();
				_WQL_Delete(ctx, wo2, "package_id='" + package_id + "'");

				// 重新关联套餐
				String item_ids = ctx.getParameter("item_ids");
				String amounts = ctx.getParameter("amounts");
				if (null != item_ids && !"".equals(item_ids.trim())) {
					String[] ids = item_ids.split(",");
					String[] amountArray = amounts.split(",");
					for (int i = 0; i < ids.length; i++) {
						String item_id = ids[i];
						values2.clear();
						values2.put("package_id", package_id);
						values2.put("item_amount", amountArray[i]);
						values2.put("item_id", item_id);
						_WQL_Insert(ctx, wo2, values2);
					}
				}
				jres.put("code", "1");
				jres.put("desc", "保存成功");
			} else {
				jres.put("code", "0");
				jres.put("desc", "保存失败！");
			}
		}
		ctx.setPrintOut(jres.toString());
	}

	/**
	 * 收费套餐删除
	 * 
	 * @param ctx
	 * @throws Exception
	 */
	public void chargepackage_remove(WDKContext ctx) throws Exception {
		String package_id = ctx.getParameter("package_id");
		WQLObject wo = _WQL_GetWO("EA_BI_ChargePackage");
		WQLObject wo2 = _WQL_GetWO("EA_BI_ChargePackageItem");

		JSONObject jres = new JSONObject();
		boolean isSuccess = false;
		// 1、删除主表
		ResultBean rb = _WQL_Delete(ctx, wo, "package_id='" + package_id + "'");
		if (rb.isSuccess()) {
			// 2、删除关联表
			rb = _WQL_Delete(ctx, wo2, "package_id='" + package_id + "'");
			if (rb.isSuccess()) {
				isSuccess = true;
			}
		}

		if (isSuccess) {
			jres.put("code", "1");
			jres.put("desc", "删除成功");
		} else {
			jres.put("code", "0");
			jres.put("desc", "删除失败！");
		}
		ctx.setPrintOut(jres.toString());
	}
	
	/**
	 * 根据ID查询检查项目及检查项目相关联的检查技术、检查部位、注意事项等相关信息
	 * 
	 * @param ctx
	 * @throws Exception
	 */
	public void examitem_query(WDKContext ctx) throws Exception {
		String item_id = ctx.getParameter("item_id");
		String whereClause = "item_id='" + item_id + "'";
		JSONObject jres = new JSONObject();
		// 1、查询项目
		WQLObject woItem = _WQL_GetWO("EA_BI_ExamItem");
		ResultBean rbItem = _WQL_Query(ctx, woItem, whereClause);
		if (rbItem.isSuccess()) {
			jres = rbItem.uniqueResult(0);

			// 2、查询项目注意事项
			WQLObject woConfirm = _WQL_GetWO("EA_BI_ExamItemConfirm");
			ResultBean rbConfirm = _WQL_Query(ctx, woConfirm, whereClause);
			if (rbConfirm.isSuccess()) {
				String confirm_ids = "";
				String confirm_names = "";
				JSONArray jrows = rbConfirm.getResultJSONArray(0);
				for (int i = 0; i < jrows.size(); i++) {
					JSONObject jrow = jrows.getJSONObject(i);
					confirm_ids += jrow.getString("confirm_id") + ",";
					confirm_names += jrow.getString("confirm_idname") + ",";
				}
				if (confirm_ids.length() > 0) {
					confirm_ids = confirm_ids.substring(0, confirm_ids.length() - 1);
				}
				if (confirm_names.length() > 0) {
					confirm_names = confirm_names.substring(0, confirm_names.length() - 1);
				}
				jres.put("confirm_ids", confirm_ids);
				jres.put("confirm_names", confirm_names);
			}

			// 3、查询项目检查部位
			WQLObject woPart = _WQL_GetWO("EA_BI_ExamItemBodyPart");
			ResultBean rbPart = _WQL_Query(ctx, woPart, whereClause);
			if (rbPart.isSuccess()) {
				String part_ids = "";
				String part_names = "";
				JSONArray jrows = rbPart.getResultJSONArray(0);
				for (int i = 0; i < jrows.size(); i++) {
					JSONObject jrow = jrows.getJSONObject(i);
					part_ids += jrow.getString("part_id") + ",";
					part_names += jrow.getString("part_idname") + ",";
				}
				if (part_ids.length() > 0) {
					part_ids = part_ids.substring(0, part_ids.length() - 1);
				}
				if (part_names.length() > 0) {
					part_names = part_names.substring(0, part_names.length() - 1);
				}
				jres.put("part_ids", part_ids);
				jres.put("part_names", part_names);
			}

			// 4、查询项目检查技术
			WQLObject woTech = _WQL_GetWO("EA_BI_ExamItemTech");
			ResultBean rbTech = _WQL_Query(ctx, woTech, whereClause);
			if (rbPart.isSuccess()) {
				String tech_ids = "";
				String tech_names = "";
				JSONArray jrows = rbTech.getResultJSONArray(0);
				for (int i = 0; i < jrows.size(); i++) {
					JSONObject jrow = jrows.getJSONObject(i);
					tech_ids += jrow.getString("tech_id") + ",";
					tech_names += jrow.getString("tech_idname") + ",";
				}
				if (tech_ids.length() > 0) {
					tech_ids = tech_ids.substring(0, tech_ids.length() - 1);
				}
				if (tech_names.length() > 0) {
					tech_names = tech_names.substring(0, tech_names.length() - 1);
				}
				jres.put("tech_ids", tech_ids);
				jres.put("tech_names", tech_names);
			}
		}
		ctx.setPrintOut(jres.toString());
	}

	/**
	 * 保存检查项目
	 * 
	 * @param ctx
	 * @throws Exception
	 */
	public void examitem_add(WDKContext ctx) throws Exception {
		String opertype = ctx.getParameter("opertype");
		String item_id = ctx.getParameter("item_id");
		String dt = WDK.getDateTime();
		WQLObject wo = _WQL_GetWO("EA_BI_ExamItem");
		HashMap<String, String> values = new HashMap<String, String>();

		values.put("item_id", item_id);
		String itemName = ctx.getParameter("item_name");
		itemName = itemName.replaceAll("%2B", "+");
		values.put("item_name", itemName);
		values.put("item_enname", ctx.getParameter("item_enname"));
		values.put("examcate_id", ctx.getParameter("examcate_id"));
		values.put("examtype_id", ctx.getParameter("examtype_id"));
		values.put("code_py", ctx.getParameter("code_py"));
		values.put("code_wb", "");
		values.put("code_sj", "");
		values.put("code_qt", "");
		values.put("mzsy", ctx.getParameter("mzsy"));
		values.put("zysy", ctx.getParameter("zysy"));
		values.put("yjsy", ctx.getParameter("yjsy"));
		values.put("bqsy", ctx.getParameter("bqsy"));
		values.put("weight", ctx.getParameter("weight"));
		values.put("parts", ctx.getParameter("parts"));
		values.put("package_id", ctx.getParameter("package_id"));
		values.put("doctor_explain", ctx.getParameter("doctor_explain"));
		values.put("patient_explain", ctx.getParameter("patient_explain"));
		values.put("confirm_num", ctx.getParameter("confirm_num"));
		values.put("ordercode", ctx.getParameter("ordercode"));
		values.put("createdt", dt);
		values.put("exam_part", ctx.getParameter("exam_part"));
		values.put("item_sex", ctx.getParameter("item_sex"));
		values.put("status", ctx.getParameter("status"));
		values.put("remark", ctx.getParameter("remark"));
		double package_money = 0;
		String package_ids = ctx.getParameter("package_id").replace(",", "','");
		ResultBean packageRb = WQL.getWO(WQLNames.QEABIEXAM0001).addParam("flag", "101").addParam("package_ids", "'" + package_ids + "'").process(ctx.getConnectBean());
		if (packageRb != null && packageRb.isSuccess()) {
			JSONArray rows = packageRb.getResultJSONArray(0);
			if (rows != null && rows.size() > 0) {
				for (int i = 0; i < rows.size(); i++) {
					double _meony = rows.getJSONObject(i).getDouble("hjje");
					package_money += _meony;
				}
			}
		}
		values.put("package_money", package_money + "");
		JSONObject jres = new JSONObject();
		ResultBean rb = null;
		if ("update".equalsIgnoreCase(opertype)) {
			// 1.1、更新主表
			rb = _WQL_Update(ctx, wo, values, "item_id='" + item_id + "'");
		} else {
			// 1.1、插入主表
			rb = _WQL_Insert(ctx, wo, values);
		}

		if (null != rb && rb.isSuccess()) {
			// 1.2、更新注意事项关联表
			WQLObject wo2 = _WQL_GetWO("EA_BI_ExamItemConfirm");

			// 首先删除所有关联
			_WQL_Delete(ctx, wo2, "item_id='" + item_id + "'");

			// 重新关联
			String confirm_ids = ctx.getParameter("confirm_ids");
			if (null != confirm_ids && !"".equals(confirm_ids.trim())) {
				String[] ids = confirm_ids.split(",");
				for (int i = 0; i < ids.length; i++) {
					String confirm_id = ids[i];
					values.clear();
					values.put("item_id", item_id);
					values.put("confirm_id", confirm_id);
					values.put("createdt", dt);
					_WQL_Insert(ctx, wo2, values);
				}
			}

			// 1.3、更新检查部位关联表
			WQLObject wo3 = _WQL_GetWO("EA_BI_ExamItemBodyPart");

			// 首先删除所有关联
			_WQL_Delete(ctx, wo3, "item_id='" + item_id + "'");

			// 重新关联
			String part_ids = ctx.getParameter("part_ids");
			if (null != part_ids && !"".equals(part_ids.trim())) {
				String[] ids = part_ids.split(",");
				for (int i = 0; i < ids.length; i++) {
					String part_id = ids[i];
					values.clear();
					values.put("item_id", item_id);
					values.put("part_id", part_id);
					values.put("createdt", dt);
					_WQL_Insert(ctx, wo3, values);
				}
			}

			// 1.4、更新检查技术关联表
			WQLObject wo4 = _WQL_GetWO("EA_BI_ExamItemTech");

			// 首先删除所有关联
			_WQL_Delete(ctx, wo4, "item_id='" + item_id + "'");

			// 重新关联
			String tech_ids = ctx.getParameter("tech_ids");
			if (null != tech_ids && !"".equals(tech_ids.trim())) {
				String[] ids = tech_ids.split(",");
				for (int i = 0; i < ids.length; i++) {
					String tech_id = ids[i];
					values.clear();
					values.put("item_id", item_id);
					values.put("tech_id", tech_id);
					values.put("createdt", dt);
					_WQL_Insert(ctx, wo4, values);
				}
			}

			jres.put("code", "1");
			jres.put("desc", "保存成功");
		} else {
			jres.put("code", "0");
			jres.put("desc", "保存失败！");
		}
		ctx.setPrintOut(jres.toString());
	}

	/**
	 * 检查项目的删除
	 * 
	 * @param ctx
	 * @throws Exception
	 */
	public void examitem_remove(WDKContext ctx) throws Exception {
		String item_id = ctx.getParameter("item_id");
		WQLObject wo = _WQL_GetWO("EA_BI_ExamItem");
		WQLObject wo2 = _WQL_GetWO("EA_BI_ExamItemConfirm");
		WQLObject wo3 = _WQL_GetWO("EA_BI_ExamItemBodyPart");
		WQLObject wo4 = _WQL_GetWO("EA_BI_ExamItemTech");

		// 首先删除所有关联
		_WQL_Delete(ctx, wo2, "item_id='" + item_id + "'");
		JSONObject jres = new JSONObject();
		boolean isSuccess = false;
		ResultBean rb = _WQL_Delete(ctx, wo, "item_id='" + item_id + "'");
		if (rb.isSuccess()) {
			rb = _WQL_Delete(ctx, wo2, "item_id='" + item_id + "'");
			if (rb.isSuccess()) {
				rb = _WQL_Delete(ctx, wo3, "item_id='" + item_id + "'");
				if (rb.isSuccess()) {
					rb = _WQL_Delete(ctx, wo4, "item_id='" + item_id + "'");
					if (rb.isSuccess()) {
						isSuccess = true;
					}
				}
			}
		}
		if (isSuccess) {
			jres.put("code", "1");
			jres.put("desc", "删除成功");
		} else {
			jres.put("code", "0");
			jres.put("desc", "删除失败！");
		}
		ctx.setPrintOut(jres.toString());

	}
	
	/**
	 * 获取医技科室工作人员可看到的设备树
	 * @param ctx
	 * @throws Exception
	 */
	public void device_tree(WDKContext ctx) throws Exception {
		SessionUser user = _getSessionuser(ctx);
		String personUuid = user.getPersonuuid();
		String deptId = user.getDeptuuid();
		WQLObject wo = WQLObject.getWQLObject("EA_BI_Device");
		WQLObject wo2 = WQLObject.getWQLObject("EA_BU_PersonExamType");
		ResultBean rb2 = wo2.query("person_id=?", new String[] { personUuid }, "ordercode", ctx.getConnectBean());
		if (rb2 != null && rb2.isSuccess()) {
			WQLData wqlData = rb2.getWQLData(wo2, 0);
			int count = wqlData.getRowCount();
			String condition = null;
			if (count == 0) {
				condition = "group_id IN (select g.group_id from EA_BI_DeviceGroup g where g.examtype_id IN (SELECT examtype_id FROM EA_BI_DepartMentExamType WHERE dept_id = '" + deptId + "'))";
			} else {
				condition = "group_id IN (select g.group_id from EA_BI_DeviceGroup g where g.examtype_id IN (SELECT examtype_id FROM EA_BU_PersonExamType WHERE person_id='" + personUuid + "'))";
			}
			JSONArray jrows = new JSONArray();
			ResultBean rb = wo.query(condition, new String[] {}, "ordercode asc", ctx.getConnectBean());
			if (rb != null && rb.isSuccess()) {
				jrows = rb.getResultJSONArray(0);
			}
			JSONArray treeRows = WDK.DataFormat_Tree(jrows, "device_id", "device_name", null, null, null);
			ctx.setPrintOut(treeRows.toString());
		}
	}

	/**
	 * 设备的编辑和保存
	 * 
	 * @param ctx
	 * @throws Exception
	 */
	public void device_add(WDKContext ctx) throws Exception {
		String opertype = ctx.getParameter("opertype");
		String device_id = ctx.getParameter("device_id");
		String am_time = ctx.getParameter("am_time");
		String pm_time = ctx.getParameter("pm_time");
		String am_start = am_time.split("-")[0];
		String am_end = am_time.split("-")[1];
		String pm_start = pm_time.split("-")[0];
		String pm_end = pm_time.split("-")[1];
		String dt = WDK.getDateTime();
		WQLObject wo = _WQL_GetWO("EA_BI_Device");
		HashMap<String, String> values = new HashMap<String, String>();

		values.put("device_id", ctx.getParameter("device_id"));
		values.put("device_name", ctx.getParameter("device_name"));
		values.put("code_py", ctx.getParameter("code_py"));
		values.put("code_wb", ctx.getParameter("code_wb"));
		values.put("code_sj", ctx.getParameter("code_sj"));
		values.put("code_qt", ctx.getParameter("code_qt"));
		values.put("am_start", am_start);
		values.put("am_end", am_end);
		values.put("pm_start", pm_start);
		values.put("pm_end", pm_end);
		values.put("splittime", ctx.getParameter("splittime"));
		values.put("area_id", ctx.getParameter("area_id"));
		values.put("room_id", ctx.getParameter("room_id"));
		values.put("group_id", ctx.getParameter("group_id"));
		values.put("ordercode", ctx.getParameter("ordercode"));
		values.put("createdt", dt);
		values.put("status", ctx.getParameter("status"));
		values.put("remark", ctx.getParameter("remark"));

		JSONObject jres = new JSONObject();
		ResultBean rb = null;
		if ("update".equalsIgnoreCase(opertype)) {
			// 1.1、更新主表
			rb = _WQL_Update(ctx, wo, values, "device_id='" + device_id + "'");
		} else {
			// 1.1、插入主表
			rb = _WQL_Insert(ctx, wo, values);
		}

		if (null != rb && rb.isSuccess()) {
			jres.put("code", "1");
			jres.put("desc", "保存成功");
		} else {
			jres.put("code", "0");
			jres.put("desc", "保存失败！");
		}
		ctx.setPrintOut(jres.toString());
	}

	// 设备排班新增
	public void deviceschedu_add(WDKContext ctx) throws Exception {
		String opertype = ctx.getParameter("opertype");
		String schedu_id = ctx.getParameter("schedu_id");
		String work_time = ctx.getParameter("work_time");
		String work_start = work_time.split("-")[0];
		String work_end = work_time.split("-")[1];
		String dt = WDK.getDateTime();
		WQLObject wo = _WQL_GetWO("EA_BI_DeviceSchedu");
		HashMap<String, String> values = new HashMap<String, String>();

		values.put("schedu_id", schedu_id);
		values.put("device_id", ctx.getParameter("device_id"));
		values.put("schedu_date", ctx.getParameter("schedu_date"));
		values.put("schedu_week", ctx.getParameter("schedu_week"));
		values.put("schedu_weekday", ctx.getParameter("schedu_weekday"));
		values.put("ampm", ctx.getParameter("ampm"));
		values.put("work_start", work_start);
		values.put("work_end", work_end);
		values.put("appt_quota", ctx.getParameter("appt_quota"));
		values.put("splitnum", ctx.getParameter("splitnum"));
		values.put("doctor_id", ctx.getParameter("doctor_id"));
		values.put("mzsy", ctx.getParameter("mzsy"));
		values.put("zysy", ctx.getParameter("zysy"));
		values.put("yjsy", ctx.getParameter("yjsy"));
		values.put("bqsy", ctx.getParameter("bqsy"));
		values.put("locktype", ctx.getParameter("locktype"));
		values.put("unlockdeptid", ctx.getParameter("unlockdeptid"));
		values.put("ordercode", ctx.getParameter("ordercode"));
		values.put("createdt", dt);
		values.put("status", ctx.getParameter("status"));
		values.put("remark", ctx.getParameter("remark"));

		JSONObject jres = new JSONObject();
		ResultBean rb = null;
		if ("add".equalsIgnoreCase(opertype)) {
			// 1.1、插入主表
			rb = _WQL_Insert(ctx, wo, values);
		} else {
			// 1.1、更新主表
			rb = _WQL_Update(ctx, wo, values, "schedu_id='" + schedu_id + "'");
		}

		if (null != rb && rb.isSuccess()) {
			jres.put("code", "1");
			jres.put("desc", "保存成功");
		} else {
			jres.put("code", "0");
			jres.put("desc", "保存失败！");
		}
		ctx.setPrintOut(jres.toString());
	}
}
