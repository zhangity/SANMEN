/**
 * GetMzbrjbxx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzbrjbxx  implements java.io.Serializable {
    private java.lang.String CARD_NO;

    private java.lang.String DEPT_CODE;

    private java.lang.String DOCTOR_CODE;

    public GetMzbrjbxx() {
    }

    public GetMzbrjbxx(
           java.lang.String CARD_NO,
           java.lang.String DEPT_CODE,
           java.lang.String DOCTOR_CODE) {
           this.CARD_NO = CARD_NO;
           this.DEPT_CODE = DEPT_CODE;
           this.DOCTOR_CODE = DOCTOR_CODE;
    }


    /**
     * Gets the CARD_NO value for this GetMzbrjbxx.
     * 
     * @return CARD_NO
     */
    public java.lang.String getCARD_NO() {
        return CARD_NO;
    }


    /**
     * Sets the CARD_NO value for this GetMzbrjbxx.
     * 
     * @param CARD_NO
     */
    public void setCARD_NO(java.lang.String CARD_NO) {
        this.CARD_NO = CARD_NO;
    }


    /**
     * Gets the DEPT_CODE value for this GetMzbrjbxx.
     * 
     * @return DEPT_CODE
     */
    public java.lang.String getDEPT_CODE() {
        return DEPT_CODE;
    }


    /**
     * Sets the DEPT_CODE value for this GetMzbrjbxx.
     * 
     * @param DEPT_CODE
     */
    public void setDEPT_CODE(java.lang.String DEPT_CODE) {
        this.DEPT_CODE = DEPT_CODE;
    }


    /**
     * Gets the DOCTOR_CODE value for this GetMzbrjbxx.
     * 
     * @return DOCTOR_CODE
     */
    public java.lang.String getDOCTOR_CODE() {
        return DOCTOR_CODE;
    }


    /**
     * Sets the DOCTOR_CODE value for this GetMzbrjbxx.
     * 
     * @param DOCTOR_CODE
     */
    public void setDOCTOR_CODE(java.lang.String DOCTOR_CODE) {
        this.DOCTOR_CODE = DOCTOR_CODE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzbrjbxx)) return false;
        GetMzbrjbxx other = (GetMzbrjbxx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CARD_NO==null && other.getCARD_NO()==null) || 
             (this.CARD_NO!=null &&
              this.CARD_NO.equals(other.getCARD_NO()))) &&
            ((this.DEPT_CODE==null && other.getDEPT_CODE()==null) || 
             (this.DEPT_CODE!=null &&
              this.DEPT_CODE.equals(other.getDEPT_CODE()))) &&
            ((this.DOCTOR_CODE==null && other.getDOCTOR_CODE()==null) || 
             (this.DOCTOR_CODE!=null &&
              this.DOCTOR_CODE.equals(other.getDOCTOR_CODE())));
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
        if (getCARD_NO() != null) {
            _hashCode += getCARD_NO().hashCode();
        }
        if (getDEPT_CODE() != null) {
            _hashCode += getDEPT_CODE().hashCode();
        }
        if (getDOCTOR_CODE() != null) {
            _hashCode += getDOCTOR_CODE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzbrjbxx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzbrjbxx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARD_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CARD_NO"));
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
        elemField.setFieldName("DOCTOR_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DOCTOR_CODE"));
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
