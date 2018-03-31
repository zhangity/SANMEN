package com.longj.products.uum.standard.ua;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import wql.WQLNames;

import org.wdk.WDK;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLDataField;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.platform.busi.wdk.base.BaseActionMethod;
import com.longj.platform.busi.wdk.uum.UUM;


/**
 * 功能注册管理实现类
 * FuncManageAction
 * <p>
 * </p>
 * 版权：Copyright (c) 2015 杭州新世纪电子科技有限公司
 * <p>
 * </p>
 * 
 * @author wangyy
 */
public class FuncManageAction extends BaseActionMethod {
	private static WDKLogger logger = new WDKLogger(FuncManageAction.class.getName());
	
	/**
	 * 组织机构树
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void getFuncTree(WDKContext context) throws Exception {
		String func_type = context.getString("func_type");				//操作人员标识
		String role_uuid = context.getString("role_uuid");					//角色标识
		String parent_uuid = context.getString("parent_uuid");				//上级功能标识
		String issync = context.getString("issync");						//是否同步
		
		String parentid = context.getString("parentid");
		
		if("0".equals(issync) && !"".equals(parentid)){
			parent_uuid = parentid;
		}
		
		JSONArray jrows = UUM.getFuncList(parent_uuid, role_uuid, func_type, issync, context.getConnectBean());
		if("1".equals(issync)){
			jrows = WDK.DataFormat_Tree(jrows, "node_uuid", "node-name", "parent_uuid");
		}else{
			jrows = WDK.DataFormat_Tree_Asyn(jrows, "node_uuid", "node_name", "parent_uuid");
		}
		
		context.setPrintOut(jrows.toString());
	}
	
	public void query( WDKContext context ) throws Exception  {
		boolean isSuccess = true;
		WQLData dataSet = null;
		JSONObject jrows = null;
		JSONArray datas = null;
		String err = "";
		try{
			HashMap param=new HashMap();
			param.put("func_uuid", context.getString("func_uuid"));
			ResultBean ret = WQL.getWO(WQLNames.QUUMUA_0002)
					.addParamMap(param)
					.process(context.getConnectBean());
			dataSet = ret.getWQLData(0);
			//添加自定义
			if ( dataSet != null ) {
				datas = dataSet.getDataJSONArray();
			}
			if(datas.size()>0){
				jrows = datas.getJSONObject(0);
			}else{
				isSuccess = false;
			}
		}catch (Exception ex) {
			isSuccess = false;
			err = ex.getMessage();
			logger.errorWithNoException(err);
			ex.printStackTrace();
		}
		JSONObject jres = new JSONObject();
		if(isSuccess){
			if ( jrows == null ) {
				jrows = new JSONObject();
			}
			jrows.put("code", "1");
			jrows.put("desc", "查找成功");
		}else{
			jres.put("code", "0");
			jres.put("desc", "查询出错！\n"+err);
		}
		context.setPrintOut(jrows.toString());
	}
	
	//保存
	public void save(WDKContext context) throws Exception {
		boolean isSuccess = true;
		ErrorBean err = null;
		JSONArray ret = null;
		String desc = "";
		String code = "";
		String actionflag = context.getString("actionflag");
		JSONObject mainFieldValues = JSONObject.fromObject( context.getString("_FILEDVALUE"));
		try{
			HashMap param=new HashMap();
			param.put("actionflag", actionflag);
			param.put("func_uuid", mainFieldValues.getString("func_uuid"));
			param.put("parent_uuid", mainFieldValues.getString("parent_uuid"));
			param.put("app_uuid", mainFieldValues.getString("app_uuid"));
			param.put("func_name", mainFieldValues.getString("func_name"));
			param.put("func_code", mainFieldValues.getString("func_code"));
			param.put("func_type", mainFieldValues.getString("func_type"));
			param.put("func_url", mainFieldValues.getString("func_url"));
			param.put("display_order", mainFieldValues.getString("display_order"));
			param.put("is_ctrl_button", mainFieldValues.getString("is_ctrl_button"));
			param.put("sysisdelete", mainFieldValues.getString("sysisdelete"));
			param.put("remark", mainFieldValues.getString("remark"));
			
			param.put("operator", mainFieldValues.getString("operator"));
			param.put("odt", mainFieldValues.getString("odt"));
			param.put("odepart", mainFieldValues.getString("odepart"));
			param.put("oorg", mainFieldValues.getString("oorg"));
			
			param.put("ico_index", mainFieldValues.getString("ico_index"));
			
			ResultBean resultBean = WQL.getWO("UUUMUA_0002")
					.addParamMap(param)
					.process(context.getConnectBean());
			isSuccess = resultBean.isSuccess();
			if(!resultBean.isSuccess()){
				StringBuffer sf = new StringBuffer();
				ArrayList errlist = resultBean.getInfoError();
				for(int i=0;i<errlist.size();i++){
					ErrorBean errBean = (ErrorBean)errlist.get(i);
					sf.append(errBean.toString());
				}
				desc = "保存失败。" + sf.toString();
				code = "0";
			}else{
				desc = "保存成功！";
				code = "1";
			}
		}catch (Exception ex) {
			isSuccess = false;
			logger.errorWithNoException(ex.getMessage());
			ex.printStackTrace();
			desc = "保存失败。" + ex.getMessage();
			code = "0";
		}
		JSONObject jres = new JSONObject();
		jres.put("code", code);
		jres.put("desc", desc);
		context.setPrintOut(jres.toString());
	}
	
	//删除
	public void delete(WDKContext context) throws Exception {
		boolean isSuccess = true;
		String desc = "";
		String code = "";
		try{
			HashMap param=new HashMap();
			param.put("actionflag", context.getString("actionflag"));
			param.put("func_uuid", context.getString("func_uuid"));
			ResultBean ret = WQL.getWO("UUUMUA_0002")
					.addParamMap(param)
					.process(context.getConnectBean());
			isSuccess = ret.isSuccess();
			if(!ret.isSuccess()){
				StringBuffer sf = new StringBuffer();
				ArrayList errlist = ret.getInfoError();
				for(int i=0;i<errlist.size();i++){
					ErrorBean errBean = (ErrorBean)errlist.get(i);
					sf.append(errBean.toString());
				}
				desc = "删除失败。" + sf.toString();
				code = "0";
			} else {
				desc = "删除成功！";
				code = "1";
			}
		}catch (Exception ex) {
			isSuccess = false;
			logger.errorWithNoException(ex.getMessage());
			ex.printStackTrace();
			desc = "删除失败。" + ex.getMessage();
			code = "0";
		}
		JSONObject jres = new JSONObject();
		jres.put("code", code);
		jres.put("desc", desc);
		context.setPrintOut(jres.toString());
	}
	 
}