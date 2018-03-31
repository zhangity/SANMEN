/**
 * Gf_getparaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getparaResponse  implements java.io.Serializable {
    private java.lang.String gf_getparaResult;

    public Gf_getparaResponse() {
    }

    public Gf_getparaResponse(
           java.lang.String gf_getparaResult) {
           this.gf_getparaResult = gf_getparaResult;
    }


    /**
     * Gets the gf_getparaResult value for this Gf_getparaResponse.
     * 
     * @return gf_getparaResult
     */
    public java.lang.String getGf_getparaResult() {
        return gf_getparaResult;
    }


    /**
     * Sets the gf_getparaResult value for this Gf_getparaResponse.
     * 
     * @param gf_getparaResult
     */
    public void setGf_getparaResult(java.lang.String gf_getparaResult) {
        this.gf_getparaResult = gf_getparaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getparaResponse)) return false;
        Gf_getparaResponse other = (Gf_getparaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getparaResult==null && other.getGf_getparaResult()==null) || 
             (this.gf_getparaResult!=null &&
              this.gf_getparaResult.equals(other.getGf_getparaResult())));
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
        if (getGf_getparaResult() != null) {
            _hashCode += getGf_getparaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getparaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getparaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getparaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getparaResult"));
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
