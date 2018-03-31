/**
 * InsertMzbrMzjlxx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertMzbrMzjlxx  implements java.io.Serializable {
    private org.tempuri.CLINIC_MASTER model;

    private java.lang.String DOCTOR_NAME;

    private java.lang.String mzDEPT_CODE;

    public InsertMzbrMzjlxx() {
    }

    public InsertMzbrMzjlxx(
           org.tempuri.CLINIC_MASTER model,
           java.lang.String DOCTOR_NAME,
           java.lang.String mzDEPT_CODE) {
           this.model = model;
           this.DOCTOR_NAME = DOCTOR_NAME;
           this.mzDEPT_CODE = mzDEPT_CODE;
    }


    /**
     * Gets the model value for this InsertMzbrMzjlxx.
     * 
     * @return model
     */
    public org.tempuri.CLINIC_MASTER getModel() {
        return model;
    }


    /**
     * Sets the model value for this InsertMzbrMzjlxx.
     * 
     * @param model
     */
    public void setModel(org.tempuri.CLINIC_MASTER model) {
        this.model = model;
    }


    /**
     * Gets the DOCTOR_NAME value for this InsertMzbrMzjlxx.
     * 
     * @return DOCTOR_NAME
     */
    public java.lang.String getDOCTOR_NAME() {
        return DOCTOR_NAME;
    }


    /**
     * Sets the DOCTOR_NAME value for this InsertMzbrMzjlxx.
     * 
     * @param DOCTOR_NAME
     */
    public void setDOCTOR_NAME(java.lang.String DOCTOR_NAME) {
        this.DOCTOR_NAME = DOCTOR_NAME;
    }


    /**
     * Gets the mzDEPT_CODE value for this InsertMzbrMzjlxx.
     * 
     * @return mzDEPT_CODE
     */
    public java.lang.String getMzDEPT_CODE() {
        return mzDEPT_CODE;
    }


    /**
     * Sets the mzDEPT_CODE value for this InsertMzbrMzjlxx.
     * 
     * @param mzDEPT_CODE
     */
    public void setMzDEPT_CODE(java.lang.String mzDEPT_CODE) {
        this.mzDEPT_CODE = mzDEPT_CODE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertMzbrMzjlxx)) return false;
        InsertMzbrMzjlxx other = (InsertMzbrMzjlxx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.DOCTOR_NAME==null && other.getDOCTOR_NAME()==null) || 
             (this.DOCTOR_NAME!=null &&
              this.DOCTOR_NAME.equals(other.getDOCTOR_NAME()))) &&
            ((this.mzDEPT_CODE==null && other.getMzDEPT_CODE()==null) || 
             (this.mzDEPT_CODE!=null &&
              this.mzDEPT_CODE.equals(other.getMzDEPT_CODE())));
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
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getDOCTOR_NAME() != null) {
            _hashCode += getDOCTOR_NAME().hashCode();
        }
        if (getMzDEPT_CODE() != null) {
            _hashCode += getMzDEPT_CODE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertMzbrMzjlxx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertMzbrMzjlxx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "CLINIC_MASTER"));
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
        elemField.setFieldName("mzDEPT_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MzDEPT_CODE"));
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
