package com.longj.platform.busi.wdk.handler;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.WDK;
import org.wdk.core.base.BaseMenu;
import org.wdk.core.base.BaseSessionUser;
import org.wdk.core.base.MenuBean;
import org.wdk.module.wql.WQL;

import wql.WQLNames;
/**
 * 权限过滤，对管理员默认全部开发
 * 管理员目前为特定的账户：superAdmin和admin
 * @author Administrator
 *
 */
public class WDKMenu extends BaseMenu{
	private static boolean isenable = true; 
	
	public WDKMenu() {
		String strEnable = WDK.getPropPUB("role.enable"); 
		if(!"0".equals(strEnable)){
			WDKMenu.isenable = true;
		}else{
			WDKMenu.isenable = false;
		}
	}
	
	public static boolean isIsenable() {
		return isenable;
	}
	public static void setIsenable(boolean isenable) {
		WDKMenu.isenable = isenable;
	}
	public JSONArray queryAllMenu22(BaseSessionUser bsu) {
//		JSONArray jrows = WQL.getWO(WQLNames.QPFPB_RL0003)
//							.addParam("app_uuid", su.getAppuuid())
//							.addParam("account_uuid", su.getAccountuuid())
//							.addParam("user_uuid", su.getUserid())
//							.process()
//							.getResultJSONArray(0);
		JSONArray jrows = WQL.getWO(WQLNames.QSYSHL0001)
							.addParam("flag", "1")
							.addParam("orderby", "ordercode asc")
							.process()
							.getResultJSONArray(0);
		return jrows;
	}
	@Override
	public JSONArray queryAllMenu(BaseSessionUser bsu) {
		BaseSessionUser su = bsu;
		String roleids = "";
		String menucodes = new String();
		List<String> menucodeList = new ArrayList<String>();
		if(isenable){
			//1、读取用户的角色
			String person_id = su.getUserid();
			JSONArray jroles = WQL.getWO(WQLNames.QSYSRL0004)
									.addParam("flag", "3")
									.addParam("person_id", person_id)
									.process()
									.getResultJSONArray(0);
			for(int i=0;i<jroles.size();i++){
				JSONObject jrole = jroles.getJSONObject(i);
				String roleid = jrole.getString("roleid");
				roleids += "'"+roleid+"',";
			}
			if(roleids.length()>0){
				roleids = roleids.substring(0,roleids.length()-1);
			}
			if(null==roleids||"".equals(roleids)){
				roleids = "'999999'";
			}
			
			//2、根据角色读取对应可以显示的菜单列表
			JSONArray jmenus = WQL.getWO(WQLNames.QSYSRL0005)
									.addParam("flag", "2")
									.addParam("roleids", roleids)
									.process()
									.getResultJSONArray(0);
			for(int i=0;i<jmenus.size();i++){
				JSONObject jmenu = jmenus.getJSONObject(i);
				String funcode = jmenu.getString("funcode");
				menucodes += "'"+funcode+"',";
				menucodeList.add(funcode);
			}
			if(menucodes.length()>0){
				menucodes = menucodes.substring(0,menucodes.length()-1);
			}
			if(null==menucodes||"".equals(menucodes)){
				menucodes = "'999999'";
			}
		}
		JSONArray jrows = new JSONArray();
	
			//3、组成可用菜单列表并读取菜单完整信息，构建成菜单树返回
			JSONArray jrows2 = WQL.getWO(WQLNames.QSYSHL0001)
									.addParam("flag", "1")
									//.addParam("menucodes", menucodes)
									.addParam("orderby", "ordercode asc")
									.process()
									.getResultJSONArray(0);
			if(menucodeList!=null && menucodeList.size()>0){
			for(int i=0;i<jrows2.size();i++){
				JSONObject jo = jrows2.getJSONObject(i);
				String menucode = jo.getString("menucode");
				for(int j=0;j<menucodeList.size();j++){
					if(menucodeList.get(j).indexOf(menucode)>-1){
						jrows.add(jo);
						break;
					}
				}
			}
		}
			if(!isenable){
				jrows = jrows2;
			}
		return jrows;
	}
	
	@Override
	public ArrayList<MenuBean> queryAllMenuBean(BaseSessionUser bsu) {
		ArrayList<MenuBean> mbs = new ArrayList<MenuBean>();
		String roleids = "";
		String menucodes = new String();
		if(true){
			//1、读取用户的角色
			String userid = bsu.getUserid();
			JSONArray jroles = WQL.getWO(WQLNames.QSYSRL0004)
									.addParam("flag", "3")
									.addParam("person_id", userid)
									.process()
									.getResultJSONArray(0);
			for(int i=0;i<jroles.size();i++){
				JSONObject jrole = jroles.getJSONObject(i);
				String roleid = jrole.getString("roleid");
				roleids += "'"+roleid+"',";
			}
			if(roleids.length()>0){
				roleids = roleids.substring(0,roleids.length()-1);
			}
			if(null==roleids||"".equals(roleids)){
				roleids = "'999999'";
			}
			
			//2、根据角色读取对应可以显示的菜单列表
			JSONArray jmenus = WQL.getWO(WQLNames.QSYSRL0005)
									.addParam("flag", "2")
									.addParam("roleids", roleids)
									.process()
									.getResultJSONArray(0);
			for(int i=0;i<jmenus.size();i++){
				JSONObject jmenu = jmenus.getJSONObject(i);
				String funcode = jmenu.getString("funcode");
				menucodes += "'"+funcode+"',";
			}
			if(menucodes.length()>0){
				menucodes = menucodes.substring(0,menucodes.length()-1);
			}
			if(null==menucodes||"".equals(menucodes)){
				menucodes = "'999999'";
			}
		}
		
		//3、组成可用菜单列表并读取菜单完整信息，构建成菜单树返回
		JSONArray jrows = WQL.getWO(WQLNames.QSYSHL0001)
								.addParam("flag", "1")
								.addParam("menucodes", menucodes)
								.addParam("orderby", "ordercode asc")
								.process()
								.getResultJSONArray(0);
		for(int i=0;i<jrows.size();i++){
			JSONObject jrow = jrows.getJSONObject(i);
			MenuBean mb = new MenuBean(jrow);
			mbs.add(mb);
		}
		return mbs;
	}

	@Override
	public MenuBean queryMenuByCode(BaseSessionUser su, String menucode) {
		// TODO Auto-generated method stub
		JSONObject jrow = WQL.getWO(WQLNames.QSYSHL0001)
								.addParam("flag", "1")
								.addParam("orderby", "ordercode asc")
								.addParam("menucode", menucode)
								.process()
								.uniqueResult(0);
		MenuBean mb = new MenuBean(jrow);
		return mb;
	}
	@Override
	public ArrayList<MenuBean> queryMenuByParentMenuCode(BaseSessionUser su,String parentmenucode) {
		ArrayList<MenuBean> mbs = new ArrayList<MenuBean>();
		JSONArray jrows = WQL.getWO(WQLNames.QSYSHL0001)
								.addParam("flag", "1")
								.addParam("orderby", "ordercode asc")
								.addParam("parentmenucode", parentmenucode)
								.process()
								.getResultJSONArray(0);
		for(int i=0;i<jrows.size();i++){
			JSONObject jrow = jrows.getJSONObject(i);
			MenuBean mb = new MenuBean(jrow);
			mbs.add(mb);
		}
		return mbs;
	}
}