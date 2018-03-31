package com.longj.platform.busi.wdk.wf;

import java.util.HashMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.jbpm.api.cmd.Environment;
import org.wdk.module.wf.frame.core.bean.bean_submit;
import org.wdk.module.wql.core.bean.ConnectBean;

import com.longj.platform.busi.wdk.handler.SessionUser;
import com.longj.platform.busi.wdk.wf.base.IWFOperation;
import com.longj.platform.busi.wdk.wf.base.TodoBean;
import com.longj.platform.busi.wdk.wf.base.WFOperation;


/**
 * 类名：com.nci.platform.wf.ConstantWFOperation <br/>
 * 描述：模拟数据：常量流程辅助类<br/>
 * 版权：Copyright (c) 2008 杭州新世纪信息技术股份有限公司
 * <p>
 * </p>
 * History:<br>
 * 1、2015-7-1 上午10:07:16 yub
 * 
 * @author yub
 */
public class ConstantWFOperation extends WFOperation implements IWFOperation {

    @Override
    public JSONArray getNodeUsersByNodeName(SessionUser sessionUser,Environment environment, ConnectBean conb, String todoid, String nodename, boolean bfilter,String direction) {
        JSONArray jres = new JSONArray();
        JSONObject jtree = new JSONObject();
        jtree.put("id", "deptId");
        jtree.put("text", "办公室名称");
        jtree.put("iconCls", "");
        jtree.put("state", "open");
        jtree.put("parentId", "-1");
        jtree.put("type", "dept");
        jtree.put("iconCls", "ext-icon-chart_organisation");
        jres.add(jtree);
        for (int i = 0; i < 10; i++) {
            JSONObject _jtree = new JSONObject();
            _jtree.put("id", i);
            _jtree.put("text", i + "--办公室下的人员");
            _jtree.put("iconCls", "");
            _jtree.put("state", "");
            _jtree.put("parentId", "deptId");
            _jtree.put("type", "user");
            _jtree.put("iconCls", "ext-icon-user");
            jres.add(_jtree);
        }

        return jres;
    }
    
    @Override
    public JSONArray getNodeUsersByNodeName(SessionUser sessionUser,Environment environment, ConnectBean conb, String todoid, String nodename, boolean bfilter,String direction,String rolefilterpara) {
        JSONArray jres = new JSONArray();
        JSONObject jtree = new JSONObject();
        jtree.put("id", "deptId");
        jtree.put("text", "办公室名称");
        jtree.put("iconCls", "");
        jtree.put("state", "open");
        jtree.put("parentId", "-1");
        jtree.put("type", "dept");
        jtree.put("iconCls", "ext-icon-chart_organisation");
        jres.add(jtree);
        for (int i = 0; i < 10; i++) {
            JSONObject _jtree = new JSONObject();
            _jtree.put("id", i);
            _jtree.put("text", i + "--办公室下的人员");
            _jtree.put("iconCls", "");
            _jtree.put("state", "");
            _jtree.put("parentId", "deptId");
            _jtree.put("type", "user");
            _jtree.put("iconCls", "ext-icon-user");
            jres.add(_jtree);
        }

        return jres;
    }

    @Override
    public JSONObject getTodoIndo(Environment environment, ConnectBean conb, String todoid) {
        try {
            return getTaskJsonObject(environment, conb, todoid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public JSONArray getUsersByCurrentDept(Environment environment, ConnectBean conb, String orgId,String todoid) {
        JSONArray jres = new JSONArray();
        JSONObject jtree = new JSONObject();
        jtree.put("id", "deptId");
        jtree.put("text", "办公室名称");
        jtree.put("iconCls", "");
        jtree.put("state", "open");
        jtree.put("parentId", "-1");
        jtree.put("type", "dept");
        jtree.put("iconCls", "ext-icon-chart_organisation");
        jres.add(jtree);
        for (int i = 0; i < 10; i++) {
            JSONObject _jtree = new JSONObject();
            _jtree.put("id", i);
            _jtree.put("text", i + "--办公室下的人员");
            _jtree.put("iconCls", "");
            _jtree.put("state", "");
            _jtree.put("parentId", "deptId");
            _jtree.put("type", "user");
            _jtree.put("iconCls", "ext-icon-user");
            jres.add(_jtree);
        }

        return jres;
    }
    
    @Override
    public JSONArray getAllUsersByCurrentDept(Environment environment, ConnectBean conb, String orgId,String todoid) {
        JSONArray jres = new JSONArray();
        JSONObject jtree = new JSONObject();
        jtree.put("id", "deptId");
        jtree.put("text", "办公室名称");
        jtree.put("iconCls", "");
        jtree.put("state", "open");
        jtree.put("parentId", "-1");
        jtree.put("type", "dept");
        jtree.put("iconCls", "ext-icon-chart_organisation");
        jres.add(jtree);
        for (int i = 0; i < 10; i++) {
            JSONObject _jtree = new JSONObject();
            _jtree.put("id", i);
            _jtree.put("text", i + "--办公室下的人员");
            _jtree.put("iconCls", "");
            _jtree.put("state", "");
            _jtree.put("parentId", "deptId");
            _jtree.put("type", "user");
            _jtree.put("iconCls", "ext-icon-user");
            jres.add(_jtree);
        }

        return jres;
    }

    @Override
    public JSONArray getPreActivityList(Environment environment, ConnectBean conb, String pdid, String piid, String nodename) {
        JSONArray returnArray = new JSONArray();
        for (int i = 1; i < 4; i++) {
            JSONObject node = new JSONObject();
            node.put("nodeid", "9" + i);
            node.put("nodename", "上环节" + i);
            if (i == 1) {
                node.put("issign", "true");
                node.put("checked", "checked");
            } else {
                node.put("issign", "false");
            }
            returnArray.add(node);
        }

        return returnArray;
    }

    @Override
    public JSONArray getNotionTemplates(Environment environment, ConnectBean conb, String firstSort, String secondSort,String userid, String app_code) {
        JSONArray jres = new JSONArray();
        for (int i = 0; i < 10; i++) {
            JSONObject jtree = new JSONObject();
            jtree.put("id", i);
            jtree.put("text", i + "--意见模板");
            jtree.put("iconCls", "");
            jtree.put("state", "");
            jtree.put("attributes", "{hidden:true}");
            jres.add(jtree);
        }

        return jres;
    }

    @Override
    public JSONArray getUsersByCurrentDeptNoDept(Environment environment, ConnectBean conb, String orgId, String todoid) {
        JSONArray jres = new JSONArray();
        for (int i = 0; i < 10; i++) {
            JSONObject jtree = new JSONObject();
            jtree.put("id", i);
            jtree.put("text", i + "--姓名");
            jtree.put("iconCls", "");
            jtree.put("state", "");
            jtree.put("attributes", "{hidden:true}");
            jres.add(jtree);
        }

        return jres;
    }

    @Override
    public JSONArray getTodoSelectedUsers(Environment environment, ConnectBean conb, String todoid) {
        JSONArray jres = new JSONArray();
        for (int i = 0; i < 10; i++) {
            JSONObject jtree = new JSONObject();
            jtree.put("id", i);
            jtree.put("text", i + "--选择");
            jtree.put("iconCls", "");
            jtree.put("state", "");
            jtree.put("attributes", "{hidden:true}");
            jres.add(jtree);
        }
        return jres;
    }

    @Override
    public JSONArray getChildrenActivityList(Environment environment, ConnectBean conb, String pdid, String piid, String nodename) {
        JSONArray returnArray = new JSONArray();
        for (int i = 1; i < 3; i++) {
            JSONObject node = new JSONObject();
            node.put("nodeid", "2" + i);
            node.put("nodename", "下环节" + i);
            if (i == 1) {
                node.put("issign", "true");
                node.put("checked", "checked");
            } else {
                node.put("issign", "false");
            }
            node.put("isend", false);
            returnArray.add(node);
        }

        return returnArray;
    }

    @Override
    public JSONArray getAllActivityList(Environment environment, ConnectBean conb, String pdid, String piid, String nodename) {
        JSONArray returnArray = new JSONArray();
        for (int i = 1; i < 8; i++) {
            JSONObject node = new JSONObject();
            node.put("nodeid", "8" + i);
            node.put("nodename", "全部环节" + i);
            if (i == 1) {
                node.put("issign", "true");
                node.put("checked", "checked");
            } else {
                node.put("issign", "false");
            }
            returnArray.add(node);
        }

        return returnArray;
    }

    @Override
    public TodoBean getTodoBean(Environment environment, ConnectBean conb, String todoid) {
        TodoBean bean = new TodoBean(todoid, "nodename", "pdid", "piid");
        return bean;
    }

    @Override
    public boolean todo_submit(Environment environment, ConnectBean conb, HashMap param) {
        // TODO Auto-generated method stub
        return true;
    }
    
	@Override
	public boolean todo_submit(Environment environment, ConnectBean conb, bean_submit submit) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

    @Override
    public JSONArray getWFActorList(Environment environment, ConnectBean conb,SessionUser sessionuser, String pdid, String piid, String nodename) {
        JSONArray returnArray = new JSONArray();
        for (int i = 1; i < 8; i++) {
            JSONObject node = new JSONObject();
            node.put("actorid", "办理人" + i);
            node.put("actortype", "");
            node.put("ispass", "1");
            node.put("comment", "同意");
            node.put("operdt", "2015-7-1");
            node.put("iscomplete", i % 2);
            node.put("isenable", "true");
            returnArray.add(node);
        }

        return returnArray;
    }



}
