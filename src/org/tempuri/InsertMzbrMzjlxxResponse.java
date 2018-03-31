/**
 * InsertMzbrMzjlxxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertMzbrMzjlxxResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm insertMzbrMzjlxxResult;

    public InsertMzbrMzjlxxResponse() {
    }

    public InsertMzbrMzjlxxResponse(
           org.tempuri.ReturnExComm insertMzbrMzjlxxResult) {
           this.insertMzbrMzjlxxResult = insertMzbrMzjlxxResult;
    }


    /**
     * Gets the insertMzbrMzjlxxResult value for this InsertMzbrMzjlxxResponse.
     * 
     * @return insertMzbrMzjlxxResult
     */
    public org.tempuri.ReturnExComm getInsertMzbrMzjlxxResult() {
        return insertMzbrMzjlxxResult;
    }


    /**
     * Sets the insertMzbrMzjlxxResult value for this InsertMzbrMzjlxxResponse.
     * 
     * @param insertMzbrMzjlxxResult
     */
    public void setInsertMzbrMzjlxxResult(org.tempuri.ReturnExComm insertMzbrMzjlxxResult) {
        this.insertMzbrMzjlxxResult = insertMzbrMzjlxxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertMzbrMzjlxxResponse)) return false;
        InsertMzbrMzjlxxResponse other = (InsertMzbrMzjlxxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertMzbrMzjlxxResult==null && other.getInsertMzbrMzjlxxResult()==null) || 
             (this.insertMzbrMzjlxxResult!=null &&
              this.insertMzbrMzjlxxResult.equals(other.getInsertMzbrMzjlxxResult())));
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
        if (getInsertMzbrMzjlxxResult() != null) {
            _hashCode += getInsertMzbrMzjlxxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertMzbrMzjlxxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertMzbrMzjlxxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertMzbrMzjlxxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertMzbrMzjlxxResult"));
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
