/**
 * Gf_updateEpsmJsjlZxlsh.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_updateEpsmJsjlZxlsh  implements java.io.Serializable {
    private java.lang.String as_zxlsh;

    private java.lang.String as_fphm;

    private java.lang.String as_jzlx;

    public Gf_updateEpsmJsjlZxlsh() {
    }

    public Gf_updateEpsmJsjlZxlsh(
           java.lang.String as_zxlsh,
           java.lang.String as_fphm,
           java.lang.String as_jzlx) {
           this.as_zxlsh = as_zxlsh;
           this.as_fphm = as_fphm;
           this.as_jzlx = as_jzlx;
    }


    /**
     * Gets the as_zxlsh value for this Gf_updateEpsmJsjlZxlsh.
     * 
     * @return as_zxlsh
     */
    public java.lang.String getAs_zxlsh() {
        return as_zxlsh;
    }


    /**
     * Sets the as_zxlsh value for this Gf_updateEpsmJsjlZxlsh.
     * 
     * @param as_zxlsh
     */
    public void setAs_zxlsh(java.lang.String as_zxlsh) {
        this.as_zxlsh = as_zxlsh;
    }


    /**
     * Gets the as_fphm value for this Gf_updateEpsmJsjlZxlsh.
     * 
     * @return as_fphm
     */
    public java.lang.String getAs_fphm() {
        return as_fphm;
    }


    /**
     * Sets the as_fphm value for this Gf_updateEpsmJsjlZxlsh.
     * 
     * @param as_fphm
     */
    public void setAs_fphm(java.lang.String as_fphm) {
        this.as_fphm = as_fphm;
    }


    /**
     * Gets the as_jzlx value for this Gf_updateEpsmJsjlZxlsh.
     * 
     * @return as_jzlx
     */
    public java.lang.String getAs_jzlx() {
        return as_jzlx;
    }


    /**
     * Sets the as_jzlx value for this Gf_updateEpsmJsjlZxlsh.
     * 
     * @param as_jzlx
     */
    public void setAs_jzlx(java.lang.String as_jzlx) {
        this.as_jzlx = as_jzlx;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_updateEpsmJsjlZxlsh)) return false;
        Gf_updateEpsmJsjlZxlsh other = (Gf_updateEpsmJsjlZxlsh) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.as_zxlsh==null && other.getAs_zxlsh()==null) || 
             (this.as_zxlsh!=null &&
              this.as_zxlsh.equals(other.getAs_zxlsh()))) &&
            ((this.as_fphm==null && other.getAs_fphm()==null) || 
             (this.as_fphm!=null &&
              this.as_fphm.equals(other.getAs_fphm()))) &&
            ((this.as_jzlx==null && other.getAs_jzlx()==null) || 
             (this.as_jzlx!=null &&
              this.as_jzlx.equals(other.getAs_jzlx())));
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
        if (getAs_zxlsh() != null) {
            _hashCode += getAs_zxlsh().hashCode();
        }
        if (getAs_fphm() != null) {
            _hashCode += getAs_fphm().hashCode();
        }
        if (getAs_jzlx() != null) {
            _hashCode += getAs_jzlx().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_updateEpsmJsjlZxlsh.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_updateEpsmJsjlZxlsh"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_zxlsh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_zxlsh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_fphm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_fphm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_jzlx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_jzlx"));
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
