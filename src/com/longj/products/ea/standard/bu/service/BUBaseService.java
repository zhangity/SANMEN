package com.longj.products.ea.standard.bu.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.wdk.WDK;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLDataField;
import org.wdk.module.wql.core.bean.WQLObject;

/**
 * 基本服务操作类
 * 
 * @author YuBin
 * 
 */
public abstract class BUBaseService {
	private static WDKLogger logger = new WDKLogger(BUBaseService.class.getName());

	public String getWQLObjectName() {
		return WQL_OBJECT_EXAM;
	}

	protected String _primaryKey;

	protected String _statusFieldName;

	protected String WQL_OBJECT_EXAM;

	protected WQLObject getWQLObject(String tablename) throws Exception {
		WQLObject wo = WQLObject.getWQLObject(tablename);
		if (wo == null) {
			Exception e = new Exception("数据模型" + tablename + "不存在！");
			logger.error(e);
			throw e;
		}
		return wo;
	}

	public String get_statusFieldName() {
		return _statusFieldName;
	}

	public void set_statusFieldName(String _statusFieldName) {
		this._statusFieldName = _statusFieldName;
	}

	public String getPrimaryKey() {
		return _primaryKey;
	}

	public void setPrimaryKey(String _primaryKey) {
		this._primaryKey = _primaryKey;
	}

	public String getOperCode(String oldVal, String newVal, String codeModule) {
		// 获取操作类型
		return null;
	}

	public String getOperDesc(String oldVal, String newVal, String codeModule) {
		return null;
		// 获取操作描述
	}

	private String getCodeModuleName(Map<String, WQLDataField> fieldMap, String fieldname) {
		if (fieldMap != null && fieldMap.size() > 0 && fieldname != null && fieldname.trim().length() > 0 && fieldMap.containsKey(fieldname)) {
			return fieldMap.get(fieldname).getModule();
		}
		return null;
	}

	public String getWQL_OBJECT_EXAM() {
		return WQL_OBJECT_EXAM;
	}

	public void setWQL_OBJECT_EXAM(String wQL_OBJECT_EXAM) {
		WQL_OBJECT_EXAM = wQL_OBJECT_EXAM;
	}

	protected StringBuffer appendWhereCondition(StringBuffer preSql, String newWhereCondition) {

		if (preSql == null) {
			preSql = new StringBuffer();
		}
		if (preSql.length() > 0) {
			preSql.append(" AND ");
		}
		preSql.append(newWhereCondition);

		return preSql;
	}

	/**
	 * 比较两个数据集，并且合并数据集的内容
	 * 
	 * @param toDataSet
	 * @param fromDataSet
	 * @throws Exception
	 */
	public JSONArray compareDataSet(String primaryKey, WQLData toDataSet, WQLData fromDataSet, String statusFieldName, Set<String> updateKey) throws Exception {
		if(statusFieldName!=null){
			statusFieldName = statusFieldName.toUpperCase();
		}
		JSONArray compareResult = new JSONArray();
		// 设置标识位，更新数据值
		List<String> columnNames = toDataSet.getColumnNames();
		Map<String, WQLDataField> fieldMap = toDataSet.getWo().getFieldMap();
		Map<String, JSONObject> mapping = new HashMap<String, JSONObject>();
		// 处理标志位
		toDataSet.first();
		while (toDataSet.next()) {
			String uuid = toDataSet.getValue(primaryKey);
			toDataSet.setDeleteMark();// 设置删除标志
			JSONObject jo = new JSONObject();
			jo.put("form_id", uuid);
			String oldval = columnNames.contains(statusFieldName) ? toDataSet.getValue(statusFieldName) : null;
			jo.put("oper_code", this.getOperCode(oldval, null, this.getCodeModuleName(fieldMap, statusFieldName)));
			jo.put("oper_desc", this.getOperDesc(oldval, null, this.getCodeModuleName(fieldMap, statusFieldName)));
			mapping.put(uuid, jo);
		}
		fromDataSet.first();
		while (fromDataSet.next()) {
			String uuid = fromDataSet.getColumnIndex(primaryKey) > -1 ? fromDataSet.getValue(primaryKey) : null;
			if (uuid == null || "".equals(uuid.trim())) {
				uuid = WDK.getUUID();
			}
			// 从内存变量中获取一次，拿不到就构建一个新的
			JSONObject jo = mapping.get(uuid);
			if (jo == null) {
				jo = new JSONObject();
			}
			boolean isUpdate = false;
			boolean isInsert = false;
			if (toDataSet.locate(fromDataSet)) {
				// 更新
				toDataSet.edit();// 设置修改标志
				isUpdate = true;
				String oldval = columnNames.contains(statusFieldName) ? toDataSet.getValue(statusFieldName) : null;
				String newval = columnNames.contains(statusFieldName) ? fromDataSet.getValue(statusFieldName) : null;
				jo.put("oper_code", this.getOperCode(oldval, newval, this.getCodeModuleName(fieldMap, statusFieldName)));
				jo.put("oper_desc", this.getOperDesc(oldval, newval, this.getCodeModuleName(fieldMap, statusFieldName)));
			} else {
				// 新增
				isInsert = true;
				toDataSet.insert();// 设置新增标志
				String newval = columnNames.contains(statusFieldName) ? fromDataSet.getValue(statusFieldName) : null;
				jo.put("oper_code", this.getOperCode(null, newval, this.getCodeModuleName(fieldMap, statusFieldName)));
				jo.put("oper_desc", this.getOperDesc(null, newval, this.getCodeModuleName(fieldMap, statusFieldName)));

			}
			// 设置各字段值
			for (int index = 0; index < columnNames.size(); index++) {
				String columnName = columnNames.get(index);
				if (updateKey.contains(columnName))
					toDataSet.setValue(columnName, fromDataSet.getValue(columnName));
			}
			if (isUpdate) {
				if (toDataSet.getColumnIndex("updatedt") > -1) {
					toDataSet.setValue("updatedt", WDK.getDateTime());
				}
			}
			if (isInsert) {
				if (toDataSet.getColumnIndex("createdt") > -1) {
					String oldval = toDataSet.getValue("createdt");
					if(oldval==null||"".equals(oldval.trim())){
						toDataSet.setValue("createdt", WDK.getDateTime());
					}
				}
			}
			toDataSet.setValue(primaryKey, uuid);
			jo.put("form_id", uuid);
			mapping.put(uuid, jo);
		}
		if (mapping != null && mapping.size() > 0) {
			Iterator<String> it = mapping.keySet().iterator();
			while (it.hasNext()) {
				compareResult.add(mapping.get(it.next()));
			}
		}
		return compareResult;
	}

	/**
	 * 数据模型查询方法
	 * 
	 * @param context
	 * @param wo
	 * @param whereClause
	 * @param whereArgs
	 * @param orderby
	 * @return
	 * @throws Exception
	 */
	protected ResultBean wqlQuery(ConnectBean conb, WQLObject wo, String whereClause, List<String> whereArgs, String orderby) throws Exception {
		if (wo == null) {
			throw new Exception("WQLObject为空！");
		}
		// 构造条件参数
		String[] args = new String[whereArgs == null ? 0 : whereArgs.size()];
		if (whereArgs != null) {
			for (int i = 0; i < whereArgs.size(); i++) {
				args[i] = whereArgs.get(i);
			}
		}
		// 获取结果集对象
		ResultBean ret = wo.query(whereClause, args, orderby, conb);
		// 处理异常
		this.operateException(ret);

		return ret;
	}

	/**
	 * 分页查询
	 * 
	 * @param conb
	 * @param wo
	 * @param whereClause
	 * @param whereArgs
	 * @param orderby
	 * @param startrecord
	 * @param pagerecord
	 * @return
	 * @throws Exception
	 */
	protected ResultBean wqlPageQuery(ConnectBean conb, WQLObject wo, String whereClause, List<String> whereArgs, String orderby, int startrecord, int pagerecord) throws Exception {
		if (wo == null) {
			throw new Exception("WQLObject为空！");
		}
		// 构造条件参数
		String[] args = new String[whereArgs == null ? 0 : whereArgs.size()];
		if (whereArgs != null) {
			for (int i = 0; i < whereArgs.size(); i++) {
				args[i] = whereArgs.get(i);
			}
		}
		ResultBean ret = wo.pagequery(whereClause, args, orderby, startrecord, pagerecord, conb);
		// 处理异常
		this.operateException(ret);
		return ret;
	}

	protected void wqlInsert(ConnectBean conb, WQLObject wo, HashMap values) throws Exception {
		if (wo == null) {
			throw new Exception("WQLObject为空！");
		}

		ResultBean ret = wo.insert(values, conb);

		this.operateException(ret);
	}

	protected void wqlUpdate(ConnectBean conb, WQLObject wo, HashMap values, String whereClause, String[] whereArgs) throws Exception {
		if (wo == null) {
			throw new Exception("WQLObject为空！");
		}

		ResultBean ret = wo.update(values, whereClause, whereArgs, conb);

		this.operateException(ret);
	}

	/**
	 * 说明：处理失败的异常
	 * <p>
	 * Method operateException
	 * 
	 * @param ResultBean
	 * @return
	 */
	private void operateException(ResultBean ret) throws Exception {
		if (ret.isSuccess() == false) {
			StringBuffer sbuff = new StringBuffer();
			ArrayList errlist = ret.getInfoError();
			for (int i = 0; i < errlist.size(); i++) {
				ErrorBean errBean = (ErrorBean) errlist.get(i);
				sbuff.append(errBean.toString());
				sbuff.append("\n");
			}
			throw new Exception(sbuff.toString());
		}
	}

	public JSONArray saveJSONarraArray(ConnectBean conb, JSONArray formList) throws Exception {
		// 需要考虑保存的情况，也就是说编辑进来也可能会进行保存的
		JSONArray returnArray = new JSONArray();
		if (formList != null && formList.size() > 0) {
			WQLObject wo = this.getWQLObject(this.getWQLObjectName());
			ArrayList<String> pkList = wo.getPrimaryKeys();
			String primaryKey = _primaryKey;// 检查单的UUID
			if (pkList != null && pkList.size() > 0) {
				primaryKey = pkList.get(0);
			}
			List<String> webUuid = new ArrayList<String>();
			WQLData dataSet = new WQLData(wo);
			Set<String> updateKey = new HashSet<String>();
			Map<String, WQLDataField> fieldMap = wo.getFieldMap();
			for (int i = 0; i < formList.size(); i++) {
				JSONObject jrow = formList.getJSONObject(i);
				Iterator<Entry<String, WQLDataField>> fieldit = fieldMap.entrySet().iterator();
				dataSet.insert();
				if (jrow.containsKey(primaryKey)) {
					// 保存所有的web端的主键
					String value = jrow.getString(primaryKey);
					if (value != null && value.trim().length() > 0) {
						webUuid.add(value);
					}
				}
				while (fieldit.hasNext()) {
					Entry<String, WQLDataField> entry = fieldit.next();
					String fieldname = entry.getKey().toLowerCase();
					// Field field = entry.getValue();
					if (jrow.containsKey(fieldname)) {
						updateKey.add(entry.getKey());
						dataSet.setValue(fieldname, jrow.getString(fieldname));
					}
				}
			}
			WQLData oldDataSet = new WQLData(wo);
			if (webUuid.size() > 0) {
				String whereClause = primaryKey + " IN ('" + StringUtils.join(webUuid, "','") + "')";
				ResultBean rb = this.wqlQuery(conb, wo, whereClause, null, primaryKey);
				if (rb != null && rb.isSuccess()) {
					oldDataSet = rb.getWQLData(wo, 0);
				}
			}
			if (oldDataSet != null) {
				// 数据比对后
				returnArray = compareDataSet(primaryKey, oldDataSet, dataSet, _statusFieldName, updateKey);
			}
			wo.updateAll(oldDataSet, conb);
		}

		return returnArray;
	}
}
