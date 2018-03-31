package com.longj.products.ea.standard.axis;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.tempuri.ReturnExComm;
import org.tempuri.ReturnExTable;
import org.tempuri.Service1;
import org.tempuri.Service1Locator;

//生成的JAVA代码中，除了BEAN外，会有2个接口，3个类
public class ServiceProxy {

	private ServiceProxy() {
	}

	private static ServiceProxy instance;

	public static ServiceProxy getInstance() { // 对获取实例的方法进行同步
		if (instance == null) {
			synchronized (ServiceProxy.class) {
				if (instance == null)
					instance = new ServiceProxy();
			}
		}
		return instance;
	}

	private String userID = "root";

	private String password = "root";

	private Service1 locator = new Service1Locator();

	/**
	 * 医生排班查询 <br>
	 * 功能描述：根据传入的日期、挂号类型和门诊分院类别筛选出符合条件的医生排班信息
	 * 
	 * @param registDate
	 *            预约挂号日期 Date Y yyyy-MM-dd
	 * @param registType
	 *            预约挂号类型 String Y 1：普通；3：专家
	 * @param MZLB
	 *            门诊类别 String Y 1：人民医院，6：中医院
	 * @return
	 * @throws RemoteException
	 * @throws ServiceException
	 */
	public ReturnExTable ptGetRegisterDeptDoctList(String registDate, String registType, String MZLB) throws RemoteException, ServiceException {

		ReturnExTable re = locator.getService1Soap().ptGetRegisterDeptDoctList(userID, password, registDate, registType, MZLB);
		return re;
	}

	/**
	 * 排班号(时间点)查询
	 * 
	 * @param scheduleId
	 * @return
	 * @throws RemoteException
	 * @throws ServiceException
	 */
	public ReturnExTable PtGetClinicScheduleTimeDataTableForCall(String scheduleId) throws RemoteException, ServiceException {
		ReturnExTable re = locator.getService1Soap().ptGetClinicScheduleTimeDataTableForCall(userID, password, scheduleId);
		return re;
	}

	/**
	 * 电话预约\取消预约
	 * 
	 * @param timeId
	 * @param lockbz
	 * @param lockNum
	 * @return
	 * @throws RemoteException
	 * @throws ServiceException
	 */
	public ReturnExComm PtUpdateClinicScheduleTimeLockAndUnLock(java.lang.String timeId, java.lang.String lockbz, java.lang.String lockNum) throws RemoteException, ServiceException {
		ReturnExComm re = locator.getService1Soap().ptUpdateClinicScheduleTimeLockAndUnLock(userID, password, timeId, lockbz, lockNum);
		return re;
	}

	/*
	 * public ReturnExComm
	 * PtUpdateClinicScheduleTimeLockAndUnLock(java.lang.String timeId,
	 * java.lang.String lockbz, java.lang.String lockNum){ ReturnExComm re =
	 * locator.getService1Soap().ptUpdateClinicScheduleTimeLockAndUnLock(userID,
	 * password, timeId, lockbz, lockNum); return re; }
	 */

	/**
	 * 预约列表
	 * 
	 * @param strDateTime
	 * @param strTelNo
	 * @return
	 * @throws RemoteException
	 * @throws ServiceException
	 */
	public ReturnExTable PtGetScheduleTimeForCall(String strDateTime, String strTelNo) throws RemoteException, ServiceException {
		ReturnExTable re = locator.getService1Soap().ptGetScheduleTimeForCall(userID, password, strDateTime, strTelNo);
		return re;
	}

	/**
	 * 预约占号，锁号
	 * 
	 * @param scheduleId
	 * @param timeId
	 * @return
	 * @throws RemoteException
	 * @throws ServiceException
	 */
	public ReturnExComm PtReservationClinicRegistForCall_zw(String scheduleId, String timeId) throws RemoteException, ServiceException {
		ReturnExComm re = locator.getService1Soap().ptReservationClinicRegistForCall_zw(userID, password, scheduleId, timeId);
		return re;
	}

	/**
	 * 预约取消占号（解锁）
	 * 
	 * @param scheduleId
	 * @param timeId
	 * @return
	 * @throws RemoteException
	 * @throws ServiceException
	 */
	public ReturnExComm PtClinicRegist_tzw(String scheduleId, String timeId) throws RemoteException, ServiceException {
		ReturnExComm re = locator.getService1Soap().ptClinicRegist_tzw(userID, password, scheduleId, timeId);
		return re;
	}

}
