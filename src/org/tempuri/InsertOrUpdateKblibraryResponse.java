/**
 * InsertOrUpdateKblibraryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertOrUpdateKblibraryResponse  implements java.io.Serializable {
    private boolean insertOrUpdateKblibraryResult;

    public InsertOrUpdateKblibraryResponse() {
    }

    public InsertOrUpdateKblibraryResponse(
           boolean insertOrUpdateKblibraryResult) {
           this.insertOrUpdateKblibraryResult = insertOrUpdateKblibraryResult;
    }


    /**
     * Gets the insertOrUpdateKblibraryResult value for this InsertOrUpdateKblibraryResponse.
     * 
     * @return insertOrUpdateKblibraryResult
     */
    public boolean isInsertOrUpdateKblibraryResult() {
        return insertOrUpdateKblibraryResult;
    }


    /**
     * Sets the insertOrUpdateKblibraryResult value for this InsertOrUpdateKblibraryResponse.
     * 
     * @param insertOrUpdateKblibraryResult
     */
    public void setInsertOrUpdateKblibraryResult(boolean insertOrUpdateKblibraryResult) {
        this.insertOrUpdateKblibraryResult = insertOrUpdateKblibraryResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertOrUpdateKblibraryResponse)) return false;
        InsertOrUpdateKblibraryResponse other = (InsertOrUpdateKblibraryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.insertOrUpdateKblibraryResult == other.isInsertOrUpdateKblibraryResult();
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
        _hashCode += (isInsertOrUpdateKblibraryResult() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertOrUpdateKblibraryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertOrUpdateKblibraryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertOrUpdateKblibraryResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertOrUpdateKblibraryResult"));
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
