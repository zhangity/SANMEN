/**
 * InsertYhfk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertYhfk  implements java.io.Serializable {
    private java.lang.String yhgh;

    private java.lang.String fknr;

    public InsertYhfk() {
    }

    public InsertYhfk(
           java.lang.String yhgh,
           java.lang.String fknr) {
           this.yhgh = yhgh;
           this.fknr = fknr;
    }


    /**
     * Gets the yhgh value for this InsertYhfk.
     * 
     * @return yhgh
     */
    public java.lang.String getYhgh() {
        return yhgh;
    }


    /**
     * Sets the yhgh value for this InsertYhfk.
     * 
     * @param yhgh
     */
    public void setYhgh(java.lang.String yhgh) {
        this.yhgh = yhgh;
    }


    /**
     * Gets the fknr value for this InsertYhfk.
     * 
     * @return fknr
     */
    public java.lang.String getFknr() {
        return fknr;
    }


    /**
     * Sets the fknr value for this InsertYhfk.
     * 
     * @param fknr
     */
    public void setFknr(java.lang.String fknr) {
        this.fknr = fknr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertYhfk)) return false;
        InsertYhfk other = (InsertYhfk) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.yhgh==null && other.getYhgh()==null) || 
             (this.yhgh!=null &&
              this.yhgh.equals(other.getYhgh()))) &&
            ((this.fknr==null && other.getFknr()==null) || 
             (this.fknr!=null &&
              this.fknr.equals(other.getFknr())));
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
        if (getYhgh() != null) {
            _hashCode += getYhgh().hashCode();
        }
        if (getFknr() != null) {
            _hashCode += getFknr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertYhfk.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertYhfk"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yhgh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "yhgh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fknr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fknr"));
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
