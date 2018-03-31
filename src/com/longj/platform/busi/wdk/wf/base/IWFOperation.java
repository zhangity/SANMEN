package com.longj.platform.busi.wdk.wf.base;

import java.util.HashMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.jbpm.api.cmd.Environment;
import org.wdk.WDK;
import org.wdk.module.wf.frame.core.bean.bean_submit;
import org.wdk.module.wql.core.bean.ConnectBean;

import com.longj.platform.busi.wdk.handler.SessionUser;



/**
 * 类名：com.nci.platform.wf.base.IWFOperation <br/>
 * 描述：<br/>
 * 版权：Copyright (c) 2015 杭州新世纪电子科技有限公司
 * <p>
 * </p>
 * History:<br>
 * 1、2015-7-3 下午10:19:42 yub
 * 
 * @author yub
 */
public interface IWFOperation {
    
    public static boolean IS_BUTTON_BUTTOM = false;

    public static String PARTICIPANT_TYPE_USER = "user";// user 用户 ；

    public static String PARTICIPANT_TYPE_ROLE = "role";// role 角色；

    public static String PARTICIPANT_TYPE_VMROLE = "vmrole";// vmrole 虚拟角色；

    public static String FLOW_NODEVARIABLE_FILTERDEPART = "FILTERDEPART";// 部门类型

    public static String FLOW_NODEVARIABLE_FILTERPERSON = "FILTERPERSON";// FILTERPERSON 人员类型
    
    public static String FLOW_NODEVARIABLE_FILTERDEPART_SPECIALSEND = "FILTERDEPART_SPSEND";// 特送时的处理人部门类型控制 

    public static String FLOW_NODEVARIABLE_FILTERPERSON_SPECIALSEND = "FILTERPERSON_SPSEND";// 特送时的处理人人员类型控制  

    public static String CODE_TYPE_ORG = "UUM_UU_ORGINFO";

    public static String CODE_TYPE_PERSON = "UUM_UU_PERSONINFO";
    
    public static String BDL_NODE_VARIABLE_AUTOCOMMIT = "NODE_AUTOCOMMIT";//事项中配置的环节变量。
    public static String BDL_NODE_VARIABLE_DEFAULTNODE = "NODE_DEFAULT_NEXT";//事项中配置的环节变量：默认下一环节nodename。
    
    public static String BDL_NODE_VARIABLE_REFERNODE = "NODE_REFER_NODE";//事项中配置的环节变量：参与者参考哪个环节
    public static String BDL_NODE_VARIABLE_ACTOR_MODE = "NODE_ACTOR_MODE";//事项中配置的环节变量：非会签环节参与者是否支持多选，默认都是单选。
    public static String BDL_NODE_VARIABLE_DEFAULTACTOR_MODE = "NODE_DEFACTOR_MODE";//事项中配置的环节变量：办理人默认选择模式 。
    public static String BDL_NODE_VARIABLE_DEFAULTACTOR = "NODE_DEFACTOR";//事项中配置的环节变量：默认办理人（保存的办理人ID,多个之间用逗号分隔） 。
    public static String BDL_NODE_VARIABLE_INPUT_OPTION = "NODE_INPUT_OPTION";//事项中配置的环节变量：是否必须填写意见。
    public static String NODE_NOT_SHOW = "NODE_NOT_SHOW";//事项中配置的环节变量：提交时“下一环节”处不显示的环节，多个之间用逗号分隔。
    
    public static String BDL_NODE_VARIABLE_ISSHOWMOBILE = "NODE_IS_SHOW_MOBILE";// 事项中配置的环节变量：是否发送到手机端：1-是；0否，默认是。
    
    public static String DISPLAYMODE = WDK.getNodeParam("todo_page_nodedisplay");// 送达界面环节显示方式，默认是用radio

    /**
     * 说明：根据待办ID，获取信息对象
     *<p>
     * Method getTodoIndo
     * 
     * @param environment
     * @param conb
     * @param todoid
     * @return
     */
    public JSONObject getTodoIndo(Environment environment, ConnectBean conb, String todoid);

    /**
     * 说明：根据环节名，获取环节下配置好的参与人
     *<p>
     * Method getNodeUsersByNodeName
     * 
     * @param environment
     * @param conb
     * @param pdid
     * @param piid
     * @param nodename
     * @param bfilter
     * @return
     */
    public JSONArray getNodeUsersByNodeName(SessionUser sessionUser, Environment environment, ConnectBean conb, String todoid, String nodename,
            boolean bfilter,String direction);

    
    /**
     * 说明：根据环节名，获取环节下配置好的参与人
     *<p>
     * Method getNodeUsersByNodeName
     * 
     * @param environment
     * @param conb
     * @param pdid
     * @param piid
     * @param nodename
     * @param bfilter
     * @param direction
     * @param rolefilterpara 员过滤参数类型
     * @return
     */
    public JSONArray getNodeUsersByNodeName(SessionUser sessionUser, Environment environment, ConnectBean conb, String todoid, String nodename,
            boolean bfilter,String direction,String rolefilterpara);
    
    /**
     * 说明：获取当前部门下的人员列表
     *<p>
     * Method getUsersByCurrentDept
     * 
     * @param environment
     * @param conb
     * @param orgId
     * @return
     */
    public JSONArray getUsersByCurrentDept(Environment environment, ConnectBean conb, String orgId, String todoid);

    
    /**
     * 说明：获取当前部门及子部门下的所有人员
     *<p>
     * Method getUsersByCurrentDept
     * 
     * @param environment
     * @param conb
     * @param orgId
     * @return
     */
    public JSONArray getAllUsersByCurrentDept(Environment environment, ConnectBean conb, String orgId, String todoid);

    
    /**
     * 说明：增加，拿本部门的人用，需要过滤，已经选择的人员信息
     *<p>
     * Method getUsersByCurrentDeptNoDept
     * 
     * @param environment
     * @param conb
     * @param orgId
     * @param todoid
     * @return
     */
    public JSONArray getUsersByCurrentDeptNoDept(Environment environment, ConnectBean conb, String orgId, String todoid);

    /**
     * 说明：获取当前环节，已经分配的参与者列表
     *<p>
     * Method getTodoSelectedUsers
     * 
     * @param environment
     * @param conb
     * @param todoid
     * @return
     */
    public JSONArray getTodoSelectedUsers(Environment environment, ConnectBean conb, String todoid);

    /**
     * 说明：获取流程审批意见模板列表
     *<p>
     * Method getNotionTemplates
     * 
     * @param environment
     * @param conb
     * @param firstSort
     * @param secondSort
     * @return
     */
    public JSONArray getNotionTemplates(Environment environment, ConnectBean conb, String firstSort, String secondSort,String userid, String app_code);

    /**
     * 说明：获取前序环节列表
     *<p>
     * Method getPreActivityList
     * 
     * @param environment
     * @param conb
     * @param pdid
     * @param piid
     * @param nodename
     * @return
     */
    public JSONArray getPreActivityList(Environment environment, ConnectBean conb, String pdid, String piid, String nodename);

    /**
     * 说明：获取下一环节列表
     *<p>
     * Method getChildrenActivityList
     * 
     * @param environment
     * @param conb
     * @param pdid
     * @param piid
     * @param nodename
     * @return
     */
    public JSONArray getChildrenActivityList(Environment environment, ConnectBean conb, String pdid, String piid, String nodename);

    /**
     * 说明：获取当前流程模板下的所有环节列表
     *<p>
     * Method getAllActivityList
     * 
     * @param environment
     * @param conb
     * @param pdid
     * @param piid
     * @param nodename
     * @return
     */
    public JSONArray getAllActivityList(Environment environment, ConnectBean conb, String pdid, String piid, String nodename);

    /**
     * 说明：
     *<p>
     * Method getTodoBean
     * 
     * @param environment
     * @param conb
     * @param todoid
     * @return
     */
    public TodoBean getTodoBean(Environment environment, ConnectBean conb, String todoid);

    
    /**
     * 根据前台参数构造流程提交的bean_submit对象
     * @param environment
     * @param conb
     * @param param
     * @return
     * @throws Exception
     */
    public bean_submit getBean_submit(Environment environment, ConnectBean conb,HashMap param) throws Exception;
    
    /**
     * 说明：
     *<p>
     * Method todo_submit
     * 
     * @param environment
     * @param conb
     * @param param
     */
    public boolean todo_submit(Environment environment, ConnectBean conb, HashMap param) throws Exception;

    
    /**
     * 待办提交（流程推进）
     * @param environment
     * @param conb
     * @param submit
     * @return
     * @throws Exception
     */
    public boolean todo_submit(Environment environment, ConnectBean conb, bean_submit submit) throws Exception;
    
    /**
     * 说明：获取当前环节的办理情况
     *<p>
     * Method getWFActorList
     * 
     * @param environment
     * @param conb
     * @param pdid
     * @param piid
     * @param nodename
     * @return
     */
    public JSONArray getWFActorList(Environment environment, ConnectBean conb,SessionUser sessionuser, String pdid, String piid, String nodename);

}