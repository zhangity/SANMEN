package com.longj.platform.busi.wdk.uum.avatar.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.jbpm.api.cmd.Environment;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.platform.busi.wdk.handler.SessionUser;
import com.longj.platform.busi.wdk.uum.UUM;
import com.longj.platform.busi.wdk.uum.avatar.BaseAvatar;

/**
 * 本部门虚拟角色解析类
 * @author stiffen_peng
 *
 */
public class MyOrgRoleAvatar extends BaseAvatar{
	private static WDKLogger logger = new WDKLogger(MyOrgRoleAvatar.class.getName());

	@Override
	public JSONArray getPersons(Environment environment,SessionUser sessionUser, String piid, String taskid,String avatarid, HashMap paraMap) {
		return getPersons(environment,sessionUser,piid,taskid,avatarid,paraMap,null);
	}

	public JSONArray getPersons(Environment environment,SessionUser sessionUser,String piid,String taskid,String avatarid,HashMap paraMap,ConnectBean conb ){
		JSONArray ret = new JSONArray();
		try{
			//取当前登录人所在部门
			String deptuuid = sessionUser.getDeptuuid();
			
			//取从虚拟角色参数中取角色标识
			WQLObject bc = WQLObject.getWQLObject("PF_PB_AvatarPara");
			if(bc==null) throw new Exception("业务组件【PF_PB_AvatarPara】不存在！");
			
			ResultBean resultBean = bc.query("avatar_uuid='"+avatarid+"' and para_code='role_uuid'","", conb);
			if(resultBean.isSuccess()==false){
				StringBuffer sf = new StringBuffer();
				ArrayList errlist = resultBean.getInfoError();
				for(int i=0;i<errlist.size();i++){
					ErrorBean errBean = (ErrorBean)errlist.get(i);
					sf.append(errBean.toString());
					sf.append("\n");
				}
				throw new Exception(sf.toString());
			}
			
			WQLData dataSet = resultBean.getWQLData(bc, 0);
			if(dataSet.getRowCount()==0){
				throw new Exception("虚拟角色ID："+avatarid+"，参数【role_uuid】不存在！");
			}
			
			dataSet.first();
			dataSet.next();
			String role_uuid = dataSet.getValue("para_value");//角色ID
			//取部门角色对应账户列表
			Set<String> accountsSet = new HashSet<String>();
			JSONArray roleaccounts = UUM.getRoleAccountList(role_uuid,deptuuid,conb);
			for(int i=0;i<roleaccounts.size();i++){
				JSONObject roleaccount = roleaccounts.getJSONObject(i);
				String account_uuid = roleaccount.getString("account_uuid");
				String org_uuid = roleaccount.getString("org_uuid");
				if(!accountsSet.contains(account_uuid) && org_uuid.equals(deptuuid)){
					accountsSet.add(account_uuid);
					//ret.add(row);
					//根据用户(账户)取人员信息
					JSONObject person = UUM.getPersonByAccountID(account_uuid,conb);
					if(person!=null && "0".equals(person.getString("sysisdelete"))){
						ret.add(person);
					}
				}
			}			
		}catch (Exception e) {
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
}