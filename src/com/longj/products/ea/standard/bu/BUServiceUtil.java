package com.longj.products.ea.standard.bu;

import java.lang.reflect.Proxy;
import java.util.Calendar;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;

import wql.WQLNames;

import com.longj.products.ea.standard.bu.service.BUAppointmentService;
import com.longj.products.ea.standard.bu.service.BUBaseService;
import com.longj.products.ea.standard.bu.service.BUExamService;
import com.longj.products.ea.standard.bu.service.impl.BUAppointmentServiceImpl;
import com.longj.products.ea.standard.bu.service.impl.BUExamServiceImpl;
import com.longj.products.ea.standard.bu.service.proxy.BUMarkProxy;

/**
 * 检查单和预约单服务工具类
 * 
 * @author YuBin
 * 
 */
public class BUServiceUtil {

	/**
	 * HIS住院扣费接口需要的检验码
	 * 
	 * @return
	 */
	public static String getLiencesNo() {
		// 当前日期的day*8560+1 为检查预约
		Calendar c = Calendar.getInstance();
		int day = c.get(Calendar.DAY_OF_MONTH);
		int value = day * 8560 + 1;
		return String.valueOf(value);
	}

	/**
	 * 获取问号
	 * 
	 * @param count
	 * @return
	 */
	public static String getQuestionMark(int count) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < count; i++) {
			if (sb.length() > 0) {
				sb.append(",");
			}
			sb.append("?");
		}
		return sb.toString();
	}

	public static BUBaseService getBUBaseservice(String primaryKey, String modulename) {
		BUBaseService service = new BUExamServiceImpl(primaryKey, modulename);
		service.set_statusFieldName("");
		return service;
	}

	public static String converterToFirstSpell(String chines) {
		String pinyinName = "";
		char[] nameChar = chines.toCharArray();
		HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
		defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
		defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
		defaultFormat.setVCharType(HanyuPinyinVCharType.WITH_V);
		for (int i = 0; i < nameChar.length; i++) {
			String s = String.valueOf(nameChar[i]);
			if (s.matches("[\\u4e00-\\u9fa5]")) {
				try {
					String[] mPinyinArray = PinyinHelper.toHanyuPinyinStringArray(nameChar[i], defaultFormat);
					pinyinName += mPinyinArray[0].charAt(0);
				} catch (BadHanyuPinyinOutputFormatCombination e) {
					e.printStackTrace();
				}
			} else {
				pinyinName += nameChar[i];
			}
		}
		return pinyinName;
	}

	public static StringBuffer appendWhereCondition(StringBuffer preSql, String newWhereCondition) {

		if (preSql == null) {
			preSql = new StringBuffer();
		}
		if (preSql.length() > 0) {
			preSql.append(" AND ");
		}
		preSql.append(newWhereCondition);

		return preSql;
	}

	/**
	 * 获取通用服务类
	 * 
	 * @param clazz
	 * @return
	 */
	private static BUExamService getBUService(Class clazz) {
		BUExamService service = null;
		try {
			BUExamService target = (BUExamService) clazz.newInstance();
			// ew BUExamServiceImpl();
			BUMarkProxy handler = new BUMarkProxy();
			handler.bind(target);
			service = (BUExamService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} // n
		return service;
	}

	/**
	 * 获取检查单服务
	 * 
	 * @return
	 */
	public static BUExamService getBUExamService() {
		return getBUService(BUExamServiceImpl.class);
	}
	
	/**
	 * 获取检查单服务
	 * 
	 * @return
	 */
	public static BUExamService getBUExamService2() {
		return new BUExamServiceImpl();
	}

	/**
	 * 获取预约单服务
	 * 
	 * @return
	 */
	public static BUAppointmentService getBUAppointmentService() {
		return new BUAppointmentServiceImpl();
	}

	/**
	 * 获取his系统的主键值
	 * 
	 * @return
	 * @throws Exception
	 */
	public synchronized static long getNextVal(String module) throws Exception {
		return getNextVal(module, 1);
	}

	/**
	 * @param module
	 * @param count
	 * @return
	 * @throws Exception
	 */
	public synchronized static long getNextVal(String module, int count) throws Exception {
		String nextVal = "1";
		ResultBean rb = WQL.getWO(WQLNames.UEAHIS0000).addParam("BMC", module).addParam("step", count + "").process();
		if (rb != null && rb.isSuccess()) {
			WQLData wqlData = rb.getWQLData(0);
			if (wqlData != null) {
				wqlData.first();
				if (wqlData.next()) {
					nextVal = wqlData.getValue("DQZ");
				}
			}
		}
		return Long.parseLong(nextVal);
	}

}
