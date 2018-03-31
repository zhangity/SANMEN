/**
 * GetYsKsxQxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYsKsxQxResponse  implements java.io.Serializable {
    private int getYsKsxQxResult;

    public GetYsKsxQxResponse() {
    }

    public GetYsKsxQxResponse(
           int getYsKsxQxResult) {
           this.getYsKsxQxResult = getYsKsxQxResult;
    }


    /**
     * Gets the getYsKsxQxResult value for this GetYsKsxQxResponse.
     * 
     * @return getYsKsxQxResult
     */
    public int getGetYsKsxQxResult() {
        return getYsKsxQxResult;
    }


    /**
     * Sets the getYsKsxQxResult value for this GetYsKsxQxResponse.
     * 
     * @param getYsKsxQxResult
     */
    public void setGetYsKsxQxResult(int getYsKsxQxResult) {
        this.getYsKsxQxResult = getYsKsxQxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYsKsxQxResponse)) return false;
        GetYsKsxQxResponse other = (GetYsKsxQxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.getYsKsxQxResult == other.getGetYsKsxQxResult();
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
        _hashCode += getGetYsKsxQxResult();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYsKsxQxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYsKsxQxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getYsKsxQxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetYsKsxQxResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
