//package com.nci.platform.wf;
//
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;
//
//import org.apache.commons.lang.StringUtils;
//import org.jbpm.api.cmd.Environment;
//import org.jbpm.pvm.internal.id.DatabaseDbidGenerator;
//import org.jbpm.pvm.internal.id.DbidGenerator;
//import org.wdk.WDK;
//import org.wdk.WDKConstant;
//import org.wdk.core.base.BaseSessionUser;
//import org.wdk.core.base.WorkFlowAction;
//import org.wdk.core.bean.WDKEnvironment;
//import org.wdk.core.bean.WDKLogger;
//import org.wdk.core.util.uJson;
//import org.wdk.module.logeye.LogEye;
//import org.wdk.module.logeye.bean.LogEyeBean;
//import org.wdk.module.logeye.bean.LogEyeTraceBean;
//import org.wdk.module.wf.WFConstant;
//import org.wdk.module.wf.engine.core.bean.WFActorBean;
//import org.wdk.module.wf.engine.core.bean.WFBean;
//import org.wdk.module.wf.engine.core.bean.WFDecisionConditionBean;
//import org.wdk.module.wf.engine.core.bean.WFNodeBean;
//import org.wdk.module.wf.engine.core.handler.handlerDecision;
//import org.wdk.module.wf.frame.core.bean.bean_submit;
//import org.wdk.module.wf.frame.core.bean.bean_submit_target;
//import org.wdk.module.wf.frame.core.bean.bean_todo;
//import org.wdk.module.wql.WQL;
//import org.wdk.module.wql.core.bean.ConnectBean;
//import org.wdk.module.wql.core.bean.ErrorBean;
//import org.wdk.module.wql.core.bean.ResultBean;
//import org.wdk.module.wql.core.bean.WQLData;
//import org.wdk.module.wql.core.bean.WQLModule;
//import org.wdk.module.wql.core.bean.WQLObject;
//
//import wql.WQLNames;
//
//import com.nci.platform.bdl.BDL;
//import com.nci.platform.msg.MSG;
//import com.nci.platform.msg.bean.MSGResultBean;
//import com.nci.platform.pb.base.BusiWQL;
//import com.nci.platform.pb.base.IMBaseObject;
//import com.nci.platform.pb.base.IMService;
//import com.nci.platform.pb.base.WFOperationService;
//import com.nci.platform.pb.handler.SessionUser;
//import com.nci.platform.pb.uum.UUM;
//import com.nci.platform.util.CommonUtil;
//import com.nci.platform.util.DateTransUtil;
//import com.nci.platform.util.SmsUtil;
//import com.nci.platform.util.StringUtil;
//import com.nci.platform.wf.base.IWFOperation;
//import com.nci.platform.wf.base.TodoBean;
//import com.nci.platform.wf.frame.WFFrame;
//
///**
// * 类名：com.nci.platform.wf.WFBaseAction <br/>
// * 描述：基于JBPM的工作流公用界面后台Action类<br/>
// * 版权：Copyright (c) 2015 杭州新世纪电子科技有限公司
// * <p>
// * </p>
// * History:<br>
// * 1、2015-6-17 上午11:15:55 yub
// * 
// * @author yub
// */
//public class WFBaseAction extends WorkFlowAction {
//
//	private static WDKLogger logger = new WDKLogger(WFBaseAction.class.getName());
//	
//    private IWFOperation operation;// 流程操作帮助类：在流程未完全实现之前，采用静态数据方式驱动，等流程改造完毕之后，采用流程的API驱动
//
//    /**
//     * 
//     *构造函数:里面增加：IWFOperation的多态实现
//     *<p>
//     * <br>
//     */
//    public WFBaseAction() {
//        super();
//        try {
//            String classname = WDK.getPropAction("wf.operation");
//            if (classname != null && !"".equals(classname)) {
//                operation = (IWFOperation) Class.forName(classname).newInstance();
//            }
//        } catch (Exception e) {
//        } finally {
//            if (operation == null) {
//                // 发生异常的话
//                operation = new WDKWFOperation();
//            }
//        }
//    }
//
//    public boolean todo_query(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
//        String id = _getParameter("id", request, response);
//        bean_todo todo = WFFrame.todo_querySingle(environment, conb, id);
//        todo = WFFrame.todo_addExtraParam(environment, conb, todo);
//        JSONObject jsonObject = null == todo ? new JSONObject() : todo.toJSON();
//        if (todo != null) {
//            WFNodeBean nodebane = WFFrame.pub_getFirstNode(environment, conb, todo.getPdid());
//            if (todo.getNodename().equals(nodebane.getNodename())) {
//                jsonObject.put("is_first", "1");
//            } else {
//                jsonObject.put("is_first", "0");
//            }
//            String is0or1 = new WDKWFOperation().getNodeInputOpinion(WFFrame.wb_queryByPiid(environment, conb, todo.getPiid()), environment, conb, todo.getNodename());//dddd;
//            jsonObject.put("isshownotion", is0or1);
//
//        }
//        _PRINT(request, response, conb, jsonObject.toString());
//        return true;
//    }
//
//    /**
//     * 说明：增办：左边，待选择树
//     *<p>
//     * Method getNodeParticipants
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean getNodeParticipants(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        BaseSessionUser user = _getSessionuser(request, response);
//        String deptuuid = user.getDeptuuid();// 默认获取当前登录人的部门ID
//        String todoid = _getParameter("todoid", request, response);
//        if (todoid != null && !"".equals(todoid.trim())) {
//            bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
//            if (todo != null) {
//                deptuuid = todo.getDeptuuid();
//            }
//        }
//        JSONArray jres = operation.getUsersByCurrentDeptNoDept(environment, conb, deptuuid, todoid);
//        _PRINT(request, response, jres.toString());
//        return true;
//    }
//
//    /**
//     * 说明：增办：右边，已选择树
//     *<p>
//     * Method getNodeTaskParticipants
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean getNodeTaskParticipants(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        String todoid = _getParameter("todoid", request, response);
//        JSONArray jres = operation.getTodoSelectedUsers(environment, conb, todoid);
//        _PRINT(request, response, jres.toString());
//        return true;
//    }
//
//    /**
//     * 说明：审批意见模板
//     *<p>
//     * Method getNotionTemplates
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean getNotionTemplates(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        String firstSort = _getParameter("firstSort", request, response);
//        String secondSort = _getParameter("secondSort", request, response);
//        String userid = _getParameter("userid", request, response);
//        String app_code = WDK.getPropPUB(WDKConstant.PROP_cfg_sys_appuuid);
//        JSONArray jres = operation.getNotionTemplates(environment, conb, firstSort, secondSort,userid ,app_code);
//        _PRINT(request, response, jres.toString());
//        return true;
//    }
//
//    /**
//     * DONE 说明：获取当前部门下的人员
//     *<p>
//     * Method getCurrentDeptUsers
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean getCurrentDeptUsers(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        // 获取当前部门下的人员
//        String todoid = _getParameter("todoid", request, response);
//        BaseSessionUser user = _getSessionuser(request, response);
//        String deptuuid = user.getDeptuuid();// 默认获取当前登录人的部门ID
//        if (todoid != null && !"".equals(todoid.trim())) {
//            bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
//            if (todo != null) {
//                deptuuid = todo.getDeptuuid();
//            }
//        }
//        JSONArray jres = operation.getUsersByCurrentDept(environment, conb, deptuuid, todoid);
//        Map<String,IMBaseObject> imMap = getOnlineStatus(environment, conb, (SessionUser)user, jres);
//        if(imMap!=null && imMap.size()>0){
//        	//循环更新用户的在线感知状态
//        	jres = updateUserOnline(jres, imMap);
//        }
//        JSONArray jrows = WDK.DataFormat_Tree(jres, "id", "text", "parentId", "iconCls", "type,deptuuid,ext_url,ext_title");
//        _PRINT(request, response, jrows.toString());
//        return true;
//    }
//    
//    /**
//     * 说明：获得用户的在线感知状态<br>
//     * @param environment
//     * @param conb
//     * @param sessionUser
//     * @param jres
//     * @return
//     */
//    public Map getOnlineStatus(Environment environment, ConnectBean conb,SessionUser sessionUser,JSONArray jres){
//    	WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
//    	String enable =  WDK.getNodeParam("im_workflow_enable");
//        Map<String,IMBaseObject> imMap = new HashMap<String, IMBaseObject>();
//        if (enable != null && "1".equals(enable) && wdkEnv.getEnvType() == WDKEnvironment.WDKENV_TYPE_SERVLET) {
//        	//只有当node.xml参数im_workflow_enable=1并且当前的WDK环境为servlet环境时才启用IM在线感知，webservices环境下不启用在线感知（移动端目前是在webservices环境下，不需要IM在线感知）
//            IMService service;
//            try {
//                Object imObject = Class.forName(WDK.getNodeParam("im_workflow_adapter")).newInstance();
//                if (imObject != null && imObject instanceof IMService) {
//                    ArrayList<String> personIdList = new ArrayList<String>();
//                    //获得用户ID列表
//                    personIdList = getPersonuuid(jres, personIdList);
//                    service = (IMService) imObject;
//                    imMap = service.getIMBaseObjectMap(conb, sessionUser.getLoginname(), personIdList.toArray(new String[personIdList.size()]));
//                }
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
//        return imMap;
//    }
//    
//    /**
//     * 说明：解析部门用户的json数组对象，从中取出所包含的用户ID<br>
//     * @param jres
//     * @param personIdList
//     * @return
//     */
//    public ArrayList getPersonuuid(JSONArray jres, ArrayList<String> personIdList){
//    	for(int i=0;jres!=null && i<jres.size();i++){
//    		JSONObject object = jres.getJSONObject(i);
//    		if("user".equalsIgnoreCase(object.getString("type"))){
//    			personIdList.add(object.getString("id"));
//    		} else if(object.containsKey("children")){
//    			JSONArray children = object.getJSONArray("children");
//    			personIdList = getPersonuuid(children, personIdList);
//    		}
//    	}
//    	return personIdList;
//    }
//
//    /**
//     * 说明：更新用户在线感知状态<br>
//     * @param jres
//     * @param personIdList
//     * @return
//     */
//    public JSONArray updateUserOnline(JSONArray jres, Map<String,IMBaseObject> imMap){
//    	for(int i=0;jres!=null && i<jres.size();i++){
//    		JSONObject object = jres.getJSONObject(i);
//    		if("user".equalsIgnoreCase(object.getString("type"))){
//    			String userId = object.getString("id");
//    			if(imMap.containsKey(userId)){
//                    IMBaseObject imObjec  = imMap.get(userId);
//                    object.put("iconCls", imObjec.getIconClass());
//                    object.put("ext_title", imObjec.getName());
//                    object.put("ext_url", imObjec.getUrl());
//                }else{
//                	object.put("ext_title","");
//                	object.put("ext_url", "");
//                }
//    		} else if(object.containsKey("children")){
//    			JSONArray children = object.getJSONArray("children");
//    			jres = updateUserOnline(children, imMap);
//    		}
//    	}
//    	return jres;
//    }
//
//    
//    /**
//     * DONE 说明：获取当前部门及子部门下的所有人员
//     *<p>
//     * Method getCurrentDeptUsers
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean getCurrentDeptAllUsers(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        // 获取当前部门下的人员
//        String todoid = _getParameter("todoid", request, response);
//        BaseSessionUser user = _getSessionuser(request, response);
//        String deptuuid = user.getDeptuuid();// 默认获取当前登录人的部门ID
//        if (todoid != null && !"".equals(todoid.trim())) {
//            bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
//            if (todo != null) {
//                deptuuid = todo.getDeptuuid();
//            }
//        }
//        JSONArray jres = operation.getAllUsersByCurrentDept(environment, conb, deptuuid, todoid);
//        JSONArray jrows = WDK.DataFormat_Tree(jres, "id", "text", "parentId", "iconCls", "type,deptuuid");
//        _PRINT(request, response, jrows.toString());
//        return true;
//    }
//    
//    /**
//     * DONE 说明：获取当前机构下所有部门和所有人员
//     *<p>
//     * Method getCurrentDeptUsers
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean getAllDeptAllUsers(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        // 获取当前部门下的人员
//        String todoid = _getParameter("todoid", request, response);
//        String orguuid = _getParameter("orguuid", request, response);
//        JSONArray jres = operation.getAllUsersByCurrentDept(environment, conb, orguuid, todoid);
//        JSONArray jrows = WDK.DataFormat_Tree(jres, "id", "text", "parentId", "iconCls", "type,deptuuid");
//        _PRINT(request, response, jrows.toString());
//        return true;
//    }
//
//    /**
//     * 说明：获取树形---空的节点
//     *<p>
//     * Method getNullTreeNodes
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean getNullTreeNodes(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        JSONArray jres = new JSONArray();
//        _PRINT(request, response, jres.toString());
//        return true;
//    }
//
//    /**
//     * 说明：初始化交办、转办页面数据
//     *<p>
//     * Method initAssignData
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean initAssignData(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        String todoid = _getParameter("todoid", request, response);
//
//        JSONObject jres = operation.getTodoIndo(environment, conb, todoid);
//        // jres
//        // .put("all_nodes",
//        // "[{nodeid:'1',nodename:'111',issign:'true'},{nodeid:'2',nodename:'222',checked:'checked',issign:'false'},{nodeid:'3',nodename:'333',issign:'false'}]");
//        _PRINT(request, response, jres.toString());
//        return true;
//    }
//
//    /**
//     * 说明：
//     *<p>
//     * Method getAllNodeData
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean getAllNodeData(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        String todoid = _getParameter("todoid", request, response);
//        JSONObject jres = operation.getTodoIndo(environment, conb, todoid);
//        TodoBean todo = operation.getTodoBean(environment, conb, todoid);
//        if(jres==null){
//            jres = new JSONObject();
//        }
//        JSONArray childrenArray = operation.getAllActivityList(environment, conb, todo.getPdid(), todo.getPiid(), todo.getNodename());
//        jres.put("all_nodes", childrenArray);
//        // jres
//        // .put("all_nodes",
//        // "[{nodeid:'1',nodename:'111',issign:'true'},{nodeid:'2',nodename:'222',checked:'checked',issign:'false'},{nodeid:'3',nodename:'333',issign:'false'}]");
//        _PRINT(request, response, jres.toString());
//        return true;
//    }
//    
//    /**
//     * 说明：根据环节，获取环节对应的参与者
//     *<p>
//     * Method getCurrentUsersByNodeId
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean getCurrentUsersByNodeId(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        String todoid = _getParameter("todoid", request, response);
//        if (todoid == null || "".equals(todoid)) {
//            throw new Exception("todoid不能为空！");
//        }
//        String direction = _getParameter("direction", request, response);//流程提交方向 0-向后推进（退回） 1-向前推进
//        TodoBean todo = operation.getTodoBean(environment, conb, todoid);
//        String isfilter = _getParameter("isfilter", request, response);//是否只取实际参与过该环节的人员
//        boolean bfilter = false;
//        if ("1".equals(isfilter)) {
//            bfilter = true;
//        }
//        String nodename = _getParameter("nodeid", request, response);
//        if (nodename == null || "".equals(nodename)) {
//            nodename = (todo==null?"":todo.getNodename());
//        }
//        String rolefilterpara = _getParameter("rolefilterpara", request, response);//人员过滤参数，为“specialsend”时取特送过滤参数（FILTERDEPART_SPSEND、FILTERPERSON_SPSEND），其他取正常参数（FILTERDEPART、FILTERPERSON）
//        SessionUser sessionUser = (SessionUser) _getSessionuser(request, response);
//        JSONArray jrows = operation.getNodeUsersByNodeName(sessionUser, environment, conb, todoid, nodename, bfilter,direction,rolefilterpara);
//        JSONArray jtrees = WDK.DataFormat_Tree(jrows, "id", "text", "parentId", "iconCls", "type,deptuuid,locateid,ext_title,ext_url");
//        _PRINT(request, response, jtrees.toString());
//        return true;
//    }
//    
//
//    /**
//     * 说明：根据待办ID，获取当前环节的下一环节列表（根据流程定义）
//     *<p>
//     * Method getNextActivityList
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean getNextActivityList(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        String todoid = _getParameter("todoid", request, response);
//        if (todoid == null || "".equals(todoid)) {
//            throw new Exception("todoid不能为空！");
//        }
//        TodoBean todo = operation.getTodoBean(environment, conb, todoid);
//        String pdid = _getParameter("pdid", request, response);
//        if (pdid == null || "".equals(pdid)) {
//            pdid = todo.getPiid();
//        }
//        String nodename = _getParameter("nodename", request, response);
//        if (nodename == null || "".equals(nodename)) {
//            nodename = todo.getNodename();
//        }
//        String piid = _getParameter("piid", request, response);
//        if (piid == null || "".equals(piid)) {
//            piid = todo.getPiid();
//        }
//        JSONArray childrenArray = operation.getChildrenActivityList(environment, conb, pdid, piid, nodename);
//        
//        _PRINT(request, response, childrenArray.toString());
//        return true;
//    }
//    
//
//    /**
//     * 说明：根据待办ID，获取可回退的节点列表（按流程定义获取路径）
//     *<p>
//     * Method getRollBackActivityList
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean getRollBackActivityList(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        // 从前端获取待办ID，根据待办ID，获取流程模板，再根据模板，或者前序环节列表
//        String todoid = _getParameter("todoid", request, response);
//        if (todoid == null || "".equals(todoid)) {
//            throw new Exception("todoid不能为空！");
//        }
//        TodoBean todo = operation.getTodoBean(environment, conb, todoid);
//
//        String pdid = _getParameter("pdid", request, response);
//        if (pdid == null || "".equals(pdid)) {
//            pdid = todo.getPdid();
//        }
//        String piid = _getParameter("piid", request, response);
//        if (piid == null || "".equals(piid)) {
//            piid = todo.getPiid();
//        }
//        String nodename = _getParameter("nodename", request, response);
//        if (nodename == null || "".equals(nodename)) {
//            nodename = todo.getNodename();
//        }
//        JSONArray preActivityList = operation.getPreActivityList(environment, conb, pdid, piid, nodename);
//        _PRINT(request, response, preActivityList.toString());
//        return true;
//    }
//
//    /**
//     * 说明：
//     *<p>
//     * Method todo_signprocess
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean todo_signprocess(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        String todoid = _getParameter("todoid", request, response);
//        String querytype = _getParameter("querytype", request, response);//查询方式 todo;从待办中查询 其他-从流程变量中查询
//        if (todoid == null || "".equals(todoid)) {
//            throw new Exception("todoid不能为空！");
//        }
//        TodoBean todo = operation.getTodoBean(environment, conb, todoid);
//        String nodename = todo.getNodename();
//        String piid = todo.getPiid();
//        String pdid = todo.getPdid();
//        String taskid = todo.getTaskid();
//        SessionUser sessionUser = (SessionUser) _getSessionuser(request, response);
//        JSONArray jactors ;
//        if("todo".equals(querytype)){
//        	//从待办中查询会签信息
//        	jactors = new JSONArray();
//        	
//        	WQLModule wm = WQLModule.getWQLModule(IWFOperation.CODE_TYPE_PERSON);//人员代码模型，用于将人员ID转换成NAME
//        	
//        	//查询所有为完成的待办
//        	ArrayList<bean_todo> rows = BusiWQL.getBusiWQL(WQLNames.QWDKWFTODO)
//				        		.addParam("flag", "201")
//				        		.addParam("issuspend", "0")
//				        		.addParam("status", "0")
//				        		.addParam("pdid", pdid)
//				        		.addParam("piid", piid)
//				        		.addParam("nodename", nodename)
//				        		.addParam("taskid", taskid)
//				        		.process(conb)
//				        		.getObjects(0, bean_todo.class);
//        	
//        	for(int i=0;i<rows.size();i++){
//        		bean_todo row = rows.get(i);
//        		
//        		if (sessionUser != null && sessionUser.getPersonuuid().equals(row.getActorid())) {
//                    // 送达页面会签信息中建议不显示当前登录人的信息
//                    continue;
//                }
//        		
//        		JSONObject actorObject=  new JSONObject();
//                if(wm!=null){
//                	actorObject.put("actorid", wm.id2name(row.getActorid(), "person_name", conb));
//                }else{
//                	actorObject.put("actorid", row.getActorid());
//                }
//        		actorObject.put("iscomplete", false);
//                actorObject.put("ispass", false);
//                actorObject.put("comment", "");
//                actorObject.put("operdt", "");
//                actorObject.put("agenttype", row.getAgenttype());
//        		jactors.add(actorObject);
//        	}
//        }else{
//        	//从流程变量中查询会签信息
//        	jactors = operation.getWFActorList(environment, conb, sessionUser, pdid, piid, nodename);
//        }
//        JSONObject jres = new JSONObject();
//        jres.put("code", "1");
//        jres.put("desc", "加载成功");
//        jres.put("actors", jactors);
//        _PRINT(request, response, jres.toString());
//        return true;
//    }
//    
//    
//    /**
//     * 说明：特送核心业务
//     *<p>
//     * Method todo_specialsubmit_core
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @param dataStr
//     * @return
//     * @throws Exception
//     */
//    public boolean todo_specialsubmit_core(HttpServletRequest request,HttpServletResponse response,Environment environment,ConnectBean conb,String dataStr) throws Exception {
//		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
//		boolean isSuccess = true;
//		String msg = "";
//    	
//    	LogEyeBean log = wdkEnv.startLog( WFBaseAction.class.getName(),"todo_specialsubmit_core" );//日志跟踪
//    	try{
//	        HashMap paramMap = new HashMap();
//	        if (dataStr != null && dataStr.trim().length() > 0) {
//	            paramMap = uJson.resolveJsonToMap(dataStr);
//	        } else {
//	            paramMap = _getParameterMap(request, response);
//	        }
//	        
//	        
//	//        String title = (String)paramMap.get("title");;
//	//        
//	//        String actorid = (String)paramMap.get("actorid");
//	//        String actortype = (String)paramMap.get("actortype");
//	//        String deptuuid = (String)paramMap.get("deptuuid");
//	//        String agenttype = (String)paramMap.get("agenttype");
//	//        String isdeputesign = (String)paramMap.get("isdeputesign");
//	//        String originactorid = (String)paramMap.get("originactorid");
//	//        String originactortype = (String)paramMap.get("originactortype");
//	//        String origindeptuuid = (String)paramMap.get("origindeptuuid");
//	//        
//	//        String opertype = (String)paramMap.get("opertype");
//	//        String opercomment = (String)paramMap.get("opercomment");
//	//        String signtype = (String)paramMap.get("signtype");
//	//        String nextnode = (String)paramMap.get("nextnode");
//	//        String nextnodetype =(String)paramMap.get("nextnodetype");
//	//        String nextactors =(String)paramMap.get("nextactors");
//	//        
//	//        //如果是子流程，则需要传入父流程
//	//        String ptarget = (String)paramMap.get("ptarget");
//	//        String ptargettype = (String)paramMap.get("ptargettype");
//	//        
//	//        //考虑批量提交的情况
//	//        String extrasigntype = (String)paramMap.get("extrasigntype");
//	//        String extranextnode = (String)paramMap.get("extranextnode");
//	//        String extranextnodetype = (String)paramMap.get("extranextnodetype");
//	//        String extranextactors =(String)paramMap.get("extranextactors");
//	//        
//	//        String dt = WDK.getDateTime();
//	//        
//	//        //查询当前todo对象
//	//        bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
//	//        
//	//        boolean isend = WFUtils.Flow_IsFlowEnd(environment, conb, todo.getPiid());
//	//        
//	//        // start
//	//        if (isend) {
//	//            WFBean wfbean = WFUtils.Flow_QueryWbByPiid(environment, conb, todo.getPiid());
//	//            String piid = WFFrame.pi_recover(environment, conb, wfbean);
//	//            List<String> todoids = WFUtils.Flow_GetTodoIdList(environment, conb, piid);
//	//            if (todoids != null && todoids.size() > 0) {
//	//                todo = WFFrame.todo_querySingle(environment, conb, todoids.get(0));
//	//            }
//	//        }
//	//        // end by yub
//	//        
//	//        //构建submit提交对象
//	//        bean_submit submit = new bean_submit(todo);
//	//        submit.setActorid(actorid);
//	//        submit.setActortype(actortype);
//	//        submit.setAgenttype(agenttype);
//	//        submit.setIsdeputesign(isdeputesign);
//	//        submit.setDeptuuid(deptuuid);
//	//        submit.setOpertype(opertype);
//	//        submit.setOperdt(dt);
//	//        submit.setOpercomment(opercomment);
//	//        submit.setOriginactorid(originactorid);
//	//        submit.setOriginactortype(originactortype);
//	//        submit.setOrigindeptuuid(origindeptuuid);
//	//        submit.setPtarget(ptarget);
//	//        submit.setPtargettype(ptargettype);
//	//        if (title != null && title.trim().length() > 0) {
//	//            submit.setTitle(title);
//	//        }
//	//        submit.setSigntype(signtype);
//	//        submit.setTarget(nextnode);
//	//        submit.setTargettype(nextnodetype);
//	//        ArrayList<WFActorBean> actors = WFFrame.pub_getActors(nextactors);
//	//        submit.setTargetactors(actors);
//	//        
//	//        //考虑到frok的情况，可能下一环节会有多个并发环节的可能性
//	//        ArrayList<bean_submit_target> extratargets = new ArrayList<bean_submit_target>();
//	//        if(null!=extranextnode&&!"".equals(extranextnode)){
//	//            if(-1!=extranextnode.indexOf("||")){
//	//                String[] arrSigntype = extrasigntype.split("\\|\\|");
//	//                String[] arrNextnode = extranextnode.split("\\|\\|");
//	//                String[] arrNextnodetype = extranextnodetype.split("\\|\\|");
//	//                String[] arrNextactors = extranextactors.split("\\|\\|");
//	//                for(int i=0;i<arrSigntype.length;i++){
//	//                    bean_submit_target bst = new bean_submit_target();
//	//                    bst.setSigntype(arrSigntype[i]);
//	//                    bst.setTarget(arrNextnode[i]);
//	//                    bst.setTargettype(arrNextnodetype[i]);
//	//                    ArrayList<WFActorBean> extraactors = WFFrame.pub_getActors(arrNextactors[i]);
//	//                    bst.setTargetactors(extraactors);
//	//                    extratargets.add(bst);
//	//                }
//	//            }else{
//	//                //如果只是正常单个环节的推进
//	//                bean_submit_target bst = new bean_submit_target();
//	//                bst.setSigntype(extrasigntype);
//	//                bst.setTarget(extranextnode);
//	//                bst.setTargettype(extranextnodetype);
//	//                ArrayList<WFActorBean> extraactors = WFFrame.pub_getActors(extranextactors);
//	//                bst.setTargetactors(extraactors);
//	//                extratargets.add(bst);
//	//            }
//	//        }
//	//        submit.setExtratargets(extratargets);
//	        
//	        //构造流程提交的bean_submit对象
//	        bean_submit submit = operation.getBean_submit(environment, conb, paramMap);
//	        //提交
//	        isSuccess = WFFrame.todo_submit(environment, conb, submit);
//	        if(isSuccess){
//	            //发送提醒短信
//	            String msgnotice_0 = (String)paramMap.get("msgnotice_0");
//	            //大蚂蚁即时通讯
//	            String msgnotice_1 = (String) paramMap.get("msgnotice_1");
//	            if("1".equals(msgnotice_0)){
//	                SessionUser sessionuser = (SessionUser)_getSessionuser(request, response);
//	                //paramMap.put("sendusername", sessionuser.getPersonname());
//	                //启动线程发送短信，保证和待办提交不是一个事务
//	                Thread t = new Thread(new sendSmsthread(sessionuser.getPersonname(),submit));
//	                t.start();
//	            }
//	            //########################################################
//    			//#### 流程推进完成，发送给大蚂蚁即时通讯
//    			//########################################################
//	            if ("1".equals(msgnotice_1)) {
//	            	String title = (String) paramMap.get("title");
//	    	        String actorid = (String) paramMap.get("actorid");
//	            	String nextactors = (String) paramMap.get("nextactors");
//	            	String receiverids = "";
//	            	StringBuffer receBuff = new StringBuffer();
//	            	if(StringUtil.isNotBlank(nextactors)){
//	            		String[] arry = nextactors.split(";"); 
//	            		for(int i = 0 ;i<arry.length ;i++){
//	            			String[] arry2 = arry[i].split(",");
//	            			receBuff.append(arry2[0]+";");
//		            	}
//	            	}
//	            	if(receBuff.length() >0){
//	            		receiverids = receBuff.substring(0,receBuff.length() -1);
//	            	}
//	            	bean_todo todo = WFFrame.todo_querySingle(environment, conb, (String)paramMap.get("todoid"));
//	            	SessionUser su =  WFOperationService.getSessionUser(actorid, conb);
//	            	Map sendMap = new HashMap();
//			    	HashMap param = new HashMap();
//			    	
//					param.put("sendname", su.getPersonname());
//					param.put("title", todo.getTitle());
//					param.put("prenodename", todo.getNodetitle());
//					param.put("sendtime",DateTransUtil.getCurrDateTime("yyyy-MM-dd HH:mm:ss"));
//					
//					sendMap.put("sendType", "TODO_IM_INFO");
//					sendMap.put("paramMap", param);
//	            	
//	            	SmsUtil.sendIMMessage(receiverids, title, actorid, sendMap);
//	            }
//	        }
//		}catch (Exception e) {
//			isSuccess = false;
//			msg = e.getMessage();
//		}finally{
//			wdkEnv.endLog(log, isSuccess, msg);
//			if(isSuccess == false){
//				throw new Exception(msg);
//			}
//		}
//        
//        return isSuccess;
//        
//    }
//    
//    
//    /**
//     * 说明：特送业务处理
//     *<p>
//     * Method todo_specialsubmit
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean todo_specialsubmit(HttpServletRequest request,HttpServletResponse response,Environment environment,ConnectBean conb) throws Exception {
//        //提交
//        boolean isSuccess = todo_specialsubmit_core(request, response, environment, conb, null);
//        JSONObject jres = new JSONObject();
//        if(isSuccess){
//            jres.put("code", "1");
//            jres.put("desc", "特送成功！");
//        }else{
//            jres.put("code", "0");
//            jres.put("desc", "特送失败！");
//        }
//        _PRINT(request, response, conb, jres.toString());
//        return true;
//        
//    }
//    
//    
//    /**
//     * 说明：提交核心处理类，提交的总入口
//     *<p>
//     * Method todo_submit_core
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     */
//    public boolean todo_submit_core(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
//        return todo_submit_core(request, response, environment, conb, null);
//    }
//    /**
//     * 说明：提交核心处理类，提交的总入口
//     *<p>
//     * Method todo_submit_core
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     */
//    public boolean todo_submit_core(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb,
//            String dataStr) throws Exception {
//    	WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
//		boolean isSuccess = true;
//		String msg = "";
//    	
//    	LogEyeBean log = wdkEnv.startLog( WFBaseAction.class.getName(),"todo_submit_core" );//日志跟踪
//    	try{
//	        HashMap paramMap = new HashMap();
//	        if (dataStr != null && dataStr.trim().length() > 0) {
//	            paramMap = uJson.resolveJsonToMap(dataStr);
//	        } else {
//	            paramMap = _getParameterMap(request, response);
//	        }
//	        
//	        bean_submit submit = operation.getBean_submit(environment, conb, paramMap);//构造流程提交的bean_submit对象
//	        if(submit==null) isSuccess = false;
//	        
//	        if(isSuccess) {
//	        	isSuccess = operation.todo_submit(environment, conb, submit);//待办提交，流程推进
//	        }
//	        
//	        if (isSuccess) {
//	            // 发送提醒短信
//	            String msgnotice_0 = (String) paramMap.get("msgnotice_0");
//	            String msgnotice_1 = (String) paramMap.get("msgnotice_1");
//	            if ("1".equals(msgnotice_0)) {
//	                SessionUser sessionuser = (SessionUser) _getSessionuser(request, response);
//	                //paramMap.put("msgnotice", "msgnotice_0");
//	                // 启动线程发送短信，保证和待办提交不是一个事务
//	                Thread t = new Thread(new sendSmsthread(sessionuser.getPersonname(),submit));
//	                t.start();
//	            }
//	            //########################################################
//    			//#### 流程推进完成，发送给大蚂蚁即时通讯
//    			//########################################################
//	            if ("1".equals(msgnotice_1)) {
//	            	String title = (String) paramMap.get("title");
//	    	        String actorid = (String) paramMap.get("actorid");
//	            	String nextactors = (String) paramMap.get("nextactors");
//	            	String receiverids = "";
//	            	StringBuffer receBuff = new StringBuffer();
//	            	if(StringUtil.isNotBlank(nextactors)){
//	            		String[] arry = nextactors.split(";"); 
//	            		for(int i = 0 ;i<arry.length ;i++){
//	            			String[] arry2 = arry[i].split(",");
//	            			receBuff.append(arry2[0]+";");
//		            	}
//	            	}
//	            	if(receBuff.length() >0){
//	            		receiverids = receBuff.substring(0,receBuff.length() -1);
//	            	}
//	            	bean_todo todo = WFFrame.todo_querySingle(environment, conb, (String)paramMap.get("todoid"));
//	            	
//	            	Map sendMap = new HashMap();
//			    	HashMap param = new HashMap();
//			    	SessionUser su =  WFOperationService.getSessionUser(actorid, conb);
//			    	
//					param.put("sendname", su.getPersonname());
//					param.put("title", todo.getTitle());
//					param.put("prenodename", todo.getNodetitle());
//					param.put("sendtime",DateTransUtil.getCurrDateTime("yyyy-MM-dd HH:mm:ss"));
//					
//					sendMap.put("sendType", "TODO_IM_INFO");
//					sendMap.put("paramMap", param);
//	            	
//	            	SmsUtil.sendIMMessage(receiverids, title, actorid,sendMap);
//	            }
//	        }
//    	}catch (Exception e) {
//    		isSuccess = false;
//    		msg = e.getMessage();
//		}finally{
//			wdkEnv.endLog(log,isSuccess,msg);//日志跟踪
//			if(isSuccess == false){
//				throw new Exception(msg);
//			}
//		}
//        return isSuccess;
//    }
//    
//    
//
//    /**
//     * 说明：提交：对外的action处理方法
//     * <p>
//     * Method todo_submit
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean todo_submit(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
//        boolean isSuccess = todo_submit_core(request, response, environment, conb);
//        JSONObject jres = new JSONObject();
//        if (isSuccess) {
//            jres.put("code", "1");
//            jres.put("desc", "操作成功");
//        } else {
//            jres.put("code", "0");
//            jres.put("desc", "操作失败");
//        }
//        _PRINT(request, response, jres.toString());
//        return true;
//    }
//    
//    /**
//	 * 异步发送的代码
//	 * @author Administrator
//	 *
//	 */
//	public static class sendSmsthread implements Runnable{
//		private bean_submit submit;
//		private String sendusername = "";
//		public sendSmsthread(String sendusername,bean_submit submit) {
//			this.submit = submit;
//			this.sendusername = sendusername;
//		}
//		@Override
//		public void run() {
//			ArrayList<WFActorBean> actors = this.submit.getAllActors();//所有处理人列表
//        	String title = this.submit.getTitle();
//        	try {
//				sendSMSAsyn(sendusername, actors, title);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	    /**
//	     * 说明：待办提交后，发送短信提醒<br>
//	     * @param nextactors 下一办理人,用户格式为 用户ID,user,部门ID，多个之间用分号隔开
//	     * @param actortype 下一办理人类型，如果是用户，则是user，目前好像只有user
//	     * @param title 待办标题
//	     * @throws Exception 
//	     */
//	    protected void sendSMSAsyn(String sendusername,ArrayList<WFActorBean> actors, String title) throws Exception {
//	    	String msgcontent = "";
//			List phoneList = new ArrayList();
//			//从用户表中获得用户手机号码
//			WQLObject wo = WQLObject.getWQLObject("UUM_UU_PERSONINFO");
//			ConnectBean conb = null;
//			try{
//				conb = ConnectBean.getConnectBean();
//				conb.beginTransation();
//				msgcontent = getTodoSms(title, conb);
//				for(int i=0;actors!=null && i<actors.size();i++){
//					if(actors.get(i)!=null && actors.get(i).getActorId().length()>0){
//						String userId = actors.get(i).getActorId();//解析出用户ID 
//						//根据用户的PERSON_UUID获得用户的手机号码
//						String whereClause = " SYSISDELETE = '0' and PERSON_UUID='" + userId + "' ";
//						ResultBean resultBean = wo.query(whereClause, "", conb);
//						if(resultBean.isSuccess() && resultBean.getResultCount()>0){
//							WQLData dataSet = resultBean.getWQLData(0);
//							if(dataSet!=null){
//								dataSet.first();
//								while(dataSet.next()){
//									try{
//										String phone = dataSet.getValue("MASTER_MOBILE");
//										if(phone!=null && phone.trim().length()>0){
//											phoneList.add(phone.trim());											
//										}
//									} catch (Exception e) {
//										logger.errorWithNoException("待办发送短信提醒时，获得用户(" + userId + ")的时候号码出错。" + e.getMessage());
//										e.printStackTrace();
//									}
//								}
//							}
//						}
//					} else {
//						continue;
//					}
//				}
//			} finally {
//				if(conb!=null){
//					conb.commitTransation();
//				}
//			}
//			
//			//循环发送短信，以后支持群发后此处还要修改
//			for(int i=0;i<phoneList.size();i++){
//				String phone = (String)phoneList.get(i);
//				//异步发送，这个结果其实不重要，这个是记录到队列的结果
//				MSGResultBean msgRB = MSG.sendSMSAsyn(sendusername,phone, msgcontent);
//			}
//		}
//	    
//	    
//	    /**
//		 * 说明：组装待办短信提醒的内容<br>
//		 * @param title 待办标题
//		 * @return
//		 */
//	    private String getTodoSms(String title, ConnectBean conb){
//	    	String smsinfo = "";
//	    	try{
//	    		WQLObject wo =WQLObject.getWQLObject("PF_PB_PARAMETER");
//	    		ResultBean rb = wo.query(" PARACODE='TODO_SMS_INFO' ", "", conb);
//	    		if(rb.isSuccess()==false){
//	    			StringBuffer sf = new StringBuffer();
//	    			ArrayList errlist = rb.getInfoError();
//	    			for(int i=0;i<errlist.size();i++){
//	    				ErrorBean errBean = (ErrorBean)errlist.get(i);
//	    				sf.append(errBean.toString());
//	    				sf.append("\n");
//	    			}
//	    			throw new Exception(sf.toString());
//	    		}
//	    		WQLData wd =rb.getWQLData(wo, 0);
//	    		wd.first();
//	    		if(wd.next()){
//	    			smsinfo = wd.getValue("PARAVALUE");
//	    		}
//	    	}catch (Exception e) {
//	    		logger.errorWithNoException("获得系统参数中配置的TODO_SMS_INFO对应的值时出错：" + e.getMessage());
//				e.printStackTrace();
//			}
//	    	
//			if(smsinfo!=null && smsinfo.trim().length()>0){
//				//将其中的动态参数换成表中列的值
//				if(smsinfo.indexOf("{TITLE}")>-1){
//					//任务描述
//					smsinfo = smsinfo.replaceAll("\\{TITLE\\}", title);
//				}
//			} else {
//				smsinfo = "您有一条关于“" + title + "”的待办，请尽快办理。";
//			}
//	    	return smsinfo;
//	    	
//	    }
//	}
//	
//   /** 大蚂蚁即时消息提醒，信息入库
//    * <br>
//    * String receiverids   接收入person_uuid多个用 分号";"分开
//    * <br>
//    * String title		       待办标题
//    * <br>
//    * String receiverids   发送人  person_uuid
//    * @author Administrator
//    *
//    */
//	public static class sendImthread implements Runnable{
//		private String title = "";
//		private String senderid = "";
//		private String receiverids = "";
//		private Map sendMap = null;
//		public sendImthread(String receiverids,String title , String senderid,Map sendMap) {
//			this.receiverids = receiverids;
//			this.senderid = senderid;
//			this.title = title;
//			this.sendMap = sendMap;
//		}
//		public void run() {
//        	try {
//				sendImAsyn(senderid,receiverids, title,sendMap);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	    /**
//	     * 
//	     * @param senderid     发送人person_uuid
//	     * @param receiverids  接受人person_uuid
//	     * @param title        待办标题
//	     * @throws Exception
//	     */
//	    protected void sendImAsyn(String senderid,String receiverids, String title,Map sendMap) throws Exception {
//			ConnectBean conb = null;
//			try{
//				conb = ConnectBean.getConnectBean();
//				conb.beginTransation();
//				//#####################################
//				//###	发送类型
//				//###	1. _self : 直接使用标题
//				//###	2. _defult : 使用默认标题
//				//###	3. 其他类型在PF_PB_PARAMETER 中获取数据
//				//#####################################
//				String sendType = (String) sendMap.get("sendType");
//				if("_self".equalsIgnoreCase(sendType)){
//					//不作处理
//				}else if("_defult".equalsIgnoreCase(sendType)){
//					title = getTodoIm(senderid,title, conb);
//				}else{
//					HashMap paramMap = (HashMap) sendMap.get("paramMap");
//					title = CommonUtil.getParameterValue(sendType, paramMap, conb);
//				}
//				
//				if(StringUtil.isNotBlank(receiverids)){
//					String[] huidArray = receiverids.split(";");
//					for(int i = 0 ;huidArray.length >0 && i<huidArray.length;i++){
//						MSG.sendImAsyn(senderid,huidArray[i], title);
//					}
//				}
//			} finally {
//				if(conb!=null){
//					conb.commitTransation();
//				}
//			}
//			
//		}
//	    
//	    
//	    /**
//		 * 说明：组装待办短信提醒的内容<br>
//		 * @param title 待办标题
//		 * @return
//		 */
//	    private String getTodoIm(String senderid ,String title, ConnectBean conb){
//	    	String smsinfo = "";
//	    	try{
//	    		WQLObject wo =WQLObject.getWQLObject("PF_PB_PARAMETER");
//	    		ResultBean rb = wo.query(" PARACODE='TODO_IM_INFO' ", "", conb);
//	    		if(rb.isSuccess()==false){
//	    			StringBuffer sf = new StringBuffer();
//	    			ArrayList errlist = rb.getInfoError();
//	    			for(int i=0;i<errlist.size();i++){
//	    				ErrorBean errBean = (ErrorBean)errlist.get(i);
//	    				sf.append(errBean.toString());
//	    				sf.append("\n");
//	    			}
//	    			throw new Exception(sf.toString());
//	    		}
//	    		WQLData wd =rb.getWQLData(wo, 0);
//	    		wd.first();
//	    		if(wd.next()){
//	    			smsinfo = wd.getValue("PARAVALUE");
//	    		}
//	    	}catch (Exception e) {
//	    		logger.errorWithNoException("获得系统参数中配置的TODO_SMS_INFO对应的值时出错：" + e.getMessage());
//				e.printStackTrace();
//			}
//	    	
//			if(smsinfo!=null && smsinfo.trim().length()>0){
//				//将其中的动态参数换成表中列的值
//				if(smsinfo.indexOf("{title}")>-1){
//					//任务描述
//					smsinfo = smsinfo.replaceAll("\\{title\\}", title);
//				}
//				if(smsinfo.indexOf("{sendname}")>-1){
//					JSONObject sendobj = UUM.getPersonByID(senderid,conb);
//					String sendName = "";
//					if (sendobj != null) {
//						//根据ID查不到用户，那可能是选择的部门， 过滤掉部门
//						sendName = sendobj.getString("person_name");
//					}
//					//任务描述
//					smsinfo = smsinfo.replaceAll("\\{sendname\\}", sendName);
//				}
//				if(smsinfo.indexOf("{sendtime}")>-1){
//					//任务描述
//					smsinfo = smsinfo.replaceAll("\\{sendtime\\}", DateTransUtil.getCurrDateTime("yyyy-MM-dd HH:mm:ss"));
//				}
//			} else {
//				smsinfo = "您有一条关于“" + title + "”的待办，请尽快办理。";
//			}
//	    	return smsinfo;
//	    	
//	    }
//	}
//	
//    /**
//     * 说明：如果是判断节点，递归获取子孙人工环节
//     *<p>
//     * Method getDecisionChildrenNode
//     * @param wb
//     * @param wfnode
//     * @return
//     */
//    private WFNodeBean getDecisionChildrenNode(WFBean wb, WFNodeBean wfnode) {
//        if (!wfnode.isDecision()) {
//            return wfnode;
//        }
//        ArrayList<WFDecisionConditionBean> conds = wfnode.getConditions();
//        List<String> nextargets = handlerDecision.processConditions(wb, wfnode, conds);
//        if (nextargets != null && nextargets.size() == 1) {
//            WFNodeBean nextnode = wb.getNodeBean(nextargets.get(0));
//            if (nextnode.isDecision()) {
//                return getDecisionChildrenNode(wb, nextnode);
//            }
//            return nextnode;
//        }
//        return null;
//    }
//	
//	
//	
//	
//	/**
//	 * 说明：分支环节的下一环节参与者列表
//	 *<p>
//	 * Method node_fork_actors
//	 * @param request
//	 * @param response
//	 * @param environment
//	 * @param conb
//	 * @return
//	 * @throws Exception
//	 */
//    public boolean node_fork_actors(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        // 是否过滤，如果过滤，则只返回参与过的参与人
//        String isfilter = _getParameter("isfilter", request, response);
//        boolean bfilter = false;
//        if ("1".equals(isfilter)) {
//            bfilter = true;
//        }
//        String pdid = _getParameter("pdid", request, response);
//        String piid = _getParameter("piid", request, response);
//        String todoid = _getParameter("todoid", request, response);
//        String _nodename = _getParameter("nodename", request, response);
//        WFBean wb = WFFrame.wb_queryByPiid(environment, conb, piid);
//        WFNodeBean wnb = wb.getNodeBean(_nodename);
//        JSONArray jtrees = new JSONArray();
//        if (wnb.isFrok()||wnb.isJoin()) {
//            ArrayList<String> childNodes = WFFrame.pub_getChildNodes(environment, conb, pdid, _nodename);
//            for (String nodename : childNodes) {
//                WFNodeBean childnode = wb.getNodeBean(nodename);
//                childnode = getDecisionChildrenNode(wb, childnode);
//                if(childnode==null||childnode.isJoin()){
//                    continue;
//                }else{
//                    nodename = childnode.getNodename();
//                }
//                // ArrayList<WFActorBean> cands = WFFrame.pub_getNodeActors(environment, conb, pdid, piid, nodename, bfilter);
//                JSONArray cands = WFActorHelper.getActorList((SessionUser) _getSessionuser(request, response), environment, conb, todoid, nodename,
//                        bfilter);
//                
//                String enable =  WDK.getNodeParam("im_workflow_enable");
//                Map<String,IMBaseObject> imMap = new HashMap<String, IMBaseObject>();
//                if (enable != null && "1".equals(enable)) {
//                    SessionUser sessionUser =  (SessionUser)_getSessionuser(request, response);
//                    IMService service;
//                    try {
//                        Object imObject = Class.forName(WDK.getNodeParam("im_workflow_adapter")).newInstance();
//                        if (imObject != null && imObject instanceof IMService) {
//                            ArrayList<String> personIdList = new ArrayList<String>();
//                            for (int n = 0; n < cands.size(); n++) {
//                                JSONObject person = cands.getJSONObject(n);
//                                String userId = person.getString("person_uuid");
//                                if(!personIdList.contains(userId)){
//                                    personIdList.add(userId);
//                                }
//                            }
//                            service = (IMService) imObject;
//                            imMap = service.getIMBaseObjectMap(conb, sessionUser.getLoginname(), personIdList.toArray(new String[personIdList.size()]));
//                        }
//                    } catch (InstantiationException e) {
//                        e.printStackTrace();
//                    } catch (IllegalAccessException e) {
//                        e.printStackTrace();
//                    } catch (ClassNotFoundException e) {
//                        e.printStackTrace();
//                    }
//                }
//                // 构建用户树形结构
//                // 1、添加根节点
//                JSONObject jtree = new JSONObject();
//                jtree.put("id", childnode.getNodename() + "dept_root");
//                jtree.put("text", childnode.getNodetitle());
//                JSONObject jattr = new JSONObject();
//                jattr.put("ntype", "1");
//                jattr.put("nodename", nodename);
//                jtree.put("attributes", jattr);
//                // 2、添加子节点人员
//                JSONArray jchild = new JSONArray();
//                boolean ischecked = false;
//                for (Iterator it = cands.iterator(); it.hasNext();) {
//                    JSONObject wab = (JSONObject) it.next();
//                    JSONObject jmenu2 = new JSONObject();
//                    String cuId = wab.getString("person_uuid");
//                    IMBaseObject imObject =  imMap.get(cuId);
//                    jmenu2.put("id", cuId);
//                    jmenu2.put("text", wab.getString("person_name"));
//                    if(!ischecked){
//                        jmenu2.put("checked", true);
//                        ischecked = true;
//                    }
//                    if(imObject!=null){
//                        jmenu2.put("iconCls", imObject.getIconClass());
//                    }
//                    JSONObject jattr2 = new JSONObject();
//                    jattr2.put("ntype", "0");
//                    jattr2.put("actortype", IWFOperation.PARTICIPANT_TYPE_USER);
//                    jattr2.put("deptuuid", wab.getString("depart_uuid"));
//                    jattr2.put("nodename", nodename);
//                    if (imObject!=null) {
//                        jattr2.put("ext_title", imObject.getName());
//                        jattr2.put("ext_url", imObject.getUrl());
//                    }
//                    jmenu2.put("attributes", jattr2);
//                    jchild.add(jmenu2);
//                }
//                jtree.put("children", jchild);
//                jtrees.add(jtree);
//            }
//        }
//        _PRINT(request, response, jtrees.toString());
//        return true;
//    }
//    
//
//    /**
//     * 说明：获取节点参与者
//     *<p>
//     * Method node_actors
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean node_actors(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
//        // 是否过滤，如果过滤，则只返回参与过的参与人
//        String isfilter = _getParameter("isfilter", request, response);
//        boolean bfilter = false;
//        if ("1".equals(isfilter)) {
//            bfilter = true;
//        }
//        String pdid = _getParameter("pdid", request, response);
//        String piid = _getParameter("piid", request, response);
//        String todoid = _getParameter("todoid", request, response);
//        String nodename = _getParameter("nodename", request, response);
//
//        JSONArray jtrees = new JSONArray();
//        //ArrayList<WFActorBean> cands = WFFrame.pub_getNodeActors(environment, conb, pdid, piid, nodename, bfilter);
//        
//        JSONArray cands = WFActorHelper.getActorList((SessionUser)_getSessionuser(request, response), environment, conb, todoid, nodename, bfilter);
//        
//
//        // 构建用户树形结构
//
//        // 1、添加根节点
//        JSONObject jtree = new JSONObject();
//        jtree.put("id", "dept_root");
//        jtree.put("text", "请选择参与者");
//        JSONObject jattr = new JSONObject();
//        jattr.put("ntype", "1");
//        jattr.put("nodename", nodename);
//        jtree.put("attributes", jattr);
//
//        // 2、添加子节点人员
//        JSONArray jchild = new JSONArray();
//        for (Iterator it = cands.iterator(); it.hasNext();) {
//            JSONObject wab = (JSONObject) it.next();
//            JSONObject jmenu2 = new JSONObject();
//            jmenu2.put("id", wab.getString("person_uuid"));
//            jmenu2.put("text",  wab.getString("person_name"));
//            JSONObject jattr2 = new JSONObject();
//            jattr2.put("ntype", "0");
//            jattr2.put("actortype", IWFOperation.PARTICIPANT_TYPE_USER);
//            jattr2.put("deptuuid", wab.getString("depart_uuid"));
//            jattr2.put("nodename", nodename);
//            jmenu2.put("attributes", jattr2);
//            jchild.add(jmenu2);
//        }
//        jtree.put("children", jchild);
//        jtrees.add(jtree);
//        _PRINT(request, response, jtrees.toString());
//        return true;
//    }
//
//    /**
//     * 说明：下下环节
//     *<p>
//     * Method node_nextnodes
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean node_nextnodes(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        String pdid = _getParameter("pdid", request, response);
//        String nodename = _getParameter("nodename", request, response);
//        String piid = _getParameter("piid", request, response);
//        WFBean wb = WFFrame.wb_queryByPiid(environment, conb, piid);
//        WFNodeBean wnb = wb.getNodeBean(nodename);
//        ArrayList<String> childNodes = WFFrame.pub_getChildNodes(environment, conb, pdid, nodename);
//        JSONArray jchilds = new JSONArray();
//
//        // 如果下一环节是join环节，则判断当前是否是最后一个frok，如果是最后一个frok，则列出后续所有环节，单选
//        if (wnb.isJoin()) {
//            for (Iterator<String> it = childNodes.iterator(); it.hasNext();) {
//                JSONObject jchild = new JSONObject();
//                String name = it.next();
//                WFNodeBean wnbChild = wb.getNodeBean(name);
//                jchild.put("nodename", name);
//                jchild.put("nodetype", wnbChild.getNodetype());
//                jchild.put("nodetitle", wnbChild.getNodetitle());
//                jchild.put("ppdid", wb.getPpdid());
//                jchild.put("pdid", pdid);
//                jchilds.add(jchild);
//            }
//        } else if (wnb.isDecision()) {
//            // 如果下一环节decision节点，则首先计算decision，然后将后续选中的节点列出来，单选
//            ArrayList<WFDecisionConditionBean> conds = wnb.getConditions();
//            String target = handlerDecision.processCondition(wb, wnb, conds);
//            WFNodeBean wnbTarget = wb.getNodeBean(target);
//            JSONObject jchild = new JSONObject();
//            jchild.put("nodename", wnbTarget.getNodename());
//            jchild.put("nodetype", wnbTarget.getNodetype());
//            jchild.put("nodetitle", wnbTarget.getNodetitle());
//            jchild.put("ppdid", wb.getPpdid());
//            jchild.put("pdid", pdid);
//            jchilds.add(jchild);
//        } else {
//            for (Iterator<String> it = childNodes.iterator(); it.hasNext();) {
//                JSONObject jchild = new JSONObject();
//                String name = it.next();
//                WFNodeBean wnbChild = wb.getNodeBean(name);
//                jchild.put("nodename", name);
//                jchild.put("nodetype", wnbChild.getNodetype());
//                jchild.put("nodetitle", wnbChild.getNodetitle());
//                jchild.put("ppdid", wb.getPpdid());
//                jchild.put("pdid", pdid);
//                jchilds.add(jchild);
//            }
//        }
//        _PRINT(request, response, jchilds.toString());
//        return true;
//    }
//
//    /**
//     * 说明：增办理人
//     *<p>
//     * Method addParticipant
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean addParticipant(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        boolean isSuccess = false;
//        String todoid = _getParameter("todoid", request, response);
//        String strActors = _getParameter("_next_actors", request, response);
//        bean_todo todo = null;
//        if (todoid != null) {
//        	todo = WFFrame.todo_querySingle(environment, conb, todoid);
//            if (todo != null) {
//                String piid = todo.getPiid();
//                String nodename = todo.getNodename();
//                ArrayList<WFActorBean> newactors = WFFrame.pub_getActors(strActors);
//                isSuccess = WFFrame.pi_modify(environment, conb, piid, nodename, newactors, false);
//            }
//        }
//        JSONObject jres = new JSONObject();
//        if (isSuccess) {
//            jres.put("code", "1");
//            jres.put("desc", "增办成功");
//            //########################################################
//			//#### 流程推进完成，发送给大蚂蚁即时通讯
//			//########################################################
//            String msgnotice_1 =  _getParameter("msgnotice_1", request, response);
//            String senderid = _getParameter("_senderpersonid", request, response);
//            SessionUser su =  WFOperationService.getSessionUser(senderid, conb);
//			if("1".equalsIgnoreCase(msgnotice_1)){
//				String receiverids = "";
//            	StringBuffer receBuff = new StringBuffer();
//            	if(StringUtil.isNotBlank(strActors)){
//            		String[] arry = strActors.split(";"); 
//            		for(int i = 0 ;i<arry.length ;i++){
//            			String[] arry2 = arry[i].split(",");
//            			receBuff.append(arry2[0]+";");
//	            	}
//            	}
//            	if(receBuff.length() >0){
//            		receiverids = receBuff.substring(0,receBuff.length() -1);
//            	}
//            	
//            	Map sendMap = new HashMap();
//		    	HashMap param = new HashMap();
//				param.put("sendname", su.getPersonname());
//				param.put("title", todo.getTitle());
//				param.put("prenodename", todo.getNodetitle());
//				param.put("sendtime",DateTransUtil.getCurrDateTime("yyyy-MM-dd HH:mm:ss"));
//				
//				sendMap.put("sendType", "TODO_IM_INFO");
//				sendMap.put("paramMap", param);
//            	
//				SmsUtil.sendIMMessage(receiverids, todo.getTitle(), senderid,sendMap);
//			}
//        } else {
//            jres.put("code", "0");
//            jres.put("desc", "增办失败");
//        }
//        _PRINT(request, response, jres.toString());
//        return isSuccess;
//    }
//
//    /**
//     * 说明：转办/交办新增
//     *<p>
//     * Method turn_add
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean turn_add_new(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
//        String todoid = _getParameter("todoid", request, response);
//        String actorid = _getParameter("actorid", request, response);
//        String actortype = _getParameter("actortype", request, response);
//        String deptuuid = _getParameter("deptuuid", request, response);
//        String originactorid = _getParameter("originactorid", request, response);
//        String originactortype = _getParameter("originactortype", request, response);
//        String origindeptuuid = _getParameter("origindeptuuid", request, response);
//        String agenttype = _getParameter("agenttype", request, response);
//        String isdeputesign = _getParameter("isdeputesign", request, response);
//        String turnactorid = _getParameter("turnactorid", request, response);
//        String turntype = _getParameter("turntype", request, response);
//        String turnopertype = _getParameter("turnopertype", request, response);
//        String opercomment =  _getParameter("opercomment", request, response);
//
//        WFActorBean actor = new WFActorBean(actorid, actortype, deptuuid);
//        WFActorBean originactor = new WFActorBean(originactorid, originactortype, origindeptuuid);
//        ArrayList<WFActorBean> turnactors = new ArrayList<WFActorBean>();
//        if (null != turnactorid && !"".equals(turnactorid)) {
//            String[] arr = turnactorid.split(";");
//            for (int i = 0; i < arr.length; i++) {
//                String strActor = arr[i];
//                String[] arr2 = strActor.split(",");
//                WFActorBean wfab = new WFActorBean(arr2[0], arr2[1], arr2[2]);
//                turnactors.add(wfab);
//            }
//        }
//        boolean isSuccess = WFFrame.turn_add_new(environment, conb, todoid, actor, originactor, agenttype, isdeputesign, turnactors, turntype,
//                turnopertype, opercomment);
//        JSONObject jres = new JSONObject();
//        if (isSuccess) {
//            jres.put("code", "1");
//            jres.put("desc", "操作成功");
//            //########################################################
//			//#### 流程推进完成，发送给大蚂蚁即时通讯
//			//########################################################
//            String msgnotice_1 =  _getParameter("msgnotice_1", request, response);
//			if("1".equalsIgnoreCase(msgnotice_1)){
//				String nextactors = _getParameter("turnactorid", request, response);
//				bean_todo jtodo = WFFrame.todo_querySingle(environment, conb, todoid);
//				SessionUser su =  WFOperationService.getSessionUser(actorid, conb);
//            	Map sendMap = new HashMap();
//		    	HashMap param = new HashMap();
//		    	
//				param.put("sendname", su.getPersonname());
//				param.put("title", jtodo.getTitle());
//				param.put("prenodename", jtodo.getNodetitle());
//				param.put("sendtime",DateTransUtil.getCurrDateTime("yyyy-MM-dd HH:mm:ss"));
//				
//				sendMap.put("sendType", "TODO_IM_INFO");
//				sendMap.put("paramMap", param);
//            	
//				SmsUtil.sendIMMessage(nextactors, jtodo.getTitle(), actorid,sendMap);
//			}
//        } else {
//            jres.put("code", "0");
//            jres.put("desc", "操作失败");
//        }
//        _PRINT(request, response, jres.toString());
//        return isSuccess;
//    }
//
//    /**
//     * 说明：根据流程实例ID获取流程模板pdid及当前办理nodename
//     *<p>
//     * Method getPdidByPiid
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean getPdidByPiid(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        boolean isSuccess = false;
//        JSONObject jres = new JSONObject();
//        String pdid = "";
//        String nodename = "";
//        String monitortype = "1";
//        String title = "流程处理中";
//        String piid = _getParameter("piid", request, response);
//        if (piid != null && !"".equals(piid)) {
//            WFBean wb = WFFrame.wb_queryByPiid(environment, conb, piid);
//            if (wb == null) {
//                wb = WFFrame.wb_queryByPiid(environment, conb, piid, true);
//                title = "流程已结束";
//                monitortype = "0";
//            }else{
//                if(WFUtils.isSuspended(environment, piid)){
//                    title = "流程已挂起";
//                }
//            }
//            if (wb != null) {
//                pdid = wb.getPdid();
//                try {
//                    List<String> activinodelist = WFUtils.Flow_GetActiviyNodeList(environment, conb, piid);
//                    if (activinodelist != null && activinodelist.size() > 0) {
//                        nodename = activinodelist.get(0);
//                    }
//                } catch (Exception e) {
//                    // 如果发生报错，代表流程结束了，那么环节默认获取最后一个环节节点
//                    nodename = wb.getLastNode().getNodename();
//                }
//                isSuccess = true;
//            }
//        }
//        if (isSuccess) {
//            jres.put("monitortype", monitortype);
//            jres.put("code", "1");
//            jres.put("desc", "操作成功");
//            jres.put("pdid", pdid);
//            jres.put("title", title);
//            jres.put("nodename", nodename);
//        } else {
//            jres.put("code", "0");
//            jres.put("desc", "操作失败");
//            jres.put("pdid", pdid);
//        }
//        _PRINT(request, response, jres.toString());
//        return isSuccess;
//    }
//
//    /**
//     * 说明：根据流程实例ID和环节名，获取当前流程下本环节的办理状态信息列表
//     *<p>
//     * Method getNodeStatusByNodename
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean getNodeStatusByNodename(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        JSONObject returnObject = new JSONObject();
//        // 当前鼠标点击的环节名称
//        String nodename = _getParameter("nodename", request, response);
//        // 当前流程实例ID
//        String piid = _getParameter("piid", request, response);
//        WFBean wb = WFFrame.wb_queryByPiid(environment, conb, piid);
//        JSONArray returnArray = new JSONArray();
//        ArrayList<bean_todo> todoList = wb == null ? WFFrame.todo_query(environment, conb, piid, true, true) : WFFrame.todo_query(environment, conb,
//                                                                                                                      piid, false, true);
//        if (todoList != null && todoList.size() > 0) {
//            for (bean_todo todo : todoList) {
//                String currentNodeName = todo.getNodename();
//                if (nodename.equalsIgnoreCase(currentNodeName)) {
//                    String curStatus = todo.getStatus();
//                    String curtodotype = todo.getTodotype();
//                    if (WFConstant.TODO_Status_wait.equals(curStatus)) {
//                        curStatus = "待办";
//                    } else if (WFConstant.TODO_Status_done.equals(curStatus)) {
//                        curStatus = "完成";
//                    } else if (WFConstant.TODO_Status_close.equals(curStatus)) {
//                        curStatus = "关闭";
//                    } else if (WFConstant.TODO_Status_recover.equals(curStatus)) {
//                        curStatus = "追回";
//                    } else if (WFConstant.TODO_Status_berecover.equals(curStatus)) {
//                        curStatus = "被追回";
//                    }
//                    if(WFConstant.TODO_Type_CC.equals(curtodotype)){
//                        String ccstatus = todo.getCcstatus();
//                        if("0".equals(ccstatus)){
//                            curStatus = "待阅";
//                        }else  if("1".equals(ccstatus)){
//                            curStatus = "已阅";
//                        }else  if("2".equals(ccstatus)){
//                            curStatus = "收回";
//                        }
//                        
//                    }
//                    JSONObject jsonobject = new JSONObject();
//                    jsonobject.put("todoid", todo.getId());
//                    jsonobject.put("nodetitle", todo.getNodetitle());// 当前环节名称
//                    jsonobject.put("status", curStatus);// 当前环节状态
//                    jsonobject.put("actorid", WFUtils.Flow_GetUserNameById(conb, todo.getActorid()));// 当前环节处理人
//                    String pretodoid = todo.getPretodoid();
//                    if (pretodoid != null && !"".equals(pretodoid.trim())) {
//                        bean_todo pretodo = WFFrame.todo_querySingle(environment, conb, pretodoid);
//                        jsonobject.put("operdt", todo.getOperdt());// 当前环节处理时间
//                        jsonobject.put("prenodetitle", pretodo!=null?pretodo.getNodetitle():"");// 前一环节名称
//                        jsonobject.put("preactorid", pretodo!=null?WFUtils.Flow_GetUserNameById(conb, pretodo.getActorid()):"");// 前一环节处理人
//                        jsonobject.put("preoperdt", pretodo!=null?pretodo.getOperdt():"");// 前一环节处理时间
//                    } else {
//                        jsonobject.put("operdt", "");// 当前环节处理时间
//                        jsonobject.put("prenodetitle", "");// 前一环节名称
//                        jsonobject.put("preactorid", "");// 前一环节处理人
//                        jsonobject.put("preoperdt", "");// 前一环节处理时间
//                    }
//                    // 增加一些别的处理
//                    returnArray.add(jsonobject);
//                }
//            }
//        }
//        returnObject.put("total", returnArray.size());
//        returnObject.put("rows", returnArray.toString());
//        _PRINT(request, response, returnObject.toString());
//        return true;
//    }
//
//    /**
//     * 说明：根据流程实例ID，获取当前实例下的办理意见列表
//     *<p>
//     * Method getNotionListByPiid
//     * 
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean getNotionListByPiid(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        JSONObject returnObject = new JSONObject();
//        JSONArray jrecords = new JSONArray();
//        // 当前流程实例ID
//        String orderby = "operdt asc";
//        String piid = _getParameter("piid", request, response);
//        WFBean wb = WFFrame.wb_queryByPiid(environment, conb, piid);
//        //String flag = "201";
//        String wqlObjectName = "WDK_WF_TODO";
//        String filterSql  =" piid='"+piid+"' and status in ('1','3') ";
//        if (wb == null) {
//            wqlObjectName = "WDK_WF_TODO_HIS";  //办结的数据， 最后一条待办状态还是0
//            filterSql = " piid='"+piid+"' ";
//        }
//        //JSONArray jrecords = WQL.getWO(WDKWQLNames.QWDKWFTODO).addParam("flag", flag).addParam("allstatus", "'1','3'").addParam("piid", piid)
//         //       .addParam("issuspend", "0").addParam("orderby", orderby).process(conb).getResultJSONArray(0);
//        //WQLModule wm = WQLModule.getWQLModule(IWFOperation.CODE_TYPE_PERSON);
//        //jrecords = wm.filter(jrecords, "actorid", "person_name", "actoridname", conb);and issuspend='0'
//        WQLObject wo = WQLObject.getWQLObject(wqlObjectName);
//        ResultBean rb =  wo.query(filterSql, orderby, conb);
//        if(rb!=null&&rb.isSuccess()){
//            jrecords = rb.getWQLData(wo, 0).getDataJSONArray();
//        }
//        returnObject.put("total", jrecords.size());
//        returnObject.put("rows", jrecords.toString());
//        _PRINT(request, response, returnObject.toString());
//        return true;
//    }
//    
//    private String getActorString(ArrayList<WFActorBean> actors){
//        ArrayList<String> targetactors = new ArrayList<String>();
//        for(WFActorBean actor:actors){
//            targetactors.add(actor.getActorId()+","+actor.getActorType()+","+actor.getDeptuuid());
//        }
//        return StringUtils.join(targetactors, ";");
//    }
//    
//    /**
//     * 说明：提交的预处理操作
//     *<p>
//     * Method todo_submit_prepare
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean todo_submit_prepare(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//        String commitflag = _getParameter("commitflag", request, response);
//        if(commitflag==null||commitflag.trim().length()>0){
//            commitflag = "true";
//        }
//        
//        JSONObject returnData = new JSONObject();
//        returnData.put("isautocommit", "false");// 默认不是自动提交
//        JSONObject callbackParam = new JSONObject();
//        callbackParam.put("type", "1");// type:1代表是提交，2代表是特送
//        String todoid = _getParameter("todoid", request, response);
//        String nexttitle = _getParameter("nexttitle", request, response);
//        if (todoid != null && todoid.trim().length() > 0) {
//            bean_todo todobean = WFFrame.todo_querySingle(environment, conb, todoid);
//
//            if (todobean != null) {
//                WFBean bean = WFUtils.Flow_QueryWbByPiid(environment, conb, todobean.getPiid());
//                if (bean != null) {
//                    String bdlcode = BDL.getBdlCode(bean);
//                    if (bdlcode != null && bdlcode.trim().length() > 0) {
//                        HashMap<String, HashMap<String, String>> nodeMap = BDL.getBdlNodevariables(environment, conb, bdlcode, todobean.getPiid());
//                        if (nodeMap != null && nodeMap.containsKey(todobean.getNodename())) {
//                            HashMap<String, String> currnodemap = nodeMap.get(todobean.getNodename());
//                            if (currnodemap != null && currnodemap.containsKey(IWFOperation.BDL_NODE_VARIABLE_AUTOCOMMIT)) {
//                                String isautoCommit = currnodemap.get(IWFOperation.BDL_NODE_VARIABLE_AUTOCOMMIT);
//                                if ("1".equals(isautoCommit)) {
//                                    bean_submit submit = new bean_submit(todobean);
//                                    if (nexttitle != null && nexttitle.trim().length() > 0) {
//                                        submit.setTitle(nexttitle);
//                                    } else {
//                                        submit.setTitle(todobean.getTitle());
//                                    }
//                                    submit.setOpercomment(todobean.getOpercomment());
//                                    submit.setOperdt(WDK.getDateTime());
//                                    submit.setOpertype(WFConstant.Opertype_Submit);
//                                    WFUtils.setDefultActorList(request, response, environment, conb, submit);
//                                    String _target = submit.getTarget();
//                                    WFNodeBean wfnode = bean.getNodeBean(_target);
//                                    ArrayList<String> actorids = new ArrayList<String>();
//                                    if (wfnode.isDecision()) {
//                                        bean_submit_target submit_target = submit.getExtratargets().get(0);
//                                        String realTarget = submit_target.getTarget();
//                                        WFNodeBean realNode = bean.getNodeBean(realTarget);
//                                        ArrayList<WFActorBean> realActorList = submit_target.getTargetactors();
//                                        if (realActorList != null && realActorList.size() > 0) {
//                                            for (int i = 0; i < realActorList.size(); i++) {
//                                                actorids.add(realActorList.get(i).getActorId());
//                                            }
//                                        }
//                                        boolean aa = realNode.isEnd();
//                                        callbackParam.put("nextactorids", StringUtils.join(actorids, ","));
//                                        callbackParam.put("nodecode", realTarget);
//                                        callbackParam.put("nodetitle", todobean.getTitle());
//                                        callbackParam.put("isend", String.valueOf(aa));
//                                        
//                                    } else {
//                                        String realTarget = _target;
//                                        ArrayList<WFActorBean> actorList = submit.getTargetactors();
//                                        if (actorList != null && actorList.size() > 0) {
//                                            for (int i = 0; i < actorList.size(); i++) {
//                                                actorids.add(actorList.get(i).getActorId());
//                                            }
//                                        }
//                                        boolean aa = wfnode.isEnd();
//                                        callbackParam.put("nextactorids", StringUtils.join(actorids, ","));
//                                        callbackParam.put("nodecode", realTarget);
//                                        callbackParam.put("nodetitle", todobean.getTitle());
//                                        callbackParam.put("isend", String.valueOf(aa));
//                                    }
//                                    if (actorids != null && actorids.size() > 0) {
//                                        ArrayList<String> actornames = new ArrayList<String>();
//                                        JSONArray personList = UUM.personids2personList(actorids, conb);
//                                        for (int m = 0; m < personList.size(); m++) {
//                                            actornames.add(personList.getJSONObject(m).getString("person_name"));
//                                        }
//                                        callbackParam.put("nextactornames", StringUtils.join(actornames, ","));
//                                    }
//                                    JSONObject json = new JSONObject();
//                                    json.put("todoid", todobean.getId());
//                                    json.put("title", todobean.getTitle());
//                                    json.put("actorid", submit.getActorid());
//                                    json.put("actortype", submit.getActortype());
//                                    json.put("deptuuid", submit.getDeptuuid());
//                                    json.put("agenttype", submit.getAgenttype());
//                                    json.put("originactorid", submit.getOrigindeptuuid());
//                                    json.put("originactortype", submit.getOriginactortype());
//                                    json.put("origindeptuuid", submit.getOrigindeptuuid());
//                                    json.put("opertype", submit.getOpertype());
//                                    json.put("opercomment", todobean.getOpercomment());
//                                    json.put("signtype", submit.getSigntype());
//                                    json.put("nextnode", submit.getTarget());
//                                    json.put("nextnodetype", submit.getTargettype());
//                                    ArrayList<WFActorBean> actors = submit.getTargetactors();
//                                    json.put("nextactors",  this.getActorString(actors));
//                                    json.put("isdeputesign", submit.getIsdeputesign());
//                                    json.put("ptarget", submit.getPtarget());
//                                    json.put("ptargettype", submit.getPtargettype());
//                                    
//                                    ArrayList<bean_submit_target> extraList =  submit.getExtratargets();
//                                    if(extraList!=null&&extraList.size()>0){
//                                        String extrasigntype = "";
//                                        String extranextnode = "";
//                                        String extranextnodetype = "";
//                                        String extranextactors = "";
//                                        for(bean_submit_target extraTarget:extraList){
//                                            if (extrasigntype.length() > 0) {
//                                                extrasigntype+="||";
//                                            }
//                                            if (extranextnode.length() > 0) {
//                                                extranextnode+="||";
//                                            }
//                                            if (extranextnodetype.length() > 0) {
//                                                extranextnode+="||";
//                                            }
//                                            if (extranextactors.length() > 0) {
//                                                extranextactors+="||";
//                                            }
//                                            extranextnode+=extraTarget.getTarget();
//                                            extrasigntype+=extraTarget.getSigntype();
//                                            extranextnodetype+=extraTarget.getTargettype();
//                                            extranextactors+=this.getActorString(extraTarget.getTargetactors());
//                                        }
//                                      json.put("extrasigntype", extrasigntype);
//                                      json.put("extranextnode", extranextnode);
//                                      json.put("extranextnodetype", extranextnodetype);
//                                      json.put("extranextactors", extranextactors);
//                                    }
////                                    
////                                    json.put("extrasigntype2", value);
////                                    json.put("extranextnode2", value);
////                                    json.put("extranextnodetype2", value);
////                                    json.put("extranextactors2", value);
//                                    callbackParam.put("data", json.toString());
//                                    returnData.put("callbackparam", callbackParam);
//                                    boolean isSuccess = true;//WFUtils.Flow_Commit(environment, conb, submit);
//                                    returnData.put("issuccess", String.valueOf(isSuccess));
//                                    returnData.put("isautocommit", "true");
//                                }
//
//                            }
//                        }
//                    }
//
//                }
//            }
//        }
//
//        _PRINT(request, response, returnData.toString());
//        return true;
//    }
//    
//    
//    
//    /**
//     * 说明：更新流程变量
//     *<p>
//     * Method setProcessInstanceVariables
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean setProcessInstanceVariables(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//            throws Exception {
//
//        String piid = _getParameter("piid", request, response);
//
//        String wf = _getParameter("wf", request, response);
//        String node = _getParameter("node", request, response);
//        String strhandler = _getParameter("strhandler", request, response);
//
//        JSONArray wfArray = JSONArray.fromObject(wf);
//        HashMap<String,String> param = new HashMap<String, String>();
//        for(int i=0;i<wfArray.size();i++){
//            JSONObject row = wfArray.getJSONObject(i);
//            param.put(row.getString("variable"), row.getString("variablevalue"));
//            
//        }
//        HashMap<String,HashMap<Object,Object> > nodeparam = new HashMap<String, HashMap<Object,Object> >();
//        JSONArray nodeArray = JSONArray.fromObject(node);
//        for(int i=0;i<nodeArray.size();i++){
//            JSONObject row = nodeArray.getJSONObject(i);
//            String nodename = row.getString("nodename");
//            HashMap<Object,Object> map= null;
//            if(nodeparam.containsKey(nodename)){
//                map = nodeparam.get(nodename);
//            }else{
//                map = new HashMap<Object, Object>();
//            }
//            map.put(row.getString("nodevariable"), row.getString("nodevariablevalue"));
//            nodeparam.put(nodename, map);
//        }
//        
//        WFBean wFBean = WFFrame.wb_queryByPiid(environment, conb, piid);
//        HashMap<String, WFNodeBean> nodeMap = wFBean.getNodeMap();
//        
//        Iterator it = nodeMap.keySet().iterator();
//        while (it.hasNext()) {
//            String kk = (String) it.next();
//            WFNodeBean nodebean = nodeMap.get(kk);
//            HashMap<Object, Object> aaa = nodebean.getVariables();
//            if (nodeparam.containsKey(kk) && nodeparam.get(kk) != null) {
//                if (aaa == null) {
//                    nodebean.setVariables(nodeparam.get(kk));
//                } else {
//                    nodebean.addVariable(nodeparam.get(kk));
//                }
//            }
//        }
//        
//        String strhandler2 = wFBean.getStrhandler();
//        if(!"".equals(strhandler)&&strhandler!=null) {
//        	wFBean.setStrhandler(strhandler);
//        }
//        
//        wFBean.addVariableAll(param);
//        WFFrame.wb_save(environment, conb, wFBean);
//
//        return true;
//    }
//    
//    
//    /**
//     * 说明：临时应急用：添加下一环节的办理人
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean exeAddNextStepHandler(
//    		HttpServletRequest request, 
//    		HttpServletResponse response, 
//    		Environment environment, 
//    		ConnectBean conb)throws Exception {
//
////        BaseSessionUser user = _getSessionuser(request, response);
//        SessionUser sessionUser = (SessionUser) _getSessionuser(request, response);
//
//        String piid = _getParameter("piid", request, response);//当前流程实例
//        String nextnodename = _getParameter("nextnodename", request, response);//下一环节的nodename
//        
//        String actorId = sessionUser.getPersonuuid();
//        String deptuuId = sessionUser.getDeptuuid();
//        
//        WFBean wFBean = WFFrame.wb_queryByPiid(environment, conb, piid);
//        if(wFBean!=null){
//            WFNodeBean nextNode = wFBean.getNodeBean(nextnodename);//获取下一环节的WFNodeBean
//            if(nextNode!=null){
//                //构造下一环节办理人
//                WFActorBean nextStepHandler = new WFActorBean(actorId, IWFOperation.PARTICIPANT_TYPE_USER,deptuuId);
//                ArrayList<WFActorBean> actors = nextNode.getCands();//先获取原有的候选者
//                actors.add(nextStepHandler);
//                
//                nextNode.setCands(actors);//新增候选者
//                
//                WFFrame.wb_save(environment, conb, wFBean);
//            }
//        }
////        HashMap<String, WFNodeBean> nodeMap = wFBean.getNodeMap();//获取当前节点对象列表，这里key是nodename
//
//        return true;
//    }
//    
//    /**
//     * 说明：临时应急用：查看流程实例下的变量
//     *<p>
//     * Method getProcessInstanceVariables
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean getProcessInstanceVariables(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb)
//    throws Exception {
//        JSONObject returnObject = new JSONObject();
//        StringBuffer html = new StringBuffer();
//        String piid = _getParameter("piid", request, response);
//        
//        if(piid!=null&&piid.trim().length()>0){
//            HashMap<Object, Object> pivariables =  WFUtils.Flow_GetVariable(environment, conb, piid);
//            if(pivariables!=null){
//               Iterator it =  pivariables.keySet().iterator();
//               html.append("<table border='1' cellspacing=\"1\" >");
//               html.append("<tr>");
//               html.append("<td colspan='2'>");
//               html.append("<h3>流程变量列表：</h3>");
//               html.append("</td>");
//               html.append("</tr>");
//               html.append("<tr>");
//               html.append("<td>");
//               html.append("变量名");
//               html.append("</td>");
//               html.append("<td>");
//               html.append("变量值");
//               html.append("</td>");
//               html.append("</tr>");
//               while(it.hasNext()){
//                   String key = (String)it.next();
//                   html.append("<tr name='wfrow'>");
//                   html.append("<td>");
//                   html.append(key);
//                   html.append("</td>");
//                   html.append("<td style='width:300px;'>");
//                   html.append("<input type='hidden' name='variable' value='").append(key).append("'></input>");
//                   html.append("<input type='text' name='variablevalue' style='width:300px;' value='").append(pivariables.get(key)).append("'></input>");
//                   html.append("</td>");
//                   html.append("</tr>");
//               }
//            }
//            WFBean wFBean = WFFrame.wb_queryByPiid(environment, conb, piid);
//            if(wFBean==null){
//                wFBean = WFFrame.wb_queryByPiid(environment, conb, piid,true);
//            }
//            HashMap<String, WFNodeBean> nodeMap = wFBean.getNodeMap();
//            Iterator<String> it = nodeMap.keySet().iterator();
//            html.append("<table border='1' cellspacing=\"1\" style=\"margin-top:20px;\">");
//            html.append("<tr>");
//            html.append("<td colspan='4'>");
//            html.append("<h3>环节变量列表：</h3>");
//            html.append("</td>");
//            html.append("</tr>");
//            html.append("<tr>");
//            html.append("<td>");
//            html.append("环节名");
//            html.append("</td>");
//            html.append("<td>");
//            html.append("变量名");
//            html.append("</td>");
//            html.append("<td>");
//            html.append("变量值");
//            html.append("</td>");
//            html.append("<td>");
//            html.append("操作");
//            html.append("</td>");
//            html.append("</tr>");
//            while (it.hasNext()) {
//                String _nodeName = it.next();
//                    WFNodeBean wfNodeBean = nodeMap.get(_nodeName);
//                    HashMap<Object, Object> nodevariables =  wfNodeBean.getVariables();
//                    if(nodevariables==null){
//                        System.out.println("ssssssss");
//                    }
//                    Iterator itnode =  nodevariables.keySet().iterator();
//                    int i=0;
//                    while (itnode.hasNext()) {
//                        String key = (String) itnode.next();
//                        html.append("<tr name='noderow'>");
//                        if(i==0){
//                            html.append("<td rowspan='"+nodevariables.size()+"'>");
//                            html.append(wfNodeBean.getNodetitle()+wfNodeBean.getNodename());
//                            html.append("</td>");
//                        }
//                        html.append("<td>");
//                        html.append(key);
//                        html.append("</td>");
//                        html.append("<td style='width:300px;'>");
//                        html.append("<input type='hidden' name ='nodename' value='").append(wfNodeBean.getNodename()).append("'></input>");
//                        html.append("<input type='hidden' name='nondevariable' value='").append(key).append("'></input>");
//                        html.append("<input type='text' name='nondevariablevalue' style='width:300px;' value='").append(nodevariables.get(key)==null?"":nodevariables.get(key)).append("'></input>");
//                        html.append("</td>");
//                        if(i==0){
//                            html.append("<td rowspan='"+nodevariables.size()+"'>");
//	                        html.append("<button onclick=\"showWFNodeBean('"+piid+"','"+wfNodeBean.getNodename()+"')\">查看环节</button>");
//	                        html.append("</td>");
//                        }
//                        html.append("</tr>");
//                        i++;
//                    }
//            }
//            
//            
//            //环节处理人
//            it = nodeMap.keySet().iterator();
//            html.append("<table border='1' cellspacing=\"1\" style=\"margin-top:20px;\">");
//            html.append("<tr>");
//            html.append("<td colspan='3'>");
//            html.append("<h3>环节处理人列表：</h3>");
//            html.append("</td>");
//            html.append("</tr>");
//            html.append("<tr>");
//            html.append("<td>");
//            html.append("环节名");
//            html.append("</td>");
//            html.append("<td>");
//            html.append("处理人ID");
//            html.append("</td>");
//            html.append("<td>");
//            html.append("值");
//            html.append("</td>");
//            html.append("</tr>");
//            while (it.hasNext()) {
//                String _nodeName = it.next();
//                    WFNodeBean wfNodeBean = nodeMap.get(_nodeName);
//                    //环节处理人
//                    ArrayList<WFActorBean> actors = wfNodeBean.getActors();
//                    int i=0;
//                    for(int j=0;j<actors.size();j++){
//                    	WFActorBean actorBean = actors.get(j);
//                    	html.append("<tr name='nodeactorrow'>");
//                    	if(i==0){
//                            html.append("<td rowspan='"+actors.size()+"'>");
//                            html.append(wfNodeBean.getNodetitle()+wfNodeBean.getNodename());
//                            html.append("</td>");
//                        }
//                        html.append("<td>");
//                        html.append(actorBean.getActorId());
//                        html.append("</td>");
//                        html.append("<td style='width:600px;'>");
//                        html.append("<input type='text' name='' style='width:600px;' value='").append(actorBean.toJSON().toString()).append("'></input>");
//                        html.append("</td>");
//                        html.append("</tr>");
//                        i++;
//                    }
//            }
//            
//            
//           String strhandler = wFBean.getStrhandler();
//           html.append("<table border='1' cellspacing=\"1\" style=\"margin-top:20px;\">");
//           html.append("<tr>");
//           html.append("<td colspan='2'>");
//           html.append("<h3>处理类列表：</h3>");
//           html.append("</td>");
//           html.append("</tr>");
//           html.append("<tr>");
//           html.append("<td>");
//           html.append("功能");
//           html.append("</td>");
//           html.append("<td>");
//           html.append("值");
//           html.append("</td>");
//           html.append("</tr>");
//           html.append("<tr name='handrow'>");
//           html.append("<td>");
//           html.append("处理类");
//           html.append("</td>");
//           html.append("<td style='width:300px;'>");
//           html.append("<input type='text' name='strhandler' style='width:300px;' value='").append(strhandler).append("'></input>");
//           html.append("</td>");
//           html.append("</tr>");
//        }
//        _PRINT(request, response, html.toString());
//        return true;
//
//    }
//    
//    /**
//     * 说明：临时应急用：查看流程实例的流程环节对象
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean getProcessInstanceWFNodeBean(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
//    	JSONObject returnObject = new JSONObject();
//    	try{
//	    	String piid = _getParameter("piid", request, response);
//	    	String nodename = _getParameter("nodename", request, response);
//	    	String fromlastpdid = _getParameter("fromlastpdid", request, response);//是否读取最新的流程模板
//	    	
//	    	if(piid==null || piid.trim().length()==0)  throw new Exception("流程实例标识不允许为空");
//	    	
//    		WFBean wFBean = WFFrame.wb_queryByPiid(environment, conb, piid);
////            if(wFBean==null){
////                wFBean = WFFrame.wb_queryByPiid(environment, conb, piid,true);
////            }
//            if(wFBean==null) throw new Exception("流程实例"+piid+"未找到对应的流程变量WFBean");
//            
//            
//            if("1".equals(fromlastpdid)){
//            	String pdname = wFBean.getPdname();
//            	String lastpdid = WFUtils.Flow_GetWorkflowPdid(environment,conb,pdname);
//            	wFBean = WFFrame.wb_create(lastpdid);
//            }
//            
//            
//            WFNodeBean wfNodeBean = wFBean.getNodeBean(nodename);
//            if(wfNodeBean==null) throw new Exception("流程环节"+nodename+"未找到对应的环节变量WFNodeBean");
//            
//            
//            //属性
//            returnObject.put("nodetype", wfNodeBean.getNodetype());
//            returnObject.put("sign_signtype", wfNodeBean.getSign_signtype());
//            returnObject.put("sign_policy", wfNodeBean.getSign_policy());
//            //候选者
//            JSONArray candsRow = new JSONArray();
//            ArrayList<WFActorBean> cands = wfNodeBean.getCands();
//            if(cands==null) cands = new ArrayList<WFActorBean>();
//            for(int i=0;i<cands.size();i++){
//            	candsRow.add(cands.get(i).toJSON());
//            }
//            returnObject.put("cands", candsRow);
//	    	//参与者
//            JSONArray actorsRow = new JSONArray();
//            ArrayList<WFActorBean> actors = wfNodeBean.getActors();
//            if(actors==null) actors = new ArrayList<WFActorBean>();
//            for(int i=0;i<actors.size();i++){
//            	actorsRow.add(actors.get(i).toJSON());
//            }
//            returnObject.put("actors", actorsRow);
//            
//            
//            
//	    	returnObject.put("code", "1");
//    	}catch (Exception e) {
//    		returnObject.put("code", "0");
//    		returnObject.put("desc", e.getMessage());
//		}
//    	_PRINT(request, response, returnObject.toString());
//    	return true;
//    }
//    
//    /**
//     * 说明：临时应急用：保存流程实例的流程环节对象
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public boolean setProcessInstanceWFNodeBean(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
//    	JSONObject returnObject = new JSONObject();
//    	try{
//    		String piid = _getParameter("piid", request, response);
//	    	String nodename = _getParameter("nodename", request, response);
//	    	String nodetype = _getParameter("nodetype", request, response);
//	    	String sign_signtype = _getParameter("sign_signtype", request, response);
//	    	String sign_policy = _getParameter("sign_policy", request, response);
//	    	String cands = _getParameter("cands", request, response);
//	    	
//	    	if(piid==null || piid.trim().length()==0)  throw new Exception("流程实例标识不允许为空");
//	    	
//	    	WFBean wFBean = WFFrame.wb_queryByPiid(environment, conb, piid);
//	    	if(wFBean==null) throw new Exception("流程实例"+piid+"未找到对应的流程变量WFBean");
//	    	
//	    	WFNodeBean wfNodeBean = wFBean.getNodeBean(nodename);
//	    	if(wfNodeBean==null) throw new Exception("流程环节"+nodename+"未找到对应的环节变量WFNodeBean");
//	    	
//	    	wfNodeBean.setNodetype(nodetype);
//	    	wfNodeBean.setSign_signtype(sign_signtype);
//	    	wfNodeBean.setSign_policy(sign_policy);
//	    	
//	    	ArrayList<WFActorBean> candslist = new ArrayList<WFActorBean>();
//	    	JSONArray candsRows = JSONArray.fromObject(cands);
//	    	for(int i=0;i<candsRows.size();i++){
//	    		JSONObject candsRow = candsRows.getJSONObject(i);
//	    		WFActorBean wfActorBean = new WFActorBean(candsRow.getString("actorid"),candsRow.getString("actortype"),candsRow.getString("deptuuid"));
//	    		candslist.add(wfActorBean);
//	    	}
//	    	wfNodeBean.setCands(candslist);
//	    	
//	    	WFFrame.wb_save(environment, conb, wFBean);
//	    	
//    		returnObject.put("code", "1");
//    		returnObject.put("desc", "保存成功");
//    	}catch (Exception e) {
//    		returnObject.put("code", "0");
//    		returnObject.put("desc", e.getMessage());
//		}
//    	_PRINT(request, response, returnObject.toString());
//    	return true;
//    }
//    
//    /**
//     * 说明：重新更新sequence最大值
//     *<p>
//     * Method exeRestSequence
//     * @param context
//     * @return
//     * @throws Exception
//     */
//    public boolean exeRestSequence(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
//        DbidGenerator dg =  DbidGenerator.getDbidGenerator();
//        if(dg!=null && dg instanceof DatabaseDbidGenerator){
//            ((DatabaseDbidGenerator)dg).reset();
//        }
//        _PRINT(request, response,  "<code>1</code>");
//        return true;
//
//    }
//
//    public boolean getWFLogTraceList(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
//    	StringBuffer html = new StringBuffer();
//    	
//    	html.append("<hr><br/><button name=\"button2\"  id=\"button2\" onclick=\"showvariables()\">刷新</button>"+WDKEnvironment.getThreadMapSize()+"<br/>");
//    	
//    	 html.append("<table border='1' cellspacing=\"1\" >");
//         html.append("<tr>");
//         html.append("<td>");
//         html.append("TraceId");
//         html.append("</td>");
//         html.append("<td>");
//         html.append("操作");
//         html.append("</td>");
//         html.append("</tr>");
//         
//         Iterator<LogEyeTraceBean> list = LogEye.getInstance().getTraceList();
//         while(list.hasNext()){
//        	 LogEyeTraceBean b = list.next();
//     		html.append("<tr>");
//            html.append("<td>");
//            html.append(b.getClassName()+"/"+b.getMethod());
//            html.append("</td>");
//            html.append("<td style='width:100px;'>");
//            html.append("<button name=\"button\" onclick=\"showlog('"+b.getTraceid()+"')\">查看</button>");
//            html.append("</td>");
//            html.append("</tr>");
//         }
//
//    	html.append("</table>");
//    	
//    	_PRINT(request, response, html.toString());
//        return true;
//    }
//    
//    public boolean getWFLogTraceLog(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb) throws Exception {
//    	
//    	String traceid = _getParameter("traceid", request, response);
//    	
//    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");
//    	
//    	
//    	JSONArray jrows = new JSONArray();
//    	List<LogEyeBean> list = LogEye.getInstance().getLogList(traceid);
//    	for(int i=0;i<list.size();i++){
//    		JSONObject jrow = new JSONObject();
//    		jrow.put("id", list.get(i).getId());
//    		jrow.put("parentid", list.get(i).getParentid());
//    		jrow.put("classname", list.get(i).getClassname());
//    		jrow.put("method", list.get(i).getMethod());
//    		jrow.put("begintime", list.get(i).getBegintime()==0?"":sdf.format(new Date(list.get(i).getBegintime())));
//    		jrow.put("endtime", list.get(i).getEndtime()==0?"":sdf.format(new Date(list.get(i).getEndtime())));
//    		jrow.put("timecost", list.get(i).getTimecost());
//    		jrow.put("issuccess", list.get(i).getEndtime()==0?"未知":list.get(i).isSuccess());
//    		jrow.put("msg", list.get(i).getMsg());
//    		jrows.add(jrow);
//    	}
//    	jrows = WDK.DataFormat_Treegrid(jrows, "id", "id", "parentid");
//    	
//    	
//    	_PRINT(request, response, jrows.toString());
//        return true;
//    }
//}