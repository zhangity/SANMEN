package com.longj.products.ea.standard.bu.regular.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.products.ea.standard.bu.regular.BUBaseRegular;

/**
 * 同一个病人{XX检查类型}和{YY检查类型}间隔MM分钟以上<br>
 * 例如：B超和放射要间隔10分钟<br>
 * 例如：B超和胃镜要间隔5分钟<br>
 * 例如：B超和心电图要间隔5分钟
 * 
 * @author YuBin
 * 
 */
public class BUExamTypeInterval extends BUBaseRegular {

	private String xxExamType;

	private String yyExamType;

	private int minute;

	@Override
	public boolean matcher(ConnectBean conb, String patinet_id, String examTypeId, String examCategoryId, Date apptDt) {
		boolean canContinue = true;// 默认都是允许的
		befor();
		String targetExamType = "";
		if (!examTypeId.equals(xxExamType) && !examTypeId.equals(yyExamType)) {
			return canContinue;// 没有匹配到，直接跳出
		}
		if (xxExamType.equals(yyExamType)) {
			return canContinue;// 不在控制范围，直接跳出
		}
		if (examTypeId.equals(xxExamType)) {
			targetExamType = yyExamType;
		} else {
			targetExamType = xxExamType;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		WQLObject wo = WQLObject.getWQLObject("V_EA_BU_Appointment");
		Calendar cal = Calendar.getInstance();
		cal.setTime(apptDt);
		cal.add(Calendar.MINUTE, minute * -1);
		String start = sdf.format(cal.getTime());
		cal.setTime(apptDt);
		cal.add(Calendar.MINUTE, minute);
		String end = sdf.format(cal.getTime());
		ResultBean rb = wo.query("appt_date>=? and appt_date<= ? and patient_id = ? and examtype_id = ? ", new String[] { start, end, patinet_id, targetExamType }, "exam_id", conb);
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
		if (params != null && params.size() > 0) {
			xxExamType = params.getString("XX");
			yyExamType = params.getString("YY");
			minute = params.getInt("MM");
		}
	}

}
