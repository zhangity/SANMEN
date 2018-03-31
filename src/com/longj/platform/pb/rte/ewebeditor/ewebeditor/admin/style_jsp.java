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


public class style_jsp
{
		
	private HttpServletRequest m_request;
	private HttpServletResponse m_response;
	private HttpSession m_session;
	private ServletContext m_application;
	private PageContext m_pagecontext;
	private JspWriter m_out; 

	private util myUtil;


	String sStyleID = "", sStyleName = "", sFixWidth = "", sSkin = "", sStyleUploadDir = "", sStyleWidth = "", sStyleHeight = "", sStyleMemo = "", sStyleStateFlag = "", sStyleDetectFromWord = "", sStyleInitMode = "", sStyleBaseUrl = "", sStyleUploadObject = "", sStyleAutoDir = "", sStyleBaseHref = "", sStyleContentPath = "", sStyleAutoRemote = "", sStyleShowBorder = "", sStyleAllowBrowse = "";
	String sSLTFlag = "", sSLTMode = "", sSLTCheckFlag = "", sSLTMinSize = "", sSLTOkSize = "", sSYWZFlag = "", sSYText = "", sSYFontColor = "", sSYFontSize = "", sSYFontName = "", sSYPicPath = "", sSLTSYObject = "", sSLTSYExt = "", sSYWZMinWidth = "", sSYShadowColor = "", sSYShadowOffset = "", sSYWZMinHeight = "", sSYWZPosition = "", sSYWZTextWidth = "", sSYWZTextHeight = "", sSYWZPaddingH = "", sSYWZPaddingV = "", sSYTPFlag = "", sSYTPMinWidth = "", sSYTPMinHeight = "", sSYTPPosition = "", sSYTPPaddingH = "", sSYTPPaddingV = "", sSYTPImageWidth = "", sSYTPImageHeight = "", sSYTPOpacity = "", sAdvApiFlag = "";
	String sStyleFileExt = "", sStyleFlashExt = "", sStyleImageExt = "", sStyleMediaExt = "", sStyleRemoteExt = "", sStyleLocalExt = "", sStyleFileSize = "", sStyleFlashSize = "", sStyleImageSize = "", sStyleMediaSize = "", sStyleRemoteSize = "", sStyleLocalSize = "";
	String sToolBarID = "", sToolBarName = "", sToolBarOrder = "", sToolBarButton = "";
	String sSBCode = "", sSBEdit = "", sSBText = "", sSBView = "", sSBSize = "";
	String sEnterMode = "", sAreaCssMode = "", sFileNameMode = "", sEncryptKey="";
	String sPaginationMode="", sPaginationKey="", sPaginationAutoFlag="", sPaginationAutoNum="", sSpaceSize="";
	String sMFUMode="", sMFUBlockSize="", sMFUEnable="";
	String sCodeFormat="", sTB2Flag="", sTB2Code="", sTB2Edit="", sTB2Text="", sTB2View="", sTB2Max="", sShowBlock="";
	String sFileNameSameFix="", sAutoDirOrderFlag="", sAutoTypeDirImage="", sAutoTypeDirFlash="", sAutoTypeDirMedia="", sAutoTypeDirAttach="", sAutoTypeDirRemote="", sAutoTypeDirLocal="";
	String sWordImportInitMode="", sWordImportAPI="", sQuickFormatInitFontName="", sQuickFormatInitFontSize="";
	String sUIMinHeight="", sSYValidNormal="", sSYValidLocal="", sSYValidRemote="";
	String sAutoDoneWordPaste="", sAutoDoneExcelPaste="", sAutoDoneQuickFormat="", sAutoDonePasteOption="";



	public style_jsp(){
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



		int nStyleID = 0, nToolBarID = 0;

		myUtil.sPosition = myUtil.sPosition + "样式管理";

		// Init Style
		if (myUtil.sAction.equals("STYLEPREVIEW") || myUtil.sAction.equals("COPY") || myUtil.sAction.equals("STYLESET") || myUtil.sAction.equals("STYLEDEL") || myUtil.sAction.equals("CODE") || myUtil.sAction.equals("TOOLBAR") || myUtil.sAction.equals("TOOLBARADD") || myUtil.sAction.equals("TOOLBARMODI") || myUtil.sAction.equals("TOOLBARDEL") || myUtil.sAction.equals("BUTTONSET") || myUtil.sAction.equals("BUTTONSAVE")){
			boolean b = false;
			sStyleID = myUtil.dealNull(m_request.getParameter("id"));
			if (myUtil.isNumber(sStyleID)){
				nStyleID = Integer.valueOf(sStyleID).intValue();
				if (nStyleID < myUtil.aStyle.size()){
					String[] aCurrStyle = myUtil.split(myUtil.aStyle.get(nStyleID).toString(), "|||");

					sStyleName = aCurrStyle[0];
					sFixWidth = aCurrStyle[1];
					sSkin = aCurrStyle[2];
					sStyleUploadDir = aCurrStyle[3];
					sStyleWidth = aCurrStyle[4];
					sStyleHeight = aCurrStyle[5];
					sStyleFileExt = aCurrStyle[6];
					sStyleFlashExt = aCurrStyle[7];
					sStyleImageExt = aCurrStyle[8];
					sStyleMediaExt = aCurrStyle[9];
					sStyleRemoteExt = aCurrStyle[10];
					sStyleFileSize = aCurrStyle[11];
					sStyleFlashSize = aCurrStyle[12];
					sStyleImageSize = aCurrStyle[13];
					sStyleMediaSize = aCurrStyle[14];
					sStyleRemoteSize = aCurrStyle[15];
					sStyleStateFlag = aCurrStyle[16];
					sStyleDetectFromWord = aCurrStyle[17];
					sStyleInitMode = aCurrStyle[18];
					sStyleBaseUrl = aCurrStyle[19];
					sStyleUploadObject = aCurrStyle[20];

					sStyleBaseHref = aCurrStyle[22];
					sStyleContentPath = aCurrStyle[23];
					sStyleAutoRemote = aCurrStyle[24];
					sStyleShowBorder = aCurrStyle[25];
					sStyleMemo = aCurrStyle[26];
					sSLTFlag = aCurrStyle[29];
					sSLTMinSize = aCurrStyle[30];
					sSLTOkSize = aCurrStyle[31];
					sSYWZFlag = aCurrStyle[32];
					sSYText = aCurrStyle[33];
					sSYFontColor = aCurrStyle[34];
					sSYFontSize = aCurrStyle[35];
					sSYFontName = aCurrStyle[36];
					sSYPicPath = aCurrStyle[37];
					sSLTSYObject = aCurrStyle[38];
					sSLTSYExt = aCurrStyle[39];
					sSYWZMinWidth = aCurrStyle[40];
					sSYShadowColor = aCurrStyle[41];
					sSYShadowOffset = aCurrStyle[42];
					sStyleAllowBrowse = aCurrStyle[43];
					sStyleLocalExt = aCurrStyle[44];
					sStyleLocalSize = aCurrStyle[45];
					sSYWZMinHeight = aCurrStyle[46];
					sSYWZPosition = aCurrStyle[47];
					sSYWZTextWidth = aCurrStyle[48];
					sSYWZTextHeight = aCurrStyle[49];
					sSYWZPaddingH = aCurrStyle[50];
					sSYWZPaddingV = aCurrStyle[51];
					sSYTPFlag = aCurrStyle[52];
					sSYTPMinWidth = aCurrStyle[53];
					sSYTPMinHeight = aCurrStyle[54];
					sSYTPPosition = aCurrStyle[55];
					sSYTPPaddingH = aCurrStyle[56];
					sSYTPPaddingV = aCurrStyle[57];
					sSYTPImageWidth = aCurrStyle[58];
					sSYTPImageHeight = aCurrStyle[59];
					sSYTPOpacity = aCurrStyle[60];
					sAdvApiFlag = aCurrStyle[61];
					sSBCode = aCurrStyle[62];
					sSBEdit = aCurrStyle[63];
					sSBText = aCurrStyle[64];
					sSBView = aCurrStyle[65];
					sEnterMode = aCurrStyle[66];
					sAreaCssMode = aCurrStyle[67];
					sFileNameMode = aCurrStyle[68];
					sSLTMode = aCurrStyle[69];
					sEncryptKey = aCurrStyle[70];
					sStyleAutoDir = aCurrStyle[71];
					sPaginationMode = aCurrStyle[72];
					sPaginationKey = aCurrStyle[73];
					sPaginationAutoFlag = aCurrStyle[74];
					sPaginationAutoNum = aCurrStyle[75];
					sSBSize = aCurrStyle[76];
					sSLTCheckFlag = aCurrStyle[77];
					sSpaceSize = aCurrStyle[78];
					sMFUMode = aCurrStyle[79];
					sMFUBlockSize = aCurrStyle[80];
					sMFUEnable = aCurrStyle[81];
					sCodeFormat = aCurrStyle[82];
					sTB2Flag = aCurrStyle[83];
					sTB2Code = aCurrStyle[84];
					sTB2Max = aCurrStyle[85];
					sShowBlock = aCurrStyle[86];
					sFileNameSameFix = aCurrStyle[87];
					sAutoDirOrderFlag = aCurrStyle[88];
					sAutoTypeDirImage = aCurrStyle[89];
					sAutoTypeDirFlash = aCurrStyle[90];
					sAutoTypeDirMedia = aCurrStyle[91];
					sAutoTypeDirAttach = aCurrStyle[92];
					sAutoTypeDirRemote = aCurrStyle[93];
					sAutoTypeDirLocal = aCurrStyle[94];
					sWordImportInitMode = aCurrStyle[95];
					sQuickFormatInitFontName = aCurrStyle[96];
					sQuickFormatInitFontSize = aCurrStyle[97];
					sUIMinHeight = aCurrStyle[98];
					sSYValidNormal = aCurrStyle[99];
					sSYValidLocal = aCurrStyle[100];
					sSYValidRemote = aCurrStyle[101];
					sAutoDoneWordPaste = aCurrStyle[102];
					sAutoDoneExcelPaste = aCurrStyle[103];
					sAutoDoneQuickFormat = aCurrStyle[104];
					sWordImportAPI = aCurrStyle[105];
					sAutoDonePasteOption = aCurrStyle[106];
					sTB2Edit = aCurrStyle[107];
					sTB2Text = aCurrStyle[108];
					sTB2View = aCurrStyle[109];

					b = true;
				}
			}
			if (!b){
				m_out.print(myUtil.getError("无效的样式ID号，请通过页面上的链接进行操作！"));
				return;
			}
		}


		if (myUtil.sAction.equals("STYLEPREVIEW")){
			m_out.print("<html><head><meta http-equiv='X-UA-Compatible' content='IE=EmulateIE7'>"
				+ "<title>样式预览</title>"
				+ "<meta http-equiv='Content-Type' content='text/html; charset=GBK'>"
				+ "</head><body>"
				+ "<input type=hidden name=content1  value=''>"
				+ "<iframe ID='eWebEditor1' src='../ewebeditor.htm?id=content1&style=" + sStyleName + "' frameborder=0 scrolling=no width='" + sStyleWidth + "' HEIGHT='" + sStyleHeight + "'></iframe>"
				+ "</body></html>");
			return;
		}

		m_out.print(myUtil.Header());

		m_out.print("<table border=0 cellspacing=1 align=center class=navi>"
			+"<tr><th>" + myUtil.sPosition + "</th></tr>"
			+"<tr><td align=center>[<a href='?'>所有样式列表</a>]&nbsp;&nbsp;&nbsp;&nbsp;[<a href='?action=styleadd'>新建一样式</a>]&nbsp;&nbsp;&nbsp;&nbsp;[<a href='#' onclick='history.back()'>返回前一页</a>]</td></tr>"
			+"</table><br>");

		// Init Toolbar
		if (myUtil.sAction.equals("BUTTONSET") || myUtil.sAction.equals("BUTTONSAVE")){
			boolean b = false;
			sToolBarID = myUtil.dealNull(m_request.getParameter("toolbarid"));
			if (myUtil.isNumber(sToolBarID)){
				nToolBarID = Integer.valueOf(sToolBarID).intValue();
				if ((nToolBarID < myUtil.aToolbar.size()) && (nToolBarID >= 0)){
					String[] aCurrToolbar = myUtil.split(myUtil.aToolbar.get(nToolBarID).toString(), "|||");
					sToolBarName = aCurrToolbar[2];
					sToolBarOrder = aCurrToolbar[3];
					sToolBarButton = aCurrToolbar[1];
					b = true;
				}
			}
			if (!b){
				m_out.print(myUtil.getError("无效的工具栏ID号，请通过页面上的链接进行操作！"));
				return;
			}

		}



		if(myUtil.sAction.equals("STYLEADD") || myUtil.sAction.equals("STYLESET")){

			String s_Title, s_Action;
			String s_FormStateFlag, s_FormDetectFromWord, s_FormInitMode, s_FormBaseUrl, s_FormUploadObject, s_FormAutoRemote, s_FormShowBorder, s_FormAutoDetectLanguage, s_FormDefaultLanguage, s_FormSLTFlag, s_FormSLTMode, s_FormSLTCheckFlag, s_FormSYWZFlag, s_FormSLTSYObject, s_FormAllowBrowse, s_FormSYTPFlag, s_FormSYWZPosition, s_FormSYTPPosition, s_FormAdvApiFlag, s_FormMFUMode, s_FormMFUEnable, s_FormCodeFormat, s_FormShowBlock;
			String s_FormSBCode, s_FormSBEdit, s_FormSBView, s_FormSBText, s_FormSBSize;
			String s_FormEnterMode, s_FormAreaCssMode, s_FormFileNameMode;
			String s_FormPaginationMode, s_FormPaginationAutoFlag;
			String s_FormTB2Flag, s_FormTB2Code, s_FormTB2Edit, s_FormTB2Text, s_FormTB2View, s_FormTB2Max;
			String s_FormAutoDirOrderFlag, s_FormWordImportInitMode, s_FormWordImportAPI;
			String s_FormSYValidNormal, s_FormSYValidLocal, s_FormSYValidRemote;
			String s_FormAutoDoneWordPaste, s_FormAutoDoneExcelPaste, s_FormAutoDoneQuickFormat, s_FormAutoDonePasteOption;
			
			if(myUtil.sAction.equals("STYLEADD")){
				sStyleID = "";
				sStyleName = "";
				sFixWidth = "";
				sSkin = "office2003";
				sStyleUploadDir = "uploadfile/";
				sStyleBaseHref = "";
				sStyleContentPath = "";
				sStyleWidth = "550";
				sStyleHeight = "350";
				sStyleMemo = "";
				s_Title = "新增样式";
				s_Action = "StyleAddSave";
				sStyleFileExt = "rar|zip|exe|doc|xls|chm|hlp";
				sStyleFlashExt = "swf";
				sStyleImageExt = "gif|jpg|jpeg|bmp";
				sStyleMediaExt = "rm|mp3|wav|mid|midi|ra|avi|mpg|mpeg|asf|asx|wma|mov";
				sStyleRemoteExt = "gif|jpg|bmp";
				sStyleFileSize = "500";
				sStyleFlashSize = "100";
				sStyleImageSize = "100";
				sStyleMediaSize = "100";
				sStyleRemoteSize = "100";
				sStyleStateFlag = "1";
				sSBCode = "1";
				sSBEdit = "1";
				sSBText = "1";
				sSBView = "1";
				sSBSize = "1";
				sEnterMode = "1";
				sAreaCssMode = "0";
				sFileNameMode = "0";
				sStyleAutoRemote = "1";
				sStyleShowBorder = "0";
				sStyleAllowBrowse = "0";
				sStyleUploadObject = "0";
				sStyleAutoDir = "";
				sStyleDetectFromWord = "1";
				sStyleInitMode = "EDIT";
				sStyleBaseUrl = "1";
				sSLTFlag = "0";
				sSLTMode = "0";
				sSLTCheckFlag = "0";
				sSLTMinSize = "300";
				sSLTOkSize = "120";
				sSYWZFlag = "0";
				sSYText = "版权所有...";
				sSYFontColor = "000000";
				sSYFontSize = "12";
				sSYFontName = "宋体";
				sSYPicPath = "";
				sSLTSYObject = "0";
				sSLTSYExt = "bmp|jpg|jpeg|gif";
				sSYWZMinWidth = "100";
				sSYShadowColor = "FFFFFF";
				sSYShadowOffset = "1";
				sStyleLocalExt = "gif|jpg|bmp|wmz";
				sStyleLocalSize = "100";
				sSYWZMinHeight = "100";
				sSYWZPosition = "1";
				sSYWZTextWidth = "66";
				sSYWZTextHeight = "17";
				sSYWZPaddingH = "5";
				sSYWZPaddingV = "5";
				sSYTPFlag = "0";
				sSYTPMinWidth = "100";
				sSYTPMinHeight = "100";
				sSYTPPosition = "1";
				sSYTPPaddingH = "5";
				sSYTPPaddingV = "5";
				sSYTPImageWidth = "88";
				sSYTPImageHeight = "31";
				sSYTPOpacity = "1";
				sAdvApiFlag = "0";
				sEncryptKey = "";
				sPaginationMode = "1";
				sPaginationKey = "{page}";
				sPaginationAutoFlag = "0";
				sPaginationAutoNum = "2000";
				sSpaceSize = "";
				sMFUMode = "0";
				sMFUBlockSize = "200";
				sMFUEnable = "1";
				sCodeFormat = "2";
				sTB2Flag = "1";
				sTB2Code = "1";
				sTB2Edit = "1";
				sTB2Text = "1";
				sTB2View = "1";
				sTB2Max = "1";
				sShowBlock = "0";
				sFileNameSameFix = "";
				sAutoDirOrderFlag = "0";
				sAutoTypeDirImage = "";
				sAutoTypeDirFlash = "";
				sAutoTypeDirMedia = "";
				sAutoTypeDirAttach = "";
				sAutoTypeDirRemote = "";
				sAutoTypeDirLocal = "";
				sWordImportInitMode = "1";
				sWordImportAPI = "1";
				sQuickFormatInitFontName = "";
				sQuickFormatInitFontSize = "";
				sUIMinHeight = "300";
				sSYValidNormal = "1";
				sSYValidLocal = "";
				sSYValidRemote = "";
				sAutoDoneWordPaste = "";
				sAutoDoneExcelPaste = "";
				sAutoDoneQuickFormat = "";
				sAutoDonePasteOption = "";
			}else{
				sStyleName = myUtil.htmlEncode(sStyleName);
				sFixWidth = myUtil.htmlEncode(sFixWidth);
				sSkin = myUtil.htmlEncode(sSkin);
				sStyleUploadDir = myUtil.htmlEncode(sStyleUploadDir);
				sStyleBaseHref = myUtil.htmlEncode(sStyleBaseHref);
				sStyleContentPath = myUtil.htmlEncode(sStyleContentPath);
				sStyleMemo = myUtil.htmlEncode(sStyleMemo);
				sSYText = myUtil.htmlEncode(sSYText);
				sSYFontColor = myUtil.htmlEncode(sSYFontColor);
				sSYFontSize = myUtil.htmlEncode(sSYFontSize);
				sSYFontName = myUtil.htmlEncode(sSYFontName);
				sSYPicPath = myUtil.htmlEncode(sSYPicPath);
				s_Title = "设置样式";
				s_Action = "StyleSetSave";
			}

			s_FormStateFlag = myUtil.InitCheckBox("d_stateflag", "1", sStyleStateFlag);
			s_FormSBCode = myUtil.InitCheckBox("d_sbcode", "1", sSBCode);
			s_FormSBEdit = myUtil.InitCheckBox("d_sbedit", "1", sSBEdit);
			s_FormSBText = myUtil.InitCheckBox("d_sbtext", "1", sSBText);
			s_FormSBView = myUtil.InitCheckBox("d_sbview", "1", sSBView);
			s_FormSBSize = myUtil.InitCheckBox("d_sbsize", "1", sSBSize);
			
			s_FormTB2Flag = myUtil.InitCheckBox("d_tb2flag", "1", sTB2Flag);
			s_FormTB2Code = myUtil.InitCheckBox("d_tb2code", "1", sTB2Code);
			s_FormTB2Edit = myUtil.InitCheckBox("d_tb2edit", "1", sTB2Edit);
			s_FormTB2Text = myUtil.InitCheckBox("d_tb2text", "1", sTB2Text);
			s_FormTB2View = myUtil.InitCheckBox("d_tb2view", "1", sTB2View);
			s_FormTB2Max = myUtil.InitCheckBox("d_tb2max", "1", sTB2Max);

			s_FormSYValidNormal = myUtil.InitCheckBox("d_syvalidnormal", "1", sSYValidNormal);
			s_FormSYValidLocal = myUtil.InitCheckBox("d_syvalidlocal", "1", sSYValidLocal);
			s_FormSYValidRemote = myUtil.InitCheckBox("d_syvalidremote", "1", sSYValidRemote);

			s_FormAutoDoneWordPaste = myUtil.InitCheckBox("d_autodonewordpaste", "1", sAutoDoneWordPaste);
			s_FormAutoDoneExcelPaste = myUtil.InitCheckBox("d_autodoneexcelpaste", "1", sAutoDoneExcelPaste);
			s_FormAutoDoneQuickFormat = myUtil.InitCheckBox("d_autodonequickformat", "1", sAutoDoneQuickFormat);
			s_FormAutoDonePasteOption = myUtil.InitCheckBox("d_autodonepasteoption", "1", sAutoDonePasteOption);

			s_FormEnterMode = myUtil.InitSelect("d_entermode", myUtil.split("Enter输入<P>，Shift+Enter输入<BR>|Enter输入<BR>，Shift+Enter输入<P>", "|"), myUtil.split("1|2", "|"), sEnterMode, "", "");
			s_FormAreaCssMode = myUtil.InitSelect("d_areacssmode", myUtil.split("常规模式|Word导入模式", "|"), myUtil.split("0|1", "|"), sAreaCssMode, "", "");
			s_FormFileNameMode = myUtil.InitSelect("d_filenamemode", myUtil.split("所有：自动重命名|所有：原文件名|附件按原名，其它自动重命名", "|"), myUtil.split("0|1|2", "|"), sFileNameMode, "", "");

			s_FormAutoRemote = myUtil.InitSelect("d_autoremote", myUtil.split("自动上传|不自动上传", "|"), myUtil.split("1|0", "|"), sStyleAutoRemote, "", "");
			s_FormShowBorder = myUtil.InitSelect("d_showborder", myUtil.split("默认显示|默认不显示", "|"), myUtil.split("1|0", "|"), sStyleShowBorder, "", "");
			s_FormShowBlock = myUtil.InitSelect("d_showblock", myUtil.split("默认显示|默认不显示", "|"), myUtil.split("1|0", "|"), sShowBlock, "", "");
			
			
			
			s_FormAllowBrowse = myUtil.InitSelect("d_allowbrowse", myUtil.split("是,开启|否,关闭", "|"), myUtil.split("1|0", "|"), sStyleAllowBrowse, "", "");
			s_FormMFUMode = myUtil.InitSelect("d_mfumode", myUtil.split("JSP环境自带", "|"), myUtil.split("0", "|"), sMFUMode, "", "");
			s_FormMFUEnable = myUtil.InitSelect("d_mfuenable", myUtil.split("是,开启|否,关闭", "|"), myUtil.split("1|0", "|"), sMFUEnable, "", "");
			s_FormCodeFormat = myUtil.InitSelect("d_codeformat", myUtil.split("关闭|启用:缩进1空格|启用:缩进2空格|启用:缩进3空格|启用:缩进4空格|启用:缩进5空格|启用:缩进6空格|启用:缩进7空格|启用:缩进8空格", "|"), myUtil.split("0|1|2|3|4|5|6|7|8", "|"), sCodeFormat, "", "");

			s_FormUploadObject = myUtil.InitSelect("d_uploadobject", myUtil.split("jspSmartUpload|commons fileupload|struts2|webwork2", "|"), myUtil.split("0|1|2|3", "|"), sStyleUploadObject, "", "");
			s_FormDetectFromWord = myUtil.InitSelect("d_detectfromword", myUtil.split("启用强制纯文本粘贴|启用高级粘贴|不启用", "|"), myUtil.split("2|1|0", "|"), sStyleDetectFromWord, "", "");
			s_FormInitMode = myUtil.InitSelect("d_initmode", myUtil.split("代码模式|编辑模式|文本模式|预览模式", "|"), myUtil.split("CODE|EDIT|TEXT|VIEW", "|"), sStyleInitMode, "", "");
			s_FormBaseUrl = myUtil.InitSelect("d_baseurl", myUtil.split("相对路径|绝对根路径|绝对全路径|站外绝对全路径", "|"), myUtil.split("0|1|2|3", "|"), sStyleBaseUrl, "", "");

			s_FormSLTFlag = myUtil.InitSelect("d_sltflag", myUtil.split("不使用|使用|模拟使用,不生成小图,改大图显示宽高", "|"), myUtil.split("0|1|2", "|"), sSLTFlag, "", "");
			s_FormSLTMode = myUtil.InitSelect("d_sltmode", myUtil.split("大小图:显示小图,链到大图|大小图:显示大图|只生成小图", "|"), myUtil.split("0|1|2", "|"), sSLTMode, "", "");
			s_FormSLTCheckFlag = myUtil.InitSelect("d_sltcheckflag", myUtil.split("宽|高|宽或高", "|"), myUtil.split("0|1|2", "|"), sSLTCheckFlag, "", "");

			s_FormSYWZFlag = myUtil.InitSelect("d_sywzflag", myUtil.split("不使用|使用|前台用户控制", "|"), myUtil.split("0|1|2", "|"), sSYWZFlag, "", "");
			s_FormSLTSYObject = myUtil.InitSelect("d_sltsyobject", myUtil.split("JDK1.4 ImageIO", "|"), myUtil.split("0", "|"), sSLTSYObject, "", "");

			s_FormSYTPFlag = myUtil.InitSelect("d_sytpflag", myUtil.split("不使用|使用|前台用户控制", "|"), myUtil.split("0|1|2", "|"), sSYTPFlag, "", "");
			s_FormSYWZPosition = myUtil.InitSelect("d_sywzposition", myUtil.split("左上|左中|左下|中上|中中|中下|右上|右中|右下", "|"), myUtil.split("1|2|3|4|5|6|7|8|9", "|"), sSYWZPosition, "", "");
			s_FormSYTPPosition = myUtil.InitSelect("d_sytpposition", myUtil.split("左上|左中|左下|中上|中中|中下|右上|右中|右下", "|"), myUtil.split("1|2|3|4|5|6|7|8|9", "|"), sSYTPPosition, "", "");
			s_FormAdvApiFlag = myUtil.InitSelect("d_advapiflag", myUtil.split("禁用|启用一般接口(明文cusdir)|启用高级接口(Session安全)", "|"), myUtil.split("0|1|2", "|"), sAdvApiFlag, "", "");

			s_FormPaginationMode = myUtil.InitSelect("d_paginationmode", myUtil.split("不启用|启用：标准分页符|启用：自定义分页符", "|"), myUtil.split("0|1|2", "|"), sPaginationMode, "", "");
			s_FormPaginationAutoFlag = myUtil.InitSelect("d_paginationautoflag", myUtil.split("不启用|部分启用,内容中已有分页时不启用|完全启用,内容中已有的分页会被替换", "|"), myUtil.split("0|1|2", "|"), sPaginationAutoFlag, "", "");

			s_FormAutoDirOrderFlag = myUtil.InitSelect("d_autodirorderflag", myUtil.split("文件类型目录/年月日目录/|年月日目录/文件类型目录/", "|"), myUtil.split("0|1", "|"), sAutoDirOrderFlag, "", "");
			s_FormWordImportInitMode = myUtil.InitSelect("d_wordimportinitmode", myUtil.split("选择优化模式|全部清除模式", "|"), myUtil.split("1|2", "|"), sWordImportInitMode, "", "");
			s_FormWordImportAPI = myUtil.InitSelect("d_wordimportapi", myUtil.split("界面有选项，初始为[自动处理]|界面有选项，初始为[微软Office]|界面有选项，初始为[金山WPS]|界面无选项，固定为[自动处理]|界面无选项，固定为[微软Office]|界面无选项，固定为[金山WPS]", "|"), myUtil.split("0|1|2|10|11|12", "|"), sWordImportAPI, "", "");

			m_out.print("<table border=0 cellpadding=0 cellspacing=1 align=center class=form>" +
					"<form action='?action=" + s_Action + "&id=" + sStyleID + "' method=post name=myform onsubmit='return checkStyleSetForm(this)'>" +
					"<tr><th colspan=4>&nbsp;&nbsp;" + s_Title + "（鼠标移到输入框可看说明，带*号为必填项）</th></tr>" +
					"<tr><td width='15%'>样式名称：</td><td width='35%'><input type=text class=input size=20 name=d_name title='引用此样式的名字，不要加特殊符号' value=\"" + sStyleName + "\"> <span class=red>*</span></td><td width='15%'>初始模式：</td><td width='35%'>" + s_FormInitMode + " <span class=red>*</span></td></tr>" +
					"<tr><td>限宽模式宽度：</td><td><input type=text class=input size=20 name=d_fixwidth title='留空表示不启用，可以填入如：500px' value=\"" + sFixWidth + "\"></td><td>界面皮肤目录：</td><td><input type=text class=input size=15 name=d_skin title='存放界面皮肤文件的目录名，必须在skin下' value=\"" + sSkin + "\"> <select size=1 id=d_skin_drop onchange='this.form.d_skin.value=this.value'><option>-系统自带-</option><option value='blue1'>blue1</option><option value='blue2'>blue2</option><option value='flat1'>flat1</option><option value='flat2'>flat2</option><option value='flat3'>flat3</option><option value='flat4'>flat4</option><option value='flat5'>flat5</option><option value='flat7'>flat6</option><option value='flat8'>flat7</option><option value='flat8'>flat8</option><option value='flat9'>flat9</option><option value='flat10'>flat10</option><option value='green1'>green1</option><option value='light1'>light1</option><option value='office2000'>office2000</option><option value='office2003'>office2003</option><option value='officexp'>officexp</option><option value='red1'>red1</option><option value='vista1'>vista1</option><option value='yellow1'>yellow1</option></select> <span class=red>*</span></td></tr>" +
					"<tr><td>最佳宽度：</td><td><input type=text class=input name=d_width size=20 title='最佳引用效果的宽度，数字型' value='" + sStyleWidth + "'> <span class=red>*</span></td><td>最佳高度：</td><td><input type=text class=input name=d_height size=20 title='最佳引用效果的高度，数字型' value='" + sStyleHeight + "'> <span class=red>*</span></td></tr>" +
					"<tr><td>显示状态栏及按钮：</td><td>" + s_FormStateFlag + "状态栏 " + s_FormSBCode + "代码 " + s_FormSBEdit + "编辑 " + s_FormSBText + "文本 " + s_FormSBView + "预览 " + s_FormSBSize + "缩放<span class=red>*</span></td><td>高级粘贴自动检测：</td><td>" + s_FormDetectFromWord + " <span class=red>*</span></td></tr>" +
					"<tr><td>非编辑模式工具栏：</td><td>" + s_FormTB2Flag + "工具栏 " + s_FormTB2Code + "代码 " + s_FormTB2Edit + "编辑 " + s_FormTB2Text + "文本 " + s_FormTB2View + "预览 " + s_FormTB2Max + "最大化<span class=red>*</span></td><td>代码格式化：</td><td>" + s_FormCodeFormat + " <span class=red>*</span></td></tr>" +
					"<tr><td>远程文件：</td><td>" + s_FormAutoRemote + " <span class=red>*</span></td><td>显示表格虚框：</td><td>" + s_FormShowBorder + " <span class=red>*</span></td></tr>" +
					"<tr><td>显示区块：</td><td>" + s_FormShowBlock + " <span class=red>*</span></td><td>Word导入初始模式：</td><td>" + s_FormWordImportInitMode + " <span class=red>*</span></td></tr>" +
					"<tr><td>一键排版初始值：</td><td>字体：<input type=text class=input name=d_quickformatinitfontname size=10 title='字体名称' value=\"" + sQuickFormatInitFontName + "\"> 字号：<input type=text class=input name=d_quickformatinitfontsize size=10 title='字体大小' value=\"" + sQuickFormatInitFontSize + "\"></td><td>界面最小高度：</td><td><input type=text class=input name=d_uiminheight size=20 title='数字型' value=\"" + sUIMinHeight + "\"> <span class=red>*</span></td></tr>" +
					"<tr><td>回车换行模式：</td><td>" + s_FormEnterMode + " <span class=red>*</span></td><td>编辑区CSS模式：</td><td>" + s_FormAreaCssMode + " <span class=red>*</span></td></tr>" +
					"<tr><td>高级接口状态：</td><td>" + s_FormAdvApiFlag + " <span class=red>*</span></td><td>安全接口加密串：</td><td><input type=text class=input size=20 name=d_encryptkey title='启用高级Session安全接口时，需要加密串，只能是字母和数字，不能有特殊字符' value=\"" + sEncryptKey + "\"><input type=button value='随机' onclick='CreateRndEncryptKey()'></td></tr>" +
					"<tr><td>一键处理模块：</td><td>" + s_FormAutoDoneWordPaste + "Word粘贴 " + s_FormAutoDoneExcelPaste + "Excel粘贴 " + s_FormAutoDonePasteOption + "选择性粘贴 " + s_FormAutoDoneQuickFormat + "一键排版</td><td>Word导入接口选项：</td><td>"+s_FormWordImportAPI+"</td></tr>" +		
					"<tr><td>备注说明：</td><td colspan=3><input type=text name=d_memo size=90 title='此样式的说明，更有利于调用' value=\"" + sStyleMemo + "\"></td></tr>" + 
					"<tr><td colspan=4><span class=red>&nbsp;&nbsp;&nbsp;上传相关设置（相关设置说明详见用户手册）：</span></td></tr>" +
					"<tr><td>上传组件：</td><td>" + s_FormUploadObject + " <span class=red>*</span></td><td></td><td></td></tr>" +
					"<tr><td>自动目录顺序：</td><td>" + s_FormAutoDirOrderFlag + " <span class=red>*</span></td><td>年月日自动目录：</td><td><input type=text class=input size=18 name=d_autodir title='留空则不启用此功能，可用关键字：{yyyy}、{mm}、{dd}' value=\"" + sStyleAutoDir + "\"> <select size=1 id=d_autodir_drop onchange='this.form.d_autodir.value=this.value'><option>-常用格式选择-</option><option value=''>不启用</option><option value='{yyyy}/'>{yyyy}/</option><option value='{yyyy}/{mm}/'>{yyyy}/{mm}/</option><option value='{yyyy}/{mm}/{dd}/'>{yyyy}/{mm}/{dd}/</option><option value='{yyyy}/{mm}{dd}/'>{yyyy}/{mm}{dd}/</option><option value='{yyyy}{mm}/'>{yyyy}{mm}/</option><option value='{yyyy}{mm}/{dd}/'>{yyyy}{mm}/{dd}/</option><option value='{yyyy}{mm}{dd}/'>{yyyy}{mm}{dd}/</option></select></td></tr>" +
					"<tr><td>文件名保存模式：</td><td>" + s_FormFileNameMode + " <span class=red>*</span></td><td>文件名同名处理：</td><td><input type=text class=input size=18 name=d_filenamesamefix title='留空则为替换已存在文件，可用关键字：{name}、{sn}、{time}' value=\"" + sFileNameSameFix + "\"> <select size=1 id=d_filenamesamefix_drop onchange='this.form.d_filenamesamefix.value=this.value'><option>-常用格式选择-</option><option value=''>替换已存在文件</option><option value='{name}-{sn}'>自动重命名：原名+序号</option><option value='{name}-{time}'>自动重命名：原名+自动时间</option></select></td></tr>" +
					"<tr><td>上传文件浏览：</td><td>" + s_FormAllowBrowse + " <span class=red>*</span></td><td>批量上传功能启用：</td><td>" + s_FormMFUEnable + " <span class=red>*</span></td></tr>" +
					"<tr><td>批量上传接口组件：</td><td>" + s_FormMFUMode + " <span class=red>*</span></td><td>批量上传分块大小：</td><td><input type=text class=input size=20 name=d_mfublocksize title='数字型，单位KB' value=\"" + sMFUBlockSize + "\">KB <span class=red>*</span></td></tr>" +
					"<tr><td>路径模式：</td><td>" + s_FormBaseUrl + " <span class=red>*</span> <a href='#baseurl'>说明</a></td><td>上传路径：</td><td><input type=text class=input size=20 name=d_uploaddir title='上传文件所存放路径，相对eWebEditor根目录文件的路径' value=\"" + sStyleUploadDir + "\"> <span class=red>*</span></td></tr>" +
					"<tr><td>显示路径：</td><td><input type=text class=input size=20 name=d_basehref title='显示内容页所存放路径，必须以&quot;/&quot;开头' value=\"" + sStyleBaseHref + "\"></td><td>内容路径：</td><td><input type=text class=input size=20 name=d_contentpath title='实际保存在内容中的路径，相对显示路径的路径，不能以&quot;/&quot;开头' value=\"" + sStyleContentPath + "\"></td></tr>" +
					"<tr><td colspan=4><span class=red>&nbsp;&nbsp;&nbsp;允许上传文件类型及文件大小设置（文件大小单位为KB，0表示不允许）：</span></td></tr>" +
					"<tr><td>总上传空间限制：</td><td><input type=text class=input name=d_spacesize size=20 title='数字型，单位MB，不限制请留空' value='" + sSpaceSize + "'>MB</td><td></td><td></td></tr>" +
					"<tr><td>图片类型：</td><td colspan=3>文件扩展名：<input type=text class=input name=d_imageext size=30 title='用于图片相关的上传' value='" + sStyleImageExt + "'>&nbsp;&nbsp; 文件大小限制：<input type=text class=input name=d_imagesize size=10 title='数字型，单位KB' value='" + sStyleImageSize + "'>KB&nbsp;&nbsp; 自动类型目录：<input type=text class=input name=d_autotypedirimage size=20 title='空表示不启用，格式如：image/' value=\"" + sAutoTypeDirImage + "\"></td></tr>" +
					"<tr><td>Flash类型：</td><td colspan=3>文件扩展名：<input type=text class=input name=d_flashext size=30 title='用于插入Flash动画' value='" + sStyleFlashExt + "'>&nbsp;&nbsp; 文件大小限制：<input type=text class=input name=d_flashsize size=10 title='数字型，单位KB' value='" + sStyleFlashSize + "'>KB&nbsp;&nbsp; 自动类型目录：<input type=text class=input name=d_autotypedirflash size=20 title='空表示不启用，格式如：flash/' value=\"" + sAutoTypeDirFlash + "\"></td></tr>" +
					"<tr><td>媒体类型：</td><td colspan=3>文件扩展名：<input type=text class=input name=d_mediaext size=30 title='用于插入媒体文件' value='" + sStyleMediaExt + "'>&nbsp;&nbsp; 文件大小限制：<input type=text class=input name=d_mediasize size=10 title='数字型，单位KB' value='" + sStyleMediaSize + "'>KB&nbsp;&nbsp; 自动类型目录：<input type=text class=input name=d_autotypedirmedia size=20 title='空表示不启用，格式如：media/' value=\"" + sAutoTypeDirMedia + "\"></td></tr>" +
					"<tr><td>附件类型：</td><td colspan=3>文件扩展名：<input type=text class=input name=d_fileext size=30 title='用于插入附件' value='" + sStyleFileExt + "'>&nbsp;&nbsp; 文件大小限制：<input type=text class=input name=d_filesize size=10 title='数字型，单位KB' value='" + sStyleFileSize + "'>KB&nbsp;&nbsp; 自动类型目录：<input type=text class=input name=d_autotypedirattach size=20 title='空表示不启用，格式如：attach/' value=\"" + sAutoTypeDirAttach + "\"></td></tr>" +
					"<tr><td>远程类型：</td><td colspan=3>文件扩展名：<input type=text class=input name=d_remoteext size=30 title='用于自动上传远程文件' value='" + sStyleRemoteExt + "'>&nbsp;&nbsp; 文件大小限制：<input type=text class=input name=d_remotesize size=10 title='数字型，单位KB' value='" + sStyleRemoteSize + "'>KB&nbsp;&nbsp; 自动类型目录：<input type=text class=input name=d_autotypedirremote size=20 title='空表示不启用，格式如：remote/' value=\"" + sAutoTypeDirRemote + "\"></td></tr>" +
					"<tr><td>本地类型：</td><td colspan=3>文件扩展名：<input type=text class=input name=d_localext size=30 title='用于自动上传本地文件' value='" + sStyleLocalExt + "'>&nbsp;&nbsp; 文件大小限制：<input type=text class=input name=d_localsize size=10 title='数字型，单位KB' value='" + sStyleLocalSize + "'>KB&nbsp;&nbsp; 自动类型目录：<input type=text class=input name=d_autotypedirlocal size=20 title='空表示不启用，格式如：local/' value=\"" + sAutoTypeDirLocal + "\"></td></tr>" +
					"<tr><td colspan=4><span class=red>&nbsp;&nbsp;&nbsp;分页相关设置（前台显示页应作相应处理以识别分页符）：</span></td></tr>" +
					"<tr><td>分页符模式：</td><td>" + s_FormPaginationMode + " <span class=red>*</span></td><td>自定义分页符关键字：</td><td><input type=text class=input size=20 name=d_paginationkey title='' value=\"" + sPaginationKey + "\"></td></tr>" +
					"<tr><td>提交内容自动分页：</td><td>" + s_FormPaginationAutoFlag + " <span class=red>*</span></td><td>自动分页字数：</td><td><input type=text class=input size=20 name=d_paginationautonum title='当启用自动分页时，将依此值进行自动分页' value=\"" + sPaginationAutoNum + "\"></td></tr>" +
					"<tr><td colspan=4><span class=red>&nbsp;&nbsp;&nbsp;缩略图及水印相关设置：</span></td></tr>" +
					"<tr><td>图形处理组件：</td><td>" + s_FormSLTSYObject + "</td><td>处理图形扩展名：</td><td><input type=text name=d_sltsyext size=20 class=input value=\"" + sSLTSYExt + "\"></td></tr>" +
					"<tr><td>缩略图使用状态：</td><td>" + s_FormSLTFlag + "</td><td>缩略图生成模式：</td><td>" + s_FormSLTMode + "</td></tr>" +
					"<tr><td>缩略图长度条件：</td><td>" + s_FormSLTCheckFlag + "大于<input type=text name=d_sltminsize size=20 class=input title='图形的长度只有达到此最小长度要求时才会生成缩略图，数字型' value='" + sSLTMinSize + "'>px</td><td>缩略图生成长度：</td><td><input type=text name=d_sltoksize size=20 class=input title='生成的缩略图长度值，数字型' value='" + sSLTOkSize + "'>px</td></tr>" +
					"<tr><td>水印有效模块：</td><td>" + s_FormSYValidNormal + "普通上传 " + s_FormSYValidLocal + "本地上传 " + s_FormSYValidRemote + "远程上传</td><td></td><td></td></tr>" +
					"<tr><td>文字水印使用状态：</td><td>" + s_FormSYWZFlag + "</td><td>文字水印启用条件：</td><td>宽:<input type=text name=d_sywzminwidth size=4 class=input title='图形的宽度只有达到此最小宽度要求时才会生成水印，数字型' value='" + sSYWZMinWidth + "'>px&nbsp; 高:<input type=text name=d_sywzminheight size=4 class=input title='图形的高度只有达到此最小高度要求时才会生成水印，数字型' value='" + sSYWZMinHeight + "'>px</td></tr>" +
					"<tr><td>文字水印内容：</td><td><input type=text name=d_sytext size=20 class=input title='当使用文字水印时的文字内容' value=\"" + sSYText + "\"></td><td>文字水印字体颜色：</td><td><input type=text name=d_syfontcolor size=20 class=input title='当使用文字水印时文字的颜色' value=\"" + sSYFontColor + "\"></td></tr>" +
					"<tr><td>文字水印阴影颜色：</td><td><input type=text name=d_syshadowcolor size=20 class=input title='当使用文字水印时的文字阴影颜色' value=\"" + sSYShadowColor + "\"></td><td>文字水印阴影大小：</td><td><input type=text name=d_syshadowoffset size=20 class=input title='当使用文字水印时文字的阴影大小' value=\"" + sSYShadowOffset + "\">px</td></tr>" +
					"<tr><td>文字水印字体大小：</td><td><input type=text name=d_syfontsize size=20 class=input title='当使用文字水印时文字的字体大小' value=\"" + sSYFontSize + "\">px</td><td>文字水印字体名称：</td><td><input type=text name=d_syfontname size=20 class=input title='当使用文字水印时文字的字体名' value=\"" + sSYFontName + "\"></td></tr>" +
					"<tr><td>文字水印位置：</td><td>" + s_FormSYWZPosition + "</td><td>文字水印边距：</td><td>左右:<input type=text name=d_sywzpaddingh size=4 class=input title='居左时作用为左边距，居右时作用为右边距，数字型' value='" + sSYWZPaddingH + "'>px&nbsp; 上下:<input type=text name=d_sywzpaddingv size=4 class=input title='居上时作用为上边距，居下时作用为下边柜，数字型' value='" + sSYWZPaddingV + "'>px</td></tr>" +
					"<tr><td>文字水印文字占位：</td><td>宽:<input type=text name=d_sywztextwidth size=4 class=input title='水印文字的占位宽度，由字数、字体大小等设置的效果确定，数字型' value='" + sSYWZTextWidth + "'>px&nbsp; 高:<input type=text name=d_sywztextheight size=4 class=input title='水印文字的占位高度，由字数、字体大小等设置的效果确定，数字型' value='" + sSYWZTextHeight + "'>px&nbsp; <input type=button value='检测宽高' onclick='doCheckWH(1)'></td><td></td><td></td></tr>" +
					"<tr><td>图片水印使用状态：</td><td>" + s_FormSYTPFlag + "</td><td>图片水印启用条件：</td><td>宽:<input type=text name=d_sytpminwidth size=4 class=input title='图形的宽度只有达到此最小宽度要求时才会生成水印，数字型' value='" + sSYTPMinWidth + "'>px&nbsp; 高:<input type=text name=d_sytpminheight size=4 class=input title='图形的高度只有达到此最小高度要求时才会生成水印，数字型' value='" + sSYTPMinHeight + "'>px</td></tr>" +
					"<tr><td>图片水印位置：</td><td>" + s_FormSYTPPosition + "</td><td>图片水印边距：</td><td>左右:<input type=text name=d_sytppaddingh size=4 class=input title='居左时作用为左边距，居右时作用为右边距，数字型' value='" + sSYTPPaddingH + "'>px&nbsp; 上下:<input type=text name=d_sytppaddingv size=4 class=input title='居上时作用为上边距，居下时作用为下边柜，数字型' value='" + sSYTPPaddingV + "'>px</td></tr>" +
					"<tr><td>图片水印图片路径：</td><td><input type=text name=d_sypicpath size=20 class=input title='当使用图片水印时图片的路径' value=\"" + sSYPicPath + "\"></td><td>图片水印透明度：</td><td><input type=text name=d_sytpopacity size=20 class=input title='0至1间的数字，如0.5表示半透明' value=\"" + sSYTPOpacity + "\"></td></tr>" +
					"<tr><td>图片水印图片占位：</td><td>宽:<input type=text name=d_sytpimagewidth size=4 class=input title='水印图片的宽度，数字型' value='" + sSYTPImageWidth + "'>px&nbsp; 高:<input type=text name=d_sytpimageheight size=4 class=input title='水印图片的高度，数字型' value='" + sSYTPImageHeight + "'>px&nbsp; <input type=button value='检测宽高' onclick='doCheckWH(2)'></td><td></td><td></td></tr>" +
					"<tr><td>水印宽高检测区：</td><td colspan=3><span id=tdPreview></span></td></tr>" +	
					"<tr><td align=center colspan=4><input type=submit value='  提交  ' align=absmiddle>&nbsp;<input type=reset name=btnReset value='  重填  '></td></tr>" +
					"</form>" +
					"</table><br>");

			String s_Msg = "<a name=baseurl></a><p><span class=blue><b>路径模式设置说明：</b></span><br>" +
				"<b>相对路径：</b>指所有的相关上传或自动插入文件路径，编辑后都以\"UploadFile/...\"或\"../UploadFile/...\"形式呈现，当使用此模式时，显示路径和内容路径必填，显示路径必须以\"/\"开头和结尾，内容路径设置中不能以\"/\"开头。<br>" +
				"<b>绝对根路径：</b>指所有的相关上传或自动插入文件路径，编辑后都以\"/eWebEditor/UploadFile/...\"这种形式呈现，当使用此模式时，显示路径和内容路径不必填。<br>" +
				"<b>绝对全路径：</b>指所有的相关上传或自动插入文件路径，编辑后都以\"http://xxx.xxx.xxx/eWebEditor/UploadFile/...\"这种形式呈现，当使用此模式时，显示路径和内容路径不必填。<br>" +
				"<b>站外绝对全路径：</b>当使用此模式时，上传路径必须是实际物理路径，如：\"c:\\xxx\\\"；显示路径为空；内容路径必须以\"http\"开头。</p>";

			m_out.print(myUtil.GetMessage(s_Msg));


		}else if(myUtil.sAction.equals("STYLEADDSAVE") || myUtil.sAction.equals("STYLESETSAVE")){


			sStyleName = myUtil.dealNull(m_request.getParameter("d_name"));
			sFixWidth = myUtil.dealNull(m_request.getParameter("d_fixwidth"));
			sSkin = myUtil.dealNull(m_request.getParameter("d_skin"));
			sStyleUploadDir = myUtil.dealNull(m_request.getParameter("d_uploaddir"));
			sStyleWidth = myUtil.dealNull(m_request.getParameter("d_width"));
			sStyleHeight = myUtil.dealNull(m_request.getParameter("d_height"));
			sStyleFileExt = myUtil.dealNull(m_request.getParameter("d_fileext"));
			sStyleFlashExt = myUtil.dealNull(m_request.getParameter("d_flashext"));
			sStyleImageExt = myUtil.dealNull(m_request.getParameter("d_imageext"));
			sStyleMediaExt = myUtil.dealNull(m_request.getParameter("d_mediaext"));
			sStyleRemoteExt = myUtil.dealNull(m_request.getParameter("d_remoteext"));
			sStyleFileSize = myUtil.dealNull(m_request.getParameter("d_filesize"));
			sStyleFlashSize = myUtil.dealNull(m_request.getParameter("d_flashsize"));
			sStyleImageSize = myUtil.dealNull(m_request.getParameter("d_imagesize"));
			sStyleMediaSize = myUtil.dealNull(m_request.getParameter("d_mediasize"));
			sStyleRemoteSize = myUtil.dealNull(m_request.getParameter("d_remotesize"));
			sStyleStateFlag = myUtil.dealNull(m_request.getParameter("d_stateflag"));
			sStyleDetectFromWord = myUtil.dealNull(m_request.getParameter("d_detectfromword"));
			sStyleInitMode = myUtil.dealNull(m_request.getParameter("d_initmode"));
			sStyleBaseUrl = myUtil.dealNull(m_request.getParameter("d_baseurl"));
			sStyleUploadObject = myUtil.dealNull(m_request.getParameter("d_uploadobject"));

			sStyleBaseHref = myUtil.dealNull(m_request.getParameter("d_basehref"));
			sStyleContentPath = myUtil.dealNull(m_request.getParameter("d_contentpath"));
			sStyleAutoRemote = myUtil.dealNull(m_request.getParameter("d_autoremote"));
			sStyleShowBorder = myUtil.dealNull(m_request.getParameter("d_showborder"));
			sStyleMemo = myUtil.dealNull(m_request.getParameter("d_memo"));
			sSLTFlag = myUtil.dealNull(m_request.getParameter("d_sltflag"));
			sSLTMinSize = myUtil.dealNull(m_request.getParameter("d_sltminsize"));
			sSLTOkSize = myUtil.dealNull(m_request.getParameter("d_sltoksize"));
			sSYWZFlag = myUtil.dealNull(m_request.getParameter("d_sywzflag"));
			sSYText = myUtil.dealNull(m_request.getParameter("d_sytext"));
			sSYFontColor = myUtil.dealNull(m_request.getParameter("d_syfontcolor"));
			sSYFontSize = myUtil.dealNull(m_request.getParameter("d_syfontsize"));
			sSYFontName = myUtil.dealNull(m_request.getParameter("d_syfontname"));
			sSYPicPath = myUtil.dealNull(m_request.getParameter("d_sypicpath"));
			sSLTSYObject = myUtil.dealNull(m_request.getParameter("d_sltsyobject"));
			sSLTSYExt = myUtil.dealNull(m_request.getParameter("d_sltsyext"));
			sSYWZMinWidth = myUtil.dealNull(m_request.getParameter("d_sywzminwidth"));
			sSYShadowColor = myUtil.dealNull(m_request.getParameter("d_syshadowcolor"));
			sSYShadowOffset = myUtil.dealNull(m_request.getParameter("d_syshadowoffset"));
			sStyleAllowBrowse = myUtil.dealNull(m_request.getParameter("d_allowbrowse"));
			sStyleLocalExt = myUtil.dealNull(m_request.getParameter("d_localext"));
			sStyleLocalSize = myUtil.dealNull(m_request.getParameter("d_localsize"));
			sSYWZMinHeight = myUtil.dealNull(m_request.getParameter("d_sywzminheight"));
			sSYWZPosition = myUtil.dealNull(m_request.getParameter("d_sywzposition"));
			sSYWZTextWidth = myUtil.dealNull(m_request.getParameter("d_sywztextwidth"));
			sSYWZTextHeight = myUtil.dealNull(m_request.getParameter("d_sywztextheight"));
			sSYWZPaddingH = myUtil.dealNull(m_request.getParameter("d_sywzpaddingh"));
			sSYWZPaddingV = myUtil.dealNull(m_request.getParameter("d_sywzpaddingv"));
			sSYTPFlag = myUtil.dealNull(m_request.getParameter("d_sytpflag"));
			sSYTPMinWidth = myUtil.dealNull(m_request.getParameter("d_sytpminwidth"));
			sSYTPMinHeight = myUtil.dealNull(m_request.getParameter("d_sytpminheight"));
			sSYTPPosition = myUtil.dealNull(m_request.getParameter("d_sytpposition"));
			sSYTPPaddingH = myUtil.dealNull(m_request.getParameter("d_sytppaddingh"));
			sSYTPPaddingV = myUtil.dealNull(m_request.getParameter("d_sytppaddingv"));
			sSYTPImageWidth = myUtil.dealNull(m_request.getParameter("d_sytpimagewidth"));
			sSYTPImageHeight = myUtil.dealNull(m_request.getParameter("d_sytpimageheight"));
			sSYTPOpacity = myUtil.dealNull(m_request.getParameter("d_sytpopacity"));
			sAdvApiFlag = myUtil.dealNull(m_request.getParameter("d_advapiflag"));
			sSBCode = myUtil.dealNull(m_request.getParameter("d_sbcode"));
			sSBEdit = myUtil.dealNull(m_request.getParameter("d_sbedit"));
			sSBText = myUtil.dealNull(m_request.getParameter("d_sbtext"));
			sSBView = myUtil.dealNull(m_request.getParameter("d_sbview"));
			sEnterMode = myUtil.dealNull(m_request.getParameter("d_entermode"));
			sAreaCssMode = myUtil.dealNull(m_request.getParameter("d_areacssmode"));
			sFileNameMode = myUtil.dealNull(m_request.getParameter("d_filenamemode"));
			sSLTMode = myUtil.dealNull(m_request.getParameter("d_sltmode"));
			sEncryptKey = myUtil.dealNull(m_request.getParameter("d_encryptkey"));
			sStyleAutoDir = myUtil.dealNull(m_request.getParameter("d_autodir"));
			sPaginationMode = myUtil.dealNull(m_request.getParameter("d_paginationmode"));
			sPaginationKey = myUtil.dealNull(m_request.getParameter("d_paginationkey"));
			sPaginationAutoFlag = myUtil.dealNull(m_request.getParameter("d_paginationautoflag"));
			sPaginationAutoNum = myUtil.dealNull(m_request.getParameter("d_paginationautonum"));
			sSBSize = myUtil.dealNull(m_request.getParameter("d_sbsize"));
			sSLTCheckFlag = myUtil.dealNull(m_request.getParameter("d_sltcheckflag"));
			sSpaceSize = myUtil.dealNull(m_request.getParameter("d_spacesize"));
			sMFUMode = myUtil.dealNull(m_request.getParameter("d_mfumode"));
			sMFUBlockSize = myUtil.dealNull(m_request.getParameter("d_mfublocksize"));
			sMFUEnable = myUtil.dealNull(m_request.getParameter("d_mfuenable"));
			sCodeFormat = myUtil.dealNull(m_request.getParameter("d_codeformat"));
			sTB2Flag = myUtil.dealNull(m_request.getParameter("d_tb2flag"));
			sTB2Code = myUtil.dealNull(m_request.getParameter("d_tb2code"));
			sTB2Edit = myUtil.dealNull(m_request.getParameter("d_tb2edit"));
			sTB2Text = myUtil.dealNull(m_request.getParameter("d_tb2text"));
			sTB2View = myUtil.dealNull(m_request.getParameter("d_tb2view"));
			sTB2Max = myUtil.dealNull(m_request.getParameter("d_tb2max"));
			sShowBlock = myUtil.dealNull(m_request.getParameter("d_showblock"));
			sFileNameSameFix = myUtil.dealNull(m_request.getParameter("d_filenamesamefix"));
			sAutoDirOrderFlag = myUtil.dealNull(m_request.getParameter("d_autodirorderflag"));
			sAutoTypeDirImage = myUtil.dealNull(m_request.getParameter("d_autotypedirimage"));
			sAutoTypeDirFlash = myUtil.dealNull(m_request.getParameter("d_autotypedirflash"));
			sAutoTypeDirMedia = myUtil.dealNull(m_request.getParameter("d_autotypedirmedia"));
			sAutoTypeDirAttach = myUtil.dealNull(m_request.getParameter("d_autotypedirattach"));
			sAutoTypeDirRemote = myUtil.dealNull(m_request.getParameter("d_autotypedirremote"));
			sAutoTypeDirLocal = myUtil.dealNull(m_request.getParameter("d_autotypedirlocal"));
			sWordImportInitMode = myUtil.dealNull(m_request.getParameter("d_wordimportinitmode"));
			sWordImportAPI = myUtil.dealNull(m_request.getParameter("d_wordimportapi"));
			sQuickFormatInitFontName = myUtil.dealNull(m_request.getParameter("d_quickformatinitfontname"));
			sQuickFormatInitFontSize = myUtil.dealNull(m_request.getParameter("d_quickformatinitfontsize"));
			sUIMinHeight = myUtil.dealNull(m_request.getParameter("d_uiminheight"));
			sSYValidNormal = myUtil.dealNull(m_request.getParameter("d_syvalidnormal"));
			sSYValidLocal = myUtil.dealNull(m_request.getParameter("d_syvalidlocal"));
			sSYValidRemote = myUtil.dealNull(m_request.getParameter("d_syvalidremote"));
			sAutoDoneWordPaste = myUtil.dealNull(m_request.getParameter("d_autodonewordpaste"));
			sAutoDoneExcelPaste = myUtil.dealNull(m_request.getParameter("d_autodoneexcelpaste"));
			sAutoDoneQuickFormat = myUtil.dealNull(m_request.getParameter("d_autodonequickformat"));
			sAutoDonePasteOption = myUtil.dealNull(m_request.getParameter("d_autodonepasteoption"));

			if(myUtil.sAction.equals("STYLEADDSAVE")){

				if (StyleName2ID(sStyleName, myUtil.aStyle) != -1) {
					m_out.print(myUtil.getError("此样式名已经存在，请用另一个样式名！"));
					return;
				}

				myUtil.aStyle.add(GetStyleDataString());

				if (!myUtil.WriteConfig(myUtil.sLicense, myUtil.sUsername, myUtil.sPassword, myUtil.aStyle, myUtil.aToolbar)){
					m_out.print(myUtil.getError("Error: getRealPath"));
					return;
				};

				m_out.print(myUtil.GetMessage("<b><span class=red>样式增加成功！</span></b><li><a href='?action=toolbar&id=" + String.valueOf(myUtil.aStyle.size()-1) + "'>设置此样式下的工具栏</a>"));

			}else if(myUtil.sAction.equals("STYLESETSAVE")){

				String s_OldStyleName = "";
				sStyleID = myUtil.dealNull(m_request.getParameter("id"));
				if (myUtil.isNumber(sStyleID)) {
					int n_SN2ID = StyleName2ID(sStyleName, myUtil.aStyle);
					if (!String.valueOf(n_SN2ID).equals(sStyleID) && (n_SN2ID != -1)) {
						m_out.print(myUtil.getError("此样式名已经存在，请用另一个样式名！"));
						return;
					}
					
					nStyleID = Integer.valueOf(sStyleID).intValue();
					if ((nStyleID < 1) && (nStyleID>=myUtil.aStyle.size())) {
						m_out.print(myUtil.getError("无效的样式ID号，请通过页面上的链接进行操作！"));
						return;
					}

					s_OldStyleName = myUtil.split(myUtil.aStyle.get(nStyleID).toString(), "|||")[0];

					myUtil.aStyle.set(nStyleID, GetStyleDataString());

				}else{
					m_out.print(myUtil.getError("无效的样式ID号，请通过页面上的链接进行操作！"));
					return;
				}

				if (!myUtil.WriteConfig(myUtil.sLicense, myUtil.sUsername, myUtil.sPassword, myUtil.aStyle, myUtil.aToolbar)){
					m_out.print(myUtil.getError("Error: getRealPath"));
					return;
				};

				m_out.print(myUtil.GetMessage("<b><span class=red>样式修改成功！</span></b><li><a href='?action=stylepreview&id=" + sStyleID + "' target='_blank'>预览此样式</a><li><a href='?action=toolbar&id=" + sStyleID + "'>设置此样式下的工具栏</a><li><a href='?action=styleset&id=" + sStyleID + "'>重新设置此样式</a>"));

			}

		}else if(myUtil.sAction.equals("CODE")){

			m_out.print("<table border=0 cellspacing=1 align=center class=list>" +
				"<tr><th>样式（" + myUtil.htmlEncode(sStyleName) + "）的最佳调用代码如下（其中XXX按实际关联的表单项进行修改）：</th></tr>" +
				"<tr><td><textarea rows=5 cols=65 style='width:100%'><IFRAME ID=\"eWebEditor1\" SRC=\"ewebeditor.htm?id=XXX&style=" + sStyleName + "\" FRAMEBORDER=\"0\" SCROLLING=\"no\" WIDTH=\"" + sStyleWidth + "\" HEIGHT=\"" + sStyleHeight + "\"></IFRAME></textarea></td></tr>" +
				"</table>");


		}else if(myUtil.sAction.equals("BUTTONSET")){

			for(int nLoop=0; nLoop<1; nLoop++){

				m_out.print(myUtil.GetMessage("<b class=blue>当前样式：<span class=red>" + myUtil.htmlEncode(sStyleName) + "</span>&nbsp;&nbsp;当前工具栏：<span class=red>" + myUtil.htmlEncode(sToolBarName) + "</span></b>"));

				m_out.print("<script language='javascript' src='../js/buttons.js'></script>");
				m_out.print("<script language='javascript' src='../js/zh-cn.js'></script>");

				m_out.print("<table border=0 cellpadding=5 cellspacing=0 align=center>"+
					"<form action='?action=buttonsave&id=" + sStyleID + "&toolbarid=" + sToolBarID + "' method=post name=myform>"+
					"<tr align=center><td>可选按钮</td><td></td><td>已选按钮</td><td></td></tr>"+
					"<tr>"+
						"<td><DIV id=div1 style='BORDER-RIGHT: 1.5pt inset; PADDING-RIGHT: 0px; BORDER-TOP: 1.5pt inset; PADDING-LEFT: 0px; PADDING-BOTTOM: 0px; OVERFLOW: auto; BORDER-LEFT: 1.5pt inset; WIDTH: 250px; PADDING-TOP: 0px; BORDER-BOTTOM: 1.5pt inset; HEIGHT: 350px; BACKGROUND-COLOR: white'></DIV></td>"+
						"<td><input type=button name=b1 value=' → ' onclick='Add()'><br><br><input type=button name=b1 value=' ← ' onclick='Del()'></td>"+
						"<td><DIV id=div2 style='BORDER-RIGHT: 1.5pt inset; PADDING-RIGHT: 0px; BORDER-TOP: 1.5pt inset; PADDING-LEFT: 0px; PADDING-BOTTOM: 0px; OVERFLOW: auto; BORDER-LEFT: 1.5pt inset; WIDTH: 250px; PADDING-TOP: 0px; BORDER-BOTTOM: 1.5pt inset; HEIGHT: 350px; BACKGROUND-COLOR: white'></DIV></td>"+
						"<td><input type=button name=b3 value='↑' onclick='Up()'><br><br><br><input type=button name=b4 value='↓' onclick='Down()'></td>"+
					"</tr>"+
					"<input type=hidden name='d_button' value='" + sToolBarButton + "'>"+
					"<tr><td colspan=4 align=right><input type=submit name=b value=' 保存设置 '></td></tr>"+
					"</form>"+
					"</table>");

				m_out.print("<script language=javascript>"+
					"initButtonOptions('" + sSkin + "');"+
					"</script>");

				m_out.print(myUtil.GetMessage("<b class=blue>提示：</b>你可以通过按“Ctrl”“Shift”来快速多选定，可以在指定项上“双击”快速增加或删除项。可以选定多个按钮同时上移或下移操作。"));

			}

		}else if(myUtil.sAction.equals("BUTTONSAVE")){

			String s_Button = myUtil.dealNull(m_request.getParameter("d_button"));
			String[] aCurrToolbar = myUtil.split(myUtil.aToolbar.get(nToolBarID).toString(), "|||");
			myUtil.aToolbar.remove(nToolBarID);
			myUtil.aToolbar.add(nToolBarID, aCurrToolbar[0] + "|||" + s_Button + "|||" + aCurrToolbar[2] + "|||" + aCurrToolbar[3]);

			if (!myUtil.WriteConfig(myUtil.sLicense, myUtil.sUsername, myUtil.sPassword, myUtil.aStyle, myUtil.aToolbar)){
				m_out.print(myUtil.getError("Error: getRealPath"));
				return;
			};

			m_out.print(myUtil.GetMessage("<b><span class=red>工具栏按钮设置保存成功！</span></b><li><a href='?action=stylepreview&id=" + sStyleID + "' target='_blank'>预览此样式</a><li><a href='?action=toolbar&id=" + sStyleID + "'>返回工具栏管理</a><li><a href='?action=buttonset&id=" + sStyleID + "&toolbarid=" + sToolBarID + "'>重新设置此工具栏下的按钮</a>"));


		}else if(myUtil.sAction.equals("TOOLBAR") || myUtil.sAction.equals("TOOLBARADD") || myUtil.sAction.equals("TOOLBARMODI") || myUtil.sAction.equals("TOOLBARDEL")){

			if(myUtil.sAction.equals("TOOLBARADD")){

				String sToolbarAdd_Name = myUtil.dealNull(m_request.getParameter("d_name"));
				String sToolbarAdd_Order = myUtil.dealNull(m_request.getParameter("d_order"));
				if (sToolbarAdd_Name.equals("")) {
					m_out.print(myUtil.getError("工具栏名不能为空！"));
					return;
				}
				if (!myUtil.isNumber(sToolbarAdd_Order)) {
					m_out.print(myUtil.getError("无效的工具栏排序号，排序号必须为数字！"));
					return;
				}

				myUtil.aToolbar.add(sStyleID + "||||||" + sToolbarAdd_Name + "|||" + sToolbarAdd_Order);

				if (!myUtil.WriteConfig(myUtil.sLicense, myUtil.sUsername, myUtil.sPassword, myUtil.aStyle, myUtil.aToolbar)){
					m_out.print(myUtil.getError("Error: getRealPath"));
					return;
				};

				m_out.print("<script language=javascript>alert(\"工具栏（" + myUtil.htmlEncode(sToolbarAdd_Name) + "）增加操作成功！\");</script>");
				m_out.print(myUtil.GetGoUrl("?action=toolbar&id=" + sStyleID));
				return;

			}else if(myUtil.sAction.equals("TOOLBARMODI")){

				for(int i=0; i<myUtil.aToolbar.size(); i++){
					String[] aCurrToolbar = myUtil.split(myUtil.aToolbar.get(i).toString(), "|||");
					if (aCurrToolbar[0].equals(sStyleID)) {
						String s_Name = myUtil.dealNull(m_request.getParameter("d_name"+String.valueOf(i)));
						String s_Order = myUtil.dealNull(m_request.getParameter("d_order"+String.valueOf(i)));
						if (s_Name.equals("") || !myUtil.isNumber(s_Order)) {
							aCurrToolbar[0] = "";
							s_Name = "";
						}
						myUtil.aToolbar.remove(i);
						myUtil.aToolbar.add(i, aCurrToolbar[0] + "|||" + aCurrToolbar[1] + "|||" + s_Name + "|||" + s_Order);
					}
				}

				if (!myUtil.WriteConfig(myUtil.sLicense, myUtil.sUsername, myUtil.sPassword, myUtil.aStyle, myUtil.aToolbar)){
					m_out.print(myUtil.getError("Error: getRealPath"));
					return;
				};

				m_out.print("<script language=javascript>alert('工具栏修改操作成功！');</script>");
				m_out.print(myUtil.GetGoUrl("?action=toolbar&id=" + sStyleID));
				return;
				
			}else if(myUtil.sAction.equals("TOOLBARDEL")){

				String s_DelID = myUtil.dealNull(m_request.getParameter("delid"));
				if (myUtil.isNumber(s_DelID)) {
					myUtil.aToolbar.remove(Integer.valueOf(s_DelID).intValue());
					
					if (!myUtil.WriteConfig(myUtil.sLicense, myUtil.sUsername, myUtil.sPassword, myUtil.aStyle, myUtil.aToolbar)){
						m_out.print(myUtil.getError("Error: getRealPath"));
						return;
					};

					m_out.print("<script language=javascript>alert('工具栏（ID：" + s_DelID + "）删除操作成功！');</script>");
					m_out.print(myUtil.GetGoUrl("?action=toolbar&id=" + sStyleID));
					return;
				}

			}


			// Show Toolbar List

			m_out.print(myUtil.GetMessage("<b class=blue>样式（" + myUtil.htmlEncode(sStyleName) + "）下的工具栏管理：</b>"));

			int n_ToolbarMaxOrder = 0;
			for(int i=0; i<myUtil.aToolbar.size(); i++){
				String[] aCurrToolbar = myUtil.split(myUtil.aToolbar.get(i).toString(), "|||");
				if (aCurrToolbar[0].equals(sStyleID)){
					if (Integer.valueOf(aCurrToolbar[3]).intValue() > n_ToolbarMaxOrder){
						n_ToolbarMaxOrder = Integer.valueOf(aCurrToolbar[3]).intValue();
					}
				}
			}
			n_ToolbarMaxOrder = n_ToolbarMaxOrder + 1;

			m_out.print("<hr width='80%' align=center size=1><table border=0 cellpadding=4 cellspacing=0 align=center>" +
				"<form action='?id=" + sStyleID + "&action=toolbaradd' name='addform' method=post>" +
				"<tr><td>工具栏名：<input type=text name=d_name size=20 class=input value='工具栏" + String.valueOf(n_ToolbarMaxOrder) + "'> 排序号：<input type=text name=d_order size=5 value='" + String.valueOf(n_ToolbarMaxOrder) + "' class=input> <input type=submit name=b1 value='新增工具栏'></td></tr>" +
				"</form></table><hr width='80%' align=center size=1>");

			m_out.print("<form action='?id=" + sStyleID + "&action=toolbarmodi' name=modiform method=post>" +
				"<table border=0 cellpadding=0 cellspacing=1 align=center class=form>" +
				"<tr align=center><th>ID</th><th>工具栏名</th><th>排序号</th><th>操作</th></tr>");

			for (int i=0; i<myUtil.aToolbar.size(); i++){
				String[] aCurrToolbar = myUtil.split(myUtil.aToolbar.get(i).toString(), "|||");
				if (aCurrToolbar[0].equals(sStyleID)){
					String s_Manage = "<a href='?id=" + sStyleID + "&action=buttonset&toolbarid=" + String.valueOf(i) + "'>按钮设置</a>";
					s_Manage = s_Manage + "|<a href='?id=" + sStyleID + "&action=toolbardel&delid=" + String.valueOf(i) + "'>删除</a>";
					m_out.print("<tr align=center>" +
						"<td>" + String.valueOf(i) + "</td>" +
						"<td><input type=text name='d_name" + String.valueOf(i) + "' value=\"" + myUtil.htmlEncode(aCurrToolbar[2]) + "\" size=30 class=input></td>" +
						"<td><input type=text name='d_order" + String.valueOf(i) + "' value='" + aCurrToolbar[3] + "' size=5 class=input></td>" +
						"<td>" + s_Manage + "</td>" +
						"</tr>");
				}
			}

			m_out.print("<tr><td colspan=4 align=center><input type=submit name=b1 value='  修改  '></td></tr>");
			m_out.print("</table></form>");

		}else{
			if(myUtil.sAction.equals("COPY")){
				
				String sNewName = "";
				int n_CopyID = 0;
				boolean b = false;
				while(!b){
					n_CopyID = n_CopyID + 1;
					sNewName = sStyleName + String.valueOf(n_CopyID);
					if (StyleName2ID(sNewName, myUtil.aStyle) == -1) {
						b = true;
					}
				}

				myUtil.aStyle.add(sNewName + myUtil.aStyle.get(nStyleID).toString().substring(sStyleName.length(), myUtil.aStyle.get(nStyleID).toString().length()));

				int nToolbarNum = myUtil.aToolbar.size();
				for (int i=0; i<nToolbarNum; i++){
					String[] aCurrToolbar = myUtil.split(myUtil.aToolbar.get(i).toString(), "|||");
					if (aCurrToolbar[0].equals(sStyleID)) {
						myUtil.aToolbar.add(String.valueOf(myUtil.aStyle.size()-1) + "|||" + aCurrToolbar[1] + "|||" + aCurrToolbar[2] + "|||" + aCurrToolbar[3]);
					}
				}

				if (!myUtil.WriteConfig(myUtil.sLicense, myUtil.sUsername, myUtil.sPassword, myUtil.aStyle, myUtil.aToolbar)){
					m_out.print(myUtil.getError("Error: getRealPath"));
					return;
				};

				m_out.print(myUtil.GetGoUrl("?"));
				return;
				

			}else if(myUtil.sAction.equals("STYLEDEL")){

				myUtil.aStyle.remove(nStyleID);
				myUtil.aStyle.add(nStyleID, "");
				
				if (!myUtil.WriteConfig(myUtil.sLicense, myUtil.sUsername, myUtil.sPassword, myUtil.aStyle, myUtil.aToolbar)){
					m_out.print(myUtil.getError("Error: getRealPath"));
					return;
				};

				m_out.print(myUtil.GetGoUrl("?"));
				return;
			}
			

			// Show Style List
			m_out.print(myUtil.GetMessage("<b class=blue>以下为当前所有样式列表：</b>"));

			m_out.print("<table border=0 cellpadding=0 cellspacing=1 class=list align=center>" + 
				"<form action='?action=del' method=post name=myform>" + 
				"<tr align=center>" +
					"<th width='10%'>样式名</th>" +
					"<th width='10%'>最佳宽度</th>" +
					"<th width='10%'>最佳高度</th>" +
					"<th width='45%'>说明</th>" +
					"<th width='25%'>管理</th>" +
				"</tr>");

			for(int i=0; i<myUtil.aStyle.size(); i++){
				String[] aCurrStyle = myUtil.split(myUtil.aStyle.get(i).toString(), "|||");
				String sManage = "<a href='?action=stylepreview&id=" + String.valueOf(i) + "' target='_blank'>预览</a>|<a href='?action=code&id=" + String.valueOf(i) + "'>代码</a>|<a href='?action=styleset&id=" + String.valueOf(i) + "'>设置</a>|<a href='?action=toolbar&id=" + String.valueOf(i) + "'>工具栏</a>|<a href='?action=copy&id=" + String.valueOf(i) + "'>拷贝</a>|<a href='?action=styledel&id=" + String.valueOf(i) + "' onclick=\"return confirm('提示：您确定要删除此样式吗？')\">删除</a>";
				m_out.print("<tr align=center>" +
					"<td>" + myUtil.htmlEncode(aCurrStyle[0]) + "</td>" +
					"<td>" + aCurrStyle[4] + "</td>" +
					"<td>" + aCurrStyle[5] + "</td>" +
					"<td align=left>" + myUtil.htmlEncode(aCurrStyle[26]) + "</td>" +
					"<td>" + sManage + "</td>" +
					"</tr>");
			}
			
			m_out.print("</table><br>");

			m_out.print(myUtil.GetMessage("<b class=blue>提示：</b>你可以通过“拷贝”一样式以达到快速新建样式的目的。"));

		}


		m_out.print(myUtil.Footer());

	}



	private int StyleName2ID(String str, ArrayList a_Style){
		for (int i=0; i<a_Style.size(); i++){
			if (myUtil.split(a_Style.get(i).toString(), "|||")[0].toLowerCase().equals(str.toLowerCase())){
				return i;
			}
		}
		return -1;
	}

	private String GetStyleDataString(){
		return (sStyleName + "|||" + sFixWidth + "|||" + sSkin + "|||" + sStyleUploadDir + "|||" + sStyleWidth + "|||" + sStyleHeight + "|||" + sStyleFileExt + "|||" + sStyleFlashExt + "|||" + sStyleImageExt + "|||" + sStyleMediaExt + "|||" + sStyleRemoteExt + "|||" + sStyleFileSize + "|||" + sStyleFlashSize + "|||" + sStyleImageSize + "|||" + sStyleMediaSize + "|||" + sStyleRemoteSize + "|||" + sStyleStateFlag + "|||" + sStyleDetectFromWord + "|||" + sStyleInitMode + "|||" + sStyleBaseUrl + "|||" + sStyleUploadObject + "||||||" + sStyleBaseHref + "|||" + sStyleContentPath + "|||" + sStyleAutoRemote + "|||" + sStyleShowBorder + "|||" + sStyleMemo + "|||1|||zh-cn|||" + sSLTFlag + "|||" + sSLTMinSize + "|||" + sSLTOkSize + "|||" + sSYWZFlag + "|||" + sSYText + "|||" + sSYFontColor + "|||" + sSYFontSize + "|||" + sSYFontName + "|||" + sSYPicPath + "|||" + sSLTSYObject + "|||" + sSLTSYExt + "|||" + sSYWZMinWidth + "|||" + sSYShadowColor + "|||" + sSYShadowOffset + "|||" + sStyleAllowBrowse + "|||" + sStyleLocalExt + "|||" + sStyleLocalSize + "|||" + sSYWZMinHeight + "|||" + sSYWZPosition + "|||" + sSYWZTextWidth + "|||" + sSYWZTextHeight + "|||" + sSYWZPaddingH + "|||" + sSYWZPaddingV + "|||" + sSYTPFlag + "|||" + sSYTPMinWidth + "|||" + sSYTPMinHeight + "|||" + sSYTPPosition + "|||" + sSYTPPaddingH + "|||" + sSYTPPaddingV + "|||" + sSYTPImageWidth + "|||" + sSYTPImageHeight + "|||" + sSYTPOpacity + "|||" + sAdvApiFlag  + "|||" + sSBCode  + "|||" + sSBEdit  + "|||" + sSBText  + "|||" + sSBView + "|||" + sEnterMode + "|||" + sAreaCssMode + "|||" + sFileNameMode + "|||" + sSLTMode + "|||" + sEncryptKey + "|||" + sStyleAutoDir + "|||" + sPaginationMode + "|||" + sPaginationKey + "|||" + sPaginationAutoFlag + "|||" + sPaginationAutoNum + "|||" + sSBSize + "|||" + sSLTCheckFlag + "|||" + sSpaceSize + "|||" + sMFUMode + "|||" + sMFUBlockSize + "|||" + sMFUEnable + "|||" + sCodeFormat + "|||" + sTB2Flag + "|||" + sTB2Code + "|||" + sTB2Max + "|||" + sShowBlock + "|||" + sFileNameSameFix + "|||" + sAutoDirOrderFlag + "|||" + sAutoTypeDirImage + "|||" + sAutoTypeDirFlash + "|||" + sAutoTypeDirMedia + "|||" + sAutoTypeDirAttach + "|||" + sAutoTypeDirRemote + "|||" + sAutoTypeDirLocal + "|||" + sWordImportInitMode + "|||" + sQuickFormatInitFontName + "|||" + sQuickFormatInitFontSize + "|||" + sUIMinHeight + "|||" + sSYValidNormal + "|||" + sSYValidLocal + "|||" + sSYValidRemote + "|||" + sAutoDoneWordPaste + "|||" + sAutoDoneExcelPaste + "|||" + sAutoDoneQuickFormat + "|||" + sWordImportAPI + "|||" + sAutoDonePasteOption + "|||" + sTB2Edit + "|||" + sTB2Text + "|||" + sTB2View);
	}



}