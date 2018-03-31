/**
 * UpdateClinicScheduleAudit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateClinicScheduleAudit  implements java.io.Serializable {
    private java.lang.String scheduleId;

    private java.lang.String auditusercode;

    public UpdateClinicScheduleAudit() {
    }

    public UpdateClinicScheduleAudit(
           java.lang.String scheduleId,
           java.lang.String auditusercode) {
           this.scheduleId = scheduleId;
           this.auditusercode = auditusercode;
    }


    /**
     * Gets the scheduleId value for this UpdateClinicScheduleAudit.
     * 
     * @return scheduleId
     */
    public java.lang.String getScheduleId() {
        return scheduleId;
    }


    /**
     * Sets the scheduleId value for this UpdateClinicScheduleAudit.
     * 
     * @param scheduleId
     */
    public void setScheduleId(java.lang.String scheduleId) {
        this.scheduleId = scheduleId;
    }


    /**
     * Gets the auditusercode value for this UpdateClinicScheduleAudit.
     * 
     * @return auditusercode
     */
    public java.lang.String getAuditusercode() {
        return auditusercode;
    }


    /**
     * Sets the auditusercode value for this UpdateClinicScheduleAudit.
     * 
     * @param auditusercode
     */
    public void setAuditusercode(java.lang.String auditusercode) {
        this.auditusercode = auditusercode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateClinicScheduleAudit)) return false;
        UpdateClinicScheduleAudit other = (UpdateClinicScheduleAudit) obj;
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
            ((this.auditusercode==null && other.getAuditusercode()==null) || 
             (this.auditusercode!=null &&
              this.auditusercode.equals(other.getAuditusercode())));
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
        if (getAuditusercode() != null) {
            _hashCode += getAuditusercode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateClinicScheduleAudit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateClinicScheduleAudit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ScheduleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditusercode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "auditusercode"));
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
