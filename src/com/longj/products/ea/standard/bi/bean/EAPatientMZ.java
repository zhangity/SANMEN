package com.longj.products.ea.standard.bi.bean;

public class EAPatientMZ {
//	序号	列名	数据类型	长度	小数位	标识	主键	外键	允许空	默认值	说明
	private String PATIENT_ID;			//	varchar	50	0		是		否		病人唯一识别号
	private String PATIENT_NAME;			//	varchar	50	0				是		病人姓名
	private String NAME_PHONETIC;			//	varchar	50	0				是		姓名拼音
	private String SEX;			//	varchar	50	0				是		性别代码
	private String DATE_OF_BIRTH;			//	date	3	0				是		出生年月
	private String BIRTH_PLACE;			//	varchar	150	0				是		出生地
	private String CITIZENSHIP;			//	varchar	50	0				是		国籍
	private String NATION;			//	varchar	50	0				是		民族
	private String BLOOD_GROUPS;			//	varchar	50	0				是		血型
	private String ID_TYPE;			//	varchar	50	0				是		证件类型
	private String ID_NO;			//	varchar	50	0		是		是		证件号码
	private String DEGREE;			//	varchar	50	0				是		文化程度
	private String OCCUPATION;			//	varchar	50	0				是		职业
	private String MARITAL;			//	varchar	50	0				是		婚姻状况
	private String MAILING_ADDRESS;			//	varchar	500	0				是		居住地址
	private String ZIP_CODE;			//	varchar	50	0				是		邮政编码
	private String CELLPHONE;			//	varchar	50	0				是		手机号码
	private String CREATE_DATE;			//	date	3	0				是		创建日期
	private String CZGH;			//	varchar	10	0				是		操作工号
	private String UPDATE_TIME;			//	date	3	0				是		修改时间
	private String RELATIONSHIP;			//	varchar	2	0				是		监护人关系
	private String RELATION_ID;			//	varchar	80	0				是		监护人证件
	private String NOTIDNOBZ;			//	varchar	10	0				是		无身份证标志
	private String RELATION_NAME;			//	varchar	80	0				是		监护人姓名
	private String WORK_PLACE;			//	varchar	300	0				是		工作单位
	private String PROVINCECODE;			//	varchar	100	0				是		
	private String PROVINCENAME;			//	varchar	100	0				是		
	private String CITYCODE;			//	varchar	100	0				是		
	private String CITYNAME;			//	varchar	100	0				是		
	private String COUNTYCODE;			//	varchar	100	0				是		
	private String COUNTYNAME;			//	varchar	100	0				是		
	private String TOWNCODE;			//	varchar	100	0				是		
	private String TOWNYNAME;			//	varchar	100	0				是		
	private String MZHM;			//	varchar	100	0				是		门诊号码
	
	public EAPatientMZ() {
		// TODO Auto-generated constructor stub
	}

	public String getPATIENT_ID() {
		return PATIENT_ID;
	}

	public void setPATIENT_ID(String pATIENT_ID) {
		PATIENT_ID = pATIENT_ID;
	}

	public String getPATIENT_NAME() {
		return PATIENT_NAME;
	}

	public void setPATIENT_NAME(String pATIENT_NAME) {
		PATIENT_NAME = pATIENT_NAME;
	}

	public String getNAME_PHONETIC() {
		return NAME_PHONETIC;
	}

	public void setNAME_PHONETIC(String nAME_PHONETIC) {
		NAME_PHONETIC = nAME_PHONETIC;
	}

	public String getSEX() {
		return SEX;
	}

	public void setSEX(String sEX) {
		SEX = sEX;
	}

	public String getDATE_OF_BIRTH() {
		return DATE_OF_BIRTH;
	}

	public void setDATE_OF_BIRTH(String dATE_OF_BIRTH) {
		DATE_OF_BIRTH = dATE_OF_BIRTH;
	}

	public String getBIRTH_PLACE() {
		return BIRTH_PLACE;
	}

	public void setBIRTH_PLACE(String bIRTH_PLACE) {
		BIRTH_PLACE = bIRTH_PLACE;
	}

	public String getCITIZENSHIP() {
		return CITIZENSHIP;
	}

	public void setCITIZENSHIP(String cITIZENSHIP) {
		CITIZENSHIP = cITIZENSHIP;
	}

	public String getNATION() {
		return NATION;
	}

	public void setNATION(String nATION) {
		NATION = nATION;
	}

	public String getBLOOD_GROUPS() {
		return BLOOD_GROUPS;
	}

	public void setBLOOD_GROUPS(String bLOOD_GROUPS) {
		BLOOD_GROUPS = bLOOD_GROUPS;
	}

	public String getID_TYPE() {
		return ID_TYPE;
	}

	public void setID_TYPE(String iD_TYPE) {
		ID_TYPE = iD_TYPE;
	}

	public String getID_NO() {
		return ID_NO;
	}

	public void setID_NO(String iD_NO) {
		ID_NO = iD_NO;
	}

	public String getDEGREE() {
		return DEGREE;
	}

	public void setDEGREE(String dEGREE) {
		DEGREE = dEGREE;
	}

	public String getOCCUPATION() {
		return OCCUPATION;
	}

	public void setOCCUPATION(String oCCUPATION) {
		OCCUPATION = oCCUPATION;
	}

	public String getMARITAL() {
		return MARITAL;
	}

	public void setMARITAL(String mARITAL) {
		MARITAL = mARITAL;
	}

	public String getMAILING_ADDRESS() {
		return MAILING_ADDRESS;
	}

	public void setMAILING_ADDRESS(String mAILING_ADDRESS) {
		MAILING_ADDRESS = mAILING_ADDRESS;
	}

	public String getZIP_CODE() {
		return ZIP_CODE;
	}

	public void setZIP_CODE(String zIP_CODE) {
		ZIP_CODE = zIP_CODE;
	}

	public String getCELLPHONE() {
		return CELLPHONE;
	}

	public void setCELLPHONE(String cELLPHONE) {
		CELLPHONE = cELLPHONE;
	}

	public String getCREATE_DATE() {
		return CREATE_DATE;
	}

	public void setCREATE_DATE(String cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}

	public String getCZGH() {
		return CZGH;
	}

	public void setCZGH(String cZGH) {
		CZGH = cZGH;
	}

	public String getUPDATE_TIME() {
		return UPDATE_TIME;
	}

	public void setUPDATE_TIME(String uPDATE_TIME) {
		UPDATE_TIME = uPDATE_TIME;
	}

	public String getRELATIONSHIP() {
		return RELATIONSHIP;
	}

	public void setRELATIONSHIP(String rELATIONSHIP) {
		RELATIONSHIP = rELATIONSHIP;
	}

	public String getRELATION_ID() {
		return RELATION_ID;
	}

	public void setRELATION_ID(String rELATION_ID) {
		RELATION_ID = rELATION_ID;
	}

	public String getNOTIDNOBZ() {
		return NOTIDNOBZ;
	}

	public void setNOTIDNOBZ(String nOTIDNOBZ) {
		NOTIDNOBZ = nOTIDNOBZ;
	}

	public String getRELATION_NAME() {
		return RELATION_NAME;
	}

	public void setRELATION_NAME(String rELATION_NAME) {
		RELATION_NAME = rELATION_NAME;
	}

	public String getWORK_PLACE() {
		return WORK_PLACE;
	}

	public void setWORK_PLACE(String wORK_PLACE) {
		WORK_PLACE = wORK_PLACE;
	}

	public String getPROVINCECODE() {
		return PROVINCECODE;
	}

	public void setPROVINCECODE(String pROVINCECODE) {
		PROVINCECODE = pROVINCECODE;
	}

	public String getPROVINCENAME() {
		return PROVINCENAME;
	}

	public void setPROVINCENAME(String pROVINCENAME) {
		PROVINCENAME = pROVINCENAME;
	}

	public String getCITYCODE() {
		return CITYCODE;
	}

	public void setCITYCODE(String cITYCODE) {
		CITYCODE = cITYCODE;
	}

	public String getCITYNAME() {
		return CITYNAME;
	}

	public void setCITYNAME(String cITYNAME) {
		CITYNAME = cITYNAME;
	}

	public String getCOUNTYCODE() {
		return COUNTYCODE;
	}

	public void setCOUNTYCODE(String cOUNTYCODE) {
		COUNTYCODE = cOUNTYCODE;
	}

	public String getCOUNTYNAME() {
		return COUNTYNAME;
	}

	public void setCOUNTYNAME(String cOUNTYNAME) {
		COUNTYNAME = cOUNTYNAME;
	}

	public String getTOWNCODE() {
		return TOWNCODE;
	}

	public void setTOWNCODE(String tOWNCODE) {
		TOWNCODE = tOWNCODE;
	}

	public String getTOWNYNAME() {
		return TOWNYNAME;
	}

	public void setTOWNYNAME(String tOWNYNAME) {
		TOWNYNAME = tOWNYNAME;
	}

	public String getMZHM() {
		return MZHM;
	}

	public void setMZHM(String mZHM) {
		MZHM = mZHM;
	}
	

}
