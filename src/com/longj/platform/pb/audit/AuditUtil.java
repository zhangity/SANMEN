package com.longj.platform.pb.audit;

import org.wdk.WDK;
import org.wdk.WDKConstant;

import com.longj.platform.busi.wdk.handler.SessionUser;
import com.longj.platform.pb.util.WQLUtil;

import wql.WQLNames;


public class AuditUtil {
	public static String LOGINSTATUS_Success = "01";			//登录成功
	public static String LOGINSTATUS_Fail = "02";				//登录失败
	
	public static String ERRCODE_01 = "01";			//用户名密码失败
	public static String ERRCODE_02 = "02";			//查无此人
	public static String ERRCODE_03 = "03";			//当前用户已锁定
	
	
	public static String ERRDESC_01 = "用户名密码失败";			//用户名密码失败
	public static String ERRDESC_02 = "查无此人";				//查无此人
	public static String ERRDESC_03 = "当前用户已锁定";			//当前用户已锁定
	
	
	/**
	 * 	新增登录审计
	 * 
	 	流水id			flowid
		登录用户			loginname
		登录系统			loginappuuid
		登录时间			logindt
		登录ip			loginip
		登录sessionid	loginsessionid
		登录结果			loginstatus
		失败编码			errcode
		失败描述			errdesc
	 * @throws Exception 

	 */
	public static boolean addLogin(String loginname,String logindt,String loginip,String loginsessionid,String loginstatus) throws Exception{
		return addLogin(loginname, logindt, loginip, loginsessionid, loginstatus,"","");
	}
	public static boolean addLogin(String loginname,String logindt,String loginip,String loginsessionid,String loginstatus,String errcode,String errdesc) throws Exception{
		String flowid = WDK.getUUID();
		String loginappuuid = WDK.getPropPUB(WDKConstant.PROP_cfg_sys_appuuid);
		
		boolean isSuccess = WQLUtil.getWQL(WQLNames.UPFPB_AT0001)
								.addParam("flag", "1")
								.addParam("flowid", flowid)
								.addParam("loginname", loginname)
								.addParam("loginappuuid", loginappuuid)
								.addParam("logindt", logindt)
								.addParam("loginip", loginip)
								.addParam("loginsessionid", loginsessionid)
								.addParam("loginstatus", loginstatus)
								.addParam("errcode", errcode)
								.addParam("errdesc", errdesc)
								.process()
								.isSuccess();
		return isSuccess;
	}
	
	/**
	 * 	插入操作记录
		流水id			flowid
		操作人			operuser
		所属部门			operdept
		登录ip			loginip
		操作时间			operdt
		操作系统			operappuuid
		操作模块			opermodule
		操作菜单			opermenu
		操作功能			operbutton
		业务标题			busititle
		业务记录			busidata

	 * @return
	 * @throws Exception 
	 */
	public static boolean addOper(SessionUser su,String loginip,String operdt,String opermodule,String opermenu,String operbutton,String busititle,String busidata) throws Exception{
		String flowid = WDK.getUUID();
		String loginname = su!=null?su.getLoginname():"";
		String operdept = su!=null?su.getDeptname():"";
		String operappuuid = WDK.getPropPUB(WDKConstant.PROP_cfg_sys_appuuid);
		boolean isSuccess = WQLUtil.getWQL(WQLNames.UPFPB_AT0002)
								.addParam("flag", "1")
								.addParam("flowid", flowid)
								.addParam("loginname", loginname)
								.addParam("operdept", operdept)
								.addParam("loginip", loginip)
								.addParam("operdt", operdt)
								.addParam("operappuuid", operappuuid)
								.addParam("opermodule", opermodule)
								.addParam("opermenu", opermenu)
								.addParam("operbutton", operbutton)
								.addParam("busititle", busititle)
								.addParam("busidata", busidata)
								.process()
								.isSuccess();
		return isSuccess;
	}
	
	
}