package com.longj.platform.pb.detect;


import java.util.Iterator;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpSession;

import org.w3c.dom.Node;
import org.wdk.WDKConstant;
import org.wdk.WDKCore;
import org.wdk.core.base.BaseSessionUser;
import org.wdk.core.util.uXmlParse;

public class DetectServer {
	public static String process(String instr){
		try {
			Node root = uXmlParse.loadxmlString(instr);
			String method = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/method"));
			if("session_destory".equalsIgnoreCase(method)){
				String userid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/param/userid"));
				session_destory(userid);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "";
	}
	
	/**
	 * 清除本机指定用户的session
	 * @param account_uuid
	 */
	private static void session_destory(String userid){
		
		LinkedHashMap<String, BaseSessionUser> lhm = WDKCore.inst.SESSION_USERS;
		for(Iterator<String> it = lhm.keySet().iterator();it.hasNext();){
			String sessionid = it.next();
			BaseSessionUser bsu = lhm.get(sessionid);
			String _userid = bsu.getUserid();
			if(_userid.equalsIgnoreCase(userid)){
				//如果找到了这个session
				HttpSession session = WDKCore.inst.SESSIONS.get(sessionid);
				session.removeAttribute(WDKConstant.SESSION_USER);
				WDKCore.inst.SESSION_USERS.remove(sessionid);
				WDKCore.inst.SESSIONS.remove(sessionid);
			}
		}
		
		
		
	}
}