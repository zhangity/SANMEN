/**
 * Gf_getYktSjYpxxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getYktSjYpxxResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getYktSjYpxxResult;

    public Gf_getYktSjYpxxResponse() {
    }

    public Gf_getYktSjYpxxResponse(
           org.tempuri.ReturnExTable gf_getYktSjYpxxResult) {
           this.gf_getYktSjYpxxResult = gf_getYktSjYpxxResult;
    }


    /**
     * Gets the gf_getYktSjYpxxResult value for this Gf_getYktSjYpxxResponse.
     * 
     * @return gf_getYktSjYpxxResult
     */
    public org.tempuri.ReturnExTable getGf_getYktSjYpxxResult() {
        return gf_getYktSjYpxxResult;
    }


    /**
     * Sets the gf_getYktSjYpxxResult value for this Gf_getYktSjYpxxResponse.
     * 
     * @param gf_getYktSjYpxxResult
     */
    public void setGf_getYktSjYpxxResult(org.tempuri.ReturnExTable gf_getYktSjYpxxResult) {
        this.gf_getYktSjYpxxResult = gf_getYktSjYpxxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getYktSjYpxxResponse)) return false;
        Gf_getYktSjYpxxResponse other = (Gf_getYktSjYpxxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getYktSjYpxxResult==null && other.getGf_getYktSjYpxxResult()==null) || 
             (this.gf_getYktSjYpxxResult!=null &&
              this.gf_getYktSjYpxxResult.equals(other.getGf_getYktSjYpxxResult())));
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
        if (getGf_getYktSjYpxxResult() != null) {
            _hashCode += getGf_getYktSjYpxxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getYktSjYpxxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getYktSjYpxxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getYktSjYpxxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getYktSjYpxxResult"));
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
