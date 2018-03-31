/**
 * GetAccountTransactionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAccountTransactionResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getAccountTransactionResult;

    public GetAccountTransactionResponse() {
    }

    public GetAccountTransactionResponse(
           org.tempuri.ReturnExTable getAccountTransactionResult) {
           this.getAccountTransactionResult = getAccountTransactionResult;
    }


    /**
     * Gets the getAccountTransactionResult value for this GetAccountTransactionResponse.
     * 
     * @return getAccountTransactionResult
     */
    public org.tempuri.ReturnExTable getGetAccountTransactionResult() {
        return getAccountTransactionResult;
    }


    /**
     * Sets the getAccountTransactionResult value for this GetAccountTransactionResponse.
     * 
     * @param getAccountTransactionResult
     */
    public void setGetAccountTransactionResult(org.tempuri.ReturnExTable getAccountTransactionResult) {
        this.getAccountTransactionResult = getAccountTransactionResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccountTransactionResponse)) return false;
        GetAccountTransactionResponse other = (GetAccountTransactionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAccountTransactionResult==null && other.getGetAccountTransactionResult()==null) || 
             (this.getAccountTransactionResult!=null &&
              this.getAccountTransactionResult.equals(other.getGetAccountTransactionResult())));
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
        if (getGetAccountTransactionResult() != null) {
            _hashCode += getGetAccountTransactionResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountTransactionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAccountTransactionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAccountTransactionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAccountTransactionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExTable"));
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
