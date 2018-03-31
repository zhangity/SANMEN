package com.longj.products.ea.standard.bu.service.proxy;

import java.util.ArrayList;
import java.util.List;

import org.wdk.core.bean.WDKLogger;
import org.wdk.core.bean.WDKTransationHandler;
import org.wdk.module.wql.core.bean.ConnectBean;

import com.longj.products.ea.standard.bu.service.impl.BUAppointmentServiceImpl;

public class BULockHandler implements WDKTransationHandler {
	private static WDKLogger logger = new WDKLogger(
			BULockHandler.class.getName());// 日志操作类


	private List<String> keys;// 单据类型，检查单还是预约单

	@Override
	public void transAfter(ConnectBean conb, boolean isSuccess)
			throws Exception {
		if (keys != null && keys.size()>0) {
			for(String key:keys){
				BUAppointmentServiceImpl.unLock(key);
			}
			logger.info("成功移除锁装置");
		}
	}
	public void addKey(String key){
		if(keys==null){
			keys = new ArrayList<String>();
		}
		keys.add(key);
	}

	public List<String> getKeys() {
		return keys;
	}

	public void setKeys(List<String> keys) {
		this.keys = keys;
	}

	
	

}
