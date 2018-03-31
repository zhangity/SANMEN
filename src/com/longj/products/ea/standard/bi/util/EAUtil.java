package com.longj.products.ea.standard.bi.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.namespace.QName;

import net.sf.json.JSONObject;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.wdk.WDK;
import org.wdk.core.bean.WDKLogger;

import com.longj.products.ea.standard.bi.bean.EAPatient;
import com.longj.products.ea.standard.bu.BUServiceUtil;

public class EAUtil {
	
	private static WDKLogger logger = new WDKLogger(EAUtil.class.getName());

	/**
	 * 获取病人的基本信息
	 * 
	 * @param patient_id
	 * @param patient_type
	 * @return
	 */
	public static EAPatient queryPatient(String patient_id, String patient_type,String clinic_id) {
		EAPatient eapatient = null;
		boolean isInvokeSuccess = false;
		try {
			// webserviceURL
			String service_url = "http://10.10.1.13:89/Services/WSToJCYY.asmx";
			String namespaceURI = "http://tempuri.org/";
			String methodName = "GetPatientInfoFromJson";//"GetPatientInfo";
			try {
				String _service_url = WDK.getNodeParam("his_server_endpoint");
				if (_service_url != null && _service_url.trim().length() > 0) {
					service_url = _service_url;
				}

				String _namespaceURI = WDK.getNodeParam("his_server_namespace");
				if (_namespaceURI != null && _namespaceURI.trim().length() > 0) {
					namespaceURI = _namespaceURI;
				}

				String _methodName = WDK.getNodeParam("his_server_patient");
				if (_methodName != null && _methodName.trim().length() > 0) {
					methodName = _methodName;
				}
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
			String runMode = WDK.getNodeParam("run_mode");
			if ("0".equals(runMode)) {
				eapatient = new EAPatient(patient_id, true);
				eapatient.setSfyb("1");//测试为医保病人
				return eapatient;
			}
			Service service = new Service();
			Call call = (Call) service.createCall();
			call.setTargetEndpointAddress(new java.net.URL(service_url));
			// 设置要调用的方法
			// http://intelink.net/是wsdl中definitions根节点的targetNamespace属性值
			call.setOperationName(new QName(namespaceURI, methodName));
			// 该方法需要的参数
			call.addParameter(new QName(namespaceURI, "checkcode"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName(namespaceURI, "jsonstr"), org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			// call.addParameter("GetPatientInfoResult",
			// org.apache.axis.encoding.XMLType.XSD_STRING,
			// javax.xml.rpc.ParameterMode.OUT);
			// call.addParameter("out_id",
			// org.apache.axis.encoding.XMLType.XSD_STRING,
			// javax.xml.rpc.ParameterMode.OUT);
			// 方法的返回值类型
			call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);
			call.setUseSOAPAction(true);
			call.setSOAPActionURI(namespaceURI + methodName);
			JSONObject jsonstr = new JSONObject();
			jsonstr.put("patient_id", patient_id);
			jsonstr.put("patient_type", patient_type);
			jsonstr.put("clinic_id", clinic_id);
			String checkCode  = BUServiceUtil.getLiencesNo();
			// 调用该方法,传入  ws.GetPatientInfo("3085315", "t1", out mzhm);
			Object xmlStr = call.invoke(new Object[] { checkCode, jsonstr.toString() });
			// 获取SOAP
			// MessageContext msgContext = call.getMessageContext();
			// 请求消息
			// Message reqMsg = msgContext.getRequestMessage();
			// System.out.println(reqMsg.getSOAPPartAsString());
			// 响应消息
			// Message respMsg = msgContext.getResponseMessage();
			// System.out.println(respMsg.getSOAPPartAsString());
			logger.info(xmlStr.toString());
			//传出：{"patient_id":"3085315","patient_name":"金凯","sex":"1","csny":"2011/8/4 0:00:00","blhm":"3085315","sfyb":"0","sfzh":"331022201108043675"}
			if (xmlStr != null) {
				String result = (String) xmlStr.toString();
				if (result != null && result.trim().length() > 0 && result.trim().startsWith("{")) {
					JSONObject j0 = JSONObject.fromObject(result);
					//{"IsSuccess":true,"Tip":null,"obj":{"patient_id":null,"patient_name":null,"sex":null,"csny":null,"blhm":null,"sfyb":null,"sfzh":null,"lczd":"面部裂伤","zs":"面部裂伤一小时","xbs":"面部裂伤","tj":"面部裂伤"}}
					if(j0!=null && j0.containsKey("IsSuccess")){
						boolean isSuccess = j0.getBoolean("IsSuccess");
						if(isSuccess){
							JSONObject jo = j0.getJSONObject("obj");
							isInvokeSuccess = true;
							eapatient = new EAPatient(patient_id, false);
							eapatient.setPatient_name(jo.getString("patient_name"));
							eapatient.setPatient_type(patient_type);
							eapatient.setSex(jo.getString("sex"));
							eapatient.setSfyb(jo.getString("sfyb"));
							eapatient.setSfzh(jo.getString("sfzh"));
							eapatient.setBlhm(jo.getString("blhm"));
							eapatient.setExam_zd(jo.getString("lczd"));
							eapatient.setExam_zs(jo.getString("zs"));
							eapatient.setExam_bs(jo.getString("xbs"));
							eapatient.setExam_ct(jo.getString("tj"));
							eapatient.setBed_no(jo.containsKey("brch")?jo.getString("brch"):"");
							String csny = jo.getString("csny");
							if (csny != null && csny.trim().length() > 0) {
								eapatient.setCsny(csny);
								Calendar nowTime = Calendar.getInstance();
								Date now = nowTime.getTime();
								int _now = nowTime.get(Calendar.YEAR);
								SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
								Date d = sdf.parse(csny);
								nowTime.setTime(d);
								Date birth = nowTime.getTime();
								int days = daysBetween(birth, now);
								int _birth = nowTime.get(Calendar.YEAR);
								int age = 0;
								String unit = "";
								if(days<31){
									age = days;
									unit = "天";
								}else if(days<366 && days>=31){
									age = (days/30);
									unit = "月";
								}else{
									age = _now -_birth;
									unit = "岁";
								}
								eapatient.setAge(age + "");
								eapatient.setAgename(age+""+unit);
							}
						}
					}
					
				}
			}
			if (!isInvokeSuccess) {
				eapatient = new EAPatient(patient_id, true);
			}
		} catch (Exception e) {
			e.printStackTrace();
			eapatient = new EAPatient(patient_id, true);
		}
		return eapatient;
	}

	public static void main(String[] arg0) {
		queryPatient("3085315", "t1","");
	}
	
	public static int daysBetween(Date smdate, Date bdate) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		smdate = sdf.parse(sdf.format(smdate));
		bdate = sdf.parse(sdf.format(bdate));
		Calendar cal = Calendar.getInstance();
		cal.setTime(smdate);
		long time1 = cal.getTimeInMillis();
		cal.setTime(bdate);
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(between_days));
	}  
	      

}
