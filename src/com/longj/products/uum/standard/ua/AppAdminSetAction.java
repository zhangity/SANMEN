package com.longj.products.uum.standard.ua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;

import wql.WQLNames;

import com.longj.platform.busi.wdk.base.BaseActionMethod;
import com.longj.platform.pb.util.WQLUtil;

/**
 * 应用管理员设置实现类 AppAdminSetAction
 * <p>
 * </p>
 * 版权：Copyright (c) 2015 杭州新世纪电子科技有限公司
 * <p>
 * </p>
 * 
 * @author wangyy
 */
public class AppAdminSetAction extends BaseActionMethod {
	private static WDKLogger logger = new WDKLogger(
			AppAdminSetAction.class.getName());

	/**
	 * 根据角色角色编码、角色名称、应用标识查询管理员角色详细信息 要求格式：
	 * 
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void query(WDKContext context) throws Exception {
		boolean isSuccess = true;
		WQLData dataSet = null;
		JSONArray jrows = null;
		JSONArray jres = new JSONArray();
		String err = "";
		try {
			String role_uuid = context.getString("role_uuid");
			String role_name = context.getString("role_name");
			String app_uuid = context.getString("app_uuid");
			ResultBean ret = WQL.getWO(WQLNames.QUUMUA_0010)
					.addParam("role_uuid", role_uuid)
					.addParam("role_name", role_name)
					.addParam("app_uuid", app_uuid)
					.process(context.getConnectBean());
			dataSet = ret.getWQLData(0);
			// 对后台数据进行组织,将角色关联的用户进行合并
			if (dataSet != null) {
				jrows = dataSet.getDataJSONArray();
				if(jrows.size()>0){
					jrows = this.splitJson(jrows);
				}
			}

		} catch (Exception ex) {
			isSuccess = false;
			err = ex.getMessage();
			logger.errorWithNoException(err);
			ex.printStackTrace();
		}
		if (isSuccess) {

		} else {
			isSuccess = false;
			JSONObject jrowsObj = new JSONObject();
			jrowsObj.put("code", "0");
			jrowsObj.put("desc", "查询出错！\n" + err);
		}
		context.setPrintOut(jrows.toString());
	}
	
	// 将角色关联的多个用户进行合并为account_namestr,返回新的jrows
		public JSONArray splitJson(JSONArray jrows) {
			JSONArray jarr = new JSONArray();
			JSONArray jres = new JSONArray();
			HashMap<String, String> map = new HashMap<String, String>();
			for (Object object : jrows) {
				JSONObject jsonObject = (JSONObject) object;
				String role_uuid1 = (String) jsonObject.get("role_uuid");
				String account_namestr = (String) jsonObject
						.get("account_name");
				if (map.containsKey(role_uuid1)) {
					String str = map.get(role_uuid1);
					map.put(role_uuid1, str + "," + account_namestr);
				} else {
					map.put(role_uuid1, account_namestr);
					jarr.add(jsonObject);
				}
			}
			for (int i = 0; i < jarr.size(); i++) {
				JSONObject jsonobj = jarr.getJSONObject(i);
				jsonobj.put("account_namestr",
						map.get(jsonobj.getString("role_uuid")));
				jres.add(jsonobj);
			}
			return jres;
		}

	/**
	 * 根据应用标识删除指定的应用 要求格式：
	 * 
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void save(WDKContext context) throws Exception {
		boolean isSuccess = true;
		JSONArray ret = null;
		try {
			String role_uuid = context.getString("role_uuid");
			String account_uuidarr1 = context.getString("account_uuidarr");
			JSONArray arr = JSONArray.fromObject(account_uuidarr1);
			// 将Json字符串转为java对象
			// 获取Object中的account_uuidarr
			ArrayList<String> account_uuidarr = new ArrayList<String>();
			for (int i = 0; i < arr.size(); i++) {
				JSONObject obj = arr.getJSONObject(i);
				account_uuidarr = this.parseJson(obj, account_uuidarr);
			}
			String account_str[] = (String[]) account_uuidarr
					.toArray(new String[account_uuidarr.size()]);
			String depart_str[] = new String[account_uuidarr.size()];
			for (int i = 0; i < account_uuidarr.size(); i++) { // 部门机构都为-1
				depart_str[i] = "-1";
			}
			String detailcount = String.valueOf(account_uuidarr.size());
			ResultBean resultBean = WQLUtil.getWQL(WQLNames.UUUMUA_0005)
					.addParam("role_uuid", role_uuid)
					.addParam("detailcount", detailcount)
					.addParam("account_uuidarr", account_str)
					.addParam("depart_uuidarr", depart_str)
					.addParam("actionflag", "ref")
					.process(context.getConnectBean());
			if (resultBean.isSuccess()) {
				ret = resultBean.getResultJSONArray(0);
			} else {
				ret = new JSONArray();
				logger.errorWithNoException("保存角色详细信息列表错误：");
				ArrayList errList = resultBean.getInfoError();
				for (int i = 0; i < errList.size(); i++) {
					ErrorBean err = (ErrorBean) errList.get(i);
					logger.errorWithNoException(err.toString());
				}
			}
		} catch (Exception e) {
			isSuccess = false;
			logger.errorWithNoException("保存角色详细信息列表错误：" + e.getMessage());
			e.printStackTrace();
		}
		JSONObject jres = new JSONObject();
		if (isSuccess) {
			jres.put("code", "1");
			jres.put("desc", "添加成功！");
		} else {
			jres.put("code", "0");
			jres.put("desc", "添加失败！");
		}

		context.setPrintOut(jres.toString());
	}

	// 遍历,返回account_uuidarr
	public ArrayList<String> parseJson(JSONObject object, ArrayList<String> ids) {

		if (object.has("children")) {
			JSONArray jArray = object.getJSONArray("children");
			for (int i = 0; jArray != null && i < jArray.size(); i++) {
				JSONObject cObject = jArray.getJSONObject(i);
				parseJson(cObject, ids);
			}
		} else {
			ids.add(object.getString("id"));
		}
		System.out.println(ids);
		return ids;
	}
}