package com.longj.platform.busi.wdk.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.WDK;
import org.wdk.core.base.BaseAction;
import org.wdk.core.base.WorkFlowAction;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.core.session.SessionManager;
import org.wdk.module.wf.engine.core.bean.WFActorBean;
import org.wdk.module.wf.engine.core.bean.WFBean;
import org.wdk.module.wf.engine.core.bean.WFNodeBean;
import org.wdk.module.wf.frame.core.bean.bean_start;
import org.wdk.module.wf.frame.core.bean.bean_submit;
import org.wdk.module.wf.frame.core.bean.bean_todo;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLDataField;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.platform.busi.wdk.handler.SessionUser;
import com.longj.platform.busi.wdk.uum.UUM;
import com.longj.platform.busi.wdk.wf.WFUtils;
import com.longj.platform.busi.wdk.wf.frame.WFFrame;
import com.longj.platform.pb.util.StringUtil;


/**
 * 基础业务操作类
 * @author Administrator
 *
 */
public abstract class BaseActionMethod{
	private static WDKLogger logger = new WDKLogger(BaseActionMethod.class.getName());

	/**
	 * 从上下文参数中组织包含业务组件属性的FieldValues
	 * @param context
	 * @param bc
	 * @return
	 * @throws Exception
	 */
	protected HashMap getFieldValues(WDKContext ctx,WQLObject wqlObject) throws Exception{
		HashMap values = new HashMap();
		List<WQLDataField> fields = wqlObject.getFields();
		for(int i=0;i<fields.size();i++){
			WQLDataField field =fields.get(i);
			String fieldname = field.getEnname().toLowerCase();
			if(ctx.containsKey(fieldname)){
				values.put(fieldname, ctx.get(fieldname).toString());
			}
		}
		return values;
	}
	
	/**
	 * 从上下文参数中组织业务组件的单记录数据集
	 * @param context
	 * @param bc
	 * @throws Exception
	 */
	protected WQLData getSingleRowWQLData(WDKContext ctx,WQLObject wqlObject) throws Exception{
		WQLData wqlData = new WQLData(wqlObject);
		wqlData.insert();
		List<WQLDataField> fields = wqlObject.getFields();
		for(int i=0;i<fields.size();i++){
			WQLDataField field =fields.get(i);
			String fieldname = field.getEnname().toLowerCase();
			if(ctx.containsKey(fieldname)){
				wqlData.setValue(fieldname, ctx.get(fieldname).toString());
			}
		}
		logger.debug("getSingleRowWQLData>>"+wqlData.getDataJSONArray().toString());
		return wqlData;
	}
	
	/**
	 * 
	 * @param context
	 * @param bc
	 * @param paraname
	 * @throws Exception
	 */
	protected WQLData getMultiRowWQLData(WDKContext ctx,WQLObject wqlObject,String paraname) throws Exception{
		WQLData wqlData = new WQLData(wqlObject);
		if(ctx.containsKey(paraname)){
			List<WQLDataField> fields = wqlObject.getFields();
			String rows = ctx.get(paraname).toString();
			JSONArray jrows = JSONArray.fromObject(rows);
			for(int i=0;i<jrows.size();i++){
				wqlData.insert();
				JSONObject jrow = jrows.getJSONObject(i);
				for(int j=0;j<fields.size();j++){
					WQLDataField field =fields.get(j);
					String fieldname = field.getEnname().toLowerCase();
					if(jrow.containsKey(fieldname)){
						wqlData.setValue(fieldname, jrow.getString(fieldname));
					}
				}
			}
		}
		logger.debug("getMultiRowWQLData>>"+wqlData.getDataJSONArray().toString());
		return wqlData;
	}
	
	
	public void getAttachment(WDKContext ctx) throws Exception {
		String fileid = ctx.getString("fileid");		//XML文件ID
		
		JSONArray jrows = new JSONArray();
		boolean isSuccess = true;
		String err = "";
		try{
			ResultBean ret = WQL.getWO("QWDKSY0013")
					.addParam("flag", "2")
					.addParam("fileid", fileid)
					.process(ctx.getConnectBean());
			if(ret.isSuccess()==false){
				StringBuffer sf = new StringBuffer();
				ArrayList errlist = ret.getInfoError();
				for(int i=0;i<errlist.size();i++){
					ErrorBean errBean = (ErrorBean)errlist.get(i);
					sf.append(errBean.toString());
					sf.append("\n");
				}
				throw new Exception(sf.toString());
			}
			jrows = ret.getResultJSONArray(0);
		}catch(Exception ex){
			isSuccess = false;
			err = ex.getMessage();
			logger.errorWithNoException(err);
			ex.printStackTrace();
		}
		
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "查询成功！");
			jres.put("data", jrows);
		}else{
			jres.put("code", "0");
			jres.put("desc", "查询失败！\n"+err);
			jres.put("data", jrows);
		}
		
		ctx.setPrintOut(jres.toString());
	}

	/**
	 * 获取应用系统列表
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void getApplist(WDKContext ctx) throws Exception {
		boolean isSuccess = true;
		String err = "";
		JSONArray jrows = new JSONArray();
		try{
			ResultBean ret = WQL.getWO("QPFPBRL0001").process(ctx.getConnectBean());
			if(ret.isSuccess()){
				jrows = ret.getResultJSONArray(0);
			}else{
				StringBuffer sf = new StringBuffer();
				ArrayList errlist = ret.getInfoError();
				for(int i=0;i<errlist.size();i++){
					ErrorBean errBean = (ErrorBean)errlist.get(i);
					sf.append(errBean.toString());
					sf.append("\n");
				}
				throw new Exception(sf.toString());
			}
		}catch(Exception ex){
			isSuccess = false;
			err = ex.getMessage();
			logger.errorWithNoException(err);
			ex.printStackTrace();
		}
		
		jrows = WDK.DataFormat_Combox(jrows, "app_uuid", "app_name");
		ctx.setPrintOut(jrows.toString());
	}
	
	
	
	/**
	 * 数据输出到前台
	 * @param context
	 * @param result
	 * @return
	 * @throws Exception
	 */
	public void _PRINT(WDKContext ctx, String result) throws Exception {
		ctx.setPrintOut(result);
    }
	
	/**
     *从session中获取用户信息
     * 
     * @param context
     * @return
     */
    public SessionUser _getSessionuser(WDKContext ctx) {
        HttpServletRequest request = ctx.getRequest();
        SessionUser su = (SessionUser) SessionManager.getSession(request);
        return su;
    }
    
    /**
     * 取系统参数
     * @param context
     * @param paracode 
     * @return
     */
    public String _getPF_PB_Parameter(WDKContext ctx,String paracode) throws Exception {
    	String value = "";
		WQLObject wo =WQLObject.getWQLObject("PF_PB_Parameter");
		//参数对象
		List paramList =new ArrayList();
		paramList.add(paracode);
		
		ResultBean ret = _WQL_Query(ctx,wo,"ParaCode=?", paramList);
		
		//处理异常
		this.operateException(ret);
		
		WQLData wd =ret.getWQLData(wo, 0);
		wd.first();
		if(wd.next()){
			value = wd.getValue("ParaValue");
		}
    	return value;
    }
    /**
     * 取系统参数,给前台页面调用
     * @param context
     * @param paracode 
     * @return
     */
    public void getPF_PB_Parameter(WDKContext ctx) throws Exception {
    	String paracode = ctx.getString("paracode");
    	String value = _getPF_PB_Parameter(ctx, paracode);
    	JSONObject retJson = new JSONObject();
    	retJson.put("paravalue", StringUtil.nullToEmpty(value));
    	ctx.setPrintOut(retJson.toString());
    }    
	
	//数据模型相关方法封装
	
	/**
	 * 获取WQLObject
	 * @param name
	 * @return
	 */
    public WQLObject _WQL_GetWO(String tbname){
    	return WQLObject.getWQLObject(tbname);
    }
	
	
	/**
	 * 数据模型取回查询方法
	 * @param context
	 * @param bc
	 * @param dataSet
	 * @return
	 * @throws Exception
	 */
    public ResultBean _WQL_Retrieve(WDKContext ctx,WQLObject wo, WQLData wd) throws Exception{
		if(wo==null){
			throw new Exception("WQLObject为空！");
		}
		ResultBean ret = wo.retrieve(wd,ctx.getConnectBean());
		//处理异常
		this.operateException(ret);
		
		return ret;
	}
	
	/**
	 * 数据模型查询方法
	 * @param context
	 * @param bc
	 * @param whereClause
	 * @return
	 * @throws Exception
	 */
	public ResultBean _WQL_Query(WDKContext ctx,WQLObject wo,String whereClause) throws Exception{		
		return _WQL_Query(ctx,wo,whereClause,null,"");
	}
	
	/**
	 * 数据模型查询方法
	 * @param context
	 * @param wo
	 * @param whereClause
	 * @param whereArgs
	 * @return
	 * @throws Exception
	 */
	public ResultBean _WQL_Query(WDKContext ctx,WQLObject wo,String whereClause,List<String> whereArgs) throws Exception{	
		return _WQL_Query(ctx,wo,whereClause,whereArgs,"");
	}
	
	/**
	 * 数据模型查询方法
	 * @param context
	 * @param bc
	 * @param whereClause
	 * @param orderby
	 * @return
	 * @throws Exception
	 */
	public ResultBean _WQL_Query(WDKContext ctx,WQLObject wo,String whereClause,String orderby) throws Exception{
		return _WQL_Query(ctx,wo,whereClause,null,orderby);
	}
	
	/**
	 * 数据模型查询方法
	 * @param context
	 * @param wo
	 * @param whereClause
	 * @param whereArgs
	 * @param orderby
	 * @return
	 * @throws Exception
	 */
	public ResultBean _WQL_Query(WDKContext ctx,WQLObject wo,String whereClause,List<String> whereArgs,String orderby) throws Exception{
		if(wo==null){
			throw new Exception("WQLObject为空！");
		}
		//构造条件参数
		String[] args = new String[whereArgs==null?0:whereArgs.size()];
		if(whereArgs!=null){
			for(int i=0;i<whereArgs.size();i++){
				args[i] = whereArgs.get(i);
			}
		}
		//获取结果集对象
		ResultBean ret = wo.query(whereClause, args, orderby, ctx.getConnectBean());
		//处理异常
		this.operateException(ret);
		
		return ret;
	}
	
	/**
	 * 数据模型分页查询方法
	 * @param context
	 * @param bc
	 * @param whereClause
	 * @param orderby
	 * @return
	 * @throws Exception
	 */
	public ResultBean _WQL_PageQuery(WDKContext ctx,WQLObject wo,String whereClause,String orderby) throws Exception{		
		return _WQL_PageQuery(ctx, wo, whereClause, null, orderby);
	}
	
	/**
	 * 数据模型分页查询方法
	 * @param context
	 * @param wo
	 * @param whereClause
	 * @param whereArgs
	 * @param orderby
	 * @return
	 * @throws Exception
	 */
	public ResultBean _WQL_PageQuery(WDKContext ctx,WQLObject wo,String whereClause,List<String> whereArgs,String orderby) throws Exception{
    	if(wo==null){
			throw new Exception("WQLObject为空！");
		}
    	//构造条件参数
		String[] args = new String[whereArgs==null?0:whereArgs.size()];
		if(whereArgs!=null){
			for(int i=0;i<whereArgs.size();i++){
				args[i] = whereArgs.get(i);
			}
		}
    	//获取结果集对象
		ResultBean ret = wo.pagequery(whereClause, args, orderby, ctx.getRequest(), ctx.getConnectBean());
		//处理异常
		this.operateException(ret);
		
		return ret;
	}
	
	/**
	 * 数据模型插入方法
	 * @param context
	 * @param bc
	 * @param dataSet
	 * @return
	 * @throws Exception
	 */
	public ResultBean _WQL_Insert(WDKContext ctx,WQLObject wo, WQLData wd) throws Exception{
    	if(wo==null){
			throw new Exception("WQLObject为空！");
		}
		
		//获取结果集对象
		ResultBean ret = wo.insert(wd, ctx.getConnectBean());	
		//处理异常
		this.operateException(ret);
		
		return ret;
	}
	
	/**
	 * 数据模型插入方法
	 * @param context
	 * @param bc
	 * @param values
	 * @return
	 * @throws Exception
	 */
	public ResultBean _WQL_Insert(WDKContext ctx,WQLObject wo, HashMap values) throws Exception{
		if(wo==null){
			throw new Exception("WQLObject为空！");
		}
		
		//获取结果集对象
		ResultBean ret = wo.insert(values, ctx.getConnectBean());
		//处理异常
		this.operateException(ret);
		
		return ret;
	}
	
	/**
	 * 数据模型更新方法
	 * @param context
	 * @param bc
	 * @param values
	 * @param whereClause
	 * @return
	 * @throws Exception
	 */
	public ResultBean _WQL_Update(WDKContext ctx,WQLObject wo, HashMap values,String whereClause) throws Exception{		
		return _WQL_Update(ctx, wo, values, whereClause, null);
	}
	
	/**
	 * 数据模型更新方法
	 * @param context
	 * @param wo
	 * @param values
	 * @param whereClause
	 * @param whereArgs
	 * @return
	 * @throws Exception
	 */
	public ResultBean _WQL_Update(WDKContext ctx,WQLObject wo, HashMap values,String whereClause, List<String> whereArgs) throws Exception{
		if(wo==null){
			throw new Exception("WQLObject为空！");
		}
		//构造条件参数
		String[] args = new String[whereArgs==null?0:whereArgs.size()];
		if(whereArgs!=null){
			for(int i=0;i<whereArgs.size();i++){
				args[i] = whereArgs.get(i);
			}
		}
		//获取结果集对象
		ResultBean ret = wo.update(values, whereClause, args, ctx.getConnectBean());
		//处理异常
		this.operateException(ret);
		
		return ret;
	}
	
	/**
	 * 数据模型更新方法
	 * @param context
	 * @param bc
	 * @param dataSet
	 * @return
	 * @throws Exception
	 */
	public ResultBean _WQL_Update(WDKContext ctx,WQLObject wo, WQLData wd) throws Exception{
		if(wo==null){
			throw new Exception("WQLObject为空！");
		}
		
		//获取结果集对象
		ResultBean ret = wo.update(wd, ctx.getConnectBean());
		//处理异常
		this.operateException(ret);
		
		return ret;
	}
	
	/**
	 * 数据模型删除方法
	 * @param context
	 * @param bc
	 * @param whereClause
	 * @return
	 * @throws Exception
	 */
	public ResultBean _WQL_Delete(WDKContext ctx,WQLObject wo,String whereClause) throws Exception{		
		return _WQL_Delete(ctx, wo, whereClause, null);
	}
	
	/**
	 * 数据模型删除方法
	 * @param context
	 * @param wo
	 * @param whereClause
	 * @param whereArgs
	 * @return
	 * @throws Exception
	 */
	public ResultBean _WQL_Delete(WDKContext ctx,WQLObject wo,String whereClause, List<String> whereArgs) throws Exception{
		if(wo==null){
			throw new Exception("WQLObject为空！");
		}
		//构造条件参数
		String[] args = new String[whereArgs==null?0:whereArgs.size()];
		if(whereArgs!=null){
			for(int i=0;i<whereArgs.size();i++){
				args[i] = whereArgs.get(i);
			}
		}
		//获取结果集对象
		ResultBean ret = wo.delete(whereClause, args, ctx.getConnectBean());
		//处理异常
		this.operateException(ret);
		
		return ret;
	}
	
	/**
	 * 数据模型删除方法
	 * @param context
	 * @param bc
	 * @param whereClause
	 * @return
	 * @throws Exception
	 */
	public ResultBean _WQL_Delete(WDKContext ctx,WQLObject wo,WQLData wd) throws Exception{
		if(wo==null){
			throw new Exception("WQLObject为空！");
		}
		
		//获取结果集对象
		ResultBean ret = wo.delete(wd, ctx.getConnectBean());
		//处理异常
		this.operateException(ret);
		
		return ret;
	}
	
	/**
	 * 数据模型发布方法
	 * @param context
	 * @param bc 
	 * @param whereClause
	 * @return
	 * @throws Exception
	 */
	public ResultBean _WQL_UpdateAll(WDKContext ctx,WQLObject wo, WQLData wd) throws Exception{
		if(wo==null){
			throw new Exception("WQLObject为空！");
		}

		//获取结果集对象
		ResultBean ret = wo.updateAll(wd, ctx.getConnectBean());
		//处理异常
		this.operateException(ret);
		
		return ret;
	}
	
	
	
	/**
	 * 说明：通过BPM发起流程
	 *<p>
	 * Method _Flow_Start
	 * @param context
	 * @param pdid
	 * @param start
	 * @return
	 * @throws Exception
	 */
	public String _Flow_Start(WDKContext ctx,bean_start start) throws Exception {
        // aaaa

        // 统一待办表插条记录
        if (start == null) {
            throw new Exception("bean_start为空！");
        }
        String piid = WFUtils.Flow_Start(ctx.getEnvironment(), ctx.getConnectBean(), start);
        return piid;
    }
	
	
	/**
	 * 说明：通过BPM发起流程,并推进异步
	 *<p>
	 * Method _Flow_StartAndCommit
	 * @param context
	 * @param pdid
	 * @param start
	 * @param nextParticipants
	 * @return
	 * @throws Exception
	 */
	public String _Flow_StartAndCommit(WDKContext ctx, bean_start start,String nextParticipants) throws Exception {
	    if (start == null) {
            throw new Exception("bean_start为空！");
        }
	    String piid =  WFUtils.Flow_StartAndCommit(ctx.getEnvironment(), ctx.getConnectBean(), start, nextParticipants);
	    return piid;
	}
	
	
	/**
	 * 说明：提交流程
	 *<p>
	 * Method _Flow_Commit
	 * @param context
	 * @param submit
	 * @return
	 * @throws Exception
	 */
	public boolean _Flow_Commit(WDKContext ctx, bean_submit submit) throws Exception {
        if (submit == null) {
            throw new Exception("bean_submit为空！");
        }
        return WFUtils.Flow_Commit(ctx.getEnvironment(), ctx.getConnectBean(), submit);
    }
	
	
	/**
	 * 说明：流程退回
	 *<p>
	 * Method _Flow_Rollback
	 * @param context
	 * @param submit
	 * @return
	 * @throws Exception
	 */
	public boolean _Flow_Rollback(WDKContext ctx, bean_submit submit) throws Exception {
        if (submit == null) {
            throw new Exception("bean_submit为空！");
        }
        return WFUtils.Flow_Rollback(ctx.getEnvironment(), ctx.getConnectBean(), submit);
    }
	
	
	/**
	 * 说明：追回
	 *<p>
	 * Method _Flow_Reclaim
	 * @param environment
	 * @param conb
	 * @param todoid
	 * @param actor
	 * @param originactor
	 * @param agenttype
	 * @param isdeputesign
	 * @param operdt
	 * @param opercomment
	 * @return
	 * @throws Exception
	 */
	public boolean _Flow_Reclaim(WDKContext ctx, String todoid, WFActorBean actor, WFActorBean originactor,
            String agenttype, String isdeputesign, String operdt, String opercomment) throws Exception {
	    
	    return WFUtils.Flow_Reclaim(ctx.getEnvironment(), ctx.getConnectBean(), todoid, actor, originactor, agenttype, isdeputesign, operdt, opercomment);
	}
	
	
	/**
	 * 说明：自由追回
	 *<p>
	 * Method _Flow_Reclaim_Free
	 * @param environment
	 * @param conb
	 * @param todoid
	 * @param actor
	 * @param originactor
	 * @param agenttype
	 * @param isdeputesign
	 * @param operdt
	 * @param opercomment
	 * @return
	 * @throws Exception
	 */
	public boolean _Flow_Reclaim_Free(WDKContext ctx, String todoid, WFActorBean actor, WFActorBean originactor,
            String agenttype, String isdeputesign, String operdt, String opercomment) throws Exception {
        // TODO 自由追回
        return WFUtils.Flow_Reclaim(ctx.getEnvironment(), ctx.getConnectBean(), todoid, actor, originactor, agenttype, isdeputesign, operdt, opercomment);
    }
	
	
	/**
	 * 说明：交办
	 *<p>
	 * Method _Flow_Assign
	 * @param context
	 * @param actor
	 * @param todoid
	 * @return
	 */
	public boolean _Flow_Assign(WDKContext ctx, WFActorBean actor, WFActorBean originactor, String todoid, String isdeputesign,
            ArrayList<WFActorBean> turnactors, String turnopertype) throws Exception {
        return WFUtils.Flow_Assign(ctx.getEnvironment(), ctx.getConnectBean(), todoid, actor, originactor, isdeputesign, turnactors,
                turnopertype);
    }

    /**
     * 说明：转办
     *<p>
     * Method _Flow_Transmit
     * 
     * @param context
     * @param actor
     * @param todoid
     * @return
     */
    public boolean _Flow_Transmit(WDKContext ctx, WFActorBean actor, WFActorBean originactor, String todoid, String isdeputesign,
            ArrayList<WFActorBean> turnactors, String turnopertype) throws Exception {
        return WFUtils.Flow_Transmit(ctx.getEnvironment(), ctx.getConnectBean(), todoid, actor, originactor, isdeputesign, turnactors,
                turnopertype);
    }
	
	
	/**
	 * 说明：获取审批意见流水
	 *<p>
	 * Method _Flow_GetNotionList
	 * @param context
	 * @param piid
	 * @return
	 */
	public ArrayList<bean_todo> _Flow_GetNotionList(WDKContext ctx, String piid) {
        return WFUtils.Flow_GetNotionList(ctx.getEnvironment(), ctx.getConnectBean(), piid);
    }
	
	
	/**
	 * 说明：判断流程是否结束
	 *<p>
	 * Method _Flow_IsFlowEnd
	 * @param context
	 * @param piid
	 * @return
	 */
	public boolean _Flow_IsFlowEnd(WDKContext ctx, String piid) {
        return WFUtils.Flow_IsFlowEnd(ctx.getEnvironment(), ctx.getConnectBean(), piid);
    }
	
	
    /**
     * 说明：增办
     *<p>
     * Method _Flow_AddParticipant
     * @param context
     * @param actor
     * @param todoid
     * @return
     * @throws Exception
     */
    public boolean _Flow_AddParticipant(WDKContext ctx, ArrayList<WFActorBean> actor, String todoid, boolean signinsort) throws Exception {
        return WFUtils.Flow_AddParticipant(ctx.getEnvironment(), ctx.getConnectBean(), actor, todoid, signinsort);
    }
    
	
	
	
	/**
	 * 说明：流程终止
	 *<p>
	 * Method _Flow_Abort
	 * @param context
	 * @param piid
	 * @return
	 * @throws Exception
	 */
	public boolean _Flow_Abort(WDKContext ctx, String piid)throws Exception {
        if (piid == null || "".equals(piid.trim())) {
            throw new Exception("piid为空！");
        }
        return WFUtils.Flow_Abort(ctx.getEnvironment(), ctx.getConnectBean(), piid);
    }
	
	/**
	 * 说明：流程挂起
	 *<p>
	 * Method _Flow_Suspend
	 * @param context
	 * @param piid
	 * @return
	 * @throws Exception
	 */
	public boolean _Flow_Suspend(WDKContext ctx, String piid)throws Exception {
	    if (piid == null || "".equals(piid.trim())) {
            throw new Exception("piid为空！");
        }
	    return WFUtils.Flow_Suspend(ctx.getEnvironment(), ctx.getConnectBean(), piid);
	}
	
	   
	/**
	 * 说明：流程恢复
	 *<p>
	 * Method _Flow_Activate
	 * @param context
	 * @param piid
	 * @return
	 * @throws Exception
	 */
	public boolean _Flow_Activate(WDKContext ctx, String piid)throws Exception {
	        if (piid == null || "".equals(piid.trim())) {
	            throw new Exception("piid为空！");
	        }
	        return WFUtils.Flow_Activate(ctx.getEnvironment(), ctx.getConnectBean(), piid);
	}
	
	
	
	/**
     * 说明：通过piid获取pdid
     *<p>
     * Method _Flow_GetPdid
     * 
     * @param context
     * @param piid
     * @return
     * @throws Exception
     */
    public String _Flow_GetPdid(WDKContext ctx, String piid) throws Exception {
        if (piid == null || "".equals(piid)) {
            throw new Exception("piid为空！");
        }
        return WFUtils.Flow_GetPdid(ctx.getEnvironment(), ctx.getConnectBean(), piid);
    }
    
    
    /**
     * 说明：流程办结：
     *<p>
     * Method _Flow_Finish
     * @param context
     * @param todoid
     * @return
     * @throws Exception
     */
    public boolean _Flow_Finish(WDKContext ctx, String todoid) throws Exception {
        boolean isSuccess = false;
        if (todoid == null || "".equals(todoid)) {
            throw new Exception("todoid为空！");
        }
        isSuccess = WFUtils.Flow_Finish(ctx.getEnvironment(), ctx.getConnectBean(), todoid);
        return isSuccess;
    }
    
    
    /**
     * 说明：获取流程模板对象
     *<p>
     * Method _Flow_GetWFTemplate
     * @param context
     * @param pdid
     * @return
     * @throws Exception
     */
    public WFBean _Flow_GetWFTemplate(WDKContext ctx, String pdid) throws Exception {
        return WFUtils.Flow_GetWFTemplate(ctx.getEnvironment(), ctx.getConnectBean(), pdid);
    }
    
    
    /**
     * 说明：获取流程实例参数对象
     *<p>
     * Method _Flow_GetParam
     * @param context
     * @param piid
     * @return
     * @throws Exception
     */
    public WFBean _Flow_GetParam(WDKContext ctx, String piid) throws Exception {
        return WFUtils.Flow_GetParam(ctx.getEnvironment(), ctx.getConnectBean(), piid);
    }
    
    /**
     * 说明：获取指定环节模板对象
     *<p>
     * Method _Flow_GetNodeTemplate
     * @param context
     * @param pdid
     * @param nodename
     * @return
     * @throws Exception
     */
    public WFNodeBean _Flow_GetNodeTemplate(WDKContext ctx, String pdid, String nodename) throws Exception {
        return WFUtils.Flow_GetNodeTemplate(ctx.getEnvironment(), ctx.getConnectBean(), pdid, nodename);
    }
    
    
    
    /**
     * 说明：获取流程实例的参数
     *<p>
     * Method _Flow_GetNodeParam
     * @param context
     * @param piid
     * @param nodename
     * @return
     * @throws Exception
     */
    public WFNodeBean _Flow_GetNodeParam(WDKContext ctx, String piid, String nodename)throws Exception {
        return WFUtils.Flow_GetNodeParam(ctx.getEnvironment(), ctx.getConnectBean(), piid, nodename);
    }
    
    /**
     * 说明：更新环节参数
     *<p>
     * Method _Flow_UpdateNodeParam
     * @param context
     * @param nodeParam
     * @param piid
     * @return
     * @throws Exception
     */
    public void _Flow_UpdateNodeParam(WDKContext ctx, WFNodeBean nodeParam, String piid) throws Exception {
        WFUtils.Flow_UpdateNodeParam(ctx.getEnvironment(), ctx.getConnectBean(), piid, nodeParam);
    }
    
    /**
     * 说明：流程实例删除
     *<p>
     * Method _Flow_Delete
     * @param context
     * @param piid
     * @return
     * @throws Exception
     */
    public boolean _Flow_Delete(WDKContext ctx, String piid) throws Exception {
       return  WFUtils.Flow_Delete(ctx.getEnvironment(), ctx.getConnectBean(),  piid);
    }
    
    /**
     * 说明：任务领取
     * 
     *<p>
     * Method _Flow_TaskGet
     * @param context
     * @param todoid
     * @param actor
     * @param originactor
     * @param agenttype
     * @param isdeputesign
     * @return
     * @throws Exception
     */
    public boolean _Flow_TaskGet(WDKContext ctx,String todoid, WFActorBean actor, WFActorBean originactor,
            String agenttype, String isdeputesign)throws Exception {
        return WFUtils.Flow_TaskGet(ctx.getEnvironment(), ctx.getConnectBean(), todoid, actor, originactor, agenttype, isdeputesign);
    }
    
    
    /**
     * 说明：任务领退
     *<p>
     * Method _Flow_TaskReturn
     * @param context
     * @param todoid
     * @param actor
     * @param originactor
     * @param agenttype
     * @param isdeputesign
     * @return
     * @throws Exception
     */
    public boolean _Flow_TaskReturn(WDKContext ctx, String todoid, WFActorBean actor, WFActorBean originactor, String agenttype,
            String isdeputesign) throws Exception {
        return WFUtils.Flow_TaskReturn(ctx.getEnvironment(), ctx.getConnectBean(), todoid, actor, originactor, agenttype, isdeputesign);
    }
    
    
    
    /**
     * 说明：获取待办列表
     *<p>
     * Method _Flow_GetTodoList
     * @param context
     * @param actorid
     * @param hasdepute
     * @return
     */
    public JSONObject _Flow_GetTodoList(WDKContext ctx, String actorid, boolean hasdepute) {
        return WFUtils.Flow_GetTodoList(ctx.getEnvironment(), ctx.getConnectBean(), ctx.getRequest(), ctx.getResponse(), actorid,
                hasdepute);
    }
    
    
    /**
     * 说明：获取已办列表
     *<p>
     * Method _Flow_GetDoneList
     * @param context
     * @param actorid
     * @param hasdepute
     * @return
     */
    public JSONObject _Flow_GetDoneList(WDKContext ctx, String actorid, boolean hasdepute) {
        return WFUtils.Flow_GetDoneList(ctx.getEnvironment(), ctx.getConnectBean(), ctx.getRequest(), ctx.getResponse(), actorid,
                hasdepute);
    }
    
	/**
	 * 说明：获取流程实例创建者
	 *<p>
	 * Method Flow_GetCreator
	 * @param context
	 * @param piid
	 * @return
	 * @throws Exception
	 */
	public String _Flow_GetCreator(WDKContext ctx, String piid) throws Exception {
        if (piid == null || "".equals(piid.trim())) {
            throw new Exception("piid为空！");
        }
        return WFUtils.Flow_GetCreator(ctx.getEnvironment(), ctx.getConnectBean(), piid);
    }
	
	/**
	 * 说明：获取流程变量
	 *<p>
	 * Method _Flow_GetVariable
	 * @param context
	 * @param piid
	 * @return
	 * @throws Exception
	 */
	public HashMap<Object, Object> _Flow_GetVariable(WDKContext ctx,String piid)throws Exception {
	    if (piid == null || "".equals(piid.trim())) {
            throw new Exception("piid为空！");
        }
	    return WFUtils.Flow_GetVariable(ctx.getEnvironment(), ctx.getConnectBean(), piid);
	}
	
	
	/**
	 * 说明：更新流程变量
	 *<p>
	 * Method _Flow_UpdateVariable
	 * @param context
	 * @param param
	 * @param piid
	 * @throws Exception
	 */
	public void _Flow_UpdateVariable(WDKContext ctx, HashMap<Object, Object> param, String piid) throws Exception {
        if (piid == null || "".equals(piid.trim())) {
            throw new Exception("piid为空！");
        }
        WFUtils.Flow_UpdateVariable(ctx.getEnvironment(), ctx.getConnectBean(), piid, param);
    }
	
	/**
	 * 说明：获取环节变量
	 *<p>
	 * Method _Flow_GetNodeVariable
	 * @param context
	 * @param piid
	 * @param nodeName
	 * @return
	 * @throws Exception
	 */
	public HashMap<Object, Object> _Flow_GetNodeVariable(WDKContext ctx, String piid, String nodeName) throws Exception {
        if (piid == null || "".equals(piid.trim())) {
            throw new Exception("piid为空！");
        }
        if (nodeName == null || "".equals(nodeName.trim())) {
            throw new Exception("nodeName为空！");
        }
        return WFUtils.Flow_GetNodeVariable(ctx.getEnvironment(), ctx.getConnectBean(), piid, nodeName);
    }
	
	/**
	 * 说明：更新环节变量
	 *<p>
	 * Method _Flow_UpdateNodeVariable
	 * @param context
	 * @param nodeParam
	 * @param piid
	 * @param nodeName
	 * @throws Exception
	 */
	public void _Flow_UpdateNodeVariable(WDKContext ctx, HashMap<Object, Object> nodeParam, String piid, String nodeName) throws Exception {
        if (piid == null || "".equals(piid.trim())) {
            throw new Exception("piid为空！");
        }
        if (nodeName == null || "".equals(nodeName.trim())) {
            throw new Exception("nodeName为空！");
        }
        WFUtils.Flow_UpdateNodeVariable(ctx.getEnvironment(), ctx.getConnectBean(), piid, nodeName, nodeParam);
    }
	
	
	/**
     * 说明：获取下一环节的办理人
     *<p>
     * Method _Flow_GetNextActivityList
     * 
     * @param context
     * @param todoid
     * @return
     * @throws Exception
     */
    public ArrayList<WFNodeBean> _Flow_GetNextActivityList(WDKContext ctx, String todoid) throws Exception {
        if (todoid == null || "".equals(todoid.trim())) {
            throw new Exception("todoid为空！");
        }
        return WFUtils.Flow_GetNextActivityList(ctx.getEnvironment(), ctx.getConnectBean(), todoid);
    }
    
    
    /**
     * 说明：获取前序环节列表
     *<p>
     * Method _Flow_GetPreActivityList
     * @param context
     * @param pdid
     * @param nodename
     * @return
     * @throws Exception
     */
    public ArrayList<WFNodeBean> _Flow_GetPreActivityList(WDKContext ctx, String pdid, String nodename) throws Exception {
        if (nodename == null || "".equals(nodename.trim())) {
            throw new Exception("nodename为空！");
        }
        if (pdid == null || "".equals(pdid.trim())) {
            throw new Exception("pdid为空！");
        }
        return WFUtils.Flow_GetPreActivityList(ctx.getEnvironment(), ctx.getConnectBean(), pdid, nodename);
    }
    
    
    /**
     * 说明：获取所有环节的列表
     *<p>
     * Method _Flow_GetAllActivityList
     * @param context
     * @param todoid
     * @return
     * @throws Exception
     */
    public ArrayList<WFNodeBean> _Flow_GetAllActivityList (WDKContext ctx, String todoid)throws Exception {
        if (todoid == null || "".equals(todoid.trim())) {
            throw new Exception("todoid为空！");
        }
       return WFUtils.Flow_GetAllActivityList(ctx.getEnvironment(), ctx.getConnectBean(), todoid);
    }
    
    
    /**
     * 说明：判断是否是流程最后一个环节
     *<p>
     * Method _Flow_IsLastActivity
     * @param context
     * @param todoid
     * @return
     * @throws Exception
     */
    public boolean _Flow_IsLastActivity(WDKContext ctx, String todoid) throws Exception {
        if (todoid == null || "".equals(todoid.trim())) {
            throw new Exception("todoid为空！");
        }
        return WFUtils.Flow_IsLastActivity(ctx.getEnvironment(), ctx.getConnectBean(), todoid);
    }
    
    
    
    /**
     * 说明：更新待办信息
     *<p>
     * Method _Flow_UpdateTodo
     * @param context
     * @param submit
     * @return
     * @throws Exception
     */
    public boolean _Flow_UpdateTodo(WDKContext ctx, bean_submit submit) throws Exception {
        return WFUtils.Flow_UpdateTodo(ctx.getEnvironment(), ctx.getConnectBean(), submit);
    }
    
    /**
     * 说明：更新办理意见
     *<p>
     * Method _Flow_UpdateComment
     * @param context
     * @param todoid
     * @param opercomment
     * @param operdt
     * @return
     * @throws Exception
     */
    public boolean _Flow_UpdateComment(WDKContext ctx, String todoid, String opercomment, String operdt) throws Exception {
        if (todoid == null || "".equals(todoid.trim())) {
            throw new Exception("todoid为空！");
        }
        return WFUtils.Flow_UpdateComment(ctx.getEnvironment(), ctx.getConnectBean(), todoid, opercomment, operdt);
    }
    
    
    /**
     * 说明：传阅的收回
     *<p>
     * Method _Flow_CCRollback
     * @param context
     * @param todoid
     * @return
     * @throws Exception
     */
    public boolean _Flow_CCRollback(WDKContext ctx, String todoid) throws Exception {
        if (todoid == null || "".equals(todoid.trim())) {
            throw new Exception("todoid为空！");
        }
        return WFUtils.Flow_CCRollback(ctx.getEnvironment(), ctx.getConnectBean(), todoid);
    }
    
    /**
     * 说明：根据piid获取待办列表
     *<p>
     * Method _Flow_GetTodoIdList
     * 
     * @param context
     *            -上下文
     * @param piid
     *            -流程实例ID
     * @return
     */
    public List<String> _Flow_GetTodoIdList(WDKContext ctx, String piid, String useruuid) throws Exception {
        if (piid == null || "".equals(piid.trim())) {
            throw new Exception("piid为空！");
        }
        return WFUtils.Flow_GetTodoIdList(ctx.getEnvironment(), ctx.getConnectBean(), piid, useruuid);
    }
    
    /**
     * 说明：根据piid获取待办列表
     *<p>
     * Method _Flow_GetTodoIdList
     * 
     * @param context
     *            -上下文
     * @param piid
     *            -流程实例ID
     * @return
     */
    public List<String> _Flow_GetTodoIdList(WDKContext ctx, String piid) throws Exception {
        if (piid == null || "".equals(piid.trim())) {
            throw new Exception("piid为空！");
        }
        return WFUtils.Flow_GetTodoIdList(ctx.getEnvironment(), ctx.getConnectBean(), piid);
    }
    
    
    
    /**
     * 说明：抄送新增
     * <p>
     * Method _Flow_CCNew
     * 
     * @param context
     * @param todoid
     * @param actorList
     * @return
     * @throws Exception
     */
    public boolean _Flow_CCNew(WDKContext ctx, String todoid, ArrayList<String> actorList) throws Exception {
        return _Flow_CCNew(ctx, todoid, actorList, false);
    }

    /**
     * 说明：抄送新增
     * <p>
     * Method _Flow_CCNew
     * 
     * @param context
     *            WDK上下文
     * @param todoid
     *            待办表
     * @param actorList
     *            抄送人员列表
     * @return
     * @throws Exception
     */
    public boolean _Flow_CCNew(WDKContext ctx, String todoid, ArrayList<String> actorList, boolean canduplicate) throws Exception {
        StringBuffer actorBuffer = new StringBuffer();
        for (int i = 0; i < actorList.size(); i++) {
            if (i > 0) {
                actorBuffer.append(";");
            }
            actorBuffer.append(actorList.get(i)).append(",user,");
            // WFUtils.flow_get
            JSONObject personObject = UUM.getPersonByID(actorList.get(i), ctx.getConnectBean());
            if (personObject != null) {
                actorBuffer.append(personObject.getString("depart_uuid"));
            }
        }
        return WFUtils.Flow_CCNew(ctx.getEnvironment(), ctx.getConnectBean(), todoid, WFFrame.pub_getActors(actorBuffer.toString()),
                canduplicate);
    }

    
    /**
     * 说明：抄送：已阅
     *<p>
     * Method _Flow_CCComplete
     * 
     * @param context
     *            WDK上下文
     * @param todoid
     *            待办ID
     * @return
     * @throws Exception
     */
    public boolean _Flow_CCComplete(WDKContext ctx, String todoid) throws Exception {
        return WFUtils.Flow_CCComplete(ctx.getEnvironment(), ctx.getConnectBean(), todoid, WDK.getDateTime());
    }

    /**
     * 说明：抄送记录查询
     *<p>
     * Method _Flow_CCQuery
     * 
     * @param context
     *            WDK上下文
     * @param todoid
     *            待办ID
     * @param isCurrentNode
     *            是否仅显示当前环节的记录
     * @return
     * @throws Exception
     */
    public JSONArray _Flow_CCQuery(WDKContext ctx, String todoid, boolean isCurrentNode) throws Exception {

        return WFUtils.Flow_CCQuery(ctx.getEnvironment(), ctx.getConnectBean(), todoid, isCurrentNode);
    }
	
	
	/**
     * 说明：处理失败的异常
     *<p>
     * Method operateException
     * @param ResultBean
     * @return
     */
    private void operateException(ResultBean ret) throws Exception{
    	if(ret.isSuccess()==false){
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