package com.longj.platform.busi.wdk.wf.base;

import java.util.HashMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.jbpm.api.cmd.Environment;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.core.bean.ConnectBean;

import com.longj.platform.busi.wdk.handler.SessionUser;
import com.longj.platform.busi.wdk.uum.UUM;
import com.longj.platform.busi.wdk.uum.avatar.BaseAvatar;
import com.longj.platform.busi.wdk.wf.WFUtils;


/**
 * 类名：com.nci.platform.wf.base.WFCreatorAvatar <br/>
 * 描述：<br/>
 * 版权：Copyright (c) 2015 杭州新世纪电子科技有限公司
 * <p>
 * </p>
 * History:<br>
 * 1、2015-8-26 下午07:53:45 yub
 * 
 * @author yub
 */
public class WFCreatorAvatar extends BaseAvatar {

    private static WDKLogger logger = new WDKLogger(WFCreatorAvatar.class.getName());

    @Override
    public JSONArray getPersons(Environment environment, SessionUser sessionUser, String piid, String taskid, String avatarid, HashMap paraMap) {
        return getPersons(environment, sessionUser, piid, taskid, avatarid, paraMap, null);
    }

    @Override
    public JSONArray getPersons(Environment environment, SessionUser sessionUser, String piid, String taskid, String avatarid, HashMap paraMap,
            ConnectBean conb) {
        JSONArray ret = new JSONArray();
        try {
            String personuuid = WFUtils.Flow_GetCreator(environment, conb, piid);
            JSONObject row = UUM.getPersonByID(personuuid, conb);
            ret.add(row);
        } catch (Exception e) {
            logger.errorWithNoException(e.getMessage());
            e.printStackTrace();
        }
        return ret;
    }
}