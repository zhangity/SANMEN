/**
 * UpdateClinicScheduleSubmitAudit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateClinicScheduleSubmitAudit  implements java.io.Serializable {
    private java.lang.String scheduleId;

    private java.lang.String submitusercode;

    public UpdateClinicScheduleSubmitAudit() {
    }

    public UpdateClinicScheduleSubmitAudit(
           java.lang.String scheduleId,
           java.lang.String submitusercode) {
           this.scheduleId = scheduleId;
           this.submitusercode = submitusercode;
    }


    /**
     * Gets the scheduleId value for this UpdateClinicScheduleSubmitAudit.
     * 
     * @return scheduleId
     */
    public java.lang.String getScheduleId() {
        return scheduleId;
    }


    /**
     * Sets the scheduleId value for this UpdateClinicScheduleSubmitAudit.
     * 
     * @param scheduleId
     */
    public void setScheduleId(java.lang.String scheduleId) {
        this.scheduleId = scheduleId;
    }


    /**
     * Gets the submitusercode value for this UpdateClinicScheduleSubmitAudit.
     * 
     * @return submitusercode
     */
    public java.lang.String getSubmitusercode() {
        return submitusercode;
    }


    /**
     * Sets the submitusercode value for this UpdateClinicScheduleSubmitAudit.
     * 
     * @param submitusercode
     */
    public void setSubmitusercode(java.lang.String submitusercode) {
        this.submitusercode = submitusercode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateClinicScheduleSubmitAudit)) return false;
        UpdateClinicScheduleSubmitAudit other = (UpdateClinicScheduleSubmitAudit) obj;
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
            ((this.submitusercode==null && other.getSubmitusercode()==null) || 
             (this.submitusercode!=null &&
              this.submitusercode.equals(other.getSubmitusercode())));
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
        if (getSubmitusercode() != null) {
            _hashCode += getSubmitusercode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateClinicScheduleSubmitAudit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateClinicScheduleSubmitAudit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ScheduleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitusercode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "submitusercode"));
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
