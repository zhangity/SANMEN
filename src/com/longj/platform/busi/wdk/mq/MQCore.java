package com.longj.platform.busi.wdk.mq;

import java.util.ArrayList;
import java.util.HashMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.WDK;
import org.wdk.WDKConstant;
import org.wdk.WDKCore;
import org.wdk.core.util.uLogger;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;

import com.longj.platform.busi.wdk.mq.client.MQClient;


import wql.WQLNames;


public class MQCore {
	private static uLogger logger = new uLogger(MQCore.class.getName());
	private static HashMap<String , MQClient> mqClientMap = new HashMap<String, MQClient>();

	public static boolean start() {
		boolean isSuccess = true;
		try{
			//开关参数判断
			String mqenable = WDK.getPropPUB(WDKConstant.PROP_cfg_mq_enable);
			if("1".equals(mqenable)){
				//调试参数
				String mqdebug = WDK.getPropPUB(WDKConstant.PROP_cfg_mq_debug);	
				
				//查询注册的MQ服务,并循环启动			
				ResultBean rb = WQL.getWO(WQLNames.QWDKMQ0001).addParam("isactive", "1").process();
				if(rb.isSuccess()==false){
					StringBuffer sf = new StringBuffer();
					ArrayList errlist = rb.getInfoError();
					for(int i=0;i<errlist.size();i++){
						ErrorBean errBean = (ErrorBean)errlist.get(i);
						sf.append(errBean.toString());
						sf.append("\n");
					}
					throw new Exception(sf.toString());
				}
				ArrayList<MQServerBean> rows = rb.getObjects(0, MQServerBean.class);
				for(int i=0;i<rows.size();i++){
					MQServerBean row = rows.get(i);
					String busiclass = row.getBusiclass();
					
					//查询参数
					ArrayList<String> propNames = null;
					rb = WQL.getWO(WQLNames.QWDKMQ0002).addParam("server_uuid", row.getServer_uuid()).process();
					if(rb.isSuccess()==false){
						StringBuffer sf = new StringBuffer();
						ArrayList errlist = rb.getInfoError();
						for(int j=0;j<errlist.size();j++){
							ErrorBean errBean = (ErrorBean)errlist.get(j);
							sf.append(errBean.toString());
							sf.append("\n");
						}
						throw new Exception(sf.toString());
					}
					JSONArray pararows = rb.getResultJSONArray(0);
					if(pararows.size()>0){
						propNames = new ArrayList<String>();
						for(int j=0;j<pararows.size();j++){
							JSONObject pararow = pararows.getJSONObject(j);
							propNames.add(pararow.getString("prop_value"));
						}
					}				
					
					if("".equals(busiclass)) new Exception("MQ服务："+row.getServer_name()+"["+row.getServer_code()+"]的MQ处理类为空！");				
					Class<?> c = Class.forName(busiclass);
					BaseMQ mq = (BaseMQ)c.newInstance();
					mq.setServer_uuid(row.getServer_uuid());//
					MQClient mqclient = new MQClient(row,propNames, mq);
					mqclient.setDebug("1".equals(mqdebug)?true:false);//设置调试开关
					mqClientMap.put( row.getServer_code(), mqclient);
				}
			}else{
				logger.debug("mq.enable开关值不为1，不启动MQ服务！");
			}
		}catch (Exception e) {
			e.printStackTrace();
			isSuccess = false;
		}
		return isSuccess;
	}

	/**
	 * 发送消息
	 * @param server_code
	 * @param message
	 * @param param
	 * @return
	 */
	public static boolean sendMessage(String server_code, String message,HashMap<String,String> param){
		if(mqClientMap.containsKey(server_code)){
			MQClient mqclient = mqClientMap.get(server_code);
			if("JLYC_OA_MQ".equalsIgnoreCase(server_code)){
				return mqclient.sendMessageJilin(message, param);
			}else{
				return mqclient.sendMessage(message, param);
			}
		}else{
			logger.errorWithNoException("无效的MQ服务："+server_code);
			return false;
		}
	}
	
	/**
	 * 获取消息队列的消息数
	 * @param server_code
	 * @return 返回消息队列中的消息数量
	 * @throws Exception
	 */
	public static int getMessageCount(String server_code) throws Exception{
		if(mqClientMap.containsKey(server_code)){
			MQClient mqclient = mqClientMap.get(server_code);
			logger.debug("MQ服务"+server_code+"执行获取消息队列消息数");
			int count = 0;			
			if("JLYC_OA_MQ".equalsIgnoreCase(server_code)){
				count = mqclient.getMessageJilinCount();
			}else{
				count = mqclient.getMessageCount();
			}
			logger.debug("MQ服务"+server_code+"消息数"+count);
			return count;
		}else{
			logger.errorWithNoException("无效的MQ服务："+server_code);
			throw new Exception("无效的MQ服务："+server_code);
		}
	}
	
	/**
	 * 接收消息，接收到的消息在服务对应消息处理类中被处理
	 * @param server_code
	 * @return 返回本次操作接收到的消息数
	 * @throws Exception
	 */
	public static int getMessage(String server_code) throws Exception{
		if(mqClientMap.containsKey(server_code)){
			MQClient mqclient = mqClientMap.get(server_code);
			logger.debug("MQ服务"+server_code+"执行接收消息");
			int count = 0;
			if("JLYC_OA_MQ".equalsIgnoreCase(server_code)){
				count = mqclient.sendMessageJilin();
			}else{
				count = mqclient.getMessage();
			}
			logger.debug("MQ服务"+server_code+"接收到消息数"+count);
			return count;
		}else{
			logger.errorWithNoException("无效的MQ服务："+server_code);
			throw new Exception("无效的MQ服务："+server_code);
		}
	}
}
