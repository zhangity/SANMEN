package com.longj.platform.pb.rte.ewebeditor.ewebeditor.admin;

import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.io.*;


import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;


public class modipwd_jsp
{
		
	private HttpServletRequest m_request;
	private HttpServletResponse m_response;
	private HttpSession m_session;
	private ServletContext m_application;
	private PageContext m_pagecontext;
	private JspWriter m_out; 

	private util myUtil;


	public modipwd_jsp(){
		myUtil = new util();
	}



	public final void Load(PageContext pagecontext) throws ServletException,IOException{
		m_pagecontext = pagecontext;
		m_application = pagecontext.getServletContext();
		m_request = (HttpServletRequest)pagecontext.getRequest();
		m_response = (HttpServletResponse)pagecontext.getResponse();
		m_session = (HttpSession)pagecontext.getSession();
		m_out = pagecontext.getOut();

		
		if (!myUtil.InitAdmin(pagecontext, true)){
			return;
		}




		myUtil.sPosition = myUtil.sPosition + "修改用户名及密码";

		m_out.print(myUtil.Header());


		if (myUtil.sAction.equals("MODI")) {
			String sNewUsr = myUtil.dealNull(m_request.getParameter("newusr"));
			String sNewPwd1 = myUtil.dealNull(m_request.getParameter("newpwd1"));
			String sNewPwd2 = myUtil.dealNull(m_request.getParameter("newpwd2"));

			if (sNewUsr.equals("")) {
				m_out.print(myUtil.getError("新用户名不能为空！"));
				return;
			}
			if (sNewPwd1.equals("")) {
				m_out.print(myUtil.getError("新密码不能为空！"));
				return;
			}
			if (!sNewPwd1.equals(sNewPwd2)) {
				m_out.print(myUtil.getError("新密码和确认密码不相同！"));
				return;
			}

			myUtil.sUsername = sNewUsr;
			myUtil.sPassword = sNewPwd1;

			if (!myUtil.WriteConfig(myUtil.sLicense, myUtil.sUsername, myUtil.sPassword, myUtil.aStyle, myUtil.aToolbar)){
				m_out.print(myUtil.getError("Error: getRealPath"));
				return;
			};
			
			m_out.print("<table border=0 cellspacing=1 align=center class=navi>"+
			"<tr><th>" + myUtil.sPosition + "</th></tr>"+
			"</table><br>");

			

			m_out.print("<table border=0 cellspacing=1 align=center class=list>"+
			"<tr>"+
				"<td>登录用户名及密码修改成功！</td>"+
			"</tr>"+
			"</table>");

		} else {

			m_out.print("<table border=0 cellspacing=1 align=center class=navi>"+
			"<tr><th>" + myUtil.sPosition + "</th></tr>"+
			"</table><br>");

			

			m_out.print("<table border=0 cellspacing=1 align=center class=form>"+
			"<form action='?action=modi' method=post name=myform onsubmit=\"return checkModipwdForm()\">"+
			"<tr>"+
				"<th>设置名称</th>"+
				"<th>基本参数设置</th>"+
				"<th>设置说明</th>"+
			"</tr>"+
			"<tr>"+
				"<td width='15%'>新用户名：</td>"+
				"<td width='55%'><input type=text class=input size=20 name=newusr value=\"" + myUtil.htmlEncode(myUtil.sUsername) + "\"></td>"+
				"<td width='30%'><span class=red>*</span>&nbsp;&nbsp;旧用户名：<span class=blue>" + myUtil.htmlEncode(myUtil.sUsername) + "</span></td>"+
			"</tr>"+
			"<tr>"+
				"<td width='15%'>新 密 码：</td>"+
				"<td width='55%'><input type=password class=input size=20 name=newpwd1 maxlength=30></td>"+
				"<td width='30%'><span class=red>*</span></td>"+
			"</tr>"+
			"<tr>"+
				"<td width='15%'>确认密码：</td>"+
				"<td width='55%'><input type=password class=input size=20 name=newpwd2 maxlength=30></td>"+
				"<td width='30%'><span class=red>*</span></td>"+
			"</tr>"+
			"<tr><td align=center colspan=3><input type=submit name=bSubmit value='  提交  '></a>&nbsp;<input type=reset name=bReset value='  重填  '></td></tr>"+
			"</form>"+
			"</table>");


		}


		m_out.print(myUtil.Footer());


	}



}