/**
 * Gf_getJbbhs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getJbbhs  implements java.io.Serializable {
    private java.lang.String as_version;

    private java.lang.String as_jzxhs;

    public Gf_getJbbhs() {
    }

    public Gf_getJbbhs(
           java.lang.String as_version,
           java.lang.String as_jzxhs) {
           this.as_version = as_version;
           this.as_jzxhs = as_jzxhs;
    }


    /**
     * Gets the as_version value for this Gf_getJbbhs.
     * 
     * @return as_version
     */
    public java.lang.String getAs_version() {
        return as_version;
    }


    /**
     * Sets the as_version value for this Gf_getJbbhs.
     * 
     * @param as_version
     */
    public void setAs_version(java.lang.String as_version) {
        this.as_version = as_version;
    }


    /**
     * Gets the as_jzxhs value for this Gf_getJbbhs.
     * 
     * @return as_jzxhs
     */
    public java.lang.String getAs_jzxhs() {
        return as_jzxhs;
    }


    /**
     * Sets the as_jzxhs value for this Gf_getJbbhs.
     * 
     * @param as_jzxhs
     */
    public void setAs_jzxhs(java.lang.String as_jzxhs) {
        this.as_jzxhs = as_jzxhs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getJbbhs)) return false;
        Gf_getJbbhs other = (Gf_getJbbhs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.as_version==null && other.getAs_version()==null) || 
             (this.as_version!=null &&
              this.as_version.equals(other.getAs_version()))) &&
            ((this.as_jzxhs==null && other.getAs_jzxhs()==null) || 
             (this.as_jzxhs!=null &&
              this.as_jzxhs.equals(other.getAs_jzxhs())));
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
        if (getAs_version() != null) {
            _hashCode += getAs_version().hashCode();
        }
        if (getAs_jzxhs() != null) {
            _hashCode += getAs_jzxhs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getJbbhs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getJbbhs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_jzxhs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_jzxhs"));
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
