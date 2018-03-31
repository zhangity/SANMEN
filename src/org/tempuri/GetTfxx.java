/**
 * GetTfxx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetTfxx  implements java.io.Serializable {
    private java.lang.String startTime;

    private java.lang.String endTime;

    private java.lang.String OPERATE_MACHINE_ID;

    private java.lang.String PATIENT_NAME;

    public GetTfxx() {
    }

    public GetTfxx(
           java.lang.String startTime,
           java.lang.String endTime,
           java.lang.String OPERATE_MACHINE_ID,
           java.lang.String PATIENT_NAME) {
           this.startTime = startTime;
           this.endTime = endTime;
           this.OPERATE_MACHINE_ID = OPERATE_MACHINE_ID;
           this.PATIENT_NAME = PATIENT_NAME;
    }


    /**
     * Gets the startTime value for this GetTfxx.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this GetTfxx.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this GetTfxx.
     * 
     * @return endTime
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this GetTfxx.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the OPERATE_MACHINE_ID value for this GetTfxx.
     * 
     * @return OPERATE_MACHINE_ID
     */
    public java.lang.String getOPERATE_MACHINE_ID() {
        return OPERATE_MACHINE_ID;
    }


    /**
     * Sets the OPERATE_MACHINE_ID value for this GetTfxx.
     * 
     * @param OPERATE_MACHINE_ID
     */
    public void setOPERATE_MACHINE_ID(java.lang.String OPERATE_MACHINE_ID) {
        this.OPERATE_MACHINE_ID = OPERATE_MACHINE_ID;
    }


    /**
     * Gets the PATIENT_NAME value for this GetTfxx.
     * 
     * @return PATIENT_NAME
     */
    public java.lang.String getPATIENT_NAME() {
        return PATIENT_NAME;
    }


    /**
     * Sets the PATIENT_NAME value for this GetTfxx.
     * 
     * @param PATIENT_NAME
     */
    public void setPATIENT_NAME(java.lang.String PATIENT_NAME) {
        this.PATIENT_NAME = PATIENT_NAME;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTfxx)) return false;
        GetTfxx other = (GetTfxx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.OPERATE_MACHINE_ID==null && other.getOPERATE_MACHINE_ID()==null) || 
             (this.OPERATE_MACHINE_ID!=null &&
              this.OPERATE_MACHINE_ID.equals(other.getOPERATE_MACHINE_ID()))) &&
            ((this.PATIENT_NAME==null && other.getPATIENT_NAME()==null) || 
             (this.PATIENT_NAME!=null &&
              this.PATIENT_NAME.equals(other.getPATIENT_NAME())));
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
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getOPERATE_MACHINE_ID() != null) {
            _hashCode += getOPERATE_MACHINE_ID().hashCode();
        }
        if (getPATIENT_NAME() != null) {
            _hashCode += getPATIENT_NAME().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTfxx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetTfxx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OPERATE_MACHINE_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OPERATE_MACHINE_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PATIENT_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PATIENT_NAME"));
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
