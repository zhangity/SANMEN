/**
 * GetYpxxCdDj.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYpxxCdDj  implements java.io.Serializable {
    private java.lang.String ypxh;

    private java.lang.String yfsb;

    public GetYpxxCdDj() {
    }

    public GetYpxxCdDj(
           java.lang.String ypxh,
           java.lang.String yfsb) {
           this.ypxh = ypxh;
           this.yfsb = yfsb;
    }


    /**
     * Gets the ypxh value for this GetYpxxCdDj.
     * 
     * @return ypxh
     */
    public java.lang.String getYpxh() {
        return ypxh;
    }


    /**
     * Sets the ypxh value for this GetYpxxCdDj.
     * 
     * @param ypxh
     */
    public void setYpxh(java.lang.String ypxh) {
        this.ypxh = ypxh;
    }


    /**
     * Gets the yfsb value for this GetYpxxCdDj.
     * 
     * @return yfsb
     */
    public java.lang.String getYfsb() {
        return yfsb;
    }


    /**
     * Sets the yfsb value for this GetYpxxCdDj.
     * 
     * @param yfsb
     */
    public void setYfsb(java.lang.String yfsb) {
        this.yfsb = yfsb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYpxxCdDj)) return false;
        GetYpxxCdDj other = (GetYpxxCdDj) obj;
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
            ((this.yfsb==null && other.getYfsb()==null) || 
             (this.yfsb!=null &&
              this.yfsb.equals(other.getYfsb())));
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
        if (getYfsb() != null) {
            _hashCode += getYfsb().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYpxxCdDj.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYpxxCdDj"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ypxh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ypxh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yfsb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "yfsb"));
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
