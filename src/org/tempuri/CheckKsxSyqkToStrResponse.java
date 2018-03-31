/**
 * CheckKsxSyqkToStrResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CheckKsxSyqkToStrResponse  implements java.io.Serializable {
    private java.lang.String checkKsxSyqkToStrResult;

    public CheckKsxSyqkToStrResponse() {
    }

    public CheckKsxSyqkToStrResponse(
           java.lang.String checkKsxSyqkToStrResult) {
           this.checkKsxSyqkToStrResult = checkKsxSyqkToStrResult;
    }


    /**
     * Gets the checkKsxSyqkToStrResult value for this CheckKsxSyqkToStrResponse.
     * 
     * @return checkKsxSyqkToStrResult
     */
    public java.lang.String getCheckKsxSyqkToStrResult() {
        return checkKsxSyqkToStrResult;
    }


    /**
     * Sets the checkKsxSyqkToStrResult value for this CheckKsxSyqkToStrResponse.
     * 
     * @param checkKsxSyqkToStrResult
     */
    public void setCheckKsxSyqkToStrResult(java.lang.String checkKsxSyqkToStrResult) {
        this.checkKsxSyqkToStrResult = checkKsxSyqkToStrResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckKsxSyqkToStrResponse)) return false;
        CheckKsxSyqkToStrResponse other = (CheckKsxSyqkToStrResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.checkKsxSyqkToStrResult==null && other.getCheckKsxSyqkToStrResult()==null) || 
             (this.checkKsxSyqkToStrResult!=null &&
              this.checkKsxSyqkToStrResult.equals(other.getCheckKsxSyqkToStrResult())));
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
        if (getCheckKsxSyqkToStrResult() != null) {
            _hashCode += getCheckKsxSyqkToStrResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckKsxSyqkToStrResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CheckKsxSyqkToStrResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkKsxSyqkToStrResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CheckKsxSyqkToStrResult"));
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
