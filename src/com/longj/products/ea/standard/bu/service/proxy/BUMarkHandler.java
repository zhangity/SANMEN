package com.longj.products.ea.standard.bu.service.proxy;

import java.util.Iterator;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.WDK;
import org.wdk.core.base.BaseSessionUser;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKEnvironment;
import org.wdk.core.bean.WDKLogger;
import org.wdk.core.bean.WDKTransationHandler;
import org.wdk.core.session.SessionManager;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLDataField;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.platform.busi.wdk.handler.WDKLogin;

public class BUMarkHandler implements WDKTransationHandler {
	private static WDKLogger logger = new WDKLogger(
			BUMarkHandler.class.getName());// 日志操作类
	private static String MARK_WQL_OBJECT = "EA_BU_Mark";// 单据变更痕迹表(数据模型)

	private JSONArray markArray = new JSONArray();// 所有需要处理的痕迹信息（待处理）

	private String bill_type;// 单据类型，检查单还是预约单

	public String getBill_type() {
		return bill_type;
	}

	public void setBill_type(String bill_type) {
		this.bill_type = bill_type;
	}

	public JSONArray getMarkArray() {
		return markArray;
	}

	public void setMarkArray(JSONArray markArray) {
		this.markArray = markArray;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void transAfter(ConnectBean conb, boolean isSuccess)
			throws Exception {
		if (markArray != null && markArray.size() > 0) {
			WQLObject wo = WQLObject.getWQLObject(MARK_WQL_OBJECT);
			if (wo != null) {
				WDKEnvironment wdkEnv = WDKEnvironment
						.getCurrentWDKEnvironment();// 获取当前线程内的WDK环境
				WDKContext context = wdkEnv == null ? null : wdkEnv
						.getWDKContext();// 从当前WDK环境获取WDK上下文
				WQLData dateset = new WQLData(wo);
				Map<String, WQLDataField> fieldMap = wo.getFieldMap();
				for (int i = 0; i < markArray.size(); i++) {
					JSONObject mark = markArray.getJSONObject(i);
					Iterator<String> it =  mark.keys();
					dateset.insert();
					// 主键设置为uuid
					dateset.setValue("mark_id", WDK.getUUID());
					// 创建日期
					dateset.setValue("createdt", WDK.getDateTime());
					// 处理结果
					dateset.setValue("oper_result", isSuccess ? "1" : "0");
					boolean isProcessPerson = false;
					if (context != null) {
						// 获取session对象
						try {
							BaseSessionUser sessionUser = SessionManager
									.getSession(context.getRequest(),
											context.getResponse());
							if (sessionUser != null) {
								// 设置处理人UUID
								dateset.setValue("person_id",
										sessionUser.getUserid());
								isProcessPerson = true;
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					if (!isProcessPerson) {
						String name = context == null ? "系统" : (String) context.getAttribute("operater");
						dateset.setValue("person_id", name);
					}
					while (it.hasNext()) {
						String key = it.next();
						String value = mark.getString(key);
						if (fieldMap.containsKey(key.toUpperCase())) {
							// JSON对象内容复制到data对象
							dateset.setValue(key, value);
						}
					}
					if (bill_type != null && bill_type.trim().length() > 0) {
						// 保存单据类型
						dateset.setValue("form_type", bill_type);
					}
					if (fieldMap.containsKey("oper_ip".toUpperCase())) {
						if (context != null && context.getRequest() != null) {
							// 操作人的IP地址信息
							dateset.setValue("oper_ip", WDKLogin.getRemoteHost(context.getRequest()));
						}
					}
				}
				ResultBean rb = wo.insert(dateset, conb);
				if (rb != null && rb.isSuccess()) {
					logger.info("EA_BU_Mark数据插入成功！");
				} else {
					logger.info("EA_BU_Mark数据插入失败！");
				}
			}
		}
	}

}
