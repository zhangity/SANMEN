package com.longj.platform.pb.msg.bean;

import java.util.HashMap;

import net.sf.json.JSONObject;

import org.wdk.WDK;

import com.longj.platform.pb.msg.MSG;


public class MSGBean {
	private String unmsg_uuid;			//统一消息ID
	private String sendertype;			//发送者类型
	private String senderid;			//发送者标识
	private String sendername;			//发送者名称
	private String msgid;				//消息在源系统中的ID
	private String msgtype;				//消息类型
	private String msgtitle;			//消息标题
	private String msgsummary;			//消息摘要
	private String msgcontent;			//消息内容
	private String msgtime;				//消息产生时间
	private String msgparam;			//自定义发送参数
	private String receivertype;		//接收者类型
	private String receiverid;			//接收者标识
	private String routetype;			//路由方式
	private String routetime;			//预定发送时间
	private String status;				//发送状态
	private String sendcount;			//当前发送次数
	private String updatetime;			//上一次处理时间
	private String createtime;			//创建时间
	
	
	public MSGBean() {
		// TODO Auto-generated constructor stub
		this.unmsg_uuid = WDK.getUUID();
		this.status = MSG.STATUS_Wait;
		this.sendcount = "0";
		this.createtime = WDK.getDateTime2();
	}
	public MSGBean(String msgcontent,String receivertype,String receiverid) {
		this.unmsg_uuid = WDK.getUUID();
		this.msgcontent = msgcontent;
		this.receivertype = receivertype;
		this.receiverid = receiverid;
		this.status = MSG.STATUS_Wait;
		this.sendcount = "0";
		this.createtime = WDK.getDateTime2();
	}
	
	public MSGBean(String instr) {
		// TODO Auto-generated constructor stub
		this.unmsg_uuid = WDK.getUUID();
		this.status = MSG.STATUS_Wait;
		this.sendcount = "0";
		this.createtime = WDK.getDateTime2();
	}
	
	
	public MSGBean(JSONObject jrow) {
		this.unmsg_uuid = jrow.has("unmsg_uuid")?jrow.getString("unmsg_uuid"):WDK.getUUID();
		this.sendertype = jrow.has("sendertype")?jrow.getString("sendertype"):"";
		this.senderid = jrow.has("senderid")?jrow.getString("senderid"):"";
		this.sendername = jrow.has("sendername")?jrow.getString("sendername"):"";
		this.msgid = jrow.has("msgid")?jrow.getString("msgid"):"";
		this.msgtype = jrow.has("msgtype")?jrow.getString("msgtype"):"";
		this.msgtitle = jrow.has("msgtitle")?jrow.getString("msgtitle"):"";
		this.msgsummary = jrow.has("msgsummary")?jrow.getString("msgsummary"):"";
		this.msgcontent = jrow.has("msgcontent")?jrow.getString("msgcontent"):"";
		this.msgtime = jrow.has("msgtime")?jrow.getString("msgtime"):"";
		this.msgparam = jrow.has("msgparam")?jrow.getString("msgparam"):"";
		this.receivertype = jrow.has("receivertype")?jrow.getString("receivertype"):"";
		this.receiverid = jrow.has("receiverid")?jrow.getString("receiverid"):"";
		this.routetype = jrow.has("routetype")?jrow.getString("routetype"):"";
		this.routetime = jrow.has("routetime")?jrow.getString("routetime"):"";
		this.status = jrow.has("status")?jrow.getString("status"):"";
		this.sendcount = jrow.has("sendcount")?jrow.getString("sendcount"):"";
		this.updatetime = jrow.has("updatetime")?jrow.getString("updatetime"):"";
		this.createtime = jrow.has("createtime")?jrow.getString("createtime"):"";
	}

	public HashMap<String,String> toMap(){
		HashMap<String,String> param = new HashMap<String, String>();
		param.put("unmsg_uuid", this.unmsg_uuid);			//统一消息ID
		param.put("sendertype", this.sendertype);			//发送者类型
		param.put("senderid", this.senderid);				//发送者标识
		param.put("sendername", this.sendername);
		param.put("msgid", this.msgid);						//消息在源系统中的ID
		param.put("msgtype", this.msgtype);					//消息类型
		param.put("msgtitle", this.msgtitle);				//消息标题
		param.put("msgsummary", this.msgsummary);			//消息摘要
		param.put("msgcontent", this.msgcontent);			//消息内容
		param.put("msgtime", this.msgtime);					//消息产生时间
		param.put("msgparam", this.msgparam);				//自定义发送参数
		param.put("receivertype", this.receivertype);		//接收者类型
		param.put("receiverid", this.receiverid);			//接收者标识
		param.put("routetype", this.routetype);				//路由方式
		param.put("routetime", this.routetime);				//预定发送时间
		param.put("status", this.status);					//发送状态
		param.put("sendcount", this.sendcount);				//当前发送次数
		param.put("updatetime", this.updatetime);			//上一次处理时间
		param.put("createtime", this.createtime);			//创建时间
		return param;
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("<data>");
		sb.append("<unmsg_uuid>"+this.unmsg_uuid+"</unmsg_uuid>");
		sb.append("<sendertype>"+this.sendertype+"</sendertype>");
		sb.append("<senderid>"+this.senderid+"</senderid>");
		sb.append("<sendername>"+this.sendername+"</sendername>");
		sb.append("<msgid>"+this.msgid+"</msgid>");
		sb.append("<msgtype>"+this.msgtype+"</msgtype>");
		sb.append("<msgtitle>"+this.msgtitle+"</msgtitle>");
		sb.append("<msgsummary>"+this.msgsummary+"</msgsummary>");
		sb.append("<msgcontent>"+this.msgcontent+"</msgcontent>");
		sb.append("<msgtime>"+this.msgtime+"</msgtime>");
		sb.append("<msgparam>"+this.msgparam+"</msgparam>");
		sb.append("<receivertype>"+this.receivertype+"</receivertype>");
		sb.append("<receiverid>"+this.receiverid+"</receiverid>");
		sb.append("<routetype>"+this.routetype+"</routetype>");
		sb.append("<routetime>"+this.routetime+"</routetime>");
		sb.append("<status>"+this.status+"</status>");
		sb.append("<sendcount>"+this.sendcount+"</sendcount>");
		sb.append("<updatetime>"+this.updatetime+"</updatetime>");
		sb.append("<createtime>"+this.createtime+"</createtime>");
		sb.append("</data>");
		return sb.toString();
	}
	
	
	/********************************
	 * get and set
	 ********************************/
	public String getUnmsg_uuid() {
		return unmsg_uuid;
	}

	public void setUnmsg_uuid(String unmsgUuid) {
		unmsg_uuid = unmsgUuid;
	}

	public String getSendertype() {
		return sendertype;
	}

	public void setSendertype(String sendertype) {
		this.sendertype = sendertype;
	}

	public String getSenderid() {
		return senderid;
	}

	public void setSenderid(String senderid) {
		this.senderid = senderid;
	}

	
	public String getSendername() {
		return sendername;
	}
	public void setSendername(String sendername) {
		this.sendername = sendername;
	}
	public String getMsgid() {
		return msgid;
	}

	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}

	public String getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public String getMsgtitle() {
		return msgtitle;
	}

	public void setMsgtitle(String msgtitle) {
		this.msgtitle = msgtitle;
	}

	public String getMsgsummary() {
		return msgsummary;
	}

	public void setMsgsummary(String msgsummary) {
		this.msgsummary = msgsummary;
	}

	public String getMsgcontent() {
		return msgcontent;
	}

	public void setMsgcontent(String msgcontent) {
		this.msgcontent = msgcontent;
	}

	public String getMsgtime() {
		return msgtime;
	}

	public void setMsgtime(String msgtime) {
		this.msgtime = msgtime;
	}

	public String getMsgparam() {
		return msgparam;
	}

	public void setMsgparam(String msgparam) {
		this.msgparam = msgparam;
	}

	public String getReceivertype() {
		return receivertype;
	}

	public void setReceivertype(String receivertype) {
		this.receivertype = receivertype;
	}

	public String getReceiverid() {
		return receiverid;
	}

	public void setReceiverid(String receiverid) {
		this.receiverid = receiverid;
	}

	public String getRoutetype() {
		return routetype;
	}

	public void setRoutetype(String routetype) {
		this.routetype = routetype;
	}

	public String getRoutetime() {
		return routetime;
	}

	public void setRoutetime(String routetime) {
		this.routetime = routetime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSendcount() {
		return sendcount;
	}

	public void setSendcount(String sendcount) {
		this.sendcount = sendcount;
	}

	public String getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	
	
}