/**
 * Gf_getEpsmBrwjssj.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getEpsmBrwjssj  implements java.io.Serializable {
    private java.lang.String as_brid;

    private java.lang.String as_mzxh;

    public Gf_getEpsmBrwjssj() {
    }

    public Gf_getEpsmBrwjssj(
           java.lang.String as_brid,
           java.lang.String as_mzxh) {
           this.as_brid = as_brid;
           this.as_mzxh = as_mzxh;
    }


    /**
     * Gets the as_brid value for this Gf_getEpsmBrwjssj.
     * 
     * @return as_brid
     */
    public java.lang.String getAs_brid() {
        return as_brid;
    }


    /**
     * Sets the as_brid value for this Gf_getEpsmBrwjssj.
     * 
     * @param as_brid
     */
    public void setAs_brid(java.lang.String as_brid) {
        this.as_brid = as_brid;
    }


    /**
     * Gets the as_mzxh value for this Gf_getEpsmBrwjssj.
     * 
     * @return as_mzxh
     */
    public java.lang.String getAs_mzxh() {
        return as_mzxh;
    }


    /**
     * Sets the as_mzxh value for this Gf_getEpsmBrwjssj.
     * 
     * @param as_mzxh
     */
    public void setAs_mzxh(java.lang.String as_mzxh) {
        this.as_mzxh = as_mzxh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getEpsmBrwjssj)) return false;
        Gf_getEpsmBrwjssj other = (Gf_getEpsmBrwjssj) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.as_brid==null && other.getAs_brid()==null) || 
             (this.as_brid!=null &&
              this.as_brid.equals(other.getAs_brid()))) &&
            ((this.as_mzxh==null && other.getAs_mzxh()==null) || 
             (this.as_mzxh!=null &&
              this.as_mzxh.equals(other.getAs_mzxh())));
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
        if (getAs_brid() != null) {
            _hashCode += getAs_brid().hashCode();
        }
        if (getAs_mzxh() != null) {
            _hashCode += getAs_mzxh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getEpsmBrwjssj.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getEpsmBrwjssj"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_brid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_brid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_mzxh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_mzxh"));
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
