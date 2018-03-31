/**
 * SetMrbllx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SetMrbllx  implements java.io.Serializable {
    private java.lang.String gh;

    private java.lang.String bllx;

    public SetMrbllx() {
    }

    public SetMrbllx(
           java.lang.String gh,
           java.lang.String bllx) {
           this.gh = gh;
           this.bllx = bllx;
    }


    /**
     * Gets the gh value for this SetMrbllx.
     * 
     * @return gh
     */
    public java.lang.String getGh() {
        return gh;
    }


    /**
     * Sets the gh value for this SetMrbllx.
     * 
     * @param gh
     */
    public void setGh(java.lang.String gh) {
        this.gh = gh;
    }


    /**
     * Gets the bllx value for this SetMrbllx.
     * 
     * @return bllx
     */
    public java.lang.String getBllx() {
        return bllx;
    }


    /**
     * Sets the bllx value for this SetMrbllx.
     * 
     * @param bllx
     */
    public void setBllx(java.lang.String bllx) {
        this.bllx = bllx;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetMrbllx)) return false;
        SetMrbllx other = (SetMrbllx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gh==null && other.getGh()==null) || 
             (this.gh!=null &&
              this.gh.equals(other.getGh()))) &&
            ((this.bllx==null && other.getBllx()==null) || 
             (this.bllx!=null &&
              this.bllx.equals(other.getBllx())));
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
        if (getGh() != null) {
            _hashCode += getGh().hashCode();
        }
        if (getBllx() != null) {
            _hashCode += getBllx().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetMrbllx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SetMrbllx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bllx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "bllx"));
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
