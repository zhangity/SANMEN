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
 * 角色管理实现类
 * Func2RoleAction
 * <p>
 * </p>
 * 版权：Copyright (c) 2015 杭州新世纪电子科技有限公司
 * <p>
 * </p>
 * 
 * @author wangyy
 */
public class RoleManageAction extends BaseActionMethod {
	private static WDKLogger logger = new WDKLogger(RoleManageAction.class.getName());
	
	public ArrayList<String> parseJson(JSONObject  object, ArrayList<String> ids){
		ids.add(object.getString("id"));
		if (object.has("children")) {
			JSONArray jArray = object.getJSONArray("children");
			for(int i=0;jArray!=null && i<jArray.size();i++){
				JSONObject cObject = jArray.getJSONObject(i);
				parseJson(cObject, ids);
			}
		}
		System.out.println(ids);
		return ids;
	}

	public void save(WDKContext context) throws Exception{
		boolean isSuccess = true;
		JSONArray ret = null;
		JSONObject mainFieldValues = JSONObject.fromObject( context.getString("_FILEDVALUE"));
		try{
			String role_uuid = mainFieldValues.getString("role_uuid");
			String role_name = mainFieldValues.getString("role_name");
			String role_code = mainFieldValues.getString("role_code");
			String app_uuid = mainFieldValues.getString("app_uuid");
			String org_uuid = mainFieldValues.getString("org_uuid");
			String role_type = mainFieldValues.getString("role_type");
			String display_order = mainFieldValues.getString("display_order");
			String remark = mainFieldValues.getString("remark");
			String actionflag = mainFieldValues.getString("actionflag");
			String operator = mainFieldValues.getString("operator");
			String odepart = mainFieldValues.getString("odepart");
			String oorg = mainFieldValues.getString("oorg");
			String odt = mainFieldValues.getString("odt");
			ResultBean resultBean = WQLUtil.getWQL(WQLNames.UUUMUA_0003)
					.addParam("role_uuid", role_uuid)
					.addParam("role_name", role_name)
					.addParam("role_code", role_code)
					.addParam("app_uuid", app_uuid)
					.addParam("org_uuid", org_uuid)
					.addParam("role_type", role_type)
					.addParam("display_order", display_order)
					.addParam("remark", remark)
					.addParam("actionflag", actionflag)
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
				logger.errorWithNoException("保存角色详细信息错误：");
				ArrayList errList = resultBean.getInfoError();
				for(int i=0;i<errList.size();i++){
					ErrorBean err = (ErrorBean)errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
		}catch(Exception e){
			isSuccess = false;
			logger.errorWithNoException("保存角色详细信息错误："+e.getMessage());
			e.printStackTrace();
		}
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "添加成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "输入的角色名称已被使用，不能新增!");
		}
		context.setPrintOut( jres.toString());
		}
	
	public void query( WDKContext context ) throws Exception  {
		boolean isSuccess = true;
		WQLData dataSet = null;
		JSONObject jrows = new JSONObject();
		String err = "";
		try{
			HashMap param=new HashMap();
			param.put("role_uuid", context.getString("role_uuid"));
			param.put("role_name", context.getString("role_name"));
			param.put("app_uuid", context.getString("app_uuid"));
			param.put("org_uuid", context.getString("org_uuid"));
			param.put("actionflag", context.getString("actionflag"));
			jrows = WQL.getWO(WQLNames.QUUMUA_0003)
					.addParamMap(param)
					.pageQuery(context.getRequest(), " display_order ASC",context.getConnectBean());

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
		context.setPrintOut( jrows.toString());
	}
	//删除
		public void delete(WDKContext context) throws Exception {
			boolean isSuccess = true;
			String err = "";
			JSONObject jres = new JSONObject();
			try{
				String role_uuids = context.getString("role_uuids");
				String[] role_uuidarr = role_uuids.split(",");
				for(int j=0;j<role_uuidarr.length;j++){
					HashMap param=new HashMap();
					param.put("actionflag", context.getString("actionflag"));
					param.put("role_uuid", role_uuidarr[j]);
					ResultBean ret = WQL.getWO("UUUMUA_0003")
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
						jres.put("code", "0");
						jres.put("desc", "删除失败！\n" + err);
					}
				}
			}catch (Exception ex) {
				isSuccess = false;
				err = ex.getMessage();
				logger.errorWithNoException(err);
				ex.printStackTrace();
				jres.put("code", "0");
				jres.put("desc", "删除失败！\n" + err);
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
	
	/**
	 * 应用列表
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void getAppList(WDKContext context) throws Exception {
			boolean isSuccess = true;
			JSONArray retrows = new JSONArray();
			String err = "";
			try{
				//调用公用
				JSONArray jrows = UUM.getAppList(context.getConnectBean());
				retrows=WDK.DataFormat_Combox(jrows, "app_uuid", "app_name");
			}catch (Exception ex) {
				isSuccess = false;
				err = ex.getMessage();
				logger.errorWithNoException(err);
				ex.printStackTrace();
			}
			if(isSuccess){
				context.setPrintOut( retrows.toString());
			}else{
				JSONObject jrowsObj = new JSONObject();
				jrowsObj.put("code", "0");
				jrowsObj.put("desc", "查询出错！\n"+err);
				context.setPrintOut(jrowsObj.toString());
			}
	}
	/**
	 * 机构列表
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void getOrgList(WDKContext context) throws Exception {
			boolean isSuccess = true;
			JSONArray retrows = new JSONArray();
			String err = "";
			try{
				String manage_unit_uuid = context.getString("manage_unit_uuid");
				String person_uuid = context.getString("person_uuid");
				String role_uuid = context.getString("role_uuid");
				String parent_uuid = context.getString("parent_uuid");
				String org_type_scode = context.getString("org_type_scode");
				String org_level_scode = context.getString("org_level_scode");
				String isctrlperm = context.getString("isctrlperm");
				String issync = context.getString("issync");
				//调用公用
				JSONArray jrows = UUM.getOrgList(manage_unit_uuid, person_uuid, role_uuid, parent_uuid, org_type_scode, org_level_scode, isctrlperm, issync, context.getConnectBean());
				retrows=WDK.DataFormat_Combox(jrows, "org_uuid", "org_name");
			}catch (Exception ex) {
				isSuccess = false;
				err = ex.getMessage();
				logger.errorWithNoException(err);
				ex.printStackTrace();
			}
			if(isSuccess){
				context.setPrintOut( retrows.toString());
			}else{
				JSONObject jrowsObj = new JSONObject();
				jrowsObj.put("code", "0");
				jrowsObj.put("desc", "查询出错！\n"+err);
				context.setPrintOut(jrowsObj.toString());
			}
	}
}