package com.longj.platform.pb.audit;

import net.sf.json.JSONObject;

import org.wdk.core.base.BaseAction;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.platform.busi.wdk.base.BaseActionMethod;

public class AduitLoginAction extends BaseActionMethod {
	private static WDKLogger logger = new WDKLogger(AduitLoginAction.class.getName());
	private static String TEMPLATE_WO = "PF_PB_Aduit_Login";
	

	/**
	 * 查询列表
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void list(WDKContext context) throws Exception {
		JSONObject jrows = new JSONObject();

		//获取上下文中其他参数
		String loginname = context.getString("loginname");
		String loginip = context.getString("loginip");
		String begintime = context.getString("begintime");//开始时间
		String endtime = context.getString("endtime");//结束时间
		
		String sec = "1=1";
		if(!"".equals(loginname)){
			sec = sec + " and loginname like '%"+loginname+"%' ";
		}
		if(!"".equals(loginip)){
			sec = sec + " and loginip like '%"+loginip+"%' ";
		}
		if(!"".equals(begintime) && !"".equals(endtime)){
			sec = sec + " and logindt between '"+begintime+" 00:00:00' and '"+endtime+" 23:59:59' ";
		}
		
		WQLObject wo = _WQL_GetWO(TEMPLATE_WO);
		if(wo==null) throw new Exception("WQLObject【"+TEMPLATE_WO+"】不存在！");
		ResultBean ret = _WQL_PageQuery(context, wo, sec, "logindt,loginname,loginip");	
		jrows = ret.pageResult();

		_PRINT(context, jrows.toString());
	}


}
