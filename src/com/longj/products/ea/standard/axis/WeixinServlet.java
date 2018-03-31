package com.longj.products.ea.standard.axis;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.tempuri.ReturnExComm;
import org.tempuri.ReturnExTable;

public class WeixinServlet extends HttpServlet {

	private static final boolean ON_OF_AXIS = true;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String method = request.getParameter("method");
		try {
			Method m = this.getClass().getDeclaredMethod(method, HttpServletRequest.class, HttpServletResponse.class);
			m.invoke(this, request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取部门列表
	 * 
	 * @param request
	 * @param response
	 */
	private void PtGetRegisterDeptList(HttpServletRequest request, HttpServletResponse response) {
		String registDate = request.getParameter("registDate");
		String registType = request.getParameter("registType");
		String MZLB = request.getParameter("MZLB");
		try {
			String returnStr = "[{id:\"11\",name:\"心内科\"},{id:\"11\",name:\"胸外科\"},{id:\"11\",name:\"22\"},{id:\"11\",name:\"22\"},{id:\"11\",name:\"22\"},{id:\"11\",name:\"22\"},{id:\"11\",name:\"22\"},{id:\"11\",name:\"22\"},{id:\"11\",name:\"22\"},{id:\"11\",name:\"22\"}]";
			if (ON_OF_AXIS) {
				HashMap<String, String> keyMappings = new HashMap<String, String>();
				keyMappings.put("DEPT_CODE", "id");
				keyMappings.put("DEPT_NAME", "name");
				ReturnExTable re = ServiceUtils.getProxy().ptGetRegisterDeptDoctList(registDate, registType, MZLB);
				JSONArray rows = ServiceUtils.messageElement2JSONArray(re.getInfoData().get_any(), keyMappings);
				JSONArray result = new JSONArray();
				HashSet<String> set = new HashSet<String>();
				if (rows != null && rows.size() > 0) {
					for (int i = 0; i < rows.size(); i++) {
						JSONObject row = rows.getJSONObject(i);
						String id = row.getString("id");
						if (!set.contains(id)) {
							set.add(id);
							result.add(row);
						}
					}
				}
				returnStr = result.toString();
			}
			PrintWriter out = response.getWriter();
			out.print(returnStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

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
	private void PtGetRegisterDeptDoctList(HttpServletRequest request, HttpServletResponse response) {
		try {
			String registDate = request.getParameter("registDate");
			String registType = request.getParameter("registType");
			String MZLB = request.getParameter("MZLB");
			String deptCode = request.getParameter("deptCode");// 当前选择的部门CODE
			// out.print(JSONObject.fromObject(re).toString());

			String returnStr = "[{id:\"1\",name:\"林小芹1\",type:\"1\",title:\"普通门诊\",total:12,ghf:\"10.00\",zlf:\"10.00\",zjf:\"10.00\"}\n" + "\t\t,{id:\"2\",name:\"林小芹2\",type:\"1\",title:\"普通门诊\",total:12,ghf:\"10.00\",zlf:\"10.00\",zjf:\"10.00\"}\n"
					+ "\t\t,{id:\"3\",name:\"林小芹3\",type:\"1\",title:\"普通门诊\",total:12,ghf:\"10.00\",zlf:\"10.00\",zjf:\"10.00\"}\n" + "    ,{id:\"4\",name:\"林小芹4\",type:\"1\",title:\"普通门诊\",total:12,ghf:\"10.00\",zlf:\"10.00\",zjf:\"10.00\"}\n"
					+ "    ,{id:\"5\",name:\"林小芹5\",type:\"2\",title:\"专家门诊\",total:12,ghf:\"10.00\",zlf:\"10.00\",zjf:\"10.00\"}]";

			if (ON_OF_AXIS) {
				HashMap<String, String> keyMappings = new HashMap<String, String>();
				keyMappings.put("SCHEDULE_ID", "id");
				keyMappings.put("DOCTOR_NAME", "name");
				keyMappings.put("REGIST_TYPE", "type");
				keyMappings.put("REGISTTYPENAME", "title");
				keyMappings.put("TOTAL_NUM", "total");
				keyMappings.put("RESERVATION_NUM", "used");
				keyMappings.put("GHF", "ghf");
				keyMappings.put("ZLF", "zlf");
				keyMappings.put("ZJF", "zjf");
				keyMappings.put("DEPT_CODE", "dept_code");
				ReturnExTable re = ServiceUtils.getProxy().ptGetRegisterDeptDoctList(registDate, registType, MZLB);
				JSONArray rows = ServiceUtils.messageElement2JSONArray(re.getInfoData().get_any(), keyMappings);
				// ReturnExTable re =
				// ServiceUtils.getProxy().ptGetRegisterDeptDoctList(registDate,
				// registType, MZLB);
				JSONArray result = new JSONArray();
				if (rows != null && rows.size() > 0 && deptCode != null && deptCode.trim().length() > 0) {
					for (int i = 0; i < rows.size(); i++) {
						JSONObject row = rows.getJSONObject(i);
						String dept_code = row.getString("dept_code");
						if (deptCode.equals(dept_code)) {
							int totalVal = row.getInt("total");
							int usedVal = row.getInt("used");
							row.put("leave", totalVal - usedVal);
							result.add(row);
						}
					}
				}
				returnStr = result.toString();
			}
			PrintWriter out = response.getWriter();
			out.print(returnStr);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void PtGetClinicScheduleTimeDataTableForCall(HttpServletRequest request, HttpServletResponse response) {
		try {
			String scheduleId = request.getParameter("scheduleId");

			String returnStr = "[{\n" + "      id:\"1\"\n" + "      ,order:\"101\"\n" + "      ,ampm:\"上午\"\n" + "      ,timepoint:\"08:04\"\n" + "    },{\n" + "      id:\"1\"\n" + "      ,order:\"002\"\n" + "      ,ampm:\"上午\"\n" + "      ,timepoint:\"08:04\"\n" + "    },{\n" + "      id:\"1\"\n"
					+ "      ,order:\"003\"\n" + "      ,ampm:\"上午\"\n" + "      ,timepoint:\"08:04\"\n" + "    },{\n" + "      id:\"1\"\n" + "      ,order:\"004\"\n" + "      ,ampm:\"上午\"\n" + "      ,timepoint:\"08:04\"\n" + "    },{\n" + "      id:\"1\"\n" + "      ,order:\"005\"\n"
					+ "      ,ampm:\"上午\"\n" + "      ,timepoint:\"08:04\"\n" + "    },{\n" + "      id:\"1\"\n" + "      ,order:\"006\"\n" + "      ,ampm:\"上午\"\n" + "      ,timepoint:\"08:04\"\n" + "    },{\n" + "      id:\"1\"\n" + "      ,order:\"007\"\n" + "      ,ampm:\"上午\"\n"
					+ "      ,timepoint:\"08:04\"\n" + "    },{\n" + "      id:\"1\"\n" + "      ,order:\"008\"\n" + "      ,ampm:\"上午\"\n" + "      ,timepoint:\"08:04\"\n" + "    },{\n" + "      id:\"1\"\n" + "      ,order:\"009\"\n" + "      ,ampm:\"上午\"\n" + "      ,timepoint:\"08:04\"\n"
					+ "    },{\n" + "      id:\"1\"\n" + "      ,order:\"010\"\n" + "      ,ampm:\"上午\"\n" + "      ,timepoint:\"08:04\"\n" + "    },{\n" + "      id:\"1\"\n" + "      ,order:\"011\"\n" + "      ,ampm:\"上午\"\n" + "      ,timepoint:\"08:04\"\n" + "    }]";
			if (ON_OF_AXIS) {
				HashMap<String, String> keyMappings = new HashMap<String, String>();
				keyMappings.put("TIME_ID", "id");
				keyMappings.put("VISIT_NO", "order");
				keyMappings.put("AMPM", "ampm");
				keyMappings.put("FROM_TIME", "timepoint");
				ReturnExTable re = ServiceUtils.getProxy().PtGetClinicScheduleTimeDataTableForCall(scheduleId);
				JSONArray rows = ServiceUtils.messageElement2JSONArray(re.getInfoData().get_any(), keyMappings);
				returnStr = rows.toString();
			}
			PrintWriter out = response.getWriter();

			out.print(returnStr);
			// out.print(JSONObject.fromObject(re).toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void PtReservationClinicRegistForCall_zw(HttpServletRequest request, HttpServletResponse response) {
		try {
			String scheduleId = request.getParameter("scheduleId");
			String timeId = request.getParameter("timeId");
			ReturnExComm re = ServiceUtils.getProxy().PtReservationClinicRegistForCall_zw(scheduleId, timeId);
			PrintWriter out = response.getWriter();
			out.print(JSONObject.fromObject(re).toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void PtClinicRegist_tzw(HttpServletRequest request, HttpServletResponse response) {
		try {
			String scheduleId = request.getParameter("scheduleId");
			String timeId = request.getParameter("timeId");
			ReturnExComm re = ServiceUtils.getProxy().PtClinicRegist_tzw(scheduleId, timeId);
			PrintWriter out = response.getWriter();
			out.print(JSONObject.fromObject(re).toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void PtUpdateClinicScheduleTimeLockAndUnLock(HttpServletRequest request, HttpServletResponse response) {
		try {
			JSONObject result = new JSONObject();
			result.put("code", "0");
			String preffix = "预约";
			String timeId = request.getParameter("timeId");
			String lockbz = request.getParameter("lockbz");
			if ("0".equals(lockbz)) {
				preffix = "取消预约";
			}
			result.put("desc", preffix + "失败");
			String lockNum = request.getParameter("lockNum");
			boolean isSuucess = true;
			if (ON_OF_AXIS) {
				ReturnExComm re = ServiceUtils.getProxy().PtUpdateClinicScheduleTimeLockAndUnLock(timeId, lockbz, lockNum);
				isSuucess = re.isSuccess();
			}
			if (isSuucess) {
				result.put("code", "1");
				result.put("desc", preffix + "成功");
			}
			PrintWriter out = response.getWriter();
			out.print(result.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取本人的预约列表信息
	 * 
	 * @param request
	 * @param response
	 */
	private void PtGetScheduleTimeForCall(HttpServletRequest request, HttpServletResponse response) {
		try {
			String strDateTime = request.getParameter("strDateTime");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			strDateTime = sdf.format(new Date());
			String strTelNo = request.getParameter("strTelNo");
			strTelNo = "13675830455";
			String resultStr = "[{id:1,title:'2017年03月25日08:45【10号】',dept_name:'普内科',doctor_name:'叶云程'},{id:1,title:'2017年03月25日08:45【10号】',dept_name:'普内科',doctor_name:'叶云程'}]";
			if (ON_OF_AXIS) {
				ReturnExTable re = ServiceUtils.getProxy().PtGetScheduleTimeForCall(strDateTime, strTelNo);
				JSONArray rows = ServiceUtils.messageElement2JSONArray(re.getInfoData().get_any(), null);
				JSONArray result = new JSONArray();
				if (rows != null && rows.size() > 0) {
					for (int i = 0; i < rows.size(); i++) {
						JSONObject row = rows.getJSONObject(i);
						JSONObject one = new JSONObject();
						one.put("id", row.getString("TIME_ID"));
						one.put("dept_name", row.getString("DEPT_NAME"));
						one.put("doctor_name", row.getString("DOCTOR_NAME"));
						String title = row.getString("SCHEDULE_TIME") + "   "+row.getString("FROM_TIME") + "【" + row.getString("VISIT_NO") + "】号";
						one.put("title", title);
						result.add(one);
					}
				}
				resultStr = result.toString();
			}
			PrintWriter out = response.getWriter();
			out.print(resultStr);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
