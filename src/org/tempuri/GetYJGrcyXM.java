/**
 * GetYJGrcyXM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYJGrcyXM  implements java.io.Serializable {
    private java.lang.String SSLB;

    private java.lang.String SSDM;

    public GetYJGrcyXM() {
    }

    public GetYJGrcyXM(
           java.lang.String SSLB,
           java.lang.String SSDM) {
           this.SSLB = SSLB;
           this.SSDM = SSDM;
    }


    /**
     * Gets the SSLB value for this GetYJGrcyXM.
     * 
     * @return SSLB
     */
    public java.lang.String getSSLB() {
        return SSLB;
    }


    /**
     * Sets the SSLB value for this GetYJGrcyXM.
     * 
     * @param SSLB
     */
    public void setSSLB(java.lang.String SSLB) {
        this.SSLB = SSLB;
    }


    /**
     * Gets the SSDM value for this GetYJGrcyXM.
     * 
     * @return SSDM
     */
    public java.lang.String getSSDM() {
        return SSDM;
    }


    /**
     * Sets the SSDM value for this GetYJGrcyXM.
     * 
     * @param SSDM
     */
    public void setSSDM(java.lang.String SSDM) {
        this.SSDM = SSDM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYJGrcyXM)) return false;
        GetYJGrcyXM other = (GetYJGrcyXM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SSLB==null && other.getSSLB()==null) || 
             (this.SSLB!=null &&
              this.SSLB.equals(other.getSSLB()))) &&
            ((this.SSDM==null && other.getSSDM()==null) || 
             (this.SSDM!=null &&
              this.SSDM.equals(other.getSSDM())));
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
        if (getSSLB() != null) {
            _hashCode += getSSLB().hashCode();
        }
        if (getSSDM() != null) {
            _hashCode += getSSDM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYJGrcyXM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYJGrcyXM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSLB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SSLB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSDM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SSDM"));
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
