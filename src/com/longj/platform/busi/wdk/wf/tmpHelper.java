package com.longj.platform.busi.wdk.wf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.jbpm.api.cmd.Environment;
import org.wdk.module.wf.engine.core.bean.WFActorBean;
import org.wdk.module.wf.engine.core.bean.WFNodeBean;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;

import com.longj.platform.busi.wdk.wf.base.IWFOperation;
import com.longj.platform.busi.wdk.wf.frame.WFFrame;


public class tmpHelper {
    private HashMap<String, JSONArray> data = new HashMap<String, JSONArray>();

    private List<String> getAllRoleUUIDS(Environment environment, ConnectBean conb, Map<String, String> piids) {
        List<String> roleList = new ArrayList<String>();
        Iterator<String> it = piids.keySet().iterator();
        while (it.hasNext()) {
            WFNodeBean nodeBean = WFFrame.pub_getFirstNode(environment, conb, piids.get(it.next()));
            if (nodeBean != null) {
                ArrayList<WFActorBean> cands = nodeBean.getCands();
                for (WFActorBean bean : cands) {
                    String type = bean.getActorType();
                    if (IWFOperation.PARTICIPANT_TYPE_ROLE.equals(type)) {
                        roleList.add(bean.getActorId());
                    }
                }
            }
        }
        return roleList;
    }

    /**
     * 说明：根绝角色ID，获取人员Map
     * <p>
     * Method getRolePersionMap
     * 
     * @param ids
     * @param conb
     * @return
     */
    public void initRolePersionMap(Map<String, String> piids, Environment environment, ConnectBean conb,String persionuuid) {
        HashMap<String, JSONArray> bbb = new HashMap<String, JSONArray>();
        // 根绝角色ID，获取角色下的人
        List<String> ids = getAllRoleUUIDS(environment, conb, piids);
        String roleuuidstr = StringUtils.join(ids.toArray(), "','");
        ResultBean resultBean = WQL.getWO("QPFWF0001").addParam("role_uuid", "'" + roleuuidstr + "'").addParam("person_uuid", persionuuid).process(conb);
        if (resultBean != null && resultBean.isSuccess()) {
            JSONArray aa = resultBean.getResultJSONArray(0);
            if (aa != null) {
                for (int i = 0; i < aa.size(); i++) {
                    JSONObject o = aa.getJSONObject(i);
                    try {
                        String roleid = o.getString("role_uuid");
                        if (bbb.containsKey(roleid)) {
                            JSONArray old = bbb.get(roleid);
                            old.add(o);
                            bbb.put(roleid, old);
                        } else {
                            JSONArray newv = new JSONArray();
                            newv.add(o);
                            bbb.put(roleid, newv);
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        data = bbb;
    }

    public JSONArray roleids2personList(List<String> ids) {
        JSONArray returnArray = new JSONArray();
        if(ids==null){
            return returnArray;
        }
        for (int i = 0; i < ids.size(); i++) {
            JSONArray curArray = data.get(ids.get(i));
            returnArray.addAll(curArray);
        }
        return returnArray;

    }

}