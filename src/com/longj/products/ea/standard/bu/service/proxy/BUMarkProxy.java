package com.longj.products.ea.standard.bu.service.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import net.sf.json.JSONArray;

import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKEnvironment;

public class BUMarkProxy implements InvocationHandler {

	private Object target;

	public Object bind(Object target) {
		this.target = target;
		// 取得代理对象
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		// 执行方法
		result = method.invoke(target, args);
		if (result != null && result instanceof JSONArray) {
			WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();// 创建WDK环境
			WDKContext context = wdkEnv.getWDKContext();// new WDKContext();
			BUMarkHandler handler = new BUMarkHandler();
			if(target!=null){
				//
				if(method.getName().equalsIgnoreCase("saveExamFormList")||method.getName().equalsIgnoreCase("updateExamForm")){
					handler.setMarkArray((JSONArray) result);
					handler.setBill_type("1");//检查单
					if(context!=null){
						context.addTransHandler(handler);
					}
				}
			}
		}
		return result;
	}

}
