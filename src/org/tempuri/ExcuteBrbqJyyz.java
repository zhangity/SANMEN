/**
 * ExcuteBrbqJyyz.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ExcuteBrbqJyyz  implements java.io.Serializable {
    private java.lang.String doctrequestno;

    private java.lang.String ysgh;

    public ExcuteBrbqJyyz() {
    }

    public ExcuteBrbqJyyz(
           java.lang.String doctrequestno,
           java.lang.String ysgh) {
           this.doctrequestno = doctrequestno;
           this.ysgh = ysgh;
    }


    /**
     * Gets the doctrequestno value for this ExcuteBrbqJyyz.
     * 
     * @return doctrequestno
     */
    public java.lang.String getDoctrequestno() {
        return doctrequestno;
    }


    /**
     * Sets the doctrequestno value for this ExcuteBrbqJyyz.
     * 
     * @param doctrequestno
     */
    public void setDoctrequestno(java.lang.String doctrequestno) {
        this.doctrequestno = doctrequestno;
    }


    /**
     * Gets the ysgh value for this ExcuteBrbqJyyz.
     * 
     * @return ysgh
     */
    public java.lang.String getYsgh() {
        return ysgh;
    }


    /**
     * Sets the ysgh value for this ExcuteBrbqJyyz.
     * 
     * @param ysgh
     */
    public void setYsgh(java.lang.String ysgh) {
        this.ysgh = ysgh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExcuteBrbqJyyz)) return false;
        ExcuteBrbqJyyz other = (ExcuteBrbqJyyz) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.doctrequestno==null && other.getDoctrequestno()==null) || 
             (this.doctrequestno!=null &&
              this.doctrequestno.equals(other.getDoctrequestno()))) &&
            ((this.ysgh==null && other.getYsgh()==null) || 
             (this.ysgh!=null &&
              this.ysgh.equals(other.getYsgh())));
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
        if (getDoctrequestno() != null) {
            _hashCode += getDoctrequestno().hashCode();
        }
        if (getYsgh() != null) {
            _hashCode += getYsgh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExcuteBrbqJyyz.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ExcuteBrbqJyyz"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doctrequestno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "doctrequestno"));
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
