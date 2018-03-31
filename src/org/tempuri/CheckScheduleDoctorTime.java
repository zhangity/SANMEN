/**
 * CheckScheduleDoctorTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CheckScheduleDoctorTime  implements java.io.Serializable {
    private java.lang.String scheduleDate;

    private java.lang.String scheduleId;

    public CheckScheduleDoctorTime() {
    }

    public CheckScheduleDoctorTime(
           java.lang.String scheduleDate,
           java.lang.String scheduleId) {
           this.scheduleDate = scheduleDate;
           this.scheduleId = scheduleId;
    }


    /**
     * Gets the scheduleDate value for this CheckScheduleDoctorTime.
     * 
     * @return scheduleDate
     */
    public java.lang.String getScheduleDate() {
        return scheduleDate;
    }


    /**
     * Sets the scheduleDate value for this CheckScheduleDoctorTime.
     * 
     * @param scheduleDate
     */
    public void setScheduleDate(java.lang.String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }


    /**
     * Gets the scheduleId value for this CheckScheduleDoctorTime.
     * 
     * @return scheduleId
     */
    public java.lang.String getScheduleId() {
        return scheduleId;
    }


    /**
     * Sets the scheduleId value for this CheckScheduleDoctorTime.
     * 
     * @param scheduleId
     */
    public void setScheduleId(java.lang.String scheduleId) {
        this.scheduleId = scheduleId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckScheduleDoctorTime)) return false;
        CheckScheduleDoctorTime other = (CheckScheduleDoctorTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scheduleDate==null && other.getScheduleDate()==null) || 
             (this.scheduleDate!=null &&
              this.scheduleDate.equals(other.getScheduleDate()))) &&
            ((this.scheduleId==null && other.getScheduleId()==null) || 
             (this.scheduleId!=null &&
              this.scheduleId.equals(other.getScheduleId())));
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
        if (getScheduleDate() != null) {
            _hashCode += getScheduleDate().hashCode();
        }
        if (getScheduleId() != null) {
            _hashCode += getScheduleId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckScheduleDoctorTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CheckScheduleDoctorTime"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ScheduleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ScheduleId"));
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
