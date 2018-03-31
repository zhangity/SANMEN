package com.longj.products.ea.standard.bu.service.bean;

import java.util.ArrayList;
import java.util.List;

public class TimeSection {

	private String date;// 所属日期2016-1-1

	private String timesecion;// 9:30，等

	private String ampm;

	private String schedu_id;// 排班表的主键，代表此时间段来自哪个排班记录

	private String has_add = "0";// 是否有加号

	private String has_lock = "0";// 是否有锁号
	
	private int available = 0;
	
	private String operator;//操作医技科室人员的技师名称

	private List<TimePoint> timePoints;

	public TimeSection(String date, String timesecion, String ampm) {
		super();
		this.date = date;
		this.timesecion = timesecion;
		this.ampm = ampm;
	}
	
	public String getOperator() {
		return operator;
	}



	public void setOperator(String operator) {
		this.operator = operator;
	}



	public void addAvailable(){
		this.available++;
	}
	

	public int getAvailable() {
		return available;
	}


	public void setAvailable(int available) {
		this.available = available;
	}



	public String getHas_add() {
		return has_add;
	}

	public void setHas_add(String has_add) {
		this.has_add = has_add;
	}

	public String getHas_lock() {
		return has_lock;
	}

	public void setHas_lock(String has_lock) {
		this.has_lock = has_lock;
	}

	public String getSchedu_id() {
		return schedu_id;
	}

	public void setSchedu_id(String schedu_id) {
		this.schedu_id = schedu_id;
	}

	public String getAmpm() {
		return ampm;
	}

	public void setAmpm(String ampm) {
		this.ampm = ampm;
	}

	public TimeSection() {
		super();
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTimesecion() {
		return timesecion;
	}

	public void setTimesecion(String timesecion) {
		this.timesecion = timesecion;
	}

	public List<TimePoint> getTimePoints() {
		return timePoints;
	}

	public void setTimePoints(List<TimePoint> timePoints) {
		this.timePoints = timePoints;
	}

	public void addTimePoint(TimePoint point) {
		if (timePoints == null) {
			timePoints = new ArrayList<TimePoint>();
		}
		timePoints.add(point);
	}

}
