package com.longj.products.ea.standard.bu.regular.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.products.ea.standard.bu.regular.BUBaseRegular;

/**
 * 同一个病人{xxyyzz检查分类}必须在{MM检查分类}之后{HH}小时以上<br>
 * 例如：【胃镜、肠镜、消化道钡餐】必须在【肝胆脾B超】之后24H以上<br>
 * 例如：【心脏B超、肝胆脾B超、磁共振、胸腹部CT】必须在【24小时动态心电图】之后24H以上
 * 
 * @author YuBin
 * 
 */
public class BUExamCategoryAfter extends BUBaseRegular {

	private String multiExamCategory;// 多个分类

	private String singleExamCategory;// 单个分类

	private int hours;// 小时

	@Override
	public boolean matcher(ConnectBean conb, String patinet_id, String examTypeId, String examCategoryId, Date apptDt) {
		boolean canContinue = true;// 默认都是允许的
		befor();
		String direction = "0";// 默认不比较
		if (singleExamCategory.indexOf(examCategoryId) > -1) {
			direction = "2";// 反向比较，要比较的类型在单个分类里
		} else if (multiExamCategory.indexOf(examCategoryId) > -1) {
			direction = "1";// 正向比较，要比较的类型在多个分类里
		}

		// 如果方向是默认，则
		if ("0".equals(direction)) {
			return canContinue;
		}

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

		WQLObject wo = WQLObject.getWQLObject("V_EA_BU_Appointment");
		Calendar cal = Calendar.getInstance();
		cal.setTime(apptDt);
		if ("1".equals(direction)) {
			cal.add(Calendar.HOUR, hours * (-1));
			String start = sdf.format(cal.getTime());
			String end = sdf.format(apptDt);
			ResultBean rb = wo.query("appt_date>=? and appt_date<= ? and patient_id = ? and examitem_id IN (select t9.examcate_id from EA_BI_ExamItem t9 where t9.examcate_id = ?)", new String[] { start, end, patinet_id, singleExamCategory }, "exam_id", conb);
			if (rb != null && rb.isSuccess()) {
				int count = rb.getWQLData(0).getRowCount();
				if (count > 0) {
					canContinue = false;// 验证失败，不能继续
				}
			}
		} else if ("2".equals(direction)) {
			cal.add(Calendar.HOUR, hours);
			String start = sdf.format(apptDt);
			String end = sdf.format(cal.getTime());
			String whereSql = "'" + multiExamCategory.replaceAll(",", "','") + "'";
			ResultBean rb = wo.query("appt_date>=? and appt_date<= ? and patient_id = ? and examitem_id IN (select t9.examcate_id from EA_BI_ExamItem t9 where t9.examcate_id IN (" + whereSql + "))", new String[] { start, end, patinet_id }, "exam_id", conb);
			if (rb != null && rb.isSuccess()) {
				int count = rb.getWQLData(0).getRowCount();
				if (count > 0) {
					canContinue = false;// 验证失败，不能继续
				}
			}

		}

		return canContinue;
	}

	@Override
	public void befor() {
		if (params != null && params.size() > 0) {
			multiExamCategory = params.getString("xxyyzz");
			singleExamCategory = params.getString("MM");
			hours = params.getInt("HH");
		}
	}

}
