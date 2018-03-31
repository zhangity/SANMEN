package com.longj.platform.busi.wdk.handler;


import org.wdk.core.base.BaseStart;
import org.wdk.core.util.uLogger;

import com.longj.platform.pb.msg.MSGSendJob;
import com.longj.products.ea.standard.bu.ws.impl.core.PacsSyncCore;


public class WDKStart extends BaseStart{
	private static uLogger logger = new uLogger(WDKStart.class.getName());
	@Override
	public void start() {
		try {
			boolean isok = false;
//			boolean isok = BDLCore.start();
//			if(isok){
//				logger.info("【TIEGStart】：BDL启动成功...");
//			}else{
//				logger.info("【TIEGStart】：BDL启动失败...");
//			}
			
//			isok = CAPDesigner.start();
//			 
//			if(isok){
//				logger.info("【TIEGStart】：CAPDesigner启动成功...");
//			}else{
//				logger.info("【TIEGStart】：CAPDesigner启动失败...");
//			}
			
			//MQ启动
//			isok = MQCore.start();  
//			if(isok){
//				logger.info("【TIEGStart】：MQ启动成功...");
//			}else{
//				logger.info("【TIEGStart】：MQ启动失败...");
//			}
			
//			//加载操作审计配置
//			isok = TIEGAduitOper.start();
//			if(isok){
//				logger.info("【TIEGStart】：操作审计启动成功...");
//			}else{
//				logger.info("【TIEGStart】：操作审计启动失败...");
//			}
			
			//统一消息初始化处理
			new MSGSendJob().init();
			
			//PACS同步接口处理
			PacsSyncCore.start();
			
		} catch (Exception e) {
			e.printStackTrace();
			logger.errorWithNoException("【HZOMStart】：BDL启动失败...");
		}
	}
}