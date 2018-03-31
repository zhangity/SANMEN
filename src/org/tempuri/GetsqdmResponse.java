/**
 * GetsqdmResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetsqdmResponse  implements java.io.Serializable {
    private org.tempuri.GetsqdmResponseGetsqdmResult getsqdmResult;

    public GetsqdmResponse() {
    }

    public GetsqdmResponse(
           org.tempuri.GetsqdmResponseGetsqdmResult getsqdmResult) {
           this.getsqdmResult = getsqdmResult;
    }


    /**
     * Gets the getsqdmResult value for this GetsqdmResponse.
     * 
     * @return getsqdmResult
     */
    public org.tempuri.GetsqdmResponseGetsqdmResult getGetsqdmResult() {
        return getsqdmResult;
    }


    /**
     * Sets the getsqdmResult value for this GetsqdmResponse.
     * 
     * @param getsqdmResult
     */
    public void setGetsqdmResult(org.tempuri.GetsqdmResponseGetsqdmResult getsqdmResult) {
        this.getsqdmResult = getsqdmResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetsqdmResponse)) return false;
        GetsqdmResponse other = (GetsqdmResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getsqdmResult==null && other.getGetsqdmResult()==null) || 
             (this.getsqdmResult!=null &&
              this.getsqdmResult.equals(other.getGetsqdmResult())));
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
        if (getGetsqdmResult() != null) {
            _hashCode += getGetsqdmResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetsqdmResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetsqdmResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getsqdmResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetsqdmResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetsqdmResponse>GetsqdmResult"));
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
