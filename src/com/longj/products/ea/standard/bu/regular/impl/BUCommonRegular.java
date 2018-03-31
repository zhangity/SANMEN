package com.longj.products.ea.standard.bu.regular.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.products.ea.standard.bu.regular.BUBaseRegular;

/**
 * 通用的规则： 同一个病人、同时间点{xxyyzz检查类型}不能一起做 例如：所有的检查类型，包括本身不能一起做
 * 
 * @author YuBin
 * 
 */
public class BUCommonRegular extends BUBaseRegular {

	private int minute = 1;// 默认1分钟之内，都算同一个时间

	@Override
	public boolean matcher(ConnectBean conb, String patinet_id, String examTypeId, String examCategoryId, Date apptDt) {
		boolean canContinue = true;// 默认都是允许的
		befor();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

		WQLObject wo = WQLObject.getWQLObject("V_EA_BU_Appointment");
		Calendar cal = Calendar.getInstance();
		cal.setTime(apptDt);
		cal.add(Calendar.MINUTE, minute * -1);

		String start = sdf.format(cal.getTime());
		cal.setTime(apptDt);
		cal.add(Calendar.MINUTE, minute);
		String end = sdf.format(cal.getTime());
		ResultBean rb = wo.query("appt_date>=? and appt_date<= ? and patient_id = ? ", new String[] { start, end, patinet_id }, "exam_id", conb);
		if (rb != null && rb.isSuccess()) {
			int count = rb.getWQLData(0).getRowCount();
			if (count > 0) {
				canContinue = false;// 验证失败，不能继续
			}
		}
		return canContinue;
	}

	@Override
	public void befor() {
		// TODO Auto-generated method stub

		if (params != null && params.size() > 0) {
			this.minute = params.containsKey("MM") ? params.getInt("MM") : 1;
		}

	}

}
