package com.longj.platform.busi.wdk.todo;

import java.util.HashMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TODOProtocol {
	/***************************************
	 * 		报文组装方法
	 *************************************/
	protected static String PROP_Add_Request(HashMap<String,String> param){
		StringBuffer sb = new StringBuffer();
		sb.append("	<data label=\"服务报文\">");
		sb.append("		<appcode label=\"必填，来源应用系统标识\">"+param.get("appcode")+"</appcode>");
		sb.append("		<todoid label=\"必填，待办在来源系统中的待办ID\">"+param.get("todoid")+"</todoid>");
		sb.append("		<todotype label=\"允许为空，待办类型\">"+param.get("todotype")+"</todotype>");
		sb.append("		<flowname label=\"允许为空，流程名称\">"+param.get("flowname")+"</flowname>");
		sb.append("		<flowtype label=\"允许为空，流程类型\">"+param.get("flowtype")+"</flowtype>");
		sb.append("		<nodename label=\"允许为空，当前环节名称\">"+param.get("nodename")+"</nodename>");
		sb.append("		<prenodename label=\"允许为空，前一环节名称\">"+param.get("prenodename")+"</prenodename>");
		sb.append("		<title label=\"必填，待办任务标题\">"+param.get("title")+"</title>");
		sb.append("		<tasksummary label=\"允许为空，任务摘要\">"+param.get("tasksummary")+"</tasksummary>");
		sb.append("		<userid label=\"必填，处理人ID\">"+param.get("userid")+"</userid>");
		sb.append("		<username label=\"必填，处理人姓名\">"+param.get("username")+"</username>");
		sb.append("		<preuserid label=\"允许为空，上一环节任务处理人ID\">"+param.get("preuserid")+"</preuserid>");
		sb.append("		<preusername label=\"允许为空，上一环节任务处理人名称\">"+param.get("preusername")+"</preusername>");
		sb.append("		<tasktime label=\"必填，任务送达时间\">"+param.get("tasktime")+"</tasktime>");
		sb.append("		<relativepath label=\"必填，待办办理界面相对路径\">"+param.get("relativepath")+"</relativepath>");
		sb.append("		<expirestime label=\"允许为空，待办任务逾期时间\">"+param.get("expirestime")+"</expirestime>");
		sb.append("		<warningtime label=\"允许为空，待办任务预警时间\">"+param.get("warningtime")+"</warningtime>");
		sb.append("		<emergency label=\"允许为空，紧急程度\">"+param.get("emergency")+"</emergency>");
		sb.append("		<remark	label=\"允许为空，备注\">"+param.get("remark")+"</remark>");
		sb.append("		<extraparam label=\"允许为空，自定义参数\">"+param.get("extraparam")+"</extraparam>");
		sb.append("	</data>");
		return sb.toString();
	}
	
	/**
	 * 组装
	 * @param code
	 * @param desc
	 * @param appcode
	 * @param todoid
	 * @param untodouuid
	 * @return
	 */
	protected static String PROP_Add_Response(String code,String desc,String appcode,String todoid,String untodouuid){
		StringBuffer sb = new StringBuffer();
		sb.append("	<data label=\"服务报文\">");
		sb.append("		<respcode label=\"是否处理成功  0-失败  1-成功\">"+code+"</respcode>");
		sb.append("		<respdesc label=\"处理结果描述\">"+desc+"</respdesc>");
		sb.append("		<appcode label=\"来源应用系统标识\">"+appcode+"</appcode>");
		sb.append("		<todoid label=\"待办在来源系统中的待办ID\">"+todoid+"</todoid>");
		sb.append("		<untodouuid label=\"统一待办库对应ID\">"+untodouuid+"</untodouuid>");
		sb.append("	</data>");
		return sb.toString();
	}
	
	/**
	 * 组装查询的请求报文
	 * @param param
	 * @return
	 */
	protected static String PROP_Query_Request(HashMap<String,String> param){
		StringBuffer sb = new StringBuffer();
		sb.append("	<data label=\"服务报文，除必填外，其余如果有则匹配，没有则不匹配\">");
		sb.append("		<appcode label=\"必填，来源应用系统标识\">"+param.get("appcode")+"</appcode>");
		sb.append("		<todoid label=\"允许为空，待办在来源系统中的待办ID\">"+param.get("todoid")+"</todoid>");
		sb.append("		<todotype label=\"允许为空，待办类型\">"+param.get("todotype")+"</todotype>");
		sb.append("		<flowtype label=\"允许为空，流程类型\">"+param.get("flowtype")+"</flowtype>");
		sb.append("		<title label=\"允许为空，待办任务标题，如有则进行模糊匹配\">"+param.get("title")+"</title>");
		sb.append("		<userid label=\"允许为空，处理人ID\">"+param.get("userid")+"</userid>");
		sb.append("		<username label=\"允许为空，处理人ID\">"+param.get("username")+"</username>");
		sb.append("		<starttime label=\"允许为空，任务开始时间\">"+param.get("starttime")+"</starttime>");
		sb.append("		<endtime label=\"允许为空，任务结束时间\">"+param.get("endtime")+"</endtime>");
		sb.append("		<pagestart label=\"开始记录数，如果为空则不分页\">"+param.get("pagestart")+"</pagestart>");
		sb.append("		<pageend label=\"结束记录数，如果为空，则不分页\">"+param.get("pageend")+"</pageend>");
		sb.append("		<orderby label=\"按时间倒叙或正序 asc或desc\">"+param.get("orderby")+"</orderby>");
		sb.append("	</data>");
		return sb.toString();
	}
	/**
	 * 组装查询返回报文
	 * @param code
	 * @param desc
	 * @param japp
	 * @param jtodos
	 * @return
	 */
	protected static String PROP_Query_Response(String code,String desc,String appcode,JSONObject japp,String pagestart,String pageend,String totalcount,JSONArray jtodos){
		StringBuffer sb = new StringBuffer();
		sb.append("	<data label=\"服务报文\">");
		sb.append("		<respcode label=\"是否处理成功  0-失败  1-成功\">"+code+"</respcode>");
		sb.append("		<respdesc label=\"处理结果描述\">"+desc+"</respdesc>");
		if(null==japp){
			japp = new JSONObject();
		}
		sb.append("		<pagestart label=\"开始记录数\">"+pagestart+"</pagestart>");
		sb.append("		<pageend label=\"结束记录数\">"+pageend+"</pageend>");
		sb.append("		<totalcount label=\"总记录数\">"+totalcount+"</totalcount>");
		sb.append("		<appcode label=\"来源应用系统标识\">"+appcode+"</appcode>");
		sb.append("		<appip label=\"应用系统IP\">"+(japp.has("appip")?japp.getString("appip"):"")+"</appip>");
		sb.append("		<appport label=\"应用系统端口\">"+(japp.has("appport")?japp.getString("appport"):"")+"</appport>");
		sb.append("		<appname label=\"应用系统部署名\">"+(japp.has("appname")?japp.getString("appname"):"")+"</appname>");
		sb.append("		<todos label=\"待办列表\">");
		for(int i=0;i<jtodos.size();i++){
			JSONObject jtodo = jtodos.getJSONObject(i);	
			sb.append("			<todo label=\"待办详细信息\">");
			sb.append("				<todoid label=\"必填，待办在来源系统中的待办ID\">"+(jtodo.has("todoid")?jtodo.getString("todoid"):"")+"</todoid>");
			sb.append("				<todotype label=\"允许为空，待办类型\">"+(jtodo.has("todotype")?jtodo.getString("todotype"):"")+"</todotype>");
			sb.append("             <appcode label=\"允许为空，应用标识\">"+(jtodo.has("appcode")?jtodo.getString("appcode"):"")+"</appcode>");
			sb.append("				<flowname label=\"允许为空，流程名称\">"+(jtodo.has("flowname")?jtodo.getString("flowname"):"")+"</flowname>");
			sb.append("				<flowtype label=\"允许为空，流程类型\">"+(jtodo.has("flowtype")?jtodo.getString("flowtype"):"")+"</flowtype>");
			sb.append("				<nodename label=\"允许为空，当前环节名称\">"+(jtodo.has("nodename")?jtodo.getString("nodename"):"")+"</nodename>");
			sb.append("				<prenodename label=\"允许为空，前一环节名称\">"+(jtodo.has("prenodename")?jtodo.getString("prenodename"):"")+"</prenodename>");
			sb.append("				<title label=\"必填，待办任务标题\">"+(jtodo.has("title")?jtodo.getString("title"):"")+"</title>");
			sb.append("				<tasksummary label=\"允许为空，任务摘要\">"+(jtodo.has("tasksummary")?jtodo.getString("tasksummary"):"")+"</tasksummary>");
			sb.append("				<userid label=\"必填，处理人ID\">"+(jtodo.has("userid")?jtodo.getString("userid"):"")+"</userid>");
			sb.append("				<username label=\"必填，处理人姓名\">"+(jtodo.has("username")?jtodo.getString("username"):"")+"</username>");
			sb.append("				<preuserid label=\"允许为空，上一环节任务处理人ID\">"+(jtodo.has("preuserid")?jtodo.getString("preuserid"):"")+"</preuserid>");
			sb.append("				<preusername label=\"允许为空，上一环节任务处理人名称\">"+(jtodo.has("preusername")?jtodo.getString("preusername"):"")+"</preusername>");
			sb.append("				<tasktime label=\"必填，任务送达时间\">"+(jtodo.has("tasktime")?jtodo.getString("tasktime"):"")+"</tasktime>");
			sb.append("				<relativepath label=\"必填，待办办理界面相对路径\">"+(jtodo.has("relativepath")?jtodo.getString("relativepath"):"")+"</relativepath>");
			sb.append("				<expirestime label=\"允许为空，待办任务逾期时间\">"+(jtodo.has("expirestime")?jtodo.getString("expirestime"):"")+"</expirestime>");
			sb.append("				<warningtime label=\"允许为空，待办任务预警时间\">"+(jtodo.has("warningtime")?jtodo.getString("warningtime"):"")+"</warningtime>");
			sb.append("				<emergency label=\"允许为空，紧急程度\">"+(jtodo.has("emergency")?jtodo.getString("emergency"):"")+"</emergency>");
			sb.append("				<remark	label=\"允许为空，备注\">"+(jtodo.has("remark")?jtodo.getString("remark"):"")+"</remark>");
			sb.append("				<extraparam label=\"允许为空，自定义参数\">"+(jtodo.has("extraparam")?jtodo.getString("extraparam"):"")+"</extraparam>");
			sb.append("			</todo>");
		}
		sb.append("		</todos>");
		sb.append("	</data>");
		return sb.toString();
	}
	
	/**
	 * 组装关闭请求报文
	 * @param param
	 * @return
	 */
	protected static String PROP_Close_Request(HashMap<String,String> param){
		StringBuffer sb = new StringBuffer();
		sb.append("	<data label=\"服务报文\">");
		sb.append("		<appcode label=\"必填，来源应用系统标识\">"+param.get("appcode")+"</appcode>");
		sb.append("		<todoid label=\"必填，待办在来源系统中的待办ID\">"+param.get("todoid")+"</todoid>");
		sb.append("		<closetype label=\"必填，关闭方式\">"+param.get("closetype")+"</closetype>");
		sb.append("		<closedate label=\"必填，关闭时间\">"+param.get("closedate")+"</closedate>");
		sb.append("	</data>");
		return sb.toString();
	}
	/**
	 * 组装关闭返回报文
	 * @param code
	 * @param desc
	 * @param appcode
	 * @param todoid
	 * @return
	 */
	protected static String PROP_Close_Response(String code,String desc,String appcode,String todoid){
		StringBuffer sb = new StringBuffer();
		sb.append("	<data label=\"服务报文\">");
		sb.append("		<respcode label=\"是否处理成功  0-失败  1-成功\">"+code+"</respcode>");
		sb.append("		<respdesc label=\"处理结果描述\">"+desc+"</respdesc>");
		sb.append("		<appcode label=\"来源应用系统标识\">"+appcode+"</appcode>");
		sb.append("		<todoid label=\"待办在来源系统中的待办ID\">"+todoid+"</todoid>");
		sb.append("	</data>");
		return sb.toString();
	}
	
	
	
	
	/**
	 * 组装统计的请求报文
	 * @param param
	 * @return
	 */
	protected static String PROP_Statis_Request(HashMap<String,String> param){
		StringBuffer sb = new StringBuffer();
		sb.append("	<data label=\"服务报文，除必填外，其余如果有则匹配，没有则不匹配\">");
		sb.append("		<groupfield label=\"允许为空，值为以下各字段名，按照分类查询出数量\">"+param.get("groupfield")+"</groupfield>");
		sb.append("		<appcode label=\"必填，来源应用系统标识\">"+param.get("appcode")+"</appcode>");
		sb.append("		<todoid label=\"允许为空，待办在来源系统中的待办ID\">"+param.get("todoid")+"</todoid>");
		sb.append("		<todotype label=\"允许为空，待办类型\">"+param.get("todotype")+"</todotype>");
		sb.append("		<flowtype label=\"允许为空，流程类型\">"+param.get("flowtype")+"</flowtype>");
		sb.append("		<title label=\"允许为空，待办任务标题，如有则进行模糊匹配\">"+param.get("title")+"</title>");
		sb.append("		<userid label=\"允许为空，处理人ID\">"+param.get("userid")+"</userid>");
		sb.append("		<starttime label=\"允许为空，任务开始时间\">"+param.get("starttime")+"</starttime>");
		sb.append("		<endtime label=\"允许为空，任务结束时间\">"+param.get("endtime")+"</endtime>");
		sb.append("	</data>");
		return sb.toString();
		
	}
	
	
	/**
	 * 组装统计的返回报文
	 * @param code
	 * @param desc
	 * @param japp
	 * @param jtodos
	 * @return
	 */
	protected static String PROP_Statis_Response(String code,String desc,String outstr){
		StringBuffer sb = new StringBuffer();
		sb.append("	<data label=\"服务报文\">");
		sb.append("		<respcode label=\"是否处理成功  0-失败  1-成功\">"+code+"</respcode>");
		sb.append("		<respdesc label=\"处理结果描述\">"+desc+"</respdesc>");
		sb.append(outstr);
		sb.append("	</data>");
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	/**
	 * 组装查询的请求报文
	 * @param param
	 * @return
	 */
	protected static String PROP_QueryHist_Request(HashMap<String,String> param){
		StringBuffer sb = new StringBuffer();
		sb.append("	<data label=\"服务报文，除必填外，其余如果有则匹配，没有则不匹配\">");
		sb.append("		<appcode label=\"必填，来源应用系统标识\">"+param.get("appcode")+"</appcode>");
		sb.append("		<todoid label=\"允许为空，待办在来源系统中的待办ID\">"+param.get("todoid")+"</todoid>");
		sb.append("		<todotype label=\"允许为空，待办类型\">"+param.get("todotype")+"</todotype>");
		sb.append("		<flowtype label=\"允许为空，流程类型\">"+param.get("flowtype")+"</flowtype>");
		sb.append("		<title label=\"允许为空，待办任务标题，如有则进行模糊匹配\">"+param.get("title")+"</title>");
		sb.append("		<userid label=\"允许为空，处理人ID\">"+param.get("userid")+"</userid>");
		sb.append("		<starttime label=\"允许为空，任务开始时间\">"+param.get("starttime")+"</starttime>");
		sb.append("		<endtime label=\"允许为空，任务结束时间\">"+param.get("endtime")+"</endtime>");
		sb.append("		<closetype label=\"必填，关闭方式\">"+param.get("closetype")+"</closetype>");
		sb.append("		<closedate label=\"必填，关闭时间\">"+param.get("closedate")+"</closedate>");
		sb.append("		<pagestart label=\"开始记录数，如果为空则不分页\">"+param.get("pagestart")+"</pagestart>");
		sb.append("		<pageend label=\"结束记录数，如果为空，则不分页\">"+param.get("pageend")+"</pageend>");
		sb.append("		<orderby label=\"按时间倒叙或正序 asc或desc\">"+param.get("orderby")+"</orderby>");
		sb.append("	</data>");
		return sb.toString();
	}
	/**
	 * 组装查询返回报文
	 * @param code
	 * @param desc
	 * @param japp
	 * @param jtodos
	 * @return
	 */
	protected static String PROP_QueryHist_Response(String code,String desc,String appcode,JSONObject japp,String totalcount,JSONArray jtodos){
		StringBuffer sb = new StringBuffer();
		sb.append("	<data label=\"服务报文\">");
		sb.append("		<respcode label=\"是否处理成功  0-失败  1-成功\">"+code+"</respcode>");
		sb.append("		<respdesc label=\"处理结果描述\">"+desc+"</respdesc>");
		if(null==japp){
			japp = new JSONObject();
		}
		sb.append("		<totalcount label=\"总记录数\">"+totalcount+"</totalcount>");
		sb.append("		<appcode label=\"来源应用系统标识\">"+appcode+"</appcode>");
		sb.append("		<appip label=\"应用系统IP\">"+(japp.has("appip")?japp.getString("appip"):"")+"</appip>");
		sb.append("		<appport label=\"应用系统端口\">"+(japp.has("appport")?japp.getString("appport"):"")+"</appport>");
		sb.append("		<appname label=\"应用系统部署名\">"+(japp.has("appname")?japp.getString("appname"):"")+"</appname>");
		sb.append("		<todos label=\"待办列表\">");
		for(int i=0;i<jtodos.size();i++){
			JSONObject jtodo = jtodos.getJSONObject(i);	
			sb.append("			<todo label=\"待办详细信息\">");
			sb.append("				<todoid label=\"必填，待办在来源系统中的待办ID\">"+(jtodo.has("todoid")?jtodo.getString("todoid"):"")+"</todoid>");
			sb.append("				<todotype label=\"允许为空，待办类型\">"+(jtodo.has("todotype")?jtodo.getString("todotype"):"")+"</todotype>");
			sb.append("				<flowname label=\"允许为空，流程名称\">"+(jtodo.has("flowname")?jtodo.getString("flowname"):"")+"</flowname>");
			sb.append("				<flowtype label=\"允许为空，流程类型\">"+(jtodo.has("flowtype")?jtodo.getString("flowtype"):"")+"</flowtype>");
			sb.append("				<nodename label=\"允许为空，当前环节名称\">"+(jtodo.has("nodename")?jtodo.getString("nodename"):"")+"</nodename>");
			sb.append("				<prenodename label=\"允许为空，前一环节名称\">"+(jtodo.has("prenodename")?jtodo.getString("prenodename"):"")+"</prenodename>");
			sb.append("				<title label=\"必填，待办任务标题\">"+(jtodo.has("title")?jtodo.getString("title"):"")+"</title>");
			sb.append("				<tasksummary label=\"允许为空，任务摘要\">"+(jtodo.has("tasksummary")?jtodo.getString("tasksummary"):"")+"</tasksummary>");
			sb.append("				<userid label=\"必填，处理人ID\">"+(jtodo.has("userid")?jtodo.getString("userid"):"")+"</userid>");
			sb.append("				<username label=\"必填，处理人姓名\">"+(jtodo.has("username")?jtodo.getString("username"):"")+"</username>");
			sb.append("				<preuserid label=\"允许为空，上一环节任务处理人ID\">"+(jtodo.has("preuserid")?jtodo.getString("preuserid"):"")+"</preuserid>");
			sb.append("				<preusername label=\"允许为空，上一环节任务处理人名称\">"+(jtodo.has("preusername")?jtodo.getString("preusername"):"")+"</preusername>");
			sb.append("				<tasktime label=\"必填，任务送达时间\">"+(jtodo.has("tasktime")?jtodo.getString("tasktime"):"")+"</tasktime>");
			sb.append("				<relativepath label=\"必填，待办办理界面相对路径\">"+(jtodo.has("relativepath")?jtodo.getString("relativepath"):"")+"</relativepath>");
			sb.append("				<expirestime label=\"允许为空，待办任务逾期时间\">"+(jtodo.has("expirestime")?jtodo.getString("expirestime"):"")+"</expirestime>");
			sb.append("				<warningtime label=\"允许为空，待办任务预警时间\">"+(jtodo.has("warningtime")?jtodo.getString("warningtime"):"")+"</warningtime>");
			sb.append("				<emergency label=\"允许为空，紧急程度\">"+(jtodo.has("emergency")?jtodo.getString("emergency"):"")+"</emergency>");
			sb.append("				<remark	label=\"允许为空，备注\">"+(jtodo.has("remark")?jtodo.getString("remark"):"")+"</remark>");
			sb.append("				<extraparam label=\"允许为空，自定义参数\">"+(jtodo.has("extraparam")?jtodo.getString("extraparam"):"")+"</extraparam>");
			sb.append("				<closetype label=\"必填，关闭方式\">"+(jtodo.has("closetype")?jtodo.getString("closetype"):"")+"</closetype>");
			sb.append("				<closedate label=\"必填，关闭时间\">"+(jtodo.has("closedate")?jtodo.getString("closedate"):"")+"</closedate>");
			sb.append("			</todo>");
		}
		sb.append("		</todos>");
		sb.append("	</data>");
		return sb.toString();
	}
}