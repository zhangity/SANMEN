/**
 * Gf_getYktSjJbxxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getYktSjJbxxResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getYktSjJbxxResult;

    public Gf_getYktSjJbxxResponse() {
    }

    public Gf_getYktSjJbxxResponse(
           org.tempuri.ReturnExTable gf_getYktSjJbxxResult) {
           this.gf_getYktSjJbxxResult = gf_getYktSjJbxxResult;
    }


    /**
     * Gets the gf_getYktSjJbxxResult value for this Gf_getYktSjJbxxResponse.
     * 
     * @return gf_getYktSjJbxxResult
     */
    public org.tempuri.ReturnExTable getGf_getYktSjJbxxResult() {
        return gf_getYktSjJbxxResult;
    }


    /**
     * Sets the gf_getYktSjJbxxResult value for this Gf_getYktSjJbxxResponse.
     * 
     * @param gf_getYktSjJbxxResult
     */
    public void setGf_getYktSjJbxxResult(org.tempuri.ReturnExTable gf_getYktSjJbxxResult) {
        this.gf_getYktSjJbxxResult = gf_getYktSjJbxxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getYktSjJbxxResponse)) return false;
        Gf_getYktSjJbxxResponse other = (Gf_getYktSjJbxxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getYktSjJbxxResult==null && other.getGf_getYktSjJbxxResult()==null) || 
             (this.gf_getYktSjJbxxResult!=null &&
              this.gf_getYktSjJbxxResult.equals(other.getGf_getYktSjJbxxResult())));
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
        if (getGf_getYktSjJbxxResult() != null) {
            _hashCode += getGf_getYktSjJbxxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getYktSjJbxxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getYktSjJbxxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getYktSjJbxxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getYktSjJbxxResult"));
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
