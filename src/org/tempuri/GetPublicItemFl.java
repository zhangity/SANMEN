/**
 * GetPublicItemFl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPublicItemFl  implements java.io.Serializable {
    private java.lang.String CODE_INFO_ID;

    private java.lang.String CODE;

    public GetPublicItemFl() {
    }

    public GetPublicItemFl(
           java.lang.String CODE_INFO_ID,
           java.lang.String CODE) {
           this.CODE_INFO_ID = CODE_INFO_ID;
           this.CODE = CODE;
    }


    /**
     * Gets the CODE_INFO_ID value for this GetPublicItemFl.
     * 
     * @return CODE_INFO_ID
     */
    public java.lang.String getCODE_INFO_ID() {
        return CODE_INFO_ID;
    }


    /**
     * Sets the CODE_INFO_ID value for this GetPublicItemFl.
     * 
     * @param CODE_INFO_ID
     */
    public void setCODE_INFO_ID(java.lang.String CODE_INFO_ID) {
        this.CODE_INFO_ID = CODE_INFO_ID;
    }


    /**
     * Gets the CODE value for this GetPublicItemFl.
     * 
     * @return CODE
     */
    public java.lang.String getCODE() {
        return CODE;
    }


    /**
     * Sets the CODE value for this GetPublicItemFl.
     * 
     * @param CODE
     */
    public void setCODE(java.lang.String CODE) {
        this.CODE = CODE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPublicItemFl)) return false;
        GetPublicItemFl other = (GetPublicItemFl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CODE_INFO_ID==null && other.getCODE_INFO_ID()==null) || 
             (this.CODE_INFO_ID!=null &&
              this.CODE_INFO_ID.equals(other.getCODE_INFO_ID()))) &&
            ((this.CODE==null && other.getCODE()==null) || 
             (this.CODE!=null &&
              this.CODE.equals(other.getCODE())));
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
        if (getCODE_INFO_ID() != null) {
            _hashCode += getCODE_INFO_ID().hashCode();
        }
        if (getCODE() != null) {
            _hashCode += getCODE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPublicItemFl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPublicItemFl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODE_INFO_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CODE_INFO_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CODE"));
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
