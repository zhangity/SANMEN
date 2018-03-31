package com.longj.platform.pb.audit;

import net.sf.json.JSONObject;

import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.platform.busi.wdk.base.BaseActionMethod;



public class AduitOperAction extends BaseActionMethod {
	private static WDKLogger logger = new WDKLogger(AduitOperAction.class.getName());
	private static String TEMPLATE_WO = "PF_PB_Aduit_Oper";
	

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
		String operdept = context.getString("operdept");
		String loginip = context.getString("loginip");
		String opermodule = context.getString("opermodule");
		String opermenu = context.getString("opermenu");
		String operbutton = context.getString("operbutton");
		String busititle = context.getString("busititle");
		String busidata = context.getString("busidata");
		String begintime = context.getString("begintime");//开始时间
		String endtime = context.getString("endtime");//结束时间
		
		String sec = "1=1";
		if(!"".equals(loginname)){
			sec = sec + " and loginname like '%"+loginname+"%' ";
		}
		if(!"".equals(operdept)){
			sec = sec + " and operdept like '%"+operdept+"%' ";
		}
		if(!"".equals(loginip)){
			sec = sec + " and loginip like '%"+loginip+"%' ";
		}
		if(!"".equals(opermodule)){
			sec = sec + " and opermodule like '%"+opermodule+"%' ";
		}
		if(!"".equals(opermenu)){
			sec = sec + " and opermenu like '%"+opermenu+"%' ";
		}
		if(!"".equals(operbutton)){
			sec = sec + " and operbutton like '%"+operbutton+"%' ";
		}
		if(!"".equals(busititle)){
			sec = sec + " and busititle like '%"+busititle+"%' ";
		}
		if(!"".equals(busidata)){
			sec = sec + " and busidata like '%"+busidata+"%' ";
		}
		if(!"".equals(begintime) && !"".equals(endtime)){
			sec = sec + " and operdt between '"+begintime+" 00:00:00' and '"+endtime+" 23:59:59' ";
		}
		
		WQLObject wo = _WQL_GetWO(TEMPLATE_WO);
		if(wo==null) throw new Exception("WQLObject【"+TEMPLATE_WO+"】不存在！");
		ResultBean ret = _WQL_PageQuery(context, wo, sec, "operdt,opermodule,opermenu");	
		jrows = ret.pageResult();

		_PRINT(context, jrows.toString());
	}


}
