package com.longj.platform.pb.msg;



import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.wdk.WDK;
import org.wdk.core.base.BaseJob;
import org.wdk.core.util.uLogger;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.engine.object.WO;
import org.wdk.module.ws.WSProtocol;

import com.longj.platform.pb.detect.WSInvoke;
import com.longj.platform.pb.msg.bean.MSGBaseAdapter;
import com.longj.platform.pb.msg.bean.MSGBean;
import com.longj.platform.pb.msg.bean.MSGResultBean;
import com.longj.platform.pb.util.WQLUtil;

import wql.WQLNames;



public class MSGSendJob extends BaseJob{
	private static boolean isRunning = false;
	static uLogger logger = new uLogger(MSGSendJob.class.getName());
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		//为了保证在was下ws中能过处理事务，通过ws中转调用服务
		//参数包括：
		//			1、类名：指向本类，例如：com.nci.platform.msg.MSGSendJob
		//			2、方法名：指向本类需要处理的方法，例如：process
		//使用固定的WSInvoke.wssend方法进行转发
		if(isRunning){
			String instr = WSInvoke.getProtocol("com.nci.platform.msg.MSGSendJob", "process");
			WSInvoke.wssend(WSProtocol.getWSProtocol("ws.invoke", instr));
		}
	}
	
	/**
	 * 初始化加载
	 * 报所有状态为02的消息改为状态为01
	 * @throws Exception 
	 */
	public void init() throws Exception{
		WQLUtil.getWQL(WQLNames.UPFMSG0001)
			.addParam("flag", "33")
			.process();
		isRunning = true;
	}
	
	
	public void process() throws Exception{
		int nRetryCount = Integer.parseInt(WDK.getNodeParam("msg_cfg_sendcount"));
		int getCount = 5;//设置每次调度发送5条
		logger.info("===消息轮询检测...");
		
		//1、 查询出现在所有需要处理的内容，包含status=01：等待发送  和 03：发送失败，等待重发
		//  										02：已经被接收，正在处理
		long start = System.currentTimeMillis();
		WO wo =  WQL.getWO(WQLNames.QPFMSG0001)
								.addParam("flag", "1")
								.addParam("allstatus", "'01','03'");
		wo.setPage_PageStart(0);
		wo.setPage_PageRecordNum(getCount);
		wo.setPage_OrderByField(" createtime asc ");
		JSONArray jrows = wo.process().getResultJSONArray(0);
		if(null==jrows||0==jrows.size()){
			return;
		}
		logger.info("===查询耗时："+(System.currentTimeMillis()-start));
		
		
		int nLen = jrows.size();
		if(nLen>getCount){
			nLen = getCount;
		}
		String ids = "";
		for(int i=0;i<nLen;i++){
			JSONObject jrow = jrows.getJSONObject(i);
			String unmsg_uuid = jrow.has("unmsg_uuid")?jrow.getString("unmsg_uuid"):"";
			ids += "'"+unmsg_uuid+"',";
		}
		if(ids.length()>0){
			ids = ids.substring(0,ids.length()-1);
		}
		
		//2、通过数组将所有内容的状态更新为status=02：正在处理，防止其他线程读取
		WQLUtil.getWQL(WQLNames.UPFMSG0001)
			.addParam("flag", "31")
			.addParam("unmsg_uuids", ids)
			.addParam("updatetime", WDK.getDateTime())
			.process();
		
		//3、进行发送处理
		for(int i=0;i<nLen;i++){
			JSONObject jrow = jrows.getJSONObject(i);
			MSGBean mb = new MSGBean(jrow);
			MSGBaseAdapter adapter = MSG.getAdapter(mb);
			MSGResultBean mrb = adapter.process(mb);
			if(mrb.isSuccess()){
				//4、如果发送成功，则将当前记录移动到历史库，同时更改相关状态
				WQLUtil.getWQL(WQLNames.UPFMSG0001)
					.addParam("flag", "2")
					.addParam("unmsg_uuid", mb.getUnmsg_uuid())
					.addParam("status", MSG.STATUS_Success)
					.addParam("sendcount", mb.getSendcount())
					.addParam("movetime", WDK.getDateTime())
					.process();
			}else{
				//5、如果失败，则增加发送失败记录次数，然后判断当前记录是否需要移动到历史库，还是继续等待重发
				String sendCount = mb.getSendcount();
				int nSendCount = 0;
				if(!"".equals(sendCount)){
					nSendCount = Integer.parseInt(sendCount);
				}
				//重试次数加一
				nSendCount++;
				
				//判断重试次数
				if(nSendCount>=nRetryCount){
					//如果重试次数到了，则直接移动到历史库，并删除活动库
					WQLUtil.getWQL(WQLNames.UPFMSG0001)
						.addParam("flag", "2")
						.addParam("unmsg_uuid", mb.getUnmsg_uuid())
						.addParam("status", MSG.STATUS_ErrorClose)
						.addParam("sendcount", Integer.toString(nSendCount))
						.addParam("movetime", WDK.getDateTime())
						.process();
				}else{
					//如果次数没到，改变status，重新保存回数据库
					WQLUtil.getWQL(WQLNames.UPFMSG0001)
						.addParam("flag", "32")
						.addParam("unmsg_uuid", mb.getUnmsg_uuid())
						.addParam("status", MSG.STATUS_Error)
						.addParam("sendcount", Integer.toString(nSendCount))
						.addParam("updatetime", WDK.getDateTime())
						.process();
				}
			}
		}
	}
}