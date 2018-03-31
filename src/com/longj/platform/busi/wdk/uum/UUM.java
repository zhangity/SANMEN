package com.longj.platform.busi.wdk.uum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.jbpm.api.cmd.Environment;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;

import wql.WQLNames;

import com.longj.platform.busi.wdk.handler.SessionUser;
import com.longj.platform.busi.wdk.uum.avatar.BaseAvatar;

public class UUM {
	private static WDKLogger logger = new WDKLogger(UUM.class.getName());
	
	/**
	 * 取应用列表
	 * @param conb
	 * @return
	 */
	public static JSONArray getAppList(ConnectBean conb){
		JSONArray ret = null;
		try{
		
			ResultBean resultBean = WQL.getWO(WQLNames.QPFPB_RL0001)
			.process(conb);
			if(resultBean.isSuccess()){
				ret = resultBean.getResultJSONArray(0);
			}else{
				ret = new JSONArray();
				logger.errorWithNoException("取应用列表错误：");
				ArrayList errList = resultBean.getInfoError();
				for(int i=0;i<errList.size();i++){
					ErrorBean err = (ErrorBean)errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
		}catch(Exception e){
			logger.errorWithNoException("取应用列表错误："+e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	
	/**
	 * 取应用功能列表
	 * @param parent_uuid 上级标识
	 * @param role_uuid 角色标识
	 * @param func_type 功能类型
	 * @param issync 是否同步
	 * @param conb
	 * @return
	 */
	public static JSONArray getFuncList(String parent_uuid,String role_uuid,String func_type,String issync,ConnectBean conb){
		JSONArray ret = null;
		try{
		
			ResultBean resultBean = WQL.getWO(WQLNames.QPFPB_RL0006)
					.addParam("parent_uuid", parent_uuid)
					.addParam("role_uuid", role_uuid)
					.addParam("func_type", func_type)
					.addParam("issync", issync)
					.addParam("sysisdelete", "0")
					.process(conb);
			if(resultBean.isSuccess()){
				ret = resultBean.getResultJSONArray(0);
			}else{
				ret = new JSONArray();
				logger.errorWithNoException("取应用功能列表错误：");
				ArrayList errList = resultBean.getInfoError();
				for(int i=0;i<errList.size();i++){
					ErrorBean err = (ErrorBean)errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
		}catch(Exception e){
			logger.errorWithNoException("取应用功能列表错误："+e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	
	/**
	 * 取应用角色列表
	 * @param parent_uuid 上级标识
	 * @param org_uuid 机构标识
	 * @param role_type 角色类型
	 * @param issync 是否同步
	 * @param conb
	 * @return
	 */
	public static JSONArray getRoleList(String parent_uuid,String org_uuid,String role_type,String issync,ConnectBean conb){
		JSONArray ret = null;
		try{
		
			ResultBean resultBean = WQL.getWO(WQLNames.QPFPB_RL0007)
					.addParam("parent_uuid", parent_uuid)
					.addParam("org_uuid", org_uuid)
					.addParam("role_type", role_type)
					.addParam("issync", issync)
					.process(conb);
			if(resultBean.isSuccess()){
				ret = resultBean.getResultJSONArray(0);
			}else{
				ret = new JSONArray();
				logger.errorWithNoException("取应用角色列表错误：");
				ArrayList errList = resultBean.getInfoError();
				for(int i=0;i<errList.size();i++){
					ErrorBean err = (ErrorBean)errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
		}catch(Exception e){
			logger.errorWithNoException("取应用角色列表错误："+e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}

	/**
	 * 取组织用户列表
	 * @param manage_unit_uuid 管理单元标识
	 * @param person_uuid 操作人员标识
	 * @param role_uuid 角色标识
	 * @param parent_uuid 上级组织标识
	 * @param user_type 用户类型
	 * @param isctrlperm 是否控制权限
	 * @param issync 是否同步
	 * @param conb
	 * @return
	 */
	public static JSONArray getOrgAccountList(String manage_unit_uuid,String person_uuid,String role_uuid,String parent_uuid,String user_type,String isctrlperm,String issync,ConnectBean conb){
		JSONArray ret = null;
		try{
			
			ResultBean resultBean = WQL.getWO(WQLNames.QPFPB_RL0008)
			.addParam("manage_unit_uuid", manage_unit_uuid)
			.addParam("person_uuid", person_uuid)
			.addParam("role_uuid", role_uuid)
			.addParam("parent_uuid", parent_uuid)
			.addParam("isctrlperm", isctrlperm)
			.addParam("user_type", user_type)
			.addParam("issync", issync)
			.process(conb);
			if(resultBean.isSuccess()){
				ret = resultBean.getResultJSONArray(0);
			}else{
				ret = new JSONArray();
				logger.errorWithNoException("取组织用户列表错误：");
				ArrayList errList = resultBean.getInfoError();
				for(int i=0;i<errList.size();i++){
					ErrorBean err = (ErrorBean)errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
		}catch(Exception e){
			logger.errorWithNoException("取组织用户列表错误："+e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	
	/**
	 * 取组织机构列表
	 * @param manage_unit_uuid 管理单元标识
	 * @param person_uuid 操作人员标识
	 * @param role_uuid 角色标识
	 * @param parent_uuid 上级组织标识
	 * @param org_type_scode 组织类型
	 * @param org_level_scode 组织级别
	 * @param isctrlperm 是否控制权限
	 * @param issync 是否同步
	 * @param conb
	 * @return
	 */
	public static JSONArray getOrgList(String manage_unit_uuid,String person_uuid,String role_uuid,String parent_uuid,String org_type_scode,String org_level_scode,String isctrlperm,String issync, ConnectBean conb){
		JSONArray ret = null;
		try{			
			ResultBean resultBean = WQL.getWO(WQLNames.QPFPB_OG0001)
				.addParam("manage_unit_uuid", manage_unit_uuid)
				.addParam("person_uuid", person_uuid)
				.addParam("role_uuid", role_uuid)
				.addParam("parent_uuid", parent_uuid)
				.addParam("org_type_scode", org_type_scode)
				.addParam("org_level_scode", org_level_scode)
				.addParam("isctrlperm", isctrlperm)
				.addParam("issync", issync)
				.process(conb);
			if(resultBean.isSuccess()){
				ret = resultBean.getResultJSONArray(0);
			}else{
				ret = new JSONArray();
				logger.errorWithNoException("取组织机构列表错误：");
				ArrayList errList = resultBean.getInfoError();
				for(int i=0;i<errList.size();i++){
					ErrorBean err = (ErrorBean)errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
		}catch(Exception e){
			logger.errorWithNoException("取组织机构列表错误："+e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	
	/**
	 * 根据组织ID获取组织机构信息
	 * @param org_uuid
	 * @return
	 */
	public static JSONObject getOrgByID(String org_uuid,ConnectBean conb){
		JSONObject ret = null;
		try{			
			WQLObject bc =  WQLObject.getWQLObject("UUM_UU_ORGINFO");
			if(bc==null) throw new Exception("WQLObject【UUM_UU_ORGINFO】不存在！");
			ResultBean resultBean = bc.query("org_uuid='"+org_uuid+"'","", conb);
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
			JSONArray rows = resultBean.getResultJSONArray(0);
			if(rows.size()>0){
				ret = rows.getJSONObject(0);
			}else{
				logger.debug("组织标识["+org_uuid+"]记录不存在！");
			}
		}catch(Exception e){
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	
	/**
	 * 根据外部标识取组织PATH
	 * @param ext_id
	 * @param conb
	 * @return
	 */
	public static String getOrgPathByExtID(String ext_id,ConnectBean conb){
		String path = "";
		String org_uuid = "";
		try{
			StringBuffer sb = new StringBuffer();
			WQLObject bc =  WQLObject.getWQLObject("UUM_UU_ORGINFO");
			if(bc==null) throw new Exception("WQLObject【UUM_UU_ORGINFO】不存在！");
			//先根据ext_id查找org_uuid
			ResultBean resultBean = bc.query("ext_id='"+ext_id+"' and sysisdelete='0'","", conb);
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
			WQLData wd = resultBean.getWQLData(bc, 0);
			if(wd.getRowCount()>0){
				wd.first();
				wd.next();
				org_uuid = wd.getValue("org_uuid");
				//循环向上遍历整个组织结构
				boolean existparent = true;				
				while(existparent){
					resultBean = bc.query("org_uuid='"+org_uuid+"'","", conb);
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
					wd = resultBean.getWQLData(bc, 0);
					if(wd.getRowCount()>0){
						wd.first();
						wd.next();
						if(sb.length()>0){
							sb.insert(0, "/");
						}
						org_uuid = wd.getValue("parent_uuid");
						sb.insert(0,wd.getValue("org_name"));
						if("-1".equals(org_uuid)){
							existparent = false;
						}
					}else{
						existparent = false;
					}
				}
				path = sb.toString();
			}
		}catch(Exception e){
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		return path;
	}
	/**
	 * 取组织人员列表
	 * @param manage_unit_uuid 管理单元标识
	 * @param person_uuid 操作人员标识
	 * @param role_uuid 角色标识
	 * @param parent_uuid 上级组织标识
	 * @param isctrlperm 是否控制权限
	 * @param issync 是否同步
	 * @param conb
	 * @return
	 */
	public static JSONArray getOrgPersonList(String manage_unit_uuid,String person_uuid,String role_uuid,String parent_uuid,String isctrlperm,String issync, ConnectBean conb){
		JSONArray ret = null;
		try{			
			ResultBean resultBean = WQL.getWO(WQLNames.QPFPB_OG0002)
			.addParam("manage_unit_uuid", manage_unit_uuid)
			.addParam("person_uuid", person_uuid)
			.addParam("role_uuid", role_uuid)
			.addParam("parent_uuid", parent_uuid)
			.addParam("isctrlperm", isctrlperm)
			.addParam("issync", issync)
			.process(conb);
			if(resultBean.isSuccess()){
				ret = resultBean.getResultJSONArray(0);
			}else{
				ret = new JSONArray();
				logger.errorWithNoException("取组织人员列表错误：");
				ArrayList errList = resultBean.getInfoError();
				for(int i=0;i<errList.size();i++){
					ErrorBean err = (ErrorBean)errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
		}catch(Exception e){
			logger.errorWithNoException("取组织人员列表错误："+e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	
	/**
	 * 根据人员ID取人员兼职部门列表
	 * @param person_uuid
	 * @param conb
	 * @return
	 */
	public static JSONArray getPersonDeptEX(String person_uuid,ConnectBean conb){
		JSONArray ret = new JSONArray();
		try{
			StringBuffer sb = new StringBuffer();
			WQLObject bc =  WQLObject.getWQLObject("UUM_UU_PERSONDEPTEX");
			if(bc==null) throw new Exception("WQLObject【UUM_UU_PERSONDEPTEX】不存在！");
			ResultBean resultBean = bc.query("person_uuid = '"+person_uuid+"'","", conb);
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
			WQLData wd = resultBean.getWQLData(bc, 0);
			if(wd.getRowCount()>0){
				wd.first();
				while(wd.next()){
					if(sb.length()>0) sb.append(",");
					sb.append("'").append(wd.getValue("depart_uuid")).append("'");
				}
				
				bc =  WQLObject.getWQLObject("UUM_UU_ORGINFO");
				if(bc==null) throw new Exception("WQLObject【UUM_UU_ORGINFO】不存在！");
				resultBean = bc.query("org_uuid in ("+sb.toString()+")","", conb);
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
				ret = resultBean.getResultJSONArray(0);
			}
		}catch(Exception e){
			logger.errorWithNoException("取人员兼职部门错误："+e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	
	/**
	 * 取人员列表
	 * @param manage_unit_uuid 管理单元标识
	 * @param person_uuid 操作人员标识
	 * @param role_uuid 角色标识
	 * @param parent_uuid 上级组织标识
	 * @param isctrlperm 是否控制权限
	 * @param conb
	 * @return
	 */
	public static JSONArray getPersonList(String manage_unit_uuid,String person_uuid,String role_uuid,String parent_uuid,String isctrlperm, ConnectBean conb){
		JSONArray ret = null;
		try{			
			ResultBean resultBean = WQL.getWO(WQLNames.QPFPB_OG0002)
			.addParam("manage_unit_uuid", manage_unit_uuid)
			.addParam("person_uuid", person_uuid)
			.addParam("role_uuid", role_uuid)
			.addParam("parent_uuid", parent_uuid)
			.addParam("isctrlperm", isctrlperm)
			.addParam("issync", "0")
			.process(conb);
			if(resultBean.isSuccess()){
				ret = resultBean.getResultJSONArray(0);
				for(int i=ret.size()-1;i>=0;i--){
					JSONObject row = ret.getJSONObject(i);
					String typeorder = row.getString("typeorder");
					if(!"2".equals(typeorder)){
						ret.remove(row);
					}
				}
			}else{
				ret = new JSONArray();
				logger.errorWithNoException("取人员列表错误：");
				ArrayList errList = resultBean.getInfoError();
				for(int i=0;i<errList.size();i++){
					ErrorBean err = (ErrorBean)errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
		}catch(Exception e){
			logger.errorWithNoException("取人员列表错误："+e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	
	/**
	 * 根据人员ID取人员信息(单人员)
	 * @param person_uuid
	 * @param conb
	 * @return
	 */
	public static JSONObject getPersonByID(String person_uuid,ConnectBean conb){
		JSONObject ret = null;
		try{
			
			WQLObject bc =  WQLObject.getWQLObject("UUM_UU_PERSONINFO");
			if(bc==null) throw new Exception("WQLObject【UUM_UU_PERSONINFO】不存在！");
			ResultBean resultBean = bc.query("person_uuid = '"+person_uuid+"'","", conb);
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
			JSONArray rows = resultBean.getResultJSONArray(0);
			if(rows.size()>0){
				ret = rows.getJSONObject(0);
			}else{
				logger.debug("人员标识["+person_uuid+"]记录不存在！");
			}
		}catch(Exception e){
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	
	/**
	 * 根据人员ID取人员信息(多人员)
	 * @param person_uuid
	 * @param conb
	 * @return
	 */
	public static JSONArray getPersonListByID(String person_uuid,ConnectBean conb){
		JSONArray ret = new JSONArray();
		try{
			
			WQLObject bc =  WQLObject.getWQLObject("UUM_UU_PERSONINFO");
			if(bc==null) throw new Exception("WQLObject【UUM_UU_PERSONINFO】不存在！");
			ResultBean resultBean = null;
			if(person_uuid.indexOf(",")>-1){
				resultBean = bc.query("person_uuid IN ( '"+person_uuid+"' )","", conb);
			}else{
				resultBean = bc.query("person_uuid = '"+person_uuid+"'","", conb);
			}
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
			ret = resultBean.getResultJSONArray(0);
		}catch(Exception e){
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	
	public static JSONArray getPersonListByRoleID(String role_uuid,String org_uuid,ConnectBean conb){
		JSONArray ret = new JSONArray();
		try{
//			WQLObject bc = WQLObject.getWQLObject("UUM_UA_ROLE");
//			if(bc==null) throw new Exception("WQLObject【UUM_UA_ROLE】不存在！");
//			ResultBean resultBean = bc.query( "role_uuid='"+role_uuid+"' and sysisdelete='0'", "",conb);
//			if(resultBean.isSuccess()==false){
//				StringBuffer sf = new StringBuffer();
//				ArrayList errlist = resultBean.getInfoError();
//				for(int i=0;i<errlist.size();i++){
//					ErrorBean errBean = (ErrorBean)errlist.get(i);
//					sf.append(errBean.toString());
//					sf.append("\n");
//				}
//				throw new Exception(sf.toString());
//			}
//			JSONArray rows = resultBean.getResultJSONArray(0);
//			if(rows.size()==0){
//				logger.debug("角色标识["+role_uuid+"]记录不存在或已删除！");
//			}else{
//				//根据角色取用户(账户)
//				Set<String> accountsSet = new HashSet<String>();
//				JSONArray roleaccounts = UUM.getRoleAccountListByRoleID(role_uuid,conb);
//				for(int i=0;i<roleaccounts.size();i++){
//					JSONObject roleaccount = roleaccounts.getJSONObject(i);
//					String account_uuid = roleaccount.getString("account_uuid");
//					if(!accountsSet.contains(account_uuid)){
//						accountsSet.add(account_uuid);
//						//ret.add(row);
//						//根据用户(账户)取人员信息
//						JSONObject person = UUM.getPersonByAccountID(account_uuid,conb);
//						if(person!=null && "0".equals(person.getString("sysisdelete"))){
//							ret.add(person);
//						}
//					}
//				}
//			}
			
			//处理role_uuid中的单引号,将单引号替换成关键字，避免单个引号被替换成两个单引号
			//role_uuid = uString._replaceStr(role_uuid,"'",WQLFun.SINGLEQUOTES);
			
			//处理role_uuid，在两边加上单引号
			if(role_uuid!=null && role_uuid.trim().length()>0){
				role_uuid = role_uuid.replaceAll(",", "','");
				role_uuid = "'" + role_uuid + "'";
			}
			
			ResultBean resultBean = WQL.getWO(WQLNames.QPFPB_RL0011)
				.addParam("role_uuid", role_uuid)
				.addParam("org_uuid", org_uuid)
				.process(conb);
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
			ret = resultBean.getResultJSONArray(0); 
		}catch(Exception e){
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	
	/**
	 * 根据角色ID取人员列表
	 * @param role_uuid
	 * @param conb
	 * @return
	 */
	public static JSONArray getPersonListByRoleID(String role_uuid,ConnectBean conb){
		return getPersonListByRoleID(role_uuid,"",conb);
	}
	
	/**
	 * 根据角色ID取角色用户(账户)列表
	 * @param role_uuid
	 * @param conb
	 * @return
	 */
	public static JSONArray getRoleAccountListByRoleID(String role_uuid,ConnectBean conb){
		return getRoleAccountList(role_uuid,"",conb);
	}
	
	/**
	 * 取角色用户(账户)列表
	 * @param role_uuid
	 * @param org_uud
	 * @param conb
	 * @return
	 */
	public static JSONArray getRoleAccountList(String role_uuid,String org_uud,ConnectBean conb){
		JSONArray ret = new JSONArray();
		try{
			WQLObject bc = WQLObject.getWQLObject("UUM_UA_ROLEACCOUNT");
			if(bc==null) throw new Exception("WQLObject【UUM_UA_ROLEACCOUNT】不存在！");
			StringBuffer sch = new StringBuffer();
			if(!"".equals(role_uuid)){
				if(sch.length()>0) sch.append(" and ");
				sch.append("role_uuid='").append(role_uuid).append("'");
			}
			if(!"".equals(org_uud)){
				if(sch.length()>0) sch.append(" and ");
				sch.append("org_uuid='").append(org_uud).append("'");
			}
			ResultBean resultBean = bc.query(sch.toString(),"" , conb);
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
			ret = resultBean.getResultJSONArray(0);
		}catch(Exception e){
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	
	/**
	 * 根据用户ID取人员信息
	 * @param account_uuid
	 * @param conb
	 * @return
	 */
	public static JSONObject getPersonByAccountID(String account_uuid,ConnectBean conb){
		JSONObject ret = null;
		try{
			WQLObject bc = WQLObject.getWQLObject("UUM_UU_ACCOUNT");
			if(bc==null) throw new Exception("WQLObject【UUM_UU_ACCOUNT】不存在！");
			ResultBean resultBean = bc.query("account_uuid='"+account_uuid+"' and sysisdelete='0'","", conb);
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
			JSONArray rows = resultBean.getResultJSONArray(0);
			if(rows.size()>0){
				JSONObject account = rows.getJSONObject(0);
				String user_scode = account.getString("user_scode");//用户类型
				String user_uuid = account.getString("user_uuid");	//用户标识
				if("U092".equals(user_scode)){
					//仅当用户类型是人员时处理
					ret = UUM.getPersonByID(user_uuid, conb);
				}
			}else{
				logger.debug("用户标识["+account_uuid+"]记录不存在或已删除！");
			}
		}catch(Exception e){
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	
	/**
	 * 取虚拟角色列表
	 * @param app_uuid
	 * @param conb
	 * @return
	 */
	public static JSONArray getAvatarList(String app_uuid,ConnectBean conb){
		JSONArray ret = new JSONArray();
		try{
			WQLObject wo = WQLObject.getWQLObject("PF_PB_Avatar");
			if(wo==null) throw new Exception("WQLObject【PF_PB_Avatar】不存在！");
			StringBuffer sch = new StringBuffer();
			sch.append("sysisdelete = '0'");
			if(!"".equals(app_uuid)){
				if(sch.length()>0) sch.append(" and ");
				sch.append("app_uuid='").append(app_uuid).append("'");
			}
			ResultBean resultBean = wo.query(sch.toString(),"" , conb);
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
			ret = resultBean.getResultJSONArray(0);
		}catch(Exception e){
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	
	/**
	 * 人员ID组转换成人员信息数组
	 * @param ids 人员ID列表
	 * @param conb 数据库连接
	 * @return
	 */
	public static JSONArray personids2personList(List<String> ids,ConnectBean conb){
		JSONArray ret = new JSONArray();
		Set<String> personSet = new HashSet<String>();
		try{
			if(ids!=null){
				StringBuffer sb = new StringBuffer();
				for(int i=0;i<ids.size();i++){
					String id = (String)ids.get(i);
					if(sb.length()>0) sb.append("','");
					sb.append(id);
				}
				logger.debug("personids2personList ids="+sb.toString());
				JSONArray rows = UUM.getPersonListByID(sb.toString(),conb);
				for(int j=0;j<rows.size();j++){
					JSONObject row = rows.getJSONObject(j);
					if("0".equals(row.getString("sysisdelete"))){
						String person_uuid = row.getString("person_uuid");//人员标识
						if(!personSet.contains(person_uuid)){
							personSet.add(person_uuid);
							ret.add(row);
						}
					}
				}
			}
		}catch (Exception e) {
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	
	/**
	 * 角色组转换成人员信息
	 * @param ids 角色ID列表
	 * @param conb 数据库连接
	 * @return
	 */
	public static JSONArray roleids2personList(List<String> ids,ConnectBean conb){
		JSONArray ret = new JSONArray();
		Set<String> personSet = new HashSet<String>();
		try{
			if(ids!=null){
				StringBuffer sb = new StringBuffer();
				for(int i=0;i<ids.size();i++){
					String id = (String)ids.get(i);
					if(sb.length()>0) sb.append(",");
					sb.append(id);
				}
				logger.debug("roleids2personList ids="+sb.toString());
				JSONArray rows = UUM.getPersonListByRoleID(sb.toString(),conb);
				for(int j=0;j<rows.size();j++){
					JSONObject row = rows.getJSONObject(j);
					String person_uuid = row.getString("depart_uuid")+"."+row.getString("person_uuid");//部门标识.人员标识作为唯一表示，因为人员可能兼职多个部门
					if(!personSet.contains(person_uuid)){
						personSet.add(person_uuid);
						ret.add(row);
					}
				}
			}
		}catch (Exception e) {
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
		
	/**
	 * 虚拟角色ID组转换成人员信息
	 * @param environment
	 * @param sessionUser 登录信息
	 * @param piid 流程实例ID
	 * @param taskid 待办ID
	 * @param ids 虚拟角色ID列表
	 * @param conb 数据库连接
	 * @return
	 */
	public static JSONArray avatarids2personList(Environment environment,SessionUser sessionUser,String piid,String taskid,List<String> ids, ConnectBean conb,String nextnodename,String bdlcode){
		JSONArray ret = new JSONArray();
		Set<String> personSet = new HashSet<String>();
		HashMap param = new HashMap();
		param.put("_NEXT_NODE", nextnodename);
		param.put("_BDL_CODE", bdlcode);
		try{
			//虚拟角色
			WQLObject bc = WQLObject.getWQLObject("PF_PB_Avatar");
			if(bc==null) new Exception("WQLObject【PF_PB_Avatar】不存在！");
			for(int i=0;i<ids.size();i++){
				String avatar_uuid = (String)ids.get(i);
				ResultBean resultBean =  bc.query("avatar_uuid='"+avatar_uuid+"' and sysisdelete='0'","", conb);
				if(resultBean.isSuccess()==false){
					StringBuffer sf = new StringBuffer();
					ArrayList errlist = resultBean.getInfoError();
					for(int j=0;j<errlist.size();j++){
						ErrorBean errBean = (ErrorBean)errlist.get(j);
						sf.append(errBean.toString());
						sf.append("\n");
					}
					throw new Exception(sf.toString());
				}
				WQLData dataSet = resultBean.getWQLData(bc, 0);
				if(dataSet.getRowCount()==0){
					throw new Exception("虚拟角色ID："+avatar_uuid+"，不存在！");
				}
				
				dataSet.first();
				dataSet.next();
				String class_name = dataSet.getValue("class_name");
				if("".equals(class_name)) new Exception("虚拟角色ID："+avatar_uuid+"，解析类为空！");
				//发射虚拟角色解析类
				Class<?> c = Class.forName(class_name);
				//转换成虚拟角色基类
				BaseAvatar avatar = (BaseAvatar)c.newInstance();
				JSONArray rows = avatar.getPersons(environment,sessionUser, piid, taskid, avatar_uuid,param,conb);
				for(int j=0;j<rows.size();j++){
					JSONObject row = rows.getJSONObject(j);
					String person_uuid = row.getString("depart_uuid")+"."+row.getString("person_uuid");//部门标识.人员标识作为唯一表示，因为人员可能兼职多个部门
					if(!personSet.contains(person_uuid)){
						personSet.add(person_uuid);
						ret.add(row);
					}
				}
			}
		}catch (Exception e) {
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}

	
	/**
	 * 根据部门ID取部门的直属部门ID
	 * @param org_uuid
	 * @param conb
	 * @return
	 */
	public static String getDeptuuidexByOrgID(String org_uuid,ConnectBean conb){
		String ret = org_uuid;
		String sys_code = "";
		String departlevel ="";
		String temp_uuid = "";
		
		try{
			List<String> ids = new ArrayList<String>();
			ids.add(org_uuid);
			JSONArray rows = getDeptuuidexByOrgIDs(ids,conb);
			if(rows.size()>0){
				JSONObject row = rows.getJSONObject(0);
				ret = row.getString("deptuuidex");
			}		
			
//			WQLObject wo = WQLObject.getWQLObject("UUM_UU_ORGINFO");
//			if(wo==null) new Exception("WQLObject【UUM_UU_ORGINFO】不存在！");
//			
//			ResultBean rb = wo.query("org_uuid='"+org_uuid+"' AND sysisdelete='0'", "", conb);
//			if(rb.isSuccess()==false){
//				StringBuffer sf = new StringBuffer();
//				ArrayList errlist = rb.getInfoError();
//				for(int j=0;j<errlist.size();j++){
//					ErrorBean errBean = (ErrorBean)errlist.get(j);
//					sf.append(errBean.toString());
//					sf.append("\n");
//				}
//				throw new Exception(sf.toString());
//			}
//			
//			WQLData wd = rb.getWQLData(wo, 0);
//			if(wd.getRowCount()>0){
//				wd.first();
//				wd.next();
//				sys_code = wd.getValue("sys_code");				//系统编码
//				
//				
//				//查询出当前组织及所有上级组织
//				rb = wo.query("length(sys_code) <= length('"+sys_code+"') and  sys_code = substr('"+sys_code+"',1,case when length(sys_code) > length('"+sys_code+"') then length('"+sys_code+"') else length(sys_code) end )", "sys_code desc", conb);
//				if(rb.isSuccess()==false){
//					StringBuffer sf = new StringBuffer();
//					ArrayList errlist = rb.getInfoError();
//					for(int j=0;j<errlist.size();j++){
//						ErrorBean errBean = (ErrorBean)errlist.get(j);
//						sf.append(errBean.toString());
//						sf.append("\n");
//					}
//					throw new Exception(sf.toString());
//				}
//				wd = rb.getWQLData(wo, 0);
//				wd.first();
//				while(wd.next()){
//					departlevel = wd.getValue("org_level_scode");	//组织级别
//					if("U084".equals(departlevel)){
//						//找到直属部门
//						ret = wd.getValue("org_uuid");			//组织标识
//						break;
//					}
//				}
//			}
		}catch (Exception e) {
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}

	/**
	 * 根据用户ID取部门和兼职部门数据，取到的还是用户数据，一个兼职部门会有一条记录
	 * @param ids
	 * @param conb
	 * @return  
	 */
	public static JSONArray getPersonInfoHaveDeptexByPersonIDs(List<String> ids,ConnectBean conb){
		JSONArray ret = new JSONArray();
		try{
			if(ids!=null){
				StringBuffer sb = new StringBuffer();
				for(int i=0;i<ids.size();i++){
					String id = (String)ids.get(i);
					if(sb.length()>0) sb.append("','");
					sb.append(id);
				}
				logger.debug("getPersonInfoHaveDeptexByPersonIDs ids="+sb.toString());
				
				StringBuffer filtersql = new StringBuffer();
				filtersql.append("t.PERSON_UUID IN ('").append(sb.toString()).append("')");
				
				ResultBean resultBean = WQL.getWO(WQLNames.QUUMUU_0007)
										 .addParam("filtersql", filtersql.toString())
										 .process(conb);
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
				ret = resultBean.getResultJSONArray(0); 
			}
		}catch (Exception e) {
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	
	
	/**
	 * 根据部门ID数组取部门的直属部门ID
	 * @param ids
	 * @param conb
	 * @return [{org_uuid:'',deptuuidex:''}]
	 */
	public static JSONArray getDeptuuidexByOrgIDs(List<String> ids,ConnectBean conb){
		JSONArray ret = new JSONArray();
		Set<String> personSet = new HashSet<String>();
		try{
			if(ids!=null){
				StringBuffer sb = new StringBuffer();
				for(int i=0;i<ids.size();i++){
					String id = (String)ids.get(i);
					if(sb.length()>0) sb.append("','");
					sb.append(id);
				}
				logger.debug("getDeptuuidexByOrgIDs ids="+sb.toString());
				
				StringBuffer sql = new StringBuffer();
				sql.append("SELECT a.org_uuid,");
				sql.append(" CASE when a.org_level_scode = 'U084' then a.org_uuid");
				sql.append("      when b.org_level_scode = 'U084' then b.org_uuid");
				sql.append("      when c.org_level_scode = 'U084' then c.org_uuid");
				sql.append("      when d.org_level_scode = 'U084' then d.org_uuid");
				sql.append("      else a.org_uuid");
				sql.append(" END deptuuidex");
				sql.append(" FROM UUM_UU_ORGINFO a");
				sql.append(" LEFT JOIN UUM_UU_ORGINFO b on b.org_uuid = a.parent_uuid");
				sql.append(" LEFT JOIN UUM_UU_ORGINFO c on c.org_uuid = b.parent_uuid");
				sql.append(" LEFT JOIN UUM_UU_ORGINFO d on d.org_uuid = c.parent_uuid");
				sql.append(" WHERE a.org_uuid IN ('").append(sb.toString()).append("')");
				
				ResultBean resultBean = WQL.getWO("QWDKSY9999")
										 .addParam("flag", "1")
										 .addParam("sql", sql.toString())
										 .process(conb);
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
				ret = resultBean.getResultJSONArray(0); 
			}
		}catch (Exception e) {
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	
	
	/**
	 * 根据部门ID取部门的所属公司ID
	 * @param org_uuid
	 * @param conb
	 * @return
	 */
	public static String getCorpIDByOrgID(String org_uuid,ConnectBean conb){
		String ret = org_uuid;
		try{
			List<String> ids = new ArrayList<String>();
			ids.add(org_uuid);
			JSONArray rows = getCorpIDByOrgIDs(ids,conb);
			if(rows.size()>0){
				JSONObject row = rows.getJSONObject(0);
				ret = row.getString("corpuuid");
			}
		}catch (Exception e) {
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	/**
	 * 根据部门ID数组取部门的所属公司ID（最近一级公司）
	 * @param ids
	 * @param conb
	 * @return
	 */
	public static JSONArray getCorpIDByOrgIDs(List<String> ids,ConnectBean conb){
		JSONArray ret = new JSONArray();
		Set<String> personSet = new HashSet<String>();
		try{
			if(ids!=null){
				StringBuffer sb = new StringBuffer();
				for(int i=0;i<ids.size();i++){
					String id = (String)ids.get(i);
					if(sb.length()>0) sb.append("','");
					sb.append(id);
				}
				logger.debug("getDeptuuidexByOrgIDs ids="+sb.toString());
				
				StringBuffer sql = new StringBuffer();
				sql.append("SELECT a.org_uuid,");
				sql.append(" CASE when a.ORG_TYPE_SCODE = 'U072' then a.org_uuid");
				sql.append("      when b.ORG_TYPE_SCODE = 'U072' then b.org_uuid");
				sql.append("      when c.ORG_TYPE_SCODE = 'U072' then c.org_uuid");
				sql.append("      when d.ORG_TYPE_SCODE = 'U072' then d.org_uuid");
				sql.append("      when e.ORG_TYPE_SCODE = 'U072' then e.org_uuid");
				sql.append("      when f.ORG_TYPE_SCODE = 'U072' then f.org_uuid");
				sql.append("      else a.org_uuid");
				sql.append(" END corpuuid");
				sql.append(" FROM UUM_UU_ORGINFO a");
				sql.append(" LEFT JOIN UUM_UU_ORGINFO b on b.org_uuid = a.parent_uuid");
				sql.append(" LEFT JOIN UUM_UU_ORGINFO c on c.org_uuid = b.parent_uuid");
				sql.append(" LEFT JOIN UUM_UU_ORGINFO d on d.org_uuid = c.parent_uuid");
				sql.append(" LEFT JOIN UUM_UU_ORGINFO e on e.org_uuid = d.parent_uuid");
				sql.append(" LEFT JOIN UUM_UU_ORGINFO f on f.org_uuid = e.parent_uuid");
				sql.append(" WHERE a.org_uuid IN ('").append(sb.toString()).append("')");
				
				ResultBean resultBean = WQL.getWO("QWDKSY9999")
										 .addParam("flag", "1")
										 .addParam("sql", sql.toString())
										 .process(conb);
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
				ret = resultBean.getResultJSONArray(0); 
			}
		}catch (Exception e) {
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
	
/**
	 * 取数据权限语句串
	 * @param app_uuid 应用标识
	 * @param account_uuid 用户标识
	 * @param role_uuid 角色标识
	 * @param Func_uuid 菜单标识	
	 * @return
	 */
	public static String getDataRight(SessionUser sessionUser, String func_uuid, ConnectBean conb){
		StringBuffer str = new StringBuffer();
		JSONArray ret = null;
		try{			
			ResultBean resultBean = WQL.getWO(WQLNames.QPFPB_RL0005)
			.addParam("app_uuid", sessionUser.getAppuuid())
			.addParam("account_uuid", sessionUser.getAccountuuid())
			.addParam("role_uuid", sessionUser.getRoleuuid())
			.addParam("func_uuid", func_uuid)
			.process(conb);
			if(resultBean.isSuccess()){
				ret = resultBean.getResultJSONArray(0);
				for(int i=ret.size()-1;i>=0;i--){
					JSONObject row = ret.getJSONObject(i);
					String depart_uuid = row.getString("depart_uuid");
					String org_uuid = row.getString("org_uuid");
					String right_level = row.getString("right_level");
					String right_str = row.getString("right_str");
					String person_uuid = row.getString("person_uuid");
					
					if("U140".equals(right_level)){
						str.append("( ")
						.append("1 = 1")
						.append(" )");
					}
					if("U141".equals(right_level)){
						str.append("( ")
						.append("syscreatoruuid = '")
						.append(person_uuid)
						.append("' AND sysdeptuuid = '")
						.append(depart_uuid)
						.append("' AND syscompanyuuid = '")
						.append(org_uuid)
						.append("' )");
					}
					//部门要用权限码 IN
					if("U142".equals(right_level)){
						
						String sys_code = "";
						String sql = "SELECT sys_code FROM UUM_UU_ORGINFO WHERE org_uuid = '" + depart_uuid + "'";
						JSONArray jrows = WQL.getWO("QWDKSY9999")
												.addParam("flag", "1")
												.addParam("sql", sql)
												.process()
												.getResultJSONArray(0);
						if(jrows.size() > 0){
							sys_code = jrows.getJSONObject(0).getString("sys_code");
						}
						
						str.append("( ")
						.append(" sysdeptuuid IN (SELECT org_uuid FROM UUM_UU_ORGINFO WHERE sys_code LIKE '")
						.append(sys_code)
						.append("%') ")
						.append(" AND syscompanyuuid = '")
						.append(org_uuid)
						.append("' )");
					}
					if("U143".equals(right_level)){
						
						String sys_code = "";
						String sql = "SELECT sys_code FROM UUM_UU_ORGINFO WHERE org_uuid = '" + sessionUser.getDeptuuidex() + "'";
						JSONArray jrows = WQL.getWO("QWDKSY9999")
												.addParam("flag", "1")
												.addParam("sql", sql)
												.process()
												.getResultJSONArray(0);
						if(jrows.size() > 0){
							sys_code = jrows.getJSONObject(0).getString("sys_code");
						}
						
						str.append("( ")
						.append(" sysdeptuuid IN (SELECT org_uuid FROM UUM_UU_ORGINFO WHERE sys_code LIKE '")
						.append(sys_code)
						.append("%' ) ")
						.append(" AND syscompanyuuid = '")
						.append(org_uuid)
						.append("' )");
					}
					if("U144".equals(right_level)){
						str.append("( ")
						.append(" syscompanyuuid = '")
						.append(org_uuid)
						.append("' )");
					}
					if("U145".equals(right_level)){//其他
						if(right_str != "" && right_str.trim().length() != 0){
							str.append("( ")
							.append(right_str)
							.append(" )");
						}else{
							str.append("( ")
							.append("syscreatoruuid = '")
							.append(person_uuid)
							.append("' )");
						}
					}
					if(i > 0){
						str.append(" OR ");
					}
				}
			}else{
				ret = new JSONArray();
				logger.errorWithNoException("取数据权限列表错误：");
				ArrayList errList = resultBean.getInfoError();
				for(int i=0;i<errList.size();i++){
					ErrorBean err = (ErrorBean)errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
		}catch(Exception e){
			logger.errorWithNoException("取数据权限列表错误："+e.getMessage());
			e.printStackTrace();
		}
		return str.toString();
	}
	
	/**
	 * 取数据权限级别与权限码
	 * @param app_uuid 应用标识
	 * @param account_uuid 用户标识
	 * @param role_uuid 角色标识
	 * @param Func_uuid 菜单标识	
	 * @return
	 */
	public static List<String> getDataRightCode(SessionUser sessionUser, String func_uuid, ConnectBean conb){
		List<String> rightList = new ArrayList<String>();
		
		try{			
			ResultBean resultBean = WQL.getWO(WQLNames.QPFPB_RL0005)
			.addParam("app_uuid", sessionUser.getAppuuid())
			.addParam("account_uuid", sessionUser.getAccountuuid())
			.addParam("role_uuid", sessionUser.getRoleuuid())
			.addParam("func_uuid", func_uuid)
			.process(conb);
			if(resultBean.isSuccess()){
				JSONArray ret = resultBean.getResultJSONArray(0);
				for(int i=ret.size()-1;i>=0;i--){
					JSONObject row = ret.getJSONObject(i);
					String right_level = row.getString("right_level");
					rightList.add(right_level);
				}
			}
		}catch(Exception e){
			logger.errorWithNoException("取数据权限列表错误："+e.getMessage());
			e.printStackTrace();
		}
		return rightList;
	}
	
}