package com.longj.products.ea.standard.bu.ws.impl.core;

import java.util.HashMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import wql.WQLNames;

import com.longj.platform.pb.util.WQLUtil;
import com.longj.products.ea.standard.bu.ws.BasePaceAdapter;
import com.longj.products.ea.standard.bu.ws.impl.NormalPacsAdapter;

public class PacsSyncCore {

	// 系统启动就把各检查类型对应的处理类加载到内容中去
	public static HashMap<String, BasePaceAdapter> examTyepAdapter = new HashMap<String, BasePaceAdapter>();

	/**
	 * 对外提供的获取适配器的方法
	 * 
	 * @param examtypeId
	 * @return
	 */
	public static BasePaceAdapter getAdapter(String examtypeId) {
		BasePaceAdapter returnAdapter = null;
		if (examTyepAdapter.containsKey(examtypeId)) {
			returnAdapter = examTyepAdapter.get(examtypeId);
		}
		if (returnAdapter == null) {
			returnAdapter = new NormalPacsAdapter();
		}
		return returnAdapter;
	}

	/**
	 * 随系统启动而启动
	 * 
	 * @return
	 * @throws Exception
	 */
	public static boolean start() throws Exception {
		JSONArray rows = WQLUtil.getWQL(WQLNames.QEABIEXAM0001).addParam("flag", "201").process().getResultJSONArray(0);
		if (rows != null && rows.size() > 0) {
			for (int i = 0; i < rows.size(); i++) {
				JSONObject row = rows.getJSONObject(i);
				String examTypeId = row.getString("examtype_id");
				String clazz = row.getString("adapter_clazz");
				BasePaceAdapter adapter = null;
				if (clazz == null || "".equals(clazz.trim())) {
					adapter = new NormalPacsAdapter();
				} else {
					Class cls = Class.forName(clazz);
					adapter = (BasePaceAdapter) cls.newInstance();
				}
				examTyepAdapter.put(examTypeId, adapter);
			}
		}
		return true;
	}

}
