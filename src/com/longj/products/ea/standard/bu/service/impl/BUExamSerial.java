package com.longj.products.ea.standard.bu.service.impl;

import java.util.HashMap;

import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;

/**
 * 申请单号生成工具
 * 
 * @author YuBin
 * 
 */
public class BUExamSerial {

	public static HashMap<String, Integer> serialValueMap = new HashMap<String, Integer>();

	/**
	 * 获取下一序列的值
	 * 
	 * @param examTypeCode
	 * @param yyMMdd
	 * @param MZorZY
	 * @return
	 */
	public static String getNextSequenceVal(ConnectBean conb, String examTypeCode, String yyMMdd, String MZorZY) {
		if (yyMMdd == null || "".equals(yyMMdd.trim())) {
			return "";
		}
		synchronized (serialValueMap) {
			int oldVal = 0;
			String formatStr = "%03d";// 不足3位数字，前面补0；
			if (serialValueMap.containsKey(yyMMdd)) {
				// 默认都是从内容中获取，如果系统重启后就从数据库获取
				oldVal = serialValueMap.get(yyMMdd);
			} else {
				// 从表里面获取一把，能拿到就
				WQLObject wo = WQLObject.getWQLObject("EA_BU_Serial");

				ResultBean rb = wo.query("yyMMdd = ?", new String[] { yyMMdd }, "yymmdd", conb);
				if (rb != null && rb.isSuccess()) {
					WQLData wqlData = rb.getWQLData(wo, 0);
					if (wqlData != null) {
						wqlData.first();
						if (wqlData.next()) {
							try {
								String val = wqlData.getValue("current_val");
								if (val != null && val.trim().length() > 0) {
									oldVal = Integer.parseInt(val);
								}
							} catch (Exception e) {
							}
						}
					}
				}
			}
			int nextVal = oldVal + 1;
			String nextStr = "";
			if (nextVal > 999) {
				// 如果当日的流水大于999了，那么不需要补齐0了
				nextStr = String.valueOf(nextVal);
			}else{
				nextStr = String.format(formatStr, nextVal);
			}
			serialValueMap.put(yyMMdd, nextVal);
			return examTypeCode + yyMMdd + nextStr + MZorZY;
		}
	}

}
