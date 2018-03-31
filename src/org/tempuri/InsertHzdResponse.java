/**
 * InsertHzdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertHzdResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm insertHzdResult;

    public InsertHzdResponse() {
    }

    public InsertHzdResponse(
           org.tempuri.ReturnExComm insertHzdResult) {
           this.insertHzdResult = insertHzdResult;
    }


    /**
     * Gets the insertHzdResult value for this InsertHzdResponse.
     * 
     * @return insertHzdResult
     */
    public org.tempuri.ReturnExComm getInsertHzdResult() {
        return insertHzdResult;
    }


    /**
     * Sets the insertHzdResult value for this InsertHzdResponse.
     * 
     * @param insertHzdResult
     */
    public void setInsertHzdResult(org.tempuri.ReturnExComm insertHzdResult) {
        this.insertHzdResult = insertHzdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertHzdResponse)) return false;
        InsertHzdResponse other = (InsertHzdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertHzdResult==null && other.getInsertHzdResult()==null) || 
             (this.insertHzdResult!=null &&
              this.insertHzdResult.equals(other.getInsertHzdResult())));
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
        if (getInsertHzdResult() != null) {
            _hashCode += getInsertHzdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertHzdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertHzdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertHzdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertHzdResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExComm"));
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
