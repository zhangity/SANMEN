//package com.nci.platform.wf;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//
//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;
//
//import org.jbpm.api.cmd.Environment;
//import org.wdk.WDK;
//import org.wdk.core.bean.WDKEnvironment;
//import org.wdk.core.bean.WDKLogger;
//import org.wdk.module.wf.engine.core.bean.WFActorBean;
//import org.wdk.module.wf.engine.core.bean.WFBean;
//import org.wdk.module.wf.engine.core.bean.WFNodeBean;
//
//import com.nci.platform.util.StringUtil;
//import com.nci.platform.wf.frame.WFFrame;
//
//import org.wdk.module.wf.frame.core.bean.bean_todo;
//import org.wdk.module.wql.core.bean.ConnectBean;
//
//import com.nci.platform.pb.handler.SessionUser;
//import com.nci.platform.pb.uum.UUM;
//import com.nci.platform.wf.base.IWFOperation;
//
//public class WFActorHelper {
//    private static WDKLogger logger = new WDKLogger(WFActorHelper.class.getName());
//    /**
//     * 说明：获取环节变量值
//     *<p>
//     * Method getBdlNodeVariable
//     * 
//     * @param environment
//     * @param conb
//     * @param bdlcode
//     * @param piid
//     * @param nodename
//     * @param varibaleKey
//     * @return
//     * @throws Exception
//     */
////    public static String getBdlNodeVariable(Environment environment, ConnectBean conb, String bdlcode, String piid, String nodename,
////            String varibaleKey) throws Exception {
////        HashMap<String, HashMap<String, String>> allNodeVariables = BDL.getBdlNodevariables(environment, conb, bdlcode, piid);
////        if (allNodeVariables != null) {
////            HashMap<String, String> thisnodeVariables = allNodeVariables.get(nodename);
////            if (thisnodeVariables != null) {
////                return thisnodeVariables.get(varibaleKey);
////            }
////        }
////        return null;
////    }
//    public static JSONArray getStartActorList(SessionUser sessionUser, Environment environment, ConnectBean conb,String bdlcode, String pdid,
//            boolean bfilter,tmpHelper tmpHelper) throws Exception {
//        JSONArray orgJson = new JSONArray();
//        WFNodeBean nodeBean = WFFrame.pub_getFirstNode(environment, conb, pdid);
//        if (nodeBean != null) {
//            ArrayList<WFActorBean> cands = nodeBean.getCands();
//            String roleFilterScop = getBdlNodeVariable(environment, conb, bdlcode, null, nodeBean.getNodename(),
//                    IWFOperation.FLOW_NODEVARIABLE_FILTERDEPART);
//            String roleFilterPerson = getBdlNodeVariable(environment, conb, bdlcode, null, nodeBean.getNodename(),
//                    IWFOperation.FLOW_NODEVARIABLE_FILTERPERSON);
//            HashMap<String, List<String>> idMap = new HashMap<String, List<String>>();
//            List<String> userList = new ArrayList<String>();
//            List<String> roleList = new ArrayList<String>();
//            List<String> vmroleList = new ArrayList<String>();
//            for(WFActorBean bean :cands){
//                String type = bean.getActorType();
//                if(IWFOperation.PARTICIPANT_TYPE_USER.equals(type)){
//                    userList.add(bean.getActorId());
//                }else  if(IWFOperation.PARTICIPANT_TYPE_ROLE.equals(type)){
//                    roleList.add(bean.getActorId());
//                }else  if(IWFOperation.PARTICIPANT_TYPE_VMROLE.equals(type)){
//                    vmroleList.add(bean.getActorId());
//                }
//            }
//            idMap.put(IWFOperation.PARTICIPANT_TYPE_USER, userList);
//            idMap.put(IWFOperation.PARTICIPANT_TYPE_ROLE, roleList);
//            idMap.put(IWFOperation.PARTICIPANT_TYPE_VMROLE, vmroleList);
//          
//            
//            orgJson= avatar2person(environment, sessionUser, null, null, roleFilterScop, roleFilterPerson, idMap, conb, nodeBean.getNodename(),bdlcode,tmpHelper);
//        }
//        return orgJson;
//    }
//    
//    
//    public static JSONArray getActorList(SessionUser sessionUser, Environment environment, ConnectBean conb, String todoid, String nextnodename, boolean bfilter, String rolefilterpara) throws Exception {
//    	JSONArray orgJson = new JSONArray();
//        if(todoid==null||"".equals(todoid.trim())){
//            return new JSONArray();
//        }
//        bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
//        if (todo != null) {
//            todo = WFFrame.todo_addExtraParam(environment, conb, todo);
//            String pdid = todo.getPdid();
//            String piid = todo.getPiid();
//            if(todo.isParam_issub() ){
//                WFBean wb2 = WFFrame.wb_queryByPiid(environment, conb, todo.getPiid());
//                if(wb2.getNodeBean(nextnodename)==null){
//                    pdid = todo.getParam_ppdid();
//                    piid = todo.getParam_ppiid(); 
//                }
//               
//            }
//        	//取流程环节设置的参与者对象列表
//            ArrayList<WFActorBean> cands = WFFrame.pub_getNodeActors(environment, conb, pdid, piid, nextnodename, bfilter);
//            //将参与者转换成人员对象
//            HashMap<Object, Object> flowVariables = WFUtils.Flow_GetVariable(environment, conb, piid);
//            String bdlcode = (String) flowVariables.get(BDLConstant.BDL_VARIABLE_NAME);
//            if (bdlcode != null && bdlcode.length() > 0) {
//                //从事项中获取人员过滤的控制参数
//            	String roleFilterScop = "";
//            	String roleFilterPerson = "";
//            	if("specialsend".equalsIgnoreCase(rolefilterpara)){
//            		//如果当前操作为特送，则取特送过滤参数
//            		roleFilterScop = getBdlNodeVariable(environment, conb, bdlcode, piid, nextnodename, IWFOperation.FLOW_NODEVARIABLE_FILTERDEPART_SPECIALSEND);
//	                roleFilterPerson = getBdlNodeVariable(environment, conb, bdlcode, piid, nextnodename, IWFOperation.FLOW_NODEVARIABLE_FILTERPERSON_SPECIALSEND);
//	                if("".equals(roleFilterScop) || roleFilterScop==null || "".equals(roleFilterPerson) || roleFilterPerson==null){
//	            		//只要其中一个参数为空，就按照正常的参数过滤
//		            	roleFilterScop = getBdlNodeVariable(environment, conb, bdlcode, piid, nextnodename, IWFOperation.FLOW_NODEVARIABLE_FILTERDEPART);
//		                roleFilterPerson = getBdlNodeVariable(environment, conb, bdlcode, piid, nextnodename, IWFOperation.FLOW_NODEVARIABLE_FILTERPERSON);
//	                }
//            	}else{
//            		//否则取正常的过滤参数
//	            	roleFilterScop = getBdlNodeVariable(environment, conb, bdlcode, piid, nextnodename, IWFOperation.FLOW_NODEVARIABLE_FILTERDEPART);
//	                roleFilterPerson = getBdlNodeVariable(environment, conb, bdlcode, piid, nextnodename, IWFOperation.FLOW_NODEVARIABLE_FILTERPERSON);
//            	}
//                HashMap<String, List<String>> idMap = new HashMap<String, List<String>>();
//                List<String> userList = new ArrayList<String>();
//                List<String> roleList = new ArrayList<String>();
//                List<String> vmroleList = new ArrayList<String>();
//                for(WFActorBean bean :cands){
//                    String type = bean.getActorType();
//                    if(IWFOperation.PARTICIPANT_TYPE_USER.equals(type)){
//                        userList.add(bean.getActorId());
//                    }else  if(IWFOperation.PARTICIPANT_TYPE_ROLE.equals(type)){
//                        roleList.add(bean.getActorId());
//                    }else  if(IWFOperation.PARTICIPANT_TYPE_VMROLE.equals(type)){
//                        vmroleList.add(bean.getActorId());
//                    }
//                }
//                idMap.put(IWFOperation.PARTICIPANT_TYPE_USER, userList);
//                idMap.put(IWFOperation.PARTICIPANT_TYPE_ROLE, roleList);
//                idMap.put(IWFOperation.PARTICIPANT_TYPE_VMROLE, vmroleList);
//                JSONArray uumpersonList = avatar2person(environment, sessionUser, piid, todoid, roleFilterScop, roleFilterPerson, idMap, conb,nextnodename,bdlcode);
//                    //avatar2person(sessionUser, todo.getPiid(), todoid, "1", ids, conb);
//
//                orgJson = uumpersonList;
//            }
//
//        }
//        return orgJson;
//    }
//    
//    public static JSONArray getActorList(SessionUser sessionUser, Environment environment, ConnectBean conb, String todoid, String nextnodename, boolean bfilter) throws Exception {
//        return getActorList(sessionUser,environment,conb,todoid,nextnodename,bfilter,"");
//    }
//    
//    public static JSONArray getTreeNode(SessionUser sessionUser, Environment environment, ConnectBean conb, String todoid, String nextnodename, boolean bfilter, String direction,String rolefilterpara) throws Exception {
//        bean_todo todo = WFFrame.todo_querySingle(environment, conb, todoid);
//        JSONArray personList = null;
//        List<String> ids = new ArrayList<String>();
//        List<String> referids = new ArrayList<String>();
//        WFBean wb = null;		//流程变量
//        WFNodeBean wnb = null;	//流程环节变量
//        String bdlcode = null;	//事项编码
//        if (todo != null) {
//            // 退回操作的特殊处理
//            wb = WFFrame.wb_queryByPiid(environment, conb, todo.getPiid());
//            if (wb != null) {
//                String ppid = wb.getPpiid();
//                if(ppid!=null&&ppid.trim().length()>0){
//                    WFBean wb2 = WFFrame.wb_queryByPiid(environment, conb, ppid);
//                    WFNodeBean wnb2 =  wb2.getNodeBean(nextnodename);
//                    if(wnb2!=null){
//                        wb = wb2;
//                    }
//                }
//                wnb = wb.getNodeBean(nextnodename);
//                if (wnb != null) {
//                    ArrayList<WFActorBean> actorlist = wnb.getActors();
//                    if (actorlist != null && actorlist.size() > 0) {
//                        for (int i = 0; i < actorlist.size(); i++) {
//                            ids.add(actorlist.get(i).getActorId());
//                        }
//                    }
//                }
//                // 从事项中获取当前节点的参考节点，如果参考节点有发生过实际的参与者，那么获取实际发生人员
//                bdlcode = BDL.getBdlCode(wb);
//                if (bdlcode != null && bdlcode.trim().length() > 0) {
//                    HashMap<String, HashMap<String, String>> allnodevariables = BDL.getBdlNodevariables(environment, conb, bdlcode, wb.getPiid());
//                    if (allnodevariables != null && allnodevariables.containsKey(nextnodename)) {
//                        HashMap<String, String> nextnodevariables = allnodevariables.get(nextnodename);
//                        if (nextnodevariables != null && nextnodevariables.containsKey(IWFOperation.BDL_NODE_VARIABLE_REFERNODE)) {
//                            String refernodename = nextnodevariables.get(IWFOperation.BDL_NODE_VARIABLE_REFERNODE);
//                            if (refernodename != null && refernodename.trim().length() > 0) {
//                                WFNodeBean referwnb = wb.getNodeBean(refernodename);
//                                if (referwnb != null) {
//                                    ArrayList<WFActorBean> _actorlist = referwnb.getActors();
//                                    if (_actorlist != null && _actorlist.size() > 0) {
//                                        for (int i = 0; i < _actorlist.size(); i++) {
//                                            referids.add(_actorlist.get(i).getActorId());
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        if (personList == null || personList.size() == 0) {
//            if ("0".equals(direction)) {
//                // 如果是退回，那么，只取出历史办理人即可
//                personList = UUM.personids2personList(ids, conb);
//            } else {
//            	//如果不是退回，并且该环节之前没有处理过，则从事项中获取当前环节的默认处理人设置
//            	if(ids !=null && ids.size()==0){
//            		if (wb != null && wnb != null) {
//            			if (!wnb.isSubprocess()) {
//            				if (bdlcode != null && !"".equals(bdlcode)) {
//            					HashMap<String, HashMap<String, String>> variables = BDL.getBdlNodevariables(environment, conb, bdlcode, wb.getPiid());
//            					if (variables != null && variables.containsKey(nextnodename)) {
//            						HashMap<String, String> nodev = variables.get(nextnodename);
//            						if (nodev != null && nodev.containsKey(IWFOperation.BDL_NODE_VARIABLE_DEFAULTACTOR)) {
//            							String defaultActor = nodev.get(IWFOperation.BDL_NODE_VARIABLE_DEFAULTACTOR);
//            							String[] actors = defaultActor.split(",");
//            							for(int i=0;i<actors.length;i++){
//            								if(!"".equals(actors[i])){
//            									ids.add(actors[i]);
//            								}
//            							}
//            						}
//            					}
//            				}
//            			}
//            		}
//            	}
//            	
//                if (referids != null && referids.size() > 0) {
//                    personList = UUM.personids2personList(referids, conb);
//                } else {
//                    personList = getActorList(sessionUser, environment, conb, todoid, nextnodename, bfilter, rolefilterpara);
//                }
//            }
//        }
//        JSONArray orgJson = convertJSONArray(sessionUser,conb, personList, ids);//环节之前谁处理过就默认选择该处理人
//        return orgJson;
//    }
//
//    public static JSONArray getTreeNode(SessionUser sessionUser, Environment environment, ConnectBean conb, String todoid, String nextnodename, boolean bfilter, String direction) throws Exception {
//       return getTreeNode(sessionUser,environment,conb,todoid,nextnodename,bfilter,direction,"");
//    }
//    
//    public static JSONArray convertJSONArray(SessionUser sessionUser,ConnectBean conb, JSONArray uumpersonList,List<String> selectedids) {
//    	WDKEnvironment wdkEnv = WDKEnvironment.getCurrentWDKEnvironment();
//        // UUM_UU_PERSONINFO表的数据
//        JSONArray orgJson = new JSONArray();
//
//        HashMap orgMap = new HashMap();
//        HashMap<String,JSONObject> deptMap  = new HashMap<String, JSONObject>();//部门map：key-部门ID，value-部门对象
//        HashMap<String,String> deptordMap = new HashMap<String, String>();//部门排序map：key-部门ID，value-部门排序字段
//        HashSet<String> uuidSet  = new HashSet<String>();
//        if (uumpersonList != null) {
//            String enable =  WDK.getNodeParam("im_workflow_enable");
//            Map<String,IMBaseObject> imMap = new HashMap<String, IMBaseObject>();
//            if (enable != null && "1".equals(enable) && wdkEnv.getEnvType() == WDKEnvironment.WDKENV_TYPE_SERVLET) {
//            	//只有当node.xml参数im_workflow_enable=1并且当前的WDK环境为servlet环境时才启用IM在线感知，webservices环境下不启用在线感知（移动端目前是在webservices环境下，不需要IM在线感知）
//                IMService service;
//                try {
//                    Object imObject = Class.forName(WDK.getNodeParam("im_workflow_adapter")).newInstance();
//                    if (imObject != null && imObject instanceof IMService) {
//                        ArrayList<String> personIdList = new ArrayList<String>();
//                        for (int n = 0; n < uumpersonList.size(); n++) {
//                            JSONObject person = uumpersonList.getJSONObject(n);
//                            String userId = person.getString("person_uuid");
//                            if(!personIdList.contains(userId)){
//                                personIdList.add(userId);
//                            }
//                        }
//                        service = (IMService) imObject;
//                        imMap = service.getIMBaseObjectMap(conb, sessionUser.getLoginname(), personIdList.toArray(new String[personIdList.size()]));
//                    }
//                } catch (InstantiationException e) {
//                    e.printStackTrace();
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                } catch (ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
//            }
//            
//            //对人员按人员顺序排序
//            Collections.sort(uumpersonList, new Comparator<JSONObject>(){
//				@Override
//				public int compare(JSONObject o1, JSONObject o2) {
//					try{
//						int f1 = Integer.parseInt(o1.containsKey("display_order")?o1.getString("display_order"):"99999");//人员排序号
//						int f2 = Integer.parseInt(o2.containsKey("display_order")?o2.getString("display_order"):"99999");//人员排序号
//						
//						return f1 - f2;
//					}catch (Exception e) {
//						return 0;
//					}
//				}
//            });
//            
//            
//            for (int m = 0; m < uumpersonList.size(); m++) {
//                JSONObject person = uumpersonList.getJSONObject(m);
//                String userId = person.getString("person_uuid");
//                String belongDeptId = person.getString("depart_uuid");
//                if (!orgMap.containsKey(belongDeptId)) {
//                    String belongDeptName = "";
//                    String code  = String.valueOf(m);
//                    String parent_uuid = "";
//                    String org_display_order = "99999";
////                    if (person.containsKey("org_name") && person.containsKey("org_code")&& person.containsKey("parent_uuid")) {
////                        belongDeptName = person.getString("org_name");
////                        code = person.getString("org_code");
////                        parent_uuid =  person.getString("parent_uuid");
////                    } else {
//                        // belongDeptName = wm.id2name(belongDeptId, "org_name", conb);// getDeptNameByUserId(conb,userId);
//                        JSONObject orgobject = UUM.getOrgByID(belongDeptId, conb);
//                        belongDeptName = orgobject.getString("org_name");
//                        code = orgobject.getString("org_code");
//                        parent_uuid =  orgobject.getString("parent_uuid");
//                        org_display_order = orgobject.getString("display_order");
////                    }
//                    orgMap.put(belongDeptId, belongDeptName);
//                    JSONObject jtree = new JSONObject();
//                    jtree.put("id", belongDeptId);
//                    jtree.put("text", belongDeptName);
//                    jtree.put("locateid", "");
//                    jtree.put("state", "open");
//                    jtree.put("parentId", "-1");
//                    jtree.put("_parentId", parent_uuid);
//                    jtree.put("deptuuid", belongDeptId);
//                    jtree.put("type", "dept");
//                    if (selectedids != null && selectedids.size() > 0) {
//                    	StringBuffer locateidsb = new StringBuffer();
//                    	for(int k=0;k<selectedids.size();k++){
//                    		if(locateidsb.length()>0)
//                    			locateidsb.append(",");
//                    		locateidsb.append(selectedids.get(k));
//                    	}
//                        jtree.put("locateid", locateidsb.toString());
//                    }
//                    jtree.put("iconCls", "ext-icon-chart_organisation");
//                    deptMap.put(belongDeptId, jtree);
//                    deptordMap.put(belongDeptId, org_display_order);
//                    uuidSet.add(belongDeptId);
//                    //orgJson.add(jtree);
//                }
//                JSONObject user = new JSONObject();
//                user.put("id", userId);
//                user.put("iconCls", "ext-icon-user");
//                user.put("locateid", "");
//                if(selectedids.contains(userId)){
//                    user.put("iconCls", "ext-icon-user_go");
//                }
//                user.put("text", person.getString("person_name"));
//                user.put("state", "");
//                user.put("parentId", belongDeptId);
//                user.put("deptuuid", belongDeptId);
//                user.put("type", "user");
//                if(imMap.containsKey(userId)){
//                    IMBaseObject imObjec  = imMap.get(userId);
//                    user.put("iconCls", imObjec.getIconClass());
//                    user.put("ext_title", imObjec.getName());
//                    user.put("ext_url", imObjec.getUrl());
//                }else{
//                    user.put("ext_title","");
//                    user.put("ext_url", "");
//                }
//                orgJson.add(user);
//            }
//            //对部门数据进行排序
//            List<Map.Entry<String, String>> list_Data = new ArrayList<Map.Entry<String, String>>(deptordMap.entrySet());  
//            Collections.sort(list_Data, new Comparator<Map.Entry<String, String>>(){
//            	@Override
//            	public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
//					try{
//						int f1 = Integer.parseInt(o1.getValue());//部门排序号
//						int f2 = Integer.parseInt(o2.getValue());//部门排序号
//						
//						return f1 - f2;
//					}catch (Exception e) {
//						return 0;
//					}
//            	}
//            });
//            for (int i = 0; i < list_Data.size(); i++) {
//                JSONObject deptnode = deptMap.get(list_Data.get(i).getKey());
//                String parentid = deptnode.getString("_parentId");
//                if(uuidSet.contains(parentid)){
//                    deptnode.put("parentId", parentid);
//                }
//                orgJson.add(deptnode);
//            } 
//        }
//        return orgJson;
//    }
//    
//    public static JSONArray avatar2person(Environment environment, SessionUser sessionUser, String piid, String taskid, String filterdepart,
//            String filterperson, HashMap<String, List<String>> idMap, ConnectBean conb,String nextnodename,String bdlcode) {
//       return avatar2person(environment, sessionUser, piid, taskid, filterdepart, filterperson, idMap, conb, nextnodename,bdlcode, null);
//    }
//    
//  public static JSONArray avatar2person(Environment environment, SessionUser sessionUser, String piid, String taskid, String filterdepart,
//            String filterperson, HashMap<String, List<String>> idMap, ConnectBean conb,String nextnodename,String bdlcode,tmpHelper tmpHelper) {
//        JSONArray ret = new JSONArray();
//        Set<String> personSet = new HashSet<String>();
//        Set<String> personDeptSet = new HashSet<String>();
//        Map<String,JSONArray> groupPersionList  =new HashMap<String,JSONArray>();
//        try {
//
//            // 遍历idMap
//            Iterator<Entry<String, List<String>>> it = idMap.entrySet().iterator();
//            JSONArray alluserrows = new JSONArray();//解析人员、角色和虚拟角色等，将人的信息都汇总到这里，然后排除重复的数据
//            while (it.hasNext()) {
//                Entry<String, List<String>> entry = it.next();
//                String type = entry.getKey();
//                List<String> ids = entry.getValue();
//                JSONArray rows = null;
//                if (IWFOperation.PARTICIPANT_TYPE_USER.equals(type)) {
//                    // 人员
//                    if (ids != null && ids.size() > 0) {
//                        rows = UUM.personids2personList(ids, conb);
//                    } else {
//                        rows = new JSONArray();
//                    }
//                } else if (IWFOperation.PARTICIPANT_TYPE_ROLE.equals(type)) {
//                    // 角色
//                    if (tmpHelper != null) {
//                        rows = tmpHelper.roleids2personList(ids);
//                    } else {
//                        if(ids!=null&&ids.size()>0){
//                            rows = UUM.roleids2personList(ids, conb);
//                        }else{
//                            rows = new JSONArray();
//                        }
//                    }
//                } else if (IWFOperation.PARTICIPANT_TYPE_VMROLE.equals(type)) {
//                    // 虚拟角色
//                    rows = UUM.avatarids2personList(environment, sessionUser, piid, taskid, ids, conb, nextnodename,bdlcode);
//                } else {
//                    logger.errorWithNoException("未知的ID类型：" + type);
//                }
//                if(rows!=null && rows.size()>0){
//                	alluserrows.addAll(rows);
//                }
//            }
//            
//            //获取兼职部门数据，add by yangll on 2016-05-31 
//            List personIds = new ArrayList<String>();
//            for(int i=0;alluserrows!=null && i<alluserrows.size();i++){
//            	if(!personIds.contains(alluserrows.getJSONObject(i).getString("person_uuid"))){
//            		personIds.add(alluserrows.getJSONObject(i).getString("person_uuid"));
//            	}
//            }
//            alluserrows = UUM.getPersonInfoHaveDeptexByPersonIDs(personIds, conb);
//            if (alluserrows != null) {
//                for (int j = 0; j < alluserrows.size(); j++) {
//                    JSONObject row = alluserrows.getJSONObject(j);
//                    String person_uuid = row.getString("person_uuid");// 部门标识.人员标识作为唯一表示，因为人员可能兼职多个部门
//                    if( row.containsKey("depart_uuid") ){
//                        person_uuid = row.getString("depart_uuid") + "." +row.getString("person_uuid");
//                    }
//                    if (!personSet.contains(person_uuid)) {
//                        personSet.add(person_uuid);
//                        ret.add(row);
//                    }
//                    if (row.containsKey("depart_uuid")) {
//                        String depart_uuid = row.getString("depart_uuid");// 人员部门标识
//                        if (!personDeptSet.contains(depart_uuid)) {
//                            personDeptSet.add(depart_uuid);
//                            JSONArray _rows = new JSONArray();
//                            _rows.add(row);
//                            groupPersionList.put(depart_uuid, _rows);
//                        } else {
//                            JSONArray _rows = groupPersionList.get(depart_uuid);
//                            _rows.add(row);
//                            groupPersionList.put(depart_uuid, _rows);
//                        }
//                    }
//                }
//            }
//            
//
//            // 按filterperson、filterdepart过滤人员
//            // @UPD daur.zheng 虚拟角色和本机构本部门过滤环节参数逻辑修改
//	        // 默认优先支持虚拟角色，如果虚拟角色和本部门都设置，也是显示虚拟角色
//	        if(StringUtil.isNotBlank(filterperson)){
//	        	String personuuid = ""; // 人员标识
//	            if ("G091".equals(filterperson) && piid != null && !"".equals(piid)) {
//	            	//虚拟角色 流程发起者
//	            	//默认情况，清除所有工作流中配置的用户
//	            	ret.clear();
//	                //获取流程发起者
//	                personuuid = WFUtils.Flow_GetCreator(environment, conb, piid);
//	                JSONObject row = UUM.getPersonByID(personuuid, conb);
//	                if (row != null) {
//	                	ret.add(row);
//	                }
//	            } else if ("G092".equals(filterperson)) {
//	            	//虚拟角色  登录人
//	            	//默认情况，清除所有工作流中配置的用户
//	            	ret.clear();
//	                //获取当前登录用户
//	                personuuid = sessionUser.getPersonuuid();
//	                JSONObject row = UUM.getPersonByID(personuuid, conb);
//	                if (row != null) {
//	                	ret.add(row);
//	                }
//	            }
//	        }else{  //没有设置虚拟角色
//	        	if(StringUtil.isNotBlank(filterdepart)){  //如果设置本部门，需要按照本部门过滤
//	                if ("G081".equals(filterdepart)) {
//	                	//本机构
//	                	String orgUUID = sessionUser.getOrguuid();
//	                    // 本单位
//	                    for (int i = ret.size() - 1; i >= 0; i--) {
//	                        JSONObject row = ret.getJSONObject(i);
//	                        if (!orgUUID.equals(row.getString("org_uuid"))) {
//	                            ret.remove(row);
//	                        }
//	                    }
//	                } else if ("G082".equals(filterdepart)) {
//	                	String deptuuidex = sessionUser.getDeptuuidex();
//	                    // 直属部门
//	                    ret.clear();
//	                    List<String> ids = new ArrayList<String>();
//	                    ids.addAll(personDeptSet);
//	                    if (ids != null && ids.size() > 0) {
//	                        JSONArray deptuuidexArray = UUM.getDeptuuidexByOrgIDs(ids, conb);
//	                        if (deptuuidexArray != null) {
//	                            for (int i = 0; i < deptuuidexArray.size(); i++) {
//	                                JSONObject deptuidexObj = deptuuidexArray.getJSONObject(i);
//	                                String belong_deptuuid = deptuidexObj.getString("deptuuidex");
//	                                if (deptuuidex.equals(belong_deptuuid)) {
//	                                    ret.addAll(groupPersionList.get(deptuidexObj.getString("org_uuid")));
//	                                }
//	                            }
//	                        }
//	                    }
//	                } else if ("G083".equals(filterdepart)) {
//	                	String deptuuid = sessionUser.getDeptuuid();
//	                    // 隶属部门
//	                    for (int i = ret.size() - 1; i >= 0; i--) {
//	                        JSONObject row = ret.getJSONObject(i);
//	                        if (!deptuuid.equals(row.getString("depart_uuid"))) {
//	                            ret.remove(row);
//	                        }
//	                    }
//	                }
//	        	}
//	        }
//        } catch (Exception e) {
//            logger.errorWithNoException(e.getMessage());
//            e.printStackTrace();
//        }
//        return ret;
//    }
//
//}
