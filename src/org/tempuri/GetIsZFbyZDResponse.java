/**
 * GetIsZFbyZDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetIsZFbyZDResponse  implements java.io.Serializable {
    private java.lang.String getIsZFbyZDResult;

    public GetIsZFbyZDResponse() {
    }

    public GetIsZFbyZDResponse(
           java.lang.String getIsZFbyZDResult) {
           this.getIsZFbyZDResult = getIsZFbyZDResult;
    }


    /**
     * Gets the getIsZFbyZDResult value for this GetIsZFbyZDResponse.
     * 
     * @return getIsZFbyZDResult
     */
    public java.lang.String getGetIsZFbyZDResult() {
        return getIsZFbyZDResult;
    }


    /**
     * Sets the getIsZFbyZDResult value for this GetIsZFbyZDResponse.
     * 
     * @param getIsZFbyZDResult
     */
    public void setGetIsZFbyZDResult(java.lang.String getIsZFbyZDResult) {
        this.getIsZFbyZDResult = getIsZFbyZDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetIsZFbyZDResponse)) return false;
        GetIsZFbyZDResponse other = (GetIsZFbyZDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getIsZFbyZDResult==null && other.getGetIsZFbyZDResult()==null) || 
             (this.getIsZFbyZDResult!=null &&
              this.getIsZFbyZDResult.equals(other.getGetIsZFbyZDResult())));
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
        if (getGetIsZFbyZDResult() != null) {
            _hashCode += getGetIsZFbyZDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetIsZFbyZDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetIsZFbyZDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getIsZFbyZDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetIsZFbyZDResult"));
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
