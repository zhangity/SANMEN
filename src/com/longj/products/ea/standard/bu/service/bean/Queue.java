package com.longj.products.ea.standard.bu.service.bean;

/**
 * 队列bean对象
 * @author YuBin
 *
 */
public class Queue {
	private String patient_id;

	private String patient_name;

	private String appt_id;

	private String status = "0";// 0等待中，1请准备，2检查中

	public String getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public String getAppt_id() {
		return appt_id;
	}

	public void setAppt_id(String appt_id) {
		this.appt_id = appt_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
