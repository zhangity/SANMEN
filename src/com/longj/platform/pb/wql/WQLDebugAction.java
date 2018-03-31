package com.longj.platform.pb.wql;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.wdk.WDK;
import org.wdk.WDKCore;
import org.wdk.core.bean.AttachmentBean;
import org.wdk.core.bean.CatalogBean;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.core.util.Base64;
import org.wdk.module.cmd.WDKWriter;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.WQLCore;
import org.wdk.module.wql.core.DataType;
import org.wdk.module.wql.core.bean.DataTypeBean;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLModule;
import org.wdk.module.wql.core.bean.WQLObject;
import org.wdk.module.wql.core.bean.XLSTableRow;
import org.wdk.module.wql.core.engine.object.WO;

import com.longj.platform.busi.wdk.base.BaseActionMethod;


public class WQLDebugAction extends BaseActionMethod{
	private static WDKLogger logger = new WDKLogger(WQLDebugAction.class.getName());
	
	/**
	 * 从wo输入参数数组中取指定参数的参数值
	 * @param woins
	 * @param id
	 * @return
	 */
	private String getWOINValue(JSONArray woins , String id){
		if(woins==null) return "";
		for(int i=0;i<woins.size();i++){
			JSONObject woin =woins.getJSONObject(i);
			if(woin.getString("id").equalsIgnoreCase(id)){
				return woin.getString("text");
			}
		}
		return "";
	}
	
	/**
	 * 取数据模型默认排序方式（默认按主键升序）
	 * @param wo
	 * @return
	 */
	private String getDefOrderby(WQLObject wo){
		ArrayList<String> pks = wo.getPrimaryKeys();
		StringBuffer sb = new StringBuffer();
		if(pks.size()>0){
			for(int i=0; i<pks.size(); i++){
				if(sb.length()>0) sb.append(",");
				sb.append(pks.get(i));
			}
		}else{
			sb.append("1");
		}
		
		return sb.toString();
	}
	
	/**
	 * 数据表树
	 * @param context
	 * @throws Exception
	 */
	public void getTableTree(WDKContext context) throws Exception {
		List<String> tablelist = new ArrayList<String>();
		
		Set<String> keyset = WQLCore.tableMap.keySet();
		for(Iterator<String> it = keyset.iterator();it.hasNext();){
			String tbname = it.next();
			tablelist.add(tbname);
		}
		//排序
		//排序
		Collections.sort(tablelist, new Comparator<String>() {   
		    public int compare(String o1, String o2) {
		        return (o1.compareTo(o2));
		    }
		}); 
		
		JSONArray jrows = new JSONArray();
		for(int i=0;i<tablelist.size();i++){
			JSONObject row = new JSONObject();
			row.put("name",tablelist.get(i));
			row.put("file","-1");
			
			jrows.add(row);
		}
		
		context.setPrintOut(WDK.DataFormat_Tree(jrows, "name", "name", "file").toString());
	}
	
	/**
	 * WQL执行
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void debug(WDKContext context) throws Exception {
		JSONObject jrows = new JSONObject();
		WQLDebugLogAppender appender = new WQLDebugLogAppender();
		try{
			//初始化日志环境			
			Logger.getRootLogger().addAppender(appender);
			
			//获取数据库连接bean
			//ConnectBean conb = context.getConnectBean();
			//获取上下文中其他参数
			String wqlcontext = context.getString("wqlcontext");//wql语句
			String wqlargs = context.getString("wqlargs");//wql输入
			
			String[] wqlc = wqlcontext.split("\r\n");
			if("".equals(wqlargs)) wqlargs = "[]";
			JSONArray args = JSONArray.fromObject(wqlargs);
			
			
			ArrayList<String> ls = new ArrayList<String>();
			for(int i=0;i<wqlc.length;i++){
				ls.add(wqlc[i]);
			}
			WO wo = new WO("QTEST",ls);
			wo.wp.init();
			for(int i=0;i<args.size();i++){
				JSONObject arg = args.getJSONObject(i);
				if("PAGE_PAGESTART".equalsIgnoreCase(arg.getString("id")) || "PAGE_PAGERECORDNUM".equalsIgnoreCase(arg.getString("id"))){
					wo.addParam(arg.getString("id"), Integer.parseInt(arg.getString("text")));
				}else {
					wo.addParam(arg.getString("id"), arg.getString("text"));
				}
			}
			ResultBean rb = wo.process(context.getConnectBean());
			if(rb.isSuccess()){
				jrows.put("desc", "执行成功");
			}else{
				jrows.put("desc", "执行失败");
			}
			
			
			Logger.getRootLogger().removeAppender(appender);
						
		}catch (Exception e) {
			jrows.put("desc", e.getMessage());
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}finally{
			Logger.getRootLogger().removeAppender(appender);
			jrows.put("log", appender.toString());
		}
		
		
		_PRINT(context, jrows.toString());
	}
	
	/**
	 * 获取wql输入参数定义
	 * @param context
	 * @throws Exception
	 */
	public void getWQLIN(WDKContext context) throws Exception {
		JSONArray jrows = new JSONArray();
		try{
			//获取数据库连接bean
			//ConnectBean conb = context.getConnectBean();
			//获取上下文中其他参数
			String wqlcontext = context.getString("wqlcontext");//wql语句
			String[] wqlc = wqlcontext.split("\r\n");
			
			ArrayList<String> ls = new ArrayList<String>();
			for(int i=0;i<wqlc.length;i++){
				ls.add(wqlc[i]);
			}
			WO wo = new WO("QTEST",ls);
			wo.wp.init();
			HashMap inmap = wo.wp.getIN();
			Iterator<Entry<String, Object>> it = inmap.entrySet().iterator();
			while(it.hasNext()){
				Entry<String, Object> entry = it.next();
				String key = entry.getKey();
				if(key.startsWith("输入")){
					JSONObject param = new JSONObject();
					param.put("id", key.replaceAll("输入.", ""));
					param.put("type", "输入");
					param.put("value", "");
					jrows.add(param);
				}else if(key.startsWith("输入明细")){
					JSONObject param = new JSONObject();
					param.put("id", key.replaceAll("输入明细.", ""));
					param.put("type", "输入明细");
					param.put("value", "");
					jrows.add(param);
				}
			}
			
		}catch (Exception e) {
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		
		_PRINT(context, jrows.toString());
	}
	
	/**
	 * 获取数据模型输入参数定义
	 * @param context
	 * @throws Exception
	 */
	public void getWOIN(WDKContext context) throws Exception {
		JSONArray jrows = new JSONArray();
		try{
			String woname = context.getString("woname");//
			WQLObject wo = WQLObject.getWQLObject(woname);
			
			String type = context.getString("optiontype");//wql语句 query-查询 pagequery-分页查询 delete-删除  update-插入
			if("query".equalsIgnoreCase(type)){
				jrows = getWOQueryIN(wo);
			}else if("pagequery".equalsIgnoreCase(type)){
				jrows = getWOPageQueryIN(wo);
			}else if("insert".equalsIgnoreCase(type)){
				jrows = getWOInsertIN(wo);
			}else if("update".equalsIgnoreCase(type)){
				jrows = getWOUpdateIN(wo);
			}else if("delete".equalsIgnoreCase(type)){
				jrows = getWODeleteIN(wo);
			}
			
		}catch (Exception e) {
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
		}
		
		_PRINT(context, jrows.toString());
	}
	
	/**
	 * 获取数据模型WQL
	 * @param context
	 * @throws Exception
	 */
	public void getWOWQL(WDKContext context) throws Exception {
		JSONObject jrows = new JSONObject();
		try{
			String woname = context.getString("woname");		//数据模型名称
			String type = context.getString("optiontype");		//wql语句 query-查询 pagequery-分页查询 delete-删除  update-插入
			String woin = context.getString("woin");
			if("".equals(woin)) woin = "[]";
			JSONArray woins = JSONArray.fromObject(woin);
			
			String wqlcontext = "";
			JSONArray wqlargs = new JSONArray();
			WQLObject wo =WQLObject.getWQLObject(woname);
			if("query".equalsIgnoreCase(type)){
				//查询
				wqlcontext = getWOQueryWQL(woins, wo, wqlargs);
			}else if("pagequery".equalsIgnoreCase(type)){
				//分页查询
				wqlcontext = getWOPageQueryWQL(woins, wo, wqlargs);
			}else if("insert".equalsIgnoreCase(type)){
				//插入
				wqlcontext = getWOInsertWQL(woins, wo, wqlargs);
			}else if("update".equalsIgnoreCase(type)){
				//更新
				wqlcontext = getWOUpdateWQL(woins, wo, wqlargs);
			}else if("delete".equalsIgnoreCase(type)){
				//删除
				wqlcontext = getWODeleteWQL(woins, wo, wqlargs);
			}
			
			jrows.put("code", "1");
			jrows.put("desc", "执行成功");
			jrows.put("wqlcontext", wqlcontext);
			jrows.put("wqlargs", wqlargs);
			
		}catch (Exception e) {
			logger.errorWithNoException(e.getMessage());
			e.printStackTrace();
			jrows.put("code", "0");
			jrows.put("desc", e.getMessage());
		}
		
		_PRINT(context, jrows.toString());
	}

	/**
	 * WO query 方法输入参数
	 * @return
	 */
	private JSONArray getWOQueryIN(WQLObject wo){
		JSONArray jrows = new JSONArray();
		JSONObject param;
		
		param = new JSONObject();
		param.put("id", "whereclause");
		param.put("type", "查询条件");
		param.put("text", "");
		jrows.add(param);
		param = new JSONObject();
		param.put("id", "whereargs");
		param.put("type", "条件值");
		param.put("text", "");
		jrows.add(param);
		param = new JSONObject();
		param.put("id", "orderby");
		param.put("type", "排序");
		param.put("text", getDefOrderby(wo));
		jrows.add(param);
		
		return jrows;
	}
	
	/**
	 * WO pagequery 方法输入参数
	 * @return
	 */
	private JSONArray getWOPageQueryIN(WQLObject wo){
		JSONArray jrows = new JSONArray();
		JSONObject param;
		
		ArrayList<String> pks = wo.getPrimaryKeys();
		
		param = new JSONObject();
		param.put("id", "whereclause");
		param.put("type", "查询条件");
		param.put("text", "");
		jrows.add(param);
		param = new JSONObject();
		param.put("id", "whereargs");
		param.put("type", "条件值");
		param.put("text", "");
		jrows.add(param);
		param = new JSONObject();
		param.put("id", "SORT_ORDERBYFIELD");
		param.put("type", "排序");
		param.put("text", getDefOrderby(wo));
		jrows.add(param);
		param = new JSONObject();
		param.put("id", "PAGE_PAGESTART");
		param.put("type", "起始记录数");
		param.put("text", "0");
		jrows.add(param);
		param = new JSONObject();
		param.put("id", "PAGE_PAGERECORDNUM");
		param.put("type", "每页记录数");
		param.put("text", "50");
		jrows.add(param);
		
		return jrows;
	}

	/**
	 * WO insert 方法输入参数
	 * @param wo
	 * @return
	 */
	private JSONArray getWOInsertIN(WQLObject wo){
		JSONArray jrows = new JSONArray();
		JSONObject param;
		
		List<XLSTableRow> fields = wo.getCols();//数据表字段
		for(int i=0;i<fields.size();i++){
			XLSTableRow field = fields.get(i);
			param = new JSONObject();
			param.put("id", field.getEnname());
			param.put("type", field.getCnname());
			param.put("text", field.getDefaultvalue());
			jrows.add(param);
		}
		
		return jrows;
	}
	
	/**
	 * WO update 方法输入参数
	 * @param wo
	 * @return
	 */
	private JSONArray getWOUpdateIN(WQLObject wo){
		JSONArray jrows = new JSONArray();
		JSONObject param;
		
		List<XLSTableRow> fields = wo.getCols();//数据表字段
		for(int i=0;i<fields.size();i++){
			XLSTableRow field = fields.get(i);
			param = new JSONObject();
			param.put("id", field.getEnname());
			param.put("type", field.getCnname());
			param.put("text", field.getDefaultvalue());
			jrows.add(param);
		}
		
		param = new JSONObject();
		param.put("id", "whereclause");
		param.put("type", "更新条件");
		param.put("text", "");
		jrows.add(param);
		param = new JSONObject();
		param.put("id", "whereargs");
		param.put("type", "条件值");
		param.put("text", "");
		jrows.add(param);
		
		return jrows;
	}
	
	/**
	 * WO delete 方法输入参数
	 * @param wo
	 * @return
	 */
	private JSONArray getWODeleteIN(WQLObject wo){
		JSONArray jrows = new JSONArray();
		JSONObject param;
		
		param = new JSONObject();
		param.put("id", "whereclause");
		param.put("type", "删除条件");
		param.put("text", "");
		jrows.add(param);
		param = new JSONObject();
		param.put("id", "whereargs");
		param.put("type", "条件值");
		param.put("text", "");
		jrows.add(param);
		
		return jrows;
	}

	/**
	 * WO query wql
	 * @param context
	 * @param wo
	 * @return
	 * @throws Exception
	 */
	private String getWOQueryWQL(JSONArray woins,WQLObject wo, JSONArray wqlargs) throws Exception{
		JSONObject wqlarg;
		if(wqlargs==null){
			wqlargs = new JSONArray();
		}else{
			wqlargs.clear();
		}
		
		String whereclause = getWOINValue(woins,"whereclause");		//where条件语句
		String whereargs = getWOINValue(woins,"whereargs");			//where条件参数值
		String orderby = getWOINValue(woins,"orderby");				//排序条件
		
		String[] wherearglst =  whereargs.split(",");
		ArrayList<String> whereArgNames = new ArrayList<String>();	//参数名列表		
		ArrayList<String> wql = wo.makeQuery(whereclause, wherearglst, orderby, whereArgNames);
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<wql.size();i++){
			sb.append(wql.get(i));
			sb.append("\r\n");
		}
			
		for(int i=0;i<whereArgNames.size();i++){
			//查询条件参数
			wqlarg = new JSONObject();
			wqlarg.put("id", whereArgNames.get(i));
			wqlarg.put("text", wherearglst[i]);
			wqlargs.add(wqlarg);
		}
		
		return sb.toString();
	}
	
	/**
	 * WO pagequery wql
	 * @param context
	 * @param wo
	 * @return
	 * @throws Exception
	 */
	private String getWOPageQueryWQL(JSONArray woins,WQLObject wo, JSONArray wqlargs) throws Exception{
		JSONObject wqlarg;
		if(wqlargs==null){
			wqlargs = new JSONArray();
		}else{
			wqlargs.clear();
		}
		
		String whereclause = getWOINValue(woins,"whereclause");	//where条件
		String whereargs = getWOINValue(woins,"whereargs");	//where条件
		String SORT_ORDERBYFIELD = getWOINValue(woins,"SORT_ORDERBYFIELD");	//排序条件
		String PAGE_PAGESTART = getWOINValue(woins,"PAGE_PAGESTART");	//排序条件
		String PAGE_PAGERECORDNUM = getWOINValue(woins,"PAGE_PAGERECORDNUM");	//排序条件
		
		String[] wherearglst =  whereargs.split(",");
		ArrayList<String> whereArgNames = new ArrayList<String>();//参数名列表
		ArrayList<String> wql = wo.makePageQuery(whereclause, wherearglst, SORT_ORDERBYFIELD, whereArgNames);
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<wql.size();i++){
			sb.append(wql.get(i));
			sb.append("\r\n");
		}
		
		for(int i=0;i<whereArgNames.size();i++){
			//查询条件参数
			wqlarg = new JSONObject();
			wqlarg.put("id", whereArgNames.get(i));
			wqlarg.put("text", wherearglst[i]);
			wqlargs.add(wqlarg);
		}
		//分页参数
		wqlarg = new JSONObject();
		wqlarg.put("id", "SORT_ORDERBYFIELD");
		wqlarg.put("text", SORT_ORDERBYFIELD);
		wqlargs.add(wqlarg);
		wqlarg = new JSONObject();
		wqlarg.put("id", "PAGE_PAGESTART");
		wqlarg.put("text", PAGE_PAGESTART);
		wqlargs.add(wqlarg);
		wqlarg = new JSONObject();
		wqlarg.put("id", "PAGE_PAGERECORDNUM");
		wqlarg.put("text", PAGE_PAGERECORDNUM);
		wqlargs.add(wqlarg);

		return sb.toString();
	}

	/**
	 * WO insert wql （按hashmap插入）
	 * @param context
	 * @param wo
	 * @param wqlargs
	 * @return
	 * @throws Exception
	 */
	private String getWOInsertWQL(JSONArray woins,WQLObject wo, JSONArray wqlargs) throws Exception{
		//按
		JSONObject wqlarg;
		if(wqlargs==null){
			wqlargs = new JSONArray();
		}else{
			wqlargs.clear();
		}
		
		HashMap values = new HashMap<String, String>();
		List<XLSTableRow> fields = wo.getCols();
		for(int i=0;i<fields.size();i++){
			XLSTableRow field = fields.get(i);
			values.put(field.getEnname(), getWOINValue(woins,field.getEnname()));
			//插入字段参数
			wqlarg = new JSONObject();
			wqlarg.put("id", field.getEnname());
			wqlarg.put("text", getWOINValue(woins,field.getEnname()));
			wqlargs.add(wqlarg);
		}
		
		ArrayList<String> wql = wo.makeValueMapInsert(values);
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<wql.size();i++){
			sb.append(wql.get(i));
			sb.append("\r\n");
		}
		
		return sb.toString();
	}
	
	/**
	 * WO update wql （按hashmap更新）
	 * @param context
	 * @param wo
	 * @param wqlargs
	 * @return
	 * @throws Exception
	 */
	private String getWOUpdateWQL(JSONArray woins,WQLObject wo, JSONArray wqlargs) throws Exception{
		//按
		JSONObject wqlarg;
		if(wqlargs==null){
			wqlargs = new JSONArray();
		}else{
			wqlargs.clear();
		}
		
		String whereclause = getWOINValue(woins,"whereclause");		//where条件语句
		String whereargs = getWOINValue(woins,"whereargs");			//where条件参数值
		String[] wherearglst =  whereargs.split(",");
		ArrayList<String> whereArgNames = new ArrayList<String>();	//参数名列表	
		
		HashMap values = new HashMap<String, String>();
		List<XLSTableRow> fields = wo.getCols();
		for(int i=0;i<fields.size();i++){
			XLSTableRow field = fields.get(i);
			values.put(field.getEnname(), getWOINValue(woins,field.getEnname()));
			//更新字段参数
			wqlarg = new JSONObject();
			wqlarg.put("id", field.getEnname());
			wqlarg.put("text", getWOINValue(woins,field.getEnname()));
			wqlargs.add(wqlarg);
		}
		
		ArrayList<String> wql = wo.makeValueMapUpdate(values, whereclause, wherearglst, whereArgNames);
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<wql.size();i++){
			sb.append(wql.get(i));
			sb.append("\r\n");
		}
		
		//where条件参数
		for(int i=0;i<whereArgNames.size();i++){
			wqlarg = new JSONObject();
			wqlarg.put("id", whereArgNames.get(i));
			wqlarg.put("text", wherearglst[i]);
			wqlargs.add(wqlarg);
		}
		
		return sb.toString();
	}
	
	
	/**
	 * WO delete wql （按条件删除）
	 * @param context
	 * @param wo
	 * @param wqlargs
	 * @return
	 * @throws Exception
	 */
	private String getWODeleteWQL(JSONArray woins, WQLObject wo, JSONArray wqlargs) throws Exception{
		//按
		JSONObject wqlarg;
		if(wqlargs==null){
			wqlargs = new JSONArray();
		}else{
			wqlargs.clear();
		}
		
		String whereclause = getWOINValue(woins,"whereclause");		//where条件语句
		String whereargs = getWOINValue(woins,"whereargs");			//where条件参数值
		String[] wherearglst =  whereargs.split(",");
		ArrayList<String> whereArgNames = new ArrayList<String>();	//参数名列表	
		
		ArrayList<String> wql = wo.makeDelete(whereclause, wherearglst, whereArgNames);
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<wql.size();i++){
			sb.append(wql.get(i));
			sb.append("\r\n");
		}
		
		//where条件参数
		for(int i=0;i<whereArgNames.size();i++){
			wqlarg = new JSONObject();
			wqlarg.put("id", whereArgNames.get(i));
			wqlarg.put("text", wherearglst[i]);
			wqlargs.add(wqlarg);
		}
		
		return sb.toString();
	}
}