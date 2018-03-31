/**
 * EditLSZD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class EditLSZD  implements java.io.Serializable {
    private java.lang.String SERIAL_ID;

    private java.lang.String DIAGNOSIS_CODE;

    private java.lang.String DIAGNOSIS_NAME;

    private java.lang.String JBXH;

    private java.lang.String USER_CODE;

    private java.lang.String USER_NAME;

    public EditLSZD() {
    }

    public EditLSZD(
           java.lang.String SERIAL_ID,
           java.lang.String DIAGNOSIS_CODE,
           java.lang.String DIAGNOSIS_NAME,
           java.lang.String JBXH,
           java.lang.String USER_CODE,
           java.lang.String USER_NAME) {
           this.SERIAL_ID = SERIAL_ID;
           this.DIAGNOSIS_CODE = DIAGNOSIS_CODE;
           this.DIAGNOSIS_NAME = DIAGNOSIS_NAME;
           this.JBXH = JBXH;
           this.USER_CODE = USER_CODE;
           this.USER_NAME = USER_NAME;
    }


    /**
     * Gets the SERIAL_ID value for this EditLSZD.
     * 
     * @return SERIAL_ID
     */
    public java.lang.String getSERIAL_ID() {
        return SERIAL_ID;
    }


    /**
     * Sets the SERIAL_ID value for this EditLSZD.
     * 
     * @param SERIAL_ID
     */
    public void setSERIAL_ID(java.lang.String SERIAL_ID) {
        this.SERIAL_ID = SERIAL_ID;
    }


    /**
     * Gets the DIAGNOSIS_CODE value for this EditLSZD.
     * 
     * @return DIAGNOSIS_CODE
     */
    public java.lang.String getDIAGNOSIS_CODE() {
        return DIAGNOSIS_CODE;
    }


    /**
     * Sets the DIAGNOSIS_CODE value for this EditLSZD.
     * 
     * @param DIAGNOSIS_CODE
     */
    public void setDIAGNOSIS_CODE(java.lang.String DIAGNOSIS_CODE) {
        this.DIAGNOSIS_CODE = DIAGNOSIS_CODE;
    }


    /**
     * Gets the DIAGNOSIS_NAME value for this EditLSZD.
     * 
     * @return DIAGNOSIS_NAME
     */
    public java.lang.String getDIAGNOSIS_NAME() {
        return DIAGNOSIS_NAME;
    }


    /**
     * Sets the DIAGNOSIS_NAME value for this EditLSZD.
     * 
     * @param DIAGNOSIS_NAME
     */
    public void setDIAGNOSIS_NAME(java.lang.String DIAGNOSIS_NAME) {
        this.DIAGNOSIS_NAME = DIAGNOSIS_NAME;
    }


    /**
     * Gets the JBXH value for this EditLSZD.
     * 
     * @return JBXH
     */
    public java.lang.String getJBXH() {
        return JBXH;
    }


    /**
     * Sets the JBXH value for this EditLSZD.
     * 
     * @param JBXH
     */
    public void setJBXH(java.lang.String JBXH) {
        this.JBXH = JBXH;
    }


    /**
     * Gets the USER_CODE value for this EditLSZD.
     * 
     * @return USER_CODE
     */
    public java.lang.String getUSER_CODE() {
        return USER_CODE;
    }


    /**
     * Sets the USER_CODE value for this EditLSZD.
     * 
     * @param USER_CODE
     */
    public void setUSER_CODE(java.lang.String USER_CODE) {
        this.USER_CODE = USER_CODE;
    }


    /**
     * Gets the USER_NAME value for this EditLSZD.
     * 
     * @return USER_NAME
     */
    public java.lang.String getUSER_NAME() {
        return USER_NAME;
    }


    /**
     * Sets the USER_NAME value for this EditLSZD.
     * 
     * @param USER_NAME
     */
    public void setUSER_NAME(java.lang.String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EditLSZD)) return false;
        EditLSZD other = (EditLSZD) obj;
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
            ((this.DIAGNOSIS_CODE==null && other.getDIAGNOSIS_CODE()==null) || 
             (this.DIAGNOSIS_CODE!=null &&
              this.DIAGNOSIS_CODE.equals(other.getDIAGNOSIS_CODE()))) &&
            ((this.DIAGNOSIS_NAME==null && other.getDIAGNOSIS_NAME()==null) || 
             (this.DIAGNOSIS_NAME!=null &&
              this.DIAGNOSIS_NAME.equals(other.getDIAGNOSIS_NAME()))) &&
            ((this.JBXH==null && other.getJBXH()==null) || 
             (this.JBXH!=null &&
              this.JBXH.equals(other.getJBXH()))) &&
            ((this.USER_CODE==null && other.getUSER_CODE()==null) || 
             (this.USER_CODE!=null &&
              this.USER_CODE.equals(other.getUSER_CODE()))) &&
            ((this.USER_NAME==null && other.getUSER_NAME()==null) || 
             (this.USER_NAME!=null &&
              this.USER_NAME.equals(other.getUSER_NAME())));
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
        if (getDIAGNOSIS_CODE() != null) {
            _hashCode += getDIAGNOSIS_CODE().hashCode();
        }
        if (getDIAGNOSIS_NAME() != null) {
            _hashCode += getDIAGNOSIS_NAME().hashCode();
        }
        if (getJBXH() != null) {
            _hashCode += getJBXH().hashCode();
        }
        if (getUSER_CODE() != null) {
            _hashCode += getUSER_CODE().hashCode();
        }
        if (getUSER_NAME() != null) {
            _hashCode += getUSER_NAME().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EditLSZD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">EditLSZD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SERIAL_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SERIAL_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIAGNOSIS_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DIAGNOSIS_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIAGNOSIS_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DIAGNOSIS_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JBXH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "JBXH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USER_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "USER_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USER_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "USER_NAME"));
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
