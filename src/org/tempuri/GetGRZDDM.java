/**
 * GetGRZDDM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetGRZDDM  implements java.io.Serializable {
    private java.lang.String doctor_Code;

    private java.lang.String DEPT_CODE;

    public GetGRZDDM() {
    }

    public GetGRZDDM(
           java.lang.String doctor_Code,
           java.lang.String DEPT_CODE) {
           this.doctor_Code = doctor_Code;
           this.DEPT_CODE = DEPT_CODE;
    }


    /**
     * Gets the doctor_Code value for this GetGRZDDM.
     * 
     * @return doctor_Code
     */
    public java.lang.String getDoctor_Code() {
        return doctor_Code;
    }


    /**
     * Sets the doctor_Code value for this GetGRZDDM.
     * 
     * @param doctor_Code
     */
    public void setDoctor_Code(java.lang.String doctor_Code) {
        this.doctor_Code = doctor_Code;
    }


    /**
     * Gets the DEPT_CODE value for this GetGRZDDM.
     * 
     * @return DEPT_CODE
     */
    public java.lang.String getDEPT_CODE() {
        return DEPT_CODE;
    }


    /**
     * Sets the DEPT_CODE value for this GetGRZDDM.
     * 
     * @param DEPT_CODE
     */
    public void setDEPT_CODE(java.lang.String DEPT_CODE) {
        this.DEPT_CODE = DEPT_CODE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGRZDDM)) return false;
        GetGRZDDM other = (GetGRZDDM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.doctor_Code==null && other.getDoctor_Code()==null) || 
             (this.doctor_Code!=null &&
              this.doctor_Code.equals(other.getDoctor_Code()))) &&
            ((this.DEPT_CODE==null && other.getDEPT_CODE()==null) || 
             (this.DEPT_CODE!=null &&
              this.DEPT_CODE.equals(other.getDEPT_CODE())));
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
        if (getDoctor_Code() != null) {
            _hashCode += getDoctor_Code().hashCode();
        }
        if (getDEPT_CODE() != null) {
            _hashCode += getDEPT_CODE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGRZDDM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetGRZDDM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doctor_Code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Doctor_Code"));
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
