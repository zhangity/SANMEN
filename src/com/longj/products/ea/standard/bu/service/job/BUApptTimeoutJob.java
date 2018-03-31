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
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.products.ea.standard.bu.BUConstant;
import com.longj.products.ea.standard.bu.BUServiceUtil;

/**
 * 开单后，超过24小时，未付款的话，请自动取消申请单（门诊检查单）
 * 
 * @author YuBin
 * 
 */
public class BUApptTimeoutJob extends BaseJob {
	static uLogger logger = new uLogger(BUApptTimeoutJob.class.getName());
	
	public static void main(String[] arg0){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 查询门诊未付费的单子（并且时间超过24小时的）
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, -1);// 时间回到24小时之前
		String oldtime = sdf.format(cal.getTime());
		String sql = "exam_type = '"+BUConstant.PATIENT_SORT_MZ+"' and charge_status ='"+BUConstant.CHARGE_STATUS_s000+"' and createdt<= '"+oldtime+"' and form_status IN ('s001','s003','s004')";
		
		System.out.println(sql);
		
	}

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		ConnectBean conb = null;
		boolean isSuccss = false;
		try {
			conb = ConnectBean.getConnectBean();
			conb.beginTransation();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			WQLObject wo = WQLObject.getWQLObject("EA_BU_Exam");
			// 查询门诊未付费的单子（并且时间超过24小时的）
			Date date = new Date();
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.DATE, -1);// 时间回到24小时之前
			String oldtime = sdf.format(cal.getTime());

			// 查询系统中所有的门诊检查单，1、未付款；2、时间是24小时之前的单子，（不管是否进行了预约）
			ResultBean rb = wo.query("exam_type = ? and charge_status =? and createdt<= ? and form_status IN (?,?,?)", new String[] { BUConstant.PATIENT_SORT_MZ, BUConstant.CHARGE_STATUS_s000, oldtime, BUConstant.FORM_STATUS_s001, BUConstant.FORM_STATUS_s003, BUConstant.FORM_STATUS_s004 }, "createdt", conb);
			if (rb != null && rb.isSuccess()) {
				JSONArray rows = rb.getResultJSONArray(0);
				for (int i = 0; i < rows.size(); i++) {
					JSONObject jo = rows.getJSONObject(i);
					// start
					String appt_id = jo.getString("appt_id");
					String yjxh = jo.getString("yjxh");
					boolean isCanContinue = false;
					if (appt_id != null && appt_id.trim().length() > 0) {
						// 如果进行了预约操作，需要系统先取消及预约操作
						JSONArray result = BUServiceUtil.getBUAppointmentService().cancelAppointment(conb, appt_id);
						if (result != null && result.size() > 0) {
							isCanContinue = true;
						}
					} else {
						isCanContinue = true;
					}
					if (isCanContinue) {
						// 取消检查单本身
						JSONObject _jo = new JSONObject();
						_jo.put("exam_id", jo.getString("exam_id"));
						_jo.put("form_status", BUConstant.FORM_STATUS_s002);
						_jo.put("appt_id", "");
						JSONArray results = BUServiceUtil.getBUExamService().updateExamForm(conb, _jo);
						if (results != null && results.size() > 0) {
							// 取消自己申请单后，通知到HIS系统，进行医技单的删除
							// 调用HIS系统的表结构，进行删除操作
							ResultBean hisDelRb = WQL.getWO("UEAHIS0002").addParam("YJXH", yjxh).process();
							// TODO 需要明确HIS系统是如何作废检查单的，是直接物理删除还是更新状态标记位
							if (hisDelRb != null && hisDelRb.isSuccess()) {
								logger.info("通知HIS系统作废检查单成功!");
							}
						}
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
