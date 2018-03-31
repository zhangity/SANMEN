/**
 * Gf_getYktSjYpmlResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getYktSjYpmlResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getYktSjYpmlResult;

    public Gf_getYktSjYpmlResponse() {
    }

    public Gf_getYktSjYpmlResponse(
           org.tempuri.ReturnExTable gf_getYktSjYpmlResult) {
           this.gf_getYktSjYpmlResult = gf_getYktSjYpmlResult;
    }


    /**
     * Gets the gf_getYktSjYpmlResult value for this Gf_getYktSjYpmlResponse.
     * 
     * @return gf_getYktSjYpmlResult
     */
    public org.tempuri.ReturnExTable getGf_getYktSjYpmlResult() {
        return gf_getYktSjYpmlResult;
    }


    /**
     * Sets the gf_getYktSjYpmlResult value for this Gf_getYktSjYpmlResponse.
     * 
     * @param gf_getYktSjYpmlResult
     */
    public void setGf_getYktSjYpmlResult(org.tempuri.ReturnExTable gf_getYktSjYpmlResult) {
        this.gf_getYktSjYpmlResult = gf_getYktSjYpmlResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getYktSjYpmlResponse)) return false;
        Gf_getYktSjYpmlResponse other = (Gf_getYktSjYpmlResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getYktSjYpmlResult==null && other.getGf_getYktSjYpmlResult()==null) || 
             (this.gf_getYktSjYpmlResult!=null &&
              this.gf_getYktSjYpmlResult.equals(other.getGf_getYktSjYpmlResult())));
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
        if (getGf_getYktSjYpmlResult() != null) {
            _hashCode += getGf_getYktSjYpmlResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getYktSjYpmlResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getYktSjYpmlResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getYktSjYpmlResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getYktSjYpmlResult"));
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
