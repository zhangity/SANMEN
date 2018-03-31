package com.longj.products.ea.standard.bu.service.bean;

import com.longj.products.ea.standard.bu.BUConstant;

public class TimePoint {

	private String number_id;// 号码ID，定义体没有这个ID，实例化后就有这个ID

	private String date;// 所属日期2016-1-1

	private String timepoint;// 9:10，等

	private String numbertype = BUConstant.NUMBER_TYPE_NORMAL;// 号码类型：1-普通号，2-加号
	
	private String locktype = BUConstant.LOCKTYPE_NONE;
	
	private String locksource;

	private String unlockdeptid;
	
	private String used;//是否已经被使用，1被使用；0未使用
	
	
	public String getLocksource() {
		return locksource;
	}

	public void setLocksource(String locksource) {
		this.locksource = locksource;
	}

	public String getUsed() {
		return used;
	}

	public void setUsed(String used) {
		this.used = used;
	}

	public String getUnlockdeptid() {
		return unlockdeptid;
	}

	public void setUnlockdeptid(String unlockdeptid) {
		this.unlockdeptid = unlockdeptid;
	}

	public String getLocktype() {
		return locktype;
	}

	public void setLocktype(String locktype) {
		this.locktype = locktype;
	}

	public String getNumber_id() {
		return number_id;
	}

	public void setNumber_id(String number_id) {
		this.number_id = number_id;
	}

	public String getNumbertype() {
		return numbertype;
	}

	public void setNumbertype(String numbertype) {
		this.numbertype = numbertype;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTimepoint() {
		return timepoint;
	}

	public void setTimepoint(String timepoint) {
		this.timepoint = timepoint;
	}

	public TimePoint() {
		super();
		// TODO Auto-generated constructor stub
		this.numbertype = BUConstant.NUMBER_TYPE_NORMAL;// 默认是普通号码
	}

	public TimePoint(String date, String timepoint) {
		super();
		this.date = date;
		this.timepoint = timepoint;
		this.numbertype = BUConstant.NUMBER_TYPE_NORMAL;// 默认是普通号码
	}

}
