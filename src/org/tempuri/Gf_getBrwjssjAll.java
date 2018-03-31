/**
 * Gf_getBrwjssjAll.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getBrwjssjAll  implements java.io.Serializable {
    private java.lang.String as_brid;

    private java.lang.String as_kfrqb;

    private java.lang.String as_kfrqo;

    private java.lang.String ksdm;

    public Gf_getBrwjssjAll() {
    }

    public Gf_getBrwjssjAll(
           java.lang.String as_brid,
           java.lang.String as_kfrqb,
           java.lang.String as_kfrqo,
           java.lang.String ksdm) {
           this.as_brid = as_brid;
           this.as_kfrqb = as_kfrqb;
           this.as_kfrqo = as_kfrqo;
           this.ksdm = ksdm;
    }


    /**
     * Gets the as_brid value for this Gf_getBrwjssjAll.
     * 
     * @return as_brid
     */
    public java.lang.String getAs_brid() {
        return as_brid;
    }


    /**
     * Sets the as_brid value for this Gf_getBrwjssjAll.
     * 
     * @param as_brid
     */
    public void setAs_brid(java.lang.String as_brid) {
        this.as_brid = as_brid;
    }


    /**
     * Gets the as_kfrqb value for this Gf_getBrwjssjAll.
     * 
     * @return as_kfrqb
     */
    public java.lang.String getAs_kfrqb() {
        return as_kfrqb;
    }


    /**
     * Sets the as_kfrqb value for this Gf_getBrwjssjAll.
     * 
     * @param as_kfrqb
     */
    public void setAs_kfrqb(java.lang.String as_kfrqb) {
        this.as_kfrqb = as_kfrqb;
    }


    /**
     * Gets the as_kfrqo value for this Gf_getBrwjssjAll.
     * 
     * @return as_kfrqo
     */
    public java.lang.String getAs_kfrqo() {
        return as_kfrqo;
    }


    /**
     * Sets the as_kfrqo value for this Gf_getBrwjssjAll.
     * 
     * @param as_kfrqo
     */
    public void setAs_kfrqo(java.lang.String as_kfrqo) {
        this.as_kfrqo = as_kfrqo;
    }


    /**
     * Gets the ksdm value for this Gf_getBrwjssjAll.
     * 
     * @return ksdm
     */
    public java.lang.String getKsdm() {
        return ksdm;
    }


    /**
     * Sets the ksdm value for this Gf_getBrwjssjAll.
     * 
     * @param ksdm
     */
    public void setKsdm(java.lang.String ksdm) {
        this.ksdm = ksdm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getBrwjssjAll)) return false;
        Gf_getBrwjssjAll other = (Gf_getBrwjssjAll) obj;
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
            ((this.as_kfrqb==null && other.getAs_kfrqb()==null) || 
             (this.as_kfrqb!=null &&
              this.as_kfrqb.equals(other.getAs_kfrqb()))) &&
            ((this.as_kfrqo==null && other.getAs_kfrqo()==null) || 
             (this.as_kfrqo!=null &&
              this.as_kfrqo.equals(other.getAs_kfrqo()))) &&
            ((this.ksdm==null && other.getKsdm()==null) || 
             (this.ksdm!=null &&
              this.ksdm.equals(other.getKsdm())));
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
        if (getAs_kfrqb() != null) {
            _hashCode += getAs_kfrqb().hashCode();
        }
        if (getAs_kfrqo() != null) {
            _hashCode += getAs_kfrqo().hashCode();
        }
        if (getKsdm() != null) {
            _hashCode += getKsdm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getBrwjssjAll.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getBrwjssjAll"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_brid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_brid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_kfrqb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_kfrqb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_kfrqo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_kfrqo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ksdm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ksdm"));
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
