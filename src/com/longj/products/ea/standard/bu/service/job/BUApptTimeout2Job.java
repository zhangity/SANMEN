package com.longj.products.ea.standard.bu.service.job;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.wdk.core.base.BaseJob;
import org.wdk.core.util.uLogger;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.products.ea.standard.bu.BUConstant;
import com.longj.products.ea.standard.bu.BUServiceUtil;

/**
 * 未付款的门诊订单，如果在预约时间前半小时，未付款的话，自动取消预约（不删除订单）
 * 
 * @author YuBin
 * 
 */
public class BUApptTimeout2Job extends BaseJob {
	static uLogger logger = new uLogger(BUApptTimeout2Job.class.getName());
	

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		ConnectBean conb = null;
		boolean isSuccss = false;
		try {
			conb = ConnectBean.getConnectBean();
			conb.beginTransation();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			WQLObject wo = WQLObject.getWQLObject("V_EA_BU_Appointment");
			// 查询门诊未付费的单
			Date date = new Date();
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.MINUTE, 30);// 当前时间，增加30分钟
			String oldtime = sdf.format(cal.getTime());

			// 查询系统中所有的[门诊]检查单，1、未付款（含退款）；2、预约时间超当前之后的半小时
			ResultBean rb = wo.query("appt_id is not null and exam_type = ? and charge_status IN (?,?) and appt_date<= ? and form_status = ?", new String[] { BUConstant.PATIENT_SORT_MZ, BUConstant.CHARGE_STATUS_s000, BUConstant.CHARGE_STATUS_s002, oldtime, BUConstant.FORM_STATUS_s003 }, "createdt", conb);
			if (rb != null && rb.isSuccess()) {
				JSONArray rows = rb.getResultJSONArray(0);
				for (int i = 0; i < rows.size(); i++) {
					JSONObject jo = rows.getJSONObject(i);
					// start
					String appt_id = jo.getString("appt_id");
					if (appt_id != null && appt_id.trim().length() > 0) {
						// 如果进行了预约操作，需要系统先取消及预约操作
						BUServiceUtil.getBUAppointmentService().cancelAppointment(conb, appt_id);
					}
					// end
				}
			}
			isSuccss = true;
		} catch (Exception e) {
			e.printStackTrace();
			logger.errorWithNoException(e.getMessage());
			isSuccss = false;
		} finally {
			if (conb != null) {
				if (isSuccss) {
					conb.commitTransation();
				} else {
					conb.rollbackTransation();
				}
				conb = null;
			}
		}

	}

}
