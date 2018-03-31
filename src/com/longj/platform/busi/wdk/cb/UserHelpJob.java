package com.longj.platform.busi.wdk.cb;

import java.util.Date;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.wdk.WDK;
import org.wdk.core.base.BaseJob;
import org.wdk.module.wql.WQL;
import org.wdk.module.ws.WSProtocol;

import com.longj.platform.pb.detect.WSInvoke;
import com.longj.platform.pb.util.WQLUtil;

import wql.WQLNames;

/**
 * 检测并自动更改用户登录状态
//	INSERT INTO wdk_scheduler (schid,schname,schtype,jobpath,cronexpress,bootmode,bootparam,status,createdt,remark) VALUES ('login_detect','登录状态监测','0','com.nci.platform.pb.cb.UserHelpJob','0 0 23 * * ?','1','','1','','每天晚上23点执行') ;
 * @author Administrator
 *
 */
public class UserHelpJob extends BaseJob{

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		String instr = WSInvoke.getProtocol("com.nci.platform.pb.cb.UserHelpJob", "process");
		WSInvoke.wssend(WSProtocol.getWSProtocol("ws.invoke", instr));
	}
	public void process() throws Exception{
		//1、查询所有非锁定状态的用户
		//2、轮训
		//3、比较与当前时间的差值是否大于预设
		//4、如果大于则将当前用户状态设置为锁定，否则不处理
		Date dnow = new Date();
		String strNow = WDK.getDateTime(dnow);
		String slocktime = WDK.getNodeParam("locktime");
		long llocktime = Long.parseLong(slocktime);
		JSONArray jrows = WQL.getWO(WQLNames.QPFPB_UH0002)
								.addParam("flag", "1")
								.addParam("userstatus", "01")
								.process()
								.getResultJSONArray(0);
		for(int i=0;i<jrows.size();i++){
			JSONObject jrow = jrows.getJSONObject(i);
			String loginname = jrow.has("loginname")?jrow.getString("loginname"):"";
			String logindt = jrow.has("logindt")?jrow.getString("logindt"):"";

			Date d1 = WDK.getDateTime(logindt);
			long ll = dnow.getTime()-d1.getTime();
			if(ll>llocktime*1000){
				//如果最后一次登录和当前时间超过了最长期限，则更改当前记录的装填
				WQLUtil.getWQL(WQLNames.UPFPB_UH0002)
					.addParam("flag", "3")
					.addParam("loginname", loginname)
					.addParam("userstatus", "02")
					.addParam("updatedt", strNow)
					.process();
			}
		}
	}
}