package com.longj.platform.busi.wdk.todo.bean;

public class TODOStatisBean {
	private String clienttype = new String();				//允许为空，查询待办的客户端类型，如移动端
	private String groupfield = new String();				//必填，查询分组标识
	private String appcode = new String();					//允许为空，来源应用系统标识
	private String todoid = new String();					//允许为空，待办在来源系统中的待办ID
	private String todotype = new String();					//允许为空，待办类型
	private String flowtype = new String();					//允许为空，流程类型
	private String title = new String();					//允许为空，待办任务标题
	private String userid = new String();					//允许为空，处理人ID
	private String starttime = new String();				//允许为空，任务开始时间
	private String endtime = new String();					//允许为空，任务结束时间
	private String param = new String();					//允许为空，其它自定义参数
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("	<data label=\"服务报文，除必填外，其余如果有则匹配，没有则不匹配\">");
		sb.append("		<groupfield label=\"允许为空，来源应用系统标识\">"+this.groupfield+"</groupfield>");
		sb.append("		<clienttype label=\"允许为空，查询待办的客户端类型，如移动端\">"+this.clienttype+"</clienttype>");
		sb.append("		<appcode label=\"允许为空，来源应用系统标识\">"+this.appcode+"</appcode>");
		sb.append("		<todoid label=\"允许为空，待办在来源系统中的待办ID\">"+this.todoid+"</todoid>");
		sb.append("		<todotype label=\"允许为空，待办类型\">"+this.todotype+"</todotype>");
		sb.append("		<flowtype label=\"允许为空，流程类型\">"+this.flowtype+"</flowtype>");
		sb.append("		<title label=\"允许为空，待办任务标题，如有则进行模糊匹配\">"+this.title+"</title>");
		sb.append("		<userid label=\"允许为空，处理人ID\">"+this.userid+"</userid>");
		sb.append("		<starttime label=\"允许为空，任务开始时间\">"+this.starttime+"</starttime>");
		sb.append("		<endtime label=\"允许为空，任务结束时间\">"+this.endtime+"</endtime>");
		sb.append("		<param label=\"允许为空，其它自定义参数\">"+this.param+"</param>");
		sb.append("	</data>");
		return sb.toString();
	}
	
	/***********************************
	 * get and set method
	 **********************************/
	
	public String getAppcode() {
		return appcode;
	}
	public String getGroupfield() {
		return groupfield;
	}

	public void setGroupfield(String groupfield) {
		this.groupfield = groupfield;
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
	public String getTodotype() {
		return todotype;
	}
	public void setTodotype(String todotype) {
		this.todotype = todotype;
	}
	
	public String getFlowtype() {
		return flowtype;
	}

	public void setFlowtype(String flowtype) {
		this.flowtype = flowtype;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getClienttype() {
		return clienttype;
	}

	public void setClienttype(String clienttype) {
		this.clienttype = clienttype;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getParam() {
		return param;
	}
	
	
}
