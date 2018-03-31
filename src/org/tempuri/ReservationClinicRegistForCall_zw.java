/**
 * ReservationClinicRegistForCall_zw.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReservationClinicRegistForCall_zw  implements java.io.Serializable {
    private java.lang.String scheduleId;

    private java.lang.String timeId;

    private java.lang.String usercode;

    public ReservationClinicRegistForCall_zw() {
    }

    public ReservationClinicRegistForCall_zw(
           java.lang.String scheduleId,
           java.lang.String timeId,
           java.lang.String usercode) {
           this.scheduleId = scheduleId;
           this.timeId = timeId;
           this.usercode = usercode;
    }


    /**
     * Gets the scheduleId value for this ReservationClinicRegistForCall_zw.
     * 
     * @return scheduleId
     */
    public java.lang.String getScheduleId() {
        return scheduleId;
    }


    /**
     * Sets the scheduleId value for this ReservationClinicRegistForCall_zw.
     * 
     * @param scheduleId
     */
    public void setScheduleId(java.lang.String scheduleId) {
        this.scheduleId = scheduleId;
    }


    /**
     * Gets the timeId value for this ReservationClinicRegistForCall_zw.
     * 
     * @return timeId
     */
    public java.lang.String getTimeId() {
        return timeId;
    }


    /**
     * Sets the timeId value for this ReservationClinicRegistForCall_zw.
     * 
     * @param timeId
     */
    public void setTimeId(java.lang.String timeId) {
        this.timeId = timeId;
    }


    /**
     * Gets the usercode value for this ReservationClinicRegistForCall_zw.
     * 
     * @return usercode
     */
    public java.lang.String getUsercode() {
        return usercode;
    }


    /**
     * Sets the usercode value for this ReservationClinicRegistForCall_zw.
     * 
     * @param usercode
     */
    public void setUsercode(java.lang.String usercode) {
        this.usercode = usercode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationClinicRegistForCall_zw)) return false;
        ReservationClinicRegistForCall_zw other = (ReservationClinicRegistForCall_zw) obj;
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
            ((this.timeId==null && other.getTimeId()==null) || 
             (this.timeId!=null &&
              this.timeId.equals(other.getTimeId()))) &&
            ((this.usercode==null && other.getUsercode()==null) || 
             (this.usercode!=null &&
              this.usercode.equals(other.getUsercode())));
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
        if (getTimeId() != null) {
            _hashCode += getTimeId().hashCode();
        }
        if (getUsercode() != null) {
            _hashCode += getUsercode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationClinicRegistForCall_zw.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReservationClinicRegistForCall_zw"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "scheduleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "timeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usercode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "usercode"));
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
