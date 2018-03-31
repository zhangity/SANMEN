package com.longj.platform.busi.wdk.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.WDK;
import org.wdk.core.base.BaseAction;
import org.wdk.core.util.uLogger;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLModule;
import org.wdk.module.wql.core.bean.WQLModuleBean;
import org.wdk.module.wql.core.bean.WQLObject;
import org.wdk.module.wql.core.bean.XLSTableRow;

public class WQLBaseAction extends BaseAction{
	static uLogger logger = new uLogger(WQLBaseAction.class.getName());
	
	/**
	 * 公用分页查询
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public boolean pagequery(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String modulecode = _getParameter("modulecode", request, response);
		String orderbyfield = _getParameter("orderbyfield", request, response);
		String condition = _getParameter("condition",request, response);
		WQLObject wo = WQLObject.getWQLObject(modulecode);
		ResultBean ret = wo.pagequery(condition, null, orderbyfield, request, null);
		JSONObject jres = ret.pageResult();
		_PRINT(request, response, jres.toString());
		return true;
	}
	/**
	 * 普通查询方法
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public boolean query(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String modulecode = _getParameter("modulecode", request, response);
		String orderbyfield = _getParameter("orderbyfield", request, response);
		String condition = _getParameter("condition",request, response);
		WQLObject wo = WQLObject.getWQLObject(modulecode);
		ResultBean ret = wo.query(condition, orderbyfield, null);
		JSONArray jrows = ret.getResultJSONArray(0);
		_PRINT(request, response, jrows.toString());
		return true;
	}
	/**
	 * 查询树
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public boolean querytree(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String modulecode = _getParameter("modulecode", request, response);
		String condition = _getParameter("condition",request, response);
		String parentfield = _getParameter("parentfield",request, response);
		String orderbyfield = _getParameter("orderbyfield",request, response);
		
		WQLModule wm = WQLModule.getWQLModule(modulecode);
		WQLObject wo = WQLObject.getWQLObject(modulecode);
		
		String idfield = wm.getValuefield();
		String namefield = wm.getNamefield();
		
		
		ResultBean ret = wo.query(condition, orderbyfield, null);
		JSONArray jrows = ret.getResultJSONArray(0);
		//获取所有字段作为属性列
		String attrs = "";
		if(jrows.size()>0){
			JSONObject jrow = jrows.getJSONObject(0);
			for(Iterator<String> it = jrow.keys();it.hasNext();){
				String key = it.next();
				attrs += key+",";
			}
		}
		if(attrs.length()>0){
			attrs = attrs.substring(0,attrs.length()-1);
		}
		attrs = attrs.toLowerCase();
		
		jrows = WDK.DataFormat_Tree(jrows, idfield, namefield,parentfield,"",attrs);
		
		_PRINT(request, response, jrows.toString());
		return true;
	}
	
	/**
	 * 公用删除方法
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public boolean remove(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String modulecode = _getParameter("modulecode", request, response);
		String condition = _getParameter("condition",request, response);
		WQLObject wo = WQLObject.getWQLObject(modulecode);
		ResultBean rb = wo.delete(condition, null);
		JSONObject jres = new JSONObject();
		if(rb.isSuccess()){
			jres.put("code", "1");
			jres.put("desc", "删除成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "删除失败！");
		}
		_PRINT(request, response, jres.toString());
		return true;
	}
	
	
	public boolean modulelist(HttpServletRequest request, HttpServletResponse response) throws Exception {
		JSONArray jrows = new JSONArray();
		try{
			String modulecode = _getParameter("modulecode", request, response);
			String condition = _getParameter("condition",request, response);
			
			//特殊符号替换 @upd daru.zheng 因为特殊情况单引号传不了
			condition = condition.replace("@", "'");
			
			WQLModule wm = WQLModule.getWQLModule(modulecode);
			ArrayList<WQLModuleBean> list = wm.query(condition,null);
			if(list!=null){
				for(int i=0;i<list.size();i++){
					WQLModuleBean wmb = list.get(i);
					JSONObject row = new JSONObject();
					row.put("_id", wmb.getValue());
					row.put("_name", wmb.getName());
					jrows.add(row);
				}
			}
			jrows = WDK.DataFormat_Combox(jrows, "_id", "_name");
		}catch(Exception e){
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		_PRINT(request, response, jrows.toString());
		return true;
	}
	
	public boolean moduletree(HttpServletRequest request, HttpServletResponse response) throws Exception {
		JSONArray jrows = new JSONArray();
		String attrs = "";
		try{
			String modulecode = _getParameter("modulecode", request, response);
			String condition = _getParameter("condition",request, response);
			String parentfield = _getParameter("parentfield",request, response);
			if(modulecode==null) modulecode= "";
			if(parentfield==null) parentfield= "";
			
			WQLModule wm = WQLModule.getWQLModule(modulecode);
			ArrayList<WQLModuleBean> list = wm.query(condition,null);
			if(list!=null){
				for(int i=0;i<list.size();i++){
					WQLModuleBean wmb = list.get(i);
					HashMap<String, String> data =wmb.getRow();
//					JSONObject row = new JSONObject();
					JSONObject row = WDK.map2json(data);
					attrs = WDK.getMapKeys(data);
					row.put("_id", wmb.getValue());
					row.put("_name", wmb.getName());
					
					String parentid = "";
					if(data!=null && !"".equals(parentfield)){
						if(data.containsKey(parentfield.toUpperCase())){
							parentid = data.get(parentfield.toUpperCase());
						}else if(data.containsKey(parentfield.toLowerCase())){
							parentid = data.get(parentfield.toLowerCase());
						}
					}
					row.put("_parentid", parentid);
					
					jrows.add(row);
				}
			}
			jrows = WDK.DataFormat_Tree(jrows, "_id", "_name", "_parentid","",attrs);
		}catch(Exception e){
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		_PRINT(request, response, jrows.toString());
		return true;
	}

	public boolean modulegrid(HttpServletRequest request, HttpServletResponse response) throws Exception {
		JSONArray jrows = new JSONArray();
		try{
			String modulecode = _getParameter("modulecode", request, response);
			String condition = _getParameter("condition",request, response);
			
			WQLModule wm = WQLModule.getWQLModule(modulecode);
			ArrayList<WQLModuleBean> list = wm.query(condition,null);
			if(list!=null){
				for(int i=0;i<list.size();i++){
					WQLModuleBean wmb = list.get(i);
					HashMap<String, String> data =wmb.getRow();
					JSONObject row = new JSONObject();
					row.put("_id", wmb.getValue());
					row.put("_name", wmb.getName());
					
					Iterator<Entry<String, String>> it= data.entrySet().iterator();
					while(it.hasNext()){
						Entry<String, String> entry = it.next();
						row.put(entry.getKey().toLowerCase(), entry.getValue());
					}
					//logger.debug("row="+row.toString());
					jrows.add(row);
				}
			}
			//jrows = WDK.DataFormat_Combox(jrows, "_id", "_name");
		}catch(Exception e){
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		_PRINT(request, response, jrows.toString());
		return true;
	}

	
	public boolean modulequery(HttpServletRequest request, HttpServletResponse response) throws Exception {
		JSONObject jres = new JSONObject();
		JSONArray jrows = new JSONArray();
		try{
			String codename = request.getParameter("codename")==null?"":request.getParameter("codename");
			
			int nPageRecordNum = -1;
			int nPageStart = -1;
			// 分页参数
			String strRows = request.getParameter("rows");
			String strPage = request.getParameter("page");
			if (null != strRows && !"".equals(strRows.trim())) {
				nPageRecordNum = Integer.parseInt(strRows);
			}
			if (null != strPage && !"".equals(strPage.trim())) {
				nPageStart = Integer.parseInt(strPage) - 1;
			}
			
			HashMap<String,WQLModule> modulelist = WQLModule.getWQLModuleMap();
			Iterator<Entry<String, WQLModule>> it = modulelist.entrySet().iterator();
			int index=0;
			int count=0;
			while(it.hasNext()){
				
				Entry<String, WQLModule> entry = it.next();
				WQLModule wm = entry.getValue();
				if(wm.getModulecode().toUpperCase().indexOf(codename.toUpperCase())>-1){
					index++;
					if(index>=nPageStart*nPageRecordNum && count<=nPageRecordNum){
						count++;
						jrows.add(wm.toJSON());
					}
				}
			}
			
			jres.put("rows", jrows);
			jres.put("total", Integer.toString(index));
		}catch(Exception e){
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
			jres.put("rows", jrows);
			jres.put("total", "0");
		}
		_PRINT(request, response, jres.toString());
		return true;
	}

	public boolean modulerefresh(HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean isSuccess = true;
		String err = "";
		try{
			String codename = request.getParameter("codename")==null?"":request.getParameter("codename");
			//CacheDataHelper.removeCodeDate(codename);
			WQLModule wm = WQLModule.getWQLModule(codename);
			if(wm!=null){
				wm.reload();
			}else{
				throw new Exception("代码模型["+codename+"]不存在！");
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
			jres.put("desc", "操作成功！");
		}else{
			jres.put("code", "0");
			jres.put("desc", "操作失败！\n"+err);
		}
		
		_PRINT(request, response,  jres.toString());
		return isSuccess;
	}
}