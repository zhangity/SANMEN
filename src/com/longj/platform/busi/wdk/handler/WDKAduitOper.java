package com.longj.platform.busi.wdk.handler;

import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.wdk.WDK;
import org.wdk.WDKConstant;
import org.wdk.core.base.BaseAduitOper;
import org.wdk.core.base.BaseSessionUser;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.session.SessionManager;
import org.wdk.core.util.uLogger;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;


/**
 * 公文操作审计类 支持基于actionflag模式的操作审计
 * 
 * @author stiffen_peng
 * 
 */
public class WDKAduitOper extends BaseAduitOper {
	private static uLogger logger = new uLogger(WDKAduitOper.class.getName());

	// 审计配置模板：key-表名，value-key：actionflage value-配置对象
	public static HashMap<String, HashMap<String, JSONObject>> AUDITOPER_DEFINE = new HashMap<String, HashMap<String, JSONObject>>();

	@Override
	public void doAduitOper(WDKContext context) {
		try{
			if(context==null)
				return ;
//			HttpServletRequest request = context.getRequest();
//			if (request==null)
//				return;
			if(context.isSuccess()==false)
				return;//执行失败的业务暂时不记录审计

			String actionFlag = context.getString("_ACTIONFLAG");
			String woname = context.getString("_MAINWONAME");
			
			logger.debug("操作审计MAINWONAME="+woname);
			logger.debug("操作审计ACTIONFLAG="+actionFlag);		
	
			if (AUDITOPER_DEFINE.keySet().contains(woname)) {
				HashMap<String, JSONObject> flag_map = AUDITOPER_DEFINE.get(woname);
				if (null != flag_map && flag_map.keySet().contains(actionFlag)) {
	
					// 根据模版生成消息
					JSONObject obj = flag_map.get(actionFlag);
					String tmlstr = obj.getString("auditcontent");
					HashSet<String> tmlparam = new HashSet<String>();
	
					Pattern pattern = Pattern.compile("\\{([^\\}]*)\\}");
					Matcher matcher = pattern.matcher(tmlstr);
					while (matcher.find()) {
						tmlparam.add(matcher.group(1));
					}
					String busidata = tmlstr;
					if (obj != null) {
						WQLData data = (WQLData) context.getAttribute(woname);
	
						if (data != null) {
							data.first();
							if (data.next()) {
								for (String str : tmlparam) {
									try {
										String value = data.getValue(str);
										busidata = busidata.replaceAll("\\{" + str + "\\}", value);
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							}
						}else{
							return;
						}
					}
					
					/*boolean isSuccess = AuditUtil.addOper((SessionUser)context.getAttribute("ADUITOPER_SESSIONUSER"), 
															 (String)context.getAttribute("ADUITOPER_REMOTEHOST"), 
															  WDK.getDateTime(), 
															  obj.getString("opermodule") == null ? "" : obj.getString("opermodule"), 
															  obj.getString("opermenu") == null ? "" : obj.getString("opermenu"), 
															  obj.getString("operbutton") == null ? "" : obj.getString("operbutton"),
															  obj.getString("auditdesc") == null ? "" : obj.getString("auditdesc"),
															  busidata
															  );
					if (isSuccess) {
						logger.debug("操作审计成功 [MAINWONAME]=" + woname + ", [ACTIONFLAG]=" + actionFlag);
					}*/
				}
			}
		}catch (Exception e) {
			logger.errorWithNoException("操作审计异常："+e.getMessage());
		}
	}

	/**
	 * 加载操作审计配置
	 */
	public static boolean start() {
		return WDKAduitOper.start(null);
	}
	
	
	public static boolean start(ConnectBean conb) {
		boolean isSuccess = true;
		try {
			//情况审计配置
			AUDITOPER_DEFINE.clear();

			//查询审计配置表，加载到map中
			WQLObject wo = WQLObject.getWQLObject("PF_PB_Aduit_Template");
			ResultBean ret = wo.query("IsActive='1'", "", conb);
			if (ret.isSuccess()) {
				JSONArray array = ret.getResultJSONArray(0);
				for (int i = 0; i < array.size(); i++) {
					JSONObject obj = array.getJSONObject(i);
					
					String tablename = obj.getString("tablename");	//操作表名
					String actionflag = obj.getString("actionflag");//操作名
					if (null != tablename && !"".equals(tablename) && null != actionflag && !"".equals(actionflag)) {
						HashMap<String, JSONObject> flag_map = null;
						if (AUDITOPER_DEFINE.keySet().contains(tablename)) {
							flag_map = AUDITOPER_DEFINE.get(tablename);
						} else {
							flag_map = new HashMap<String, JSONObject>();
						}
						flag_map.put(actionflag, obj);
						AUDITOPER_DEFINE.put(tablename, flag_map);
					}
				}
			}else{
				throw new Exception("查询操作审计模板错误！");
			}
		} catch (Exception e) {
			logger.errorWithNoException(e.getMessage());
			isSuccess = false;
		}
		return isSuccess;
	}
}
