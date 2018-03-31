package com.longj.products.ea.standard.bu.service.proxy;

import org.wdk.core.bean.WDKLogger;
import org.wdk.core.bean.WDKTransationHandler;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;

public class BUSyncHisCancelHandler implements WDKTransationHandler {
	private static WDKLogger logger = new WDKLogger(BUSyncHisCancelHandler.class.getName());// 日志操作类

	String exam_id;



	public String getExam_id() {
		return exam_id;
	}



	public void setExam_id(String exam_id) {
		this.exam_id = exam_id;
	}



	@Override
	public void transAfter(ConnectBean conb, boolean isSuccess) throws Exception {
		if (isSuccess) {
			WQLObject wobject = WQLObject.getWQLObject("EA_BU_Exam");
			ResultBean rb = wobject.query("exam_id =?", new String[] { exam_id }, "exam_id", conb);
			if (rb != null && rb.isSuccess()) {
				WQLData wd = rb.getWQLData(wobject, 0);
				if (wd != null) {
					wd.first();
					if (wd.next()) {
						String yjxh = wd.getValue("yjxh");
						if (yjxh != null && yjxh.trim().length() > 0) {
							WQL.getWO("UEAHIS0002").addParam("YJXH", yjxh).process();
							logger.debug("成功通知HIS删除");
						}
					}
				}
			}
		}
	}
}
