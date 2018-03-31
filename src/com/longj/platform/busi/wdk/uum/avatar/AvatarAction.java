package com.longj.platform.busi.wdk.uum.avatar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.platform.busi.wdk.base.BaseActionMethod;


public class AvatarAction extends BaseActionMethod {
	private static WDKLogger logger = new WDKLogger(AvatarAction.class.getName());
	private static String MST_BC = "PF_PB_Avatar";
	private static String DTL_BC = "PF_PB_AvatarPara";
	
	/**
	 * 虚拟角色列表
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void avatar_list(WDKContext context) throws Exception {
		JSONObject jrows = new JSONObject();
		try{
			//获取上下文中其他参数
			String app_uuid = context.getString("app_uuid");//应用系统标识
			String avatar_name = context.getString("avatar_name");//查询表名词
			
			String sec = "sysisdelete = '0'";
			if(!"".equals(avatar_name)){
				sec = sec + " and avatar_name like '%"+avatar_name+"%'";
			}
			if(!"".equals(app_uuid)){
				sec = sec + " and app_uuid = '"+app_uuid+"'";
			}
			
			WQLObject bc = WQLObject.getWQLObject(MST_BC);			
			ResultBean ret = _WQL_PageQuery(context, bc, sec, "avatar_name asc");	
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

	/**
	 * 虚拟角色信息
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void avatar_info(WDKContext context) throws Exception {
		JSONObject jrows = null;
		try{
			//获取数据库连接bean
			//ConnectBean conb = context.getConnectBean();
			//获取上下文中其他参数
			String optype = (String)context.get("optype"); //add-新增   update-修改
			String avatar_uuid = (String)context.get("avatar_uuid");			
	
			WQLObject bc = WQLObject.getWQLObject(MST_BC);
			
			JSONArray datas = null;
			if("add".equals(optype)){
				//新增记录，并按BC定义初始化字段值
				WQLData dataSet = new WQLData(bc);
				//dataSet.create(bc);
				dataSet.insert();			
				//其他字段值再处理
				dataSet.setValue("sysisdelete", "0");
				
				datas = dataSet.getDataJSONArray();
			}else{
				datas = _WQL_Query(context,bc, "avatar_uuid='"+avatar_uuid+"'").getResultJSONArray(0);
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
	 * 参数列表
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void para_list(WDKContext context) throws Exception {
		JSONArray jrows = new JSONArray();
		try{
			//获取数据库连接bean
			//ConnectBean conb = context.getConnectBean();
			//获取上下文中其他参数
			String optype =  context.getString("optype"); //add-新增   update-修改
			String avatar_uuid =  context.getString("avatar_uuid");			
			
			WQLObject bc = WQLObject.getWQLObject(DTL_BC);			
			
			if("add".equals(optype)){
				//新增时自动添加系统内置字段
				WQLData dataSet = new WQLData(bc);
				//dataSet.create(bc);
				jrows = dataSet.getDataJSONArray();
			}else{
				jrows = _WQL_Query(context,bc, "avatar_uuid='"+avatar_uuid+"'").getResultJSONArray(0);
			}
		}catch(Exception e){
			//如何向前台发送错误信息？
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		logger.debug("结果集："+jrows.toString());
		context.setPrintOut( jrows.toString());
	}
	
	/**
	 * 
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void avatar_check(WDKContext context) throws Exception {
		String avatar_name = context.getString("avatar_name");
		String app_uuid = context.getString("app_uuid");
		
		boolean isSuccess = true;
		String err = "";		
		
		try{
			//获取数据库连接bean
			//ConnectBean conb = context.getConnectBean();
			//获取上下文中其他参数
			
			WQLObject bc = WQLObject.getWQLObject(MST_BC);
			ResultBean ret = _WQL_Query(context, bc, "avatar_name='"+avatar_name+"' and app_uuid ='"+app_uuid+"' and sysisdelete='0'");
			if(ret.isSuccess()){
				if( ret.getResultSet(0).size() > 0){
					throw new Exception("虚拟角色名称为【"+avatar_name+"】的记录已存在！");
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
	
	
	public void avatar_save(WDKContext context) throws Exception {
		//获取上下文中其他参数
		String optype = context.getString("optype");//操作类型  add-新增   update-修改，读取原信息
		String avatar_uuid = context.getString("avatar_uuid");//记录标识
		
		boolean isSuccess = true;
		String err = "";
		try{
			//获取数据模型定义
			WQLObject bc_mst = WQLObject.getWQLObject(MST_BC);
			WQLObject bc_dtl = WQLObject.getWQLObject(DTL_BC);
			
			//========================主表=================================
			if("add".equals(optype)){
				//新增
				WQLData tableDataSet = getSingleRowWQLData(context,bc_mst);
				ResultBean ret = _WQL_Insert(context,bc_mst,tableDataSet);
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
			}else{
				//修改data修改
				//isSuccess = WQL.executeUpdate(bc_table, conb).isSuccess();
				//按where语句修改
				HashMap values = getFieldValues(context,bc_mst);
				String whereClause = "avatar_uuid = '"+ avatar_uuid +"'";
				ResultBean ret = _WQL_Update(context,bc_mst, values, whereClause);
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
			}
			
			//处理方法二：先取出数据库中的原明细记录，再和前台传入的数据合并，将最后合并后的结果保存到数据库中
			ResultBean ret = _WQL_Query(context, bc_dtl, "avatar_uuid='"+avatar_uuid+"'");
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
			WQLData oldDataSet = ret.getWQLData(bc_dtl,0);//数据库中的原数据
			WQLData columnAllDataSet = getMultiRowWQLData(context,bc_dtl, "allrows");//界面上的新数据
			
			List<String> columnNames = oldDataSet.getColumnNames();
			
			//处理标志位
			oldDataSet.first();
			while(oldDataSet.next()){
				oldDataSet.setDeleteMark();//设置删除标志
			}
			columnAllDataSet.first();
			while(columnAllDataSet.next()){
				if(oldDataSet.locate(columnAllDataSet)){
					//更新
					oldDataSet.edit();//设置修改标志
				}else{
					//新增
					oldDataSet.insert();//设置新增标志
				}
				//设置各字段值
				for(int i=0;i<columnNames.size();i++){
					String columnName = columnNames.get(i);
					oldDataSet.setValue(columnName, columnAllDataSet.getValue(columnName));
				}
			}			
			ret = _WQL_UpdateAll(context, bc_dtl, oldDataSet);
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
			if("add".equals(optype)){
				jres.put("desc", "保存成功！");
			}else{
				jres.put("desc", "修改成功！");
			}
		}else{
			jres.put("code", "0");
			if("add".equals(optype)){
				jres.put("desc", "保存失败！\n"+err);
			}else{
				jres.put("desc", "修改失败！\n"+err);
			}
		}
		
		context.setPrintOut(jres.toString());
	}

	
}