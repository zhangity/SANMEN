package com.longj.products.ea.standard.bu.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;

import wql.WQLNames;

import com.longj.platform.busi.wdk.base.BaseActionMethod;
import com.longj.platform.busi.wdk.handler.SessionUser;

public class BUStatAction extends BaseActionMethod {
	private static WDKLogger logger = new WDKLogger(BUStatAction.class.getName());

	public static void main(String[] args) {
		System.out.println(new BUStatAction().getMondayOfThisWeek());
		System.out.println(new BUStatAction().getSundayOfThisWeek());
		System.out.println(new BUStatAction().getWhereCondition("3"));
	}
	
	/**
	 * 查询当前登录人是否是医技科室
	 * 
	 * @param context
	 * @return
	 * @throws Exception
	 */
	private boolean isMedTechPerson(WDKContext context) throws Exception {
		SessionUser user = _getSessionuser(context);
		WQLObject wo = WQLObject.getWQLObject("EA_BI_DepartMent");
		ResultBean rb = wo.query("dept_id =?", new String[] {user.getDeptuuid()}, "dept_id", context.getConnectBean());
		if (rb != null && rb.isSuccess()) {
			WQLData wd = rb.getWQLData(wo, 0);
			if (wd != null) {
				wd.first();
				if (wd.next()) {
					String yjsy = wd.getValue("yjsy");
					if ("1".equals(yjsy)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * 得到本周周一
	 * 
	 * @return yyyy-MM-dd
	 */
	public String getMondayOfThisWeek() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		int day_of_week = c.get(Calendar.DAY_OF_WEEK) - 1;
		if (day_of_week == 0)
			day_of_week = 7;
		c.add(Calendar.DATE, -day_of_week + 1);
		return df2.format(c.getTime());
	}

	/**
	 * 得到本周周日
	 * 
	 * @return yyyy-MM-dd
	 */
	public String getSundayOfThisWeek() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		int day_of_week = c.get(Calendar.DAY_OF_WEEK) - 1;
		if (day_of_week == 0)
			day_of_week = 7;
		c.add(Calendar.DATE, -day_of_week + 7+1);
		return df2.format(c.getTime());
	}

	private String[] getWhereCondition(String type) {
		Calendar cal = Calendar.getInstance();
		String[] result = new String[2];
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if ("1".equals(type)) {
			String startDay = sdf.format(cal.getTime());
			cal.add(Calendar.DAY_OF_MONTH, 1);
			String endDay = sdf.format(cal.getTime());
			result[0] = startDay;
			result[1] = endDay;
		} else if ("2".equals(type)) {
			result[0] = getMondayOfThisWeek();
			result[1] = getSundayOfThisWeek();
		} else if ("3".equals(type)) {
			cal.set(Calendar.DAY_OF_MONTH, 1);
			String startDay = sdf.format(cal.getTime());
			cal.add(Calendar.MONTH, 1);
			//cal.add(Calendar.DATE, -1);
			String endDay = sdf.format(cal.getTime());
			result[0] = startDay;
			result[1] = endDay;
		}
		return result;
	}
	
	/**
	 * 当前部门按照检查类型的统计
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void statCurrentDeptExamTypeCount(WDKContext context) throws Exception {
		String type = context.getString("type");// 1-本日；2-本周；3-本月
		if (type == null || "".equals(type)) {
			type = "1";
		}
		SessionUser user = _getSessionuser(context);
		String dept_id = "501";// 默认放射科
		String dept_name = "放射科";
		if (isMedTechPerson(context)) {
			dept_id = user.getDeptuuid();
			dept_name = user.getDeptname();
		}
		String[] arg0 = getWhereCondition(type);
		JSONObject result = new JSONObject();
		result.put("title", dept_name);
		
		//EA_BI_DepartMentExamType

		String start_time = arg0[0];
		String end_time = arg0[1];
		
		ResultBean rb = WQL.getWO(WQLNames.QEABUSTAT0004).addParam("flag", "3").addParam("dept_id", dept_id).addParam("start_dt", start_time).addParam("end_dt", end_time).process(context.getConnectBean());
		if (rb != null && rb.isSuccess()) {
			JSONArray rows = rb.getResultJSONArray(0);
			if (rows != null && rows.size() > 0) {
				for (int i = 0; i < rows.size(); i++) {
					JSONObject row = rows.getJSONObject(i);
					String examtypename = row.getString("examtype_name");
					String count = row.getString("count");
					result.put(examtypename, count);
				}
			}
		}
		context.setPrintOut(result.toString());
	}
	

	/**
	 * 各部分检查数量统计
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void statMedTechDeptCount(WDKContext context) throws Exception {
		String type = context.getString("type");// 1-本日；2-本周；3-本月
		if (type == null || "".equals(type)) {
			type = "1";
		}
		JSONObject result = new JSONObject();
		String[] arg0 = getWhereCondition(type);
		String whereCondition = " appt_date>='"+arg0[0]+"' and appt_date<='"+arg0[1]+"'";
		ResultBean rb = WQL.getWO(WQLNames.QEABUEXAM0003).addParam("flag", "5").addParam("sql", whereCondition).process(context.getConnectBean());
		if (rb != null && rb.isSuccess()) {
			WQLData wd = rb.getWQLData(0);
			if (wd != null) {
				wd.first();
				while (wd.next()) {
					String deptname = wd.getValue("dept_name");
					String count = wd.getValue("count");
					result.put(deptname, count);
				}
			}
		}
		context.setPrintOut(result.toString());
	}

	/**
	 * 统计今日开的检查单数量： （医技科室只能看到自己部门信息，普通人可看到全院信息）
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void statExamFormCount(WDKContext context) throws Exception {
		JSONObject result = new JSONObject();
		result.put("total", "85");
		result.put("appted", "20");
		result.put("signed", "2");
		result.put("completed", "9");
		context.setPrintOut(result.toString());
	}

	/**
	 * 根据检查科室和时间统计
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void statExamTypeByDept(WDKContext context) throws Exception {
		SessionUser user = _getSessionuser(context);
		String dept_id = user.getDeptuuid();// 获取登陆人所属的部门标识
		String start_time = context.getString("start_time");
		String end_time = context.getString("end_time");
		ResultBean rb = WQL.getWO(WQLNames.QEABUSTAT0004).addParam("flag", "1").addParam("dept_id", dept_id).addParam("start_dt", start_time).addParam("end_dt", end_time).process(context.getConnectBean());
		if (rb != null && rb.isSuccess()) {
			JSONArray rows = rb.getResultJSONArray(0);
			logger.info(rows.toString());
			context.setPrintOut(rows.toString());
		} else {
			context.setPrintOut("[]");
		}
	}

	public void statExamCategoryByDept(WDKContext context) throws Exception {
		String start_time = context.getString("start_time");
		String end_time = context.getString("end_time");
		String examtype_id = context.getString("examtype_id");// 检查类型
		ResultBean rb = WQL.getWO(WQLNames.QEABUSTAT0004).addParam("flag", "2").addParam("examtype_id", examtype_id).addParam("start_dt", start_time).addParam("end_dt", end_time).process(context.getConnectBean());
		if (rb != null && rb.isSuccess()) {
			JSONArray rows = rb.getResultJSONArray(0);
			logger.info(rows.toString());
			context.setPrintOut(rows.toString());
		} else {
			context.setPrintOut("[]");
		}
	}
}
