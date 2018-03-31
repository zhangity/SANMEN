/**
 * Gf_getYktSjYbzhResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getYktSjYbzhResponse  implements java.io.Serializable {
    private java.lang.String gf_getYktSjYbzhResult;

    public Gf_getYktSjYbzhResponse() {
    }

    public Gf_getYktSjYbzhResponse(
           java.lang.String gf_getYktSjYbzhResult) {
           this.gf_getYktSjYbzhResult = gf_getYktSjYbzhResult;
    }


    /**
     * Gets the gf_getYktSjYbzhResult value for this Gf_getYktSjYbzhResponse.
     * 
     * @return gf_getYktSjYbzhResult
     */
    public java.lang.String getGf_getYktSjYbzhResult() {
        return gf_getYktSjYbzhResult;
    }


    /**
     * Sets the gf_getYktSjYbzhResult value for this Gf_getYktSjYbzhResponse.
     * 
     * @param gf_getYktSjYbzhResult
     */
    public void setGf_getYktSjYbzhResult(java.lang.String gf_getYktSjYbzhResult) {
        this.gf_getYktSjYbzhResult = gf_getYktSjYbzhResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getYktSjYbzhResponse)) return false;
        Gf_getYktSjYbzhResponse other = (Gf_getYktSjYbzhResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getYktSjYbzhResult==null && other.getGf_getYktSjYbzhResult()==null) || 
             (this.gf_getYktSjYbzhResult!=null &&
              this.gf_getYktSjYbzhResult.equals(other.getGf_getYktSjYbzhResult())));
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
        if (getGf_getYktSjYbzhResult() != null) {
            _hashCode += getGf_getYktSjYbzhResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getYktSjYbzhResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getYktSjYbzhResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getYktSjYbzhResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getYktSjYbzhResult"));
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
