package com.longj.products.ea.standard.system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.WDK;
import org.wdk.WDKConstant;
import org.wdk.WDKCore;
import org.wdk.core.base.BaseAction;
import org.wdk.core.base.BaseSessionUser;
import org.wdk.core.base.MenuBean;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLObject;

import wql.WQLNames;

public class RoleAction extends BaseAction{
	
	
	/**
	 * 获取兼职部门列表情况，查看是否存在兼职的情况
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void getExtDeptList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		JSONArray jrowsRes = new JSONArray();
		String person_id = _getParameter("person_id", request, response);
		WQLObject wo = WQLObject.getWQLObject("EA_BI_Person");
		ResultBean rb = wo.query("person_id = ?", new String[] { person_id }, "person_id", null);
		if (rb != null && rb.isSuccess()) {
			JSONArray rows = rb.getResultJSONArray(0);
			if (rows != null && rows.size() > 0) {
				JSONObject row = rows.getJSONObject(0);
				JSONObject jrowRes1 = new JSONObject();
				jrowRes1.put("id", row.getString("dept_id"));
				jrowRes1.put("text", row.getString("dept_idname"));
				jrowsRes.add(jrowRes1);
				String ext_dept_id = row.getString("ext_dept_id");
				if (ext_dept_id != null && ext_dept_id.trim().length() > 0) {
					JSONObject jrowRes = new JSONObject();
					jrowRes.put("id", ext_dept_id);
					jrowRes.put("text", row.getString("ext_dept_idname"));
					jrowsRes.add(jrowRes);
				}
			}
		}
		_PRINT(request, response, jrowsRes.toString());
	}
	
	
	/**设置兼职部门的维护
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void set_ext_dept(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String ext_dept_id = _getParameter("ext_dept_id", request, response);
		String person_id = _getParameter("person_id", request, response);
		JSONObject jres = new JSONObject();
		jres.put("code", "0");
		jres.put("desc", "设置兼职部门失败！");
		WQLObject wo = WQLObject.getWQLObject("EA_BI_Person");
		HashMap<String, String> values = new HashMap<String, String>();
		values.put("ext_dept_id", ext_dept_id);
		ResultBean rb = wo.update(values, "person_id = ?", new String[] { person_id }, null);
		if (rb != null && rb.isSuccess()) {
			jres.put("code", "1");
			jres.put("desc", "设置兼职部门成功！");
		}
		_PRINT(request, response, jres.toString());
	}
	
	/**
	 * 查询角色人员列表
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void role_person_query(HttpServletRequest request, HttpServletResponse response)throws Exception {
		String roleid = _getParameter("roleid", request, response);
		if(null==roleid||"".equals(roleid)){
			roleid="99999";
		}
		JSONObject jres = WQL.getWO(WQLNames.QSYSRL0004)
								.addParam("flag", "2")
								.addParam("roleid", roleid)
								.pageQuery(request, "createdt desc");
		_PRINT(request, response, jres.toString());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 部门人员树
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void orgusertree(HttpServletRequest request, HttpServletResponse response)throws Exception {
		String parentid = _getParameter("parentid", request, response);
		if(null==parentid||"".equals(parentid)){
			parentid = "-1";//"10330001";
		}
		//查询部门
		JSONArray jorgs = WQL.getWO(WQLNames.QSYSRL0002)
							.addParam("flag", "1")
							.addParam("parent_dept", parentid)
							.process()
							.getResultJSONArray(0);
		jorgs = WDK.DataFormat_Tree_Asyn(jorgs, "dept_id", "dept_name", "childs,childs2","","nodetype");
		
		//查询当前部门下的所有人员并叠加
		JSONArray jpersons = WQL.getWO(WQLNames.QSYSRL0001)
								.addParam("flag", "1")
								.addParam("dept_id", parentid)
								.process()
								.getResultJSONArray(0);
		jpersons = WDK.DataFormat_Tree_Asyn(jpersons, "person_id", "person_name", "","ext-icon-user","nodetype");
		jorgs.addAll(jpersons);
		_PRINT(request, response, jorgs.toString());
		
	}
	
	/**
	 * 读取所有角色列表
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void role_query(HttpServletRequest request, HttpServletResponse response)throws Exception {
		JSONArray jrows = WQL.getWO(WQLNames.QSYSRL0003)
								.addParam("flag", "1")
								.process()
								.getResultJSONArray(0);
		jrows = WDK.DataFormat_Tree(jrows, "roleid", "rolename", null,"ext-icon-user","rolecode,ordercode");
		_PRINT(request, response, jrows.toString());
	}
	
	/**
	 * 新增角色
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void role_add(HttpServletRequest request, HttpServletResponse response)throws Exception {
		String type = _getParameter("type", request, response);
		String roleid = _getParameter("roleid", request, response);
		String rolename = _getParameter("rolename", request, response);
		String rolecode = _getParameter("rolecode", request, response);
		String ordercode = _getParameter("ordercode", request, response);
		String processclass = _getParameter("processclass", request, response);
		
		JSONObject jres = new JSONObject();
		if("0".equals(type)){
			boolean isSuccess = WQL.getWO(WQLNames.USYSRL0003)
									.addParam("flag", "2")
									.addParam("roleid", roleid)
									.addParam("rolename", rolename)
									.addParam("rolecode", rolecode)
									.addParam("ordercode", ordercode)
									.process()
									.isSuccess();
			if(isSuccess){
				jres.put("code", "1");
				jres.put("desc", "更新成功！");
			}else{
				jres.put("code", "0");
				jres.put("desc", "更新失败！");
			}
		}else{
			boolean isSuccess = WQL.getWO(WQLNames.USYSRL0003)
									.addParam("flag", "1")
									.addParam("roleid", WDK.getUUID())
									.addParam("rolename", rolename)
									.addParam("rolecode", rolecode)
									.addParam("ordercode", ordercode)
									.process()
									.isSuccess();
			if(isSuccess){
				jres.put("code", "1");
				jres.put("desc", "新增成功！");
			}else{
				jres.put("code", "0");
				jres.put("desc", "新增失败！");
			}
		}
		_PRINT(request, response, jres.toString());
	}
	
	/**
	 * 角色删除
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void role_remove(HttpServletRequest request, HttpServletResponse response)throws Exception {
		String roleid = _getParameter("roleid", request, response);
		//1、删除当前角色
		boolean isSuccess = WQL.getWO(WQLNames.USYSRL0003)
								.addParam("flag", "3")
								.addParam("roleid", roleid)
								.process()
								.isSuccess();
		
		//2、同步删除角色所关联的所有用户
		if(isSuccess){
			isSuccess = WQL.getWO(WQLNames.USYSRL0004)
							.addParam("flag", "4")
							.addParam("roleid", roleid)
							.process()
							.isSuccess();
		}
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "删除成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "删除失败！");
		}
		_PRINT(request, response, jres.toString());
		
	}
	

	
	
	/**
	 * 用户角色绑定
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void role_person_add(HttpServletRequest request, HttpServletResponse response)throws Exception {
		String roleid = _getParameter("roleid", request, response);
		String ids = _getParameter("ids", request, response);
		String types = _getParameter("types", request, response);
		
		String[] idarr = ids.split(",");
		String[] typearr = types.split(",");
		
		String operdt = WDK.getDateTime();
		JSONArray jorgs = WQL.getWO(WQLNames.QSYSRL0002)
							.addParam("flag", "1")
							.process()
							.getResultJSONArray(0);
		
		for(int i=0;i<typearr.length;i++){
			String type = typearr[i];
			String id = idarr[i];
			
			if("person".equals(type.toLowerCase())){
				WQL.getWO(WQLNames.USYSRL0004)
					.addParam("flag", "1")
					.addParam("id",WDK.getUUID())
					.addParam("person_id", id)
					.addParam("roleid", roleid)
					.addParam("createdt", operdt)
					.process();
			}else if("org".equals(type.toLowerCase())){
				role_person_add(jorgs, roleid, id,operdt);
			}
		}
		JSONObject jres = new JSONObject();
		jres.put("code", "1");
		jres.put("desc","插入成功！");
		_PRINT(request, response, jres.toString());
	}
	/**
	 * 迭代循环按照部门搜索部门及子部门的所有人员
	 * @param jorgs
	 * @param roleid
	 * @param orgcode
	 * @param operdt
	 */
	private void role_person_add(JSONArray jorgs,String roleid,String dept_id,String operdt){
		//查询当前组织下是否还有下级组织
		for(int i=0;i<jorgs.size();i++){
			JSONObject jorg = jorgs.getJSONObject(i);
			String subordcode = jorg.getString("dept_id");
			String parent_dept = jorg.has("parent_dept")?jorg.getString("parent_dept"):"";
			//如果当前组织有下级组织，则把下级组织的人员也需要添加进来
			if(parent_dept.equals(dept_id)){
				role_person_add(jorgs, roleid, subordcode, operdt);
			}
		}
		
		//添加当前组织下的所有人
		JSONArray jpersons = WQL.getWO(WQLNames.QSYSRL0001)
								.addParam("flag", "1")
								.addParam("dept_id", dept_id)
								.process()
								.getResultJSONArray(0);
		for(int i=0;i<jpersons.size();i++){
			JSONObject jperson = jpersons.getJSONObject(i);
			String userid = jperson.getString("person_id");
			WQL.getWO(WQLNames.USYSRL0004)
								.addParam("flag", "1")
								.addParam("id",WDK.getUUID())
								.addParam("person_id", userid)
								.addParam("roleid", roleid)
								.addParam("createdt", operdt)
								.process();
		}
	}
	
	/**
	 * 删除人员角色对应关系
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void role_person_remove(HttpServletRequest request, HttpServletResponse response)throws Exception {
		String opertype = _getParameter("opertype", request, response);
		String roleid = _getParameter("roleid", request, response);
		String ids = _getParameter("ids", request, response);
		
		if("remove".equals(opertype.toLowerCase())){
		//一个一个删除
			String[] idarr = ids.split(",");
			for(int i=0;i<idarr.length;i++){
				String userid = idarr[i];
				WQL.getWO(WQLNames.USYSRL0004)
					.addParam("flag", "3")
					.addParam("roleid", roleid)
					.addParam("person_id", userid)
					.process();
			}
		}else if("removeall".equals(opertype.toLowerCase())){
			WQL.getWO(WQLNames.USYSRL0004)
								.addParam("flag", "4")
								.addParam("roleid", roleid)
								.process();
		}
		
		JSONObject jres = new JSONObject();
		jres.put("code", "1");
		jres.put("desc", "删除成功！");
		_PRINT(request, response, jres.toString());
	}
	
	
	/**
	 * 读取所有有权限的菜单
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void menu_load(HttpServletRequest request, HttpServletResponse response)throws Exception {
		BaseSessionUser su = (BaseSessionUser) _getSessionuser(request, response);
		JSONArray jmenus = WDKCore.inst.handler_menu.queryAllMenu(su);
		jmenus = WDK.DataFormat_Tree(jmenus, "menucode", "menuname", "parentmenucode", "menuicon", "menuurl,ordercode,menuparam");
		_PRINT(request, response, jmenus.toString());
	}
	
	/**
	 * 读取所有菜单
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void menu_load_all(HttpServletRequest request, HttpServletResponse response)throws Exception {
		JSONArray jmenus = WQL.getWO(WQLNames.QSYSHL0001)
		.addParam("flag", "1")
		.addParam("orderby", "ordercode asc")
		.process()
		.getResultJSONArray(0);
		jmenus = WDK.DataFormat_Tree(jmenus, "menucode", "menuname", "parentmenucode", "menuicon", "menuurl,ordercode,menuparam");
		_PRINT(request, response, jmenus.toString());
	}
	/**
	 * 菜单到权限的对应
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void menu_role_query(HttpServletRequest request, HttpServletResponse response)throws Exception {
		String menuid = _getParameter("menuid", request, response);
		if(null==menuid||"".equals(menuid)){
			menuid = "9999";
		}
		JSONArray jrows = WQL.getWO(WQLNames.QSYSRL0005)
								.addParam("flag", "1")
								.addParam("funcode", menuid)
								.process()
								.getResultJSONArray(0);
		_PRINT(request, response, jrows.toString());
	}
	
	/**
	 * 角色列表读取
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void rolegrid_query(HttpServletRequest request, HttpServletResponse response)throws Exception {
		JSONArray jrows = WQL.getWO(WQLNames.QSYSRL0003)
								.addParam("flag", "1")
								.process()
								.getResultJSONArray(0);
		_PRINT(request, response, jrows.toString());
	}
	
	/**
	 * 新增菜单角色对应列表
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void menu_role_add(HttpServletRequest request, HttpServletResponse response)throws Exception {
		String iscascade = _getParameter("iscascade", request, response);
		String menucode = _getParameter("menucode", request, response);
		String ids = _getParameter("ids", request, response);
		String[] idarr = ids.split(",");
		String operdt = WDK.getDateTime();
//		BaseSessionUser su = (BaseSessionUser) _getSessionuser(request, response);
//		ArrayList<MenuBean> menus = WDKCore.inst.handler_menu.queryAllMenuBean(su);
		
		
		if("1".equals(iscascade)){
		//如果是级联新增，则当前菜单及下级所有子菜单级联操作
			JSONArray jmenus = WQL.getWO(WQLNames.QSYSHL0001)
								.addParam("flag", "1")
								.addParam("orderby", "ordercode asc")
								.process()
								.getResultJSONArray(0);
			ArrayList<MenuBean> menus = new ArrayList<MenuBean>();
			for(int i=0;i<jmenus.size();i++){
				JSONObject jmenu = jmenus.getJSONObject(i);
				MenuBean mb = new MenuBean(jmenu);
				menus.add(mb);
			}
			for(int i =0;i<idarr.length;i++){
				String roleid = idarr[i];
				if("".equals(roleid)){
					continue;
				}
				menu_role_add_iterator(menus, menucode, roleid, operdt);
			}
		}else{
			//非级联操作，只对当前菜单有效
			for(int i =0;i<idarr.length;i++){
				String roleid = idarr[i];
				if("".equals(roleid)){
					continue;
				}
				WQL.getWO(WQLNames.USYSRL0005)
					.addParam("flag", "1")
					.addParam("id", WDK.getUUID())
					.addParam("roleid", roleid)
					.addParam("funcode", menucode)
					.addParam("funtype", "1")
					.addParam("createdt", operdt)
					.process();
			}
		}
		JSONObject jres = new JSONObject();
		jres.put("code", "1");
		jres.put("desc", "绑定成功！");
		_PRINT(request, response, jres.toString());
	}
	/**
	 * 迭代新增
	 * @param menus
	 * @param menucode
	 * @param roleid
	 * @param operdt
	 */
	private void menu_role_add_iterator(ArrayList<MenuBean> menus,String menucode,String roleid,String operdt){
		//1、查询该菜单是否有下级菜单
		for(Iterator<MenuBean> it = menus.iterator();it.hasNext();){
			MenuBean mb = it.next();
			if(mb.getParentmenucode().equals(menucode)){
				menu_role_add_iterator(menus, mb.getMenucode(), roleid,operdt);
			}
		}
		
		//2、对当前菜单进行绑定
		WQL.getWO(WQLNames.USYSRL0005)
			.addParam("flag", "1")
			.addParam("id", WDK.getUUID())
			.addParam("roleid", roleid)
			.addParam("funcode", menucode)
			.addParam("funtype", "1")
			.addParam("createdt", operdt)
			.process();
	}
	
	/**
	 * 删除菜单角色关联
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void menu_role_remove(HttpServletRequest request, HttpServletResponse response)throws Exception {
		String iscascade = _getParameter("iscascade", request, response);
		String menucode = _getParameter("menucode", request, response);
		String ids = _getParameter("ids", request, response);
		String[] idarr = ids.split(",");
		BaseSessionUser su = (BaseSessionUser) _getSessionuser(request, response);
		ArrayList<MenuBean> menus = WDKCore.inst.handler_menu.queryAllMenuBean(su);
		
		if("1".equals(iscascade)){
		//如果是级联删除，则当前菜单及下级所有子菜单级联操作
			for(int i =0;i<idarr.length;i++){
				String roleid = idarr[i];
				if("".equals(roleid)){
					continue;
				}
				menu_role_remove_iterator(menus, menucode, roleid);
			}
		}else{
			//非级联操作，只对当前菜单有效
			for(int i =0;i<idarr.length;i++){
				String roleid = idarr[i];
				if("".equals(roleid)){
					continue;
				}
				WQL.getWO(WQLNames.USYSRL0005)
					.addParam("flag", "3")
					.addParam("roleid", roleid)
					.addParam("funcode", menucode)
					.process();
			}
		}
		
		JSONObject jres = new JSONObject();
		jres.put("code", "1");
		jres.put("desc", "删除成功！");
		_PRINT(request, response, jres.toString());
	}
	/**
	 * 迭代删除
	 * @param menus
	 * @param menucode
	 * @param roleid
	 * @param operdt
	 */
	private void menu_role_remove_iterator(ArrayList<MenuBean> menus,String menucode,String roleid){
		//1、查询该菜单是否有下级菜单
		for(Iterator<MenuBean> it = menus.iterator();it.hasNext();){
			MenuBean mb = it.next();
			if(mb.getParentmenucode().equals(menucode)){
				menu_role_remove_iterator(menus, mb.getMenucode(), roleid);
			}
		}
		
		//2、对当前菜单进行解除绑定
		WQL.getWO(WQLNames.USYSRL0005)
			.addParam("flag", "3")
			.addParam("roleid", roleid)
			.addParam("funcode", menucode)
			.process();
	}
	
	/**
	 * 读取组织机构树
	 * 	异步方式
	 * @param menus
	 * @param menucode
	 * @param roleid
	 */
	public void org_query(HttpServletRequest request, HttpServletResponse response)throws Exception {
		
		String parentid = _getParameter("parentid", request, response);
		String dept_id = _getParameter("orgcode", request, response);
		if(null==parentid||"".equals(parentid)){
			//parentid = "10330001";
			parentid = "";
		}
		//查询部门
		JSONArray jorgs = WQL.getWO(WQLNames.QSYSRL0002)
							.addParam("flag", "1")
							.addParam("parent_dept", parentid)
							.process()
							.getResultJSONArray(0);
		jorgs = WDK.DataFormat_Tree_Asyn(jorgs, "orgn_code", "orgn_name", "childs","","prnt_orgn_code,prnt_orgn_name,orgn_sort_no");
		_PRINT(request, response, jorgs.toString());
	}
	
	/**
	 * 分页查询人员
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void person_query(HttpServletRequest request, HttpServletResponse response)throws Exception {
		String orgn_code = _getParameter("orgn_code", request, response);
		if(null==orgn_code||"".equals(orgn_code)){
			orgn_code = WDKConstant.ID_NOQUERY;
		}
		JSONObject jres = WQL.getWO(WQLNames.QSYSRL0001)
								.addParam("flag", "2")
								.addParam("orgcode", orgn_code)
								.pageQuery(request, "ordercode asc");
		_PRINT(request, response, jres.toString());
	}
	
	
	/**
	 * 人员信息更新
	 * 需要写入两张表
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void person_update(HttpServletRequest request, HttpServletResponse response)throws Exception {
		String userid = _getParameter("userid", request, response);
		String jobname = _getParameter("jobname", request, response);
		String manageorgcode = _getParameter("manageorgcode", request, response);
		String isheader = _getParameter("isheader", request, response);
		
		boolean isSuccess = WQL.getWO(WQLNames.USYSRL0001)
								.addParam("flag", "4")
								.addParam("userid", userid)
								.addParam("jobname", jobname)
								.addParam("manageorgcode", manageorgcode)
								.addParam("isheader", isheader)
								.process()
								.isSuccess();
		
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "更新成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "更新失败！");
		}
		_PRINT(request, response, jres.toString());
	}
}
