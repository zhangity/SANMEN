/**
 * GetRegisterScheduleTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetRegisterScheduleTime  implements java.io.Serializable {
    private java.lang.String registDate;

    private java.lang.String registType;

    private java.lang.String deptCode;

    private java.lang.String doctorCode;

    public GetRegisterScheduleTime() {
    }

    public GetRegisterScheduleTime(
           java.lang.String registDate,
           java.lang.String registType,
           java.lang.String deptCode,
           java.lang.String doctorCode) {
           this.registDate = registDate;
           this.registType = registType;
           this.deptCode = deptCode;
           this.doctorCode = doctorCode;
    }


    /**
     * Gets the registDate value for this GetRegisterScheduleTime.
     * 
     * @return registDate
     */
    public java.lang.String getRegistDate() {
        return registDate;
    }


    /**
     * Sets the registDate value for this GetRegisterScheduleTime.
     * 
     * @param registDate
     */
    public void setRegistDate(java.lang.String registDate) {
        this.registDate = registDate;
    }


    /**
     * Gets the registType value for this GetRegisterScheduleTime.
     * 
     * @return registType
     */
    public java.lang.String getRegistType() {
        return registType;
    }


    /**
     * Sets the registType value for this GetRegisterScheduleTime.
     * 
     * @param registType
     */
    public void setRegistType(java.lang.String registType) {
        this.registType = registType;
    }


    /**
     * Gets the deptCode value for this GetRegisterScheduleTime.
     * 
     * @return deptCode
     */
    public java.lang.String getDeptCode() {
        return deptCode;
    }


    /**
     * Sets the deptCode value for this GetRegisterScheduleTime.
     * 
     * @param deptCode
     */
    public void setDeptCode(java.lang.String deptCode) {
        this.deptCode = deptCode;
    }


    /**
     * Gets the doctorCode value for this GetRegisterScheduleTime.
     * 
     * @return doctorCode
     */
    public java.lang.String getDoctorCode() {
        return doctorCode;
    }


    /**
     * Sets the doctorCode value for this GetRegisterScheduleTime.
     * 
     * @param doctorCode
     */
    public void setDoctorCode(java.lang.String doctorCode) {
        this.doctorCode = doctorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRegisterScheduleTime)) return false;
        GetRegisterScheduleTime other = (GetRegisterScheduleTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registDate==null && other.getRegistDate()==null) || 
             (this.registDate!=null &&
              this.registDate.equals(other.getRegistDate()))) &&
            ((this.registType==null && other.getRegistType()==null) || 
             (this.registType!=null &&
              this.registType.equals(other.getRegistType()))) &&
            ((this.deptCode==null && other.getDeptCode()==null) || 
             (this.deptCode!=null &&
              this.deptCode.equals(other.getDeptCode()))) &&
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
        if (getRegistDate() != null) {
            _hashCode += getRegistDate().hashCode();
        }
        if (getRegistType() != null) {
            _hashCode += getRegistType().hashCode();
        }
        if (getDeptCode() != null) {
            _hashCode += getDeptCode().hashCode();
        }
        if (getDoctorCode() != null) {
            _hashCode += getDoctorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRegisterScheduleTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetRegisterScheduleTime"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RegistDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RegistType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeptCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
