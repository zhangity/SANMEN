package com.longj.platform.pb.msg;

import java.text.MessageFormat;

import net.sf.json.JSONObject;

import org.wdk.WDK;
import org.wdk.module.wql.core.bean.ConnectBean;

import wql.WQLNames;

import com.longj.platform.pb.mark.PBMark;
import com.longj.platform.pb.msg.adapter.AdapterSms;
import com.longj.platform.pb.msg.bean.MSGBaseAdapter;
import com.longj.platform.pb.msg.bean.MSGBean;
import com.longj.platform.pb.msg.bean.MSGResultBean;
import com.longj.platform.pb.util.WQLUtil;
import com.longj.products.ea.standard.bu.BUConstant;


public class MSG {
	public static final String Adapter_sms = "sms";					//手机短信
	public static final String Adapter_mail = "mail";				//邮箱
	public static final String Adapter_push = "push";				//手机推送消息
	public static final String Adapter_ws = "ws";					//webservice
	public static final String Adapter_ws_todo = "ws_todo";			//统一待办路由适配器
	public static final String Adapter_ding = "ding";				//钉钉Ding消息
	public static final String Adapter_im = "im";					//其他IM消息
		
	public static final String STATUS_Wait = "01";			//等待发送
	public static final String STATUS_Process = "02";		//正在处理
	public static final String STATUS_Error = "03";			//发送失败，等待重发
	public static final String STATUS_ErrorClose = "04";	//发送失败，结束发送
	public static final String STATUS_Success = "05";		//发送成功
	public static final String STATUS_Close = "06";			//取消或关闭
	
	
	public static void main(String[] args) throws Exception {
		//通过消息机制向统一待办发送消息
		MSGBean mb = new MSGBean();
		mb.setReceivertype(MSG.Adapter_sms);
		mb.setReceiverid("手机号");
		mb.setMsgcontent("短信内容");
//		mb.setReceivertype(MSG.Adapter_ws_todo);
//		mb.setMsgcontent("这里放统一待办的操作xml内容");
		MSG.sendSync(mb);		//使用异步发送，通过中间表缓存
	}
	/***************************************
	 * 		内部公用方法
	 ***************************************/
	/**
	 * 获取适配器对象
	 */
	protected static MSGBaseAdapter getAdapter(MSGBean mb){
		String adapterType = mb.getReceivertype();
		if(mb.getRoutetype()!=null && !"".equals(mb.getRoutetype())){
			adapterType = mb.getRoutetype();
		}
		String adapterClass = WDK.getNodeParam("msg_adapter_"+adapterType);
		MSGBaseAdapter adapter = null;
		try {
			adapter = (MSGBaseAdapter) Class.forName(adapterClass).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return adapter;
	}
	
	/**
	 * 同步发送
	 * @param mb			统一消息发送信息
	 * @param needMark		是否需要留痕
	 * @return
	 * @throws Exception 
	 */
	private static MSGResultBean _sendSync(MSGBean mb,boolean needMark,ConnectBean conb) throws Exception{
		String instr = mb.toString();
		MSGResultBean mrb = null;
		
		//1、生成操作流水序列号
		String serialuuid = WDK.getUUID();				//序列号
		
		if(needMark){
			//2、输入报文留痕
			PBMark.insert(PBMark.TYPE_MSG, serialuuid, PBMark.DIRECTION_Request, instr,conb);
		}
		
		//3、加载对应的适配器并调用
		MSGBaseAdapter adapter = getAdapter(mb);
		if(null==adapter){
			mrb = new MSGResultBean(false, MSGResultBean.CODE_NoAdapter, MSGResultBean.DESC_NoAdapter);
		}else{
			try {
				mrb = adapter.process(mb);
			} catch (Exception e) {
				e.printStackTrace();
				mrb = new MSGResultBean(false, MSGResultBean.CODE_SendError, MSGResultBean.DESC_SendError);
			}
		}
		
		//4、输出报文留痕
		if(needMark){
			PBMark.insert(PBMark.TYPE_MSG, serialuuid, PBMark.DIRECTION_Response, mrb.toString(),conb);
		}		
		
		//5、返回输出报文
		return mrb;
	}
	
	/**
	 * 三门医院发送短信的接口
	 * 
	 * @param rows
	 * @param isCancel
	 * @return
	 * @throws Exception
	 */
	public static MSGResultBean sendSms4Smyy(JSONObject rows, String isCancel) throws Exception {
		String receivertype = rows.getString("exam_type");
		if (BUConstant.PATIENT_SORT_MZ.equals(receivertype)) {
			MessageFormat form = new MessageFormat((String) AdapterSms.smsTemplateMap.get(isCancel));
			String roomName = (rows.containsKey("dept_name") ? rows.getString("dept_name") : "") + rows.getString("room_name");
			String address = rows.getString("room_address");
			if (address != null && address.trim().length() > 0) {
				roomName = address + roomName;
			}
			String[] param = new String[] { rows.getString("patient_name"), rows.getString("item_name"), rows.getString("appt_date"), roomName };
			String msgcontent = form.format(param);
			String receiverid = rows.getString("patient_id");
			receiverid = "1007064";
			final MSGBean mb = new MSGBean(msgcontent, receivertype, receiverid);
			Runnable r = new Runnable() {
				public void run() {
					try {
						sendSMSSync(mb);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			Thread t = new Thread(r);
			t.start();
		}
		return null;
	}
	
	/**
	 * 异步发送
	 * @param mb
	 * @param needMark
	 * @return
	 * @throws Exception 
	 */
	private static MSGResultBean _sendAsyn(MSGBean mb,boolean needMark,ConnectBean conb) throws Exception{
		String instr = mb.toString();
		MSGResultBean mrb = null;
		
		//1、生成操作流水序列号
		String serialuuid = WDK.getUUID();				//序列号
		
		if(needMark){
			//2、输入报文留痕
			PBMark.insert(PBMark.TYPE_MSG, serialuuid, PBMark.DIRECTION_Request, instr,conb);
		}
		
		//3、插入消息缓存表
		boolean isSuccess = false;
		
		if(conb!=null){
		    isSuccess =  WQLUtil.getWQL(WQLNames.UPFMSG0001)
            .addParam("flag", "1")
            .addParamMap(mb.toMap())
            .process(conb)
            .isSuccess();
		}else{
		    isSuccess =  WQLUtil.getWQL(WQLNames.UPFMSG0001)
            .addParam("flag", "1")
            .addParamMap(mb.toMap())
            .process()
            .isSuccess();
		}
		if(isSuccess){
			mrb = new MSGResultBean(true, MSGResultBean.CODE_Success, MSGResultBean.DESC_Success);
		}else{
			mrb = new MSGResultBean(false, MSGResultBean.CODE_SendError, MSGResultBean.DESC_SendError);
		}
		return mrb;
	}
	
	
	
	/***************************************
	 * 		同步消息发送
	 * 特点：
	 * 		发送结果实时获取，可以根据结果进行后续处理
	 * 		后台直接调用相关适配器直接发送，无延时
	 * 适合：
	 * 		1、要求消息发送准确率较高的应用场景
	 * 		2、对发送速度无特殊要求
	 * 		3、发送量不大，速率不高
	 ***************************************/
	/**
	 * 发送短消息
	 * @param mb
	 * @return
	 * @throws Exception 
	 */
	public static MSGResultBean sendSMSSync(MSGBean mb) throws Exception{
		return sendSMSSync(mb,true);
	}
	public static MSGResultBean sendSMSSync(MSGBean mb,boolean needMark) throws Exception{
		mb.setReceivertype(MSG.Adapter_sms);
		MSGResultBean mrb = _sendSync(mb,needMark,null);
		return mrb;
	}
	public static MSGResultBean sendSMSSync(String sendername,String phone,String msgcontent) throws Exception{
		MSGBean mb = new MSGBean(msgcontent, MSG.Adapter_sms, phone);
		mb.setSendername(sendername);
		MSGResultBean mrb = _sendSync(mb,true,null);
		return mrb;
	}
	/**
	 * 发送邮件
	 * @param mb
	 * @return
	 * @throws Exception 
	 */
	public static MSGResultBean sendMailSync(MSGBean mb) throws Exception{
		return sendMailSync(mb,true);
	}
	public static MSGResultBean sendMailSync(MSGBean mb,boolean needMark) throws Exception{
		mb.setReceivertype(MSG.Adapter_mail);
		MSGResultBean mrb = _sendSync(mb,needMark,null);
		return mrb;
	}
	
	
	/***************************************
	 * 		异步消息发送
	 * 特点：
	 * 		消息反馈速度快，后台采用缓存表的方式统一处理
	 * 		通过轮询批量发送消息
	 * 适合：
	 * 		1、大批量高密度的发送
	 * 		2、要求及时响应，对业务操作无影响
	 * 		3、不需要记录痕迹，痕迹在ws接口已经保留
	 * @throws Exception 
	 ***************************************/
	public static MSGResultBean sendSMSAsyn(MSGBean mb) throws Exception{
		return sendSMSAsyn(mb,true,null);
	}
	public static MSGResultBean sendSMSAsyn(String sendername,String phone,String msgcontent) throws Exception{
		return sendSMSAsyn(sendername,phone,msgcontent,null);
	}
	public static MSGResultBean sendSMSAsyn(String sendername,String phone,String msgcontent,ConnectBean conb) throws Exception{
		MSGBean mb = new MSGBean(msgcontent, MSG.Adapter_sms, phone);
		mb.setSendername(sendername);
		MSGResultBean mrb = sendSMSAsyn(mb,true,conb);
		return mrb;
	}
	public static MSGResultBean sendSMSAsyn(MSGBean mb,boolean needMark,ConnectBean conb) throws Exception{
		mb.setReceivertype(MSG.Adapter_sms);
		MSGResultBean mrb = _sendAsyn(mb,needMark,conb);
		return mrb;
	}
	//发送大蚂蚁
	/**
	 * 支持群发，发送者账户以逗号隔开。
	 * @param senderID  发送者登录名对应4A中login_name
	 * @param receiverID 接收者者登录名对应4A中login_name
	 * @param msgcontent 信息内容
	 * @return
	 */
	public static MSGResultBean sendImAsyn(String senderID,String receiverID,String msgcontent) throws Exception{
		return sendImAsyn(senderID,receiverID,msgcontent,null);
	}
	public static MSGResultBean sendImAsyn(String senderID,String receiverID,String msgcontent,ConnectBean conb) throws Exception{
		MSGBean mb = new MSGBean(msgcontent, MSG.Adapter_im, receiverID);
		mb.setReceivertype(MSG.Adapter_im);
		mb.setSenderid(senderID);
		mb.setMsgtitle("您有一条新待办。");
		mb.setMsgtype("Text/Text");
		MSGResultBean mrb = _sendAsyn(mb,true,conb);
		return mrb;
	}
	
	/***************************************
	 * 		webservice消息发送
	 * 特点：
	 * 		通过webservice服务端口接收短信发送请求
	 * 		接收的报文要求符合短信的报文要求
	 * 适合：
	 * 		1、可以根据报文来区分同步或是异步短信并调用相关方法
	 * 		
	 ***************************************/
//	public static String sendWS(String instr){
//		String outstr = "";
//		String route = "";
//		MSGBean mb = new MSGBean();
//		MSGResultBean mrb = null;
//		try {
//			Node root = uXmlParse.loadxmlString(instr);
//			Node node_route = uXmlParse.findNode(root, "/wdk/route");
//			route = uXmlParse.getNodeOuterXml(node_route, false);
//			
//			String issync = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/issync"));
//			String sendertype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/sendertype"));
//			String senderid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/senderid"));
//			String msgid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/msgid"));
//			String msgtype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/msgtype"));
//			String msgtitle = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/msgtitle"));
//			String msgsummary = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/msgsummary"));
//			String msgcontent = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/msgcontent"));
//			String msgtime = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/msgtime"));
//			String msgparam = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/msgparam"));
//			String receivertype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/receivertype"));
//			String receiverid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/receiverid"));
//			String routetype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/routetype"));
//			String routetime = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/routetime"));
//			
//			mb.setSendertype(sendertype);
//			mb.setSenderid(senderid);
//			mb.setMsgid(msgid);
//			mb.setMsgtype(msgtype);
//			mb.setMsgtitle(msgtitle);
//			mb.setMsgsummary(msgsummary);
//			mb.setMsgcontent(msgcontent);
//			mb.setMsgtime(msgtime);
//			mb.setMsgparam(msgparam);
//			mb.setReceivertype(receivertype);
//			mb.setReceiverid(receiverid);
//			mb.setRoutetype(routetype);
//			mb.setRoutetime(routetime);
//			
//			if("0".equals(issync)){
//				//如果是同步调用，则调用异步发送方法
//				mrb = _sendAsyn(mb, false);
//			}else{
//				//如果是非同步调用，则调用异步发送方法
//				mrb = _sendSync(mb, false);
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			mrb = new MSGResultBean(false, MSGResultBean.CODE_SendError, MSGResultBean.DESC_SendError);
//		}
//		
//		//组装完整ws报文
//		outstr = WSProtocol.getOutstr(route, mrb.toStringNoroot());
//		
//		return outstr;
//	}

	/**
	 * 普通同步发送
	 * @throws Exception 
	 */
	public static MSGResultBean sendSync(MSGBean mb) throws Exception{
		return sendSync(mb,true,null);
	}
	public static MSGResultBean sendSync(MSGBean mb,boolean needMark) throws Exception{
        MSGResultBean mrb = _sendSync(mb,needMark, null);
        return mrb;
    }
	public static MSGResultBean sendSync(MSGBean mb,boolean needMark,ConnectBean conb) throws Exception{
		MSGResultBean mrb = _sendSync(mb,needMark, conb);
		return mrb;
	}
	public static MSGResultBean sendSync(MSGBean mb,ConnectBean conb) throws Exception{
        return sendSync(mb,true,conb);
    }
	/**
	 * 普通异步发送
	 * @param mb
	 * @return
	 * @throws Exception 
	 */
	public static MSGResultBean sendAsyn(MSGBean mb) throws Exception{
		return sendAsyn(mb,true,null);
	}
	public static MSGResultBean sendAsyn(MSGBean mb,boolean needMark) throws Exception{
        MSGResultBean mrb = _sendAsyn(mb,needMark,null);
        return mrb;
    }
	public static MSGResultBean sendAsyn(MSGBean mb,boolean needMark,ConnectBean conb) throws Exception{
		MSGResultBean mrb = _sendAsyn(mb,needMark,conb);
		return mrb;
	}
	public static MSGResultBean sendAsyn(MSGBean mb,ConnectBean conb) throws Exception{
        return sendAsyn(mb,true,conb);
    }
}