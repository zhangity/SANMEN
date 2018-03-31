package com.longj.platform.busi.wdk.todo.server;

import org.wdk.WDK;
import org.wdk.core.bean.WDKLogger;

import com.longj.platform.busi.wdk.todo.TODOServer;
import com.longj.platform.busi.wdk.todo.bean.BaseTodoWS;



public class WSTodoAdd extends BaseTodoWS{
	
	private static WDKLogger logger = new WDKLogger(WSTodoAdd.class.getName()); 
	
	public static void main(String[] args) {
//		new WDKCore().start();
		StringBuffer sb = new StringBuffer();
		sb.append("<wdk>");
		sb.append("	<route method=\"ws.todo.add\" appcode=\"发起方的应用标识\" verifycode=\"发起方验证密码串\"/>");
		sb.append("	<data label=\"服务报文\">");
		sb.append("		<appcode label=\"必填，来源应用系统标识\">oa</appcode>");
		sb.append("		<todoid label=\"必填，待办在来源系统中的待办ID\">todo1001</todoid>");
		sb.append("		<todotype label=\"允许为空，待办类型\">01</todotype>");
		sb.append("		<flowname label=\"允许为空，流程名称\">flowname11</flowname>");
		sb.append("		<flowtype label=\"允许为空，流程类型\">flowtype22</flowtype>");
		sb.append("		<nodename label=\"允许为空，当前环节名称\">nodename22</nodename>");
		sb.append("		<prenodename label=\"允许为空，当前环节名称\">nodename22</prenodename>");
		sb.append("		<title label=\"必填，待办任务标题\">title3333</title>");
		sb.append("		<tasksummary label=\"允许为空，任务摘要\">tasksummary111</tasksummary>");
		sb.append("		<userid label=\"必填，处理人ID\">userid222</userid>");;
		sb.append("		<username label=\"必填，处理人ID\">username222</username>");;
		sb.append("		<preuserid label=\"必填，处理人ID\">preuserid222</preuserid>");
		sb.append("		<preusername label=\"允许为空，上一环节任务处理人名称\">preusername213123</preusername>");
		sb.append("		<tasktime label=\"必填，任务送达时间\">tasktime223213</tasktime>");
		sb.append("		<relativepath label=\"必填，待办办理界面相对路径\">relativepath21321</relativepath>");
		sb.append("		<expirestime label=\"允许为空，待办任务逾期时间\">expirestime213</expirestime>");
		sb.append("		<warningtime label=\"允许为空，待办任务预警时间\">warningtime213213</warningtime>");
		sb.append("		<emergency label=\"允许为空，紧急程度\">emergency22</emergency>");
		sb.append("		<remark	label=\"允许为空，备注\">remark2131</remark>");
		sb.append("		<extraparam label=\"允许为空，自定义参数\">extraparam213</extraparam>");
		sb.append("	</data>");
		sb.append("</wdk>");
		System.out.println(sb.toString());
		System.out.println(WSTodoAdd.class.getName());
//		new WSTodoAdd().process(sb.toString());
	}
	
	
	@Override
	public String process(String instr) {
		//1、生成操作流水序列号
		String serialuuid = WDK.getUUID();				//序列号
		
		//2、保存日志
		//PBMark.insert(PBMark.TYPE_Todo, serialuuid, PBMark.DIRECTION_Request, instr);
		logger.debug("------------------------------------------------公文待办接口输入："+instr);
		
		//3、调用新增统一待办服务
		String outstr=null;
		try {
			outstr = TODOServer.add(instr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//4、返回报文留痕
		//PBMark.insert(PBMark.TYPE_Todo, serialuuid, PBMark.DIRECTION_Response, outstr);
		logger.debug("------------------------------------------------公文待办接口输出："+instr);
		
		//5、如果有需要往第三方门户同步的话则统一处理
		_Transfer("WSTodoAdd",instr);
		
		
		return outstr;
	}

}