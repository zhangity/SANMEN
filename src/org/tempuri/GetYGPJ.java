/**
 * GetYGPJ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYGPJ  implements java.io.Serializable {
    private java.lang.String PJLX;

    private java.lang.String where;

    public GetYGPJ() {
    }

    public GetYGPJ(
           java.lang.String PJLX,
           java.lang.String where) {
           this.PJLX = PJLX;
           this.where = where;
    }


    /**
     * Gets the PJLX value for this GetYGPJ.
     * 
     * @return PJLX
     */
    public java.lang.String getPJLX() {
        return PJLX;
    }


    /**
     * Sets the PJLX value for this GetYGPJ.
     * 
     * @param PJLX
     */
    public void setPJLX(java.lang.String PJLX) {
        this.PJLX = PJLX;
    }


    /**
     * Gets the where value for this GetYGPJ.
     * 
     * @return where
     */
    public java.lang.String getWhere() {
        return where;
    }


    /**
     * Sets the where value for this GetYGPJ.
     * 
     * @param where
     */
    public void setWhere(java.lang.String where) {
        this.where = where;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYGPJ)) return false;
        GetYGPJ other = (GetYGPJ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PJLX==null && other.getPJLX()==null) || 
             (this.PJLX!=null &&
              this.PJLX.equals(other.getPJLX()))) &&
            ((this.where==null && other.getWhere()==null) || 
             (this.where!=null &&
              this.where.equals(other.getWhere())));
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
        if (getPJLX() != null) {
            _hashCode += getPJLX().hashCode();
        }
        if (getWhere() != null) {
            _hashCode += getWhere().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYGPJ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYGPJ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PJLX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PJLX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("where");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Where"));
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
