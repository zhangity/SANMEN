/**
 * Gf_updateEpsmJsjgsjResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_updateEpsmJsjgsjResponse  implements java.io.Serializable {
    private java.lang.String gf_updateEpsmJsjgsjResult;

    public Gf_updateEpsmJsjgsjResponse() {
    }

    public Gf_updateEpsmJsjgsjResponse(
           java.lang.String gf_updateEpsmJsjgsjResult) {
           this.gf_updateEpsmJsjgsjResult = gf_updateEpsmJsjgsjResult;
    }


    /**
     * Gets the gf_updateEpsmJsjgsjResult value for this Gf_updateEpsmJsjgsjResponse.
     * 
     * @return gf_updateEpsmJsjgsjResult
     */
    public java.lang.String getGf_updateEpsmJsjgsjResult() {
        return gf_updateEpsmJsjgsjResult;
    }


    /**
     * Sets the gf_updateEpsmJsjgsjResult value for this Gf_updateEpsmJsjgsjResponse.
     * 
     * @param gf_updateEpsmJsjgsjResult
     */
    public void setGf_updateEpsmJsjgsjResult(java.lang.String gf_updateEpsmJsjgsjResult) {
        this.gf_updateEpsmJsjgsjResult = gf_updateEpsmJsjgsjResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_updateEpsmJsjgsjResponse)) return false;
        Gf_updateEpsmJsjgsjResponse other = (Gf_updateEpsmJsjgsjResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_updateEpsmJsjgsjResult==null && other.getGf_updateEpsmJsjgsjResult()==null) || 
             (this.gf_updateEpsmJsjgsjResult!=null &&
              this.gf_updateEpsmJsjgsjResult.equals(other.getGf_updateEpsmJsjgsjResult())));
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
        if (getGf_updateEpsmJsjgsjResult() != null) {
            _hashCode += getGf_updateEpsmJsjgsjResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_updateEpsmJsjgsjResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_updateEpsmJsjgsjResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_updateEpsmJsjgsjResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_updateEpsmJsjgsjResult"));
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
