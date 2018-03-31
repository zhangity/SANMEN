package com.longj.products.ea.standard.bu.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.quartz.JobExecutionException;
import org.wdk.WDK;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.core.exception.BusiException;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLDataField;
import org.wdk.module.wql.core.bean.WQLObject;

import wql.WQLNames;

import com.longj.platform.busi.wdk.base.BaseActionMethod;
import com.longj.platform.busi.wdk.handler.SessionUser;
import com.longj.products.ea.standard.bi.bean.EAPatient;
import com.longj.products.ea.standard.bi.util.EAUtil;
import com.longj.products.ea.standard.bu.BUConstant;
import com.longj.products.ea.standard.bu.BUServiceUtil;
import com.longj.products.ea.standard.bu.regular.BURegularCore;
import com.longj.products.ea.standard.bu.service.impl.BUAppointmentServiceImpl;
import com.longj.products.ea.standard.bu.service.impl.BUSignQueue;
import com.longj.products.ea.standard.bu.service.job.BIChargeItemSyncJob;
import com.longj.products.ea.standard.bu.service.job.BUDeviceScheduJob;
import com.longj.products.ea.standard.bu.service.proxy.BULockHandler;
import com.longj.products.ea.standard.bu.service.proxy.BUMarkHandler;
import com.longj.products.ea.standard.bu.service.proxy.BUSignHandler;
import com.longj.products.ea.standard.bu.service.proxy.BUSmsHandler;
import com.longj.products.ea.standard.bu.ws.BasePaceAdapter;
import com.longj.products.ea.standard.bu.ws.impl.NullPacsAdapter;
import com.longj.products.ea.standard.bu.ws.impl.core.PacsSyncCore;

/**
 * 预约单维护action
 * 
 * @author YuBin
 * 
 */
public class BUAppointmentAction extends BaseActionMethod {

	private static WDKLogger logger = new WDKLogger(BUAppointmentAction.class.getName());

	/**
	 * 获取条形码需要用到的业务信息
	 * @param context
	 * @throws Exception
	 */
	public void getBarCodeBusiInfo(WDKContext context) throws Exception {
		String examId = context.getString("exam_id");
		String comValue1 = WDK.getNodeParam("cfg_com_port");
		if(comValue1==null||"".equals(comValue1.trim())){
			comValue1 = "COM3";
		}
		JSONObject result = new JSONObject();
		// WQLObject wo = WQLObject.getWQLObject("EA_BI_ExamItem");
		boolean isCharge = false;
		ResultBean br = WQL.getWO(WQLNames.QEABUEXAM0003).addParam("flag", "4").addParam("exam_id", examId).process(context.getConnectBean());
		if (br != null && br.isSuccess()) {
			JSONArray jrows = br.getResultJSONArray(0);
			result = jrows.getJSONObject(0);
			String patientId = result.getString("patient_id");
			String patientCode = result.getString("patient_code");
			if (patientCode == null || "".equals(patientCode)) {
				patientCode = patientId;
			}
			String patientType = result.getString("exam_type");
			String owncharge =  result.getString("owncharge");
			String ownchargename = "1".equals(owncharge)?"自费":"医保";
			String type = patientType.replaceAll("t", "");
			String outId = result.getString("out_id");
			String chargeStatus = result.getString("charge_status");//
			if(BUConstant.CHARGE_STATUS_s001.equals(chargeStatus)||BUConstant.CHARGE_STATUS_s003.equals(chargeStatus)){
				result.put("charge_statusname", "已收费");
				isCharge = true;
			}else{
				result.put("charge_statusname", "未收费");
			}
			EAPatient pa = EAUtil.queryPatient(patientId, patientType, outId);
			result.put("agename", pa.getAgename());
			result.put("sexname", pa.getSexname());
			result.put("barcode", type+patientCode);
			result.put("ownchargename", ownchargename);
		}
		result.put("com", comValue1);
		String wxtx = "请务必在预约时间前15分钟到检查科室签到，过期重新排队！";
		if (!isCharge) {
			wxtx += "(未付费病人请在预约时间前30分钟内去付费窗口付费，否则将自动取消预约！)";
		}
		result.put("wxtx", wxtx);
		result.put("yydh", "0576-83361555");
		result.put("tsdh", "0576-83361567");
		context.setPrintOut(result.toString());
	}
	
	
	/**
	 * 格式化时间，输出格式为yyyy-MM-dd
	 * 
	 * @param d
	 * @return
	 */
	private static String getDate(Date d) {
		String timestr = new String("");
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		timestr = f.format(d);
		logger.info("格式化后输出为：" + timestr);
		return timestr;
	}

	/**
	 * 保存医技科室人员的预约授权情况(预约的权限控制)
	 * 
	 * @param context
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public void saveAuthority(WDKContext context) throws Exception {
		JSONObject jo = new JSONObject();
		jo.put("code", "0");
		jo.put("desc", "保存失败");
		String data = context.getString("data");
		String personId = context.getString("person_id");
		WQLObject wo = _WQL_GetWO("EA_BU_PersonExamType");
		ResultBean rb = _WQL_Delete(context, wo, "person_id = ?", Arrays.asList(personId));
		if (rb != null && rb.isSuccess()) {
			if (data != null && data.trim().length() > 0) {
				JSONArray rows = JSONArray.fromObject(data);
				if (rows != null && rows.size() > 0) {
					Map<String, WQLDataField> fieldmap = wo.getFieldMap();
					WQLData dataset = new WQLData(wo);
					for (int i = 0; i < rows.size(); i++) {
						dataset.insert();
						JSONObject row = rows.getJSONObject(i);
						Iterator<String> it = row.keys();
						while (it.hasNext()) {
							String key = it.next();
							if (fieldmap.containsKey(key.toUpperCase())) {
								dataset.setValue(key.toUpperCase(), row.getString(key));
							}
						}
						dataset.setValue("CREATEDT", WDK.getDateTime());
						dataset.setValue("ORDERCODE", (i + 1) + "");
					}
					ResultBean rb2 = _WQL_Insert(context, wo, dataset);
					if (rb2 != null && rb2.isSuccess()) {
						jo.put("code", "1");
						jo.put("desc", "保存成功");
					}
				}
			}
		}
		context.setPrintOut(jo.toString());
	}

	/**
	 * 对于锁号界面来说，获取的数据有两种情况，已实例化的话 就从实例表获取，否则就从排班表获取
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void queryDeviceNumberListForLock(WDKContext context) throws Exception {
		String deviceId = context.getString("device_id");
		String date = context.getString("schedu_dt");
		if (date == null || "".equals(date.trim())) {
			date = getDate(new Date());
		}
		JSONArray rows = BUServiceUtil.getBUAppointmentService().getLockMaintInfoList(context.getConnectBean(), deviceId, date);
		context.setPrintOut(rows.toString());
	}

	/**
	 * 获取预约的需要的信息,对于预约来说，控制可以简单点，默认可认为，所有的数据都已实例化了
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void queryDeviceNumberList(WDKContext context) throws Exception {
		String deviceId = context.getString("device_id");
		String date = context.getString("schedu_dt");
		if (date == null || "".equals(date.trim())) {
			date = getDate(new Date());
		}
		JSONArray rows = BUServiceUtil.getBUAppointmentService().getNumberListFromNumberInst(context.getConnectBean(), deviceId, date);
		context.setPrintOut(rows.toString());
	}

	/**
	 * 查询本检查单可预约的设备清单
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void queryDeviceList(WDKContext context) throws Exception {
		String exam_id = context.getString("exam_id");// 这里还需要根据检查单的检查项目的数据进行过滤，目前暂时可不过滤
		String date =  context.getString("date");
		System.out.println("本次获取的时间情况为："+date);
		logger.info("本次需要预约的检查单的标识为：" + exam_id);
		WQLObject wo = _WQL_GetWO("EA_BI_Device");
		String whereCondition = "device_id in (SELECT a.device_id FROM EA_BI_DeviceExamItem a INNER JOIN EA_BU_Exam b ON a.examitem_id = b.examitem_id WHERE b.exam_id='"+exam_id+"')";
		ResultBean rb = _WQL_Query(context, wo, whereCondition, null, "ordercode");
		if (rb != null && rb.isSuccess()) {
			JSONArray deviceList = rb.getResultJSONArray(0);
			if (date != null && date.trim().length() > 0) {
				JSONArray newList = new JSONArray();
				if (deviceList != null && deviceList.size() > 0) {
					List<String> deviceIds = new ArrayList<String>();
					for (int i = 0; i < deviceList.size(); i++) {
						JSONObject row = deviceList.getJSONObject(i);
						String deviceId = row.getString("device_id");
						if(!deviceIds.contains(deviceId)){
							deviceIds.add(deviceId);
						}
					}
					newList = getDeviceNameExtraList(context.getConnectBean(), deviceIds, date);
				}
				context.setPrintOut(newList.toString());
				
			}else{
				context.setPrintOut(deviceList.toString());
			}
		} else {
			// 否则就输出为空数组
			context.setPrintOut("[]");
		}
		
		
	}

	/**
	 * 根据ID获取设备列表
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void queryDeviceListByIds(WDKContext context) throws Exception {
		String devices = context.getString("device_ids");
		String date = context.getString("date");
		if (devices != null && devices.trim().length() > 0) {
			String[] ids = devices.split(",");
			List<String> deviceIds = new ArrayList<String>();
			for (String id : ids) {
				deviceIds.add(id);
			}
			if (date != null && date.trim().length() > 0) {
				JSONArray rows = getDeviceNameExtraList(context.getConnectBean(), deviceIds, date);
				context.setPrintOut(rows.toString());
			} else {
				WQLObject wo = _WQL_GetWO("EA_BI_Device");
				ResultBean rb = _WQL_Query(context, wo, "device_id = ?", Arrays.asList(ids), "ordercode");
				if (rb != null && rb.isSuccess()) {
					context.setPrintOut(rb.getResultJSONArray(0).toString());
				}
			}
		} else {
			// 否则就输出为空数组
			context.setPrintOut("[]");
		}
	}
	
	/**
	 * @param conb
	 * @param deviceIds
	 * @param date
	 * @param devicesMap
	 * @return
	 */
	private JSONArray getDeviceNameExtraList(ConnectBean conb, List<String> deviceIds, String date) {
		JSONArray newList = new JSONArray();
		String deviceIdsStr = StringUtils.join(deviceIds, "','");
		ResultBean rb2 = WQL.getWO(WQLNames.QEABIEXAM0001).addParam("flag", "301").addParam("schedu_date", date).addParam("device_ids", "'" + deviceIdsStr + "'").process(conb);
		if (rb2 != null && rb2.isSuccess()) {
			Map<String, List<String>> deviceNameMap = new HashMap<String, List<String>>();
			JSONArray newRows = rb2.getResultJSONArray(0);
			LinkedHashMap<String,String> nameMap = new LinkedHashMap<String, String>();
			if (newRows != null && newRows.size() > 0) {
				for (int i = 0; i < newRows.size(); i++) {
					JSONObject row = newRows.getJSONObject(i);
					String deviceId = row.getString("device_id");
					List<String> names = null;
					if (deviceNameMap.containsKey(deviceId)) {
						names = deviceNameMap.get(deviceId);
					} else {
						names = new ArrayList<String>();
					}
					if(!nameMap.containsKey(deviceId)){
						nameMap.put(deviceId, row.getString("device_name"));
					}
					String personName = row.getString("person_name");
					if(personName==null||"".equals(personName.trim())){
						continue;
					}
					if (!names.contains(personName)) {
						names.add(personName);
					}
					deviceNameMap.put(deviceId, names);
				}
			}
			Iterator<String> it = nameMap.keySet().iterator();
			while (it.hasNext()) {
				String _deviceId = it.next();
				String _name = nameMap.get(_deviceId);
				if (deviceNameMap.containsKey(_deviceId)) {
					List<String> extraName = deviceNameMap.get(_deviceId);
					if (extraName != null && extraName.size() > 0) {
						_name += "(" + StringUtils.join(extraName, ",") + ")";
					}
				}
				JSONObject jo = new JSONObject();
				jo.put("device_id", _deviceId);
				jo.put("device_name", _name);
				newList.add(jo);
			}
		}
		return newList;
	}
	/**
	 * 根据设备ID，获取设备的
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void queryDeviceByDeviceId(WDKContext context) throws Exception {
		String device_id = context.getString("device_id");// 这里还需要根据检查单的检查项目的数据进行过滤，目前暂时可不过滤
		WQLObject wo = _WQL_GetWO("EA_BI_Device");
		ResultBean rb = _WQL_Query(context, wo, "device_id = ?", Arrays.asList(device_id), "ordercode");
		if (rb != null && rb.isSuccess()) {
			context.setPrintOut(rb.getResultJSONArray(0).toString());
		} else {
			// 否则就输出为空数组
			context.setPrintOut("[]");
		}
	}

	/**
	 * 通过检查类型筛选操作的设备
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void queryDeviceListByExamType(WDKContext context) throws Exception {
		String examtype_id = context.getString("examtype_id");
		String date =  context.getString("date");
		logger.info("本次检查类型的标识为：" + examtype_id);
		WQLObject wo = _WQL_GetWO("EA_BI_Device");
		String whereCondition = "group_id in (SELECT a.group_id from EA_BI_DeviceGroup a  where a.examtype_id = '"+examtype_id+"')";
		ResultBean rb = _WQL_Query(context, wo, whereCondition, null, "ordercode");
		if (rb != null && rb.isSuccess()) {
			JSONArray deviceList = rb.getResultJSONArray(0);
			if (date != null && date.trim().length() > 0) {
				JSONArray newList = new JSONArray();
				if (deviceList != null && deviceList.size() > 0) {
					List<String> deviceIds = new ArrayList<String>();
					for (int i = 0; i < deviceList.size(); i++) {
						JSONObject row = deviceList.getJSONObject(i);
						String deviceId = row.getString("device_id");
						if(!deviceIds.contains(deviceId)){
							deviceIds.add(deviceId);
						}
					}
					newList = getDeviceNameExtraList(context.getConnectBean(), deviceIds, date);
				}
				context.setPrintOut(newList.toString());
				
			}else{
				context.setPrintOut(deviceList.toString());
			}
		} else {
			// 否则就输出为空数组
			context.setPrintOut("[]");
		}
	}

	/**
	 * 在预约界面中，获取默认的可选择的时间清单
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void getDefaultDateInfo(WDKContext context) throws Exception {
		JSONArray rows = new JSONArray();
		int initCount = 4;// 默认初始化的个数为2，如果需要调整，可以把这参数配置到系统全局参数中去
		Map<Integer, String> chnsName = new HashMap<Integer, String>();
		chnsName.put(0, "今天");
		chnsName.put(1, "明天");
		chnsName.put(2, "后天");
		chnsName.put(3, "大后天");
		final String dayNames[] = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		Calendar nowTime = Calendar.getInstance();
		for (int i = 0; i < initCount; i++) {
			int week = nowTime.get(Calendar.DAY_OF_WEEK) - 1;
			JSONObject jo = new JSONObject();

			jo.put("date", getDate(nowTime.getTime()));
			jo.put("week", dayNames[week]);
			if (chnsName.containsKey(i)) {
				jo.put("name", chnsName.get(i));
			} else {
				jo.put("name", getDate(nowTime.getTime()));
			}
			rows.add(jo);
			nowTime.add(Calendar.DATE, 1);
		}
		context.setPrintOut(rows.toString());
	}

	/**
	 * 模拟每天凌晨1点的定时任务执行
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void simulationJob(WDKContext context) throws Exception {
		new BUDeviceScheduJob().execute(null);
		JSONObject jo = new JSONObject();
		jo.put("code", "1");
		jo.put("desc", "模拟启动成功");
		context.setPrintOut(jo.toString());
	}
	
	/**
	 * 手工同步收费项目
	 * @param context
	 * @throws Exception
	 */
	public void chargeItemSync(WDKContext context) throws Exception {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					new BIChargeItemSyncJob().execute(null);
				} catch (JobExecutionException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
		JSONObject jo = new JSONObject();
		jo.put("code", "1");
		jo.put("desc", "模拟启动成功");
		context.setPrintOut(jo.toString());
	}

	/**
	 * 发生了一次预约
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void createAppointment(WDKContext context) throws Exception {
		String numberId = context.getString("number_ids");
		String deviceId = context.getString("device_id");
		String date = context.getString("schedu_dt");
		String start_point = context.getString("start_point");
		String exam_id = context.getString("exam_id");
		String[] number_ids = numberId.split(",");
		String person_id = context.getString("person_id");
		String person_type = context.getString("person_type");
		int count = 0;
		boolean isContinue = true;
		if (BUAppointmentServiceImpl.isRunning(number_ids)) {
			while (true) {
				count++;
				Thread.sleep(200);
				if (!BUAppointmentServiceImpl.isRunning(number_ids)) {
					break;
				}
				if (count > 200) {
					isContinue = false;
					break;
				}
			}
		}
		if (isContinue) {
			List<String> msg = new ArrayList<String>();
			String apptdt = "";
			if (start_point != null && start_point.trim().length() > 0 && date != null && date.trim().length() > 0) {
				apptdt = date + " " + start_point.trim();
			}
			// 预约之前进行互斥的校验
			boolean isOK = BURegularCore.preCheck(context.getConnectBean(), msg, exam_id, apptdt);
			if (isOK) {
				// 加锁
				BUAppointmentServiceImpl.lock(number_ids);
				JSONArray rows = null;
				try {
					rows = BUServiceUtil.getBUAppointmentService().createAppointment(context.getConnectBean(), deviceId, date, number_ids, exam_id, person_id, person_type);
				} catch (Exception e) {
					e.printStackTrace();
					JSONObject result = new JSONObject();
					result.put("code", "0");
					result.put("desc", e.getMessage());
					context.setPrintOut(result.toString());
				}
				BULockHandler handler = new BULockHandler();
				for (String key : number_ids) {
					handler.addKey(key);
				}
				context.addTransHandler(handler);
				//
				if (rows != null && rows.size() > 0) {
					BUMarkHandler handler2 = new BUMarkHandler();
					handler2.setBill_type("0");
					handler2.setMarkArray(rows);
					context.addTransHandler(handler2);
				}
				BUSmsHandler handSms = new BUSmsHandler();
				handSms.setExamId(exam_id);
				handSms.setIscancelOrSend("1");//发起预约
				context.addTransHandler(handSms);
				
			} else {
				if (msg.size() > 0) {
					JSONObject result = new JSONObject();
					result.put("code", "0");
					result.put("desc", StringUtils.join(msg, "\n"));
					context.setPrintOut(result.toString());
				}
			}
		} else {
			throw new BusiException("当前资源被锁住！请重启应用解锁");
		}

		// 解锁
	}

	/**
	 * 创建锁号
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void createNumberLock(WDKContext context) throws Exception {
		String deviceId = context.getString("device_id");
		String date = context.getString("schedu_dt");
		String locktype = context.getString("locktype");
		String lock_personid = context.getString("lock_personid");
		String unlockdeptid = context.getString("unlockdeptid");
		if (unlockdeptid == null || "".equals(unlockdeptid.trim())) {
			WQLObject wo = _WQL_GetWO("EA_BI_Person");
			ResultBean rb = wo.query("person_id = ?", new String[] { lock_personid }, "person_id", context.getConnectBean());
			if (rb != null && rb.isSuccess()) {
				WQLData wqlData = rb.getWQLData(wo, 0);
				if (wqlData != null) {
					wqlData.first();
					if (wqlData.next()) {
						unlockdeptid = wqlData.getValue("dept_id");
					}
				}
			}
		}
		String lock_reason = context.getString("lock_reason");
		String timePointsStr = context.getString("timePoints");
		JSONArray timePoints = JSONArray.fromObject(timePointsStr);
		BUServiceUtil.getBUAppointmentService().createNumberLock(context.getConnectBean(), timePoints, deviceId, date, locktype, unlockdeptid, lock_personid, lock_reason);
	}

	/**
	 * 取消锁号
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void cancelNumberLock(WDKContext context) throws Exception {
		String lock_id = context.getString("lock_id");
		BUServiceUtil.getBUAppointmentService().cancelNumberLock(context.getConnectBean(), lock_id);
	}

	/**
	 * 创建加号
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void createNumberAdd(WDKContext context) throws Exception {
		JSONObject jo = new JSONObject();
		jo.put("code", "1");
		jo.put("desc", "加号成功！");
		String deviceId = context.getString("device_id");
		String date = context.getString("schedu_dt");
		String addPersonId = context.getString("add_personid");
		String addData = context.getString("add_data");
		if (addData != null && addData.trim().length() > 0) {
			JSONArray rows = JSONArray.fromObject(addData);
			if (rows != null && rows.size() > 0) {
				for (int i = 0; i < rows.size(); i++) {
					JSONObject row = rows.getJSONObject(i);
					String ampm = row.getString("add_ampm");
					try {
						int amCount = row.getInt("add_count");
						String amReason = row.getString("add_reason");
						if (BUAppointmentServiceImpl.isRunning("add_" + deviceId + "_" + date + "_" + ampm)) {
							while (true) {
								Thread.sleep(200);
								if (!BUAppointmentServiceImpl.isRunning("add_" + deviceId + "_" + date + "_" + ampm)) {
									break;
								}
							}
						}
						// 加锁
						BUAppointmentServiceImpl.lock("add_" + deviceId + "_" + date + "_" + ampm);
						BUServiceUtil.getBUAppointmentService().createNumberAdd(context.getConnectBean(), deviceId, date, addPersonId, ampm, amCount, amReason);
					} catch (BusiException e) {
						jo.put("code", "0");
						jo.put("desc", e.getMessage());
						break;
					} finally {
						// 解锁
						BULockHandler handler = new BULockHandler();
						handler.addKey("add_" + deviceId + "_" + date + "_" + ampm);
						context.addTransHandler(handler);
					}
				}
			}
		}
		context.setPrintOut(jo.toString());
	}

	/**
	 * 取消加号
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void cancelNumberAdd(WDKContext context) throws Exception {
		String add_id = context.getString("add_id");
		BUServiceUtil.getBUAppointmentService().cancelNumberAdd(context.getConnectBean(), add_id);
	}

	/**
	 * 取消预约action
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void cancelAppointment(WDKContext context) throws Exception {
		String appt_id = context.getString("appt_id");
		if (appt_id == null || "".equals(appt_id)) {
			throw new Exception("需要取消的预约单的ID不能为空");
		}
		JSONArray rows = BUServiceUtil.getBUAppointmentService().cancelAppointment(context.getConnectBean(), appt_id);
		if (rows != null && rows.size() > 0) {
			BUMarkHandler handler2 = new BUMarkHandler();
			handler2.setMarkArray(rows);
			handler2.setBill_type("0");
			context.addTransHandler(handler2);
			/*代码丢到service里面去，很多ws服务也要调用的
			BUSmsHandler handSms = new BUSmsHandler();
			if(rows!=null && rows.size()>0){
				//handSms.setApptId(appt_id);
				String form_id = rows.getJSONObject(0).getString("form_id");
				handSms.setExamId(form_id);
				handSms.setIscancelOrSend("2");//取消预约
				context.addTransHandler(handSms);
			}*/
			
			
		}
	}

	/**
	 * 测试多数据源的可行性，
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void testOtherDataBase(WDKContext context) throws Exception {
		/*
		 * ResultBean rb = WQL.getWO(WQLNames.UEAHIS0001).process(); if (rb !=
		 * null && rb.isSuccess()) { System.out.println("成功执行异构数据库数据源！！"); }
		 */

		// long aaa = BUServiceUtil.getNextVal("MS_YJ01", 10);
		// System.out.println(aaa);
		// WQL.getWO(WQLNames.QEABIEXAM0001).addParam("flag",
		// "102").addParam("examitem_id",
		// oldJsonObject.getString("examitem_id"));
		ResultBean rb = WQL.getWO(WQLNames.QEABIEXAM0001).addParam("flag", "102").addParam("examitem_id", "111").process(context.getConnectBean());
		context.setPrintOut(rb.getResultJSONArray(0).toString());

	}
	
	public void queryNurseBelongDeptExamList(WDKContext context) throws Exception {
		String examtype_id = context.getString("examtype_id");// 检查类型过滤
		String patient_id = context.getString("patient_id");
		String dept_id = context.getString("dept_id");
		String bed_no = context.getString("bed_no");
		String patient_name = context.getString("patient_name");
		if (dept_id == null || "".equals(dept_id)) {
			// 如果前端界面没给出具体的值，那么就从session获取当前登录人所在病区的ID
			SessionUser su = _getSessionuser(context);
			String _dept_id = su.getDeptuuid();
			dept_id = _dept_id;
		}
		String appt_start_time = context.getString("appt_start_time");// 预约的开始时间
		String appt_end_time = context.getString("appt_end_time");// 预约的结束时间
		
		String start_time = context.getString("date_start");// 开单的开始时间
		String end_time = context.getString("date_end");// 开单的结束时间
		
		String form_status = context.getString("form_status");// 单据状态
		String charge_status = context.getString("charge_status");// 扣费状态
		
		String othersql = "";
		if (patient_id != null && patient_id.trim().length() > 0) {
			if (othersql.length() > 0) {
				othersql += " and ";
			}
			othersql += " patient_id like '%" + patient_id + "%'";
		}
		if (patient_name != null && patient_name.trim().length() > 0) {
			if (othersql.length() > 0) {
				othersql += " and ";
			}
			othersql += " patient_name like '%" + patient_name + "%'";
		}
		if (dept_id != null && dept_id.trim().length() > 0) {
			if (othersql.length() > 0) {
				othersql += " and ";
			}
			othersql += " dept_id = '" + dept_id + "'";
		}
		if (appt_start_time != null && appt_start_time.trim().length() > 0) {
			if (othersql.length() > 0) {
				othersql += " and ";
			}
			othersql += " appt_date >= '" + appt_start_time + "'";
		}
		if (appt_end_time != null && appt_end_time.trim().length() > 0) {
			if (othersql.length() > 0) {
				othersql += " and ";
			}
			othersql += " appt_date <= '" + appt_end_time + "'";
		}
		
		if (start_time != null && start_time.trim().length() > 0) {
			if (othersql.length() > 0) {
				othersql += " and ";
			}
			othersql += " exam_create_dt >= '" + start_time + "'";
		}
		if (end_time != null && end_time.trim().length() > 0) {
			if (othersql.length() > 0) {
				othersql += " and ";
			}
			othersql += " exam_create_dt <= '" + end_time + "'";
		}
		
		if (examtype_id != null && examtype_id.trim().length() > 0) {
			if (othersql.length() > 0) {
				othersql += " and ";
			}
			othersql += " examtype_id = '" + examtype_id + "'";
		}
		if (form_status != null && form_status.trim().length() > 0) {
			if (othersql.length() > 0) {
				othersql += " and ";
			}
			othersql += " form_status = '" + form_status + "'";
		}
		if (charge_status != null && charge_status.trim().length() > 0) {
			if (othersql.length() > 0) {
				othersql += " and ";
			}
			othersql += " charge_status = '" + charge_status + "'";
		}
		if (bed_no != null && bed_no.trim().length() > 0) {
			if (othersql.length() > 0) {
				othersql += " and ";
			}
			othersql += " bed_no like '%" + bed_no + "%'";
		}
		othersql += " and exam_type = '" + BUConstant.PATIENT_SORT_ZY + "'";
		JSONObject rows = BUServiceUtil.getBUAppointmentService().queryAppointmentList(context.getConnectBean(), context.getRequest(), othersql);
		context.setPrintOut(rows.toString());
	}
	

	/**
	 * 根据权限配置，查询本人可以看到的病人的预约单的情况
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void queryAppointmentList(WDKContext context) throws Exception {
		String examtype_id = context.getString("examtype_id");// 检查类型过滤
		if(examtype_id!=null &&examtype_id.startsWith("xxxxxx")){
			JSONObject rs = new JSONObject();
			rs.put("total", 0);
			rs.put("rows", new JSONArray());
			context.setPrintOut(rs.toString());
			return;
		}
		String isSignStr = context.getString("is_sign");// 是否已登记
		String exam_start_time = context.getString("start_time");// 开单的开始时间
		String exam_end_time = context.getString("end_time");// 开单的结束时间
		String patient_id = context.getString("patient_id");
		String patient_code = context.getString("patient_code");
		String patient_name = context.getString("patient_name");
		String is_apptedweb = context.getString("is_appted");
		String dept_id = context.getString("dept_id");
		String appt_start_time = context.getString("appt_start_time");// 开单的开始时间
		String appt_end_time = context.getString("appt_end_time");// 开单的结束时间
		boolean isNotSign = false;
		String is_appted = "";
		if (isSignStr != null && isSignStr.trim().length() > 0) {
			isNotSign = Boolean.parseBoolean(isSignStr);
			is_appted = isNotSign ? "0" : "";
		}
		if (is_apptedweb != null && is_apptedweb.trim().length() > 0) {
			is_appted = is_apptedweb;
		}
		logger.info("本次检查类型的标识为：" + examtype_id);
		StringBuilder othersql = new StringBuilder();
		if (patient_id != null && patient_id.trim().length() > 0) {
			if (othersql.length() > 0) {
				othersql.append(" and ");
			}
			othersql.append(" patient_id like '%" + patient_id + "%'");
		}
		if (patient_code != null && patient_code.trim().length() > 0) {
			if (othersql.length() > 0) {
				othersql.append(" and ");
			}
			othersql.append(" patient_code like '%" + patient_code + "%'");
		}
		if (patient_name != null && patient_name.trim().length() > 0) {
			if (othersql.length() > 0) {
				othersql.append(" and ");
			}
			othersql.append(" patient_name like '%" + patient_name + "%'");
		}
		if (dept_id != null && dept_id.trim().length() > 0) {
			if (othersql.length() > 0) {
				othersql.append(" and ");
			}
			othersql.append(" dept_id = '" + dept_id + "'");
		}
		if (appt_start_time != null && appt_start_time.trim().length() > 0) {
			if (othersql.length() > 0) {
				othersql.append(" and ");
			}
			othersql.append(" appt_date >= '" + appt_start_time + "'");
		}
		if (appt_end_time != null && appt_end_time.trim().length() > 0) {
			if (othersql.length() > 0) {
				othersql.append(" and ");
			}
			othersql.append(" appt_date <= '" + appt_end_time + "'");
		}
		JSONObject rows = BUServiceUtil.getBUAppointmentService().queryAppointmentList(context.getConnectBean(), context.getRequest(), examtype_id, exam_start_time, exam_end_time, is_appted, othersql.toString());
		context.setPrintOut(rows.toString());
	}

	/**
	 * 进行签到,急诊的场景下，是没有预约单的，所以也要支持急诊的签到
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void exeSign(WDKContext context) throws Exception {
		// 从前端获取数据，哪些数据需要签到的
		String apptData = context.getString("_DATA");// [{exam_id,appt_id,room_code},{exam_id,appt_id,room_code}]
		// 映射表[key:检查单ID；value:属于哪个检查房间号]
		Map<String, String> apptRoomMap = new HashMap<String, String>();
		Map<String, String> apptRoomNameMap = new HashMap<String, String>();
		Set<String> examIdList = new HashSet<String>();// 本次涉及的所有检查单列表
		if (apptData != null && apptData.trim().length() > 0) {
			JSONArray rows = JSONArray.fromObject(apptData);
			if (rows != null && rows.size() > 0) {
				for (int i = 0; i < rows.size(); i++) {
					JSONObject jo = rows.getJSONObject(i);// 当前选择的每一个检查单号；
					String examId = jo.getString("exam_id");
					examIdList.add(examId);//
					String roomCode = jo.getString("room_code");
					if (roomCode == null || "".equals(roomCode.trim())) {
						throw new BusiException("签到的时候，检查室号必须选择！");
					}
					String roomName = jo.getString("room_name");
					apptRoomMap.put(examId, roomCode);
					apptRoomNameMap.put(examId, roomName);
				}
			}
		}
		WQLObject wo = WQLObject.getWQLObject("V_EA_BU_Appointment");
		ResultBean rb = wo.query("exam_id in (" + BUServiceUtil.getQuestionMark(examIdList.size()) + ")", examIdList.toArray(new String[examIdList.size()]), "start_point", context.getConnectBean());
		if (rb != null && rb.isSuccess()) {
			JSONArray paramBody = rb.getResultJSONArray(0);
			JSONArray updateArray = new JSONArray();
			for (int i = 0; i < paramBody.size(); i++) {
				JSONObject j0 = paramBody.getJSONObject(i);
				JSONObject updateJo = new JSONObject();
				String isemergency = j0.getString("isemergency");
				if ("1".equals(isemergency)) {
					updateJo.put("remark", apptRoomNameMap.get(j0.getString("exam_id")));// 回写房间号到备注字段中
				}
				updateJo.put("exam_id", j0.getString("exam_id"));
				updateJo.put("sign_status", "1");// 签到中
				updateArray.add(updateJo);
			}
			BUServiceUtil.getBUExamService2().saveExamFormList(context.getConnectBean(), updateArray);
			// 进行签到的预检查
			String personId = "";
			SessionUser sesson = _getSessionuser(context);
			if (sesson != null) {
				personId = sesson.getPersonuuid();
			}
			BUSignHandler action = new BUSignHandler(paramBody, apptRoomMap, personId);
			context.addTransHandler(action);
		}

	}

	/**
	 * 获取当前病人待签到的信息列表
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void queryTodoSignList(WDKContext context) throws Exception {
		SessionUser user = _getSessionuser(context);
		JSONArray rows = new JSONArray();
		String patient_code = context.getString("patient_code");
		String ampm = BUSignQueue.getAM_PM();
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		String today = f.format(new Date());
		WQLObject wo = WQLObject.getWQLObject("V_EA_BU_Appointment");
		String isall = context.getString("isall");
		String exam_ids = context.getString("exam_ids");
		// 门诊的急诊订单在付款后即可进行登记检查
		// 住院订单无需付款，在预约后即可检查，检查的时候扣费
		String whereCondition = " (sign_status IN ('0','3','') Or sign_status is null ) and  patient_code = ?  and ((charge_status = ? and exam_type = ? and ((form_status = ? and  appt_dt = ? and appt_ampm = ?) OR (isemergency='1' and form_status IN (?,?,?) ))) OR (((form_status = ? and  appt_dt = ? and appt_ampm = ?) or (isemergency='1' and form_status IN (?,?,?) )) and exam_type = ?))";
		List<String> examTypeIdlist = BUServiceUtil.getBUAppointmentService().getAuthExamTypeList(context.getConnectBean(), user);
		if (examTypeIdlist != null && examTypeIdlist.size() > 0) {
			whereCondition += " and examtype_id IN ('" + StringUtils.join(examTypeIdlist, "','") + "')";
		}
		String[] arg = new String[] { patient_code, BUConstant.CHARGE_STATUS_s001, BUConstant.PATIENT_SORT_MZ, BUConstant.FORM_STATUS_s003, today, ampm, BUConstant.FORM_STATUS_s001,BUConstant.FORM_STATUS_s003,BUConstant.FORM_STATUS_s004, BUConstant.FORM_STATUS_s003, today, ampm,BUConstant.FORM_STATUS_s001,BUConstant.FORM_STATUS_s003,BUConstant.FORM_STATUS_s004, BUConstant.PATIENT_SORT_ZY };
		if (isall != null && "1".equals(isall)) {
			whereCondition = "";
			arg = new String[] {};
		}

		if (exam_ids != null && exam_ids.trim().length() > 0) {
			// 根据选择的检查单ID过滤数据
			whereCondition = " exam_id IN ('" + exam_ids.replaceAll(",", "','") + "')";
			arg = new String[] {};
		}

		ResultBean rb = wo.query(whereCondition, arg, "start_point", context.getConnectBean());
		if (rb != null && rb.isSuccess()) {
			rows = rb.getResultJSONArray(0);
		}
		context.setPrintOut(rows.toString());
	}

	/**
	 * 查询已签到的清单
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void queryDoneSignList(WDKContext context) throws Exception {
		JSONArray rows = new JSONArray();
		SessionUser user = _getSessionuser(context);
		String patient_code = context.getString("patient_code");
		String ampm = BUSignQueue.getAM_PM();
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		String today = f.format(new Date());
		WQLObject wo = WQLObject.getWQLObject("V_EA_BU_Appointment");
		String exam_ids = context.getString("exam_ids");
		// 门诊的急诊订单在付款后即可进行登记检查
		// 住院订单无需付款，在预约后即可检查，检查的时候扣费
		String whereCondition = " sign_status IN ('1','2') and patient_code = ?  and ((appt_dt = ? and appt_ampm = ?) or isemergency='1')";
		List<String> examTypeIdlist = BUServiceUtil.getBUAppointmentService().getAuthExamTypeList(context.getConnectBean(), user);
		if (examTypeIdlist != null && examTypeIdlist.size() > 0) {
			whereCondition += " and examtype_id IN ('" + StringUtils.join(examTypeIdlist, "','") + "')";
		}
		String[] arg = new String[] { patient_code, today, ampm };
		if (exam_ids != null && exam_ids.trim().length() > 0) {
			// 根据选择的检查单ID过滤数据
			whereCondition = " exam_id IN ('" + exam_ids.replaceAll(",", "','") + "')";
			arg = new String[] {};
		}

		ResultBean rb = wo.query(whereCondition, arg, "start_point", context.getConnectBean());
		if (rb != null && rb.isSuccess()) {
			rows = rb.getResultJSONArray(0);
		}
		context.setPrintOut(rows.toString());
	}

	/**
	 * 获取某设备某天的预约限额和已预约数量
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void getApptLimitNumer(WDKContext context) throws Exception {
		String date = context.getString("date");// 某天
		String deviceId = context.getString("device_id");// 某设备
		JSONObject data = new JSONObject();
		WQLObject wo = WQLObject.getWQLObject("EA_BI_DeviceSchedu");
		// appt_quota
		int total_limit = 0;
		int usedCount = 0;
		ResultBean rb = wo.query("schedu_date = ? and device_id = ?", new String[] { date, deviceId }, "ampm,work_start", context.getConnectBean());
		if (rb != null && rb.isSuccess()) {
			JSONArray limitRows = rb.getResultJSONArray(0);
			if (limitRows != null && limitRows.size() > 0) {
				for (int i = 0; i < limitRows.size(); i++) {
					JSONObject row = limitRows.getJSONObject(i);
					int limit = row.getInt("appt_quota");
					total_limit += limit;
				}
			}
		}
		WQLObject apptWo = WQLObject.getWQLObject("EA_BU_Appointment");
		ResultBean apptRb = apptWo.query(" appt_dt = ? and device_id = ? and status in ('1','2')", new String[] { date, deviceId }, "appt_id", context.getConnectBean());
		if (apptRb != null && apptRb.isSuccess()) {
			usedCount = apptRb.getWQLData(0).getRowCount();
		}
		data.put("total", total_limit);
		data.put("used", usedCount);
		context.setPrintOut(data.toString());
	}

	/**
	 * 获取可使用的检查室列表
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void getCanUseExamRoom(WDKContext context) throws Exception {
		JSONArray list = new JSONArray();
		String examitem_id = context.getString("examitem_id");
		WQLObject wo = WQLObject.getWQLObject("EA_BI_Room");
		StringBuilder whereCondition  = new StringBuilder("status = ?");
		if(examitem_id!=null && examitem_id.trim().length()>0){
			whereCondition.append(" and ROOM_ID IN ");
			whereCondition.append("(SELECT D.ROOM_ID\n");
			whereCondition.append("  FROM EA_BI_DEVICEEXAMITEM R\n");
			whereCondition.append(" INNER JOIN EA_BI_DEVICE D\n");
			whereCondition.append("    ON D.DEVICE_ID = R.DEVICE_ID\n");
			whereCondition.append(" WHERE R.EXAMITEM_ID = '").append(examitem_id).append("'\n");
			whereCondition.append("   AND R.STATUS = '1')");
		}
		ResultBean rb = wo.query(whereCondition.toString(), new String[] { "1" }, "room_name", context.getConnectBean());
		if (rb != null && rb.isSuccess()) {
			WQLData wd = rb.getWQLData(wo, 0);
			if (wd != null) {
				wd.first();
				while (wd.next()) {
					JSONObject ob = new JSONObject();
					ob.put("id", wd.getValue("pacs_room_id"));
					ob.put("text", wd.getValue("room_name"));
					list.add(ob);
				}
			}
		}
		context.setPrintOut(list.toString());
	}
	
	/**
	 * 住院手动扣费
	 * @param context
	 * @throws Exception
	 */
	public void zyManualCharge(WDKContext context) throws Exception {
		JSONObject jo = new JSONObject();
		jo.put("code", "0");
		jo.put("desc", "扣费未处理成功！");
		SessionUser su = _getSessionuser(context);
		String examId = context.getString("exam_id");
		WQLObject wo = WQLObject.getWQLObject("V_EA_BU_Appointment");
		ResultBean rb = wo.query("exam_id  =?", new String[] { examId }, "exam_id", context.getConnectBean());
		if (rb != null && rb.isSuccess()) {
			JSONArray rows = rb.getResultJSONArray(0);
			if (rows != null && rows.size() > 0) {
				new NullPacsAdapter().processZyFee(rows.getJSONObject(0), su.getPersonuuid(), false);
				jo.put("code", "1");
				jo.put("desc", "扣费进行中，请稍后刷新界面查看！");
			}
		}
		context.setPrintOut(jo.toString());
	}
	/**
	 * 仅住院的退费操作，不涉及pacs相关的操作
	 * @param context
	 * @throws Exception
	 */
	public void cancelZYFeeReturn(WDKContext context) throws Exception {
		JSONObject jo = new JSONObject();
		jo.put("code", "0");
		jo.put("desc", "退款未处理成功！");
		String examId = context.getString("exam_id");
		WQLObject wo = WQLObject.getWQLObject("V_EA_BU_Appointment");
		ResultBean rb = wo.query("exam_id  =?", new String[] { examId }, "exam_id", context.getConnectBean());
		if (rb != null && rb.isSuccess()) {
			JSONArray rows = rb.getResultJSONArray(0);
			if (rows != null && rows.size() > 0) {
				JSONObject joSrc = rows.getJSONObject(0);
				BasePaceAdapter dapter = PacsSyncCore.getAdapter(joSrc.getString("examtype_id"));
				boolean isSuccess = dapter.removeBillSync2Pacs(context.getConnectBean(), joSrc);
				if (isSuccess) {
					jo.put("code", "1");
					jo.put("desc", "退款进行中，请稍后刷新界面查看！");
				}
			}
		}
		context.setPrintOut(jo.toString());
	}
	
	/**
	 * 取消签到操作
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void exeCancelSign(WDKContext context) throws Exception {
		JSONObject jo = new JSONObject();
		jo.put("code", "0");
		jo.put("desc", "取消签到失败！");
		String examId = context.getString("exam_id");
		WQLObject wo = WQLObject.getWQLObject("EA_BU_Exam");
		ResultBean rb = wo.query("exam_id  =?", new String[] { examId }, "exam_id", context.getConnectBean());
		if (rb != null && rb.isSuccess()) {
			JSONArray rows = rb.getResultJSONArray(0);
			if (rows != null && rows.size() > 0) {
				JSONObject joSrc = rows.getJSONObject(0);
				BasePaceAdapter dapter = PacsSyncCore.getAdapter(joSrc.getString("examtype_id"));
				boolean isSuccess = dapter.removeBillSync2Pacs(context.getConnectBean(), joSrc);
				if(isSuccess){
					jo.put("code", "1");
					jo.put("desc", "取消签到成功！");
				}
			}
		}
		context.setPrintOut(jo.toString());
	}

	/**
	 * 住院的退费操作
	 * 
	 * @param context
	 * @throws Exception
	 */
	/*
	public void cancelZYFeeReturn(WDKContext context) throws Exception {
		// 1住院系统、2pacs系统、3预约系统
		JSONObject result = new JSONObject();
		result.put("code", "0");
		result.put("desc", "退费失败！");
		final String examId = context.getString("exam_id");
		WQLObject wo = WQLObject.getWQLObject("EA_BU_Exam");
		ResultBean rb = wo.query("exam_id  =?", new String[] { examId }, "exam_id", context.getConnectBean());
		if (rb != null && rb.isSuccess()) {
			WQLData wd = rb.getWQLData(wo, 0);
			if (wd != null) {
				wd.first();
				if (wd.next()) {
					String patient_id = wd.getValue("patient_id");
					String ysdm = wd.getValue("doctor_id");
					String owncharge = wd.getValue("owncharge");
					final String examitem_id = wd.getValue("examitem_id");
					String exam_type = wd.getValue("exam_type");
					String charge_status = wd.getValue("charge_status");
					String form_status = wd.getValue("form_status");
					final String apptId = wd.getValue("appt_id");
					if (!BUConstant.FORM_STATUS_s005.equals(form_status)) {
						result.put("code", "0");
						result.put("desc", "未签到，不允许退费");
					} else {
						boolean isZy = false;
						boolean isToPacs = false;
						if (BUConstant.PATIENT_SORT_ZY.equals(exam_type) && BUConstant.CHARGE_STATUS_s003.equals(charge_status)) {
							// 条件1：住院；条件2：住院已扣费
							isZy = true;
							JSONArray jsonrows = BUServiceUtil.getBUExamService2().getChargeDtlbyExamItem(context.getConnectBean(), examitem_id);
							if (jsonrows != null && jsonrows.size() > 0) {
								String fyjson = jsonrows.toString();
								BUHospitalFee fee = new BUHospitalFee(examId, null, 0, patient_id, fyjson, ysdm, ysdm, owncharge) {
									@Override
									protected void callBack(String feeStatus) {
										Runnable r = new Runnable() {
											@Override
											public void run() {
												ConnectBean conb = null;
												boolean isSuccess = false;
												JSONArray rows = new JSONArray();
												try {
													conb = ConnectBean.getConnectBean();
													conb.beginTransation();
													// 通知pacs进行取消
													BasePaceAdapter adapter = PacsSyncCore.getAdapter(examitem_id);
													isSuccess = adapter.removeBillSync2Pacs(conb, examId, apptId, true, rows);
												} catch (Exception e) {
													e.printStackTrace();
													try {
														logger.error(e);
													} catch (Exception e1) {
													}
													isSuccess = false;
												} finally {
													if (conb != null) {
														if (isSuccess) {
															conb.commitTransation();
															if (rows != null && rows.size() > 0) {
																BUMarkHandler handler2 = new BUMarkHandler();
																handler2.setMarkArray(rows);
																handler2.setBill_type("0");
																try {
																	handler2.transAfter(null, true);
																} catch (Exception e) {
																	e.printStackTrace();
																}
															}
														} else {
															conb.rollbackTransation();
														}
													}
												}
											}
										};
										cachedThreadPool.execute(r);
									}
								};
								// new BUHospitalFee(examId, null, 0,
								// patient_id,
								// fyjson, ysdm, ysdm, owncharge);
								// JSONObject result = exeHisZyExpense(1,
								// patient_id, fyjson, ysdm, personId);
								fee.process();// 进行扣费的处理
								isToPacs = true;
								result.put("code", "1");
								result.put("desc", "退费成功！");
							}
						}
						if (!isZy || !isToPacs) {
							// 门诊或者住院未扣费，直接通知pacs系统即可
							JSONArray inRows = new JSONArray();
							BasePaceAdapter adapter = PacsSyncCore.getAdapter(examitem_id);
							boolean isOk = adapter.removeBillSync2Pacs(context.getConnectBean(), examId, apptId, isZy, inRows);
							if (inRows != null && inRows.size() > 0) {
								BUMarkHandler handler2 = new BUMarkHandler();
								handler2.setMarkArray(inRows);
								handler2.setBill_type("0");
								context.addTransHandler(handler2);
							}
							if (isOk) {
								result.put("code", "1");
								result.put("desc", "退费成功！");
							}
						}
					}
					// 退费成功后通知到PACS系统进行pacs单子的取消操作！
				}
			}
		}
		context.setPrintOut(result.toString());
	}*/
	
	/**
	 * 查询住院病人的检查预约信息，可能有多个检查单
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void queryZyPatientExamInfo(WDKContext context) throws Exception {
		String patientId = context.getString("patient_id");// 住院病人的编码
		String deptId = context.getString("dept_id");// 病区的代码
		JSONObject info = new JSONObject();
		if (patientId != null && patientId.trim().length() > 0) {
			EAPatient ep = EAUtil.queryPatient(patientId, BUConstant.PATIENT_SORT_ZY, "");
			info.put("patient_name", ep.getPatient_name());
			info.put("sexname", ep.getSexname());
			info.put("agename", ep.getAgename());
			info.put("patient_id", patientId);
			info.put("dept_id", deptId);
			ResultBean rb = WQL.getWO(WQLNames.QEABUAPPT0002).addParam("flag", "3").addParam("patient_id", patientId).addParam("dept_id", deptId).process(context.getConnectBean());
			if (rb != null && rb.isSuccess()) {
				JSONArray dtl = rb.getResultJSONArray(0);
				if (dtl != null && dtl.size() > 0) {
					JSONObject jo = dtl.getJSONObject(0);
					info.put("doctor_name", jo.getString("person_name"));
					info.put("bed_no", jo.getString("bed_no"));
					info.put("patient_dept_name", jo.getString("patient_dept_name"));
				}
				info.put("dtl", dtl);
			}
			// info.put("", value);
			// info.put("", value);
		}
		context.setPrintOut(info.toString());
	}

}
