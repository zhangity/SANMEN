package com.longj.platform.busi.wdk.mq;

public class MQServerBean {
	private String server_uuid = "";
	private String server_code = "";
	private String server_name = "";
	private String hostname = "";
	private String channel = "";
	private String ccsid = "";
	private String port = "";
	private String qmname = "";
	private String qname_get = "";
	private String qname_put = "";
	private String userid = "";
	private String pwd = "";
	private String busiclass = "";
	private String runmodel = ""; //运行模式 1：自动轮询 2：手工触发，默认1
	private String remark = "";
	private String isactive = "";
	
	
	public String getServer_uuid() {
		return server_uuid;
	}
	public void setServer_uuid(String server_uuid) {
		this.server_uuid = server_uuid;
	}
	public String getServer_code() {
		return server_code;
	}
	public void setServer_code(String server_code) {
		this.server_code = server_code;
	}
	public String getServer_name() {
		return server_name;
	}
	public void setServer_name(String server_name) {
		this.server_name = server_name;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getCcsid() {
		return ccsid;
	}
	public void setCcsid(String ccsid) {
		this.ccsid = ccsid;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getQmname() {
		return qmname;
	}
	public void setQmname(String qmname) {
		this.qmname = qmname;
	}
	public String getQname_get() {
		return qname_get;
	}
	public void setQname_get(String qname_get) {
		this.qname_get = qname_get;
	}
	public String getQname_put() {
		return qname_put;
	}
	public void setQname_put(String qname_put) {
		this.qname_put = qname_put;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getBusiclass() {
		return busiclass;
	}
	public void setBusiclass(String busiclass) {
		this.busiclass = busiclass;
	}
	
	public String getRunmodel() {
		return runmodel;
	}
	public void setRunmodel(String runmodel) {
		this.runmodel = runmodel;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getIsactive() {
		return isactive;
	}
	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}
	
	
}
