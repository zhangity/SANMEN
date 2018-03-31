package com.longj.products.ea.standard.bu.service.proxy;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.wdk.core.bean.WDKTransationHandler;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.products.ea.standard.bu.service.impl.BUExamSerial;

public class BUSerialHandler implements WDKTransationHandler {

	@Override
	public void transAfter(ConnectBean conb, boolean isSuccess) throws Exception {
		if (isSuccess) {
			WQLObject wo = WQLObject.getWQLObject("EA_BU_Serial");
			SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
			String now = sdf.format(new Date());
			synchronized (BUExamSerial.serialValueMap) {
				if (BUExamSerial.serialValueMap != null && BUExamSerial.serialValueMap.size() > 0) {
					Iterator<String> it = BUExamSerial.serialValueMap.keySet().iterator();
					List<String> yyMMddList = new ArrayList<String>();
					WQLData fromDataSet = new WQLData(wo);
					while (it.hasNext()) {
						fromDataSet.insert();
						String yyMMdd = it.next();
						fromDataSet.setValue("yymmdd", yyMMdd);
						Integer val = BUExamSerial.serialValueMap.get(yyMMdd);
						fromDataSet.setValue("current_val", val + "");
						yyMMddList.add(yyMMdd);
					}
					String ids = StringUtils.join(yyMMddList, "','");
					ResultBean rb = wo.query("yymmdd IN ('" + ids + "')", null, "yymmdd", conb);
					if (rb != null && rb.isSuccess()) {
						WQLData toDataSet = rb.getWQLData(wo, 0);
						List<String> columnNames = toDataSet.getColumnNames();
						toDataSet.first();
						fromDataSet.first();
						while (fromDataSet.next()) {
							if (toDataSet.locate(fromDataSet)) {
								// 更新
								toDataSet.edit();// 设置修改标志
							} else {
								// 新增
								toDataSet.insert();// 设置新增标志
							}
							// 设置各字段值
							for (int index = 0; index < columnNames.size(); index++) {
								String columnName = columnNames.get(index);
								toDataSet.setValue(columnName, fromDataSet.getValue(columnName));
							}
						}
						ResultBean updateRb = wo.updateAll(toDataSet, conb);
						if (updateRb != null && updateRb.isSuccess()) {
							Integer vvv = BUExamSerial.serialValueMap.get(now);
							BUExamSerial.serialValueMap.clear();
							// 只保留今天的
							BUExamSerial.serialValueMap.put(now, vvv);
						}
					}
				}
			}
		}
	}

}
