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

public class UnitTodoAddTransHandler implements WDKTransationHandler{
	private static WDKLogger logger = new WDKLogger(UnitTodoAddTransHandler.class.getName());
	private String pushtype;		//统一待办推送方式
	private List<bean_todo> todos;	//需求推送的待办列表
	
	
	public void addTodo(List<bean_todo> todos,String pushtype){
		this.todos = todos;
		this.pushtype = pushtype;
	}
	

	@Override
	public void transAfter(ConnectBean conb,boolean isSuccess) throws Exception {
		if(isSuccess){
			//事务提交成功才处理
			logger.debug("流程引擎事务成功，开始推送统一待办，待办数量：" + this.todos.size() + "，推送方式：" + this.pushtype);
			String isenable = WDK.getPropPUB(WDKConstant.PROP_cfg_todo_enable);
	        if ("1".equals(isenable)) {
	        	if (todos != null) {
		            // 需要同步到统一待办库的话，则进行同步
		            // 异步（同步）方式由具体业务代码类决定
		            String todoClassName = WDK.getPropPUB(WDKConstant.PROP_cfg_handler_unittodo);
		            if (todoClassName != null && !"".equals(todoClassName)) {
		                try {
		                    BaseUnitTodo but = (BaseUnitTodo) Class.forName(todoClassName).newInstance();
		                    for (bean_todo newtodo : todos) {
		                        if (but != null && newtodo.isParam_issynctodo()) {
		                            String todoStatus = newtodo.getStatus();
		                            if (WFConstant.TODO_Status_wait.equals(todoStatus) || WFConstant.TODO_Status_recover.equals(todoStatus)) {
		                                but.addTodo(conb, newtodo, pushtype); //最后变量原来是synctype，现在用pushtype
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
