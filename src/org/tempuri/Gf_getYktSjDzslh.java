/**
 * Gf_getYktSjDzslh.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getYktSjDzslh  implements java.io.Serializable {
    private java.lang.String as_ygxx;

    private java.lang.String as_zczh;

    private java.lang.String as_jydm;

    public Gf_getYktSjDzslh() {
    }

    public Gf_getYktSjDzslh(
           java.lang.String as_ygxx,
           java.lang.String as_zczh,
           java.lang.String as_jydm) {
           this.as_ygxx = as_ygxx;
           this.as_zczh = as_zczh;
           this.as_jydm = as_jydm;
    }


    /**
     * Gets the as_ygxx value for this Gf_getYktSjDzslh.
     * 
     * @return as_ygxx
     */
    public java.lang.String getAs_ygxx() {
        return as_ygxx;
    }


    /**
     * Sets the as_ygxx value for this Gf_getYktSjDzslh.
     * 
     * @param as_ygxx
     */
    public void setAs_ygxx(java.lang.String as_ygxx) {
        this.as_ygxx = as_ygxx;
    }


    /**
     * Gets the as_zczh value for this Gf_getYktSjDzslh.
     * 
     * @return as_zczh
     */
    public java.lang.String getAs_zczh() {
        return as_zczh;
    }


    /**
     * Sets the as_zczh value for this Gf_getYktSjDzslh.
     * 
     * @param as_zczh
     */
    public void setAs_zczh(java.lang.String as_zczh) {
        this.as_zczh = as_zczh;
    }


    /**
     * Gets the as_jydm value for this Gf_getYktSjDzslh.
     * 
     * @return as_jydm
     */
    public java.lang.String getAs_jydm() {
        return as_jydm;
    }


    /**
     * Sets the as_jydm value for this Gf_getYktSjDzslh.
     * 
     * @param as_jydm
     */
    public void setAs_jydm(java.lang.String as_jydm) {
        this.as_jydm = as_jydm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getYktSjDzslh)) return false;
        Gf_getYktSjDzslh other = (Gf_getYktSjDzslh) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.as_ygxx==null && other.getAs_ygxx()==null) || 
             (this.as_ygxx!=null &&
              this.as_ygxx.equals(other.getAs_ygxx()))) &&
            ((this.as_zczh==null && other.getAs_zczh()==null) || 
             (this.as_zczh!=null &&
              this.as_zczh.equals(other.getAs_zczh()))) &&
            ((this.as_jydm==null && other.getAs_jydm()==null) || 
             (this.as_jydm!=null &&
              this.as_jydm.equals(other.getAs_jydm())));
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
        if (getAs_ygxx() != null) {
            _hashCode += getAs_ygxx().hashCode();
        }
        if (getAs_zczh() != null) {
            _hashCode += getAs_zczh().hashCode();
        }
        if (getAs_jydm() != null) {
            _hashCode += getAs_jydm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getYktSjDzslh.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getYktSjDzslh"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_ygxx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_ygxx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_zczh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_zczh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_jydm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_jydm"));
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
