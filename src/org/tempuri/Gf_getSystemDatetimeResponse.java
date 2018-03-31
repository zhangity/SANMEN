/**
 * Gf_getSystemDatetimeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getSystemDatetimeResponse  implements java.io.Serializable {
    private java.lang.String gf_getSystemDatetimeResult;

    public Gf_getSystemDatetimeResponse() {
    }

    public Gf_getSystemDatetimeResponse(
           java.lang.String gf_getSystemDatetimeResult) {
           this.gf_getSystemDatetimeResult = gf_getSystemDatetimeResult;
    }


    /**
     * Gets the gf_getSystemDatetimeResult value for this Gf_getSystemDatetimeResponse.
     * 
     * @return gf_getSystemDatetimeResult
     */
    public java.lang.String getGf_getSystemDatetimeResult() {
        return gf_getSystemDatetimeResult;
    }


    /**
     * Sets the gf_getSystemDatetimeResult value for this Gf_getSystemDatetimeResponse.
     * 
     * @param gf_getSystemDatetimeResult
     */
    public void setGf_getSystemDatetimeResult(java.lang.String gf_getSystemDatetimeResult) {
        this.gf_getSystemDatetimeResult = gf_getSystemDatetimeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getSystemDatetimeResponse)) return false;
        Gf_getSystemDatetimeResponse other = (Gf_getSystemDatetimeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getSystemDatetimeResult==null && other.getGf_getSystemDatetimeResult()==null) || 
             (this.gf_getSystemDatetimeResult!=null &&
              this.gf_getSystemDatetimeResult.equals(other.getGf_getSystemDatetimeResult())));
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
        if (getGf_getSystemDatetimeResult() != null) {
            _hashCode += getGf_getSystemDatetimeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getSystemDatetimeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getSystemDatetimeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getSystemDatetimeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getSystemDatetimeResult"));
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
