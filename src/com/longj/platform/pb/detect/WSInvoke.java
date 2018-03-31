package com.longj.platform.pb.detect;

import java.lang.reflect.Method;

import org.w3c.dom.Node;
import org.wdk.WDK;
import org.wdk.core.base.BaseWS;
import org.wdk.core.util.uXmlParse;
import org.wdk.module.ws.WSClient;

public class WSInvoke extends BaseWS{

	@Override
	public String process(String instr) {
		// TODO Auto-generated method stub
		
		try {
			//解析类
			Node root = uXmlParse.loadxmlString(instr);
			
			String ivkClass = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/class"));
			String ivkMethod = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/method"));
			
			Class<?> c = Class.forName(ivkClass);
			Method m = c.getMethod(ivkMethod);
			m.setAccessible(true);
			m.invoke(c.newInstance());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "";
	}
	
	public static String getProtocol(String className,String methodName){
		StringBuffer sb = new StringBuffer();
		sb.append("	<data label=\"服务报文，除必填外，其余如果有则匹配，没有则不匹配\">");
		sb.append("		<class label=\"必填，处理类\">"+className+"</class>");
		sb.append("		<method label=\"必填，处理方法\">"+methodName+"</method>");
		sb.append("	</data>");
		return sb.toString();
	}
	/**
	 * ws的发送客户端
	 * @param message
	 * @return
	 */
	public static String wssend(String instr){
		String local_ws_ip = WDK.getNodeParam("local_ws_ip");
		String local_ws_port = WDK.getNodeParam("local_ws_port");
		String local_ws_appname = WDK.getNodeParam("local_ws_appname");
		//"http://localhost:8080/tieg/services/WSChannel?wsdl";
		String endpoint = "http://"+local_ws_ip+":"+local_ws_port+"/"+local_ws_appname+"/services/WSChannel?wsdl"; 
		String namespace = "http://channel.wdk.org";
		String method = "process";
			
		
		System.out.println("instr="+instr);
		String outstr = "";
		try {
			outstr = new WSClient(endpoint, namespace, method, instr).send();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return outstr;
	}
}