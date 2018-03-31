package com.longj.platform.busi.wdk.wf.base;


 /**
 * 类名：com.nci.platform.wf.base.TodoBean <br/>
 * 描述：<br/>
 * 版权：Copyright (c) 2015 杭州新世纪电子科技有限公司
 * <p>
 * </p>
 * History:<br>
 * 1、2015-7-1 下午10:21:17 yub
 *
 * @author yub
 */
public class TodoBean {

    private String todoid;

    private String nodename;

    private String pdid;

    private String piid;
    
    private String taskid;
    
    private String subtaskid;

    public String getTodoid() {
        return todoid;
    }

    public void setTodoid(String todoid) {
        this.todoid = todoid;
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename;
    }

    public String getPdid() {
        return pdid;
    }

    public void setPdid(String pdid) {
        this.pdid = pdid;
    }

    public String getPiid() {
        return piid;
    }

    public void setPiid(String piid) {
        this.piid = piid;
    }

    
    
    public String getTaskid() {
		return taskid;
	}

	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}

	public String getSubtaskid() {
		return subtaskid;
	}

	public void setSubtaskid(String subtaskid) {
		this.subtaskid = subtaskid;
	}

	public TodoBean(String todoid, String nodename, String pdid, String piid) {
        super();
        this.todoid = todoid;
        this.nodename = nodename;
        this.pdid = pdid;
        this.piid = piid;
        this.taskid = "";
        this.subtaskid = "";
    }

}
