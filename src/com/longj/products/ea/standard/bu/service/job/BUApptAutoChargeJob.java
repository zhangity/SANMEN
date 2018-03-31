package com.longj.products.ea.standard.bu.service.job;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import net.sf.json.JSONArray;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.wdk.core.base.BaseJob;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKEnvironment;
import org.wdk.core.util.uLogger;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.products.ea.standard.bu.BUConstant;
import com.longj.products.ea.standard.bu.BUServiceUtil;
import com.longj.products.ea.standard.bu.service.impl.BUHospitalFee;

/**
 * 住院申请单在凌晨的自动扣费实现
 * 
 * @author YuBin
 * 
 */
public class BUApptAutoChargeJob extends BaseJob {
	static uLogger logger = new uLogger(BUApptAutoChargeJob.class.getName());
	static ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
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
			WQLObject wo = WQLObject.getWQLObject("EA_BU_Exam");
			String[] arg = new String[] { BUConstant.PATIENT_SORT_ZY, BUConstant.CHARGE_STATUS_s000, BUConstant.FORM_STATUS_s005, BUConstant.FORM_STATUS_s006, BUConstant.FORM_STATUS_s007, BUConstant.FORM_STATUS_s008 };
			ResultBean rb = wo.query("exam_type = ? and charge_status = ? and form_status in (?,?,?,?)", arg, "exam_id", conb);
			if (rb != null && rb.isSuccess()) {
				WQLData wd = rb.getWQLData(wo, 0);
				if (wd != null) {
					wd.first();
					while (wd.next()) {
						final String examId = wd.getValue("exam_id");
						final String patient_id = wd.getValue("patient_id");
						final String ysdm = wd.getValue("doctor_id");

						final String examitem_id = wd.getValue("examitem_id");
						final String owncharge = wd.getValue("owncharge");
						final String examTypeId = wd.getValue("examtype_id");//检查类型ID
						Runnable r = new Runnable() {

							@Override
							public void run() {
								ConnectBean conb = null;
								boolean isSuccess = false;
								String fyjson = "";
								try {
									conb = ConnectBean.getConnectBean();
									if (examitem_id != null && examitem_id.trim().length() > 0) {
										JSONArray jsonrows = BUServiceUtil.getBUExamService2().getChargeDtlbyExamItem(conb, examitem_id);
										fyjson = jsonrows.toString();
									}
									String examCategoryId = BUServiceUtil.getBUExamService2().getExamCategoryId(conb, examId);
									BUHospitalFee fee = new BUHospitalFee(examId, examCategoryId, 1, patient_id, fyjson, ysdm, ysdm, owncharge,examTypeId){
										@Override
										protected void callBack(String feeStatus) {
											// TODO Auto-generated method stub
											this.defaultCallBack();
										}};
									// JSONObject result = exeHisZyExpense(1,
									// patient_id, fyjson, ysdm, personId);
									fee.process();// 进行扣费的处理，
									isSuccess = true;
								} catch (Exception e) {
									logger.info(e.getMessage());
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
						};
						cachedThreadPool.execute(r);
					}
				}
			}
			isSuccess = true;
		} catch (Exception e) {
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
