/**
 * Gf_getpara.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getpara  implements java.io.Serializable {
    private int li_xtsb;

    private java.lang.String ls_csmc;

    private java.lang.String ls_default;

    private java.lang.String ls_bz;

    public Gf_getpara() {
    }

    public Gf_getpara(
           int li_xtsb,
           java.lang.String ls_csmc,
           java.lang.String ls_default,
           java.lang.String ls_bz) {
           this.li_xtsb = li_xtsb;
           this.ls_csmc = ls_csmc;
           this.ls_default = ls_default;
           this.ls_bz = ls_bz;
    }


    /**
     * Gets the li_xtsb value for this Gf_getpara.
     * 
     * @return li_xtsb
     */
    public int getLi_xtsb() {
        return li_xtsb;
    }


    /**
     * Sets the li_xtsb value for this Gf_getpara.
     * 
     * @param li_xtsb
     */
    public void setLi_xtsb(int li_xtsb) {
        this.li_xtsb = li_xtsb;
    }


    /**
     * Gets the ls_csmc value for this Gf_getpara.
     * 
     * @return ls_csmc
     */
    public java.lang.String getLs_csmc() {
        return ls_csmc;
    }


    /**
     * Sets the ls_csmc value for this Gf_getpara.
     * 
     * @param ls_csmc
     */
    public void setLs_csmc(java.lang.String ls_csmc) {
        this.ls_csmc = ls_csmc;
    }


    /**
     * Gets the ls_default value for this Gf_getpara.
     * 
     * @return ls_default
     */
    public java.lang.String getLs_default() {
        return ls_default;
    }


    /**
     * Sets the ls_default value for this Gf_getpara.
     * 
     * @param ls_default
     */
    public void setLs_default(java.lang.String ls_default) {
        this.ls_default = ls_default;
    }


    /**
     * Gets the ls_bz value for this Gf_getpara.
     * 
     * @return ls_bz
     */
    public java.lang.String getLs_bz() {
        return ls_bz;
    }


    /**
     * Sets the ls_bz value for this Gf_getpara.
     * 
     * @param ls_bz
     */
    public void setLs_bz(java.lang.String ls_bz) {
        this.ls_bz = ls_bz;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getpara)) return false;
        Gf_getpara other = (Gf_getpara) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.li_xtsb == other.getLi_xtsb() &&
            ((this.ls_csmc==null && other.getLs_csmc()==null) || 
             (this.ls_csmc!=null &&
              this.ls_csmc.equals(other.getLs_csmc()))) &&
            ((this.ls_default==null && other.getLs_default()==null) || 
             (this.ls_default!=null &&
              this.ls_default.equals(other.getLs_default()))) &&
            ((this.ls_bz==null && other.getLs_bz()==null) || 
             (this.ls_bz!=null &&
              this.ls_bz.equals(other.getLs_bz())));
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
        _hashCode += getLi_xtsb();
        if (getLs_csmc() != null) {
            _hashCode += getLs_csmc().hashCode();
        }
        if (getLs_default() != null) {
            _hashCode += getLs_default().hashCode();
        }
        if (getLs_bz() != null) {
            _hashCode += getLs_bz().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getpara.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getpara"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("li_xtsb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "li_xtsb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ls_csmc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ls_csmc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ls_default");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ls_default"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ls_bz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ls_bz"));
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
