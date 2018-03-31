/**
 * Gf_getYktSjYbzh.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getYktSjYbzh  implements java.io.Serializable {
    private java.lang.String as_czgh;

    public Gf_getYktSjYbzh() {
    }

    public Gf_getYktSjYbzh(
           java.lang.String as_czgh) {
           this.as_czgh = as_czgh;
    }


    /**
     * Gets the as_czgh value for this Gf_getYktSjYbzh.
     * 
     * @return as_czgh
     */
    public java.lang.String getAs_czgh() {
        return as_czgh;
    }


    /**
     * Sets the as_czgh value for this Gf_getYktSjYbzh.
     * 
     * @param as_czgh
     */
    public void setAs_czgh(java.lang.String as_czgh) {
        this.as_czgh = as_czgh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getYktSjYbzh)) return false;
        Gf_getYktSjYbzh other = (Gf_getYktSjYbzh) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.as_czgh==null && other.getAs_czgh()==null) || 
             (this.as_czgh!=null &&
              this.as_czgh.equals(other.getAs_czgh())));
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
        if (getAs_czgh() != null) {
            _hashCode += getAs_czgh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getYktSjYbzh.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getYktSjYbzh"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_czgh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_czgh"));
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
