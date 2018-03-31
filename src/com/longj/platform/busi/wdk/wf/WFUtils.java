package com.longj.platform.busi.wdk.wf;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.jbpm.api.ExecutionService;
import org.jbpm.api.ProcessInstance;
import org.jbpm.api.cmd.Environment;
import org.jbpm.pvm.internal.model.ExecutionImpl;
import org.wdk.WDK;
import org.wdk.WDKWQLNames;
import org.wdk.core.bean.WDKLogger;
import org.wdk.core.session.SessionManager;
import org.wdk.module.wf.WFConstant;
import org.wdk.module.wf.engine.JBPMUtil;
import org.wdk.module.wf.engine.WFEngine;
import org.wdk.module.wf.engine.core.bean.WFActorBean;
import org.wdk.module.wf.engine.core.bean.WFBean;
import org.wdk.module.wf.engine.core.bean.WFDecisionConditionBean;
import org.wdk.module.wf.engine.core.bean.WFNodeBean;
import org.wdk.module.wf.engine.core.handler.handlerDecision;
import org.wdk.module.wf.frame.core.bean.bean_depute;
import org.wdk.module.wf.frame.core.bean.bean_pd;
import org.wdk.module.wf.frame.core.bean.bean_start;
import org.wdk.module.wf.frame.core.bean.bean_submit;
import org.wdk.module.wf.frame.core.bean.bean_submit_target;
import org.wdk.module.wf.frame.core.bean.bean_todo;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.WQLModule;

import com.longj.platform.busi.wdk.uum.UUM;
import com.longj.platform.busi.wdk.wf.base.IWFOperation;
import com.longj.platform.busi.wdk.wf.base.NodeBean;
import com.longj.platform.busi.wdk.wf.frame.WFFrame;
import com.longj.platform.pb.util.WQLUtil;

import wql.WQLNames;


/**
 * 类名：com.nci.platform.wf.WFUtils <br/>
 * 描述：<br/>
 * 版权：Copyright (c) 2015 杭州新世纪电子科技有限公司
 * <p>
 * </p>
 * History:<br>
 * 1、2015-7-3 下午10:31:36 yub
 * 
 * @author yub
 */
public class WFUtils {

    private static WDKLogger logger = new WDKLogger(WFUtils.class.getName());
    public static HashMap<String,String> actorTypeMapping = new HashMap<String, String>();
    
    /**
     * 说明：获取当前流程下的子流程列表
     *<p>
     * Method Flow_getSubPdList
     * 
     * @param environment
     * @param conb
     * @param ppdid
     * @return
     */
    public static ArrayList<bean_pd> Flow_getSubPdList(Environment environment, ConnectBean conb, String ppdid) {
        WFBean wfBean = WFFrame.wb_create(ppdid);
        ArrayList<String> subPdList = new ArrayList<String>();
        if (wfBean != null) {
            HashMap<String, WFNodeBean> nodeBeanMap = wfBean.getNodeMap();
            Iterator it = nodeBeanMap.keySet().iterator();
            while (it.hasNext()) {
                String nodeName = (String) it.next();
                WFNodeBean nodeBean = nodeBeanMap.get(nodeName);
                subPdList.add(nodeBean.getSubnode());
            }
        }
        return Flow_getPdListByPdids(environment, conb, subPdList);
    }

    /**
     * 说明：通过模板ID列表集合获取模板对象列表
     *<p>
     * Method Flow_getPdListByPdids
     * 
     * @param environment
     * @param conb
     * @param pdLis
     * @return
     */
    public static ArrayList<bean_pd> Flow_getPdListByPdids(Environment environment, ConnectBean conb, ArrayList<String> pdLis) {
        ArrayList<bean_pd> returnList = new ArrayList<bean_pd>();
        ArrayList<bean_pd> all = Flow_getPdList(environment, conb);
        if (all != null) {
            for (bean_pd pd : all) {
                if (pdLis.contains(pd.getPdid())) {
                    returnList.add(pd);
                }
            }
        }
        return returnList;

    }

    /**
     * 说明：根据APP应用ID获取对应应用下的流程列表
     *<p>
     * Method Flow_getPdList
     * 
     * @param environment
     * @param conb
     * @param appid
     * @return
     */
    public static ArrayList<bean_pd> Flow_getPdList(Environment environment, ConnectBean conb, String appid) {
        return Flow_getPdList(environment, conb);
    }

    /**
     * 说明：获取所有的流程列表
     *<p>
     * Method Flow_getPdList
     * 
     * @param environment
     * @param conb
     * @return
     */
    public static ArrayList<bean_pd> Flow_getPdList(Environment environment, ConnectBean conb) {
        HashMap<String, bean_pd> pdnameMap = new HashMap<String, bean_pd>();
        ArrayList<bean_pd> allPdList = WFFrame.pd_query(environment, conb);
        ArrayList<bean_pd> returnList = new ArrayList<bean_pd>();
        if (allPdList != null) {
            for (bean_pd pd : allPdList) {
                String pdname = pd.getPdname();
                long version = Long.parseLong(pd.getPdversion());
                if (pdnameMap.containsKey(pdname)) {
                    bean_pd oldPd = pdnameMap.get(pdname);
                    long oldVersion = Long.parseLong(oldPd.getPdversion());
                    if (version > oldVersion) {
                        pdnameMap.put(pdname, pd);
                    }
                } else {
                    pdnameMap.put(pdname, pd);
                }
            }
        }
        if (pdnameMap != null && pdnameMap.size() > 0) {
            Iterator<String> it = pdnameMap.keySet().iterator();
            while (it.hasNext()) {
                String key = it.next();
                returnList.add(pdnameMap.get(key));
            }
        }
        return returnList;
    }

    /**
     * 说明：通过流程模板ID，获取当前流程模板下的环节列表（如果有子流程，包含子流程的环节）
     *<p>
     * Method FLow_getPdNodeList
     * 
     * @param environment
     * @param conb
     * @param pdid
     * @return
     */
    public static ArrayList<NodeBean> FLow_getPdNodeList(Environment environment, ConnectBean conb, String pdid) {
        ArrayList<NodeBean> returnArrayList = new ArrayList<NodeBean>();
        WFBean wfBean = WFFrame.wb_create(pdid);
        if (wfBean != null) {
            HashMap<String, WFNodeBean> nodeBeanMap = wfBean.getNodeMap();
            if (nodeBeanMap != null && nodeBeanMap.size() > 0) {
                Iterator it = nodeBeanMap.keySet().iterator();
                while (it.hasNext()) {
                    String nodeName = (String) it.next();
                    WFNodeBean nodeBean = nodeBeanMap.get(nodeName);
                    // 如果是人工任务、会签、或者子流程节点
                    if (nodeBean.isTask() || nodeBean.isSign()) {
                        // 开始环节和结束环节不要
                        NodeBean node = new NodeBean(nodeName, nodeBean.getNodetitle(), nodeBean.getNodetype(), nodeBean.getNodepage(), pdid, wfBean
                                .getPdname(), wfBean.getCnname());
                        returnArrayList.add(node);
                    } else if (nodeBean.isSubprocess()) {
                        ArrayList<NodeBean> subNodeList = FLow_getPdNodeList(environment, conb, nodeBean.getSubnode());
                        returnArrayList.addAll(subNodeList);
                    }
                }
            }
        }
        return returnArrayList;
    }

    /**
     * DONE 说明：流程发起
     *<p>
     * Method Flow_Start
     * 
     * @param environment
     * @param conb
     * @param start
     * @return
     * @throws Exception
     */
    public static String Flow_Start(Environment environment, ConnectBean conb, bean_start start) throws Exception {
        String piid = WFFrame.pi_new(environment, conb, start);
        return piid;
    }

    /**
     * 说明：根据piid获取当前处于待办的todoid列表
     *<p>
     * Method Flow_GetTodoIdList
     * 
     * @param environment
     * @param conb
     * @param piid
     * @return
     */
    public static List<String> Flow_GetTodoIdList(Environment environment, ConnectBean conb, String piid) {
        return Flow_GetTodoIdList(environment, conb, piid, null);
    }

    /**
     * 说明：根据piid获取当前处于待办的todoid列表
     *<p>
     * Method Flow_GetTodoIdList
     * 
     * @param environment
     * @param conb
     * @param piid
     * @param useruuid
     * @return
     */
    public static List<String> Flow_GetTodoIdList(Environment environment, ConnectBean conb, String piid, String useruuid) {
        List<String> returnList = new ArrayList<String>();
        ArrayList<bean_todo> todoList = WFFrame.todo_query(environment, conb, piid);
        if (todoList != null && todoList.size() > 0) {
            for (bean_todo todo : todoList) {
                String status = todo.getStatus();
                String todotype = todo.getTodotype();
                if (WFConstant.TODO_Type_CC.equals(todotype)) {
                    continue;
                }
                if (WFConstant.TODO_Status_wait.equals(status)) {
                    String actorid = todo.getActorid();
                    String originactorid = todo.getOriginactorid();
                    if (useruuid != null && !"".equals(useruuid.trim())) {
                        if (useruuid.equals(actorid) || useruuid.equals(originactorid)) {
                            returnList.add(todo.getId());
                        }
                    } else {
                        returnList.add(todo.getId());
                    }

                }
            }
        }
        return returnList;
    }

    /**
     * 说明：流程发起并推进
     *<p>
     * Method Flow_StartAndCommit
     * 
     * @param environment
     * @param conb
     * @param start
     * @param nextParticipants
     * @return
     * @throws Exception
     */
    public static String Flow_StartAndCommit(Environment environment, ConnectBean conb, bean_start start, String nextParticipants) throws Exception {
        String piid = Flow_Start(environment, conb, start);
        if (piid != null && piid.trim().length() > 0) {
            WFNodeBean wnbFirst = WFFrame.pub_getFirstNode(environment, conb, start.getPdid());
            // nextParticipants ="1389361532040_6914_143,0;1389361569378_6724_19,0";
            ArrayList<WFActorBean> actors = null;

            ArrayList<String> nextActivityList = WFFrame.pub_getChildNodes(environment, conb, start.getPdid(), wnbFirst.getNodename());
            if (nextActivityList != null && nextActivityList.size() > 0) {
                String nextNodeName = nextActivityList.get(0);
                if (actors == null) {
                    if (nextParticipants == null || "".equals(nextParticipants)) {
                        actors = WFFrame.pub_getNodeActors(environment, conb, start.getPdid(), piid, nextNodeName, false);
                    } else {
                        actors = WFFrame.pub_getActors(nextParticipants);

                    }
                }
                ArrayList<bean_todo> todoList = WFFrame.todo_query(environment, conb, piid);
                bean_todo beantodo = null;
                if (todoList != null && todoList.size() > 0) {
                    for (bean_todo todo : todoList) {
                        String status = todo.getStatus();
                        if (WFConstant.TODO_Status_wait.equals(status)) {
                            beantodo = todo;
                            break;
                        }
                    }
                }
                bean_submit submit = new bean_submit(beantodo);
                submit.setTarget(nextNodeName);
                submit.setActorid(beantodo.getActorid());
                submit.setActortype(beantodo.getActortype());
                submit.setAgenttype(beantodo.getAgenttype());
                submit.setDeptuuid(beantodo.getDeptuuid());
                submit.setOpertype(beantodo.getOpertype());
                submit.setOperdt(WDK.getDateTime());
                submit.setOpercomment("自动提交");
                submit.setTitle(start.getTitle());
                submit.setOriginactorid(beantodo.getOriginactorid());
                submit.setOriginactortype(beantodo.getOriginactortype());
                submit.setOrigindeptuuid(beantodo.getOrigindeptuuid());
                submit.setTargetactors(actors);
                boolean isSuccess = WFFrame.todo_submit(environment, conb, submit);
                if (!isSuccess) {
                    // 推送失败的话，就把实例ID置空
                    piid = null;
                }
            }
        }
        return piid;
    }

    /**
     * 说明：流程推进
     *<p>
     * Method Flow_Commit
     * 
     * @param environment
     * @param conb
     * @param submit
     * @return
     * @throws Exception
     */
    public static boolean Flow_Commit(Environment environment, ConnectBean conb, bean_submit submit) throws Exception {
        String target = submit.getTarget();
        if (target == null || "".equals(target.trim())) {
            // 允许下一环节名为空！！
            ArrayList<String> childrenList = WFFrame.pub_getChildNodes(environment, conb, submit.getTodo().getPdid(), submit.getTodo().getNodename());
            if (childrenList != null && childrenList.size() > 0) {
                target = childrenList.get(0);
                submit.setTarget(target);
            }
        }
//        ArrayList<WFActorBean> targetActors = submit.getTargetactors();
//        if(targetActors==null||targetActors.size()<=0){
//           throw new Exception("没有下一环节的参与者！！");
//        }
        boolean isSuccess = WFFrame.todo_submit(environment, conb, submit);
        return isSuccess;
    }

    /**
     * 说明：流程办结
     *<p>
     * Method Flow_Finish
     * 
     * @param environment
     * @param conb
     * @param task
     * @return
     * @throws Exception
     */
    public static boolean Flow_Finish(Environment environment, ConnectBean conb, String todoid) throws Exception {
        bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
        bean_submit end = new bean_submit(todo);
        end.setTarget(getEndNodeName(environment, conb, todo.getPdid()));
        //@lee 此处获取原有的办理意见
        end.setOpercomment(todo.getOpercomment());
        end.setOperdt(WDK.getDateTime());
        end.setOpertype(WFConstant.Opertype_Free);
        end.setActortype(IWFOperation.PARTICIPANT_TYPE_USER);
        end.setDeptuuid(todo.getDeptuuid());
        end.setActorid(todo.getActorid());
        boolean isSuccess = WFFrame.todo_submit(environment, conb, end);
        return isSuccess;
    }

    /**
     * 说明：获取结束环节的环节名
     *<p>
     * Method getEndNodeName
     * 
     * @param environment
     * @param conb
     * @param pdid
     * @return
     */
    private static String getEndNodeName(Environment environment, ConnectBean conb, String pdid) {
        // 获取结束环节的名称
        WFBean wb = WFEngine.wb_create(pdid);
        Set<String> keyset = wb.getNodeMap().keySet();
        for (Iterator<String> it = keyset.iterator(); it.hasNext();) {
            String nodename = it.next();
            WFNodeBean w = wb.getNodeMap().get(nodename);
            if (w.isEnd()) {
                return w.getNodename();
            }
        }
        return "";
    }

    /**
     * 说明：流程退回
     *<p>
     * Method Flow_Rollback
     * 
     * @param environment
     * @param conb
     * @param submit
     * @return
     * @throws Exception
     */
    public static boolean Flow_Rollback(Environment environment, ConnectBean conb, bean_submit submit) throws Exception {
        String target = submit.getTarget();
        if (target == null || target.trim().length() == 0) {
            throw new Exception("没有指定退回的节点");
        }
        boolean isSuccess = WFFrame.todo_submit(environment, conb, submit);
        // 同时关闭当前的待办任务，启动新的待办
        return isSuccess;
    }

    /**
     * 说明：流程追回
     *<p>
     * Method Flow_Reclaim
     * 
     * @param environment
     * @param conb
     * @param task
     * @return
     * @throws Exception
     */
    public static boolean Flow_Reclaim(Environment environment, ConnectBean conb, String todoid, WFActorBean actor, WFActorBean originactor,
            String agenttype, String isdeputesign, String operdt, String opercomment) throws Exception {
        boolean canBeReclaim = WFFrame.todo_recover_check(environment, conb, todoid);
        boolean isSuccess = false;
        if (canBeReclaim) {
            isSuccess = WFFrame.todo_recover(environment, conb, todoid, actor, originactor, agenttype, isdeputesign, operdt, opercomment);
        }
        // 同时关闭当前的待办任务，启动新的待办
        return isSuccess;
    }

    /**
     * 说明：任意环节的追回，传统的追回只有下一环节未领取，才能进行追回。任意追回不受此限制
     *<p>
     * Method Flow_Reclaim_Free
     * 
     * @return
     */
    public static boolean Flow_Reclaim_Free(Environment environment, ConnectBean conb, String todoid, WFActorBean actor, WFActorBean originactor,
            String agenttype, String isdeputesign, String operdt, String opercomment) throws Exception {
        boolean isSuccess = false;
        isSuccess = WFFrame.todo_recover(environment, conb, todoid, actor, originactor, agenttype, isdeputesign, operdt, opercomment);
        return isSuccess;
    }

    public static boolean Flow_Assign(Environment environment, ConnectBean conb, String todoid, WFActorBean actor, WFActorBean originactor,
            String isdeputesign, ArrayList<WFActorBean> turnactors, String turnopertype) throws Exception {
        // 交办
        return WFFrame.turn_add(environment, conb, todoid, actor, originactor, WFConstant.Agenttype_Hand, isdeputesign, turnactors,
                WFConstant.TURN_Type_Hand, turnopertype);
    }

    public static boolean Flow_Transmit(Environment environment, ConnectBean conb, String todoid, WFActorBean actor, WFActorBean originactor,
            String isdeputesign, ArrayList<WFActorBean> turnactors, String turnopertype) throws Exception {
        // 转办
        return WFFrame.turn_add(environment, conb, todoid, actor, originactor, WFConstant.Agenttype_Turn, isdeputesign, turnactors,
                WFConstant.TURN_Type_Turn, turnopertype);
    }

    /**
     * 说明：流程挂起
     *<p>
     * Method Flow_Suspend
     * 
     * @param environment
     * @param conb
     * @param piid
     * @return
     * @throws Exception
     */
    public static boolean Flow_Suspend(Environment environment, ConnectBean conb, String piid) throws Exception {
        boolean isSuccess = WFFrame.pi_suspend(environment, conb, piid);
        return isSuccess;
    }

    /**
     * 说明：流程恢复
     *<p>
     * Method Flow_Activate
     * 
     * @param environment
     * @param conb
     * @param piid
     * @return
     * @throws Exception
     */
    public static boolean Flow_Activate(Environment environment, ConnectBean conb, String piid) throws Exception {
        WFBean wb = WFFrame.wb_queryByPiid(environment, conb, piid);
        boolean isSuccess = WFFrame.pi_resume(environment, conb, wb.getPdid(), piid);
        return isSuccess;
    }

    /**
     * 说明：流程中止
     *<p>
     * Method Flow_Abort
     * 
     * @param environment
     * @param conb
     * @param piid
     * @return
     * @throws Exception
     */
    public static boolean Flow_Abort(Environment environment, ConnectBean conb, String piid) throws Exception {
        // 添加：类似于挂起的状态
        boolean isSuccess = true;
        try {
            ProcessInstance pi = JBPMUtil.getProcessInstanceById(environment, piid);
            ExecutionService executionService = environment.get(ExecutionService.class);
            executionService.endProcessInstance(pi.getId(), "cancle");
        } catch (Exception e) {
            isSuccess = false;
        }
        return isSuccess;
    }

    /**
     * 说明：流程删除
     *<p>
     * Method Flow_Delete
     * 
     * @param environment
     * @param conb
     * @param submit
     * @param piid
     * @return
     * @throws Exception
     */
    public static boolean Flow_Delete(Environment environment, ConnectBean conb, String piid) throws Exception {
        boolean isSuccess = false;
        // 删除流程实例
        WFBean wb = WFFrame.wb_queryByPiid(environment, conb, piid);
        isSuccess = WFFrame.pi_remove(environment, conb, wb.getPdid(), piid);
        return isSuccess;
    }

    /**
     * 说明：增加办理人
     *<p>
     * Method Flow_AddParticipant
     * 
     * @param environment
     * @param conb
     * @param submit
     * @param piid
     * @return
     * @throws Exception
     */
    public static boolean Flow_AddParticipant(Environment environment, ConnectBean conb, ArrayList<WFActorBean> actors, String todoid,
            boolean signinsort) throws Exception {
        boolean isSuccess = false;
        // 对应的待办表也需要进行插入
        bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
        if (todo != null) {
            isSuccess = WFFrame.pi_modify(environment, conb, todo.getPiid(), todo.getNodename(), actors, signinsort);
        }
        return isSuccess;
    }

    /**
     * 说明：获取流程实例创建者
     *<p>
     * Method Flow_GetCreator
     * 
     * @param environment
     * @param conb
     * @param submit
     * @param piid
     * @return
     * @throws Exception
     */
    public static String Flow_GetCreator(Environment environment, ConnectBean conb, String piid) throws Exception {
        WFBean wb = Flow_QueryWbByPiid(environment, conb, piid);
        return wb.getCreate_actorid();
    }

    /**
     * 说明：获取流程实例参数
     *<p>
     * Method Flow_GetParam
     * 
     * @param environment
     * @param conb
     * @param piid
     * @return
     * @throws Exception
     */
    public static WFBean Flow_GetParam(Environment environment, ConnectBean conb, String piid) throws Exception {
        WFBean wFBean = WFFrame.wb_queryByPiid(environment, conb, piid);
        return wFBean;
    }

    /**
     * 说明：获取流程实例环节参数
     *<p>
     * Method Flow_GetNodeParam
     * 
     * @param environment
     * @param conb
     * @param piid
     * @param nodeName
     * @return
     * @throws Exception
     */
    public static WFNodeBean Flow_GetNodeParam(Environment environment, ConnectBean conb, String piid, String nodeName) throws Exception {
        WFNodeBean wfNodeBean = null;
        WFBean wFBean = WFFrame.wb_queryByPiid(environment, conb, piid);
        HashMap<String, WFNodeBean> nodeMap = wFBean.getNodeMap();
        Iterator<String> it = nodeMap.keySet().iterator();
        while (it.hasNext()) {
            String _nodeName = it.next();
            if (_nodeName.equals(nodeName)) {
                wfNodeBean = nodeMap.get(_nodeName);
                break;
            }
        }
        return wfNodeBean;
    }

    /**
     * 说明：更新流程实例环节参数
     *<p>
     * Method Flow_UpdateNodeParam
     * 
     * @param environment
     * @param conb
     * @param piid
     * @param nodeParam
     * @throws Exception
     */
    public static void Flow_UpdateNodeParam(Environment environment, ConnectBean conb, String piid, WFNodeBean nodeParam) throws Exception {
        WFBean wFBean = WFFrame.wb_queryByPiid(environment, conb, piid);
        HashMap<String, WFNodeBean> nodeMap = wFBean.getNodeMap();
        Iterator<String> it = nodeMap.keySet().iterator();
        while (it.hasNext()) {
            String _nodeName = it.next();
            if (_nodeName.equals(nodeParam.getNodename())) {
                nodeMap.put(_nodeName, nodeParam);
            }
        }
        WFEngine.wb_save(environment, conb, wFBean.getPdid(), piid, wFBean);
    }

    /**
     * 说明：获取流程实例变量
     *<p>
     * Method Flow_GetVariable
     * 
     * @param environment
     * @param conb
     * @param piid
     * @return
     * @throws Exception
     */
    public static HashMap<Object, Object> Flow_GetVariable(Environment environment, ConnectBean conb, String piid) throws Exception {
        HashMap<Object, Object> nodeParam = new HashMap<Object, Object>();
        WFBean wFBean = WFFrame.wb_queryByPiid(environment, conb, piid);
        if (wFBean == null) {
            wFBean = WFFrame.wb_queryByPiid(environment, conb, piid, true);
        }
        nodeParam = wFBean.getVariables();
        return nodeParam;
    }

    /**
     * 说明：更新流程实例变量
     *<p>
     * Method Flow_UpdateVariable
     * 
     * @param environment
     * @param conb
     * @param piid
     * @param param
     * @throws Exception
     */
    public static void Flow_UpdateVariable(Environment environment, ConnectBean conb, String piid, HashMap param) throws Exception {
        WFBean wFBean = WFFrame.wb_queryByPiid(environment, conb, piid);
        if(wFBean!=null){
            wFBean.addVariableAll(param);
            WFFrame.wb_save(environment, conb, wFBean);
        }
    }

    /**
     * 说明：获取流程实例环节变量
     *<p>
     * Method Flow_GetNodeVariable
     * 
     * @param environment
     * @param conb
     * @param piid
     * @param nodeName
     * @return
     * @throws Exception
     */
    public static HashMap<Object, Object> Flow_GetNodeVariable(Environment environment, ConnectBean conb, String piid, String nodeName)
            throws Exception {
        HashMap<Object, Object> nodeParam = new HashMap<Object, Object>();
        WFBean wFBean = WFFrame.wb_queryByPiid(environment, conb, piid);
        if(wFBean==null){
            wFBean = WFFrame.wb_queryByPiid(environment, conb, piid,true);
        }
        HashMap<String, WFNodeBean> nodeMap = wFBean.getNodeMap();
        Iterator<String> it = nodeMap.keySet().iterator();
        while (it.hasNext()) {
            String _nodeName = it.next();
            if (_nodeName.equals(nodeName)) {
                WFNodeBean wfNodeBean = nodeMap.get(_nodeName);
                nodeParam = wfNodeBean.getVariables();
            }
        }
        return nodeParam;
    }

    /**
     * 说明：更新流程实例环节变量
     *<p>
     * Method Flow_UpdateNodeVariable
     * 
     * @param environment
     * @param conb
     * @param piid
     * @param nodeName
     * @param nodeParam
     * @throws Exception
     */
    public static void Flow_UpdateNodeVariable(Environment environment, ConnectBean conb, String piid, String nodeName,
            HashMap<Object, Object> nodeParam) throws Exception {
        WFBean wFBean = WFFrame.wb_queryByPiid(environment, conb, piid);
        HashMap<String, WFNodeBean> nodeMap = wFBean.getNodeMap();
        Iterator<String> it = nodeMap.keySet().iterator();
        while (it.hasNext()) {
            String _nodeName = it.next();
            if (_nodeName.equals(nodeName)) {
                WFNodeBean wfNodeBean = nodeMap.get(_nodeName);
                wfNodeBean.setVariables(nodeParam);
            }
        }
        WFEngine.wb_save(environment, conb, wFBean.getPdid(), piid, wFBean);

    }

    /**
     * 说明：获取流程模板对象
     *<p>
     * Method Flow_GetWFTemplate
     * 
     * @param environment
     * @param conb
     * @param pdid
     * @return
     * @throws Exception
     */
    public static WFBean Flow_GetWFTemplate(Environment environment, ConnectBean conb, String pdid) throws Exception {
        WFBean pd = WFFrame.wb_create(pdid);
        return pd;
    }

    /**
     * 说明：获取流程模板节点对象
     *<p>
     * Method Flow_GetNodeTemplate
     * 
     * @param environment
     * @param conb
     * @param pdid
     * @param nodename
     * @return
     */
    public static WFNodeBean Flow_GetNodeTemplate(Environment environment, ConnectBean conb, String pdid, String nodename) throws Exception {
        WFBean wb = Flow_GetWFTemplate(environment, conb, pdid);
        if (wb != null) {
            return wb.getNodeMap().get(nodename);
        }
        return null;
    }

    /**
     * 说明：通过piid和nodename，获取任意一个待办信息Bean
     *<p>
     * Method FLow_GetSingleTodo
     * 
     * @param environment
     * @param conb
     * @param piid
     * @param nodename
     * @param pdid
     * @return
     */
    public static bean_todo FLow_GetSingleTodo(Environment environment, ConnectBean conb, String piid, String nodename) {
        ArrayList<bean_todo> todoList = WFFrame.todo_query(environment, conb, piid,false,true);
        if (todoList != null && todoList.size() > 0) {
            for (bean_todo bean : todoList) {
                if (bean.getNodename().equals(nodename)) {
                    return bean;
                }
            }
        }
        return null;
    }

    /**
     * 说明：获取下一环节列表
     *<p>
     * Method Flow_GetNextActivityList
     * 
     * @param environment
     * @param conb
     * @param task
     * @return
     */
    public static ArrayList<WFNodeBean> Flow_GetNextActivityList(Environment environment, ConnectBean conb, String todoid) throws Exception {
        ArrayList<WFNodeBean> returnActivityList = new ArrayList<WFNodeBean>();
        bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
        ArrayList<String> nextActivityList = WFFrame.pub_getChildNodes(environment, conb, todo.getPdid(), todo.getNodename());
        WFBean wb = WFFrame.wb_queryByPiid(environment, conb, todo.getPiid());
        if (nextActivityList != null && nextActivityList.size() > 0) {
            for (String activity : nextActivityList) {
                WFNodeBean wnb = wb.getNodeBean(activity);
                returnActivityList.add(wnb);
            }
        }
        return returnActivityList;
    }

    /**
     * 说明：获取前序环节节点
     *<p>
     * Method Flow_GetPreActivityList
     * 
     * @return
     */
    public static ArrayList<WFNodeBean> Flow_GetPreActivityList(Environment environment, ConnectBean conb, String pdid, String nodename) {
        ArrayList<String> nodelist = WFFrame.pub_getParentNodes2Start(environment, conb, pdid, nodename);
        ArrayList<WFNodeBean> returnList = new ArrayList<WFNodeBean>();
        WFBean wb = WFFrame.wb_create(pdid);
        if (wb != null && nodelist != null && nodelist.size() > 0) {
            for (int i = 0; i < nodelist.size(); i++) {
                WFNodeBean node = wb.getNodeBean(nodelist.get(i));
                returnList.add(node);
            }
        }
        return returnList;
    }
    
    
    /**
     * 说明：获取当前节点的前序节点
     *<p>
     * Method Flow_GetPreActivityListByPiid
     * @param environment
     * @param conb
     * @param piid
     * @param nodename
     * @return
     */
    public static ArrayList<WFNodeBean> Flow_GetPreActivityListByPiid(Environment environment, ConnectBean conb, String piid, String nodename) {
        WFBean wb = WFFrame.wb_queryByPiid(environment, conb, piid);
        ArrayList<String> nodelist = wb.getRouteMap().get(nodename);
        ArrayList<WFNodeBean> returnList = new ArrayList<WFNodeBean>();
        if (wb != null && nodelist != null && nodelist.size() > 0) {
            for (int i = 0; i < nodelist.size(); i++) {
                WFNodeBean node = wb.getNodeBean(nodelist.get(i));
                if (nodename.equals(node.getNodename())) {
                    //前序节点中，本环节的节点过滤掉
                    continue;
                }
                ArrayList<WFActorBean> actorlist = node.getActors();
                if (actorlist != null && actorlist.size() > 0) {
                    if (node.isFirst()) {
                        //如果是第一个节点，认为防止到前面
                        returnList.add(0, node);
                    } else {
                        returnList.add(node);
                    }
                }
            }
        }
        return returnList;
    }

    /**
     * DOME 说明：获取所有可特送的环节列表
     *<p>
     * Method Flow_GetAllActivityList
     * 
     * @param environment
     * @param conb
     * @param task
     * @return
     * @throws Exception
     */
    public static ArrayList<WFNodeBean> Flow_GetAllActivityList(Environment environment, ConnectBean conb, String todoid) throws Exception {
        ArrayList<WFNodeBean> returnActivityList = new ArrayList<WFNodeBean>();
        bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
        ArrayList<String> allList = WFFrame.pub_getNodeList(environment, conb, todo.getPdid());
        WFBean wb = WFFrame.wb_queryByPiid(environment, conb, todo.getPiid());
        if (allList != null && allList.size() > 0) {
            for (String activity : allList) {
                WFNodeBean wnb = wb.getNodeBean(activity);
                if (!wnb.canFree()) {
                    continue;
                }
                returnActivityList.add(wnb);
            }
        }
        return returnActivityList;
    }
    
    
    /**
     * 说明：判断是否是第一个环节
     *<p>
     * Method Flow_IsFirstActivity
     * @param environment
     * @param conb
     * @param todoid
     * @return
     * @throws Exception
     */
    public static boolean Flow_IsFirstActivity(Environment environment, ConnectBean conb, String piid, String nodename) throws Exception {
        // WFNodeBean nodeBean = WFFrame.pub_getLastNode(environment, conb, task.getPdid());
        // if( nodeBean!=null){
        WFBean wb = WFFrame.wb_queryByPiid(environment, conb, piid);
        if (wb != null && wb.getNodeBean(nodename) != null && wb.getNodeBean(nodename).isFirst()) {
            return true;
        }
        // }
        return false;
    }

    /**
     * 说明：判断是否是最后一个环节
     *<p>
     * Method Flow_IsLastActivity
     * 
     * @param environment
     * @param conb
     * @param task
     * @return
     * @throws Exception
     */
    public static boolean Flow_IsLastActivity(Environment environment, ConnectBean conb, String todoid) throws Exception {
        bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
        // WFNodeBean nodeBean = WFFrame.pub_getLastNode(environment, conb, task.getPdid());
        // if( nodeBean!=null){
        WFBean wb = WFFrame.wb_queryByPiid(environment, conb, todo.getPiid());
        if (wb.getNodeBean(todo.getNodename()).isLastNode()) {
            return true;
        }
        // }
        return false;
    }
    
    public static ArrayList<bean_todo> Flow_GetNotionList(Environment environment, ConnectBean conb, String piid,String orderBy) {
        //ArrayList<bean_todo> finalList = new ArrayList<bean_todo>();
        ArrayList<bean_todo> returnLit = WFFrame.todo_query(environment, conb, piid,false,false,orderBy);
        if (returnLit == null || returnLit.size() == 0) {
            returnLit = WFFrame.todo_query(environment, conb, piid, true,false,orderBy);
        }
        /*if (returnLit != null && returnLit.size() > 0) {
            for (bean_todo todo : returnLit) {
                String status = todo.getStatus();
                // 只过滤，状态是完成，或者追回的数据
                if (WFConstant.TODO_Status_done.equals(status) || WFConstant.TODO_Status_recover.equals(status)) {
                    finalList.add(todo);
                }
            }
        }*/
        return returnLit;
    }
    
    /**
     * 说明：获取审批意见流水
     *<p>
     * Method Flow_GetNotionList
     * 
     * @return
     */
    public static ArrayList<bean_todo> Flow_GetNotionList(Environment environment, ConnectBean conb, String piid) {
        return Flow_GetNotionList(environment, conb, piid, null);
    }

    /**
     * 说明：更新待办对象
     *<p>
     * Method Flow_UpdateTodo
     * 
     * @return
     */
    public static boolean Flow_UpdateTodo(Environment environment, ConnectBean conb, bean_submit submit) throws Exception {
        return WFFrame.todo_update(environment, conb, submit);
    }

    /**
     * 说明：更新办理意见
     *<p>
     * Method Flow_UpdateComment
     * 
     * @param environment
     * @param conb
     * @param todoid
     * @param opercomment
     * @param operdt
     * @return
     * @throws Exception
     */
    public static boolean Flow_UpdateComment(Environment environment, ConnectBean conb, String todoid, String opercomment, String operdt)
            throws Exception {
        bean_todo todoBean = WFFrame.todo_querySingle(environment, conb, todoid);
        if (todoBean == null) {
            throw new Exception("根据传入的todoid，找不到对应的待办数据！");
        }
        bean_submit submit = new bean_submit(todoBean);
        String _todoid = submit.getTodoid();
        if (_todoid == null || _todoid.trim().length() == 0) {
            throw new Exception("todoid的值为空！");
        }
        submit.setOpercomment(opercomment);
        submit.setOperdt(operdt);
        submit.setAgenttype(WFConstant.Agenttype_Self);

        String todotype = todoBean.getTodotype();
        if (WFConstant.TODO_Type_CC.equals(todotype)) {
            HashMap<String, String> param = new HashMap<String, String>();
            param.put("id", submit.getTodoid());
            param.put("operdt", submit.getOperdt());
            param.put("opercomment", submit.getOpercomment());
            param.put("flag", "23");
            return WQLUtil.getWQL(WQLNames.UWDKWFTODO).addParamMap(param).process(conb).isSuccess();
        }
        return Flow_UpdateTodo(environment, conb, submit);
    }

    /**
     * 说明：获取待办列表
     *<p>
     * Method Flow_GetTodoList
     * 
     * @return
     */
    public static JSONObject Flow_GetTodoList(Environment environment, ConnectBean conb, HttpServletRequest request, HttpServletResponse response,
            String actorid, boolean hasdepute) {
        HashMap<String, String> param = new HashMap<String, String>();
        param.put("actorid", actorid);
        JSONObject jres = WFFrame.todo_pageQuery(environment, conb, request, response, param, hasdepute, false);
        return jres;
    }

    /**
     * 说明：获取经办列表
     *<p>
     * Method Flow_GetDoneList
     * 
     * @param environment
     * @param conb
     * @param request
     * @param response
     * @param actorid
     * @param hasdepute
     * @return
     */
    public static JSONObject Flow_GetDoneList(Environment environment, ConnectBean conb, HttpServletRequest request, HttpServletResponse response,
            String actorid, boolean hasdepute) {
        HashMap<String, String> param = new HashMap<String, String>();
        param.put("actorid", actorid);
        JSONObject jres = WFFrame.todo_pageQuery(environment, conb, request, response, param, hasdepute, true);
        return jres;
    }

    /**
     * 说明：判断流程实例是否结束
     *<p>
     * Method _Flow_IsFlowEnd
     * 
     * @param environment
     * @param conb
     * @param piid
     * @return
     */
    public static boolean Flow_IsFlowEnd(Environment environment, ConnectBean conb, String piid) {
        ProcessInstance pi = WFEngine.pi_query(environment, conb, piid);
        if (pi != null) {
            return pi.isEnded();
        } else {
            // String state = JBPMUtil._PE.getHistoryService().createHistoryProcessInstanceQuery().processInstanceId(pi.getId()).uniqueResult()
            // .getState();
            // if (HistoryProcessInstance.STATE_ENDED.equals(state)) {
            // return true;
            // }
            return true;
        }
    }

    /**
     * 说明：更新委托配置
     *<p>
     * Method Flow_UpdateDepute
     * 
     * @return
     */
    public static String Flow_UpdateDepute(Environment environment, ConnectBean conb, bean_depute depute) {
        // TODO 更新委托
        return null;
    }

    /**
     * 说明：获取委托信息
     *<p>
     * Method Flow_GetDeputeList
     * 
     * @return
     */
    public static ArrayList<bean_depute> Flow_GetDeputeList(Environment environment, ConnectBean conb) throws Exception {
        // 获取委托信息
        return WFFrame.depute_query(environment, conb, null);
    }

    /**
     * 说明：任务领退
     *<p>
     * Method Flow_TaskReturn
     * 
     * @param environment
     * @param conb
     * @param strTask
     * @return
     * @throws Exception
     */
    public static boolean Flow_TaskReturn(Environment environment, ConnectBean conb, String todoid, WFActorBean actor, WFActorBean originactor,
            String agenttype, String isdeputesign) throws Exception {
        boolean isSuccess = WFFrame.todo_return(environment, conb, todoid, actor, originactor, agenttype, isdeputesign);
        return isSuccess;
    }

    /**
     * 说明：任务领取
     *<p>
     * Method Flow_TaskGet
     * 
     * @param environment
     * @param conb
     * @param strTask
     * @return
     * @throws Exception
     */
    public static boolean Flow_TaskGet(Environment environment, ConnectBean conb, String todoid, WFActorBean actor, WFActorBean originactor,
            String agenttype, String isdeputesign) throws Exception {
        boolean isSuccess = WFFrame.todo_get(environment, conb, todoid, actor, originactor, agenttype, isdeputesign);
        return isSuccess;
    }

    /**
     * 说明：根据流程实例ID获取活动的环节列表
     *<p>
     * Method Flow_GetActiviyNodeList
     * 
     * @param environment
     * @param conb
     * @param piid
     * @return
     */
    public static List<String> Flow_GetActiviyNodeList(Environment environment, ConnectBean conb, String piid) {
        return WFFrame.pub_getActiveNodename(environment, conb, piid);
    }

    /**
     * 说明：根据环节名获取环节标题
     *<p>
     * Method Flow_GetNodeCnName
     * 
     * @param environment
     * @param conb
     * @param piid
     * @param nodeName
     * @return
     */
    public static String Flow_GetNodeCnName(Environment environment, ConnectBean conb, String todoid) throws Exception {
        bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
        if (todo != null) {
            return todo.getNodetitle();
        }
        return null;
    }

    /**
     * 说明：根据piid获取pdid
     *<p>
     * Method Flow_GetPdid
     * 
     * @param environment
     * @param conb
     * @param piid
     * @return
     * @throws Exception
     */
    public static String Flow_GetPdid(Environment environment, ConnectBean conb, String piid) throws Exception {
        WFBean bean = WFFrame.wb_queryByPiid(environment, conb, piid);
        if (bean != null) {
            return bean.getPdid();
        }

        return null;
    }

    /**
     * 说明：根据pdname获取pdid
     *<p>
     * Method getWorkflowPdid
     * 
     * @param environment
     *            -bpm环境
     * @param conb
     *            -连接对象
     * @param pdname
     *            -流程模板名
     * @return
     */
    public static String Flow_GetWorkflowPdid(Environment environment, ConnectBean conb, String pdname) {
        // 根据模板名称获取对应的模板ID
        String returnPdid = null;
        long returnVersion = 0;
        ArrayList<bean_pd> pdList = WFFrame.pd_query(environment, conb);
        if (pdList != null && pdList.size() > 0) {
            for (int i = 0; i < pdList.size(); i++) {
                bean_pd pd = pdList.get(i);
                if (pd.getPdname().equalsIgnoreCase(pdname)) {
                    if (returnPdid == null) {
                        returnPdid = pd.getPdid();
                        returnVersion = Long.parseLong(pd.getPdversion());
                    } else {
                        if (Long.parseLong(pd.getPdversion()) > returnVersion) {
                            // 新版本覆盖原版本。
                            returnPdid = pd.getPdid();
                            returnVersion = Long.parseLong(pd.getPdversion());
                        }
                    }
                }
            }
        }
        return returnPdid;
    }
    
    
    public static JSONArray pd_query(Environment environment,ConnectBean conb){
        JSONArray jrows = WQL.getWO(WDKWQLNames.QWDKWF1001)
                                .addParam("flag", "4")
                                .process(conb)
                                .getResultJSONArray(0);
        return jrows;
    }
    
    /**
     * 说明：根据pdnames获取pdids
     *<p>
     * Method Flow_GetWorkflowPdids
     * @param environment
     * @param conb
     * @param pdnames
     * @return
     */
    public static Map<String, String> Flow_GetWorkflowPdids(Environment environment, ConnectBean conb, Map<String, String> pdnames) {
        // 根据模板名称获取对应的模板ID
        Map<String, String> returnPdids = new HashMap<String, String>();
        JSONArray pdList = pd_query(environment, conb);
        if (pdList != null && pdList.size() > 0) {
            Iterator<String> it = pdnames.keySet().iterator();
            while (it.hasNext()) {
                String bdlcode = it.next();
                String _pdname = pdnames.get(bdlcode);
                for (int i = 0; i < pdList.size(); i++) {
                    JSONObject pd = pdList.getJSONObject(i);
                    String pdnamev = pd.getString("pdname");
                    if (_pdname.equals(pdnamev)) {
                        returnPdids.put(bdlcode, pd.getString("pdid"));
                        break;
                    }
                }

            }
        }
        return returnPdids;
    }

    /**
     * 说明：根据pdid获取pdname
     *<p>
     * Method getWorkflowPdname
     * 
     * @param environment
     *            -bpm环境
     * @param conb
     *            -连接对象
     * @param pdid
     *            -流程模板ID
     * @return
     */
    public static String Flow_GetWorkflowPdname(Environment environment, ConnectBean conb, String pdid) {
        // WFFrame.pd_query(environment, conb);
        // 根据模板ID获取对应的模板名称
        ArrayList<bean_pd> pdList = WFFrame.pd_query(environment, conb);
        if (pdList != null && pdList.size() > 0) {
            for (int i = 0; i < pdList.size(); i++) {
                bean_pd pd = pdList.get(i);
                if (pd.getPdid().equalsIgnoreCase(pdid)) {
                    return pd.getPdname();
                }
            }
        }
        return null;
    }

    /**
     * 说明：根据普通角色，解析为人员
     *<p>
     * Method getUsersByRole
     * 
     * @param roleId
     * @return
     */
    public static Map<String, String> Flow_GetUsersByRole(ConnectBean conb, String roleId) {
        HashMap<String, String> returnMap = new HashMap<String, String>();
        JSONArray persionList = UUM.getPersonListByRoleID(roleId, conb);
        if (persionList != null && persionList.size() > 0) {
            for (int i = 0; i < persionList.size(); i++) {
                JSONObject persion = persionList.getJSONObject(i);
                returnMap.put(persion.getString("person_uuid"), persion.getString("person_name"));
            }
        }
        return returnMap;
    }

    /**
     * 说明：根据用户ID，解析为用户人员名称
     *<p>
     * Method getUserNameById
     * 
     * @param userId
     * @return
     */
    public static String Flow_GetUserNameById(ConnectBean conb, String userId) {
        WQLModule wm = WQLModule.getWQLModule(IWFOperation.CODE_TYPE_PERSON);
        String username = wm.id2name(userId, "person_name", conb);
        if (username == null || "".equals(username.trim())) {
            JSONObject persionObject = UUM.getPersonByID(userId, conb);
            if (persionObject != null) {
                return persionObject.getString("person_name");
            }
            return userId;
        }
        return username;
    }

    
    /**
     * 说明：查询流程bean,不过有没有进入历史
     *<p>
     * Method Flow_QueryWbByPiid
     * @param environment
     * @param conb
     * @param piid
     * @return
     */
    public static WFBean Flow_QueryWbByPiid(Environment environment, ConnectBean conb, String piid) {
        WFBean wb = WFFrame.wb_queryByPiid(environment, conb, piid);
        if (wb == null) {
            wb = WFFrame.wb_queryByPiid(environment, conb, piid, true);
        }
        return wb;
    }
    
    
    /**
     * 说明：查询流程中，活动的节点
     *<p>
     * Method Flow_GetActiveNodes
     * 
     * @param environment
     * @param conb
     * @param piid
     * @return
     */
    public static List<WFNodeBean> Flow_GetActiveNodes(Environment environment, ConnectBean conb, String piid) {
        WFBean wb = Flow_QueryWbByPiid(environment, conb, piid);
        List<WFNodeBean> activitiNodeList = new ArrayList<WFNodeBean>();
        HashMap<String, WFNodeBean> nodeMap = wb.getNodeMap();
        List<String> activityNodeList = WFFrame.pub_getActiveNodename(environment, conb, piid);
        for (String nodename : activityNodeList) {
            if (nodeMap.containsKey(nodename)) {
                activitiNodeList.add(nodeMap.get(nodename));
            }
        }
        return activitiNodeList;
    }

    /**
     * 说明：抄送的待办，待阅变成已阅
     *<p>
     * Method Flow_CompleteCC
     * 
     * @param environment
     * @param conb
     * @param todoid
     * @param readdt
     * @return
     * @throws Exception
     */
    public static boolean Flow_CCComplete(Environment environment, ConnectBean conb, String todoid, String readdt) throws Exception {
        boolean isSuccess = false;
        bean_todo todoBean = WFFrame.todo_querySingle(environment, conb, todoid);
        if (todoBean == null) {
            throw new Exception("根据传入的todoid，找不到对应的待办数据！");
        }
        isSuccess = WFFrame.todo_complete(environment, conb, todoBean, readdt, WFConstant.Opertype_Read,false);
        return isSuccess;
    }
    
    
    /**
     * 说明：抄送：支持重复抄送
     *<p>
     * Method Flow_CCNew
     * @param environment
     * @param conb
     * @param todoid
     * @param actorList
     * @param canduplicate
     * @return
     * @throws Exception
     */
    public static boolean Flow_CCNew(Environment environment, ConnectBean conb, String todoid, ArrayList<WFActorBean> actorList, boolean canduplicate)
            throws Exception {
        boolean isSuccess = false;
        Date d = new Date();
        HashMap<String, String> actorIdMap = new HashMap<String, String>();
        bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
        if (actorList != null && actorList.size() > 0 && todo != null) {
            for (WFActorBean actorBean : actorList) {
                String actorId = actorBean.getActorId();
                if (!actorIdMap.containsKey(actorId)) {
                    boolean insert = false;
                    if (!canduplicate) {
                        // 查询下，当前实例当前环节是否已经发生过抄送，如果已经被抄送了，就不需要再次处理了
                        JSONArray todos = WQL.getWO(WQLNames.QWDKWFTODO).addParam("flag", "201").addParam("piid", todo.getPiid())
                                .addParam("nodename", todo.getNodename()).addParam("todotype", "3").addParam("allccstatus", "'0','1'")
                                .addParam("actorid", actorId).process(conb).getResultJSONArray(0);
                        if (todos == null || todos.size() == 0) {
                            insert = true;
                        }
                    } else {
                        insert = true;
                    }
                    if (insert) {
                        // 历史表中，如果也是空的话，就进行插入
                        JSONArray _todos = WQL.getWO(WQLNames.QWDKWFTODO).addParam("flag", "202").addParam("piid", todo.getPiid())
                                .addParam("nodename", todo.getNodename()).addParam("todotype", "3").addParam("actorid", actorId).process(conb)
                                .getResultJSONArray(0);
                        if (_todos == null || _todos.size() == 0) {
                            bean_todo newtodo = (bean_todo) WDK.cloneObject(todo);
                            newtodo.setId(WDK.getUUID());
                            newtodo.setOpertype("");
                            newtodo.setActorid(actorId);
                            newtodo.setOperdt("");
                            newtodo.setOpercomment("");
                            newtodo.setActortype(actorBean.getActorType());
                            newtodo.setTodotype(WFConstant.TODO_Type_CC);
                            newtodo.setCcstatus(WFConstant.CC_STATUS_ToRead);
                            newtodo.setCreatedt(WDK.getDateTime(d));
                            newtodo.setSenddt(WDK.getDateTime(d));
                            newtodo.setSendactorid(todo.getActorid());
                            newtodo.setSenddeptuuid(todo.getDeptuuid());
                            isSuccess = WFFrame.todo_add(environment, conb, newtodo);
                            if (!isSuccess) {
                                break;
                            }
                        }
                    }
                    actorIdMap.put(actorId, actorId);
                }
            }
            if (Flow_IsFlowEnd(environment, conb, todo.getPiid())) {
                isSuccess = WFFrame.todo_remove_history(environment, conb, todo.getPiid(), WDK.getDateTime());
            }
        }
        return isSuccess;
    }

    /**
     * 说明：增加抄送人
     * <p>
     * Method Flow_CCNew
     * 
     * @param environment
     * @param conb
     * @param todoid
     * @param actorList
     * @return
     * @throws Exception
     */
    public static boolean Flow_CCNew(Environment environment, ConnectBean conb, String todoid, ArrayList<WFActorBean> actorList) throws Exception {
        return Flow_CCNew(environment, conb, todoid, actorList, false);
    }

    /**
     * 说明：抄送记录查询
     *<p>
     * Method Flow_CCQuery
     * 
     * @param environment
     * @param conb
     * @param todoid
     * @param actorList
     * @return
     * @throws Exception
     */
    public static JSONArray Flow_CCQuery(Environment environment, ConnectBean conb, String todoid, boolean isCurrentNode) throws Exception {
        bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
        HashMap<String, String> param = new HashMap<String, String>();
        param.put("flag", "201");
        if (todo != null) {
            param.put("piid", todo.getPiid());
            param.put("todotype", "3");
            if (isCurrentNode) {
                param.put("nodename", todo.getNodename());
            }
            param.put("allstatus", "'0','1'");//状态是2代表收回的，收回的不显示
            // 查询下，当前实例当前环节是否已经发生过抄送，如果已经被抄送了，就不需要再次处理了
            JSONArray todos = WQL.getWO(WQLNames.QWDKWFTODO).addParamMap(param).process(conb).getResultJSONArray(0);
            return todos;
        }
        return null;
    }
    
    
    /**
     * 说明：传阅的收回
     *<p>
     * Method Flow_CCRollback
     * @param environment
     * @param conb
     * @param todoid
     * @return
     */
    public static boolean Flow_CCRollback(Environment environment, ConnectBean conb, String todoid) throws Exception {
        boolean isSuccess = false;
        isSuccess = WQLUtil.getWQL(WQLNames.UWDKWFTODO).addParam("flag", "503").addParam("id", todoid).process(conb).isSuccess();
        return isSuccess;
    }
    
    
    /**
     * 说明：获取挂起的待办
     *<p>
     * Method Flow_getSuspengTodo
     * @param conb
     * @param todoid
     * @return
     * @throws Exception
     */
    public static bean_todo Flow_getSuspengTodo(ConnectBean conb, String todoid) throws Exception {
        bean_todo todo = (bean_todo) WQL.getWO(WQLNames.QWDKWFTODO).addParam("flag", "1").addParam("id", todoid).addParam("issuspend", "1")
                .process(conb).getObject(0, bean_todo.class);
        return todo;
    }
    
    
    /**
     * 说明：是否挂起状态
     *<p>
     * Method isSuspended
     * @param piid
     * @return
     */
    public static boolean isSuspended(Environment environment,String piid) {
        ProcessInstance pi = JBPMUtil.getProcessInstanceById(environment, piid);
        ExecutionImpl execution = (ExecutionImpl) pi;
        return execution.isSuspended();
    }
    
    
//    /**
//     * 说明：处理下一环节的办理人
//     *<p>
//     * Method processWFActorBean
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @param actorList
//     * @param nextnodename
//     * @param todoid
//     * @return
//     */
//    public static ArrayList<WFActorBean> processWFActorBean(HttpServletRequest request, HttpServletResponse response, Environment environment,
//            ConnectBean conb, ArrayList<WFActorBean> actorList, String nextnodename, String todoid) {
//        ArrayList<WFActorBean> finalList = new ArrayList<WFActorBean>();
//        SessionUser sessionUser = (SessionUser)SessionManager.getSession(request, response);
//        String _NEXT_ACTORS = request.getParameter("_NEXT_ACTORS");
//        JSONArray jsonArray = new JSONArray();
//        // 首先从http请求从获取下一环节的参与者，如果存在，参与者就用它
//        if (_NEXT_ACTORS != null && _NEXT_ACTORS.trim().length() > 0) {
//            finalList = WFFrame.pub_getActors(_NEXT_ACTORS);
//        } else {
//            // 如果不存在，那么参与者就从流程设计器中的候选参与者拿，因为没地儿选择，故把所有的候选者都作为参与者！
//            try {
//                jsonArray = WFActorHelper.getActorList(sessionUser, environment, conb, todoid, nextnodename, false);
//            } catch (Exception e) {
//            }
//            if (jsonArray != null && jsonArray.size() > 0) {
//                for (int i = 0; i < jsonArray.size(); i++) {
//                    JSONObject person = jsonArray.getJSONObject(i);
//                    WFActorBean wab = new WFActorBean(person.getString("person_uuid"), "user", person.getString("depart_uuid"));
//                    finalList.add(wab);
//                }
//            }
//        }
//        return finalList;
//    }
    
    
    
//    /**
//     * 说明：设置默认的下一环节办理人
//     *<p>
//     * Method setDefultActorList
//     * @param request
//     * @param response
//     * @param environment
//     * @param conb
//     * @param submit
//     * @throws Exception
//     */
//    public static void setDefultActorList(HttpServletRequest request, HttpServletResponse response, Environment environment, ConnectBean conb,
//            bean_submit submit) throws Exception {
//        bean_todo todo = submit.getTodo();
//        submit.setActorid(todo.getActorid());
//        submit.setActortype(todo.getActortype());
//        submit.setDeptuuid(todo.getDeptuuid());
//        submit.setAgenttype("");// 设置为非委托
//        String operatype = submit.getOpertype();
//        if (operatype == null || "".equals(operatype)) {
//            submit.setOpertype(WFConstant.Opertype_Submit);
//        }
//        String target = submit.getTarget();
//
//        WFBean wb = WFUtils.Flow_GetParam(environment, conb, submit.getTodo().getPiid());
//        HashMap<Object, Object> param = new HashMap<Object, Object>();
//        // param.put("is_center", "1");
//        // wb.set
//        WFUtils.Flow_UpdateVariable(environment, conb, submit.getTodo().getPiid(), param);
//        // WQLModule wm = WQLModule.getWQLModule(IWFOperation.CODE_TYPE_PERSON);
//        if (target == null || "".equals(target.trim())) {
//            // 允许下一环节名为空！！
//            ArrayList<String> childrenList = WFFrame.pub_getChildNodes(environment, conb, todo.getPdid(), todo.getNodename());
//            if (childrenList != null && childrenList.size() > 0) {
//                target = childrenList.get(0);
//                submit.setTarget(target);
//                WFNodeBean wnb = wb.getNodeBean(target);
//                if (wnb.isDecision()) {
//                    String _NEXT_TARGET = request.getParameter("_NEXT_TARGET");
//                    if (_NEXT_TARGET == null || "".equals(_NEXT_TARGET)) {
//                        ArrayList<WFDecisionConditionBean> conds = wnb.getConditions();
//                        _NEXT_TARGET = handlerDecision.processCondition(wb, wnb, conds);
//                        if (_NEXT_TARGET == null || "".equals(_NEXT_TARGET.trim())) {
//                            throw new Exception("自动环节的下一环节走不到对应的迁移条件");
//                        }
//                    }
//
//                    WFNodeBean nextwnb = wb.getNodeBean(_NEXT_TARGET);
//
//                    ArrayList<bean_submit_target> extratargets = new ArrayList<bean_submit_target>();
//
//                    ArrayList<WFActorBean> actorList = WFFrame.pub_getNodeActors(environment, conb, todo.getPdid(), todo.getPiid(), _NEXT_TARGET);
//                    bean_submit_target bst = new bean_submit_target();
//                    bst.setSigntype("0");
//                    bst.setTarget(_NEXT_TARGET);
//                    bst.setTargettype(nextwnb.getNodetype());
//                    bst.setTargetactors(processWFActorBean(request, response, environment, conb, actorList, _NEXT_TARGET, todo.getId()));
//                    extratargets.add(bst);
//                    submit.setExtratargets(extratargets);
//                }
//
//            }
//
//        }
//        ArrayList<WFActorBean> actorList = WFFrame.pub_getNodeActors(environment, conb, todo.getPdid(), todo.getPiid(), target);
//        submit.setTargetactors(processWFActorBean(request, response, environment, conb, actorList, target, todo.getId()));
//
//    }
    

}
