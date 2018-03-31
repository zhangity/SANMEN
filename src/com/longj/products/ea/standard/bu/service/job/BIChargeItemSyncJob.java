package com.longj.products.ea.standard.bu.service.job;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.wdk.core.base.BaseJob;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;
import org.wdk.module.wql.core.db.DBConnection;

/**
 * 每天凌晨定时同步HIS系统的收费项目明细到本系统
 * 
 * @author YuBin
 * 
 */
public class BIChargeItemSyncJob extends BaseJob {

	public static HashMap<String, String> fieldMap = new HashMap<String, String>();

	public static final int pageSize = 100;
	static {
		fieldMap.put("FYXH", "item_id");// 费用序号
		fieldMap.put("FYMC", "item_name");// 费用名称
		fieldMap.put("FYDW", "item_unit");// 费用单位
		fieldMap.put("FYGB", "item_type");// 费用归别
		fieldMap.put("FYDJ", "item_price");
		fieldMap.put("PYDM", "code_py");
		fieldMap.put("WBDM", "code_wb");
		fieldMap.put("JXDM", "code_sj");
		fieldMap.put("QTDM", "code_qt");
		fieldMap.put("MZSY", "mzsy");
		fieldMap.put("ZYSY", "zysy");
		fieldMap.put("YJSY", "yjsy");
		fieldMap.put("ZFPB", "zfpb");

	}

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		Connection conb2 = null;
		ConnectBean conb = null;
		boolean isSuccess = true;
		int count = 0;
		try {
			conb2 = DBConnection.getConnection("HIS");
			conb = ConnectBean.getConnectBean();
			conb.beginTransation();
			WQLObject wo = WQLObject.getWQLObject("EA_BI_ChargeItem");
			wo.delete("1=1", conb);
			ConnectBean conb22 = ConnectBean.getConnectBean(conb2, "HIS");
			ResultBean rb = WQL.getWO("QEAHIS0001").addParam("flag", "2").process(conb22);
			if (rb != null && rb.isSuccess()) {
				WQLData wqlData = rb.getWQLData(0);
				if (wqlData != null) {
					wqlData.first();
					if (wqlData.next()) {
						String countStr = wqlData.getValue("cnt");
						count = Integer.parseInt(countStr);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			isSuccess = false;
		} finally {
			DBConnection.freeConnection(conb2);
			if (conb != null) {
				if (isSuccess) {
					conb.commitTransation();
					if (count > 0) {
						ExecutorService exe = Executors.newFixedThreadPool(10);
						int pageCount = count / pageSize;
						for (int i = 0; i <= pageCount; i++) {
							final int m = i;
							Runnable runable = new Runnable() {
								@Override
								public void run() {
									ConnectBean conb = null;
									Connection conb2 = null;
									try {
										conb2 = DBConnection.getConnection("HIS");
										conb = ConnectBean.getConnectBean();
										conb.beginTransation();
										WQLObject wo = WQLObject.getWQLObject("EA_BI_ChargeItem");
										WQLData wd = new WQLData(wo);
										ConnectBean conb22 = ConnectBean.getConnectBean(conb2, "HIS");
										JSONObject jo = WQL.getWO("QEAHIS0001").addParam("flag", "1").pageQuery(m * pageSize, pageSize * (m + 1), "FYXH", conb22);
										JSONArray currentRows = jo.getJSONArray("rows");
										if (currentRows != null && currentRows.size() > 0) {
											for (int i = 0; i < currentRows.size(); i++) {
												JSONObject _row = currentRows.getJSONObject(i);
												wd.insert();
												Iterator<String> it = fieldMap.keySet().iterator();
												while (it.hasNext()) {
													String hisKey = it.next();
													String examKey = fieldMap.get(hisKey);
													wd.setValue(examKey, _row.getString(hisKey.toLowerCase()));
												}
											}
											wo.insert(wd, conb);
										}
									} catch (Exception e) {
										e.printStackTrace();
										System.out.println(m);
									} finally {
										if (conb != null) {
											conb.commitTransation();
										}
										DBConnection.freeConnection(conb2);
									}
								}
							};
							exe.execute(runable);
						}
					}
				} else {
					conb.rollbackTransation();
				}
			}
		}
	}
}
