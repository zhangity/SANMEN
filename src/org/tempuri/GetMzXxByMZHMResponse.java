/**
 * GetMzXxByMZHMResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzXxByMZHMResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getMzXxByMZHMResult;

    public GetMzXxByMZHMResponse() {
    }

    public GetMzXxByMZHMResponse(
           org.tempuri.ReturnExTable getMzXxByMZHMResult) {
           this.getMzXxByMZHMResult = getMzXxByMZHMResult;
    }


    /**
     * Gets the getMzXxByMZHMResult value for this GetMzXxByMZHMResponse.
     * 
     * @return getMzXxByMZHMResult
     */
    public org.tempuri.ReturnExTable getGetMzXxByMZHMResult() {
        return getMzXxByMZHMResult;
    }


    /**
     * Sets the getMzXxByMZHMResult value for this GetMzXxByMZHMResponse.
     * 
     * @param getMzXxByMZHMResult
     */
    public void setGetMzXxByMZHMResult(org.tempuri.ReturnExTable getMzXxByMZHMResult) {
        this.getMzXxByMZHMResult = getMzXxByMZHMResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzXxByMZHMResponse)) return false;
        GetMzXxByMZHMResponse other = (GetMzXxByMZHMResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMzXxByMZHMResult==null && other.getGetMzXxByMZHMResult()==null) || 
             (this.getMzXxByMZHMResult!=null &&
              this.getMzXxByMZHMResult.equals(other.getGetMzXxByMZHMResult())));
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
        if (getGetMzXxByMZHMResult() != null) {
            _hashCode += getGetMzXxByMZHMResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzXxByMZHMResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzXxByMZHMResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMzXxByMZHMResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMzXxByMZHMResult"));
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
