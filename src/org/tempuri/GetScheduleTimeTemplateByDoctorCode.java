/**
 * GetScheduleTimeTemplateByDoctorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetScheduleTimeTemplateByDoctorCode  implements java.io.Serializable {
    private java.lang.String doctorCode;

    public GetScheduleTimeTemplateByDoctorCode() {
    }

    public GetScheduleTimeTemplateByDoctorCode(
           java.lang.String doctorCode) {
           this.doctorCode = doctorCode;
    }


    /**
     * Gets the doctorCode value for this GetScheduleTimeTemplateByDoctorCode.
     * 
     * @return doctorCode
     */
    public java.lang.String getDoctorCode() {
        return doctorCode;
    }


    /**
     * Sets the doctorCode value for this GetScheduleTimeTemplateByDoctorCode.
     * 
     * @param doctorCode
     */
    public void setDoctorCode(java.lang.String doctorCode) {
        this.doctorCode = doctorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetScheduleTimeTemplateByDoctorCode)) return false;
        GetScheduleTimeTemplateByDoctorCode other = (GetScheduleTimeTemplateByDoctorCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.doctorCode==null && other.getDoctorCode()==null) || 
             (this.doctorCode!=null &&
              this.doctorCode.equals(other.getDoctorCode())));
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
        if (getDoctorCode() != null) {
            _hashCode += getDoctorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetScheduleTimeTemplateByDoctorCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetScheduleTimeTemplateByDoctorCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doctorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DoctorCode"));
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
