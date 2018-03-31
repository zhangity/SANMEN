/**
 * GetMzbrCf01.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzbrCf01  implements java.io.Serializable {
    private java.lang.String jzkh;

    private java.lang.String sfzh;

    private java.lang.String mzxh;

    private java.lang.String kfrq;

    public GetMzbrCf01() {
    }

    public GetMzbrCf01(
           java.lang.String jzkh,
           java.lang.String sfzh,
           java.lang.String mzxh,
           java.lang.String kfrq) {
           this.jzkh = jzkh;
           this.sfzh = sfzh;
           this.mzxh = mzxh;
           this.kfrq = kfrq;
    }


    /**
     * Gets the jzkh value for this GetMzbrCf01.
     * 
     * @return jzkh
     */
    public java.lang.String getJzkh() {
        return jzkh;
    }


    /**
     * Sets the jzkh value for this GetMzbrCf01.
     * 
     * @param jzkh
     */
    public void setJzkh(java.lang.String jzkh) {
        this.jzkh = jzkh;
    }


    /**
     * Gets the sfzh value for this GetMzbrCf01.
     * 
     * @return sfzh
     */
    public java.lang.String getSfzh() {
        return sfzh;
    }


    /**
     * Sets the sfzh value for this GetMzbrCf01.
     * 
     * @param sfzh
     */
    public void setSfzh(java.lang.String sfzh) {
        this.sfzh = sfzh;
    }


    /**
     * Gets the mzxh value for this GetMzbrCf01.
     * 
     * @return mzxh
     */
    public java.lang.String getMzxh() {
        return mzxh;
    }


    /**
     * Sets the mzxh value for this GetMzbrCf01.
     * 
     * @param mzxh
     */
    public void setMzxh(java.lang.String mzxh) {
        this.mzxh = mzxh;
    }


    /**
     * Gets the kfrq value for this GetMzbrCf01.
     * 
     * @return kfrq
     */
    public java.lang.String getKfrq() {
        return kfrq;
    }


    /**
     * Sets the kfrq value for this GetMzbrCf01.
     * 
     * @param kfrq
     */
    public void setKfrq(java.lang.String kfrq) {
        this.kfrq = kfrq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzbrCf01)) return false;
        GetMzbrCf01 other = (GetMzbrCf01) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jzkh==null && other.getJzkh()==null) || 
             (this.jzkh!=null &&
              this.jzkh.equals(other.getJzkh()))) &&
            ((this.sfzh==null && other.getSfzh()==null) || 
             (this.sfzh!=null &&
              this.sfzh.equals(other.getSfzh()))) &&
            ((this.mzxh==null && other.getMzxh()==null) || 
             (this.mzxh!=null &&
              this.mzxh.equals(other.getMzxh()))) &&
            ((this.kfrq==null && other.getKfrq()==null) || 
             (this.kfrq!=null &&
              this.kfrq.equals(other.getKfrq())));
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
        if (getJzkh() != null) {
            _hashCode += getJzkh().hashCode();
        }
        if (getSfzh() != null) {
            _hashCode += getSfzh().hashCode();
        }
        if (getMzxh() != null) {
            _hashCode += getMzxh().hashCode();
        }
        if (getKfrq() != null) {
            _hashCode += getKfrq().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzbrCf01.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzbrCf01"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jzkh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jzkh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sfzh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sfzh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mzxh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "mzxh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kfrq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "kfrq"));
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
