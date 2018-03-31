package com.longj.platform.busi.wdk.uum;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.wdk.WDK;
import org.wdk.WDKConstant;
import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLModule;
import org.wdk.module.wql.core.bean.WQLObject;

import com.longj.platform.busi.wdk.base.BaseActionMethod;
import com.longj.platform.busi.wdk.handler.SessionUser;

import wql.WQLNames;


public class orgselectaction extends BaseActionMethod {
	private static WDKLogger logger = new WDKLogger(orgselectaction.class.getName());
	/**
	 * 组织机构树
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void orgtree(WDKContext context) throws Exception {
		String manage_unit_uuid = context.getString("manage_unit_uuid");	//管理单元标识
		String person_uuid = context.getString("person_uuid");				//操作人员标识
		String role_uuid = context.getString("role_uuid");					//角色标识
		String parent_uuid = context.getString("parent_uuid");				//上级组织标识
		String org_type_scode = context.getString("org_type_scode");		//组织类型
		String org_level_scode = context.getString("org_level_scode");		//组织级别
		String isctrlperm = context.getString("isctrlperm");				//是否控制权限
		String issync = context.getString("issync");						//是否同步
		
		String parentid = context.getString("parentid");
		
		if("0".equals(issync) && !"".equals(parentid)){
			parent_uuid = parentid;
		}
		
		JSONArray jrows = UUM.getOrgList(manage_unit_uuid, person_uuid, role_uuid, parent_uuid, org_type_scode, org_level_scode, isctrlperm, issync, context.getConnectBean());
		
		boolean flag = true;
		for(int i=0;i<jrows.size();i++){
			JSONObject row = jrows.getJSONObject(i);
			//设置返回树的根节点的parent_uuid为-1，以支持前台树的展现
			if ( flag && parentid.equals( (String)row.get("org_uuid") ) ) {
				row.put("parent_uuid", "-1");
				flag = false;
			}
		}
		if("1".equals(issync)){
			jrows = WDK.DataFormat_Tree(jrows, "org_uuid", "org_name", "parent_uuid");
		}else{
			jrows = WDK.DataFormat_Tree_Asyn(jrows, "org_uuid", "org_name", "parent_uuid");
		}
		
		context.setPrintOut(jrows.toString());

	}
	
	
	public void orgpersontree(WDKContext context) throws Exception {
		String manage_unit_uuid = context.getString("manage_unit_uuid");	//管理单元标识
		String person_uuid = context.getString("person_uuid");				//操作人员标识
		String role_uuid = context.getString("role_uuid");					//角色标识
		String parent_uuid = context.getString("parent_uuid");				//上级组织标识
		String isctrlperm = context.getString("isctrlperm");				//是否控制权限
		String issync = context.getString("issync");						//是否同步
		
		String parentid = context.getString("parentid");
		
		if("0".equals(issync) && !"".equals(parentid)){
			parent_uuid = parentid;
		}
		
		JSONArray jrows = UUM.getOrgPersonList(manage_unit_uuid, person_uuid, role_uuid, parent_uuid, isctrlperm, issync, context.getConnectBean());
		
		boolean flag = true;
		//处理图标
		for(int i=0;i<jrows.size();i++){
			JSONObject row = jrows.getJSONObject(i);
			//设置返回树的根节点的parent_uuid为-1，以支持前台树的展现      Change by zhangwf 2015-7-21
			if ( flag && parentid.equals( (String)row.get("node_uuid") ) ) {
				row.put("parent_uuid", "-1");
				flag = false;
			}
			String typeorder = row.getString("typeorder");
			if("2".equals(typeorder)){
				typeorder = "ext-icon-user";
			}else{
				typeorder="";
			}
			row.put("typeorder", typeorder);
		}
		if("1".equals(issync)){
			jrows = WDK.DataFormat_Tree(jrows, "node_uuid", "node_name", "parent_uuid");
		}else{
			jrows = WDK.DataFormat_Tree_Asyn(jrows, "node_uuid", "node_name", "parent_uuid","typeorder","node_code");
		}
		context.setPrintOut(jrows.toString());
	}
	
	public void orgpersontreebysubfunc(WDKContext context) throws Exception {
		String subfunc_code = context.getString("subfunc_code");			//子功能代码
		String issync = context.getString("issync");						//是否同步
		String piid = context.getString("piid");						//流程实例
		String parentid = context.getString("parentid");
		SessionUser su = (SessionUser)_getSessionuser(context);
		String person_uuid = su.getPersonuuid();

		JSONArray jrows = new JSONArray();
		JSONArray jtree = new JSONArray();
		boolean isdefault = false;
		String subfunc_uuid = "";
		String right_level = "";
		
		if(parentid.trim().length()==0){
			//初始化
			if(subfunc_code.trim().length()>0){
				//获取子功能信息
				String mainWoName = "UUM_UA_SUBFUNCTION";
				String filterSQL = " subfunc_code = '" + subfunc_code + "'";
				WQLObject mainWo = _WQL_GetWO(mainWoName);
				ResultBean ret = _WQL_Query(context,mainWo, filterSQL);
				WQLData dataSet = ret.getWQLData(mainWo, 0);
				JSONArray datas = dataSet.getDataJSONArray();
				if(datas.size()==1){
					JSONObject jo=(JSONObject)datas.get(0);
					subfunc_uuid = jo.getString("subfunc_uuid");
					right_level = jo.getString("right_level");
				}
			}
			//判断是否授权
			if(subfunc_uuid.trim().length()>0){
				JSONArray jaRows = WQL.getWO(WQLNames.QUUMUA_0011)
						.addParam("account_uuid",su.getAccountuuid())
						.addParam("subfunc_uuid",subfunc_uuid)
						.process(context.getConnectBean())
						.getResultJSONArray(0);
				if(jaRows.size()>0){
					for(int i=0;i<jaRows.size();i++){
						JSONObject joRow=(JSONObject)jaRows.get(i);
						String org_uuid = joRow.getString("org_uuid");
						System.out.println("===子功能授权的根节点="+org_uuid);
						JSONArray ja = UUM.getOrgPersonList("", person_uuid, "", org_uuid, "", issync, context.getConnectBean());
						convertOrgPersonListRoot(ja,org_uuid);
						for(int j=0;j<ja.size();j++){
							JSONObject jo=(JSONObject)ja.get(j);
							jrows.add(jo);
						}
					}
				}else{
					isdefault = true;
				}
			}
			//未授权则取默认
			if(isdefault
					&&right_level.trim().length()>0){
				if("U143".equals(right_level)){
					//本部门(直属)
					String deptuuidex = su.getDeptuuidex();
					jrows = UUM.getOrgPersonList("", person_uuid, "", deptuuidex, "", issync, context.getConnectBean());
					convertOrgPersonListRoot(jrows,deptuuidex);
				}
			}
		}else{
			//异步加载
			jrows = UUM.getOrgPersonList("", person_uuid, "", parentid, "", issync, context.getConnectBean());
			convertOrgPersonListPerson(jrows);
		}
		//判断已传阅的人员
		ResultBean ret = WQL.getWO("QWDKWFTODO")
				.addParam("flag","1")
				.addParam("piid", piid)
				.addParam("allccstatus","'0','1'")
				.addParam("todotype","3")
				.process(context.getConnectBean());
		if(ret.isSuccess()){
			JSONArray ja = ret.getResultJSONArray(0);
			ArrayList al = new ArrayList();
			for(int i=0;i<jrows.size()&&ja.size()>0;i++){
				JSONObject row = jrows.getJSONObject(i);
				for(int j=0;j<ja.size();j++){
					JSONObject jo = ja.getJSONObject(j);
					if(row.getString("node_uuid").equals(jo.getString("actorid"))
							&&!al.contains(row.getString("node_uuid"))){
						al.add(row.getString("node_uuid"));
						row.put("node_name", row.getString("node_name") + "（已传阅）");
					}
				}
			}
		}
		if("1".equals(issync)){
			//jtree = WDK.DataFormat_Tree(jrows, "node_uuid", "node_name", "parent_uuid");
			jtree = WDK.DataFormat_Tree(jrows, "node_uuid", "node_name", "parent_uuid","typeorder","node_code");
		}else{
			jtree = WDK.DataFormat_Tree_Asyn(jrows, "node_uuid", "node_name", "parent_uuid","typeorder","node_code");
		}
		context.setPrintOut(jtree.toString());
	}
	
	public void getFullOrgName(WDKContext context) throws Exception {
		String err = "";
		JSONObject jrows = new JSONObject();
		try{
			String orguuid = context.getString("orguuid");
			WQLModule wm = WQLModule.getWQLModule("UUM_UU_FULLNAMEORGINFO");
			jrows.put("fullorgname", wm.id2name(orguuid,  context.getConnectBean())) ;
		}catch(Exception ex){
			err = ex.getMessage();
			logger.errorWithNoException(err);
			ex.printStackTrace();
		}
		
		context.setPrintOut(jrows.toString());
	}
	
	private JSONArray convertOrgPersonListRoot(JSONArray jrows,String Topdeptuuid){
		boolean flag = true;
		for(int i=0;i<jrows.size();i++){
			JSONObject row = jrows.getJSONObject(i);
			//设置返回树的根节点的parent_uuid为-1，以支持前台树的展现
			if ( flag && Topdeptuuid.equals( (String)row.get("node_uuid") ) ) {
				row.put("parent_uuid", "-1");
				flag = false;
			}
			//替换人员图标
			String typeorder = row.getString("typeorder");
			if("2".equals(typeorder)){
				typeorder = "ext-icon-user";
			}else{
				typeorder="";
			}
			row.put("typeorder", typeorder);
		}
		return jrows;
	}
	
	private JSONArray convertOrgPersonListPerson(JSONArray jrows){
		//替换人员图标
		for(int i=0;i<jrows.size();i++){
			JSONObject row = jrows.getJSONObject(i);
			String typeorder = row.getString("typeorder");
			if("2".equals(typeorder)){
				typeorder = "ext-icon-user";
			}else{
				typeorder="";
			}
			row.put("typeorder", typeorder);
		}
		return jrows;
	}
	
	/**
	 * 获取归属部门和兼职部门列表
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public void queryDepartAndDepartEX(WDKContext context) throws Exception {
		SessionUser su  = _getSessionuser(context);
		JSONArray jaRows = new JSONArray();
		JSONObject joReturn = new JSONObject();
		String departuuid = su.getDeptuuid(); //当前部门
		
		//获取归属部门
		String belongdeptuuid = su.getBelongdeptuuid();
		JSONObject joBelong = UUM.getOrgByID(belongdeptuuid, context.getConnectBean());
		logger.debug("===获取归属部门："+su.getBelongdeptuuid());
		logger.debug("===获取归属部门明细："+joBelong.toString());
		if(joBelong.size()>0){
			JSONObject joRow = new JSONObject();
			joRow.put("org_uuid", joBelong.getString("org_uuid"));
			joRow.put("org_name", joBelong.getString("org_name"));
			
			String departex = UUM.getDeptuuidexByOrgID(joBelong.getString("org_uuid"), context.getConnectBean());
			JSONObject joDepartex = UUM.getOrgByID(departex, context.getConnectBean());
			joRow.put("departex", joDepartex.getString("org_name"));
			
			joRow.put("isbelong", "归属部门");
			if(joRow.get("org_uuid").equals(departuuid)){
				joRow.put("isuse", "是");
			}
			jaRows.add(joRow);
		}

		//获取兼职部门
		JSONArray jaEX = UUM.getPersonDeptEX(context.getString("person_uuid"), context.getConnectBean());
		logger.debug("===获取兼职部门列表："+jaEX.toString());
		for(int i=0;i<jaEX.size();i++){
			JSONObject joRow = new JSONObject();
			joRow.put("org_uuid", jaEX.getJSONObject(i).getString("org_uuid"));
			joRow.put("org_name", jaEX.getJSONObject(i).getString("org_name"));
			
			String departex = UUM.getDeptuuidexByOrgID(jaEX.getJSONObject(i).getString("org_uuid"), context.getConnectBean());
			JSONObject joDepartex = UUM.getOrgByID(departex, context.getConnectBean());
			joRow.put("departex", joDepartex.getString("org_name"));
			
			joRow.put("isbelong", "兼职部门");
			if(joRow.get("org_uuid").equals(departuuid)){
				joRow.put("isuse", "是");
			}
			jaRows.add(joRow);
		}
		
		joReturn.put("rows", jaRows.toString());
		joReturn.put("total", String.valueOf(jaRows.size()));
		context.setPrintOut(joReturn.toString());
	}
	
	
	public boolean changeLoginDepart(WDKContext context) throws Exception {
		boolean isSuccess = true;
		SessionUser su  = _getSessionuser(context);
		String departuuid = context.getString("org_uuid");
		logger.debug("===获取切换部门："+departuuid);
		JSONObject joDepart = UUM.getOrgByID(departuuid, context.getConnectBean());
		logger.debug("===获取切换部门明细："+joDepart.toString());
		
		String departex = UUM.getDeptuuidexByOrgID(departuuid, context.getConnectBean());
		logger.debug("===获取切换部门的直属部门："+departex);
		JSONObject joDepartex = UUM.getOrgByID(departex, context.getConnectBean());
		logger.debug("===获取切换部门的直属部门明细："+joDepartex);
		
		String orguuid = UUM.getCorpIDByOrgID(departuuid, context.getConnectBean());
		logger.debug("===获取切换部门的所属公司："+orguuid);
		JSONObject joOrg = UUM.getOrgByID(orguuid, context.getConnectBean());
		logger.debug("===获取切换部门的所属公司明细："+joOrg);
		
		//更新session
		su.setDeptuuid(joDepart.getString("org_uuid"));
		su.setDeptname(joDepart.getString("org_name"));
		su.setDeptsimplename(joDepart.getString("simple_name"));
		su.setDeptuuidex(joDepartex.getString("org_uuid"));
		su.setDeptnameex(joDepartex.getString("org_name"));
		su.setDeptsimplenameex(joDepartex.getString("simple_name"));
		su.setOrguuid(joOrg.getString("org_uuid"));
		su.setOrgname(joOrg.getString("org_name"));
		su.setOrgsimplename(joOrg.getString("simple_name"));
		logger.debug("===切换部门："+su.toJSON().toString());
		
		//request.getSession().removeAttribute(WDKConstant.SESSION_USER);
		//request.getSession().setAttribute(WDKConstant.SESSION_USER, su);
		
		return isSuccess;
	}
}