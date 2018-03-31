package com.longj.platform.pb.mark;

import org.wdk.WDK;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKEnvironment;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;

import com.longj.platform.pb.util.WQLUtil;


import wql.WQLNames;

public class PBMark {
	public static final String TYPE_Todo = "01";				//统一待办交互报文留痕
	public static final String TYPE_MSG = "02";					//统一消息交互报文留痕
	public static final String TYPE_Mobile = "03";				//移动端请求报文留痕
	public static final String TYPE_Other = "99";				//其他请求报文留痕
	public static final String TYPE_Transfer_Shandong = "11";	//山东统一用户同步
	public static final String TYPE_Transfer_Gansu = "12";		//甘肃统一用户同步
	public static final String TYPE_Transfer = "66";			//吉林统一用户同步
	
	public static final String DIRECTION_Request = "01";	//请求方向，request
	public static final String DIRECTION_Response = "02";	//响应方向，response

	/**
	 * 增加统一待办库操作日志
	 * @param createdate
	 * @param createtype
	 * @param msgcontent
	 * @return
	 * @throws Exception 
	 */
    public static boolean insert(String marktype, String serialuuid, String direction, String markcontent, ConnectBean conb) {
        boolean isSuccess = false;
        try {
			if (conb != null) {
			    isSuccess = WQLUtil.getWQL(WQLNames.UPFPBMARK0001).addParam("flag", "1").addParam("markuuid", WDK.getUUID()).addParam("marktype", marktype)
			            .addParam("serialuuid", serialuuid).addParam("direction", direction).addParam("createdt", WDK.getDateTime())
			            .addParam("markcontent", markcontent).process(conb).isSuccess();
			} else {
			    isSuccess = WQLUtil.getWQL(WQLNames.UPFPBMARK0001).addParam("flag", "1").addParam("markuuid", WDK.getUUID()).addParam("marktype", marktype)
			            .addParam("serialuuid", serialuuid).addParam("direction", direction).addParam("createdt", WDK.getDateTime())
			            .addParam("markcontent", markcontent).process().isSuccess();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
        return isSuccess;
    }
    /**
     * 增加统一待办库操作日志
     * @param createdate
     * @param createtype
     * @param msgcontent
     * @return
     * @throws Exception 
     */
    public static boolean insert(String marktype, String serialuuid, String direction, String markcontent) {
    	WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
    	WDKContext context = wdkEnv.getWDKContext();
        return insert(marktype, serialuuid, direction, markcontent, context!=null?context.getConnectBean():null);
    }
}