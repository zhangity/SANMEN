/**
 * ClinicRegist_tzw.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ClinicRegist_tzw  implements java.io.Serializable {
    private java.lang.String scheduleId;

    private java.lang.String timeId;

    private java.lang.String patid;

    public ClinicRegist_tzw() {
    }

    public ClinicRegist_tzw(
           java.lang.String scheduleId,
           java.lang.String timeId,
           java.lang.String patid) {
           this.scheduleId = scheduleId;
           this.timeId = timeId;
           this.patid = patid;
    }


    /**
     * Gets the scheduleId value for this ClinicRegist_tzw.
     * 
     * @return scheduleId
     */
    public java.lang.String getScheduleId() {
        return scheduleId;
    }


    /**
     * Sets the scheduleId value for this ClinicRegist_tzw.
     * 
     * @param scheduleId
     */
    public void setScheduleId(java.lang.String scheduleId) {
        this.scheduleId = scheduleId;
    }


    /**
     * Gets the timeId value for this ClinicRegist_tzw.
     * 
     * @return timeId
     */
    public java.lang.String getTimeId() {
        return timeId;
    }


    /**
     * Sets the timeId value for this ClinicRegist_tzw.
     * 
     * @param timeId
     */
    public void setTimeId(java.lang.String timeId) {
        this.timeId = timeId;
    }


    /**
     * Gets the patid value for this ClinicRegist_tzw.
     * 
     * @return patid
     */
    public java.lang.String getPatid() {
        return patid;
    }


    /**
     * Sets the patid value for this ClinicRegist_tzw.
     * 
     * @param patid
     */
    public void setPatid(java.lang.String patid) {
        this.patid = patid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClinicRegist_tzw)) return false;
        ClinicRegist_tzw other = (ClinicRegist_tzw) obj;
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
            ((this.patid==null && other.getPatid()==null) || 
             (this.patid!=null &&
              this.patid.equals(other.getPatid())));
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
        if (getPatid() != null) {
            _hashCode += getPatid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClinicRegist_tzw.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ClinicRegist_tzw"));
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
        elemField.setFieldName("patid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "patid"));
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
