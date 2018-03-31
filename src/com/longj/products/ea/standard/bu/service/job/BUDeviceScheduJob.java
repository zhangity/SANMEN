package com.longj.products.ea.standard.bu.service.job;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.wdk.WDK;
import org.wdk.core.base.BaseJob;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKEnvironment;
import org.wdk.core.util.uLogger;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;
import org.wdk.module.wql.core.engine.object.WO;

import wql.WQLNames;

import com.longj.products.ea.standard.bu.BUConstant;
import com.longj.products.ea.standard.bu.BUServiceUtil;
import com.longj.products.ea.standard.bu.service.BUAppointmentService;

/**
 * 每天零时进行排班数据的实例化操作,具体操作未来几天的数据需要控制全局参数进行控制
 * 
 * @author YuBin
 * 
 */
public class BUDeviceScheduJob extends BaseJob {
	static uLogger logger = new uLogger(BUDeviceScheduJob.class.getName());
	static final int DAYS_INSTACNE = 7;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		ConnectBean conb = null;
		boolean isSuccess = false;
		boolean isSelftTrans = true;
		try {
			WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();// 创建WDK环境
			if (wdkEnv != null) {
				WDKContext wdkContext = wdkEnv.getWDKContext();// new
																// WDKContext();
				if (wdkContext != null) {
					conb = wdkContext.getConnectBean();
					isSelftTrans = false;
				}
			}
			if (isSelftTrans) {
				conb = ConnectBean.getConnectBean();
				conb.beginTransation();
			}
			Calendar nowTime = Calendar.getInstance();
			ExecutorService cachedTreadPool = Executors.newCachedThreadPool();// 线程池处理
			Date start = nowTime.getTime();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			String startStr = format.format(start);
			nowTime.add(Calendar.DATE, DAYS_INSTACNE);// 在定时任务在作业的时候，把后续7天已经排好班的数据都给初始化好
			Date dt = nowTime.getTime();
			String dtStr = format.format(dt);
			// 查询未来几天（具体几天暂时可不管，通过参数来配置），并且未实例化的排班信息
			// TODO 后续还需要增加控制：今天之前的历史数据可以暂时不用去管了，现在还是测试阶段，这个控制暂时就不加了
			// String wheresql =
			// " schedu_date<= ? and status='1' and NOT EXISTS (SELECT 1 FROM EA_BU_Number t9 WHERE t9.schedu_id = t0.schedu_id)";
			// ResultBean rb = wo.query(wheresql, new String[] { dtStr },
			// "schedu_date", conb);
			ResultBean rb = WQL.getWO(WQLNames.QEABUSCHEDU0001).addParam("start_dt", startStr).addParam("schedu_dt", dtStr).addParam("flag", "1").process(conb);
			if (rb != null && rb.isSuccess()) {
				JSONArray wqlData = rb.getResultJSONArray(0);
				if (wqlData != null && wqlData.size() > 0) {
					String splitChar = "!_!";// 拼接符号
					Map<String, JSONArray> deviceDtAmpmMap = new HashMap<String, JSONArray>();
					// 启用多线程处理，同设备、同日期、同午别的放到一个线程里面去处理
					for (int i = 0; i < wqlData.size(); i++) {
						JSONObject scheduJo = wqlData.getJSONObject(i);// 每一条数据
						String usedCount = scheduJo.getString("used");// 本排班，已经被预约的数量
						if (usedCount != null && usedCount.trim().length() > 0) {
							int count = Integer.parseInt(usedCount);
							if (count > 0) {
								// 已经被预约使用的排班记录，不允许重新进行实例化
								continue;
							}
						}
						String deviceId = scheduJo.getString("device_id");// 设备ID
						String date = scheduJo.getString("schedu_date");// 日期；
						if (deviceId != null && deviceId.trim().length() > 0 && date != null && date.trim().length() > 0) {
							// 启用多线程处理，同设备、同日期、同午别的放到一个线程里面去处理
							String ampm = scheduJo.getString("ampm");// 午别
							String key = deviceId + splitChar + date + splitChar + ampm;
							JSONArray dtl = null;
							if (deviceDtAmpmMap.containsKey(key)) {
								dtl = deviceDtAmpmMap.get(key);
							} else {
								dtl = new JSONArray();
							}
							dtl.add(scheduJo);
							deviceDtAmpmMap.put(key, dtl);
						}
						// final String schedu_id =
						// wqlData.getValue("schedu_id");// 排班记录的主键
					}
					if (deviceDtAmpmMap != null && deviceDtAmpmMap.size() > 0) {
						Iterator<String> it = deviceDtAmpmMap.keySet().iterator();
						if (it != null) {
							while (it.hasNext()) {
								String key = it.next();
								String[] keyArray = key.split(splitChar);
								final JSONArray rows = deviceDtAmpmMap.get(key);
								final String deviceId = keyArray[0];
								final String date = keyArray[1];
								final String ampm = keyArray[2];
								// 启用多线程处理，同设备、同日期、同午别的放到一个线程里面去处理
								cachedTreadPool.execute(new Runnable() {
									private BUAppointmentService service = BUServiceUtil.getBUAppointmentService();
									WQLObject wo = WQLObject.getWQLObject("EA_BU_Number");// 号码的实例表

									@Override
									public void run() {
										ConnectBean conb = null;
										boolean isSuccess = false;
										String max_schedu_id = null;
										String max_time_point = null;
										try {
											conb = ConnectBean.getConnectBean();
											conb.beginTransation();
											if (rows != null && rows.size() > 0) {
												List<String> scheduIdList = new ArrayList<String>();
												WQLData dataSet = new WQLData(wo);
												for (int i = 0; i < rows.size(); i++) {
													JSONObject row = rows.getJSONObject(i);
													String schedu_id = row.getString("schedu_id");
													String work_end = row.getString("work_end");
													if (max_time_point == null || "".equals(max_time_point)) {
														max_time_point = work_end;
														max_schedu_id = schedu_id;
													} else {
														if (max_time_point.compareTo(work_end) < 0) {
															max_time_point = work_end;
															max_schedu_id = schedu_id;
														}
													}

													scheduIdList.add(schedu_id);
													// 删除原先已有的排班记录，默认加号和锁号，都有对应的schedu_id，//TODO
													// 加号和锁号的业务处理需要注意这个地方
													JSONArray rows = service.getNumberListFromSchedu(conb, schedu_id, deviceId, date, ampm);
													int index = 0;
													// 把设备的排班信息暂存到内容中，（这些内部信息包含加号和锁号的信息）
													if (rows != null && rows.size() > 0) {
														for (int n = 0; n < rows.size(); n++) {
															JSONObject section = rows.getJSONObject(n);// 每个时间段，这里还不是时间点
															String schedu_section = section.getString("timesecion");
															JSONArray pointList = section.getJSONArray("timePoints");// 从时间段的json对象中获取时间点列表
															if (pointList != null && pointList.size() > 0) {
																for (int j = 0; j < pointList.size(); j++) {
																	JSONObject point = pointList.getJSONObject(j);// 这里就是一个时间点了
																	dataSet.insert();
																	index++;
																	dataSet.setValue("number_id", WDK.getUUID());
																	dataSet.setValue("device_id", deviceId);
																	dataSet.setValue("schedu_id", schedu_id);
																	dataSet.setValue("schedu_dt", date);
																	dataSet.setValue("schedu_ampm", ampm);
																	dataSet.setValue("schedu_section", schedu_section);
																	dataSet.setValue("schedu_point", point.getString("timepoint"));
																	dataSet.setValue("number_type", point.getString("numbertype"));
																	dataSet.setValue("locktype", point.containsKey("locktype") ? point.getString("locktype") : "");
																	dataSet.setValue("locksource", point.containsKey("locksource") ? point.getString("locksource") : "");
																	dataSet.setValue("unlockdeptid", point.containsKey("unlockdeptid") ? point.getString("unlockdeptid") : "");
																	dataSet.setValue("lock_id", point.containsKey("lock_id") ? point.getString("lock_id") : "");
																	dataSet.setValue("add_id", point.containsKey("add_id") ? point.getString("add_id") : "");
																	dataSet.setValue("createdt", WDK.getDateTime());
																	dataSet.setValue("ordercode", index + "");
																}
															}
														}
													}
												}

												ResultBean deleteRb = wo.delete("schedu_id IN (" + BUServiceUtil.getQuestionMark(scheduIdList.size()) + ")", scheduIdList.toArray(new String[scheduIdList.size()]), conb);
												if (deleteRb != null && deleteRb.isSuccess()) {
													ResultBean rb = wo.insert(dataSet, conb);
													if (rb != null && rb.isSuccess()) {
														logger.info("设备ID[" + deviceId + "]，日期[" + date + "]，午别[" + ampm + "]排班数据实例化成功！");
														// 之后再处理加号和锁号的信息
														WQLObject addWo = WQLObject.getWQLObject("EA_BU_Add");
														ResultBean addQuery = addWo.query("device_id =? and add_dt = ? and add_ampm = ?", new String[] { deviceId, date, ampm }, "add_section,add_point", conb);
														if (addQuery != null && addQuery.isSuccess()) {
															System.out.println(max_schedu_id);
															int index = 0;
															WQLData addDataSet = new WQLData(wo);
															WQLData addWD = addQuery.getWQLData(addWo, 0);
															if (addWD != null) {
																addWD.first();
																while (addWD.next()) {
																	addDataSet.insert();
																	index++;
																	addDataSet.setValue("number_id", WDK.getUUID());
																	addDataSet.setValue("device_id", deviceId);
																	addDataSet.setValue("schedu_id", max_schedu_id);
																	addDataSet.setValue("schedu_dt", date);
																	addDataSet.setValue("schedu_ampm", ampm);
																	addDataSet.setValue("schedu_section", addWD.getValue("add_section"));
																	addDataSet.setValue("schedu_point", addWD.getValue("add_point"));
																	addDataSet.setValue("number_type", BUConstant.NUMBER_TYPE_ADD);
																	addDataSet.setValue("add_id", addWD.getValue("add_id"));
																	addDataSet.setValue("createdt", WDK.getDateTime());
																	addDataSet.setValue("ordercode", index + "");
																}
															}

															ResultBean addRb = wo.insert(addDataSet, conb);
															if (addRb != null && addRb.isSuccess()) {
																// 更新锁号记录
																WO wqlWo = WQL.getWO(WQLNames.QEABUSCHEDU0001).addParam("flag", "2").addParam("device_id", deviceId).addParam("schedu_dt", date).addParam("schedu_ampm", ampm);

																ResultBean lockQuery = wqlWo.process(conb);
																if (lockQuery != null && lockQuery.isSuccess()) {
																	WQLData oldWd = lockQuery.getWQLData(0);
																	oldWd.first();
																	while (oldWd.next()) {
																		String lockId = oldWd.getValue("LOCK_ID");
																		if (lockId != null && lockId.trim().length() > 0) {
																			oldWd.setValue("locksource", BUConstant.LOCKSOURCE_MT);
																		}
																	}
																	ResultBean loackUpdate = wo.update(oldWd, conb);
																	System.out.println(loackUpdate.isSuccess());
																}
															}

														}
													}
												}
											}

											isSuccess = true;
										} catch (Exception e) {
											e.printStackTrace();
											isSuccess = false;
										} finally {
											if (conb != null) {
												if (isSuccess) {
													conb.commitTransation();
												} else {
													conb.rollbackTransation();
												}
											}
										}
									}

								});

							}
						}
					}

				}
			}
			isSuccess = true;
		} catch (Exception e) {
			e.printStackTrace();
			isSuccess = false;
		} finally {
			if (conb != null && isSelftTrans) {
				if (isSuccess) {
					conb.commitTransation();
				} else {
					conb.rollbackTransation();
				}
			}

		}

	}

}