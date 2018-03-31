package com.longj.platform.busi.wdk.mq.client;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.wdk.WDK;
import org.wdk.core.util.Base64;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;

import wql.WQLNames;

import com.ibm.mq.MQC;
import com.ibm.mq.MQEnvironment;
import com.ibm.mq.MQException;
import com.ibm.mq.MQGetMessageOptions;
import com.ibm.mq.MQMessage;
import com.ibm.mq.MQPutMessageOptions;
import com.ibm.mq.MQQueue;
import com.ibm.mq.MQQueueManager;
import com.ibm.mq.constants.MQConstants;
import com.longj.platform.busi.wdk.mq.BaseMQ;
import com.longj.platform.busi.wdk.mq.MQServerBean;
import com.longj.platform.pb.util.WQLUtil;

public class MQClient {
	private MQServerBean mqServerBean;
	  //定义队列管理器和队列的名称   
	private String hostname;				//MQ服务器的IP地址，类似："10.24.1.180"
	private String channel;					//服务器连接的通道，类似："S_FENGLB"
	private int ccsid;						//服务器MQ服务使用的编码1381代表GBK、1208代表UTF(Coded Character Set Identifier:CCSID)
	private int port;						//MQ端口，类似：1414
	private String userID;
	private String password;
	
    private String qmname;    				//MQ的队列管理器名称，类似："QM_FENGLB"
    private String qname_get;  				//MQ远程传输队列的名称，类似："testQ"
    private String qname_put;				//MQ远程发送队列的名称
    private MQQueueManager qmgr;   			//MQ操作管理对象
    
    private ArrayList<String> propNames;
    private BaseMQ bmq;						//mq消息处理事件接口
    
    private Thread mtd;						//监视线程
    private Thread td ;						//工作线程
    
    private boolean debug = false;			//调试模式，调试模式下收到一条消息后服务就终止
    private int count = 0;						//接收到的消息数
    
    /**
     * 是否调试模式，调试模式下收到一条消息后服务就终止
     * @return
     */
    public boolean isDebug() {
		return debug;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}
	
	public MQClient(MQServerBean mqServerBean,ArrayList<String> propNames,BaseMQ bmq){
		try {
			this.mqServerBean = mqServerBean;
	        //设置环境:   
	        //MQEnvironment中包含控制MQQueueManager对象中的环境的构成的静态变量，MQEnvironment的值的设定会在MQQueueManager的构造函数加载的时候起作用，   
	        //因此必须在建立MQQueueManager对象之前设定MQEnvironment中的值.   
			this.hostname = mqServerBean.getHostname();
			this.channel = mqServerBean.getChannel();
			this.ccsid = Integer.parseInt(mqServerBean.getCcsid());
			this.port = Integer.parseInt(mqServerBean.getPort());
			this.userID = (mqServerBean.getUserid()==null?"":mqServerBean.getUserid());
			this.password = (mqServerBean.getPwd()==null?"":mqServerBean.getPwd());
			this.bmq = bmq;
			this.propNames = propNames;
			if(null==this.propNames){
				this.propNames = new ArrayList<String>();
			}
			
	        MQEnvironment.hostname = this.hostname;
	        MQEnvironment.channel = this.channel;
	        MQEnvironment.CCSID = this.ccsid;
	        MQEnvironment.port = this.port;
	        if(!"".equals(this.userID)){
	        	MQEnvironment.userID = this.userID;
	        }
	        if(!"".equals(this.password)){
	        	MQEnvironment.password = this.password;
	        }
	        
	        this.qmname = mqServerBean.getQmname();
	        this.qname_get = mqServerBean.getQname_get();
	        this.qname_put = mqServerBean.getQname_put();
          
        	this.bmq.initMQClient(this);
        	
//        	HashMap<String,String> param = new HashMap<String, String>();
//			param.put("MSGPROPERTY", "mdm_log");
//			param.put("sys", "zyjx_all");
//        	this.sendMessage("<?xml version=\"1.0\" encoding=\"UTF-8\"?><DATASET><HEAD><MSG_ID>HRM_20150422094001001_0001</MSG_ID><NAME>主数据管理系统推送发布或停用数据</NAME><SOURCE>ZYJX</SOURCE><TARGET>MDM</TARGET><OPERATION_IDNY>UPDATE</OPERATION_IDNY><MSG_TYPE>3</MSG_TYPE><MDM_IDNY>ORGN</MDM_IDNY><RT_CODE>002</RT_CODE><RT_DESC>处理成功</RT_DESC><WS_MARK></WS_MARK><WS_METHOD></WS_METHOD><WS_DESC></WS_DESC><CURR_TIME>2015-04-22 09:46:29</CURR_TIME><AREA_CODE>hz</AREA_CODE><ACCP_MDM_QTY>1</ACCP_MDM_QTY></HEAD><CONDITION /><DATA /></DATASET>",param);
        	
	        
        	if("".equals(mqServerBean.getRunmodel()) || "1".equals(mqServerBean.getRunmodel())){
        		//自动轮询模式，启动监视线程
    	        mtd = new Thread(new Runnable(){
    	            public void run(){
    	                try{
    	                	System.out.println("监视线程启动！");   	                	
    	                	//启动工作线程
    	                	MQProcess mqget = new MQProcess(MQClient.this);
    	                	td = new Thread(mqget);
                			td.start();
                			
    	                	//监视工作线程
    	                	while(true){
    	                		System.out.println("监视线程运行中……");   
    	                		if (td.isAlive()==false){
    	                			if(td!=null){
    	                				td.interrupt();
    	                				td=null;
    	        					}
    	                			mqget = new MQProcess(MQClient.this);
    	                			td = new Thread(mqget);
    	                			td.start();
    	                		}
    	                		
    	                		//线程间隔
    	        	    		Thread.sleep(5*60*1000);
    	                	}
    	                }catch (Exception e) {
    						e.printStackTrace();
    					}
    	            }
    	        });
    	        mtd.start();
        	}

	                	
		} catch (Exception e) {   
           // TODO Auto-generated catch block   
           System.out.println("初使化MQ出错");   
           e.printStackTrace();   
       }
	}

//	public MQClient(String hostname,String channel,int ccsid,int port,String qmname,String qname_get,String qname_put,ArrayList<String> propNames,BaseMQ bmq){
//    	this(hostname,channel,ccsid,port,"","",qmname,qname_get,qname_put,propNames,bmq);
//    }
	
//	public MQClient(String hostname,String channel,int ccsid,int port,String userID,String password,String qmname,String qname_get,String qname_put,ArrayList<String> propNames,BaseMQ bmq){
//		try {
//	        //设置环境:   
//	        //MQEnvironment中包含控制MQQueueManager对象中的环境的构成的静态变量，MQEnvironment的值的设定会在MQQueueManager的构造函数加载的时候起作用，   
//	        //因此必须在建立MQQueueManager对象之前设定MQEnvironment中的值.   
//			this.hostname = hostname;
//			this.channel = channel;
//			this.ccsid = ccsid;
//			this.port = port;
//			this.userID = userID;
//			this.password = password;
//			this.bmq = bmq;
//			this.propNames = propNames;
//			if(null==this.propNames){
//				this.propNames = new ArrayList<String>();
//			}
//			
//	        MQEnvironment.hostname = this.hostname;
//	        MQEnvironment.channel = this.channel;
//	        MQEnvironment.CCSID = this.ccsid;
//	        MQEnvironment.port = this.port;
//	        if(!"".equals(this.userID)){
//	        	MQEnvironment.userID = this.userID;
//	        }
//	        if(!"".equals(this.password)){
//	        	MQEnvironment.password = this.password;
//	        }
//	        
//	        this.qmname = qmname;
//	        this.qname_get = qname_get;
//	        this.qname_put = qname_put;
//          
//        	this.bmq.initMQClient(this);
//        	
////        	HashMap<String,String> param = new HashMap<String, String>();
////			param.put("MSGPROPERTY", "mdm_log");
////			param.put("sys", "zyjx_all");
////        	this.sendMessage("<?xml version=\"1.0\" encoding=\"UTF-8\"?><DATASET><HEAD><MSG_ID>HRM_20150422094001001_0001</MSG_ID><NAME>主数据管理系统推送发布或停用数据</NAME><SOURCE>ZYJX</SOURCE><TARGET>MDM</TARGET><OPERATION_IDNY>UPDATE</OPERATION_IDNY><MSG_TYPE>3</MSG_TYPE><MDM_IDNY>ORGN</MDM_IDNY><RT_CODE>002</RT_CODE><RT_DESC>处理成功</RT_DESC><WS_MARK></WS_MARK><WS_METHOD></WS_METHOD><WS_DESC></WS_DESC><CURR_TIME>2015-04-22 09:46:29</CURR_TIME><AREA_CODE>hz</AREA_CODE><ACCP_MDM_QTY>1</ACCP_MDM_QTY></HEAD><CONDITION /><DATA /></DATASET>",param);
//        	
//	        //启动监视线程
//	        mtd = new Thread(new Runnable(){
//	            public void run(){
//	                try{
//	                	System.out.println("监视线程启动！");   	                	
//	                	//启动工作线程
//	                	MQProcess mqget = new MQProcess(MQClient.this);
//	                	td = new Thread(mqget);
//            			td.start();
//            			
//	                	//监视工作线程
//	                	while(true){
//	                		System.out.println("监视线程运行中……");   
//	                		if (td.isAlive()==false){
//	                			if(td!=null){
//	                				td.interrupt();
//	                				td=null;
//	        					}
//	                			mqget = new MQProcess(MQClient.this);
//	                			td = new Thread(mqget);
//	                			td.start();
//	                		}
//	                		
//	                		//线程间隔
//	        	    		Thread.sleep(5*60*1000);
//	                	}
//	                }catch (Exception e) {
//						e.printStackTrace();
//					}
//	            }
//	        });
//	        mtd.start();
//	                	
//		} catch (Exception e) {   
//           // TODO Auto-generated catch block   
//           System.out.println("初使化MQ出错");   
//           e.printStackTrace();   
//       }
//	}
	
	/**
	 * 查询消息队列消息数
	 * @return
	 * @throws Exception
	 */
	public int getMessageCount() throws Exception{
		 /*关闭了就重新打开*/
		if(this.qmgr==null || (this.qmgr!=null && !this.qmgr.isConnected())){
			this.qmgr = new MQQueueManager(this.qmname);
		}
		 
		synchronized (this.qmgr) {
			int msgcount = 0;
		   	try{    		 
				 //设置将要连接的队列属性
			     // Note. The MQC interface defines all the constants used by the WebSphere MQ Java programming interface 
			     //(except for completion code constants and error code constants).
			     //MQOO_INPUT_AS_Q_DEF:Open the queue to get messages using the queue-defined default.
			     //MQOO_OUTPUT:Open the queue to put messages.
				 int openOptions = MQC.MQOO_INPUT_AS_Q_DEF | MQC.MQOO_OUTPUT;
		
		         MQQueue queue = this.qmgr.accessQueue(this.qname_get, openOptions); 
		         msgcount = queue.getCurrentDepth();
		         queue.close();
			}catch (MQException ex) {
				 if(2==ex.completionCode&&2033==ex.reasonCode){
					 
				 }else{
					 System.out.println("A WebSphere MQ error occurred : Completion code " + ex.completionCode + " Reason code " + ex.reasonCode); 
				 }
		    }catch(Exception ex){
		         ex.printStackTrace();
		    }finally{
		    	 try {
		    		 this.qmgr.disconnect();
		    	 }catch (MQException e) {
					e.printStackTrace();
		    	 }
		    }
		   	return msgcount;
		}
	}
	
	
	/**
     * 从队列中去获取消息，如果队列中没有消息，就会发生异常，不过没有关系，有TRY...CATCH，如果是第三方程序调用方法，如果无返回则说明无消息
     * 第三方可以将该方法放于一个无限循环的while(true){...}之中，不需要设置等待，因为在该方法内部在没有消息的时候会自动等待。
     * @return
     */
	public int getMessageJilinCount() throws Exception{
		
		if(this.qmgr==null || (this.qmgr!=null && !this.qmgr.isConnected())){
			 this.qmgr = new MQQueueManager(this.qmname);
		}
			
	   	 synchronized (this.qmgr) {	 
	   		 
	   		int msgcount = 0;
	   		 try{    
	   			 
	   			 // 建立MQ客户端调用上下文环境
	       		 MQEnvironment.hostname = hostname; // 公文传输服务器ip地址
	       		 MQEnvironment.port = port; // 公文传输服务器MQ服务端口
	       		 MQEnvironment.CCSID = ccsid; // 公文传输服务器MQ服务使用的编码
	       		 MQEnvironment.channel = channel; // 服务器连接通道名
	       		 MQEnvironment.userID = userID; // MQ服务用户名
	       		 MQEnvironment.password = password;
	
				// 连接队列管理器
				/*int openOptions = MQC.MQOO_INPUT_AS_Q_DEF
						| MQC.MQOO_FAIL_IF_QUIESCING
						| MQC.MQOO_BROWSE
						| MQC.MQOO_INQUIRE;*/
				int openOptions = MQC.MQOO_INPUT_AS_Q_DEF; //签收后能接收				
					
				// 打开MQ队列
				MQQueue q = this.qmgr.accessQueue(this.qname_get, openOptions);
				
				MQGetMessageOptions mgo = new MQGetMessageOptions();
				mgo.options |= MQC.MQGMO_NO_WAIT;

				MQMessage msg = new MQMessage();

				msgcount = q.getCurrentDepth();
				
				// 关闭队列
				q.close();
	   		 }catch (MQException ex) { 
	   			 if(2==ex.completionCode&&2033==ex.reasonCode){
	   				 
	   			 }else{
	   				 System.out.println("A WebSphere MQ error occurred : Completion code " + ex.completionCode + " Reason code " + ex.reasonCode); 
	   			 }
	   		 }catch(Exception ex){
	   			 ex.printStackTrace();
	   		 }finally{
	   			 try {
	   				 this.qmgr.disconnect();
	   			 } catch (MQException e) {
	   				 e.printStackTrace();
	   			 }
	   		 }
	   		 return  msgcount;
	   	 }
    }

	/**
	 * MQ接收消息
	 * @return 返回本次操作接收到的消息数
	 * @throws Exception
	 */
	public int getMessage() throws Exception{
		//判断运行模式
		if(!"2".equals(mqServerBean.getRunmodel())){
			throw new Exception("MQ服务"+mqServerBean.getServer_code()+"运行模式为"+mqServerBean.getRunmodel()+",只有模式2才允许手工接收消息！");
		}
		
		boolean getmsg = true;
		int msgcount = 0;
		//循环接收消息
		while(getmsg){
			getmsg = getMessage_core();
			if(getmsg){
				msgcount++;
			}
		}
		return msgcount;
	}
	
	/**
	 * MQ接收消息(吉林专用)
	 * @return 返回本次操作接收到的消息数
	 * @throws Exception
	 */
	public int sendMessageJilin() throws Exception{
		//判断运行模式
		if(!"2".equals(mqServerBean.getRunmodel())){
			throw new Exception("MQ服务"+mqServerBean.getServer_code()+"运行模式为"+mqServerBean.getRunmodel()+",只有模式2才允许手工接收消息！");
		}
		
		boolean getmsg = true;
		int msgcount = 0;
		//循环接收消息
		while(getmsg){
			getmsg = getMessage_core_jilin();
			if(getmsg){
				msgcount++;
			}
		}
		return msgcount;
	}
	
     /**
      * MQ发送消息
      * @param message
      * @return
      */
     public boolean sendMessage(String message,HashMap<String,String> param){
    	 boolean isSuccess = false;
    	 try{	
    		 //设置将要连接的队列属性
    	     // Note. The MQC interface defines all the constants used by the WebSphere MQ Java programming interface 
    	     //(except for completion code constants and error code constants).
    	     //MQOO_INPUT_AS_Q_DEF:Open the queue to get messages using the queue-defined default.
    	     //MQOO_OUTPUT:Open the queue to put messages.
    		 /*目标为远程队列，所有这里不可以用MQOO_INPUT_AS_Q_DEF属性*/
    		 //int openOptions = MQC.MQOO_INPUT_AS_Q_DEF | MQC.MQOO_OUTPUT;
    		 /*以下选项可适合远程队列与本地队列*/
    		 int openOptions = MQC.MQOO_OUTPUT | MQC.MQOO_FAIL_IF_QUIESCING;
	         //连接队列 
	         //MQQueue provides inquire, set, put and get operations for WebSphere MQ queues. 
	         //The inquire and set capabilities are inherited from MQManagedObject. 
    		 //关闭了就重新打开
    		if(this.qmgr==null || (this.qmgr!=null && !this.qmgr.isConnected())){
 				this.qmgr = new MQQueueManager(this.qmname);
 			}
			MQQueue queue = this.qmgr.accessQueue(this.qname_put, openOptions); 	        
	         //定义一个简单的消息
	         MQMessage putMessage = new MQMessage(); 
	         putMessage.format = MQConstants.MQFMT_STRING;
	         putMessage.characterSet = ccsid;  //要支持多种编码，不能写死
	         
	         //将数据放入消息缓冲区
	         putMessage.writeString(message);	
	         
	         Set<String> keySet = param.keySet();
	         for(Iterator<String> it = keySet.iterator();it.hasNext();){
	        	 String key = it.next();
	        	 String value = param.get(key);
	        	 putMessage.setStringProperty(key, value);
	         }
	         
	         //设置写入消息的属性（默认属性）
	         MQPutMessageOptions pmo = new MQPutMessageOptions();	        
	         //将消息写入队列 
	         queue.put(putMessage,pmo); 
	         queue.close();
	         isSuccess = true;
	         
    	 }catch (MQException ex) { 
             System.out.println("A WebSphere MQ error occurred : Completion code "  + ex.completionCode + " Reason code " + ex.reasonCode); 
             ex.printStackTrace();
             isSuccess = false;
         }catch (IOException ex) { 
             System.out.println("An error occurred whilst writing to the message buffer: " + ex); 
             isSuccess = false;
         }catch(Exception ex){
             ex.printStackTrace();
             isSuccess = false;
         }finally{
        	 try {
        		 this.qmgr.disconnect();
 			} catch (MQException e) {
 				e.printStackTrace();
 			}
 			return isSuccess;
          }
     }
     
     
     /**
      * MQ发送消息（吉林版本）
      * @param message
      * @return
      */
     public boolean sendMessageJilin(String message,HashMap<String,String> param){
    	 boolean isSuccess = false;
    	 try{	
    		 
    		 // 建立MQ客户端调用上下文环境
    		 MQEnvironment.hostname = hostname; // 公文传输服务器ip地址
    		 MQEnvironment.port = port; // 公文传输服务器MQ服务端口
    		 MQEnvironment.CCSID = ccsid; // 公文传输服务器MQ服务使用的编码
    		 MQEnvironment.channel = channel; // 服务器连接通道名
    		 MQEnvironment.userID = userID; // MQ服务用户名
    		 MQEnvironment.password = password;

    		 // 连接队列管理器
    		 int openOptions = MQC.MQOO_OUTPUT | MQC.MQOO_FAIL_IF_QUIESCING;
    		 if(this.qmgr==null || (this.qmgr!=null && !this.qmgr.isConnected())){
    			 this.qmgr = new MQQueueManager(this.qmname);
    		 }
    		 // 打开MQ队列
    		 MQQueue q = this.qmgr.accessQueue(this.qname_put, openOptions);
    		 //FileInputStream fins = new FileInputStream("D:/work_gbk/tiegcfg/resource/national/upload/2016/201609/20160910124502701/20160910124502701_upload.xml");
    		 //上传前判断文档内容是否超过3M，超过3M就不允许上报
    		 //byte[] data = new byte[fins.available()];
    		 //fins.read(data);
    		 //fins.close();
    		 MQMessage msg = new MQMessage();
    		 msg.write(message.getBytes("UTF-8"));
    		 // 放入消息
    		 q.put(msg);
    		 // 关闭队列
    		 q.close();	         
	         isSuccess = true;
	         
    	 }catch (MQException ex) { 
             System.out.println("A WebSphere MQ error occurred : Completion code "  + ex.completionCode + " Reason code " + ex.reasonCode); 
             ex.printStackTrace();
             isSuccess = false;
         }catch (IOException ex) { 
             System.out.println("An error occurred whilst writing to the message buffer: " + ex); 
             isSuccess = false;
         }catch(Exception ex){
             ex.printStackTrace();
             isSuccess = false;
         }finally{
        	 try {
        		 this.qmgr.disconnect();
 			} catch (MQException e) {
 				e.printStackTrace();
 			}
 			return isSuccess;
          }
     }
     
     /**
      * 接收消息核心
      * @return 是否收到消息
      */
     private boolean getMessage_core(){
    	 boolean getmsg = false;
    	 if(debug && count>0){
  			//调试模型下，收到消息后则不在接收消息
  			System.out.println("MQ调试模式,已接收到消息，不再接收新消息！");
    	 }else{
	     		//取MQ消息
	    		HashMap<String,String> map = accessQueue();
//	    		测试
//	        	HashMap<String,String> map = new HashMap<String, String>();
//				map.put("MSGPROPERTY", "mdm_log");
//				map.put("sys", "zyjx_all");
//	        	map.put("message","<?xml version=\"1.0\" encoding=\"UTF-8\"?><DATASET><HEAD><MSG_ID>HRM_20150422094001001_0001</MSG_ID><NAME>主数据管理系统推送发布或停用数据</NAME><SOURCE>ZYJX</SOURCE><TARGET>MDM</TARGET><OPERATION_IDNY>UPDATE</OPERATION_IDNY><MSG_TYPE>3</MSG_TYPE><MDM_IDNY>ORGN</MDM_IDNY><RT_CODE>002</RT_CODE><RT_DESC>处理成功</RT_DESC><WS_MARK></WS_MARK><WS_METHOD></WS_METHOD><WS_DESC></WS_DESC><CURR_TIME>2015-04-22 09:46:29</CURR_TIME><AREA_CODE>hz</AREA_CODE><ACCP_MDM_QTY>1</ACCP_MDM_QTY></HEAD><CONDITION /><DATA /></DATASET>");
	    		//判断是否取到消息
	    		if(!map.isEmpty()){
	    			getmsg = true;
	    			count=1;
		    		//保存接收到的消息
		    		saveMessage(map);
		    		//调用业务处理类处理消息
		    		bmq.getMessage(map);
		    		//如果是调试模式收到消息后退出
	    		}
    	 }
    	 return getmsg;
     }
     
     
     
     
     /**
      * 接收消息核心
      * @return 是否收到消息
      */
     private boolean getMessage_core_jilin() throws Exception{
    	 boolean getmsg = false;
    	 if(debug && count>0){
  			//调试模型下，收到消息后则不在接收消息
  			System.out.println("MQ调试模式,已接收到消息，不再接收新消息！");
    	 }else{
	     		//取MQ消息
	    		HashMap<String,String> map = accessQueueJilin();
	    		//判断是否取到消息
	    		if(!map.isEmpty()){
	    			getmsg = true;
	    			count=1;
		    		//保存接收到的消息
		    		saveMessage(map);
		    		//调用业务处理类处理消息
		    		bmq.getMessage(map);
		    		//如果是调试模式收到消息后退出
	    		}
    	 }
    	 return getmsg;
     }

     
     /**
      * 从队列中去获取消息，如果队列中没有消息，就会发生异常，不过没有关系，有TRY...CATCH，如果是第三方程序调用方法，如果无返回则说明无消息
      * 第三方可以将该方法放于一个无限循环的while(true){...}之中，不需要设置等待，因为在该方法内部在没有消息的时候会自动等待。
      * @return
      */
     private HashMap<String,String> accessQueue(){
    	 synchronized (this.qmgr) {
	    	 HashMap<String,String> map = new HashMap<String, String>(); 
	    	 try{    		 
	    		 //设置将要连接的队列属性
	    	     // Note. The MQC interface defines all the constants used by the WebSphere MQ Java programming interface 
	    	     //(except for completion code constants and error code constants).
	    	     //MQOO_INPUT_AS_Q_DEF:Open the queue to get messages using the queue-defined default.
	    	     //MQOO_OUTPUT:Open the queue to put messages.
	    		 //int openOptions = MQC.MQOO_INPUT_AS_Q_DEF | MQC.MQOO_OUTPUT;
	    		 int openOptions = MQC.MQOO_INPUT_AS_Q_DEF
	 						| MQC.MQOO_FAIL_IF_QUIESCING
	 						| MQC.MQOO_BROWSE
	 						| MQC.MQOO_INQUIRE;
		    	 MQMessage retrieve = new MQMessage();
		    	 //设置取出消息的属性（默认属性）
		    	 //Set the put message options.（设置放置消息选项） 
	    		 MQGetMessageOptions gmo = new MQGetMessageOptions(); 
	    		 /*gmo.options = gmo.options + MQC.MQGMO_SYNCPOINT;//Get messages under sync point control（在同步点控制下获取消息） 
	    		 gmo.options = gmo.options + MQC.MQGMO_WAIT;  // Wait if no messages on the Queue（如果在队列上没有消息则等待） 
	    		 gmo.options = gmo.options + MQC.MQGMO_FAIL_IF_QUIESCING;// Fail if Qeue Manager Quiescing（如果队列管理器停顿则失败） 
	    		 gmo.waitInterval = 1000 ;  // Sets the time limit for the wait.（设置等待的毫秒时间限制） 
	    		 */	    		 
	    		 gmo.options |= MQC.MQGMO_NO_WAIT;
	    		 /*关闭了就重新打开*/
	    		 if(this.qmgr==null || (this.qmgr!=null && !this.qmgr.isConnected())){
	 				this.qmgr = new MQQueueManager(this.qmname);
	 			 }
		         MQQueue queue = this.qmgr.accessQueue(this.qname_get, openOptions); 
		         
		         //retrieve.format = MQConstants.MQFMT_STRING;
		         //retrieve.characterSet = 1208;
		         
		         // 从队列中取出消息
		         queue.get(retrieve, gmo);
		         System.out.println("getMessageLength="+retrieve.getMessageLength());
		         String message = retrieve.readStringOfByteLength(retrieve.getDataLength());
		         map.put("message", message);
		         
		         for(Iterator<String> it = this.propNames.iterator();it.hasNext();){
		        	 String key = it.next();
		        	 String value = (String) retrieve.getObjectProperty(key);
		        	 map.put(key, value);
		         }
		         System.out.println("The message is: " + message);
		         queue.close();
	    	 }catch (MQException ex) { 
	    		 if(2==ex.completionCode&&2033==ex.reasonCode){
	    			 
	    		 }else{
	    			 System.out.println("A WebSphere MQ error occurred : Completion code " + ex.completionCode + " Reason code " + ex.reasonCode); 
	    		 }
	         }catch (IOException ex) { 
	             System.out.println("An error occurred whilst writing to the message buffer: " + ex); 
	         }catch(Exception ex){
	             ex.printStackTrace();
	         }finally{
	        	 try {
	        		 this.qmgr.disconnect();
				} catch (MQException e) {
					e.printStackTrace();
				}
	         }
	    	 return map;
    	 }
     }
     
     
     /**
      * 从队列中去获取消息，如果队列中没有消息，就会发生异常，不过没有关系，有TRY...CATCH，如果是第三方程序调用方法，如果无返回则说明无消息
      * 第三方可以将该方法放于一个无限循环的while(true){...}之中，不需要设置等待，因为在该方法内部在没有消息的时候会自动等待。
      * @return
      */
     private HashMap<String,String> accessQueueJilin() throws Exception{
    	 if(this.qmgr==null || (this.qmgr!=null && !this.qmgr.isConnected())){
 			 this.qmgr = new MQQueueManager(this.qmname);
    	 }
    	 synchronized (this.qmgr) {
    		 HashMap<String,String> map = new HashMap<String, String>(); 
    		 try{    
    			 
    			 // 建立MQ客户端调用上下文环境
        		 MQEnvironment.hostname = hostname; // 公文传输服务器ip地址
        		 MQEnvironment.port = port; // 公文传输服务器MQ服务端口
        		 MQEnvironment.CCSID = ccsid; // 公文传输服务器MQ服务使用的编码
        		 MQEnvironment.channel = channel; // 服务器连接通道名
        		 MQEnvironment.userID = userID; // MQ服务用户名
        		 MQEnvironment.password = password;
        		 
        		 //测试单个国家局文件接收，可行
        		 //MQQueueManager qMgr = new MQQueueManager("");
        		 int openOptions = MQC.MQOO_INPUT_AS_Q_DEF
  						| MQC.MQOO_FAIL_IF_QUIESCING
  						| MQC.MQOO_BROWSE
  						| MQC.MQOO_INQUIRE; 
        		 //MQQueue q = qMgr.accessQueue("LOCAL_DT_OA_INBOX", openOptions);
        		 MQQueue q = this.qmgr.accessQueue(this.qname_get, openOptions);
        		 MQMessage mqMsg = new MQMessage();
        		 MQGetMessageOptions mqGetMessageOptions = new MQGetMessageOptions();
        		 q.get(mqMsg, mqGetMessageOptions);
        		 byte[] xmlData = new byte[mqMsg.getDataLength()];
        		 mqMsg.readFully(xmlData);
        		 String message = new String(xmlData, "UTF-8");  
        		 map.put("message", message);        		 
        		 System.out.println("============xmldata============="+message);

 				 // 连接队列管理器（通道有就能接收）
        		 /*int openOptions = MQC.MQOO_INPUT_AS_Q_DEF
 						| MQC.MQOO_FAIL_IF_QUIESCING
 						| MQC.MQOO_BROWSE
 						| MQC.MQOO_INQUIRE; 	
        		 
        		 //int openOptions = MQC.MQOO_INPUT_AS_Q_DEF; //签收后能接收
        		 
        		 // 打开MQ队列
        		 MQQueue q = this.qmgr.accessQueue(this.qname_get, openOptions);
        		 MQMessage msg = new MQMessage();

        		 boolean isFirstGetMsg = true;
        		 if (q.getCurrentDepth() > 0) {
        			 while (q.getCurrentDepth() > 0 && (msg = fetchOneMsg(q, isFirstGetMsg)) != null) {
        				 isFirstGetMsg = false;
        				 byte[] xmlData = new byte[msg.getDataLength()];
        				 msg.readFully(xmlData);
 						
        				 //下面这个很重要，要不要乱码
        				 String message = new String(xmlData, "UTF-8");  
        				 map.put("message", message);     
        				 System.out.println("============xmldata============="+message);
        			 }
        		 }*/
        		 // 关闭队列
        		 q.close();
    		 }catch (MQException ex) { 
    			 if(2==ex.completionCode&&2033==ex.reasonCode){
    				 
    			 }else{
    				 System.out.println("A WebSphere MQ error occurred : Completion code " + ex.completionCode + " Reason code " + ex.reasonCode); 
    			 }
    		 }catch (IOException ex) { 
    			 System.out.println("An error occurred whilst writing to the message buffer: " + ex); 
    		 }catch(Exception ex){
    			 ex.printStackTrace();
    		 }finally{
    			 try {
    				 this.qmgr.disconnect();
    			 } catch (MQException e) {
    				 e.printStackTrace();
    			 }
    		 }
    		 return map;
    	 }
     }
     
     /**
 	 * 从队列中取出一个消息
 	 * @param q  队列名称
 	 * @return
 	 * @throws Exception
 	 */ 
 	private static MQMessage fetchOneMsg(MQQueue q, boolean isFirstGetMsg) throws Exception {
 		MQGetMessageOptions mgo = new MQGetMessageOptions();
 		mgo.options = MQC.MQGMO_NO_WAIT;
 		MQMessage msg = new MQMessage();
 		try {
 			// 获取消息
 			q.get(msg, mgo);
 		} catch (MQException e) {
 			if (e.reasonCode != 2033) {
 				e.printStackTrace();
 			}
 			return null;
 		}
 		return msg;
 	}

     /**
      * 将接收到的消息保存到数据库中，做痕迹保留
      * @param map
      */
     private void saveMessage(HashMap<String,String> map){
    	 try{
    		 String[] seqno_arr = new String[map.size()];
    		 String[] msgkey_arr = new String[map.size()];
    		 String[] msgvalue_arr = new String[map.size()];
    		 int seq = 0;
    		 Iterator<Entry<String, String>> it = map.entrySet().iterator();
    		 while (it.hasNext()) {
    			 Entry<String, String> entry  = it.next();
    			 seqno_arr[seq] = String.valueOf(seq+1);
    			 msgkey_arr[seq] = entry.getKey();
    			 msgvalue_arr[seq] = Base64.encode2String(entry.getValue());
    			 seq++;
    		 }
    		 
    		 String server_uuid = this.bmq.getServer_uuid();
    		 if("".equals(server_uuid)) server_uuid = "00000000000000000000000000000000";
    		 
    		 ResultBean rb = WQLUtil.getWQL(WQLNames.UWDKMQ0002)
    		 .addParam("msg_uuid", WDK.getUUID())
    		 .addParam("server_uuid", server_uuid)
    		 .addParam("receivetime", WDK.getDateTime())
    		 .addParam("dtlcount", String.valueOf(map.size()))
    		 .addParam("seqno_arr", seqno_arr)
    		 .addParam("msgkey_arr", msgkey_arr)
    		 .addParam("msgvalue_arr", msgvalue_arr)
    		 .process();
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
    	 }catch (Exception e) { 
    		 System.out.print("MQ消息痕迹保留错误："+e.getMessage());
    		 e.printStackTrace();
    	 }
     }
     
     public static void main(String args[]) {
    	 /*下面两个方法可同时使用，也可以单独使用*/
//    	 sendMessage("this is a test");
    	 //getMessage();
     }

     
     private class MQProcess implements Runnable{
    	 private MQClient mqClient;
    	 
    	 public MQProcess(MQClient mqClient){
    		 this.mqClient = mqClient;
    	 }
    	 
    	 @Override
    	 public void run() {
	   	 	try{
	            //定义并初始化队列管理器对象并连接    
	            //MQQueueManager可以被多线程共享，但是从MQ获取信息的时候是同步的，任何时候只有一个线程可以和MQ通信。   
	   	 		System.out.println("工作线程启动！");   
	   	 	
	        	this.mqClient.qmgr = new MQQueueManager(this.mqClient.qmname);
	        	
	   	 		//开启无限循环，监听消息队列
	        	boolean getmsg = false;
		     	while(true){
		     		System.out.println("工作线程运行中："+this.mqClient.bmq.getServer_uuid());
		     		
		     		getmsg = this.mqClient.getMessage_core();
		     		
		     		//线程间隔
		     		if(getmsg==false){
			    		Thread.sleep(60*1000);
		     		}else{
		     			Thread.sleep(1000);
		     		}
		    	}
	   	 	} catch (Exception e) {   
	            // TODO Auto-generated catch block   
	            System.out.println("MQ服务工作线程运行出错："+e.getMessage());   
	            e.printStackTrace();   
	   	 	}
			
    	 }
     }
     


}
