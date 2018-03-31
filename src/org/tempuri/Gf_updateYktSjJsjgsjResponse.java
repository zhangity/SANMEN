/**
 * Gf_updateYktSjJsjgsjResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_updateYktSjJsjgsjResponse  implements java.io.Serializable {
    private java.lang.String gf_updateYktSjJsjgsjResult;

    public Gf_updateYktSjJsjgsjResponse() {
    }

    public Gf_updateYktSjJsjgsjResponse(
           java.lang.String gf_updateYktSjJsjgsjResult) {
           this.gf_updateYktSjJsjgsjResult = gf_updateYktSjJsjgsjResult;
    }


    /**
     * Gets the gf_updateYktSjJsjgsjResult value for this Gf_updateYktSjJsjgsjResponse.
     * 
     * @return gf_updateYktSjJsjgsjResult
     */
    public java.lang.String getGf_updateYktSjJsjgsjResult() {
        return gf_updateYktSjJsjgsjResult;
    }


    /**
     * Sets the gf_updateYktSjJsjgsjResult value for this Gf_updateYktSjJsjgsjResponse.
     * 
     * @param gf_updateYktSjJsjgsjResult
     */
    public void setGf_updateYktSjJsjgsjResult(java.lang.String gf_updateYktSjJsjgsjResult) {
        this.gf_updateYktSjJsjgsjResult = gf_updateYktSjJsjgsjResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_updateYktSjJsjgsjResponse)) return false;
        Gf_updateYktSjJsjgsjResponse other = (Gf_updateYktSjJsjgsjResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_updateYktSjJsjgsjResult==null && other.getGf_updateYktSjJsjgsjResult()==null) || 
             (this.gf_updateYktSjJsjgsjResult!=null &&
              this.gf_updateYktSjJsjgsjResult.equals(other.getGf_updateYktSjJsjgsjResult())));
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
        if (getGf_updateYktSjJsjgsjResult() != null) {
            _hashCode += getGf_updateYktSjJsjgsjResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_updateYktSjJsjgsjResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_updateYktSjJsjgsjResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_updateYktSjJsjgsjResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_updateYktSjJsjgsjResult"));
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
