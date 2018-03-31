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


public class upload_jsp
{
		
	private HttpServletRequest m_request;
	private HttpServletResponse m_response;
	private HttpSession m_session;
	private ServletContext m_application;
	private PageContext m_pagecontext;
	private JspWriter m_out; 

	private util myUtil;


	public upload_jsp(){
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

		if (!myUtil.CheckLicense()){
			myUtil.GoLicense();
			return;
		}


		String sStyleID = "", sCurrDir = "", sDir = "", sCurrPath = "";
		String s_UploadDir = "", s_BaseUrl = "", s_ContentPath = "";
		String[] a_CurrStyle;
		int nStyleID = 0;
		String sServletPath = m_request.getServletPath();
		String sFileSeparator = System.getProperty("file.separator");

		myUtil.sPosition = myUtil.sPosition + "上传文件管理";

		m_out.print(myUtil.Header());

		sStyleID = myUtil.dealNull(m_request.getParameter("id"));
		if (myUtil.isNumber(sStyleID)) {
			nStyleID = Integer.valueOf(sStyleID).intValue();
			if (nStyleID < myUtil.aStyle.size()) {
				a_CurrStyle = myUtil.split(myUtil.aStyle.get(nStyleID).toString(), "|||");
				s_UploadDir = a_CurrStyle[3];
				s_BaseUrl = a_CurrStyle[19];
				s_ContentPath = a_CurrStyle[23];
			}
		}

		if (s_UploadDir.equals("")) {
			sStyleID = "";
			sCurrDir = "";
		}else{
			if (s_BaseUrl.equals("3")){
				sCurrDir = s_UploadDir;
				sCurrPath = s_ContentPath;
			}else{
				if (!s_UploadDir.substring(0, 1).equals("/")){
					s_UploadDir = "../" + s_UploadDir;
				}
				sCurrDir = m_application.getRealPath(RelativePath2RootPath2(s_UploadDir, sServletPath));
				sCurrPath = s_UploadDir;
			}

			if (!sCurrDir.substring(sCurrDir.length()-1, sCurrDir.length()).equals(sFileSeparator)){
				sCurrDir += sFileSeparator;
			}
			if (!sCurrPath.substring(sCurrPath.length()-1, sCurrPath.length()).equals("/")){
				sCurrPath += "/";
			}


			sDir = myUtil.dealNull(m_request.getParameter("dir"));
			sDir = utf8dec(sDir);
			if (!sDir.equals("")) {
				String s_Dir2 = myUtil.replace(sDir, "/", sFileSeparator);
				s_Dir2 = myUtil.replace(s_Dir2, "\\", sFileSeparator);

				if (CheckValidDir(sCurrDir+s_Dir2)){
					sCurrDir += s_Dir2 + sFileSeparator;
					sCurrPath += sDir + "/";
				}else{
					sDir = "";
				}
			}


		}

		


		if (myUtil.sAction.equals("DELALL")){

			File oFile = new File(sCurrDir);
			String[] oFileList = oFile.list();
			if (oFileList != null) {
				for (int i = 0; i < oFileList.length; i++) {
					File f = new File(oFile, oFileList[i]);			
					if (f.isFile()) {
						f.delete();
					}
				}
			}

		}else if (myUtil.sAction.equals("DEL")){

			String[] s_DelFiles = new String[]{};
			if (m_request.getParameterValues("delfilename")!=null){
				s_DelFiles = m_request.getParameterValues("delfilename");
			}
			if (s_DelFiles != null){
				for (int i=0; i<s_DelFiles.length; i++){
					String s_DelFile = s_DelFiles[i];
					File f = new File(sCurrDir+s_DelFile);
					if (f.exists()){
						f.delete();
					}
				}
			}

		}else if (myUtil.sAction.equals("DELFOLDER")){


			String s_FolderName = myUtil.dealNull(m_request.getParameter("foldername"));
			s_FolderName = utf8dec(s_FolderName);
			File f = new File(sCurrDir+s_FolderName);
			if (f.exists()){
				f.delete();
			}

		}



		// Show List

		String sCurrPage = "";
		sCurrPage = myUtil.dealNull(m_request.getParameter("page"));

		String s_ViewMode, s_FormViewMode;
		s_ViewMode = myUtil.dealNull(m_request.getParameter("d_viewmode"));
		s_FormViewMode = myUtil.InitSelect("d_viewmode", myUtil.split("预览模式|列表模式", "|"), myUtil.split("|list", "|"), s_ViewMode, "", "onchange=\"location.href='?id=" + sStyleID + "&d_viewmode='+this.value+'&dir="+utf8enc(sDir)+"&page=" + sCurrPage + "'\"");

		m_out.print("<table border=0 cellspacing=1 align=center class=navi>" +
			"<form action='?' method=post name=queryform>" +
			"<tr><th>" + myUtil.sPosition + "</th></tr>" +
			"<tr><td align=right><b>显示模式：</b>" + s_FormViewMode + " <b>选择样式目录：</b><select name='id' size=1 onchange=\"this.form.submit()\">" + InitSelectStyle(myUtil.aStyle, sStyleID, "选择...") + "</select></td></tr>" +
			"</form></table><br>");


		String s_QueryStr = "";
		s_QueryStr = "?id=" + sStyleID + "&d_viewmode=" + s_ViewMode + "&dir=" + utf8enc(sDir);

		if (!sCurrDir.equals("")){

			m_out.print("<table border=0 cellspacing=1 class=list align=center>" +
				"<form action='" + s_QueryStr + "&action=del' method=post name=myform>" +
				"<tr align=center>" +
					"<th width='10%'>类型</th>" +
					"<th width='50%'>文件地址</th>" +
					"<th width='10%'>大小</th>" +
					"<th width='20%'>最后访问</th>" +
					"<th width='10%'>删除</th>" +
				"</tr>");

			if (!sDir.equals("")) {
				m_out.print("<tr align=center>" +
					"<td><img border=0 src='../sysimage/file/folderback.gif'></td>" +
					"<td align=left colspan=4><a href=\"?id=" + sStyleID + "&d_viewmode=" + s_ViewMode + "&dir=");
				if (sDir.indexOf("/")>0){
					m_out.print(utf8enc(sDir.substring(0, sDir.lastIndexOf("/"))));
				}
				m_out.print("\">返回上一级目录</a></td></tr>");
			}



			int nCurrPage = 0, nFileNum = 0, nPageNum = 0, nPageSize = 0;
			
			nPageSize = 20;
			if (sCurrPage.equals("") || !myUtil.isNumber(sCurrPage)) {
				nCurrPage = 1;
			}else{
				nCurrPage = Integer.valueOf(sCurrPage).intValue();
			}


			ArrayList aSubFolders = new ArrayList();
			ArrayList aSubFiles = new ArrayList();
			ArrayList aSubFiles_Len = new ArrayList();
			ArrayList aSubFiles_Time = new ArrayList();

			File file = new File(sCurrDir);
			//String[] fileList = file.list();
			File[] filelist = File.listRoots();
			filelist = file.listFiles();

			if (filelist == null) filelist = new File[]{};
			if (filelist != null && filelist.length > 0){
				for (int i = 0; i < filelist.length; i++) {
					if (filelist[i].isDirectory()) {
						aSubFolders.add(filelist[i].getName());
					}
					if (filelist[i].isFile()) {
						nFileNum++;
						aSubFiles.add(filelist[i].getName());
						aSubFiles_Len.add(convertFileSize(filelist[i].length()));
						aSubFiles_Time.add(myUtil.formatDate(new Date(filelist[i].lastModified()), 5));
					}
				}
			}

			for (int i=0; i<aSubFolders.size(); i++){
				m_out.print("<tr align=center>" +
					"<td><img border=0 src='../sysimage/file/folder.gif'></td>" +
					"<td align=left colspan=3><a href=\"?id=" + sStyleID + "&d_viewmode=" + s_ViewMode + "&dir=");
				if (!sDir.equals("")) {
					m_out.print(utf8enc(sDir + "/" + aSubFolders.get(i).toString()));
				}else{
					m_out.print(utf8enc(aSubFolders.get(i).toString()));
				}
				m_out.print("\">" + aSubFolders.get(i).toString() + "</a></td>" +
					"<td><a href='" + s_QueryStr + "&action=delfolder&foldername=" + utf8enc(aSubFolders.get(i).toString()) + "'>删除</a></td></tr>");
			}


			nPageNum = Int2(String.valueOf(nFileNum / nPageSize));
			if (nFileNum % nPageSize > 0) {
				nPageNum = nPageNum + 1;
			}
			if (nCurrPage > nPageNum) {
				nCurrPage = 1;
			}

			int nBeginPos = 0, nEndPos = 0;
			nBeginPos = (nCurrPage - 1) * nPageSize;
			nEndPos = nCurrPage * nPageSize;
			if (nEndPos > aSubFiles.size()) {
				nEndPos = aSubFiles.size();
			}

			int m = 0;
			int n = 0;
			for (int i=nBeginPos; i<nEndPos; i++){
				String s_FileName = aSubFiles.get(i).toString();

				if (s_ViewMode.equals("list")){
					m_out.print("<tr align=center>" +
						"<td>" + FileName2Pic(s_FileName) + "</td>" +
						"<td align=left><a href=\"" + sCurrPath + s_FileName + "\" target=_blank>" + s_FileName + "</a></td>" +
						"<td>" + aSubFiles_Len.get(i).toString() + "</td>" +
						"<td>" + aSubFiles_Time.get(i).toString() + "</td>" +
						"<td><input type=checkbox name=delfilename value=\"" + s_FileName + "\"></td></tr>");
				}else{
					n = n + 1;
					m = n % 4;
					if (n == 1){
						m_out.print("<tr align=center><td colspan=5><table border=0 cellspacing=1 width='98%' class=list>");
					}
					if (m == 1){
						m_out.print("<tr>");
					}

					m_out.print("<td width='25%' valign=top align=center><table border=0 cellspacing=1>"+
						"<tr><td width=200 height=200 align=center>" + File2Preview(sCurrPath, s_FileName) + "</td></tr>"+
						"<tr><td>文件名称：<a href=\"" + sCurrPath + s_FileName + "\" target=_blank>" + s_FileName + "</a></td></tr>"+
						"<tr><td>文件大小：" + aSubFiles_Len.get(i).toString() + "</td></tr>"+
						"<tr><td>最后访问：" + aSubFiles_Time.get(i).toString() + "</td></tr>"+
						"<tr><td>操作选择：<input type=checkbox name=delfilename value=\"" + s_FileName + "\"></td></tr>"+
						"</table></td>");

					if (m == 0){
						m_out.print("</tr>");
					}
				}
			}

			if (!s_ViewMode.equals("list")){
				if (n > 0){
					if (m != 0){
						for (int ii=1;ii<=(4-m);ii++){
							m_out.print("<td width='25%'>&nbsp;</td>");
						}
						m_out.print("</tr>");
					}
					m_out.print("</table></td></tr>");
				}
			}


			if (nFileNum <= 0) {
				m_out.print("<tr><td colspan=5>指定目录下现在还没有文件！</td></tr>");
			}


			if (nFileNum > 0) {
				m_out.print("<tr><td colspan=6><table border=0 cellpadding=3 cellspacing=0 width='100%'><tr><td>");
				if (nCurrPage > 1) {
					m_out.print("<a href='" + s_QueryStr + "&page=1'>首页</a>&nbsp;&nbsp;<a href='" + s_QueryStr + "&page=" + String.valueOf(nCurrPage - 1) + "'>上一页</a>&nbsp;&nbsp;");
				}else{
					m_out.print("首页&nbsp;&nbsp;上一页&nbsp;&nbsp;");
				}
				if (nCurrPage < nPageNum) {
					m_out.print("<a href='" + s_QueryStr + "&page=" + String.valueOf(nCurrPage + 1) + "'>下一页</a>&nbsp;&nbsp;<a href='" + s_QueryStr + "&page=" + String.valueOf(nPageNum) + "'>尾页</a>");
				}else{
					m_out.print("下一页&nbsp;&nbsp;尾页");
				}
				m_out.print("&nbsp;&nbsp;&nbsp;&nbsp;共<b>" + String.valueOf(nFileNum) + "</b>个&nbsp;&nbsp;页次:<b><span class=highlight2>" + String.valueOf(nCurrPage) + "</span>/" + String.valueOf(nPageNum) + "</b>&nbsp;&nbsp;<b>" + String.valueOf(nPageSize) + "</b>个文件/页");

				m_out.print("&nbsp;&nbsp;转到:");
				m_out.print("<select name='page' size=1 onchange=\"location.href='" + s_QueryStr + "&page='+this.options[this.selectedIndex].value;\">");
				
				for (n=1; n<=nPageNum; n++){
					m_out.print("<option value='" + String.valueOf(n) + "'");
					if (n == nCurrPage){
						m_out.print(" selected");
					}
					m_out.print(">第" + String.valueOf(n) + "页</option>");
				}
				m_out.print("</select>");


				m_out.print("</td><td align=right><input type=checkbox id=b_selectall onclick='doCheckAll(this)'><label for=b_selectall>全选</label>&nbsp; <input type=submit name=b value='删除选定的文件'> <input type=button name=b1 value='清空本目录所有文件' onclick=\"javascript:if (confirm('你确定要清空所有文件吗？')) {location.href='" + s_QueryStr + "&action=delall';}\"></td></tr></table></td></tr>");
			}

			m_out.print("</form></table>");

		}


		m_out.print(myUtil.Footer());



	}





	private String RelativePath2RootPath2(String url, String s_ServletPath){
		String sTempUrl = url;
		if (sTempUrl.substring(0, 1).equals("/")){
			return sTempUrl;
		}

		String sWebEditorPath = s_ServletPath;
		sWebEditorPath = sWebEditorPath.substring(0, sWebEditorPath.lastIndexOf("/"));
		while(sTempUrl.startsWith("../")){
			sTempUrl = sTempUrl.substring(3);
			sWebEditorPath = sWebEditorPath.substring(0, sWebEditorPath.lastIndexOf("/"));
		}
		return sWebEditorPath + "/" + sTempUrl;
	}

	private boolean CheckValidDir(String path){
		java.io.File dir = new java.io.File(path);
		if (dir == null){
			return false;
		}
		if (dir.isFile()){
			return false;
		}
		if (!dir.exists()){
			return false;
		}
		return true;
	}

	private String InitSelectStyle(ArrayList a_Style, String s_InitValue, String s_AllName){
		String s_Result = "";
		if (!s_AllName.equals("")) {
			s_Result = s_Result + "<option value=''>" + s_AllName + "</option>";
		}
		for (int i=0; i<a_Style.size(); i++){
			String[] aTemp = myUtil.split(a_Style.get(i).toString(), "|||");
			s_Result = s_Result + "<option value='" + i + "'";
			if (String.valueOf(i).equals(s_InitValue)) {
				s_Result = s_Result + " selected";
			}
			s_Result = s_Result + ">样式：" + myUtil.htmlEncode(aTemp[0]) + "---目录：" + myUtil.htmlEncode(aTemp[3]) + "</option>";
		}
		return s_Result;
	}

	private String FileName2Pic(String sFileName){
		String sPicName = "";
		String sExt = sFileName.substring(sFileName.lastIndexOf(".")+1).toUpperCase();
		if (sExt.equals("TXT")){
			sPicName = "txt.gif";
		}else if (sExt.equals("CHM") || sExt.equals("HLP")){
			sPicName = "hlp.gif";
		}else if (sExt.equals("DOC")){
			sPicName = "doc.gif";
		}else if (sExt.equals("PDF")){
			sPicName = "pdf.gif";
		}else if (sExt.equals("MDB")){
			sPicName = "mdb.gif";
		}else if (sExt.equals("GIF")){
			sPicName = "gif.gif";
		}else if (sExt.equals("JPG")){
			sPicName = "jpg.gif";
		}else if (sExt.equals("BMP")){
			sPicName = "bmp.gif";
		}else if (sExt.equals("PNG")){
			sPicName = "pic.gif";
		}else if (sExt.equals("ASP") || sExt.equals("JSP") || sExt.equals("JS") || sExt.equals("PHP") || sExt.equals("PHP3") || sExt.equals("ASPX")){
			sPicName = "code.gif";
		}else if (sExt.equals("HTM") || sExt.equals("HTML") || sExt.equals("SHTML")){
			sPicName = "htm.gif";
		}else if (sExt.equals("ZIP")){
			sPicName = "zip.gif";
		}else if (sExt.equals("RAR")){
			sPicName = "rar.gif";
		}else if (sExt.equals("EXE")){
			sPicName = "exe.gif";
		}else if (sExt.equals("AVI")){
			sPicName = "avi.gif";
		}else if (sExt.equals("MPG") || sExt.equals("MPEG") || sExt.equals("ASF")){
			sPicName = "mp.gif";
		}else if (sExt.equals("RA") || sExt.equals("RM")){
			sPicName = "rm.gif";
		}else if (sExt.equals("MP3")){
			sPicName = "mp3.gif";
		}else if (sExt.equals("MID") || sExt.equals("MIDI")){
			sPicName = "mid.gif";
		}else if (sExt.equals("WAV")){
			sPicName = "audio.gif";
		}else if (sExt.equals("XLS")){
			sPicName = "xls.gif";
		}else if (sExt.equals("PPT") || sExt.equals("PPS")){
			sPicName = "ppt.gif";
		}else if (sExt.equals("SWF")){
			sPicName = "swf.gif";
		}else{
			sPicName = "unknow.gif";
		}
		return "<img border=0 src='../sysimage/file/" + sPicName + "'>";
	}

	private String File2Preview(String s_Path, String s_File){
		String s_Result = "";
		String s_PathFile = s_Path + s_File;
		String sExt = s_File.substring(s_File.lastIndexOf(".")+1).toUpperCase();
		if (sExt.equals("GIF") || sExt.equals("JPG") || sExt.equals("JPEG") || sExt.equals("BMP") || sExt.equals("PNG")){
			s_Result = "<a href='" + s_PathFile + "' target='_blank'><img border=0 src='" + s_PathFile + "' width=180 height=180></a>";
		}else if (sExt.equals("SWF")){
			s_Result = "<object classid='clsid:d27cdb6e-ae6d-11cf-96b8-444553540000' codebase='http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=9,0,0,0' width=180 height=180>"+
				"<param name='movie' value='" + s_PathFile + "'>"+
				"<param name='quality' value='high'>"+
				"<embed src='" + s_PathFile + "' quality='high' width=180 height=180 type='application/x-shockwave-flash\' pluginspage='http://www.macromedia.com/go/getflashplayer'></embed>"+
				"</object>";
		}else{
			s_Result = FileName2Pic(s_File);
		}
		return s_Result;
	}


	private String convertFileSize (long size){
		int divisor = 1;
		String unit = "bytes";
		if (size>= 1024*1024){
			divisor = 1024*1024;
			unit = "MB";
		}
		else if (size>= 1024){
			divisor = 1024;
			unit = "KB";
		}
		if (divisor ==1) return size /divisor + " "+unit;
		String aftercomma = ""+100*(size % divisor)/divisor;
		if (aftercomma.length() == 1) aftercomma="0"+aftercomma;
		return size /divisor + "."+aftercomma+" "+unit;
	}

	private int Int2(String str){
		if (str.indexOf(".")>0){
			str = str.substring(0, str.indexOf("."));
		}
		return Integer.valueOf(str).intValue();
	}

	private String utf8enc(String str) throws UnsupportedEncodingException{
		return java.net.URLEncoder.encode(str, "UTF-"+"8");
	}

	private String utf8dec(String str) throws UnsupportedEncodingException{
		return java.net.URLDecoder.decode(str, "UTF-"+"8");
	}




}