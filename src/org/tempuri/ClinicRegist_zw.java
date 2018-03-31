/**
 * ClinicRegist_zw.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ClinicRegist_zw  implements java.io.Serializable {
    private java.lang.String scheduleId;

    private java.lang.String timeId;

    private java.lang.String visit_no;

    private java.lang.String registDate;

    private java.lang.String deptid;

    private java.lang.String patid;

    public ClinicRegist_zw() {
    }

    public ClinicRegist_zw(
           java.lang.String scheduleId,
           java.lang.String timeId,
           java.lang.String visit_no,
           java.lang.String registDate,
           java.lang.String deptid,
           java.lang.String patid) {
           this.scheduleId = scheduleId;
           this.timeId = timeId;
           this.visit_no = visit_no;
           this.registDate = registDate;
           this.deptid = deptid;
           this.patid = patid;
    }


    /**
     * Gets the scheduleId value for this ClinicRegist_zw.
     * 
     * @return scheduleId
     */
    public java.lang.String getScheduleId() {
        return scheduleId;
    }


    /**
     * Sets the scheduleId value for this ClinicRegist_zw.
     * 
     * @param scheduleId
     */
    public void setScheduleId(java.lang.String scheduleId) {
        this.scheduleId = scheduleId;
    }


    /**
     * Gets the timeId value for this ClinicRegist_zw.
     * 
     * @return timeId
     */
    public java.lang.String getTimeId() {
        return timeId;
    }


    /**
     * Sets the timeId value for this ClinicRegist_zw.
     * 
     * @param timeId
     */
    public void setTimeId(java.lang.String timeId) {
        this.timeId = timeId;
    }


    /**
     * Gets the visit_no value for this ClinicRegist_zw.
     * 
     * @return visit_no
     */
    public java.lang.String getVisit_no() {
        return visit_no;
    }


    /**
     * Sets the visit_no value for this ClinicRegist_zw.
     * 
     * @param visit_no
     */
    public void setVisit_no(java.lang.String visit_no) {
        this.visit_no = visit_no;
    }


    /**
     * Gets the registDate value for this ClinicRegist_zw.
     * 
     * @return registDate
     */
    public java.lang.String getRegistDate() {
        return registDate;
    }


    /**
     * Sets the registDate value for this ClinicRegist_zw.
     * 
     * @param registDate
     */
    public void setRegistDate(java.lang.String registDate) {
        this.registDate = registDate;
    }


    /**
     * Gets the deptid value for this ClinicRegist_zw.
     * 
     * @return deptid
     */
    public java.lang.String getDeptid() {
        return deptid;
    }


    /**
     * Sets the deptid value for this ClinicRegist_zw.
     * 
     * @param deptid
     */
    public void setDeptid(java.lang.String deptid) {
        this.deptid = deptid;
    }


    /**
     * Gets the patid value for this ClinicRegist_zw.
     * 
     * @return patid
     */
    public java.lang.String getPatid() {
        return patid;
    }


    /**
     * Sets the patid value for this ClinicRegist_zw.
     * 
     * @param patid
     */
    public void setPatid(java.lang.String patid) {
        this.patid = patid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClinicRegist_zw)) return false;
        ClinicRegist_zw other = (ClinicRegist_zw) obj;
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
            ((this.visit_no==null && other.getVisit_no()==null) || 
             (this.visit_no!=null &&
              this.visit_no.equals(other.getVisit_no()))) &&
            ((this.registDate==null && other.getRegistDate()==null) || 
             (this.registDate!=null &&
              this.registDate.equals(other.getRegistDate()))) &&
            ((this.deptid==null && other.getDeptid()==null) || 
             (this.deptid!=null &&
              this.deptid.equals(other.getDeptid()))) &&
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
        if (getVisit_no() != null) {
            _hashCode += getVisit_no().hashCode();
        }
        if (getRegistDate() != null) {
            _hashCode += getRegistDate().hashCode();
        }
        if (getDeptid() != null) {
            _hashCode += getDeptid().hashCode();
        }
        if (getPatid() != null) {
            _hashCode += getPatid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClinicRegist_zw.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ClinicRegist_zw"));
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
        elemField.setFieldName("visit_no");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "visit_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RegistDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "deptid"));
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
