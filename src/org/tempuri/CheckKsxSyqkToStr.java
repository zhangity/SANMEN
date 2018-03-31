/**
 * CheckKsxSyqkToStr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CheckKsxSyqkToStr  implements java.io.Serializable {
    private java.lang.String ypxh;

    private java.lang.String ysgh;

    private java.lang.String ycsl;

    public CheckKsxSyqkToStr() {
    }

    public CheckKsxSyqkToStr(
           java.lang.String ypxh,
           java.lang.String ysgh,
           java.lang.String ycsl) {
           this.ypxh = ypxh;
           this.ysgh = ysgh;
           this.ycsl = ycsl;
    }


    /**
     * Gets the ypxh value for this CheckKsxSyqkToStr.
     * 
     * @return ypxh
     */
    public java.lang.String getYpxh() {
        return ypxh;
    }


    /**
     * Sets the ypxh value for this CheckKsxSyqkToStr.
     * 
     * @param ypxh
     */
    public void setYpxh(java.lang.String ypxh) {
        this.ypxh = ypxh;
    }


    /**
     * Gets the ysgh value for this CheckKsxSyqkToStr.
     * 
     * @return ysgh
     */
    public java.lang.String getYsgh() {
        return ysgh;
    }


    /**
     * Sets the ysgh value for this CheckKsxSyqkToStr.
     * 
     * @param ysgh
     */
    public void setYsgh(java.lang.String ysgh) {
        this.ysgh = ysgh;
    }


    /**
     * Gets the ycsl value for this CheckKsxSyqkToStr.
     * 
     * @return ycsl
     */
    public java.lang.String getYcsl() {
        return ycsl;
    }


    /**
     * Sets the ycsl value for this CheckKsxSyqkToStr.
     * 
     * @param ycsl
     */
    public void setYcsl(java.lang.String ycsl) {
        this.ycsl = ycsl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckKsxSyqkToStr)) return false;
        CheckKsxSyqkToStr other = (CheckKsxSyqkToStr) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ypxh==null && other.getYpxh()==null) || 
             (this.ypxh!=null &&
              this.ypxh.equals(other.getYpxh()))) &&
            ((this.ysgh==null && other.getYsgh()==null) || 
             (this.ysgh!=null &&
              this.ysgh.equals(other.getYsgh()))) &&
            ((this.ycsl==null && other.getYcsl()==null) || 
             (this.ycsl!=null &&
              this.ycsl.equals(other.getYcsl())));
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
        if (getYpxh() != null) {
            _hashCode += getYpxh().hashCode();
        }
        if (getYsgh() != null) {
            _hashCode += getYsgh().hashCode();
        }
        if (getYcsl() != null) {
            _hashCode += getYcsl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckKsxSyqkToStr.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CheckKsxSyqkToStr"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ypxh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ypxh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ysgh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ysgh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ycsl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ycsl"));
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
