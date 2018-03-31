package com.longj.products.ea.standard.bu.ws;

import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.module.wql.core.bean.ConnectBean;

import com.longj.products.ea.standard.bu.BUConstant;
import com.longj.products.ea.standard.bu.BUServiceUtil;
import com.longj.products.ea.standard.bu.service.impl.BUHospitalFee;

public abstract class BasePaceAdapter {

	protected String person_id;

	public abstract boolean _addBillSync2PacsCore(JSONObject joSrc, Map<String, String> apptRoomMap) throws Exception;

	public abstract boolean _removeBillSync2PacsCore(ConnectBean conb, JSONObject joSrc) throws Exception;

	public boolean addBillSync2Pacs(JSONObject joSrc, Map<String, String> apptRoomMap) throws Exception {
		boolean isSuccess = _addBillSync2PacsCore(joSrc, apptRoomMap);
		if (isSuccess) {
			this.processZyFee(joSrc, this.getPerson_id(), true);
		}
		return isSuccess;
	}

	public boolean removeBillSync2Pacs(ConnectBean conb, JSONObject joSrc) throws Exception {
		String formStatus = joSrc.getString("form_status");
		boolean isSuccess = true;
		if (BUConstant.FORM_STATUS_s005.equals(formStatus)) {
			// 已签到才需要通知pacs
			isSuccess = _removeBillSync2PacsCore(conb, joSrc);
		}
		if (isSuccess) {
			this.processZyRollbackFee(conb, joSrc);
		}
		return isSuccess;
	}

	public abstract JSONObject buildNewJSONObject(ConnectBean conb, JSONObject oldJsonObject);

	public abstract boolean isCanNotice2Pacs();

	public abstract String getPacsEndpoint();

	public String getPerson_id() {
		return person_id;
	}

	public void setPerson_id(String person_id) {
		this.person_id = person_id;
	}

	/**
	 * 处理住院的扣费
	 * 
	 * @param j0
	 * @param logger
	 * @param personId
	 */
	public void processZyFee(JSONObject j0, String personId, boolean isNeedDatLimit) throws Exception {
		// 调用HIS住院接口，进行扣费操作；
		String examtype = j0.getString("exam_type");// 是住院还是门诊，如果是住院检查单，这边还需要进行扣费操作
		if (BUConstant.PATIENT_SORT_ZY.equals(examtype)) {
			String examId = j0.getString("exam_id");// 检查单的ID
			String fyjson = "";
			String examitem_id = j0.getString("examitem_id");
			if (examitem_id != null && examitem_id.trim().length() > 0) {
				JSONArray jsonrows = BUServiceUtil.getBUExamService2().getChargeDtlbyExamItem(null, examitem_id);
				fyjson = jsonrows.toString();
			}
			String ysdm = j0.getString("doctor_id");
			String examCategoryId = BUServiceUtil.getBUExamService2().getExamCategoryId(null, examId);
			String patient_id = j0.getString("patient_id");// 传递病人ID即可，住院号可以在his中自己获取
			String owncharge = j0.getString("owncharge");
			String examTypeId = j0.getString("examtype_id");
			BUHospitalFee fee = new BUHospitalFee(examId, examCategoryId, 1, patient_id, fyjson, ysdm, personId, owncharge,examTypeId) {
				@Override
				protected void callBack(String feeStatus) {
					this.defaultCallBack();
				}
			};
			fee.setNeedDayLimit(isNeedDatLimit);// 是否受每日扣费数量限制，false代表不控制
			fee.process();// 进行扣费的处理，
		}
	}

	public void processZyRollbackFee(ConnectBean conb, JSONObject j0) throws Exception {
		String exam_type = j0.getString("exam_type");
		String charge_status = j0.getString("charge_status");
		String examId = j0.getString("exam_id");
		String ysdm = j0.getString("doctor_id");
		String examitem_id = j0.getString("examitem_id");
		String owncharge = j0.getString("owncharge");
		String patient_id = j0.getString("patient_id");
		String examTypeId = j0.getString("examtype_id");
		if (BUConstant.PATIENT_SORT_ZY.equals(exam_type) && BUConstant.CHARGE_STATUS_s003.equals(charge_status)) {
			// 条件1：住院；条件2：住院已扣费
			JSONArray jsonrows = BUServiceUtil.getBUExamService2().getChargeDtlbyExamItem(conb, examitem_id);
			if (jsonrows != null && jsonrows.size() > 0) {
				String fyjson = jsonrows.toString();
				BUHospitalFee fee = new BUHospitalFee(examId, null, 0, patient_id, fyjson, ysdm, ysdm, owncharge,examTypeId) {
					@Override
					protected void callBack(String feeStatus) {
						this.defaultCallBack();
					}
				};
				// new BUHospitalFee(examId, null, 0,
				// patient_id,
				// fyjson, ysdm, ysdm, owncharge);
				// JSONObject result = exeHisZyExpense(1,
				// patient_id, fyjson, ysdm, personId);
				fee.process();// 进行扣费的处理
			}
		}

	}
}
