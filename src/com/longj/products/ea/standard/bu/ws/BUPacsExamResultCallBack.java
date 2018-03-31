package com.longj.products.ea.standard.bu.ws;

import java.lang.reflect.Method;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.jbpm.api.cmd.Environment;
import org.w3c.dom.Node;
import org.wdk.core.base.BaseWorkFlowWS;
import org.wdk.core.bean.WDKLogger;
import org.wdk.core.util.uXmlParse;
import org.wdk.module.wql.core.bean.ConnectBean;

import com.longj.products.ea.standard.bu.BUServiceUtil;

/**
 * pacs系统在
 * @author YuBin
 *
 */
public class BUPacsExamResultCallBack extends BaseWorkFlowWS {

	private static WDKLogger logger = new WDKLogger(BUHisResultCallBack.class.getName());

	@Override
	public String process(Environment environment, ConnectBean conb, String instr) {
		// 解析类
		String returnStr = "";
		Node root;
		try {
			root = uXmlParse.loadxmlString(instr);
			Node methodNode = uXmlParse.findNode(root, "/wdk/app");
			String method = uXmlParse.findAttributeValue(methodNode, "method");
			Method m = this.getClass().getDeclaredMethod(method, Environment.class, ConnectBean.class, String.class);
			returnStr = (String) m.invoke(this, environment, conb, instr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnStr;
	}

	/**
	 * 执行业务方法
	 * 
	 * @param instr
	 * @return
	 */
	public String PACS_STATUS_CALLBACK(Environment environment, ConnectBean conb, String instr) {
		Node root;
		boolean isSuccess = false;
		String desc = "";
		StringBuffer sb = new StringBuffer();
		sb.append("<wdk>\n" + "  <route method=\"ws.ea.check.result\" appcode=\"pacs\" verifycode=\"\" />\n").append("  <app method=\" PACS_STATUS_CALLBACK \"/>\n").append("  <data label=\"服务报文\">\n");
		try {
			root = uXmlParse.loadxmlString(instr);
			String ivkClass = uXmlParse.getTextContents(uXmlParse.findNode(root, "/wdk/data/busidata"));
			logger.info(ivkClass);
			JSONObject jo = JSONObject.fromObject(ivkClass);
			String exam_id = jo.getString("appt_id");
			jo.put("exam_id", exam_id);
			JSONArray results = BUServiceUtil.getBUExamService().updateExamForm(conb, jo);
			if (results != null && results.size() > 0) {
				desc = " 更新记录成功";
				isSuccess = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			isSuccess = false;
			desc = e.getMessage();
		} finally {
			String msgcode = isSuccess ? "1" : "0";
			sb.append("    <respcode label=\"是否处理成功  0-失败  1-成功\">" + msgcode + "</respcode>\n" + "    <respdesc label=\"处理结果描述\">" + desc + "</respdesc>\n" + "    <busidata label=\"json格式的返回报文\">\n" + "    {\n" + "      code:\"" + msgcode + "\",\n" + "      desc:\"" + desc + "\"\n" + "    }\n"
					+ "    </busidata>\n" + "  </data>\n" + "</wdk>");
		}
		return sb.toString();
	}

}
