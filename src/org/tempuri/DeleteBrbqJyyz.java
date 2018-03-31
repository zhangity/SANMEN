/**
 * DeleteBrbqJyyz.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DeleteBrbqJyyz  implements java.io.Serializable {
    private java.lang.String doctrequestno;

    private java.lang.String hisyzzh;

    public DeleteBrbqJyyz() {
    }

    public DeleteBrbqJyyz(
           java.lang.String doctrequestno,
           java.lang.String hisyzzh) {
           this.doctrequestno = doctrequestno;
           this.hisyzzh = hisyzzh;
    }


    /**
     * Gets the doctrequestno value for this DeleteBrbqJyyz.
     * 
     * @return doctrequestno
     */
    public java.lang.String getDoctrequestno() {
        return doctrequestno;
    }


    /**
     * Sets the doctrequestno value for this DeleteBrbqJyyz.
     * 
     * @param doctrequestno
     */
    public void setDoctrequestno(java.lang.String doctrequestno) {
        this.doctrequestno = doctrequestno;
    }


    /**
     * Gets the hisyzzh value for this DeleteBrbqJyyz.
     * 
     * @return hisyzzh
     */
    public java.lang.String getHisyzzh() {
        return hisyzzh;
    }


    /**
     * Sets the hisyzzh value for this DeleteBrbqJyyz.
     * 
     * @param hisyzzh
     */
    public void setHisyzzh(java.lang.String hisyzzh) {
        this.hisyzzh = hisyzzh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteBrbqJyyz)) return false;
        DeleteBrbqJyyz other = (DeleteBrbqJyyz) obj;
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
            ((this.hisyzzh==null && other.getHisyzzh()==null) || 
             (this.hisyzzh!=null &&
              this.hisyzzh.equals(other.getHisyzzh())));
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
        if (getHisyzzh() != null) {
            _hashCode += getHisyzzh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteBrbqJyyz.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteBrbqJyyz"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doctrequestno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "doctrequestno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hisyzzh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "hisyzzh"));
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
