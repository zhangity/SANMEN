/**
 * Gf_get_max2013Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_get_max2013Response  implements java.io.Serializable {
    private java.lang.String gf_get_max2013Result;

    public Gf_get_max2013Response() {
    }

    public Gf_get_max2013Response(
           java.lang.String gf_get_max2013Result) {
           this.gf_get_max2013Result = gf_get_max2013Result;
    }


    /**
     * Gets the gf_get_max2013Result value for this Gf_get_max2013Response.
     * 
     * @return gf_get_max2013Result
     */
    public java.lang.String getGf_get_max2013Result() {
        return gf_get_max2013Result;
    }


    /**
     * Sets the gf_get_max2013Result value for this Gf_get_max2013Response.
     * 
     * @param gf_get_max2013Result
     */
    public void setGf_get_max2013Result(java.lang.String gf_get_max2013Result) {
        this.gf_get_max2013Result = gf_get_max2013Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_get_max2013Response)) return false;
        Gf_get_max2013Response other = (Gf_get_max2013Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_get_max2013Result==null && other.getGf_get_max2013Result()==null) || 
             (this.gf_get_max2013Result!=null &&
              this.gf_get_max2013Result.equals(other.getGf_get_max2013Result())));
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
        if (getGf_get_max2013Result() != null) {
            _hashCode += getGf_get_max2013Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_get_max2013Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_get_max2013Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_get_max2013Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_get_max2013Result"));
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
