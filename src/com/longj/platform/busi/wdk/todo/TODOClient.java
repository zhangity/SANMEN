package com.longj.platform.busi.wdk.todo;

import java.util.HashMap;

import org.wdk.WDK;
import org.wdk.module.ws.WSClient;
import org.wdk.module.ws.WSProtocol;

import com.longj.platform.busi.wdk.todo.bean.TODOAddBean;
import com.longj.platform.busi.wdk.todo.bean.TODOCloseBean;
import com.longj.platform.busi.wdk.todo.bean.TODOQueryBean;
import com.longj.platform.busi.wdk.todo.bean.TODOQueryHistBean;
import com.longj.platform.busi.wdk.todo.bean.TODOStatisBean;



public class TODOClient {
	public static void main(String[] args) {
		String appcode = "app001";
		String todoid = "todoid001";
		String title = "测试001";
		String tasktime = "2015-10-03 13:22:33";
		String relativepath = "/platform/tododirect.jsp";
		TODOAddBean tab = new TODOAddBean(appcode, todoid, title, tasktime, relativepath);
		String outstr = TODOClient.add(tab);
		System.out.println("outstr="+outstr);
	}
	
	/**
	 * 新增待办
	 * @param param
	 * @return
	 */
	public static String add(HashMap<String,String> param){
		String instr = TODOProtocol.PROP_Add_Request(param);
		return wssend(WSProtocol.getWSProtocol("ws.todo.add", instr));
	}
	public static String add(TODOAddBean tab){
		String instr = tab.toString();
		return wssend(WSProtocol.getWSProtocol("ws.todo.add", instr));
	}
	public static String add(String instr){
		return wssend(WSProtocol.getWSProtocol("ws.todo.add", instr));
	}
	
	/**
	 * 查询待办
	 * @param param
	 * @return
	 */
	public static String query(HashMap<String,String> param){
		String instr = TODOProtocol.PROP_Query_Request(param);
		return wssend(WSProtocol.getWSProtocol("ws.todo.query", instr));
	}
	public static String query(TODOQueryBean tqb){
		String instr = tqb.toString();
		return wssend(WSProtocol.getWSProtocol("ws.todo.query", instr));
	}
	public static String query(String instr){
		return wssend(WSProtocol.getWSProtocol("ws.todo.query", instr));
	}
	/**
	 * 关闭待办
	 * @param param
	 * @return
	 */
	public static String close(HashMap<String,String> param){
		String instr = TODOProtocol.PROP_Close_Request(param);
		return wssend(WSProtocol.getWSProtocol("ws.todo.close", instr));
	}
	public static String close(TODOCloseBean tcb){
		String instr = tcb.toString();
		return wssend(WSProtocol.getWSProtocol("ws.todo.close", instr));
	}
	public static String close(String instr){
		return wssend(WSProtocol.getWSProtocol("ws.todo.close", instr));
	}
	
	/**
	 * 查询待办
	 * @param param
	 * @return
	 */
	public static String statis(HashMap<String,String> param){
		String instr = TODOProtocol.PROP_Statis_Request(param);
		return wssend(WSProtocol.getWSProtocol("ws.todo.statis", instr));
	}
	public static String statis(TODOStatisBean tsb){
		String instr = tsb.toString();
		return wssend(WSProtocol.getWSProtocol("ws.todo.statis", instr));
	}
	public static String statis(String instr){
		return wssend(WSProtocol.getWSProtocol("ws.todo.statis", instr));
	}
	
	
	
	/**
	 * 查询待办
	 * @param param
	 * @return
	 */
	public static String queryHist(HashMap<String,String> param){
		String instr = TODOProtocol.PROP_QueryHist_Request(param);
		return wssend(WSProtocol.getWSProtocol("ws.todo.queryhist", instr));
	}
	public static String queryHist(TODOQueryHistBean tqhb){
		String instr = tqhb.toString();
		return wssend(WSProtocol.getWSProtocol("ws.todo.queryhist", instr));
	}
	public static String queryHist(String instr){
		return wssend(WSProtocol.getWSProtocol("ws.todo.queryhist", instr));
	}
	
	
	
	
	
	
	
	
	/**
	 * ws的发送客户端
	 * @param message
	 * @return
	 */
	private static String wssend(String instr){
		String endpoint = WDK.getNodeParam("todo_server_endpoint");
		String namespace = WDK.getNodeParam("todo_server_namespace");
		String method = WDK.getNodeParam("todo_server_method");
		
//		String endpoint = "http://localhost:8080/tieg/services/WSChannel?wsdl";
//		String namespace = "http://channel.wdk.org";
//		String method = "process";
			
		System.out.println("instr="+instr);
		String outstr = "";
		try {
			//判断统一待办服务端是否为本机，如果是则不走webservices，直接走数据库。否则走webservices
			if(isLocalWS()){
				//直接本地数据库调用
				outstr = new WSClient(endpoint, namespace, method, instr).localsend();
			}else{
				//通过webservices方式调用
				outstr = new WSClient(endpoint, namespace, method, instr).send();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return outstr;
	}
	
	/**
	 * 判断统一待办服务端是否为本机
	 * @return
	 */
	private static boolean isLocalWS(){
		String islocalserver = WDK.getNodeParam("todo_server_islocalserver");
		if("1".equals(islocalserver)){
			return true;
		}else{
			return false;
		}
	}
}