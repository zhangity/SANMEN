/**
 * GetCancelCardCheck.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCancelCardCheck  implements java.io.Serializable {
    private java.lang.String strPatient_id;

    private java.lang.String strCardNo;

    public GetCancelCardCheck() {
    }

    public GetCancelCardCheck(
           java.lang.String strPatient_id,
           java.lang.String strCardNo) {
           this.strPatient_id = strPatient_id;
           this.strCardNo = strCardNo;
    }


    /**
     * Gets the strPatient_id value for this GetCancelCardCheck.
     * 
     * @return strPatient_id
     */
    public java.lang.String getStrPatient_id() {
        return strPatient_id;
    }


    /**
     * Sets the strPatient_id value for this GetCancelCardCheck.
     * 
     * @param strPatient_id
     */
    public void setStrPatient_id(java.lang.String strPatient_id) {
        this.strPatient_id = strPatient_id;
    }


    /**
     * Gets the strCardNo value for this GetCancelCardCheck.
     * 
     * @return strCardNo
     */
    public java.lang.String getStrCardNo() {
        return strCardNo;
    }


    /**
     * Sets the strCardNo value for this GetCancelCardCheck.
     * 
     * @param strCardNo
     */
    public void setStrCardNo(java.lang.String strCardNo) {
        this.strCardNo = strCardNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCancelCardCheck)) return false;
        GetCancelCardCheck other = (GetCancelCardCheck) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strPatient_id==null && other.getStrPatient_id()==null) || 
             (this.strPatient_id!=null &&
              this.strPatient_id.equals(other.getStrPatient_id()))) &&
            ((this.strCardNo==null && other.getStrCardNo()==null) || 
             (this.strCardNo!=null &&
              this.strCardNo.equals(other.getStrCardNo())));
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
        if (getStrPatient_id() != null) {
            _hashCode += getStrPatient_id().hashCode();
        }
        if (getStrCardNo() != null) {
            _hashCode += getStrCardNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCancelCardCheck.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCancelCardCheck"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strPatient_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strPatient_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCardNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCardNo"));
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
