/**
 * Gf_getYktSjJygnResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getYktSjJygnResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getYktSjJygnResult;

    public Gf_getYktSjJygnResponse() {
    }

    public Gf_getYktSjJygnResponse(
           org.tempuri.ReturnExTable gf_getYktSjJygnResult) {
           this.gf_getYktSjJygnResult = gf_getYktSjJygnResult;
    }


    /**
     * Gets the gf_getYktSjJygnResult value for this Gf_getYktSjJygnResponse.
     * 
     * @return gf_getYktSjJygnResult
     */
    public org.tempuri.ReturnExTable getGf_getYktSjJygnResult() {
        return gf_getYktSjJygnResult;
    }


    /**
     * Sets the gf_getYktSjJygnResult value for this Gf_getYktSjJygnResponse.
     * 
     * @param gf_getYktSjJygnResult
     */
    public void setGf_getYktSjJygnResult(org.tempuri.ReturnExTable gf_getYktSjJygnResult) {
        this.gf_getYktSjJygnResult = gf_getYktSjJygnResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getYktSjJygnResponse)) return false;
        Gf_getYktSjJygnResponse other = (Gf_getYktSjJygnResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getYktSjJygnResult==null && other.getGf_getYktSjJygnResult()==null) || 
             (this.gf_getYktSjJygnResult!=null &&
              this.gf_getYktSjJygnResult.equals(other.getGf_getYktSjJygnResult())));
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
        if (getGf_getYktSjJygnResult() != null) {
            _hashCode += getGf_getYktSjJygnResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getYktSjJygnResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getYktSjJygnResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getYktSjJygnResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getYktSjJygnResult"));
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
