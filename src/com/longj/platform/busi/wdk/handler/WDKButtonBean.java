package com.longj.platform.busi.wdk.handler;

import org.wdk.core.base.ButtonBean;

public class WDKButtonBean extends ButtonBean{
	private String isfouracontrol;	//是否4A控制授权
	private String fourastatus;		//4A授权状态
	private String isbdlcontrol;	//是否事项控制授权
	private String bdlstatus;		//事项授权状态
	private String is_in_toolbar;	//是否放工具条
	
	public String getIsfouracontrol() {
		return isfouracontrol;
	}
	public void setIsfouracontrol(String isfouracontrol) {
		this.isfouracontrol = isfouracontrol;
	}
	public String getFourastatus() {
		return fourastatus;
	}
	public String getIs_in_toolbar() {
		return is_in_toolbar;
	}
	public void setIs_in_toolbar(String is_in_toolbar) {
		this.is_in_toolbar = is_in_toolbar;
	}
	public void setFourastatus(String fourastatus) {
		this.fourastatus = fourastatus;
	}
	public String getIsbdlcontrol() {
		return isbdlcontrol;
	}
	public void setIsbdlcontrol(String isbdlcontrol) {
		this.isbdlcontrol = isbdlcontrol;
	}
	public String getBdlstatus() {
		return bdlstatus;
	}
	public void setBdlstatus(String bdlstatus) {
		this.bdlstatus = bdlstatus;
	}
	
	
	
}