/**
 * GetSqjlBySqdh.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSqjlBySqdh  implements java.io.Serializable {
    private java.lang.String ssbh;

    private int bj;

    public GetSqjlBySqdh() {
    }

    public GetSqjlBySqdh(
           java.lang.String ssbh,
           int bj) {
           this.ssbh = ssbh;
           this.bj = bj;
    }


    /**
     * Gets the ssbh value for this GetSqjlBySqdh.
     * 
     * @return ssbh
     */
    public java.lang.String getSsbh() {
        return ssbh;
    }


    /**
     * Sets the ssbh value for this GetSqjlBySqdh.
     * 
     * @param ssbh
     */
    public void setSsbh(java.lang.String ssbh) {
        this.ssbh = ssbh;
    }


    /**
     * Gets the bj value for this GetSqjlBySqdh.
     * 
     * @return bj
     */
    public int getBj() {
        return bj;
    }


    /**
     * Sets the bj value for this GetSqjlBySqdh.
     * 
     * @param bj
     */
    public void setBj(int bj) {
        this.bj = bj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSqjlBySqdh)) return false;
        GetSqjlBySqdh other = (GetSqjlBySqdh) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ssbh==null && other.getSsbh()==null) || 
             (this.ssbh!=null &&
              this.ssbh.equals(other.getSsbh()))) &&
            this.bj == other.getBj();
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
        if (getSsbh() != null) {
            _hashCode += getSsbh().hashCode();
        }
        _hashCode += getBj();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSqjlBySqdh.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSqjlBySqdh"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssbh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ssbh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "bj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
