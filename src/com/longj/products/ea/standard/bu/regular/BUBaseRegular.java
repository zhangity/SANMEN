package com.longj.products.ea.standard.bu.regular;

import java.util.Date;

import net.sf.json.JSONObject;

import org.wdk.module.wql.core.bean.ConnectBean;

public abstract class BUBaseRegular {
	protected String inst_id;// 规则实例，代表来自哪一次的校验
	protected String inst_name;
	protected String errorMsg;// 错误消息提示
	protected JSONObject params;// 本规则实例下的参数内容{filed_1:11,field_2:22,field_3:33}

	public abstract boolean matcher(ConnectBean conb, String patinet_id, String examTypeId, String examCategoryId, Date apptDt);

	public abstract void befor();

	public void setInitData(JSONObject jo) {
		this.inst_id = jo.getString("inst_id");
		this.params = jo.getJSONObject("params");
		this.inst_name = jo.getString("inst_name");

	}

	public String getInst_id() {
		return inst_id;
	}

	public void setInst_id(String inst_id) {
		this.inst_id = inst_id;
	}

	public String getInst_name() {
		return inst_name;
	}

	public void setInst_name(String inst_name) {
		this.inst_name = inst_name;
	}

	public JSONObject getParams() {
		return params;
	}

	public void setParams(JSONObject params) {
		this.params = params;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
