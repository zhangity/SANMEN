/**
 * CLINIC_MASTER.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CLINIC_MASTER  implements java.io.Serializable {
    private java.lang.String CLINIC_ID;

    private java.util.Calendar VISIT_DATE;

    private java.lang.String VISIT_NO;

    private java.lang.String PATIENT_ID;

    private java.lang.String INSURANCE_TYPE;

    private java.lang.String IS_EMERGENCY;

    private java.lang.String CLINIC_STATUS;

    private java.lang.String IS_UNIDENTIFIED;

    private java.lang.String FIRST_VISIT_INDICATOR;

    private java.lang.String VISIT_DEPT_CODE;

    private java.lang.String DOCTOR_CODE;

    private java.util.Calendar CREATE_TIME;

    private java.util.Calendar UPDATE_TIME;

    private java.util.Calendar DELETE_TIME;

    private java.lang.String REGIST_ID;

    public CLINIC_MASTER() {
    }

    public CLINIC_MASTER(
           java.lang.String CLINIC_ID,
           java.util.Calendar VISIT_DATE,
           java.lang.String VISIT_NO,
           java.lang.String PATIENT_ID,
           java.lang.String INSURANCE_TYPE,
           java.lang.String IS_EMERGENCY,
           java.lang.String CLINIC_STATUS,
           java.lang.String IS_UNIDENTIFIED,
           java.lang.String FIRST_VISIT_INDICATOR,
           java.lang.String VISIT_DEPT_CODE,
           java.lang.String DOCTOR_CODE,
           java.util.Calendar CREATE_TIME,
           java.util.Calendar UPDATE_TIME,
           java.util.Calendar DELETE_TIME,
           java.lang.String REGIST_ID) {
           this.CLINIC_ID = CLINIC_ID;
           this.VISIT_DATE = VISIT_DATE;
           this.VISIT_NO = VISIT_NO;
           this.PATIENT_ID = PATIENT_ID;
           this.INSURANCE_TYPE = INSURANCE_TYPE;
           this.IS_EMERGENCY = IS_EMERGENCY;
           this.CLINIC_STATUS = CLINIC_STATUS;
           this.IS_UNIDENTIFIED = IS_UNIDENTIFIED;
           this.FIRST_VISIT_INDICATOR = FIRST_VISIT_INDICATOR;
           this.VISIT_DEPT_CODE = VISIT_DEPT_CODE;
           this.DOCTOR_CODE = DOCTOR_CODE;
           this.CREATE_TIME = CREATE_TIME;
           this.UPDATE_TIME = UPDATE_TIME;
           this.DELETE_TIME = DELETE_TIME;
           this.REGIST_ID = REGIST_ID;
    }


    /**
     * Gets the CLINIC_ID value for this CLINIC_MASTER.
     * 
     * @return CLINIC_ID
     */
    public java.lang.String getCLINIC_ID() {
        return CLINIC_ID;
    }


    /**
     * Sets the CLINIC_ID value for this CLINIC_MASTER.
     * 
     * @param CLINIC_ID
     */
    public void setCLINIC_ID(java.lang.String CLINIC_ID) {
        this.CLINIC_ID = CLINIC_ID;
    }


    /**
     * Gets the VISIT_DATE value for this CLINIC_MASTER.
     * 
     * @return VISIT_DATE
     */
    public java.util.Calendar getVISIT_DATE() {
        return VISIT_DATE;
    }


    /**
     * Sets the VISIT_DATE value for this CLINIC_MASTER.
     * 
     * @param VISIT_DATE
     */
    public void setVISIT_DATE(java.util.Calendar VISIT_DATE) {
        this.VISIT_DATE = VISIT_DATE;
    }


    /**
     * Gets the VISIT_NO value for this CLINIC_MASTER.
     * 
     * @return VISIT_NO
     */
    public java.lang.String getVISIT_NO() {
        return VISIT_NO;
    }


    /**
     * Sets the VISIT_NO value for this CLINIC_MASTER.
     * 
     * @param VISIT_NO
     */
    public void setVISIT_NO(java.lang.String VISIT_NO) {
        this.VISIT_NO = VISIT_NO;
    }


    /**
     * Gets the PATIENT_ID value for this CLINIC_MASTER.
     * 
     * @return PATIENT_ID
     */
    public java.lang.String getPATIENT_ID() {
        return PATIENT_ID;
    }


    /**
     * Sets the PATIENT_ID value for this CLINIC_MASTER.
     * 
     * @param PATIENT_ID
     */
    public void setPATIENT_ID(java.lang.String PATIENT_ID) {
        this.PATIENT_ID = PATIENT_ID;
    }


    /**
     * Gets the INSURANCE_TYPE value for this CLINIC_MASTER.
     * 
     * @return INSURANCE_TYPE
     */
    public java.lang.String getINSURANCE_TYPE() {
        return INSURANCE_TYPE;
    }


    /**
     * Sets the INSURANCE_TYPE value for this CLINIC_MASTER.
     * 
     * @param INSURANCE_TYPE
     */
    public void setINSURANCE_TYPE(java.lang.String INSURANCE_TYPE) {
        this.INSURANCE_TYPE = INSURANCE_TYPE;
    }


    /**
     * Gets the IS_EMERGENCY value for this CLINIC_MASTER.
     * 
     * @return IS_EMERGENCY
     */
    public java.lang.String getIS_EMERGENCY() {
        return IS_EMERGENCY;
    }


    /**
     * Sets the IS_EMERGENCY value for this CLINIC_MASTER.
     * 
     * @param IS_EMERGENCY
     */
    public void setIS_EMERGENCY(java.lang.String IS_EMERGENCY) {
        this.IS_EMERGENCY = IS_EMERGENCY;
    }


    /**
     * Gets the CLINIC_STATUS value for this CLINIC_MASTER.
     * 
     * @return CLINIC_STATUS
     */
    public java.lang.String getCLINIC_STATUS() {
        return CLINIC_STATUS;
    }


    /**
     * Sets the CLINIC_STATUS value for this CLINIC_MASTER.
     * 
     * @param CLINIC_STATUS
     */
    public void setCLINIC_STATUS(java.lang.String CLINIC_STATUS) {
        this.CLINIC_STATUS = CLINIC_STATUS;
    }


    /**
     * Gets the IS_UNIDENTIFIED value for this CLINIC_MASTER.
     * 
     * @return IS_UNIDENTIFIED
     */
    public java.lang.String getIS_UNIDENTIFIED() {
        return IS_UNIDENTIFIED;
    }


    /**
     * Sets the IS_UNIDENTIFIED value for this CLINIC_MASTER.
     * 
     * @param IS_UNIDENTIFIED
     */
    public void setIS_UNIDENTIFIED(java.lang.String IS_UNIDENTIFIED) {
        this.IS_UNIDENTIFIED = IS_UNIDENTIFIED;
    }


    /**
     * Gets the FIRST_VISIT_INDICATOR value for this CLINIC_MASTER.
     * 
     * @return FIRST_VISIT_INDICATOR
     */
    public java.lang.String getFIRST_VISIT_INDICATOR() {
        return FIRST_VISIT_INDICATOR;
    }


    /**
     * Sets the FIRST_VISIT_INDICATOR value for this CLINIC_MASTER.
     * 
     * @param FIRST_VISIT_INDICATOR
     */
    public void setFIRST_VISIT_INDICATOR(java.lang.String FIRST_VISIT_INDICATOR) {
        this.FIRST_VISIT_INDICATOR = FIRST_VISIT_INDICATOR;
    }


    /**
     * Gets the VISIT_DEPT_CODE value for this CLINIC_MASTER.
     * 
     * @return VISIT_DEPT_CODE
     */
    public java.lang.String getVISIT_DEPT_CODE() {
        return VISIT_DEPT_CODE;
    }


    /**
     * Sets the VISIT_DEPT_CODE value for this CLINIC_MASTER.
     * 
     * @param VISIT_DEPT_CODE
     */
    public void setVISIT_DEPT_CODE(java.lang.String VISIT_DEPT_CODE) {
        this.VISIT_DEPT_CODE = VISIT_DEPT_CODE;
    }


    /**
     * Gets the DOCTOR_CODE value for this CLINIC_MASTER.
     * 
     * @return DOCTOR_CODE
     */
    public java.lang.String getDOCTOR_CODE() {
        return DOCTOR_CODE;
    }


    /**
     * Sets the DOCTOR_CODE value for this CLINIC_MASTER.
     * 
     * @param DOCTOR_CODE
     */
    public void setDOCTOR_CODE(java.lang.String DOCTOR_CODE) {
        this.DOCTOR_CODE = DOCTOR_CODE;
    }


    /**
     * Gets the CREATE_TIME value for this CLINIC_MASTER.
     * 
     * @return CREATE_TIME
     */
    public java.util.Calendar getCREATE_TIME() {
        return CREATE_TIME;
    }


    /**
     * Sets the CREATE_TIME value for this CLINIC_MASTER.
     * 
     * @param CREATE_TIME
     */
    public void setCREATE_TIME(java.util.Calendar CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }


    /**
     * Gets the UPDATE_TIME value for this CLINIC_MASTER.
     * 
     * @return UPDATE_TIME
     */
    public java.util.Calendar getUPDATE_TIME() {
        return UPDATE_TIME;
    }


    /**
     * Sets the UPDATE_TIME value for this CLINIC_MASTER.
     * 
     * @param UPDATE_TIME
     */
    public void setUPDATE_TIME(java.util.Calendar UPDATE_TIME) {
        this.UPDATE_TIME = UPDATE_TIME;
    }


    /**
     * Gets the DELETE_TIME value for this CLINIC_MASTER.
     * 
     * @return DELETE_TIME
     */
    public java.util.Calendar getDELETE_TIME() {
        return DELETE_TIME;
    }


    /**
     * Sets the DELETE_TIME value for this CLINIC_MASTER.
     * 
     * @param DELETE_TIME
     */
    public void setDELETE_TIME(java.util.Calendar DELETE_TIME) {
        this.DELETE_TIME = DELETE_TIME;
    }


    /**
     * Gets the REGIST_ID value for this CLINIC_MASTER.
     * 
     * @return REGIST_ID
     */
    public java.lang.String getREGIST_ID() {
        return REGIST_ID;
    }


    /**
     * Sets the REGIST_ID value for this CLINIC_MASTER.
     * 
     * @param REGIST_ID
     */
    public void setREGIST_ID(java.lang.String REGIST_ID) {
        this.REGIST_ID = REGIST_ID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CLINIC_MASTER)) return false;
        CLINIC_MASTER other = (CLINIC_MASTER) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CLINIC_ID==null && other.getCLINIC_ID()==null) || 
             (this.CLINIC_ID!=null &&
              this.CLINIC_ID.equals(other.getCLINIC_ID()))) &&
            ((this.VISIT_DATE==null && other.getVISIT_DATE()==null) || 
             (this.VISIT_DATE!=null &&
              this.VISIT_DATE.equals(other.getVISIT_DATE()))) &&
            ((this.VISIT_NO==null && other.getVISIT_NO()==null) || 
             (this.VISIT_NO!=null &&
              this.VISIT_NO.equals(other.getVISIT_NO()))) &&
            ((this.PATIENT_ID==null && other.getPATIENT_ID()==null) || 
             (this.PATIENT_ID!=null &&
              this.PATIENT_ID.equals(other.getPATIENT_ID()))) &&
            ((this.INSURANCE_TYPE==null && other.getINSURANCE_TYPE()==null) || 
             (this.INSURANCE_TYPE!=null &&
              this.INSURANCE_TYPE.equals(other.getINSURANCE_TYPE()))) &&
            ((this.IS_EMERGENCY==null && other.getIS_EMERGENCY()==null) || 
             (this.IS_EMERGENCY!=null &&
              this.IS_EMERGENCY.equals(other.getIS_EMERGENCY()))) &&
            ((this.CLINIC_STATUS==null && other.getCLINIC_STATUS()==null) || 
             (this.CLINIC_STATUS!=null &&
              this.CLINIC_STATUS.equals(other.getCLINIC_STATUS()))) &&
            ((this.IS_UNIDENTIFIED==null && other.getIS_UNIDENTIFIED()==null) || 
             (this.IS_UNIDENTIFIED!=null &&
              this.IS_UNIDENTIFIED.equals(other.getIS_UNIDENTIFIED()))) &&
            ((this.FIRST_VISIT_INDICATOR==null && other.getFIRST_VISIT_INDICATOR()==null) || 
             (this.FIRST_VISIT_INDICATOR!=null &&
              this.FIRST_VISIT_INDICATOR.equals(other.getFIRST_VISIT_INDICATOR()))) &&
            ((this.VISIT_DEPT_CODE==null && other.getVISIT_DEPT_CODE()==null) || 
             (this.VISIT_DEPT_CODE!=null &&
              this.VISIT_DEPT_CODE.equals(other.getVISIT_DEPT_CODE()))) &&
            ((this.DOCTOR_CODE==null && other.getDOCTOR_CODE()==null) || 
             (this.DOCTOR_CODE!=null &&
              this.DOCTOR_CODE.equals(other.getDOCTOR_CODE()))) &&
            ((this.CREATE_TIME==null && other.getCREATE_TIME()==null) || 
             (this.CREATE_TIME!=null &&
              this.CREATE_TIME.equals(other.getCREATE_TIME()))) &&
            ((this.UPDATE_TIME==null && other.getUPDATE_TIME()==null) || 
             (this.UPDATE_TIME!=null &&
              this.UPDATE_TIME.equals(other.getUPDATE_TIME()))) &&
            ((this.DELETE_TIME==null && other.getDELETE_TIME()==null) || 
             (this.DELETE_TIME!=null &&
              this.DELETE_TIME.equals(other.getDELETE_TIME()))) &&
            ((this.REGIST_ID==null && other.getREGIST_ID()==null) || 
             (this.REGIST_ID!=null &&
              this.REGIST_ID.equals(other.getREGIST_ID())));
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
        if (getCLINIC_ID() != null) {
            _hashCode += getCLINIC_ID().hashCode();
        }
        if (getVISIT_DATE() != null) {
            _hashCode += getVISIT_DATE().hashCode();
        }
        if (getVISIT_NO() != null) {
            _hashCode += getVISIT_NO().hashCode();
        }
        if (getPATIENT_ID() != null) {
            _hashCode += getPATIENT_ID().hashCode();
        }
        if (getINSURANCE_TYPE() != null) {
            _hashCode += getINSURANCE_TYPE().hashCode();
        }
        if (getIS_EMERGENCY() != null) {
            _hashCode += getIS_EMERGENCY().hashCode();
        }
        if (getCLINIC_STATUS() != null) {
            _hashCode += getCLINIC_STATUS().hashCode();
        }
        if (getIS_UNIDENTIFIED() != null) {
            _hashCode += getIS_UNIDENTIFIED().hashCode();
        }
        if (getFIRST_VISIT_INDICATOR() != null) {
            _hashCode += getFIRST_VISIT_INDICATOR().hashCode();
        }
        if (getVISIT_DEPT_CODE() != null) {
            _hashCode += getVISIT_DEPT_CODE().hashCode();
        }
        if (getDOCTOR_CODE() != null) {
            _hashCode += getDOCTOR_CODE().hashCode();
        }
        if (getCREATE_TIME() != null) {
            _hashCode += getCREATE_TIME().hashCode();
        }
        if (getUPDATE_TIME() != null) {
            _hashCode += getUPDATE_TIME().hashCode();
        }
        if (getDELETE_TIME() != null) {
            _hashCode += getDELETE_TIME().hashCode();
        }
        if (getREGIST_ID() != null) {
            _hashCode += getREGIST_ID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CLINIC_MASTER.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "CLINIC_MASTER"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLINIC_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CLINIC_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VISIT_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "VISIT_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("INSURANCE_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "INSURANCE_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IS_EMERGENCY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IS_EMERGENCY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLINIC_STATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CLINIC_STATUS"));
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
        elemField.setFieldName("FIRST_VISIT_INDICATOR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FIRST_VISIT_INDICATOR"));
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
        elemField.setFieldName("DOCTOR_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DOCTOR_CODE"));
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
        elemField.setFieldName("UPDATE_TIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UPDATE_TIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DELETE_TIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DELETE_TIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGIST_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "REGIST_ID"));
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
