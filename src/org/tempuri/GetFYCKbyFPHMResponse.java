/**
 * GetFYCKbyFPHMResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetFYCKbyFPHMResponse  implements java.io.Serializable {
    private java.lang.String getFYCKbyFPHMResult;

    public GetFYCKbyFPHMResponse() {
    }

    public GetFYCKbyFPHMResponse(
           java.lang.String getFYCKbyFPHMResult) {
           this.getFYCKbyFPHMResult = getFYCKbyFPHMResult;
    }


    /**
     * Gets the getFYCKbyFPHMResult value for this GetFYCKbyFPHMResponse.
     * 
     * @return getFYCKbyFPHMResult
     */
    public java.lang.String getGetFYCKbyFPHMResult() {
        return getFYCKbyFPHMResult;
    }


    /**
     * Sets the getFYCKbyFPHMResult value for this GetFYCKbyFPHMResponse.
     * 
     * @param getFYCKbyFPHMResult
     */
    public void setGetFYCKbyFPHMResult(java.lang.String getFYCKbyFPHMResult) {
        this.getFYCKbyFPHMResult = getFYCKbyFPHMResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFYCKbyFPHMResponse)) return false;
        GetFYCKbyFPHMResponse other = (GetFYCKbyFPHMResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFYCKbyFPHMResult==null && other.getGetFYCKbyFPHMResult()==null) || 
             (this.getFYCKbyFPHMResult!=null &&
              this.getFYCKbyFPHMResult.equals(other.getGetFYCKbyFPHMResult())));
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
        if (getGetFYCKbyFPHMResult() != null) {
            _hashCode += getGetFYCKbyFPHMResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFYCKbyFPHMResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetFYCKbyFPHMResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFYCKbyFPHMResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetFYCKbyFPHMResult"));
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
