package com.longj.platform.busi.wdk.cb;

import java.util.HashMap;

import net.sf.json.JSONObject;

import org.wdk.WDK;
import org.wdk.WDKCore;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.util.Base64;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.WQLObject;

import wql.WQLNames;

import com.longj.platform.busi.wdk.base.BaseActionMethod;

public class UserHelpAction extends BaseActionMethod{
	/**
	 * 重置密码
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void resetpwd(WDKContext context)throws Exception {
		String rp_loginname = context.getParameter("rp_loginname");
		String rp_loginpwd = context.getParameter("rp_loginpwd");
		String rp_newpwd = context.getParameter("rp_newpwd");
		
		String ecd_loginpwd = Base64.encode2String(rp_loginpwd);
		String ecd_newpwd = Base64.encode2String(rp_newpwd);
		
		JSONObject jres = new JSONObject();
		
		WQLObject wo = WQLObject.getWQLObject("EA_BI_Person");
		JSONObject jrow =  wo.query("person_id = ?", new String[]{rp_loginname}, "person_id", context.getConnectBean()).uniqueResult(0);
		String user_pwd = jrow.has("login_pwd")?jrow.getString("login_pwd"):"";
		String user_pwd2 = Base64.encode2String(user_pwd);
		if(user_pwd.equalsIgnoreCase(ecd_loginpwd)
				||user_pwd2.equalsIgnoreCase(ecd_loginpwd)){
			//登录成功，修改密码
			HashMap values = new HashMap();
			values.put("login_pwd", ecd_newpwd);
			boolean isSuccess =wo.update(values, "person_id = ?", new String[]{rp_loginname}, context.getConnectBean()).isSuccess();
			if(isSuccess){
				jres.put("code", "1");
				jres.put("desc", "密码修改成功");
			}else{
				jres.put("code", "0");
				jres.put("desc", "密码修改失败");
			}
			
		}else{
			jres.put("code", "0");
			jres.put("desc", "原始密码错误");
		}
		context.setPrintOut(jres.toString());
	}
	
	/**
	 * 检测用户是否已经在其他系统登录
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void islogin(WDKContext context)throws Exception {
		JSONObject jres = new JSONObject();
		String enablerepeatlogin = WDK.getNodeParam("enablerepeatlogin");		//是否允许重复登录
		
		if(!"1".equals(enablerepeatlogin)){
			String loginname = context.getParameter("loginname");
			JSONObject loginByName = WQL.getWO(WQLNames.QPFWF0003)
					.addParam("login_name", loginname)
					.process(context.getConnectBean())
					.uniqueResult(0);
			if(null==loginByName){
				JSONObject jlogin = WQL.getWO(WQLNames.QPFPB_UH0002)
						.addParam("flag", "1")
						.addParam("loginname", loginname)
						.process(context.getConnectBean())
						.uniqueResult(0);
				String loginip = "";
				boolean islogin = false;
				if(null==jlogin){
					//如果从未登录
					islogin = false;
				}else{
					String loginstatus = jlogin.has("loginstatus")?jlogin.getString("loginstatus"):"";
					loginip = jlogin.has("loginip")?jlogin.getString("loginip"):"";
					//如果离线
					if(!"01".equals(loginstatus)){
						islogin = false;
					}else{
					//如果在线
						islogin = true;
					}
				}
				if(islogin){
					jres.put("isca", "0");
					jres.put("code", "1");
					jres.put("islogin", "1");
					jres.put("loginip", loginip);
				}else{
					jres.put("isca", "0");
					jres.put("code", "1");
					jres.put("islogin", "0");
					jres.put("loginip", "");
				}
			}else{
				jres.put("isca", "1");
				jres.put("code", "1");
				jres.put("islogin", "0");
				jres.put("loginip", "");
			}
		}else{
			jres.put("isca", "0");
			jres.put("code", "1");
			jres.put("islogin", "0");
			jres.put("loginip", "");
		}
		context.setPrintOut(jres.toString());
//		_PRINT(request, response, jres.toString());
	}
	
	/**
	 * 获取在线用户数
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void online(WDKContext context)throws Exception {
		JSONObject jres = new JSONObject();
		jres.put("code", "1");
		jres.put("onlines", WDKCore.inst.SESSION_USERS.size());
		context.setPrintOut(jres.toString());
//		_PRINT(request, response, jres.toString());
		
	}
}