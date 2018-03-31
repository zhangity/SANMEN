package com.longj.platform.busi.wdk.handler;

import java.util.HashMap;
import net.sf.json.JSONObject;
import org.wdk.core.base.BaseSessionUser;

public class SessionUser extends BaseSessionUser{
	private static final long serialVersionUID = 8951959750092643088L;
	
	//session变量
	protected String appuuid = "";					//登录的应用系统ID
	protected String loginname = "";				//登录名
	protected String accountuuid = "";				//账号ID
	protected String accounttype = "";				//账号类型
	protected String personuuid = "";				//账号对应的人员ID
	protected String personname = "";				//账号对应的人员名称
	protected String roleuuid = "";					//角色ID
	protected String rolename = "";					//角色名称
	protected String orguuid = "";					//机构ID
	protected String orgname = "";					//机构名称
	protected String orgsimplename = "";			//机构简称
	protected String deptuuid = "";					//部门ID
	protected String deptname = "";					//部门名称
	protected String deptsimplename = "";			//部门简称
	protected String manageunituuid = "";			//管理单元ID
	protected String manageunitname = "";			//管理单元名称
	protected String manageunitorguuid = "";		//管理单元对应机构
	protected String deptuuidex = "";					//直属部门ID
	protected String deptnameex = "";					//直属部门名称
	protected String deptsimplenameex = "";				//直属部门简称
	protected String belongdeptuuid = ""; //人员归属部门ID
	protected String belongdeptname = ""; //人员归属部门名称
	protected String belongorguuid = ""; //人员归属机构ID 
	protected String belongorgname = ""; //人员归属机构名称
	
	
	
	public String getBelongdeptuuid() {
		return belongdeptuuid;
	}

	public void setBelongdeptuuid(String belongdeptuuid) {
		this.belongdeptuuid = belongdeptuuid;
	}

	public String getBelongdeptname() {
		return belongdeptname;
	}

	public void setBelongdeptname(String belongdeptname) {
		this.belongdeptname = belongdeptname;
	}

	public String getBelongorguuid() {
		return belongorguuid;
	}

	public void setBelongorguuid(String belongorguuid) {
		this.belongorguuid = belongorguuid;
	}

	public String getBelongorgname() {
		return belongorgname;
	}

	public void setBelongorgname(String belongorgname) {
		this.belongorgname = belongorgname;
	}

	public SessionUser() {
		// TODO Auto-generated constructor stub
	}
	
//	public SessionUser(Person p) {
//		this.userid = p.getUserid();
//		this.loginname = p.getLoginname();
//		this.username = p.getUsername();
//		this.orgname = p.getOrgname();
//	}
	
	public boolean isAdmin(){
	if("superadmin".equals(loginname.toLowerCase())
			||"admin".equals(loginname.toLowerCase())){
		return true;
	}
	return false;
}
	

	@Override
	public JSONObject toJSON() {
		// TODO Auto-generated method stub
		JSONObject jo = new JSONObject();
		jo.put("sessionid", this.sessionid);
		jo.put("clientIP", this.clientIP);
		jo.put("clientMAC", this.clientMAC);
		jo.put("logintime", this.logintime);
		jo.put("logouttime", this.logouttime);
		jo.put("pagename", this.pagename);
		jo.put("visittime", this.visittime);

		jo.put("userid", this.userid);
		jo.put("loginname", this.loginname);
		jo.put("username", this.username);
		
		jo.put("appuuid", this.appuuid);
		jo.put("accountuuid", this.accountuuid);
		jo.put("accounttype", this.accounttype);
		jo.put("personuuid", this.personuuid);
		jo.put("personname", this.personname);
		jo.put("roleuuid", this.roleuuid);
		jo.put("rolename", this.rolename);
		jo.put("orguuid", this.orguuid);
		jo.put("orgname", this.orgname);
		jo.put("orgsimplename", this.orgsimplename);
		jo.put("deptuuid", this.deptuuid);
		jo.put("deptname", this.deptname);
		jo.put("deptsimplename", this.deptsimplename);
		jo.put("manageunituuid", this.manageunituuid);
		jo.put("manageunitname", this.manageunitname);
		jo.put("manageunitorguuid", this.manageunitorguuid);
		jo.put("deptuuidex",this.deptuuidex);
		jo.put("deptnameex",this.deptnameex);
		jo.put("deptsimplenameex", this.deptsimplenameex);
		jo.put("belongdeptuuid", this.belongdeptuuid);
		jo.put("belongdeptname", this.belongdeptname);
		jo.put("belongorguuid", this.belongorguuid);
		jo.put("belongorgname", this.belongorgname);
		return jo;
	}

	@Override
	public HashMap<String,String> toMap() {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("sessionid", this.sessionid);
		map.put("clientIP", this.clientIP);
		map.put("clientMAC", this.clientMAC);
		map.put("logintime", this.logintime);
		map.put("logouttime", this.logouttime);
		map.put("pagename", this.pagename);
		map.put("visittime", this.visittime);

		map.put("userid", this.userid);
		map.put("loginname", this.loginname);
		map.put("username", this.username);
		
		map.put("appuuid", this.appuuid);
		map.put("accountuuid", this.accountuuid);
		map.put("accounttype", this.accounttype);
		map.put("personuuid", this.personuuid);
		map.put("personname", this.personname);
		map.put("roleuuid", this.roleuuid);
		map.put("rolename", this.rolename);
		map.put("orguuid", this.orguuid);
		map.put("orgname", this.orgname);
		map.put("orgsimplename", this.orgsimplename);
		map.put("deptuuid", this.deptuuid);
		map.put("deptname", this.deptname);
		map.put("deptsimplename", this.deptsimplename);
		map.put("manageunituuid", this.manageunituuid);
		map.put("manageunitname", this.manageunitname);
		map.put("manageunitorguuid", this.manageunitorguuid);
		map.put("deptuuidex",this.deptuuidex);
		map.put("deptnameex",this.deptnameex);
		map.put("deptsimplenameex", this.deptsimplenameex);
		
		map.put("belongdeptuuid", this.belongdeptuuid);
		map.put("belongdeptname", this.belongdeptname);
		map.put("belongorguuid", this.belongorguuid);
		map.put("belongorgname", this.belongorgname);
		return map;
	}

	public String getAppuuid() {
		return appuuid;
	}

	public void setAppuuid(String appuuid) {
		this.appuuid = appuuid;
	}

	public String getDeptuuidex(){
		return this.deptuuidex;
	}
	
	public void setDeptuuidex(String deptuuidex){
		this.deptuuidex = deptuuidex;
	} 

	public String getDeptnameex(){
		return this.deptnameex;
	}
	
	public void setDeptnameex(String deptnameex){
		this.deptnameex = deptnameex;
	} 
	
	public String getDeptsimplenameex() {
		return deptsimplenameex;
	}

	public void setDeptsimplenameex(String deptsimplenameex) {
		this.deptsimplenameex = deptsimplenameex;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getAccountuuid() {
		return accountuuid;
	}

	public void setAccountuuid(String accountuuid) {
		this.accountuuid = accountuuid;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getPersonuuid() {
		return personuuid;
	}

	public void setPersonuuid(String personuuid) {
		this.personuuid = personuuid;
	}

	public String getPersonname() {
		return personname;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

	public String getRoleuuid() {
		return roleuuid;
	}

	public void setRoleuuid(String roleuuid) {
		this.roleuuid = roleuuid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getOrguuid() {
		return orguuid;
	}

	public void setOrguuid(String orguuid) {
		this.orguuid = orguuid;
	}

	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

	public String getOrgsimplename() {
		return orgsimplename;
	}

	public void setOrgsimplename(String orgsimplename) {
		this.orgsimplename = orgsimplename;
	}

	public String getDeptuuid() {
		return deptuuid;
	}

	public void setDeptuuid(String deptuuid) {
		this.deptuuid = deptuuid;
		super.deptuuid = deptuuid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getDeptsimplename() {
		return deptsimplename;
	}

	public void setDeptsimplename(String deptsimplename) {
		this.deptsimplename = deptsimplename;
	}

	public String getManageunituuid() {
		return manageunituuid;
	}

	public void setManageunituuid(String manageunituuid) {
		this.manageunituuid = manageunituuid;
	}

	public String getManageunitname() {
		return manageunitname;
	}

	public void setManageunitname(String manageunitname) {
		this.manageunitname = manageunitname;
	}

	public String getManageunitorguuid() {
		return manageunitorguuid;
	}

	public void setManageunitorguuid(String manageunitorguuid) {
		this.manageunitorguuid = manageunitorguuid;
	}
	
}