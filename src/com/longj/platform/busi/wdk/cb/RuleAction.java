package com.longj.platform.busi.wdk.cb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.WDK;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;
import org.wdk.module.wql.core.engine.object.WO;

import com.longj.platform.busi.wdk.base.BaseActionMethod;
import com.longj.platform.busi.wdk.handler.SessionUser;
import com.longj.platform.busi.wdk.uum.UUM;
import com.longj.platform.pb.util.WQLUtil;

import wql.WQLNames;



public class RuleAction extends BaseActionMethod {
	private static WDKLogger logger = new WDKLogger(RuleAction.class.getName());
	private static String MST_BC = "PF_PB_CBuilderRule";
	private static String DTL_BC = "PF_PB_CBuilderRuleSect";
	private static String GDTL_BC = "PF_PB_CBuilderRuleSectPara";
	
	/**
	 * 功能树
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void fun_tree(WDKContext context) throws Exception {
		JSONArray jrows = new JSONArray();
		JSONObject row = new JSONObject();
		row.put("id", "1");
		row.put("name", "基本信息");
		row.put("parentid", "");
		jrows.add(row);
		row = new JSONObject();
		row.put("id", "2");
		row.put("name", "规则分段");
		row.put("parentid", "1");
		jrows.add(row);
		row = new JSONObject();
		row.put("id", "3");
		row.put("name", "分段参数");
		row.put("parentid", "1");
		jrows.add(row);
		row = new JSONObject();
		row.put("id", "4");
		row.put("name", "规则应用");
		row.put("parentid", "");
		jrows.add(row);
		jrows = WDK.DataFormat_Tree(jrows, "id", "name", "parentid");
		context.setPrintOut(jrows.toString());
	}
	
	/**
	 * 规则列表
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void rule_list(WDKContext context) throws Exception {
		JSONObject jrows = new JSONObject();
		try{
			//获取上下文中其他参数
			String rule_name = context.getString("rule_name");//查询表名词
			
			String sec = "IsActive = '1'";
			if(!"".equals(rule_name)){
				sec = sec + " and ( RuleCode like '%"+rule_name+"%' or RuleName like '%"+rule_name+"%')";
			}
			
			WQLObject bc = _WQL_GetWO(MST_BC);
			if(bc==null) throw new Exception("WQLObject【"+MST_BC+"】不存在！");
			ResultBean ret = _WQL_PageQuery(context, bc, sec, "RuleCode asc");	
			if(ret.isSuccess()){
				jrows = ret.pageResult();
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
		}catch (Exception e) {
			//如何向前台发送错误信息？
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		context.setPrintOut(jrows.toString());
	}

	
	public void rule_delete(WDKContext context) throws Exception {
		boolean isSuccess = true;
		String err = "";
		try{
			String ruleuuids = context.getString("ruleuuid");
			String[] ruleuuid = ruleuuids.split(",");
			
			WQLObject bc = _WQL_GetWO("PF_PB_CBuilderRule");
			if(bc==null) throw new Exception("WQLObject【PF_PB_CBuilderRule】不存在！");
			//循环删除
			for(int i=0;i<ruleuuid.length;i++){
				if(!"".equals(ruleuuid[i])){
					//判断是否已发布
					ResultBean ret = _WQL_Query(context, bc, "ruleuuid = '"+ruleuuid[i]+"'");
					if(ret.isSuccess()==false){
						StringBuffer sf = new StringBuffer();
						ArrayList errlist = ret.getInfoError();
						for(int j=0;j<errlist.size();j++){
							ErrorBean errBean = (ErrorBean)errlist.get(j);
							sf.append(errBean.toString());
							sf.append("\n");
						}
						throw new Exception(sf.toString());
					}
					WQLData dataSet = ret.getWQLData(bc, 0);
					if(dataSet.getRowCount()==0){
						throw new Exception("编码规则记录不存在，ID=["+ruleuuid[i]+"]");
					}
					dataSet.first();
					dataSet.next();
					String IsActive = dataSet.getValue("IsActive");
					String RuleCode = dataSet.getValue("RuleCode");
					if(!"1".equals(IsActive)){
						throw new Exception("编码规则["+RuleCode+"]不可用！");
					}
					
					//主表删除
					HashMap values = new HashMap();
					values.put("IsActive", "0");
					ret = _WQL_Update(context, bc, values, "ruleuuid = '"+ruleuuid[i]+"'");
					if(ret.isSuccess()==false){
						StringBuffer sf = new StringBuffer();
						ArrayList errlist = ret.getInfoError();
						for(int j=0;j<errlist.size();j++){
							ErrorBean errBean = (ErrorBean)errlist.get(j);
							sf.append(errBean.toString());
							sf.append("\n");
						}
						throw new Exception(sf.toString());
					}
				}
			}
		}catch (Exception e) {
			err = e.getMessage();
			logger.errorWithNoException(err);
			e.printStackTrace();
			isSuccess = false;
		}
			
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "删除成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "删除失败！\n"+err);
		}
		
		context.setPrintOut(jres.toString());
	}
	
	/**
	 * 新增规则
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void rule_new(WDKContext context) throws Exception {
		JSONObject jrows = null;
		try{
			WQLObject bc = _WQL_GetWO(MST_BC);
			if(bc==null) throw new Exception("WQLObject【"+MST_BC+"】不存在！");
			
			//新增记录，并按BC定义初始化字段值
			WQLData dataSet = new WQLData(bc);
			//dataSet.create(bc);
			dataSet.insert();			
			//其他字段值再处理
			dataSet.setValue("CanBreak", "1");
			dataSet.setValue("NewShow", "1");
			dataSet.setValue("CanModify", "0");
			dataSet.setValue("isactive", "1");
			
			JSONArray datas = dataSet.getDataJSONArray();
			
			if(datas.size()>0){
				jrows = datas.getJSONObject(0);
			}
		}catch (Exception e) {
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		
		if(null==jrows){
			jrows = new JSONObject();
			jrows.put("code", "0");
			jrows.put("desc", "未找到对应记录");
		}else{
			jrows.put("code", "1");
			jrows.put("desc", "查找成功");
		}
		
		context.setPrintOut(jrows.toString());
	}
	
	/**
	 * 规则检查
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void rule_check(WDKContext context) throws Exception {
		String rulecode = context.getString("rulecode");
		
		boolean isSuccess = true;
		String err = "";		
		
		try{
			WQLObject bc = _WQL_GetWO(MST_BC);
			if(bc==null) throw new Exception("WQLObject【"+MST_BC+"】不存在！");
			
			ResultBean ret = _WQL_Query(context, bc, "rulecode='"+rulecode+"' and IsActive='1'");
			if(ret.isSuccess()){
				if( ret.getResultSet(0).size() > 0){
					throw new Exception("规则代码为【"+rulecode+"】的记录已存在！");
				}
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
		}catch (Exception e) {
			isSuccess = false;
			err = e.getMessage();
			logger.errorWithNoException(err);
			e.printStackTrace();
		}
		
		JSONObject jrows = new JSONObject();
		if(isSuccess){
			jrows.put("code", "1");
			jrows.put("desc", "");
		}else{
			jrows.put("code", "0");
			jrows.put("desc", err);
		}
		
		context.setPrintOut(jrows.toString());
	}
	
	/**
	 * 规则插入
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void rule_insert(WDKContext context) throws Exception {
		boolean isSuccess = true;
		String err = "";
		try{
			SessionUser su = _getSessionuser(context);
			
			WQLObject bc = _WQL_GetWO(MST_BC);
			if(bc==null) throw new Exception("WQLObject【"+MST_BC+"】不存在！");
			
			WQLData boDataSet = getSingleRowWQLData(context,bc);
			boDataSet.setValue("CreatorUUID", su!=null?su.getPersonuuid():"0");
			boDataSet.setValue("CreateTime", WDK.getDateTimeByFormat("yyyyMMddHHmmss"));
			
			ResultBean ret = _WQL_Insert(context,bc,boDataSet);
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
		}catch(Exception ex){
			isSuccess = false;
			err = ex.getMessage();
			logger.errorWithNoException(err);
			ex.printStackTrace();
		}
		
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "添加成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "添加失败！\n"+err);
		}
		
		context.setPrintOut(jres.toString());
	}
	
	/**
	 * 规则更新
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void rule_update(WDKContext context) throws Exception {
		//获取上下文中其他参数
		String ruleuuid = context.getString("ruleuuid");//记录标识
		
		boolean isSuccess = true;
		String err = "";
		try{
			//获取数据模型定义
			WQLObject bc = _WQL_GetWO(MST_BC);
			if(bc==null) throw new Exception("WQLObject【"+MST_BC+"】不存在！");
			
			HashMap values = getFieldValues(context,bc);
			String whereClause = "ruleuuid = '"+ ruleuuid +"'";
			ResultBean ret = _WQL_Update(context,bc, values, whereClause);
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
			
		}catch(Exception ex){
			isSuccess = false;
			err = ex.getMessage();
			logger.errorWithNoException(err);
			ex.printStackTrace();
		}
		
		
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "保存成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "保存失败！\n"+err);
		}
		
		context.setPrintOut(jres.toString());
	}
	
	/**
	 * 规则信息
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void rule_info(WDKContext context) throws Exception {
		JSONObject jrows = null;
		try{
			//获取数据库连接bean
			//ConnectBean conb = context.getConnectBean();
			//获取上下文中其他参数
			String optype = (String)context.get("optype"); //add-新增   update-修改
			String ruleuuid = (String)context.get("ruleuuid");			
	
			WQLObject bc = WQLObject.getWQLObject(MST_BC);
			
			JSONArray datas = null;
			if("add".equals(optype)){
				//新增记录，并按BC定义初始化字段值
				WQLData dataSet = new WQLData(bc);
				//dataSet.create(bc);
				dataSet.insert();			
				//其他字段值再处理
				dataSet.setValue("IsActive", "1");
				
				datas = dataSet.getDataJSONArray();
			}else{
				datas = _WQL_Query(context,bc, "ruleuuid='"+ruleuuid+"'").getResultJSONArray(0);
			}		
			
			if(datas.size()>0){
				jrows = datas.getJSONObject(0);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		if(null==jrows){
			jrows = new JSONObject();
			jrows.put("code", "0");
			jrows.put("desc", "未找到对应记录");
		}else{
			jrows.put("code", "1");
			jrows.put("desc", "查找成功");
		}
		
		context.setPrintOut(jrows.toString());
	}
	
	/**
	 * 分段列表
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void section_list(WDKContext context) throws Exception {
		JSONArray jrows = new JSONArray();
		try{
			//获取数据库连接bean
			//ConnectBean conb = context.getConnectBean();
			//获取上下文中其他参数
			String optype =  context.getString("optype"); //add-新增   update-修改
			String ruleuuid =  context.getString("ruleuuid");			
			
			WQLObject bc = WQLObject.getWQLObject(DTL_BC);			
			
			if("add".equals(optype)){
				//新增时自动添加系统内置字段
				WQLData dataSet = new WQLData(bc);
				//dataSet.create(bc);
				jrows = dataSet.getDataJSONArray();
			}else{
				jrows = _WQL_Query(context,bc, "ruleuuid='"+ruleuuid+"'","SectionIndex").getResultJSONArray(0);
			}
		}catch(Exception e){
			//如何向前台发送错误信息？
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		logger.debug("结果集："+jrows.toString());
		context.setPrintOut(jrows.toString());
	}
	
	/**
	 * 分段保存
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void section_save(WDKContext context) throws Exception {
		//获取上下文中其他参数
		String ruleuuid = context.getString("ruleuuid");//标识
		
		boolean isSuccess = true;
		String err = "";
		try{
			WQLObject bc_field = _WQL_GetWO(DTL_BC);
			if(bc_field==null) throw new Exception("WQLObject【"+DTL_BC+"】不存在！");
			
			//===========================field=================================
			ResultBean ret = _WQL_Query(context, bc_field, "ruleuuid='"+ruleuuid+"'");
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
			WQLData fieldoldDataSet = ret.getWQLData(bc_field,0);//数据库中的原数据
			WQLData fieldcolumnAllDataSet = getMultiRowWQLData(context,bc_field, "allrows");//界面上的新数据
			
			List<String> fieldcolumnNames = fieldoldDataSet.getColumnNames();
			
			//处理标志位
			int index=1;
			fieldoldDataSet.first();
			while(fieldoldDataSet.next()){
				fieldoldDataSet.setDeleteMark();//设置删除标志
			}
			fieldcolumnAllDataSet.first();
			while(fieldcolumnAllDataSet.next()){
				if(fieldoldDataSet.locate(fieldcolumnAllDataSet)){
					//更新
					fieldoldDataSet.edit();//设置修改标志
				}else{
					//新增
					fieldoldDataSet.insert();//设置新增标志
				}
				//设置各字段值
				for(int i=0;i<fieldcolumnNames.size();i++){
					String columnName = fieldcolumnNames.get(i);
					fieldoldDataSet.setValue(columnName, fieldcolumnAllDataSet.getValue(columnName));
				}
				
				//按前台顺序处理排序序号
				fieldoldDataSet.setValue("sectionindex", String.valueOf(index));
				index++;
			}
			ret = _WQL_UpdateAll(context, bc_field, fieldoldDataSet);
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
		}catch(Exception ex){
			isSuccess = false;
			err = ex.getMessage();
			logger.errorWithNoException(err);
			ex.printStackTrace();
		}
		
		
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "保存成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "保存失败！\n"+err);
		}
		
		context.setPrintOut(jres.toString());
	}
	
	/**
	 * 分段参数列表
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void sectionpara_list(WDKContext context) throws Exception {
		JSONArray jrows = new JSONArray();
		try{
			//获取数据库连接bean
			//ConnectBean conb = context.getConnectBean();
			//获取上下文中其他参数
			String optype =  context.getString("optype"); //add-新增   update-修改
			String sectionuuid =  context.getString("sectionuuid");			
			
			WQLObject bc = WQLObject.getWQLObject(GDTL_BC);			
			if(bc==null) throw new Exception("WQLObject【"+GDTL_BC+"】不存在！");
			
			if("add".equals(optype)){
				//新增时自动添加系统内置字段
				WQLData dataSet = new WQLData(bc);
				//dataSet.create(bc);
				jrows = dataSet.getDataJSONArray();
			}else{
				jrows = _WQL_Query(context,bc, "sectionuuid='"+sectionuuid+"'","ParaCode").getResultJSONArray(0);
			}
		}catch(Exception e){
			//如何向前台发送错误信息？
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		logger.debug("结果集："+jrows.toString());
		context.setPrintOut(jrows.toString());
	}
	
	/**
	 * 分段参数保存
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void sectionpara_save(WDKContext context) throws Exception {
		//获取上下文中其他参数
		String sectionuuid = context.getString("sectionuuid");//标识
		
		boolean isSuccess = true;
		String err = "";
		try{
			WQLObject bc_field = _WQL_GetWO(GDTL_BC);
			if(bc_field==null) throw new Exception("WQLObject【"+GDTL_BC+"】不存在！");
			
			//===========================field=================================
			ResultBean ret = _WQL_Query(context, bc_field, "sectionuuid='"+sectionuuid+"'");
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
			WQLData fieldoldDataSet = ret.getWQLData(bc_field,0);//数据库中的原数据
			WQLData fieldcolumnAllDataSet = getMultiRowWQLData(context,bc_field, "allrows");//界面上的新数据
			
			List<String> fieldcolumnNames = fieldoldDataSet.getColumnNames();
			
			//处理标志位
			fieldoldDataSet.first();
			while(fieldoldDataSet.next()){
				fieldoldDataSet.setDeleteMark();//设置删除标志
			}
			fieldcolumnAllDataSet.first();
			while(fieldcolumnAllDataSet.next()){
				if(fieldoldDataSet.locate(fieldcolumnAllDataSet)){
					//更新
					fieldoldDataSet.edit();//设置修改标志
				}else{
					//新增
					fieldoldDataSet.insert();//设置新增标志
				}
				//设置各字段值
				for(int i=0;i<fieldcolumnNames.size();i++){
					String columnName = fieldcolumnNames.get(i);
					fieldoldDataSet.setValue(columnName, fieldcolumnAllDataSet.getValue(columnName));
				}
				
			}
			ret = _WQL_UpdateAll(context, bc_field, fieldoldDataSet);
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
		}catch(Exception ex){
			isSuccess = false;
			err = ex.getMessage();
			logger.errorWithNoException(err);
			ex.printStackTrace();
		}
		
		
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "保存成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "保存失败！\n"+err);
		}
		
		context.setPrintOut(jres.toString());
	}
	
	public void rule_apporgltree(WDKContext context) throws Exception {
		JSONArray jrows = new JSONArray();
		try{
			//获取数据库连接bean
			//ConnectBean conb = context.getConnectBean();
			//获取上下文中其他参数
			String ruleuuid =  context.getString("ruleuuid");		
			
			WQLObject wor = _WQL_GetWO(MST_BC);
			ResultBean rbr = _WQL_Query(context, wor, "ruleuuid='"+ruleuuid+"'");
			WQLData wdr = rbr.getWQLData(wor, 0);
			if(wdr.getRowCount()==0){
				throw new Exception("");
			}
			wdr.first();
			wdr.next();
			String RuleCode = wdr.getValue("RuleCode");
			
			WQLObject wo = _WQL_GetWO("PF_PB_CBuilderRuleAppORG");
			ResultBean rb =_WQL_Query(context, wo, "RuleAppCode='"+RuleCode+"'");
			WQLData wd = rb.getWQLData(wo, 0);
			
			
			jrows = UUM.getOrgList("", "", "", "-1", "U072", "", "0", "1", context.getConnectBean());//U082
			
			wd.first();
			while(wd.next()){
				String OrgUUID = wd.getValue("OrgUUID");
				for(int i=jrows.size()-1;i>=0;i--){
					if(jrows.getJSONObject(i).getString("org_uuid").equals(OrgUUID)){
						jrows.remove(i);
					}
				}
			}			
			
			jrows = WDK.DataFormat_Tree(jrows, "org_uuid", "org_name", "");
			
		}catch(Exception e){
			//如何向前台发送错误信息？
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		logger.debug("结果集："+jrows.toString());
		context.setPrintOut(jrows.toString());
	}
	
	public void rule_apporgrtree(WDKContext context) throws Exception {
		JSONArray jrows = new JSONArray();
		try{
			//获取数据库连接bean
			//ConnectBean conb = context.getConnectBean();
			//获取上下文中其他参数
			String ruleuuid =  context.getString("ruleuuid");		
			
			WQLObject wor = _WQL_GetWO(MST_BC);
			ResultBean rbr = _WQL_Query(context, wor, "ruleuuid='"+ruleuuid+"'");
			WQLData wdr = rbr.getWQLData(wor, 0);
			if(wdr.getRowCount()==0){
				throw new Exception("");
			}
			wdr.first();
			wdr.next();
			String RuleCode = wdr.getValue("RuleCode");
			
			WQLObject wo = _WQL_GetWO("PF_PB_CBuilderRuleAppORG");
			ResultBean rb =_WQL_Query(context, wo, "RuleAppCode='"+RuleCode+"'");
			WQLData wd = rb.getWQLData(wo, 0);//已选组织			
			
			jrows = UUM.getOrgList("", "", "", "-1", "U072", "", "0", "1", context.getConnectBean());//所有公司级组织	U082		
			
			for(int i=jrows.size()-1;i>=0;i--){
				JSONObject o = jrows.getJSONObject(i);
				String org_level_scode = o.getString("org_level_scode");
				String org_uuid = o.getString("org_uuid");
				
				boolean find = false;
				if(wd.getRowCount()>0){
					//if(!org_level_scode.equals("U081")){
						wd.first();
						while(wd.next()){
							String OrgUUID = wd.getValue("OrgUUID");
							if(org_uuid.equals(OrgUUID)){
								find = true;
								break;
							}
						}
					//}
				}
				
				if(find==false){
					jrows.remove(i);
				}
			}
					
			
			jrows = WDK.DataFormat_Tree(jrows, "org_uuid", "org_name", "");
			
		}catch(Exception e){
			//如何向前台发送错误信息？
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		logger.debug("结果集："+jrows.toString());
		context.setPrintOut(jrows.toString());
	}

	public void rule_appinfo(WDKContext context) throws Exception {
		JSONObject jrows = null;
		try{
			//获取数据库连接bean
			//ConnectBean conb = context.getConnectBean();
			//获取上下文中其他参数
			String optype = (String)context.get("optype"); //add-新增   update-修改
			String ruleuuid = (String)context.get("ruleuuid");
			
			WQLObject wor = _WQL_GetWO(MST_BC);
			ResultBean rbr = _WQL_Query(context, wor, "ruleuuid='"+ruleuuid+"'");
			WQLData wdr = rbr.getWQLData(wor, 0);
			if(wdr.getRowCount()==0){
				throw new Exception("");
			}
			wdr.first();
			wdr.next();
			String RuleCode = wdr.getValue("RuleCode");
	
			WQLObject bc = WQLObject.getWQLObject("PF_PB_CBuilderRuleApp");
			
			JSONArray datas = _WQL_Query(context,bc, "RuleAppCode='"+RuleCode+"'").getResultJSONArray(0);
			
			if(datas.size()>0){
				jrows = datas.getJSONObject(0);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		if(null==jrows){
			jrows = new JSONObject();
			jrows.put("code", "0");
			jrows.put("desc", "未找到对应记录");
		}else{
			jrows.put("code", "1");
			jrows.put("desc", "查找成功");
		}
		
		context.setPrintOut(jrows.toString());
	}
	
	public void rule_appsave(WDKContext context) throws Exception {
		boolean isSuccess = true;
		String err = "";
		try{
			//获取上下文中其他参数
			String ruleuuid = context.getString("ruleuuid");//标识
			String controltype = context.getString("controltype");//控制范围
			String orguuids = context.getString("orguuids");//应用组织标识
			JSONArray jorguuids = JSONArray.fromObject(orguuids);
			
			WQLObject wor = _WQL_GetWO(MST_BC);
			ResultBean rbr = _WQL_Query(context, wor, "ruleuuid='"+ruleuuid+"'");
			WQLData wdr = rbr.getWQLData(wor, 0);
			if(wdr.getRowCount()==0){
				throw new Exception("");
			}
			wdr.first();
			wdr.next();
			String RuleCode = wdr.getValue("RuleCode");
			
			WQLObject bc = WQLObject.getWQLObject("PF_PB_CBuilderRuleApp");
			ResultBean rb = _WQL_Query(context, bc, "RuleAppCode='"+RuleCode+"'");
			if(rb.isSuccess()==false){
				StringBuffer sf = new StringBuffer();
				ArrayList errlist = rb.getInfoError();
				for(int i=0;i<errlist.size();i++){
					ErrorBean errBean = (ErrorBean)errlist.get(i);
					sf.append(errBean.toString());
					sf.append("\n");
				}
				throw new Exception(sf.toString());
			}
			WQLData wd = new WQLData(bc);
			wd.insert();
			wd.setValue("RuleAppCode", RuleCode);
			wd.setValue("RuleUUID", ruleuuid);
			wd.setValue("ControlType", controltype);
			if(rb.getResultSet(0).size()==0){
				//新增
				rb = _WQL_Insert(context, bc, wd);
			}else{
				//修改
				rb = _WQL_Update(context, bc, wd);
			}
			if(rb.isSuccess()==false){
				StringBuffer sf = new StringBuffer();
				ArrayList errlist = rb.getInfoError();
				for(int i=0;i<errlist.size();i++){
					ErrorBean errBean = (ErrorBean)errlist.get(i);
					sf.append(errBean.toString());
					sf.append("\n");
				}
				throw new Exception(sf.toString());
			}
			//
			WQLObject woORG = WQLObject.getWQLObject("PF_PB_CBuilderRuleAppORG");
			rb = _WQL_Delete(context, woORG, "RuleAppCode='"+RuleCode+"'");
			if(rb.isSuccess()==false){
				StringBuffer sf = new StringBuffer();
				ArrayList errlist = rb.getInfoError();
				for(int i=0;i<errlist.size();i++){
					ErrorBean errBean = (ErrorBean)errlist.get(i);
					sf.append(errBean.toString());
					sf.append("\n");
				}
				throw new Exception(sf.toString());
			}
						
			WQLData wdORG = new WQLData(woORG);
			for(int i=0;i<jorguuids.size();i++){
				JSONObject org = jorguuids.getJSONObject(i);
				wdORG.insert();
				wdORG.setValue("RuleAppCode", RuleCode);
				wdORG.setValue("OrgUUID", org.getString("id"));
			}
			rb = _WQL_Insert(context, woORG, wdORG);
			if(rb.isSuccess()==false){
				StringBuffer sf = new StringBuffer();
				ArrayList errlist = rb.getInfoError();
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
		
		
		JSONObject jres = new JSONObject();
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "保存成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "保存失败！\n"+err);
		}
		
		context.setPrintOut(jres.toString());
	}
	
	
	public void getRuleAppInfo(WDKContext context) throws Exception {
		JSONObject jrows = new JSONObject();
		try{
			//获取上下文中其他参数
			String ruleappcode = (String)context.get("ruleappcode"); 
			String orguuid = (String)context.get("orguuid");
			
			WQLObject woApp = _WQL_GetWO("PF_PB_CBuilderRuleApp");
			ResultBean rbApp = _WQL_Query(context, woApp, "RuleAppCode='"+ruleappcode+"'");
			if(rbApp.isSuccess()==false){
				StringBuffer sf = new StringBuffer();
				ArrayList errlist = rbApp.getInfoError();
				for(int i=0;i<errlist.size();i++){
					ErrorBean errBean = (ErrorBean)errlist.get(i);
					sf.append(errBean.toString());
					sf.append("\n");
				}
				throw new Exception(sf.toString());
			}
			WQLData wdApp = rbApp.getWQLData(woApp, 0);
			if(wdApp.getRowCount()==0){
				throw new Exception("规则应用代码【"+ruleappcode+"】不存在！");
			}
			wdApp.first();wdApp.next();
			String RuleUUID = wdApp.getValue("RuleUUID");
			//
			WQLObject woORG = _WQL_GetWO("PF_PB_CBuilderRuleAppORG");
			ResultBean rbORG = _WQL_Query(context, woORG, "RuleAppCode='"+ruleappcode+"' and OrgUUID='"+orguuid+"'");
			if(rbORG.isSuccess()==false){
				StringBuffer sf = new StringBuffer();
				ArrayList errlist = rbORG.getInfoError();
				for(int i=0;i<errlist.size();i++){
					ErrorBean errBean = (ErrorBean)errlist.get(i);
					sf.append(errBean.toString());
					sf.append("\n");
				}
				throw new Exception(sf.toString());
			}
			WQLData wdORG = rbORG.getWQLData(woORG, 0);
			if(wdORG.getRowCount()==0){
				throw new Exception("规则应用代码【"+ruleappcode+"】未应用在机构【"+orguuid+"】！");
			}
			//
			WQLObject woRule = WQLObject.getWQLObject("PF_PB_CBuilderRule");
			JSONArray datas = _WQL_Query(context,woRule, "RuleUUID='"+RuleUUID+"' and IsActive='1'").getResultJSONArray(0);
			
			if(datas.size()>0){
				jrows.put("data",datas.getJSONObject(0));
			}else{
				throw new Exception("编码规则【"+RuleUUID+"】不存在或不可用！");
			}
			
			jrows.put("code", "1");
		}catch (Exception e) {
			jrows.put("code", "0");
			jrows.put("desc", e.getMessage());
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		
		context.setPrintOut(jrows.toString());
	}

	
	public void getNewCode(WDKContext context) throws Exception {
		boolean isSuccess = true;
		String err = "";
		JSONObject jres = new JSONObject();
		try{
			//获取上下文中其他参数
			String ruleappcode = (String)context.get("ruleappcode"); 
			String orguuid = (String)context.get("orguuid");			
			
			ResultBean ret = WQLUtil.getWQL(WQLNames.UPFPBCB001).addParam("ruleappcode", ruleappcode)
								.addParam("orguuid", orguuid)
								.process(context.getConnectBean());
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
			JSONArray datas = ret.getResultJSONArray(0);
			
			if(datas.size()>0){
				jres.put("data",datas.getJSONObject(0));
			}else{
				throw new Exception("编码规则生成错误！");
			}
			
			logger.debug(datas.toString());			
			/*logger.debug("intcode:"+wo.wp.getCALLParam("PF_PB_CBuilder.输出.intcode", -1));
			logger.debug("strmessageerror:"+wo.wp.getCALLParam("PF_PB_CBuilder.输出.strmessageerror", -1));	*/		
			
		}catch(Exception ex){
			isSuccess = false;
			err = ex.getMessage();
			logger.errorWithNoException(err);
			ex.printStackTrace();
		}
		
		
		if(isSuccess){
			jres.put("code", "1");
			jres.put("desc", "");
		}else{
			jres.put("code", "0");
			jres.put("desc", err);
		}
		
		context.setPrintOut(jres.toString());
	}
}