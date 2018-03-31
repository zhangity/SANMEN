package com.longj.products.ea.standard.bu.action;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.wdk.WDK;
import org.wdk.WDKConstant;
import org.wdk.channel.SessionListener;
import org.wdk.core.session.SessionManager;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.platform.busi.wdk.handler.SessionUser;
import com.longj.platform.busi.wdk.handler.WDKLogin;

public class BUExamFilter implements javax.servlet.Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String person_id = request.getParameter("person_id");
		System.out.println("before"+person_id);
		if(person_id!=null && person_id.trim().length()>0){
			ConnectBean conb = null;
			boolean isSuccess = false;
			try{
				conb = ConnectBean.getConnectBean();
				conb.beginTransation();
				
				WQLObject wo = WQLObject.getWQLObject("EA_BI_Person");
				ResultBean rb = wo.query("person_id =?", new String[] { person_id }, "person_id", conb);
				if (rb != null && rb.isSuccess()) {
					WQLData wd = rb.getWQLData(wo, 0);
					if(wd.getRowCount()>0){
						wd.first();
						if(wd.next()){
							String appuuid = WDK.getPropPUB(WDKConstant.PROP_cfg_sys_appuuid);
							SessionUser su = new SessionUser();
							su.setAccounttype("accounttype");
							su.setAccountuuid("accountuuid");
							su.setAppuuid(appuuid);
							String clientIP = WDKLogin.getRemoteHost((HttpServletRequest)request);
							su.setClientIP(clientIP);
//									su.setClientMAC(this.getMACAddress(clientIP));
							su.setDeptname(wd.getValue("dept_idname"));
							su.setDeptsimplename(wd.getValue("dept_idname"));
							su.setDeptuuid(wd.getValue("dept_id"));
							su.setBelongdeptname(wd.getValue("dept_idname"));
							su.setBelongdeptuuid(wd.getValue("dept_id"));
							su.setLoginname(person_id);
							su.setLogintime(WDK.getDateTime());
//									su.setLogouttime(logouttime);
							su.setManageunitname("manageunitname");
							su.setManageunitorguuid("manageunitorguuid");
							su.setManageunituuid("manageunituuid");
							su.setOrgname("orgname");
							su.setOrgsimplename("orgsimplename");
							su.setOrguuid("orguuid");
							su.setBelongorguuid("orguuid");
							su.setBelongorgname("orgname");
//									su.setPagename(pagename);
							su.setPersonname(wd.getValue("dept_id"));
							su.setPersonuuid(person_id);
							su.setRolename("rolename");
							su.setRoleuuid("roleuuid");
							su.setSessionid(((HttpServletRequest)request).getSession().getId());
							su.setUserid(person_id);
							su.setUsername(wd.getValue("person_name"));
//									su.setVisittime(visittime);
							su.setDeptuuidex(wd.getValue("dept_id"));
							su.setDeptnameex(wd.getValue("dept_idname"));
							su.setDeptsimplenameex("deptsimplenameex");
							SessionListener.addSessionUser(((HttpServletRequest)request).getSession(), su);
							SessionManager.addSession((HttpServletRequest)request,(HttpServletResponse)response,su);//向Session管理器中添加Session
						}
					}
				}
			}catch (Exception e) {
				e.printStackTrace();
				isSuccess = false;
			}finally{
				if(conb!=null){
					if(isSuccess){
						conb.commitTransation();
					}else{
						conb.rollbackTransation();
					}
				}
			}
		}
        chain.doFilter(request, response);
        System.out.println("after");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	 

}
