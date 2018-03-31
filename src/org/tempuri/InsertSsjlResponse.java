/**
 * InsertSsjlResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertSsjlResponse  implements java.io.Serializable {
    private java.lang.String insertSsjlResult;

    public InsertSsjlResponse() {
    }

    public InsertSsjlResponse(
           java.lang.String insertSsjlResult) {
           this.insertSsjlResult = insertSsjlResult;
    }


    /**
     * Gets the insertSsjlResult value for this InsertSsjlResponse.
     * 
     * @return insertSsjlResult
     */
    public java.lang.String getInsertSsjlResult() {
        return insertSsjlResult;
    }


    /**
     * Sets the insertSsjlResult value for this InsertSsjlResponse.
     * 
     * @param insertSsjlResult
     */
    public void setInsertSsjlResult(java.lang.String insertSsjlResult) {
        this.insertSsjlResult = insertSsjlResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertSsjlResponse)) return false;
        InsertSsjlResponse other = (InsertSsjlResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertSsjlResult==null && other.getInsertSsjlResult()==null) || 
             (this.insertSsjlResult!=null &&
              this.insertSsjlResult.equals(other.getInsertSsjlResult())));
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
        if (getInsertSsjlResult() != null) {
            _hashCode += getInsertSsjlResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertSsjlResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertSsjlResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertSsjlResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertSsjlResult"));
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
