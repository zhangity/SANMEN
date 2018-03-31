package com.longj.platform.busi.wdk.wf.base;

import org.jbpm.pvm.internal.env.EnvironmentImpl;
import org.wdk.WDK;
import org.wdk.WDKConstant;
import org.wdk.WDKCore;
import org.wdk.core.base.BaseUnitTodo;
import org.wdk.core.bean.WDKLogger;
import org.wdk.core.util.uLogger;
import org.wdk.module.wf.WFConstant;
import org.wdk.module.wf.frame.core.bean.bean_todo;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.WQLModule;

import com.longj.platform.busi.wdk.wf.frame.WFFrame;


public class WSTODOBean {

    private final static String UUM_UA_APPLICATION_CODE = "UUM_UA_APPLICATION_CODE";
    private static WDKLogger logger = new WDKLogger(WSTODOBean.class.getName());


    /**
     * 说明：获取应用编码
     * <p>
     * Method getAPP_CODE
     * 
     * @param conb
     * @param id
     * @return
     */
    public String getAPP_CODE(ConnectBean conb, String id, String flowtype) {
        if (id == null || "".equals(id)) {
            return "";
        }
        String APP_CODE = "";
        WQLModule module = WQLModule.getWQLModule(UUM_UA_APPLICATION_CODE);
        if (module != null) {
            APP_CODE = module.id2name(id, "app_code", conb);
        }

        String todoClassName = WDK.getPropPUB(WDKConstant.PROP_cfg_handler_unittodo);
        if (todoClassName != null && !"".equals(todoClassName)) {
            try {
                BaseUnitTodo but = (BaseUnitTodo) Class.forName(todoClassName).newInstance();
                if (but != null) {
                    APP_CODE = but.getUnitAppCode(conb, APP_CODE, flowtype);
                }
            } catch (Exception e) {
            }
        }
        return APP_CODE;
    }

    /**
     * 说明：获取流程名称
     * <p>
     * Method getWorkFlowName
     * 
     * @param conb
     * @param pdid
     * @return
     */
    public String getWorkFlowName(ConnectBean conb, String pdid) {
        if (pdid == null || "".equals(pdid)) {
            return "";
        }
        WQLModule module = WQLModule.getWQLModule("WDK_WF_PD");
        return module.id2name(pdid, "cnname", conb);
    }

    /**
     * 说明：获取统一待办类型：T1:待办；T2:待签；T3待阅
     * <p>
     * Method getTodoType
     * 
     * @param conb
     * @param todo
     * @return
     */
    private String getTodoType(ConnectBean conb, bean_todo todo, String appCode) {
        String todotype = todo.getTodotype();
        if (WFConstant.TODO_Type_CC.equals(todotype)) {
            return "T3";
        }
        /*if ("OA".equals(appCode)) {
            String lockuserid = todo.getLockactorid();
            if (lockuserid == null || "".equals(lockuserid.trim())) {
                return "T2";
            }
        }*/
        return "T1";
    }

    /**
     * 说明：获取
     * <p>
     * Method getTodoItemURL
     * 
     * @param conb
     * @param todo
     * @return
     */
    private String getTodoItemURL(ConnectBean conb, bean_todo todo) {
        //EnvironmentImpl environmentImpl = EnvironmentImpl.getCurrent();
        String theme = WDKCore.inst.THEME;
        if (null==theme||"".equals(theme)) {
            theme = "default";
        }
        String url = "/"+WDKCore.inst.WDK_ROOT + "/frame/" + theme + "/todo.jsp?todoid="+todo.getId();
//        try {
//            return "<![CDATA[" + BDL.buildTodoItemURL(environmentImpl, conb, todo.getId()) + "]]>";
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return url;
    }

    public String getTodoAddContext(ConnectBean conb, bean_todo todo) {
    	String ismobileshow = "1";
//        try {
//            EnvironmentImpl environmentImpl = EnvironmentImpl.getCurrent();
//            ismobileshow = BDL.getBdlNodeVariable(environmentImpl, conb, todo.getId(), IWFOperation.BDL_NODE_VARIABLE_ISSHOWMOBILE);
//        } catch (Exception e1) {
//            logger.errorWithNoException(uLogger.getExceptionStatck(e1));
//        }
//        if (ismobileshow == null || "".equals(ismobileshow.trim())) {
//            ismobileshow = "1";// 默认需要在移动端显示的
//        }
        // todo.get
        WQLModule module = WQLModule.getWQLModule("UUM_UU_PERSONINFO");
        StringBuffer bufferStr = new StringBuffer();
        bufferStr.append("<todo method=\"add\">");
        bufferStr.append("<wdk>");
        bufferStr.append("<route method=\"ws.todo.add\" appcode=\"").append(this.getAPP_CODE(conb, todo.getApp_uuid(),todo.getTodosort() == null ? "" : todo.getTodosort()))
                .append("\" verifycode=\"发起方验证密码串\"/>");
        bufferStr.append("<data  label=\"服务报文\">");
        String appCode = this.getAPP_CODE(conb, todo.getApp_uuid(),todo.getTodosort() == null ? "" : todo.getTodosort());
        bufferStr.append("<appcode label=\"必填，来源应用系统标识\">").append(appCode).append("</appcode>");
        bufferStr.append("<todoid label=\"必填，待办在来源系统中的待办ID\">").append(todo.getId()).append("</todoid>");
        bufferStr.append("<todotype label=\"允许为空，待办类型\">").append(this.getTodoType(conb, todo,appCode)).append("</todotype>");
        bufferStr.append("<flowname label=\"允许为空，流程名称\">").append(this.getWorkFlowName(conb, todo.getPdid())).append("</flowname>");
        bufferStr.append("<flowtype label=\"允许为空，流程类型\">").append(todo.getTodosort() == null ? "" : todo.getTodosort()).append("</flowtype>");
        bufferStr.append("<nodename label=\"允许为空，当前环节名称\">").append(todo.getNodetitle()).append("</nodename>");
        bufferStr.append("<title label=\"必填，待办任务标题\">").append(todo.getTitle()).append("</title>");
        bufferStr.append("<tasksummary label=\"允许为空，任务摘要\">摘要</tasksummary>");
        bufferStr.append("<userid label=\"必填，处理人ID\">").append(module.id2name(todo.getActorid(), "externalid", conb)).append("</userid>");
        String preuserid = todo.getSendactorid();
        //2015-11-13 add by yub 【新增以下三个字段：username、preuserid、prenodename】
        bufferStr.append("<username label=\"必填，处理人名称\">").append(module.id2name(todo.getActorid(), "person_name", conb)).append("</username>");
        bufferStr.append("<preuserid label=\"允许为空，上一环节任务处理人名称\">").append(module.id2name(preuserid, "externalid", conb)).append("</preuserid>");
        bean_todo pretodo = todo.getParam_pretodo();
        if (pretodo == null && todo.getPretodoid() != null && todo.getPretodoid().length() > 0) {
            try {
                pretodo = WFFrame.todo_querySingle(null, conb, todo.getPretodoid());
            } catch (Exception e) {
            }
        }
        bufferStr.append("<prenodename label=\"允许为空，上一环节任务名称\">").append(pretodo!=null?pretodo.getNodetitle():"").append("</prenodename>");
        //end add
        String senddt = todo.getSenddt();
        if(senddt==null||"".equals(senddt)){
            senddt = WDK.getDateTime();
        }
        bufferStr.append("<tasktime label=\"必填，任务送达时间\">").append(senddt).append("</tasktime>");
        bufferStr.append("<preusername label=\"允许为空，上一环节任务处理人名称\">").append(module.id2name(preuserid, "person_name", conb)).append("</preusername>");
        bufferStr.append("<relativepath label=\"必填，待办办理界面相对路径\">").append(this.getTodoItemURL(conb, todo)).append("</relativepath>");
        bufferStr.append("<expirestime label=\"允许为空，待办任务逾期时间\">").append(todo.getWarnyellowdt()).append("</expirestime>");
        bufferStr.append("<warningtime label=\"允许为空，待办任务预警时间\">").append(todo.getWarnreddt()).append("</warningtime>");
        bufferStr.append("<emergency label=\"允许为空，紧急程度\">03</emergency>");
        bufferStr.append("<remark label=\"允许为空，备注\"></remark>");
        bufferStr.append("<extraparam label=\"允许为空，自定义参数\">").append(ismobileshow).append("</extraparam>");
        bufferStr.append("</data>");
        bufferStr.append("</wdk>");
        bufferStr.append("</todo>");
        return bufferStr.toString();
    }

    public String getTodoQueryContext(ConnectBean conb, String todoid, String todotype, String title, String userid, String starttime,
            String endtime, String pagestart, String pageend, String orderby) {
        StringBuffer bufferStr = new StringBuffer();
        
        String[] oneids = todoid.split(",");
        String todosort ="";
        if (oneids != null && oneids.length > 0) {
            String oneid = oneids[0];
            try {
                bean_todo todobean = WFFrame.todo_querySingle(null, conb, oneid);
                if (todobean != null) {
                    todosort = todobean.getTodosort();
                }
            } catch (Exception e) {
            }
        }
        bufferStr.append("<todo method=\"query\">");
        bufferStr.append("<wdk>");
        bufferStr.append("<route method=\"ws.todo.query\" appcode=\"")
                .append(this.getAPP_CODE(conb, WDK.getPropPUB(WDKConstant.PROP_cfg_sys_appuuid),todosort)).append("\" verifycode=\"发起方验证密码串\"/>");
        bufferStr.append("<data>");
        bufferStr.append("<appcode label=\"\">").append(this.getAPP_CODE(conb, WDK.getPropPUB(WDKConstant.PROP_cfg_sys_appuuid),todosort))
                .append("</appcode>");
        bufferStr.append("<todoid label=\"\">").append(todoid).append("</todoid>");
        bufferStr.append("<todotype label=\"\">").append(todotype).append("</todotype>");
        bufferStr.append("<title label=\"\">").append(title).append("</title>");
        bufferStr.append("<userid label=\"\">").append(userid).append("</userid>");
        bufferStr.append("<starttime label=\"\">").append(starttime).append("</starttime>");
        bufferStr.append("<endtime label=\"\">").append(endtime).append("</endtime>");
        bufferStr.append("<pagestart label=\"\">").append(pagestart).append("</pagestart>");
        bufferStr.append("<pageend label=\"\">").append(pageend).append("</pageend>");
        bufferStr.append("<orderby label=\"\">").append(orderby).append("</orderby>");

        bufferStr.append("</data>");
        bufferStr.append("</wdk>");
        bufferStr.append("</todo>");
        return bufferStr.toString();
    }

    public String getTodoCloseContext(ConnectBean conb, String ids, String operdt, String closetype) {
        /*
         * 关于待签订的待办的处理：<br/> 遇到的风险：<br/> 1、在业务系统中，待签变成待办的时候，业务记录是同一条，但是在统一待办中要先关闭原先的待签数据，再插入新的待办数据<br/> 2、<br/>
         */
        /*
         * 2、存在的风险：业务系统要先调关闭的ws，然后再调新增的ws，但是todoid是同一个，风险就是，万一新增的在关闭之前插入完毕了，2个数据都将被关闭
         */
        StringBuffer bufferStr = new StringBuffer();
        
        String[] oneids = ids.split(",");
        String todosort ="";
        if (oneids != null && oneids.length > 0) {
            String oneid = oneids[0];
            try {
                bean_todo todobean = WFFrame.todo_querySingle(null, conb, oneid);
                if (todobean != null) {
                    todosort = todobean.getTodosort();
                }
            } catch (Exception e) {
            }
        }
        bufferStr.append("<todo method=\"close\">");
        bufferStr.append("<wdk>");
        bufferStr.append("<route method=\"ws.todo.close\" appcode=\"")
                .append(this.getAPP_CODE(conb, WDK.getPropPUB(WDKConstant.PROP_cfg_sys_appuuid),todosort)).append("\" verifycode=\"发起方验证密码串\"/>");
        bufferStr.append("<data>");
        bufferStr.append("<appcode label=\"必填，来源应用系统标识\">").append(this.getAPP_CODE(conb, WDK.getPropPUB(WDKConstant.PROP_cfg_sys_appuuid),todosort))
                .append("</appcode>");
        bufferStr.append("<todoid label=\"必填，待办在来源系统中的待办ID\">").append(ids).append("</todoid>");
        bufferStr.append("<closetype label=\"必填，关闭方式\">").append(closetype).append("</closetype>");
        bufferStr.append("<closedate label=\"必填，关闭时间\">").append(operdt).append("</closedate>");
        bufferStr.append("</data>");
        bufferStr.append("</wdk>");
        bufferStr.append("</todo>");
        return bufferStr.toString();
    }

}