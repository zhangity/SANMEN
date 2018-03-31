package com.longj.products.ea.standard.bu.service.proxy;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.core.bean.WDKLogger;
import org.wdk.core.bean.WDKTransationHandler;
import org.wdk.module.wql.core.bean.ConnectBean;

import com.longj.products.ea.standard.bu.ws.BasePaceAdapter;
import com.longj.products.ea.standard.bu.ws.impl.core.PacsSyncCore;

/**
 * 签到后调用pacs系统的web接口
 * 
 * @author YuBin
 * 
 */
public class BUSignHandler implements WDKTransationHandler {
	private static WDKLogger logger = new WDKLogger(BUSignHandler.class.getName());// 日志操作类
	private static HashMap<Long, Thread> ThreadMap = new HashMap<Long, Thread>();

	public BUSignHandler(JSONArray paramBody, Map<String, String> apptRoomMap, String personId) {
		super();
		this.paramBody = paramBody;
		this.apptRoomMap = apptRoomMap;
		this.personId = personId;
	}

	private JSONArray paramBody;

	private Map<String, String> apptRoomMap;

	private String personId;

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public Map<String, String> getApptRoomMap() {
		return apptRoomMap;
	}

	public void setApptRoomMap(Map<String, String> apptRoomMap) {
		this.apptRoomMap = apptRoomMap;
	}

	public JSONArray getParamBody() {
		return paramBody;
	}

	public void setParamBody(JSONArray paramBody) {
		this.paramBody = paramBody;
	}


	@Override
	public void transAfter(ConnectBean conb, boolean isSuccess) throws Exception {
		if (isSuccess) {
			if (paramBody != null && paramBody.size() > 0) {
				Thread lastThread = null;
				// 不管准备环境是否准备好，都进行遍历
				for (int i = 0; i < paramBody.size(); i++) {
					final JSONObject j0 = paramBody.getJSONObject(i);
					// 使用多线程的方式发起调用
					Runnable r = new Runnable() {
						@Override
						public void run() {
							long id = Thread.currentThread().getId();
							try {
								BasePaceAdapter dapter = PacsSyncCore.getAdapter(j0.getString("examtype_id"));
								dapter.setPerson_id(personId);//设置操作人
								pushMessage2PacsRegister(j0, dapter, id);
							} catch (Exception e) {
								e.printStackTrace();
							} finally {
								ThreadMap.remove(id);
							}
						}
					};
					Thread t = new Thread(r);
					if (lastThread != null) {
						ThreadMap.put(t.getId(), lastThread);
					}
					t.start();
					lastThread = t;// 替换为上一个线程
				}
			}
		}
	}

	/**
	 * 发生给pacs系统进行登记
	 * 
	 * @param conb
	 * @param j0
	 * @param endpoint
	 * @param id
	 * @throws Exception
	 */
	private boolean pushMessage2PacsRegister(JSONObject joSrc,BasePaceAdapter dapter, long id) throws Exception {
		// 登记成功后做操作
		if (ThreadMap.containsKey(id)) {
			try {
				// 等待上一个线程的完成
				ThreadMap.get(id).join();
			} catch (InterruptedException e) {
				logger.error(e);
			}
		}
		return dapter.addBillSync2Pacs(joSrc, apptRoomMap);
	}

}
