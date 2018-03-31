/**
 * GetScheduleTimeForCall.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetScheduleTimeForCall  implements java.io.Serializable {
    private java.lang.String strDateTime;

    private java.lang.String strTelNo;

    public GetScheduleTimeForCall() {
    }

    public GetScheduleTimeForCall(
           java.lang.String strDateTime,
           java.lang.String strTelNo) {
           this.strDateTime = strDateTime;
           this.strTelNo = strTelNo;
    }


    /**
     * Gets the strDateTime value for this GetScheduleTimeForCall.
     * 
     * @return strDateTime
     */
    public java.lang.String getStrDateTime() {
        return strDateTime;
    }


    /**
     * Sets the strDateTime value for this GetScheduleTimeForCall.
     * 
     * @param strDateTime
     */
    public void setStrDateTime(java.lang.String strDateTime) {
        this.strDateTime = strDateTime;
    }


    /**
     * Gets the strTelNo value for this GetScheduleTimeForCall.
     * 
     * @return strTelNo
     */
    public java.lang.String getStrTelNo() {
        return strTelNo;
    }


    /**
     * Sets the strTelNo value for this GetScheduleTimeForCall.
     * 
     * @param strTelNo
     */
    public void setStrTelNo(java.lang.String strTelNo) {
        this.strTelNo = strTelNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetScheduleTimeForCall)) return false;
        GetScheduleTimeForCall other = (GetScheduleTimeForCall) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strDateTime==null && other.getStrDateTime()==null) || 
             (this.strDateTime!=null &&
              this.strDateTime.equals(other.getStrDateTime()))) &&
            ((this.strTelNo==null && other.getStrTelNo()==null) || 
             (this.strTelNo!=null &&
              this.strTelNo.equals(other.getStrTelNo())));
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
        if (getStrDateTime() != null) {
            _hashCode += getStrDateTime().hashCode();
        }
        if (getStrTelNo() != null) {
            _hashCode += getStrTelNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetScheduleTimeForCall.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetScheduleTimeForCall"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strTelNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strTelNo"));
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
