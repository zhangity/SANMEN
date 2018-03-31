/**
 * GetFpcfxmlb.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetFpcfxmlb  implements java.io.Serializable {
    private java.lang.String lx;

    private java.lang.String hm;

    public GetFpcfxmlb() {
    }

    public GetFpcfxmlb(
           java.lang.String lx,
           java.lang.String hm) {
           this.lx = lx;
           this.hm = hm;
    }


    /**
     * Gets the lx value for this GetFpcfxmlb.
     * 
     * @return lx
     */
    public java.lang.String getLx() {
        return lx;
    }


    /**
     * Sets the lx value for this GetFpcfxmlb.
     * 
     * @param lx
     */
    public void setLx(java.lang.String lx) {
        this.lx = lx;
    }


    /**
     * Gets the hm value for this GetFpcfxmlb.
     * 
     * @return hm
     */
    public java.lang.String getHm() {
        return hm;
    }


    /**
     * Sets the hm value for this GetFpcfxmlb.
     * 
     * @param hm
     */
    public void setHm(java.lang.String hm) {
        this.hm = hm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFpcfxmlb)) return false;
        GetFpcfxmlb other = (GetFpcfxmlb) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lx==null && other.getLx()==null) || 
             (this.lx!=null &&
              this.lx.equals(other.getLx()))) &&
            ((this.hm==null && other.getHm()==null) || 
             (this.hm!=null &&
              this.hm.equals(other.getHm())));
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
        if (getLx() != null) {
            _hashCode += getLx().hashCode();
        }
        if (getHm() != null) {
            _hashCode += getHm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFpcfxmlb.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetFpcfxmlb"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "lx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "hm"));
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
