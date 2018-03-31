package com.longj.platform.busi.wdk.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.wdk.WDKConstant;
import org.wdk.core.base.BaseSession;
import org.wdk.core.base.BaseSessionUser;
import org.wdk.core.session.SessionBean;

public class WDKSession extends BaseSession{

	@Override
	public String getSessionid(HttpServletRequest request,HttpServletResponse response) {
		return request.getSession().getId();
	}
	
	@Override
	public void addSession(HttpServletRequest request,HttpServletResponse response, BaseSessionUser su) {
		request.getSession().removeAttribute(WDKConstant.SESSION_USER);
		request.getSession().setAttribute(WDKConstant.SESSION_USER, su);
	}

	@Override
	public BaseSessionUser getSession(HttpServletRequest request,HttpServletResponse response) {
		BaseSessionUser su = (BaseSessionUser)request.getSession().getAttribute(WDKConstant.SESSION_USER);
		return su;
	}

	@Override
	public void delSession(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().removeAttribute(WDKConstant.SESSION_USER);
	}

	@Override
	public boolean timeout(SessionBean session) {
		if(session!=null){
			//session.getRequest().getSession().removeAttribute(WDKConstant.SESSION_USER);
			return true;
		}else{
			return false;
		}
	}



}
