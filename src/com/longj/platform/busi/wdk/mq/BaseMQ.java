package com.longj.platform.busi.wdk.mq;

import java.util.HashMap;

import com.longj.platform.busi.wdk.mq.client.MQClient;



/**
 * mq的处理函数接口句柄
 * @author Administrator
 *
 */
public abstract class BaseMQ {
	private String server_uuid = "";
	protected MQClient mqclient = null;
	
	
	
	public String getServer_uuid() {
		return server_uuid;
	}
	public void setServer_uuid(String server_uuid) {
		this.server_uuid = server_uuid;
	}
	public void initMQClient(MQClient mqclient){
		this.mqclient = mqclient;
	}
	/**
	 * 发送mq消息
	 * @param message
	 * @return
	 */
	public boolean sendMessage(String message,HashMap<String,String> param){
		boolean isSuccess = this.mqclient.sendMessage(message,param);
		return isSuccess;
	}
		
	abstract public void getMessage(HashMap<String,String> map);

}