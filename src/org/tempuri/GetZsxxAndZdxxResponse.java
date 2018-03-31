/**
 * GetZsxxAndZdxxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetZsxxAndZdxxResponse  implements java.io.Serializable {
    private java.lang.String getZsxxAndZdxxResult;

    public GetZsxxAndZdxxResponse() {
    }

    public GetZsxxAndZdxxResponse(
           java.lang.String getZsxxAndZdxxResult) {
           this.getZsxxAndZdxxResult = getZsxxAndZdxxResult;
    }


    /**
     * Gets the getZsxxAndZdxxResult value for this GetZsxxAndZdxxResponse.
     * 
     * @return getZsxxAndZdxxResult
     */
    public java.lang.String getGetZsxxAndZdxxResult() {
        return getZsxxAndZdxxResult;
    }


    /**
     * Sets the getZsxxAndZdxxResult value for this GetZsxxAndZdxxResponse.
     * 
     * @param getZsxxAndZdxxResult
     */
    public void setGetZsxxAndZdxxResult(java.lang.String getZsxxAndZdxxResult) {
        this.getZsxxAndZdxxResult = getZsxxAndZdxxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZsxxAndZdxxResponse)) return false;
        GetZsxxAndZdxxResponse other = (GetZsxxAndZdxxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getZsxxAndZdxxResult==null && other.getGetZsxxAndZdxxResult()==null) || 
             (this.getZsxxAndZdxxResult!=null &&
              this.getZsxxAndZdxxResult.equals(other.getGetZsxxAndZdxxResult())));
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
        if (getGetZsxxAndZdxxResult() != null) {
            _hashCode += getGetZsxxAndZdxxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZsxxAndZdxxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetZsxxAndZdxxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getZsxxAndZdxxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetZsxxAndZdxxResult"));
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
