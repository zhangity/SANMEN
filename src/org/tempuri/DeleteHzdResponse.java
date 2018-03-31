/**
 * DeleteHzdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DeleteHzdResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm deleteHzdResult;

    public DeleteHzdResponse() {
    }

    public DeleteHzdResponse(
           org.tempuri.ReturnExComm deleteHzdResult) {
           this.deleteHzdResult = deleteHzdResult;
    }


    /**
     * Gets the deleteHzdResult value for this DeleteHzdResponse.
     * 
     * @return deleteHzdResult
     */
    public org.tempuri.ReturnExComm getDeleteHzdResult() {
        return deleteHzdResult;
    }


    /**
     * Sets the deleteHzdResult value for this DeleteHzdResponse.
     * 
     * @param deleteHzdResult
     */
    public void setDeleteHzdResult(org.tempuri.ReturnExComm deleteHzdResult) {
        this.deleteHzdResult = deleteHzdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteHzdResponse)) return false;
        DeleteHzdResponse other = (DeleteHzdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteHzdResult==null && other.getDeleteHzdResult()==null) || 
             (this.deleteHzdResult!=null &&
              this.deleteHzdResult.equals(other.getDeleteHzdResult())));
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
        if (getDeleteHzdResult() != null) {
            _hashCode += getDeleteHzdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteHzdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteHzdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteHzdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeleteHzdResult"));
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
