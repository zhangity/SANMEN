package com.longj.products.ea.standard.bu.ws.impl;

import java.util.Map;

import net.sf.json.JSONObject;

import org.wdk.module.wql.core.bean.ConnectBean;

import com.longj.products.ea.standard.bu.ws.BasePaceAdapter;

/**
 * 不需要对接pacs系统的场景,比如单机版
 * 
 * @author YuBin
 * 
 */
public class NullPacsAdapter extends BasePaceAdapter {

	@Override
	public boolean _addBillSync2PacsCore(JSONObject joSrc, Map<String, String> apptRoomMap) throws Exception {
		return true;
	}

	@Override
	public JSONObject buildNewJSONObject(ConnectBean conb, JSONObject oldJsonObject) {
		return oldJsonObject;
	}

	@Override
	public boolean isCanNotice2Pacs() {
		return true;
	}

	@Override
	public String getPacsEndpoint() {
		return null;
	}

	@Override
	public boolean _removeBillSync2PacsCore(ConnectBean conb, JSONObject joSrc) throws Exception {
		return true;
	}

}
