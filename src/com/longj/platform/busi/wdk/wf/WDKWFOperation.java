//package com.nci.platform.wf;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.List;
//
//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;
//
//import org.jbpm.api.cmd.Environment;
//import org.wdk.WDK;
//import org.wdk.core.bean.WDKEnvironment;
//import org.wdk.core.bean.WDKLogger;
//import org.wdk.module.logeye.bean.LogEyeBean;
//import org.wdk.module.wf.engine.core.bean.WFActorBean;
//import org.wdk.module.wf.engine.core.bean.WFBean;
//import org.wdk.module.wf.engine.core.bean.WFDecisionConditionBean;
//import org.wdk.module.wf.engine.core.bean.WFNodeBean;
//import org.wdk.module.wf.engine.core.handler.handlerDecision;
//
//import com.nci.platform.util.StringUtil;
//import com.nci.platform.wf.frame.WFFrame;
//import org.wdk.module.wf.frame.core.bean.bean_submit;
//import org.wdk.module.wf.frame.core.bean.bean_todo;
//import org.wdk.module.wql.WQL;
//import org.wdk.module.wql.core.bean.ConnectBean;
//import org.wdk.module.wql.core.bean.ErrorBean;
//import org.wdk.module.wql.core.bean.ResultBean;
//import org.wdk.module.wql.core.bean.WQLModule;
//
//import wql.WQLNames;
//
//import com.nci.platform.pb.handler.SessionUser;
//import com.nci.platform.pb.uum.UUM;
//import com.nci.platform.wf.base.IWFOperation;
//import com.nci.platform.wf.base.TodoBean;
//import com.nci.platform.wf.base.WFOperation;
//
///**
// * 类名：com.nci.platform.wf.WDKWFOperation <br/>
// * 描述：基于WDK框架下的流程方法公用,因为流程机制的修改，很多东西还不明确，因此这个很多方法还是未实现的<br/>
// * 版权：Copyright (c) 2015 杭州新世纪电子科技有限公司
// * <p>
// * </p>
// * History:<br>
// * 1、2015-7-1 上午10:08:41 yub
// * 
// * @author yub
// */
//public class WDKWFOperation extends WFOperation implements IWFOperation {
//    private static WDKLogger logger = new WDKLogger(WDKWFOperation.class.getName());
//  
//
//    // ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//    @Override
//    public JSONArray getNodeUsersByNodeName(SessionUser sessionUser, Environment environment, ConnectBean conb, String todoid, String nodename,
//            boolean bfilter,String direction) {
//        // JSONArray jrows = convertNodeActors(sessionUser,environment,conb,cands, WFFrame.wb_queryByPiid(environment, conb, piid),piid);
//        JSONArray jrows = new JSONArray();
//        try {
//            jrows = WFActorHelper.getTreeNode(sessionUser, environment, conb, todoid, nodename, bfilter,direction);
//        } catch (Exception e) {
//        }
//        return jrows;
//    }
//    
//    @Override
//    public JSONArray getNodeUsersByNodeName(SessionUser sessionUser, Environment environment, ConnectBean conb, String todoid, String nodename,
//            boolean bfilter,String direction,String rolefilterpara) {
//        // JSONArray jrows = convertNodeActors(sessionUser,environment,conb,cands, WFFrame.wb_queryByPiid(environment, conb, piid),piid);
//        JSONArray jrows = new JSONArray();
//        try {
//            jrows = WFActorHelper.getTreeNode(sessionUser, environment, conb, todoid, nodename, bfilter,direction,rolefilterpara);
//        } catch (Exception e) {
//        }
//        return jrows;
//    }
//
//    @Override
//    public JSONObject getTodoIndo(Environment environment, ConnectBean conb, String todoid) {
//        try {
//            return getTaskJsonObject(environment, conb, todoid);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    @Override
//    public JSONArray getUsersByCurrentDept(Environment environment, ConnectBean conb, String orgId,String todoid) {
//        JSONArray jrows = UUM.getPersonList("", "", "", orgId, "", conb);
//    	JSONArray jres = new JSONArray();
//        try {
//            bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
//            String piid = null,nodename = null;
//            if(todo!=null){
//                piid = todo.getPiid();
//                nodename = todo.getNodename();
//            }
//            HashMap<String,String> param = new HashMap<String,String>();
//            param.put("piid", piid);
//            param.put("nodename", nodename);
//            param.put("allstatus", "'0','1'");
//            JSONArray existJsonArray = WQL.getWO(WQLNames.QWDKWFTODO)
//                        .addParam("flag", "301")
//                        .addParamMap(param)
//                        .process(conb).getResultJSONArray(0);
//            JSONObject jtree = new JSONObject();
//            jtree.put("id", orgId);
//            jtree.put("text", getDeptNameByDeptId(conb,orgId));
//            jtree.put("iconCls", "");
//            jtree.put("state", "open");
//            jtree.put("parentId", "-1");
//            jtree.put("deptuuid", orgId);
//            jtree.put("type", "dept");
//            jtree.put("iconCls", "ext-icon-chart_organisation");
//            jres.add(jtree);
//            for (int i = 0; i < jrows.size(); i++) {
//                JSONObject jrow = jrows.getJSONObject(i);
//                boolean isExist = false;
//                for(int j=0;j<existJsonArray.size();j++){
//                    JSONObject objectJson = existJsonArray.getJSONObject(j);
//                    String actorid = objectJson.getString("actorid");
//                    if(actorid.equals(jrow.getString("node_uuid"))){
//                        isExist = true;
//                    }
//                }
//                if(!isExist){
//                    JSONObject _jtree = new JSONObject();
//                    _jtree.put("id", jrow.getString("node_uuid"));
//                    _jtree.put("text", jrow.getString("node_name"));
//                    _jtree.put("iconCls", "");
//                    _jtree.put("state", "");
//                    _jtree.put("parentId", orgId);
//                    _jtree.put("deptuuid", orgId);
//                    _jtree.put("type", "user");
//                    _jtree.put("iconCls", "ext-icon-user");
//                    jres.add(_jtree);
//                }
//            }
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        logger.info(jres.toString());
//        return jres;
//    }
//    
//    @Override
//    public JSONArray getAllUsersByCurrentDept(Environment environment, ConnectBean conb, String orgId, String todoid){
//    	JSONArray jres = new JSONArray();
//    	JSONArray dept = UUM.getOrgList("","","",orgId,"","","","",conb);
//    	JSONArray pers = UUM.getPersonList("", "", "", orgId, "", conb);
//    	try {
//            bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
//            String piid = null,nodename = null;
//            if(todo!=null){
//                piid = todo.getPiid();
//                nodename = todo.getNodename();
//            }
//            HashMap<String,String> param = new HashMap<String,String>();
//            param.put("piid", piid);
//            param.put("nodename", nodename);
//            param.put("allstatus", "'0','1'");
//            JSONArray existJsonArray = WQL.getWO(WQLNames.QWDKWFTODO)
//                        .addParam("flag", "301")
//                        .addParamMap(param)
//                        .process(conb).getResultJSONArray(0);
//            JSONObject jtree = new JSONObject();
//            jtree.put("id", orgId);
//            jtree.put("text", getDeptNameByDeptId(conb,orgId));
//            jtree.put("iconCls", "");
//            jtree.put("state", "open");
//            jtree.put("parentId", "-1");
//            jtree.put("deptuuid", orgId);
//            jtree.put("type", "dept");
//            jtree.put("iconCls", "ext-icon-chart_organisation");
//            jres.add(jtree);
//            
//            for (int i = 0; i < dept.size(); i++) {
//                JSONObject jrow = dept.getJSONObject(i);              
//                JSONObject _jtree = new JSONObject();
//                _jtree.put("id", jrow.getString("org_uuid"));
//                _jtree.put("text", jrow.getString("org_name"));
//                _jtree.put("iconCls", "");
//                _jtree.put("state", "open");
//                _jtree.put("parentId", orgId);
//                _jtree.put("deptuuid", jrow.getString("org_uuid"));
//                _jtree.put("type", "dept");
//                _jtree.put("iconCls", "ext-icon-chart_organisation");
//                jres.add(_jtree);
//                JSONArray _jrows = UUM.getPersonList("", "", "", jrow.getString("org_uuid"), "", conb);
//                for (int j = 0; j < _jrows.size(); j++) {
//                    JSONObject jrow1 = _jrows.getJSONObject(j);
//                    boolean isExist = false;
//                    for(int l=0;l<existJsonArray.size();l++){
//                        JSONObject objectJson = existJsonArray.getJSONObject(l);
//                        String actorid = objectJson.getString("actorid");
//                        if(actorid.equals(jrow1.getString("node_uuid"))){
//                            isExist = true;
//                        }
//                    }
//                    if(!isExist){
//                        JSONObject _jtree1 = new JSONObject();
//                        _jtree1.put("id", jrow1.getString("node_uuid"));
//                        _jtree1.put("text", jrow1.getString("node_name"));
//                        _jtree1.put("iconCls", "");
//                        _jtree1.put("state", "open");
//                        _jtree1.put("parentId", jrow1.getString("parent_uuid"));
//                        _jtree1.put("deptuuid", jrow1.getString("parent_uuid"));
//                        _jtree1.put("type", "user");
//                        _jtree1.put("iconCls", "ext-icon-user");
//                        jres.add(_jtree1);
//                    }
//                }
//                
//            }
//            
//            for (int i = 0; i < pers.size(); i++) {
//                JSONObject jrow = pers.getJSONObject(i);
//                boolean isExist = false;
//                for(int j=0;j<existJsonArray.size();j++){
//                    JSONObject objectJson = existJsonArray.getJSONObject(j);
//                    String actorid = objectJson.getString("actorid");
//                    if(actorid.equals(jrow.getString("node_uuid"))){
//                        isExist = true;
//                    }
//                }
//                if(!isExist){
//                    JSONObject _jtree = new JSONObject();
//                    _jtree.put("id", jrow.getString("node_uuid"));
//                    _jtree.put("text", jrow.getString("node_name"));
//                    _jtree.put("iconCls", "");
//                    _jtree.put("state", "");
//                    _jtree.put("parentId", orgId);
//                    _jtree.put("deptuuid", orgId);
//                    _jtree.put("type", "user");
//                    _jtree.put("iconCls", "ext-icon-user");
//                    jres.add(_jtree);
//                }
//            }
//    	}catch (Exception e) {
//    		logger.errorWithNoException(e.getMessage());
//    		e.printStackTrace();
//    	}
//    	return jres;
//    }
//
//    @Override
//    public JSONArray getPreActivityList(Environment environment, ConnectBean conb, String pdid, String piid, String nodename) {
//        ArrayList<WFNodeBean> nodelist2 = WFUtils.Flow_GetPreActivityListByPiid(environment, conb, piid, nodename);
//        JSONArray returnArray = new JSONArray();
//        boolean isChecked = false;
//        WFBean wb = WFUtils.Flow_QueryWbByPiid(environment, conb, piid);
//        String bdlcode = BDL.getBdlCode(wb);
//        if(StringUtil.isNotBlank(bdlcode)){
//        	//对nodebeanList进行排序
//        	nodelist2 = activityNodeSrot(nodelist2, bdlcode, environment, conb);
//        }
//        for (int i = (nodelist2.size() - 1); i >= 0; i--) {
//            WFNodeBean nodebean = nodelist2.get(i);
//            if (nodebean.isStart()) {
//                continue;
//            }
//            if (nodebean.isDecision()) {
//                continue;
//            }
//            if (!nodebean.canBeReturn()) {
//                // 如果不允许被退回，那么此处不要显示这环节
//                continue;
//            }
//            JSONObject node = new JSONObject();
//            node.put("decisionnode", "");
//            node.put("nodeid", nodebean.getNodename());
//            node.put("nodename", nodebean.getNodetitle());
//            if (!isChecked) {
//                node.put("checked", "checked");
//                isChecked = true;
//            }
//            node.put("isfirst", nodebean.isFirst());
//            node.put("isend", nodebean.isEnd());
//            node.put("issign", nodebean.isSign());
//            node.put("nodetype", nodebean.getNodetype());
//            node.put("canassign", nodebean.getCanassign());
//            node.put("canrecover", nodebean.getCanrecover());
//            node.put("canberecover", nodebean.getCanberecover());
//            node.put("canreturn", nodebean.getCanreturn());
//            node.put("canbereturn", nodebean.getCanbereturn());
//            node.put("canfree", nodebean.getCanfree());
//            node.put("canbefree", nodebean.getCanbefree());
//            try {
//                node.put("ismulti", getNodeActorSelectMode(wb, environment, conb, nodebean.getNodename()));
//            } catch (Exception e) {
//                node.put("ismulti", "0");
//            }
//            node.put("defaultactor", getNodeDefaultActorSelectMode(wb, environment, conb, nodebean.getNodename()));
//            //node.put("defaultactor", getNodeDefaultActor(wb, environment, conb, nodebean.getNodename()));
//            returnArray.add(0, node);
//        }
//        return returnArray;
//    }
//
//    @Override
//    public JSONArray getNotionTemplates(Environment environment, ConnectBean conb, String firstSort, String secondSort,String userid, String app_code) {
//        // TODO Auto-generated method stub
//    	List<String> tempList_uuid = new ArrayList<String>();
//    	List<String> tempList_text = new ArrayList<String>();
//    	List<String> tempList_type = new ArrayList<String>();
//        JSONArray jres = new JSONArray();
//        ResultBean resultBean = WQL.getWO(WQLNames.QPFWF0002).addParam("userid", userid).addParam("app_code", app_code).process(conb);
//        if (resultBean != null && resultBean.isSuccess()) {
//            JSONArray aa = resultBean.getResultJSONArray(0);
//            if (aa != null) {
//                for (int i = 0; i < aa.size(); i++) {
//                    JSONObject o = aa.getJSONObject(i);
//                    try {
//                        String content = o.getString("content");
//                        String result_uuid = o.getString("result_uuid");
//                        String type = o.getString("type");
//                        tempList_uuid.add(result_uuid);
//                        tempList_text.add(content);
//                        tempList_type.add(type);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
//      //  String[] tempList = new String[]{"同意。","不同意。","同意，请领导审核。"};
//        for (int i = 0; i < tempList_uuid.size(); i++) {
//            JSONObject jtree = new JSONObject();
//            jtree.put("id",  tempList_uuid.get(i));
//            jtree.put("text", tempList_text.get(i));
//            jtree.put("iconCls", "");
//            jtree.put("state", "");
//            jtree.put("attributes", "{'hidden':'true','type':'"+tempList_type.get(i)+"'}");
//            jres.add(jtree);
//        }
//
//        return jres;
//    }
//
//    @Override
//    public JSONArray getUsersByCurrentDeptNoDept(Environment environment, ConnectBean conb, String orgId, String todoid) {
//        JSONArray jrows = UUM.getPersonList("", "", "", orgId, "", conb);
//        JSONArray jres = new JSONArray();
//        try {
//            bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
//            String piid = null,nodename = null;
//            if(todo!=null){
//                piid = todo.getPiid();
//                nodename = todo.getNodename();
//            }
//            HashMap<String,String> param = new HashMap<String,String>();
//            param.put("piid", piid);
//            param.put("nodename", nodename);
//            param.put("allstatus", "'0','1'");
//            JSONArray existJsonArray = WQL.getWO(WQLNames.QWDKWFTODO)
//                        .addParam("flag", "301")
//                        .addParamMap(param)
//                        .process(conb).getResultJSONArray(0);
//            for (int i = 0; i < jrows.size(); i++) {
//                JSONObject jrow = jrows.getJSONObject(i);
//                boolean isExist = false;
//                for(int j=0;j<existJsonArray.size();j++){
//                    JSONObject objectJson = existJsonArray.getJSONObject(j);
//                    String actorid = objectJson.getString("actorid");
//                    if(actorid.equals(jrow.getString("node_uuid"))){
//                        isExist = true;
//                    }
//                }
//                if(!isExist){
//                    JSONObject _jtree = new JSONObject();
//                    _jtree.put("id", jrow.getString("node_uuid"));
//                    _jtree.put("text", jrow.getString("node_name"));
//                    _jtree.put("iconCls", "");
//                    _jtree.put("state", "");
//                    _jtree.put("parentId", orgId);
//                    JSONObject attr = new JSONObject();
//                    attr.put("deptuuid", orgId);
//                    _jtree.put("attributes", attr);
//                    _jtree.put("type", "user");
//                    _jtree.put("iconCls", "ext-icon-user");
//                    jres.add(_jtree);
//                }
//            }
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        logger.info(jres.toString());
//        return jres;
//    }
//
//    @Override
//    public JSONArray getTodoSelectedUsers(Environment environment, ConnectBean conb, String todoid) {
//        // TODO Auto-generated method stub(暂缓)
//        JSONArray returnArray = new JSONArray();
//        bean_todo todo;
//        try {
//            todo = WFFrame.todo_querySingle(environment, conb, todoid);
//            String piid = null,nodename = null;
//            if(todo!=null){
//                piid = todo.getPiid();
//                nodename = todo.getNodename();
//            }
//            HashMap<String,String> param = new HashMap<String,String>();
//            param.put("piid", piid);
//            param.put("nodename", nodename);
//            param.put("allstatus", "'0','1'");
//            JSONArray existJsonArray = WQL.getWO(WQLNames.QWDKWFTODO)
//                        .addParam("flag", "301")
//                        .addParamMap(param)
//                        .process(conb).getResultJSONArray(0);
//            
//            if(existJsonArray!=null&&existJsonArray.size()>0){
//                for(int i=0;i<existJsonArray.size();i++){
//                JSONObject _jtree = new JSONObject();
//                JSONObject jrow = existJsonArray.getJSONObject(i);
//                _jtree.put("id", jrow.getString("actorid"));
//                _jtree.put("text","<font color='gray'>"+ WFUtils.Flow_GetUserNameById(conb, jrow.getString("actorid"))+"</font>");
//                _jtree.put("iconCls", "");
//                _jtree.put("state", "");
//                _jtree.put("type", "user");
//                _jtree.put("iconCls", "ext-icon-user");
//                returnArray.add(_jtree);
//                }
//                
//                
//            }
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//       
//        
//        return returnArray;
//    }
//    
//    
//    /**
//     * 说明：获取当前节点的参与者选择类型
//     *<p>
//     * Method getNodeActorSelectMode
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public String getNodeActorSelectMode(WFBean wfbean, Environment environment, ConnectBean conb, String nodename) throws Exception {
//        String iscancheck = "0";
//        if (wfbean != null) {
//            WFNodeBean wfnode = wfbean.getNodeBean(nodename);
//            if (wfnode == null) {
//                return iscancheck;
//            }
//            if (wfnode.isSign() || wfnode.isSubprocess()) {
//                return "1";
//            }
//            String bdlcode = BDL.getBdlCode(wfbean);
//            if (bdlcode != null && !"".equals(bdlcode)) {
//                HashMap<String, HashMap<String, String>> variables = BDL.getBdlNodevariables(environment, conb, bdlcode, wfbean.getPiid());
//                if (variables != null && variables.containsKey(nodename)) {
//                    HashMap<String, String> nodev = variables.get(nodename);
//                    if (nodev != null && nodev.containsKey(IWFOperation.BDL_NODE_VARIABLE_ACTOR_MODE)) {
//                        iscancheck = nodev.get(IWFOperation.BDL_NODE_VARIABLE_ACTOR_MODE);
//                    }
//                }
//            }
//        }
//        return iscancheck;
//    }
//    
//    /**
//     * 说明：获取当前节点的参与者默认选中类型（对多参与者时有效） no-不选 first-选择第一个 deptfirst-选择每个部门的第一个  all-选择全部(仅对多选有效)
//     * @param wfbean
//     * @param environment
//     * @param conb
//     * @param nodename
//     * @return
//     * @throws Exception
//     */
//    public String getNodeDefaultActorSelectMode(WFBean wfbean, Environment environment, ConnectBean conb, String nodename){
//    	boolean nodeset = true;
//        String selectmode = WDK.getNodeParam("wf_send_defaultactorselectmode");//默认先从node.xml配置中读取
//        if(selectmode==null || "".equals(selectmode)){
//        	selectmode = "first";//如果node.xml中未设置参数则默认选中第一个人
//        	nodeset = false;
//        }
//        //最后以BDL配置中的参数为准
//        try{
//	        if (wfbean != null) {
//	            WFNodeBean wfnode = wfbean.getNodeBean(nodename);
//	            if (wfnode == null) {
//	                return selectmode;
//	            }
//	            if ( wfnode.isSubprocess()) {
//	                return selectmode;
//	            }
//	            boolean bdlnodeset = false;
//	            String bdlcode = BDL.getBdlCode(wfbean);
//	            if (bdlcode != null && !"".equals(bdlcode)) {
//	                HashMap<String, HashMap<String, String>> variables = BDL.getBdlNodevariables(environment, conb, bdlcode, wfbean.getPiid());
//	                if (variables != null && variables.containsKey(nodename)) {
//	                    HashMap<String, String> nodev = variables.get(nodename);
//	                    if (nodev != null && nodev.containsKey(IWFOperation.BDL_NODE_VARIABLE_DEFAULTACTOR_MODE)) {
//	                    	selectmode = nodev.get(IWFOperation.BDL_NODE_VARIABLE_DEFAULTACTOR_MODE);
//	                    	bdlnodeset = true;
//	                    }
//	                }
//	            }
//	            if(wfnode.isSign() && nodeset==false && bdlnodeset==false){
//	            	//如果环节为会签环节但NODE_DEFAULTACTOR_MODE 参数未设置，并且node.xml参数也未设置，则默认为all（兼容之前会签环节默认全选人员）
//	            	selectmode = "all";
//	            }
//	        }
//        }catch (Exception e) {
//			logger.errorWithNoException("获取当前节点的参与者默认选中类型异常："+e.getMessage());
//		}
//        return selectmode;
//    }
//    
//    /**
//     * 说明：获取当前节点的默认参与者，如果设置了默认参与者则按该设置选中人员，未设置该参数则按“参与者默认选中类型”参数选中参与人
//     * @param wfbean
//     * @param environment
//     * @param conb
//     * @param nodename
//     * @return
//     */
//    public String getNodeDefaultActor(WFBean wfbean, Environment environment, ConnectBean conb, String nodename){
//    	//从bdl配置的环节参数中读取默认参与者参数
//    	String defaultActor = "";
//    	try{
//    		if (wfbean != null) {
//    			WFNodeBean wfnode = wfbean.getNodeBean(nodename);
//    			if (wfnode != null && !wfnode.isSubprocess()) {
//    				String bdlcode = BDL.getBdlCode(wfbean);
//    				if (bdlcode != null && !"".equals(bdlcode)) {
//    					HashMap<String, HashMap<String, String>> variables = BDL.getBdlNodevariables(environment, conb, bdlcode, wfbean.getPiid());
//    					if (variables != null && variables.containsKey(nodename)) {
//    						HashMap<String, String> nodev = variables.get(nodename);
//    						if (nodev != null && nodev.containsKey(IWFOperation.BDL_NODE_VARIABLE_DEFAULTACTOR)) {
//    							defaultActor = nodev.get(IWFOperation.BDL_NODE_VARIABLE_DEFAULTACTOR);
//    						}
//    					}
//    				}
//    			}
//    		}
//    	}catch (Exception e) {
//			logger.errorWithNoException("获取当前节点的默认参与者异常："+e.getMessage());
//		}
//    	return defaultActor;
//    }
//    
//    /**
//     * 说明：获取当前节点是否意见输入
//     *<p>
//     * Method getNodeActorOpinion
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @return
//     * @throws Exception
//     */
//    public String getNodeInputOpinion(WFBean wfbean, Environment environment, ConnectBean conb, String nodename) throws Exception {
//        String iscancheck = "1";
//        if (wfbean != null) {
//            WFNodeBean wfnode = wfbean.getNodeBean(nodename);
//            if (wfnode == null) {
//                return iscancheck;
//            }
//            if (wfnode.isSign() || wfnode.isSubprocess()) {
//                return "1";
//            }
//            String bdlcode = BDL.getBdlCode(wfbean);
//            if (bdlcode != null && !"".equals(bdlcode)) {
//                HashMap<String, HashMap<String, String>> variables = BDL.getBdlNodevariables(environment, conb, bdlcode, wfbean.getPiid());
//                if (variables != null && variables.containsKey(nodename)) {
//                    HashMap<String, String> nodev = variables.get(nodename);
//                    if (nodev != null && nodev.containsKey(IWFOperation.BDL_NODE_VARIABLE_INPUT_OPTION)) {
//                        iscancheck = nodev.get(IWFOperation.BDL_NODE_VARIABLE_INPUT_OPTION);
//                    }
//                }
//            }
//        }
//        return iscancheck;
//    }
//    
//
//    /**
//     * 说明：对环节节点进行排序，根据事项中配置的顺序<br>
//     * @param nodelist
//     * @return
//     */
//    private ArrayList activityNodeSrot(ArrayList<WFNodeBean>  nodelist, String bdl_code, Environment environment, ConnectBean conb){
//    	if(nodelist==null || nodelist.size()<=1 || StringUtil.isBlank(bdl_code)){
//    		//为空或者只有一条记录或者bdl_code事项编码没传过来，那么是不用排序的了
//    		return nodelist;
//    	}
//    	ResultBean resultBean = WQL.getWO(WQLNames.QPFBDL0024)
//			.addParam("bdl_code", bdl_code)
//			.process(conb);
//    	if(resultBean.isSuccess()){
//    		JSONArray ret = resultBean.getResultJSONArray(0);
//			for(int i=0;i<ret.size();i++){
//				JSONObject row = ret.getJSONObject(i);
//				for(int j=0;j<nodelist.size();j++){
//					WFNodeBean node = nodelist.get(j);
//					if(node.getNodename().equalsIgnoreCase(row.getString("node_code"))){
//						//设置排序，因为WFNodeBean没有排序字段， 暂时用一下这个字段,最好是在WFNodeBean对象中能增加一个排序字段
//						node.setNodepage(row.getString("order_index"));
//						break;
//					}
//				}
//			}
//			//对环节节点进行排序
//			Collections.sort(nodelist, new Comparator<WFNodeBean>(){
//				@Override
//				public int compare(WFNodeBean o1, WFNodeBean o2) {
//					try{
//						int f1 = 9999;
//						int f2 = 9999;
//						//进行排序比较，结束节点是要放在最后面的，除非设置了排序序号
//						String order_index = o1.getNodepage();
//						if(StringUtil.isNotBlank(order_index)){
//							try{
//								f1 = Integer.parseInt(order_index);
//							} catch (NumberFormatException e) {
//							}
//						} else if(o1.isEnd()){
//							f1 = 10000;
//						}
//						String order_index2 = o2.getNodepage();
//						if(StringUtil.isNotBlank(order_index2)){
//							try{
//								f2 = Integer.parseInt(order_index2);
//							} catch (NumberFormatException e) {
//							}
//						}else if(o2.isEnd()){
//							f2 = 10000;
//						}
//						return f1 - f2;
//					}catch (Exception e) {
//						return 0;
//					}
//				}
//            });
//    	}else{
//			ArrayList errList = resultBean.getInfoError();
//			StringBuffer sb = new StringBuffer();
//			for(int i=0;i<errList.size();i++){
//				ErrorBean err = (ErrorBean)errList.get(i);
//				sb.append(err.toString());
//			}
//			logger.errorWithNoException("" + sb.toString());
//		}
//    	return nodelist;
//    }
//    
//    @Override
//    public JSONArray getChildrenActivityList(Environment environment, ConnectBean conb, String pdid, String piid, String nodename) {
//        JSONArray returnArray = new JSONArray();
//        HashSet<String> childNodeSet = new HashSet<String>();
//        try {
//
//            WFBean wb = WFUtils.Flow_QueryWbByPiid(environment, conb, piid);
//            if (wb != null) {
//            	/**
//            	 * 下一环节不显示的环节，在流程中配置了，但是提交时不希望显示在“下一环节”处的，多个之间用逗号分隔
//            	 * 比如督查督办的“部门承办”环节
//            	 */
//            	String notShowNode = "";
//                String defaultNodeNextName = null;
//                String bdlcode = BDL.getBdlCode(wb);
//                if (bdlcode != null && bdlcode.trim().length() > 0) {
//                    HashMap<String, HashMap<String, String>> nodeMap = BDL.getBdlNodevariables(environment, conb, bdlcode, piid);
//                    if (nodeMap != null && nodeMap.containsKey(nodename)) {
//                        HashMap<String, String> curnodemap = nodeMap.get(nodename);
//                        if(curnodemap!=null){
//                        	if(curnodemap.containsKey(IWFOperation.BDL_NODE_VARIABLE_DEFAULTNODE)){
//                        		defaultNodeNextName = curnodemap.get(IWFOperation.BDL_NODE_VARIABLE_DEFAULTNODE);
//                        	}
//                        	if(curnodemap.containsKey(IWFOperation.NODE_NOT_SHOW)){
//                        		notShowNode = curnodemap.get(IWFOperation.NODE_NOT_SHOW);
//                        		if(notShowNode == null){
//                        			notShowNode = "";
//                        		}
//                        	}
//                        }
//                    }
//                }
//                //defaultNodeNextName= "join1";
//                ArrayList<WFNodeBean> nodebeanList = WFUtils.Flow_GetNextActivityList(environment, conb,
//                        WFUtils.FLow_GetSingleTodo(environment, conb, piid, nodename).getId());
//                if(StringUtil.isNotBlank(bdlcode)){
//                	//对nodebeanList进行排序
//                	nodebeanList = activityNodeSrot(nodebeanList, bdlcode, environment, conb);
//                }
//                boolean ischecked = false;
//                for (int i = 0; i < nodebeanList.size(); i++) {
//                    WFNodeBean wfnode = nodebeanList.get(i);
//                    JSONObject node = new JSONObject();
//                    node.put("decisionnode", "");
//                    if (wfnode.isDecision()) {
//                        ArrayList<WFDecisionConditionBean> conds = wfnode.getConditions();
//                        List<String> nextargets = handlerDecision.processConditions(wb, wfnode, conds);
//                        if (nextargets != null && nextargets.size() > 0) {
//                            for (String nextarget : nextargets) {
//                                if(childNodeSet.contains(nextarget)){
//                                    continue;
//                                }
//                                WFNodeBean _wfnode = wb.getNodeBean(nextarget);
//                                JSONObject _node = new JSONObject();
//                                _node.put("decisionnode", wfnode.getNodename());
//                                _node.put("nodeid", _wfnode.getNodename());
//                                _node.put("nodename", _wfnode.getNodetitle());
//                                if (defaultNodeNextName == null || "".equals(defaultNodeNextName.trim())) {
//                                    if (i == 0 && !ischecked) {
//                                        _node.put("checked", "checked");
//                                        ischecked = true;
//                                    }
//                                } else {
//                                    if (defaultNodeNextName.equalsIgnoreCase(nextarget) && !ischecked) {
//                                        _node.put("checked", "checked");
//                                        ischecked = true;
//                                    }
//                                }
//                                _node.put("isfirst", _wfnode.isFirst());
//                                _node.put("isend", _wfnode.isEnd());
//                                _node.put("nodetype", _wfnode.getNodetype());
//                                _node.put("issign", _wfnode.isSign());
//                                _node.put("canassign", _wfnode.getCanassign());
//                                _node.put("canrecover", _wfnode.getCanrecover());
//                                _node.put("canberecover", _wfnode.getCanberecover());
//                                _node.put("canreturn", _wfnode.getCanreturn());
//                                _node.put("canbereturn", _wfnode.getCanbereturn());
//                                _node.put("canfree", _wfnode.getCanfree());
//                                _node.put("canbefree", _wfnode.getCanbefree());
//                                _node.put("ismulti",getNodeActorSelectMode(wb, environment, conb, _wfnode.getNodename()));
//                                _node.put("defaultactor", getNodeDefaultActorSelectMode(wb, environment, conb, _wfnode.getNodename()));
//                                //_node.put("defaultactor", getNodeDefaultActor(wb, environment, conb, _wfnode.getNodename()));
//                                if(notShowNode!=null && notShowNode.trim().length()>0 
//                                		&& ("," + notShowNode + ",").toLowerCase().indexOf(wfnode.getNodename().toLowerCase())>-1){
//                                	//该环节在“不显示在下一环节”中，设置参数，在提交页面不显示该环节
//                                	_node.put("isshow", "false");
//                                }
//                                returnArray.add(_node);
//                                childNodeSet.add(nextarget);
//                            }
//                        }
//                    } else {
//                        if(childNodeSet.contains(wfnode.getNodename())){
//                            continue;
//                        }
//                        node.put("nodeid", wfnode.getNodename());
//                        node.put("nodename", wfnode.getNodetitle());
//                        if (defaultNodeNextName == null || "".equals(defaultNodeNextName.trim())) {
//                            if (i == 0 && !ischecked) {
//                                node.put("checked", "checked");
//                                ischecked = true;
//                            }
//                        } else {
//                            if (defaultNodeNextName.equalsIgnoreCase(wfnode.getNodename()) && !ischecked) {
//                                node.put("checked", "checked");
//                                ischecked = true;
//                            }
//                        }
//                        node.put("isfirst", wfnode.isFirst());
//                        node.put("isend", wfnode.isEnd());
//                        node.put("nodetype", wfnode.getNodetype());
//                        node.put("issign", wfnode.isSign());
//                        node.put("canassign", wfnode.getCanassign());
//                        node.put("canrecover", wfnode.getCanrecover());
//                        node.put("canberecover", wfnode.getCanberecover());
//                        node.put("canreturn", wfnode.getCanreturn());
//                        node.put("canbereturn", wfnode.getCanbereturn());
//                        node.put("canfree", wfnode.getCanfree());
//                        node.put("canbefree", wfnode.getCanbefree());
//                        node.put("ismulti",getNodeActorSelectMode(wb, environment, conb, wfnode.getNodename()));
//                        node.put("defaultactor", getNodeDefaultActorSelectMode(wb, environment, conb, wfnode.getNodename()));
//                      //node.put("defaultactor", getNodeDefaultActor(wb, environment, conb, wfnode.getNodename()));
//                        if(notShowNode!=null && notShowNode.trim().length()>0 
//                        		&& ("," + notShowNode + ",").toLowerCase().indexOf(wfnode.getNodename().toLowerCase())>-1){
//                        	//该环节在“不显示在下一环节”中，设置参数，在提交页面不显示该环节
//                        	node.put("isshow", "false");
//                        }
//                        returnArray.add(node);
//                        childNodeSet.add(wfnode.getNodename());
//                    }
//                }
//                if (!ischecked && returnArray.size() > 0) {
//                    returnArray.getJSONObject(0).put("checked", "checked");
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return returnArray;
//    }
//
//    @Override
//    public JSONArray getAllActivityList(Environment environment, ConnectBean conb, String pdid, String piid, String nodename) {
//        WFBean wb = WFUtils.Flow_QueryWbByPiid(environment, conb, piid);// WFFrame.wb_create(pdid);
//        HashMap<String, ArrayList<String>> routeMap = wb.getRouteMap();
//        String endnode = wb.getEndNode().getNodename();
//        ArrayList<String> nodelist = null;
//        ArrayList<WFNodeBean> nodeBeanList = new ArrayList<WFNodeBean>();
//        if (routeMap != null && routeMap.size() > 0 && routeMap.containsKey(endnode)) {
//            nodelist = routeMap.get(endnode);
//            if (!nodelist.contains(endnode)) {
//                nodelist.add(endnode);
//            }
//        } else {
//            nodelist = WFFrame.pub_getNodeList(environment, conb, pdid);
//        }
//        //根据node名称获得nodebean对象
//        for (Iterator<String> it = nodelist.iterator(); it.hasNext();) {
//            String name = it.next();
//            WFNodeBean wnb = wb.getNodeBean(name);
//            if (wnb.isStart()) {
//                // 开始环节跳过
//                continue;
//            }
//            if (wnb.isEnd()) {
//                // 结束环节也进行跳过
//                //continue;
//            }
//            if (!wnb.canBeFree()) {
//                // 环节配置，如果不允许被特送，那么跳过此环节
//                continue;
//            }
//            nodeBeanList.add(wnb);
//        }
//
//        String bdlcode = BDL.getBdlCode(wb);
//        if(StringUtil.isNotBlank(bdlcode)){
//        	//对nodebeanList进行排序
//        	nodeBeanList = activityNodeSrot(nodeBeanList, bdlcode, environment, conb);
//        }
//        JSONArray jnodes = new JSONArray();
//        int i = 0;
//        for (Iterator<WFNodeBean> it = nodeBeanList.iterator(); it.hasNext();) {
//            JSONObject jnode = new JSONObject();
//            WFNodeBean wnb = it.next();
//            if (i == 0) {
//                jnode.put("checked", "checked");
//            }
//            jnode.put("isfirst", wnb.isFirst());
//            jnode.put("isend", wnb.isEnd());
//            jnode.put("issign", wnb.isSign());
//            jnode.put("nodeid", wnb.getNodename());
//            jnode.put("nodename", wnb.getNodetitle());
//            jnode.put("nodetype", wnb.getNodetype());
//            jnode.put("canassign", wnb.getCanassign());
//            jnode.put("canrecover", wnb.getCanrecover());
//            jnode.put("canberecover", wnb.getCanberecover());
//            jnode.put("canreturn", wnb.getCanreturn());
//            jnode.put("canbereturn", wnb.getCanbereturn());
//            jnode.put("canfree", wnb.getCanfree());
//            jnode.put("canbefree", wnb.getCanbefree());
//            try {
//            	jnode.put("ismulti",getNodeActorSelectMode(wb, environment, conb, wnb.getNodename()));
//            } catch (Exception e) {
//            	jnode.put("ismulti", "0");
//            }
//            jnode.put("defaultactor", getNodeDefaultActorSelectMode(wb, environment, conb, wnb.getNodename()));
//            //jnode.put("defaultactor", getNodeDefaultActor(wb, environment, conb, wnb.getNodename()));
//            if (wnb.isFirst()) {
//                // 第一个节点放置到最前面
//                jnodes.add(0, jnode);
//            } else {
//                jnodes.add(jnode);
//            }
//            i++;
//        }
//        return jnodes;
//    }
//
//    @Override
//    public TodoBean getTodoBean(Environment environment, ConnectBean conb, String todoid) {
//        bean_todo todo;
//        try {
//            todo = WFFrame.todo_querySingle(environment, conb, todoid);
//            if(todo==null){
//                todo = WFUtils.Flow_getSuspengTodo(conb, todoid);
//            }
//            if (todo != null) {
//                TodoBean bean = new TodoBean(todoid, todo.getNodename(), todo.getPdid(), todo.getPiid());
//                bean.setTaskid(todo.getTaskid());
//                bean.setSubtaskid(todo.getSubtaskid());
//                return bean;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//
//    }
//
//    @Override
//    public boolean todo_submit(Environment environment, ConnectBean conb, HashMap param) throws Exception {
//		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
//		boolean isSuccess = true;
//		String msg = "";
//		
//    	LogEyeBean log = wdkEnv.startLog(WDKWFOperation.class.getName(),"todo_submit(HashMap)");//日志跟踪
//        try {
//            // 构建submit提交对象
//            bean_submit submit = getBean_submit(environment,conb,param);
//            
//            // 提交
//            isSuccess = BDL.todo_submit(environment, conb, submit);
//            
//            
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
//    }
//    
//    @Override
//    public boolean todo_submit(Environment environment, ConnectBean conb, bean_submit submit) throws Exception{
//		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
//		boolean isSuccess = true;
//		String msg = "";
//		
//    	LogEyeBean log = wdkEnv.startLog( WDKWFOperation.class.getName(),"todo_submit(bean_submit)");//日志跟踪
//    	try {
//    		// 提交
//            isSuccess = BDL.todo_submit(environment, conb, submit);
//        
//	        
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
//    	return isSuccess;
//    }
//    
//
//
//    @Override
//    public JSONArray getWFActorList(Environment environment, ConnectBean conb,SessionUser sessionuser, String pdid, String piid, String nodename) {
//        WFBean wb = WFFrame.wb_queryByPiid(environment, conb, piid);
//        WFNodeBean wnb = wb.getNodeBean(nodename);
//        JSONArray jactors = new JSONArray();
//        ArrayList<WFActorBean> actors = wnb.getActors();
//        for(Iterator<WFActorBean> it = actors.iterator();it.hasNext();){
//            JSONObject actorObject=  new JSONObject();
//            WFActorBean wfab = it.next();
//            String actorType = wfab.getActorType();
//            if (sessionuser != null && sessionuser.getPersonuuid().equals(wfab.getActorId())) {
//                // 送达页面会签信息中建议不显示当前登录人的信息
//                continue;
//            }
//            if (WFOperation.PARTICIPANT_TYPE_USER.equals(actorType)) {
//                WQLModule wm = WQLModule.getWQLModule(IWFOperation.CODE_TYPE_PERSON);
//                actorObject.put("actorid", wm.id2name(wfab.getActorId(), "person_name", conb));
//            } else {
//                // TODO 后续再进行修改
//                actorObject.put("actorid", wfab.getActorId());
//            }
//            
//            actorObject.put("iscomplete", wfab.isComplete());
//            actorObject.put("ispass", wfab.isPass());
//            actorObject.put("comment", wfab.getComment());
//            actorObject.put("operdt", wfab.getOperdt());
//            jactors.add(actorObject);
//        }
//        return jactors;
//    }
//
//}
