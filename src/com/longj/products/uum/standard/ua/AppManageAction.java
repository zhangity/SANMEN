package com.longj.products.uum.standard.ua;

import java.util.ArrayList;
import java.util.HashMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;

import wql.WQLNames;

import com.longj.platform.busi.wdk.base.BaseActionMethod;
import com.longj.platform.pb.util.WQLUtil;

/**
 * 应用管理实现类
 * AppManageAction
 * <p>
 * </p>
 * 版权：Copyright (c) 2015 杭州新世纪电子科技有限公司
 * <p>
 * </p>
 * 
 * @author wangyy
 */
public class AppManageAction extends BaseActionMethod {
	private static WDKLogger logger = new WDKLogger(AppManageAction.class.getName());
	
	/**
	 * 保存应用的信息
	 * 要求格式：
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void save(WDKContext context) throws Exception{
		boolean isSuccess = true;
		JSONArray ret = null;
		ErrorBean err = null;
		JSONObject mainFieldValues = JSONObject.fromObject( context.getString("_FILEDVALUE"));
		try{
			String actionflag = mainFieldValues.getString("actionflag");
			String app_uuid = mainFieldValues.getString("app_uuid");
			String app_name = mainFieldValues.getString("app_name");
			String short_name = mainFieldValues.getString("short_name");
			String app_code = mainFieldValues.getString("app_code");
			String app_ver = mainFieldValues.getString("app_ver");
			String app_type = mainFieldValues.getString("app_type");
			String deploy_type = mainFieldValues.getString("deploy_type");
			String data_right = mainFieldValues.getString("data_right");
			String deploy_date = mainFieldValues.getString("deploy_date");
			String manufacturer = mainFieldValues.getString("manufacturer");
			String app_ip = mainFieldValues.getString("app_ip");
			String app_port = mainFieldValues.getString("app_port");
			String app_deploy_name = mainFieldValues.getString("app_deploy_name");
			String home_url = mainFieldValues.getString("home_url");
			String login_url = mainFieldValues.getString("login_url");
			String display_order = mainFieldValues.getString("display_order");
			String ws_url = mainFieldValues.getString("ws_url");
			String ws_user = mainFieldValues.getString("ws_user");
			String ws_pwd = mainFieldValues.getString("ws_pwd");
			String remark = mainFieldValues.getString("remark");
			String operator = mainFieldValues.getString("operator");
			String odepart = mainFieldValues.getString("odepart");
			String oorg = mainFieldValues.getString("oorg");
			String odt = mainFieldValues.getString("odt");
			ResultBean resultBean = WQLUtil.getWQL(WQLNames.UUUMUA_0001)
					.addParam("actionflag", actionflag)
					.addParam("app_uuid", app_uuid)
					.addParam("app_name", app_name)
					.addParam("short_name", short_name)
					.addParam("app_code", app_code)
					.addParam("app_ver", app_ver)
					.addParam("app_type", app_type)
					.addParam("deploy_type", deploy_type)
					.addParam("data_right", data_right)
					.addParam("deploy_date", deploy_date)
					.addParam("manufacturer", manufacturer)
					.addParam("app_ip", app_ip)
					.addParam("app_port", app_port)
					.addParam("app_deploy_name", app_deploy_name)
					.addParam("home_url", home_url)
					.addParam("login_url", login_url)
					.addParam("display_order", display_order)
					.addParam("ws_url", ws_url)
					.addParam("ws_user", ws_user)
					.addParam("ws_pwd", ws_pwd)
					.addParam("remark", remark)
					.addParam("operator", operator)
					.addParam("odepart", odepart)
					.addParam("oorg", oorg)
					.addParam("odt", odt)
					.process(context.getConnectBean());
			if(resultBean.isSuccess()){
				ret = resultBean.getResultJSONArray(0);
			}else{
				isSuccess = false;
				ret = new JSONArray();
				logger.errorWithNoException("保存应用详细信息错误：");
				ArrayList errList = resultBean.getInfoError();
				for(int i=0;i<errList.size();i++){
					err = (ErrorBean)errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
		}catch(Exception e){
			isSuccess = false;
			logger.errorWithNoException("保存应用详细信息错误："+e.getMessage());
			e.printStackTrace();
		}
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "添加成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "添加失败！" + err.toString());
		}
		
		context.setPrintOut(jres.toString());
		}
	/**
	 * 根据应用标识、应用编码、应用名称获取应用详细信息
	 * 要求格式：
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void query( WDKContext context ) throws Exception  {
		boolean isSuccess = true;
		WQLData dataSet = null;
		JSONArray jrows = null;
		String err = "";
		try{
			HashMap param=new HashMap();
			param.put("app_uuid", context.getString("app_uuid"));
			param.put("app_name", context.getString("app_name"));
			param.put("app_code", context.getString("app_code"));
			ResultBean ret = WQL.getWO(WQLNames.QUUMUA_0001)
					.addParamMap(param)
					.process(context.getConnectBean());
			dataSet = ret.getWQLData(0);
			//添加自定义
			if ( dataSet != null ) {
				jrows = dataSet.getDataJSONArray();
			}

		}catch (Exception ex) {
			isSuccess = false;
			err = ex.getMessage();
			logger.errorWithNoException(err);
			ex.printStackTrace();
		}
		if(isSuccess){
			
		}else{
			JSONObject jrowsObj  = new JSONObject();
			jrowsObj.put("code", "0");
			jrowsObj.put("desc", "查询出错！\n"+err);
		}
		context.setPrintOut(jrows.toString());
	}
	
	/**
	 * 根据应用标识删除指定的应用
	 * 要求格式：
	 * @param context
	 * @return
	 * @throws Exception
	 */
		public void delete(WDKContext context) throws Exception {
			boolean isSuccess = true;
			String err = "";
			JSONObject jres = new JSONObject();
			try{
				String app_uuids = context.getString("app_uuids");
				String[] app_uuidarr = app_uuids.split(",");
				for(int j=0;j<app_uuidarr.length;j++){
					HashMap param=new HashMap();
					param.put("actionflag", context.getString("actionflag"));
					param.put("app_uuid", app_uuidarr[j]);
					ResultBean ret = WQL.getWO("UUUMUA_0001")
							.addParamMap(param)
							.process(context.getConnectBean());
					if(!ret.isSuccess()){
						StringBuffer sf = new StringBuffer();
						ArrayList errlist = ret.getInfoError();
						for(int i=0;i<errlist.size();i++){
							ErrorBean errBean = (ErrorBean)errlist.get(i);
							sf.append(errBean.toString());
							sf.append("\n");
						}
						isSuccess = false;
						err=err + "," +sf.toString();
						logger.errorWithNoException(err);
					}
				}
			}catch (Exception ex) {
				isSuccess = false;
				err = ex.getMessage();
				logger.errorWithNoException(err);
				ex.printStackTrace();
			}
			
			if (isSuccess) {
				jres.put("code", "1");
				jres.put("desc", "删除成功！");
			} else {
				jres.put("code", "0");
				jres.put("desc", "删除失败！\n" + err);
			}

			context.setPrintOut(jres.toString());
		}
}