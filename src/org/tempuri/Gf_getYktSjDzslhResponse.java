/**
 * Gf_getYktSjDzslhResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getYktSjDzslhResponse  implements java.io.Serializable {
    private java.lang.String gf_getYktSjDzslhResult;

    public Gf_getYktSjDzslhResponse() {
    }

    public Gf_getYktSjDzslhResponse(
           java.lang.String gf_getYktSjDzslhResult) {
           this.gf_getYktSjDzslhResult = gf_getYktSjDzslhResult;
    }


    /**
     * Gets the gf_getYktSjDzslhResult value for this Gf_getYktSjDzslhResponse.
     * 
     * @return gf_getYktSjDzslhResult
     */
    public java.lang.String getGf_getYktSjDzslhResult() {
        return gf_getYktSjDzslhResult;
    }


    /**
     * Sets the gf_getYktSjDzslhResult value for this Gf_getYktSjDzslhResponse.
     * 
     * @param gf_getYktSjDzslhResult
     */
    public void setGf_getYktSjDzslhResult(java.lang.String gf_getYktSjDzslhResult) {
        this.gf_getYktSjDzslhResult = gf_getYktSjDzslhResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getYktSjDzslhResponse)) return false;
        Gf_getYktSjDzslhResponse other = (Gf_getYktSjDzslhResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getYktSjDzslhResult==null && other.getGf_getYktSjDzslhResult()==null) || 
             (this.gf_getYktSjDzslhResult!=null &&
              this.gf_getYktSjDzslhResult.equals(other.getGf_getYktSjDzslhResult())));
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
        if (getGf_getYktSjDzslhResult() != null) {
            _hashCode += getGf_getYktSjDzslhResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getYktSjDzslhResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getYktSjDzslhResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getYktSjDzslhResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getYktSjDzslhResult"));
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
