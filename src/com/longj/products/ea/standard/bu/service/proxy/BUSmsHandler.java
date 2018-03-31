package com.longj.products.ea.standard.bu.service.proxy;

import net.sf.json.JSONArray;

import org.wdk.core.bean.WDKLogger;
import org.wdk.core.bean.WDKTransationHandler;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;

import wql.WQLNames;

import com.longj.platform.pb.msg.MSG;

public class BUSmsHandler implements WDKTransationHandler {
	private static WDKLogger logger = new WDKLogger(BUSmsHandler.class.getName());// 日志操作类

	private String examId;

	private String apptId;

	public String getApptId() {
		return apptId;
	}

	public void setApptId(String apptId) {
		this.apptId = apptId;
	}

	private String iscancelOrSend;

	public String getExamId() {
		return examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
	}

	public String getIscancelOrSend() {
		return iscancelOrSend;
	}

	public void setIscancelOrSend(String iscancelOrSend) {
		this.iscancelOrSend = iscancelOrSend;
	}

	@Override
	public void transAfter(ConnectBean conb, boolean isSuccess) throws Exception {
		if (isSuccess) {
			if ((apptId == null || "".equals(apptId)) && (examId == null || "".equals(examId))) {
				return;
			}
			ResultBean br = WQL.getWO(WQLNames.QEABUEXAM0003).addParam("flag", "4").addParam("exam_id", examId).addParam("appt_id", apptId).process(conb);
			if (br != null && br.isSuccess()) {
				JSONArray jrows = br.getResultJSONArray(0);
				if (jrows != null && jrows.size() > 0) {
					MSG.sendSms4Smyy(jrows.getJSONObject(0), iscancelOrSend);
					logger.info("BUSmsHandler：信息发送完成");
				}
			}

		}
	}

}
