package com.longj.platform.busi.wdk.wf.frame;

import java.util.List;

import org.wdk.WDK;
import org.wdk.WDKConstant;
import org.wdk.core.base.BaseUnitTodo;
import org.wdk.core.bean.WDKTransationHandler;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wf.WFConstant;
import org.wdk.module.wf.frame.core.bean.bean_todo;
import org.wdk.module.wql.core.bean.ConnectBean;

public class UnitTodoCloseTransHandler implements WDKTransationHandler{
	private static WDKLogger logger = new WDKLogger(UnitTodoCloseTransHandler.class.getName());
	private String pushtype;		//统一待办推送方式
	private String closeType;		//关闭方式
	private List<bean_todo> todos;	//需求推送的待办列表
	
	
	public void closeTodo(List<bean_todo> todos,String closeType,String pushtype){
		this.todos = todos;
		this.pushtype = pushtype;
		this.closeType = closeType;
	}
	

	@Override
	public void transAfter(ConnectBean conb,boolean isSuccess) throws Exception {
		if(isSuccess){
			//事务提交成功才处理
			logger.debug("流程引擎事务成功，开始推送统一待办，待办数量：" + this.todos.size() + "，关闭方式：" + this.closeType + "，推送方式：" + this.pushtype);
			
	        String isenable = WDK.getPropPUB(WDKConstant.PROP_cfg_todo_enable);
	        // 流程挂起，通知到统一待办库，关闭待办
	        if ("1".equals(isenable)) {
	            if (todos != null) {
	                String todoClassName = WDK.getPropPUB(WDKConstant.PROP_cfg_handler_unittodo);
	                if (todoClassName != null && !"".equals(todoClassName)) {
	                    try {
	                        BaseUnitTodo but = (BaseUnitTodo) Class.forName(todoClassName).newInstance();
	                        if (but != null) {
	                            for (bean_todo todo : todos) {
	                                String todoStatus = todo.getStatus();
	                                if (WFConstant.TODO_Status_wait.equals(todoStatus) || WFConstant.TODO_Status_recover.equals(todoStatus)) {
	                                    but.closeTodo(conb, todo, WDK.getDateTime(), null, closeType, false, pushtype);
	                                }
	                            }
	                        }
	                    } catch (Exception e) {
	                        logger.errorWithNoException(e.getMessage());
	                    }
	                }
	            }
	        }
		}else{
			logger.debug("流程引擎事务失败，不推送统一待办。");
		}
	}

}
