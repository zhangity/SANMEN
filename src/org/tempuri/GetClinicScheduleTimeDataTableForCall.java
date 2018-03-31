/**
 * GetClinicScheduleTimeDataTableForCall.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetClinicScheduleTimeDataTableForCall  implements java.io.Serializable {
    private java.lang.String scheduleId;

    private java.lang.String regist_Status;

    public GetClinicScheduleTimeDataTableForCall() {
    }

    public GetClinicScheduleTimeDataTableForCall(
           java.lang.String scheduleId,
           java.lang.String regist_Status) {
           this.scheduleId = scheduleId;
           this.regist_Status = regist_Status;
    }


    /**
     * Gets the scheduleId value for this GetClinicScheduleTimeDataTableForCall.
     * 
     * @return scheduleId
     */
    public java.lang.String getScheduleId() {
        return scheduleId;
    }


    /**
     * Sets the scheduleId value for this GetClinicScheduleTimeDataTableForCall.
     * 
     * @param scheduleId
     */
    public void setScheduleId(java.lang.String scheduleId) {
        this.scheduleId = scheduleId;
    }


    /**
     * Gets the regist_Status value for this GetClinicScheduleTimeDataTableForCall.
     * 
     * @return regist_Status
     */
    public java.lang.String getRegist_Status() {
        return regist_Status;
    }


    /**
     * Sets the regist_Status value for this GetClinicScheduleTimeDataTableForCall.
     * 
     * @param regist_Status
     */
    public void setRegist_Status(java.lang.String regist_Status) {
        this.regist_Status = regist_Status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetClinicScheduleTimeDataTableForCall)) return false;
        GetClinicScheduleTimeDataTableForCall other = (GetClinicScheduleTimeDataTableForCall) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scheduleId==null && other.getScheduleId()==null) || 
             (this.scheduleId!=null &&
              this.scheduleId.equals(other.getScheduleId()))) &&
            ((this.regist_Status==null && other.getRegist_Status()==null) || 
             (this.regist_Status!=null &&
              this.regist_Status.equals(other.getRegist_Status())));
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
        if (getScheduleId() != null) {
            _hashCode += getScheduleId().hashCode();
        }
        if (getRegist_Status() != null) {
            _hashCode += getRegist_Status().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetClinicScheduleTimeDataTableForCall.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetClinicScheduleTimeDataTableForCall"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ScheduleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regist_Status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Regist_Status"));
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
