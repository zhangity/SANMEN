/**
 * Gf_getYktSjBrwjssjResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getYktSjBrwjssjResponse  implements java.io.Serializable {
    private org.tempuri.Gf_getYktSjBrwjssjResponseGf_getYktSjBrwjssjResult gf_getYktSjBrwjssjResult;

    public Gf_getYktSjBrwjssjResponse() {
    }

    public Gf_getYktSjBrwjssjResponse(
           org.tempuri.Gf_getYktSjBrwjssjResponseGf_getYktSjBrwjssjResult gf_getYktSjBrwjssjResult) {
           this.gf_getYktSjBrwjssjResult = gf_getYktSjBrwjssjResult;
    }


    /**
     * Gets the gf_getYktSjBrwjssjResult value for this Gf_getYktSjBrwjssjResponse.
     * 
     * @return gf_getYktSjBrwjssjResult
     */
    public org.tempuri.Gf_getYktSjBrwjssjResponseGf_getYktSjBrwjssjResult getGf_getYktSjBrwjssjResult() {
        return gf_getYktSjBrwjssjResult;
    }


    /**
     * Sets the gf_getYktSjBrwjssjResult value for this Gf_getYktSjBrwjssjResponse.
     * 
     * @param gf_getYktSjBrwjssjResult
     */
    public void setGf_getYktSjBrwjssjResult(org.tempuri.Gf_getYktSjBrwjssjResponseGf_getYktSjBrwjssjResult gf_getYktSjBrwjssjResult) {
        this.gf_getYktSjBrwjssjResult = gf_getYktSjBrwjssjResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getYktSjBrwjssjResponse)) return false;
        Gf_getYktSjBrwjssjResponse other = (Gf_getYktSjBrwjssjResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getYktSjBrwjssjResult==null && other.getGf_getYktSjBrwjssjResult()==null) || 
             (this.gf_getYktSjBrwjssjResult!=null &&
              this.gf_getYktSjBrwjssjResult.equals(other.getGf_getYktSjBrwjssjResult())));
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
        if (getGf_getYktSjBrwjssjResult() != null) {
            _hashCode += getGf_getYktSjBrwjssjResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getYktSjBrwjssjResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getYktSjBrwjssjResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getYktSjBrwjssjResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getYktSjBrwjssjResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>gf_getYktSjBrwjssjResponse>gf_getYktSjBrwjssjResult"));
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
