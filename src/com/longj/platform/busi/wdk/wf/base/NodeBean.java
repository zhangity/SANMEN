package com.longj.platform.busi.wdk.wf.base;

import java.io.Serializable;

/**
 * 类名：com.nci.platform.wf.base.NodeBean <br/>
 * 描述：<br/>
 * 版权：Copyright (c) 2015 杭州新世纪电子科技有限公司
 * <p>
 * </p>
 * History:<br>
 * 1、2015-7-2 下午10:20:47 yub
 * 
 * @author yub
 */
public class NodeBean implements Serializable, Cloneable {

    /**
     * Field serialVersionUID（long）
     */
    private static final long serialVersionUID = 173783245738473594L;

    private String nodename;

    private String nodetitle;

    private String nodetype;

    private String nodepage;

    private String pdid;

    private String pdname;
    
    private String pdtitle;

    public NodeBean(String nodename, String nodetitle, String nodetype, String nodepage, String pdid, String pdname, String pdtitle) {
        super();
        this.nodename = nodename;
        this.nodetitle = nodetitle;
        this.nodetype = nodetype;
        this.nodepage = nodepage;
        this.pdid = pdid;
        this.pdname = pdname;
        this.pdtitle = pdtitle;
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename;
    }

    public String getNodetype() {
        return nodetype;
    }

    public void setNodetype(String nodetype) {
        this.nodetype = nodetype;
    }

    public String getNodepage() {
        return nodepage;
    }

    public void setNodepage(String nodepage) {
        this.nodepage = nodepage;
    }

    public String getPdid() {
        return pdid;
    }

    public void setPdid(String pdid) {
        this.pdid = pdid;
    }

    public String getPdname() {
        return pdname;
    }

    public void setPdname(String pdname) {
        this.pdname = pdname;
    }

    public String getNodetitle() {
        return nodetitle;
    }

    public void setNodetitle(String nodetitle) {
        this.nodetitle = nodetitle;
    }

    public String getPdtitle() {
        return pdtitle;
    }

    public void setPdtitle(String pdtitle) {
        this.pdtitle = pdtitle;
    }

}