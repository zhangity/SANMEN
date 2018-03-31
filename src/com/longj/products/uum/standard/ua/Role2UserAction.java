package com.longj.products.uum.standard.ua;

import java.util.ArrayList;
import java.util.HashMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.WDK;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;

import wql.WQLNames;

import com.longj.platform.busi.wdk.base.BaseActionMethod;
import com.longj.platform.busi.wdk.handler.SessionUser;
import com.longj.platform.busi.wdk.uum.UUM;
import com.longj.platform.pb.util.WQLUtil;

/**
 * 用户关联角色管理实现类
 * Role2UserAction
 * <p>
 * </p>
 * 版权：Copyright (c) 2015 杭州新世纪电子科技有限公司
 * <p>
 * </p>
 * 
 * @author wangyy
 */
public class Role2UserAction extends BaseActionMethod {
	private static WDKLogger logger = new WDKLogger(Func2RoleAction.class.getName());
	
	public void getLRoleList( WDKContext context ) throws Exception{
		JSONArray ret = null;
		try{
			String account_uuid = context.getString("account_uuid");
			String org_uuid = context.getString("org_uuid");
			String depart_uuid = context.getString("depart_uuid");
			ResultBean resultBean = WQL.getWO(WQLNames.QUUMUA_0006)
			.addParam("account_uuid", account_uuid)
			.addParam("org_uuid", org_uuid)
			.addParam("depart_uuid", depart_uuid)
			.addParam("actionflag", "left")
			.process(context.getConnectBean());
			if(resultBean.isSuccess()){
				ret = resultBean.getResultJSONArray(0);
			}else{
				ret = new JSONArray();
				logger.errorWithNoException("取角色列表错误：");
				ArrayList errList = resultBean.getInfoError();
				for(int i=0;i<errList.size();i++){
					ErrorBean err = (ErrorBean)errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
			ret = WDK.DataFormat_Tree(ret, "node_uuid", "node_name", "parent_uuid");
		}catch(Exception e){
			logger.errorWithNoException("取角色列表错误："+e.getMessage());
			e.printStackTrace();
		}
		context.setPrintOut(ret.toString());
	}
	
	public void getRRoleList( WDKContext context ) throws Exception{
		JSONArray ret = null;
		try{
			String account_uuid = context.getString("account_uuid");
			String org_uuid = context.getString("org_uuid");
			String depart_uuid = context.getString("depart_uuid");
			ResultBean resultBean = WQL.getWO(WQLNames.QUUMUA_0006)
			.addParam("account_uuid", account_uuid)
			.addParam("org_uuid", org_uuid)
			.addParam("depart_uuid", depart_uuid)
			.addParam("actionflag", "right")
			.process(context.getConnectBean());
			if(resultBean.isSuccess()){
				ret = resultBean.getResultJSONArray(0);
			}else{
				ret = new JSONArray();
				logger.errorWithNoException("取角色信息列表错误：");
				ArrayList errList = resultBean.getInfoError();
				for(int i=0;i<errList.size();i++){
					ErrorBean err = (ErrorBean)errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
			ret = WDK.DataFormat_Tree(ret, "node_uuid", "node_name", "parent_uuid");
		}catch(Exception e){
			logger.errorWithNoException("取角色信息列表错误："+e.getMessage());
			e.printStackTrace();
		}
		context.setPrintOut(ret.toString());
	}
	
	public void getUserRoleList( WDKContext context ) throws Exception{
		JSONArray ret = null;
		try{
			SessionUser user = _getSessionuser(context);
			String orguuid = user.getOrguuid();  //当前用户所在机构
			String person_uuid = context.getString("person_uuid");
			ResultBean resultBean = WQL.getWO(WQLNames.QUUMUA_0006)
			.addParam("person_uuid", person_uuid)
			.addParam("org_uuid", orguuid)
			.addParam("actionflag", "only")
			.process(context.getConnectBean());
			if(resultBean.isSuccess()){
				ret = resultBean.getResultJSONArray(0);
			}else{
				ret = new JSONArray();				
			}
			ret = WDK.DataFormat_Tree(ret, "node_uuid", "node_name", "parent_uuid");
		}catch(Exception e){
			ret = new JSONArray();	
			logger.errorWithNoException("取角色信息列表错误："+e.getMessage());
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

	public void save(WDKContext context) throws Exception{
		boolean isSuccess = true;
		JSONArray ret = null;
		try{
			String account_uuid = context.getString("account_uuid");
			String depart_uuid = context.getString("depart_uuid");
			String role_uuidarr1 = context.getString("role_uuidarr");
			JSONArray arr = JSONArray.fromObject(role_uuidarr1);		
		        //将Json字符串转为java对象
		        //获取Object中的UserName
			ArrayList<String> role_uuidarr = new ArrayList<String>();
			for(int i=0;i<arr.size();i++){
				JSONObject obj=arr.getJSONObject(i);
				role_uuidarr = this.parseJson(obj, role_uuidarr);
			}
			String str[] = (String[])role_uuidarr.toArray(new String[role_uuidarr.size()]);
			String detailcount = String.valueOf(role_uuidarr.size());
			ResultBean resultBean = WQLUtil.getWQL(WQLNames.UUUMUA_0006)
					.addParam("account_uuid", account_uuid)
					.addParam("depart_uuid", depart_uuid)
					.addParam("detailcount", detailcount)
					.addParam("role_uuidarr", str)
					.addParam("actionflag", "ref")
					.process(context.getConnectBean());
			if(resultBean.isSuccess()){
				ret = resultBean.getResultJSONArray(0);
			}else{
				isSuccess = false;
				ret = new JSONArray();
				logger.errorWithNoException("保存角色详细信息列表错误：");
				ArrayList errList = resultBean.getInfoError();
				for(int i=0;i<errList.size();i++){
					ErrorBean err = (ErrorBean)errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
		}catch(Exception e){
			isSuccess = false;
			logger.errorWithNoException("保存角色详细信息列表错误："+e.getMessage());
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
	
	public void query( WDKContext context ) throws Exception  {
		boolean isSuccess = true;
		WQLData dataSet = null;
		JSONArray jrows = null;
		String err = "";
		try{
			HashMap param=new HashMap();
			param.put("account_uuid", context.getString("account_uuid"));
			param.put("person_uuid", context.getString("person_uuid"));
			param.put("login_name", context.getString("login_name"));
			param.put("person_name", context.getString("person_name"));
			ResultBean ret = WQL.getWO(WQLNames.QUUMUU_0002)
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
	public void getOrgAccountList(WDKContext context) throws Exception {
		String manage_unit_uuid = context.getString("manage_unit_uuid");	//管理单元标识
		String person_uuid = context.getString("person_uuid");				//操作人员标识
		String role_uuid = context.getString("role_uuid");					//角色标识
		String parent_uuid = context.getString("parent_uuid");				//上级组织标识
		String user_type = context.getString("user_type");					//
		String isctrlperm = context.getString("isctrlperm");				//是否控制权限
		String issync = context.getString("issync");						//是否同步
		
		String parentid = context.getString("parentid");
		
		if("0".equals(issync) && !"".equals(parentid)){
			parent_uuid = parentid;
		}
		
		JSONArray jrows = UUM.getOrgAccountList(manage_unit_uuid, person_uuid, role_uuid, parent_uuid, user_type, isctrlperm, issync, context.getConnectBean());
		
		boolean flag = true;

		for(int i=0;i<jrows.size();i++){
			JSONObject row = jrows.getJSONObject(i);
			if ( flag && parentid.equals( (String)row.get("node_uuid") ) ) {
				row.put("parent_uuid", "-1");
				flag = false;
			}
			String typeorder = row.getString("typeorder");
			if("2".equals(typeorder)){
				typeorder = "ext-icon-user";
			}else{
				typeorder="";
			}
			row.put("typeorder", typeorder);
		}
		if("1".equals(issync)){
			jrows = WDK.DataFormat_Tree(jrows, "node_uuid", "node_name", "parent_uuid");
		}else{
			jrows = WDK.DataFormat_Tree_Asyn(jrows, "node_uuid", "node_name", "parent_uuid","typeorder","node_code");
		}
		context.setPrintOut(jrows.toString());
	}
}