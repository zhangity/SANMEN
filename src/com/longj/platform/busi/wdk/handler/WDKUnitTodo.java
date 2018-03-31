package com.longj.platform.busi.wdk.handler;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.wdk.core.base.BaseUnitTodo;
import org.wdk.core.bean.WDKEnvironment;
import org.wdk.module.logeye.bean.LogEyeBean;
import org.wdk.module.wf.frame.core.bean.bean_todo;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;

import com.longj.platform.busi.wdk.wf.base.WSTODOBean;
import com.longj.platform.pb.msg.MSG;
import com.longj.platform.pb.msg.bean.MSGBean;
import com.longj.platform.pb.msg.bean.MSGResultBean;

import wql.WQLNames;


/**
 * 统一待办库同步实现类
 * 
 */
public class WDKUnitTodo extends BaseUnitTodo {

    @Override
    public String addTodo(ConnectBean conb, bean_todo todo, String synctype) {
    	WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	boolean isSuccess = true;
		String msg = "";
    	
    	LogEyeBean log = wdkEnv.startLog(WDKUnitTodo.class.getName(), "addTodo");//日志跟踪
    	try{
	        String addContext = new WSTODOBean().getTodoAddContext(conb, todo);
	        MSGBean mb = new MSGBean();
	        mb.setReceivertype(MSG.Adapter_ws_todo);
	        mb.setMsgcontent(addContext);
	        if(BaseUnitTodo.PUSGTYPE_SYNC.equals(synctype)){
	    		//同步推送消息
	        	MSGResultBean rb = MSG.sendSync(mb, conb);
	        	//如果同步推送失败则转异步推送
	        	if(rb!=null && rb.isSuccess()==false){
	        		MSG.sendAsyn(mb, conb);
	        	}
	    	}else{
	    		//异步推送消息
	    		MSG.sendAsyn(mb, conb);
	    	}
    	}catch (Exception e) {
    		e.printStackTrace();
    		isSuccess = false;
    		msg = e.getMessage();
		}finally{
			wdkEnv.endLog(log,isSuccess,msg);
		}
        return null;
    }

    @Override
    public String closeTodo(ConnectBean conb, bean_todo todo, String operadt, String opertype, String closeType, boolean isRecover, String synctype) {
    	WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	boolean isSuccess = true;
		String msg = "";
		
    	LogEyeBean log = wdkEnv.startLog(WDKUnitTodo.class.getName(), "closeTodo");//日志跟踪
        try {
            List<String> todoids = new ArrayList<String>();
            ArrayList<bean_todo> todos = WQL.getWO(WQLNames.QWDKWFTODO).addParam("flag", "201").addParam("taskid", todo.getTaskid())
                    .addParam("subtaskid", todo.getSubtaskid()).process(conb).getObjects(0, bean_todo.class);
            for (bean_todo _todo : todos) {
                todoids.add(_todo.getId());
            }
            if(todoids == null || todoids.size() == 0){
            	//推送到结束环节时，wdk_wf_todo 表中数据已经删除导致获取不到id使统一待办表pf_un_todo表数据未更新
            	todoids.add(todo.getId());
            }
            String idsStr = StringUtils.join(todoids, ",");
            String addContext = new WSTODOBean().getTodoCloseContext(conb, idsStr, operadt, closeType);
            MSGBean mb = new MSGBean();
            mb.setReceivertype(MSG.Adapter_ws_todo);
            mb.setMsgcontent(addContext);
            if(BaseUnitTodo.PUSGTYPE_SYNC.equals(synctype)){
        		//同步推送消息
            	MSGResultBean rb = MSG.sendSync(mb, conb);
            	//如果同步推送失败则转异步推送
            	if(rb!=null && rb.isSuccess()==false){
            		MSG.sendAsyn(mb, conb);
            	}
            }else{
            	//异步推送消息
            	MSG.sendAsyn(mb, conb);
            }
        }catch (Exception e) {
        	e.printStackTrace();
        	isSuccess = false;
    		msg = e.getMessage();
        }finally{
			wdkEnv.endLog(log,isSuccess,msg);
		}
        return null;
    }

    /**
     * 说明：获得应用编码，由于综合事务和公文系统部署在一个系统，但是统一待办和移动办公展现的时候又要分开，因此待办入库的时候将综合事务的分类出来
     * <p>
     * Method getUnitAppCode
     * @param conb
     * @param appcode
     *            原始APPCODE
     * @param flowtype
     *            流程类型：发文G151、收文G152、督察督办G153、事务G154（允许为空）
     * @return
     */
    @Override
    public String getUnitAppCode(ConnectBean conb, String appcode, String flowtype) {
        //yangll来实现具体的业务代码
    	if(flowtype.toUpperCase().startsWith("G154")){
    		//综合事务，用综合事务的应用编码GA
    		appcode = "GA";
    	}
        return appcode;
    }

}
