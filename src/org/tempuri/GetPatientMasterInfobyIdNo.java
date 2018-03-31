/**
 * GetPatientMasterInfobyIdNo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPatientMasterInfobyIdNo  implements java.io.Serializable {
    private java.lang.String strSelIdType;

    private java.lang.String strIdNo;

    public GetPatientMasterInfobyIdNo() {
    }

    public GetPatientMasterInfobyIdNo(
           java.lang.String strSelIdType,
           java.lang.String strIdNo) {
           this.strSelIdType = strSelIdType;
           this.strIdNo = strIdNo;
    }


    /**
     * Gets the strSelIdType value for this GetPatientMasterInfobyIdNo.
     * 
     * @return strSelIdType
     */
    public java.lang.String getStrSelIdType() {
        return strSelIdType;
    }


    /**
     * Sets the strSelIdType value for this GetPatientMasterInfobyIdNo.
     * 
     * @param strSelIdType
     */
    public void setStrSelIdType(java.lang.String strSelIdType) {
        this.strSelIdType = strSelIdType;
    }


    /**
     * Gets the strIdNo value for this GetPatientMasterInfobyIdNo.
     * 
     * @return strIdNo
     */
    public java.lang.String getStrIdNo() {
        return strIdNo;
    }


    /**
     * Sets the strIdNo value for this GetPatientMasterInfobyIdNo.
     * 
     * @param strIdNo
     */
    public void setStrIdNo(java.lang.String strIdNo) {
        this.strIdNo = strIdNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPatientMasterInfobyIdNo)) return false;
        GetPatientMasterInfobyIdNo other = (GetPatientMasterInfobyIdNo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strSelIdType==null && other.getStrSelIdType()==null) || 
             (this.strSelIdType!=null &&
              this.strSelIdType.equals(other.getStrSelIdType()))) &&
            ((this.strIdNo==null && other.getStrIdNo()==null) || 
             (this.strIdNo!=null &&
              this.strIdNo.equals(other.getStrIdNo())));
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
        if (getStrSelIdType() != null) {
            _hashCode += getStrSelIdType().hashCode();
        }
        if (getStrIdNo() != null) {
            _hashCode += getStrIdNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPatientMasterInfobyIdNo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPatientMasterInfobyIdNo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strSelIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strSelIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strIdNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strIdNo"));
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
