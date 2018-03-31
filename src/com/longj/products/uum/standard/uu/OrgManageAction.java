package com.longj.products.uum.standard.uu;

import java.util.ArrayList;
import java.util.HashMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import wql.WQLNames;

import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;

import com.longj.platform.busi.wdk.base.BaseActionMethod;
import com.longj.platform.pb.util.WQLUtil;

/**
 * 组织机构管理实现类
 * OrgManageAction
 * <p>
 * </p>
 * 版权：Copyright (c) 2015 杭州新世纪电子科技有限公司
 * <p>
 * </p>
 * 
 * @author zhangwf
 */
public class OrgManageAction extends BaseActionMethod {
	private static WDKLogger logger = new WDKLogger(OrgManageAction.class.getName());
	
	public void query( WDKContext context ) throws Exception  {
		boolean isSuccess = true;
		WQLData dataSet = null;
		JSONArray jrows = null;
		String err = "";
		try{
			HashMap param=new HashMap();
			param.put("org_uuid", context.getString("org_uuid"));
			ResultBean ret = WQLUtil.getWQL(WQLNames.QUUMUU_0001)
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
	
	//保存
	public void save(WDKContext context) throws Exception {
		boolean isSuccess = true;
		String err = "";
		String actionflag = context.getString("actionflag");
		JSONObject mainFieldValues = JSONObject.fromObject( context.getString("_FILEDVALUE"));
		String oldpath = "";
		try{
			HashMap param=new HashMap();
			param.put("actionflag", actionflag);
			param.put("org_uuid", mainFieldValues.getString("org_uuid"));
			param.put("parent_uuid", mainFieldValues.getString("parent_uuid"));
			param.put("org_name", mainFieldValues.getString("org_name"));
			param.put("simple_name", mainFieldValues.getString("simple_name"));
			param.put("org_code", mainFieldValues.getString("org_code"));
			param.put("org_type_scode", mainFieldValues.getString("org_type_scode"));
			param.put("org_level_scode", mainFieldValues.getString("org_level_scode"));
			param.put("display_order", mainFieldValues.getString("display_order"));
			param.put("remark", mainFieldValues.getString("remark"));
			param.put("operator", mainFieldValues.getString("syscreatoruuid"));
			param.put("odt", mainFieldValues.getString("syscreatedate"));
			param.put("odepart", mainFieldValues.getString("sysdeptuuid"));
			param.put("oorg", mainFieldValues.getString("syscompanyuuid"));
			param.put("manage_unit_uuid", mainFieldValues.getString("manage_unit_uuid"));
			
			// 1.1将组织机构信息同步到大蚂蚁服务端--需要获取老的path
//			oldpath = TransferBigAnt.getOrgPathByExtID(mainFieldValues.getString("org_uuid"), context.getConnectBean());
			ResultBean ret = WQLUtil.getWQL("UUUMUU_0001")
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
				err=sf.toString();
			}
		}catch (Exception ex) {
			isSuccess = false;
			err = ex.getMessage();
			logger.errorWithNoException(err);
			ex.printStackTrace();
		}
		JSONObject jres = new JSONObject();
		if (isSuccess) {
			jres.put("code", "1");
			jres.put("desc", "保存成功！");
			
			//同步到其它系统
			context.setAttribute("oldpath", oldpath);
			context.setAttribute("org_uuid", mainFieldValues.getString("org_uuid"));
			context.setAttribute("actionflag", actionflag);
//			TransferOtherSystem.updateGroupMessage(context);
			
		} else {
			jres.put("code", "0");
			jres.put("desc", "保存失败！\n" + err);
		}

		context.setPrintOut(jres.toString());
	}
	
	//保存
	public void delete(WDKContext context) throws Exception {
		boolean isSuccess = true;
		String desc = "";
		String code = "";
		String oldpath = "";
		try{
			HashMap param=new HashMap();
			param.put("actionflag", context.getString("actionflag"));
			param.put("org_uuid", context.getString("org_uuid"));
			
			// 1.1将组织机构信息同步到大蚂蚁服务端--需要获取老的path
//			oldpath = TransferBigAnt.getOrgPathByExtID(context.getString("org_uuid"), context.getConnectBean());
						
			ResultBean ret = WQLUtil.getWQL("UUUMUU_0001")
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
				desc = "删除失败。" + sf.toString();
				code = "0";
			}else{
				desc = "删除成功！";
				code = "1";
				
				// 1.2将组织机构信息同步到其他系统		删除暂时不同步
				/*context.setAttribute("org_uuid", context.getString("org_uuid"));
				context.setAttribute("oldpath", oldpath);
				context.setAttribute("actionflag", context.getString("actionflag"));
				TransferOtherSystem.updateGroupMessage(context);*/
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