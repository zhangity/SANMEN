/**
 * InsertOrUpdateyaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertOrUpdateyaResponse  implements java.io.Serializable {
    private boolean insertOrUpdateyaResult;

    public InsertOrUpdateyaResponse() {
    }

    public InsertOrUpdateyaResponse(
           boolean insertOrUpdateyaResult) {
           this.insertOrUpdateyaResult = insertOrUpdateyaResult;
    }


    /**
     * Gets the insertOrUpdateyaResult value for this InsertOrUpdateyaResponse.
     * 
     * @return insertOrUpdateyaResult
     */
    public boolean isInsertOrUpdateyaResult() {
        return insertOrUpdateyaResult;
    }


    /**
     * Sets the insertOrUpdateyaResult value for this InsertOrUpdateyaResponse.
     * 
     * @param insertOrUpdateyaResult
     */
    public void setInsertOrUpdateyaResult(boolean insertOrUpdateyaResult) {
        this.insertOrUpdateyaResult = insertOrUpdateyaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertOrUpdateyaResponse)) return false;
        InsertOrUpdateyaResponse other = (InsertOrUpdateyaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.insertOrUpdateyaResult == other.isInsertOrUpdateyaResult();
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
        _hashCode += (isInsertOrUpdateyaResult() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertOrUpdateyaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertOrUpdateyaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertOrUpdateyaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertOrUpdateyaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
