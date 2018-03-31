package com.longj.products.ea.standard.bu.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.wdk.WDK;
import org.wdk.core.bean.WDKLogger;
import org.wdk.core.exception.BusiException;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLModule;
import org.wdk.module.wql.core.bean.WQLObject;
import org.wdk.module.wql.core.engine.object.WO;

import wql.WQLNames;

import com.longj.platform.busi.wdk.handler.SessionUser;
import com.longj.products.ea.standard.bu.BUConstant;
import com.longj.products.ea.standard.bu.BUServiceUtil;
import com.longj.products.ea.standard.bu.service.BUAppointmentService;
import com.longj.products.ea.standard.bu.service.BUBaseService;
import com.longj.products.ea.standard.bu.service.bean.TimePoint;
import com.longj.products.ea.standard.bu.service.bean.TimeSection;
import com.longj.products.ea.standard.bu.service.proxy.BUSmsHandler;

public class BUAppointmentServiceImpl extends BUBaseService implements BUAppointmentService {

	private static WDKLogger logger = new WDKLogger(BUAppointmentServiceImpl.class.getName());

	private static HashSet<String> runningMap_add = new HashSet<String>();// 多线程安全控制

	public static void unLock(String key) {
		runningMap_add.remove(key);
	}

	public static void lock(String key) {
		runningMap_add.add(key);
	}

	public static void lock(String[] keys) {
		if (keys != null && keys.length > 0) {
			for (String key : keys) {
				runningMap_add.add(key);
			}
		}
	}

	public static boolean isRunning(String key) {
		return runningMap_add.contains(key);
	}

	public static boolean isRunning(String[] keys) {
		if (keys == null || keys.length == 0) {
			return false;
		}
		for (String key : keys) {
			if (isRunning(key)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 获取设备的时间间隔，排班的时候用，比如30分钟，那么就是一个时间段就是30分钟
	 * 
	 * @param conb
	 * @param deviceId
	 * @return
	 * @throws Exception
	 */
	private int getMinute(ConnectBean conb, String deviceId) throws Exception {
		int minute = 30;// 默认30分钟，具体还需要从设备表中获取一下
		// 从设备表捞取一把minute，本次暂时不处理
		WQLObject deviceWo = this.getWQLObject("EA_BI_Device");
		if (deviceWo != null) {
			ResultBean rb = deviceWo.query("device_id =? ", new String[] { deviceId }, "device_id", conb);
			if (rb != null && rb.isSuccess()) {
				WQLData wqlData = rb.getWQLData(deviceWo, 0);
				if (wqlData != null) {
					wqlData.first();
					if (wqlData.next()) {
						String minuteStr = wqlData.getValue("splittime");
						if (minuteStr != null && minuteStr.trim().length() > 0) {
							minute = Integer.parseInt(minuteStr);
						}
					}
				}
			}
		}
		return minute;
	}

	/**
	 * 构建timesection对象
	 * 
	 * @param wo
	 * @param rb
	 * @param minute
	 * @param mappingPoint
	 * @param mappingSection
	 * @return
	 * @throws Exception
	 */
	private List<TimeSection> buildTimeSections(WQLObject wo, ResultBean rb, int minute, Map<String, TimePoint> mappingPoint, Map<String, TimeSection> mappingSection) throws Exception {
		List<TimeSection> returnList = new ArrayList<TimeSection>();
		if (rb != null && rb.isSuccess()) {
			WQLData scheduDataSet = rb.getWQLData(wo, 0);
			if (scheduDataSet != null) {
				scheduDataSet.first();
				while (scheduDataSet.next()) {
					String startTime = scheduDataSet.getValue("work_start");
					String schedu_date = scheduDataSet.getValue("schedu_date");
					String endTime = scheduDataSet.getValue("work_end");
					String am_pm = scheduDataSet.getValue("ampm");
					String internalStr = scheduDataSet.getValue("splitnum");
					String appt_quotaStr = scheduDataSet.getValue("appt_quota");
					String schedu_id = scheduDataSet.getValue("schedu_id");// 主键
					String locktype = scheduDataSet.getValue("locktype");// 锁号类型:0-不锁号
																			// 1-住院锁号
																			// 2-医技科室锁号
					String doctor_idname = scheduDataSet.getValue("doctor_idname");
					if (locktype == null || "".equals(locktype.trim())) {
						locktype = BUConstant.LOCKTYPE_NONE;// 默认为不锁号
					}
					int internal = 3;// 默认三个
					int app_quota = 30;// 默认30个
					if (internalStr != null && !"".equals(internalStr.trim())) {
						internal = Integer.parseInt(internalStr);
					}
					if (appt_quotaStr != null && !"".equals(appt_quotaStr)) {
						app_quota = Integer.parseInt(appt_quotaStr);
					}
					JSONObject jo = new JSONObject();
					jo.put("schedu_id", schedu_id);
					jo.put("schedu_date", schedu_date);
					jo.put("work_start", startTime);
					jo.put("work_end", endTime);
					jo.put("ampm", am_pm);
					jo.put("minute", minute);
					jo.put("splitnum", internal);
					jo.put("app_quota", app_quota);
					jo.put("locktype", locktype);
					jo.put("doctor_idname", doctor_idname);
					List<TimeSection> time = this.splitTimeSection(jo, mappingPoint, mappingSection);
					returnList.addAll(time);
				}
			}
		}
		return returnList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public JSONArray getNumberListFromSchedu(ConnectBean conb, String deviceId, String date) throws Exception {
		List<TimeSection> returnList = new ArrayList<TimeSection>();
		Map<String, TimePoint> mappingPoint = new HashMap<String, TimePoint>();
		Map<String, TimeSection> mappingSection = new HashMap<String, TimeSection>();
		int minute = this.getMinute(conb, deviceId);
		WQLObject wo = this.getWQLObject("EA_BI_DeviceSchedu");// 排班表
		List<String> whereArgs = new ArrayList<String>();
		String whereClause = "device_id = ? and schedu_date = ? and status='1'";
		whereArgs.add(deviceId);
		whereArgs.add(date);
		ResultBean rb = wqlQuery(conb, wo, whereClause, whereArgs, "ampm,work_start");
		// 一、第一步，装在普通排班表的信息
		returnList = this.buildTimeSections(wo, rb, minute, mappingPoint, mappingSection);
		// 二、第二步，装在加号表的信息内容
		WQLObject addWo = this.getWQLObject("EA_BU_Add");// 加号表(加号数据规则：一个午别下只有一个时间段)
		String whereClauseAdd = "device_id = ? and add_dt = ? and status='1'";
		ResultBean rbAdd = addWo.query(whereClauseAdd, new String[] { deviceId, date }, "add_ampm,add_section,add_point", conb);
		HashMap<String, TimeSection> ampmTimeSection = new HashMap<String, TimeSection>();
		if (rbAdd != null && rbAdd.isSuccess()) {
			// 装载加号包的信息到对象中
			WQLData addWqlData = rbAdd.getWQLData(addWo, 0);
			if (addWqlData != null) {
				addWqlData.first();
				while (addWqlData.next()) {
					String ampm = addWqlData.getValue("add_ampm");
					String timesecion = addWqlData.getValue("add_section");
					String timepoint = addWqlData.getValue("add_point");
					if (ampm == null || "".equals(ampm.trim())) {
						continue;
					}
					TimeSection section = null;
					if (ampmTimeSection.containsKey(ampm)) {
						section = ampmTimeSection.get(ampm);
					} else {
						section = new TimeSection(date, timesecion, ampm);
						section.setOperator("");// TODO 加号表的值班医生暂时为空
						section.setHas_add("1");// 加号标识；
					}
					section.addAvailable();
					TimePoint tp = new TimePoint();
					tp.setUsed("0");
					tp.setDate(date);
					tp.setTimepoint(timepoint);
					tp.setNumbertype(BUConstant.NUMBER_TYPE_ADD);
					mappingPoint.put(timepoint, tp);
					mappingSection.put(timepoint, section);
					section.addTimePoint(tp);
					ampmTimeSection.put(ampm, section);
				}
			}
		}
		if (ampmTimeSection != null && ampmTimeSection.size() > 0) {
			if (ampmTimeSection.size() != 2) {
				throw new Exception("午别不对");
			}
			Iterator<String> it = ampmTimeSection.keySet().iterator();
			// returnList
			while (it.hasNext()) {
				String ampm = it.next();
				returnList.add(ampmTimeSection.get(ampm));
			}
		}

		// 三、第三步：装在锁号表的信息内容
		WQLObject lockWo = this.getWQLObject("EA_BU_Lock");// 锁号表
		String whereClauseLock = "device_id = ? and lock_dt = ? and status='1'";
		ResultBean rbLock = lockWo.query(whereClauseLock, new String[] { deviceId, date }, "lock_ampm,lock_section,lock_point", conb);
		if (rbLock != null && rbLock.isSuccess()) {
			// 装载锁号包的信息到对象中
			WQLData lockWd = rbLock.getWQLData(lockWo, 0);
			if (lockWd != null) {
				lockWd.first();
				while (lockWd.next()) {
					String lock_point = lockWd.getValue("lock_point");// 锁号时间点
					if (mappingPoint.containsKey(lock_point)) {
						TimePoint tp = mappingPoint.get(lock_point);
						tp.setLocktype(BUConstant.LOCKTYPE_YJSH);
						tp.setLocksource(BUConstant.LOCKSOURCE_MT);//人工锁号
						tp.setUnlockdeptid(lockWd.getValue("unlockdeptid"));
					}
					if (mappingSection.containsKey(lock_point)) {
						TimeSection ts = mappingSection.get(lock_point);
						ts.setHas_lock("1");
					}
				}
			}
		}
		Collections.sort(returnList, new Comparator<Object>() {
			// 这里的o1和o2就是list里任意的两个对象，然后按需求把这个方法填完整就行了
			public int compare(Object o1, Object o2) {
				TimeSection ts1 = (TimeSection) o1;
				TimeSection ts2 = (TimeSection) o2;
				return ts1.getTimesecion().compareTo(ts2.getTimesecion());
				// 比较规则
			}
		});

		return JSONArray.fromObject(returnList);
	}

	/**
	 * @param date
	 *            具体哪一天
	 * @param startTime
	 *            具体这天的开始时间
	 * @param endTime
	 *            具体这天的下班时间
	 * @param am_pm
	 *            这天的午别，上午 还是下午
	 * @param minute
	 *            时间段长度，默认是30分钟
	 * @param internal
	 *            一个时间端内的个数
	 * @param app_quota
	 *            总预约的限额数
	 * @return
	 * @throws Exception
	 */
	private List<TimeSection> splitTimeSection(JSONObject workTime, Map<String, TimePoint> mappingPoint, Map<String, TimeSection> mappingSection) throws Exception {
		// String schedu_id, String date, String startTime, String endTime,
		// String am_pm, int minute, int internal, int app_quota
		String schedu_id = workTime.getString("schedu_id");
		String date = workTime.getString("schedu_date");
		String startTime = workTime.getString("work_start");
		String endTime = workTime.getString("work_end");
		String am_pm = workTime.getString("ampm");
		String doctor_idname = workTime.getString("doctor_idname");
		String locktype = workTime.getString("locktype");
		int minute = workTime.getInt("minute");// 此字段从设备表带入
		int internal = workTime.getInt("splitnum");
		int app_quota = workTime.getInt("app_quota");
		int count = 0;
		List<TimeSection> splitTime = new ArrayList<TimeSection>();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
		Date startDate = null;
		try {
			startDate = format.parse(date + " " + startTime + ":00");
		} catch (Exception e) {
			throw e;
		}
		Date endDate = null;
		try {
			endDate = format.parse(date + " " + endTime + ":00");
		} catch (Exception e) {
			throw e;
		}
		Calendar nowTime = Calendar.getInstance();
		nowTime.setTime(startDate);
		while (nowTime.getTime().before(endDate)) {
			TimeSection section = new TimeSection(date, dateFormat.format(nowTime.getTime()), am_pm);
			section.setOperator(doctor_idname);// 值班医生
			section.setSchedu_id(schedu_id);// 设置所属的排班主键UUID
			splitTime.add(section);
			{
				Calendar nowTime2 = Calendar.getInstance();
				nowTime2.setTime(nowTime.getTime());

				nowTime2.add(Calendar.MINUTE, minute);

				Date innerEndDate = nowTime2.getTime();
				nowTime2.setTime(nowTime.getTime());
				int newVal = minute / internal;
				while (nowTime2.getTime().before(innerEndDate) && count <= app_quota) {
					TimePoint point = new TimePoint(date, dateFormat.format(nowTime2.getTime()));
					point.setLocktype(locktype);
					if(!BUConstant.LOCKTYPE_NONE.equals(locktype)){
						point.setLocksource(BUConstant.LOCKSOURCE_AT);
					}
					if (mappingPoint != null) {
						mappingPoint.put(dateFormat.format(nowTime2.getTime()), point);
					}
					if (mappingSection != null) {
						mappingSection.put(dateFormat.format(nowTime2.getTime()), section);
					}
					section.addTimePoint(point);
					nowTime2.add(Calendar.MINUTE, newVal);
					count++;
				}
				section.setAvailable(section.getTimePoints() == null ? 0 : section.getTimePoints().size());// 默认都是全部可用的
			}

			nowTime.add(Calendar.MINUTE, minute);// 对开始时间增加30分钟；
		}
		return splitTime;
	}

	public static void main(String[] arg0) throws Exception {
		JSONObject jo = new JSONObject();
		jo.put("schedu_id", "");
		jo.put("schedu_date", "2016-12-6");
		jo.put("work_start", "8:30");
		jo.put("work_end", "11:30");
		jo.put("ampm", "am");
		jo.put("minute", 30);
		jo.put("splitnum", 3);
		jo.put("app_quota", 30);
		List<TimeSection> t = new BUAppointmentServiceImpl().splitTimeSection(jo, null, null);
		System.out.println(JSONObject.fromObject(t));
	}

	@Override
	public JSONArray getLockMaintInfoList(ConnectBean conb, String deviceId, String date) throws Exception {
		if (isScheduInstanced(conb, deviceId, date)) {
			// 如果大于0，那么就只要从当前结果集获取即可
			return this.getNumberListFromNumberInst(conb, deviceId, date);
		} else {
			// 如果是0，代表当日当前设备还未进行初始化操作（定时任务的初始化）
			// 标识设置为false，那么后续的操作就需要从排班表（定义表）中获取了
			return this.getNumberListFromSchedu(conb, deviceId, date);
		}
	}

	@Override
	public JSONArray getNumberListFromNumberInst(ConnectBean conb, String deviceId, String date) throws Exception {
		// <排班ID，<>>
		JSONArray returnList = new JSONArray();
		Map<String, TimeSection> sectionMapping = new LinkedHashMap<String, TimeSection>();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		String now = sdf.format(new Date());
		// WQLObject wo = this.getWQLObject("EA_BU_Number");
		// String othersql = " (appt_id = '' or  appt_id is  null) ";已经预约的也建议带出来
		WO wo = WQL.getWO(WQLNames.QEABUAPPT0002).addParam("flag", "1").addParam("device_id", deviceId).addParam("schedu_dt", date);
		if (DateUtils.isSameDay(new Date(), sdf2.parse(date))) {
			wo.addParam("now", now);
		}
		// wo.addParam("sql", othersql)
		ResultBean numberRb = wo.process(conb);
		// wo.query("schedu_dt=? and device_id = ? ", new String[] { date,
		// deviceId }, " schedu_section,schedu_point", conb);
		if (numberRb != null && numberRb.isSuccess()) {
			WQLData dataset = numberRb.getWQLData(0);
			if (dataset != null) {
				dataset.first();
				while (dataset.next()) {
					String scheduSection = dataset.getValue("schedu_section");
					TimeSection t = null;
					if (sectionMapping.containsKey(scheduSection)) {
						t = sectionMapping.get(scheduSection);
					} else {
						String schedu_ampm = dataset.getValue("schedu_ampm");
						t = new TimeSection(date, scheduSection, schedu_ampm);
						t.setOperator(dataset.getValue("doctor_idname"));// 设置本时间段的检查医技科室技师
					}
					TimePoint point = new TimePoint();
					point.setDate(date);
					String numbertype = dataset.getValue("number_type");
					String locktype = dataset.getValue("locktype");// 锁号类型
					point.setTimepoint(dataset.getValue("schedu_point"));
					if (BUConstant.NUMBER_TYPE_ADD.equals(numbertype)) {
						t.setHas_add("1");// 代表有加号了
					}
					if (BUConstant.LOCKTYPE_YJSH.equals(locktype) || BUConstant.LOCKTYPE_ZYSH.equals(locktype)) {
						t.setHas_lock("1");// 这就代表又锁号存在了
					}
					point.setNumbertype(numbertype);
					point.setLocktype(locktype);
					point.setNumber_id(dataset.getValue("number_id"));// 号码的主键值
					point.setUnlockdeptid(dataset.getValue("unlockdeptid"));// 解锁部门的UUID
					String appt_id = dataset.getValue("appt_id");
					point.setUsed(appt_id == null || "".equals(appt_id.trim()) ? "0" : "1");// 有对应的预约单了，就代表被使用了
					if ("0".equals(point.getUsed())) {
						t.addAvailable();
					}
					t.addTimePoint(point);
					sectionMapping.put(scheduSection, t);
				}
			}
			Iterator<String> it = sectionMapping.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				returnList.add(JSONObject.fromObject(sectionMapping.get(key)));
			}
		}
		return returnList;
	}

	@Override
	public boolean isScheduInstanced(ConnectBean conb, String deviceId, String date) throws Exception {
		WQLObject wo = this.getWQLObject("EA_BU_Number");
		boolean isInstanced = true;
		ResultBean numberRb = wo.query("schedu_dt=? and device_id = ? ", new String[] { date, deviceId }, " schedu_section,schedu_point", conb);
		if (numberRb != null && numberRb.isSuccess()) {
			int count = numberRb.getWQLData(0).getRowCount();
			if (count == 0) {
				// 如果是0，代表当日当前设备还未进行初始化操作（定时任务的初始化）
				isInstanced = false;// 标识设置为false，那么后续的操作就需要从排班表（定义表）中获取了
			}
		}
		return isInstanced;
	}

	@Override
	public JSONArray createAppointment(ConnectBean conb, String deviceId, String date, String[] number_ids, String exam_id, String person_id, String person_type) throws Exception {
		JSONArray rows = new JSONArray();
		WQLObject numberWo = this.getWQLObject("EA_BU_Number");// 号码实例表
		String appt_uuid = WDK.getUUID();// 自动创建本次预约的UUID
		String start_section = "";
		String start_point = "";
		String ampm = "";

		ResultBean relateRb = numberWo.query("number_id IN (" + BUServiceUtil.getQuestionMark(number_ids.length) + ")", number_ids, "schedu_section,schedu_point", conb);
		if (relateRb != null && relateRb.isSuccess()) {
			WQLData wd = relateRb.getWQLData(numberWo, 0);
			if (wd != null) {
				wd.first();
				for (int i = 0; wd.next(); i++) {
					String oldApptId = wd.getValue("appt_id");
					if (oldApptId != null && oldApptId.trim().length() > 0) {
						throw new Exception("当前操作中有号，已经被使用了,请刷新后操作！");
					}
					wd.edit();
					wd.setValue("appt_id", appt_uuid);
					if (i == 0) {
						// 第一个就是开始时间
						ampm = wd.getValue("schedu_ampm");
						start_point = wd.getValue("schedu_point");
						start_section = wd.getValue("schedu_section");
					}
				}
				// 检查互斥(类型和类型的互斥 ，类型和项目的互斥 ),如 心电里的 “24 小时动态心电 ” 做了以后 ，24
				// 小时之内不能做磁共振,不能做各种脏器 B超，CT 等。
				// TOOD 程序需要先检查病人已有的检查项目情况，包括已做了和未来要做的
				ResultBean updateRb = numberWo.update(wd, conb);// 把号码实例表中的字段（关联的预约单的ID），更新为刚生成的预约单的ID
				if (updateRb != null && updateRb.isSuccess()) {

					WQLObject wo = this.getWQLObject("EA_BU_Appointment");// 预约单数据模型;
					if (wo != null) {
						WQLData dataSet = new WQLData(wo);
						dataSet.insert();
						dataSet.setValue("appt_id", appt_uuid);// 预约单的主键
						dataSet.setValue("exam_id", exam_id);// 检查单的主键
						dataSet.setValue("person_id", person_id);// 预约人员的ID
						dataSet.setValue("person_type", person_type);// 预约人员的类型
						dataSet.setValue("device_id", deviceId);// 预约设备的ID
						dataSet.setValue("appt_dt", date);// 预约日期
						dataSet.setValue("appt_ampm", ampm);// 午别
						dataSet.setValue("start_section", start_section);// 时间段
						dataSet.setValue("start_point", start_point);// 时间点
						dataSet.setValue("createdt", WDK.getDateTime());
						dataSet.setValue("status", BUConstant.STATUS_ENABLE);// 状态默认是1，代表有效
						ResultBean rb = wo.insert(dataSet, conb);
						if (rb != null && rb.isSuccess()) {
							JSONObject mark = new JSONObject();
							mark.put("form_id", exam_id);
							mark.put("oper_code", "s001");
							mark.put("oper_desc", "预约成功！预约时间:" + date + " " + start_point);
							// 插入成功后，
							logger.info("预约记录完成！！！！！！！！！！！！下面开始更新检查单的情况");
							JSONObject jo = new JSONObject();
							jo.put("exam_id", exam_id);
							jo.put("form_status", BUConstant.FORM_STATUS_s003);// 已预约
							jo.put("appt_id", appt_uuid);
							// jo.put("updatedt", WDK.getDateTime());
							BUServiceUtil.getBUExamService().updateExamForm(conb, jo);
							rows.add(mark);
						}
					}
				}
			}
		}
		return rows;
	}

	@Override
	public JSONArray createNumberLock(ConnectBean conb, JSONArray timePoints, String deviceId, String date, String locktype, String unlockdeptid, String lock_personid, String lock_reason) throws Exception {
		if (timePoints != null && timePoints.size() > 0) {
			WQLObject lockWo = this.getWQLObject("EA_BU_Lock");// 锁号表
			WQLData dataSet = new WQLData(lockWo);
			Map<String, String> complexMapLockId = new HashMap<String, String>();
			// Map<String,JSONObject> lockIdMapJSONObject = new HashMap<String,
			// JSONObject>();
			List<String> ids = new ArrayList<String>();
			for (int i = 0; i < timePoints.size(); i++) {
				JSONObject jo = timePoints.getJSONObject(i);
				String number_id = jo.getString("number_id");
				if (number_id != null && number_id.trim().length() > 0) {
					ids.add(number_id);
				}
				dataSet.insert();
				String lockUuid = WDK.getUUID();
				complexMapLockId.put(deviceId + "_" + date + "_" + jo.getString("lock_ampm") + "_" + jo.getString("lock_section").trim() + "_" + jo.getString("lock_point").trim(), lockUuid);
				dataSet.setValue("lock_id", lockUuid);
				dataSet.setValue("device_id", deviceId);
				dataSet.setValue("lock_dt", date);
				dataSet.setValue("lock_ampm", jo.getString("lock_ampm"));
				dataSet.setValue("lock_section", jo.getString("lock_section"));
				dataSet.setValue("lock_point", jo.getString("lock_point"));
				dataSet.setValue("lock_type", locktype);
				dataSet.setValue("unlockdeptid", unlockdeptid);
				dataSet.setValue("lock_personid", lock_personid);
				dataSet.setValue("ordercode", "" + (i + 1));
				dataSet.setValue("createdt", WDK.getDateTime());
				dataSet.setValue("lock_reason", lock_reason);
				dataSet.setValue("status", BUConstant.STATUS_ENABLE);// 默认代表启用
				// dataSet.setValue("remark","");
			}
			ResultBean lockInsetRb = lockWo.insert(dataSet, conb);
			if (lockInsetRb != null && lockInsetRb.isSuccess()) {

				boolean isInstanced = this.isScheduInstanced(conb, deviceId, date);
				if (isInstanced && ids.size() > 0) {
					// 如果已经产生了实例，同时需要把实例的状态进行变更和替换；
					WQLObject numberWo = this.getWQLObject("EA_BU_Number");// 号码实例表
					String whereClause = " device_id=? and schedu_dt = ? and number_id IN (" + BUServiceUtil.getQuestionMark(ids.size()) + ")";
					ids.add(0, date);
					ids.add(0, deviceId);
					ResultBean numberRb = numberWo.query(whereClause, ids.toArray(new String[ids.size()]), "number_id", conb);
					if (numberRb != null && numberRb.isSuccess()) {
						WQLData wqlData = numberRb.getWQLData(numberWo, 0);
						if (wqlData != null) {
							wqlData.first();
							while (wqlData.next()) {
								String key = deviceId + "_" + date + "_" + wqlData.getValue("schedu_ampm") + "_" + wqlData.getValue("schedu_section") + "_" + wqlData.getValue("schedu_point");
								if (complexMapLockId.containsKey(key)) {
									wqlData.edit();
									wqlData.setValue("locksource", BUConstant.LOCKSOURCE_MT);// 2代表人工锁号
									wqlData.setValue("lock_id", complexMapLockId.get(key));
									wqlData.setValue("locktype", locktype);
									wqlData.setValue("unlockdeptid", unlockdeptid);
								}
							}
							ResultBean numberUpdateRb = numberWo.updateAll(wqlData, conb);
							if (numberUpdateRb != null && numberUpdateRb.isSuccess()) {
								logger.info("关联实例更新成功");
							}
						}
					}

				}
			}
		}
		return null;
	}

	@Override
	public synchronized JSONArray createNumberAdd(ConnectBean conb, String deviceId, String date, String addPersonId, String ampm, int amCount, String amReason) throws Exception {
		if (amCount == 0) {
			return null;
		}
		int minute = this.getMinute(conb, deviceId);
		int internal = 3;// 默认三个
		int app_quota = 30;// 默认30个
		String add_section = "";// 每个午别对应的加号时间段
		WQLObject wo = this.getWQLObject("EA_BI_DeviceSchedu");// 排班表
		List<String> whereArgs = new ArrayList<String>();
		String whereClause = "device_id = ? and schedu_date = ?  and ampm = ? and status='1'";
		whereArgs.add(deviceId);
		whereArgs.add(date);
		whereArgs.add(ampm);
		ResultBean rb = wqlQuery(conb, wo, whereClause, whereArgs, "work_end desc");
		if (rb != null && rb.isSuccess()) {
			WQLData scheduDataSet = rb.getWQLData(wo, 0);
			if (scheduDataSet != null) {
				scheduDataSet.first();
				if (scheduDataSet.next()) {
					String internalStr = scheduDataSet.getValue("splitnum");
					String appt_quotaStr = scheduDataSet.getValue("appt_quota");
					add_section = scheduDataSet.getValue("work_end");
					if (internalStr != null && !"".equals(internalStr.trim())) {
						internal = Integer.parseInt(internalStr);
					}
					if (appt_quotaStr != null && !"".equals(appt_quotaStr)) {
						app_quota = Integer.parseInt(appt_quotaStr);
					}
				}
			}
		}
		if (add_section == null || "".equals(add_section)) {
			throw new BusiException("当前日志未排班，不允许进行加号！");
		}
		logger.info("app_quota的值：" + app_quota);
		int bay = minute / internal;// 比如：30/3 = 10,约10分钟一个班次；

		// 步骤二，从现有的加号表获取最大的时间点
		String maxPoint = add_section;
		WQLObject woAdd = getWQLObject("EA_BU_Add");// 加号表对象；
		WQLObject numberWo = this.getWQLObject("EA_BU_Number");// 号码实例表
		List<String> whereArgsAdd = new ArrayList<String>();
		String whereClauseAdd = "device_id = ? and add_dt = ?  and add_ampm = ?  and add_section = ? and status='1'";
		whereArgsAdd.add(deviceId);
		whereArgsAdd.add(date);
		whereArgsAdd.add(ampm);
		whereArgsAdd.add(add_section);
		ResultBean addRb = wqlQuery(conb, woAdd, whereClauseAdd, whereArgsAdd, "add_point desc");
		if (addRb != null && addRb.isSuccess()) {
			WQLData wqlDataAdd = addRb.getWQLData(woAdd, 0);
			if (wqlDataAdd != null) {
				wqlDataAdd.first();
				if (wqlDataAdd.next()) {
					maxPoint = wqlDataAdd.getValue("add_point");
				}
			}
		}
		WQLData addInsetData = new WQLData(woAdd);
		WQLData numberInsetData = new WQLData(numberWo);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
		Date startDate = null;
		try {
			startDate = format.parse(date + " " + maxPoint + ":00");
		} catch (Exception e) {
			throw e;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(startDate);
		for (int i = 0; i < amCount; i++) {
			addInsetData.insert();
			numberInsetData.insert();
			cal.add(Calendar.MINUTE, bay);
			/*
			 * add_id device_id add_dt add_ampm add_section add_point
			 * add_personid ordercode createdt add_reason status remark
			 */
			String addId = WDK.getUUID();
			String createDt = WDK.getDateTime();
			addInsetData.setValue("add_id", addId);
			addInsetData.setValue("device_id", deviceId);
			addInsetData.setValue("add_dt", date);
			addInsetData.setValue("add_ampm", ampm);
			addInsetData.setValue("add_section", add_section);
			addInsetData.setValue("add_point", dateFormat.format(cal.getTime()));
			addInsetData.setValue("add_personid", addPersonId);
			addInsetData.setValue("ordercode", i + "");

			addInsetData.setValue("createdt", createDt);
			addInsetData.setValue("add_reason", amReason);
			addInsetData.setValue("status", "1");
			addInsetData.setValue("remark", "");

			// 下面开始插入号码实例表
			/*
			 * device_id schedu_dt schedu_ampm schedu_section schedu_point
			 * number_type add_id createdt ordercode
			 */
			String numberId = WDK.getUUID();
			numberInsetData.setValue("number_id", numberId);
			numberInsetData.setValue("device_id", deviceId);
			numberInsetData.setValue("schedu_dt", date);
			numberInsetData.setValue("schedu_ampm", ampm);
			numberInsetData.setValue("schedu_section", add_section);
			numberInsetData.setValue("schedu_point", dateFormat.format(cal.getTime()));
			numberInsetData.setValue("number_type", BUConstant.NUMBER_TYPE_ADD);
			numberInsetData.setValue("add_id", addId);
			numberInsetData.setValue("createdt", createDt);
			numberInsetData.setValue("ordercode", i + "");

		}
		ResultBean insertRb = woAdd.insert(addInsetData, conb);

		if (insertRb != null && insertRb.isSuccess()) {
			boolean isInstanced = this.isScheduInstanced(conb, deviceId, date);
			if (isInstanced) {
				ResultBean numberInsertRb = numberWo.insert(numberInsetData, conb);
				if (numberInsertRb != null && numberInsertRb.isSuccess()) {
					logger.info("插入成功");

				}
			}
		}
		return null;
	}

	@Override
	public void cancelNumberLock(ConnectBean conb, String lock_id) throws Exception {
		WQLObject lockWo = this.getWQLObject("EA_BU_Lock");// 锁号表
		ResultBean rb = lockWo.delete("lock_id = ?", new String[] { lock_id }, conb);
		if (rb != null && rb.isSuccess()) {
			WQLObject numberWo = this.getWQLObject("EA_BU_Number");// 号码实例表
			ResultBean numberRb = numberWo.query("lock_id = ?", new String[] { lock_id }, "number_id", conb);
			if (numberRb != null && numberRb.isSuccess()) {
				WQLData dataset = numberRb.getWQLData(numberWo, 0);
				if (dataset != null) {
					dataset.first();
					while (dataset.next()) {
						dataset.edit();
						dataset.setValue("lock_id", "");
						dataset.setValue("unlockdeptid", "");
						dataset.setValue("locksource", "");
						dataset.setValue("locktype", BUConstant.LOCKTYPE_NONE);
					}
				}
				ResultBean updateRb = numberWo.update(dataset, conb);
				if (updateRb != null && updateRb.isSuccess()) {
					logger.info("取消锁号成功");
				}
			}
		}
	}

	@Override
	public void cancelNumberAdd(ConnectBean conb, String add_id) throws Exception {
		WQLObject woAdd = getWQLObject("EA_BU_Add");// 加号表对象；
		String deviceId = "";
		String add_dt = "";
		String add_ampm = "";
		String add_section = "";
		String add_point = "";
		ResultBean queryRb = woAdd.query("add_id = ?", new String[] { add_id }, "add_id", conb);
		if (queryRb != null && queryRb.isSuccess()) {
			WQLData wqlData = queryRb.getWQLData(woAdd, 0);
			if (wqlData != null) {
				wqlData.first();
				if (wqlData.next()) {
					deviceId = wqlData.getValue("device_id");
					add_dt = wqlData.getValue("add_dt");
					add_ampm = wqlData.getValue("add_ampm");
					add_section = wqlData.getValue("add_section");
					add_point = wqlData.getValue("add_point");
				}
			}
		}
		// TODO 请增加判断：当前增加的号是否已经实例化，如果实例化了，再判断下当前号是否已经被使用了
		ResultBean rb = woAdd.delete("add_id = ?", new String[] { add_id }, conb);
		if (rb != null && rb.isSuccess()) {
			WQLObject numberWo = this.getWQLObject("EA_BU_Number");// 号码实例表
			ResultBean numberRb = numberWo.query("add_id = ?", new String[] { add_id }, "number_id", conb);
			if (numberRb != null && numberRb.isSuccess()) {
				WQLData dataset = numberRb.getWQLData(numberWo, 0);
				List<String> lockIdList = new ArrayList<String>();
				boolean isInstance = false;
				if (dataset != null) {
					dataset.first();
					while (dataset.next()) {
						isInstance = true;
						String lock_id = dataset.getValue("lock_id");
						if (lock_id != null && lock_id.trim().length() > 0) {
							lockIdList.add(lock_id);
						}
						dataset.setDeleteMark();
					}
				}
				// 已经有实例数据，通过实例删除锁号信息
				if (isInstance) {
					ResultBean updateRb = numberWo.delete(dataset, conb);
					if (updateRb != null && updateRb.isSuccess() && lockIdList.size() > 0) {
						// 加号被锁了，那么锁号记录也删除
						WQLObject lockWo = this.getWQLObject("EA_BU_Lock");// 锁号表
						ResultBean lockDelRb = lockWo.delete(" lock_id in (" + BUServiceUtil.getQuestionMark(lockIdList.size()) + ")", lockIdList.toArray(new String[lockIdList.size()]), conb);
						if (lockDelRb != null && lockDelRb.isSuccess()) {
							logger.info("取消加号成功");
						}
					}
				} else {
					// 如果没实例数据，那么就通过设备ID、日期、时间段、时间点来删除锁号信息
					if (deviceId != null && deviceId.trim().length() > 0) {
						WQLObject lockWo = this.getWQLObject("EA_BU_Lock");// 锁号表
						ResultBean lockDelRb = lockWo.delete(" device_id=? and lock_dt=? and lock_ampm=? and lock_section=? and lock_point=?", new String[] { deviceId, add_dt, add_ampm, add_section, add_point }, conb);
						if (lockDelRb != null && lockDelRb.isSuccess()) {
							logger.info("取消加号成功");
						}
					}
				}
			}
		}
	}

	@Override
	public JSONArray cancelAppointment(ConnectBean conb, String appt_id) throws Exception {
		JSONArray rows = new JSONArray();
		if (appt_id == null || "".equals(appt_id)) {
			return rows;
		}
		WQLObject wo = this.getWQLObject("EA_BU_Appointment");// 预约单数据模型;
		if (wo != null) {
			ResultBean deleteRb = wo.delete("appt_id = ?", new String[] { appt_id }, conb);
			if (deleteRb != null && deleteRb.isSuccess()) {
				WQLObject numberWo = this.getWQLObject("EA_BU_Number");
				HashMap<String, String> values = new HashMap<String, String>();
				values.put("appt_id", "");// 情况号码实例表的外键
				ResultBean updateRb = numberWo.update(values, "appt_id = ?", new String[] { appt_id }, conb);
				if (updateRb != null && updateRb.isSuccess()) {
					JSONObject mark = new JSONObject();
					String examId = appt_id;
					mark.put("oper_code", "s003");// 作废
					mark.put("oper_desc", "取消预约");
					WQLObject exmaWo = this.getWQLObject("EA_BU_Exam");
					ResultBean examRb = exmaWo.query("appt_id = ?", new String[] { appt_id }, "exam_id", conb);
					if (examRb != null && examRb.isSuccess()) {
						JSONArray formList = examRb.getResultJSONArray(0);
						if (formList != null && formList.size() > 0) {
							for (int i = 0; i < formList.size(); i++) {
								JSONObject jj = formList.getJSONObject(i);
								examId = jj.getString("exam_id");
								jj.put("appt_id", "");
								jj.put("form_status", BUConstant.FORM_STATUS_s004);
								jj.put("ordercode", "0");
								jj.put("sysupdatedt", WDK.getDateTime());
							}
						}
						if (formList != null && formList.size() > 0) {
							BUServiceUtil.getBUExamService().saveExamFormList(conb, formList);
							// 预约成功后，通知sms进行短信的取消
							BUSmsHandler handSms = new BUSmsHandler();
							if (rows != null && rows.size() > 0) {
								// handSms.setApptId(appt_id);
								handSms.setExamId(examId);
								handSms.setIscancelOrSend("2");// 取消预约
								handSms.transAfter(conb, true);
							}
						}
					}
					mark.put("form_id", examId);
					rows.add(mark);
				}
			}
		}
		return rows;
	}

	@Override
	public void sign(ConnectBean conb, String[] appt_id) throws Exception {
		// 预约单的签到时间和签到设备做更新，
		// 检查单的状态，更新为已签到
		// 最后更新全局静态变量：本设备id排队MAP,调用pacs系统的登记接口

	}
	
	@Override
	public JSONObject queryAppointmentList(ConnectBean conb, HttpServletRequest request, String whereCondition) throws Exception {
		JSONObject retuenJo = new JSONObject();
		JSONArray returnRows = new JSONArray();
		WO wo = WQL.getWO(WQLNames.QEABUAPPT0002).addParam("flag", "2");
		if (whereCondition != null && whereCondition.trim().length() > 0) {
			wo.addParam("sql", whereCondition);// 增加其他sql的过滤
		}

		JSONObject rb = wo.pageQuery(request, "patient_id", conb);
		List<String> allPersonIds = new ArrayList<String>();
		Map<String, JSONObject> mapping = new LinkedHashMap<String, JSONObject>();
		if (rb != null && rb.size() > 0) {
			JSONArray allRows = rb.getJSONArray("rows");
			if (allRows != null && allRows.size() > 0) {
				for (int i = 0; i < allRows.size(); i++) {
					JSONObject person = allRows.getJSONObject(i);
					String patient_id = person.getString("patient_id");
					String dept_id = person.getString("dept_id");
					allPersonIds.add(patient_id);
					String key = patient_id + "_" + dept_id;
					mapping.put(key, person);
				}
			}
		}
		if (allPersonIds.size() > 0) {
			String ids = "'" + StringUtils.join(allPersonIds, "','") + "'";
			WQLObject wObject = this.getWQLObject("V_EA_BU_Appointment");
			String whereSql = " patient_id IN (" + ids + ") and form_status <> 's002' ";
			if (whereCondition != null && whereCondition.trim().length() > 0) {
				whereSql += " and " + whereCondition;
			}
			ResultBean queryRb = wObject.query(whereSql, null, "patient_id,dept_id,examtype_id,examitem_id,appt_date", conb);
			if (queryRb != null && queryRb.isSuccess()) {
				JSONArray apptRows = queryRb.getResultJSONArray(0);
				if (apptRows != null && apptRows.size() > 0) {
					for (int m = 0; m < apptRows.size(); m++) {
						JSONObject bill = apptRows.getJSONObject(m);
						String patient_id = bill.getString("patient_id");
						String dept_id = bill.getString("dept_id");
						String key = patient_id + "_" + dept_id;
						if (mapping.containsKey(key)) {
							JSONObject personJo = mapping.get(key);
							JSONArray existedList = null;
							if (personJo.containsKey("examtype_idname")) {
								existedList = personJo.getJSONArray("examtype_idname");
							} else {
								existedList = new JSONArray();
							}
							if(!personJo.containsKey("bed_no")){
								personJo.put("bed_no", bill.getString("bed_no"));
							}
							existedList.add(bill);
							personJo.put("examtype_idname", existedList);
						}

					}
				}
			}
		}
		if (mapping != null && mapping.size() > 0) {
			Iterator<String> it = mapping.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				returnRows.add(mapping.get(key));
			}
		}
		retuenJo.put("rows", returnRows);
		retuenJo.put("total", rb.getInt("total"));
		return retuenJo;
	}

	@Override
	public JSONObject queryAppointmentList(ConnectBean conb, HttpServletRequest request, String examtypeId, String exam_start_time, String exam_end_time, String is_appted, String othersql) throws Exception {
		JSONObject retuenJo = new JSONObject();
		JSONArray returnRows = new JSONArray();
		WO wo = WQL.getWO(WQLNames.QEABUAPPT0002).addParam("flag", "2");
		if (exam_start_time != null && exam_start_time.trim().length() > 0) {
			wo.addParam("createdt_start", exam_start_time);
		}
		if (exam_end_time != null && exam_end_time.trim().length() > 0) {
			wo.addParam("createdt_end", exam_end_time);
		}
		if (examtypeId != null && examtypeId.trim().length() > 0) {
			wo.addParam("examtype_id", examtypeId);
		}
		if (is_appted != null && is_appted.trim().length() > 0) {
			wo.addParam("is_appted", is_appted);
		}
		if (othersql != null && othersql.trim().length() > 0) {
			wo.addParam("sql", othersql);// 增加其他sql的过滤
		}
		JSONObject rb = wo.pageQuery(request, "patient_id", conb);
		List<String> allPersonIds = new ArrayList<String>();
		Map<String, JSONObject> mapping = new LinkedHashMap<String, JSONObject>();
		if (rb != null && rb.size() > 0) {
			JSONArray allRows = rb.getJSONArray("rows");
			if (allRows != null && allRows.size() > 0) {
				for (int i = 0; i < allRows.size(); i++) {
					JSONObject person = allRows.getJSONObject(i);
					String patient_id = person.getString("patient_id");
					String dept_id = person.getString("dept_id");
					allPersonIds.add(patient_id);
					String key = patient_id + "_" + dept_id;
					mapping.put(key, person);
				}
			}
		}
		if (allPersonIds.size() > 0) {
			String ids = "'" + StringUtils.join(allPersonIds, "','") + "'";
			//WQLObject wObject = this.getWQLObject("V_EA_BU_Appointment");
			String whereSql = " T0.patient_id IN (" + ids + ") and T0.form_status <> 's002' ";
			if ("0".equals(is_appted)) {
				whereSql += " and (T0.appt_id is null or T0.appt_id='') ";
			}else if ("1".equals(is_appted)) {
				whereSql += " and (T0.appt_id is not null and  T0.appt_id <> '') ";
			}
			if (examtypeId != null && examtypeId.trim().length() > 0) {
				whereSql += " and T0.examtype_id = '" + examtypeId + "'";
			}
			if (exam_start_time != null && exam_start_time.trim().length() > 0) {
				whereSql += " and T0.exam_create_dt >= '" + exam_start_time + "'";
			}
			if (exam_end_time != null && exam_end_time.trim().length() > 0) {
				whereSql += " and T0.exam_create_dt <= '" + exam_end_time + "'";
			}
			if (othersql != null && othersql.trim().length() > 0) {
				whereSql += " and " + othersql;
			}
			ResultBean queryRb = WQL.getWO(WQLNames.QEABUAPPT0002).addParam("flag", "999").addParam("sql", whereSql).addParam("orderby", "T0.patient_id,T0.dept_id,T0.examtype_id,T0.appt_date").process(conb);
				//wObject.query(whereSql, null, "T0.patient_id,T0.dept_id,T0.examtype_id,T0.examitem_id,T0.appt_date", conb);
			if (queryRb != null && queryRb.isSuccess()) {
				JSONArray apptRows = queryRb.getResultJSONArray(0);
				if (apptRows != null && apptRows.size() > 0) {
					//
					WQLModule wmEscort = WQLModule.getWQLModule("CODE_BU_ESCORT");
					WQLModule wmDisease = WQLModule.getWQLModule("CODE_BU_DISEASE");
					apptRows = wmEscort.filter(apptRows, "convoy_type", null, "convoy_typename", conb);
					apptRows = wmDisease.filter(apptRows, "illness_level", null, "illness_levelname", conb);
					for (int m = 0; m < apptRows.size(); m++) {
						JSONObject bill = apptRows.getJSONObject(m);
						String patient_id = bill.getString("patient_id");
						String dept_id = bill.getString("dept_id");
						String key = patient_id + "_" + dept_id;
						if (mapping.containsKey(key)) {
							JSONObject personJo = mapping.get(key);
							JSONArray existedList = null;
							if (personJo.containsKey("examtype_idname")) {
								existedList = personJo.getJSONArray("examtype_idname");
							} else {
								existedList = new JSONArray();
							}
							existedList.add(bill);
							personJo.put("examtype_idname", existedList);
						}

					}
					
				}
			}
		}
		
		if (mapping != null && mapping.size() > 0) {
			Iterator<String> it = mapping.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				returnRows.add(mapping.get(key));
			}
		}
		retuenJo.put("rows", returnRows);
		retuenJo.put("total", rb.getInt("total"));
		return retuenJo;
	}

	@Override
	public JSONArray getNumberListFromSchedu(ConnectBean conb, String scheduId, String deviceId, String date, String ampm) throws Exception {
		List<TimeSection> returnList = new ArrayList<TimeSection>();
		Map<String, TimePoint> mappingPoint = new HashMap<String, TimePoint>();
		Map<String, TimeSection> mappingSection = new HashMap<String, TimeSection>();
		int minute = this.getMinute(conb, deviceId);
		WQLObject wo = this.getWQLObject("EA_BI_DeviceSchedu");// 排班表
		List<String> whereArgs = new ArrayList<String>();
		String whereClause = "schedu_id = ? and status='1'";
		whereArgs.add(scheduId);
		ResultBean rb = wqlQuery(conb, wo, whereClause, whereArgs, "ampm,work_start");
		// 一、第一步，装在普通排班表的信息
		returnList = this.buildTimeSections(wo, rb, minute, mappingPoint, mappingSection);
		return JSONArray.fromObject(returnList);
		
	}

	@Override
	public List<String> getAuthExamTypeList(ConnectBean conb, SessionUser user) {
		List<String> examTypeList = new ArrayList<String>();
		WQLObject wo2 = WQLObject.getWQLObject("EA_BU_PersonExamType");
		ResultBean rb2 = wo2.query("person_id=?", new String[] { user.getPersonuuid() }, "ordercode", conb);
		if (rb2 != null && rb2.isSuccess()) {
			WQLData wqlData = rb2.getWQLData(wo2, 0);
			int count = wqlData.getRowCount();
			String condition = null;
			if (count == 0) {
				condition = "EXAMTYPE_ID IN (SELECT t9.examtype_id FROM EA_BI_DepartMentExamType t9 WHERE t9.dept_id = '" + user.getDeptuuid() + "')";
			} else {
				condition = "EXAMTYPE_ID IN (SELECT t9.examtype_id FROM EA_BU_PersonExamType t9 WHERE t9.person_id='" + user.getPersonuuid() + "')";
			}
			WQLObject wo = WQLObject.getWQLObject("EA_BI_ExamType");
			ResultBean rb = wo.query(condition, null, "ordercode", conb);
			if(rb!=null && rb.isSuccess()){
				JSONArray rows = rb.getResultJSONArray(0);
				if(rows!=null && rows.size()>0){
					for(int i=0;i<rows.size();i++){
						examTypeList.add(rows.getJSONObject(i).getString("examtype_id"));
					}
				}
			}
		}
		return examTypeList;
	}
}
