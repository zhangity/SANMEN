/**
 * GetYpxxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYpxxResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getYpxxResult;

    public GetYpxxResponse() {
    }

    public GetYpxxResponse(
           org.tempuri.ReturnExTable getYpxxResult) {
           this.getYpxxResult = getYpxxResult;
    }


    /**
     * Gets the getYpxxResult value for this GetYpxxResponse.
     * 
     * @return getYpxxResult
     */
    public org.tempuri.ReturnExTable getGetYpxxResult() {
        return getYpxxResult;
    }


    /**
     * Sets the getYpxxResult value for this GetYpxxResponse.
     * 
     * @param getYpxxResult
     */
    public void setGetYpxxResult(org.tempuri.ReturnExTable getYpxxResult) {
        this.getYpxxResult = getYpxxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYpxxResponse)) return false;
        GetYpxxResponse other = (GetYpxxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getYpxxResult==null && other.getGetYpxxResult()==null) || 
             (this.getYpxxResult!=null &&
              this.getYpxxResult.equals(other.getGetYpxxResult())));
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
        if (getGetYpxxResult() != null) {
            _hashCode += getGetYpxxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYpxxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYpxxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getYpxxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetYpxxResult"));
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
