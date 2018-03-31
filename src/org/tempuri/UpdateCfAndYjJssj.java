/**
 * UpdateCfAndYjJssj.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateCfAndYjJssj  implements java.io.Serializable {
    private org.tempuri.UpdateCfAndYjJssjDs ds;

    private java.lang.String jssjs;

    public UpdateCfAndYjJssj() {
    }

    public UpdateCfAndYjJssj(
           org.tempuri.UpdateCfAndYjJssjDs ds,
           java.lang.String jssjs) {
           this.ds = ds;
           this.jssjs = jssjs;
    }


    /**
     * Gets the ds value for this UpdateCfAndYjJssj.
     * 
     * @return ds
     */
    public org.tempuri.UpdateCfAndYjJssjDs getDs() {
        return ds;
    }


    /**
     * Sets the ds value for this UpdateCfAndYjJssj.
     * 
     * @param ds
     */
    public void setDs(org.tempuri.UpdateCfAndYjJssjDs ds) {
        this.ds = ds;
    }


    /**
     * Gets the jssjs value for this UpdateCfAndYjJssj.
     * 
     * @return jssjs
     */
    public java.lang.String getJssjs() {
        return jssjs;
    }


    /**
     * Sets the jssjs value for this UpdateCfAndYjJssj.
     * 
     * @param jssjs
     */
    public void setJssjs(java.lang.String jssjs) {
        this.jssjs = jssjs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateCfAndYjJssj)) return false;
        UpdateCfAndYjJssj other = (UpdateCfAndYjJssj) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ds==null && other.getDs()==null) || 
             (this.ds!=null &&
              this.ds.equals(other.getDs()))) &&
            ((this.jssjs==null && other.getJssjs()==null) || 
             (this.jssjs!=null &&
              this.jssjs.equals(other.getJssjs())));
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
        if (getDs() != null) {
            _hashCode += getDs().hashCode();
        }
        if (getJssjs() != null) {
            _hashCode += getJssjs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCfAndYjJssj.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateCfAndYjJssj"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>UpdateCfAndYjJssj>ds"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jssjs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jssjs"));
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
