package com.longj.products.ea.standard.bu.ws;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.jbpm.api.cmd.Environment;
import org.w3c.dom.Node;
import org.wdk.WDK;
import org.wdk.core.base.BaseWorkFlowWS;
import org.wdk.core.bean.WDKEnvironment;
import org.wdk.core.bean.WDKLogger;
import org.wdk.core.util.uXmlParse;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.products.ea.standard.bu.BUConstant;
import com.longj.products.ea.standard.bu.BUServiceUtil;

public class BUHisResultCallBack extends BaseWorkFlowWS {
	
	private static WDKLogger logger = new WDKLogger(BUHisResultCallBack.class.getName());

	@Override
	public String process(Environment environment, ConnectBean conb, String instr) {
		// 解析类
		String returnStr = "";
		Node root;
		String finalMethod = "";
		try {
			root = uXmlParse.loadxmlString(instr);
			Node methodNode = uXmlParse.findNode(root, "/wdk/app");
			String method = uXmlParse.findAttributeValue(methodNode, "method");
			finalMethod = method;
			Method m = this.getClass().getDeclaredMethod(method, Environment.class, ConnectBean.class, String.class);
			returnStr = (String) m.invoke(this, environment, conb, instr);
		} catch (Exception e) {
			e.printStackTrace();
			returnStr = 
				"<wdk>\n" +
				"  <route method=\"ws.ea.fee.result\" appcode=\"his\" verifycode=\"\"/>\n" + 
				"  <app method=\" "+finalMethod+ "\"/>\n" + 
				"  <data>\n" + 
				"    <respcode>0</respcode>\n" + 
				"    <respdesc>"+e.getMessage()+"</respdesc>\n" + 
				"    <busidata>\n" + 
				"  { code:\"0\", desc:\""+e.getMessage()+"\" }\n" + 
				"    </busidata>\n" + 
				"  </data>\n" + 
				"</wdk>";
		}
		return returnStr;
	}
	
	
	/**
	 * 取消预约的接口
	 * 
	 * @param environment
	 * @param conb
	 * @param instr
	 * @return
	 */
	public String HIS_CANCEL_APPT(Environment environment, ConnectBean conb, String instr) {
		Node root;
		boolean isSuccess = false;
		String desc = "取消预约失败";
		StringBuffer sb = new StringBuffer();
		sb.append("<wdk>\n" + "  <route method=\"ws.ea.fee.result\" appcode=\"his\" verifycode=\"\" />\n").append("  <app method=\" HIS_CANCEL_APPT \"/>\n").append("  <data label=\"服务报文\">\n");
		try {
			root = uXmlParse.loadxmlString(instr);
			String ivkClass = uXmlParse.getTextContents(uXmlParse.findNode(root, "/wdk/data/busidata"));
			logger.info(ivkClass);
			if(ivkClass!=null){
				JSONArray rows = null;
				if(ivkClass.trim().startsWith("[")){
					rows = JSONArray.fromObject(ivkClass.trim());
				}else{
					rows = new JSONArray();
					JSONObject j0 = JSONObject.fromObject(ivkClass);
					rows.add(j0);
				}
				List<String> yjxhList = new ArrayList<String>();
				for(int i=0;i<rows.size();i++){
					JSONObject jo = rows.getJSONObject(i);
					if(jo!=null && jo.containsKey("yjxh")){
						String yjxh = jo.getString("yjxh");
						yjxhList.add(yjxh);
					}
				}
				WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
				if (wdkEnv != null) {
					wdkEnv.getWDKContext().setAttribute("operater", "HIS接口");
				}
				Map<String,String> idMapping = new HashMap<String, String>();
				WQLObject wo = WQLObject.getWQLObject("EA_BU_Exam");
				ResultBean rb = wo.query("yjxh IN ("+BUServiceUtil.getQuestionMark(yjxhList.size())+")", yjxhList.toArray(new String[yjxhList.size()]), "exam_id", conb);
				if (rb != null && rb.isSuccess()) {
					WQLData wfd = rb.getWQLData(wo, 0);
					if (wfd != null) {
						wfd.first();
						HashSet<String> apptIdSet = new HashSet<String>();
						while (wfd.next()) {
							// 获取检查单ID
							String appt_id = wfd.getValue("appt_id");
							if (appt_id == null || "".equals(appt_id.trim())) {
								continue;
							}
							idMapping.put(wfd.getValue("yjxh"), appt_id);
							if(!apptIdSet.contains(appt_id)){
								BUServiceUtil.getBUAppointmentService().cancelAppointment(conb, appt_id);
								apptIdSet.add(appt_id);
							}
						}
						apptIdSet.clear();
						apptIdSet = null;
					}
				}
				
				
				
			}
			isSuccess = true;
			desc = "取消预约成功！";
		} catch (Exception e) {
			e.printStackTrace();
			isSuccess = false;
			desc = e.getMessage();
		} finally {
			String msgcode = isSuccess ? "1" : "0";
			sb.append("    <respcode label=\"是否处理成功  0-失败  1-成功\">" + msgcode + "</respcode>\n" + "    <respdesc label=\"处理结果描述\">" + desc + "</respdesc>\n" + "    <busidata label=\"json格式的返回报文\">\n   {\n" + "      code:\"" + msgcode + "\",\n" + "      desc:\"" + desc + "\"\n" + "    }   </busidata>\n" + "  </data>\n" + "</wdk>");
		}
		return sb.toString();
	}
	
	/**
	 * 根据YJ
	 * @param environment
	 * @param conb
	 * @param instr
	 * @return
	 */
	public String HIS_QUERY_APPT_STSTUS(Environment environment, ConnectBean conb, String instr) {
		Node root;
		boolean isSuccess = false;
		String desc = "查询失败";
		StringBuffer sb = new StringBuffer();
		JSONArray returnArray = new JSONArray();
		sb.append("<wdk>\n" + "  <route method=\"ws.ea.fee.result\" appcode=\"his\" verifycode=\"\" />\n").append("  <app method=\" HIS_QUERY_APPT_STSTUS \"/>\n").append("  <data label=\"服务报文\">\n");
		try {
			root = uXmlParse.loadxmlString(instr);
			String ivkClass = uXmlParse.getTextContents(uXmlParse.findNode(root, "/wdk/data/busidata"));
			logger.info(ivkClass);
			if(ivkClass!=null){
				JSONArray rows = null;
				if(ivkClass.trim().startsWith("[")){
					rows = JSONArray.fromObject(ivkClass.trim());
				}else{
					rows = new JSONArray();
					JSONObject j0 = JSONObject.fromObject(ivkClass);
					rows.add(j0);
				}
				List<String> yjxhList = new ArrayList<String>();
				for(int i=0;i<rows.size();i++){
					JSONObject jo = rows.getJSONObject(i);
					if(jo!=null && jo.containsKey("yjxh")){
						String yjxh = jo.getString("yjxh");
						yjxhList.add(yjxh);
					}
				}
				WQLObject wo = WQLObject.getWQLObject("V_EA_BU_Appointment");
				ResultBean rb = wo.query("yjxh IN ("+BUServiceUtil.getQuestionMark(yjxhList.size())+")", yjxhList.toArray(new String[yjxhList.size()]), "exam_id", conb);
				if (rb != null && rb.isSuccess()) {
					WQLData wfd = rb.getWQLData(wo, 0);
					if (wfd != null) {
						wfd.first();
						while (wfd.next()) {
							// 获取检查单ID是否已预约
							String appt_id =  wfd.getValue("appt_id");
							if(appt_id==null||"".equals(appt_id.trim())){
								continue;
							}
							//String form_status = wfd.getValue("form_status");
							String yjxh = wfd.getValue("yjxh");
							String exam_itemname =  wfd.getValue("examitem_idname");
							String appt_date  =  wfd.getValue("appt_date");
							JSONObject jo = new JSONObject();
							jo.put("yjxh", yjxh);
							jo.put("appt_date", appt_date);
							jo.put("exam_itemname", exam_itemname);
							returnArray.add(jo);
							
						}
					}
				}
				
			}
			isSuccess = true;
			desc = "查询成功！";
		} catch (Exception e) {
			e.printStackTrace();
			isSuccess = false;
			desc = e.getMessage();
		} finally {
			String msgcode = isSuccess ? "1" : "0";
			sb.append("    <respcode label=\"是否处理成功  0-失败  1-成功\">" + msgcode + "</respcode>\n" + "    <respdesc label=\"处理结果描述\">" + desc + "</respdesc>\n" + "    <busidata label=\"json格式的返回报文\">\n"
					+returnArray.toString()+ "    </busidata>\n" + "  </data>\n" + "</wdk>");
		}
		return sb.toString();
	}

	/**
	 * 执行业务方法
	 * 
	 * @param instr
	 * @return
	 */
	public String HIS_STATUS_CALLBACK(Environment environment, ConnectBean conb, String instr) {
		Node root;
		boolean isSuccess = false;
		String desc = "";
		StringBuffer sb = new StringBuffer();
		sb.append("<wdk>\n" + "  <route method=\"ws.ea.fee.result\" appcode=\"his\" verifycode=\"\" />\n").append("  <app method=\" HIS_STATUS_CALLBACK \"/>\n").append("  <data label=\"服务报文\">\n");
		try {
			root = uXmlParse.loadxmlString(instr);
			String ivkClass = uXmlParse.getTextContents(uXmlParse.findNode(root, "/wdk/data/busidata"));
			logger.info(ivkClass);
			if(ivkClass!=null){
				JSONArray rows = null;
				if(ivkClass.trim().startsWith("[")){
					rows = JSONArray.fromObject(ivkClass.trim());
				}else{
					rows = new JSONArray();
					JSONObject j0 = JSONObject.fromObject(ivkClass);
					rows.add(j0);
				}
				List<String> yjxhList = new ArrayList<String>();
				for(int i=0;i<rows.size();i++){
					JSONObject jo = rows.getJSONObject(i);
					if(jo!=null && jo.containsKey("yjxh")){
						String yjxh = jo.getString("yjxh");
						yjxhList.add(yjxh);
					}
				}
				Map<String,String> idMapping = new HashMap<String, String>();
				WQLObject wo = WQLObject.getWQLObject("EA_BU_Exam");
				ResultBean rb = wo.query("yjxh IN ("+BUServiceUtil.getQuestionMark(yjxhList.size())+")", yjxhList.toArray(new String[yjxhList.size()]), "exam_id", conb);
				if (rb != null && rb.isSuccess()) {
					WQLData wfd = rb.getWQLData(wo, 0);
					if (wfd != null) {
						wfd.first();
						while (wfd.next()) {
							// 获取检查单ID
							idMapping.put(wfd.getValue("yjxh"), wfd.getValue("exam_id"));
						}
					}
				}
				JSONArray updateRows = new JSONArray();
				for(int i=0;i<rows.size();i++){
					JSONObject jo = rows.getJSONObject(i);
					String _yjxh = jo.getString("yjxh");
					//String is_cancel_appt = jo.containsKey("is_cancel_appt") ? jo.getString("is_cancel_appt") : "1";
					if(idMapping.containsKey(_yjxh)){
						String updateTime = WDK.getDateTime();
						String charge_status = jo.getString("charge_status");
						if (!BUConstant.CHARGE_STATUS_s001.equals(charge_status)) {
							updateTime = "";// 不是门诊扣费的话，清空扣费时间
						}
						jo.put("exam_id", idMapping.get(_yjxh));
						jo.put("charge_dt", updateTime);
						updateRows.add(jo);
						/*
						String apptId = idMapping2.get(_yjxh);
						if (BUConstant.CHARGE_STATUS_s002.equals(charge_status)) {
							// 门诊退费
							if (apptId != null && apptId.trim().length() > 0) {
								if ("1".equals(is_cancel_appt)) {
									BUServiceUtil.getBUAppointmentService().cancelAppointment(conb, apptId);
								}
							}
						}*/
					}
				}
				JSONArray results = BUServiceUtil.getBUExamService2().saveExamFormList(conb, updateRows);
				if (results != null && results.size() > 0) {
					desc = " 更新记录成功";
					isSuccess = true;
				}
				
			}else{
				desc = "HIS回传的数据集为空！";
				isSuccess = false;
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
