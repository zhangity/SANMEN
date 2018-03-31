package com.longj.platform.pb.audit;

import java.util.HashMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;

import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.platform.busi.wdk.base.BaseActionMethod;
import com.longj.platform.busi.wdk.handler.WDKAduitOper;





public class TemplateMaintAction extends BaseActionMethod {
	private static WDKLogger logger = new WDKLogger(TemplateMaintAction.class.getName());
	private static String TEMPLATE_WO = "PF_PB_Aduit_Template";
	

	/**
	 * 模板列表
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void templatelist(WDKContext context) throws Exception {
		JSONObject jrows = new JSONObject();

		//获取上下文中其他参数
		String tablename = context.getString("tablename");//查询表名词
		
		String sec = "";
		if(!"".equals(tablename)){
			sec = sec + " tablename like '%"+tablename+"%' ";
		}
		
		WQLObject wo = _WQL_GetWO(TEMPLATE_WO);
		if(wo==null) throw new Exception("WQLObject【"+TEMPLATE_WO+"】不存在！");
		ResultBean ret = _WQL_PageQuery(context, wo, sec, "tablename,actionflag");	
		jrows = ret.pageResult();

		_PRINT(context, jrows.toString());
	}

	
	/**
	 * 模板检查
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void templatecheck(WDKContext context) throws Exception {
		String templateid = context.getString("templateid");
		String tablename = context.getString("tablename");
		String actionflag = context.getString("actionflag");	
		
		WQLObject wo = _WQL_GetWO(TEMPLATE_WO);
		if(wo==null) throw new Exception("WQLObject【"+TEMPLATE_WO+"】不存在！");
		
		ResultBean ret = _WQL_Query(context, wo, "tablename='"+tablename+"' and actionflag='"+actionflag+"' and templateid <> '"+templateid+"'");
		if( ret.getResultSet(0).size() > 0){
			throw new Exception("数据表【"+tablename+"】的操作【"+actionflag+"】审计模板已存在！");
		}

	}
	
	/**
	 * 规则插入
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void templateinsert(WDKContext context) throws Exception {
		
		WQLObject bc = _WQL_GetWO(TEMPLATE_WO);
		if(bc==null) throw new Exception("WQLObject【"+TEMPLATE_WO+"】不存在！");
		
		WQLData boDataSet = getSingleRowWQLData(context,bc);
		
		_WQL_Insert(context,bc,boDataSet);
	}
	
	/**
	 * 规则更新
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void templateupdate(WDKContext context) throws Exception {
		//获取上下文中其他参数
		String templateid = context.getString("templateid");//记录标识
		
		//获取数据模型定义
		WQLObject bc = _WQL_GetWO(TEMPLATE_WO);
		if(bc==null) throw new Exception("WQLObject【"+TEMPLATE_WO+"】不存在！");
		
		HashMap values = getFieldValues(context,bc);
		String whereClause = "templateid = '"+ templateid +"'";
		_WQL_Update(context,bc, values, whereClause);
	}
	
	/**
	 * 规则信息
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void templateinfo(WDKContext context) throws Exception {
		JSONObject jrows = null;

		//获取上下文中其他参数
		String optype = (String)context.get("optype"); //add-新增   edit-修改  view-查看
		String templateid = (String)context.get("templateid");			

		WQLObject bc = WQLObject.getWQLObject(TEMPLATE_WO);
		
		JSONArray datas = null;
		if("add".equals(optype)){
			//新增记录，并按BC定义初始化字段值
			WQLData dataSet = new WQLData(bc);
			//dataSet.create(bc);
			dataSet.insert();			
			//其他字段值再处理
			dataSet.setValue("isactive", "1");
			
			datas = dataSet.getDataJSONArray();
		}else{
			datas = _WQL_Query(context,bc, "templateid='"+templateid+"'").getResultJSONArray(0);
		}		
		
		if(datas.size()>0){
			jrows = datas.getJSONObject(0);
		}

		
		if(null==jrows){
			jrows = new JSONObject();
			jrows.put("code", "0");
			jrows.put("desc", "未找到对应记录");
		}else{
			jrows.put("code", "1");
			jrows.put("desc", "查找成功");
		}
		
		_PRINT(context, jrows.toString());
	}
	
	public void templateapply(WDKContext context) throws Exception {
		JSONObject jrows = new JSONObject();
		
		boolean isSuccess = WDKAduitOper.start(context.getConnectBean());

		if(isSuccess){
			jrows.put("code", "1");
			jrows.put("desc", "操作成功");
		}else{
			jrows.put("code", "0");
			jrows.put("desc", "操作失败");
		}
		
		_PRINT(context, jrows.toString());
	}
}
