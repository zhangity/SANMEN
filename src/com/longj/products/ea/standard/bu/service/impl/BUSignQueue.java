package com.longj.products.ea.standard.bu.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.products.ea.standard.bu.BUConstant;
import com.longj.products.ea.standard.bu.service.bean.Queue;

@Deprecated
public class BUSignQueue {

	public static Map<String, List<Queue>> examQueueMap = new HashMap<String, List<Queue>>();

	private static Map<Integer, String> ampmMap = new HashMap<Integer, String>();

	static {
		ampmMap.put(0, BUConstant.AMPM_AM);
		ampmMap.put(1, BUConstant.AMPM_PM);
	}

	/**
	 * 获取上午还是下午的标识
	 * 
	 * @return
	 */
	public static String getAM_PM() {
		GregorianCalendar ca = new GregorianCalendar();
		return ampmMap.get(ca.get(GregorianCalendar.AM_PM));
	}

	public static void resetQueue(String deviceId) {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		String today = f.format(new Date());
		String ampm = getAM_PM();

		ConnectBean conb = null;
		boolean isSuccess = false;
		try {
			conb = ConnectBean.getConnectBean();
			conb.beginTransation();
			WQLObject wo = WQLObject.getWQLObject("V_EA_BU_Appointment");
			ResultBean rb = wo.query("form_status IN (?,?) AND appt_dt = ? and appt_ampm = ? and device_id_ = ?", new String[] { BUConstant.FORM_STATUS_s005, BUConstant.FORM_STATUS_s006, today, ampm, deviceId }, "device_id,start_section,signdt", conb);
			// 按照设备、时间段、签到时间排序
			if (rb != null && rb.isSuccess()) {
				WQLData dataSet = rb.getWQLData(wo, 0);
				if (dataSet != null) {
					List<Queue> queueList = new LinkedList<Queue>();
					dataSet.first();
					while (dataSet.next()) {
						Queue qu = new Queue();
						qu.setAppt_id(dataSet.getValue("appt_id"));
						qu.setPatient_id(dataSet.getValue("patient_id"));
						qu.setPatient_name(dataSet.getValue("patient_name"));
						queueList.add(qu);
					}
					examQueueMap.put(deviceId, queueList);
				}
			}
			isSuccess = true;
		} catch (Exception e) {

			isSuccess = false;
		} finally {
			if (conb != null) {
				if (isSuccess) {
					conb.commitTransation();
				} else {
					conb.rollbackTransation();
				}
			}
		}

	}

	/**
	 * 初始化每个设备的排队序号
	 * 
	 */
	public static void init() {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		String today = f.format(new Date());
		String ampm = getAM_PM();

		ConnectBean conb = null;
		boolean isSuccess = false;
		try {
			conb = ConnectBean.getConnectBean();
			conb.beginTransation();
			WQLObject wo = WQLObject.getWQLObject("V_EA_BU_Appointment");
			ResultBean rb = wo.query("form_status IN (?,?) AND appt_dt = ? and appt_ampm = ?", new String[] { "s005", "s006", today, ampm }, "device_id,start_section,signdt", conb);
			// 按照设备、时间段、签到时间排序
			if (rb != null && rb.isSuccess()) {
				WQLData dataSet = rb.getWQLData(wo, 0);
				if (dataSet != null) {
					dataSet.first();
					while (dataSet.next()) {
						String deviceId = dataSet.getValue("device_id_");
						List<Queue> queueList = null;
						if (examQueueMap.containsKey(deviceId)) {
							queueList = examQueueMap.get(deviceId);
						} else {
							queueList = new LinkedList<Queue>();
						}
						Queue qu = new Queue();
						qu.setAppt_id(dataSet.getValue("appt_id"));
						qu.setPatient_id(dataSet.getValue("patient_id"));
						qu.setPatient_name(dataSet.getValue("patient_name"));
						queueList.add(qu);
						examQueueMap.put(deviceId, queueList);
					}
				}
			}
			isSuccess = true;
		} catch (Exception e) {

			isSuccess = false;
		} finally {
			if (conb != null) {
				if (isSuccess) {
					conb.commitTransation();
				} else {
					conb.rollbackTransation();
				}
			}
		}

	}

	/**
	 * 获取预约单的排队序号
	 * 
	 * @param conb
	 * @param appt_id
	 * @return
	 * @throws Exception
	 */
	public static String getQueueNumber(ConnectBean conb, String appt_id) throws Exception {
		String numberStr = "";
		SimpleDateFormat f = new SimpleDateFormat("ddHHmm");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		WQLObject wo = WQLObject.getWQLObject("V_EA_BU_Appointment");
		ResultBean rb = wo.query("appt_id = ?", new String[] { appt_id }, "appt_id", conb);
		if (rb != null && rb.isSuccess()) {
			JSONArray rows = rb.getResultJSONArray(0);
			if (rows != null && rows.size() > 0) {
				JSONObject jo = rows.getJSONObject(0);
				String roomCode = jo.getString("room_name");
				String dt = jo.getString("appt_dt");
				String time = jo.getString("start_point");
				Date date = format.parse(dt + " " + time + ":00");
				numberStr = roomCode + f.format(date);
			}
		}
		return numberStr;
	}

}
