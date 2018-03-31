/**
 * PATIENT_RELATIVE_INFO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class PATIENT_RELATIVE_INFO  implements java.io.Serializable {
    private java.lang.String SERIAL_ID;

    private java.lang.String PATIENT_ID;

    private java.lang.String RELATION_NAME;

    private java.lang.String RELATIONSHIP;

    private java.lang.String RELATION_ADDR;

    private java.lang.String RELATION_ZIP_CODE;

    private java.lang.String RELATION_PHONE;

    private int IS_USED;

    private java.util.Calendar CREATE_TIME;

    private java.util.Calendar UPDATE_TIME;

    private java.util.Calendar DELETE_TIME;

    public PATIENT_RELATIVE_INFO() {
    }

    public PATIENT_RELATIVE_INFO(
           java.lang.String SERIAL_ID,
           java.lang.String PATIENT_ID,
           java.lang.String RELATION_NAME,
           java.lang.String RELATIONSHIP,
           java.lang.String RELATION_ADDR,
           java.lang.String RELATION_ZIP_CODE,
           java.lang.String RELATION_PHONE,
           int IS_USED,
           java.util.Calendar CREATE_TIME,
           java.util.Calendar UPDATE_TIME,
           java.util.Calendar DELETE_TIME) {
           this.SERIAL_ID = SERIAL_ID;
           this.PATIENT_ID = PATIENT_ID;
           this.RELATION_NAME = RELATION_NAME;
           this.RELATIONSHIP = RELATIONSHIP;
           this.RELATION_ADDR = RELATION_ADDR;
           this.RELATION_ZIP_CODE = RELATION_ZIP_CODE;
           this.RELATION_PHONE = RELATION_PHONE;
           this.IS_USED = IS_USED;
           this.CREATE_TIME = CREATE_TIME;
           this.UPDATE_TIME = UPDATE_TIME;
           this.DELETE_TIME = DELETE_TIME;
    }


    /**
     * Gets the SERIAL_ID value for this PATIENT_RELATIVE_INFO.
     * 
     * @return SERIAL_ID
     */
    public java.lang.String getSERIAL_ID() {
        return SERIAL_ID;
    }


    /**
     * Sets the SERIAL_ID value for this PATIENT_RELATIVE_INFO.
     * 
     * @param SERIAL_ID
     */
    public void setSERIAL_ID(java.lang.String SERIAL_ID) {
        this.SERIAL_ID = SERIAL_ID;
    }


    /**
     * Gets the PATIENT_ID value for this PATIENT_RELATIVE_INFO.
     * 
     * @return PATIENT_ID
     */
    public java.lang.String getPATIENT_ID() {
        return PATIENT_ID;
    }


    /**
     * Sets the PATIENT_ID value for this PATIENT_RELATIVE_INFO.
     * 
     * @param PATIENT_ID
     */
    public void setPATIENT_ID(java.lang.String PATIENT_ID) {
        this.PATIENT_ID = PATIENT_ID;
    }


    /**
     * Gets the RELATION_NAME value for this PATIENT_RELATIVE_INFO.
     * 
     * @return RELATION_NAME
     */
    public java.lang.String getRELATION_NAME() {
        return RELATION_NAME;
    }


    /**
     * Sets the RELATION_NAME value for this PATIENT_RELATIVE_INFO.
     * 
     * @param RELATION_NAME
     */
    public void setRELATION_NAME(java.lang.String RELATION_NAME) {
        this.RELATION_NAME = RELATION_NAME;
    }


    /**
     * Gets the RELATIONSHIP value for this PATIENT_RELATIVE_INFO.
     * 
     * @return RELATIONSHIP
     */
    public java.lang.String getRELATIONSHIP() {
        return RELATIONSHIP;
    }


    /**
     * Sets the RELATIONSHIP value for this PATIENT_RELATIVE_INFO.
     * 
     * @param RELATIONSHIP
     */
    public void setRELATIONSHIP(java.lang.String RELATIONSHIP) {
        this.RELATIONSHIP = RELATIONSHIP;
    }


    /**
     * Gets the RELATION_ADDR value for this PATIENT_RELATIVE_INFO.
     * 
     * @return RELATION_ADDR
     */
    public java.lang.String getRELATION_ADDR() {
        return RELATION_ADDR;
    }


    /**
     * Sets the RELATION_ADDR value for this PATIENT_RELATIVE_INFO.
     * 
     * @param RELATION_ADDR
     */
    public void setRELATION_ADDR(java.lang.String RELATION_ADDR) {
        this.RELATION_ADDR = RELATION_ADDR;
    }


    /**
     * Gets the RELATION_ZIP_CODE value for this PATIENT_RELATIVE_INFO.
     * 
     * @return RELATION_ZIP_CODE
     */
    public java.lang.String getRELATION_ZIP_CODE() {
        return RELATION_ZIP_CODE;
    }


    /**
     * Sets the RELATION_ZIP_CODE value for this PATIENT_RELATIVE_INFO.
     * 
     * @param RELATION_ZIP_CODE
     */
    public void setRELATION_ZIP_CODE(java.lang.String RELATION_ZIP_CODE) {
        this.RELATION_ZIP_CODE = RELATION_ZIP_CODE;
    }


    /**
     * Gets the RELATION_PHONE value for this PATIENT_RELATIVE_INFO.
     * 
     * @return RELATION_PHONE
     */
    public java.lang.String getRELATION_PHONE() {
        return RELATION_PHONE;
    }


    /**
     * Sets the RELATION_PHONE value for this PATIENT_RELATIVE_INFO.
     * 
     * @param RELATION_PHONE
     */
    public void setRELATION_PHONE(java.lang.String RELATION_PHONE) {
        this.RELATION_PHONE = RELATION_PHONE;
    }


    /**
     * Gets the IS_USED value for this PATIENT_RELATIVE_INFO.
     * 
     * @return IS_USED
     */
    public int getIS_USED() {
        return IS_USED;
    }


    /**
     * Sets the IS_USED value for this PATIENT_RELATIVE_INFO.
     * 
     * @param IS_USED
     */
    public void setIS_USED(int IS_USED) {
        this.IS_USED = IS_USED;
    }


    /**
     * Gets the CREATE_TIME value for this PATIENT_RELATIVE_INFO.
     * 
     * @return CREATE_TIME
     */
    public java.util.Calendar getCREATE_TIME() {
        return CREATE_TIME;
    }


    /**
     * Sets the CREATE_TIME value for this PATIENT_RELATIVE_INFO.
     * 
     * @param CREATE_TIME
     */
    public void setCREATE_TIME(java.util.Calendar CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }


    /**
     * Gets the UPDATE_TIME value for this PATIENT_RELATIVE_INFO.
     * 
     * @return UPDATE_TIME
     */
    public java.util.Calendar getUPDATE_TIME() {
        return UPDATE_TIME;
    }


    /**
     * Sets the UPDATE_TIME value for this PATIENT_RELATIVE_INFO.
     * 
     * @param UPDATE_TIME
     */
    public void setUPDATE_TIME(java.util.Calendar UPDATE_TIME) {
        this.UPDATE_TIME = UPDATE_TIME;
    }


    /**
     * Gets the DELETE_TIME value for this PATIENT_RELATIVE_INFO.
     * 
     * @return DELETE_TIME
     */
    public java.util.Calendar getDELETE_TIME() {
        return DELETE_TIME;
    }


    /**
     * Sets the DELETE_TIME value for this PATIENT_RELATIVE_INFO.
     * 
     * @param DELETE_TIME
     */
    public void setDELETE_TIME(java.util.Calendar DELETE_TIME) {
        this.DELETE_TIME = DELETE_TIME;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PATIENT_RELATIVE_INFO)) return false;
        PATIENT_RELATIVE_INFO other = (PATIENT_RELATIVE_INFO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SERIAL_ID==null && other.getSERIAL_ID()==null) || 
             (this.SERIAL_ID!=null &&
              this.SERIAL_ID.equals(other.getSERIAL_ID()))) &&
            ((this.PATIENT_ID==null && other.getPATIENT_ID()==null) || 
             (this.PATIENT_ID!=null &&
              this.PATIENT_ID.equals(other.getPATIENT_ID()))) &&
            ((this.RELATION_NAME==null && other.getRELATION_NAME()==null) || 
             (this.RELATION_NAME!=null &&
              this.RELATION_NAME.equals(other.getRELATION_NAME()))) &&
            ((this.RELATIONSHIP==null && other.getRELATIONSHIP()==null) || 
             (this.RELATIONSHIP!=null &&
              this.RELATIONSHIP.equals(other.getRELATIONSHIP()))) &&
            ((this.RELATION_ADDR==null && other.getRELATION_ADDR()==null) || 
             (this.RELATION_ADDR!=null &&
              this.RELATION_ADDR.equals(other.getRELATION_ADDR()))) &&
            ((this.RELATION_ZIP_CODE==null && other.getRELATION_ZIP_CODE()==null) || 
             (this.RELATION_ZIP_CODE!=null &&
              this.RELATION_ZIP_CODE.equals(other.getRELATION_ZIP_CODE()))) &&
            ((this.RELATION_PHONE==null && other.getRELATION_PHONE()==null) || 
             (this.RELATION_PHONE!=null &&
              this.RELATION_PHONE.equals(other.getRELATION_PHONE()))) &&
            this.IS_USED == other.getIS_USED() &&
            ((this.CREATE_TIME==null && other.getCREATE_TIME()==null) || 
             (this.CREATE_TIME!=null &&
              this.CREATE_TIME.equals(other.getCREATE_TIME()))) &&
            ((this.UPDATE_TIME==null && other.getUPDATE_TIME()==null) || 
             (this.UPDATE_TIME!=null &&
              this.UPDATE_TIME.equals(other.getUPDATE_TIME()))) &&
            ((this.DELETE_TIME==null && other.getDELETE_TIME()==null) || 
             (this.DELETE_TIME!=null &&
              this.DELETE_TIME.equals(other.getDELETE_TIME())));
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
        if (getSERIAL_ID() != null) {
            _hashCode += getSERIAL_ID().hashCode();
        }
        if (getPATIENT_ID() != null) {
            _hashCode += getPATIENT_ID().hashCode();
        }
        if (getRELATION_NAME() != null) {
            _hashCode += getRELATION_NAME().hashCode();
        }
        if (getRELATIONSHIP() != null) {
            _hashCode += getRELATIONSHIP().hashCode();
        }
        if (getRELATION_ADDR() != null) {
            _hashCode += getRELATION_ADDR().hashCode();
        }
        if (getRELATION_ZIP_CODE() != null) {
            _hashCode += getRELATION_ZIP_CODE().hashCode();
        }
        if (getRELATION_PHONE() != null) {
            _hashCode += getRELATION_PHONE().hashCode();
        }
        _hashCode += getIS_USED();
        if (getCREATE_TIME() != null) {
            _hashCode += getCREATE_TIME().hashCode();
        }
        if (getUPDATE_TIME() != null) {
            _hashCode += getUPDATE_TIME().hashCode();
        }
        if (getDELETE_TIME() != null) {
            _hashCode += getDELETE_TIME().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PATIENT_RELATIVE_INFO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "PATIENT_RELATIVE_INFO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SERIAL_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SERIAL_ID"));
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
        elemField.setFieldName("RELATION_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RELATION_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RELATIONSHIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RELATIONSHIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RELATION_ADDR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RELATION_ADDR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RELATION_ZIP_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RELATION_ZIP_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RELATION_PHONE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RELATION_PHONE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IS_USED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IS_USED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
