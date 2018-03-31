package com.longj.platform.busi.wdk.todo.transfer;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.w3c.dom.Node;
import org.wdk.WDK;
import org.wdk.core.base.BaseUnitTodo;
import org.wdk.core.util.uLogger;
import org.wdk.core.util.uXmlParse;
import org.wdk.module.wql.WQL;
import org.wdk.module.ws.HttpClient;

import com.longj.platform.busi.wdk.todo.bean.BaseTodoTransfer;


import wql.WQLNames;


/**
 * 执行甘肃的统一待办同步
 * @author Administrator
 *
 */
public class TODOTransferGansu extends BaseTodoTransfer{
	public static void main(String[] args) {
		String tasktime = "2012-33-22 11:22:33";
		tasktime = tasktime.replaceAll("-","").replaceAll(":", "").replaceAll(" ", "");
		System.out.println(tasktime);
	}
	static uLogger logger = new uLogger(TODOTransferGansu.class.getName());
	@Override
	public String WSTodoAdd(String instr) {
		// TODO Auto-generated method stub
	    String wfAppCode = "tieg";
		try {
			
			String endpoint = WDK.getNodeParam("todo_transfer_param1");
			logger.debug("TODOTransferGansu开始同步:"+endpoint);
			
			Node root = uXmlParse.loadxmlString(instr);
			Node node_route = uXmlParse.findNode(root, "/wdk/route");
			String route = uXmlParse.getNodeOuterXml(node_route, false);
			String appcode = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/appcode"));
			String todoid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/todoid"));
			String todotype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/todotype"));
			String flowname = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/flowname"));
			String flowtype = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/flowtype"));
			String nodename = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/nodename"));
			String prenodename = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/prenodename"));
			String title = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/title"));
			String tasksummary = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/tasksummary"));
			String userid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/userid"));//统一待办接受到的门户的用户ID
			String username = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/username"));
			String preuserid = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/preuserid"));
			String preusername = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/preusername"));
			String tasktime = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/tasktime"));
			tasktime = tasktime.replaceAll("-","").replaceAll(":", "").replaceAll(" ", "");
			
			
			String relativepath = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/relativepath"));
			String expirestime = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/expirestime"));
			String warningtime = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/warningtime"));
			String emergency = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/emergency"));
			String remark = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/remark"));
			String extraparam = uXmlParse.getTextContents(uXmlParse.findNode(root,"/wdk/data/extraparam"));
			
			
			//0、更具userid从UUM_UU_ACCOUNT中查询organ_id
			JSONObject jrow = WQL.getWO(WQLNames.QPFPB_UH0001)
									.addParam("flag", "1")
									.addParam("externalid", userid)
									.process()
									.uniqueResult(0);
			String organId = jrow.has("externalid")?jrow.getString("externalid"):userid;
			
			
			//1、调用loushang的insertDaiBanObjectInfo方法增加待办
			StringBuffer soapData = new StringBuffer();
			soapData.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:sup=\"http://support.service.taskinfo.unifiedtasklist.webservice.workflow.loushang.org\" xmlns:daib=\"http://DaiBanInfo\">");
			soapData.append("   <soapenv:Header/>");
			soapData.append("   <soapenv:Body>");
			soapData.append("      <sup:insertDaiBanObjectInfo>");
			soapData.append("         <sup:daiBanInfo>");
			soapData.append("            <daib:organName>"+username+"</daib:organName>");
			soapData.append("            <daib:wfAppCode>"+wfAppCode+"</daib:wfAppCode>");
			soapData.append("            <daib:appCode>"+wfAppCode+"</daib:appCode>");
			soapData.append("            <daib:userId>"+userid+"</daib:userId>");
			soapData.append("            <daib:procDefName>"+flowname+"</daib:procDefName>");
			soapData.append("            <daib:preActDefNames>"+prenodename+"</daib:preActDefNames>");
			soapData.append("            <daib:id>"+WDK.getUUID()+"</daib:id>");
			soapData.append("            <daib:preOrganNames>"+preusername+"</daib:preOrganNames>");
			soapData.append("            <daib:actDefName>"+nodename+"</daib:actDefName>");
			soapData.append("            <daib:subject>"+title+"</daib:subject>");
			soapData.append("            <daib:relativePath>"+relativepath+"</daib:relativePath>");
			soapData.append("            <daib:createTime>"+tasktime+"</daib:createTime>");
			soapData.append("            <daib:organId>"+organId+"</daib:organId>");
			soapData.append("            <daib:internalId>"+todoid+"</daib:internalId>");
			soapData.append("         </sup:daiBanInfo>");
			soapData.append("      </sup:insertDaiBanObjectInfo>");
			soapData.append("   </soapenv:Body>");
			soapData.append("</soapenv:Envelope>");
			
			logger.debug("【统一待办同步】：insertDaiBanObjectInfo.reqData="+soapData.toString());
			String res = new HttpClient(soapData.toString(),endpoint).send();
			logger.debug("【统一待办同步】：insertDaiBanObjectInfo.respData="+res);

			logger.debug("TODOTransferGansu.同步成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.errorWithNoException("TODOTransferGansu.同步失败");
		}
		
		
		return null;
	}

	@Override
    public String WSTodoClose(String instr) {
        // TODO Auto-generated method stub
        String endpoint = WDK.getNodeParam("todo_transfer_param1");
        String wfAppCode = "tieg";
        String dt = WDK.getDateTime();
        try {
            Node root = uXmlParse.loadxmlString(instr);
            String appcode = uXmlParse.getTextContents(uXmlParse.findNode(root, "/wdk/data/appcode"));
            String todoids = uXmlParse.getTextContents(uXmlParse.findNode(root, "/wdk/data/todoid"));
            String closetype = uXmlParse.getTextContents(uXmlParse.findNode(root, "/wdk/data/closetype"));
            String closedate = uXmlParse.getTextContents(uXmlParse.findNode(root, "/wdk/data/closedate"));

            if (todoids != null) {
                String sqltodoids = "'" + todoids.replaceAll(",", "','") + "'";
                // 根据todoid从历史库查询出该记录
                JSONArray jtodos = WQL.getWO(WQLNames.QPFTODO0002).addParam("flag", "1").addParam("todoids", sqltodoids).process()
                        .getResultJSONArray(0);
                for (int i = 0; i < jtodos.size(); i++) {
                    JSONObject jtodo = jtodos.getJSONObject(i);
                    // 1、调用loushang的deleteDaiBanInfo方法，删除当前待办
                    StringBuffer sb1 = new StringBuffer();
                    sb1.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:sup=\"http://support.service.taskinfo.unifiedtasklist.webservice.workflow.loushang.org\">");
                    sb1.append("   <soapenv:Header/>");
                    sb1.append("  <soapenv:Body>");
                    sb1.append("     <sup:deleteDaiBanInfo>");
                    sb1.append("         <sup:internalId>" + jtodo.getString("todoid") + "</sup:internalId>");
                    sb1.append("         <sup:wfAppCode>"+wfAppCode+"</sup:wfAppCode>");
                    sb1.append("     </sup:deleteDaiBanInfo>");
                    sb1.append("  </soapenv:Body>");
                    sb1.append("</soapenv:Envelope>");

                    logger.debug("【统一待办同步】：deleteDaiBanInfo.reqData=" + sb1.toString());
                    String res = new HttpClient(sb1.toString(), endpoint).send();
                    logger.debug("【统一待办同步】：deleteDaiBanInfo.respData=" + res);

                    // 2、调用loushang的insertYiBanInfo方法，增加已办
                    String closeType = jtodo.has("closetype") ? jtodo.getString("closetype") : "";
                    //有正常办结的才算属于已办
                    if (BaseUnitTodo.COMPLETE.equals(closeType)) {
                        String todotype = jtodo.has("todotype") ? jtodo.getString("todotype") : "";
                        String flowname = jtodo.has("flowname") ? jtodo.getString("flowname") : "";
                        String flowtype = jtodo.has("flowtype") ? jtodo.getString("flowtype") : "";
                        String nodename = jtodo.has("nodename") ? jtodo.getString("nodename") : "";
                        String prenodename = jtodo.has("prenodename") ? jtodo.getString("prenodename") : "";
                        String title = jtodo.has("title") ? jtodo.getString("title") : "";
                        String tasksummary = jtodo.has("tasksummary") ? jtodo.getString("tasksummary") : "";
                        String userid = jtodo.has("userid") ? jtodo.getString("userid") : "";//统一待办接受到的门户的用户ID
                        String username = jtodo.has("username") ? jtodo.getString("username") : "";
                        String preuserid = jtodo.has("preuserid") ? jtodo.getString("preuserid") : "";
                        String preusername = jtodo.has("preusername") ? jtodo.getString("preusername") : "";
                        String tasktime = jtodo.has("tasktime") ? jtodo.getString("tasktime") : "";
                        tasktime = tasktime.replaceAll("-","").replaceAll(":", "").replaceAll(" ", "");
                        String relativepath = jtodo.has("relativepath") ? jtodo.getString("relativepath") : "";
                        String expirestime = jtodo.has("expirestime") ? jtodo.getString("expirestime") : "";
                        String warningtime = jtodo.has("warningtime") ? jtodo.getString("warningtime") : "";
                        String emergency = jtodo.has("emergency") ? jtodo.getString("emergency") : "";
                        String remark = jtodo.has("remark") ? jtodo.getString("remark") : "";
                        String extraparam = jtodo.has("extraparam") ? jtodo.getString("extraparam") : "";

                        
                      //0、更具userid从UUM_UU_ACCOUNT中查询organ_id
            			JSONObject jrow = WQL.getWO(WQLNames.QPFPB_UH0001)
            									.addParam("flag", "1")
            									.addParam("externalid", userid)
            									.process()
            									.uniqueResult(0);
            			String organId = jrow.has("externalid")?jrow.getString("externalid"):userid;
            			
            			dt = dt.replaceAll("-","").replaceAll(":", "").replaceAll(" ", "");
                        StringBuffer sb2 = new StringBuffer();
                        sb2.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:sup=\"http://support.service.taskinfo.unifiedtasklist.webservice.workflow.loushang.org\" xmlns:yib=\"http://YiBanInfo\">");
                        sb2.append("  <soapenv:Header/>");
                        sb2.append("   <soapenv:Body>");
                        sb2.append("     <sup:insertYiBanObjectInfo>");
                        sb2.append("        <sup:yiBanInfo>");
                        sb2.append("           <yib:organName>" + username + "</yib:organName>");
                        sb2.append("           <yib:wfAppCode>"+wfAppCode+"</yib:wfAppCode>");
                        sb2.append("           <yib:appCode>" + wfAppCode + "</yib:appCode>");
                        sb2.append("           <yib:userId>" + userid + "</yib:userId>");
                        sb2.append("           <yib:procDefName>" + flowname + "</yib:procDefName>");
                        sb2.append("           <yib:id></yib:id>");
                        sb2.append("           <yib:endTime>" + dt + "</yib:endTime>");
                        sb2.append("           <yib:activeOrganNames></yib:activeOrganNames>");
                        sb2.append("           <yib:activeActDefNames></yib:activeActDefNames>");
                        sb2.append("           <yib:actDefName>" + nodename + "</yib:actDefName>");
                        sb2.append("           <yib:subject>" + title + "</yib:subject>");
                        sb2.append("           <yib:relativePath>" + relativepath + "</yib:relativePath>");
                        sb2.append("           <yib:createTime>" + tasktime + "</yib:createTime>");
                        sb2.append("           <yib:organId>"+organId+"</yib:organId>");
                        sb2.append("           <yib:internalId>" + jtodo.getString("todoid") + "</yib:internalId>");
                        sb2.append("         </sup:yiBanInfo>");
                        sb2.append("      </sup:insertYiBanObjectInfo>");
                        sb2.append("   </soapenv:Body>");
                        sb2.append("</soapenv:Envelope>");
                        logger.debug("【统一待办同步】：insertYiBanObjectInfo=" + sb2.toString());
                        String res2 = new HttpClient(sb2.toString(), endpoint).send();
                        logger.debug("【统一待办同步】：insertYiBanObjectInfo=" + res2);
                    }
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

}