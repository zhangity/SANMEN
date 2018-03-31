package com.longj.platform.pb.msg.bean;

public class MSGResultBean {
	public static final String CODE_Success = "200";					//消息发送成功
	public static final String DESC_Success = "消息发送成功";
	
	public static final String CODE_NoAdapter = "201";					//没有找到适配器
	public static final String DESC_NoAdapter = "没有找到合适的适配器";
	
	public static final String CODE_SendError = "202";					//消息发送失败
	public static final String DESC_SendError = "消息发送失败";

	
	private boolean isSuccess = false;
	private String respcode;
	private String respdesc;
	private String outstr;
	
	public MSGResultBean(boolean isSuccess,String respcode,String respdesc) {
		// TODO Auto-generated constructor stub
		init(isSuccess, respcode, respdesc,null);
	}
	public MSGResultBean(boolean isSuccess,String respcode,String respdesc,String outstr) {
		// TODO Auto-generated constructor stub
		init(isSuccess, respcode, respdesc, outstr);
	}
	private void init(boolean isSuccess,String respcode,String respdesc,String outstr){
		this.isSuccess = isSuccess;
		this.respcode = respcode;
		this.respdesc = respdesc;
		this.outstr = null==outstr?"":outstr;
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("	<wdk>");
		sb.append("		<respcode label=\"是否处理成功  0-失败  1-成功\">"+this.respcode+"</respcode>");
		sb.append("		<respdesc label=\"处理结果描述\">"+this.respdesc+"</respdesc>");
		sb.append(outstr);
		sb.append("	</wdk>");
		return sb.toString();
	}
	public String toStringNoroot() {
		StringBuffer sb = new StringBuffer();
//		sb.append("	<wdk>");
		sb.append("		<respcode label=\"是否处理成功  0-失败  1-成功\">"+this.respcode+"</respcode>");
		sb.append("		<respdesc label=\"处理结果描述\">"+this.respdesc+"</respdesc>");
		sb.append(outstr);
//		sb.append("	</wdk>");
		return sb.toString();
	}
	/******************************
	 * get and set
	 *****************************/
	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getRespcode() {
		return respcode;
	}

	public void setRespcode(String respcode) {
		this.respcode = respcode;
	}

	public String getRespdesc() {
		return respdesc;
	}

	public void setRespdesc(String respdesc) {
		this.respdesc = respdesc;
	}
	public String getOutstr() {
		return outstr;
	}
	public void setOutstr(String outstr) {
		this.outstr = outstr;
	}

	
}