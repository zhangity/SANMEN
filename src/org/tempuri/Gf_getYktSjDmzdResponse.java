/**
 * Gf_getYktSjDmzdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getYktSjDmzdResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getYktSjDmzdResult;

    public Gf_getYktSjDmzdResponse() {
    }

    public Gf_getYktSjDmzdResponse(
           org.tempuri.ReturnExTable gf_getYktSjDmzdResult) {
           this.gf_getYktSjDmzdResult = gf_getYktSjDmzdResult;
    }


    /**
     * Gets the gf_getYktSjDmzdResult value for this Gf_getYktSjDmzdResponse.
     * 
     * @return gf_getYktSjDmzdResult
     */
    public org.tempuri.ReturnExTable getGf_getYktSjDmzdResult() {
        return gf_getYktSjDmzdResult;
    }


    /**
     * Sets the gf_getYktSjDmzdResult value for this Gf_getYktSjDmzdResponse.
     * 
     * @param gf_getYktSjDmzdResult
     */
    public void setGf_getYktSjDmzdResult(org.tempuri.ReturnExTable gf_getYktSjDmzdResult) {
        this.gf_getYktSjDmzdResult = gf_getYktSjDmzdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getYktSjDmzdResponse)) return false;
        Gf_getYktSjDmzdResponse other = (Gf_getYktSjDmzdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getYktSjDmzdResult==null && other.getGf_getYktSjDmzdResult()==null) || 
             (this.gf_getYktSjDmzdResult!=null &&
              this.gf_getYktSjDmzdResult.equals(other.getGf_getYktSjDmzdResult())));
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
        if (getGf_getYktSjDmzdResult() != null) {
            _hashCode += getGf_getYktSjDmzdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getYktSjDmzdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getYktSjDmzdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getYktSjDmzdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getYktSjDmzdResult"));
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
