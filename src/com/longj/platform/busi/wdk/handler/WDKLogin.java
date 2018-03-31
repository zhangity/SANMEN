package com.longj.platform.busi.wdk.handler;


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.WDK;
import org.wdk.WDKConstant;
import org.wdk.core.base.BaseLogin;
import org.wdk.core.base.BaseLoginBean;
import org.wdk.core.base.BaseSessionUser;
import org.wdk.core.util.Base64;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;

import wql.WQLNames;

import com.longj.platform.pb.audit.AuditUtil;
import com.longj.platform.pb.util.WQLUtil;




public class WDKLogin extends BaseLogin{
    
    public String getMACAddress(String ip) {  
        String str = "";  
        String macAddress = "";  
        try {  
            Process p = Runtime.getRuntime().exec("nbtstat -A " + ip);  
            InputStreamReader ir = new InputStreamReader(p.getInputStream());  
            LineNumberReader input = new LineNumberReader(ir);  
            for (int i = 1; i < 100; i++) {  
                str = input.readLine();  
                if (str != null) {  
                    if (str.indexOf("MAC Address") > 1) {  
                        macAddress = str.substring(  
                                str.indexOf("MAC Address") + 14, str.length());  
                        break;  
                    }  
                }  
            }  
        } catch (IOException e) {  
            e.printStackTrace(System.out);  
        }  
        return macAddress;  
    }  
    
    public static String getRemoteHost(javax.servlet.http.HttpServletRequest request){
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getRemoteAddr();
        }
        return ip.equals("0:0:0:0:0:0:0:1")?"127.0.0.1":ip;
    }
	@Override
	public JSONArray getAPPList(HttpServletRequest request,HttpServletResponse response) {
		// TODO Auto-generated method stub
		JSONArray japps = new JSONArray();
		
		JSONObject japp1 = new JSONObject();
		japp1.put("id", "1001");
		japp1.put("name", "公文管理");
		
		JSONObject japp2 = new JSONObject();
		japp2.put("id", "1002");
		japp2.put("name", "三项工作");
		
		JSONObject japp3 = new JSONObject();
		japp3.put("id", "1003");
		japp3.put("name", "综合事务");
		
		japps.add(japp1);
		japps.add(japp2);
		japps.add(japp3);
		
		return japps;
	}
	
	@Override
	public BaseLoginBean doLogin(BaseLoginBean loginBean,HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String loginname = loginBean.getLoginname();
		String loginpwd = loginBean.getLoginpwd();
		loginpwd = Base64.encode2String(loginpwd);
		String sn = loginBean.getRequestParam().get("sn");
		if(null==sn){
			sn = new String();
		}
		
		String enablerepeatlogin = WDK.getNodeParam("enablerepeatlogin");		//是否允许重复登录
		String appuuid = WDK.getPropPUB(WDKConstant.PROP_cfg_sys_appuuid);//"97a64c58ac924e539ce71867cc215d21";
		String dt = WDK.getDateTime();
		String ip = request.getRemoteHost();
		String dpet_id = request.getParameter("dept_id");//登陆的时候选择的部门ID
		String dpet_idname  = request.getParameter("dept_name");//登陆的时候选择的部门名称
		if(dpet_idname!=null){
			dpet_idname = new String(dpet_idname.getBytes("iso8859-1"),"utf-8"); 
		}
		
		WQLObject wo = WQLObject.getWQLObject("EA_BI_Person");
		
		ResultBean rb = wo.query("person_id =? and login_pwd  =?", new String[] { loginname, loginpwd }, "person_id", null);
		if (rb != null && rb.isSuccess()) {
			WQLData wd = rb.getWQLData(wo, 0);
			if(wd.getRowCount()>0){
				wd.first();
				if(wd.next()){
					String used_dept_id = wd.getValue("dept_id");
					String used_dept_name = wd.getValue("dept_idname");
					if(dpet_id!=null && dpet_id.trim().length()>0){
						used_dept_id = dpet_id;
						if (dpet_idname == null || "".equals(dpet_idname)) {
							WQLObject woDept = WQLObject.getWQLObject("EA_BI_DepartMent");
							ResultBean rb2 = woDept.query("dept_id = ?", new String[] { dpet_id }, "dept_id", null);
							if (rb2 != null && rb2.isSuccess()) {
								WQLData wd2 = rb2.getWQLData(woDept, 0);
								if (wd2 != null) {
									wd2.first();
									if (wd2.next()) {
										dpet_idname = wd2.getValue("dept_name");
									}
								}
							}
						}
						used_dept_name = dpet_idname;
					}
					SessionUser su = new SessionUser();
					su.setAccounttype("accounttype");
					su.setAccountuuid("accountuuid");
					su.setAppuuid(appuuid);
					String clientIP = WDKLogin.getRemoteHost(request);
					su.setClientIP(clientIP);
//							su.setClientMAC(this.getMACAddress(clientIP));
					su.setDeptname(used_dept_name);
					su.setDeptsimplename(used_dept_name);
					su.setDeptuuid(used_dept_id);
					su.setBelongdeptname(used_dept_name);
					su.setBelongdeptuuid(used_dept_id);
					su.setLoginname(loginname);
					su.setLogintime(WDK.getDateTime());
//							su.setLogouttime(logouttime);
					su.setManageunitname("manageunitname");
					su.setManageunitorguuid("manageunitorguuid");
					su.setManageunituuid("manageunituuid");
					su.setOrgname("orgname");
					su.setOrgsimplename("orgsimplename");
					su.setOrguuid("orguuid");
					su.setBelongorguuid("orguuid");
					su.setBelongorgname("orgname");
//							su.setPagename(pagename);
					su.setPersonname(wd.getValue("person_name"));
					su.setPersonuuid(loginname);
					su.setRolename("rolename");
					su.setRoleuuid("roleuuid");
					su.setSessionid(request.getSession().getId());
					su.setUserid(loginname);
					su.setUsername(wd.getValue("person_name"));
//							su.setVisittime(visittime);
					su.setDeptuuidex(used_dept_id);
					su.setDeptnameex(used_dept_name);
					su.setDeptsimplenameex("deptsimplenameex");
					loginBean.setSessionuser(su);
					loginBean.setCode(WDKConstant.LOGIN_SUCCESS);
					loginBean.setDesc("登录成功");
				}
				
			}else{
				loginBean.setCode(WDKConstant.LOGIN_WrongPassword);
				loginBean.setDesc("用户名或者密码错误");
				AuditUtil.addLogin(loginname, dt, ip, request.getSession().getId(), AuditUtil.LOGINSTATUS_Fail, AuditUtil.ERRCODE_01, AuditUtil.ERRDESC_01);
			}
		}
		
		
		
		
		
		
	
		
		//更新session
		//request.getSession().removeAttribute(WDKConstant.SESSION_USER);
		//request.getSession().setAttribute(WDKConstant.SESSION_USER, su);

		AuditUtil.addLogin(loginname, dt, ip, request.getSession().getId(), AuditUtil.LOGINSTATUS_Success);
		
//		ResultBean rb = WQL.getWO(WQLNames.QPFPB_RL0002)
//							.addParam("flag", "1")
//							.addParam("login_name", null==loginname?"":loginname)
//							.addParam("login_pwd", null==loginpwd?"":loginpwd)
//							.addParam("login_sn", null==sn?"":sn)
//							.process();
//		if(rb.isSuccess()){
//			if(rb.getResultJSONArray(0).size()>0){
//				JSONObject jrow = rb.getResultJSONArray(0).getJSONObject(0);
//				//模拟数据
//				 //jrow.has("appuuid")?jrow.getString("appuuid"):"";
////				String loginname = jrow.has("loginname")?jrow.getString("loginname"):"";
//				String accountuuid = jrow.has("accountuuid")?jrow.getString("accountuuid"):"";
//				String accounttype = jrow.has("accounttype")?jrow.getString("accounttype"):"";
//				String personuuid = jrow.has("personuuid")?jrow.getString("personuuid"):"";
//				String personname = jrow.has("personname")?jrow.getString("personname"):"";
//				String roleuuid = jrow.has("roleuuid")?jrow.getString("roleuuid"):"";
//				String rolename = jrow.has("rolename")?jrow.getString("rolename"):"";
//				String orguuid = jrow.has("orguuid")?jrow.getString("orguuid"):"";
//				String orgname = jrow.has("orgname")?jrow.getString("orgname"):"";
//				String orgsimplename = jrow.has("orgsimplename")?jrow.getString("orgsimplename"):"";
//				String deptuuid = jrow.has("deptuuid")?jrow.getString("deptuuid"):"";
//				String deptname = jrow.has("deptname")?jrow.getString("deptname"):"";
//				String deptsimplename = jrow.has("deptsimplename")?jrow.getString("deptsimplename"):"";
//				String manageunituuid = jrow.has("manageunituuid")?jrow.getString("manageunituuid"):"";
//				String manageunitname = jrow.has("manageunitname")?jrow.getString("manageunitname"):"";
//				String manageunitorguuid = jrow.has("manageunitorguuid")?jrow.getString("manageunitorguuid"):"";
//				String deptuuidex = jrow.has("deptuuidex")?jrow.getString("deptuuidex"):"";
//				String deptnameex = jrow.has("deptnameex")?jrow.getString("deptnameex"):"";
//				String deptsimplenameex =  jrow.has("deptsimplenameex")?jrow.getString("deptsimplenameex"):"";
//				
//				boolean isLock = false;
//				
//				//1、判断是否处于账号锁定状态
//				JSONObject jlogin = WQL.getWO(WQLNames.QPFPB_UH0002)
//										.addParam("flag", "1")
//										.addParam("loginname", loginname)
//										.process()
//										.uniqueResult(0);
//				if(null==jlogin){
//					//如果是第一次登录，则记录登录时间
//					BusiWQL.getBusiWQL(WQLNames.UPFPB_UH0002)
//						.addParam("flag", "1")
//						.addParam("loginname",loginname)
//						.addParam("loginstatus", "01")
//						.addParam("loginappuuid", appuuid)
//						.addParam("logindt", dt)
//						.addParam("loginip", ip)
//						.addParam("logoutdt", "")
//						.addParam("loginsessionid", request.getSession().getId())
//						.addParam("userstatus", "01")
//						.addParam("updatedt", dt)
//						.process();
//					isLock = false;
//				}else{
//					//2、如果 不是第一次登陆，则检查锁定状态
//					String userstatus = jlogin.has("userstatus")?jlogin.getString("userstatus"):"";
//					if("02".equals(userstatus)){
//						//2.1、如果锁定，则给出错误提示，不允许登录
//						isLock = true;
//					}else{
//						//2.2、如果未锁定，则首先通知集群内的其他服务器剔除该用户的session
//						if(!"1".equals(enablerepeatlogin)){
//							DetectClient.session_destory(personuuid);
//						}
//						
//						//2.3、则更改登录时间
//						BusiWQL.getBusiWQL(WQLNames.UPFPB_UH0002)
//							.addParam("flag", "201")
//							.addParam("loginname", loginname)
//							.addParam("loginstatus", "01")
//							.addParam("loginappuuid", appuuid)
//							.addParam("logindt", dt)
//							.addParam("loginip", ip)
//							.addParam("loginsessionid", request.getSession().getId())
//							.process();
//						isLock = false;
//					}
//				}
//				
//				//根据锁定状态进行验证
//				if(isLock){
//					loginBean.setCode(WDKConstant.LOGIN_Other);
//					loginBean.setDesc("当前用户已锁定，请联系管理员解锁！");
//					AuditUtil.addLogin(loginname, dt, ip, request.getSession().getId(), AuditUtil.LOGINSTATUS_Fail, AuditUtil.ERRCODE_03, AuditUtil.ERRDESC_03);
//				}else{
//				
//					SessionUser su = new SessionUser();
//					su.setAccounttype(accounttype);
//					su.setAccountuuid(accountuuid);
//					su.setAppuuid(appuuid);
//					String clientIP = TIEGLogin.getRemoteHost(request);
//					su.setClientIP(clientIP);
//	//				su.setClientMAC(this.getMACAddress(clientIP));
//					su.setDeptname(deptname);
//					su.setDeptsimplename(deptsimplename);
//					su.setDeptuuid(deptuuid);
//					su.setBelongdeptname(deptname);
//					su.setBelongdeptuuid(deptuuid);
//					su.setLoginname(loginname);
//					su.setLogintime(WDK.getDateTime());
//	//				su.setLogouttime(logouttime);
//					su.setManageunitname(manageunitname);
//					su.setManageunitorguuid(manageunitorguuid);
//					su.setManageunituuid(manageunituuid);
//					su.setOrgname(orgname);
//					su.setOrgsimplename(orgsimplename);
//					su.setOrguuid(orguuid);
//					su.setBelongorguuid(orguuid);
//					su.setBelongorgname(orgname);
//	//				su.setPagename(pagename);
//					su.setPersonname(personname);
//					su.setPersonuuid(personuuid);
//					su.setRolename(rolename);
//					su.setRoleuuid(roleuuid);
//					su.setSessionid(request.getSession().getId());
//					su.setUserid(personuuid);
//					su.setUsername(personname);
//	//				su.setVisittime(visittime);
//					su.setDeptuuidex(deptuuidex);
//					su.setDeptnameex(deptnameex);
//					su.setDeptsimplenameex(deptsimplenameex);
//					loginBean.setSessionuser(su);
//					loginBean.setCode(WDKConstant.LOGIN_SUCCESS);
//					loginBean.setDesc("登录成功");
//					
//					//更新session
//					//request.getSession().removeAttribute(WDKConstant.SESSION_USER);
//					//request.getSession().setAttribute(WDKConstant.SESSION_USER, su);
//
//					AuditUtil.addLogin(loginname, dt, ip, request.getSession().getId(), AuditUtil.LOGINSTATUS_Success);
//				}
//			}else{
//				//没有找到人
//				loginBean.setCode(WDKConstant.LOGIN_NOUser);
//				loginBean.setDesc("用户不存在");
//				AuditUtil.addLogin(loginname, dt, ip, request.getSession().getId(), AuditUtil.LOGINSTATUS_Fail, AuditUtil.ERRCODE_02, AuditUtil.ERRDESC_02);
//			}
//		}else{
//			//没有找到人
//			loginBean.setCode(WDKConstant.LOGIN_WrongPassword);
//			loginBean.setDesc(rb.getInfoError().get(0)+"");
//			AuditUtil.addLogin(loginname, dt, ip, request.getSession().getId(), AuditUtil.LOGINSTATUS_Fail, AuditUtil.ERRCODE_01, AuditUtil.ERRDESC_01);
//		}
		return loginBean;
	}

	
	@Override
	public String doLogout(HttpSession session) throws Exception {
		return "";
	}
	
	@Override
	public String doLogout(BaseSessionUser sessionuser) throws Exception {
		SessionUser su = (SessionUser)sessionuser;
		if(su==null) return "";
		//设置离线
		WQLUtil.getWQL(WQLNames.UPFPB_UH0002)
			.addParam("flag", "202")
			.addParam("loginname", su.getLoginname())
			.addParam("loginsessionid", su.getSessionid())
			.addParam("loginstatus", "02")
			.addParam("logoutdt", WDK.getDateTime())
			.process();
		
		//清除session
		//session.removeAttribute(WDKConstant.SESSION_USER);
		return "";
	}
	
	
	@Override
	public boolean doSSOLogin(HttpServletRequest request,HttpServletResponse response, String loginname) throws Exception {
		// TODO Auto-generated method stub
		boolean isSuccess = true;
//		Person p = (Person) WQL.getWO(WQLNames.QSYSRL0001)
//								.addParam("flag", "1")
//								.addParam("loginname", loginname)
//								.process()
//								.getObject(0, Person.class);
//		if(null!=p){
//			//登录成功
//			SessionUser su = new SessionUser(p);
//			request.getSession().removeAttribute(WDKConstant.SESSION_USER);
//			request.getSession().setAttribute(WDKConstant.SESSION_USER, su);
//			SessionListener.addSessionUser(request.getSession(), su);
//			isSuccess = true;
//		}else{
//			isSuccess = false;
//		}
		
		return isSuccess;
	}

	public static void main(String[] arg0){
		String loginpwd;
		try {
			loginpwd = Base64.encode2String("1");
			System.out.println(loginpwd);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}