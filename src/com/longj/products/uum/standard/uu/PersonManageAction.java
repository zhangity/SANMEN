package com.longj.products.uum.standard.uu;

import java.util.ArrayList;
import java.util.HashMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import wql.WQLNames;

import org.wdk.WDK;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.core.util.Base64;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;

import com.longj.platform.busi.wdk.base.BaseActionMethod;
import com.longj.platform.pb.util.WQLUtil;

/**
 * 人员管理实现类
 * OrgManageAction
 * <p>
 * </p>
 * 版权：Copyright (c) 2015 杭州新世纪电子科技有限公司
 * <p>
 * </p>
 * 
 * @author zhangwf
 */
public class PersonManageAction extends BaseActionMethod {
	private static WDKLogger logger = new WDKLogger(PersonManageAction.class.getName());
	
	public void query( WDKContext context ) throws Exception  {
		boolean isSuccess = true;
		WQLData dataSet = null;
		JSONObject jrows = new JSONObject();
		String err = "";
		try{
			HashMap param=new HashMap();
			param.put("depart_uuid", context.getString("depart_uuid"));
			param.put("person_uuid", context.getString("person_uuid"));
			param.put("person_code", context.getString("person_code"));
			param.put("person_name", context.getString("person_name"));
			param.put("emp_no", context.getString("emp_no"));
			param.put("login_name", context.getString("login_name"));
			jrows = WQLUtil.getWQL(WQLNames.QUUMUU_0003)
					.addParamMap(param)
					.pageQuery(context.getRequest(), " display_order ASC",context.getConnectBean());
					//.process(context.getConnectBean());


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
		try{
			HashMap param=new HashMap();
			param.put("actionflag", actionflag);
			param.put("person_uuid", mainFieldValues.getString("person_uuid"));
			param.put("depart_uuid", mainFieldValues.getString("depart_uuid"));
			param.put("person_code", mainFieldValues.getString("person_code"));
			param.put("person_name", mainFieldValues.getString("person_name"));
			param.put("login_name", mainFieldValues.getString("login_name"));
			param.put("emp_no", mainFieldValues.getString("emp_no"));
			param.put("gender_scode", mainFieldValues.getString("gender_scode"));
			param.put("politics_scode", mainFieldValues.getString("politics_scode"));
			param.put("diploma_scode", mainFieldValues.getString("diploma_scode"));
			param.put("birth_date", mainFieldValues.getString("birth_date"));
			param.put("entry_date", mainFieldValues.getString("entry_date"));
			param.put("cer_type_scode", mainFieldValues.getString("cer_type_scode"));
			param.put("id_no", mainFieldValues.getString("id_no"));
			param.put("master_email", mainFieldValues.getString("master_email"));
			param.put("backup_email", mainFieldValues.getString("backup_email"));
			param.put("phone_no", mainFieldValues.getString("phone_no"));
			param.put("office_phone_no", mainFieldValues.getString("office_phone_no"));
			param.put("room_no", mainFieldValues.getString("room_no"));
			param.put("master_mobile", mainFieldValues.getString("master_mobile"));
			param.put("backup_mobile", mainFieldValues.getString("backup_mobile"));
			param.put("display_order", mainFieldValues.getString("display_order"));
			param.put("status_scode", mainFieldValues.getString("status_scode"));
			param.put("sign_pic", mainFieldValues.getString("sign_pic"));
			param.put("sign_picname", mainFieldValues.getString("sign_picname"));
			param.put("remark", mainFieldValues.getString("remark"));
			param.put("account_uuid", mainFieldValues.getString("account_uuid"));
			param.put("operator", mainFieldValues.getString("operator"));
			param.put("odt", mainFieldValues.getString("odt"));
			param.put("odepart", mainFieldValues.getString("odepart"));
			param.put("oorg", mainFieldValues.getString("oorg"));
			
			ResultBean ret = WQLUtil.getWQL("UUUMUU_0004") 
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
			
			// 将用户信息同步其他系统
			context.setAttribute("login_name", mainFieldValues.getString("login_name"));
			context.setAttribute("actionflag", actionflag);
//			TransferOtherSystem.updateUserMessage(context);
		} else {
			jres.put("code", "0");
			jres.put("desc", "保存失败！\n" + err);
		}
		context.setPrintOut(jres.toString());
	}
	
	//删除
	public void delete(WDKContext context) throws Exception {
		boolean isSuccess = true;
		String err = "";
		JSONObject jres = new JSONObject();
		try{
			HashMap param=new HashMap();
			param.put("actionflag", context.getString("actionflag"));
			param.put("person_uuid", context.getString("person_uuid"));
			param.put("account_uuid", context.getString("account_uuid"));
			
			ResultBean ret = WQLUtil.getWQL("UUUMUU_0004")
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
				logger.errorWithNoException("---mam---"+err);
				jres.put("code", "0");
				jres.put("desc", "删除失败！\n" + err);
			}
		}catch (Exception ex) {
			isSuccess = false;
			err = ex.getMessage();
			logger.errorWithNoException("---mam---"+err);
			ex.printStackTrace();
			jres.put("code", "0");
			jres.put("desc", "删除失败！\n" + err);
		}
		
		if (isSuccess) {
			jres.put("code", "1");
			jres.put("desc", "删除成功！");
			
			// 将用户信息同步其它系统		删除暂时不同步
		/*	context.setAttribute("account_uuid", context.getString("account_uuid"));
			context.setAttribute("actionflag", context.getString("actionflag"));
			TransferOtherSystem.updateUserMessage(context);*/
		} else {
			jres.put("code", "0");
			jres.put("desc", "删除失败！\n" + err);
		}
		context.setPrintOut(jres.toString());
	}
	
	public void queryDepartEX( WDKContext context ) throws Exception  {
		boolean isSuccess = true;
		WQLData dataSet = null;
		JSONArray jrows = null;
		String err = "";
		try{
			HashMap param=new HashMap();
			param.put("person_uuid", context.getString("person_uuid"));
			ResultBean ret = WQLUtil.getWQL(WQLNames.QUUMUU_0003)
					.addParamMap(param)
					.process(context.getConnectBean());
			dataSet = ret.getWQLData(1);
			
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
	
	public void queryDtl( WDKContext context ) throws Exception  {
		boolean isSuccess = true;
		WQLData dataSet = null;
		JSONArray jrows = null;
		String err = "";
		try{
			HashMap param=new HashMap();
			param.put("person_uuid", context.getString("person_uuid"));
			ResultBean ret = WQLUtil.getWQL(WQLNames.QUUMUU_0003)
					.addParamMap(param)
					.process(context.getConnectBean());
			dataSet = ret.getWQLData(0);
			
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
	
	//重置密码
	public void reset(WDKContext context) throws Exception {
		boolean isSuccess = true;
		String err = "";
		JSONObject jres = new JSONObject();
		try{
			String rp_login_pwd = context.getString("login_pwd");
			String ecd_loginpwd = Base64.encode2String(rp_login_pwd);
			HashMap param=new HashMap();
			param.put("actionflag", context.getString("actionflag"));
			param.put("person_uuid", context.getString("person_uuid"));
			param.put("login_pwd", ecd_loginpwd);
			param.put("operator", context.getString("operator"));
			param.put("odt", context.getString("odt"));
			param.put("odepart", context.getString("odepart"));
			param.put("oorg", context.getString("oorg"));
			
			ResultBean ret = WQLUtil.getWQL("UUUMUU_0005")
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
		
		if (isSuccess) {
			jres.put("code", "1");
			jres.put("desc", "重置密码成功！");
			
			// 将用户信息同步到大蚂蚁服务端 -- 重置密码不同步
			/*context.setAttribute("person_uuid", context.getString("person_uuid"));
			context.setAttribute("actionflag", context.getString("actionflag"));
			TransferOtherSystem.updateUserMessage(context);*/
		} else {
			jres.put("code", "0");
			jres.put("desc", "重置密码失败！\n" + err);
		}

		context.setPrintOut(jres.toString());
	}
	
	public void getLDepart( WDKContext context ) throws Exception  {
		JSONArray ret = null;
		try{
			HashMap param=new HashMap();
			param.put("person_uuid", context.getString("person_uuid"));
			param.put("actionflag", context.getString("actionflag"));
			param.put("org_uuid", context.getString("org_uuid"));
			
			ResultBean resultBean = WQLUtil.getWQL(WQLNames.QUUMUU_0004)
					.addParamMap(param)
					.process(context.getConnectBean());
			if(resultBean.isSuccess()){
				ret = resultBean.getResultJSONArray(0);
			}else{
				ret = new JSONArray();
				logger.errorWithNoException("取兼职可选部门列表错误：");
				ArrayList errList = resultBean.getInfoError();
				for(int i=0;i<errList.size();i++){
					ErrorBean err = (ErrorBean)errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
			ret = WDK.DataFormat_Tree(ret, "node_uuid", "node_name", "parent_uuid");
		}catch(Exception e){
			logger.errorWithNoException("取兼职可选部门列表错误："+e.getMessage());
			e.printStackTrace();
		}
		logger.errorWithNoException("---mam---"+ret.toString());
		context.setPrintOut(ret.toString());
		
	}
	
	public void getRDepart( WDKContext context ) throws Exception  {
		JSONArray ret = null;
		try{
			HashMap param=new HashMap();
			param.put("person_uuid", context.getString("person_uuid"));
			param.put("actionflag", context.getString("actionflag"));
			param.put("org_uuid", context.getString("org_uuid"));
			
			ResultBean resultBean = WQLUtil.getWQL(WQLNames.QUUMUU_0004)
					.addParamMap(param)
					.process(context.getConnectBean());
			if(resultBean.isSuccess()){
				ret = resultBean.getResultJSONArray(0);
			}else{
				ret = new JSONArray();
				logger.errorWithNoException("取兼职已选部门列表错误：");
				ArrayList errList = resultBean.getInfoError();
				for(int i=0;i<errList.size();i++){
					ErrorBean err = (ErrorBean)errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
			ret = WDK.DataFormat_Tree(ret, "node_uuid", "node_name", "parent_uuid");
		}catch(Exception e){
			logger.errorWithNoException("取兼职已选部门列表错误："+e.getMessage());
			e.printStackTrace();
		}
		logger.errorWithNoException("---mam---"+ret.toString());
		context.setPrintOut(ret.toString());
	}
	
	//重置密码
	public void SetDepartEX(WDKContext context) throws Exception {
		boolean isSuccess = true;
		String err = "";
		JSONObject jres = new JSONObject();
		//String[] skip_number ;
		try{
			HashMap param=new HashMap();
			param.put("actionflag", context.getString("actionflag"));
			param.put("person_uuid", context.getString("person_uuid"));
			param.put("detailcount", context.getString("detailcount"));
			param.put("depart_uuidarr", context.getString("depart_uuidarr").split(","));
			
			logger.errorWithNoException("---mam---"+context.getString("depart_uuidarr"));
		
			ResultBean ret = WQLUtil.getWQL("UUUMUU_0006")
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
		
		if (isSuccess) {
			jres.put("code", "1");
			jres.put("desc", "重置密码成功！");
		} else {
			jres.put("code", "0");
			jres.put("desc", "重置密码失败！\n" + err);
		}

		context.setPrintOut( jres.toString());
	}
	
	
	//权限复制
	public void exeRoleCopy(WDKContext context) throws Exception {
		JSONObject jres = new JSONObject();
		HashMap<String,String> param=new HashMap<String,String>();
		param.put("actionflag", context.getString("actionflag"));
		param.put("person_uuid", context.getString("person_uuid"));
		param.put("copytoaccountid", context.getString("copytoaccountid"));
		
		WQLUtil.getWQL("UUUMUU_0007")
				.addParamMap(param)
				.process(context.getConnectBean());
		
		jres.put("code", "1");
		context.setPrintOut( jres.toString());
	}
}