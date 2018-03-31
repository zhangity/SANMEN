package com.longj.platform.busi.wdk.todo.server;

import org.wdk.WDK;
import org.wdk.WDKCore;
import org.wdk.core.bean.WDKLogger;

import com.longj.platform.busi.wdk.todo.TODOServer;
import com.longj.platform.busi.wdk.todo.bean.BaseTodoWS;



public class WSTodoClose extends BaseTodoWS{
	
	private static WDKLogger logger = new WDKLogger(WSTodoClose.class.getName()); 

	public static void main(String[] args) {
		new WDKCore().start();
		StringBuffer sb = new StringBuffer();
		sb.append("<wdk>");
		sb.append("	<route method=\"ws.todo.close\" appcode=\"发起方的应用标识\" verifycode=\"发起方验证密码串\"/>");
		sb.append("	<data label=\"服务报文\">");
		sb.append("		<appcode label=\"必填，来源应用系统标识\">oa</appcode>");
		sb.append("		<todoid label=\"必填，待办在来源系统中的待办ID\">aabbcc,bbbb,cccc</todoid>");
		sb.append("		<closetype label=\"必填，关闭方式\">02</closetype>");
		sb.append("		<closedate label=\"必填，关闭时间\">2015-09-29 13:22:00</closedate>");
		sb.append("	</data>");
		sb.append("</wdk>");
		new WSTodoClose().process(sb.toString());
	}
	
	@Override
	public String process(String instr) {
		//1、生成操作流水序列号
		String serialuuid = WDK.getUUID();				//序列号
		
		//2、保存日志
		//PBMark.insert(PBMark.TYPE_Todo, serialuuid, PBMark.DIRECTION_Request, instr);
		logger.debug("------------------------------------------------公文待办关闭接口输入："+instr);
		
		//3、调用新增统一待办服务
		String outstr = TODOServer.close(instr);
		
		//4、返回报文留痕
		//PBMark.insert(PBMark.TYPE_Todo, serialuuid, PBMark.DIRECTION_Response, outstr);
		logger.debug("------------------------------------------------公文待办关闭接口输出："+instr);
		
		//5、如果有需要往第三方门户同步的话则统一处理
		_Transfer("WSTodoClose",instr);
		
		return outstr;
	}

}