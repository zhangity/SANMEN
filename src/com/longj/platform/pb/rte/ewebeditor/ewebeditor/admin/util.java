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



public class util
{
		
	private HttpServletRequest m_request;
	private HttpServletResponse m_response;
	private HttpSession m_session;
	private ServletContext m_application;
	private PageContext m_pagecontext;
	private JspWriter m_out; 

	public String sAction;
	public String sPosition;

	public String sLicense;
	public String sUsername;
	public String sPassword;
	public ArrayList aStyle;
	public ArrayList aToolbar;

	public String sFileSeparator;



	public util(){


	}



	public boolean InitAdmin(PageContext pagecontext, boolean b_Logined) throws ServletException,IOException{
		m_pagecontext = pagecontext;
		m_application = pagecontext.getServletContext();
		m_request = (HttpServletRequest)pagecontext.getRequest();
		m_response = (HttpServletResponse)pagecontext.getResponse();
		m_session = (HttpSession)pagecontext.getSession();
		m_out = pagecontext.getOut();


		if (b_Logined){
			String user = (String)dealNull(m_session.getAttribute("eWebEditor_User"));
			if(!user.equals("OK")){
				m_out.print("<script language=javascript>top.location.href='login.jsp';</script>");
				return false;
			}
		}

		sAction = dealNull(m_request.getParameter("action")).toUpperCase();
		sPosition = "当前位置：";

		sFileSeparator = System.getProperty("file.separator");

		String sConfig = getConfigText();
		sLicense = getConfigString("License", sConfig);
		sUsername = getConfigString("Username", sConfig);
		sPassword = getConfigString("Password", sConfig);
		aStyle = getConfigArray("Style", sConfig);
		aToolbar = getConfigArray("Toolbar", sConfig);

		CheckAndUpdateConfig();
	
		return true;
	}


	public String[] split(String source, String div) {
		int arynum = 0, intIdx = 0, intIdex = 0, div_length = div.length();
		if (source.compareTo("") != 0) {
		  if (source.indexOf(div) != -1) {
			intIdx = source.indexOf(div);
			for (int intCount = 1; ; intCount++) {
			  if (source.indexOf(div, intIdx + div_length) != -1) {
				intIdx = source.indexOf(div, intIdx + div_length);
				arynum = intCount;
			  }
			  else {
				arynum += 2;
				break;
			  }
			}
		  }
		  else {
			arynum = 1;
		  }
		}
		else {
		  arynum = 0;

		}
		intIdx = 0;
		intIdex = 0;
		String[] returnStr = new String[arynum];

		if (source.compareTo("") != 0) {
		  if (source.indexOf(div) != -1) {
			intIdx = (int) source.indexOf(div);
			returnStr[0] = (String) source.substring(0, intIdx);
			for (int intCount = 1; ; intCount++) {
			  if (source.indexOf(div, intIdx + div_length) != -1) {
				intIdex = (int) source.indexOf(div, intIdx + div_length);
				returnStr[intCount] = (String) source.substring(intIdx + div_length,
					intIdex);
				intIdx = (int) source.indexOf(div, intIdx + div_length);
			  }
			  else {
				returnStr[intCount] = (String) source.substring(intIdx + div_length,
					source.length());
				break;
			  }
			}
		  }
		  else {
			returnStr[0] = (String) source.substring(0, source.length());
			return returnStr;
		  }
		}
		else {
		  return returnStr;
		}
		return returnStr;
	}

	public String dealNull(String str) {
		String returnstr = null;
		if (str == null) {
			returnstr = "";
		} else {
			returnstr = str;
		}
		return returnstr;
	}

	public Object dealNull(Object obj) {
		Object returnstr = null;
		if (obj == null){
			returnstr = (Object) ("");
		}else{
			returnstr = obj;
		}
		return returnstr;
	}

	public String replace(String str, String substr, String restr) {
		String[] tmp = split(str, substr);
		String returnstr = null;
		if (tmp.length != 0) {
			returnstr = tmp[0];
			for (int i = 0; i < tmp.length - 1; i++) {
				returnstr = dealNull(returnstr) + restr + tmp[i + 1];
			}
		}
		return dealNull(returnstr);
	}

	public String Header(){
		String html = "";
		html += "\n" + "<html><head><meta http-equiv='X-UA-Compatible' content='IE=EmulateIE7'>";
		
		html += "\n" + "<meta http-equiv='Content-Type' content='text/html; charset=GBK'>";
		html += "\n" + "<title>eWebEditor在线编辑器 - 后台管理</title>";
		html += "\n" + "<link rel='stylesheet' type='text/css' href='private.css'>";
		html += "\n" + "<script language='javascript' src='private.js'></SCRIPT>";

		html += "\n" + "</head>";
		html += "\n" + "<body>";
		html += "\n" + "<a name=top></a>";
		return html;
	}

	public String Footer(){
		String html = "";
		html += "\n" +  "<table border=0 cellpadding=0 cellspacing=0 align=center width='100%'>" +
			"<tr><td height=40></td></tr>" +
			"<tr><td><hr size=1 color=#000000 width='60%' align=center></td></tr>" +
			"<tr>" +
				"<td align=center>Copyright  &copy;  2003-2015  <b>eWebEditor<font color=#CC0000>.net</font></b> <b>eWebSoft<font color=#CC0000>.com</font></b>, All Rights Reserved .</td>" +
			"</tr>" +
			"<tr>" +
				"<td align=center><a href='mailto:service@ewebsoft.com'>service@ewebsoft.com</a></td>" +
			"</tr>" +
			"</table>";

		html += "\n" + "</body></html>";
		return html;
	}

	public boolean IsSafeStr(String str){
		String s_BadStr = "'&<>?%,;:()`~!@#$^*{}[]|+-=\t\"";
		int n = s_BadStr.length();
		for(int i=0; i<n; i++){
			if (str.indexOf(s_BadStr.substring(i,i+1))>0){
				return false;
			}
		}
		return true;
	}

	public String htmlEncode(int i){
		if (i=='&') return "&amp;";
		else if (i=='<') return "&lt;";
		else if (i=='>') return "&gt;";
		else if (i=='"') return "&quot;";
		else return ""+(char)i;
	}
		
	public String htmlEncode(String st){
		StringBuffer buf = new StringBuffer();
		for (int i = 0;i<st.length();i++){
			buf.append(htmlEncode(st.charAt(i)));
		}
		return buf.toString();
	}

	public String getError(String str){
		return "<script language=javascript>alert('" + str + "\\n\\n系统将自动返回前一页面...');history.back();</script>";
	}

	public boolean WriteConfig(String s_License, String s_Username, String s_Password, ArrayList a_Style, ArrayList a_Toolbar){
		String sConfig = "<" + "%" + "\r\n";
		sConfig += "//License = \"" + s_License + "\"" + "\r\n";
		sConfig += "\r\n";
		sConfig += "//Username = \"" + s_Username + "\"" + "\r\n";
		sConfig += "//Password = \"" + s_Password + "\"" + "\r\n";
		sConfig += "\r\n";

		String s_Order = "", s_ID = "";
		String[] a_Order, a_ID;

		int nConfigStyle = 0;
		String sConfigStyle = "";
		String[] aTmpStyle;

		int nConfigToolbar = 0;
		String sConfigToolbar = "";
		String[] aTmpToolbar;
		String sTmpToolbar = "";

		for(int i=0;i<a_Style.size();i++){
			if (!a_Style.get(i).toString().equals("")){
				aTmpStyle = split(a_Style.get(i).toString(), "|||");
				if (!aTmpStyle[0].equals("")){
					nConfigStyle = nConfigStyle + 1;
					sConfigStyle = sConfigStyle + "//Style = \"" + a_Style.get(i).toString() + "\"" + "\r\n";

					s_Order = "";
					s_ID = "";
					for (int n=0;n<a_Toolbar.size();n++){
						if (!a_Toolbar.get(n).toString().equals("")){
							aTmpToolbar = split(a_Toolbar.get(n).toString(), "|||");
							if (aTmpToolbar[0].equals(String.valueOf(i))){
								if (!s_ID.equals("")){
									s_ID = s_ID + "|";
									s_Order = s_Order + "|";
								}
								s_ID = s_ID + String.valueOf(n);
								s_Order = s_Order + aTmpToolbar[3];
							}
						}
					}

					if (!s_ID.equals("")){
						a_ID = split(s_ID, "|");
						a_Order = split(s_Order, "|");
						a_ID = Sort(a_ID, a_Order);
						for (int n=0; n<a_ID.length; n++){
							nConfigToolbar = nConfigToolbar + 1;
							aTmpToolbar = split(a_Toolbar.get(Integer.valueOf(a_ID[n]).intValue()).toString(), "|||");
							sTmpToolbar = String.valueOf(nConfigStyle-1) + "|||" + aTmpToolbar[1] + "|||" + aTmpToolbar[2] + "|||" + aTmpToolbar[3];
							sConfigToolbar = sConfigToolbar + "//Toolbar = \"" + sTmpToolbar + "\"" + "\r\n";
						}
					}

				}
			}
		}

		sConfig = sConfig + sConfigStyle + "\r\n" + sConfigToolbar + "%" + ">";
	
		String s_ConfigFile = getConfigFileRealPath();
		if (s_ConfigFile.equals("")){
			return false;
		}else{
			WriteFile(s_ConfigFile, sConfig);
			return true;
		}
	}

	public String[] Sort(String[] aryValue, String[] aryOrder){
		String FirstOrder, SecondOrder;
		String FirstValue, SecondValue;
		boolean KeepChecking = true;
		while(KeepChecking){
			KeepChecking = false;
			for (int i=0; i<aryOrder.length; i++){
				if (i == aryOrder.length-1){
					break;
				}
				if (Integer.valueOf(aryOrder[i]).intValue()>Integer.valueOf(aryOrder[i+1]).intValue()){
					FirstOrder = aryOrder[i];
					SecondOrder = aryOrder[i+1];
					aryOrder[i] = SecondOrder;
					aryOrder[i+1] = FirstOrder; 
					FirstValue = aryValue[i];
					SecondValue = aryValue[i+1];
					aryValue[i] = SecondValue;
					aryValue[i+1] = FirstValue;
					KeepChecking = true;
				}
			}
		}
		return aryValue;
	}

	public void WriteFile(String s_FileName, String s_Text){
		try { 
			FileOutputStream fos = new FileOutputStream(s_FileName); 
			OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK"); 
			osw.write(s_Text); 
			osw.flush();
			osw.close();
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

	
	public String ReadFile(String s_FileName){
		StringBuffer sb = new StringBuffer();
		try {			
			char[] buf = new char[1024];
			FileInputStream fis = new FileInputStream(s_FileName);
			InputStreamReader isr = new InputStreamReader(fis, "GBK");
			BufferedReader br = new BufferedReader(isr);
			int len;
			while((len=br.read(buf))!=-1){
				sb.append(buf,0,len);
			}
			br.close();

		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return sb.toString();
	}

	public String ReadResourceFile(String s_FileName){
		StringBuffer sb = new StringBuffer();
		try {			
			char[] buf = new char[1024];
			InputStream is = m_application.getResourceAsStream(s_FileName);
			InputStreamReader isr = new InputStreamReader(is, "GBK");
			BufferedReader br = new BufferedReader(isr);
			int len;
			while((len=br.read(buf))!=-1){
				sb.append(buf,0,len);
			}
			br.close();

		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return sb.toString();
	}
	
	
	public void DeleteFile(String s_FileName){
		//try {
			File objFile = new File(s_FileName);
			objFile.delete();
		//} catch(IOException e) {
		//	System.out.println(e.getMessage());
		//}
	}


	public String getConfigString(String s_Key, String s_Config){
		String s_Result = "";
		Pattern p = Pattern.compile("//" + s_Key + " = \"(.*)\"");
		Matcher m = p.matcher(s_Config);
		while (m.find()) {
			s_Result = m.group(1);
		}
		return s_Result;
	}

	public ArrayList getConfigArray(String s_Key, String s_Config){
		ArrayList a_Result = new ArrayList();
		Pattern p = Pattern.compile("//" + s_Key + " = \"(.*)\"");
		Matcher m = p.matcher(s_Config);
		while (m.find()) {
			a_Result.add(m.group(1));
		}
		return a_Result;
	}

	public String getConfigText(){
		String s_ConfigFileRealPath = getConfigFileRealPath();
		if (s_ConfigFileRealPath.equals("")){
			return ReadResourceFile(getConfigFileResourcePath());
		}else{
			return ReadFile(s_ConfigFileRealPath);
		}
	}

	public String getConfigFileResourcePath(){
		return getEditorRootResourcePath() + "jsp/config.jsp";
	}

	public String getEditorRootResourcePath(){		
		String s_Path = m_request.getServletPath();
		s_Path = s_Path.substring(0, s_Path.lastIndexOf("/"));
		s_Path = s_Path.substring(0, s_Path.lastIndexOf("/")+1);
		return s_Path;
	}

	public String getConfigFileRealPath(){
		return getRealPathFromRelative("jsp/config.jsp");
	}

	public String getRealPathFromRelative(String s_RelativePath){
		String s_FileSeparator = System.getProperty("file.separator");
		
		String s_Url = s_RelativePath;
		if (s_Url.substring(0, 1).equals("/")){
			s_Url = replace(s_Url, "/", s_FileSeparator);
			return getSiteRootRealPath()+s_Url.substring(1,s_Url.length());
		}

		String s_EditorRoot = getEditorRootRealPath();
		if (s_EditorRoot.equals("")){
			return "";
		}
		String s_PrePath = s_EditorRoot.substring(0, s_EditorRoot.length()-1);

		while(s_Url.startsWith("../")){
			s_Url = s_Url.substring(3);
			s_PrePath = s_PrePath.substring(0, s_PrePath.lastIndexOf(s_FileSeparator));
		}
		
		return s_PrePath + s_FileSeparator + replace(s_Url, "/", s_FileSeparator);
	}

	public String getEditorRootRealPath(){
		String s_FileSeparator = System.getProperty("file.separator");
		
		String s_Path = m_request.getServletPath();
		s_Path = s_Path.substring(0, s_Path.lastIndexOf("/"));
		s_Path = s_Path.substring(0, s_Path.lastIndexOf("/"));
		
		if (!s_Path.equals("")){
			s_Path = replace(s_Path, "/", s_FileSeparator);
			s_Path += s_FileSeparator;
			s_Path = s_Path.substring(1, s_Path.length());
		}
		
		String s_SiteRootRealPath = getSiteRootRealPath();
		if (s_SiteRootRealPath.equals("")){
			s_Path = "";
		}else{
			s_Path = s_SiteRootRealPath+s_Path;
		}

		return s_Path;
	}

	public String getSiteRootRealPath(){
		String s_FileSeparator = System.getProperty("file.separator");
		String s_RealPath = m_application.getRealPath("/");
		if (s_RealPath==null){
			return "";
		}
		s_RealPath = replace(s_RealPath, s_FileSeparator+"."+s_FileSeparator, s_FileSeparator);
		if (!s_RealPath.endsWith(s_FileSeparator)){
			s_RealPath += s_FileSeparator;
		}
		return s_RealPath;
	}

	public boolean isNumber(String validString) {
		if (validString.equals("")){
			return false;
		}
		byte[] tempbyte = validString.getBytes();
		for (int i = 0; i < validString.length(); i++) {
			//by=tempbyte[i];
			if ( (tempbyte[i] < 48) || (tempbyte[i] > 57)) {
				return false;
			}
		}
		return true;
	}

	public boolean isFloat(String str) {
		if (str.equals("")){
			return false;
		}
		String number = "0123456789.";
		for (int i = 0; i < str.length(); i++) {
			if (number.indexOf(str.charAt(i)) == -1) {
				return false;
			}
		}
		return true;
	}

	public String GetMessage(String str){
		return "<table border=0 cellspacing=1 align=center class=list><tr><td>" + str + "</td></tr></table><br>";
	}

	public String GetGoUrl(String url){
		return "<script language=javascript>location.href=\"" + url + "\";</script>";
	}

	public String formatDate(Date myDate, int nFlag) {
		String strFormat = "";
		switch(nFlag){
		case 1:
			strFormat = "yyyy";
			break;
		case 2:
			strFormat = "yyyyMM";
			break;
		case 3:
			strFormat = "yyyyMMdd";
			break;
		case 4:
			strFormat = "yyyyMMddHHmmss";
			break;
		case 5:
			strFormat = "yyyy-MM-dd";
			break;
		}
		SimpleDateFormat formatter = new SimpleDateFormat(strFormat);
		String strDate = formatter.format(myDate);
		return strDate;
	}

	public String InitSelect(String s_FieldName, String[] a_Name, String[] a_Value, String s_InitValue, String s_AllName, String s_Attribute){
		String s_Result = "";
		s_Result += "<select name='" + s_FieldName + "' size=1 " + s_Attribute + ">";
		if (!s_AllName.equals("")) {
			s_Result += "<option value=''>" + s_AllName + "</option>";
		}
		for(int i=0; i<a_Name.length; i++){
			s_Result += "<option value=\"" + htmlEncode(a_Value[i]) + "\"";
			if (a_Value[i].equals(s_InitValue)) {
				s_Result += " selected";
			}
			s_Result += ">" + htmlEncode(a_Name[i]) + "</option>";
		}
		s_Result += "</select>";
		return s_Result;
	}

	public String InitCheckBox(String s_FieldName, String s_Value, String s_InitValue){
		String s_Result = "";
		if (s_Value.equals(s_InitValue)){
			s_Result = "<input type=checkbox name='" + s_FieldName + "' value='" + s_Value + "' checked>";
		}else{
			s_Result = "<input type=checkbox name='" + s_FieldName + "' value='" + s_Value + "'>";
		}
		return s_Result;
	}

	public void CheckAndUpdateConfig(){
		int n_Old = split(aStyle.get(1).toString(), "|||").length-1;
		int n_New = 109;

		if ((n_Old<66) || (n_Old>=n_New)){
			return;
		}
		

		for(int i=0; i<aStyle.size(); i++){
			String s = "";
			String[] a = split(aStyle.get(i).toString(), "|||");
			for (int j=n_Old+1; j<=n_New; j++){
				s = s + "|||";
				switch(j){
				case 67:
				case 68:
				case 69:
					s = s + "0";
					break;
				case 70:
					s = s + "";
					break;
				case 71:
					if (a[21].equals("1")){
						s = s + "{yyyy}/";
					}else if (a[21].equals("2")){
						s = s + "{yyyy}{mm}/";
					}else if (a[21].equals("3")){
						s = s + "{yyyy}{mm}{dd}/";
					}else{
						s = s + "";
					}
					break;
				case 72:
					s = s + "1";
					break;
				case 73:
					s = s + "{page}";
					break;
				case 74:
					s = s + "0";
					break;
				case 75:
					s = s + "2000";
					break;
				case 76:
					s = s + "1";
					break;
				case 77:
					s = s + "0";
					break;
				case 78:
					s = s + "";
					break;
				case 79:
					s = s + "0";
					break;
				case 80:
					s = s + "200";
					break;
				case 81:
					s = s + "1";
					break;
				case 82:
					s = s + "2";
					break;
				case 83:
					s = s + "1";
					break;
				case 84:
					s = s + "1";
					break;
				case 85:
					s = s + "1";
					break;
				case 86:
					s = s + "0";
					break;
				case 87:
					s = s + "";
					break;
				case 88:
					s = s + "0";
					break;
				case 89:
				case 90:
				case 91:
				case 92:
				case 93:
				case 94:
					s = s + "";
					break;
				case 95:
					s = s + "1";
					break;
				case 96:
				case 97:
					s = s + "";
					break;
				case 98:
					s = s + "300";
					break;
				case 99:
					s = s + "1";
					break;
				case 100:
				case 101:
				case 102:
				case 103:
				case 104:
					s = s + "";
					break;
				case 105:
					s = s + "1";
					break;
				case 106:
					s = s + "";
					break;
				case 107:
				case 108:
				case 109:
					if (a.length>84){
						if (a[84].equals("1")){
							s = s + "1";
						}else{
							s = s + "0";
						}
					}else{
						s = s + "1";
					}
					break;

				}
			}

			aStyle.set(i, aStyle.get(i).toString() + s);
		}

		
		WriteConfig(sLicense, sUsername, sPassword, aStyle, aToolbar);
	}


	public boolean CheckLicense(){
		String s_Domain=GetDomain();
		if (s_Domain.equals("127.0.0.1") || s_Domain.equals("localhost")) {
			return true;
		}
		
		if (sLicense.equals("")){
			return false;
		}

		String ret="";
		String[] aa = split(sLicense, ";");
		for (int i=0; i<aa.length; i++) {
			String[] a = split(aa[i], ":");
			if (a.length==8){
				if (a[7].length()==32){
					if (a[0].equals("3")){
						if (s_Domain.equals(a[6])){
							return true;
						}else if (s_Domain.length()>a[6].length()){
							if (s_Domain.substring(s_Domain.length()-a[6].length()-1).equals("."+a[6])){
								return true;
							}
						}
					}else{					
						if ((s_Domain.equals(a[6])) || (s_Domain.equals("www."+a[6]))){
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public String GetDomain(){
		String s_Url = (String)dealNull(m_session.getAttribute("eWebEditor_Host"));
		if (!s_Url.equals("")){
			return s_Url.toLowerCase();
		}
		
		s_Url = m_request.getRequestURL().toString().toLowerCase();
		boolean b = false;
		int n = s_Url.indexOf("://");
		if (n>0){
			s_Url = s_Url.substring(n+3, s_Url.length());
			n = s_Url.indexOf("/");
			if (n>0){
				s_Url = s_Url.substring(0, n);
				n = s_Url.indexOf(":");
				if (n>0){
					s_Url = s_Url.substring(0, n);
				}
			}
			if (!s_Url.equals("")){
				b = true;
			}
		}
		if (!b){
			s_Url = m_request.getServerName().toLowerCase();
		}
		return s_Url;
	}

	public void GoLicense() throws IOException{
		m_out.print("<script type='text/javascript'>alert('未授权：需要输入正版授权序列号后才可使用！');location.href='modilicense.jsp';</script>");
	}


}