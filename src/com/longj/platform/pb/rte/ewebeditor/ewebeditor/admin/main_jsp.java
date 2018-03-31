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


public class main_jsp
{
		
	private HttpServletRequest m_request;
	private HttpServletResponse m_response;
	private HttpSession m_session;
	private ServletContext m_application;
	private PageContext m_pagecontext;
	private JspWriter m_out; 

	private util myUtil;


	public main_jsp(){
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



		myUtil.sPosition = myUtil.sPosition + "后台管理首页";

		m_out.print(myUtil.Header());



		m_out.print("<table border=0 cellspacing=1 align=center class=navi>"+
		"<tr><th>" + myUtil.sPosition + "</th></tr>"+
		"</table><br>");

		

		m_out.print("<table border=0 cellspacing=1 align=center class=list>"+
		"<tr><th colspan=2>eWebEditor 10.0 版权、常用联系方法、技术支持</th></tr>"+
		"<tr>"+
			"<td width='15%'>软件版本：</td>"+
			"<td width='85%'>eWebEditor Version 10.0 for JSP 简体中文商业版</td>"+
		"</tr>"+
		"<tr>"+
			"<td width='15%'>版权所有：</td>"+
			"<td width='85%'><a href='http://www.ewebsoft.com' target='_blank'>eWebSoft.com</a>&nbsp;&nbsp;已获得国家版权局颁发的《计算机软件著作权登记证书》,登记号:2004SR06549</td>"+
		"</tr>"+
		"<tr>"+
			"<td width='15%'>主页地址：</td>"+
			"<td width='85%'><a href='http://www.ewebeditor.net/' target='_blank'>eWebEditor中文站(www.eWebEditor.net)</a>&nbsp;&nbsp;&nbsp;<a href='http://service.ewebeditor.net/' target='_blank'>客服中心(service.eWebEditor.net)</a></td>"+
		"</tr>"+
		"<tr>"+
			"<td width='15%'>授权验证：</td>"+
			"<td width='85%'>");

		if (myUtil.sLicense.equals("")){
			m_out.print("<span class=red>未授权</span> [<a href='modilicense.jsp'>设置授权序列号</a>]");
		}else{
			m_out.print("<iframe name=ifrLicense src='' style='width:100%;height:20px;margin:0' scrolling='no' frameborder=0></iframe>"+
				"<div style='display:none;position:absolute;'>"+
				"<form name=formLicense action='http://service.ewebeditor.net/i_license.asp' target='ifrLicense' method=post>"+
				"<input type=hidden name='d_license' value=\""+myUtil.sLicense+"\">"+
				"<input type=hidden name='d_url' value=''>"+
				"<input type=hidden name='d_version' value='10.0'>"+
				"</form>"+
				"</div>"+
				"<script type='text/javascript'>submitLicense();</script>");
		}
		
		m_out.print("</td>"+
		"</tr>"+
		"</table><br>");

		m_out.print("<table border=0 cellspacing=1 align=center class=list>"+
		"<tr><th colspan=2>服务器的有关参数</th></tr>"+
		"<tr>"+
			"<td width='20%'>服务器名：</td>"+
			"<td width='80%'>" + m_request.getServerName() + "</td>"+
		"</tr>"+
		"<tr>"+
			"<td width='20%'>服务器IP：</td>"+
			"<td width='80%'>" + m_request.getRemoteAddr() + "</td>"+
		"</tr>"+
		"<tr>"+
			"<td width='20%'>服务器端口：</td>"+
			"<td width='80%'>" + String.valueOf(m_request.getServerPort()) + "</td>"+
		"</tr>"+
		"<tr>"+
			"<td width='20%'>服务器时间：</td>"+
			"<td width='80%'>" + (new java.util.Date() ).toString() + "</td>"+
		"</tr>"+
		"<tr>"+
			"<td width='20%'>URL路径：</td>"+
			"<td width='80%'>" + m_request.getRequestURL() + "</td>"+
		"</tr>"+
		"<tr>"+
			"<td width='20%'>URI路径：</td>"+
			"<td width='80%'>" + m_request.getRequestURI() + "</td>"+
		"</tr>"+
		"<tr>"+
			"<td width='20%'>Servlet路径：</td>"+
			"<td width='80%'>" + m_request.getServletPath() + "</td>"+
		"</tr>"+
		"<tr>"+
			"<td width='20%'>Context路径：</td>"+
			"<td width='80%'>" + m_request.getContextPath() + "</td>"+
		"</tr>"+
		"<tr>"+
			"<td width='20%'>物理路径：</td>"+
			"<td width='80%'>" + m_application.getRealPath("/") + "</td>"+
		"</tr>"+
		"<tr>"+
			"<td width='20%'>Server Info：</td>"+
			"<td width='80%'>" + m_pagecontext.getServletConfig().getServletContext().getServerInfo() + "</td>"+
		"</tr>"+
		"</table>");


		m_out.print(myUtil.Footer());



	}



}