package com.longj.platform.pb.msg.server;

import org.w3c.dom.Node;
import org.wdk.WDK;
import org.wdk.core.base.BaseWS;
import org.wdk.core.util.uXmlParse;
import org.wdk.module.ws.WSProtocol;

import com.longj.platform.pb.mark.PBMark;
import com.longj.platform.pb.msg.MSG;
import com.longj.platform.pb.msg.bean.MSGBean;
import com.longj.platform.pb.msg.bean.MSGResultBean;


/**
 * webservice发送接口
 * @author Administrator
 *
 */
public class WSMsgServer extends BaseWS{
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("<wdk>\n");
		sb.append("	<route method=\"ws.msg.send\" appcode=\"发起方的应用标识\" verifycode=\"发起方验证密码串\"/>\n");
		sb.append("	<data label=\"服务报文\">\n");
		sb.append("		<issync label=\"允许为空，是否异步发送 0-同步  1-异步，默认为1-异步\">1</issync>\n");
		sb.append("		<sendertype label=\"允许为空，发送者类型\">sendertype</sendertype>\n");
		sb.append("		<senderid label=\"允许为空，发送者标识\">senderid</senderid>\n");
		sb.append("		<sendername label=\"允许为空，发送者姓名\">sendername</senderid>\n");
		sb.append("		<msgid label=\"允许为空，消息在源系统中的ID\">msgid</msgid>\n");
		sb.append("		<msgtype label=\"允许为空，消息类型\">msgtype</msgtype>\n");
		sb.append("		<msgtitle label=\"允许为空，消息标题\">msgtitle</msgtitle>\n");
		sb.append("		<msgsummary label=\"允许为空，消息摘要\">msgsummary</msgsummary>\n");
		sb.append("		<msgcontent label=\"必填，消息内容\">msgcontent</msgcontent>\n");
		sb.append("		<msgtime label=\"允许为空，消息产生时间\">msgtime</msgtime>\n");
		sb.append("		<msgparam label=\"允许为空，自定义发送参数\">msgparam</msgparam>\n");
		sb.append("		<receivertype label=\"必填，接收者类型\">sms</receivertype>\n");
		sb.append("		<receiverid label=\"必填，接收者标识\">receiverid</receiverid>\n");
		sb.append("		<routetype label=\"允许为空，路由方式\"></routetype>\n");
		sb.append("		<routetime label=\"允许为空，预定发送时间\">routetime</routetime>\n");
		sb.append("	</data>\n");
		sb.append("</wdk>\n");
		System.out.println(sb.toString());
//		new MSGWSServer().process(sb.toString());
	}
	@Override
	public String process(String instr) {
		//1、生成操作流水序列号
		String serialuuid = WDK.getUUID();				//序列号
		
		//2、保存日志
		PBMark.insert(PBMark.TYPE_MSG, serialuuid, PBMark.DIRECTION_Request, instr);
		
		//3、调用短信发送服务
		MSGResultBean mrb = null;
		MSGBean mb = new MSGBean(instr);
		String route = "";
		try {
			Node root = uXmlParse.loadxmlString(instr);
			Node node_route = uXmlParse.findNode(root, "/wdk/route");
			route = uXmlParse.getNodeOuterXml(node_route, false);
			
			String issync = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/issync"));
			String sendertype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/sendertype"));
			String senderid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/senderid"));
			String sendername = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/sendername"));
			String msgid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/msgid"));
			String msgtype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/msgtype"));
			String msgtitle = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/msgtitle"));
			String msgsummary = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/msgsummary"));
			String msgcontent = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/msgcontent"));
			String msgtime = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/msgtime"));
			String msgparam = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/msgparam"));
			String receivertype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/receivertype"));
			String receiverid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/receiverid"));
			String routetype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/routetype"));
			String routetime = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/routetime"));
			
			mb.setSendertype(sendertype);
			mb.setSenderid(senderid);
			mb.setSendername(sendername);
			mb.setMsgid(msgid);
			mb.setMsgtype(msgtype);
			mb.setMsgtitle(msgtitle);
			mb.setMsgsummary(msgsummary);
			mb.setMsgcontent(msgcontent);
			mb.setMsgtime(msgtime);
			mb.setMsgparam(msgparam);
			mb.setReceivertype(receivertype);
			mb.setReceiverid(receiverid);
			mb.setRoutetype(routetype);
			mb.setRoutetime(routetime);
			
			if("0".equals(issync)){
				//如果是同步调用，则调用异步发送方法
				mrb = MSG.sendSync(mb, false);
			}else{
				//如果是非同步调用，则调用异步发送方法
				mrb = MSG.sendAsyn(mb, false);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			mrb = new MSGResultBean(false, MSGResultBean.CODE_SendError, MSGResultBean.DESC_SendError);
		}
		
		//组装完整ws报文
		String outstr = WSProtocol.getOutstr(route, mrb.toStringNoroot());
		
		//4、返回报文留痕
		PBMark.insert(PBMark.TYPE_MSG, serialuuid, PBMark.DIRECTION_Response, outstr);
		return outstr;
	}

}