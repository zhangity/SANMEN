/**
 * GetHisMZXHResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetHisMZXHResponse  implements java.io.Serializable {
    private java.lang.String getHisMZXHResult;

    public GetHisMZXHResponse() {
    }

    public GetHisMZXHResponse(
           java.lang.String getHisMZXHResult) {
           this.getHisMZXHResult = getHisMZXHResult;
    }


    /**
     * Gets the getHisMZXHResult value for this GetHisMZXHResponse.
     * 
     * @return getHisMZXHResult
     */
    public java.lang.String getGetHisMZXHResult() {
        return getHisMZXHResult;
    }


    /**
     * Sets the getHisMZXHResult value for this GetHisMZXHResponse.
     * 
     * @param getHisMZXHResult
     */
    public void setGetHisMZXHResult(java.lang.String getHisMZXHResult) {
        this.getHisMZXHResult = getHisMZXHResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetHisMZXHResponse)) return false;
        GetHisMZXHResponse other = (GetHisMZXHResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getHisMZXHResult==null && other.getGetHisMZXHResult()==null) || 
             (this.getHisMZXHResult!=null &&
              this.getHisMZXHResult.equals(other.getGetHisMZXHResult())));
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
        if (getGetHisMZXHResult() != null) {
            _hashCode += getGetHisMZXHResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetHisMZXHResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetHisMZXHResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getHisMZXHResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetHisMZXHResult"));
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
