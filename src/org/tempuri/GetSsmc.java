/**
 * GetSsmc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSsmc  implements java.io.Serializable {
    private java.lang.String ssmc;

    private java.lang.String ssdm;

    public GetSsmc() {
    }

    public GetSsmc(
           java.lang.String ssmc,
           java.lang.String ssdm) {
           this.ssmc = ssmc;
           this.ssdm = ssdm;
    }


    /**
     * Gets the ssmc value for this GetSsmc.
     * 
     * @return ssmc
     */
    public java.lang.String getSsmc() {
        return ssmc;
    }


    /**
     * Sets the ssmc value for this GetSsmc.
     * 
     * @param ssmc
     */
    public void setSsmc(java.lang.String ssmc) {
        this.ssmc = ssmc;
    }


    /**
     * Gets the ssdm value for this GetSsmc.
     * 
     * @return ssdm
     */
    public java.lang.String getSsdm() {
        return ssdm;
    }


    /**
     * Sets the ssdm value for this GetSsmc.
     * 
     * @param ssdm
     */
    public void setSsdm(java.lang.String ssdm) {
        this.ssdm = ssdm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSsmc)) return false;
        GetSsmc other = (GetSsmc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ssmc==null && other.getSsmc()==null) || 
             (this.ssmc!=null &&
              this.ssmc.equals(other.getSsmc()))) &&
            ((this.ssdm==null && other.getSsdm()==null) || 
             (this.ssdm!=null &&
              this.ssdm.equals(other.getSsdm())));
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
        if (getSsmc() != null) {
            _hashCode += getSsmc().hashCode();
        }
        if (getSsdm() != null) {
            _hashCode += getSsdm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSsmc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSsmc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssmc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ssmc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssdm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ssdm"));
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
