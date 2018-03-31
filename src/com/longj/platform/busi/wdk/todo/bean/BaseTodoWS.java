package com.longj.platform.busi.wdk.todo.bean;

import java.lang.reflect.Method;

import org.wdk.WDK;
import org.wdk.core.base.BaseWS;

public abstract class BaseTodoWS extends BaseWS{
	public void _Transfer(String method,String instr){
		String todo_transfer = WDK.getNodeParam("todo_transfer");
		if(!"".equals(todo_transfer)){
			try {
				Class<?> c = Class.forName(todo_transfer);
				Method m = c.getMethod(method,String.class);
				if(null!=m){
					m.setAccessible(true);
					m.invoke(c.newInstance(),instr);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}