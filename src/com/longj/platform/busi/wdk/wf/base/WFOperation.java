package com.longj.platform.busi.wdk.wf.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.jbpm.api.ProcessInstance;
import org.jbpm.api.cmd.Environment;
import org.wdk.WDK;
import org.wdk.core.base.BaseUnitTodo;
import org.wdk.core.bean.WDKEnvironment;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.logeye.bean.LogEyeBean;
import org.wdk.module.wf.WFConstant;
import org.wdk.module.wf.engine.WFEngine;
import org.wdk.module.wf.engine.core.bean.WFActorBean;
import org.wdk.module.wf.engine.core.bean.WFBean;
import org.wdk.module.wf.engine.core.bean.WFNodeBean;


import org.wdk.module.wf.frame.core.bean.bean_submit;
import org.wdk.module.wf.frame.core.bean.bean_submit_target;
import org.wdk.module.wf.frame.core.bean.bean_todo;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.WQLModule;

import com.longj.platform.busi.wdk.uum.UUM;
import com.longj.platform.busi.wdk.wf.WFUtils;
import com.longj.platform.busi.wdk.wf.frame.WFFrame;

import wql.WQLNames;



 /**
 * 类名：com.nci.platform.wf.base.WFOperation <br/>
 * 描述：<br/>
 * 版权：Copyright (c) 2015 杭州新世纪电子科技有限公司
 * <p>
 * </p>
 * History:<br>
 * 1、2015-7-3 下午10:21:26 yub
 *
 * @author yub
 */
public abstract class WFOperation implements IWFOperation {
    
    private static WDKLogger logger = new WDKLogger(WFOperation.class.getName());
    
    
    
    /**
     * 说明：根据部门ID获取部门名称
     *<p>
     * Method getDeptNameByDeptId
     * 
     * @param conb
     * @param deptid
     * @return
     */
    protected String getDeptNameByDeptId(ConnectBean conb, String deptid) {
        // 根据部门ID,获取到部门名称
        WQLModule wm = WQLModule.getWQLModule(CODE_TYPE_ORG);
        String deptname = wm.id2name(deptid, "org_name", conb);
        return deptname;
    }
    

    
    /**
     * 说明：根据人员ID，获取人员所属的部门
     *<p>
     * Method getDeptObjectByUserId
     * 
     * @param conb
     * @param userId
     * @return
     */
    protected String getDeptObjectByUserId(ConnectBean conb, String userId) {
        JSONObject personObject = UUM.getPersonByID(userId, conb);
        if (personObject != null) {
            return personObject.getString("depart_uuid");
        } else {
            logger.info("人员UUID：【" + userId + "】，找不到对应的DEPART_UUID");
        }
        return userId+"[depart_uuid]";
    }

    
    /**
     * 说明：根据人员ID，获取部门名称
     *<p>
     * Method getDeptNameByUserId
     * @param conb
     * @param userId
     * @return
     */
    protected String getDeptNameByUserId(ConnectBean conb, String userId) {
        JSONObject persion = UUM.getPersonByID(userId, conb);
        if (persion != null) {
            return getDeptNameByDeptId(conb,persion.getString("depart_uuid"));
        }else {
            logger.info("人员UUID：【" + userId + "】，找不到对应的DEPART_UUID");
        }
        return userId+"[depart_name]";
    }

    /**
     * 说明：把人员，转换成组织+人员的形式
     *<p>
     * Method converUserMapToJson
     * 
     * @param userMap
     * @return
     */
    protected JSONArray converUserMapToJson(ConnectBean conb,Map userMap) {
        JSONArray orgJson = new JSONArray();
        HashMap orgMap = new HashMap();
        if (userMap != null) {
            Iterator it = userMap.keySet().iterator();
            while (it.hasNext()) {
                String userId = (String) it.next();
                String belongDeptId = getDeptObjectByUserId(conb,userId);
                String belongDeptName = getDeptNameByUserId(conb,userId);
                if (!orgMap.containsKey(belongDeptId)) {
                    orgMap.put(belongDeptId, belongDeptName);
                    JSONObject jtree = new JSONObject();
                    jtree.put("id", belongDeptId);
                    jtree.put("text", belongDeptName);
                    jtree.put("iconCls", "");
                    jtree.put("state", "open");
                    jtree.put("parentId", "-1");
                    jtree.put("deptuuid", belongDeptId);
                    jtree.put("type", "dept");
                    jtree.put("iconCls", "ext-icon-chart_organisation");
                    orgJson.add(jtree);
                }
                JSONObject user = new JSONObject();
                user.put("id", userId);
                user.put("text", userMap.get(userId));
                user.put("iconCls", "");
                user.put("state", "");
                user.put("parentId", belongDeptId);
                user.put("deptuuid", belongDeptId);
                user.put("type", "user");
                user.put("iconCls", "ext-icon-user");
                orgJson.add(user);
            }
        }
        return orgJson;
    }

    
    /**
     * TODO 说明：根据任务ID，获取任务对象（待办对象）
     *<p>
     * Method getTaskJsonObject
     * 
     * @param taskId
     * @return
     */
    public static JSONObject getTaskJsonObject(Environment environment, ConnectBean conb, String todoid) throws Exception {
        JSONObject jres = new JSONObject();
        bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
        todo = WFFrame.todo_addExtraParam(environment, conb, todo);
        if (todo != null &&todoid!=null&&!"".equals(todoid.trim())) {
            ArrayList<String> completeUser = new ArrayList<String>();
            ArrayList<String> doingUser = new ArrayList<String>();
            //已办和正在办理的人员ID
            StringBuffer completeUserId = new StringBuffer(",");
            StringBuffer doingUserId = new StringBuffer(",");
            /**
             * modify by yangll on 2016-06-12 start
             * 修改查询已办人和待办人的方法，之前是从流程变量读取的，缺少“转办”的记录，改成从wdk_wf_todo表读取
             * 待办理：todotype IN ('0','1','2') AND issuspend = '0' AND status = '0'	    	
             * 已办理：todotype IN ('0','1','2') AND issuspend = '0' AND status in ('1','2')    
             */
            ArrayList<bean_todo> _todolist = WQL.getWO(WQLNames.QWDKWFTODO)
				.addParam("flag", "1").addParam("piid", todo.getPiid())
				/**
				 * taskid 参数 add by yangll on 2016-08-01
				 * 如果不加taskid参数，那么流程特送到环节B，又被人特送到环节A，又特送环节B，那么此时看到的已办理人中包含第一次特送到环节B所选的参与者。
				 * 由于每次特送到环节B生成的待办的nodename是一样的，但是taskid是不一样的，所以加了该参数应该就可以了
				 */
				.addParam("taskid", todo.getTaskid())
				.addParam("nodename", todo.getNodename())
				.addParam("issuspend", "0")
				.process(conb)
				.getObjects(0, bean_todo.class);
            for (Iterator<bean_todo> it = _todolist.iterator(); it.hasNext();) {
            	bean_todo todoBean = it.next();
            	if("0".equals(todoBean.getTodotype()) || "1".equals(todoBean.getTodotype()) || "2".equals(todoBean.getTodotype())){
            		//如果这条待办是委托的，需要读取委托人信息，显示为：张三（李四委托）
        			String username = WFUtils.Flow_GetUserNameById(conb, todoBean.getActorid());
        			if("depute".equalsIgnoreCase(todoBean.getAgenttype()) && todoBean.getOriginactorid()!=null 
        					&& !todoBean.getOriginactorid().equalsIgnoreCase(todoBean.getActorid())){
        				String originactorname = WFUtils.Flow_GetUserNameById(conb, todoBean.getOriginactorid());
        				if(originactorname!=null && originactorname.trim().length()>0){
        					username += "(" + originactorname + "委托)"; 
        				}
        			}
            		if("0".equals(todoBean.getStatus()) && !"depute".equalsIgnoreCase(todoBean.getAgenttype())){
                		//待办的委托的还是去掉不显示了
            			doingUserId.append(todoBean.getActorid()).append(",");
            			doingUser.add(username);
                	} else if("1".equals(todoBean.getStatus()) || "2".equals(todoBean.getStatus())){
                		completeUserId.append(todoBean.getActorid()).append(",");
                		completeUser.add(username);
                	}
            	}
            }
            /**
             * modify by yangll on 2016-06-12 end
             */
            
            //@upd daru.zheng on 2016-07-18 start
            //需要判断当前待办是否办结，默认未办结，取当前环节名称
            String nodeName = todo.getNodename();
            String nodeTitle = todo.getNodetitle();
            //判断下当前待办是否办结
            if( WFUtils.Flow_IsFlowEnd(environment, conb, todo.getPiid())){
       	 		WFBean wb = WFUtils.Flow_QueryWbByPiid(environment, conb, todo.getPiid());// WFFrame.wb_create(pdid);
	            nodeName = wb.getEndNode().getNodename();
	            nodeTitle = wb.getEndNode().getNodetitle();
            }  
            //@upd daru.zheng on 2016-07-18 end
            
            jres.put("title", todo.getTitle());
            jres.put("nodename", nodeName);
            jres.put("nodetitle", nodeTitle);
            jres.put("done_userids", completeUserId.toString());
            jres.put("todo_userids", doingUserId.toString());
            jres.put("done_users", completeUser.toString());
            jres.put("todo_users", doingUser.toString());
            jres.put("pdid", todo.getPdid());
            jres.put("piid", todo.getPiid());
            jres.put("param_islastactor", todo.isParam_islastactor()?"1":"0");
            jres.put("nodetype", todo.getNodetype());
            ProcessInstance pi = WFEngine.pi_query(environment, conb, todo.getPiid());
            jres.put("isflowend", pi!=null?pi.isEnded():true);	//流程是否结束
        } else {
            // 如果待办没有，则用测试数据《 等待删除的数据》
//            jres.put("title", "t测试文件名-- " + todoid);
//            jres.put("nodename", "t测试当前处理环节-- " + todoid);
//            jres.put("done_users", "t测试已办理人员 --" + todoid);
//            jres.put("todo_users", "t测试待办理人员--" + todoid);
//            jres.put("pdid", "pdid");
//            jres.put("piid", "piid");
//            jres.put("param_islastactor", "0");
//            jres.put("nodetype", "sign");
        }

        return jres;
    }
    
    /**
     * 根据前台参数构造流程提交的bean_submit对象
     * @param environment
     * @param conb
     * @param param
     * @return
     * @throws Exception 
     */
    public bean_submit getBean_submit(Environment environment, ConnectBean conb,HashMap param) throws Exception{
		WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
		boolean isSuccess = true;
		String msg = "";
		
		bean_submit submit = null;
		
    	LogEyeBean log = wdkEnv.startLog(WFOperation.class.getName(),"markBean_submit");//日志跟踪
    	try{
	    	String todoid = (String) param.get("todoid");
	    	String title = (String) param.get("title");
	        String actorid = (String) param.get("actorid");
	        if (actorid == null || "".equals(actorid.trim()) || "undefined".equals(actorid)) {
	            //当待办办理人为空时返回null
	        }else{
		        String actortype = (String) param.get("actortype");
		        String deptuuid = (String) param.get("deptuuid");
		        String agenttype = (String) param.get("agenttype");
		        if (agenttype == null) {
		            agenttype = "";
		        }
		        String originactorid = (String) param.get("originactorid");
		        String originactortype = (String) param.get("originactortype");
		        String origindeptuuid = (String) param.get("origindeptuuid");
		
		        String opertype = (String) param.get("opertype");
		        String opercomment = (String) param.get("opercomment");
		        String signtype = (String) param.get("signtype");
		        String nextnode = (String) param.get("nextnode");
		        String nextnodetype = (String) param.get("nextnodetype");
		        String nextactors = (String) param.get("nextactors");
		        String isdeputesign = (String) param.get("isdeputesign");
		
		        // 如果是子流程，则需要传入父流程
		        String ptarget = (String) param.get("ptarget");
		        String ptargettype = (String) param.get("ptargettype");
		        
		        //统一待办推送方式
		        String unittodopushtype = param.containsKey("unittodopushtype")?(String)param.get("unittodopushtype"):BaseUnitTodo.PUSGTYPE_SYNC;//sync-同步  asyn-异步
		        if(!BaseUnitTodo.PUSGTYPE_SYNC.equals(unittodopushtype)){
		        	//不明确指定为同步方式发送，都将设置为按异步发送
		        	unittodopushtype = BaseUnitTodo.PUSGTYPE_ASYN;
		        }
		        //根据待办id查询待办信息
		        bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
		        //如果流程已经结束则先进行流程恢复（主要是已结束的流程还允许特送）
		        boolean isend = WFUtils.Flow_IsFlowEnd(environment, conb, todo.getPiid());
		        if (isend) {
		            WFBean wfbean = WFUtils.Flow_QueryWbByPiid(environment, conb, todo.getPiid());
		            String piid = WFFrame.pi_recover(environment, conb, wfbean);
		            List<String> todoids = WFUtils.Flow_GetTodoIdList(environment, conb, piid);
		            if (todoids != null && todoids.size() > 0) {
		                todo = WFFrame.todo_querySingle(environment, conb, todoids.get(0));
		            }
		        }
		        
		        submit = new bean_submit(todo);
		        submit.setActorid(actorid);
		        submit.setActortype(actortype);
		        submit.setAgenttype(agenttype);
		        submit.setIsdeputesign(isdeputesign);
		        submit.setDeptuuid(deptuuid);
		        submit.setOpertype(opertype);
		        submit.setOperdt(WDK.getDateTime());
		        if (title != null && title.trim().length() > 0) {
		        	submit.setTitle(title);
		        }
		        submit.setOpercomment(opercomment);
		        submit.setOriginactorid(originactorid);
		        submit.setOriginactortype(originactortype);
		        submit.setOrigindeptuuid(origindeptuuid);
		        submit.setPtarget(ptarget);
		        submit.setPtargettype(ptargettype);
		
		        submit.setSigntype(signtype);
		        submit.setTarget(nextnode);
		        submit.setTargettype(nextnodetype);
		        ArrayList<WFActorBean> actors = WFFrame.pub_getActors(nextactors);
		        submit.setTargetactors(actors);
		        // 考虑批量提交的情况
		        String extrasigntype = (String) param.get("extrasigntype");
		        String extranextnode = (String) param.get("extranextnode");
		        String extranextnodetype = (String) param.get("extranextnodetype");
		        String extranextactors = (String) param.get("extranextactors");
		
		        ArrayList<bean_submit_target> extratargets = getBean_submit_target(extrasigntype, extranextnode, extranextnodetype, extranextactors);
		        if(WFConstant.NODE_FROK.equals(extranextnodetype)){
		            String extrasigntype2 = (String) param.get("extrasigntype2");
		            String extranextnode2 = (String) param.get("extranextnode2");
		            String extranextnodetype2 = (String) param.get("extranextnodetype2");
		            String extranextactors2 = (String) param.get("extranextactors2");
		            ArrayList<bean_submit_target> extratargets2 = getBean_submit_target(extrasigntype2, extranextnode2, extranextnodetype2, extranextactors2);
		            for(bean_submit_target target:extratargets){
		                target.setNext_submit_target(extratargets2);
		            }
		        }
		        submit.setExtratargets(extratargets);
		        submit.setUnittodopushtype(unittodopushtype);
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
        
        return submit;
    }
    
    private ArrayList<bean_submit_target> getBean_submit_target(String extrasigntype,String extranextnode,String extranextnodetype,String extranextactors){
        ArrayList<bean_submit_target> extratargets = new ArrayList<bean_submit_target>();
        if (null != extranextnode && !"".equals(extranextnode)) {
            if (-1 != extranextnode.indexOf("||")) {
                String[] arrSigntype = extrasigntype.split("\\|\\|");
                String[] arrNextnode = extranextnode.split("\\|\\|");
                String[] arrNextnodetype = extranextnodetype.split("\\|\\|");
                String[] arrNextactors = extranextactors.split("\\|\\|");
                for (int i = 0; i < arrSigntype.length; i++) {
                    bean_submit_target bst = new bean_submit_target();
                    bst.setSigntype(arrSigntype[i]);
                    bst.setTarget(arrNextnode[i]);
                    bst.setTargettype(arrNextnodetype[i]);
                    ArrayList<WFActorBean> extraactors = WFFrame.pub_getActors(arrNextactors[i]);
                    bst.setTargetactors(extraactors);
                    extratargets.add(bst);
                }
            } else {
                bean_submit_target bst = new bean_submit_target();
                bst.setSigntype(extrasigntype);
                bst.setTarget(extranextnode);
                bst.setTargettype(extranextnodetype);
                ArrayList<WFActorBean> extraactors = WFFrame.pub_getActors(extranextactors);
                bst.setTargetactors(extraactors);
                extratargets.add(bst);
            }
        }
        return extratargets;
    }
}
