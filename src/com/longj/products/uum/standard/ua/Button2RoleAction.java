package com.longj.products.uum.standard.ua;

import java.util.ArrayList;
import java.util.HashMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.WDK;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;

import com.longj.platform.busi.wdk.base.BaseActionMethod;
import com.longj.platform.busi.wdk.uum.UUM;
import com.longj.platform.pb.util.WQLUtil;

import wql.WQLNames;


/**
 * 角色按钮授权管理实现类
 * Button2RoleAction
 * <p>
 * </p>
 * 版权：Copyright (c) 2015 杭州新世纪电子科技有限公司
 * <p>
 * </p>
 * 
 * @author wangyy
 */
public class Button2RoleAction extends BaseActionMethod {
	private static WDKLogger logger = new WDKLogger(Func2RoleAction.class.getName());
	/**
	 * 取可给指定角色授权的按钮列表
	 * 要求格式：
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void getLButtonList( WDKContext context ) throws Exception{
		JSONArray ret = null;
		try{
			String role_uuid = context.getString("role_uuid");
			String org_uuid = context.getString("org_uuid");
			ResultBean resultBean = WQL.getWO(WQLNames.QUUMUA_0009)
			.addParam("role_uuid", role_uuid)
			.addParam("org_uuid", org_uuid)
			.addParam("actionflag", "left")
			.process(context.getConnectBean());
			if(resultBean.isSuccess()){
				ret = resultBean.getResultJSONArray(0);
			}else{
				ret = new JSONArray();
				logger.errorWithNoException("取按钮列表错误：");
				ArrayList errList = resultBean.getInfoError();
				for(int i=0;i<errList.size();i++){
					ErrorBean err = (ErrorBean)errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
			ret = WDK.DataFormat_Tree(ret, "node_uuid", "node_name", "parent_uuid");
		}catch(Exception e){
			logger.errorWithNoException("取按钮列表错误："+e.getMessage());
			e.printStackTrace();
		}
		context.setPrintOut(ret.toString());
	}
	/**
	 * 取已给指定角色授权的按钮列表
	 * 要求格式：
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void getRButtonList( WDKContext context ) throws Exception{
		JSONArray ret = null;
		try{
			String role_uuid = context.getString("role_uuid");
			String org_uuid = context.getString("org_uuid");
			ResultBean resultBean = WQL.getWO(WQLNames.QUUMUA_0009)
			.addParam("role_uuid", role_uuid)
			.addParam("org_uuid", org_uuid)
			.addParam("actionflag", "right")
			.process(context.getConnectBean());
			if(resultBean.isSuccess()){
				ret = resultBean.getResultJSONArray(0);
			}else{
				ret = new JSONArray();
				logger.errorWithNoException("取角色按钮列表错误：");
				ArrayList errList = resultBean.getInfoError();
				for(int i=0;i<errList.size();i++){
					ErrorBean err = (ErrorBean)errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
			ret = WDK.DataFormat_Tree(ret, "node_uuid", "node_name", "parent_uuid");
		}catch(Exception e){
			logger.errorWithNoException("取角色按钮列表错误："+e.getMessage());
			e.printStackTrace();
		}
		context.setPrintOut(ret.toString());
	}
	
	public ArrayList<String> parseJson(JSONObject  object, ArrayList<String> ids){
		
		if (object.has("children")) {
			JSONArray jArray = object.getJSONArray("children");
			for(int i=0;jArray!=null && i<jArray.size();i++){
				JSONObject cObject = jArray.getJSONObject(i);
				parseJson(cObject, ids);
			}
		}else{
			ids.add(object.getString("id"));
		}
		System.out.println(ids);
		return ids;
	}
	/**
	 * 保存角色按钮权限信息
	 * 要求格式：
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void save(WDKContext context) throws Exception{
		boolean isSuccess = true;
		JSONArray ret = null;
		try{
			String role_uuid = context.getString("role_uuid");
			String btngrpdtl_uuidarr1 = context.getString("btngrpdtl_uuidarr");
			JSONArray arr = JSONArray.fromObject(btngrpdtl_uuidarr1);		
		        //将Json字符串转为java对象
		        //获取Object中的UserName
			ArrayList<String> btngrpdtl_uuidarr = new ArrayList<String>();
			for(int i=0;i<arr.size();i++){
				JSONObject obj=arr.getJSONObject(i);
				btngrpdtl_uuidarr = this.parseJson(obj, btngrpdtl_uuidarr);
			}
			String str[] = (String[])btngrpdtl_uuidarr.toArray(new String[btngrpdtl_uuidarr.size()]);
			String detailcount = String.valueOf(btngrpdtl_uuidarr.size());
			ResultBean resultBean = WQLUtil.getWQL(WQLNames.UUUMUA_0009)
					.addParam("role_uuid", role_uuid)
					.addParam("detailcount", detailcount)
					.addParam("btngrpdtl_uuidarr", str)
					.addParam("actionflag", "ref")
					.process(context.getConnectBean());
			if(resultBean.isSuccess()){
				ret = resultBean.getResultJSONArray(0);
			}else{
				isSuccess = false;
				ret = new JSONArray();
				logger.errorWithNoException("保存角色按钮信息错误：");
				ArrayList errList = resultBean.getInfoError();
				for(int i=0;i<errList.size();i++){
					ErrorBean err = (ErrorBean)errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
		}catch(Exception e){
			isSuccess = false;
			logger.errorWithNoException("保存角色按钮信息错误："+e.getMessage());
			e.printStackTrace();
		}
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "添加成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "添加失败！");
		}
		
		context.setPrintOut(jres.toString());
		}
	/**
	 * 根据角色标识查询角色详细信息
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
			param.put("role_uuid", context.getString("role_uuid"));
			param.put("role_name", context.getString("role_name"));
			param.put("app_uuid", context.getString("app_uuid"));
			param.put("org_uuid", context.getString("org_uuid"));
			param.put("actionflag", context.getString("actionflag"));
			ResultBean ret = WQL.getWO(WQLNames.QUUMUA_0003)
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
	 * 角色树
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void getRoleTree(WDKContext context) throws Exception {
		String org_uuid = context.getString("org_uuid");	//管理单元标识
		String role_type = context.getString("role_type");				//操作人员标识
		String parent_uuid = context.getString("parent_uuid");				//上级组织标识
		String issync = context.getString("issync");						//是否同步
		String parentid = context.getString("parentid");
		
		if("0".equals(issync) && !"".equals(parentid)){
			parent_uuid = parentid;
		}
		
		JSONArray jrows = UUM.getRoleList(parent_uuid,org_uuid,role_type,issync, context.getConnectBean());
		if("1".equals(issync)){
			jrows = WDK.DataFormat_Tree(jrows, "node_uuid", "node_name", "parent_uuid");
		}else{
			jrows = WDK.DataFormat_Tree_Asyn(jrows, "node_uuid", "node_name", "parent_uuid","typeorder","node_code");
		}
		context.setPrintOut(jrows.toString());
	}
}