package com.longj.platform.busi.wdk.handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.core.base.BaseButton;
import org.wdk.core.base.BaseSessionUser;
import org.wdk.core.base.ButtonBean;
import org.wdk.core.bean.WDKLogger;


public class WDKButton extends BaseButton{

	private static WDKLogger logger = new WDKLogger(WDKButton.class.getName());
	
	@Override
	public ArrayList<ButtonBean> queryAllButton(BaseSessionUser su) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<ButtonBean> queryButtonByMenuId(BaseSessionUser su,
			String menuid, HashMap<String, String> param) {
		// TODO Auto-generated method stub
		return null;
	}

//	/**
//	 * 说明：生成工具栏toolbar按钮
//	 * @param su 用户信息
//	 * @param menuid 暂留
//	 * @param param 参数，可能含有ConnectBean，如果有的话，则此方法内不控制事务。
//	 * @return ArrayList<ButtonBean>
//	 */
//	public ArrayList<ButtonBean> queryButtonByMenuId(BaseSessionUser su, String menuid,HashMap param) {
//		ConnectBean conb = null;
//		boolean controlTransation = true;//默认控制事务，如果ConnectBean从param传过来的则不控制事务
//		ArrayList<ButtonBean> retButton=new ArrayList();
//		try{
//			if(param.get("connectbean")!=null){
//				conb = (ConnectBean)param.get("connectbean");
//				controlTransation = false;
//			} else {
//				//数据库连接
//				conb = ConnectBean.getConnectBean();
//				conb.beginTransation();//开启事务
//			}
//			SessionUser session = (SessionUser)su;
//			String userid = session.getAccountuuid();
//			String roleuuid = session.getRoleuuid();
//			String app_uuid = session.getAppuuid();
//			String menucode = (String)param.get("_menucode"); //菜单
//			String btngrp_code = (String)param.get("_btngrpcode"); //按钮组编码
//			String bdlcode = (String)param.get("_bdlcode"); //事项代码
//			String piid = (String)param.get("_piid"); //流程实例
//			String removebutton = (String)param.get("_removebutton"); //业务禁用按钮，多个用逗号分隔
//			
//			
//			String pdid = WFUtils.Flow_GetPdid(null, conb, piid); //流程模板
//			ArrayList<TIEGButtonBean> fouraButton=new ArrayList();
//			ArrayList<TIEGButtonBean> bdlButton=new ArrayList();
//			ArrayList<TIEGButtonBean> allButton=new ArrayList();
//			String[] removeButton=null;
//			String nodename = "";
//			
//			//模拟数据
//			//userid="00000000000000000000000000000000";
//			//app_uuid="97a64c58ac924e539ce71867cc215d21";
//			//menucode="3eaaefe5b3164359819cd4e081ed41c4";
//			//btngrp_code="OA.SC.ReceiveFileTemplete";
//			
//			logger.debug("===传入参数：app_uuid【"+app_uuid+"】userid【"+userid+"】btngrp_code【"+btngrp_code+"】menucode【"+menucode+"】bdlcode="+bdlcode+"】piid【"+piid+"】removebutton【"+removebutton+"】");
//			
//			//4A菜单按钮
//			if(app_uuid.trim().length()>0
//					&&userid.trim().length()>0
//					&&menucode.trim().length()>0
//					&&!menucode.equalsIgnoreCase("undefined")){
//				//获取菜单下全部按钮
//				JSONArray jaAll = WQL.getWO(WQLNames.QPFPB_RL0004)
//					.addParam("flag", "01")
//					.addParam("app_uuid",app_uuid)
//					.addParam("account_uuid",userid)
//					.addParam("func_uuid", menucode)
//					.process(conb)
//					.getResultJSONArray(0);
//				if(jaAll.size()>0){
//					//返回授权按钮
//					JSONArray jaAuthor = WQL.getWO(WQLNames.QPFPB_RL0004)
//						.addParam("flag", "02")
//						.addParam("app_uuid",app_uuid)
//						.addParam("account_uuid",userid)
//						.addParam("func_uuid", menucode)
//						.process(conb)
//						.getResultJSONArray(0);
//					logger.debug("===4A菜单按钮");
//					for(int i=0;i<jaAll.size();i++){
//						JSONObject joAll = jaAll.getJSONObject(i);
//						TIEGButtonBean bb = new TIEGButtonBean();
//						bb.setBtncode(joAll.getString("short_name"));
//						bb.setBtnname(joAll.getString("func_name"));
//						bb.setOrdercode(joAll.getString("display_order"));
//						bb.setBtnicon(joAll.getString("ico_index"));
//						bb.setIsfouracontrol("1");
//						bb.setFourastatus("0");
//						//默认菜单按钮都放在工具栏
//						bb.setIs_in_toolbar("1");
//						for(int j=0;j<jaAuthor.size();j++){
//							JSONObject joAuthor = jaAuthor.getJSONObject(j);
//							if(joAll.getString("short_name").equalsIgnoreCase(joAuthor.getString("short_name"))){
//								bb.setFourastatus("1");
//								break;
//							}
//						}
//						logger.debug("===按钮【"+bb.getBtncode()+"】名称【"+bb.getBtnname()+"】是否授权【"+bb.getFourastatus()+"】");
//						fouraButton.add(bb);
//					}
//				}
//			}
//			//4A按钮组
//			if(app_uuid.trim().length()>0
//					&&userid.trim().length()>0
//					&&btngrp_code.trim().length()>0){
//				//获取全部按钮
//				JSONArray jaAll = WQL.getWO(WQLNames.QPFPB_RL0009)
//						.addParam("flag", "01")
//						.addParam("app_uuid",app_uuid)
//						.addParam("account_uuid",userid)
//						.addParam("role_uuid",roleuuid)
//						.addParam("btngrp_code", btngrp_code)
//						.process(conb)
//						.getResultJSONArray(0);
//				if(jaAll.size()>0){
//					//返回授权按钮
//					JSONArray jaAuthor = WQL.getWO(WQLNames.QPFPB_RL0009)
//						.addParam("flag", "02")
//						.addParam("app_uuid",app_uuid)
//						.addParam("account_uuid",userid)
//						.addParam("role_uuid",roleuuid)
//						.addParam("btngrp_code", btngrp_code)
//						.process(conb)
//						.getResultJSONArray(0);
//					logger.debug("===4A按钮组");
//					for(int i=0;i<jaAll.size();i++){
//						JSONObject joAll = jaAll.getJSONObject(i);
//						TIEGButtonBean bb = new TIEGButtonBean();
//						bb.setBtncode(joAll.getString("button_name"));
//						bb.setBtnname(joAll.getString("display_name"));
//						bb.setOrdercode(joAll.getString("display_order"));
//						bb.setBtnicon(joAll.getString("ico_index"));
//						if(joAll.getString("is_in_toolbar").equals("1")){
//							//4A按钮组中is_in_toolbar=1的按钮表示4A控制
//							bb.setIsfouracontrol("1");
//						}else{
//							bb.setIsfouracontrol("0");
//						}
//						bb.setFourastatus("0");
//						bb.setIs_in_toolbar(joAll.getString("is_in_toolbar"));
//						//判断是否已存在
//						boolean isNotExist=true;
//						for(int j=0;j<fouraButton.size();j++){
//							TIEGButtonBean button = (TIEGButtonBean)fouraButton.get(j);
//							if(button.getBtncode().equalsIgnoreCase(bb.getBtncode())){
//								logger.debug("===出现重复按钮【"+bb.getBtncode()+"】");
//								isNotExist=false;
//								break;
//							}
//						}
//						if(isNotExist){
//							for(int j=0;j<jaAuthor.size();j++){
//								JSONObject joAuthor = jaAuthor.getJSONObject(j);
//								if(joAll.getString("button_name").equalsIgnoreCase(joAuthor.getString("button_name"))){
//									bb.setFourastatus("1");
//									break;
//								}
//							}
//							logger.debug("===按钮【"+bb.getBtncode()+"】名称【"+bb.getBtnname()+"】是否控制【"+bb.getIsfouracontrol()+"】是否授权【"+bb.getFourastatus()+"】是否工具栏【"+bb.getIs_in_toolbar()+"】");
//							fouraButton.add(bb);
//						}
//					}
//				}
//			}
//			//事项
//			if(bdlcode.trim().length()>0){
//				//获取环节下全部按钮
//				List<String> ls=WFUtils.Flow_GetTodoIdList(null, conb, piid, session.getPersonuuid());
//				if(ls.size()>0){
//					//默认取第一个出现的待办
//					String todoid=ls.get(0).toString();
//					bean_todo todo = WFFrame.todo_querySingle(null, conb, todoid);
//					nodename = todo.getNodename();
//				}
//				if(pdid.trim().length()>0
//					&&nodename.trim().length()>0){
//					//返回授权按钮
//					JSONArray jaRows = BDL.queryPageControlConfig(null, conb, bdlcode, pdid, nodename);
//					logger.debug("===事项");
//					for(int i=0;i<jaRows.size();i++){
//						JSONObject joRow = jaRows.getJSONObject(i);
//						String button_id = joRow.getString("id");
//						String button_type = joRow.getString("type");
//						String button_visible = joRow.getString("visible");
//						String button_readonly = joRow.getString("readonly");
//						TIEGButtonBean bb = new TIEGButtonBean();
//						if("button".equalsIgnoreCase(button_type)){
//							bb.setBtncode(button_id);
//							bb.setIsbdlcontrol("1");
//							bb.setBdlstatus("0");
//							if("1".equals(button_visible)
//									&&"0".equals(button_readonly)){
//								bb.setBdlstatus("1");
//							}
//							logger.debug("===按钮【"+bb.getBtncode()+"】是否授权【"+bb.getBdlstatus()+"】");
//							bdlButton.add(bb);
//						}
//					}
//				}
//			}
//			//工具栏
//			if(fouraButton.size()>0){
//				//生成所有工具栏按钮
//				if(removebutton!=null&&removebutton.trim().length()>0){
//					removeButton=removebutton.split(",");
//				}
//				
//				logger.debug("===工具栏");
//				for(int i=0;i<fouraButton.size();i++){
//					TIEGButtonBean bb = (TIEGButtonBean)fouraButton.get(i);
//					bb.setIsbdlcontrol("0");
//					bb.setBdlstatus("0");
//					//if("1".equals(bb.getIs_in_toolbar())){
//						for(int j=0;j<bdlButton.size();j++){
//							TIEGButtonBean button=(TIEGButtonBean)bdlButton.get(j);
//							if(button.getBtncode().equalsIgnoreCase(bb.getBtncode())){
//								bb.setIsbdlcontrol(button.getIsbdlcontrol());
//								bb.setBdlstatus(button.getBdlstatus());
//							}
//						}
//						logger.debug("===按钮【"+bb.getBtncode()+"】名称【"+bb.getBtnname()+"】是否4A控制【"+bb.getIsfouracontrol()+"】是否4A授权【"+bb.getFourastatus()+"】是否事项控制【"+bb.getIsbdlcontrol()+"】是否事项授权【"+bb.getBdlstatus()+"】是否工具栏【"+bb.getIs_in_toolbar()+"】");
//						allButton.add(bb);
//					//}
//				}
//				//生成策略
//				//策略1：如果isfouracontrol=0、isbdlcontrol=0，则输出。不控权限
//				//策略2：如果isfouracontrol=1、fourastatus=1、isbdlcontrol=0，则输出。仅4A控
//				//策略3：如果isfouracontrol=0、isbdlcontrol=1、bdlstatus=1，则输出。仅事项控
//				//策略4：如果isfouracontrol=1、fourastatus=1、isbdlcontrol=1、bdlstatus=1，则输出。4A和事项都控
//				logger.debug("===按钮授权策略");
//				for(int i=0;i<allButton.size();i++){
//					TIEGButtonBean bb=(TIEGButtonBean)allButton.get(i);
//					boolean isremove=false;
//					logger.debug("===按钮：【"+bb.getBtncode()+"】、名称：【"+bb.getBtnname()+"】");
//					for(int j=0;removeButton!=null&&j<removeButton.length;j++){
//						if(removeButton[j].equals(bb.getBtncode())){
//							isremove=true;
//							logger.debug("业务禁用");
//							break;
//						}
//					}
//					if(!isremove
//							&&"0".equals(bb.getIsfouracontrol())
//							&&"0".equals(bb.getIsbdlcontrol())){
//						logger.debug("满足策略1");
//						retButton.add((ButtonBean)bb);
//					}
//					if(!isremove
//							&&"1".equals(bb.getIsfouracontrol())
//							&&"1".equals(bb.getFourastatus())
//							&&"0".equals(bb.getIsbdlcontrol())){
//						logger.debug("满足策略2");
//						retButton.add((ButtonBean)bb);
//					}
//					if(!isremove
//							&&"0".equals(bb.getIsfouracontrol())
//							&&"1".equals(bb.getIsbdlcontrol())
//							&&"1".equals(bb.getBdlstatus())){
//						logger.debug("满足策略3");
//						retButton.add((ButtonBean)bb);
//					}
//					if(!isremove
//							&&"1".equals(bb.getIsfouracontrol())
//							&&"1".equals(bb.getFourastatus())
//							&&"1".equals(bb.getIsbdlcontrol())
//							&&"1".equals(bb.getBdlstatus())){
//						logger.debug("满足策略4");
//						retButton.add((ButtonBean)bb);
//					}
//				}
//			}
//			if(controlTransation){
//				conb.commitTransation();//提交事务
//			}
//		}catch(Exception e){
//			logger.errorWithNoException(e.getMessage());
//			e.printStackTrace();
//			if(controlTransation){
//				if(conb!=null) conb.rollbackTransation();//回滚事务
//			}
//		}
//		return retButton;
//	}


	
}