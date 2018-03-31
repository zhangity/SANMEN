package com.longj.platform.busi.wdk.mq;


import java.util.ArrayList;
import java.util.HashMap;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.jbpm.api.cmd.Environment;
import org.wdk.WDK;
import org.wdk.core.base.WorkFlowAction;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.core.util.Base64;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLObject;


import wql.WQLNames;


public class MQServerAction extends WorkFlowAction{
	private static WDKLogger logger = new WDKLogger(MQServerAction.class.getName());
	
	/**
	 * 列表
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public boolean list(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
		JSONObject jrows = new JSONObject();
		try{
			jrows = WQL.getWO(WQLNames.QWDKMQ0001)
							.addParam("isactive", "1")
							.pageQuery(request, "server_code", conb);
//			if(rb.isSuccess()==false){
//				StringBuffer sf = new StringBuffer();
//				ArrayList errlist = rb.getInfoError();
//				for(int i=0;i<errlist.size();i++){
//					ErrorBean errBean = (ErrorBean)errlist.get(i);
//					sf.append(errBean.toString());
//					sf.append("\n");
//				}
//				throw new Exception(sf.toString());
//			}
//			jrows = rb.pageResult();		
		}catch (Exception e) {
			//如何向前台发送错误信息？
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		_PRINT(request, response, jrows.toString());
		return true;
	}
	
	
	public boolean ccsid_list(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
		JSONArray jrows = new JSONArray();
		try{
			JSONObject row = new JSONObject();
			row.put("id", "1381");
			row.put("text", "GBK");
			jrows.add(row);
			row = new JSONObject();
			row.put("id", "1208");
			row.put("text", "UTF");
			jrows.add(row);
			
			jrows = WDK.DataFormat_Combox(jrows, "id", "text");
			
		}catch (Exception e) {
			//如何向前台发送错误信息？
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		_PRINT(request, response, jrows.toString());
		return true;
	}
	
	
	/**
	 * MQ服务信息
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @return
	 * @throws Exception
	 */
	public boolean info(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
		JSONObject jrows = null;
		try{
			String server_uuid = _getParameter("server_uuid", request, response);
			
			ResultBean rb = WQL.getWO(WQLNames.QWDKMQ0001)
								.addParam("server_uuid", server_uuid)
								.process(conb);
			if(rb.isSuccess()==false){
				StringBuffer sf = new StringBuffer();
				ArrayList errlist = rb.getInfoError();
				for(int i=0;i<errlist.size();i++){
					ErrorBean errBean = (ErrorBean)errlist.get(i);
					sf.append(errBean.toString());
					sf.append("\n");
				}
				throw new Exception(sf.toString());
			}
			JSONArray datas = rb.getResultJSONArray(0);
			if(datas.size()>0){
				jrows = datas.getJSONObject(0);
			}
		}catch (Exception e) {
			//如何向前台发送错误信息？
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		
		if(null==jrows){
			jrows = new JSONObject();
			jrows.put("code", "0");
			jrows.put("desc", "未找到对应记录");
		}else{
			jrows.put("code", "1");
			jrows.put("desc", "查找成功");
		}
		
		_PRINT(request, response, jrows.toString());
		return true;
	}
	
	/**
	 * 流程参数列表
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @return
	 * @throws Exception
	 */
	public boolean para_list(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
		JSONArray jrows = new JSONArray();
		try{
			String server_uuid = _getParameter("server_uuid", request, response);
			
			ResultBean rb = WQL.getWO(WQLNames.QWDKMQ0002)
								.addParam("server_uuid", server_uuid)
								.process(conb);
			if(rb.isSuccess()==false){
				StringBuffer sf = new StringBuffer();
				ArrayList errlist = rb.getInfoError();
				for(int i=0;i<errlist.size();i++){
					ErrorBean errBean = (ErrorBean)errlist.get(i);
					sf.append(errBean.toString());
					sf.append("\n");
				}
				throw new Exception(sf.toString());
			}
			jrows = rb.getResultJSONArray(0);			
		}catch (Exception e) {
			//如何向前台发送错误信息？
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		_PRINT(request, response, jrows.toString());
		return true;
	}
	
	/**
	 * 检查服务编码是否存在
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @return
	 * @throws Exception
	 */
	public boolean check(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {		
		boolean isSuccess = true;
		String err = "";		
		
		try{
			String server_code = _getParameter("server_code", request, response);
			
			ResultBean rb = WQL.getWO(WQLNames.QWDKMQ0001)
					.addParam("isactive", "1")
					.addParam("server_code", server_code)
					.process(conb);
			if(rb.isSuccess()==false){
				StringBuffer sf = new StringBuffer();
				ArrayList errlist = rb.getInfoError();
				for(int i=0;i<errlist.size();i++){
					ErrorBean errBean = (ErrorBean)errlist.get(i);
					sf.append(errBean.toString());
					sf.append("\n");
				}
				throw new Exception(sf.toString());
			}
			if( rb.getResultSet(0).size() > 0){
				throw new Exception("服务编码为【"+server_code+"】的记录已存在！");
			}
		}catch (Exception e) {
			isSuccess = false;
			err = e.getMessage();
			logger.errorWithNoException(err);
			e.printStackTrace();
		}
		
		JSONObject jrows = new JSONObject();
		if(isSuccess){
			jrows.put("code", "1");
			jrows.put("desc", "");
		}else{
			jrows.put("code", "0");
			jrows.put("desc", err);
		}
		
		_PRINT(request, response, jrows.toString());
		return true;
	}
	
	/**
	 * 保存
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public boolean save(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
		boolean isSuccess = true;
		String err = "";
		try{
			String type = _getParameter("type", request, response);
			String server_uuid = _getParameter("server_uuid", request, response);
			String server_code = _getParameter("server_code", request, response);
			String server_name = _getParameter("server_name", request, response);
			String hostname = _getParameter("hostname", request, response);
			String channel = _getParameter("channel", request, response);
			String ccsid = _getParameter("ccsid", request, response);
			String port = _getParameter("port", request, response);
			String qmname = _getParameter("qmname", request, response);
			String qname_get = _getParameter("qname_get", request, response);
			String qname_put = _getParameter("qname_put", request, response);
			String userid = _getParameter("userid", request, response);
			String pwd = _getParameter("pwd", request, response);
			String busiclass = _getParameter("busiclass", request, response);
			String runmodel = _getParameter("runmodel", request, response);
			String remark = _getParameter("remark", request, response);
			String allrows = _getParameter("allrows", request, response);
			JSONArray paras = JSONArray.fromObject(allrows);
			String[] prop_uuid_arr = new String[paras.size()];
			String[] prop_value_arr = new String[paras.size()];
			String[] prop_remark_arr = new String[paras.size()];
			for(int i=0;i<paras.size();i++){
				JSONObject row = paras.getJSONObject(i);
				prop_uuid_arr[i] = row.getString("prop_uuid");
				prop_value_arr[i] = row.getString("prop_value");
				prop_remark_arr[i] = row.getString("remark");
			}
			
			ResultBean rb = WQL.getWO(WQLNames.UWDKMQ0001)
					.addParam("flag", "add".equals(type)?"1":"2")
					.addParam("server_uuid", server_uuid)
					.addParam("server_code", server_code)
					.addParam("server_name", server_name)
					.addParam("hostname", hostname)
					.addParam("channel", channel)
					.addParam("ccsid", ccsid)
					.addParam("port", port)
					.addParam("qmname", qmname)
					.addParam("qname_get", qname_get)
					.addParam("qname_put", qname_put)
					.addParam("userid", userid)
					.addParam("pwd", pwd)
					.addParam("busiclass", busiclass)
					.addParam("runmodel", runmodel)
					.addParam("remark", remark)
					.addParam("propcount", String.valueOf(paras.size()))
					.addParam("prop_uuid_arr", prop_uuid_arr)
					.addParam("prop_value_arr", prop_value_arr)
					.addParam("prop_remark_arr", prop_remark_arr)
					.process(conb);
			if(rb.isSuccess()==false){
				StringBuffer sf = new StringBuffer();
				ArrayList errlist = rb.getInfoError();
				for(int j=0;j<errlist.size();j++){
					ErrorBean errBean = (ErrorBean)errlist.get(j);
					sf.append(errBean.toString());
					sf.append("\n");
				}
				throw new Exception(sf.toString());
			}
		}catch (Exception e) {
			err = e.getMessage();
			logger.errorWithNoException(err);
			e.printStackTrace();
			isSuccess = false;
		}
			
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "保存成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "保存失败！\n"+err);
		}
		
		_PRINT(request, response, jres.toString());
		return isSuccess;
	}
	
	/**
	 * 删除
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public boolean delete(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
		boolean isSuccess = true;
		String err = "";
		try{
			String id = _getParameter("id", request, response);
			String[] server_uuids = id.split(",");
			for(int i=0;i<server_uuids.length;i++){
				ResultBean rb = WQL.getWO(WQLNames.UWDKMQ0001)
					.addParam("flag", "3")
					.addParam("server_uuid", server_uuids[i])
					.process(conb);
				if(rb.isSuccess()==false){
					StringBuffer sf = new StringBuffer();
					ArrayList errlist = rb.getInfoError();
					for(int j=0;j<errlist.size();j++){
						ErrorBean errBean = (ErrorBean)errlist.get(j);
						sf.append(errBean.toString());
						sf.append("\n");
					}
					throw new Exception(sf.toString());
				}
			}
		}catch (Exception e) {
			err = e.getMessage();
			logger.errorWithNoException(err);
			e.printStackTrace();
			isSuccess = false;
		}
			
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "删除成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "删除失败！\n"+err);
		}
		
		_PRINT(request, response, jres.toString());
		return isSuccess;
	}
	
	
	public boolean msglist(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
		JSONObject jrows = new JSONObject();
		try{
			String server_uuid = _getParameter("server_uuid", request, response);
			String begintime = _getParameter("begintime", request, response);
			String endtime = _getParameter("endtime", request, response);
						
			jrows = WQL.getWO(WQLNames.QWDKMQ0003)
							.addParam("server_uuid", server_uuid)
							.addParam("begintime", WDK.getDateTime(begintime,"yyyyMMddHHmss"))
							.addParam("endtime", WDK.getDateTime(endtime,"yyyyMMddHHmss"))
							.pageQuery(request, "receivetime desc", conb);
//			if(rb.isSuccess()==false){
//				StringBuffer sf = new StringBuffer();
//				ArrayList errlist = rb.getInfoError();
//				for(int i=0;i<errlist.size();i++){
//					ErrorBean errBean = (ErrorBean)errlist.get(i);
//					sf.append(errBean.toString());
//					sf.append("\n");
//				}
//				throw new Exception(sf.toString());
//			}
//			jrows = rb.pageResult();		
		}catch (Exception e) {
			//如何向前台发送错误信息？
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		_PRINT(request, response, jrows.toString());
		return true;
	}
	
	public boolean msgdtl(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
		JSONArray jrows = new JSONArray();
		try{
			String msg_uuid = _getParameter("msg_uuid", request, response);
						
			ResultBean rb = WQL.getWO(WQLNames.QWDKMQ0004)
							.addParam("msg_uuid", msg_uuid)
							.process(conb);
			if(rb.isSuccess()==false){
				StringBuffer sf = new StringBuffer();
				ArrayList errlist = rb.getInfoError();
				for(int i=0;i<errlist.size();i++){
					ErrorBean errBean = (ErrorBean)errlist.get(i);
					sf.append(errBean.toString());
					sf.append("\n");
				}
				throw new Exception(sf.toString());
			}
			jrows = rb.getResultJSONArray(0);
			for(int i=0;i<jrows.size();i++){
				JSONObject row = jrows.getJSONObject(i);
				row.put("msgvalue", Base64.decode2String(row.getString("msgvalue")));
			}

			jrows = WDK.DataFormat_Tree(jrows, "msgkey", "msgkey", "", "", "msgvalue");
		}catch (Exception e) {
			//如何向前台发送错误信息？
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		_PRINT(request, response, jrows.toString());
		return true;
	}
	
	public boolean test(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
		boolean isSuccess = true;
		String err = "";
		try{
			String server_code = _getParameter("server_code", request, response);
			
        	HashMap<String,String> param = new HashMap<String, String>();
			param.put("MSGPROPERTY", "mdm_log");
			param.put("sys", "zyjx_all");
			String message = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><DATASET><HEAD><MSG_ID>HRM_20150422094001001_0001</MSG_ID><NAME>主数据管理系统推送发布或停用数据</NAME><SOURCE>ZYJX</SOURCE><TARGET>MDM</TARGET><OPERATION_IDNY>UPDATE</OPERATION_IDNY><MSG_TYPE>3</MSG_TYPE><MDM_IDNY>ORGN</MDM_IDNY><RT_CODE>002</RT_CODE><RT_DESC>处理成功</RT_DESC><WS_MARK></WS_MARK><WS_METHOD></WS_METHOD><WS_DESC></WS_DESC><CURR_TIME>2015-04-22 09:46:29</CURR_TIME><AREA_CODE>hz</AREA_CODE><ACCP_MDM_QTY>1</ACCP_MDM_QTY></HEAD><CONDITION /><DATA /></DATASET>";
			
			isSuccess = MQCore.sendMessage(server_code, message, param);
			
			
		}catch (Exception e) {
			err = e.getMessage();
			logger.errorWithNoException(err);
			e.printStackTrace();
			isSuccess = false;
		}
			
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "测试成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "测试失败！\n"+err);
		}
		
		_PRINT(request, response, jres.toString());
		return isSuccess;
	}
}