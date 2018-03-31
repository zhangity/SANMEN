package com.longj.platform.busi.wdk.uum.avatar;

import java.util.ArrayList;
import java.util.HashMap;

import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ErrorBean;
import org.wdk.module.wql.core.bean.ResultBean;
import org.wdk.module.wql.core.bean.WQLData;
import org.wdk.module.wql.core.bean.WQLObject;

public abstract class BaseAvatar implements AvatarIF {
    public HashMap getAvatarParamMap(ConnectBean conb, String avatarid) throws Exception {
        // 取从虚拟角色参数中取角色标识
        HashMap returnMap  = new HashMap();
        WQLObject bc = WQLObject.getWQLObject("PF_PB_AvatarPara");
        if (bc == null)
            throw new Exception("业务组件【PF_PB_AvatarPara】不存在！");

        ResultBean resultBean = bc.query("avatar_uuid='" + avatarid + "'", null, conb);
        if (resultBean.isSuccess() == false) {
            StringBuffer sf = new StringBuffer();
            ArrayList errlist = resultBean.getInfoError();
            for (int i = 0; i < errlist.size(); i++) {
                ErrorBean errBean = (ErrorBean) errlist.get(i);
                sf.append(errBean.toString());
                sf.append("\n");
            }
            throw new Exception(sf.toString());
        }

        WQLData dataSet = resultBean.getWQLData(bc, 0);
        if (dataSet.getRowCount() > 0) {
            dataSet.first();
            while(dataSet.next()){
                returnMap.put(dataSet.getValue("para_code"), dataSet.getValue("para_value"));
            }
        }
        return returnMap;
    }
}