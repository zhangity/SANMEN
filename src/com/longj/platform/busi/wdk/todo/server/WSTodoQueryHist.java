package com.longj.platform.busi.wdk.todo.server;

import org.wdk.WDKCore;

import com.longj.platform.busi.wdk.todo.TODOServer;
import com.longj.platform.busi.wdk.todo.bean.BaseTodoWS;



public class WSTodoQueryHist extends BaseTodoWS{
	public static void main(String[] args) {
		new WDKCore().start();
		StringBuffer sb = new StringBuffer();
		sb.append("<wdk>");
		sb.append("	<route method=\"ws.todo.query\" appcode=\"发起方的应用标识\" verifycode=\"发起方验证密码串\"/>");
		sb.append("	<data label=\"服务报文，除必填外，其余如果有则匹配，没有则不匹配\">");
		sb.append("		<appcode label=\"必填，来源应用系统标识\">oa</appcode>");
		sb.append("		<todoid label=\"允许为空，待办在来源系统中的待办ID\"></todoid>");
		sb.append("		<todotype label=\"允许为空，待办类型\"></todotype>");
		sb.append("		<flowtype label=\"允许为空，流程类型\"></flowtype>");
		sb.append("		<title label=\"允许为空，待办任务标题，如有则进行模糊匹配\"></title>");
		sb.append("		<userid label=\"允许为空，处理人ID\"></userid>");
		sb.append("		<starttime label=\"允许为空，任务开始时间\"></starttime>");
		sb.append("		<endtime label=\"允许为空，任务结束时间\"></endtime>");
		sb.append("		<closetype label=\"必填，关闭方式\">02</closetype>");
		sb.append("		<closedate label=\"必填，关闭时间\">2015-09-29 13:22:00</closedate>");
		sb.append("		<pagestart label=\"开始记录数，如果为空则不分页\"></pagestart>");
		sb.append("		<pageend label=\"结束记录数，如果为空，则不分页\"></pageend>");
		sb.append("		<orderby label=\"按时间倒叙或正序 asc或desc\"></orderby>");
		sb.append("	</data>");
		sb.append("</wdk>");
		new WSTodoQuery().process(sb.toString());
	}
	
	@Override
	public String process(String instr) {
		//查询不留痕
		String outstr = TODOServer.queryHist(instr);
		return outstr;
	}
}