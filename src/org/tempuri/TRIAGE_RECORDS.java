/**
 * TRIAGE_RECORDS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class TRIAGE_RECORDS  implements java.io.Serializable {
    private java.lang.String TRIAGE_ID;

    private java.util.Calendar TRIAGE_TIME;

    private java.lang.String PATIENT_ID;

    private java.lang.String UNIDENTIFIED_PATIENT_ID;

    private java.lang.String NAME;

    private java.lang.String INITIAL_DIAGNOSIS;

    private java.lang.String OTHER_DIAGNOSIS;

    private java.lang.String FINAL_DIAGNOSIS_CODE;

    private java.lang.String FINAL_DIAGNOSIS_NAME;

    private java.lang.String WAY_TO_HOSPITAL;

    private java.lang.String VISIT_DEPT_CODE;

    private java.lang.String VISIT_DOCTOR_CODE;

    private java.lang.String TEMP;

    private java.lang.String PULSE;

    private java.lang.String BREATH;

    private java.lang.String SYSTOLIC_PRESSURE;

    private java.lang.String DIASTOLIC_PRESSURE;

    private java.lang.String SPO2;

    private java.lang.String NERVOUS_SYSTEM;

    private java.lang.String EMERGENCY_AREA;

    private java.lang.String RESCUE_BED;

    private java.lang.String PATIENT_WHITHER;

    private java.util.Calendar CHECK_IN_TIME;

    private java.util.Calendar START_TIME;

    private java.util.Calendar END_TIME;

    private java.lang.String MENO;

    private java.lang.String IS_UNIDENTIFIED;

    private java.lang.String UNIDENTIFIED_REASON;

    private java.util.Calendar CREATE_TIME;

    private java.lang.String TRIAGE_LEVEL;

    private java.lang.String MEWS_FQ;

    private java.lang.String BRXX_MRWS;

    public TRIAGE_RECORDS() {
    }

    public TRIAGE_RECORDS(
           java.lang.String TRIAGE_ID,
           java.util.Calendar TRIAGE_TIME,
           java.lang.String PATIENT_ID,
           java.lang.String UNIDENTIFIED_PATIENT_ID,
           java.lang.String NAME,
           java.lang.String INITIAL_DIAGNOSIS,
           java.lang.String OTHER_DIAGNOSIS,
           java.lang.String FINAL_DIAGNOSIS_CODE,
           java.lang.String FINAL_DIAGNOSIS_NAME,
           java.lang.String WAY_TO_HOSPITAL,
           java.lang.String VISIT_DEPT_CODE,
           java.lang.String VISIT_DOCTOR_CODE,
           java.lang.String TEMP,
           java.lang.String PULSE,
           java.lang.String BREATH,
           java.lang.String SYSTOLIC_PRESSURE,
           java.lang.String DIASTOLIC_PRESSURE,
           java.lang.String SPO2,
           java.lang.String NERVOUS_SYSTEM,
           java.lang.String EMERGENCY_AREA,
           java.lang.String RESCUE_BED,
           java.lang.String PATIENT_WHITHER,
           java.util.Calendar CHECK_IN_TIME,
           java.util.Calendar START_TIME,
           java.util.Calendar END_TIME,
           java.lang.String MENO,
           java.lang.String IS_UNIDENTIFIED,
           java.lang.String UNIDENTIFIED_REASON,
           java.util.Calendar CREATE_TIME,
           java.lang.String TRIAGE_LEVEL,
           java.lang.String MEWS_FQ,
           java.lang.String BRXX_MRWS) {
           this.TRIAGE_ID = TRIAGE_ID;
           this.TRIAGE_TIME = TRIAGE_TIME;
           this.PATIENT_ID = PATIENT_ID;
           this.UNIDENTIFIED_PATIENT_ID = UNIDENTIFIED_PATIENT_ID;
           this.NAME = NAME;
           this.INITIAL_DIAGNOSIS = INITIAL_DIAGNOSIS;
           this.OTHER_DIAGNOSIS = OTHER_DIAGNOSIS;
           this.FINAL_DIAGNOSIS_CODE = FINAL_DIAGNOSIS_CODE;
           this.FINAL_DIAGNOSIS_NAME = FINAL_DIAGNOSIS_NAME;
           this.WAY_TO_HOSPITAL = WAY_TO_HOSPITAL;
           this.VISIT_DEPT_CODE = VISIT_DEPT_CODE;
           this.VISIT_DOCTOR_CODE = VISIT_DOCTOR_CODE;
           this.TEMP = TEMP;
           this.PULSE = PULSE;
           this.BREATH = BREATH;
           this.SYSTOLIC_PRESSURE = SYSTOLIC_PRESSURE;
           this.DIASTOLIC_PRESSURE = DIASTOLIC_PRESSURE;
           this.SPO2 = SPO2;
           this.NERVOUS_SYSTEM = NERVOUS_SYSTEM;
           this.EMERGENCY_AREA = EMERGENCY_AREA;
           this.RESCUE_BED = RESCUE_BED;
           this.PATIENT_WHITHER = PATIENT_WHITHER;
           this.CHECK_IN_TIME = CHECK_IN_TIME;
           this.START_TIME = START_TIME;
           this.END_TIME = END_TIME;
           this.MENO = MENO;
           this.IS_UNIDENTIFIED = IS_UNIDENTIFIED;
           this.UNIDENTIFIED_REASON = UNIDENTIFIED_REASON;
           this.CREATE_TIME = CREATE_TIME;
           this.TRIAGE_LEVEL = TRIAGE_LEVEL;
           this.MEWS_FQ = MEWS_FQ;
           this.BRXX_MRWS = BRXX_MRWS;
    }


    /**
     * Gets the TRIAGE_ID value for this TRIAGE_RECORDS.
     * 
     * @return TRIAGE_ID
     */
    public java.lang.String getTRIAGE_ID() {
        return TRIAGE_ID;
    }


    /**
     * Sets the TRIAGE_ID value for this TRIAGE_RECORDS.
     * 
     * @param TRIAGE_ID
     */
    public void setTRIAGE_ID(java.lang.String TRIAGE_ID) {
        this.TRIAGE_ID = TRIAGE_ID;
    }


    /**
     * Gets the TRIAGE_TIME value for this TRIAGE_RECORDS.
     * 
     * @return TRIAGE_TIME
     */
    public java.util.Calendar getTRIAGE_TIME() {
        return TRIAGE_TIME;
    }


    /**
     * Sets the TRIAGE_TIME value for this TRIAGE_RECORDS.
     * 
     * @param TRIAGE_TIME
     */
    public void setTRIAGE_TIME(java.util.Calendar TRIAGE_TIME) {
        this.TRIAGE_TIME = TRIAGE_TIME;
    }


    /**
     * Gets the PATIENT_ID value for this TRIAGE_RECORDS.
     * 
     * @return PATIENT_ID
     */
    public java.lang.String getPATIENT_ID() {
        return PATIENT_ID;
    }


    /**
     * Sets the PATIENT_ID value for this TRIAGE_RECORDS.
     * 
     * @param PATIENT_ID
     */
    public void setPATIENT_ID(java.lang.String PATIENT_ID) {
        this.PATIENT_ID = PATIENT_ID;
    }


    /**
     * Gets the UNIDENTIFIED_PATIENT_ID value for this TRIAGE_RECORDS.
     * 
     * @return UNIDENTIFIED_PATIENT_ID
     */
    public java.lang.String getUNIDENTIFIED_PATIENT_ID() {
        return UNIDENTIFIED_PATIENT_ID;
    }


    /**
     * Sets the UNIDENTIFIED_PATIENT_ID value for this TRIAGE_RECORDS.
     * 
     * @param UNIDENTIFIED_PATIENT_ID
     */
    public void setUNIDENTIFIED_PATIENT_ID(java.lang.String UNIDENTIFIED_PATIENT_ID) {
        this.UNIDENTIFIED_PATIENT_ID = UNIDENTIFIED_PATIENT_ID;
    }


    /**
     * Gets the NAME value for this TRIAGE_RECORDS.
     * 
     * @return NAME
     */
    public java.lang.String getNAME() {
        return NAME;
    }


    /**
     * Sets the NAME value for this TRIAGE_RECORDS.
     * 
     * @param NAME
     */
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }


    /**
     * Gets the INITIAL_DIAGNOSIS value for this TRIAGE_RECORDS.
     * 
     * @return INITIAL_DIAGNOSIS
     */
    public java.lang.String getINITIAL_DIAGNOSIS() {
        return INITIAL_DIAGNOSIS;
    }


    /**
     * Sets the INITIAL_DIAGNOSIS value for this TRIAGE_RECORDS.
     * 
     * @param INITIAL_DIAGNOSIS
     */
    public void setINITIAL_DIAGNOSIS(java.lang.String INITIAL_DIAGNOSIS) {
        this.INITIAL_DIAGNOSIS = INITIAL_DIAGNOSIS;
    }


    /**
     * Gets the OTHER_DIAGNOSIS value for this TRIAGE_RECORDS.
     * 
     * @return OTHER_DIAGNOSIS
     */
    public java.lang.String getOTHER_DIAGNOSIS() {
        return OTHER_DIAGNOSIS;
    }


    /**
     * Sets the OTHER_DIAGNOSIS value for this TRIAGE_RECORDS.
     * 
     * @param OTHER_DIAGNOSIS
     */
    public void setOTHER_DIAGNOSIS(java.lang.String OTHER_DIAGNOSIS) {
        this.OTHER_DIAGNOSIS = OTHER_DIAGNOSIS;
    }


    /**
     * Gets the FINAL_DIAGNOSIS_CODE value for this TRIAGE_RECORDS.
     * 
     * @return FINAL_DIAGNOSIS_CODE
     */
    public java.lang.String getFINAL_DIAGNOSIS_CODE() {
        return FINAL_DIAGNOSIS_CODE;
    }


    /**
     * Sets the FINAL_DIAGNOSIS_CODE value for this TRIAGE_RECORDS.
     * 
     * @param FINAL_DIAGNOSIS_CODE
     */
    public void setFINAL_DIAGNOSIS_CODE(java.lang.String FINAL_DIAGNOSIS_CODE) {
        this.FINAL_DIAGNOSIS_CODE = FINAL_DIAGNOSIS_CODE;
    }


    /**
     * Gets the FINAL_DIAGNOSIS_NAME value for this TRIAGE_RECORDS.
     * 
     * @return FINAL_DIAGNOSIS_NAME
     */
    public java.lang.String getFINAL_DIAGNOSIS_NAME() {
        return FINAL_DIAGNOSIS_NAME;
    }


    /**
     * Sets the FINAL_DIAGNOSIS_NAME value for this TRIAGE_RECORDS.
     * 
     * @param FINAL_DIAGNOSIS_NAME
     */
    public void setFINAL_DIAGNOSIS_NAME(java.lang.String FINAL_DIAGNOSIS_NAME) {
        this.FINAL_DIAGNOSIS_NAME = FINAL_DIAGNOSIS_NAME;
    }


    /**
     * Gets the WAY_TO_HOSPITAL value for this TRIAGE_RECORDS.
     * 
     * @return WAY_TO_HOSPITAL
     */
    public java.lang.String getWAY_TO_HOSPITAL() {
        return WAY_TO_HOSPITAL;
    }


    /**
     * Sets the WAY_TO_HOSPITAL value for this TRIAGE_RECORDS.
     * 
     * @param WAY_TO_HOSPITAL
     */
    public void setWAY_TO_HOSPITAL(java.lang.String WAY_TO_HOSPITAL) {
        this.WAY_TO_HOSPITAL = WAY_TO_HOSPITAL;
    }


    /**
     * Gets the VISIT_DEPT_CODE value for this TRIAGE_RECORDS.
     * 
     * @return VISIT_DEPT_CODE
     */
    public java.lang.String getVISIT_DEPT_CODE() {
        return VISIT_DEPT_CODE;
    }


    /**
     * Sets the VISIT_DEPT_CODE value for this TRIAGE_RECORDS.
     * 
     * @param VISIT_DEPT_CODE
     */
    public void setVISIT_DEPT_CODE(java.lang.String VISIT_DEPT_CODE) {
        this.VISIT_DEPT_CODE = VISIT_DEPT_CODE;
    }


    /**
     * Gets the VISIT_DOCTOR_CODE value for this TRIAGE_RECORDS.
     * 
     * @return VISIT_DOCTOR_CODE
     */
    public java.lang.String getVISIT_DOCTOR_CODE() {
        return VISIT_DOCTOR_CODE;
    }


    /**
     * Sets the VISIT_DOCTOR_CODE value for this TRIAGE_RECORDS.
     * 
     * @param VISIT_DOCTOR_CODE
     */
    public void setVISIT_DOCTOR_CODE(java.lang.String VISIT_DOCTOR_CODE) {
        this.VISIT_DOCTOR_CODE = VISIT_DOCTOR_CODE;
    }


    /**
     * Gets the TEMP value for this TRIAGE_RECORDS.
     * 
     * @return TEMP
     */
    public java.lang.String getTEMP() {
        return TEMP;
    }


    /**
     * Sets the TEMP value for this TRIAGE_RECORDS.
     * 
     * @param TEMP
     */
    public void setTEMP(java.lang.String TEMP) {
        this.TEMP = TEMP;
    }


    /**
     * Gets the PULSE value for this TRIAGE_RECORDS.
     * 
     * @return PULSE
     */
    public java.lang.String getPULSE() {
        return PULSE;
    }


    /**
     * Sets the PULSE value for this TRIAGE_RECORDS.
     * 
     * @param PULSE
     */
    public void setPULSE(java.lang.String PULSE) {
        this.PULSE = PULSE;
    }


    /**
     * Gets the BREATH value for this TRIAGE_RECORDS.
     * 
     * @return BREATH
     */
    public java.lang.String getBREATH() {
        return BREATH;
    }


    /**
     * Sets the BREATH value for this TRIAGE_RECORDS.
     * 
     * @param BREATH
     */
    public void setBREATH(java.lang.String BREATH) {
        this.BREATH = BREATH;
    }


    /**
     * Gets the SYSTOLIC_PRESSURE value for this TRIAGE_RECORDS.
     * 
     * @return SYSTOLIC_PRESSURE
     */
    public java.lang.String getSYSTOLIC_PRESSURE() {
        return SYSTOLIC_PRESSURE;
    }


    /**
     * Sets the SYSTOLIC_PRESSURE value for this TRIAGE_RECORDS.
     * 
     * @param SYSTOLIC_PRESSURE
     */
    public void setSYSTOLIC_PRESSURE(java.lang.String SYSTOLIC_PRESSURE) {
        this.SYSTOLIC_PRESSURE = SYSTOLIC_PRESSURE;
    }


    /**
     * Gets the DIASTOLIC_PRESSURE value for this TRIAGE_RECORDS.
     * 
     * @return DIASTOLIC_PRESSURE
     */
    public java.lang.String getDIASTOLIC_PRESSURE() {
        return DIASTOLIC_PRESSURE;
    }


    /**
     * Sets the DIASTOLIC_PRESSURE value for this TRIAGE_RECORDS.
     * 
     * @param DIASTOLIC_PRESSURE
     */
    public void setDIASTOLIC_PRESSURE(java.lang.String DIASTOLIC_PRESSURE) {
        this.DIASTOLIC_PRESSURE = DIASTOLIC_PRESSURE;
    }


    /**
     * Gets the SPO2 value for this TRIAGE_RECORDS.
     * 
     * @return SPO2
     */
    public java.lang.String getSPO2() {
        return SPO2;
    }


    /**
     * Sets the SPO2 value for this TRIAGE_RECORDS.
     * 
     * @param SPO2
     */
    public void setSPO2(java.lang.String SPO2) {
        this.SPO2 = SPO2;
    }


    /**
     * Gets the NERVOUS_SYSTEM value for this TRIAGE_RECORDS.
     * 
     * @return NERVOUS_SYSTEM
     */
    public java.lang.String getNERVOUS_SYSTEM() {
        return NERVOUS_SYSTEM;
    }


    /**
     * Sets the NERVOUS_SYSTEM value for this TRIAGE_RECORDS.
     * 
     * @param NERVOUS_SYSTEM
     */
    public void setNERVOUS_SYSTEM(java.lang.String NERVOUS_SYSTEM) {
        this.NERVOUS_SYSTEM = NERVOUS_SYSTEM;
    }


    /**
     * Gets the EMERGENCY_AREA value for this TRIAGE_RECORDS.
     * 
     * @return EMERGENCY_AREA
     */
    public java.lang.String getEMERGENCY_AREA() {
        return EMERGENCY_AREA;
    }


    /**
     * Sets the EMERGENCY_AREA value for this TRIAGE_RECORDS.
     * 
     * @param EMERGENCY_AREA
     */
    public void setEMERGENCY_AREA(java.lang.String EMERGENCY_AREA) {
        this.EMERGENCY_AREA = EMERGENCY_AREA;
    }


    /**
     * Gets the RESCUE_BED value for this TRIAGE_RECORDS.
     * 
     * @return RESCUE_BED
     */
    public java.lang.String getRESCUE_BED() {
        return RESCUE_BED;
    }


    /**
     * Sets the RESCUE_BED value for this TRIAGE_RECORDS.
     * 
     * @param RESCUE_BED
     */
    public void setRESCUE_BED(java.lang.String RESCUE_BED) {
        this.RESCUE_BED = RESCUE_BED;
    }


    /**
     * Gets the PATIENT_WHITHER value for this TRIAGE_RECORDS.
     * 
     * @return PATIENT_WHITHER
     */
    public java.lang.String getPATIENT_WHITHER() {
        return PATIENT_WHITHER;
    }


    /**
     * Sets the PATIENT_WHITHER value for this TRIAGE_RECORDS.
     * 
     * @param PATIENT_WHITHER
     */
    public void setPATIENT_WHITHER(java.lang.String PATIENT_WHITHER) {
        this.PATIENT_WHITHER = PATIENT_WHITHER;
    }


    /**
     * Gets the CHECK_IN_TIME value for this TRIAGE_RECORDS.
     * 
     * @return CHECK_IN_TIME
     */
    public java.util.Calendar getCHECK_IN_TIME() {
        return CHECK_IN_TIME;
    }


    /**
     * Sets the CHECK_IN_TIME value for this TRIAGE_RECORDS.
     * 
     * @param CHECK_IN_TIME
     */
    public void setCHECK_IN_TIME(java.util.Calendar CHECK_IN_TIME) {
        this.CHECK_IN_TIME = CHECK_IN_TIME;
    }


    /**
     * Gets the START_TIME value for this TRIAGE_RECORDS.
     * 
     * @return START_TIME
     */
    public java.util.Calendar getSTART_TIME() {
        return START_TIME;
    }


    /**
     * Sets the START_TIME value for this TRIAGE_RECORDS.
     * 
     * @param START_TIME
     */
    public void setSTART_TIME(java.util.Calendar START_TIME) {
        this.START_TIME = START_TIME;
    }


    /**
     * Gets the END_TIME value for this TRIAGE_RECORDS.
     * 
     * @return END_TIME
     */
    public java.util.Calendar getEND_TIME() {
        return END_TIME;
    }


    /**
     * Sets the END_TIME value for this TRIAGE_RECORDS.
     * 
     * @param END_TIME
     */
    public void setEND_TIME(java.util.Calendar END_TIME) {
        this.END_TIME = END_TIME;
    }


    /**
     * Gets the MENO value for this TRIAGE_RECORDS.
     * 
     * @return MENO
     */
    public java.lang.String getMENO() {
        return MENO;
    }


    /**
     * Sets the MENO value for this TRIAGE_RECORDS.
     * 
     * @param MENO
     */
    public void setMENO(java.lang.String MENO) {
        this.MENO = MENO;
    }


    /**
     * Gets the IS_UNIDENTIFIED value for this TRIAGE_RECORDS.
     * 
     * @return IS_UNIDENTIFIED
     */
    public java.lang.String getIS_UNIDENTIFIED() {
        return IS_UNIDENTIFIED;
    }


    /**
     * Sets the IS_UNIDENTIFIED value for this TRIAGE_RECORDS.
     * 
     * @param IS_UNIDENTIFIED
     */
    public void setIS_UNIDENTIFIED(java.lang.String IS_UNIDENTIFIED) {
        this.IS_UNIDENTIFIED = IS_UNIDENTIFIED;
    }


    /**
     * Gets the UNIDENTIFIED_REASON value for this TRIAGE_RECORDS.
     * 
     * @return UNIDENTIFIED_REASON
     */
    public java.lang.String getUNIDENTIFIED_REASON() {
        return UNIDENTIFIED_REASON;
    }


    /**
     * Sets the UNIDENTIFIED_REASON value for this TRIAGE_RECORDS.
     * 
     * @param UNIDENTIFIED_REASON
     */
    public void setUNIDENTIFIED_REASON(java.lang.String UNIDENTIFIED_REASON) {
        this.UNIDENTIFIED_REASON = UNIDENTIFIED_REASON;
    }


    /**
     * Gets the CREATE_TIME value for this TRIAGE_RECORDS.
     * 
     * @return CREATE_TIME
     */
    public java.util.Calendar getCREATE_TIME() {
        return CREATE_TIME;
    }


    /**
     * Sets the CREATE_TIME value for this TRIAGE_RECORDS.
     * 
     * @param CREATE_TIME
     */
    public void setCREATE_TIME(java.util.Calendar CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }


    /**
     * Gets the TRIAGE_LEVEL value for this TRIAGE_RECORDS.
     * 
     * @return TRIAGE_LEVEL
     */
    public java.lang.String getTRIAGE_LEVEL() {
        return TRIAGE_LEVEL;
    }


    /**
     * Sets the TRIAGE_LEVEL value for this TRIAGE_RECORDS.
     * 
     * @param TRIAGE_LEVEL
     */
    public void setTRIAGE_LEVEL(java.lang.String TRIAGE_LEVEL) {
        this.TRIAGE_LEVEL = TRIAGE_LEVEL;
    }


    /**
     * Gets the MEWS_FQ value for this TRIAGE_RECORDS.
     * 
     * @return MEWS_FQ
     */
    public java.lang.String getMEWS_FQ() {
        return MEWS_FQ;
    }


    /**
     * Sets the MEWS_FQ value for this TRIAGE_RECORDS.
     * 
     * @param MEWS_FQ
     */
    public void setMEWS_FQ(java.lang.String MEWS_FQ) {
        this.MEWS_FQ = MEWS_FQ;
    }


    /**
     * Gets the BRXX_MRWS value for this TRIAGE_RECORDS.
     * 
     * @return BRXX_MRWS
     */
    public java.lang.String getBRXX_MRWS() {
        return BRXX_MRWS;
    }


    /**
     * Sets the BRXX_MRWS value for this TRIAGE_RECORDS.
     * 
     * @param BRXX_MRWS
     */
    public void setBRXX_MRWS(java.lang.String BRXX_MRWS) {
        this.BRXX_MRWS = BRXX_MRWS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TRIAGE_RECORDS)) return false;
        TRIAGE_RECORDS other = (TRIAGE_RECORDS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TRIAGE_ID==null && other.getTRIAGE_ID()==null) || 
             (this.TRIAGE_ID!=null &&
              this.TRIAGE_ID.equals(other.getTRIAGE_ID()))) &&
            ((this.TRIAGE_TIME==null && other.getTRIAGE_TIME()==null) || 
             (this.TRIAGE_TIME!=null &&
              this.TRIAGE_TIME.equals(other.getTRIAGE_TIME()))) &&
            ((this.PATIENT_ID==null && other.getPATIENT_ID()==null) || 
             (this.PATIENT_ID!=null &&
              this.PATIENT_ID.equals(other.getPATIENT_ID()))) &&
            ((this.UNIDENTIFIED_PATIENT_ID==null && other.getUNIDENTIFIED_PATIENT_ID()==null) || 
             (this.UNIDENTIFIED_PATIENT_ID!=null &&
              this.UNIDENTIFIED_PATIENT_ID.equals(other.getUNIDENTIFIED_PATIENT_ID()))) &&
            ((this.NAME==null && other.getNAME()==null) || 
             (this.NAME!=null &&
              this.NAME.equals(other.getNAME()))) &&
            ((this.INITIAL_DIAGNOSIS==null && other.getINITIAL_DIAGNOSIS()==null) || 
             (this.INITIAL_DIAGNOSIS!=null &&
              this.INITIAL_DIAGNOSIS.equals(other.getINITIAL_DIAGNOSIS()))) &&
            ((this.OTHER_DIAGNOSIS==null && other.getOTHER_DIAGNOSIS()==null) || 
             (this.OTHER_DIAGNOSIS!=null &&
              this.OTHER_DIAGNOSIS.equals(other.getOTHER_DIAGNOSIS()))) &&
            ((this.FINAL_DIAGNOSIS_CODE==null && other.getFINAL_DIAGNOSIS_CODE()==null) || 
             (this.FINAL_DIAGNOSIS_CODE!=null &&
              this.FINAL_DIAGNOSIS_CODE.equals(other.getFINAL_DIAGNOSIS_CODE()))) &&
            ((this.FINAL_DIAGNOSIS_NAME==null && other.getFINAL_DIAGNOSIS_NAME()==null) || 
             (this.FINAL_DIAGNOSIS_NAME!=null &&
              this.FINAL_DIAGNOSIS_NAME.equals(other.getFINAL_DIAGNOSIS_NAME()))) &&
            ((this.WAY_TO_HOSPITAL==null && other.getWAY_TO_HOSPITAL()==null) || 
             (this.WAY_TO_HOSPITAL!=null &&
              this.WAY_TO_HOSPITAL.equals(other.getWAY_TO_HOSPITAL()))) &&
            ((this.VISIT_DEPT_CODE==null && other.getVISIT_DEPT_CODE()==null) || 
             (this.VISIT_DEPT_CODE!=null &&
              this.VISIT_DEPT_CODE.equals(other.getVISIT_DEPT_CODE()))) &&
            ((this.VISIT_DOCTOR_CODE==null && other.getVISIT_DOCTOR_CODE()==null) || 
             (this.VISIT_DOCTOR_CODE!=null &&
              this.VISIT_DOCTOR_CODE.equals(other.getVISIT_DOCTOR_CODE()))) &&
            ((this.TEMP==null && other.getTEMP()==null) || 
             (this.TEMP!=null &&
              this.TEMP.equals(other.getTEMP()))) &&
            ((this.PULSE==null && other.getPULSE()==null) || 
             (this.PULSE!=null &&
              this.PULSE.equals(other.getPULSE()))) &&
            ((this.BREATH==null && other.getBREATH()==null) || 
             (this.BREATH!=null &&
              this.BREATH.equals(other.getBREATH()))) &&
            ((this.SYSTOLIC_PRESSURE==null && other.getSYSTOLIC_PRESSURE()==null) || 
             (this.SYSTOLIC_PRESSURE!=null &&
              this.SYSTOLIC_PRESSURE.equals(other.getSYSTOLIC_PRESSURE()))) &&
            ((this.DIASTOLIC_PRESSURE==null && other.getDIASTOLIC_PRESSURE()==null) || 
             (this.DIASTOLIC_PRESSURE!=null &&
              this.DIASTOLIC_PRESSURE.equals(other.getDIASTOLIC_PRESSURE()))) &&
            ((this.SPO2==null && other.getSPO2()==null) || 
             (this.SPO2!=null &&
              this.SPO2.equals(other.getSPO2()))) &&
            ((this.NERVOUS_SYSTEM==null && other.getNERVOUS_SYSTEM()==null) || 
             (this.NERVOUS_SYSTEM!=null &&
              this.NERVOUS_SYSTEM.equals(other.getNERVOUS_SYSTEM()))) &&
            ((this.EMERGENCY_AREA==null && other.getEMERGENCY_AREA()==null) || 
             (this.EMERGENCY_AREA!=null &&
              this.EMERGENCY_AREA.equals(other.getEMERGENCY_AREA()))) &&
            ((this.RESCUE_BED==null && other.getRESCUE_BED()==null) || 
             (this.RESCUE_BED!=null &&
              this.RESCUE_BED.equals(other.getRESCUE_BED()))) &&
            ((this.PATIENT_WHITHER==null && other.getPATIENT_WHITHER()==null) || 
             (this.PATIENT_WHITHER!=null &&
              this.PATIENT_WHITHER.equals(other.getPATIENT_WHITHER()))) &&
            ((this.CHECK_IN_TIME==null && other.getCHECK_IN_TIME()==null) || 
             (this.CHECK_IN_TIME!=null &&
              this.CHECK_IN_TIME.equals(other.getCHECK_IN_TIME()))) &&
            ((this.START_TIME==null && other.getSTART_TIME()==null) || 
             (this.START_TIME!=null &&
              this.START_TIME.equals(other.getSTART_TIME()))) &&
            ((this.END_TIME==null && other.getEND_TIME()==null) || 
             (this.END_TIME!=null &&
              this.END_TIME.equals(other.getEND_TIME()))) &&
            ((this.MENO==null && other.getMENO()==null) || 
             (this.MENO!=null &&
              this.MENO.equals(other.getMENO()))) &&
            ((this.IS_UNIDENTIFIED==null && other.getIS_UNIDENTIFIED()==null) || 
             (this.IS_UNIDENTIFIED!=null &&
              this.IS_UNIDENTIFIED.equals(other.getIS_UNIDENTIFIED()))) &&
            ((this.UNIDENTIFIED_REASON==null && other.getUNIDENTIFIED_REASON()==null) || 
             (this.UNIDENTIFIED_REASON!=null &&
              this.UNIDENTIFIED_REASON.equals(other.getUNIDENTIFIED_REASON()))) &&
            ((this.CREATE_TIME==null && other.getCREATE_TIME()==null) || 
             (this.CREATE_TIME!=null &&
              this.CREATE_TIME.equals(other.getCREATE_TIME()))) &&
            ((this.TRIAGE_LEVEL==null && other.getTRIAGE_LEVEL()==null) || 
             (this.TRIAGE_LEVEL!=null &&
              this.TRIAGE_LEVEL.equals(other.getTRIAGE_LEVEL()))) &&
            ((this.MEWS_FQ==null && other.getMEWS_FQ()==null) || 
             (this.MEWS_FQ!=null &&
              this.MEWS_FQ.equals(other.getMEWS_FQ()))) &&
            ((this.BRXX_MRWS==null && other.getBRXX_MRWS()==null) || 
             (this.BRXX_MRWS!=null &&
              this.BRXX_MRWS.equals(other.getBRXX_MRWS())));
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
        if (getTRIAGE_ID() != null) {
            _hashCode += getTRIAGE_ID().hashCode();
        }
        if (getTRIAGE_TIME() != null) {
            _hashCode += getTRIAGE_TIME().hashCode();
        }
        if (getPATIENT_ID() != null) {
            _hashCode += getPATIENT_ID().hashCode();
        }
        if (getUNIDENTIFIED_PATIENT_ID() != null) {
            _hashCode += getUNIDENTIFIED_PATIENT_ID().hashCode();
        }
        if (getNAME() != null) {
            _hashCode += getNAME().hashCode();
        }
        if (getINITIAL_DIAGNOSIS() != null) {
            _hashCode += getINITIAL_DIAGNOSIS().hashCode();
        }
        if (getOTHER_DIAGNOSIS() != null) {
            _hashCode += getOTHER_DIAGNOSIS().hashCode();
        }
        if (getFINAL_DIAGNOSIS_CODE() != null) {
            _hashCode += getFINAL_DIAGNOSIS_CODE().hashCode();
        }
        if (getFINAL_DIAGNOSIS_NAME() != null) {
            _hashCode += getFINAL_DIAGNOSIS_NAME().hashCode();
        }
        if (getWAY_TO_HOSPITAL() != null) {
            _hashCode += getWAY_TO_HOSPITAL().hashCode();
        }
        if (getVISIT_DEPT_CODE() != null) {
            _hashCode += getVISIT_DEPT_CODE().hashCode();
        }
        if (getVISIT_DOCTOR_CODE() != null) {
            _hashCode += getVISIT_DOCTOR_CODE().hashCode();
        }
        if (getTEMP() != null) {
            _hashCode += getTEMP().hashCode();
        }
        if (getPULSE() != null) {
            _hashCode += getPULSE().hashCode();
        }
        if (getBREATH() != null) {
            _hashCode += getBREATH().hashCode();
        }
        if (getSYSTOLIC_PRESSURE() != null) {
            _hashCode += getSYSTOLIC_PRESSURE().hashCode();
        }
        if (getDIASTOLIC_PRESSURE() != null) {
            _hashCode += getDIASTOLIC_PRESSURE().hashCode();
        }
        if (getSPO2() != null) {
            _hashCode += getSPO2().hashCode();
        }
        if (getNERVOUS_SYSTEM() != null) {
            _hashCode += getNERVOUS_SYSTEM().hashCode();
        }
        if (getEMERGENCY_AREA() != null) {
            _hashCode += getEMERGENCY_AREA().hashCode();
        }
        if (getRESCUE_BED() != null) {
            _hashCode += getRESCUE_BED().hashCode();
        }
        if (getPATIENT_WHITHER() != null) {
            _hashCode += getPATIENT_WHITHER().hashCode();
        }
        if (getCHECK_IN_TIME() != null) {
            _hashCode += getCHECK_IN_TIME().hashCode();
        }
        if (getSTART_TIME() != null) {
            _hashCode += getSTART_TIME().hashCode();
        }
        if (getEND_TIME() != null) {
            _hashCode += getEND_TIME().hashCode();
        }
        if (getMENO() != null) {
            _hashCode += getMENO().hashCode();
        }
        if (getIS_UNIDENTIFIED() != null) {
            _hashCode += getIS_UNIDENTIFIED().hashCode();
        }
        if (getUNIDENTIFIED_REASON() != null) {
            _hashCode += getUNIDENTIFIED_REASON().hashCode();
        }
        if (getCREATE_TIME() != null) {
            _hashCode += getCREATE_TIME().hashCode();
        }
        if (getTRIAGE_LEVEL() != null) {
            _hashCode += getTRIAGE_LEVEL().hashCode();
        }
        if (getMEWS_FQ() != null) {
            _hashCode += getMEWS_FQ().hashCode();
        }
        if (getBRXX_MRWS() != null) {
            _hashCode += getBRXX_MRWS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TRIAGE_RECORDS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "TRIAGE_RECORDS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRIAGE_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TRIAGE_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRIAGE_TIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TRIAGE_TIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("UNIDENTIFIED_PATIENT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UNIDENTIFIED_PATIENT_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INITIAL_DIAGNOSIS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "INITIAL_DIAGNOSIS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTHER_DIAGNOSIS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OTHER_DIAGNOSIS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FINAL_DIAGNOSIS_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FINAL_DIAGNOSIS_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FINAL_DIAGNOSIS_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FINAL_DIAGNOSIS_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WAY_TO_HOSPITAL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "WAY_TO_HOSPITAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VISIT_DEPT_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "VISIT_DEPT_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VISIT_DOCTOR_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "VISIT_DOCTOR_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TEMP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TEMP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PULSE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PULSE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BREATH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BREATH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SYSTOLIC_PRESSURE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SYSTOLIC_PRESSURE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIASTOLIC_PRESSURE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DIASTOLIC_PRESSURE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPO2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SPO2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NERVOUS_SYSTEM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NERVOUS_SYSTEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMERGENCY_AREA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EMERGENCY_AREA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESCUE_BED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RESCUE_BED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PATIENT_WHITHER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PATIENT_WHITHER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHECK_IN_TIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CHECK_IN_TIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("START_TIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "START_TIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("END_TIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "END_TIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MENO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MENO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IS_UNIDENTIFIED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IS_UNIDENTIFIED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UNIDENTIFIED_REASON");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UNIDENTIFIED_REASON"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CREATE_TIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CREATE_TIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRIAGE_LEVEL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TRIAGE_LEVEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEWS_FQ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MEWS_FQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BRXX_MRWS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BRXX_MRWS"));
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
