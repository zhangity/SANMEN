package com.longj.platform.busi.wdk.wf.frame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.jbpm.api.Execution;
import org.jbpm.api.ExecutionService;
import org.jbpm.api.ProcessDefinition;
import org.jbpm.api.ProcessInstance;
import org.jbpm.api.RepositoryService;
import org.jbpm.api.cmd.Environment;
import org.jbpm.api.history.HistoryProcessInstance;
import org.jbpm.api.model.ActivityCoordinates;
import org.jbpm.api.task.Task;
import org.jbpm.pvm.internal.env.EnvironmentImpl;
import org.jbpm.pvm.internal.session.DbSession;
import org.jbpm.pvm.internal.task.OpenTask;
import org.wdk.WDK;
import org.wdk.WDKConstant;
import org.wdk.WDKCore;
import org.wdk.WDKWQLNames;
import org.wdk.core.base.BaseUnitTodo;
import org.wdk.core.bean.PageBean;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKEnvironment;
import org.wdk.core.bean.WDKLogger;
import org.wdk.core.session.SessionManager;
import org.wdk.core.util.uDate;
import org.wdk.module.logeye.bean.LogEyeBean;
import org.wdk.module.wf.WFConstant;
import org.wdk.module.wf.WFError;
import org.wdk.module.wf.engine.JBPMUtil;
import org.wdk.module.wf.engine.WFEngine;
import org.wdk.module.wf.engine.core.bean.WFActorBean;
import org.wdk.module.wf.engine.core.bean.WFBean;
import org.wdk.module.wf.engine.core.bean.WFBeanSub;
import org.wdk.module.wf.engine.core.bean.WFContainerThread;
import org.wdk.module.wf.engine.core.bean.WFNodeBean;
import org.wdk.module.wf.engine.core.extend.IHandler;
import org.wdk.module.wf.engine.core.monitor.WFMonitor;
import org.wdk.module.wf.engine.core.monitor.WFOverdueBean;
import org.wdk.module.wf.frame.BaseWFFrame;
import org.wdk.module.wf.frame.core.bean.bean_depute;
import org.wdk.module.wf.frame.core.bean.bean_pd;
import org.wdk.module.wf.frame.core.bean.bean_pi;
import org.wdk.module.wf.frame.core.bean.bean_pihistory;
import org.wdk.module.wf.frame.core.bean.bean_start;
import org.wdk.module.wf.frame.core.bean.bean_submit;
import org.wdk.module.wf.frame.core.bean.bean_taskrecord;
import org.wdk.module.wf.frame.core.bean.bean_todo;
import org.wdk.module.wf.frame.core.bean.bean_turn;
import org.wdk.module.wf.frame.core.bean.bean_turn_detail;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.WQLObject;
import org.wdk.module.wql.core.engine.object.WO;

import wql.WQLNames;

import com.longj.platform.busi.wdk.handler.SessionUser;
import com.longj.platform.pb.util.StringUtil;


public class WFFrame extends BaseWFFrame{
	private static WDKLogger logger = new WDKLogger(WFFrame.class.getName());
	/**********************************
	 * 公用方法区
	 ***********************************/
	public static WFBean wb_create(String pdid){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		WFBean wb = null;
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"wb_create");//日志跟踪
		try{
			wb = WFEngine.wb_create(pdid);
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return wb;
	}
	
	public static WFBean wb_queryByPiid(Environment environment,ConnectBean conb,String piid,boolean isHistory){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		WFBean wb = null;
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"wb_queryByPiid");//日志跟踪
		try{
			wb = WFEngine.wb_queryByPiid(environment, conb, piid,isHistory);
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return wb;
	}
	
	public static WFBean wb_queryByPiid(Environment environment, ConnectBean conb, String piid, String todoid) {
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		WFBean wb = null;
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"wb_queryByPiid");//日志跟踪
		try{
			wb = WFEngine.wb_queryByPiid(environment, conb, piid, false);
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return wb;
	}
	
	public static WFBean wb_queryByPiid(Environment environment, ConnectBean conb, String piid) {
		return wb_queryByPiid(environment,conb,piid,"");
    }
	
	public static boolean wb_save(Environment environment,ConnectBean conb,WFBean wb){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"wb_save");//日志跟踪
		try{
			String pdid = wb.getPdid();
			String piid = wb.getPiid();
			isSuccess = WFEngine.wb_save(environment, conb, pdid, piid, wb);
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return isSuccess;
	}
	/**
	 * 更新会签处理人处理结果流程变量
	 * @param environment
	 * @param conb
	 * @param wb
	 * @param btodo
	 * @throws Exception
	 */
	private static void wb_updatesignactor(Environment environment,ConnectBean conb,WFBean wb,bean_todo btodo) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"wb_updatesignactor");//日志跟踪
		try{
			if(wb!=null && btodo!=null){
				WFNodeBean wnb = wb.getNodeBean(btodo.getNodename());
				//只有会签环节才需要更新任务参与人完成信息，用于会签是否完成的逻辑判断。
				if (wnb.isSign()){
					ArrayList<bean_turn_detail> bdtls = turndetail_query(environment, conb, btodo.getTurnid());//查询待办对应的转办记录明细
					int _nCount = 0;
		            int _nTotal = bdtls.size();
		            for(Iterator<bean_turn_detail> it = bdtls.iterator();it.hasNext();){
		                  bean_turn_detail btd = it.next();
		                  if(btd.isComplete()){
		                      _nCount++;
		                  }
		            }
		            if(_nCount>=_nTotal-1){
		            	//全部完成时本次转办结束
		            	bean_todo srctodo = WFFrame.todo_querySingle(environment, conb, btodo.getPretodoid());
		            	if(WFConstant.TODO_Type_Turn.equals(srctodo.getTodotype())){
		            		//转办待办的上级待办还是转办，则递归直到上级待办为最原始的待办记录
		            		wb_updatesignactor(environment,conb,wb,srctodo);
		            	}else if(WFConstant.TODO_Type_Normal.equals(srctodo.getTodotype())){
		            		//转办待办的上级待办为正常待办，则更新处理人处理结果
		            		wnb.updateActor(srctodo.getActorid(), srctodo.getActortype(), srctodo.getDeptuuid(), "", WDK.getDateTime());
		                    wb_save(environment, conb, wb);
		            	}
		            }
		        }
			}
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
	}
	/**
	 * 查找流程模板中的第一个环节
	 * @param environment
	 * @param conb
	 * @param pdid
	 * @return
	 */
	public static WFNodeBean pub_getFirstNode(Environment environment,ConnectBean conb,String pdid){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		WFNodeBean wnbFirst = null;
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pub_getFirstNode");//日志跟踪
		try{
			WFBean wb = WFEngine.wb_create(pdid);
			if(wb==null) logger.errorWithNoException("流程模板不存在，pdid："+pdid);
			wnbFirst = wb.getFirstNode();
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return wnbFirst;
	}
	/**
	 * 查找流程模板中的最后一个环节
	 * @param environment
	 * @param conb
	 * @param pdid
	 * @return
	 */
	public static WFNodeBean pub_getLastNode(Environment environment,ConnectBean conb,String pdid){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		WFNodeBean wnbLast = null;
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pub_getLastNode");//日志跟踪
		try{
			WFBean wb = WFEngine.wb_create(pdid);
			wnbLast = wb.getLastNode();
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return wnbLast;
	}
	
	/**
	 * 获取
	 * @param environment
	 * @param conb
	 * @param piid
	 * @return
	 */
	public static ArrayList<String> pub_getActiveNodename(Environment environment,ConnectBean conb,String piid){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		ArrayList<String> list = new ArrayList<String>();
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pub_getActiveNodename");//日志跟踪
		try{
			ProcessInstance pi = WFEngine.pi_query(environment, conb, piid);
			Set<String> set = pi.findActiveActivityNames();
			
			for(Iterator<String> it = set.iterator();it.hasNext();){
				String name = it.next();
				list.add(name);
			}
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return list;
	}
	
	/**
	 * 解析人员字符串，获取人员列表
	 * @param strActors
	 * @return
	 */
	public static ArrayList<WFActorBean> pub_getActors(String strActors){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		ArrayList<WFActorBean> actors = new ArrayList<WFActorBean>();
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pub_getActors");//日志跟踪
		try{
			if(null!=strActors&&!"".equals(strActors)){
				String[] arr = strActors.split(";");
				for(int i=0;i<arr.length;i++){
					String[] actor = arr[i].split(",");
					WFActorBean wab = new WFActorBean(actor[0],actor[1],actor[2]);
					actors.add(wab);
				}
			}
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return actors;
	}
	
	
    /**
     * 获取超期的图片标识
     * @param flag
     * @return
     */
    public static String pub_getFlagIcon(String flag){
    	StringBuffer sb = new StringBuffer();
    	if(WFConstant.OVERDUE_FLAG_Green.equals(flag)){
    		sb.append("<img src='"+WDKCore.inst.WDK_ROOT+"/core/images/icons/extjs_icons/flag/flag_green.png'>");
    	}else if(WFConstant.OVERDUE_FLAG_Yellow.equals(flag)){
    		sb.append("<img src='"+WDKCore.inst.WDK_ROOT+"/core/images/icons/extjs_icons/flag/flag_yellow.png'>");
    	}else if(WFConstant.OVERDUE_FLAG_Red.equals(flag)){
    		sb.append("<img src='"+WDKCore.inst.WDK_ROOT+"/core/images/icons/extjs_icons/flag/flag_red.png'>");
    	}else if(WFConstant.OVERDUE_FLAG_Dead.equals(flag)){
    		sb.append("<img src='"+WDKCore.inst.WDK_ROOT+"/core/images/icons/extjs_icons/cancel.png'>");
    	}
    	return sb.toString();
    }
    
    
    /**
     * 获取节点类型中文描述
     * @param nodetype
     * @param actorInSort
     * @return
     */
    public static String pub_getDescByNodetype(String nodetype,String actorInSort){
    	String nt = "";
    	if(null==nodetype){
    		return nt;
    	}
    	nodetype = nodetype.toLowerCase();
    	if(WFConstant.NODE_START.equals(nodetype)){
    		nt = "开始";
    	}else if(WFConstant.NODE_END.equals(nodetype)){
    		nt = "结束";
    	}else if(WFConstant.NODE_TASK.equals(nodetype)){
    		nt = "人工任务";
    	}else if(WFConstant.NODE_CUSTOM.equals(nodetype)){
    		nt = "自动任务";
    	}else if(WFConstant.NODE_FROK.equals(nodetype)){
    		nt = "分支";
    	}else if(WFConstant.NODE_JOIN.equals(nodetype)){
    		nt = "聚合";
    	}else if(WFConstant.NODE_DECISION.equals(nodetype)){
    		nt = "自动判断";
    	}else if(WFConstant.NODE_SIGN.equals(nodetype)){
    		nt = "会签任务";
    		if("0".equals(actorInSort)){
    			nt = "同时会签任务";
    		}else if("1".equals(actorInSort)){
    			nt = "顺序会签任务";
    		}
    	}else if(WFConstant.NODE_SUBPROCESS.equals(nodetype)){
    		nt = "子流程";
    	}
    	return nt;
    }
    
//    /**
//     * 根据目标节点的类型获取前进动作描述
//     * @param targetType
//     * @return
//     */
//    public static String pub_getDescByForwardtype(String forwardtype){
//    	String _opertype = "";
//    	if(WFConstant.FORWARDTYPE_Pre.equals(forwardtype)){
//			_opertype = "退回";
//		}else if(WFConstant.FORWARDTYPE_Next.equals(forwardtype)){
//			_opertype = "提交";
//		}else if(WFConstant.FORWARDTYPE_Free.equals(forwardtype)){
//			_opertype = "特送";
//		}else if(WFConstant.FORWARDTYPE_Recover.equals(forwardtype)){
//			_opertype = "追回";
//		}else if(WFConstant.FORWARDTYPE_Read.equals(forwardtype)){
//			_opertype = "阅办";
//		}else if(WFConstant.FORWARDTYPE_Fork.equals(forwardtype)){
//			_opertype = "分支";
//		}else if(WFConstant.FORWARDTYPE_Join.equals(forwardtype)){
//			_opertype = "聚合";
//		}else if(WFConstant.FORWARDTYPE_Decision.equals(forwardtype)){
//			_opertype = "判断";
//		}else if(WFConstant.FORWARDTYPE_Custom.equals(forwardtype)){
//			_opertype = "自动";
//		}else if(WFConstant.FORWARDTYPE_Assign.equals(forwardtype)){
//			_opertype = "交办";
//		}else if(WFConstant.FORWARDTYPE_CC.equals(forwardtype)){
//			_opertype = "抄送";
//		}
//    	return _opertype;
//    }
    
    /**
     * 获取状态的中文描述
     * @param status
     * @return
     */
    public static String pub_getDescByStatus(String status){
    	String res = "未完成";
    	if("1".equals(status)){
    		res = "完成";
    	}else if("2".equals(status)){
    		res = "取消";
    	}
    	return res;
    }
//    /**
//     * 根据代理类型获取代理描述
//     * @param agenttype
//     * @return
//     */
//    public static String pub_getDescByAgenttype(String agenttype){
//    	String str = new String();
//    	
//    	if(WFConstant.AGENT_Assign.equals(agenttype)){
//    		str = WFConstant.AGENT_Assign_Desc;
//    	}else if(WFConstant.AGENT_Depute.equals(agenttype)){
//    		str = WFConstant.AGENT_Depute_Desc;
//    	}
//    	return str;
//    }
    
//    public static String pub_geDescByTasktype(String tasktype){
//		String str = new String();
////		if(WFConstant.TASKTYPE_TOGET.equals(tasktype)){
////			str = WFConstant.TASKTYPE_TOGET_DESC;
////		}else 
//		if(WFConstant.TASKTYPE_TODO.equals(tasktype)){
//			str = WFConstant.TASKTYPE_TODO_DESC;
//		}else if(WFConstant.TASKTYPE_DONE.equals(tasktype)){
//			str = WFConstant.TASKTYPE_DONE_DESC;
//		}else if(WFConstant.TASKTYPE_READ.equals(tasktype)){
//			str = WFConstant.TASKTYPE_READ_DESC;
//		}else if(WFConstant.TASKTYPE_AUTO.equals(tasktype)){
//			str = WFConstant.TASKTYPE_AUTO_DESC;
//		}
//		return str;
//	}
    
    
	
	
	/*********************************************
	 * 节点操作类
	 *********************************************/
	
	/**
	 * 获取节点的参与人员列表
	 * @param environment
	 * @param conb
	 * @param pdid
	 * @param piid
	 * @param nodename
	 * @param isfilter
	 * @return
	 */
	public static ArrayList<WFActorBean> pub_getNodeActors(Environment environment,ConnectBean conb,String pdid,String piid,String nodename){
		return pub_getNodeActors(environment, conb, pdid, piid, nodename, false);
	}
	
	public static ArrayList<WFActorBean> pub_getNodeActors(Environment environment,ConnectBean conb,String pdid,String piid,String nodename,boolean isfilter){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		ArrayList<WFActorBean> actors = new ArrayList<WFActorBean>();
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pub_getNodeActors");//日志跟踪
		try{
			WFBean wb = wb_queryByPiid(environment,conb,piid);
			if(null==wb){
				wb = WFEngine.wb_create(pdid);
			}
			WFNodeBean wnb = wb.getNodeBean(nodename);
			if(null!=wnb){
				actors = wnb.getCands();
				if(isfilter&&null!=piid&&!"".equals(piid)){	//需要过滤
					actors = wnb.getActors();
				}
				
				//如果是子流程节点，则取子流程的首节点的后选择作为真实候选者
				if(wnb.isSubprocess()){
					String subpdid = wnb.getSubnode();
					WFBean subwb = WFEngine.wb_create(subpdid);
					if(null!=subwb){
						WFNodeBean subfirstnode = subwb.getFirstNode();
						if(null!=subfirstnode){
							if(isfilter&&null!=piid&&!"".equals(piid)){
								actors = subfirstnode.getActors();
							}else{
								actors = subfirstnode.getCands();
							}
						}
					}
				}
				
				actors = wb.getHandler().getActors(conb, wb, actors);
			}
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return actors;
	}
	
	
	
	
	
	/**
	 * 获取特定流程模板指定节点的下一节点
	 * @param environment
	 * @param conb
	 * @param pdid
	 * @param nodename
	 * @return
	 */
	public static ArrayList<String> pub_getChildNodes(Environment environment,ConnectBean conb,String pdid,String nodename){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		ArrayList<String> nextnodes = new ArrayList<String>();
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pub_getChildNodes");//日志跟踪
		try{
			nextnodes = JBPMUtil.getChildNodes(environment, pdid, nodename);
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return nextnodes;
	}
	
	/**
	 * 当前节点的上一所有可能节点
	 * @param environment
	 * @param conb
	 * @param pdid
	 * @param nodename
	 * @return
	 */
	public static ArrayList<String> pub_getParentNodes(Environment environment,ConnectBean conb,String pdid,String nodename){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		ArrayList<String> prenodes = new ArrayList<String>();
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pub_getParentNodes");//日志跟踪
		try{
			prenodes = JBPMUtil.getParentNodes(environment, pdid, nodename);
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return prenodes;
	}
	/**
	 * 流程模板指定环节的前序所有可能节点
	 * @param environment
	 * @param conb
	 * @param pdid
	 * @param nodename
	 * @return
	 */
	public static ArrayList<String> pub_getParentNodes2Start(Environment environment,ConnectBean conb,String pdid,String nodename){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		ArrayList<String> prenodes = new ArrayList<String>();
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pub_getParentNodes2Start");//日志跟踪
		try{
			WFBean wb = WFEngine.wb_create(pdid);
			prenodes = wb.getRouteMap().get(nodename);
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return prenodes;
	}
	
	/**
	 * 获取所有节点列表
	 * @param environment
	 * @param conb
	 * @param pdid
	 * @param nodename
	 * @return
	 */
	public static ArrayList<String> pub_getNodeList(Environment environment,ConnectBean conb,String pdid){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		ArrayList<String> nodes = new ArrayList<String>();
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pub_getNodeList");//日志跟踪
		try{
			WFBean wb = WFEngine.wb_create(pdid);
			nodes = wb.getNodeList();
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return nodes;
	}
	
	
	/*********************************************
	 * 流程模板操作类
	 * @throws Exception 
	 *********************************************/
	/**
	 * 部署模板
	 * @param environment
	 * @param path
	 * @param name
	 * @param cnname
	 * @return
	 */
	public static String pd_deploy(Environment environment,ConnectBean conb,String path,String name,String cnname){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		String pdid = "";
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pd_deploy");//日志跟踪
		try{
			pdid = WFEngine.pd_deploy(environment,conb, path, name, cnname);
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return pdid;
	}
	/**
	 * 获取所有的模板
	 * @param environment
	 * @param conb
	 * @return
	 */
	public static ArrayList<bean_pd> pd_query(Environment environment,ConnectBean conb){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		ArrayList<bean_pd> pds = new ArrayList<bean_pd>();
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pd_query");//日志跟踪
		try{
			JSONArray jrows = WQL.getWO(WDKWQLNames.QWDKWF1001)
									.addParam("flag", "101")
									.process(conb)
									.getResultJSONArray(0);
			for(int i=0;i<jrows.size();i++){
				JSONObject jrow = jrows.getJSONObject(i);
				bean_pd pd = new bean_pd(jrow);
				pds.add(pd);
			}
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return pds;
	}
	/**
	 * 根据deploymentid删除流程模板
	 * @param environment
	 * @param conb
	 * @param deploymentId
	 * @param isCascade
	 * @return
	 * @throws Exception 
	 */
	public static boolean pd_remove(Environment environment,ConnectBean conb,String pdid) throws Exception{
		return pd_remove(environment, conb, pdid,true);
	}
	public static boolean pd_remove(Environment environment,ConnectBean conb,String pdid,boolean isCascade) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pd_remove");//日志跟踪
		try{
			//1、首先清除流程实例
			if(isCascade){
				isSuccess = pd_clear(environment, conb, pdid);
			}
			//2、然后清除模板
			if(isSuccess){
			 isSuccess = WFEngine.pd_remove(environment, conb, pdid, isCascade);
			}
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		return isSuccess;
	}
	
	/**
	 * 清除该模板下的所有流程实例
	 * @param environment
	 * @param conb
	 * @param pdid
	 * @return
	 * @throws Exception 
	 */
	public static boolean pd_clear(Environment environment,ConnectBean conb,String pdid) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pd_clear");//日志跟踪
		try{
			ArrayList<ProcessInstance> pilist = WFEngine.pi_list(environment, conb, pdid);
			for(Iterator<ProcessInstance> it = pilist.iterator();it.hasNext();){
				ProcessInstance pi = it.next();
				pi_remove(environment, conb,pdid, pi.getId());
			}
			
			//1、删除任务流水表
			isSuccess = taskrecord_removeByPdid(environment, conb, pdid);
			
			//2、删除待办表
			if(isSuccess){
				isSuccess = todo_removeByPdid(environment, conb, pdid);
			}
			
			//3、删除转办表
			if(isSuccess){
				isSuccess = turn_removeByPdid(environment, conb, pdid);
			}
			
			//4、删除转办明细
			if(isSuccess){
				isSuccess = turndetail_removeByPdid(environment, conb, pdid);
			}
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		return isSuccess;
	}
	
	
	
	/**
	 * 说明：办结流程的恢复
	 *<p>
	 * Method pi_recover
	 * @param environment
	 * @param conb
	 * @param wfbean
	 * @param submit
	 * @return
	 * @throws Exception
	 */
	public static String pi_recover(Environment environment,ConnectBean conb,WFBean wfbean) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
	    String  piid = null;
	    
	    LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pi_recover");//日志跟踪
		try{
		    HistoryProcessInstance hispi =   JBPMUtil.getProcessInstanceHisById(environment, wfbean.getPiid());
		    if(hispi!=null){
		       String pistatus =  hispi.getState();
		       if(Execution.STATE_ENDED.equals(pistatus)){
		           ProcessInstance pi =    JBPMUtil.getProcessInstanceById(environment, wfbean.getPiid());
		           if(pi==null){
		               boolean issuccess = WFEngine.wb_save(environment,conb,wfbean.getPdid(), wfbean.getPiid(), wfbean);
		               if(issuccess){
		                   ProcessInstance newpi = JBPMUtil.startProcessInstanceById(environment, hispi.getProcessDefinitionId(), hispi.getKey());
		                   System.out.println(newpi.findActiveActivityNames());
		                   piid = wfbean.getPiid();
		                   if(newpi!=null){
		                       taskrecord_recover_history(environment, conb, piid);
		                       todo_recover_history(environment, conb, piid);
		                       DbSession dbSession = EnvironmentImpl.getFromCurrent(DbSession.class, false);
		                       dbSession.delete(hispi);
		                   }
		               }
		           }
		       }
		    }
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
	    return piid;
	}
	
	/*********************************************
	 * 流程实例操作类
	 * @throws Exception 
	 *********************************************/
	/**
	 * 同步启动流程
	 */
	public static String pi_new(Environment environment,ConnectBean conb,bean_start start) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		String piid = new String();
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pi_new");//日志跟踪
		try{
			if(null==start){
				throw new Exception("流程启动参数为空！");
			}
			
			String pdid = start.getPdid();
			if(null==pdid||"".equals(pdid)){
				throw new Exception("流程启动未指定流程模板！");
			}
			
			//1、初始化流程变量
			if(null==start.getActors()||0==start.getActors().size()){
				logger.warn("流程候选人不能为空");
				return "";
			}
			WFBean wb = WFEngine.wb_create(pdid);
			//添加流程变量
			wb.addVariableAll(start.getParam());
			//添加流程属性
			wb.setVar_nexttodotitle(start.getTitle());
			wb.setVar_unitid(start.getUnitid());
			
			WFNodeBean wnbFirst = wb.getNodeBean(start.getFirstnode());
			if(wnbFirst.isSign()){
				throw new Exception("流程第一个节点不能为会签节点");
			}
			String strhandler = start.getStrhandler();
	        if (strhandler != null && !"".equals(strhandler)) {
	            wb.setStrhandler(strhandler);
	
	            try {
	                wb.setHandler((IHandler) Class.forName(strhandler).newInstance());
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
			
			if(!"".equals(start.getCalendar())){
				wb.setCalendar(start.getCalendar());
			}
			if(!"".equals(start.getDeadline())){
				wb.setDeadline(start.getDeadline());
			}
			if(!"".equals(start.getDeadprocess())){
				wb.setDeadprocess(start.getDeadprocess());
			}
			if(!"".equals(start.getWarnamount())){
				wb.setWarnamount(start.getWarnamount());
			}
			if(!"".equals(start.getWarnperiod())){
				wb.setWarnperiod(start.getWarnperiod());
			}
			if(!"".equals(start.getWarnred())){
				wb.setWarnred(start.getWarnred());
			}
			if(!"".equals(start.getWarnyellow())){
				wb.setWarnyellow(start.getWarnyellow());
			}
			if(!"".equals(start.getPcnname())){
				wb.setPcnname(start.getPcnname());
			}
			if(!"".equals(start.getPnodename())){
				wb.setPnodename(start.getPnodename());
			}
			if(!"".equals(start.getPnodetype())){
				wb.setPnodetype(start.getPnodetype());
			}
			if(!"".equals(start.getPnodetitle())){
				wb.setPnodetitle(start.getPnodetitle());
			}
			if(!"".equals(start.getPpdid())){
				wb.setPpdid(start.getPpdid());
			}
			if(!"".equals(start.getPpdname())){
				wb.setPpdname(start.getPpdname());
			}
			if(!"".equals(start.getPpdversion())){
				wb.setPpdversion(start.getPpdversion());
			}
			if(!"".equals(start.getPpiid())){
				wb.setPpiid(start.getPpiid());
			}
			if(!"".equals(start.getPactorid())){
				wb.setPactorid(start.getPactorid());
			}
			if(!"".equals(start.getPactortype())){
				wb.setPactortype(start.getPactortype());
			}
			if(!"".equals(start.getPdeptuuid())){
				wb.setPdeptuuid(start.getPdeptuuid());
			}
			
			wb.setCreate_actorid(start.getOperactorid());
			wb.setCreate_actortype(start.getOperactortype());
			wb.setCreate_deptuuid(start.getOperdeptuuid());
			wb.setCreate_dt(start.getOperdt());
			
			//2、初始化流程参与者
			wnbFirst.setActors(start.getActors());
			
			//3、发起流程
			isSuccess = wb.getHandler().beforeProcessStart(conb,wb);
			if(isSuccess){
				String preid = wb.getVar_taskrecordId();
				String taskrecordId = WDK.getUUID();
				wb.setVar_taskrecordId(taskrecordId);
				
				piid = WFEngine.pi_new(environment, conb, pdid, wb);
			
				//4、记录流水记录表
				bean_taskrecord tr = new bean_taskrecord();
				tr.setActorid(start.getOperactorid());
				tr.setActortype(start.getOperactortype());
				tr.setAgenttype(WFConstant.Agenttype_Self);
				tr.setCreateactorid(wb.getCreate_actorid());
				tr.setCreateactortype(wb.getCreate_actortype());
				tr.setCreatedeptuuid(wb.getCreate_deptuuid());
				tr.setCreatedt(wb.getCreate_dt());
				tr.setDeptuuid(start.getOperdeptuuid());
				tr.setId(taskrecordId);
				tr.setNodename(wb.getStartNode().getNodename());
				tr.setNodepage(wb.getStartNode().getNodepage());
				tr.setNodetitle(wb.getStartNode().getNodetitle());
				tr.setNodetype(wb.getStartNode().getNodetype());
				tr.setOpercomment("");
				tr.setOperdt(start.getOperdt());
				tr.setOpertype(WFConstant.Opertype_Start);
				tr.setOriginactorid("");
				tr.setOriginactortype("");
				tr.setOrigindeptuuid("");
				tr.setPdid(pdid);
				tr.setPiid(piid);
				tr.setPreid(preid);
				tr.setSigntype("");
				tr.setStatus(WFConstant.Record_Status_Normal);
				tr.setSubtaskid("");
				tr.setTarget(wnbFirst.getNodename());
				tr.setTargetactorls(start.getActors());
				tr.setTaskcreatedt(start.getOperdt());
				tr.setTaskid("");
				tr.setTodoid("");
	
				taskrecord_add(environment, conb, tr);
				wb.getHandler().afterProcessStart(conb,wb);
			}else{
				WFError.beforeProcessStart();
			}
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		//5、返回结果
		return piid;
	}
	
	/**
	 * 异步启动流程
	 * @param environment
	 * @param conb
	 * @param start
	 * @throws Exception
	 */
	public static void pi_new_asyn(bean_start start) throws Exception{
		ArrayList<bean_start> starts = new ArrayList<bean_start>();
		starts.add(start);
		pi_new_asyn(starts);
	}
		
	public static void pi_new_asyn(ArrayList<bean_start> starts) throws Exception{
		Thread t = new Thread(new pi_new_asyn_thread(starts));
		t.start();
	}
	/**
	 * 异步发送的代码
	 * @author Administrator
	 *
	 */
	static class pi_new_asyn_thread implements Runnable{
		ArrayList<bean_start> starts;
		public pi_new_asyn_thread(ArrayList<bean_start> starts) {
			this.starts = starts;
		}
		@Override
		public void run() {
			HashMap<String,Object> param = new HashMap<String, Object>();
			param.put("starts", starts);
			Object oRes = JBPMUtil.execute(new WFContainerThread(param){
				private static final long serialVersionUID = 1L;

				@Override
				public Object execute(Environment environment,ConnectBean conb, HashMap<String, Object> param) throws Exception {
					ArrayList<bean_start> starts = (ArrayList<bean_start>) param.get("starts");
					for(Iterator<bean_start> it = starts.iterator();it.hasNext();){
						bean_start start = it.next();
						String piid = "";
						try {
							piid = WFFrame.pi_new(environment, conb, start);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("发起一个流程："+piid);
					}
					return null;
				}
				
			});
		}
	}
	/**
	 * 删除流程实例
	 * @param environment
	 * @param conb
	 * @param piid
	 * @return
	 * @throws Exception 
	 */
	public static boolean pi_remove(Environment environment,ConnectBean conb,String pdid,String piid) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pi_remove");//日志跟踪
		try{
			//0、遍历所有环节，判断是否有关联子流程
			//		如果有关联子流程，则迭代删除所有的子流程
			WFBean wb = wb_queryByPiid(environment, conb, piid);
			if(null==wb){
				wb = WFEngine.wb_create(pdid);
			}
			isSuccess = wb.getHandler().beforeProcessRemove(conb, wb);
			if(isSuccess){
				ArrayList<String> nodenames = wb.getNodeList();
				for(Iterator<String> it = nodenames.iterator();it.hasNext();){
					String nodename = it.next();
					WFNodeBean wnb = wb.getNodeBean(nodename);
					if(wnb.isSubprocess()){
						ArrayList<WFBeanSub> subs = wnb.getSubs();
						for(Iterator<WFBeanSub> it2 = subs.iterator();it2.hasNext();){
							WFBeanSub wbSub = it2.next();
							if(!wbSub.isComplete()){
								pi_remove(environment, conb, wbSub.getSubPdid(),wbSub.getSubPiid());
							}
						}
					}
				}
				
				
				//1、删除任务流水表
				isSuccess = taskrecord_removeByPiid(environment, conb, piid);
				
				//2、删除待办表
				if(isSuccess){
					isSuccess = todo_removeByPiid(environment, conb, piid);
				}
				
				//3、删除转办表
				if(isSuccess){
					isSuccess = turn_removeByPiid(environment, conb, piid);
				}
				
				//4、删除转办明细
				if(isSuccess){
					isSuccess = turndetail_removeByPiid(environment, conb, piid);
				}
				
				
	//			//2、删除任务领取记录
	//			if(isSuccess){
	//				isSuccess = WFFrame.task_get_remove(environment, conb, piid);
	//			}
	//			
	//			//3、删除交办记录和交办历史记录
	//			if(isSuccess){
	//				isSuccess = WFFrame.assign_remove(environment, conb, piid);
	//			}
	//			//4、删除抄送阅办表
	//			if(isSuccess){
	//				isSuccess = WFFrame.cc_remove(environment, conb, piid);
	//			}
				//5、删除流程变量
				if(isSuccess){
					isSuccess = WFEngine.wb_remove(environment, conb, piid);
				}
				//6、删除流程实例
				if(isSuccess){
					isSuccess = WFEngine.pi_remove(environment, conb, piid, true);
				}
				
				if(!isSuccess){
					throw new Exception("流程删除失败！");
				}
				wb.getHandler().afterProcessRemove(conb, wb);
			}else{
				WFError.beforeProcessRemove();
			}
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		
		return isSuccess;
	}
	/**
	 * 读取所有流程实例
	 * @param environment
	 * @param conb
	 * @param param
	 * @return
	 */
	public static ArrayList<bean_pi> pi_query(Environment environment,ConnectBean conb){
		return pi_query(environment, conb, null, null, null);
	}
	public static ArrayList<bean_pi> pi_query(Environment environment,ConnectBean conb,String pdname){
		return pi_query(environment, conb, pdname, null, null);
	}
	public static ArrayList<bean_pi> pi_query(Environment environment,ConnectBean conb,String pdname,String pdversion){
		return pi_query(environment, conb, pdname, pdversion, null);
	}
	public static ArrayList<bean_pi> pi_query(Environment environment,ConnectBean conb,String pdname,String pdversion,String status){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		ArrayList<bean_pi> pis = new ArrayList<bean_pi>();
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pi_query");//日志跟踪
		try{
			//1、从数据库查询出模板名称
				
			JSONArray jrows = WQL.getWO(WDKWQLNames.QWDKWF1001)
									.addParam("flag", "101")
									.addParam("pdname", pdname)
									.addParam("pdversion", pdversion)
									.addParam("status", status)
									.process(conb)
									.getResultJSONArray(0);
			
			for(int i=0;i<jrows.size();i++){
				JSONObject jrow = jrows.getJSONObject(i);
				String pdid = jrow.has("pdid")?jrow.getString("pdid"):"";
				bean_pd pd = new bean_pd(jrow);
	
				//2、列出每个流程模板所发起的流程实例
				ArrayList<ProcessInstance> list = WFEngine.pi_list(environment,conb,pdid);
				for(Iterator<ProcessInstance> it = list.iterator();it.hasNext();){
					ProcessInstance pi = (ProcessInstance) it.next();
					String tmpPiid = pi.getId();
					WFBean wb = wb_queryByPiid(environment,conb,tmpPiid);
					if(null==wb){
						continue;
					}
						
					WFOverdueBean wfob = WFMonitor.loadOverdue(environment,conb,pdid, tmpPiid, "", WFConstant.MONITOR_TYPE_PROCESS);
					
					//3、每个流程实例的每个活动节点作为一个单独的实例列出
					ArrayList<String> nodes = WFEngine.pi_getActivityNodes(environment, tmpPiid);
					for(Iterator<String> it2 = nodes.iterator();it2.hasNext();){
						String nodename = it2.next();
						WFNodeBean wnb = wb.getNodeBean(nodename);
						bean_pi dpi = new bean_pi();
						if(null!=wfob){
							dpi.setDeadline(Float.toString(wfob.getDeadline()));
							dpi.setRestdays(Float.toString(wfob.getRestDays()));
							dpi.setFlag(wfob.getFlag());
						}
						
						dpi.setSuspended(pi.isSuspended());
						dpi.setActivitynode(wnb);
						dpi.setPd(pd);
						dpi.setPiid(tmpPiid);
						dpi.setWb(wb);
						
						if(wb.hasParent()){
							dpi.setPpdid(wb.getPpdid());
							dpi.setPpiid(wb.getPpiid());
							dpi.setPnodename(wb.getPnodename());
							WFBean wbParent = wb_queryByPiid(environment, conb, wb.getPpiid());
							WFNodeBean wnbParent = wbParent.getNodeBean(wb.getPnodename());
							dpi.setWnbParent(wnbParent);
						}
						
						pis.add(dpi);
					}
				}
			}
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return pis;
	}
	
	
	/**
	 * 分页变量查询
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @param pdname
	 * @param pdversion
	 * @param status
	 * @return
	 */
	public static PageBean pi_pageQuery(HttpServletRequest request,HttpServletResponse response,Environment environment,ConnectBean conb){
		return pi_pageQuery(request, response, environment, conb, null,null,null);
	}
	public static PageBean pi_pageQuery(HttpServletRequest request,HttpServletResponse response,Environment environment,ConnectBean conb,String pdname){
		return pi_pageQuery(request, response, environment, conb,pdname,null,null);
	}
	public static PageBean pi_pageQuery(HttpServletRequest request,HttpServletResponse response,Environment environment,ConnectBean conb,String pdname,String pdversion){
		return pi_pageQuery(request, response, environment, conb,pdname,pdversion,null);
	}
	public static PageBean pi_pageQuery(HttpServletRequest request,HttpServletResponse response,Environment environment,ConnectBean conb,String pdname,String pdversion,String status){
		ArrayList<bean_pi> tmpPis = pi_query(environment, conb, pdname, pdversion,status);
		PageBean pb = new PageBean(request, tmpPis);
		return pb;
	}
	/***************************************************
	 * 
	 * 		历史流程
	 *
	 **************************************************/
	/**
	 * 新增历史流程记录
	 * @param environment
	 * @param conb
	 * @param wb
	 * @return
	 */
	public static boolean pihistory_add(Environment environment,ConnectBean conb,WFBean wb,String operdt){
		boolean isSuccess = WQL.getWO(WQLNames.UWDKWFPIHIS)
								.addParam("flag", "1")
								.addParam("id",WDK.getUUID())
								.addParam("pdid",wb.getPdid())
								.addParam("pdname",wb.getPdname())
								.addParam("pdversion",wb.getPdversion())
								.addParam("cnname",wb.getCnname())
								.addParam("piid",wb.getPiid())
								.addParam("ppdid",wb.getPpdid())
								.addParam("ppdname",wb.getPpdname())
								.addParam("ppdversion",wb.getPpdversion())
								.addParam("pcnname",wb.getPcnname())
								.addParam("pnodename",wb.getPnodename())
								.addParam("ppiid",wb.getPpiid())
								.addParam("createractorid",wb.getCreate_actorid())
								.addParam("createractortype",wb.getCreate_actortype())
								.addParam("createdt",wb.getCreate_dt())
								.addParam("completedt",operdt)
								.process(conb)
								.isSuccess();
		return isSuccess;

	}
	/**
	 * 查询历史流程
	 * @param environment
	 * @param conb
	 * @param pdname
	 * @param pdversion
	 * @param status
	 * @return
	 */
	public static ArrayList<bean_pihistory> pihistory_query(Environment environment,ConnectBean conb){
		return pihistory_query(environment, conb, null, null, null);
	}
	public static ArrayList<bean_pihistory> pihistory_query(Environment environment,ConnectBean conb,String pdname){
		return pihistory_query(environment, conb, pdname, null, null);
	}
	public static ArrayList<bean_pihistory> pihistory_query(Environment environment,ConnectBean conb,String pdname,String pdversion){
		return pihistory_query(environment, conb, pdname, pdversion, null);
	}
	public static ArrayList<bean_pihistory> pihistory_query(Environment environment,ConnectBean conb,String pdname,String pdversion,String status){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		ArrayList<bean_pihistory> pis = new ArrayList<bean_pihistory>();
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pihistory_query");//日志跟踪
		try{
			//1、从数据库查询出模板名称
			JSONArray jrows = WQL.getWO(WDKWQLNames.QWDKWF1001)
									.addParam("flag", "101")
									.addParam("pdname", pdname)
									.addParam("pdversion", pdversion)
									.addParam("status", status)
									.process(conb)
									.getResultJSONArray(0);
			for(int i=0;i<jrows.size();i++){
				JSONObject jrow = jrows.getJSONObject(i);
				String pdid = jrow.has("pdid")?jrow.getString("pdid"):"";
	
				//2、列出每个流程模板所发起的流程实例
				JSONArray jpihis = WQL.getWO(WQLNames.QWDKWFPIHIS)
										.addParam("flag", "1")
										.addParam("pdid", pdid)
										.process(conb)
										.getResultJSONArray(0);
				
				for(int j=0;j<jpihis.size();j++){
					JSONObject jpihi = jpihis.getJSONObject(j);
					bean_pihistory dpi = new bean_pihistory(jpihi);
					pis.add(dpi);
				}
			}
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return pis;
	}
	/**
	 * 分页变量查询
	 * @param request
	 * @param response
	 * @param environment
	 * @param conb
	 * @param pdname
	 * @param pdversion
	 * @param status
	 * @return
	 */
	public static PageBean pihistory_pageQuery(HttpServletRequest request,HttpServletResponse response,Environment environment,ConnectBean conb){
		return pihistory_pageQuery(request, response, environment, conb, null,null,null);
	}
	public static PageBean pihistory_pageQuery(HttpServletRequest request,HttpServletResponse response,Environment environment,ConnectBean conb,String pdname){
		return pihistory_pageQuery(request, response, environment, conb,pdname,null,null);
	}
	public static PageBean pihistory_pageQuery(HttpServletRequest request,HttpServletResponse response,Environment environment,ConnectBean conb,String pdname,String pdversion){
		return pihistory_pageQuery(request, response, environment, conb,pdname,pdversion,null);
	}
	public static PageBean pihistory_pageQuery(HttpServletRequest request,HttpServletResponse response,Environment environment,ConnectBean conb,String pdname,String pdversion,String status){
		ArrayList<bean_pihistory> rows = pihistory_query(environment, conb, pdname, pdversion,status);
		PageBean pb = new PageBean(request, rows);
		return pb;
	}
	
	/**
	 * 子流程开启
	 * @param environment
	 * @param conb
	 * @param pdid
	 * @param wb
	 * @param actors
	 * @return
	 * @throws Exception
	 */
	public static String pi_new_sub(Environment environment,ConnectBean conb,bean_submit submit,String pdid,WFBean wb,WFActorBean actor) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		String piid = new String();
		
    	LogEyeBean log = wdkEnv.startLog(WFFrame.class.getName(),"pi_new_sub");//日志跟踪
		try{
			bean_todo todo = submit.getTodo();
			ArrayList<WFActorBean> actors = new ArrayList<WFActorBean>();
			actors.add(actor);
			//2、初始化流程参与者
			WFNodeBean wnbFirst = wb.getFirstNode();
			wnbFirst.setActors(actors);
			
			//3、发起流程
			isSuccess = wb.getHandler().beforeProcessStart(conb,wb);
			
			if(isSuccess){
				String preid = wb.getVar_taskrecordId();
				String taskrecordId = WDK.getUUID();
				wb.setVar_taskrecordId(taskrecordId);
				wb.setVar_nexttodotitle(submit.getTitle());
				
				piid = WFEngine.pi_new(environment, conb, pdid, wb);
			
				//4、记录流水记录表
				bean_taskrecord tr = new bean_taskrecord();
				tr.setActorid(submit.getActorid());
				tr.setActortype(submit.getActortype());
				tr.setAgenttype(WFConstant.Agenttype_Self);
				tr.setCreateactorid(submit.getActorid());
				tr.setCreateactortype(submit.getActortype());
				tr.setCreatedeptuuid(submit.getDeptuuid());
				tr.setCreatedt(submit.getOperdt());
				tr.setDeptuuid(submit.getDeptuuid());
				tr.setId(taskrecordId);
				tr.setNodename(wb.getStartNode().getNodename());
				tr.setNodepage(todo.getNodepage());
				tr.setNodetitle(todo.getNodetitle());
				tr.setNodetype(todo.getNodetype());
				tr.setOpercomment(submit.getOpercomment());
				tr.setOperdt(submit.getOperdt());
				tr.setOpertype(submit.getOpertype());
				tr.setOriginactorid(submit.getOriginactorid());
				tr.setOriginactortype(submit.getOriginactortype());
				tr.setOrigindeptuuid(submit.getOrigindeptuuid());
				tr.setPdid(pdid);
				tr.setPiid(piid);
				tr.setPreid(preid);
				tr.setSigntype(submit.getSigntype());
				tr.setStatus(WFConstant.Record_Status_Normal);
				tr.setSubtaskid(todo.getSubtaskid());
				tr.setTarget(wnbFirst.getNodename());
				tr.setTargetactorls(actors);
				tr.setTaskcreatedt(todo.getCreatedt());
				tr.setTaskid(todo.getTaskid());
				tr.setTodoid(submit.getTodoid());
				taskrecord_add(environment, conb, tr);
				
	//			bean_taskrecord taskrecord = new bean_taskrecord();
	//			taskrecord.setId(taskrecordId);
	//			taskrecord.setActorid(wb.getCreate_actorid());
	//			taskrecord.setActortype(wb.getCreate_actortype());
	//			taskrecord.setOpercomment("");
	//			taskrecord.setCreateactorid(wb.getCreate_actorid());
	//			taskrecord.setCreateactortype(wb.getCreate_actortype());
	//			taskrecord.setCreatedt(wb.getCreate_dt());
	//			taskrecord.setForwardtype(WFConstant.FORWARDTYPE_Start);
	//			taskrecord.setNodename("开始");
	//			taskrecord.setNodepage("");
	//			taskrecord.setNodetype(WFConstant.NODE_START);
	//			taskrecord.setOperdt(wb.getCreate_dt());
	//			taskrecord.setOriginactorid("");
	//			taskrecord.setOriginactortype("");
	//			taskrecord.setPdid(pdid);
	//			taskrecord.setPiid(piid);
	//			taskrecord.setPreid(preid);
	//			taskrecord.setSigntype("");
	//			taskrecord.setStatus("1");
	//			taskrecord.setSubtaskid("");
	//			taskrecord.setTarget(wnbFirst.getNodename());
	//			taskrecord.setTargetactors(actors);
	//			taskrecord.setTaskcreatedt(wb.getCreate_dt());
	//			taskrecord.setTaskid("");
	//			taskrecord.setTasktype(WFConstant.TASKTYPE_Start);
	//			taskrecord_add(environment, conb, taskrecord);
				
				
				
				wb.getHandler().afterProcessStart(conb, wb);
			}else{
				WFError.beforeProcessStart();
			}
		
		}catch (Exception e) {
			e.printStackTrace();
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		
		//5、返回结果
		return piid;
		
	}
	
	
	
	/**
	 * 流程挂起
	 * @param environment
	 * @param conb
	 * @param piid
	 * @return
	 * @throws Exception 
	 */
	public static boolean pi_suspend(Environment environment,ConnectBean conb,String piid) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pi_suspend");//日志跟踪
		try{
			WFBean wb = wb_queryByPiid(environment, conb, piid);
			isSuccess = wb.getHandler().beforeProcessSuspend(conb,wb);
			if(isSuccess){
				WFEngine.pi_suspend(environment,piid);
				isSuccess = WQL.getWO(WQLNames.UWDKWFTODO).addParam("flag", "501").addParam("piid", piid).process(conb).isSuccess();
				String isenable = WDK.getPropPUB(WDKConstant.PROP_cfg_todo_enable);
				//流程挂起，通知到统一待办库，关闭待办
	            if ("1".equals(isenable)&&isSuccess) {
				   ArrayList<bean_todo> todoList =  todo_query(environment, conb, piid, true);
				   todo_sync_close(conb, todoList, BaseUnitTodo.SUSPEND);
				}
	            wb.getHandler().afterProcessSuspend(conb, wb);
			}else{
				WFError.beforeProcessSuspend(); 
			}
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		return isSuccess;
	}
	
	/**
	 * 流程恢复
	 * @param environment
	 * @param conb
	 * @param pdid
	 * @param piid
	 * @return
	 * @throws Exception 
	 */
	public static boolean pi_resume(Environment environment,ConnectBean conb,String pdid,String piid) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pi_resume");//日志跟踪
		try{
			WFBean wb = wb_queryByPiid(environment, conb, piid);
			isSuccess = wb.getHandler().beforeProcessResume(conb, wb);
			if(isSuccess){
				WFEngine.pi_resume(environment, piid);
				isSuccess = WQL.getWO(WQLNames.UWDKWFTODO).addParam("flag", "502").addParam("piid", piid).process(conb).isSuccess();
				String isenable = WDK.getPropPUB(WDKConstant.PROP_cfg_todo_enable);
	            //流程挂起，通知到统一待办库，关闭待办
	            if ("1".equals(isenable)&&isSuccess) {
	               ArrayList<bean_todo> todoList =  todo_query(environment, conb, piid, true);
	               if(todoList!=null){
	                   todo_sync_add(conb, todoList);
	               }
	            }
				wb.getHandler().afterProcessResume(conb, wb);
			}else{
				WFError.beforeProcessResume();
			}
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		return isSuccess;
	}
	
	/**
	 * 流程实例监控
	 * @param request
	 * @param response
	 * @param environment
	 * @param piid
	 * @throws Exception
	 */
	public static void pi_monitor(HttpServletRequest request,HttpServletResponse response,Environment environment,String piid) throws Exception{
		RepositoryService repositoryService = environment.get(RepositoryService.class);
		ExecutionService executionService = environment.get(ExecutionService.class);
		
		ProcessInstance pi = JBPMUtil.getProcessInstanceById(environment,piid);
		ProcessDefinition processDefinition = JBPMUtil.getProcessDefinitionById(environment,pi.getProcessDefinitionId());
		InputStream is = repositoryService.getResourceAsStream(processDefinition.getDeploymentId(), processDefinition.getImageResourceName());
		BufferedImage image = ImageIO.read(is);
		ProcessInstance processInstance = executionService.findProcessInstanceById(piid);
		if(null!=processInstance){
			Set<String> activityNames = processInstance.findActiveActivityNames();
			for (String activityName : activityNames) {
			    ActivityCoordinates ac = repositoryService.getActivityCoordinates(processInstance.getProcessDefinitionId(), activityName);
			    Graphics g = image.getGraphics();
			    g.setColor(new Color(255, 0, 0));
			    g.drawRect(ac.getX(), ac.getY(), ac.getWidth(), ac.getHeight());
			    g.dispose();
			}
		}
		
		//输出图片
		ByteArrayOutputStream bos =new ByteArrayOutputStream();
		ImageOutputStream ios = ImageIO.createImageOutputStream(bos);
		ImageIO.write(image, "jpg", ios);
		OutputStream os = response.getOutputStream();
		os.write(bos.toByteArray());
	}
	
	/**
	 * 增办，增加办理人
	 * @param environment
	 * @param conb
	 * @param pdid
	 * @param piid
	 * @param nodename
	 * @param nodetype
	 * @param signinsort
	 * @param actors
	 * @param resetStatus			是否重置状态，主要是任务完成进度的状态
	 * @return
	 * @throws Exception
	 */
	public static boolean pi_modify(Environment environment,ConnectBean conb,String piid,String nodename,ArrayList<WFActorBean> newactors,boolean signinsort) throws Exception{
		return pi_modify(environment, conb, piid, nodename, newactors, signinsort,false);
	}	
    
    /**
     * 说明：携带返回值
     *<p>
     * Method pi_modify_return
     * @param environment
     * @param conb
     * @param piid
     * @param nodename
     * @param newactors
     * @param signinsort
     * @param isreset
     * @param replaceSameActor
     * @return
     * @throws Exception
     */
    public static ArrayList<bean_todo> pi_modify_return(Environment environment, ConnectBean conb, String piid, String nodename,
            ArrayList<WFActorBean> newactors, boolean signinsort, boolean isreset) throws Exception {
    	WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		ArrayList<bean_todo> list = null;
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pi_modify_return");//日志跟踪
		try{
	        isSuccess = pi_modify(environment, conb, piid, nodename, newactors, signinsort, isreset);
	        if (isSuccess) {
	            WFBean wb = WFEngine.wb_queryByPiid(environment, conb, piid);
	            WFNodeBean wnb = wb.getNodeBean(nodename);
	            if (wnb != null) {
	            	list = wnb.getTodoBeanList();
	            }
	        }
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
        return list;
    }
	
	/**
	 * 增办，增加办理人
	 * 如果传入的人员和原人员重复，则不新增该人员
	 * @param environment
	 * @param conb
	 * @param piid
	 * @param nodename
	 * @param newactors
	 * @param signinsort
	 * @param isreset
	 * @param replaceSameActor
	 * @return
	 * @throws Exception
	 */
	public static boolean pi_modify(Environment environment,ConnectBean conb,String piid,String nodename,ArrayList<WFActorBean> newactors,boolean signinsort,boolean isreset) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pi_modify");//日志跟踪
		try{
			if(newactors==null || newactors.size()==0) throw new Exception("没有流程参与人，无法增办！");
			
			WFBean wb = wb_queryByPiid(environment, conb, piid);
			String pdid = wb.getPdid();
			WFNodeBean wnb = wb.getNodeBean(nodename);
			Task task = WFEngine.task_queryByNode(environment, piid, nodename);
			
			ArrayList<WFActorBean> actors_old = wnb.getActors();
			if(wnb.isSign()){
				wnb.setSign_signtype(signinsort?"1":"0");
			}
			
			ArrayList<WFActorBean> finalActors = new ArrayList<WFActorBean>();			//增办后最终的所有用户
			ArrayList<WFActorBean> addActors = new ArrayList<WFActorBean>();			//新增的用户
			//ArrayList<WFActorBean> removeActors = new ArrayList<WFActorBean>();		//删除的用户
			//ArrayList<WFActorBean> keepActors = new ArrayList<WFActorBean>();			//保存不变的用户
			
			
			for(Iterator<WFActorBean> it = newactors.iterator();it.hasNext();){
				WFActorBean actor = it.next();
				boolean ishave = false;
				for(Iterator<WFActorBean> it2 = actors_old.iterator();it2.hasNext();){
					WFActorBean actor_old = it2.next();
					if(actor.getActorId().equals(actor_old.getActorId())){
						ishave = true;
					}
				}
				if(!ishave){
					addActors.add(actor);
				}
			}
			
			finalActors.addAll(actors_old);	//添加老用户
			finalActors.addAll(addActors);	//添加新用户
			
			if(wnb.isTask()){			//如果是task节点
				//重新分配节点任务列表
				wnb.setActors(finalActors);
				//启动jbpm的任务
				WFEngine.task_assign(environment, task, finalActors);
				
				//新建新增用户的待办
				for(Iterator<WFActorBean> it = addActors.iterator();it.hasNext();){
					WFActorBean wfab = it.next();
					isSuccess = WFFrame.todo_add(environment, conb,wb,nodename,wfab,task.getId(),"");
					if(isSuccess==false) throw new Exception("生成待办失败，ActorId："+wfab.getActorId()+"，taskid："+task.getId());
				}
				
				//取消所有领取记录
				WQL.getWO(WQLNames.UWDKWFTODO)
					.addParam("flag", "402")
					.addParam("piid", piid)
					.addParam("nodename", nodename)
					.process(conb);
				
			}else if(wnb.isSign()){		//如果是sign节点
				if(wnb.isSignInSort()){
					//如果是顺序会签
					ArrayList<WFActorBean> as = new ArrayList<WFActorBean>();
					int nPos = 0;
					//将已经完成的处理人排列在最前
					for(Iterator<WFActorBean> it = finalActors.iterator();it.hasNext();){
						WFActorBean actor = it.next();
						if(actor.isComplete()){
							actor.setEnable(true);
							as.add(actor);
							nPos++;
						}
					}
					//再将未完成处理的人排在后面
					for(Iterator<WFActorBean> it = finalActors.iterator();it.hasNext();){
						WFActorBean actor = it.next();
						if(!actor.isComplete()){
							as.add(actor);
						}
					}
					//修改会签标志					
					WFActorBean actor = as.get(nPos);
					actor.setEnable(true);
					wnb.setSign_actorspos(nPos);
					wnb.setActors(as);
					
					//删除所有待办
					ArrayList<bean_todo> _todolist = WQL.getWO(WQLNames.QWDKWFTODO)
							 								.addParam("flag", "1").addParam("piid", piid)
							 								.addParam("nodename", nodename)
							 								.addParam("status", "0")
							 								.process(conb)
							 								.getObjects(0, bean_todo.class);
					
					boolean isDelSuccess = WQL.getWO(WQLNames.UWDKWFTODO)
						.addParam("flag", "403")
						.addParam("piid", piid)
						.addParam("nodename", nodename)
						.process(conb).isSuccess();
					if(isDelSuccess &&_todolist!=null&&_todolist.size()>0){
					    todo_sync_close(conb, _todolist, BaseUnitTodo.CANCEL);
					}
					
					//删除所有子任务
					WFEngine.subtask_removeAll(environment, task);					
					
					//新建新增用户的待办及子任务
					Task subTask = ((OpenTask)task).createSubTask();   
					subTask.setAssignee(actor.getActorId());  
					isSuccess = WFFrame.todo_add(environment, conb,wb,nodename,actor,task.getId(),subTask.getId());
					if(isSuccess==false) throw new Exception("生成会签待办失败，ActorId："+actor.getActorId()+"，taskid："+task.getId()+"，subtaskid："+subTask.getId());
				}else{
					//如果是同时会签
					wnb.setSign_actorspos(0);
					wnb.setActors(finalActors);

					//新建新增用户的待办及子任务
					for(Iterator<WFActorBean> it = addActors.iterator();it.hasNext();){
						WFActorBean wfab = it.next();
						Task subTask = ((OpenTask)task).createSubTask();   
						subTask.setAssignee(wfab.getActorId());  
						isSuccess = WFFrame.todo_add(environment, conb,wb,nodename,wfab,task.getId(),subTask.getId());
						if(isSuccess==false) throw new Exception("生成会签待办失败，ActorId："+wfab.getActorId()+"，taskid："+task.getId()+"，subtaskid："+subTask.getId());
					}
				}
			}else if(wnb.isSubprocess()){		//如果是子流程节点
				throw new Exception("子流程节点不支持增办");
			}
			WFEngine.wb_save(environment, conb, pdid, piid, wb);
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		return isSuccess;
	}
	
	
	/**
	 * 流程参与人再分配
	 * 流程参与人整体替换，按新传入的流程参与人重新生成待办，原待办全部作废（逻辑删除），包括已完成的待办，会签结果不被保留。
	 * @param environment
	 * @param conb
	 * @param piid
	 * @param nodename
	 * @param newactors
	 * @param signinsort
	 * @return 返回生成的待办记录
	 * @throws Exception
	 */
	public static ArrayList<bean_todo> pi_reassign_return(Environment environment,ConnectBean conb,String piid,String nodename,ArrayList<WFActorBean> newactors,boolean signinsort) throws Exception {
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		ArrayList<bean_todo> list = null;
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pi_modify_return");//日志跟踪
		try{
	        isSuccess = pi_reassign(environment, conb, piid, nodename, newactors, signinsort);
	        if (isSuccess) {
	            WFBean wb = WFEngine.wb_queryByPiid(environment, conb, piid);
	            WFNodeBean wnb = wb.getNodeBean(nodename);
	            if (wnb != null) {
	            	list = wnb.getTodoBeanList();
	            }
	        }else{
	        	throw new Exception("流程参与人再分配失败");
	        }
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
        return list;
    }
	/**
	 * 流程参与人再分配
	 * 新传入的流程参与人重新生成待办，原待办全部作废（逻辑删除），包括已完成的待办，会签结果不被保留。
	 * 不在新传入的流程参与人的原参与人待办保留，会签结果保留。
	 * @param environment
	 * @param conb
	 * @param piid
	 * @param nodename
	 * @param newactors
	 * @param signinsort
	 * @return
	 * @throws Exception
	 */
	public static boolean pi_reassign(Environment environment,ConnectBean conb,String piid,String nodename,ArrayList<WFActorBean> newactors,boolean signinsort) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"pi_reassign");//日志跟踪
		try{
			//如果传入的流程参与人为空则报错
			if(newactors==null || newactors.size()==0) throw new Exception("没有流程参与人，无法再分配！");
			
			//查询流程变量
			WFBean wb = wb_queryByPiid(environment, conb, piid);
			String pdid = wb.getPdid();
			WFNodeBean wnb = wb.getNodeBean(nodename);
			Task task = WFEngine.task_queryByNode(environment, piid, nodename);
			//查询原流程参与人
			ArrayList<WFActorBean> oldactors = wnb.getActors();
			//处理哪些参与人需要保留，哪些参与人需要删除
			ArrayList<WFActorBean> finalActors = new ArrayList<WFActorBean>();			//重分配后最终的所有用户
			ArrayList<WFActorBean> removeActors = new ArrayList<WFActorBean>();			//删除的用户
			ArrayList<WFActorBean> keepActors = new ArrayList<WFActorBean>();			//保存不变的用户
			for(Iterator<WFActorBean> it = oldactors.iterator();it.hasNext();){
				WFActorBean oldactor = it.next();
				boolean ishave = false;
				for(Iterator<WFActorBean> it2 = newactors.iterator();it2.hasNext();){
					WFActorBean newactor = it2.next();
					if(newactor.getActorId().equals(oldactor.getActorId())){
						ishave = true;
						break;
					}
				}
				if(ishave){
					//新处理人中有，需删除待办
					removeActors.add(oldactor);
				}else{
					//新处理人中没有，需保留待办
					keepActors.add(oldactor);
				}
			}
			finalActors.addAll(keepActors);	//添加新用户中没有的老用户
			finalActors.addAll(newactors);	//添加所有新用户
			
			//处理要删除的待办
			ArrayList<bean_todo> _todolist = new ArrayList<bean_todo>();//需要统一待办删除的待办列表
			for(Iterator<WFActorBean> it = removeActors.iterator();it.hasNext();){
				WFActorBean actor = it.next();
				
				//查询所有当前环节issuspend状态不为9（已删除）的待办
				ArrayList<bean_todo> todos = WQL.getWO(WQLNames.QWDKWFTODO)
												.addParam("flag", "201")
												.addParam("piid", piid)
												.addParam("nodename", nodename)
												.addParam("actorid", actor.getActorId())
												.addParam("issuspend", "0")
												.process(conb)
												.getObjects(0, bean_todo.class);
				
				//将所有待办记录删除
				for(int i=0; i<todos.size(); i++){
					bean_todo todo = todos.get(i);
					//查询相同taskid，subtaskid的其他待办（这些待办可能是委托或转办产生的）
					ArrayList<bean_todo> linktodos = WQL.getWO(WQLNames.QWDKWFTODO)
							.addParam("flag", "201")
							.addParam("piid", piid)
							.addParam("nodename", nodename)
							.addParam("taskid", todo.getTaskid())
							.addParam("subtaskid", todo.getSubtaskid())
							.addParam("issuspend", "0")
							.process(conb)
							.getObjects(0, bean_todo.class);
					
					for(int j=0; j<linktodos.size(); j++){
						bean_todo linktodo = linktodos.get(j);
						
						//执行删除
						isSuccess = WQL.getWO(WQLNames.UWDKWFTODO).addParam("flag", "999").addParam("id", linktodo.getId()).process(conb).isSuccess();
						if(isSuccess==false) throw new Exception("逻辑删除待办失败，待办ID："+linktodo.getId());
						
						//删除处理流程引擎子任务
						if(wnb.isSign()){
							if(WFConstant.TODO_Status_wait.equals(linktodo.getStatus())){
								//未完成的会签待办需要关闭subtask
								try{
									WFEngine.subtask_remove(environment, task, linktodo.getSubtaskid());
								}catch (Exception e) {
									logger.errorWithNoException("关闭subtask["+linktodo.getSubtaskid()+"]异常："+e.getMessage());
								}
							}
						}
						
						//如果待办状态是0则需要同步删除统一待办记录
						if(WFConstant.TODO_Status_wait.equals(linktodo.getStatus())){
							_todolist.add(linktodo);
						}
					}
				}
			}
			
			//执行统一待办删除
			if(_todolist!=null&&_todolist.size()>0){
				todo_sync_close(conb, _todolist, BaseUnitTodo.CANCEL);
			}
			
			//重新生成新待办
			if(wnb.isTask()){			//如果是task节点
				//重新分配节点任务列表
				wnb.setActors(finalActors);
				//启动jbpm的任务
				WFEngine.task_assign(environment, task, finalActors);
				//新建新增用户的待办
				for(Iterator<WFActorBean> it = newactors.iterator();it.hasNext();){
					WFActorBean wfab = it.next();
					isSuccess = WFFrame.todo_add(environment, conb,wb,nodename,wfab,task.getId(),"");
					if(isSuccess==false) throw new Exception("生成待办失败，ActorId："+wfab.getActorId()+"，taskid："+task.getId());
				}
			}else if(wnb.isSign()){		//如果是sign节点
				//设置流程变量-会签类型
				wnb.setSign_signtype(signinsort?"1":"0");
				
				if(wnb.isSignInSort()){
					//如果是顺序会签
					ArrayList<WFActorBean> as = new ArrayList<WFActorBean>();
					int nPos = 0;
					//将已经完成的处理人排列在最前
					for(Iterator<WFActorBean> it = finalActors.iterator();it.hasNext();){
						WFActorBean actor = it.next();
						if(actor.isComplete()){
							actor.setEnable(true);
							as.add(actor);
							nPos++;
						}
					}
					//再将未完成处理的人排在后面
					for(Iterator<WFActorBean> it = finalActors.iterator();it.hasNext();){
						WFActorBean actor = it.next();
						if(!actor.isComplete()){
							as.add(actor);
						}
					}
					//修改会签标志					
					WFActorBean actor = as.get(nPos);
					actor.setEnable(true);
					wnb.setSign_actorspos(nPos);
					wnb.setActors(as);
					
					//删除所有子任务
					WFEngine.subtask_removeAll(environment, task);
					
					//新建新增用户的待办及子任务
					Task subTask = ((OpenTask)task).createSubTask();   
					subTask.setAssignee(actor.getActorId());  
					isSuccess = WFFrame.todo_add(environment, conb,wb,nodename,actor,task.getId(),subTask.getId());
					if(isSuccess==false) throw new Exception("生成会签待办失败，ActorId："+actor.getActorId()+"，taskid："+task.getId()+"，subtaskid："+subTask.getId());
				}else{
					//如果是同时会签，生成所有用户待办
					wnb.setSign_actorspos(0);
					wnb.setActors(finalActors);
					
					//新建所有新用户的待办及子任务
					for(Iterator<WFActorBean> it = newactors.iterator();it.hasNext();){
						WFActorBean wfab = it.next();
						Task subTask = ((OpenTask)task).createSubTask();   
						subTask.setAssignee(wfab.getActorId());  
						isSuccess = WFFrame.todo_add(environment, conb,wb,nodename,wfab,task.getId(),subTask.getId());
						if(isSuccess==false) throw new Exception("生成会签待办失败，ActorId："+wfab.getActorId()+"，taskid："+task.getId()+"，subtaskid："+subTask.getId());
					}
				}
			}else if(wnb.isSubprocess()){		//如果是子流程节点
				throw new Exception("子流程节点不支持流程参与人再分配");
			}
			
			//保存流程变量
			isSuccess = WFEngine.wb_save(environment, conb, pdid, piid, wb);
			if(isSuccess==false) throw new Exception("流程变量保存失败，pdid："+pdid+"，piid："+piid);
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		return isSuccess;
	}
	
	
	/*********************************************
	 * 办理记录
	 *********************************************/

	
	 /**
     * 新增办理记录
     * @param environment
     * @param conb
     * @param taskrecord
     * @return
     * @throws Exception 
     */
    public static boolean taskrecord_add(Environment environment,ConnectBean conb,bean_taskrecord taskrecord) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
    	LogEyeBean log = wdkEnv.startLog(WFFrame.class.getName(),"taskrecord_add"); //日志跟踪
    	try{
    		isSuccess = WQL.getWO(WQLNames.UWDKWFRECORD)
								.addParam("flag", "1")
								.addParamMap(taskrecord.toMap())
								.process(conb)
								.isSuccess();
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		
		return isSuccess;
    }
    
	/**
	 * 读取制定流程的办理记录
	 * @param environment
	 * @param conb
	 * @param pdid
	 * @param piid
	 * @param isAsc		是否降序排列
	 * @return
	 */
    public static ArrayList<bean_taskrecord> taskrecord_query(Environment environment,ConnectBean conb,String piid){
    	return taskrecord_query(environment, conb, piid, false);
    }
	public static ArrayList<bean_taskrecord> taskrecord_query(Environment environment,ConnectBean conb,String piid,boolean isHistory){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		ArrayList<bean_taskrecord> records = new ArrayList<bean_taskrecord>();
		
		LogEyeBean log = wdkEnv.startLog(WFFrame.class.getName(),"taskrecord_query"); //日志跟踪
		try{
			String orderby = "operdt asc";
			JSONArray jrecords = WQL.getWO(WQLNames.QWDKWFRECORD)
									.addParam("flag", isHistory?"6":"1")
									.addParam("piid", piid)
									.addParam("orderby", orderby)
									.process(conb)
									.getResultJSONArray(0);
			if(jrecords.size()>0){
				//构建办理记录列表
				ArrayList<bean_taskrecord> ls = new ArrayList<bean_taskrecord>();
				for(int i=0;i<jrecords.size();i++){
					JSONObject jrecord = jrecords.getJSONObject(i);
					bean_taskrecord taskrecord = new bean_taskrecord(jrecord);
					ls.add(taskrecord);
				}
				
				//初始化每个办理记录对象中的前一办理记录
				for(Iterator<bean_taskrecord> it = ls.iterator();it.hasNext();){
					bean_taskrecord tr = it.next();
					for(Iterator<bean_taskrecord> it2 = ls.iterator();it2.hasNext();){
						bean_taskrecord tr2 = it2.next();
						if(tr2.getId().equals(tr.getPreid())){
							tr.setPretaskrecord(tr2);
							break;
						}
					}
					records.add(tr);
				}
			}
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return records;
	}
	
	
	/**
	 * 删除流水记录
	 * @param environment
	 * @param conb
	 * @param piid
	 * @return
	 */
	public static boolean taskrecord_removeByPiid(Environment environment,ConnectBean conb,String piid){
		boolean isSuccess = WQL.getWO(WQLNames.UWDKWFRECORD)
								.addParam("flag", "5")
								.addParam("piid", piid)
								.process(conb)
								.isSuccess();
		
		return isSuccess;
	}
	/**
	 * 删除流水记录
	 * @param environment
	 * @param conb
	 * @param piid
	 * @return
	 */
	public static boolean taskrecord_removeByPdid(Environment environment,ConnectBean conb,String pdid){
		boolean isSuccess = WQL.getWO(WQLNames.UWDKWFRECORD)
								.addParam("flag", "51")
								.addParam("piid", pdid)
								.process(conb)
								.isSuccess();
		
		return isSuccess;
	}
	
	/**
	 * 删除活动库任务流水记录，插入历史库
	 * @param environment
	 * @param conb
	 * @param piid
	 * @param completedt
	 * @return
	 */
	public static boolean taskrecord_remove_history(Environment environment,ConnectBean conb,String piid,String completedt){
		boolean isSuccess = WQL.getWO(WQLNames.UWDKWFRECORD)
								.addParam("flag", "2")
								.addParam("piid", piid)
								.addParam("completedt", completedt)
								.process(conb)
								.isSuccess();
		
		return isSuccess;
	}
	
	   /**
     * 删除历史库任务流水记录，插入活动库
     * @param environment
     * @param conb
     * @param piid
     * @param completedt
     * @return
     */
    public static boolean taskrecord_recover_history(Environment environment,ConnectBean conb,String piid){
        boolean isSuccess = WQL.getWO(WQLNames.UWDKWFRECORD)
                                .addParam("flag", "202")
                                .addParam("piid", piid)
                                .process(conb)
                                .isSuccess();
        
        return isSuccess;
    }
	
//	/**
//	 * 设置流水记录为被追回
//	 * @param environment
//	 * @param conb
//	 * @param taskRecordId
//	 * @return
//	 */
//	private static boolean taskrecord_setRecover(Environment environment,ConnectBean conb,String taskRecordId){
//		boolean isSuccess = WQL.getWO("UWDKWF2001")
//								.addParam("flag", "3")
//								.addParam("id", taskRecordId)
//								.addParam("status", "2")
//								.process(conb)
//								.isSuccess();
//		return isSuccess;
//	}
//	
//	/**
//	 * 操作流水复制
//	 * @param environment
//	 * @param conb
//	 * @param oldpiid
//	 * @param newpiid
//	 * @return
//	 */
//	private static String taskrecord_copy(Environment environment,ConnectBean conb,String oldpiid,String newpdid,String newpiid){
//		JSONObject jrow = WQL.getWO("UWDKWF2001")
//								.addParam("flag", "6")
//								.addParam("newpdid", newpdid)
//								.addParam("oldpiid", oldpiid)
//								.addParam("newpiid", newpiid)
//								.process(conb)
//								.uniqueResult(0);
//		String taskrecordid = jrow.has("taskrecordid")?jrow.getString("taskrecordid"):"";
//		return taskrecordid;
//	}
	
	
	/*********************************************
	 * 待办列表
	 *********************************************/
	/**
	 * 读取制定流程的办理记录
	 * @param environment
	 * @param conb
	 * @param pdid
	 * @param piid
	 * @param isAsc		是否降序排列
	 * @return
	 */
    public static ArrayList<bean_todo> todo_query(Environment environment,ConnectBean conb,String piid){
    	return todo_query(environment, conb, piid, false,false);
    }
    public static ArrayList<bean_todo> todo_query(Environment environment,ConnectBean conb,String piid,boolean isSuspend){
        return todo_query(environment, conb, piid, false,isSuspend);
    }
    public static ArrayList<bean_todo> todo_query(Environment environment,ConnectBean conb,String piid,boolean isHistory,boolean isSuspend){
        return todo_query(environment, conb, piid, isHistory, isSuspend, null);
    }
    
	public static ArrayList<bean_todo> todo_query(Environment environment,ConnectBean conb,String piid,boolean isHistory,boolean isSuspend,String orderBy){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		ArrayList<bean_todo> todos = new ArrayList<bean_todo>();
		
		LogEyeBean log = wdkEnv.startLog(WFFrame.class.getName(),"todo_query"); //日志跟踪
		try{
	        String orderby = "operdt asc";
	        if (orderBy != null && orderBy.trim().length() > 0) {
	            orderby = orderBy;
	        }
			WO wo = WQL.getWO(WQLNames.QWDKWFTODO).addParam("flag", isHistory ? "202" : "201").addParam("piid", piid);
	        if (!isSuspend) {
	            wo.addParam("issuspend", "0");
	        }
	        JSONArray jrecords = wo.addParam("orderby", orderby).process(conb).getResultJSONArray(0);
			
			if(jrecords.size()>0){
				//构建办理记录列表
				ArrayList<bean_todo> ls = new ArrayList<bean_todo>();
				for(int i=0;i<jrecords.size();i++){
					JSONObject jtodo = jrecords.getJSONObject(i);
					bean_todo todo = new bean_todo(jtodo);
					ls.add(todo);
				}
				
				//初始化每个办理记录对象中的前一办理记录
				for(Iterator<bean_todo> it = ls.iterator();it.hasNext();){
					bean_todo todo = it.next();
					for(Iterator<bean_todo> it2 = ls.iterator();it2.hasNext();){
						bean_todo todo2 = it2.next();
						if(todo2.getId().equals(todo.getPretodoid())){
							todo.setParam_pretodo(todo2);
							break;
						}
					}
					todos.add(todo);
				}
			}
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return todos;
	}
	
	/**
	 * 构建一个新的bean_todo对象
	 * @param environment
	 * @param conb
	 * @param wb
	 * @param nodename
	 * @param actor 代办办理者
	 * @param deputeactor 被委托人，如果不为空则表示该待办为委托待办
	 * @param depute 委托配置
	 * @param taskid
	 * @param subtaskid
	 * @param agenttype
	 * @return
	 */
	public static bean_todo todo_new(Environment environment,ConnectBean conb,WFBean wb,String nodename,WFActorBean actor,WFActorBean deputeactor,bean_depute depute,String taskid,String subtaskid){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		bean_todo todo = new bean_todo();
		
		LogEyeBean log = wdkEnv.startLog(WFFrame.class.getName(),"todo_new"); //日志跟踪
		try{
			WFActorBean curractor = null;  //办理者
			WFActorBean originactor = null;//原始办理
			String agenttype = "";			//代理类型
			if(deputeactor!=null && depute!=null){
				//委托待办
				curractor = deputeactor;
				originactor = actor;
				agenttype = WFConstant.Agenttype_Depute;
			}else{
				//正常待办
				curractor = actor;
				agenttype = WFConstant.Agenttype_Self;
			}
			
			todo.setApp_uuid(WDK.getPropPUB(WDKConstant.PROP_cfg_sys_appuuid));
			todo.setTodosort(wb.getTodoSort());
			Date d = new Date(); 
			WFNodeBean wnb = wb.getNodeBean(nodename);
			
			todo.setActorid(curractor.getActorId());			//办理者id
			todo.setActortype(curractor.getActorType());		//办理者类型（待办里面只能是人）
			todo.setDeptuuid(curractor.getDeptuuid());			//办理者部门
			
			todo.setAgenttype(agenttype);	//代理类型：空-自己操作   depute-委托代理    assign-交办代理		
			
			if(!"".equals(wnb.getDeadline())){
				String limitdt = WFOverdueBean.getTargetDate(wnb.getCalendar(),d , wnb.getDeadline());
				todo.setLimitdt(limitdt);
				todo.setLimittime(wnb.getDeadline());
			}			
			
	        ArrayList<WFActorBean> actors = wnb.getActors();
	        if (wnb.isFirst() && (actors == null || actors.size() == 0)) {
	            // 第一个环节，谁启动，就分配给谁
	        	// 就算有委托也直接分配给流程发起者
	            todo.setLockactorid(actor.getActorId());	//任务领取人
	            todo.setLockactortype(actor.getActorType());//任务领取人类型
	            todo.setLockdeptuuid(actor.getDeptuuid());	//任务领取人部门
	            todo.setLockdt(WDK.getDateTime());			//任务领取时间
	            
	        } else {
	            todo.setLockactorid("");					//任务领取人
	            todo.setLockactortype("");					//任务领取人类型
	            todo.setLockdeptuuid("");					//任务领取人部门
	            todo.setLockdt("");							//任务领取时间
	        }
			todo.setNodename(nodename);						//当前处理节点名称
			todo.setNodepage(wnb.getNodepage());			//节点对应页面
			todo.setNodetitle(wnb.getNodetitle());			//环节标题
			todo.setNodetype(wnb.getNodetype());			//当前节点类型
			todo.setOpercomment("");						//办理意见
			todo.setOperdt("");								//办理时间
			todo.setOpertype("");							//操作类型 送达、特送、退回、阅办
			
			todo.setOriginactorid(originactor==null?"":originactor.getActorId());						//原始办理者id
			todo.setOriginactortype(originactor==null?"":originactor.getActorType());					//原始办理者类型
			todo.setOrigindeptuuid(originactor==null?"":originactor.getDeptuuid());						//原始办理者部门
			
			todo.setOverduetime("0");						//超期时间
			todo.setPdid(wb.getPdid());						//流程模板ID
			todo.setPiid(wb.getPiid());						//流程实例ID
			String pretodoid = wb.getVar_pretodoid();
			if(null==pretodoid){
				pretodoid = "";
			}
			String senddt = wb.getVar_senddt();
			if(null==senddt){
				senddt = "";
			}
			
			String sendactorid = "";
			String sendactortype = "";
			String senddeptuuid = "";
			
			//如果是委托
			if(!WFConstant.Agenttype_Self.equals(wb.getVar_agenttype())){
				if("1".equals(wb.getVar_isdeputesign())){
					//如果是授权签名，则使用被委托人
					sendactorid = wb.getVar_sendactorid();
					sendactortype = wb.getVar_sendactortype();
					senddeptuuid = wb.getVar_senddeptuuid();
				}else{
					//如果不授权签名，则使用委托人
					sendactorid = wb.getVar_originactorid();
					sendactortype = wb.getVar_originactortype();
					senddeptuuid = wb.getVar_origindeptuuid();
				}
			}else{
			    sendactorid = wb.getVar_sendactorid();
	            sendactortype = wb.getVar_sendactortype();
	            senddeptuuid = wb.getVar_senddeptuuid();
			}
			
			todo.setPretodoid(pretodoid);					//前一待办记录
			todo.setSendactorid(sendactorid);				//待办发送人
			todo.setSendactortype(sendactortype);			//待办发送人类型
			todo.setSenddeptuuid(senddeptuuid);				//待办发送人部门
			todo.setSenddt(senddt);							//待办发送时间
			todo.setSigntype(wnb.getSign_signtype());		//会签类型 仅当nodetype=sign时有效，0-同时会签，1-顺序会签
			todo.setStatus(WFConstant.TODO_Status_wait);	//状态
			todo.setTaskid(taskid);
			todo.setTodotype(WFConstant.TODO_Type_Normal);	//待办类型 0-正常待办  1-转办后的待办  2-交办后的待办 3-抄送后的待办
			todo.setSubtaskid(subtaskid);
			String title = wb.getVar_nexttodotitle();
			//start:支持每个待办的标题，可以按人实现差异化 
	        String curractorTitle = curractor.getTitle();
	        if (curractorTitle != null && curractorTitle.trim().length() > 0) {
	            title = curractorTitle;
	        }
	        //end
			todo.setTitle(title);							//待办标题
			String unitid = wb.getVar_unitid();
			todo.setUnitid(unitid);							//转办ID 
			//如果是委托待办则需要设置委托流水ID
			if(WFConstant.Agenttype_Depute.equals(todo.getAgenttype())){
				todo.setDepute_id(depute==null?"":depute.getId());			//委托流水ID
			}else{
				todo.setDepute_id("");
			}
			
			if(!"".equals(wnb.getDeadline().trim())){
				if(!"".equals(wnb.getWarnyellow())){
					int iwy = WDK.parseInt(wnb.getDeadline()) - WDK.parseInt(wnb.getWarnyellow());
					String warnyellowdt = WFOverdueBean.getTargetDate(wnb.getCalendar(),d , Integer.toString(iwy));
					todo.setWarnyellowdt(warnyellowdt);
					todo.setWarnyellowtime(Integer.toString(iwy));
				}
				if(!"".equals(wnb.getWarnred())){
					int iwr = WDK.parseInt(wnb.getDeadline()) - WDK.parseInt(wnb.getWarnred());
					String warnreddt = WFOverdueBean.getTargetDate(wnb.getCalendar(),d , Integer.toString(iwr));
					todo.setWarnreddt(warnreddt);
					todo.setWarnredtime(Integer.toString(iwr));
				}
			}
			
			todo.setCreatedt(WDK.getDateTime(d));
			Object isUnitTodo = wnb.getVariable(WFConstant.VARIABLE_IsUnitTodo);
	        if (isUnitTodo != null) {
	            String strval = String.valueOf(isUnitTodo);
	            if ("0".equals(strval)) {
	                todo.setParam_issynctodo(false);// 默认是同步，只要设置为0，代表不同步
	            }
	        }
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log, isSuccess, msg);
		}
		return todo;
	}
	/**
	 * 新增待办记录
	 * @param environment
	 * @param conb
	 * @param wb
	 * @param nodename
	 * @param actor
	 * @param taskid
	 * @param subtaskid
	 * @param agenttype
	 * @return
	 */
	public static boolean todo_add(Environment environment,ConnectBean conb,WFBean wb,String nodename,WFActorBean actor,String taskid,String subtaskid){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"todo_add(taskid)");//日志跟踪
		try{
			ArrayList<bean_todo> todolist = new ArrayList<bean_todo>();			//代办列表
			ArrayList<bean_depute> deputelist = new ArrayList<bean_depute>();	//委托列表
			HashSet<String> deputeset = new HashSet<String>();					//已产生待办人员ID列表
			//0、首先创建当前办理人的待办
			bean_todo currenttodo = todo_new(environment, conb, wb, nodename, actor, null,null ,taskid, subtaskid);
            WFNodeBean nodeBean = wb.getNodeBean(nodename);
            if (nodeBean != null) {
                nodeBean.addTodoBean(currenttodo);
            }
			todolist.add(currenttodo);
			deputeset.add(actor.getActorId());//将当前办理人ID记录到已产生待办人员ID列表中，避免发生自己给自己设置委托的情况发生。
			
			//考虑委托的情况
			//1、根据当前办理人员ID，同时根据委托表的委托情况，看当前人是否有委托
			//1.1、查询当前处理人设置过的当前有效委托记录
			WO wo = WQL.getWO(WQLNames.QWDKWFDEPUTE);
			deputelist = wo.addParam("flag", "1")
						   .addParam("actorid", actor.getActorId())
						   .addParam("status", "1")
						   .addParam("querydt", WDK.getDateTimeByFormat("yyyyMMddHHmmss"))
						   .addParam("orderby", "createdt desc")
						   .process(conb).getObjects(0, bean_depute.class);
			
			//1.2、循环委托记录，产生委托代办（需要过滤重复的委托）
			for(int i=0;i<deputelist.size();i++){
				boolean needdepute = false;//是否需要委托
				bean_depute depute = deputelist.get(i);
				//判断是否需要委托
				if(WFConstant.DEPUTETYPE_PERSON.equals(depute.getDeputetype())){
					//按人委托
					needdepute = true;
				}else if(WFConstant.DEPUTETYPE_WORWFLOW.equals(depute.getDeputetype())){
					//流程委托
					if(depute.getPdname().equals(wb.getPdname())){
						//委托的流程模板名称和当前流程模板名称一致
						needdepute = true;
					}
				}else if(WFConstant.DEPUTETYPE_NODE.equals(depute.getDeputetype())){
					//环节委托
					if(depute.getPdname().equals(wb.getPdname())){
						String[] nodes = depute.getNodenames().split(",");
						for(int j=0;j<nodes.length;j++){
							if(nodename.equals(nodes[j])){
								needdepute = true;
								break;
							}
						}
					}
				}else{
					logger.debug("无效的委托方式："+depute.getDeputetype());
				}
				
				//判断是否需要且未产生委托记录
				if(needdepute && !deputeset.contains(depute.getDeputeactorid())){
					WFActorBean actor2 = new WFActorBean(depute.getDeputeactorid(), "user", depute.getDeputedeptuuid());
					bean_todo todo = todo_new(environment, conb, wb, nodename,actor, actor2,depute, taskid, subtaskid);
					todolist.add(todo);
					
					deputeset.add(depute.getDeputeactorid());
				}
			}
			
			//1.3、循环保存代办记录
			
			for(int i=0;i<todolist.size();i++){
				bean_todo todo = todolist.get(i);
				isSuccess = todo_add(environment, conb, todo, (wb.getVariables().containsKey("unittodopushtype")?(String)wb.getVariables().get("unittodopushtype"):""));
				
				if(isSuccess==false){
					break;//如果保存失败则跳出循环
				}
			}
		}catch (Exception e) {
			logger.errorWithNoException("新增待办记录异常："+e.getMessage());
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog( log, isSuccess, msg);//日志跟踪
		}
		return isSuccess;
		//bean_todo todo = todo_new(environment, conb, wb, nodename, actor, taskid, subtaskid);
		//return todo_add(environment, conb, todo);
	}
	
	public static boolean todo_add(Environment environment,ConnectBean conb,bean_todo todo ){
		return todo_add(environment, conb, todo, "");
	}
	
	public static boolean todo_add(Environment environment,ConnectBean conb,bean_todo todo,String synctype ){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		LogEyeBean log = wdkEnv.startLog(WFFrame.class.getName(), "todo_add");//日志跟踪
		try{
			isSuccess = WQL.getWO(WQLNames.UWDKWFTODO)
									.addParam("flag", "1")
									.addParamMap(todo.toMap())
									.process(conb)
									.isSuccess();
	        if (isSuccess) {
	            String isenable = WDK.getPropPUB(WDKConstant.PROP_cfg_todo_enable);
	            if ("1".equals(isenable) && todo.isParam_issynctodo()) {
	                // 需要同步到统一待办库的话，则进行同步
	                // 异步（同步）方式由具体业务代码类决定
	                todo_sync_add(conb, todo, synctype);
	            }
	        }
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//日志跟踪
		}
		return isSuccess;
	}
	
	/**
	 * 根据流程实例删除关联的待办信息
	 * @param environment
	 * @param conb
	 * @param piid
	 * @return
	 */
	public static boolean todo_removeByPiid(Environment environment,ConnectBean conb,String piid){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		LogEyeBean log = wdkEnv.startLog(WFFrame.class.getName(), "todo_removeByPiid");//日志跟踪
		try{
		    String isenable = WDK.getPropPUB(WDKConstant.PROP_cfg_todo_enable);
	        //流程挂起，通知到统一待办库，关闭待办
		    ArrayList<bean_todo> todoList = new ArrayList<bean_todo>();
	        if ("1".equals(isenable)) {
	           todoList =  todo_query(environment, conb, piid, true);
	        }
			isSuccess = WQL.getWO(WQLNames.UWDKWFTODO)
									.addParam("flag", "4")
									.addParam("piid", piid)
									.process(conb)
									.isSuccess();
			//删除成功就需要更新到统一待办库
	        if (isSuccess && "1".equals(isenable)) {
	            todo_sync_close(conb, todoList, BaseUnitTodo.CANCEL);
	        }
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//日志跟踪
		}
		return isSuccess;
	}
	/**
	 * 根据流程实例删除关联的待办信息
	 * @param environment
	 * @param conb
	 * @param piid
	 * @return
	 */
	public static boolean todo_removeByPdid(Environment environment,ConnectBean conb,String pdid){
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		LogEyeBean log = wdkEnv.startLog(WFFrame.class.getName(), "todo_removeByPdid");//日志跟踪
		try{
		    String isenable = WDK.getPropPUB(WDKConstant.PROP_cfg_todo_enable);
	        //流程挂起，通知到统一待办库，关闭待办
	        ArrayList<bean_todo> todoList = new ArrayList<bean_todo>();
	        if ("1".equals(isenable)) {
	            WO wo = WQL.getWO(WQLNames.QWDKWFTODO).addParam("flag", "201").addParam("pdid", pdid);
	            JSONArray jrecords = wo.process(conb).getResultJSONArray(0);
	            if(jrecords.size()>0){
	                //构建办理记录列表
	                ArrayList<bean_todo> ls = new ArrayList<bean_todo>();
	                for(int i=0;i<jrecords.size();i++){
	                    JSONObject jtodo = jrecords.getJSONObject(i);
	                    bean_todo todo = new bean_todo(jtodo);
	                    ls.add(todo);
	                }
	                //初始化每个办理记录对象中的前一办理记录
	                for(Iterator<bean_todo> it = ls.iterator();it.hasNext();){
	                    bean_todo todo = it.next();
	                    for(Iterator<bean_todo> it2 = ls.iterator();it2.hasNext();){
	                        bean_todo todo2 = it2.next();
	                        if(todo2.getId().equals(todo.getPretodoid())){
	                            todo.setParam_pretodo(todo2);
	                            break;
	                        }
	                    }
	                    todoList.add(todo);
	                }
	            }
	        }
			isSuccess = WQL.getWO(WQLNames.UWDKWFTODO)
									.addParam("flag", "41")
									.addParam("pdid", pdid)
									.process(conb)
									.isSuccess();
			//删除成功就更新到统一待办库
			if (isSuccess && "1".equals(isenable)) {
	            todo_sync_close(conb, todoList, BaseUnitTodo.CANCEL);
	        }
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//日志跟踪
		}
		return isSuccess;
	}
	/**
	 * 结束流程，将待办记录移动到历史库
	 * @param environment
	 * @param conb
	 * @param piid
	 * @param completedt
	 * @return
	 */
	public static boolean todo_remove_history(Environment environment,ConnectBean conb,String piid,String completedt){
		boolean isSuccess = WQL.getWO(WQLNames.UWDKWFTODO)
								.addParam("flag", "201")
								.addParam("piid", piid)
								.addParam("completedt", completedt)
								.process(conb)
								.isSuccess();
		return isSuccess;
	}
	
	   /**
     * 恢复流程，将待办历史记录移动到待办库
     * @param environment
     * @param conb
     * @param piid
     * @param completedt
     * @return
     */
    public static boolean todo_recover_history(Environment environment, ConnectBean conb, String piid) {
        boolean isSuccess = WQL.getWO(WQLNames.UWDKWFTODO).addParam("flag", "202").addParam("piid", piid).process(conb).isSuccess();
        return isSuccess;
    }
	
	/**
	 * 领取
	 * @param environment
	 * @param conb
	 * @param todoid
	 * @param wfab
	 * @return
	 * @throws Exception
	 */
	public static boolean todo_get(Environment environment,ConnectBean conb,String todoid,WFActorBean actor,WFActorBean originactor,String agenttype,String isdeputesign) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		LogEyeBean log = wdkEnv.startLog(WFFrame.class.getName(), "todo_get");//日志跟踪
		try{
			String dt = WDK.getDateTime();
			String lockactorid = actor.getActorId();
			String lockactortype = actor.getActorType();
			String lockdeptuuid = actor.getDeptuuid();
			if(!WFConstant.Agenttype_Self.equals(agenttype)
				&&null!=originactor){
				//如果是委托
				if("1".equals(isdeputesign)){
				//如果允许授权签名，则由当前人签名
					
				}else{
					lockactorid = originactor.getActorId();
					lockactortype = originactor.getActorType();
					lockdeptuuid = originactor.getDeptuuid();
				}
				
			}
			isSuccess = WQL.getWO(WQLNames.UWDKWFTODO)
									.addParam("flag", "101")
									.addParam("id", todoid)
									.addParam("lockactorid", lockactorid)
									.addParam("lockactortype", lockactortype)
									.addParam("lockdeptuuid", lockdeptuuid)
									.addParam("lockdt", dt)
									.process(conb)
									.isSuccess();
			
			
			
			
			bean_todo todo = (bean_todo) WQL.getWO(WQLNames.QWDKWFTODO)
											.addParam("flag", "1")
											.addParam("id", todoid)
											.process(conb)
											.getObject(0, bean_todo.class);
			
			ArrayList<bean_todo> todos = WQL.getWO(WQLNames.QWDKWFTODO)
											.addParam("flag", "1")
											.addParam("taskid", todo.getTaskid())
											.addParam("subtaskid", todo.getSubtaskid())
											.process(conb)
											.getObjects(0, bean_todo.class);
				
			
			if(isSuccess){
	            //领取成功，针对统一待办来说，是先关闭待签数据，再插入待办数据
				todo_sync_close(conb, todos, BaseUnitTodo.BEGET);
	            todo_sync_add(conb, todo);
	        }
			//添加流水记录
			//4、记录流水记录表
			WFBean wb = wb_queryByPiid(environment, conb, todo.getPiid());
			String taskrecordId = WDK.getUUID();
			bean_taskrecord tr = new bean_taskrecord();
			tr.setActorid(actor.getActorId());
			tr.setActortype(actor.getActorType());
			tr.setAgenttype(agenttype);
			tr.setCreateactorid(wb.getCreate_actorid());
			tr.setCreateactortype(wb.getCreate_actortype());
			tr.setCreatedeptuuid(wb.getCreate_deptuuid());
			tr.setCreatedt(dt);
			tr.setDeptuuid(actor.getDeptuuid());
			tr.setId(taskrecordId);
			tr.setNodename(todo.getNodename());
			tr.setNodepage(todo.getNodepage());
			tr.setNodetitle(todo.getNodetitle());
			tr.setNodetype(todo.getNodetype());
			tr.setOpercomment("");
			tr.setOperdt(dt);
			tr.setOpertype(WFConstant.Opertype_Get);
			tr.setOriginactorid(originactor.getActorId());
			tr.setOriginactortype(originactor.getActorType());
			tr.setOrigindeptuuid(originactor.getDeptuuid());
			tr.setPdid(todo.getPdid());
			tr.setPiid(todo.getPiid());
			tr.setPreid(wb.getVar_taskrecordId());
			tr.setSigntype(todo.getSigntype());
			tr.setStatus(WFConstant.Record_Status_Normal);
			tr.setSubtaskid(todo.getSubtaskid());
			tr.setTarget("");
			tr.setTargetactorls(null);
			tr.setTaskcreatedt(todo.getCreatedt());
			tr.setTaskid(todo.getTaskid());
			tr.setTodoid(todoid);
	
			taskrecord_add(environment, conb, tr);
			
			wb.setVar_taskrecordId(taskrecordId);
			wb_save(environment, conb, wb);
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//日志跟踪
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		return isSuccess;
	}
	
	/**
	 * 领退
	 * @param environment
	 * @param conb
	 * @param todoid
	 * @param wfab
	 * @return
	 * @throws Exception
	 */
	public static boolean todo_return(Environment environment,ConnectBean conb,String todoid,WFActorBean actor,WFActorBean originactor,String agenttype,String isdeputesign) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		LogEyeBean log = wdkEnv.startLog(WFFrame.class.getName(), "todo_return");//日志跟踪
		try{
			String dt = WDK.getDateTime();
			//首先领退该任务
			isSuccess = WQL.getWO(WQLNames.UWDKWFTODO)
									.addParam("flag", "102")
									.addParam("id", todoid)
									.addParam("lockactorid", "")
									.addParam("lockactortype", "")
									.addParam("lockdeptuuid", "")
									.addParam("lockdt", dt)
									.process(conb)
									.isSuccess();
			
			bean_todo todo = (bean_todo) WQL.getWO(WQLNames.QWDKWFTODO)
											.addParam("flag", "1")
											.addParam("id", todoid)
											.process(conb)
											.getObject(0, bean_todo.class);
			
			ArrayList<bean_todo> todos = WQL.getWO(WQLNames.QWDKWFTODO)
											.addParam("flag", "1")
											.addParam("taskid", todo.getTaskid())
											.addParam("subtaskid", todo.getSubtaskid())
											.process(conb)
											.getObjects(0, bean_todo.class);
			
			if(isSuccess){
			    //关闭待办
			    todo_sync_close(conb, todo, BaseUnitTodo.CANCEL);//领退:关闭方式为取消是否合适
			    //插入待签
			    todo_sync_add(conb, todos);
			}
			//添加流水记录
			//4、记录流水记录表
			WFBean wb = wb_queryByPiid(environment, conb, todo.getPiid());
			String taskrecordId = WDK.getUUID();
			bean_taskrecord tr = new bean_taskrecord();
			tr.setActorid(actor.getActorId());
			tr.setActortype(actor.getActorType());
			tr.setAgenttype(agenttype);
			tr.setCreateactorid(wb.getCreate_actorid());
			tr.setCreateactortype(wb.getCreate_actortype());
			tr.setCreatedeptuuid(wb.getCreate_deptuuid());
			tr.setCreatedt(dt);
			tr.setDeptuuid(actor.getDeptuuid());
			tr.setId(taskrecordId);
			tr.setNodename(todo.getNodename());
			tr.setNodepage(todo.getNodepage());
			tr.setNodetitle(todo.getNodetitle());
			tr.setNodetype(todo.getNodetype());
			tr.setOpercomment("");
			tr.setOperdt(dt);
			tr.setOpertype(WFConstant.Opertype_Return);
			tr.setOriginactorid(originactor.getActorId());
			tr.setOriginactortype(originactor.getActorType());
			tr.setOrigindeptuuid(originactor.getDeptuuid());
			tr.setPdid(todo.getPdid());
			tr.setPiid(todo.getPiid());
			tr.setPreid(wb.getVar_taskrecordId());
			tr.setSigntype(todo.getSigntype());
			tr.setStatus(WFConstant.Record_Status_Normal);
			tr.setSubtaskid(todo.getSubtaskid());
			tr.setTarget("");
			tr.setTargetactorls(null);
			tr.setTaskcreatedt(todo.getCreatedt());
			tr.setTaskid(todo.getTaskid());
			tr.setTodoid(todoid);
	
			taskrecord_add(environment, conb, tr);
			wb.setVar_taskrecordId(taskrecordId);
			wb_save(environment, conb, wb);
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//日志跟踪
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		return isSuccess;
	}
	
	/**
	 * 确认是否允许追回
	 * @param environment
	 * @param conb
	 * @param todoid
	 * @return
	 * @throws Exception
	 */
	public static boolean todo_recover_check(Environment environment,ConnectBean conb,String todoid) throws Exception{
		boolean isSuccess = true;
		//1、根据todo查找下一个todo
		ArrayList<bean_todo> nexttodos = WQL.getWO(WQLNames.QWDKWFTODO)
											.addParam("flag", "201")
											.addParam("pretodoid",todoid)
											.process(conb)
											.getObjects(0, bean_todo.class);
		
		//2、判断下一个todo是否为被领取
		if(nexttodos.size()>0){
			boolean sl = true;
			bean_todo nexttodo = null;
			//如果当前环节未被办理，同时未被任何人领取(包含会签环节)
			for(int i=0;i<nexttodos.size();i++){
				nexttodo = nexttodos.get(i);
				if(WFConstant.TODO_Status_wait.equalsIgnoreCase(nexttodo.getStatus()) && "".equals(nexttodo.getLockactorid())){
					sl = ( sl & true );
				}else{
					sl = ( sl & false );
				}
			}
			//如果当前环节未被办理，同时未被任何人领取
			if(sl){
				isSuccess = true;
			}
		}
		
		return isSuccess;
	}
	
	private static void todo_sync_close(ConnectBean conb, bean_todo todo, String closeType) {
	    List<bean_todo> _todoList = new ArrayList<bean_todo>();
	    _todoList.add(todo);
	    todo_sync_close(conb, _todoList, closeType);
	}

	private static void todo_sync_close(ConnectBean conb, List<bean_todo> todoList, String closeType) {
		todo_sync_close(conb,todoList,closeType,"");
	}
	
    private static void todo_sync_close(ConnectBean conb, List<bean_todo> todoList, String closeType, String synctype) {
    	WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	boolean isSuccess = true;
    	String msg = "";
    	String pushtype;
    	if(!"".equals(synctype)){
    		pushtype=synctype;
    	}else if(!"".equals(WDK.getNodeParam("todo_server_pushtype"))){
    		pushtype=WDK.getNodeParam("todo_server_pushtype"); //从node.xml配置获取
    	}else{
    		pushtype=BaseUnitTodo.PUSGTYPE_ASYN; //默认统一待办推送方式用异步，asyn-异步、sync-同步
    	}
    	/**
    	 * pushtype 如果上面取为空设为同步处理
    	 */
    	if(StringUtil.isBlank(pushtype)){
    		pushtype=BaseUnitTodo.PUSGTYPE_SYNC;
    	}
    	LogEyeBean log = wdkEnv.startLog(WFFrame.class.getName(), "todo_sync_close");//日志跟踪
    	try{
	    	//同步推送统一待办（统一待办调用又采用webservices）时有可能造成事务不一致的问题，所以推送统一待办改为在流程引擎事务提交后再做统一待办的推送
	    	UnitTodoCloseTransHandler uH = new UnitTodoCloseTransHandler();
	    	uH.closeTodo(todoList, closeType, pushtype);
	    	WDKContext ctx = wdkEnv.getWDKContext();
	    	if(ctx!=null){
	    		ctx.addTransHandler(uH);
	    	}
    	}catch (Exception e) {
    		isSuccess = false;
    		msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//日志跟踪
		}
    }
	

    private static void todo_sync_add(ConnectBean conb, bean_todo newtodo) {
    	todo_sync_add(conb, newtodo, "");
    }
    
    private static void todo_sync_add(ConnectBean conb, bean_todo newtodo,String synctype) {
        ArrayList<bean_todo> newtodos = new ArrayList<bean_todo>();
        newtodos.add(newtodo);
        todo_sync_add(conb, newtodos, synctype);
    }
    
    private static void todo_sync_add(ConnectBean conb, List<bean_todo> newtodos) {
    	todo_sync_add(conb, newtodos,"");
    }

    private static void todo_sync_add(ConnectBean conb,final List<bean_todo> newtodos, final String synctype) {
    	WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	boolean isSuccess = true;
    	String msg = "";
    	String pushtype;
    	if(!"".equals(synctype)){
    		pushtype=synctype;
    	}else if(!"".equals(WDK.getNodeParam("todo_server_pushtype"))){
    		pushtype=WDK.getNodeParam("todo_server_pushtype"); //从node.xml配置获取
    	}else{
    		pushtype=BaseUnitTodo.PUSGTYPE_ASYN; //默认统一待办推送方式用异步，asyn-异步、sync-同步
    	}
    	/**
    	 * pushtype 如果上面取为空设为同步处理
    	 */
    	if(StringUtil.isBlank(pushtype)){
    		pushtype=BaseUnitTodo.PUSGTYPE_SYNC;
    	}
    	LogEyeBean log = wdkEnv.startLog(WFFrame.class.getName(), "todo_sync_add");//日志跟踪
    	try{
    		//同步推送统一待办（统一待办调用又采用webservices）时有可能造成事务不一致的问题，所以推送统一待办改为在流程引擎事务提交后再做统一待办的推送
	    	UnitTodoAddTransHandler uH = new UnitTodoAddTransHandler();
	    	uH.addTodo(newtodos, pushtype);
	    	WDKContext ctx = wdkEnv.getWDKContext();
	    	if(ctx!=null){
	    		ctx.addTransHandler(uH);
	    	}
    	}catch (Exception e) {
    		isSuccess = false;
    		msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//日志跟踪
		}
    }
	
	/**
	 * 追回
	 * @param environment
	 * @param conb
	 * @param todoid
	 * @return
	 * @throws Exception
	 */
	public static boolean todo_recover(Environment environment,ConnectBean conb,String todoid,WFActorBean actor,WFActorBean originactor,String agenttype,String isdeputesign,String operdt,String opercomment) throws Exception{
    	WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	boolean isSuccess = true;
    	String msg = "";
    	
    	LogEyeBean log = wdkEnv.startLog(WFFrame.class.getName(), "todo_recover");//日志跟踪
    	try{
			//1、根据todo查找下一个todo
			ArrayList<bean_todo> nexttodos = WQL.getWO(WQLNames.QWDKWFTODO)
												.addParam("flag", "201")
												.addParam("pretodoid",todoid)
												.process(conb)
												.getObjects(0, bean_todo.class);
			
			//2、判断下一个todo是否为被领取
			if(nexttodos.size()>0){
				boolean sl = true;
				bean_todo nexttodo = null;
				//如果当前环节未被办理，同时未被任何人领取(包含会签环节)
				for(int i=0;i<nexttodos.size();i++){
					nexttodo = nexttodos.get(i);
					if(WFConstant.TODO_Status_wait.equalsIgnoreCase(nexttodo.getStatus()) && "".equals(nexttodo.getLockactorid())){
						sl = ( sl & true );
					}else{
						sl = ( sl & false );
					}
				}
				if( sl ){
					//当前经办的todo
					bean_todo oldtodo = todo_querySingle(environment, conb, todoid);
					//构建新的todo 
					WFBean wb = wb_queryByPiid(environment, conb, oldtodo.getPiid());
					String nodename = oldtodo.getNodename();
					String taskid = oldtodo.getTaskid();
					String subtaskid = oldtodo.getSubtaskid();
					bean_todo newtodo = todo_new(environment, conb, wb, nodename, actor,null,null, taskid, subtaskid);
					newtodo.setTitle(oldtodo.getTitle());
					newtodo.setActorid(actor.getActorId());
					newtodo.setActortype(actor.getActorType());
					newtodo.setDeptuuid(actor.getDeptuuid());
					if(null!=originactor&&!"".equals(originactor.getActorId())){
						newtodo.setOriginactorid(originactor.getActorId());
						newtodo.setOriginactortype(originactor.getActorType());
						newtodo.setOrigindeptuuid(originactor.getDeptuuid());
					}
					newtodo.setOpercomment(opercomment);
					newtodo.setOperdt(operdt);
					newtodo.setOpertype(WFConstant.Opertype_Recover);
					newtodo.setStatus(WFConstant.TODO_Status_recover);
					newtodo.setTaskid(nexttodo.getTaskid());
					
					/*isSuccess = WQL.getWO(WQLNames.UWDKWFTODO)
									.addParam("flag", "1")
									.addParamMap(newtodo.toMap())
									.process(conb)
									.isSuccess();*/
					//if(isSuccess){
					    //追回成功，同步到统一待办库
					   /* todo_sync_add(conb, newtodo);*/
						//构建提交对象
						bean_submit submit = new bean_submit(newtodo);
						submit.setTitle(newtodo.getTitle());
						submit.setActorid(actor.getActorId());
						submit.setActortype(actor.getActorType());
						submit.setAgenttype(agenttype);
						submit.setIsdeputesign(isdeputesign);
						submit.setDeptuuid(actor.getDeptuuid());
						submit.setOpertype(WFConstant.Opertype_Recover);
						submit.setOperdt(operdt);
						submit.setOpercomment(opercomment);
						submit.setOriginactorid(null!=originactor?originactor.getActorId():"");
						submit.setOriginactortype(null!=originactor?originactor.getActorType():"");
						submit.setOrigindeptuuid(null!=originactor?originactor.getDeptuuid():"");
						
						submit.setTarget(oldtodo.getNodename());
						submit.setTargettype(oldtodo.getNodetype());
						
						submit.setUnittodopushtype(BaseUnitTodo.PUSGTYPE_SYNC); //设置同步提交数据到移动端
						
						ArrayList<WFActorBean> actors = new ArrayList<WFActorBean>();
						WFActorBean wfab = actor;
						if(null!=originactor&&!"".equals(originactor.getActorId())){
							//如果当前待办被委托人办理了，则需要还原原始办理人
							wfab = originactor;
						}
						actors.add(wfab);
						submit.setTargetactors(actors);
						
						//提交
						isSuccess = todo_submit(environment, conb, submit);
						
						//如果收回成功 , 设置当前待办为收回
						if(isSuccess){
							//获取当前收回的用户
							SessionUser user = (SessionUser) SessionManager.getSession(wdkEnv.getWDKContext().getRequest());
							HashMap<String,String> values = new HashMap<String,String>();
							values.put("OPERTYPE", WFConstant.Opertype_Recover);
							values.put("OPERCOMMENT", "由"+oldtodo.getNodetitle()+"环节"+user.getUsername()+"收回");
							WQLObject mainWO = WQLObject.getWQLObject("WDK_WF_TODO");
							mainWO.update(values, " ID=? ", new String[]{nexttodo.getId()},  conb);
						}
					}
				//}
			}
    	}catch (Exception e) {
    		isSuccess = false;
    		msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//日志跟踪
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		return isSuccess;
	}
	
	/**
	 * 查询指定id的待办记录
	 * @param environment
	 * @param conb
	 * @param todoid
	 * @return
	 * @throws Exception
	 */
	public static bean_todo todo_querySingle(Environment environment,ConnectBean conb,String todoid) throws Exception{
    	WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	boolean isSuccess = true;
    	String msg = "";
    	
    	bean_todo todo = null;
    	
    	LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"todo_querySingle");//日志跟踪
		try{
			todo = (bean_todo) WQL.getWO(WQLNames.QWDKWFTODO)
								.addParam("flag", "1")
								.addParam("id", todoid)
								//.addParam("issuspend", "0")
								.process(conb)
								.getObject(0, bean_todo.class);
			if (todo == null) {
	            todo = (bean_todo) WQL.getWO(WQLNames.QWDKWFTODO)
	                        .addParam("flag", "202")
	                        .addParam("id", todoid)
	                        //.addParam("issuspend", "0")
	                        .process(conb)
	                        .getObject(0, bean_todo.class);
	        }
    	}catch (Exception e) {
    		isSuccess = false;
    		msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//日志跟踪
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}		
		return todo;
	}
	/**
	 * 分页查询所有待办
	 * @param environment
	 * @param conb
	 * @param request
	 * @param response
	 * @param param
	 * @return
	 */
	public static JSONObject todo_pageQuery(Environment environment,ConnectBean conb,HttpServletRequest request,HttpServletResponse response,HashMap<String,String> param){
		return todo_pageQuery(environment, conb, request, response, param,false,false);
	}
	public static JSONObject todo_pageQuery(Environment environment,ConnectBean conb,HttpServletRequest request,HttpServletResponse response,HashMap<String,String> param,boolean hasdepute){
		return todo_pageQuery(environment, conb, request, response, param,hasdepute,false);
	}
	public static JSONObject todo_pageQuery(Environment environment,ConnectBean conb,HttpServletRequest request,HttpServletResponse response,HashMap<String,String> param,boolean hasdepute,boolean hasdone){
		JSONObject jres = new JSONObject();
		param.put("issuspend", "0");
		if(!hasdone&&!hasdepute){					//1、如果是查询个人待办
			param.put("status", "0");
			jres = WQL.getWO(WQLNames.QWDKWFTODO)
						.addParam("flag", "1")
						.addParamMap(param)
						.pageQuery(request, "createdt desc",conb);
		}else if(hasdone&&!hasdepute){				//2、如果是查询个人待办以及经办
			param.put("allstatus", "'0','1'");
			jres = WQL.getWO(WQLNames.QWDKWFTODO)
						.addParam("flag", "1")
						.addParamMap(param)
						.pageQuery(request, "createdt desc",conb);
		}else if(!hasdone&&hasdepute){				//3、如果是查询个人待办以及委托待办
			param.put("status", "0");
			jres = WQL.getWO(WQLNames.QWDKWFTODO)
						.addParam("flag", "301")
						.addParamMap(param)
						.pageQuery(request, "createdt desc",conb);
		}else if(hasdone&&hasdepute){				//4、如果是查询个人经办以及委托经办
			param.put("allstatus", "'0','1'");
			jres = WQL.getWO(WQLNames.QWDKWFTODO)
						.addParam("flag", "301")
						.addParamMap(param)
						.pageQuery(request, "createdt desc",conb);
		}
		
		return jres;
	}
	
	
	
	
	
	/**
	 * 添加额外的todo属性
	 * @param environment
	 * @param conb
	 * @param todo
	 * @return
	 * @throws Exception 
	 */
	public static bean_todo todo_addExtraParam(Environment environment,ConnectBean conb,bean_todo todo) throws Exception{
    	WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	boolean isSuccess = true;
    	String msg = "";
    	
    	LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"todo_addExtraParam");//日志跟踪
		try{
			if(null!=todo){
				WFBean wb = wb_queryByPiid(environment, conb, todo.getPiid());
				if(wb==null){
				    wb = wb_queryByPiid(environment, conb,  todo.getPiid(), true);
				}
				WFNodeBean wnb = wb.getNodeBean(todo.getNodename());
				todo.setParam_canassign(wnb.canAssign());
				todo.setParam_canbefree(wnb.canBeFree());
				todo.setParam_canberecover("1".equals(wnb.getCanberecover())?true:false);
				todo.setParam_canbereturn("1".equals(wnb.getCanbereturn())?true:false);
				todo.setParam_cancc("1".equals(wnb.getCancc())?true:false);
				todo.setParam_canfree("1".equals(wnb.getCanfree())?true:false);
				todo.setParam_canread("1".equals(wnb.getCanread())?true:false);
				todo.setParam_canrecover("1".equals(wnb.getCanrecover())?true:false);
				todo.setParam_canreturn("1".equals(wnb.getCanreturn())?true:false);
				todo.setParam_ppdid(wb.getPpdid());
				todo.setParam_ppiid(wb.getPpiid());
				todo.setParam_pnodename(wb.getPnodename());
				todo.setParam_pnodetype(wb.getPnodetype());
				todo.setParam_pnodetitle(wb.getPnodetitle());
				todo.setParam_pactorid(wb.getPactorid());
				todo.setParam_pactortype(wb.getPactortype());
				todo.setParam_pdeptuuid(wb.getPdeptuuid());
				
				if(todo.isTodo()){
	                WFBean parentWB = wb_queryByPiid(environment, conb, wb.getPpiid());
	                if (parentWB == null) {
	                    parentWB = wb_queryByPiid(environment, conb, wb.getPpiid(), true);
	                }
					if(null!=parentWB){
						WFNodeBean parentWnb = parentWB.getNodeBean(wb.getPnodename());
						todo.setParam_islastsub(parentWnb.isLastSub());
						todo.setParam_issub(true);
					}else{
						todo.setParam_islastsub(false);
						todo.setParam_issub(false);
					}
					todo.setParam_islastactor(wnb.isLastActor());
					
				}else{
					//如果是转办或交办
					//1、查询转办主表和明细表记录
					//2、根据明细表的所有人的办理情况来判断，判断是否所有人的办理标识iscomplete都为“已办理”，不区分顺序办理或同时办理
					todo.setParam_islastsub(false);
					todo.setParam_issub(false);
					
					String turnid = todo.getTurnid();
					int nCount = 0;
					int nTotal = 0;
					  ArrayList _dtls = WQL.getWO(WQLNames.QWDKWFTURN)
			            .addParam("flag", "1")
			            .addParam("piid", todo.getPiid())
			            .addParam("nodename", todo.getNodename())
			            .process(conb)
			            .getObjects(0, bean_turn.class);
			            for(int i=0;i<_dtls.size();i++){
			                bean_turn turn = (bean_turn)_dtls.get(i);
					if(null!=turn){
						ArrayList<bean_turn_detail> dtls = turndetail_query(environment, conb, turn.getId());
						nTotal += dtls.size();
						for(Iterator<bean_turn_detail> it = dtls.iterator();it.hasNext();){
							bean_turn_detail btd = it.next();
							if(btd.isComplete()){
								nCount++;
							}
						}
					}
			            }
					if(nCount < nTotal-1){
						todo.setParam_islastactor(false);
					}else{
					    int nNum = 0;
					    for(Iterator<WFActorBean> it = wnb.getActors().iterator();it.hasNext();){
				            WFActorBean wfab = it.next();
				            if(!wfab.isComplete()){
				                nNum++;
				            }
				        }
						todo.setParam_islastactor(nNum>1?false:true);
					}
				}
			}
    	}catch (Exception e) {
    		isSuccess = false;
    		msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//日志跟踪
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		return todo;
	}
	
	/**
	 * 完成某一个待办，关闭其余关联待办
	 * @param environment
	 * @param conb
	 * @param todoid
	 * @param operdt
	 * @param opertype
	 * @param isRecover
	 * @return
	 * @throws Exception
	 */
	public static boolean todo_complete(Environment environment, ConnectBean conb, bean_todo todo, String operdt, String opertype, boolean isRecover) throws Exception {
		return todo_complete(environment, conb, todo, operdt, opertype, isRecover, "");
	}
	
	/**
	 * 完成某一个待办，关闭其余关联待办
	 * @param environment
	 * @param conb
	 * @param todoid
	 * @param unittodopushtype 统一待办推送方式：sync-同步  asyn-异步
	 * @return
	 * @throws Exception
	 */
    public static boolean todo_complete(Environment environment, ConnectBean conb, bean_todo todo, String operdt, String opertype, boolean isRecover, String unittodopushtype)
            throws Exception {
    	WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	boolean isSuccess = true;
    	String msg = "";
    	
    	LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"todo_complete");//日志跟踪
    	try{
	        if(unittodopushtype==null) unittodopushtype = BaseUnitTodo.PUSGTYPE_ASYN;//统一待办推送方式：sync-同步  asyn-异步
	        ArrayList<bean_todo> todos = new ArrayList<bean_todo>();
	        //bean_todo todo = todo_querySingle(environment, conb, todoid);
	        
	        todos.add(todo);
	        //1、先关闭待办本身
	        isSuccess = WQL.getWO(WQLNames.UWDKWFTODO).addParam("flag", isRecover ? "104" : "103").addParam("id", todo.getId())
	                		.addParam("opertype", opertype).addParam("operdt", operdt).process(conb).isSuccess();
	        
	        //2、如果当前待办是非抄送待办 ，再关闭所有非活跃节点的待办记录
	        if(isSuccess && !"3".equals(todo.getTodotype())){
		        ArrayList<String> activeNodenames = WFEngine.pi_getActivityNodes(environment, todo.getPiid());
		        String nodenames = StringUtils.join(activeNodenames, "','");
		        ArrayList<bean_todo> _todos = (ArrayList<bean_todo>) WQL.getWO(WQLNames.QWDKWFTODO).addParam("flag", "1").addParam("notnodename", "'" + nodenames + "'")
		                .addParam("piid", todo.getPiid()).addParam("status", "0")
		                // .addParam("issuspend", "0")
		                .process(conb).getObjects(0, bean_todo.class);
		
		//        HashSet<String> taskuuid = new HashSet<String>();
		        for (bean_todo bean : _todos) {
		//不能按任务ID和子任务ID进行排除，因为相同任务ID和子任务ID的待办，待办类型可能不一定是0（UWDKWFTODO中只有待办类型为0的才会去关闭相关待办）
		//            String uuid = bean.getTaskid() + (bean.getSubtaskid() == null ? "" : bean.getSubtaskid());
		//            if (taskuuid.contains(uuid)) {
		//                continue;
		//            }
		            if("3".equals(bean.getTodotype())){
		                //抄送的待办不需要处理
		                continue;
		            }
		            todos.add(bean);
		            isSuccess = WQL.getWO(WQLNames.UWDKWFTODO).addParam("flag", isRecover ? "104" : "103").addParam("id", bean.getId())
		                    .addParam("opertype", opertype).addParam("operdt", operdt).process(conb).isSuccess();
		            if (!isSuccess) {
		                break;
		            }
		//            taskuuid.add(uuid);
		        }
	        }
	        
	        if (isSuccess) {
	            // 需要同步到统一待办库的话，则进行同步
	            // 异步（同步）方式由具体业务代码类决定
	            if (todos != null && todos.size() > 0) {
	                todo_sync_close(conb, todos, BaseUnitTodo.COMPLETE, unittodopushtype);
	            }
	        }
    	}catch (Exception e) {
    		isSuccess = false;
    		msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//日志跟踪
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
        return isSuccess;
    }
	/**
	 * 更新待办的操作意见
	 * @param environment
	 * @param conb
	 * @param todoid
	 * @param opercomment
	 * @param operdt
	 * @return
	 * @throws Exception
	 */
	public static boolean todo_update(Environment environment,ConnectBean conb,bean_submit submit) throws Exception{
    	WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	boolean isSuccess = true;
    	String msg = "";
    	
		LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"todo_update");//日志跟踪		
		try{
			HashMap<String,String> param = new HashMap<String, String>();
			param.put("id", submit.getTodoid());
			param.put("operdt", submit.getOperdt());
			param.put("opercomment", submit.getOpercomment());
			//如果是委托办理，则记录委托信息
			if(!WFConstant.Agenttype_Self.equals(submit.getAgenttype())){
				//如果当前办理人与原办理人一致，需要把本来作为委托人的办理人，修改为当前办理人
				SessionUser su = (SessionUser) SessionManager.getSession(wdkEnv.getWDKContext().getRequest());
				String actorid = submit.getActorid();
				if(su!=null && su.getUserid().equalsIgnoreCase(submit.getOriginactorid())){
					actorid = su.getUserid();
				}
				param.put("flag", "22");
				param.put("actorid", actorid);
				param.put("actortype", submit.getActortype());
				param.put("deptuuid", submit.getDeptuuid());
				param.put("agenttype", submit.getAgenttype());
				param.put("originactorid", submit.getOriginactorid());
				param.put("originactortype", submit.getOriginactortype());
				param.put("origindeptuuid", submit.getOrigindeptuuid());
			}else{
				param.put("flag", "21");
			}
			
			isSuccess = WQL.getWO(WQLNames.UWDKWFTODO)
									.addParamMap(param)
									.process(conb)
									.isSuccess();
    	}catch (Exception e) {
    		isSuccess = false;
    		msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//日志跟踪
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		
		return isSuccess;
	}
	
	
    /**
     * 流程环节推进,反返回这次生成的待办
     * 
     * @param environment
     * @param conb
     * @param submit
     * @return
     * @throws Exception
     */
	public static ArrayList<bean_todo> todo_submit_return(Environment environment,ConnectBean conb,bean_submit submit) throws Exception{
    	WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	boolean isSuccess = true;
    	String msg = "";
    	
    	ArrayList<bean_todo> list = null;
    	
    	LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"todo_submit_return");//日志跟踪	
    	try{
		    isSuccess = todo_submit(environment, conb, submit);
		    if(isSuccess){
		        bean_todo todo = submit.getTodo();
		       String nodename =  submit.getTarget();
		       WFBean wb = WFEngine.wb_queryByPiid(environment, conb,  todo.getPiid());
		       WFNodeBean wnb = wb.getNodeBean(nodename);
		       if(wnb!=null){
		    	   list = wnb.getTodoBeanList();
		       }
		    }
    	}catch (Exception e) {
    		isSuccess = false;
    		msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//日志跟踪
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
	    return list;
	}
	/**
	 * 流程环节推进
	 * @param environment
	 * @param conb
	 * @param submit
	 * @return
	 * @throws Exception
	 */
	public static boolean todo_submit(Environment environment,ConnectBean conb,bean_submit submit) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
    	LogEyeBean log = wdkEnv.startLog(WFFrame.class.getName(),"todo_submit");//流程日志跟踪
		try{
			//这里需要判断待办是否已经被提交			
			//@Upd daur.zheng 此处增加逻辑判断，如果当前待办已经被办理，则不需要在去提交，抛出异常提醒
			bean_todo todo =submit.getTodo();
			if(todo==null){
				String todoid = submit.getTodoid();
				todo = todo_querySingle(environment, conb, todoid);
			}
			if(todo!=null){
				if(todo.getStatus()!=null && !"0".equals(todo.getStatus()) && !"3".equals(todo.getStatus())){ //当前待办已办理，需要抛出异常
					throw new Exception("此待办已被处理，请您处理其他待办！");
				}
			}
			
			//首先更新待办记录表，如果是追回，则不需要更新
			if(!WFConstant.Opertype_Recover.equalsIgnoreCase(submit.getOpertype())){
				isSuccess = todo_update(environment, conb, submit);
				if(!isSuccess){
					throw new Exception("待办记录更新失败！");
				}
			}
			
			//将统一待办推送方式参数设置到流程变量中
			WFBean wb = wb_queryByPiid(environment, conb, todo.getPiid());
			wb.addVariable("unittodopushtype", (submit.getUnittodopushtype()==null?BaseUnitTodo.PUSGTYPE_ASYN:submit.getUnittodopushtype()));
			wb_save(environment, conb, wb);
			
			if (WFConstant.TODO_Type_Normal.equals(todo.getTodotype())) {
	            isSuccess = todo_submit_normal(environment, conb, submit);
	        } else if (WFConstant.TODO_Type_CC.equals(todo.getTodotype())) {
	            //抄送的提交，不做任何处理动作，只更新待办表
	        } else {
	            isSuccess = todo_submit_turn(environment, conb, submit);
	        }
			
			
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//流程日志跟踪
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		return isSuccess;
	}
	
	/**
	 * 异步推送提交
	 * @param submit
	 */
	public static void todo_submit_asyn(bean_submit submit){
		ArrayList<bean_submit> submits = new ArrayList<bean_submit>();
		submits.add(submit);
		todo_submit_asyn(submits);
	}
	public static void todo_submit_asyn(ArrayList<bean_submit> submits){
		Thread t = new Thread(new todo_submit_asyn_thread(submits));
		t.start();
	}
	/**
	 * 异步发送的代码
	 * @author Administrator
	 *
	 */
	static class todo_submit_asyn_thread implements Runnable{
		ArrayList<bean_submit> submits;
		public todo_submit_asyn_thread(ArrayList<bean_submit> submits) {
			this.submits = submits;
		}
		@Override
		public void run() {
			HashMap<String,Object> param = new HashMap<String, Object>();
			param.put("submits", submits);
			Object oRes = JBPMUtil.execute(new WFContainerThread(param){
				private static final long serialVersionUID = 1L;

				@Override
				public Object execute(Environment environment,ConnectBean conb, HashMap<String, Object> param) throws Exception {
					ArrayList<bean_submit> submits = (ArrayList<bean_submit>) param.get("submits");
					for(Iterator<bean_submit> it = submits.iterator();it.hasNext();){
						bean_submit submit = it.next();
						WFFrame.todo_submit(environment, conb, submit);
					}
					return null;
				}
				
			});
		}
	}
	
	/**
	 * 提交交办的任务
	 * @param environment
	 * @param conb
	 * @param submit
	 * @return
	 * @throws Exception
	 */
	private static boolean todo_submit_turn(Environment environment,ConnectBean conb,bean_submit submit) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	boolean isSuccess = true;
    	String msg = "";
    	
    	LogEyeBean log = wdkEnv.startLog(WFFrame.class.getName(),"todo_submit_turn");//流程日志跟踪
    	try{
			bean_todo btodo = submit.getTodo();
			bean_turn bturn = turn_query(environment, conb, btodo.getTurnid());
			ArrayList<bean_turn_detail> bdtls = turndetail_query(environment, conb, btodo.getTurnid());
			bean_turn_detail bdtl = null;
			bean_turn_detail bdtl_next = null;		//下一个办理人
			for(Iterator<bean_turn_detail> it = bdtls.iterator();it.hasNext();){
				bean_turn_detail btd = it.next();
				if(null!=bdtl&&null==bdtl_next){
					bdtl_next = btd;
				}
				if(btd.getTodoid().equals(btodo.getId())){
					bdtl = btd;
				}
			}
			
			//0、看当前其中一个转办（或许存在多个转办），是否全部处理完毕
	        WFBean wb = wb_queryByPiid(environment, conb, btodo.getPiid());
	        WFNodeBean wnb = wb.getNodeBean(btodo.getNodename());
	        wb_updatesignactor(environment,conb,wb,btodo);
	//        //当前其中一个转办处理完毕了
	//        if (wnb.isSign()) {
	//             
	//              int _nCount = 0;
	//              int _nTotal = bdtls.size();
	//              for(Iterator<bean_turn_detail> it = bdtls.iterator();it.hasNext();){
	//                  bean_turn_detail btd = it.next();
	//                  if(btd.isComplete()){
	//                      _nCount++;
	//                  }
	//              }
	//              if(_nCount>=_nTotal-1){
	//                  bean_todo  srctodo = WFFrame.todo_querySingle(environment, conb, btodo.getPretodoid());
	//                  wnb.updateActor(srctodo.getActorid(), srctodo.getActortype(), srctodo.getDeptuuid(), "", WDK.getDateTime());
	//                  wb_save(environment, conb, wb);
	//              }
	//        }
	        
			
			//1、看是否全部处理完毕
			int nCount = 0;
			int nTotal = 0;
			 ArrayList _dtls = WQL.getWO(WQLNames.QWDKWFTURN)
	         .addParam("flag", "1")
	         .addParam("piid", btodo.getPiid())
	         .addParam("nodename", btodo.getNodename())
	         .process(conb)
	         .getObjects(0, bean_turn.class);
			 
			 for(int i=0;i<_dtls.size();i++){
	             bean_turn turn = (bean_turn)_dtls.get(i);
		         if(null!=turn){
	                 ArrayList<bean_turn_detail> dtls = WFFrame.turndetail_query(environment, conb, turn.getId());
	                 nTotal += dtls.size();
	                 for(Iterator<bean_turn_detail> it = dtls.iterator();it.hasNext();){
	                     bean_turn_detail btd = it.next();
	                     if(btd.isComplete()){
	                         nCount++;
	                     }
	                 }
		         }
			 }
			
			
			if(nCount<nTotal-1){
				//不是最后一个			
				//结束当前转办记录
				turndetail_submit(environment, conb, bdtl, submit);
				//结束当前待办
				completeTask(environment, conb, submit, wb, wnb,null, false);
				//如果是顺序办理，开启下一个分配待办
				if("1".equals(bturn.getOpertype())&&null!=bdtl_next){
					//开启下一个办理人的todoid
					String subtodoid = WDK.getUUID();
					isSuccess = WQL.getWO(WQLNames.UWDKWFTURNDTL)
									.addParam("flag", "201")
									.addParam("id",bdtl_next.getId())
									.addParam("todoid", subtodoid)
									.process(conb)
									.isSuccess();
					
					//插入待办表
					bean_todo turntodo = new bean_todo();
					turntodo.setActorid(bdtl_next.getActorid());
					turntodo.setActortype(bdtl_next.getActortype());
					turntodo.setDeptuuid(bdtl_next.getDeptuuid());
					turntodo.setAgenttype(WFConstant.Agenttype_Self);
					turntodo.setId(subtodoid);
					turntodo.setLimitdt(btodo.getLimitdt());
					turntodo.setLimittime(btodo.getLimittime());
					turntodo.setLockactorid("");
					turntodo.setLockactortype("");
					turntodo.setLockdeptuuid("");
					turntodo.setLockdt("");
					turntodo.setNodename(btodo.getNodename());
					turntodo.setNodepage(btodo.getNodepage());
					turntodo.setNodetitle(btodo.getNodetitle());
					turntodo.setNodetype(btodo.getNodetype());
					turntodo.setOpercomment("");
					turntodo.setOperdt("");
					turntodo.setOpertype("");
					turntodo.setOriginactorid("");
					turntodo.setOriginactortype("");
					turntodo.setOrigindeptuuid("");
					turntodo.setOverduetime(btodo.getOverduetime());
					turntodo.setPdid(btodo.getPdid());
					turntodo.setPiid(btodo.getPiid());
					turntodo.setTodosort(btodo.getTodosort());//todosort也要设置的啊
					   
					turntodo.setPretodoid(btodo.getPretodoid());
					turntodo.setSendactorid(btodo.getActorid());
					turntodo.setSendactortype(btodo.getActortype());
					turntodo.setSenddeptuuid(btodo.getDeptuuid());
					turntodo.setSenddt(submit.getOperdt());
					turntodo.setSigntype(btodo.getSigntype());
					turntodo.setStatus(WFConstant.TODO_Status_wait);
					turntodo.setTaskid(btodo.getTaskid());
					turntodo.setSubtaskid(btodo.getSubtaskid());
					turntodo.setTitle(btodo.getTitle());
					if(WFConstant.TURN_Type_Turn.equals(bturn.getTurntype())){
						turntodo.setTodotype(WFConstant.TODO_Type_Turn);
					}else{
						turntodo.setTodotype(WFConstant.TODO_Type_Hand);	   
					}
					turntodo.setTurnid(bturn.getId());
					turntodo.setUnitid(btodo.getUnitid());
						
					turntodo.setWarnyellowdt(btodo.getWarnyellowdt());
					turntodo.setWarnyellowtime(btodo.getWarnyellowtime());
					turntodo.setWarnreddt(btodo.getWarnreddt());
					turntodo.setWarnredtime(btodo.getWarnredtime());
					turntodo.setCreatedt(submit.getOperdt());
					isSuccess = todo_add(environment, conb, turntodo, (wb.getVariables().containsKey("unittodopushtype")?(String)wb.getVariables().get("unittodopushtype"):""));
				}
			}else{	
				//是最后一个
				//判断是转办还是交办
				if(WFConstant.TURN_Type_Turn.equalsIgnoreCase(bturn.getTurntype())){
					//如果是转办方式，则由被转办人直接处理流程，调用submit继续推进流程
					
					//结束当前转办记录
					turndetail_submit(environment, conb, bdtl, submit);
					
					//结束当前转办主记录
					turn_submit(environment, conb, bturn, submit);
	
					//推进流程
					todo_submit_normal(environment, conb, submit);
					
				}else{
					//如果是交办方式，则对原始处理人新增一个待办
					
					//结束当前转办记录
					turndetail_submit(environment, conb, bdtl, submit);
					
					//结束当前转办主记录
					turn_submit(environment, conb, bturn, submit);
					
					//结束当前待办
					completeTask(environment, conb, submit, wb, wnb,null, false);
					
					//查找原始待办记录
					bean_todo origintodo = todo_querySingle(environment, conb, bturn.getTodoid());
					
					//根据原始待办记录，构建新的待办给原始办理人
					//插入待办表
					bean_todo newtodo = new bean_todo();
					newtodo.setActorid(origintodo.getActorid());
					newtodo.setActortype(origintodo.getActortype());
					newtodo.setDeptuuid(origintodo.getDeptuuid());
					newtodo.setAgenttype(WFConstant.Agenttype_Self);
					newtodo.setId(WDK.getUUID());
					newtodo.setLimitdt(origintodo.getLimitdt());
					newtodo.setLimittime(origintodo.getLimittime());
					newtodo.setLockactorid("");
					newtodo.setLockactortype("");
					newtodo.setLockdeptuuid("");
					newtodo.setLockdt("");
					newtodo.setNodename(origintodo.getNodename());
					newtodo.setNodepage(origintodo.getNodepage());
					newtodo.setNodetitle(origintodo.getNodetitle());
					newtodo.setNodetype(origintodo.getNodetype());
					newtodo.setOpercomment("");
					newtodo.setOperdt("");
					newtodo.setOpertype("");
					newtodo.setOriginactorid("");
					newtodo.setOriginactortype("");
					newtodo.setOrigindeptuuid("");
					newtodo.setOverduetime(origintodo.getOverduetime());
					newtodo.setPdid(origintodo.getPdid());
					newtodo.setPiid(origintodo.getPiid());
					   
					newtodo.setPretodoid(btodo.getPretodoid());
					newtodo.setSendactorid(btodo.getActorid());
					newtodo.setSendactortype(btodo.getActortype());
					newtodo.setSenddeptuuid(btodo.getDeptuuid());
					newtodo.setSenddt(submit.getOperdt());
					newtodo.setSigntype(origintodo.getSigntype());
					newtodo.setStatus(WFConstant.TODO_Status_wait);
					newtodo.setTaskid(origintodo.getTaskid());
					newtodo.setSubtaskid(origintodo.getSubtaskid());
					newtodo.setTitle(origintodo.getTitle());
					newtodo.setTodotype(WFConstant.TODO_Type_Normal);
					newtodo.setTurnid("");
					newtodo.setUnitid(origintodo.getUnitid());
						
					newtodo.setWarnyellowdt(origintodo.getWarnyellowdt());
					newtodo.setWarnyellowtime(origintodo.getWarnyellowtime());
					newtodo.setWarnreddt(origintodo.getWarnreddt());
					newtodo.setWarnredtime(origintodo.getWarnredtime());
					newtodo.setCreatedt(submit.getOperdt());
					isSuccess = todo_add(environment, conb, newtodo, (wb.getVariables().containsKey("unittodopushtype")?(String)wb.getVariables().get("unittodopushtype"):""));
				}
			}
			
			
			
			//1、修改turn表
			//2、判断是转办还是交办
			//3、每一个转办后的待办办理完毕之后都更新表，同时从更新后的表来判断是否是最后一步转办
			//4、如果是转办方式，则最后一步待办处理之前更新待办表中的对应待办记录，同时关闭原待办记录为“被转办”
			//5、如果是交办方式，则最后一步处理完毕之后新增同样的一条原待办记录，复制其中信息，让原始处理人可以继续处理
			   
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//流程日志跟踪
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		
		return isSuccess;
	}
	

	
	/**
	 * 提交真实的任务
	 * @param environment
	 * @param conb
	 * @param submit
	 * @return
	 * @throws Exception
	 */
	private static boolean todo_submit_normal(Environment environment,ConnectBean conb,bean_submit submit) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	boolean isSuccess = true;
    	String msg = "";
		
    	LogEyeBean log = wdkEnv.startLog(WFFrame.class.getName(),"todo_submit_normal");//流程日志跟踪
		try{
			bean_todo todo = submit.getTodo();
			
			WFBean wb = wb_queryByPiid(environment, conb, todo.getPiid());
			
			//如果目标不填，则给出一个默认路径
			String target = submit.getTarget();
			if(null==target||"".equals(target)){
				ArrayList<String> childs = JBPMUtil.getChildNodes(environment, wb.getPdid(), todo.getNodename());
				if(childs.size()>0){
					target = childs.get(0);
				}
			}
			submit.setTarget(target);
			
			//开始根据流程的不同处理机制推进流程
			if(submit.isSubmit()){
				isSuccess = wb.getHandler().beforeTaskNext(conb, wb, submit);
				if(isSuccess){
					if(submit.isNodeSign()){
						isSuccess = todo_submit_sign(environment, conb, submit,wb);
					}else{
						isSuccess = todo_submit_task(environment, conb, submit,wb);
					}
				}else{
					WFError.beforeTaskNext();
				}
			}else if(submit.isRecover()){
				//是否追回
				isSuccess = wb.getHandler().beforeTaskRecover(conb, wb, submit);
				if(isSuccess){
					isSuccess = todo_submit_recover(environment, conb, submit,wb);
				}else{
					WFError.beforeTaskRecover();
				}
			}else if(submit.isBack()){
				//是否退回，退回和特送采用统一处理模式
				isSuccess = wb.getHandler().beforeTaskPre(conb, wb, submit);
				if(isSuccess){
					isSuccess = task_submit_free(environment, conb, submit);
				}else{
					WFError.beforeTaskPre();
				}
			}else{
				isSuccess = wb.getHandler().beforeTaskFree(conb, wb, submit);
				if(isSuccess){
					isSuccess = task_submit_free(environment, conb, submit);
				}else{
					WFError.beforeTaskFree();
				}
			}
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//流程日志跟踪
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}

		return isSuccess;
	}
	/**
	 * 普通任务的提交
	 * @param environment
	 * @param conb
	 * @param submit
	 * @param todo
	 * @return
	 * @throws Exception
	 */
	private static boolean todo_submit_task(Environment environment,ConnectBean conb,bean_submit submit,WFBean wb) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	boolean isSuccess = true;
    	String msg = "";
    	
    	LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"todo_submit_task");//流程日志跟踪
		try{
			bean_todo todo = submit.getTodo();
			WFNodeBean wnb = wb.getNodeBean(todo.getNodename());
			
			String target = submit.getTarget();
			if(null==target||"".equals(target)){
				ArrayList<String> childs = JBPMUtil.getChildNodes(environment, wb.getPdid(), todo.getNodename());
				if(childs.size()>0){
					target = childs.get(0);
				}
			}
			WFNodeBean wnbTarget = wb.getNodeBean(target);
	//		Task task = WFEngine.task_queryTop(environment, todo.getTaskid());
			if(wnbTarget.isSign()&&wnbTarget.isSignInSort()){
				//如果目标节点是顺序会签
				ArrayList<WFActorBean> actors = wnbTarget.getActors();
				for(int i=0;i<actors.size();i++){
					WFActorBean actor = actors.get(i);
					actor.setEnable(false);
					if(0==i){
						actor.setEnable(true);
					}
				}
			}
			
			isSuccess = completeTask(environment, conb, submit, wb, wnb, wnbTarget, true);
		
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//流程日志跟踪
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
        
		return isSuccess;
	}
	
	
	
	/**
	 * 会签节点任务处理
	 * @param environment
	 * @param conb
	 * @param submit
	 * @return
	 * @throws Exception
	 */
	private static boolean todo_submit_sign(Environment environment,ConnectBean conb,bean_submit submit,WFBean wb) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	boolean isSuccess = true;
    	String msg = "";
    	
    	
    	LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"todo_submit_sign");
		try{
			bean_todo todo = submit.getTodo();
			WFNodeBean wnb = wb.getNodeBean(todo.getNodename());
			WFNodeBean wnbTarget = wb.getNodeBean(submit.getTarget());
			
	//		Task task = WFEngine.task_queryById(environment,todo.getTaskid());
	//		Task subTask = WFEngine.task_queryById(environment,todo.getSubtaskid());
			
			//1、完成子任务
			isSuccess = WFEngine.subtask_complete(environment, conb, todo.getTaskid(), todo.getSubtaskid());
			
			//2、更新主环节的任务完成状态
	//		String comment = submit.getOpercomment();
	
			if(WFConstant.Agenttype_Self.equals(todo.getAgenttype())){
				wnb.updateActor(todo.getActorid(), todo.getActortype(), todo.getDeptuuid(),submit.getOpercomment(), submit.getOperdt());
			}else{
				wnb.updateActor(todo.getOriginactorid(), todo.getOriginactortype(), todo.getOrigindeptuuid(),submit.getOpercomment(), submit.getOperdt());
			}
			
			//3、根据策略判断，如果未结束，则启动下一会签人员的待办任务；如果结束，推进主流程前进
			int nRes = wnb.processPolicy();
			logger.debug("=====================会签策略判断结果："+nRes);
			if(-1==nRes){							//会签未结束，则分配下一个节点任务
				if(wnb.isSignInSort()){		//顺序会签
					wnb.goNext();
					WFActorBean nextactor = wnb.getNextActor();
					nextactor.setEnable(true);
					ArrayList<WFActorBean> actorls = new ArrayList<WFActorBean>();
					actorls.add(nextactor);
					isSuccess = wb.getHandler().beforeTaskAssign(conb, wb, todo.getNodename(), actorls);
					if(isSuccess){
						Task subTask = WFEngine.subtask_create(environment, conb, todo.getTaskid(),nextactor.getActorId());
						
						//向待办表插入待办数据
		                WFFrame.todo_add(environment, conb,wb,todo.getNodename(),nextactor,todo.getTaskid(),subTask.getId());
		                
						wb.getHandler().afterTaskAssign(conb, wb, todo.getNodename(), actorls);
						isSuccess = true;
					}else{
						WFError.beforeTaskAssign();
					}
				}else{
					isSuccess = true;
				}
				isSuccess = completeTask(environment, conb, submit, wb, wnb, wnbTarget, false);
	//			isSuccess = completeTask(environment, conb, submit, wb, wnb, wnbTarget, taskCreatedt, false);
			}else{								//会签结束，推动主流程前进
				isSuccess = completeTask(environment, conb, submit, wb, wnb, wnbTarget, true);
			}
		
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//流程日志跟踪
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}

		return isSuccess;
	}
	
	/**
	 * 自由流
	 * @param environment
	 * @param conb
	 * @param submit
	 * @return
	 * @throws Exception
	 */
	private static boolean task_submit_free(Environment environment,ConnectBean conb,bean_submit submit) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	boolean isSuccess = true;
    	String msg = "";
    	
    	LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"task_submit_free");//流程日志跟踪
		try{
			bean_todo todo = submit.getTodo();
			WFBean wb = wb_queryByPiid(environment, conb,  todo.getPiid());
			WFNodeBean wnb = wb.getNodeBean(todo.getNodename());
			WFNodeBean wnbTarget = wb.getNodeBean(submit.getTarget());
			if(wnbTarget.isSign()&&wnbTarget.isSignInSort()){
				//如果目标节点是顺序会签
				ArrayList<WFActorBean> actors = wnbTarget.getActors();
				for(int i=0;i<actors.size();i++){
					WFActorBean actor = actors.get(i);
					actor.setEnable(false);
					if(0==i){
						actor.setEnable(true);
					}
				}
			}
			isSuccess = completeTask(environment, conb, submit, wb, wnb,wnbTarget, true);
		
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//流程日志跟踪
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
        
		return isSuccess;
	}
	
	/**
	 * 追回任务的提交
	 * @param environment
	 * @param conb
	 * @param submit
	 * @return
	 * @throws Exception
	 */
	private static boolean todo_submit_recover(Environment environment,ConnectBean conb,bean_submit submit,WFBean wb) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	boolean isSuccess = true;
    	String msg = "";
    	
    	LogEyeBean log = wdkEnv.startLog( WFFrame.class.getName(),"todo_submit_recover");//流程日志跟踪
		try{
			bean_todo todo = submit.getTodo();
			WFNodeBean wnb = wb.getNodeBean(todo.getNodename());
			WFNodeBean wnbTarget = wb.getNodeBean(submit.getTarget());
			isSuccess = completeTask(environment, conb, submit, wb, wnb,wnbTarget, true);
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//流程日志跟踪
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		return isSuccess;
//		boolean isSuccess = false;
//		bean_task btask = submit.getTask();
//		WFBean wb = WFEngine.wb_queryByPiid(environment, conb,  btask.getPiid());
//		WFNodeBean wnb = wb.getNodeBean(btask.getNodename());
//		WFNodeBean wnbTarget = wb.getNodeBean(submit.getTarget());
//		
//		//判断并找出实际的任务归属人
//		String originactorid = btask.getOriginactorid();
//		String originactortype = btask.getOriginactortype();
//		if(null==originactorid||"".equals(originactorid)){
//			originactorid = btask.getActorid();
//			originactortype = btask.getActortype();
//		}
//		
//		Task task = WFEngine.task_queryTop(environment, btask.getTaskid());
//		Date taskCreatedt = task.getCreateTime();
//		//1、普通任务追回将，任务从下一节点回退到当前节点，同时更改并重新分配task的任务处理人
//		//2、会签任务的追回
//		//会签外部追回
//		//会签内部追回
//		//3、子流程的追回：不支持
//		//5、记录追回流水
//		
//		//会签任务的追回
//		ArrayList<WFActorBean> actors = wnbTarget.getActors();
//		if(wnbTarget.isSign()){		
//			//如果是会签内部追回，仅改变内部状态即可
//			if(wnbTarget.getNodename().equals(wnb.getNodename())){
//				//同时会签
//				if(!wnbTarget.isSignInSort()){
//					for(Iterator<WFActorBean> it = actors.iterator();it.hasNext();){
//						WFActorBean actor = it.next();
//						if(actor.getActorId().equals(originactorid)){
//							actor.init();
//							Task subTask = ((OpenTask)task).createSubTask();   
//							subTask.setAssignee(actor.getActorId());  
//						}
//					}
//				//顺序会签
//				}else{
//					//重新构建当前子任务，删除下一子任务
//					boolean isok = false;
//					for(int i=0;i<actors.size();i++){
//						WFActorBean actor = actors.get(i);
//						
//						//当前任务所在的用户，需要删除子任务
//						if(isok){
//							//a、删除所有子任务，禁用下一用户
//							TaskImpl parentTaskImpl = (TaskImpl) task;
//							ArrayList<String> subtaskids = WFEngine.subtask_getIds(environment,task.getId());
//							for(Iterator<String> it = subtaskids.iterator();it.hasNext();){
//								String subtaskid = it.next();
//								Task subtask = WFEngine.task_queryById(environment, subtaskid);
//								TaskImpl subtaskImpl = (TaskImpl) subtask;
//								//查找子任务所分配的用户
//								String assigneeActorid = subtaskImpl.getAssignee();
//								if(assigneeActorid.equals(actor.getActorId())){
//									parentTaskImpl.removeSubTask(subtask);
//									break;
//								}
//							}
//							actor.init();
//							actor.setEnable(false);
//							break;
//						}
//						
//						//被追回的会签用户，重新构建子任务
//						if(actor.getActorId().equals(originactorid)){
//							Task subTask = ((OpenTask)task).createSubTask();   
//							subTask.setAssignee(actor.getActorId());  
//							
//							actor.init();
//							actor.setEnable(true);
//							wnbTarget.setSign_actorspos(i);
//							isok = true;
//						}
//					}
//				}
//				submit.setActors(actors);
//				isSuccess = WFFrame.completeTask(environment, conb, submit, wb, wnb, wnbTarget, taskCreatedt, false);
//				
//			//如果是会签外部追回
//			}else{
//				//首先所有人员状态均初始化并禁用
//				for(int i=0;i<actors.size();i++){
//					WFActorBean actor = actors.get(i);
//					actor.init();
//					actor.setPass(true);
//					actor.setComplete(true);
//					actor.setEnable(false);
//				}
//				//同时会签
//				if(!wnbTarget.isSignInSort()){
//					for(Iterator<WFActorBean> it = actors.iterator();it.hasNext();){
//						WFActorBean actor = it.next();
//						if(actor.getActorId().equals(originactorid)){
//							actor.init();
//						}
//					}
//				//顺序会签
//				}else{
//					for(int i=0;i<actors.size();i++){
//						WFActorBean actor = actors.get(i);
//						if(actor.getActorId().equals(originactorid)){
//							actor.init();
//							wnbTarget.setSign_actorspos(i);
//						}
//					}
//				}
//				submit.setActors(actors);
//				isSuccess = WFFrame.completeTask(environment, conb, submit, wb, wnb, wnbTarget, taskCreatedt, true);
//			}
//		}else{
//			isSuccess = WFFrame.completeTask(environment, conb, submit, wb, wnb, wnbTarget, taskCreatedt, true);
//		}
//		return isSuccess;
	}
	
	
	
	private static boolean completeTask(Environment environment,ConnectBean conb,bean_submit submit,WFBean wb,WFNodeBean wnb,WFNodeBean wnbTarget,boolean isgo) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	boolean isSuccess = true;
    	String msg = "";
    	
    	LogEyeBean log = wdkEnv.startLog(WFFrame.class.getName(),"completeTask");//日志跟踪
		try{
			bean_todo todo = submit.getTodo();
			//1、记录上一环节信息
			String preid = wb.getVar_taskrecordId();
			String pretodoid = wb.getVar_pretodoid();
			String taskrecordId = WDK.getUUID();
			wb.setVar_taskrecordId(taskrecordId);
			//为了配合frok、join、decision等自动节点选取之后人工任务节点而记录的信息
			wb.setVar_extratargets(submit.getExtratargets());
			
			//4.1、记录流水
            if(isSuccess){
                bean_taskrecord tr = new bean_taskrecord();
                tr.setActorid(submit.getActorid());
                tr.setActortype(submit.getActortype());
                tr.setAgenttype(submit.getAgenttype());
                tr.setCreateactorid(wb.getCreate_actorid());
                tr.setCreateactortype(wb.getCreate_actortype());
                tr.setCreatedeptuuid(wb.getCreate_deptuuid());
                tr.setCreatedt(wb.getCreate_dt());
                tr.setDeptuuid(submit.getDeptuuid());
                tr.setId(taskrecordId);
                tr.setNodename(todo.getNodename());
                tr.setNodepage(todo.getNodepage());
                tr.setNodetitle(todo.getNodetitle());
                tr.setNodetype(todo.getNodetype());
                tr.setOpercomment(submit.getOpercomment());
                tr.setOperdt(submit.getOperdt());
                tr.setOpertype(submit.getOpertype());
                tr.setOriginactorid(submit.getOriginactorid());
                tr.setOriginactortype(submit.getOriginactortype());
                tr.setOrigindeptuuid(submit.getOrigindeptuuid());
                tr.setPdid(todo.getPdid());
                tr.setPiid(todo.getPiid());
                tr.setPreid(preid);
                tr.setSigntype(submit.getSigntype());
                tr.setStatus(WFConstant.Record_Status_Normal);
                tr.setSubtaskid(todo.getSubtaskid());
                tr.setTarget(submit.getTarget());
                tr.setTargetactorls(submit.getTargetactors());
                tr.setTaskcreatedt(todo.getCreatedt());
                tr.setTaskid(todo.getTaskid());
                tr.setTodoid(todo.getId());
                taskrecord_add(environment, conb, tr);
            }
            
          //4.4、如果目标节点是结束节点，则添加结束日志,删除任务流水记录并移至历史库
            if(null!=wnbTarget&&wnbTarget.isEnd() && ((wnb.processPolicy()!=-1 && submit.isNodeSign()) || !submit.isNodeSign() )){      
                //添加结束日志
                bean_taskrecord tr_end = new bean_taskrecord();
                tr_end.setActorid(submit.getActorid());
                tr_end.setActortype(submit.getActortype());
                tr_end.setAgenttype(submit.getAgenttype());
                tr_end.setCreateactorid(wb.getCreate_actorid());
                tr_end.setCreateactortype(wb.getCreate_actortype());
                tr_end.setCreatedeptuuid(wb.getCreate_deptuuid());
                tr_end.setCreatedt(wb.getCreate_dt());
                tr_end.setDeptuuid(submit.getDeptuuid());
                tr_end.setId(WDK.getUUID());
                tr_end.setNodename(wb.getEndNode().getNodename());
                tr_end.setNodepage(wb.getEndNode().getNodepage());
                tr_end.setNodetitle(wb.getEndNode().getNodetitle());
                tr_end.setNodetype(wb.getEndNode().getNodetype());
                tr_end.setOpercomment("");
                //为了确保排序，时间往后推一秒
                String addt = submit.getOperdt();
                addt = uDate.DateAdd(addt, "1", "6");
                tr_end.setOperdt(addt);
                tr_end.setOpertype(WFConstant.Opertype_End);
                tr_end.setOriginactorid(submit.getOriginactorid());
                tr_end.setOriginactortype(submit.getOriginactortype());
                tr_end.setOrigindeptuuid(submit.getOrigindeptuuid());
                tr_end.setPdid(todo.getPdid());
                tr_end.setPiid(todo.getPiid());
                tr_end.setPreid(taskrecordId);
                tr_end.setSigntype(submit.getSigntype());
                tr_end.setStatus(WFConstant.Record_Status_Normal);
                tr_end.setSubtaskid(todo.getSubtaskid());
                tr_end.setTarget("");
                tr_end.setTargetactorls(null);
                tr_end.setTaskcreatedt(todo.getCreatedt());
                tr_end.setTaskid(todo.getTaskid());
                tr_end.setTodoid(todo.getId());
                isSuccess = taskrecord_add(environment, conb, tr_end);
                
                //特送到办结时操作，记录下操作类型
                HashMap<String,String> values = new HashMap<String,String>();
				values.put("OPERDT", submit.getOperdt());
				values.put("OPERTYPE", submit.getOpertype());
				values.put("OPERCOMMENT", submit.getOpercomment());
				WQLObject mainWO = WQLObject.getWQLObject("WDK_WF_TODO");
				mainWO.update(values, " id=? ", new String[]{todo.getId()},  conb);
                
                //流水记录移至历史库
                //isSuccess = taskrecord_remove_history(environment, conb, todo.getPiid(),submit.getOperdt());
                
                //添加历史流程记录
                //isSuccess = pihistory_add(environment,conb,wb,submit.getOperdt());
                
                //抄送记录删除并移至历史库
    //          isSuccess = WFFrame.cc_remove_histor(environment, conb, btask.getPiid(),submit.getOperdt());
                
                //将所有关联待办删除并移动到历史库
                //isSuccess = todo_remove_history(environment, conb,todo.getPiid(),submit.getOperdt());
                
                //将活动流程变量移动到历史流程变量中
                //if(isSuccess){
                    
                    //a、插入历史库
                //    WFEngine.wb_save_history(environment, conb, todo.getPdid(), todo.getPiid(), wb);
                    
                    //b、删除活动库
                //    WFEngine.wb_remove(environment, conb, todo.getPiid());
                //}
            }
			if(isgo){
				if(wnbTarget.isTask()){							//目标节点是普通任务节点，则分配参与人
					wnbTarget.setActors(submit.getTargetactors());
					
				}else if(wnbTarget.isSign()){					//目标节点是会签节点，则分配会签参数
					wnbTarget.setSign_signtype(submit.getSigntype());
					wnbTarget.setActors(submit.getTargetactors());
					
				}else if(wnbTarget.isSubprocess()){				//目标节点是子流程节点
				
					//设置主环节的任务分配
					ArrayList<WFActorBean> targetActors = submit.getTargetactors();
	//				for(Iterator<WFActorBean> it = targetActors.iterator();it.hasNext();){
	//					WFActorBean w = it.next();
	//					w.setEnable(false);
	//				}
					wnbTarget.setActors(targetActors);
					
					//构建子流程的启动参数
					String subPdid = wnbTarget.getSubnode();
					HashMap<Object,Object> vars = wb.getVariables();
					wnbTarget.initSubs();
					
					//为每一个选择的人开启一个子流程
					for(Iterator<WFActorBean> it = targetActors.iterator();it.hasNext();){
						WFActorBean wfab = it.next();
						WFBean subWB = WFEngine.wb_create(subPdid);
						
						//复制流程变量
						for(Iterator<Object> it2 = vars.keySet().iterator();it2.hasNext();){
							Object key = it2.next();
							Object value = vars.get(key);
							subWB.addVariable(key,value);
						}
						
						subWB.setPcnname(wb.getCnname());
						subWB.setPpdid(wb.getPdid());
						subWB.setPpdname(wb.getPdname());
						subWB.setPpdversion(wb.getPdversion());
						subWB.setPpiid(wb.getPiid());
						subWB.setPnodename(wnbTarget.getNodename());
						subWB.setPnodetype(wnbTarget.getNodetype());
						subWB.setPactorid(wfab.getActorId());
						subWB.setPactortype(wfab.getActorType());
						subWB.setCreate_actorid(wb.getCreate_actorid());
						subWB.setCreate_actortype(wb.getCreate_actortype());
						subWB.setCreate_dt(submit.getOperdt());
						
						
						//设置子流程启动参数
	//					ArrayList<WFActorBean> subactors = new ArrayList<WFActorBean>();
						WFActorBean subactor = new WFActorBean(wfab.getActorId(),wfab.getActorType(),wfab.getDeptuuid());
	//					subactors.add(subactor);
						
						//启动子流程，并将子流程标识记录到主流程的子流程环节中
						String subpiid = pi_new_sub(environment, conb, submit,subPdid, subWB, subactor);
						WFBeanSub wbs = new WFBeanSub(subPdid,subpiid,wfab.getActorId(),wfab.getActorType(),wfab.getDeptuuid());
						wbs.setCreatedt(submit.getOperdt());
						wnbTarget.addSubprocess(wbs);
					}
				}else if(wnbTarget.isEnd()){					//目标节点是结束节点
					//如果是主流程，则不作处理，如果是子流程，则需要判断父流程的状态
					if(wb.hasParent()){
						//更新父流程的状态
						WFBean parentWB = wb_queryByPiid(environment, conb,wb.getPpiid());
						WFNodeBean wnbParent = parentWB.getNodeBean(wb.getPnodename());
						WFNodeBean wnbTargetParent = parentWB.getNodeBean(submit.getPtarget());
						
						boolean iscomplete = wnbParent.isSubComplete(todo.getPiid());
						//保存父流程的状态					
						WFEngine.wb_save(environment, conb, wb.getPpdid(),wb.getPpiid(), parentWB);
											
						if(iscomplete){
							
							//判断是否是最后一个子流程结束，如果是的话推进父流程向下走，并记录父流程的流水
							Task task = WFEngine.task_queryByActor(environment, wb.getPpiid(), wb.getPnodename(), wb.getPactorid());
							if(null!=task){
								bean_todo ptodo = new bean_todo();
								ptodo.setActorid(wb.getPactorid());
								ptodo.setActortype(wb.getPactortype());
								ptodo.setDeptuuid(wb.getPdeptuuid());
								ptodo.setNodename(wb.getPnodename());
								ptodo.setNodetype(wb.getPnodetype());
								ptodo.setNodetitle(wb.getPnodetitle());
								ptodo.setPdid(wb.getPpdid());
								ptodo.setPiid(wb.getPpiid());
								ptodo.setSubtaskid("");
								ptodo.setTaskid(task.getId());
								ptodo.setOpertype(todo.getOpertype());
								ptodo.setOperdt(todo.getOperdt());
								
								bean_submit psubmit = new bean_submit(ptodo);
								psubmit.setTargetactors(submit.getTargetactors());
								psubmit.setOpercomment("");
								psubmit.setOpertype(submit.getOpertype());
								psubmit.setOperdt(submit.getOperdt());
								psubmit.setSigntype(submit.getSigntype());
								psubmit.setTarget(submit.getPtarget());
								psubmit.setTargettype(submit.getPtargettype());
								psubmit.setTitle(submit.getTitle());
								completeTask(environment, conb, psubmit, parentWB, wnbParent, wnbTargetParent, true);
	//							completeTask(environment, conb, psubmit, parentWB, wnbParent, wnbTargetParent, task.getCreateTime(), true);
							}
						}
					}
					
				}else {											//目标节点是其他非任务节点，由系统自动处理						
					
				}
				
				//保留前一待办处理人信息
				wb.setVar_nexttodotitle(submit.getTitle());
				wb.setVar_pretodoid(todo.getId());
				wb.setVar_sendactorid(submit.getActorid());
				wb.setVar_sendactortype(submit.getActortype());
				wb.setVar_senddeptuuid(submit.getDeptuuid());
				wb.setVar_agenttype(submit.getAgenttype());
				wb.setVar_isdeputesign(submit.getIsdeputesign());
				wb.setVar_originactorid(submit.getOriginactorid());
				wb.setVar_originactortype(submit.getOriginactortype());
				wb.setVar_origindeptuuid(submit.getOrigindeptuuid());
				wb.setVar_senddt(submit.getOperdt());
				wb.setVar_unitid(submit.getUnitid());	
				
				WFEngine.wb_save(environment, conb, todo.getPdid(), todo.getPiid(), wb);
				
				isSuccess = WFEngine.task_complete(environment,  todo.getPiid(), todo.getTaskid(), submit.getTarget());
			}else{
				//不推进流程，说明是会签环节，只保留操作信息即可			
				WFEngine.wb_save(environment, conb, todo.getPdid(), todo.getPiid(), wb);			
			}
			
			
				
			//4.2、关闭关联任务
			if(isSuccess){
	//			isSuccess = WFFrame.task_return(environment, conb, btask);
				isSuccess = todo_complete(environment, conb, todo,submit.getOperdt(),submit.getOpertype(),submit.isRecover(),(wb.getVariables().containsKey("unittodopushtype")?(String)wb.getVariables().get("unittodopushtype"):""));
			}
			
	//		//4.3、交办记录删除并移至历史库
	//		if(isSuccess){
	//			isSuccess = WFFrame.assign_remove_history(environment, conb, btask.getPdid(), btask.getPiid(), btask.getTaskid(), btask.getSubtaskid(),submit.getOperdt());
	//		}
			
			
		
		}catch (Exception e) {
			isSuccess = false;
			msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);//流程日志跟踪
			if(isSuccess == false){
				throw new Exception(msg);
			}
		}
		
		return isSuccess;
	}
	
	
	
	
	
	
	
	
	
	
	
	/***********************************
    * 		委托相关
    **********************************/
   
   /**
    * 委托
    * 		获取委托列表
    * @param environment
    * @param conb
    * @return
 * @throws Exception 
    */
//   public static PageBean depute_pageQuery(HttpServletRequest request,HttpServletResponse response,Environment environment,ConnectBean conb) throws Exception{
//	   ArrayList<bean_depute> deputes = depute_query(environment, conb);
//	   PageBean pb = new PageBean(request, deputes);
//	   return pb;
//   }
//   public static PageBean depute_pageQuery(HttpServletRequest request,HttpServletResponse response,Environment environment,ConnectBean conb,bean_depute depute) throws Exception{
//	   ArrayList<bean_depute> deputes = depute_query(environment, conb,depute);
//	   PageBean pb = new PageBean(request, deputes);
//	   return pb;
//   }
//   public static ArrayList<bean_depute> depute_query(Environment environment,ConnectBean conb) throws Exception{
//		bean_depute depute = new bean_depute();
//		return depute_query(environment, conb,depute);
//   }
   public static ArrayList<bean_depute> depute_query(Environment environment,ConnectBean conb,HashMap<String,String> param) throws Exception{
	   if(null==param){
		   param = new HashMap<String, String>();
	   }
	   ArrayList<bean_depute> deputes = WQL.getWO(WQLNames.QWDKWFDEPUTE)
										    .addParamMap(param)
					   						.addParam("flag", "1")
					   						.process(conb)
					   						.getObjects(0, bean_depute.class);
	   return deputes;
   }
   
   
   /**
    * 新增委托
    * @param environment
    * @param conb
    * @param depute
 * @param flag 
    * @return
 * @throws Exception 
    */
   public static boolean depute_add(Environment environment,ConnectBean conb,bean_depute depute, String flag) throws Exception{
	   WFBean wb = wb_create(depute.getPdid());
		boolean isSuccess = true;
		if(wb!=null){
			isSuccess = wb.getHandler().beforeDepute(conb,depute);
		}
		if(isSuccess){
//			String nodenames = new String();
//			if("1".equals(depute.getDeputetype())){		//全程委托
//				if(null!=wb){
//					String swf = wb.getSwf();
//					JSONObject jwf = JSONObject.fromObject(swf);
//					JSONArray jnodes = jwf.getJSONArray("nodes");
//					
//					//首先增加一个自己的节点
//					for(int i=0;i<jnodes.size();i++){
//						JSONObject jnode = jnodes.getJSONObject(i);
//						String nodename = jnode.has("nodename")?jnode.getString("nodename"):"";
//						if(WFConstant.NODENAME_Start.equals(nodename)
//								||WFConstant.NODENAME_End.equals(nodename)){
//							continue;
//						}
//						nodenames += nodename+",";
//					}
//				}
//				if(nodenames.length()>0){
//					nodenames = ","+nodenames;
//				}
//			}else{
//				nodenames = ","+depute.getNodenames()+",";
//			}
//			
//			depute.setNodenames(nodenames);
			
			isSuccess = WQL.getWO(WQLNames.UWDKWFDEPUTE)
							.addParam("flag", flag)
							.addParamMap(depute.toMap())
							.process(conb)
							.isSuccess();
//			HashMap map = depute.toMap();
//			map.put("flag", "1");
//			ResultBean rb = WQL.process("UWDKWF2003", map,conb);
//			if(1==rb.getSucess()){
//				isSuccess = true;
//			}else{
//				isSuccess = false;
//			}
//			
////				isSuccess = WQL.getWO("UWDKWF2003")
////								.addParam("flag", "1")
////								.process(conb)
////								.isSuccess();
			if(wb!=null){
				wb.getHandler().afterDepute(conb,depute);
			}
		}else{
			WFError.beforeDepute();
		}
		return isSuccess;
   }
   
   /**
    * 委托启用
    * @param environment
    * @param conb
    * @param deputeid
    * @return
    * @throws Exception
    */
   public static boolean depute_enable(Environment environment,ConnectBean conb,String deputeid) throws Exception{
		boolean isSuccess = WQL.getWO(WQLNames.UWDKWFDEPUTE)
								.addParam("flag", "201")
								.addParam("id", deputeid)
								.addParam("status", "1")
								.process(conb)
								.isSuccess();
		return isSuccess;
   }
   /**
    * 委托禁用
    * @param environment
    * @param conb
    * @param deputeid
    * @return
    * @throws Exception
    */
   public static boolean depute_disable(Environment environment,ConnectBean conb,String deputeid) throws Exception{
		boolean isSuccess = WQL.getWO(WQLNames.UWDKWFDEPUTE)
								.addParam("flag", "201")
								.addParam("id", deputeid)
								.addParam("status", "0")
								.process(conb)
								.isSuccess();
		return isSuccess;
   }
   
   
   
   /**
    * 委托启用
    * @param environment
    * @param conb
    * @param deputeid
    * @return
    * @throws Exception
    */
   public static boolean depute_enablesign(Environment environment,ConnectBean conb,String deputeid) throws Exception{
		boolean isSuccess = WQL.getWO(WQLNames.UWDKWFDEPUTE)
								.addParam("flag", "202")
								.addParam("id", deputeid)
								.addParam("isdeputesign", "1")
								.process(conb)
								.isSuccess();
		return isSuccess;
   }
   /**
    * 委托禁用
    * @param environment
    * @param conb
    * @param deputeid
    * @return
    * @throws Exception
    */
   public static boolean depute_disablesign(Environment environment,ConnectBean conb,String deputeid) throws Exception{
		boolean isSuccess = WQL.getWO(WQLNames.UWDKWFDEPUTE)
								.addParam("flag", "202")
								.addParam("id", deputeid)
								.addParam("isdeputesign", "0")
								.process(conb)
								.isSuccess();
		return isSuccess;
   }
   
   
   
   
   
   /**
    * 转办、交办新增
    * @param environment
    * @param conb
    * @param todoid				转办所属待办id
    * @param actor				转办任务当前办理人
    * @param originactor		转办任务原始办理人
    * @param agenttype			转办代理类型
    * @param isdeputesign		是否授权签名
    * @param turnactors			转办目标人
    * @param turntype			转办或交办类型   turn-转办   hand-交办
    * @param turnopertype		办理模式   0-同时办理  1-顺序办理
    * @return
    * @throws Exception
    */
   public static boolean turn_add(Environment environment,ConnectBean conb,String todoid,WFActorBean actor,WFActorBean originactor,String agenttype,String isdeputesign,ArrayList<WFActorBean> turnactors,String turntype,String turnopertype) throws Exception{
	   WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
	   boolean isSuccess = true;
	   String msg = "";
		
	   LogEyeBean log = wdkEnv.startLog(WFFrame.class.getName(),"turn_add");
	   try{
		   //检查转办目标人
		   if(turnactors.size()==0){
			   if(WFConstant.TURN_Type_Turn.equals(turntype)){
				   throw new Exception("转办人为空");
			   }else{
				   throw new Exception("交办人为空");
			   }
		   }
		   
		   bean_todo todo = todo_querySingle(environment, conb, todoid);
		   WFBean wb = wb_queryByPiid(environment, conb, todo.getPiid());
		   String operdt = WDK.getDateTime();
	        ArrayList<bean_todo> todos = (ArrayList<bean_todo>) WQL.getWO(WQLNames.QWDKWFTODO).addParam("flag", "1")
	                .addParam("taskid", todo.getTaskid()).addParam("subtaskid", todo.getSubtaskid())
	                // .addParam("issuspend", "0")
	                .process(conb).getObjects(0, bean_todo.class);
		   //1、当前待办关闭，如果是多人办理任务，则其余多人任务设置为被办理（关闭）--使用flag：105
	       //只关闭当前待办 使用flag：106
		   isSuccess = WQL.getWO(WQLNames.UWDKWFTODO)
		   							.addParam("flag", "106")
		   							.addParam("id", todoid)
		   							.addParam("opertype", turntype)
		   							.addParam("operdt", WDK.getDateTime())
		   							.process(conb)
		   							.isSuccess();
		   //1.1、如果当前待办本身是转办，则需要处理待办对应的转办记录
		   if(isSuccess && "1".equals(todo.getTodotype())){
			   //按转办ID查询所有转办明细，处理所有的转办明细记录（非本待办的转办也需要处理，因为之前相同taskid的待办记录已经被关闭）
			   ArrayList<bean_turn_detail> bdtls = turndetail_query(environment, conb, todo.getTurnid());
			   for(Iterator<bean_turn_detail> it = bdtls.iterator();it.hasNext();){
					bean_turn_detail btd = it.next();
					if(btd!=null && "0".equals(btd.getIscomplete())){
					   //找到转办明细记录，完成转办
					   bean_submit submit = new bean_submit(todo);
					   submit.setOperdt(operdt);
					   turndetail_submit(environment, conb, btd, submit);
					}
			   }
		   }
		   
		   //2、按照转办或交办方式，在转办表里新增转办记录，同时新增待办
		   if(isSuccess){
		       //成功后，往统一待办关闭待办
		       if(todos!=null&&todos.size()>0){
		           todo_sync_close(conb, todos, BaseUnitTodo.COMPLETE);
		       }
			   String turnid = WDK.getUUID();
			   //2.1、删除同名转办记录
			   isSuccess = WQL.getWO(WQLNames.UWDKWFTURN)
						   		.addParam("flag", "403")
						   		.addParam("todoid", todo.getId())
						   		.process(conb)
						   		.isSuccess();
			   //2.1、删除同名转办明细记录
			   isSuccess = WQL.getWO(WQLNames.UWDKWFTURNDTL)
						   		.addParam("flag", "403")
						   		.addParam("origintodoid", todo.getId())
						   		.process(conb)
						   		.isSuccess();
			   
			   //2.1、插入主表
			   isSuccess = WQL.getWO(WQLNames.UWDKWFTURN)
			   					.addParam("flag", "1")
			   					.addParam("id", turnid)
			   					.addParam("todoid", todoid)
			   					.addParam("pdid", todo.getPdid())
			   					.addParam("piid", todo.getPiid())
			   					.addParam("nodename", todo.getNodename())
			   					.addParam("nodepage", todo.getNodepage())
			   					.addParam("nodetitle", todo.getNodetitle())
			   					.addParam("nodetype", todo.getNodetype())
			   					.addParam("signtype", todo.getSigntype())
			   					.addParam("taskid", todo.getTaskid())
			   					.addParam("subtaskid", todo.getSubtaskid())
			   					.addParam("actorid", todo.getActorid())
			   					.addParam("actortype", todo.getActortype())
			   					.addParam("deptuuid", todo.getDeptuuid())
			   					.addParam("createdt", operdt)
			   					.addParam("remark", "")
			   					.addParam("turntype", turntype)
			   					.addParam("opertype", turnopertype)
			   					.addParam("status", "1")
			   					.process(conb)
			   					.isSuccess();
			   
			   //2.2、按顺序插入明细表并生成待办记录
			   for(int i=0;i<turnactors.size();i++){
				   WFActorBean turnactor = turnactors.get(i);
				   String subtodoid = WDK.getUUID();
				   String turndtlid = WDK.getUUID();
				   
				   //如果是顺序办理
				   if("1".equals(turnopertype)){
					   //第一个之外的待办记录就不分配了
					   if(i>0){
						   subtodoid = "";
					   }
				   }
				   
				   //2.2.1、插入交办明细表
				   isSuccess = WQL.getWO(WQLNames.UWDKWFTURNDTL)
				   					.addParam("flag", "1")
				   					.addParam("id", turndtlid)
				   					.addParam("pdid", todo.getPdid())
				   					.addParam("piid", todo.getPiid())
				   					.addParam("origintodoid", todo.getId())
				   					.addParam("turnid", turnid)
				   					.addParam("todoid", subtodoid)
				   					.addParam("actorid", turnactor.getActorId())
				   					.addParam("actortype", turnactor.getActorType())
				   					.addParam("deptuuid", turnactor.getDeptuuid())
				   					.addParam("iscomplete", "0")
				   					.addParam("operdt", "")
				   					.addParam("ordercode", i>9?"00"+i:"000"+i)
				   					.addParam("createdt", operdt)
				   					.addParam("status", "1")
				   					.process(conb)
				   					.isSuccess();
				   
				   //如果是顺序办理
				   if("1".equals(turnopertype)){
					   //第一个之外的待办记录就不分配了
					   if(i>0){
						   continue;
					   }
				   }
				   bean_todo turntodo = new bean_todo();
				   turntodo.setActorid(turnactor.getActorId());
				   turntodo.setActortype(turnactor.getActorType());
				   turntodo.setDeptuuid(turnactor.getDeptuuid());
				   turntodo.setAgenttype(WFConstant.Agenttype_Self);
				   turntodo.setId(subtodoid);
				   turntodo.setApp_uuid(WDK.getPropPUB(WDKConstant.PROP_cfg_sys_appuuid));
				   turntodo.setTodosort(todo.getTodosort());
				   turntodo.setLimitdt(todo.getLimitdt());
				   turntodo.setLimittime(todo.getLimittime());
				   turntodo.setLockactorid("");
				   turntodo.setLockactortype("");
				   turntodo.setLockdeptuuid("");
				   turntodo.setLockdt("");
				   turntodo.setNodename(todo.getNodename());
				   turntodo.setNodepage(todo.getNodepage());
				   turntodo.setNodetitle(todo.getNodetitle());
				   turntodo.setNodetype(todo.getNodetype());
				   turntodo.setOpercomment("");//
				   turntodo.setOperdt(WDK.getDateTime());//转办也要写操作时间，这样在历史意见和本人经办中就能查到了
				   turntodo.setOpertype("");
				   turntodo.setOriginactorid("");
				   turntodo.setOriginactortype("");
				   turntodo.setOrigindeptuuid("");
				   turntodo.setOverduetime(todo.getOverduetime());
				   turntodo.setPdid(todo.getPdid());
				   turntodo.setPiid(todo.getPiid());
				   
				   turntodo.setPretodoid(todoid);
				   turntodo.setSendactorid(todo.getActorid());
				   turntodo.setSendactortype(todo.getActortype());
				   turntodo.setSenddeptuuid(todo.getDeptuuid());
				   turntodo.setSenddt(operdt);
				   turntodo.setSigntype(todo.getSigntype());
				   turntodo.setStatus(WFConstant.TODO_Status_wait);
				   turntodo.setTaskid(todo.getTaskid());
				  // turntodo.setSubtaskid(todo.getSubtaskid());
				   if(StringUtil.isBlank(todo.getSubtaskid())){
					   turntodo.setSubtaskid(todo.getTaskid()+""+i);
				   }else{
					   turntodo.setSubtaskid(todo.getSubtaskid());
				   }
				  
				   turntodo.setTitle(todo.getTitle());
				   if(WFConstant.TURN_Type_Turn.equals(turntype)){
					   turntodo.setTodotype(WFConstant.TODO_Type_Turn);
				   }else{
					   turntodo.setTodotype(WFConstant.TODO_Type_Hand);	   
				   }
				   turntodo.setTurnid(turnid);
				   turntodo.setUnitid(todo.getUnitid());
					
				   turntodo.setWarnyellowdt(todo.getWarnyellowdt());
				   turntodo.setWarnyellowtime(todo.getWarnyellowtime());
				   turntodo.setWarnreddt(todo.getWarnreddt());
				   turntodo.setWarnredtime(todo.getWarnredtime());
				   turntodo.setCreatedt(operdt);
				   
				   isSuccess = todo_add(environment, conb, turntodo );
			   }
			   
		   }
		   
		   //6、记录流水
		   if(isSuccess){
			   String taskrecordId = WDK.getUUID();
			   bean_taskrecord tr = new bean_taskrecord();
			   tr.setActorid(actor.getActorId());
			   tr.setActortype(actor.getActorType());
			   tr.setAgenttype(agenttype);
			   tr.setCreateactorid(wb.getCreate_actorid());
			   tr.setCreateactortype(wb.getCreate_actortype());
			   tr.setCreatedeptuuid(wb.getCreate_deptuuid());
			   tr.setCreatedt(wb.getCreate_dt());
			   tr.setDeptuuid(actor.getDeptuuid());
			   tr.setId(taskrecordId);
			   tr.setNodename(todo.getNodename());
			   tr.setNodepage(todo.getNodepage());
			   tr.setNodetitle(todo.getNodetitle());
			   tr.setNodetype(todo.getNodetype());
			   tr.setOpercomment("");
			   tr.setOperdt(operdt);
			   if(WFConstant.TURN_Type_Turn.equals(turntype)){
				   tr.setOpertype(WFConstant.Opertype_Turn);
			   }else{
				   tr.setOpertype(WFConstant.Opertype_Hand);
			   }
			   if(null!=originactor){
				   tr.setOriginactorid(originactor.getActorId());
				   tr.setOriginactortype(originactor.getActorType());
				   tr.setOrigindeptuuid(originactor.getDeptuuid());
			   }
			   tr.setPdid(todo.getPdid());
			   tr.setPiid(todo.getPiid());
			   tr.setPreid(wb.getVar_taskrecordId());
			   tr.setSigntype(todo.getSigntype());
			   tr.setStatus(WFConstant.Record_Status_Normal);
			   tr.setSubtaskid(todo.getSubtaskid());
			   tr.setTarget(todo.getNodename());
			   tr.setTargetactorls(turnactors);
			   tr.setTaskcreatedt(operdt);
			   tr.setTaskid(todo.getTaskid());
			   tr.setTodoid(todo.getId());	
			   isSuccess = taskrecord_add(environment, conb, tr);
			   wb.setVar_taskrecordId(taskrecordId);
	//            WFNodeBean wnb = wb.getNodeBean(todo.getNodename());
	//            if (wnb.isSign()) {
	//                wnb.updateActor(todo.getActorid(), todo.getActortype(), todo.getDeptuuid(), "", operdt);
	//            }
			   wb_save(environment, conb, wb);
		   }
	   }catch (Exception e) {
   			isSuccess = false;
   			msg = e.getMessage();
	   }finally{
			wdkEnv.endLog(log,isSuccess,msg);//日志跟踪
			if(isSuccess == false){
				throw new Exception(msg);
			}
	   }
	   
	   return isSuccess;
   }
   
   /**
    * 转办、交办新增--有意见方法
    * @param environment
    * @param conb
    * @param todoid				转办所属待办id
    * @param actor				转办任务当前办理人
    * @param originactor		转办任务原始办理人
    * @param agenttype			转办代理类型
    * @param isdeputesign		是否授权签名
    * @param turnactors			转办目标人
    * @param turntype			转办或交办类型   turn-转办   hand-交办
    * @param turnopertype		办理模式   0-同时办理  1-顺序办理
    * @return
    * @throws Exception
    */
   public static boolean turn_add_new(Environment environment,ConnectBean conb,String todoid,WFActorBean actor,WFActorBean originactor,String agenttype,String isdeputesign,ArrayList<WFActorBean> turnactors,String turntype,String turnopertype,String opercomment) throws Exception{
	   	boolean isSuccess = turn_add(environment, conb, todoid, actor, originactor, agenttype, isdeputesign, turnactors, turntype, turnopertype);
	   	if(isSuccess){
			String mainWoName = "WDK_WF_TODO";
			WQLObject mainWO = WQLObject.getWQLObject(mainWoName);
			HashMap<String,String> values = new HashMap<String,String>();
			values.put("OPERCOMMENT", opercomment);
			mainWO.update(values, " ID=? ", new String[]{todoid},  conb);
	   	}	   
	   	return isSuccess;
   }
   
   /**
    * 查询转办记录
    * @param environment
    * @param conb
    * @param turnid
    * @return
    * @throws Exception
    */
   public static bean_turn turn_query(Environment environment,ConnectBean conb,String turnid) throws Exception{
	   bean_turn turn = (bean_turn) WQL.getWO(WQLNames.QWDKWFTURN)
				   						.addParam("flag", "1")
				   						.addParam("id", turnid)
				   						.process(conb)
				   						.getObject(0, bean_turn.class);
	   return turn;
   }
   
   /**
    * 完成主记录
    * @param environment
    * @param conb
    * @param turn
    * @param submit
    * @return
    * @throws Exception
    */
   public static boolean turn_submit(Environment environment,ConnectBean conb,bean_turn turn,bean_submit submit) throws Exception{
	   boolean isSuccess = false;
	   isSuccess = WQL.getWO(WQLNames.UWDKWFTURN)
	   					.addParam("flag", "202")
	   					.addParam("id", turn.getId())
	   					.addParam("operdt", submit.getOperdt())
	   					.addParam("status", "1")
	   					.process(conb)
	   					.isSuccess();
	   return isSuccess;
   }
   
   /**
    * 查询转办明细记录
    * @param environment
    * @param conb
    * @param turnid
    * @return
    * @throws Exception
    */
   public static ArrayList<bean_turn_detail> turndetail_query(Environment environment,ConnectBean conb,String turnid) throws Exception{
	   ArrayList dtls = WQL.getWO(WQLNames.QWDKWFTURNDTL)
							.addParam("flag", "1")
							.addParam("turnid", turnid)
							.addParam("orderby", "ordercode asc")
							.process(conb)
							.getObjects(0, bean_turn_detail.class);
	   return dtls;
   }
   
   /**
    * 查询指定个人的明细转办任务
    * @param environment
    * @param conb
    * @param turnid
    * @param todoid
    * @return
    * @throws Exception
    */
   public static bean_turn_detail turndetail_querySingle(Environment environment,ConnectBean conb,String turnid,String todoid) throws Exception{
	   ArrayList dtls = WQL.getWO(WQLNames.QWDKWFTURNDTL)
							.addParam("flag", "1")
							.addParam("turnid", turnid)
							.process(conb)
							.getObjects(0, bean_turn_detail.class);
	   bean_turn_detail btd = null;
	   for(Iterator<bean_turn_detail> it= dtls.iterator();it.hasNext();){
		   bean_turn_detail dtl = it.next();
		   if(dtl.getTodoid().equals(todoid)){
			   btd = dtl;
			   break;
		   }
	   }
	   return btd;
   }
   public static bean_turn_detail turndetail_querySingle(Environment environment,ConnectBean conb,String todoid) throws Exception{
	   bean_turn_detail btd = (bean_turn_detail) WQL.getWO(WQLNames.QWDKWFTURNDTL)
													.addParam("flag", "1")
													.addParam("todoid", todoid)
													.process(conb)
													.getObject(0, bean_turn_detail.class);
	   return btd;
   }
   
   
   /**
    * 根据流程模板删除转办主记录
    * @param environment
    * @param conb
    * @param pdid
    * @return
    * @throws Exception
    */
   public static boolean turn_removeByPdid(Environment environment,ConnectBean conb,String pdid) throws Exception{
		boolean isSuccess = WQL.getWO(WQLNames.UWDKWFTURN)
								.addParam("flag", "401")
								.addParam("pdid", pdid)
								.process(conb)
								.isSuccess();
		return isSuccess;
   }
   /**
    * 根据流程实例删除转办主记录
    * @param environment
    * @param conb
    * @param pdid
    * @return
    * @throws Exception
    */
   public static boolean turn_removeByPiid(Environment environment,ConnectBean conb,String piid) throws Exception{
		boolean isSuccess = WQL.getWO(WQLNames.UWDKWFTURN)
								.addParam("flag", "402")
								.addParam("piid", piid)
								.process(conb)
								.isSuccess();
		return isSuccess;
  }
   
   
   /**
    * 提交转办或交办任务
    * @param environment
    * @param conb
    * @param bdetail
    * @param submit
    * @return
    * @throws Exception
    */
   public static boolean turndetail_submit(Environment environment,ConnectBean conb,bean_turn_detail bdetail,bean_submit submit) throws Exception{
	   boolean isSuccess = false;
	   if(bdetail!=null){
    	   isSuccess = WQL.getWO(WQLNames.UWDKWFTURNDTL)
    	   					.addParam("flag", "202")
    	   					.addParam("id", bdetail.getId())
    	   					.addParam("iscomplete", "1")
    	   					.addParam("operdt", submit.getOperdt())
    	   					.addParam("opercomment", submit.getOpercomment())
    	   					.process(conb)
    	   					.isSuccess();
	   }
	   return isSuccess;
   }
   
   /**
    * 根据流程模板删除转办明细
    * @param environment
    * @param conb
    * @param pdid
    * @return
    * @throws Exception
    */
   public static boolean turndetail_removeByPdid(Environment environment,ConnectBean conb,String pdid) throws Exception{
		boolean isSuccess = WQL.getWO(WQLNames.UWDKWFTURNDTL)
								.addParam("flag", "401")
								.addParam("pdid", pdid)
								.process(conb)
								.isSuccess();
		return isSuccess;
   }
   /**
    * 根据流程实例删除转办明细
    * @param environment
    * @param conb
    * @param pdid
    * @return
    * @throws Exception
    */
   public static boolean turndetail_removeByPiid(Environment environment,ConnectBean conb,String piid) throws Exception{
		boolean isSuccess = WQL.getWO(WQLNames.UWDKWFTURNDTL)
								.addParam("flag", "402")
								.addParam("piid", piid)
								.process(conb)
								.isSuccess();
		return isSuccess;
	}
   
   	/*********************************
   	 * 实现父类抽象方法
   	 */
	@Override
	public boolean todoAdd(WDKContext wdkctx,WFBean wb,String nodename,WFActorBean actor,String taskid,String subtaskid){
	   return todo_add(wdkctx.getEnvironment(), wdkctx.getConnectBean(), wb, nodename, actor, taskid, subtaskid);
	}
   
	@Override
	public boolean taskrecordAdd(WDKContext wdkctx,bean_taskrecord taskrecord) throws Exception{
		return taskrecord_add(wdkctx.getEnvironment(), wdkctx.getConnectBean(), taskrecord);
	}
	
    @Override
    public boolean moveToHistory(WDKContext wdkctx, WFBean wb, String operdt) throws Exception {
        boolean isSuccess = true;
        Environment environment = wdkctx.getEnvironment();
        ConnectBean conb = wdkctx.getConnectBean();
        //流水记录移至历史库
        isSuccess = taskrecord_remove_history(environment, conb, wb.getPiid(),operdt);
        
        //添加历史流程记录
        isSuccess = pihistory_add(environment,conb,wb,operdt);
        
        //抄送记录删除并移至历史库
//          isSuccess = WFFrame.cc_remove_histor(environment, conb, btask.getPiid(),submit.getOperdt());
        
        //将所有关联待办删除并移动到历史库
        isSuccess = todo_remove_history(environment, conb,wb.getPiid(),operdt);
        
        //将活动流程变量移动到历史流程变量中
        if(isSuccess){
            //a、插入历史库
            WFEngine.wb_save_history(environment, conb, wb.getPdid(), wb.getPiid(), wb);
            
            //b、删除活动库
            WFEngine.wb_remove(environment, conb, wb.getPiid());
        }
        return isSuccess;
    }
}
