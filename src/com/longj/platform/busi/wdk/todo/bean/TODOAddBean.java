package com.longj.platform.busi.wdk.todo.bean;

public class TODOAddBean {
	private String appcode = new String();					//必填，来源应用系统标识
	private String todoid = new String();					//必填，待办在来源系统中的待办ID
	private String todotype = new String();					//允许为空，待办类型
	private String flowname = new String();					//允许为空，流程名称
	private String flowtype = new String();					//允许为空，流程类型
	private String nodename = new String();					//允许为空，当前环节名称
	private String prenodename = new String();				//允许为空，前一环节名称
	private String title = new String();					//必填，待办任务标题
	private String tasksummary = new String();				//允许为空，任务摘要
	private String userid = new String();					//必填，处理人ID
	private String username = new String();					//必填，处理人姓名
	private String preuserid = new String();				//允许为空，前一处理人ID
	private String preusername = new String();				//允许为空，前一处理人姓名
	private String tasktime = new String();					//必填，任务送达时间
	private String relativepath = new String();				//必填，待办办理界面相对路径
	private String expirestime = new String();				//允许为空，待办任务逾期时间
	private String warningtime = new String();				//允许为空，待办任务预警时间
	private String emergency = new String();				//允许为空，紧急程度
	private String remark = new String();					//允许为空，备注
	private String extraparam = new String();				//允许为空，自定义参数
	

	public TODOAddBean(String appcode,String todoid,String title,String tasktime,String relativepath) {
		// TODO Auto-generated constructor stub
		this.appcode = appcode;
		this.todoid = todoid;
		this.title = title;
		this.tasktime = tasktime;
		this.relativepath = relativepath;
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("	<data label=\"服务报文\">");
		sb.append("		<appcode label=\"必填，来源应用系统标识\">"+this.appcode+"</appcode>");
		sb.append("		<todoid label=\"必填，待办在来源系统中的待办ID\">"+this.todoid+"</todoid>");
		sb.append("		<todotype label=\"允许为空，待办类型\">"+this.todotype+"</todotype>");
		sb.append("		<flowname label=\"允许为空，流程名称\">"+this.flowname+"</flowname>");
		sb.append("		<flowtype label=\"允许为空，流程类型\">"+this.flowtype+"</flowtype>");
		sb.append("		<nodename label=\"允许为空，当前环节名称\">"+this.nodename+"</nodename>");
		sb.append("		<prenodename label=\"允许为空，前一环节名称\">"+this.prenodename+"</prenodename>");
		sb.append("		<title label=\"必填，待办任务标题\">"+this.title+"</title>");
		sb.append("		<tasksummary label=\"允许为空，任务摘要\">"+this.tasksummary+"</tasksummary>");
		sb.append("		<userid label=\"必填，处理人ID\">"+this.userid+"</userid>");
		sb.append("		<username label=\"必填，处理人姓名\">"+this.username+"</username>");
		sb.append("		<preuserid label=\"允许为空，上一环节任务处理人ID\">"+this.preuserid+"</preuserid>");
		sb.append("		<preusername label=\"允许为空，上一环节任务处理人名称\">"+this.preusername+"</preusername>");
		sb.append("		<tasktime label=\"必填，任务送达时间\">"+this.tasktime+"</tasktime>");
		sb.append("		<relativepath label=\"必填，待办办理界面相对路径\">"+this.relativepath+"</relativepath>");
		sb.append("		<expirestime label=\"允许为空，待办任务逾期时间\">"+this.expirestime+"</expirestime>");
		sb.append("		<warningtime label=\"允许为空，待办任务预警时间\">"+this.warningtime+"</warningtime>");
		sb.append("		<emergency label=\"允许为空，紧急程度\">"+this.emergency+"</emergency>");
		sb.append("		<remark	label=\"允许为空，备注\">"+this.remark+"</remark>");
		sb.append("		<extraparam label=\"允许为空，自定义参数\">"+this.extraparam+"</extraparam>");
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
	public String getTodotype() {
		return todotype;
	}
	public void setTodotype(String todotype) {
		this.todotype = todotype;
	}
	public String getFlowname() {
		return flowname;
	}
	public void setFlowname(String flowname) {
		this.flowname = flowname;
	}
	public String getFlowtype() {
		return flowtype;
	}
	public void setFlowtype(String flowtype) {
		this.flowtype = flowtype;
	}
	public String getNodename() {
		return nodename;
	}
	public void setNodename(String nodename) {
		this.nodename = nodename;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTasksummary() {
		return tasksummary;
	}
	public void setTasksummary(String tasksummary) {
		this.tasksummary = tasksummary;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getTasktime() {
		return tasktime;
	}
	public void setTasktime(String tasktime) {
		this.tasktime = tasktime;
	}
	public String getPreusername() {
		return preusername;
	}
	public void setPreusername(String preusername) {
		this.preusername = preusername;
	}
	public String getRelativepath() {
		return relativepath;
	}
	public void setRelativepath(String relativepath) {
		this.relativepath = relativepath;
	}
	public String getExpirestime() {
		return expirestime;
	}
	public void setExpirestime(String expirestime) {
		this.expirestime = expirestime;
	}
	public String getWarningtime() {
		return warningtime;
	}
	public void setWarningtime(String warningtime) {
		this.warningtime = warningtime;
	}
	public String getEmergency() {
		return emergency;
	}
	public void setEmergency(String emergency) {
		this.emergency = emergency;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getExtraparam() {
		return extraparam;
	}
	public void setExtraparam(String extraparam) {
		this.extraparam = extraparam;
	}
	public String getPrenodename() {
		return prenodename;
	}
	public void setPrenodename(String prenodename) {
		this.prenodename = prenodename;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPreuserid() {
		return preuserid;
	}
	public void setPreuserid(String preuserid) {
		this.preuserid = preuserid;
	}
	
}