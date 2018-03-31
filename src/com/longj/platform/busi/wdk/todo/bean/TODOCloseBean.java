package com.longj.platform.busi.wdk.todo.bean;

public class TODOCloseBean {
	private String appcode = new String();				//必填，来源应用系统标识
	private String todoid = new String();				//必填，待办在来源系统中的待办ID
	private String closetype = new String();			//必填，关闭方式
	private String closedate = new String();			//必填，关闭时间
	
	public TODOCloseBean(String appcode,String todoid,String closetype,String closedate) {
		// TODO Auto-generated constructor stub
		this.appcode = appcode;
		this.todoid = todoid;
		this.closetype = closetype;
		this.closedate = closedate;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("	<root id=\"ws.todo.close\" appcode=\"发起方的应用标识\" verifycode=\"发起方验证密码串\"/>");
		sb.append("	<data label=\"服务报文\">");
		sb.append("		<appcode label=\"必填，来源应用系统标识\">"+this.appcode+"</appcode>");
		sb.append("		<todoid label=\"必填，待办在来源系统中的待办ID\">"+this.todoid+"</todoid>");
		sb.append("		<closetype label=\"必填，关闭方式\">"+this.closetype+"</closetype>");
		sb.append("		<closedate label=\"必填，关闭时间\">"+this.closedate+"</closedate>");
		sb.append("	</data>");
		return sb.toString();
	}
	
	/***********************************
	 * get and set method
	 **********************************/
	public String getAppcode() {
		return appcode;
	}
	public void setAppcode(String appcode) {
		this.appcode = appcode;
	}
	public String getTodoid() {
		return todoid;
	}
	public void setTodoid(String todoid) {
		this.todoid = todoid;
	}
	public String getClosetype() {
		return closetype;
	}
	public void setClosetype(String closetype) {
		this.closetype = closetype;
	}
	public String getClosedate() {
		return closedate;
	}
	public void setClosedate(String closedate) {
		this.closedate = closedate;
	}
	
	
}