/**
 * UnExcuteBrbqJyyz.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UnExcuteBrbqJyyz  implements java.io.Serializable {
    private java.lang.String doctrequestno;

    private java.lang.String patientid;

    public UnExcuteBrbqJyyz() {
    }

    public UnExcuteBrbqJyyz(
           java.lang.String doctrequestno,
           java.lang.String patientid) {
           this.doctrequestno = doctrequestno;
           this.patientid = patientid;
    }


    /**
     * Gets the doctrequestno value for this UnExcuteBrbqJyyz.
     * 
     * @return doctrequestno
     */
    public java.lang.String getDoctrequestno() {
        return doctrequestno;
    }


    /**
     * Sets the doctrequestno value for this UnExcuteBrbqJyyz.
     * 
     * @param doctrequestno
     */
    public void setDoctrequestno(java.lang.String doctrequestno) {
        this.doctrequestno = doctrequestno;
    }


    /**
     * Gets the patientid value for this UnExcuteBrbqJyyz.
     * 
     * @return patientid
     */
    public java.lang.String getPatientid() {
        return patientid;
    }


    /**
     * Sets the patientid value for this UnExcuteBrbqJyyz.
     * 
     * @param patientid
     */
    public void setPatientid(java.lang.String patientid) {
        this.patientid = patientid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnExcuteBrbqJyyz)) return false;
        UnExcuteBrbqJyyz other = (UnExcuteBrbqJyyz) obj;
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
            ((this.patientid==null && other.getPatientid()==null) || 
             (this.patientid!=null &&
              this.patientid.equals(other.getPatientid())));
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
        if (getPatientid() != null) {
            _hashCode += getPatientid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnExcuteBrbqJyyz.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UnExcuteBrbqJyyz"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doctrequestno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "doctrequestno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patientid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "patientid"));
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
