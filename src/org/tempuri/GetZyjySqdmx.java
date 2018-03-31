/**
 * GetZyjySqdmx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetZyjySqdmx  implements java.io.Serializable {
    private java.lang.String doctrequestno;

    private java.lang.String examinaimcode;

    private java.lang.String sqdstatus;

    public GetZyjySqdmx() {
    }

    public GetZyjySqdmx(
           java.lang.String doctrequestno,
           java.lang.String examinaimcode,
           java.lang.String sqdstatus) {
           this.doctrequestno = doctrequestno;
           this.examinaimcode = examinaimcode;
           this.sqdstatus = sqdstatus;
    }


    /**
     * Gets the doctrequestno value for this GetZyjySqdmx.
     * 
     * @return doctrequestno
     */
    public java.lang.String getDoctrequestno() {
        return doctrequestno;
    }


    /**
     * Sets the doctrequestno value for this GetZyjySqdmx.
     * 
     * @param doctrequestno
     */
    public void setDoctrequestno(java.lang.String doctrequestno) {
        this.doctrequestno = doctrequestno;
    }


    /**
     * Gets the examinaimcode value for this GetZyjySqdmx.
     * 
     * @return examinaimcode
     */
    public java.lang.String getExaminaimcode() {
        return examinaimcode;
    }


    /**
     * Sets the examinaimcode value for this GetZyjySqdmx.
     * 
     * @param examinaimcode
     */
    public void setExaminaimcode(java.lang.String examinaimcode) {
        this.examinaimcode = examinaimcode;
    }


    /**
     * Gets the sqdstatus value for this GetZyjySqdmx.
     * 
     * @return sqdstatus
     */
    public java.lang.String getSqdstatus() {
        return sqdstatus;
    }


    /**
     * Sets the sqdstatus value for this GetZyjySqdmx.
     * 
     * @param sqdstatus
     */
    public void setSqdstatus(java.lang.String sqdstatus) {
        this.sqdstatus = sqdstatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZyjySqdmx)) return false;
        GetZyjySqdmx other = (GetZyjySqdmx) obj;
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
            ((this.examinaimcode==null && other.getExaminaimcode()==null) || 
             (this.examinaimcode!=null &&
              this.examinaimcode.equals(other.getExaminaimcode()))) &&
            ((this.sqdstatus==null && other.getSqdstatus()==null) || 
             (this.sqdstatus!=null &&
              this.sqdstatus.equals(other.getSqdstatus())));
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
        if (getExaminaimcode() != null) {
            _hashCode += getExaminaimcode().hashCode();
        }
        if (getSqdstatus() != null) {
            _hashCode += getSqdstatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZyjySqdmx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetZyjySqdmx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doctrequestno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "doctrequestno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("examinaimcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "examinaimcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqdstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sqdstatus"));
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
