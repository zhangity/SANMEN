package com.longj.platform.pb.msg.adapter;


import java.lang.reflect.Method;

import org.w3c.dom.Node;
import org.wdk.core.util.uXmlParse;

import com.longj.platform.busi.wdk.todo.TODOClient;
import com.longj.platform.pb.msg.bean.MSGBaseAdapter;
import com.longj.platform.pb.msg.bean.MSGBean;
import com.longj.platform.pb.msg.bean.MSGResultBean;

public class AdapterWSTodo extends MSGBaseAdapter {

    @Override
    public MSGResultBean process(MSGBean mb) {
        String msgContent = mb.getMsgcontent();
        // <todo method="">
        // ...
        // ....
        // </todo>
        String outstr = null;
        try {
            Node root = uXmlParse.loadxmlString(msgContent);
            Node todonode = uXmlParse.findNode(root, "/todo");
            if (todonode != null) {
                String method = uXmlParse.findAttributeValue(todonode, "method");
                if (method != null && !"".equals(method.trim())) {
                    Method m = TODOClient.class.getDeclaredMethod(method, String.class);
                    Node wdknode = uXmlParse.findNode(root, "/todo/wdk/data");
                    // TODO Auto-generated method stub
                    outstr = (String) m.invoke(null, "<data>"+uXmlParse.getTextContents(wdknode)+"</data>");
                } else {
                    outstr = "输入的报文数据中不存在/todo[attrubute=method]属性";
                }
            }
        } catch (Exception e) {
            outstr = e.getMessage();
        }
        MSGResultBean mrb = new MSGResultBean(true, MSGResultBean.CODE_Success, MSGResultBean.DESC_Success, outstr);
        return mrb;
    }
}