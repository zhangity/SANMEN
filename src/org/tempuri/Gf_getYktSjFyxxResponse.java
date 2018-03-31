/**
 * Gf_getYktSjFyxxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getYktSjFyxxResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getYktSjFyxxResult;

    public Gf_getYktSjFyxxResponse() {
    }

    public Gf_getYktSjFyxxResponse(
           org.tempuri.ReturnExTable gf_getYktSjFyxxResult) {
           this.gf_getYktSjFyxxResult = gf_getYktSjFyxxResult;
    }


    /**
     * Gets the gf_getYktSjFyxxResult value for this Gf_getYktSjFyxxResponse.
     * 
     * @return gf_getYktSjFyxxResult
     */
    public org.tempuri.ReturnExTable getGf_getYktSjFyxxResult() {
        return gf_getYktSjFyxxResult;
    }


    /**
     * Sets the gf_getYktSjFyxxResult value for this Gf_getYktSjFyxxResponse.
     * 
     * @param gf_getYktSjFyxxResult
     */
    public void setGf_getYktSjFyxxResult(org.tempuri.ReturnExTable gf_getYktSjFyxxResult) {
        this.gf_getYktSjFyxxResult = gf_getYktSjFyxxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getYktSjFyxxResponse)) return false;
        Gf_getYktSjFyxxResponse other = (Gf_getYktSjFyxxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getYktSjFyxxResult==null && other.getGf_getYktSjFyxxResult()==null) || 
             (this.gf_getYktSjFyxxResult!=null &&
              this.gf_getYktSjFyxxResult.equals(other.getGf_getYktSjFyxxResult())));
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
        if (getGf_getYktSjFyxxResult() != null) {
            _hashCode += getGf_getYktSjFyxxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getYktSjFyxxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getYktSjFyxxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getYktSjFyxxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getYktSjFyxxResult"));
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
