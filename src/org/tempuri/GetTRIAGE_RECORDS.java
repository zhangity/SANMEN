/**
 * GetTRIAGE_RECORDS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetTRIAGE_RECORDS  implements java.io.Serializable {
    private java.lang.String djsj1;

    private java.lang.String djsj2;

    public GetTRIAGE_RECORDS() {
    }

    public GetTRIAGE_RECORDS(
           java.lang.String djsj1,
           java.lang.String djsj2) {
           this.djsj1 = djsj1;
           this.djsj2 = djsj2;
    }


    /**
     * Gets the djsj1 value for this GetTRIAGE_RECORDS.
     * 
     * @return djsj1
     */
    public java.lang.String getDjsj1() {
        return djsj1;
    }


    /**
     * Sets the djsj1 value for this GetTRIAGE_RECORDS.
     * 
     * @param djsj1
     */
    public void setDjsj1(java.lang.String djsj1) {
        this.djsj1 = djsj1;
    }


    /**
     * Gets the djsj2 value for this GetTRIAGE_RECORDS.
     * 
     * @return djsj2
     */
    public java.lang.String getDjsj2() {
        return djsj2;
    }


    /**
     * Sets the djsj2 value for this GetTRIAGE_RECORDS.
     * 
     * @param djsj2
     */
    public void setDjsj2(java.lang.String djsj2) {
        this.djsj2 = djsj2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTRIAGE_RECORDS)) return false;
        GetTRIAGE_RECORDS other = (GetTRIAGE_RECORDS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.djsj1==null && other.getDjsj1()==null) || 
             (this.djsj1!=null &&
              this.djsj1.equals(other.getDjsj1()))) &&
            ((this.djsj2==null && other.getDjsj2()==null) || 
             (this.djsj2!=null &&
              this.djsj2.equals(other.getDjsj2())));
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
        if (getDjsj1() != null) {
            _hashCode += getDjsj1().hashCode();
        }
        if (getDjsj2() != null) {
            _hashCode += getDjsj2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTRIAGE_RECORDS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetTRIAGE_RECORDS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("djsj1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "djsj1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("djsj2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "djsj2"));
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
