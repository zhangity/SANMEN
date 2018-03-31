package com.longj.products.ea.standard.bi.bean;

public class EAPatient {

	private String patient_id;
	private String patient_name;
	private String patient_type;
	private String sex;//1 男/2 女/9 其他
	private String sexname;//
	private String age;
	private String agename;
	private String blhm;
	private String sfyb;
	private String sfzh;
	private String csny;
	
	private String bed_no;//床位号，住院的时候有值
	
	private String exam_zd;//临床诊断 
	private String exam_zs;//主诉
	private String exam_bs;//现病史 
	private String exam_ct;//体检

	public EAPatient(String patient_id, boolean test) {
		super();
		this.patient_id = patient_id;
		if (test) {
			// 以下是测试数据
			this.patient_name = "";
			this.sex = "";
			this.sexname = "";
			this.age = "";
			this.agename = "";
			this.patient_id = "";
		}
	}
	
	public String getCsny() {
		return csny;
	}

	public void setCsny(String csny) {
		this.csny = csny;
	}
	public String getExam_zd() {
		return exam_zd;
	}
	public void setExam_zd(String exam_zd) {
		this.exam_zd = exam_zd;
	}

	public String getExam_zs() {
		return exam_zs;
	}

	public void setExam_zs(String exam_zs) {
		this.exam_zs = exam_zs;
	}

	public String getExam_bs() {
		return exam_bs;
	}
	public void setExam_bs(String exam_bs) {
		this.exam_bs = exam_bs;
	}

	public String getExam_ct() {
		return exam_ct;
	}
	public void setExam_ct(String exam_ct) {
		this.exam_ct = exam_ct;
	}
	public String getAgename() {
		return agename;
	}
	public void setAgename(String agename) {
		this.agename = agename;
	}
	public String getBlhm() {
		return blhm;
	}

	public void setBlhm(String blhm) {
		this.blhm = blhm;
	}

	public String getSfyb() {
		return sfyb;
	}
	public void setSfyb(String sfyb) {
		this.sfyb = sfyb;
	}
	public String getSfzh() {
		return sfzh;
	}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}

	public String getSexname() {
		return sexname;
	}
	public void setSexname(String sexname) {
		this.sexname = sexname;
	}
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

	public String getBed_no() {
		return bed_no;
	}
	public void setBed_no(String bed_no) {
		this.bed_no = bed_no;
	}
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
		if("1".equals(sex)){
			this.sexname = "男";
		}else if("2".equals(sex)){
			this.sexname = "女";
		}else{
			this.sexname = "其他";
		}
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
		//this.agename = age+"岁";
	}

	public String getPatient_type() {
		return patient_type;
	}

	public void setPatient_type(String patient_type) {
		this.patient_type = patient_type;
	}

}
