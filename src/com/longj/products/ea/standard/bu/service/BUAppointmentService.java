package com.longj.products.ea.standard.bu.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.module.wql.core.bean.ConnectBean;

import com.longj.platform.busi.wdk.handler.SessionUser;

/**
 * 预约相关的接口服务
 * 
 * @author YuBin
 * 
 */
public interface BUAppointmentService {
	
	public List<String> getAuthExamTypeList(ConnectBean conb,SessionUser user);

	/**
	 * 获取设备的某天的排班服务,从排班信息获取
	 * 
	 * @param conb
	 * @param deviceId
	 * @param date
	 * @param interval
	 *            间隔时间，一般是30分钟，单位是分钟
	 * @return
	 * @throws Exception
	 */
	public JSONArray getNumberListFromSchedu(ConnectBean conb, String deviceId, String date) throws Exception;
	
	/**
	 * 从排班记录获取排班服务，从排班信息获取
	 * @param conb
	 * @param scheduId
	 * @return
	 * @throws Exception
	 */
	public JSONArray getNumberListFromSchedu(ConnectBean conb, String scheduId,String deviceId,String date,String ampm) throws Exception;

	/**
	 * 获取设备的某天的排班服务,从排班实例化数据获取
	 * 
	 * @param conb
	 * @param deviceId
	 * @param date
	 * @return
	 * @throws Exception
	 */
	public JSONArray getNumberListFromNumberInst(ConnectBean conb, String deviceId, String date) throws Exception;

	/**
	 * 加锁界面使用，查询设备的排班情况，（分2中情况，实例化和非实例化）
	 * 
	 * @param conb
	 * @param deviceId
	 * @param date
	 * @return
	 * @throws Exception
	 */
	public JSONArray getLockMaintInfoList(ConnectBean conb, String deviceId, String date) throws Exception;

	/**
	 * 查询本此设备当前日期是否已经实例化了
	 * 
	 * @param conb
	 * @param deviceId
	 * @param date
	 * @return
	 * @throws Exception
	 */
	public boolean isScheduInstanced(ConnectBean conb, String deviceId, String date) throws Exception;

	/**
	 * 创建预约单服务
	 * 
	 * @param conb
	 * @param deviceId
	 * @param date
	 * @param number_ids
	 * @param exam_id
	 * @return
	 * @throws Exception
	 */
	public JSONArray createAppointment(ConnectBean conb, String deviceId, String date, String[] number_ids, String exam_id, String person_id, String person_type) throws Exception;

	/**
	 * 创建加锁记录
	 * 
	 * @param conb
	 * @param deviceId
	 * @param date
	 * @param locktype
	 * @param unlockdeptid
	 * @param lock_personid
	 * @param lock_reason
	 * @return
	 * @throws Exception
	 */
	public JSONArray createNumberLock(ConnectBean conb, JSONArray timePoints, String deviceId, String date, String locktype, String unlockdeptid, String lock_personid, String lock_reason) throws Exception;

	/**
	 * 创建加号
	 * 
	 * @param conb
	 * @param deviceId
	 * @param date
	 * @param amCount
	 * @param pmCunt
	 * @param amReason
	 * @param pmReason
	 * @return
	 * @throws Exception
	 */
	public JSONArray createNumberAdd(ConnectBean conb, String deviceId, String date, String addPersonId, String ampm, int amCount, String amReason) throws Exception;

	/**
	 * 取消锁号
	 * 
	 * @param conb
	 * @param lock_id
	 * @throws Exception
	 */
	public void cancelNumberLock(ConnectBean conb, String lock_id) throws Exception;

	/**
	 * 取消加号
	 * 
	 * @param conb
	 * @param lock_id
	 * @throws Exception
	 */
	public void cancelNumberAdd(ConnectBean conb, String add_id) throws Exception;

	/**
	 * 取消预约状态
	 * 
	 * @param conb
	 * @param appt_id
	 * @throws Exception
	 */
	public JSONArray cancelAppointment(ConnectBean conb, String appt_id) throws Exception;

	/**
	 * 多个预约单连续签到
	 * 
	 * @param conb
	 * @param appt_ids
	 * @throws Exception
	 */
	public void sign(ConnectBean conb, String[] appt_id) throws Exception;

	/**
	 * 获取预约单情况
	 * 
	 * @param conb
	 * @param examtypeId
	 * @param exam_start_time
	 * @param exam_end_time
	 * @param isSign
	 * @return
	 * @throws Exception
	 */
	public JSONObject queryAppointmentList(ConnectBean conb, HttpServletRequest request,String examtypeId, String exam_start_time, String exam_end_time, String is_appted,String othersql) throws Exception;

	JSONObject queryAppointmentList(ConnectBean conb, HttpServletRequest request, String whereCondition) throws Exception;
}
