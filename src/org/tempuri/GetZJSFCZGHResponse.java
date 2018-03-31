/**
 * GetZJSFCZGHResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetZJSFCZGHResponse  implements java.io.Serializable {
    private java.lang.String getZJSFCZGHResult;

    public GetZJSFCZGHResponse() {
    }

    public GetZJSFCZGHResponse(
           java.lang.String getZJSFCZGHResult) {
           this.getZJSFCZGHResult = getZJSFCZGHResult;
    }


    /**
     * Gets the getZJSFCZGHResult value for this GetZJSFCZGHResponse.
     * 
     * @return getZJSFCZGHResult
     */
    public java.lang.String getGetZJSFCZGHResult() {
        return getZJSFCZGHResult;
    }


    /**
     * Sets the getZJSFCZGHResult value for this GetZJSFCZGHResponse.
     * 
     * @param getZJSFCZGHResult
     */
    public void setGetZJSFCZGHResult(java.lang.String getZJSFCZGHResult) {
        this.getZJSFCZGHResult = getZJSFCZGHResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZJSFCZGHResponse)) return false;
        GetZJSFCZGHResponse other = (GetZJSFCZGHResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getZJSFCZGHResult==null && other.getGetZJSFCZGHResult()==null) || 
             (this.getZJSFCZGHResult!=null &&
              this.getZJSFCZGHResult.equals(other.getGetZJSFCZGHResult())));
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
        if (getGetZJSFCZGHResult() != null) {
            _hashCode += getGetZJSFCZGHResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZJSFCZGHResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetZJSFCZGHResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getZJSFCZGHResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetZJSFCZGHResult"));
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
