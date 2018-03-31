/**
 * Gf_getPjhm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getPjhm  implements java.io.Serializable {
    private java.lang.String as_czgh;

    private java.lang.String as_pjlx;

    public Gf_getPjhm() {
    }

    public Gf_getPjhm(
           java.lang.String as_czgh,
           java.lang.String as_pjlx) {
           this.as_czgh = as_czgh;
           this.as_pjlx = as_pjlx;
    }


    /**
     * Gets the as_czgh value for this Gf_getPjhm.
     * 
     * @return as_czgh
     */
    public java.lang.String getAs_czgh() {
        return as_czgh;
    }


    /**
     * Sets the as_czgh value for this Gf_getPjhm.
     * 
     * @param as_czgh
     */
    public void setAs_czgh(java.lang.String as_czgh) {
        this.as_czgh = as_czgh;
    }


    /**
     * Gets the as_pjlx value for this Gf_getPjhm.
     * 
     * @return as_pjlx
     */
    public java.lang.String getAs_pjlx() {
        return as_pjlx;
    }


    /**
     * Sets the as_pjlx value for this Gf_getPjhm.
     * 
     * @param as_pjlx
     */
    public void setAs_pjlx(java.lang.String as_pjlx) {
        this.as_pjlx = as_pjlx;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getPjhm)) return false;
        Gf_getPjhm other = (Gf_getPjhm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.as_czgh==null && other.getAs_czgh()==null) || 
             (this.as_czgh!=null &&
              this.as_czgh.equals(other.getAs_czgh()))) &&
            ((this.as_pjlx==null && other.getAs_pjlx()==null) || 
             (this.as_pjlx!=null &&
              this.as_pjlx.equals(other.getAs_pjlx())));
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
        if (getAs_czgh() != null) {
            _hashCode += getAs_czgh().hashCode();
        }
        if (getAs_pjlx() != null) {
            _hashCode += getAs_pjlx().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getPjhm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getPjhm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_czgh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_czgh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_pjlx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_pjlx"));
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
