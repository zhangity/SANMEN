/**
 * REGIST_OF_CLINIC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class REGIST_OF_CLINIC  implements java.io.Serializable {
    private java.math.BigDecimal REGIST_ID;

    private java.lang.String SCHEDULE_ID;

    private java.lang.String CLINIC_ID;

    private java.lang.String DEPT_CODE;

    private java.lang.String DEPT_NAME;

    private java.util.Calendar CLINIC_DATE;

    private java.lang.String DOCTOR_CODE;

    private java.lang.String DOCTOR_NAME;

    private java.lang.String REGIST_TYPE;

    private java.lang.String TIME_DESC;

    private java.lang.String VISIT_NO;

    private java.lang.String PATIENT_ID;

    private java.lang.String PATIENT_NAME;

    private java.lang.String TELEPHONE;

    private java.lang.String INSURANCE_TYPE;

    private java.lang.String INSURANCE_TYPENAME;

    private java.lang.String INSURANCE_NUM;

    private java.lang.String CARD_NO;

    private java.lang.String REGIST_STATUS;

    private java.lang.String REGIST_WAY;

    private java.math.BigDecimal TOTAL_PRICE;

    private java.math.BigDecimal REGIST_PRICE;

    private java.math.BigDecimal DIAGNOSIS_PRICE;

    private java.math.BigDecimal EXPERT_PRICE;

    private java.math.BigDecimal CARD_PRICE;

    private java.math.BigDecimal SELF_PAY;

    private java.math.BigDecimal INSURANCE_PAY;

    private java.math.BigDecimal CASHAMOUNT;

    private java.math.BigDecimal ACCOUNTAMOUNT;

    private java.math.BigDecimal HBWC;

    private java.math.BigDecimal JZHM;

    private java.util.Calendar REGIST_TIME;

    private java.util.Calendar ORDER_TIME;

    private java.util.Calendar CREATE_TIME;

    private java.util.Calendar UPDATE_TIME;

    private java.math.BigDecimal TIME_ID;

    private java.lang.String OPERATE_CODE;

    private java.lang.String MACHINEID;

    private java.math.BigDecimal MZLB;

    private java.lang.String reservationBz;

    private java.lang.String nbjsBz;

    private java.lang.String addnumbz;

    private java.lang.String jjrbz;

    private java.lang.String ghlb;

    private java.lang.String ghrygh;

    public REGIST_OF_CLINIC() {
    }

    public REGIST_OF_CLINIC(
           java.math.BigDecimal REGIST_ID,
           java.lang.String SCHEDULE_ID,
           java.lang.String CLINIC_ID,
           java.lang.String DEPT_CODE,
           java.lang.String DEPT_NAME,
           java.util.Calendar CLINIC_DATE,
           java.lang.String DOCTOR_CODE,
           java.lang.String DOCTOR_NAME,
           java.lang.String REGIST_TYPE,
           java.lang.String TIME_DESC,
           java.lang.String VISIT_NO,
           java.lang.String PATIENT_ID,
           java.lang.String PATIENT_NAME,
           java.lang.String TELEPHONE,
           java.lang.String INSURANCE_TYPE,
           java.lang.String INSURANCE_TYPENAME,
           java.lang.String INSURANCE_NUM,
           java.lang.String CARD_NO,
           java.lang.String REGIST_STATUS,
           java.lang.String REGIST_WAY,
           java.math.BigDecimal TOTAL_PRICE,
           java.math.BigDecimal REGIST_PRICE,
           java.math.BigDecimal DIAGNOSIS_PRICE,
           java.math.BigDecimal EXPERT_PRICE,
           java.math.BigDecimal CARD_PRICE,
           java.math.BigDecimal SELF_PAY,
           java.math.BigDecimal INSURANCE_PAY,
           java.math.BigDecimal CASHAMOUNT,
           java.math.BigDecimal ACCOUNTAMOUNT,
           java.math.BigDecimal HBWC,
           java.math.BigDecimal JZHM,
           java.util.Calendar REGIST_TIME,
           java.util.Calendar ORDER_TIME,
           java.util.Calendar CREATE_TIME,
           java.util.Calendar UPDATE_TIME,
           java.math.BigDecimal TIME_ID,
           java.lang.String OPERATE_CODE,
           java.lang.String MACHINEID,
           java.math.BigDecimal MZLB,
           java.lang.String reservationBz,
           java.lang.String nbjsBz,
           java.lang.String addnumbz,
           java.lang.String jjrbz,
           java.lang.String ghlb,
           java.lang.String ghrygh) {
           this.REGIST_ID = REGIST_ID;
           this.SCHEDULE_ID = SCHEDULE_ID;
           this.CLINIC_ID = CLINIC_ID;
           this.DEPT_CODE = DEPT_CODE;
           this.DEPT_NAME = DEPT_NAME;
           this.CLINIC_DATE = CLINIC_DATE;
           this.DOCTOR_CODE = DOCTOR_CODE;
           this.DOCTOR_NAME = DOCTOR_NAME;
           this.REGIST_TYPE = REGIST_TYPE;
           this.TIME_DESC = TIME_DESC;
           this.VISIT_NO = VISIT_NO;
           this.PATIENT_ID = PATIENT_ID;
           this.PATIENT_NAME = PATIENT_NAME;
           this.TELEPHONE = TELEPHONE;
           this.INSURANCE_TYPE = INSURANCE_TYPE;
           this.INSURANCE_TYPENAME = INSURANCE_TYPENAME;
           this.INSURANCE_NUM = INSURANCE_NUM;
           this.CARD_NO = CARD_NO;
           this.REGIST_STATUS = REGIST_STATUS;
           this.REGIST_WAY = REGIST_WAY;
           this.TOTAL_PRICE = TOTAL_PRICE;
           this.REGIST_PRICE = REGIST_PRICE;
           this.DIAGNOSIS_PRICE = DIAGNOSIS_PRICE;
           this.EXPERT_PRICE = EXPERT_PRICE;
           this.CARD_PRICE = CARD_PRICE;
           this.SELF_PAY = SELF_PAY;
           this.INSURANCE_PAY = INSURANCE_PAY;
           this.CASHAMOUNT = CASHAMOUNT;
           this.ACCOUNTAMOUNT = ACCOUNTAMOUNT;
           this.HBWC = HBWC;
           this.JZHM = JZHM;
           this.REGIST_TIME = REGIST_TIME;
           this.ORDER_TIME = ORDER_TIME;
           this.CREATE_TIME = CREATE_TIME;
           this.UPDATE_TIME = UPDATE_TIME;
           this.TIME_ID = TIME_ID;
           this.OPERATE_CODE = OPERATE_CODE;
           this.MACHINEID = MACHINEID;
           this.MZLB = MZLB;
           this.reservationBz = reservationBz;
           this.nbjsBz = nbjsBz;
           this.addnumbz = addnumbz;
           this.jjrbz = jjrbz;
           this.ghlb = ghlb;
           this.ghrygh = ghrygh;
    }


    /**
     * Gets the REGIST_ID value for this REGIST_OF_CLINIC.
     * 
     * @return REGIST_ID
     */
    public java.math.BigDecimal getREGIST_ID() {
        return REGIST_ID;
    }


    /**
     * Sets the REGIST_ID value for this REGIST_OF_CLINIC.
     * 
     * @param REGIST_ID
     */
    public void setREGIST_ID(java.math.BigDecimal REGIST_ID) {
        this.REGIST_ID = REGIST_ID;
    }


    /**
     * Gets the SCHEDULE_ID value for this REGIST_OF_CLINIC.
     * 
     * @return SCHEDULE_ID
     */
    public java.lang.String getSCHEDULE_ID() {
        return SCHEDULE_ID;
    }


    /**
     * Sets the SCHEDULE_ID value for this REGIST_OF_CLINIC.
     * 
     * @param SCHEDULE_ID
     */
    public void setSCHEDULE_ID(java.lang.String SCHEDULE_ID) {
        this.SCHEDULE_ID = SCHEDULE_ID;
    }


    /**
     * Gets the CLINIC_ID value for this REGIST_OF_CLINIC.
     * 
     * @return CLINIC_ID
     */
    public java.lang.String getCLINIC_ID() {
        return CLINIC_ID;
    }


    /**
     * Sets the CLINIC_ID value for this REGIST_OF_CLINIC.
     * 
     * @param CLINIC_ID
     */
    public void setCLINIC_ID(java.lang.String CLINIC_ID) {
        this.CLINIC_ID = CLINIC_ID;
    }


    /**
     * Gets the DEPT_CODE value for this REGIST_OF_CLINIC.
     * 
     * @return DEPT_CODE
     */
    public java.lang.String getDEPT_CODE() {
        return DEPT_CODE;
    }


    /**
     * Sets the DEPT_CODE value for this REGIST_OF_CLINIC.
     * 
     * @param DEPT_CODE
     */
    public void setDEPT_CODE(java.lang.String DEPT_CODE) {
        this.DEPT_CODE = DEPT_CODE;
    }


    /**
     * Gets the DEPT_NAME value for this REGIST_OF_CLINIC.
     * 
     * @return DEPT_NAME
     */
    public java.lang.String getDEPT_NAME() {
        return DEPT_NAME;
    }


    /**
     * Sets the DEPT_NAME value for this REGIST_OF_CLINIC.
     * 
     * @param DEPT_NAME
     */
    public void setDEPT_NAME(java.lang.String DEPT_NAME) {
        this.DEPT_NAME = DEPT_NAME;
    }


    /**
     * Gets the CLINIC_DATE value for this REGIST_OF_CLINIC.
     * 
     * @return CLINIC_DATE
     */
    public java.util.Calendar getCLINIC_DATE() {
        return CLINIC_DATE;
    }


    /**
     * Sets the CLINIC_DATE value for this REGIST_OF_CLINIC.
     * 
     * @param CLINIC_DATE
     */
    public void setCLINIC_DATE(java.util.Calendar CLINIC_DATE) {
        this.CLINIC_DATE = CLINIC_DATE;
    }


    /**
     * Gets the DOCTOR_CODE value for this REGIST_OF_CLINIC.
     * 
     * @return DOCTOR_CODE
     */
    public java.lang.String getDOCTOR_CODE() {
        return DOCTOR_CODE;
    }


    /**
     * Sets the DOCTOR_CODE value for this REGIST_OF_CLINIC.
     * 
     * @param DOCTOR_CODE
     */
    public void setDOCTOR_CODE(java.lang.String DOCTOR_CODE) {
        this.DOCTOR_CODE = DOCTOR_CODE;
    }


    /**
     * Gets the DOCTOR_NAME value for this REGIST_OF_CLINIC.
     * 
     * @return DOCTOR_NAME
     */
    public java.lang.String getDOCTOR_NAME() {
        return DOCTOR_NAME;
    }


    /**
     * Sets the DOCTOR_NAME value for this REGIST_OF_CLINIC.
     * 
     * @param DOCTOR_NAME
     */
    public void setDOCTOR_NAME(java.lang.String DOCTOR_NAME) {
        this.DOCTOR_NAME = DOCTOR_NAME;
    }


    /**
     * Gets the REGIST_TYPE value for this REGIST_OF_CLINIC.
     * 
     * @return REGIST_TYPE
     */
    public java.lang.String getREGIST_TYPE() {
        return REGIST_TYPE;
    }


    /**
     * Sets the REGIST_TYPE value for this REGIST_OF_CLINIC.
     * 
     * @param REGIST_TYPE
     */
    public void setREGIST_TYPE(java.lang.String REGIST_TYPE) {
        this.REGIST_TYPE = REGIST_TYPE;
    }


    /**
     * Gets the TIME_DESC value for this REGIST_OF_CLINIC.
     * 
     * @return TIME_DESC
     */
    public java.lang.String getTIME_DESC() {
        return TIME_DESC;
    }


    /**
     * Sets the TIME_DESC value for this REGIST_OF_CLINIC.
     * 
     * @param TIME_DESC
     */
    public void setTIME_DESC(java.lang.String TIME_DESC) {
        this.TIME_DESC = TIME_DESC;
    }


    /**
     * Gets the VISIT_NO value for this REGIST_OF_CLINIC.
     * 
     * @return VISIT_NO
     */
    public java.lang.String getVISIT_NO() {
        return VISIT_NO;
    }


    /**
     * Sets the VISIT_NO value for this REGIST_OF_CLINIC.
     * 
     * @param VISIT_NO
     */
    public void setVISIT_NO(java.lang.String VISIT_NO) {
        this.VISIT_NO = VISIT_NO;
    }


    /**
     * Gets the PATIENT_ID value for this REGIST_OF_CLINIC.
     * 
     * @return PATIENT_ID
     */
    public java.lang.String getPATIENT_ID() {
        return PATIENT_ID;
    }


    /**
     * Sets the PATIENT_ID value for this REGIST_OF_CLINIC.
     * 
     * @param PATIENT_ID
     */
    public void setPATIENT_ID(java.lang.String PATIENT_ID) {
        this.PATIENT_ID = PATIENT_ID;
    }


    /**
     * Gets the PATIENT_NAME value for this REGIST_OF_CLINIC.
     * 
     * @return PATIENT_NAME
     */
    public java.lang.String getPATIENT_NAME() {
        return PATIENT_NAME;
    }


    /**
     * Sets the PATIENT_NAME value for this REGIST_OF_CLINIC.
     * 
     * @param PATIENT_NAME
     */
    public void setPATIENT_NAME(java.lang.String PATIENT_NAME) {
        this.PATIENT_NAME = PATIENT_NAME;
    }


    /**
     * Gets the TELEPHONE value for this REGIST_OF_CLINIC.
     * 
     * @return TELEPHONE
     */
    public java.lang.String getTELEPHONE() {
        return TELEPHONE;
    }


    /**
     * Sets the TELEPHONE value for this REGIST_OF_CLINIC.
     * 
     * @param TELEPHONE
     */
    public void setTELEPHONE(java.lang.String TELEPHONE) {
        this.TELEPHONE = TELEPHONE;
    }


    /**
     * Gets the INSURANCE_TYPE value for this REGIST_OF_CLINIC.
     * 
     * @return INSURANCE_TYPE
     */
    public java.lang.String getINSURANCE_TYPE() {
        return INSURANCE_TYPE;
    }


    /**
     * Sets the INSURANCE_TYPE value for this REGIST_OF_CLINIC.
     * 
     * @param INSURANCE_TYPE
     */
    public void setINSURANCE_TYPE(java.lang.String INSURANCE_TYPE) {
        this.INSURANCE_TYPE = INSURANCE_TYPE;
    }


    /**
     * Gets the INSURANCE_TYPENAME value for this REGIST_OF_CLINIC.
     * 
     * @return INSURANCE_TYPENAME
     */
    public java.lang.String getINSURANCE_TYPENAME() {
        return INSURANCE_TYPENAME;
    }


    /**
     * Sets the INSURANCE_TYPENAME value for this REGIST_OF_CLINIC.
     * 
     * @param INSURANCE_TYPENAME
     */
    public void setINSURANCE_TYPENAME(java.lang.String INSURANCE_TYPENAME) {
        this.INSURANCE_TYPENAME = INSURANCE_TYPENAME;
    }


    /**
     * Gets the INSURANCE_NUM value for this REGIST_OF_CLINIC.
     * 
     * @return INSURANCE_NUM
     */
    public java.lang.String getINSURANCE_NUM() {
        return INSURANCE_NUM;
    }


    /**
     * Sets the INSURANCE_NUM value for this REGIST_OF_CLINIC.
     * 
     * @param INSURANCE_NUM
     */
    public void setINSURANCE_NUM(java.lang.String INSURANCE_NUM) {
        this.INSURANCE_NUM = INSURANCE_NUM;
    }


    /**
     * Gets the CARD_NO value for this REGIST_OF_CLINIC.
     * 
     * @return CARD_NO
     */
    public java.lang.String getCARD_NO() {
        return CARD_NO;
    }


    /**
     * Sets the CARD_NO value for this REGIST_OF_CLINIC.
     * 
     * @param CARD_NO
     */
    public void setCARD_NO(java.lang.String CARD_NO) {
        this.CARD_NO = CARD_NO;
    }


    /**
     * Gets the REGIST_STATUS value for this REGIST_OF_CLINIC.
     * 
     * @return REGIST_STATUS
     */
    public java.lang.String getREGIST_STATUS() {
        return REGIST_STATUS;
    }


    /**
     * Sets the REGIST_STATUS value for this REGIST_OF_CLINIC.
     * 
     * @param REGIST_STATUS
     */
    public void setREGIST_STATUS(java.lang.String REGIST_STATUS) {
        this.REGIST_STATUS = REGIST_STATUS;
    }


    /**
     * Gets the REGIST_WAY value for this REGIST_OF_CLINIC.
     * 
     * @return REGIST_WAY
     */
    public java.lang.String getREGIST_WAY() {
        return REGIST_WAY;
    }


    /**
     * Sets the REGIST_WAY value for this REGIST_OF_CLINIC.
     * 
     * @param REGIST_WAY
     */
    public void setREGIST_WAY(java.lang.String REGIST_WAY) {
        this.REGIST_WAY = REGIST_WAY;
    }


    /**
     * Gets the TOTAL_PRICE value for this REGIST_OF_CLINIC.
     * 
     * @return TOTAL_PRICE
     */
    public java.math.BigDecimal getTOTAL_PRICE() {
        return TOTAL_PRICE;
    }


    /**
     * Sets the TOTAL_PRICE value for this REGIST_OF_CLINIC.
     * 
     * @param TOTAL_PRICE
     */
    public void setTOTAL_PRICE(java.math.BigDecimal TOTAL_PRICE) {
        this.TOTAL_PRICE = TOTAL_PRICE;
    }


    /**
     * Gets the REGIST_PRICE value for this REGIST_OF_CLINIC.
     * 
     * @return REGIST_PRICE
     */
    public java.math.BigDecimal getREGIST_PRICE() {
        return REGIST_PRICE;
    }


    /**
     * Sets the REGIST_PRICE value for this REGIST_OF_CLINIC.
     * 
     * @param REGIST_PRICE
     */
    public void setREGIST_PRICE(java.math.BigDecimal REGIST_PRICE) {
        this.REGIST_PRICE = REGIST_PRICE;
    }


    /**
     * Gets the DIAGNOSIS_PRICE value for this REGIST_OF_CLINIC.
     * 
     * @return DIAGNOSIS_PRICE
     */
    public java.math.BigDecimal getDIAGNOSIS_PRICE() {
        return DIAGNOSIS_PRICE;
    }


    /**
     * Sets the DIAGNOSIS_PRICE value for this REGIST_OF_CLINIC.
     * 
     * @param DIAGNOSIS_PRICE
     */
    public void setDIAGNOSIS_PRICE(java.math.BigDecimal DIAGNOSIS_PRICE) {
        this.DIAGNOSIS_PRICE = DIAGNOSIS_PRICE;
    }


    /**
     * Gets the EXPERT_PRICE value for this REGIST_OF_CLINIC.
     * 
     * @return EXPERT_PRICE
     */
    public java.math.BigDecimal getEXPERT_PRICE() {
        return EXPERT_PRICE;
    }


    /**
     * Sets the EXPERT_PRICE value for this REGIST_OF_CLINIC.
     * 
     * @param EXPERT_PRICE
     */
    public void setEXPERT_PRICE(java.math.BigDecimal EXPERT_PRICE) {
        this.EXPERT_PRICE = EXPERT_PRICE;
    }


    /**
     * Gets the CARD_PRICE value for this REGIST_OF_CLINIC.
     * 
     * @return CARD_PRICE
     */
    public java.math.BigDecimal getCARD_PRICE() {
        return CARD_PRICE;
    }


    /**
     * Sets the CARD_PRICE value for this REGIST_OF_CLINIC.
     * 
     * @param CARD_PRICE
     */
    public void setCARD_PRICE(java.math.BigDecimal CARD_PRICE) {
        this.CARD_PRICE = CARD_PRICE;
    }


    /**
     * Gets the SELF_PAY value for this REGIST_OF_CLINIC.
     * 
     * @return SELF_PAY
     */
    public java.math.BigDecimal getSELF_PAY() {
        return SELF_PAY;
    }


    /**
     * Sets the SELF_PAY value for this REGIST_OF_CLINIC.
     * 
     * @param SELF_PAY
     */
    public void setSELF_PAY(java.math.BigDecimal SELF_PAY) {
        this.SELF_PAY = SELF_PAY;
    }


    /**
     * Gets the INSURANCE_PAY value for this REGIST_OF_CLINIC.
     * 
     * @return INSURANCE_PAY
     */
    public java.math.BigDecimal getINSURANCE_PAY() {
        return INSURANCE_PAY;
    }


    /**
     * Sets the INSURANCE_PAY value for this REGIST_OF_CLINIC.
     * 
     * @param INSURANCE_PAY
     */
    public void setINSURANCE_PAY(java.math.BigDecimal INSURANCE_PAY) {
        this.INSURANCE_PAY = INSURANCE_PAY;
    }


    /**
     * Gets the CASHAMOUNT value for this REGIST_OF_CLINIC.
     * 
     * @return CASHAMOUNT
     */
    public java.math.BigDecimal getCASHAMOUNT() {
        return CASHAMOUNT;
    }


    /**
     * Sets the CASHAMOUNT value for this REGIST_OF_CLINIC.
     * 
     * @param CASHAMOUNT
     */
    public void setCASHAMOUNT(java.math.BigDecimal CASHAMOUNT) {
        this.CASHAMOUNT = CASHAMOUNT;
    }


    /**
     * Gets the ACCOUNTAMOUNT value for this REGIST_OF_CLINIC.
     * 
     * @return ACCOUNTAMOUNT
     */
    public java.math.BigDecimal getACCOUNTAMOUNT() {
        return ACCOUNTAMOUNT;
    }


    /**
     * Sets the ACCOUNTAMOUNT value for this REGIST_OF_CLINIC.
     * 
     * @param ACCOUNTAMOUNT
     */
    public void setACCOUNTAMOUNT(java.math.BigDecimal ACCOUNTAMOUNT) {
        this.ACCOUNTAMOUNT = ACCOUNTAMOUNT;
    }


    /**
     * Gets the HBWC value for this REGIST_OF_CLINIC.
     * 
     * @return HBWC
     */
    public java.math.BigDecimal getHBWC() {
        return HBWC;
    }


    /**
     * Sets the HBWC value for this REGIST_OF_CLINIC.
     * 
     * @param HBWC
     */
    public void setHBWC(java.math.BigDecimal HBWC) {
        this.HBWC = HBWC;
    }


    /**
     * Gets the JZHM value for this REGIST_OF_CLINIC.
     * 
     * @return JZHM
     */
    public java.math.BigDecimal getJZHM() {
        return JZHM;
    }


    /**
     * Sets the JZHM value for this REGIST_OF_CLINIC.
     * 
     * @param JZHM
     */
    public void setJZHM(java.math.BigDecimal JZHM) {
        this.JZHM = JZHM;
    }


    /**
     * Gets the REGIST_TIME value for this REGIST_OF_CLINIC.
     * 
     * @return REGIST_TIME
     */
    public java.util.Calendar getREGIST_TIME() {
        return REGIST_TIME;
    }


    /**
     * Sets the REGIST_TIME value for this REGIST_OF_CLINIC.
     * 
     * @param REGIST_TIME
     */
    public void setREGIST_TIME(java.util.Calendar REGIST_TIME) {
        this.REGIST_TIME = REGIST_TIME;
    }


    /**
     * Gets the ORDER_TIME value for this REGIST_OF_CLINIC.
     * 
     * @return ORDER_TIME
     */
    public java.util.Calendar getORDER_TIME() {
        return ORDER_TIME;
    }


    /**
     * Sets the ORDER_TIME value for this REGIST_OF_CLINIC.
     * 
     * @param ORDER_TIME
     */
    public void setORDER_TIME(java.util.Calendar ORDER_TIME) {
        this.ORDER_TIME = ORDER_TIME;
    }


    /**
     * Gets the CREATE_TIME value for this REGIST_OF_CLINIC.
     * 
     * @return CREATE_TIME
     */
    public java.util.Calendar getCREATE_TIME() {
        return CREATE_TIME;
    }


    /**
     * Sets the CREATE_TIME value for this REGIST_OF_CLINIC.
     * 
     * @param CREATE_TIME
     */
    public void setCREATE_TIME(java.util.Calendar CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }


    /**
     * Gets the UPDATE_TIME value for this REGIST_OF_CLINIC.
     * 
     * @return UPDATE_TIME
     */
    public java.util.Calendar getUPDATE_TIME() {
        return UPDATE_TIME;
    }


    /**
     * Sets the UPDATE_TIME value for this REGIST_OF_CLINIC.
     * 
     * @param UPDATE_TIME
     */
    public void setUPDATE_TIME(java.util.Calendar UPDATE_TIME) {
        this.UPDATE_TIME = UPDATE_TIME;
    }


    /**
     * Gets the TIME_ID value for this REGIST_OF_CLINIC.
     * 
     * @return TIME_ID
     */
    public java.math.BigDecimal getTIME_ID() {
        return TIME_ID;
    }


    /**
     * Sets the TIME_ID value for this REGIST_OF_CLINIC.
     * 
     * @param TIME_ID
     */
    public void setTIME_ID(java.math.BigDecimal TIME_ID) {
        this.TIME_ID = TIME_ID;
    }


    /**
     * Gets the OPERATE_CODE value for this REGIST_OF_CLINIC.
     * 
     * @return OPERATE_CODE
     */
    public java.lang.String getOPERATE_CODE() {
        return OPERATE_CODE;
    }


    /**
     * Sets the OPERATE_CODE value for this REGIST_OF_CLINIC.
     * 
     * @param OPERATE_CODE
     */
    public void setOPERATE_CODE(java.lang.String OPERATE_CODE) {
        this.OPERATE_CODE = OPERATE_CODE;
    }


    /**
     * Gets the MACHINEID value for this REGIST_OF_CLINIC.
     * 
     * @return MACHINEID
     */
    public java.lang.String getMACHINEID() {
        return MACHINEID;
    }


    /**
     * Sets the MACHINEID value for this REGIST_OF_CLINIC.
     * 
     * @param MACHINEID
     */
    public void setMACHINEID(java.lang.String MACHINEID) {
        this.MACHINEID = MACHINEID;
    }


    /**
     * Gets the MZLB value for this REGIST_OF_CLINIC.
     * 
     * @return MZLB
     */
    public java.math.BigDecimal getMZLB() {
        return MZLB;
    }


    /**
     * Sets the MZLB value for this REGIST_OF_CLINIC.
     * 
     * @param MZLB
     */
    public void setMZLB(java.math.BigDecimal MZLB) {
        this.MZLB = MZLB;
    }


    /**
     * Gets the reservationBz value for this REGIST_OF_CLINIC.
     * 
     * @return reservationBz
     */
    public java.lang.String getReservationBz() {
        return reservationBz;
    }


    /**
     * Sets the reservationBz value for this REGIST_OF_CLINIC.
     * 
     * @param reservationBz
     */
    public void setReservationBz(java.lang.String reservationBz) {
        this.reservationBz = reservationBz;
    }


    /**
     * Gets the nbjsBz value for this REGIST_OF_CLINIC.
     * 
     * @return nbjsBz
     */
    public java.lang.String getNbjsBz() {
        return nbjsBz;
    }


    /**
     * Sets the nbjsBz value for this REGIST_OF_CLINIC.
     * 
     * @param nbjsBz
     */
    public void setNbjsBz(java.lang.String nbjsBz) {
        this.nbjsBz = nbjsBz;
    }


    /**
     * Gets the addnumbz value for this REGIST_OF_CLINIC.
     * 
     * @return addnumbz
     */
    public java.lang.String getAddnumbz() {
        return addnumbz;
    }


    /**
     * Sets the addnumbz value for this REGIST_OF_CLINIC.
     * 
     * @param addnumbz
     */
    public void setAddnumbz(java.lang.String addnumbz) {
        this.addnumbz = addnumbz;
    }


    /**
     * Gets the jjrbz value for this REGIST_OF_CLINIC.
     * 
     * @return jjrbz
     */
    public java.lang.String getJjrbz() {
        return jjrbz;
    }


    /**
     * Sets the jjrbz value for this REGIST_OF_CLINIC.
     * 
     * @param jjrbz
     */
    public void setJjrbz(java.lang.String jjrbz) {
        this.jjrbz = jjrbz;
    }


    /**
     * Gets the ghlb value for this REGIST_OF_CLINIC.
     * 
     * @return ghlb
     */
    public java.lang.String getGhlb() {
        return ghlb;
    }


    /**
     * Sets the ghlb value for this REGIST_OF_CLINIC.
     * 
     * @param ghlb
     */
    public void setGhlb(java.lang.String ghlb) {
        this.ghlb = ghlb;
    }


    /**
     * Gets the ghrygh value for this REGIST_OF_CLINIC.
     * 
     * @return ghrygh
     */
    public java.lang.String getGhrygh() {
        return ghrygh;
    }


    /**
     * Sets the ghrygh value for this REGIST_OF_CLINIC.
     * 
     * @param ghrygh
     */
    public void setGhrygh(java.lang.String ghrygh) {
        this.ghrygh = ghrygh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof REGIST_OF_CLINIC)) return false;
        REGIST_OF_CLINIC other = (REGIST_OF_CLINIC) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.REGIST_ID==null && other.getREGIST_ID()==null) || 
             (this.REGIST_ID!=null &&
              this.REGIST_ID.equals(other.getREGIST_ID()))) &&
            ((this.SCHEDULE_ID==null && other.getSCHEDULE_ID()==null) || 
             (this.SCHEDULE_ID!=null &&
              this.SCHEDULE_ID.equals(other.getSCHEDULE_ID()))) &&
            ((this.CLINIC_ID==null && other.getCLINIC_ID()==null) || 
             (this.CLINIC_ID!=null &&
              this.CLINIC_ID.equals(other.getCLINIC_ID()))) &&
            ((this.DEPT_CODE==null && other.getDEPT_CODE()==null) || 
             (this.DEPT_CODE!=null &&
              this.DEPT_CODE.equals(other.getDEPT_CODE()))) &&
            ((this.DEPT_NAME==null && other.getDEPT_NAME()==null) || 
             (this.DEPT_NAME!=null &&
              this.DEPT_NAME.equals(other.getDEPT_NAME()))) &&
            ((this.CLINIC_DATE==null && other.getCLINIC_DATE()==null) || 
             (this.CLINIC_DATE!=null &&
              this.CLINIC_DATE.equals(other.getCLINIC_DATE()))) &&
            ((this.DOCTOR_CODE==null && other.getDOCTOR_CODE()==null) || 
             (this.DOCTOR_CODE!=null &&
              this.DOCTOR_CODE.equals(other.getDOCTOR_CODE()))) &&
            ((this.DOCTOR_NAME==null && other.getDOCTOR_NAME()==null) || 
             (this.DOCTOR_NAME!=null &&
              this.DOCTOR_NAME.equals(other.getDOCTOR_NAME()))) &&
            ((this.REGIST_TYPE==null && other.getREGIST_TYPE()==null) || 
             (this.REGIST_TYPE!=null &&
              this.REGIST_TYPE.equals(other.getREGIST_TYPE()))) &&
            ((this.TIME_DESC==null && other.getTIME_DESC()==null) || 
             (this.TIME_DESC!=null &&
              this.TIME_DESC.equals(other.getTIME_DESC()))) &&
            ((this.VISIT_NO==null && other.getVISIT_NO()==null) || 
             (this.VISIT_NO!=null &&
              this.VISIT_NO.equals(other.getVISIT_NO()))) &&
            ((this.PATIENT_ID==null && other.getPATIENT_ID()==null) || 
             (this.PATIENT_ID!=null &&
              this.PATIENT_ID.equals(other.getPATIENT_ID()))) &&
            ((this.PATIENT_NAME==null && other.getPATIENT_NAME()==null) || 
             (this.PATIENT_NAME!=null &&
              this.PATIENT_NAME.equals(other.getPATIENT_NAME()))) &&
            ((this.TELEPHONE==null && other.getTELEPHONE()==null) || 
             (this.TELEPHONE!=null &&
              this.TELEPHONE.equals(other.getTELEPHONE()))) &&
            ((this.INSURANCE_TYPE==null && other.getINSURANCE_TYPE()==null) || 
             (this.INSURANCE_TYPE!=null &&
              this.INSURANCE_TYPE.equals(other.getINSURANCE_TYPE()))) &&
            ((this.INSURANCE_TYPENAME==null && other.getINSURANCE_TYPENAME()==null) || 
             (this.INSURANCE_TYPENAME!=null &&
              this.INSURANCE_TYPENAME.equals(other.getINSURANCE_TYPENAME()))) &&
            ((this.INSURANCE_NUM==null && other.getINSURANCE_NUM()==null) || 
             (this.INSURANCE_NUM!=null &&
              this.INSURANCE_NUM.equals(other.getINSURANCE_NUM()))) &&
            ((this.CARD_NO==null && other.getCARD_NO()==null) || 
             (this.CARD_NO!=null &&
              this.CARD_NO.equals(other.getCARD_NO()))) &&
            ((this.REGIST_STATUS==null && other.getREGIST_STATUS()==null) || 
             (this.REGIST_STATUS!=null &&
              this.REGIST_STATUS.equals(other.getREGIST_STATUS()))) &&
            ((this.REGIST_WAY==null && other.getREGIST_WAY()==null) || 
             (this.REGIST_WAY!=null &&
              this.REGIST_WAY.equals(other.getREGIST_WAY()))) &&
            ((this.TOTAL_PRICE==null && other.getTOTAL_PRICE()==null) || 
             (this.TOTAL_PRICE!=null &&
              this.TOTAL_PRICE.equals(other.getTOTAL_PRICE()))) &&
            ((this.REGIST_PRICE==null && other.getREGIST_PRICE()==null) || 
             (this.REGIST_PRICE!=null &&
              this.REGIST_PRICE.equals(other.getREGIST_PRICE()))) &&
            ((this.DIAGNOSIS_PRICE==null && other.getDIAGNOSIS_PRICE()==null) || 
             (this.DIAGNOSIS_PRICE!=null &&
              this.DIAGNOSIS_PRICE.equals(other.getDIAGNOSIS_PRICE()))) &&
            ((this.EXPERT_PRICE==null && other.getEXPERT_PRICE()==null) || 
             (this.EXPERT_PRICE!=null &&
              this.EXPERT_PRICE.equals(other.getEXPERT_PRICE()))) &&
            ((this.CARD_PRICE==null && other.getCARD_PRICE()==null) || 
             (this.CARD_PRICE!=null &&
              this.CARD_PRICE.equals(other.getCARD_PRICE()))) &&
            ((this.SELF_PAY==null && other.getSELF_PAY()==null) || 
             (this.SELF_PAY!=null &&
              this.SELF_PAY.equals(other.getSELF_PAY()))) &&
            ((this.INSURANCE_PAY==null && other.getINSURANCE_PAY()==null) || 
             (this.INSURANCE_PAY!=null &&
              this.INSURANCE_PAY.equals(other.getINSURANCE_PAY()))) &&
            ((this.CASHAMOUNT==null && other.getCASHAMOUNT()==null) || 
             (this.CASHAMOUNT!=null &&
              this.CASHAMOUNT.equals(other.getCASHAMOUNT()))) &&
            ((this.ACCOUNTAMOUNT==null && other.getACCOUNTAMOUNT()==null) || 
             (this.ACCOUNTAMOUNT!=null &&
              this.ACCOUNTAMOUNT.equals(other.getACCOUNTAMOUNT()))) &&
            ((this.HBWC==null && other.getHBWC()==null) || 
             (this.HBWC!=null &&
              this.HBWC.equals(other.getHBWC()))) &&
            ((this.JZHM==null && other.getJZHM()==null) || 
             (this.JZHM!=null &&
              this.JZHM.equals(other.getJZHM()))) &&
            ((this.REGIST_TIME==null && other.getREGIST_TIME()==null) || 
             (this.REGIST_TIME!=null &&
              this.REGIST_TIME.equals(other.getREGIST_TIME()))) &&
            ((this.ORDER_TIME==null && other.getORDER_TIME()==null) || 
             (this.ORDER_TIME!=null &&
              this.ORDER_TIME.equals(other.getORDER_TIME()))) &&
            ((this.CREATE_TIME==null && other.getCREATE_TIME()==null) || 
             (this.CREATE_TIME!=null &&
              this.CREATE_TIME.equals(other.getCREATE_TIME()))) &&
            ((this.UPDATE_TIME==null && other.getUPDATE_TIME()==null) || 
             (this.UPDATE_TIME!=null &&
              this.UPDATE_TIME.equals(other.getUPDATE_TIME()))) &&
            ((this.TIME_ID==null && other.getTIME_ID()==null) || 
             (this.TIME_ID!=null &&
              this.TIME_ID.equals(other.getTIME_ID()))) &&
            ((this.OPERATE_CODE==null && other.getOPERATE_CODE()==null) || 
             (this.OPERATE_CODE!=null &&
              this.OPERATE_CODE.equals(other.getOPERATE_CODE()))) &&
            ((this.MACHINEID==null && other.getMACHINEID()==null) || 
             (this.MACHINEID!=null &&
              this.MACHINEID.equals(other.getMACHINEID()))) &&
            ((this.MZLB==null && other.getMZLB()==null) || 
             (this.MZLB!=null &&
              this.MZLB.equals(other.getMZLB()))) &&
            ((this.reservationBz==null && other.getReservationBz()==null) || 
             (this.reservationBz!=null &&
              this.reservationBz.equals(other.getReservationBz()))) &&
            ((this.nbjsBz==null && other.getNbjsBz()==null) || 
             (this.nbjsBz!=null &&
              this.nbjsBz.equals(other.getNbjsBz()))) &&
            ((this.addnumbz==null && other.getAddnumbz()==null) || 
             (this.addnumbz!=null &&
              this.addnumbz.equals(other.getAddnumbz()))) &&
            ((this.jjrbz==null && other.getJjrbz()==null) || 
             (this.jjrbz!=null &&
              this.jjrbz.equals(other.getJjrbz()))) &&
            ((this.ghlb==null && other.getGhlb()==null) || 
             (this.ghlb!=null &&
              this.ghlb.equals(other.getGhlb()))) &&
            ((this.ghrygh==null && other.getGhrygh()==null) || 
             (this.ghrygh!=null &&
              this.ghrygh.equals(other.getGhrygh())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getREGIST_ID() != null) {
            _hashCode += getREGIST_ID().hashCode();
        }
        if (getSCHEDULE_ID() != null) {
            _hashCode += getSCHEDULE_ID().hashCode();
        }
        if (getCLINIC_ID() != null) {
            _hashCode += getCLINIC_ID().hashCode();
        }
        if (getDEPT_CODE() != null) {
            _hashCode += getDEPT_CODE().hashCode();
        }
        if (getDEPT_NAME() != null) {
            _hashCode += getDEPT_NAME().hashCode();
        }
        if (getCLINIC_DATE() != null) {
            _hashCode += getCLINIC_DATE().hashCode();
        }
        if (getDOCTOR_CODE() != null) {
            _hashCode += getDOCTOR_CODE().hashCode();
        }
        if (getDOCTOR_NAME() != null) {
            _hashCode += getDOCTOR_NAME().hashCode();
        }
        if (getREGIST_TYPE() != null) {
            _hashCode += getREGIST_TYPE().hashCode();
        }
        if (getTIME_DESC() != null) {
            _hashCode += getTIME_DESC().hashCode();
        }
        if (getVISIT_NO() != null) {
            _hashCode += getVISIT_NO().hashCode();
        }
        if (getPATIENT_ID() != null) {
            _hashCode += getPATIENT_ID().hashCode();
        }
        if (getPATIENT_NAME() != null) {
            _hashCode += getPATIENT_NAME().hashCode();
        }
        if (getTELEPHONE() != null) {
            _hashCode += getTELEPHONE().hashCode();
        }
        if (getINSURANCE_TYPE() != null) {
            _hashCode += getINSURANCE_TYPE().hashCode();
        }
        if (getINSURANCE_TYPENAME() != null) {
            _hashCode += getINSURANCE_TYPENAME().hashCode();
        }
        if (getINSURANCE_NUM() != null) {
            _hashCode += getINSURANCE_NUM().hashCode();
        }
        if (getCARD_NO() != null) {
            _hashCode += getCARD_NO().hashCode();
        }
        if (getREGIST_STATUS() != null) {
            _hashCode += getREGIST_STATUS().hashCode();
        }
        if (getREGIST_WAY() != null) {
            _hashCode += getREGIST_WAY().hashCode();
        }
        if (getTOTAL_PRICE() != null) {
            _hashCode += getTOTAL_PRICE().hashCode();
        }
        if (getREGIST_PRICE() != null) {
            _hashCode += getREGIST_PRICE().hashCode();
        }
        if (getDIAGNOSIS_PRICE() != null) {
            _hashCode += getDIAGNOSIS_PRICE().hashCode();
        }
        if (getEXPERT_PRICE() != null) {
            _hashCode += getEXPERT_PRICE().hashCode();
        }
        if (getCARD_PRICE() != null) {
            _hashCode += getCARD_PRICE().hashCode();
        }
        if (getSELF_PAY() != null) {
            _hashCode += getSELF_PAY().hashCode();
        }
        if (getINSURANCE_PAY() != null) {
            _hashCode += getINSURANCE_PAY().hashCode();
        }
        if (getCASHAMOUNT() != null) {
            _hashCode += getCASHAMOUNT().hashCode();
        }
        if (getACCOUNTAMOUNT() != null) {
            _hashCode += getACCOUNTAMOUNT().hashCode();
        }
        if (getHBWC() != null) {
            _hashCode += getHBWC().hashCode();
        }
        if (getJZHM() != null) {
            _hashCode += getJZHM().hashCode();
        }
        if (getREGIST_TIME() != null) {
            _hashCode += getREGIST_TIME().hashCode();
        }
        if (getORDER_TIME() != null) {
            _hashCode += getORDER_TIME().hashCode();
        }
        if (getCREATE_TIME() != null) {
            _hashCode += getCREATE_TIME().hashCode();
        }
        if (getUPDATE_TIME() != null) {
            _hashCode += getUPDATE_TIME().hashCode();
        }
        if (getTIME_ID() != null) {
            _hashCode += getTIME_ID().hashCode();
        }
        if (getOPERATE_CODE() != null) {
            _hashCode += getOPERATE_CODE().hashCode();
        }
        if (getMACHINEID() != null) {
            _hashCode += getMACHINEID().hashCode();
        }
        if (getMZLB() != null) {
            _hashCode += getMZLB().hashCode();
        }
        if (getReservationBz() != null) {
            _hashCode += getReservationBz().hashCode();
        }
        if (getNbjsBz() != null) {
            _hashCode += getNbjsBz().hashCode();
        }
        if (getAddnumbz() != null) {
            _hashCode += getAddnumbz().hashCode();
        }
        if (getJjrbz() != null) {
            _hashCode += getJjrbz().hashCode();
        }
        if (getGhlb() != null) {
            _hashCode += getGhlb().hashCode();
        }
        if (getGhrygh() != null) {
            _hashCode += getGhrygh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(REGIST_OF_CLINIC.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "REGIST_OF_CLINIC"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGIST_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "REGIST_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCHEDULE_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SCHEDULE_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLINIC_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CLINIC_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEPT_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DEPT_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEPT_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DEPT_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLINIC_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CLINIC_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOCTOR_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DOCTOR_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOCTOR_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DOCTOR_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGIST_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "REGIST_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIME_DESC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TIME_DESC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VISIT_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "VISIT_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PATIENT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PATIENT_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PATIENT_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PATIENT_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TELEPHONE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TELEPHONE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSURANCE_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "INSURANCE_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSURANCE_TYPENAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "INSURANCE_TYPENAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSURANCE_NUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "INSURANCE_NUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARD_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CARD_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGIST_STATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "REGIST_STATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGIST_WAY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "REGIST_WAY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TOTAL_PRICE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TOTAL_PRICE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGIST_PRICE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "REGIST_PRICE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIAGNOSIS_PRICE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DIAGNOSIS_PRICE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXPERT_PRICE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EXPERT_PRICE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARD_PRICE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CARD_PRICE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SELF_PAY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SELF_PAY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSURANCE_PAY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "INSURANCE_PAY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CASHAMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CASHAMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCOUNTAMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ACCOUNTAMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HBWC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "HBWC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JZHM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "JZHM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGIST_TIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "REGIST_TIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORDER_TIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ORDER_TIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CREATE_TIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CREATE_TIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UPDATE_TIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UPDATE_TIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIME_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TIME_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OPERATE_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OPERATE_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MACHINEID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MACHINEID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MZLB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MZLB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationBz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReservationBz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbjsBz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NbjsBz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addnumbz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Addnumbz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jjrbz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Jjrbz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ghlb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Ghlb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ghrygh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Ghrygh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
