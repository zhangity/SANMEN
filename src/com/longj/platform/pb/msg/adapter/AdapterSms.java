package com.longj.platform.pb.msg.adapter;

import java.text.MessageFormat;
import java.util.HashMap;

import javax.xml.namespace.QName;

import net.sf.json.JSONObject;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.wdk.WDK;
import org.wdk.core.bean.WDKLogger;

import com.longj.platform.pb.msg.bean.MSGBaseAdapter;
import com.longj.platform.pb.msg.bean.MSGBean;
import com.longj.platform.pb.msg.bean.MSGResultBean;
import com.longj.products.ea.standard.bu.BUServiceUtil;

public class AdapterSms extends MSGBaseAdapter {
	private static WDKLogger logger = new WDKLogger(AdapterSms.class.getName());
	public static final HashMap<String, String> smsTemplateMap = new HashMap<String, String>();
	static {
		smsTemplateMap.put("1", "尊敬的{0}:您的【{1}】检查单已经预约成功，预约时间是{2} 地点是{3}。请仔细查看预约单上的注意事项，并提前十五分钟到检查科室签到。");// 预约成功
		smsTemplateMap.put("2", "尊敬的{0}:您预约的【{1}】检查单已经取消成功。");// 取消预约成功
	}

	public static void main(String[] args) {
        MessageFormat form = new MessageFormat("xxxxx{0}xx");
        String[] testArgs=new String[]{"hello"};
        System.out.println(form.format(testArgs));
    }
	@Override
	public MSGResultBean process(MSGBean mb) {
		MSGResultBean mrb = new MSGResultBean(false, MSGResultBean.CODE_SendError, MSGResultBean.DESC_SendError);

		// webserviceURL
		String service_url = "http://10.10.1.13:89/Services/WSToJCYY.asmx";
		String namespaceURI = "http://tempuri.org/";
		String methodName = "SendSMSFromJCYY";// "GetPatientInfo";
		try {
			String _service_url = WDK.getNodeParam("his_server_endpoint");
			if (_service_url != null && _service_url.trim().length() > 0) {
				service_url = _service_url;
			}
		} catch (Exception e) {
			try {
				logger.error(e.getMessage());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		String runMode = WDK.getNodeParam("run_mode");
		if ("0".equals(runMode)) {
			return mrb;
		}
		try {
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
			jsonstr.put("patient_id", mb.getReceiverid());
			jsonstr.put("patient_type", "t1");
			jsonstr.put("nr", mb.getMsgcontent());
			String checkCode = BUServiceUtil.getLiencesNo();
			// 调用该方法,传入 ws.GetPatientInfo("3085315", "t1", out mzhm);

			Object xmlStr = call.invoke(new Object[] { checkCode, jsonstr.toString() });
			logger.info(xmlStr.toString());
			if (xmlStr != null) {
				String result = (String) xmlStr.toString();
				if (result != null && result.trim().length() > 0 && result.trim().startsWith("{")) {
					JSONObject j0 = JSONObject.fromObject(result);
					// {"IsSuccess":true,"Tip":null,"obj":{"patient_id":null,"patient_name":null,"sex":null,"csny":null,"blhm":null,"sfyb":null,"sfzh":null,"lczd":"面部裂伤","zs":"面部裂伤一小时","xbs":"面部裂伤","tj":"面部裂伤"}}
					if (j0 != null && j0.containsKey("IsSuccess")) {
						boolean isSuccess = j0.getBoolean("IsSuccess");
						if (isSuccess) {
							logger.info("短信发送成功！");
							mrb.setRespcode(MSGResultBean.CODE_Success);
							mrb.setRespdesc("短信发送成功！");
							mrb.setSuccess(true);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mrb;
	}
}