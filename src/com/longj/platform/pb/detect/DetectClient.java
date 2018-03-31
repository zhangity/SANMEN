package com.longj.platform.pb.detect;

import org.wdk.WDK;
import org.wdk.module.ws.WSClient;
import org.wdk.module.ws.WSProtocol;

public class DetectClient {
	private static void wssend(String instr){
		//给每个客户端都发送
        String nodes = WDK.getNodeParam("nodes");
        if (nodes != null) {
            // node001|127.0.0.1|8080|tieg;node002|127.0.0.1|8080|tieg
            String[] arr = nodes.split(";");
            for (int i = 0; i < arr.length; i++) {
                String node = arr[i];
                String[] arr2 = node.split("[|]");
                String nodeid = arr2[0];
                String ip = arr2[1];
                String port = arr2[2];
                String appname = arr2[3];
                String endpoint = "http://" + ip + ":" + port + "/" + appname + "/services/WSChannel?wsdl";
                String namespace = "http://channel.wdk.org";
                String method = "process";
                String outstr = "";
                try {
                    outstr = new WSClient(endpoint, namespace, method, instr).send();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println(outstr);
            }
        }
		
//		String endpoint = WDK.getNodeParam("todo_server_endpoint");
//		String namespace = WDK.getNodeParam("todo_server_namespace");
//		String method = WDK.getNodeParam("todo_server_method");
//		
////		String endpoint = "http://localhost:8080/tieg/services/WSChannel?wsdl";
////		String namespace = "http://channel.wdk.org";
////		String method = "process";
//			
//		System.out.println("instr="+instr);
//		String outstr = "";
//		try {
//			outstr = new WSClient(endpoint, namespace, method, instr).send();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return outstr;
	}
	
	public static void session_destory(String userid){
		StringBuffer sb = new StringBuffer();
		sb.append("<data>");
		sb.append("	<method>session_destory</method>");
		sb.append("	<param>");
		sb.append("		<userid>"+userid+"</userid>");
		sb.append("	</param>");
		sb.append("</data>");
		wssend(WSProtocol.getWSProtocol("ws.detect", sb.toString()));
	}
}