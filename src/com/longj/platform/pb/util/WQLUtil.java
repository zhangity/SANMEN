package com.longj.platform.pb.util;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.engine.object.WO;

/**
 * 封装了业务上调用wql的方法
 * 避免业务直接调用wql
 * @author stiffen_peng
 *
 */
public class WQLUtil {
	private WO wo;
	
	public WQLUtil(WO wo){
		this.wo = wo;
	}
	
	public static WQLUtil getWQL(String code){
		WO wo =WQL.getWO(code);
		return new WQLUtil(wo);
	}
	
	public WQLUtil addParam(String key,Object value){
		this.wo.addParam(key, value);
		return this;
	}
	
	public WQLUtil addParamMap(HashMap map){
		this.wo.addParamMap(map);
		return this;
	}
	
	public ResultBean process() throws Exception{
		ResultBean ret = this.wo.process();
		this.operateException(ret);
		return ret;
	}
	
	public ResultBean process(ConnectBean conb) throws Exception{
		ResultBean ret = this.wo.process(conb);
		this.operateException(ret);
		return ret;
	}
	
	public JSONObject pageQuery(HttpServletRequest request,String orderby){
		return this.wo.pageQuery(request, orderby);
	}
	
	public JSONObject pageQuery(HttpServletRequest request,String orderby,ConnectBean conb){
		return this.wo.pageQuery(request, orderby, conb);
	}
	
	public JSONObject pageQuery(int pageStart,int pageEnd,String orderby){
		return this.wo.pageQuery(pageStart, pageEnd, orderby);
	}
	
	public JSONObject pageQuery(int pageStart,int pageEnd,String orderby,ConnectBean conb){
		return this.wo.pageQuery(pageStart, pageEnd, orderby, conb);
	}
	
	private void operateException(ResultBean ret) throws Exception{
    	if(this.wo.getCode().toUpperCase().startsWith("U") && ret.isSuccess()==false){
			StringBuffer sbuff = new StringBuffer();
			ArrayList errlist = ret.getInfoError();
			for(int i=0;i<errlist.size();i++){
				ErrorBean errBean = (ErrorBean)errlist.get(i);
				sbuff.append(errBean.toString());
				sbuff.append("\n");
			}
			throw new Exception(sbuff.toString());
		}
    }
}
