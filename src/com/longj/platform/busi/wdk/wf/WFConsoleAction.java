package com.longj.platform.busi.wdk.wf;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.jbpm.api.cmd.Environment;
import org.wdk.WDK;
import org.wdk.WDKCore;
import org.wdk.WDKWQLNames;
import org.wdk.core.base.BaseSessionUser;
import org.wdk.core.base.WorkFlowAction;
import org.wdk.core.bean.PageBean;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.util.uFile;
import org.wdk.module.wf.WFConstant;
import org.wdk.module.wf.engine.JBPMUtil;
import org.wdk.module.wf.engine.WFEngine;
import org.wdk.module.wf.engine.core.bean.WFActorBean;
import org.wdk.module.wf.engine.core.bean.WFBean;
import org.wdk.module.wf.engine.core.bean.WFContainer;
import org.wdk.module.wf.engine.core.bean.WFContainerThread;
import org.wdk.module.wf.engine.core.bean.WFDecisionConditionBean;
import org.wdk.module.wf.engine.core.bean.WFNodeBean;
import org.wdk.module.wf.engine.core.handler.handlerDecision;
import org.wdk.module.wf.frame.core.bean.bean_depute;
import org.wdk.module.wf.frame.core.bean.bean_pd;
import org.wdk.module.wf.frame.core.bean.bean_pi;
import org.wdk.module.wf.frame.core.bean.bean_pihistory;
import org.wdk.module.wf.frame.core.bean.bean_start;
import org.wdk.module.wf.frame.core.bean.bean_submit;
import org.wdk.module.wf.frame.core.bean.bean_submit_target;
import org.wdk.module.wf.frame.core.bean.bean_taskrecord;
import org.wdk.module.wf.frame.core.bean.bean_todo;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLDataField;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.platform.busi.wdk.wf.frame.WFFrame;

public class WFConsoleAction extends WorkFlowAction{

	/**********************************************************
	 * 			公共信息服务
	 *********************************************************/
	/**
	 * 委托待选人员列表
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	
	public boolean pub_actorlist(WDKContext ctx) throws Exception {
		JSONArray jtree = new JSONArray();

		JSONObject jdept1 = adddept("role", "角色");
		JSONArray jchild1 = new JSONArray();
		jchild1.add(addperson("role", "角色", "shenheyuan", "审核员","role"));
		jchild1.add(addperson("role", "角色", "shenpiyuan", "审批员","role"));
		jchild1.add(addperson("role", "角色", "guanliyuan", "管理员","role"));
		jchild1.add(addperson("role", "角色", "lanmubianji", "栏目编辑","role"));
		jdept1.put("children", jchild1);
		jtree.add(jdept1);
		
		JSONObject jdept2 = adddept("vmrole", "虚拟角色");
		JSONArray jchild2 = new JSONArray();
		jchild2.add(addperson("vmrole", "虚拟角色", "shangji", "上级","vmrole"));
		jchild2.add(addperson("vmrole", "虚拟角色", "xiaji", "下级","vmrole"));
		jchild2.add(addperson("vmrole", "虚拟角色", "xieban", "协办人员","vmrole"));
		jchild2.add(addperson("vmrole", "虚拟角色", "shangjilingdao", "上级领导","vmrole"));
		jdept2.put("children", jchild2);
		jtree.add(jdept2);
//		
//		JSONObject jdept3 = adddept("dept_004", "财务");
//		JSONArray jchild3 = new JSONArray();
//		jchild3.add(addperson("dept_004", "财务", "caiwuA", "财务A","0"));
//		jchild3.add(addperson("dept_004", "财务", "caiwuB", "财务B","0"));
//		jchild3.add(addperson("dept_004", "财务", "caiwuC", "财务C","0"));
//		jdept3.put("children", jchild3);
//		jtree.add(jdept3);
//		
//		JSONObject jdept4 = adddept("dept_005", "领导");
//		JSONArray jchild4 = new JSONArray();
//		jchild4.add(addperson("dept_005", "领导", "lingdaoA", "领导A","0"));
//		jchild4.add(addperson("dept_005", "领导", "lingdaoB", "领导B","0"));
//		jchild4.add(addperson("dept_005", "领导", "lingdaoC", "领导C","0"));
//		jchild4.add(addperson("dept_005", "领导", "lingdaoD", "领导D","0"));
//		jdept4.put("children", jchild4);
//		jtree.add(jdept4);
//		
//		JSONObject jdept5 = adddept("dept_006", "总裁");
//		JSONArray jchild5 = new JSONArray();
//		jchild5.add(addperson("dept_006", "总裁", "zongcaiA", "总裁A","0"));
//		jchild5.add(addperson("dept_006", "总裁", "zongcaiB", "总裁B","0"));
//		jdept5.put("children", jchild5);
//		jtree.add(jdept5);
//		
//		JSONObject jdept6 = adddept("dept_007", "项管");
//		JSONArray jchild6 = new JSONArray();
//		jchild6.add(addperson("dept_007", "项管", "xiangguanA", "项管A","0"));
//		jchild6.add(addperson("dept_007", "项管", "xiangguanB", "项管B","0"));
//		jdept6.put("children", jchild6);
//		jtree.add(jdept6);
//		
//		JSONObject jdept7 = adddept("dept_008", "内部");
//		JSONArray jchild7 = new JSONArray();
//		jchild7.add(addperson("dept_008", "内部", "neibuA", "内部A","0"));
//		jchild7.add(addperson("dept_008", "内部", "neibuB", "内部B","0"));
//		jchild7.add(addperson("dept_008", "内部", "neibuC", "内部C","0"));
//		jdept7.put("children", jchild7);
//		jtree.add(jdept7);
//		
//		JSONObject jdept8 = adddept("dept_009", "外部");
//		JSONArray jchild8 = new JSONArray();
//		jchild8.add(addperson("dept_009", "外部", "waibuA", "外部A","0"));
//		jchild8.add(addperson("dept_009", "外部", "waibuB", "外部B","0"));
//		jchild8.add(addperson("dept_009", "外部", "waibuC", "外部C","0"));
//		jdept8.put("children", jchild8);
//		jtree.add(jdept8);
//		
//		JSONObject jdept9 = adddept("dept_010", "出纳");
//		JSONArray jchild9 = new JSONArray();
//		jchild9.add(addperson("dept_010", "出纳", "chunaA", "出纳A","0"));
//		jchild9.add(addperson("dept_010", "出纳", "chunaB", "出纳B","0"));
//		jdept9.put("children", jchild9);
//		jtree.add(jdept9);
		ctx.setPrintOut(jtree.toString());
		return true;
	}
	
	public static JSONObject adddept(String deptuuid,String deptname){
		JSONObject jdept = new JSONObject();
		jdept.put("id", deptuuid);
		jdept.put("text", deptname);
		JSONObject jattr = new JSONObject();
		jattr.put("ntype", "1");
		jattr.put("deptuuid", deptuuid);
		jattr.put("deptname",deptname);
		jdept.put("attributes", jattr);
		return jdept;
	}
	public static JSONObject addperson(String deptuuid,String deptname,String actorid,String actorname,String actortype){
		JSONObject jactor = new JSONObject();
		jactor.put("id",actorid);
		jactor.put("text", actorname);
		JSONObject jattr = new JSONObject();
		jattr.put("ntype", "0");
		jattr.put("deptuuid", deptuuid);
		jattr.put("deptname", deptname);
		jattr.put("actorid", actorid);
		jattr.put("actorname", actorname);
		jattr.put("actortype", actortype);
		jactor.put("attributes", jattr);
		return jactor;
		
	}
	
	
	/**********************************************************
	 * 			基础信息服务
	 *********************************************************/
	/**
	 * 读取节点参与人员列表
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @throws Exception
	 */
	public boolean node_actors(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		
		//是否过滤，如果过滤，则只返回参与过的参与人
		String isfilter = _getParameter("isfilter", request, response);
		boolean bfilter = false;
		if("1".equals(isfilter)){
			bfilter = true;
		}
		String pdid = _getParameter("pdid", request, response);
		String piid = _getParameter("piid", request, response);
		String nodename = _getParameter("nodename", request, response);

		JSONArray jtrees = new JSONArray();
		ArrayList<WFActorBean> cands = WFFrame.pub_getNodeActors(environment, conb, pdid, piid, nodename, bfilter);		
		
		//构建用户树形结构
		
		//1、添加根节点
		JSONObject jtree = new JSONObject();
		jtree.put("id", "dept_root");
		jtree.put("text", "请选择参与者");
		JSONObject jattr = new JSONObject();
		jattr.put("ntype", "1");
		jtree.put("attributes", jattr);
		
		//2、添加子节点人员
		JSONArray jchild = new JSONArray();
		for(Iterator it = cands.iterator();it.hasNext();){
			WFActorBean wab = (WFActorBean) it.next();
			JSONObject jmenu2 = new JSONObject();
			jmenu2.put("id", wab.getActorId());
			jmenu2.put("text", wab.getActorId());
			JSONObject jattr2 = new JSONObject();
			jattr2.put("ntype", "0");
			jattr2.put("actortype", wab.getActorType());
			jattr2.put("deptuuid", wab.getDeptuuid());
			jmenu2.put("attributes", jattr2);
			jchild.add(jmenu2);
		}
		jtree.put("children", jchild);
		jtrees.add(jtree);
		ctx.setPrintOut(jtrees.toString());
		return true;
	}
	
	
	/**
	 * 获取下一步骤的所有可能缓解
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @throws Exception
	 */
	public boolean node_nextnodes(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String pdid = _getParameter("pdid", request, response);
		String nodename = _getParameter("nodename", request, response);
		WFBean wb = WFFrame.wb_create(pdid);
		WFNodeBean wnb = wb.getNodeBean(nodename);
		ArrayList<String> childNodes = WFFrame.pub_getChildNodes(environment, conb, pdid, nodename);
		JSONArray jchilds = new JSONArray();
		
		//如果下一环节是join环节，则判断当前是否是最后一个frok，如果是最后一个frok，则列出后续所有环节，单选
		if(wnb.isJoin()){
			for(Iterator<String> it = childNodes.iterator();it.hasNext();){
				JSONObject jchild = new JSONObject();
				String name = it.next();
				WFNodeBean wnbChild = wb.getNodeBean(name);
				jchild.put("nodename", name);
				jchild.put("nodetype", wnbChild.getNodetype());
				jchild.put("nodetitle", wnbChild.getNodetitle());
				jchild.put("ppdid", wb.getPpdid());
				jchild.put("pdid", pdid);
				jchilds.add(jchild);
			}
		}else if(wnb.isDecision()){
		//如果下一环节decision节点，则首先计算decision，然后将后续选中的节点列出来，单选
			ArrayList<WFDecisionConditionBean> conds = wnb.getConditions();
			String target = handlerDecision.processCondition(wb,wnb,conds);
			WFNodeBean wnbTarget = wb.getNodeBean(target);
			JSONObject jchild = new JSONObject();
			jchild.put("nodename", wnbTarget.getNodename());
			jchild.put("nodetype", wnbTarget.getNodetype());
			jchild.put("nodetitle", wnbTarget.getNodetitle());
			jchild.put("ppdid", wb.getPpdid());
			jchild.put("pdid", pdid);
			jchilds.add(jchild);
		}else{
			for(Iterator<String> it = childNodes.iterator();it.hasNext();){
				JSONObject jchild = new JSONObject();
				String name = it.next();
				WFNodeBean wnbChild = wb.getNodeBean(name);
				jchild.put("nodename", name);
				jchild.put("nodetype", wnbChild.getNodetype());
				jchild.put("nodetitle", wnbChild.getNodetitle());
				jchild.put("ppdid", wb.getPpdid());
				jchild.put("pdid", pdid);
				jchilds.add(jchild);
			}
		}
		ctx.setPrintOut(jchilds.toString());
		return true;
	}
	
	//如果下一节点是frok节点，则列出frok后的所有环节，每个环节必须选择人
	
	
	//如果下一环节是join环节，则判断当前是否是最后一个frok，如果是最后一个frok，则列出后续所有环节，单选
	
	
	
	//如果下一环节是custom节点，则列出后续所有环节，单选
	
	/**
	 * 所有前序节点
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @throws Exception
	 */
	public boolean node_prenodes(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String pdid = _getParameter("pdid", request, response);
		String nodename = _getParameter("nodename", request, response);
		ArrayList<String> prenodes = WFFrame.pub_getParentNodes2Start(environment, conb, pdid, nodename);
		
		WFBean wb = WFFrame.wb_create(pdid);
		JSONArray jnodes = new JSONArray();
		for(Iterator<String> it = prenodes.iterator();it.hasNext();){
			JSONObject jnode = new JSONObject();
			String name = it.next();
			WFNodeBean wnb = wb.getNodeBean(name);
			if(!wnb.canReturn()||wnb.isStart()){
				continue;
			}
			jnode.put("nodename", name);
			jnode.put("nodetype", wnb.getNodetype());
			jnode.put("nodetitle", wnb.getNodetitle());
			jnodes.add(jnode);
		}
		ctx.setPrintOut(jnodes.toString());
		return true;
	}
	
	/**
	 * 所有可以特送的节点
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @throws Exception
	 */
	public boolean node_freenodes(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String pdid = _getParameter("pdid", request, response);
		ArrayList<String> nodelist = WFFrame.pub_getNodeList(environment, conb, pdid);
		
		WFBean wb = WFFrame.wb_create(pdid);
		JSONArray jnodes = new JSONArray();
		for(Iterator<String> it = nodelist.iterator();it.hasNext();){
			JSONObject jnode = new JSONObject();
			String name = it.next();
			WFNodeBean wnb = wb.getNodeBean(name);
			if(!wnb.canFree()){
				continue;
			}
			jnode.put("nodename", name);
			jnode.put("nodetype", wnb.getNodetype());
			jnode.put("nodetitle", wnb.getNodetitle());
			jnode.put("ppdid", wb.getPpdid());
			jnodes.add(jnode);
		}
		ctx.setPrintOut(jnodes.toString());
		return true;
	}
	
	/**
	 * 读取列表：模板名称
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public boolean combobox_pd_name(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		JSONArray jrows = WQL.getWO(WDKWQLNames.QWDKWF1001)
							.addParam("flag", "3")
							.process(conb)
							.getResultJSONArray(0);
		jrows = WDK.DataFormat_Combox(jrows, "pdid", "cnname");
		ctx.setPrintOut(jrows.toString());
		return true;
	}
	/**
	 * 根据模板名称读取所有版本
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public boolean combobox_pd_version(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String pdname = _getParameter("pdname", request, response);
		
		JSONArray jrows = WQL.getWO(WDKWQLNames.QWDKWF1001)
								.addParam("flag", "3")
								.addParam("pdname", pdname)
								.process(conb)
								.getResultJSONArray(0);
		jrows = WDK.DataFormat_Combox(jrows, "pdversion", "pdversion");
		ctx.setPrintOut(jrows.toString());
		return true;
	}
	/**
	 * 读取流程状态列表
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public boolean combobox_pd_status(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		JSONArray jrows = new JSONArray();
		JSONObject jrow1 = new JSONObject();
		jrow1.put("id", "");
		jrow1.put("text", "全部");
		jrows.add(jrow1);
		JSONObject jrow2 = new JSONObject();
		jrow2.put("id", "1");
		jrow2.put("text", "启用");
		jrows.add(jrow2);
		JSONObject jrow3 = new JSONObject();
		jrow3.put("id", "0");
		jrow3.put("text", "停用");
		jrows.add(jrow3);
		ctx.setPrintOut(jrows.toString());
		return true;
	}
	
	
	/**
	 * 流程模板环节列表
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public boolean combobox_pd_nodenames(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		JSONArray jrows = new JSONArray();
		String pdid = _getParameter("pdid", request, response);
		WFBean wb = WFFrame.wb_create(pdid);
		if(null!=wb){
			String swf = wb.getSwf();
			JSONObject jwf = JSONObject.fromObject(swf);
			JSONArray jnodes = jwf.getJSONArray("nodes");
			
			//首先增加一个自己的节点
			for(int i=0;i<jnodes.size();i++){
				JSONObject jnode = jnodes.getJSONObject(i);
				String nodename = jnode.has("nodename")?jnode.getString("nodename"):"";
				if("开始".equals(nodename)||"结束".equals(nodename)){
					continue;
				}
				JSONObject jrow = new JSONObject();
				jrow.put("id", nodename);
				jrow.put("text", nodename);
				jrows.add(jrow);
			}
		}
		ctx.setPrintOut(jrows.toString());
		return true;
	}
	
	
	
	
	
	/*********************************************
	 * 
	 * 	流程编辑器相关操作
	 * 
	 *********************************************/
    public boolean designer_list(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		HashMap<String, String> param = _getParameterMap(request, response);
        JSONArray jrows = WQL.getWO(WDKWQLNames.QWDKWFDESIGNER).addParam("flag", "1").addParamMap(param).process(conb).getResultJSONArray(0);

        ctx.setPrintOut(jrows.toString());
        return true;
    }
	/**
	 * 读取监控信息
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @return
	 * @throws Exception
	 */
	public boolean designer_monitor(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String pdid = _getParameter("pdid", request, response);
		String piid = _getParameter("piid", request, response);
		
		//从现行库中查询一遍是否有流程实例，如果没有的话，后续的操作需要特殊处理下
		WFBean wb =  WFEngine.wb_queryByPiid(environment, conb, piid, false);
		
		ArrayList<String> activenodes = new ArrayList<String>();
        if (wb != null) {
            activenodes = WFEngine.pi_getActivityNodes(environment, piid);
        }
		  
		StringBuffer actives = new StringBuffer();
		actives.append("<actives>");
		for(Iterator<String> it = activenodes.iterator();it.hasNext();){
			String nodename = it.next();
			actives.append("<active>"+nodename+"</active>");
		}
		actives.append("</actives>");
		
		JSONArray jrecords = WQL.getWO(WDKWQLNames.QWDKWFRECORD)
								.addParam("flag", wb==null?"802":"801")
								.addParam("piid", piid)
								.addParam("opertypes", "'submit','free','back','start','end','decision'")
								.process(conb)
								.getResultJSONArray(0);
		
		
		HashMap<String,String> tmpmap = new HashMap<String,String>();
		
		StringBuffer paths = new StringBuffer();
		paths.append("<paths>");
		//1、查询当前流程实例的处理记录
		for(int i=0;i<jrecords.size();i++){
			JSONObject jrecord = jrecords.getJSONObject(i);
			String nodename = jrecord.has("nodename")?jrecord.getString("nodename"):"";
			String target = jrecord.has("target")?jrecord.getString("target"):"";
			String opertype = jrecord.has("opertype")?jrecord.getString("opertype"):"";
			
			String keyStr = nodename+","+target+","+opertype;
			if(tmpmap.containsKey(keyStr)){
				continue;
			}
			tmpmap.put(keyStr,"");
			
			paths.append("<path>");
			paths.append("	<nodename>"+nodename+"</nodename>");
			paths.append("	<target>"+target+"</target>");
			paths.append("	<opertype>"+opertype+"</opertype>");
			paths.append("</path>");
		}
		paths.append("</paths>");
		
		//2、查询当前流程模板的图形信息
		String _id = pdid.split("-")[0];
		//String _version = pdid.split("-")[1];
		JSONObject jrow = WQL.getWO(WDKWQLNames.QWDKWFDESIGNER)
								.addParam("flag", "1")
								.addParam("pdid", _id)
								//.addParam("pdversion", _version)
								.process(conb)
								.uniqueResult(0);
		StringBuffer sb = new StringBuffer();
		if(null!=jrow&&jrow.has("fx")&&jrow.has("wf")){
			String fx = jrow.getString("fx");
			String wf = jrow.getString("wf");
			sb.append("<root>");
			sb.append("		<code>1</code>");
			sb.append("		<desc>加载成功</desc>");
			sb.append(fx);
			sb.append(wf);
			sb.append(actives.toString());
			sb.append(paths.toString());
			sb.append("</root>");
		}else{
			sb.append("<root>");
			sb.append("		<code>0</code>");
			sb.append("		<desc>当前流程模板不存在</desc>");
			sb.append("</root>");
		}
		System.out.println(sb.toString());
		String res = java.net.URLEncoder.encode(sb.toString(),"UTF-8");
		ctx.setPrintOut(res);
		return true;
	}
	/**
	 * 读取单个流程设计器源码
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @return
	 * @throws Exception
	 */
	public boolean designer_load(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String pdid = _getParameter("pdid", request, response);
		JSONObject jrow = WQL.getWO(WDKWQLNames.QWDKWFDESIGNER)
								.addParam("flag", "1")
								.addParam("pdid", pdid)
								.process(conb)
								.uniqueResult(0);
		StringBuffer sb = new StringBuffer();
		if(null!=jrow&&jrow.has("fx")&&jrow.has("wf")){
			String fx = jrow.getString("fx");
			String wf = jrow.getString("wf");
			sb.append("<root>");
			sb.append("		<code>1</code>");
			sb.append("		<desc>加载成功</desc>");
			sb.append(fx);
			sb.append(wf);
			sb.append("</root>");
		}else{
			sb.append("<root>");
			sb.append("		<code>0</code>");
			sb.append("		<desc>当前流程模板不存在</desc>");
			sb.append("</root>");
		}
		System.out.println(sb.toString());
		String res = java.net.URLEncoder.encode(sb.toString(),"UTF-8");
		ctx.setPrintOut(res);
		return true;
	}
	
	/**
	 * 保存流程设计结果
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @return
	 * @throws Exception
	 */
	public boolean designer_save(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String pdid = _getParameter("pdid", request, response);
		String pdname = _getParameter("pdname", request, response);
		String cnname = _getParameter("cnname", request, response);
		String fx = _getParameter("fx", request, response);
		String wf = _getParameter("wf", request, response);
		String wfjson = _getParameter("wfjson", request, response);
		String jpdl = _getParameter("jpdl", request, response);

		//1、检测是否存在同名pdid
		JSONObject jpd = WQL.getWO(WDKWQLNames.QWDKWFDESIGNER)
							.addParam("flag", "1")
							.addParam("pdid", pdid)
							.process(conb)
							.uniqueResult(0);
		//2、如果存在，则删除该pdid
		if(null!=jpd){
			WQL.getWO(WDKWQLNames.UWDKWFDESIGNER)
				.addParam("flag", "3")
				.addParam("pdid", pdid)
				.process(conb);
		}
		
		//3、保存当前pdid
		//3.1、保存流程基本信息
		boolean isSuccess = WQL.getWO(WDKWQLNames.UWDKWFDESIGNER)
								.addParam("flag", "1")
								.addParam("pdid", pdid)
								.addParam("pdname", pdname)
								.addParam("cnname", cnname)
								.addParam("jpdl", jpdl)
								.addParam("wf", wf)
								.addParam("wfjson", wfjson)
								.addParam("fx", fx)
								.addParam("isdeploy", "0")
								.addParam("status", "1")
								.addParam("remark", "")
								.addParam("createdt", WDK.getDateTime())
								.process(conb)
								.isSuccess();
		
//		//3.2、保存fx信息
//		isSuccess = WQL.getWO(WDKWQLNames.UWDKWFDESIGNER)
//						.addParam("flag", "52")
//						.addParam("pdid", pdid)
//						.addParam("fx", fx)
//				//		.addParam("wf", wf)
//				//		.addParam("wfjson", wfjson)
//				//		.addParam("jpdl", jpdl)
//						.process(conb)
//						.isSuccess();
//		
//		//3.3、保存wf信息
//		isSuccess = WQL.getWO(WDKWQLNames.UWDKWFDESIGNER)
//						.addParam("flag", "53")
//						.addParam("pdid", pdid)
//				//		.addParam("fx", fx)
//						.addParam("wf", wf)
//				//		.addParam("wfjson", wfjson)
//				//		.addParam("jpdl", jpdl)
//						.process(conb)
//						.isSuccess();
//		
//		//3.4、保存wfjson信息
//		isSuccess = WQL.getWO(WDKWQLNames.UWDKWFDESIGNER)
//						.addParam("flag", "54")
//						.addParam("pdid", pdid)
//				//		.addParam("fx", fx)
//				//		.addParam("wf", wf)
//						.addParam("wfjson", wfjson)
//				//		.addParam("jpdl", jpdl)
//						.process(conb)
//						.isSuccess();
//		
//		//3.5、保存jpdl信息
//		isSuccess = WQL.getWO(WDKWQLNames.UWDKWFDESIGNER)
//						.addParam("flag", "55")
//						.addParam("pdid", pdid)
//				//		.addParam("fx", fx)
//				//		.addParam("wf", wf)
//				//		.addParam("wfjson", wfjson)
//						.addParam("jpdl", jpdl)
//						.process(conb)
//						.isSuccess();
		
		String res = new String();
		if(isSuccess){
			res = "保存成功";
		}else{
			res = "保存失败";
		}
		ctx.setPrintOut(res);
		return true;
	}
	
	/**
	 * 流程设计器：选择人
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @return
	 * @throws Exception
	 */
	public boolean designer_userselect(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String type = _getParameter("type", request, response);
		String str = new String();
		if("getorg".equals(type)){
			str = WDKCore.inst.handler_designer.getOrg(conb);
		}else if("getuser".equalsIgnoreCase(type)){
			String orgcode = _getParameter("deptcode", request, response);
			str = WDKCore.inst.handler_designer.getUser(conb,orgcode);
		}else if("getroletype".equalsIgnoreCase(type)){
			str = WDKCore.inst.handler_designer.getRoleType(conb);
		}else if("getrole".equalsIgnoreCase(type)){
			String roletypecode = _getParameter("deptcode", request, response);
			str = WDKCore.inst.handler_designer.getRole(conb,roletypecode);
		}else if("getvmrole".equalsIgnoreCase(type)){
			str = WDKCore.inst.handler_designer.getVMRole(conb);
		}
		ctx.setPrintOut(str);
		return true;
	}
	
	
	/**
	 * 部署
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @return
	 * @throws Exception
	 */
	public boolean designer_deploy(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String pdid = _getParameter("pdid", request, response);
		//0、查询相关记录
		JSONObject jrow = WQL.getWO(WDKWQLNames.QWDKWFDESIGNER)
								.addParam("flag", "1")
								.addParam("pdid", pdid)
								.process(conb)
								.uniqueResult(0);
		
		JSONObject jres = new JSONObject();
		String _pdid = "";
		if(null!=jrow&&jrow.has("wfjson")&&jrow.has("jpdl")){
			String wfjson = jrow.getString("wfjson");
			String jpdl = jrow.getString("jpdl");
			String pdname = jrow.has("pdname")?jrow.getString("pdname"):"pdname";
			String cnname = jrow.has("cnname")?jrow.getString("cnname"):"cnname";
			
			//1、构建临时目录
			String dir = WDKCore.inst.CFG_RESOURCE_WORKFLOW + File.separator + pdid;
			File fdir = new File(dir);
			if(!fdir.exists()){
				fdir.mkdirs();
			}
			
			//2、生成.jpdl文件
			String jpdlFileName = dir + File.separator+ pdname +".jpdl.xml";
			uFile.delete(jpdlFileName);
			uFile.saveTextFile(jpdlFileName, jpdl,"UTF-8");
			
			//3、生成.wf文件
			String wfFileName = dir + File.separator + pdname +".wf";
			uFile.delete(wfFileName);
			uFile.appendTextFile(wfFileName, wfjson);
			
			//4、生成.png文件
			WFEngine.makePNG(dir, pdname);
			
			//5、部署至流程引擎
			_pdid = WFFrame.pd_deploy(environment,conb, dir, pdname, cnname);
			
			
			//6、删除.jpdl和.png，保留.wf
//			File jpdlFile = new File(dir+"/"+pdname+".jpdl.xml");
//			if(jpdlFile.exists()){
//				jpdlFile.delete();
//			}
//			File pngFile = new File(dir+"/"+pdname+".png");
//			if(pngFile.exists()){
//				pngFile.delete();
//			}
//			File wfFile = new File(dir+"/"+pdname+".wf");
//			if(wfFile.exists()){
//				wfFile.delete();
//			}
//			fdir.delete();
			
		}
		//7、返回处理结果
		if(!"".equals(_pdid)){
			//修改流程发布状态
			WQL.getWO(WDKWQLNames.UWDKWFDESIGNER)
				.addParam("flag", "4")
				.addParam("pdid", pdid)
				.addParam("isdeploy", "1")
				.addParam("engpdid", _pdid)
				.process(conb);
			
			jres.put("code", "1");
			jres.put("desc", "发布成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "发布失败！");
		}
		ctx.setPrintOut(jres.toString());
		return true;
	}
	
	/**
	 * 删除流程设计模板
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @return
	 * @throws Exception
	 */
	public boolean designer_remove(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String pdids = _getParameter("pdids", request, response);
		
		boolean isSuccess = false;
		String[] pdidarr = pdids.split(",");
		for(int i=0;i<pdidarr.length;i++){
			String pdid = pdidarr[i];
			isSuccess = WQL.getWO(WDKWQLNames.UWDKWFDESIGNER)
							.addParam("flag", "3")
							.addParam("pdid", pdid)
							.process(conb)
							.isSuccess();
		}
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "删除成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "删除失败！");
		}
		ctx.setPrintOut(jres.toString());
		
		return true;
	}
	
	
	
	/**************************************************
	 * 		流程模板相关
	 *************************************************/
	
	/**
	 * 读取所有的流程模板
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public boolean pd_list(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		JSONArray jrows = new JSONArray();
		ArrayList<bean_pd> pds = WFFrame.pd_query(environment, conb);
		for(Iterator<bean_pd> it = pds.iterator();it.hasNext();){
			bean_pd pd = it.next();
			JSONObject jrow = new JSONObject();
			String status = pd.getStatus();
			String pdid = pd.getPdid();
			String pdname = pd.getPdname();
			String cnname = pd.getCnname();
			String createdt = pd.getCreatedt();
			String deploymentid = pd.getDeploymentid();
			String pdversion = pd.getPdversion();
			jrow.put("status", status);
			jrow.put("pdid", pdid);
			jrow.put("pdname", pdname);
			jrow.put("cnname", cnname);
			jrow.put("createdt", createdt);
			jrow.put("deploymentid", deploymentid);
			jrow.put("pdversion", pdversion);
			if(WFConstant.PD_STATUS_Enable.equals(status)){
				jrow.put("statusdesc", WFConstant.PD_STATUS_Enable_Desc);
			}else if(WFConstant.PD_STATUS_Disable.equals(status)){
				jrow.put("statusdesc", WFConstant.PD_STATUS_Disable_Desc);
			}else if(WFConstant.PD_STATUS_Remove.equals(status)){
				jrow.put("statusdesc", WFConstant.PD_STATUS_Remove_Desc);
			}
			jrows.add(jrow);
		}
		ctx.setPrintOut(jrows.toString());
		return true;
	}
	/**
	 * 删除流程定义
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public boolean pd_remove(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		JSONObject jres = new JSONObject();
		boolean isSuccess = false;
		String pdid = _getParameter("pdid", request, response);
		String striscascade = _getParameter("iscascade", request, response);
		boolean isCascade = false;
		if("1".equals(striscascade)){
			isCascade = true;
		}
		isSuccess = WFFrame.pd_remove(environment,conb,pdid,isCascade);
		
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "删除成功");
		}else{
			jres.put("code", "0");
			jres.put("desc", "删除失败");
		}
		ctx.setPrintOut(jres.toString());
		return true;
	}
	
	/**
	 * 清除流程模板下的所有流程实例
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @return
	 * @throws Exception
	 */
	public boolean pd_clear(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		JSONObject jres = new JSONObject();
		boolean isSuccess = false;
		String pdid = _getParameter("pdid", request, response);
		isSuccess = WFFrame.pd_clear(environment,conb,pdid);
		
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "清空成功");
		}else{
			jres.put("code", "0");
			jres.put("desc", "清空失败");
		}
		ctx.setPrintOut(jres.toString());
		return true;
	}
	
	
	/**************************************************
	 * 		流程实例相关
	 *************************************************/
	
	/**
	 * 新建流程页面初始化
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public boolean pi_new_init(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		JSONObject jres = new JSONObject();
		String pdid = _getParameter("pdid", request, response);
		WFBean wb = WFFrame.wb_create(pdid);
		WFNodeBean wnb = WFFrame.pub_getFirstNode(environment, conb, pdid);
		//此处显示整个流程的默认值
		if(null!=wb&&null!=wnb){
			jres.put("calendar",wb.getCalendar());
			jres.put("deadline",wb.getDeadline());
			jres.put("deadprocess", wb.getDeadprocess());
			jres.put("warnyellow",wb.getWarnyellow());
			jres.put("warnred", wb.getWarnred());
			jres.put("warnamount", wb.getWarnamount());
			jres.put("wanperiod", wb.getWarnperiod());
			jres.put("isperiod", Integer.parseInt(wb.getWarnamount())>1?"1":"0");
			jres.put("nodename", wnb.getNodename());
			jres.put("nodetype", wnb.getNodetype());
			jres.put("code", "1");
			jres.put("desc", "加载成功");
		}else{
			jres.put("code", "0");
			jres.put("desc", "加载失败");
		}
		ctx.setPrintOut(jres.toString());
		return true;
	}
	
	
	/**
	 * 发起流程实例
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public boolean pi_new(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		//1、页面提交初始化参数
		String count = _getParameter("count", request, response);
		int nCount = 1;
		if(!"".equals(count)){
			nCount = Integer.parseInt(count);
		}
		String pdid = _getParameter("pdid", request, response);
		String strActors = _getParameter("actors", request, response);
		ArrayList<WFActorBean> actors = WFFrame.pub_getActors(strActors);
		
		String nodename = _getParameter("nodename", request, response);
		String nodetype =  _getParameter("nodetype", request, response);
		String comment = _getParameter("comment", request, response);
		String calendar = _getParameter("calendar", request, response);
		String deadline = _getParameter("deadline", request, response);
		String warnyellow = _getParameter("warnyellow", request, response);
		String warnred = _getParameter("warnred", request, response);
		String isperiod = _getParameter("isperiod", request, response);
		String warnamount = _getParameter("warnamount", request, response);
		String warnperiod = _getParameter("warnperiod", request, response);
		if(!"1".equals(isperiod)){
			warnamount = "1";
			warnperiod = "0";
		}
		
		//2、初始化参与者
		BaseSessionUser su = _getSessionuser(request, response);
		
		//3、构建提交参数并发起流程
		String title = "流程开始环节："+nodename;
		String unitid = "unit001";
		bean_start start = new bean_start(su,pdid,actors,title,unitid);
		start.setCalendar(calendar);
		start.setDeadline(deadline);
		start.setFirstnode(nodename);
		start.setWarnamount(warnamount);
		start.setWarnperiod(warnperiod);
		start.setWarnred(warnred);
		start.setWarnyellow(warnyellow);
		start.setOperdt(WDK.getDateTime());
		
		
		String piid = "000";
		if(nCount>1){
			ArrayList<bean_start> starts = new ArrayList<bean_start>();
			for(int i=0;i<nCount;i++){
				starts.add(start);
			}
			WFFrame.pi_new_asyn(starts);
		}else{
			piid = WFFrame.pi_new(environment, conb, start);
		}
		
		JSONObject jres = new JSONObject();
		if(null!=piid&&!"".equals(piid)){
			jres.put("code", "1");
			jres.put("desc", "流程发起成功");
			jres.put("piid", piid);
		}else{
			jres.put("code", "0");
			jres.put("desc", "流程发起失败");
		}
		
		ctx.setPrintOut(jres.toString());
		return true;
	}
	
	
	/**
	 * 读取所有流程实例
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public boolean pi_list(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String pdname = _getParameter("pdname", request, response);
		String pdversion = _getParameter("pdversion", request, response);
		String status = _getParameter("status", request, response);
		
		PageBean pb = WFFrame.pi_pageQuery(request, response, environment, conb, pdname, pdversion, status);
		ArrayList<bean_pi> pis = pb.getRows();
		
		int totalSize = pb.getTOTALSIZE();
		JSONObject jres = new JSONObject();
		
		JSONArray jrows = new JSONArray();
		for(Iterator<bean_pi> it = pis.iterator();it.hasNext();){
			bean_pi dpi = it.next();
			JSONObject jrow = new JSONObject();
			
			StringBuffer actorsb = new StringBuffer();
			ArrayList<WFActorBean> actors = dpi.getActivitynode().getActors();
			for(Iterator<WFActorBean> it2 = actors.iterator();it2.hasNext();){
				WFActorBean wfab = (WFActorBean) it2.next();
				if(wfab.isEnable()&&!wfab.isComplete()){
//					actorsb.append("<a style='margin:5px;' href='javascript:void(0)'  onclick=_actor_click('"+ wfab.getActorId() + "','"+ wfab.getActorType() + "')>"+wfab.getActorId()+"</a>");
					actorsb.append("<a style='margin:5px;' href='javascript:void(0)'  onclick='return false'>"+wfab.getActorId()+"</a>");
				}
			}
			jrow.put("flag", WFFrame.pub_getFlagIcon(dpi.getFlag()));
			jrow.put("deadline",dpi.getDeadline());
			jrow.put("restdays",dpi.getRestdays());
			jrow.put("cnname", dpi.getPd().getCnname());
			jrow.put("creater", dpi.getWb().getCreate_actorid());
			jrow.put("createdt", dpi.getWb().getCreate_dt());
			jrow.put("activitynodename",dpi.getActivitynode().getNodename());
			jrow.put("activitynodetype",dpi.getActivitynode().getNodetype());
			jrow.put("statusname", dpi.isSuspended()?"<span style='font-weight:bold;color:red;'>挂起</span>":"活动");
			jrow.put("pcnname", "");
			jrow.put("actors", actorsb.toString());
			
			
			JSONObject jparam = new JSONObject();
			jparam.put("pdid", dpi.getPd().getPdid());
			jparam.put("piid", dpi.getPiid());
			jparam.put("nodename",dpi.getActivitynode().getNodename());
			jparam.put("nodetype", dpi.getActivitynode().getNodetype());
			jparam.put("islastactor",dpi.getActivitynode().isLastActor()?"1":"0");
			jparam.put("issub",null==dpi.getWb()?"0":(dpi.getWb().hasParent()?"1":"0"));
			jparam.put("islastsub", null==dpi.getWnbParent()?"0":(dpi.getWnbParent().isLastSub()?"1":"0"));
			jparam.put("ppdid", dpi.getWb().getPpdid());
			jparam.put("ppiid", dpi.getWb().getPpiid());
			jparam.put("pnodename",dpi.getWb().getPnodename());
			jrow.put("piid", dpi.getPiid());
			jrow.put("pdid", dpi.getPd().getPdid());
			jrow.put("status", dpi.isSuspended()?"0":"1");
			jrow.put("ppiid", "");
			jrow.put("ppdid", "");
			jrows.add(jrow);
		}
		jres.put("rows", jrows);
		jres.put("total",Integer.toString(totalSize));
		ctx.setPrintOut(jres.toString());
		return true;
	}
	/**
	 * 历史流程
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @throws Exception
	 */
	public boolean pihistory_list(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String pdname = _getParameter("pdname", request, response);
		String pdversion = _getParameter("pdversion", request, response);
		String status = _getParameter("status", request, response);
		
		PageBean pb = WFFrame.pihistory_pageQuery(request, response, environment, conb, pdname, pdversion, status);
		ArrayList<bean_pihistory> pis = pb.getRows();
		
		int totalSize = pb.getTOTALSIZE();
		JSONObject jres = new JSONObject();
		
		JSONArray jrows = new JSONArray();
		for(Iterator<bean_pihistory> it = pis.iterator();it.hasNext();){
			bean_pihistory pihi = it.next();
			JSONObject jrow = new JSONObject();
			
			jrow.put("cnname", pihi.getCnname());
			jrow.put("creater", pihi.getCreateractorid());
			jrow.put("createdt", pihi.getCreatedt());
			jrow.put("completedt", pihi.getCompletedt());
			jrow.put("pcnname", pihi.getPcnname());
			jrow.put("id", pihi.getId());
			jrow.put("pdid", pihi.getPdid());
			jrow.put("piid", pihi.getPiid());
			jrow.put("ppdid", pihi.getPpdid());
			jrow.put("ppiid", pihi.getPpiid());
			jrow.put("createractorid", pihi.getCreateractorid());
			
			JSONObject jparam = new JSONObject();
			jparam.put("id", pihi.getId());
			jparam.put("piid", pihi.getPiid());
			
			StringBuffer sb = new StringBuffer();
			sb.append("<a style='margin:5px;' href='javascript:void(0)'  onclick=_handler_click('monitor',"+jparam.toString()+")>监控</a>");
			sb.append("<a style='margin:5px;' href='javascript:void(0)'  onclick=_handler_click('taskrecord',"+jparam.toString()+")>运行流水</a>");
			sb.append("<a style='margin:5px;' href='javascript:void(0)'  onclick=_handler_click('todorecord',"+jparam.toString()+")>办理记录</a>");
			jrow.put("oper", sb.toString());
			jrows.add(jrow);
		}
		jres.put("rows", jrows);
		jres.put("total",Integer.toString(totalSize));
		ctx.setPrintOut(jres.toString());
		return true;
	}
	
	/**
	 * 读取流程实例的办理记录
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public boolean pi_taskrecord(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String ishistory = _getParameter("ishistory", request, response);
		String piid = _getParameter("piid", request, response);
		
		ArrayList<bean_taskrecord> records = new ArrayList<bean_taskrecord>();
		if("1".equals(ishistory)){
			records = WFFrame.taskrecord_query(environment, conb, piid,true);
		}else{
			records = WFFrame.taskrecord_query(environment, conb, piid);
		}
		
		JSONArray jrows = new JSONArray();
		for(Iterator<bean_taskrecord> it = records.iterator();it.hasNext();){
			bean_taskrecord taskrecord = it.next();
			JSONObject jrow = new JSONObject();
			
			jrow.put("nodename",taskrecord.getNodename());
			jrow.put("nodetypename",WFFrame.pub_getDescByNodetype(taskrecord.getNodetype(), taskrecord.getSigntype()));
			jrow.put("actorid",taskrecord.getActorid());
			jrow.put("originactorid",taskrecord.getOriginactorid());
			jrow.put("opertype",taskrecord.getOpertype());
			jrow.put("operdt",taskrecord.getOperdt());
			jrow.put("opercomment",taskrecord.getOpercomment());
			jrow.put("nodestatus",WFFrame.pub_getDescByStatus(taskrecord.getStatus()));

			jrow.put("target",taskrecord.getTarget());
			jrow.put("targetactors",taskrecord.getTargetactors());
			jrow.put("prenode",null==taskrecord.getPretaskrecord()?"":taskrecord.getPretaskrecord().getNodename());
			String prenodetype = null==taskrecord.getPretaskrecord()?"":taskrecord.getPretaskrecord().getNodetype();
			String presigntype = null==taskrecord.getPretaskrecord()?"":taskrecord.getPretaskrecord().getSigntype();
			jrow.put("prenodetype",WFFrame.pub_getDescByNodetype(prenodetype, presigntype));
			jrow.put("preactorname",null==taskrecord.getPretaskrecord()?"":taskrecord.getPretaskrecord().getActorid());
			jrow.put("preoperdt",null==taskrecord.getPretaskrecord()?"":taskrecord.getPretaskrecord().getOperdt());
			jrow.put("id",taskrecord.getId());
			jrows.add(jrow);
		}
		
		ctx.setPrintOut(jrows.toString());
		return true;
	}
	
	/**
	 * 读取流程实例的办理流水
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public boolean pi_todorecord(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String ishistory = _getParameter("ishistory", request, response);
		String piid = _getParameter("piid", request, response);
		
		ArrayList<bean_todo> todos = new ArrayList<bean_todo>();
		if("1".equals(ishistory)){
			todos = WFFrame.todo_query(environment, conb, piid,true,false);
		}else{
			todos = WFFrame.todo_query(environment, conb, piid);
		}
		
		JSONArray jrows = new JSONArray();
		for(Iterator<bean_todo> it = todos.iterator();it.hasNext();){
			bean_todo todo = it.next();
			if(WFConstant.TODO_Status_done.equals(todo.getStatus())
				||WFConstant.TODO_Status_recover.equals(todo.getStatus())){
				
				JSONObject jrow = new JSONObject();
				jrow.put("nodename",todo.getNodename());
				jrow.put("deptuuid",todo.getDeptuuid());
				jrow.put("actorid",todo.getActorid());
				jrow.put("operdt",todo.getOperdt());
				jrow.put("opercomment",todo.getOpercomment());
				jrow.put("id",todo.getId());
				jrow.put("title",todo.getTitle());
				jrow.put("unitid",todo.getUnitid());
				jrows.add(jrow);
			}
		}
		
		ctx.setPrintOut(jrows.toString());
		return true;
	}
	
	/**
	 * 图形监控
	 * @param request
	 * @param response
	 */
	public boolean pi_monitor(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String piid = _getParameter("piid", request, response);
		WFFrame.pi_monitor(request, response, environment, piid);
		return true;
	}
	
	/**
	 * 人员调整进度查询
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @throws Exception
	 */
	public boolean pi_modify_init(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String pdid = _getParameter("pdid", request, response);
		String piid = _getParameter("piid", request, response);
		String nodename = _getParameter("nodename", request, response);
		
//		JSONArray jgets = WFFrame.task_get_query(environment,conb,pdid,piid,nodename);
		
		
		//判断是否已经领取了任务
		WFBean wb = WFFrame.wb_queryByPiid(environment, conb,  piid);
		WFNodeBean wnb = wb.getNodeBean(nodename);
		JSONArray jactors = new JSONArray();
		ArrayList<WFActorBean> actors = wnb.getActors();
		for(Iterator<WFActorBean> it = actors.iterator();it.hasNext();){
			WFActorBean wfab = it.next();
			JSONObject jactor = wfab.toJSON();
			jactor.put("actorid", wfab.getActorId());
			jactor.put("actortype", wfab.getActorType());
			jactor.put("deptuuid", wfab.getDeptuuid());
			jactor.put("iscomplete", wfab.isComplete()?"1":"0");
			jactors.add(jactor);
		}
		
		JSONObject jres = new JSONObject();
		jres.put("code", "1");
		jres.put("desc", "加载成功");
		jres.put("actors", jactors);
		jres.put("signtype", wnb.getSign_signtype());
		ctx.setPrintOut(jres.toString());
		return true;
	}
	
	
	/**
	 * 提交人员调整
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @throws Exception
	 */
	public boolean pi_modify(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String pdid = _getParameter("pdid", request, response);
		String piid = _getParameter("piid", request, response);
		String nodename = _getParameter("nodename", request, response);
		String nodetype = _getParameter("nodetype", request, response);
		String signtype = _getParameter("signtype", request, response);
		boolean signinsort = false;
		if("1".equals(signtype)){
			signinsort = true;
		}
		String actors = _getParameter("actors", request, response);
		
		ArrayList<WFActorBean> as = new ArrayList<WFActorBean>();
		if(!"".equals(actors)){
			String[] arr = actors.split(";");
			for(int i=0;i<arr.length;i++){
				String[] arr2 = arr[i].split(",");
				String actorid = arr2[0];
				String actortype = arr2[1];
				String deptuuid = arr2[2];
				WFActorBean wfab = new WFActorBean(actorid, actortype,deptuuid);
				as.add(wfab);
			}
		}
		boolean isSuccess = WFFrame.pi_modify(environment, conb, piid, nodename, as,signinsort,false);
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "调整成功");
		}else{
			jres.put("code", "0");
			jres.put("desc", "调整失败");
		}
		ctx.setPrintOut(jres.toString());
		return true;
	}
	
	
	/**
	 * 流程挂起
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @throws Exception
	 */
	public boolean pi_suspend(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		JSONObject jres = new JSONObject();
		String pdid = _getParameter("pdid", request, response);
		String piid = _getParameter("piid", request, response);
		
		boolean isSuccess = WFFrame.pi_suspend(environment, conb,piid);
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "流程挂起成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "流程挂起失败！");
		}
		ctx.setPrintOut(jres.toString());
		return true;
	}
	
	/**
	 * 流程恢复
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @throws Exception
	 */
	public boolean pi_resume(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		JSONObject jres = new JSONObject();
		String pdid = _getParameter("pdid", request, response);
		String piid = _getParameter("piid", request, response);
		
		boolean isSuccess = WFFrame.pi_resume(environment, conb, pdid, piid);
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "流程恢复成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "流程恢复失败！");
		}
		ctx.setPrintOut(jres.toString());
		return true;
	}
	
	/**
	 * 删除流程实例
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @throws Exception
	 */
	public boolean pi_remove(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		JSONObject jres = new JSONObject();
		String pdid = _getParameter("pdid", request, response);
		String piid = _getParameter("piid", request, response);
		
		boolean isSuccess = WFFrame.pi_remove(environment, conb,pdid,piid);
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "流程删除成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "流程删除失败！");
		}
		ctx.setPrintOut(jres.toString());
		return true;
	}
	
	
	public boolean pi_removetask(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		JSONObject jres = new JSONObject();
		String pdid = _getParameter("pdid", request, response);
		String piid = _getParameter("piid", request, response);
		
		boolean isSuccess = WFEngine.task_removeByPiid(environment, piid);
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "流程task删除成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "流程task删除失败！");
		}
		ctx.setPrintOut(jres.toString());
		return true;
	}
	
//	/**
//	 * 流程迁移
//	 * @param request
//	 * @param response
//	 * @param environment
//	 * @param conb
//	 * @throws Exception
//	 */
//	public boolean pi_move(HttpServletRequest request,HttpServletResponse response,Environment environment,ConnectBean conb) throws Exception {
//		String pdid = _getParameter("pdid", request, response);
//		String piid = _getParameter("piid", request, response);
//		String newpdid = _getParameter("newpdid", request, response);
//		String cascade = _getParameter("cascade", request, response);
//		boolean isCascade = false;
//		if("1".equals(cascade)){
//			isCascade = true;
//		}
//		String newpiid = WFFrame.pi_move(environment, conb, piid, newpdid,isCascade);
//		JSONObject jres = new JSONObject();
//		if(null!=newpiid&&!"".equals(newpiid)){
//			jres.put("code", "1");
//			jres.put("desc", "流程迁移成功！");
//		}else{
//			jres.put("code", "0");
//			jres.put("desc", "流程迁移失败！");
//		}
//		_PRINT(request, response, jres.toString());
//		return true;
//	}
	
//	/**
//	 * 流程环节推进
//	 * @param request
//	 * @param response
//	 * @param environment
//	 * @param conb
//	 * @throws Exception 
//	 */
//	public boolean pi_push(HttpServletRequest request,HttpServletResponse response,Environment environment,ConnectBean conb) throws Exception{
//		String pdid = _getParameter("pdid", request, response);
//		String piid = _getParameter("piid", request, response);
//		String nodename = _getParameter("nodename", request, response);
//		String nodetype = _getParameter("nodetype", request, response);
//		String nextnode = _getParameter("nextnode", request, response);
//		String nextnodetype = _getParameter("nextnodetype", request, response);
//		String signtype = _getParameter("signtype", request, response);
//		boolean signinsort = false;
//		if("1".equals(signtype)){
//			signinsort = true;
//		}
//		String nextactors = _getParameter("nextactors", request, response);
//		String ptarget = _getParameter("ptarget", request, response);
//		String ptargettype = _getParameter("ptargettype", request, response);
//		
//		ArrayList<WFActorBean> actors = new ArrayList<WFActorBean>();
//			if(null!=nextactors&&!"".equals(nextactors)){
//			String[] arr = nextactors.split(";");
//			for(int i=0;i<arr.length;i++){
//				String[] arr2 = arr[i].split(",");
//				WFActorBean actor = new WFActorBean(arr2[0], arr2[1]);
//				actors.add(actor);
//			}
//		}
//		boolean isSuccess = WFFrame.pi_push(environment, conb,piid,nodename,nextnode,actors,signinsort,ptarget);
//		JSONObject jres = new JSONObject();
//		if(isSuccess){
//			jres.put("code", "1");
//			jres.put("desc", "流程推进成功！");
//		}else{
//			jres.put("code", "0");
//			jres.put("desc", "流程推进失败！");
//		}
//		_PRINT(request, response, jres.toString());
//		return true;
//	}
	
	
	/**************************************************
	 * 		待办处理相关
	 *************************************************/
	
	/**
	 * 所有待办列表
	 */
	public boolean todo_list(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String actorid = _getParameter("actorid", request, response);
		String shasdone = _getParameter("hasdone", request, response);
		String shasdepute = _getParameter("hasdepute", request, response);
		
		boolean hasdone = "1".equals(shasdone)?true:false;
		boolean hasdepute = "1".equals(shasdepute)?true:false;
		HashMap<String,String> param = new HashMap<String, String>();
		param.put("actorid", actorid);
		JSONObject jres = WFFrame.todo_pageQuery(environment, conb, request, response, param,hasdepute,hasdone);
		ctx.setPrintOut(jres.toString());
		return true;
	}
	
	/**
	 * 查询某一个待办的记录
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @return
	 * @throws Exception
	 */
	public boolean todo_query(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String id = _getParameter("id", request, response);
		bean_todo todo = WFFrame.todo_querySingle(environment, conb, id);
		todo = WFFrame.todo_addExtraParam(environment, conb, todo);
		String res = null==todo?"":todo.toJSON().toString();
		ctx.setPrintOut(res);
		return true;
	}
	/**
	 * 领取
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @return
	 * @throws Exception
	 */
	public boolean todo_get(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String id = _getParameter("id", request, response);
		String actorid = _getParameter("actorid", request, response);
		String actortype = _getParameter("actortype", request, response);
		String deptuuid = _getParameter("deptuuid", request, response);
		String originactorid = _getParameter("originactorid", request, response);
		String originactortype = _getParameter("originactortype", request, response);
		String origindeptuuid = _getParameter("origindeptuuid", request, response);
		String agenttype = _getParameter("agenttype", request, response);
		String isdeputesign = _getParameter("isdeputesign", request, response);
		
		WFActorBean actor = new WFActorBean(actorid,actortype,deptuuid);
		WFActorBean originactor = new WFActorBean(originactorid, originactortype, origindeptuuid);
		boolean isSuccess = WFFrame.todo_get(environment, conb, id, actor,originactor,agenttype,isdeputesign);
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "待办领取成功");
		}else{
			jres.put("code", "0");
			jres.put("desc", "待办领取失败");
		}
		ctx.setPrintOut(jres.toString());
		return true;
	}
	/**
	 * 领退
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @return
	 * @throws Exception
	 */
	public boolean todo_return(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String id = _getParameter("id", request, response);
		String actorid = _getParameter("actorid", request, response);
		String actortype = _getParameter("actortype", request, response);
		String deptuuid = _getParameter("deptuuid", request, response);
		String originactorid = _getParameter("originactorid", request, response);
		String originactortype = _getParameter("originactortype", request, response);
		String origindeptuuid = _getParameter("origindeptuuid", request, response);
		String agenttype = _getParameter("agenttype", request, response);
		String isdeputesign = _getParameter("isdeputesign", request, response);
		
		WFActorBean actor = new WFActorBean(actorid,actortype,deptuuid);
		WFActorBean originactor = new WFActorBean(originactorid, originactortype, origindeptuuid);
		boolean isSuccess = WFFrame.todo_return(environment, conb, id, actor, originactor, agenttype, isdeputesign);
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "待办领退成功");
		}else{
			jres.put("code", "0");
			jres.put("desc", "待办领退失败");
		}
		ctx.setPrintOut(jres.toString());
		return true;
	}
	
	
	/**
	 * 任务提交：前进
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @throws Exception
	 */
	public boolean todo_submit(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String todoid = _getParameter("todoid", request, response);
		
		String title = _getParameter("title", request, response);
		
		String actorid = _getParameter("actorid", request, response);
		String actortype = _getParameter("actortype", request, response);
		String deptuuid = _getParameter("deptuuid", request, response);
		String agenttype = _getParameter("agenttype", request, response);
		String isdeputesign = _getParameter("isdeputesign", request, response);
		String originactorid = _getParameter("originactorid", request, response);
		String originactortype = _getParameter("originactortype", request, response);
		String origindeptuuid = _getParameter("origindeptuuid", request, response);
		
		String opertype = _getParameter("opertype", request, response);
		String opercomment = _getParameter("opercomment", request, response);
		String signtype = _getParameter("signtype", request, response);
		String nextnode = _getParameter("nextnode", request, response);
		String nextnodetype = _getParameter("nextnodetype", request, response);
		String nextactors = _getParameter("nextactors", request, response);
		
		//如果是子流程，则需要传入父流程
		String ptarget = _getParameter("ptarget", request, response);
		String ptargettype = _getParameter("ptargettype", request, response);
		
		//考虑批量提交的情况
		String extrasigntype = _getParameter("extrasigntype", request, response);
		String extranextnode = _getParameter("extranextnode", request, response);
		String extranextnodetype = _getParameter("extranextnodetype", request, response);
		String extranextactors = _getParameter("extranextactors", request, response);
		
		String dt = WDK.getDateTime();
		
		//查询当前todo对象
		bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
		
		//构建submit提交对象
		bean_submit submit = new bean_submit(todo);
		submit.setActorid(actorid);
		submit.setActortype(actortype);
		submit.setAgenttype(agenttype);
		submit.setIsdeputesign(isdeputesign);
		submit.setDeptuuid(deptuuid);
		submit.setOpertype(opertype);
		submit.setOperdt(dt);
		submit.setOpercomment(opercomment);
		submit.setOriginactorid(originactorid);
		submit.setOriginactortype(originactortype);
		submit.setOrigindeptuuid(origindeptuuid);
		submit.setPtarget(ptarget);
		submit.setPtargettype(ptargettype);
		if (title != null && title.trim().length() > 0) {
            submit.setTitle(title);
        }
		submit.setSigntype(signtype);
		submit.setTarget(nextnode);
		submit.setTargettype(nextnodetype);
		ArrayList<WFActorBean> actors = WFFrame.pub_getActors(nextactors);
		submit.setTargetactors(actors);
		
		//考虑到frok的情况，可能下一环节会有多个并发环节的可能性
		ArrayList<bean_submit_target> extratargets = new ArrayList<bean_submit_target>();
		if(null!=extranextnode&&!"".equals(extranextnode)){
			if(-1!=extranextnode.indexOf("||")){
				String[] arrSigntype = extrasigntype.split("\\|\\|");
				String[] arrNextnode = extranextnode.split("\\|\\|");
				String[] arrNextnodetype = extranextnodetype.split("\\|\\|");
				String[] arrNextactors = extranextactors.split("\\|\\|");
				for(int i=0;i<arrSigntype.length;i++){
					bean_submit_target bst = new bean_submit_target();
					bst.setSigntype(arrSigntype[i]);
					bst.setTarget(arrNextnode[i]);
					bst.setTargettype(arrNextnodetype[i]);
					ArrayList<WFActorBean> extraactors = WFFrame.pub_getActors(arrNextactors[i]);
					bst.setTargetactors(extraactors);
					extratargets.add(bst);
				}
			}else{
				//如果只是正常单个环节的推进
				bean_submit_target bst = new bean_submit_target();
				bst.setSigntype(extrasigntype);
				bst.setTarget(extranextnode);
				bst.setTargettype(extranextnodetype);
				ArrayList<WFActorBean> extraactors = WFFrame.pub_getActors(extranextactors);
				bst.setTargetactors(extraactors);
				extratargets.add(bst);
			}
		}
		submit.setExtratargets(extratargets);
		
		
		//提交
		boolean isSuccess = WFFrame.todo_submit(environment, conb, submit);
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "送达成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "送达失败！");
		}
		ctx.setPrintOut(jres.toString());
		return true;
		
	}
	
	/**
	 * 追回检查
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @return
	 * @throws Exception
	 */
	public boolean todo_recover_check(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String id = _getParameter("id", request, response);
		boolean isSuccess = WFFrame.todo_recover_check(environment, conb, id);
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "允许追回");
		}else{
			jres.put("code", "0");
			jres.put("desc", "不允许追回，下一环节已被处理");
		}
		ctx.setPrintOut(jres.toString());
		return true;
	}
	/**
	 * 追回
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @return
	 * @throws Exception
	 */
	public boolean todo_recover(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String id = _getParameter("id", request, response);
		String actorid = _getParameter("actorid", request, response);
		String actortype = _getParameter("actortype", request, response);
		String deptuuid = _getParameter("deptuuid", request, response);
		String agenttype = _getParameter("agenttype", request, response);
		String isdeputesign = _getParameter("isdeputesign", request, response);
		String originactorid = _getParameter("originactorid", request, response);
		String originactortype = _getParameter("originactortype", request, response);
		String origindeptuuid = _getParameter("origindeptuuid", request, response);
		String operdt = WDK.getDateTime();
		String opercomment = _getParameter("opercomment", request, response);
		
		WFActorBean actor = new WFActorBean(actorid,actortype,deptuuid);
		WFActorBean originactor = null;
		if(!"".equals(originactorid)){
			originactor = new WFActorBean(originactorid,originactortype,origindeptuuid);
		}
		boolean isSuccess = WFFrame.todo_recover(environment, conb, id, actor, originactor, agenttype,isdeputesign, operdt,opercomment);
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "追回成功");
		}else{
			jres.put("code", "0");
			jres.put("desc", "追回失败，下一环节已被处理");
		}
		ctx.setPrintOut(jres.toString());
		return true;
	}
	
	
	/**
	 * 检验当前待办是否是最后一个处理者
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @throws Exception
	 */
	public boolean todo_checklast(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String todoid = _getParameter("todoid", request, response);
		String pdid = _getParameter("pdid", request, response);
		String piid = _getParameter("piid", request, response);
		String nodename = _getParameter("nodename", request, response);
		
		JSONObject jres = new JSONObject();
		bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
		
		//判断是否转办还是普通任务
		if(todo.isTodo()){
			WFBean wb = WFFrame.wb_queryByPiid(environment, conb, piid);
			WFNodeBean wnb = wb.getNodeBean(nodename);
			//如果是普通任务，则从节点对象中查询
			jres.put("islastactor", wnb.isLastActor()?"1":"0");
		}else if(todo.isTurn()){
		//如果是转办任务，则从转办表中查询
			jres.put("islastactor", "1");
		}else{
		//如果是交办任务
			jres.put("islastactor", "1");
		}
		
		jres.put("code", "1");
		jres.put("desc", "查询成功");
		ctx.setPrintOut(jres.toString());
		return true;
	}
	
	/**
	 * 会签进度
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @throws Exception
	 */
	public boolean todo_signprocess(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String pdid = _getParameter("pdid", request, response);
		String piid = _getParameter("piid", request, response);
		String nodename = _getParameter("nodename", request, response);
		WFBean wb = WFFrame.wb_queryByPiid(environment, conb, piid);
		WFNodeBean wnb = wb.getNodeBean(nodename);
		JSONArray jactors = new JSONArray();
		
		ArrayList<WFActorBean> actors = wnb.getActors();
		for(Iterator<WFActorBean> it = actors.iterator();it.hasNext();){
			WFActorBean wfab = it.next();
			jactors.add(wfab.toJSON());
		}
		JSONObject jres = new JSONObject();
		jres.put("code", "1");
		jres.put("desc", "加载成功");
		jres.put("actors", jactors);
		ctx.setPrintOut(jres.toString());
		return true;
	}
	/**************************************************
	 * 		基础公用方法
	 *************************************************/
	
	
	
	/**************************************************
	 * 
	 * 		领取、委托、交办、抄送、阅办等操作
	 * 
	 *************************************************/
	public boolean depute_list(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		JSONArray jrows = new JSONArray();
		ArrayList<bean_depute> deputes = WFFrame.depute_query(environment, conb,null);
		for(Iterator<bean_depute> it = deputes.iterator();it.hasNext();){
			bean_depute depute = it.next();
			JSONObject jrow = new JSONObject();
			jrow.put("actorid",depute.getActorid());
			jrow.put("deputeactorid",depute.getDeputeactorid());
			jrow.put("pdid",depute.getPdid());
			jrow.put("deputetypename","1".equals(depute.getDeputeactortype())?"全程委托":"部分委托");
			jrow.put("remark",depute.getRemark());
			jrow.put("createdt",depute.getCreatedt());
			jrow.put("startdt",depute.getStartdt());
			jrow.put("enddt",depute.getEnddt());
			jrow.put("statusname","1".equals(depute.getStatus())?"启用":"停用");
			jrow.put("id",depute.getId());
			jrow.put("deputetype",depute.getDeputetype());
			jrow.put("actortype",depute.getActortype());
			jrow.put("deptuuid",depute.getDeptuuid());
			jrow.put("deputeactortype",depute.getDeputeactortype());
			jrow.put("deputdeptuuid",depute.getDeputedeptuuid());
			jrow.put("unitid",depute.getUnitid());
			jrow.put("isdeputesign",depute.getIsdeputesign());
			jrow.put("status",depute.getStatus());
			
//			StringBuffer sb = new StringBuffer();
//			if("1".equals(depute.getStatus())){
//				sb.append("<a style='margin:5px;' href='javascript:void(0)'  onclick=_handler_click('disable','"+depute.getId()+"')>停用</a>");
//			}else{
//				sb.append("<a style='margin:5px;' href='javascript:void(0)'  onclick=_handler_click('enbale','"+depute.getId()+"')>启用</a>");
//			}
//			sb.append("<a style='margin:5px;' href='javascript:void(0)'  onclick=_handler_click('modify','"+depute.getId()+"')>修改</a>");
//			sb.append("<a style='margin:5px;' href='javascript:void(0)'  onclick=_handler_click('remove','"+depute.getId()+"')>删除</a>");
//			
//			jrow.put("oper",sb.toString());
			jrows.add(jrow);
		}
		ctx.setPrintOut(jrows.toString());
		return true;
	}
	/**
	 * 委托
	 * 		新增委托
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @throws Exception
	 */
	public boolean depute_add(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		JSONObject jres = new JSONObject();
		String actorid = _getParameter("actorid", request, response);
		String actortype = _getParameter("actortype", request, response);
		String deputeactorid = _getParameter("deputeactorid", request, response);
		String deputeactortype = _getParameter("deputeactortype", request, response);
		String deputetype = _getParameter("type", request, response);
		String nodenames = _getParameter("nodenames", request, response);
		String createdt = _getParameter("createdt", request, response);
		String startdt = _getParameter("startdt", request, response);
		String enddt = _getParameter("enddt", request, response);
		String remark = _getParameter("remark", request, response);
		String pdid = _getParameter("pdid", request, response);
		String unitid = _getParameter("unitid", request, response);
		String isdeputesign = _getParameter("isdeputesign", request, response);

		bean_depute depute = new bean_depute();
		depute.setActorid(actorid);
		depute.setActortype(actortype);
		depute.setCreatedt(createdt);
		depute.setDeputeactorid(deputeactorid);
		depute.setDeputeactortype(deputeactortype);
		depute.setDeputetype(deputetype);
		depute.setEnddt(enddt);
		depute.setId(WDK.getUUID());
		depute.setNodenames(nodenames);
		depute.setPdid(pdid);
		depute.setRemark(remark);
		depute.setStartdt(startdt);
		depute.setStatus("1");
		depute.setUnitid(unitid);
		depute.setIsdeputesign(isdeputesign);
		
		boolean isSuccess = WFFrame.depute_add(environment, conb, depute,"");
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "委托成功");
		}else{
			jres.put("code", "0");
			jres.put("desc", "委托失败");
		}
		
		ctx.setPrintOut(jres.toString());
		return true;
	}
	
	/**
	 * 修改委托状态
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @return
	 * @throws Exception
	 */
	public boolean depute_updatestatus(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String deputeid = _getParameter("id", request, response);
		String status = _getParameter("status", request, response);
		
		JSONObject jres = new JSONObject();
		boolean isSuccess = false;
		if("1".equals(status)){
			isSuccess = WFFrame.depute_enable(environment, conb, deputeid);
			if(isSuccess){
				jres.put("code", "1");
				jres.put("desc", "委托启用成功");
			}else{
				jres.put("code", "0");
				jres.put("desc", "委托启用失败");
			}
		}else{
			isSuccess = WFFrame.depute_disable(environment, conb, deputeid);
			if(isSuccess){
				jres.put("code", "1");
				jres.put("desc", "委托禁用成功");
			}else{
				jres.put("code", "0");
				jres.put("desc", "委托禁用失败");
			}
		}
		
		ctx.setPrintOut(jres.toString());
		
		return true;
	}
	
	
	/**
	 * 更改签名状态
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @return
	 * @throws Exception
	 */
	public boolean depute_updatesign(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String deputeid = _getParameter("id", request, response);
		String status = _getParameter("status", request, response);
		
		JSONObject jres = new JSONObject();
		boolean isSuccess = false;
		if("1".equals(status)){
			isSuccess = WFFrame.depute_enablesign(environment, conb, deputeid);
			if(isSuccess){
				jres.put("code", "1");
				jres.put("desc", "启用成功");
			}else{
				jres.put("code", "0");
				jres.put("desc", "启用失败");
			}
		}else{
			isSuccess = WFFrame.depute_disablesign(environment, conb, deputeid);
			if(isSuccess){
				jres.put("code", "1");
				jres.put("desc", "禁用成功");
			}else{
				jres.put("code", "0");
				jres.put("desc", "禁用失败");
			}
		}
		
		ctx.setPrintOut(jres.toString());
		
		return true;
	}
	
	/**
	 * 转办、交办
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @return
	 * @throws Exception
	 */
	public boolean turn_add(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		String todoid = _getParameter("id", request, response);
		String actorid = _getParameter("actorid", request, response);
		String actortype = _getParameter("actortype", request, response);
		String deptuuid = _getParameter("deptuuid", request, response);
		String originactorid = _getParameter("originactorid", request, response);
		String originactortype = _getParameter("originactortype", request, response);
		String origindeptuuid = _getParameter("origindeptuuid", request, response);
		String agenttype = _getParameter("agenttype", request, response);
		String isdeputesign = _getParameter("isdeputesign", request, response);
		String turnactorid = _getParameter("turnactorid", request, response);
		String turntype = _getParameter("turntype", request, response);
		String turnopertype = _getParameter("turnopertype", request, response);
		
		
		WFActorBean actor = new WFActorBean(actorid, actortype, deptuuid);
		WFActorBean originactor = new WFActorBean(originactorid, originactortype, origindeptuuid);
		ArrayList<WFActorBean> turnactors = new ArrayList<WFActorBean>();
		if(null!=turnactorid&&!"".equals(turnactorid)){
			String[] arr = turnactorid.split(";");
			for(int i=0;i<arr.length;i++){
				String strActor = arr[i];
				String[] arr2 = strActor.split(",");
				WFActorBean wfab = new WFActorBean(arr2[0],arr2[1],arr2[2]);
				turnactors.add(wfab);
			}
		}
		boolean isSuccess = WFFrame.turn_add(environment, conb, todoid, actor, originactor, agenttype, isdeputesign, turnactors, turntype, turnopertype);
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "操作成功");
		}else{
			jres.put("code", "0");
			jres.put("desc", "操作失败");
		}
		ctx.setPrintOut(jres.toString());
		return true;
	}
	
	
    
    /**
     * 说明：流程复制
     *<p>
     * Method designer_copy
     * @param request
     * @param response
     * @param environment
     * @param conb
     * @return
     * @throws Exception
     */
    public boolean designer_copy(WDKContext ctx) throws Exception {
		HttpServletRequest request = ctx.getRequest();
		HttpServletResponse response = ctx.getResponse();
		Environment environment = ctx.getEnvironment();
		ConnectBean conb = ctx.getConnectBean();
		boolean isSuccess = false;
        List<String> errorMsg = new ArrayList<String>();
        String src_pdid = _getParameter("src_pdid", request, response);
        JSONObject src_jpd = WQL.getWO(WDKWQLNames.QWDKWFDESIGNER).addParam("flag", "1").addParam("pdid", src_pdid).process(conb).uniqueResult(0);
        if (null != src_jpd) {
            WQLObject wo = WQLObject.getWQLObject("WDK_WF_DESIGNER");
            WQLData dataSet = new WQLData(wo);
            String copyJSONArraString = _getParameter("rows", request, response);
            if (copyJSONArraString != null && copyJSONArraString.trim().length() > 0) {
                JSONArray copyJSONArray = JSONArray.fromObject(copyJSONArraString);
                if (copyJSONArray != null && copyJSONArray.size() > 0) {
                    for (int i = 0; i < copyJSONArray.size(); i++) {
                        JSONObject row = copyJSONArray.getJSONObject(i);
                        String pdid = row.getString("pdid");
                        String pdname = row.getString("pdname");
                        String cnname = row.getString("cnname");

                        // 1、检测是否存在同名pdid
                        JSONObject jpd = WQL.getWO(WDKWQLNames.QWDKWFDESIGNER).addParam("flag", "1").addParam("pdid", pdid).process(conb)
                                .uniqueResult(0);
                        // 2、如果存在，则删除该pdid
                        if (null != jpd) {
                            // WQL.getWO(WDKWQLNames.UWDKWFDESIGNER)
                            // .addParam("flag", "3")
                            // .addParam("pdid", pdid)
                            // .process(conb);
                            errorMsg.add(cnname + "[" + pdname + "]");
                            continue;
                        }
                        String fx = src_jpd.getString("fx");
                        String wf = src_jpd.getString("wf");
                        String wfjson = src_jpd.getString("wfjson");
                        String jpdl = src_jpd.getString("jpdl");
                        String _pdid = src_jpd.getString("pdid");
                        String _pdname = src_jpd.getString("pdname");
                        String _cnname = src_jpd.getString("cnname");
                        jpdl = jpdl.replaceAll(_pdid, pdid);
                        fx = fx.replaceAll(_pdid, pdid);
                        fx = fx.replaceAll(_pdname, pdname);
                        fx = fx.replaceAll(_cnname, cnname);
                        row.put("fx", fx);
                        row.put("wfjson", wfjson);
                        row.put("jpdl", jpdl);
                        row.put("wf", wf);
                        row.put("isdeploy", "0");
                        row.put("status", "1");
                        row.put("remark", "");
                        row.put("createdt", WDK.getDateTime());
                        dataSet.insert();
                        Map<String, WQLDataField> fieldMap = wo.getFieldMap();
                        Iterator<Entry<String, WQLDataField>> fieldit = fieldMap.entrySet().iterator();
                        while (fieldit.hasNext()) {
                            Entry<String, WQLDataField> entry = fieldit.next();
                            String fieldname = entry.getKey().toLowerCase();
                            // Field field = entry.getValue();
                            if (row.containsKey(fieldname)) {
                                dataSet.setValue(fieldname, row.getString(fieldname));
                            }
                        }
                    }
                    ResultBean rb = wo.insert(dataSet, conb);
                    if (rb != null && rb.isSuccess()) {
                        isSuccess = true;
                    }
                }
            }
        }

        String res = new String();
        if (isSuccess) {
            res = "复制成功";
            if (errorMsg.size() > 0) {
                res += "(其中：" + StringUtils.join(errorMsg.toArray(), ",") + "已经存在，未成功复制)";
            }
        } else {
            res = "复制失败";
        }
        ctx.setPrintOut(res);
        return true;
    }
	
	
	
	
	
	
	
	
	
}
