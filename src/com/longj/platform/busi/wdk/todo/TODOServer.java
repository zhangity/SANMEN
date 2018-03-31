package com.longj.platform.busi.wdk.todo;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.w3c.dom.Node;
import org.wdk.WDK;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKEnvironment;
import org.wdk.core.util.uXmlParse;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.ws.WSProtocol;

import com.longj.platform.pb.util.StringUtil;
import com.longj.platform.pb.util.WQLUtil;



import wql.WQLNames;

public class TODOServer {
	public static final String CODE_Success = "1";			//操作成功
	public static final String CODE_Fail = "0";				//操作失败
	
	/**
	 * 统一待办新增
	 * @param instr
	 * @return
	 */
	public static String add(String instr){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	WDKContext context = wdkEnv.getWDKContext();
    	ConnectBean conb = context!=null?context.getConnectBean():null;
		
		String outstr = "";
		//1、生成uuid，输入报文留痕
		boolean isSuccess = false;

		String untodo_uuid= WDK.getUUID();				//统一待办主键
		String appcode = "";
		String todoid = "";
		String route = "";
		
		//2、待办入库
		try {
			Node root = uXmlParse.loadxmlString(instr);
			Node node_route = uXmlParse.findNode(root, "/wdk/route");
			route = uXmlParse.getNodeOuterXml(node_route, false);
			appcode = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/appcode"));
			todoid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/todoid"));
			String todotype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/todotype"));
			String flowname = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/flowname"));
			String flowtype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/flowtype"));
			String nodename = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/nodename"));
			String prenodename = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/prenodename"));
			String title = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/title"));
			String tasksummary = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/tasksummary"));
			String userid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/userid"));
			String username = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/username"));
			String preuserid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/preuserid"));
			String preusername = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/preusername"));
			String tasktime = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/tasktime"));
			String relativepath = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/relativepath"));
			String expirestime = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/expirestime"));
			String warningtime = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/warningtime"));
			String emergency = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/emergency"));
			String remark = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/remark"));
			String extraparam = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/extraparam"));
			
			isSuccess = WQL.getWO(WQLNames.UPFTODO0001)
								.addParam("flag", "1")
								.addParam("untodo_uuid", untodo_uuid)
								.addParam("appcode", appcode)
								.addParam("todoid", todoid)
								.addParam("todotype", todotype)
								.addParam("flowname", flowname)
								.addParam("flowtype", flowtype)
								.addParam("nodename", nodename)
								.addParam("prenodename", prenodename)
								.addParam("title", title)
								.addParam("tasksummary", tasksummary)
								.addParam("userid", userid)
								.addParam("username", username)
								.addParam("preuserid", preuserid)
								.addParam("preusername", preusername)
								.addParam("tasktime", tasktime)
								.addParam("relativepath", relativepath)
								.addParam("expirestime", expirestime)
								.addParam("warningtime", warningtime)
								.addParam("emergency", emergency)
								.addParam("remark", remark)
								.addParam("extraparam", extraparam)
								.addParam("createdate", WDK.getDateTime())
								.process(conb)
								.isSuccess();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			isSuccess = false;
		}
								
		//3、返回报文
		if(isSuccess){
			outstr = TODOProtocol.PROP_Add_Response(CODE_Success, "新增待办成功", appcode, todoid, untodo_uuid);
		}else{
			outstr = TODOProtocol.PROP_Add_Response(CODE_Fail, "新增待办失败", appcode, todoid, "");
		}
		//组装完整ws报文
		outstr = WSProtocol.getOutstr(route, outstr);
		
		
		return outstr;
	}
	
	
	/**
	 * 统一待办库查询
	 * 查询不记录报文
	 * @param instr
	 * @return
	
	public static String query(String instr){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	WDKContext context = wdkEnv.getWDKContext();
    	ConnectBean conb = context!=null?context.getConnectBean():null;
		
		String outstr = "";
		JSONArray jrows = new JSONArray();
		int nTotal = 0;
		String pagestart = "0";
		String pageend = "0";
		String appcode = "";
		String route = "";
		String clienttype = "";
		
		//1、查询结果
		try {
			Node root = uXmlParse.loadxmlString(instr);
			Node node_route = uXmlParse.findNode(root, "/wdk/route");
			route = uXmlParse.getNodeOuterXml(node_route, false);
			
			clienttype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/clienttype"));
			appcode = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/appcode"));
			String todoid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/todoid"));
			String todotype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/todotype"));
			String flowtype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/flowtype"));
			String title = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/title"));
			String userid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/userid"));
			String starttime = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/starttime"));
			String endtime = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/endtime"));
			
			pagestart = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/pagestart"));
			pageend = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/pageend"));
			String orderby = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/orderby"));
			
			if(!"".equals(pagestart)&&!"".equals(pageend)&&!"".equals(orderby)){
				JSONObject jres = WQL.getWO(WQLNames.QPFTODO0001)
										.addParam("flag", "2")
										.addParam("appcode", appcode)
										.addParam("todoid", todoid)
										.addParam("todotype", todotype)
										.addParam("flowtype", flowtype)
										.addParam("title", title)
										.addParam("userid", userid)
										.addParam("starttime", starttime)
										.addParam("endtime", endtime)
										.addParam("clienttype", clienttype)
										.pageQuery(Integer.parseInt(pagestart), Integer.parseInt(pageend), orderby, conb);
				jrows = jres.getJSONArray("rows");
				String total = jres.getString("total");
				nTotal = Integer.parseInt(total);
			}else{
				jrows = WQL.getWO(WQLNames.QPFTODO0001)
							.addParam("flag", "1")
							.addParam("appcode", appcode)
							.addParam("todoid", todoid)
							.addParam("todotype", todotype)
							.addParam("flowtype", flowtype)
							.addParam("title", title)
							.addParam("userid", userid)
							.addParam("starttime", starttime)
							.addParam("endtime", endtime)
							.addParam("clienttype", clienttype)
							.process(conb)
							.getResultJSONArray(0);
				nTotal = jrows.size();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jrows = null;
		}
		JSONObject japp = new JSONObject();						
		//2、组装报文
        JSONObject jrow = WQL.getWO("QUUMUA_0001").addParam("app_code", appcode).process(conb).uniqueResult(0);
        if(jrow == null){
            jrow = new JSONObject();
        }
        String _appcode = jrow.has("app_code") ? jrow.getString("app_code") : "";
        String _appip = jrow.has("app_ip") ? jrow.getString("app_ip") : "";
        String _appport = jrow.has("app_port") ? jrow.getString("app_port") : "";
        String _appname = jrow.has("app_deploy_name") ? jrow.getString("app_deploy_name") : "";

        japp.put("appcode", _appcode);
        japp.put("appip", _appip);
        japp.put("appport", _appport);
        japp.put("appname", _appname);
		
		//3、返回报文
		if(null!=jrows){
			outstr = TODOProtocol.PROP_Query_Response(CODE_Success, "待办查询成功",appcode,japp,pagestart,pageend,Integer.toString(nTotal), jrows);
		}else{
			outstr = TODOProtocol.PROP_Query_Response(CODE_Fail, "待办查询失败", appcode,null,pagestart,pageend,Integer.toString(nTotal), null);
		}
		//组装完整ws报文
		outstr = WSProtocol.getOutstr(route, outstr);
		
		return outstr;
	}
	
	 */
	/**
	 * 统一待办库查询
	 * 查询不记录报文
	 * @param instr
	 * @return
	 */
	public static String query(String instr){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		WDKContext context = wdkEnv.getWDKContext();
		ConnectBean conb = context!=null?context.getConnectBean():null;
		
		String outstr = "";
		JSONArray jrows = new JSONArray();
		int nTotal = 0;
		String pagestart = "0";
		String pageend = "0";
		String appcode = "";
		String route = "";
		String clienttype = "";
		
		//1、查询结果
		try {
			Node root = uXmlParse.loadxmlString(instr);
			Node node_route = uXmlParse.findNode(root, "/wdk/route");
			route = uXmlParse.getNodeOuterXml(node_route, false);
			
			clienttype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/clienttype"));
			appcode = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/appcode"));
			String todoid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/todoid"));
			String todotype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/todotype"));
			String flowtype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/flowtype"));
			String title = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/title"));
			String userid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/userid"));
			String starttime = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/starttime"));
			String endtime = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/endtime"));
			
			pagestart = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/pagestart"));
			pageend = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/pageend"));
			String orderby = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/orderby"));
			
			if(!"".equals(pagestart)&&!"".equals(pageend)&&!"".equals(orderby)){
				JSONObject jres = WQLUtil.getWQL(WQLNames.QPFTODO0001)
										.addParam("flag", "2")
										.addParam("appcode", appcode)
										.addParam("todoid", todoid)
										.addParam("todotype", todotype)
										.addParam("flowtype", flowtype)
										.addParam("title", title)
										.addParam("userid", userid)
										.addParam("starttime", starttime)
										.addParam("endtime", endtime)
										.addParam("clienttype", clienttype)
										.pageQuery(Integer.parseInt(pagestart), Integer.parseInt(pageend), orderby, conb);
				jrows = jres.getJSONArray("rows");
				String total = jres.getString("total");
				nTotal = Integer.parseInt(total);
			}else{
				jrows = WQL.getWO(WQLNames.QPFTODO0001)
							.addParam("flag", "1")
							.addParam("appcode", appcode)
							.addParam("todoid", todoid)
							.addParam("todotype", todotype)
							.addParam("flowtype", flowtype)
							.addParam("title", title)
							.addParam("userid", userid)
							.addParam("starttime", starttime)
							.addParam("endtime", endtime)
							.addParam("clienttype", clienttype)
							.process(conb)
							.getResultJSONArray(0);
				nTotal = jrows.size();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jrows = null;
		}
		JSONObject japp = new JSONObject();						
		//2、组装报文
	    JSONObject jrow = WQL.getWO("QUUMUA_0001").addParam("app_code", appcode).process(conb).uniqueResult(0);
	    if(jrow == null){
	        jrow = new JSONObject();
	    }
	    String _appcode = jrow.has("app_code") ? jrow.getString("app_code") : "";
	    String _appip = jrow.has("app_ip") ? jrow.getString("app_ip") : "";
	    String _appport = jrow.has("app_port") ? jrow.getString("app_port") : "";
	    String _appname = jrow.has("app_deploy_name") ? jrow.getString("app_deploy_name") : "";
	
	    japp.put("appcode", _appcode);
	    japp.put("appip", _appip);
	    japp.put("appport", _appport);
	    japp.put("appname", _appname);
		
		//3、返回报文
		if(null!=jrows){
			outstr = TODOProtocol.PROP_Query_Response(CODE_Success, "待办查询成功",appcode,japp,pagestart,pageend,Integer.toString(nTotal), jrows);
		}else{
			outstr = TODOProtocol.PROP_Query_Response(CODE_Fail, "待办查询失败", appcode,null,pagestart,pageend,Integer.toString(nTotal), null);
		}
		//组装完整ws报文
		outstr = WSProtocol.getOutstr(route, outstr);
		
		return outstr;
	}


	/**
	 * 关闭待办
	 * @param instr
	 * @return
	 */
	public static String close(String instr){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	WDKContext context = wdkEnv.getWDKContext();
    	ConnectBean conb = context!=null?context.getConnectBean():null;
    	
		String outstr = "";
		//1、生成uuid，输入报文留痕
		boolean isSuccess = false;
		
		String appcode = "";
		String todoids = "";
		String route = "";
		
		//2、执行删除，从活动库移动到历史库
		try {
			Node root = uXmlParse.loadxmlString(instr);
			Node node_route = uXmlParse.findNode(root, "/wdk/route");
			route = uXmlParse.getNodeOuterXml(node_route, false);
			
			appcode = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/appcode"));
			todoids = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/todoid"));
			
			String closetype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/closetype"));
			String closedate = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/closedate"));
			String movedate = WDK.getDateTime();
			
			String[] arr = todoids.split(",");
			for(int i=0;i<arr.length;i++){
				isSuccess = WQL.getWO(WQLNames.UPFTODO0001)
								.addParam("flag", "2")
								.addParam("appcode", appcode)
								.addParam("todoid", arr[i])
								.addParam("closetype", closetype)
								.addParam("closedate", closedate)
								.addParam("movedate", movedate)
								.process(conb)
								.isSuccess();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			isSuccess = false;
		}
								
		//3、返回报文
		if(isSuccess){
			outstr = TODOProtocol.PROP_Close_Response(CODE_Success, "待办关闭成功", appcode, todoids);
		}else{
			outstr = TODOProtocol.PROP_Close_Response(CODE_Fail, "待办关闭失败", appcode, todoids);
		}
		//组装完整ws报文
		outstr = WSProtocol.getOutstr(route, outstr);
		
		return outstr;
	}
	
	
	/**
	 * 统计查询
	 * 查询不记录报文
	 * @param instr
	 * @return
	 */
	public static String statis(String instr){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	WDKContext context = wdkEnv.getWDKContext();
    	ConnectBean conb = context!=null?context.getConnectBean():null;
    	
		String outstr = "";
		JSONArray jrows = new JSONArray();
		String groupfield = "";
		String appcode = "";
		String route = "";
		String clienttype = "";
		
		try {
			//1、组装查询条件
			Node root = uXmlParse.loadxmlString(instr);
			Node node_route = uXmlParse.findNode(root, "/wdk/route");
			route = uXmlParse.getNodeOuterXml(node_route, false);

			clienttype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/clienttype"));
			groupfield = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/groupfield"));
			appcode = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/appcode"));
			String todoid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/todoid"));
			String todotype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/todotype"));
			String flowtype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/flowtype"));
			String title = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/title"));
			String userid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/userid"));
			String starttime = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/starttime"));
			String endtime = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/endtime"));
			//##################################################
			//###	获取自定义参数，如有值则做自定义的动作
			//##################################################
			String param = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/param"));
			if(StringUtil.isNotEmpty(param)){
				if("lcgetalltdnum".equalsIgnoreCase(param)){
					outstr = LCgetAllTodoNum(conb,flowtype);
					return outstr;
				}else if("lcgettodo".equalsIgnoreCase(param)){
					outstr = LCgetTodo(userid,conb,flowtype);
					return outstr;
				}
			}
			
			//2、进行查询
			jrows = WQL.getWO(WQLNames.QPFTODO0001)
						.addParam("flag", "1")
						.addParam("appcode", appcode)
						.addParam("todoid", todoid)
						.addParam("todotype", todotype)
						.addParam("flowtype", flowtype)
						.addParam("title", title)
						.addParam("userid", userid)
						.addParam("starttime", starttime)
						.addParam("endtime", endtime)
						.addParam("clienttype", clienttype)
						.process(conb)
						.getResultJSONArray(0);
			
			//3、组装返回报文
			outstr 	= "<groupfield>"+groupfield+"</groupfield>";
			outstr += "<totalcount>"+jrows.size()+"</totalcount>";
			
			//4、如果需要进行分组，则进行分组统计
			if(!"".equals(groupfield)){
				HashMap<String,String> countmap = new HashMap<String, String>();
				for(int i=0;i<jrows.size();i++){
					JSONObject jrow = jrows.getJSONObject(i);
					String fieldname = jrow.has(groupfield)?jrow.getString(groupfield):"";
					//###############################################################
					//###	目前吉林GA只需要查询“会议审批”和“档案借阅”和“信息系统权限”的待办数量	start
					//###	G1542 - 会议管理;G1545 - 档案借阅流程;G1544 - 信息系统权限 ; G1547 - 内部通知审批
					//###############################################################
					String domainflowtype = jrow.getString("flowtype");
					if("GA".equalsIgnoreCase(fieldname)){
						if(!"G1542".equalsIgnoreCase(domainflowtype) && !"G1545".equalsIgnoreCase(domainflowtype) && !"G1544".equalsIgnoreCase(domainflowtype)
								&& !"G1547".equalsIgnoreCase(domainflowtype)){
							continue;
						}
					}
					//###############################################################
					//###	目前吉林GA只需要查询“会议审批”和“档案借阅”的待办数量	end
					//###############################################################
					String sCount = countmap.get(fieldname);
					if(null==sCount||"".equals(sCount)){
						sCount = "0";
					}
					int nCount = Integer.parseInt(sCount);
					nCount++;
					countmap.put(fieldname, Integer.toString(nCount));
				}
				
				outstr += "<statis>";
				Set<String> keyset = countmap.keySet();
				for(Iterator<String> it = keyset.iterator();it.hasNext();){
					String key = it.next();
					String value = countmap.get(key);
					outstr += "<"+key+">"+value+"</"+key+">";
				}
				outstr += "</statis>";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jrows = null;
		}
								
		//3、返回报文
		if(null!=jrows){
			outstr = TODOProtocol.PROP_Statis_Response(CODE_Success, "待办查询成功",outstr);
		}else{
			outstr = TODOProtocol.PROP_Statis_Response(CODE_Fail, "待办查询失败", outstr);
		}
		//组装完整ws报文
		outstr = WSProtocol.getOutstr(route, outstr);
		
		return outstr;
	}
	
	


	/**
	 * 统一待办库查询
	 * 历史报文查询
	 * @param instr
	 * @return
	 */
	public static String queryHist(String instr){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	WDKContext context = wdkEnv.getWDKContext();
    	ConnectBean conb = context!=null?context.getConnectBean():null;
    	
		String outstr = "";
		JSONArray jrows = new JSONArray();
		int nTotal = 0;
		String appcode = "";
		String route = "";
		String clienttype = "";
		
		//1、查询结果
		try {
			Node root = uXmlParse.loadxmlString(instr);
			Node node_route = uXmlParse.findNode(root, "/wdk/route");
			route = uXmlParse.getNodeOuterXml(node_route, false);
			
			clienttype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/clienttype"));
			appcode = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/appcode"));
			String todoid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/todoid"));
			String todotype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/todotype"));
			String flowtype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/flowtype"));
			String title = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/title"));
			String userid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/userid"));
			String starttime = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/starttime"));
			String endtime = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/endtime"));
			String closetype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/closetype"));
			String closedate = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/closedate"));
			
			String pagestart = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/pagestart"));
			String pageend = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/pageend"));
			String orderby = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/orderby"));
			String ybyy = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/ybyy"));
			
			if(!"".equals(pagestart)&&!"".equals(pageend)&&!"".equals(orderby)){
				JSONObject jres = WQL.getWO(WQLNames.QPFTODO0002)
										.addParam("flag", "3")
										.addParam("appcode", appcode)
										.addParam("todoid", todoid)
										.addParam("todotype", todotype)
										.addParam("flowtype", flowtype)
										.addParam("title", title)
										.addParam("userid", userid)
										.addParam("closetype", closetype)
										.addParam("closedate", closedate)
										.addParam("starttime", starttime)
										.addParam("endtime", endtime)
										.addParam("clienttype", clienttype)
										.addParam("ybyy", ybyy)
										.pageQuery(Integer.parseInt(pagestart), Integer.parseInt(pageend), orderby, conb);
				jrows = jres.getJSONArray("rows");
				String total = jres.getString("total");
				nTotal = Integer.parseInt(total);
			}else{
				jrows = WQL.getWO(WQLNames.QPFTODO0001)
							.addParam("flag", "1")
							.addParam("appcode", appcode)
							.addParam("todoid", todoid)
							.addParam("todotype", todotype)
							.addParam("flowtype", flowtype)
							.addParam("title", title)
							.addParam("userid", userid)
							.addParam("closetype", closetype)
							.addParam("closedate", closedate)
							.addParam("starttime", starttime)
							.addParam("endtime", endtime)
							.addParam("clienttype", clienttype)
							.addParam("ybyy", ybyy)
							.process(conb)
							.getResultJSONArray(0);
				nTotal = jrows.size();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jrows = null;
		}
								
		//2、组装报文
		JSONObject jrow = WQL.getWO("QUUMUA_0001")
								.addParam("app_code", appcode)
								.process(conb)
								.uniqueResult(0);
		String _appcode = jrow.has("app_code")?jrow.getString("app_code"):"";
		String _appip = jrow.has("app_ip")?jrow.getString("app_ip"):"";
		String _appport = jrow.has("app_port")?jrow.getString("app_port"):"";
		String _appname = jrow.has("app_deploy_name")?jrow.getString("app_deploy_name"):"";
		JSONObject japp = new JSONObject();
		japp.put("appcode", _appcode);
		japp.put("appip", _appip);
		japp.put("appport", _appport);
		japp.put("appname", _appname);
		
		
		//3、返回报文
		if(null!=jrows){
			outstr = TODOProtocol.PROP_QueryHist_Response(CODE_Success, "已办查询成功",appcode,japp,Integer.toString(nTotal),jrows);
		}else{
			outstr = TODOProtocol.PROP_QueryHist_Response(CODE_Fail, "已办查询失败", appcode,null,Integer.toString(nTotal), null);
		}
		//组装完整ws报文
		outstr = WSProtocol.getOutstr(route, outstr);
		
		return outstr;
	}
	
	/**
	 * 返回该用户待办具体内容
	 * @param userid
	 * @param conb
	 * @return
	 * {
            "USER_ID": "SUPERADMIN",
            "INFO": [
                {
                    "INFO_TITLE": "中国烟草总公司职业进修学院关于举办烟草企业安全生产标准化考评",
                    "INFO_DATE": " 2012-08-03 ",
                    "INFO_URL": " http://10.10.1.11:9080/d3/ "
                },
                {
                    "INFO_TITLE": "公司召开纪念建党91周年暨创先争优活动总结表彰大会",
                    "INFO_DATE": " 2012-08-12 ",
                    "INFO_URL": " http://10.10.1.11:9080/d3/ "
                }
            ]
        }
	 */
	private static String LCgetTodo(String userid, ConnectBean conb ,String flowtype) {
		JSONArray jrows = new JSONArray();
		JSONObject out = new JSONObject();
		JSONArray info = new JSONArray();
		JSONObject jres = new JSONObject();
		try{
			if(StringUtil.isNotBlank(flowtype)){
				jres = WQLUtil.getWQL(WQLNames.QPFTODO0001)
						.addParam("flag", "26")
						.addParam("userid", userid)
						.addParam("flowtype", flowtype)
						.pageQuery(0,10, " TASKTIME desc ", conb);
			}else{
				jres = WQLUtil.getWQL(WQLNames.QPFTODO0001)
						.addParam("flag", "24")
						.addParam("userid", userid)
						.pageQuery(0,10, " TASKTIME desc ", conb);
			}
			jrows = jres.getJSONArray("rows");
			String appip = WDK.getNodeParam("local_ws_ip");
			String appport = WDK.getNodeParam("local_ws_port");
			String appname = WDK.getNodeParam("local_ws_appname");
			String appurlRoot = "http://"+appip+":"+appport+"/"+appname;
			for(int i=0;jrows.size() >0 && i<jrows.size();i++){
				JSONObject jrow = jrows.getJSONObject(i);
				JSONObject obj = new JSONObject();
				
				obj.put("INFO_TITLE", jrow.getString("title"));
				if(jrow.getString("tasktime").length() > 10){
					obj.put("INFO_DATE", jrow.getString("tasktime").substring(0,10));
				}else{
					obj.put("INFO_DATE", jrow.getString("tasktime"));
				}
				obj.put("INFO_URL", appurlRoot+ "/countryquery.cmd?ssoType=oa&todocode=opendb&todoid=" +jrow.getString("todoid")+"&flowtype="+jrow.getString("flowtype"));
				
				info.add(obj);
			}
			
		}catch (Exception e) {
		}
		out.put("USER_ID", userid);
		out.put("INFO", info);
		return out.toString();
	}


	/**
	 * 返回全部有待办用户账号及待办条数
	 * @return
	 * {
	    "RESULT": true,
	    "MSG": "成功",
	    "DATASETS": {
	        "INFO": [
	            {
	                "USER_ID": "SUPERADMIN",
	                "NUM": 5
	            },
	            {
	                "USER_ID": "ZHANGS",
	                "NUM": 8
	            }
	        ]
	    	}
		}
	 */
	private static String LCgetAllTodoNum(ConnectBean conb,String flowtype) {
		JSONArray jrows = new JSONArray();
		JSONArray info = new JSONArray();
		boolean result = true;
		String msg = "成功";
		try{
			
			if(StringUtil.isNotBlank(flowtype)){
				jrows = WQL.getWO(WQLNames.QPFTODO0001)
						.addParam("flag", "25")
						.addParam("flowtype", flowtype)
						.process(conb)
						.getResultJSONArray(0);
			}else{
				jrows = WQL.getWO(WQLNames.QPFTODO0001)
						.addParam("flag", "23")
						.process(conb)
						.getResultJSONArray(0);
			}
			for(int i=0;jrows.size() >0 && i<jrows.size();i++){
				JSONObject jrow = jrows.getJSONObject(i);
				JSONObject person = new JSONObject();
				person.put("USER_ID", jrow.get("userid"));
				person.put("NUM", jrow.get("num"));
				info.add(person);
			}
		}catch (Exception e) {
			result = false;
			msg = e.getMessage();
		}
		JSONObject out = new JSONObject();
		JSONObject DATASETS = new JSONObject();
		DATASETS.put("INFO", info);
		out.put("DATASETS", DATASETS);
		out.put("RESULT", result);
		out.put("MSG", msg);
		return out.toString();
	}
}
