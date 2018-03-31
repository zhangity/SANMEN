package com.longj.products.uum.standard.ua;

import java.util.HashMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;

import com.longj.platform.busi.wdk.base.BaseActionMethod;

import wql.WQLNames;


/**
 * 子功能数据权限设置
 * @author zhanghc
 *
 */
public class Subfuncdrlset extends BaseActionMethod {

	private static WDKLogger logger = new WDKLogger(Func2RoleAction.class.getName());
	
	
	public void query( WDKContext context ) throws Exception  {
		boolean isSuccess = true;
		WQLData dataSet = null;
		JSONArray jrows = null;
		String err = "";
		try{
			HashMap param=new HashMap();
			param.put("role_uuid", context.getString("role_uuid"));
			param.put("subfunc_uuid", context.getString("subfunc_uuid"));
			ResultBean ret = WQL.getWO(WQLNames.QUUMUA_0012)
					.addParamMap(param)
					.process(context.getConnectBean());
			dataSet = ret.getWQLData(0);
			//添加自定义
			if ( dataSet != null ) {
				jrows = dataSet.getDataJSONArray();
			}

		}catch (Exception ex) {
			isSuccess = false;
			err = ex.getMessage();
			logger.errorWithNoException(err);
			ex.printStackTrace();
		}
		if(isSuccess){
			
		}else{
			JSONObject jrowsObj  = new JSONObject();
			jrowsObj.put("code", "0");
			jrowsObj.put("desc", "查询出错！\n"+err);
		}
		context.setPrintOut(jrows.toString());

	}
	
	
}