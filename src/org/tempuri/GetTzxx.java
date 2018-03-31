/**
 * GetTzxx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetTzxx  implements java.io.Serializable {
    private java.lang.String TZRQs;

    private java.lang.String TZRQe;

    private java.lang.String YSXM;

    private java.lang.String GHKS;

    public GetTzxx() {
    }

    public GetTzxx(
           java.lang.String TZRQs,
           java.lang.String TZRQe,
           java.lang.String YSXM,
           java.lang.String GHKS) {
           this.TZRQs = TZRQs;
           this.TZRQe = TZRQe;
           this.YSXM = YSXM;
           this.GHKS = GHKS;
    }


    /**
     * Gets the TZRQs value for this GetTzxx.
     * 
     * @return TZRQs
     */
    public java.lang.String getTZRQs() {
        return TZRQs;
    }


    /**
     * Sets the TZRQs value for this GetTzxx.
     * 
     * @param TZRQs
     */
    public void setTZRQs(java.lang.String TZRQs) {
        this.TZRQs = TZRQs;
    }


    /**
     * Gets the TZRQe value for this GetTzxx.
     * 
     * @return TZRQe
     */
    public java.lang.String getTZRQe() {
        return TZRQe;
    }


    /**
     * Sets the TZRQe value for this GetTzxx.
     * 
     * @param TZRQe
     */
    public void setTZRQe(java.lang.String TZRQe) {
        this.TZRQe = TZRQe;
    }


    /**
     * Gets the YSXM value for this GetTzxx.
     * 
     * @return YSXM
     */
    public java.lang.String getYSXM() {
        return YSXM;
    }


    /**
     * Sets the YSXM value for this GetTzxx.
     * 
     * @param YSXM
     */
    public void setYSXM(java.lang.String YSXM) {
        this.YSXM = YSXM;
    }


    /**
     * Gets the GHKS value for this GetTzxx.
     * 
     * @return GHKS
     */
    public java.lang.String getGHKS() {
        return GHKS;
    }


    /**
     * Sets the GHKS value for this GetTzxx.
     * 
     * @param GHKS
     */
    public void setGHKS(java.lang.String GHKS) {
        this.GHKS = GHKS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTzxx)) return false;
        GetTzxx other = (GetTzxx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TZRQs==null && other.getTZRQs()==null) || 
             (this.TZRQs!=null &&
              this.TZRQs.equals(other.getTZRQs()))) &&
            ((this.TZRQe==null && other.getTZRQe()==null) || 
             (this.TZRQe!=null &&
              this.TZRQe.equals(other.getTZRQe()))) &&
            ((this.YSXM==null && other.getYSXM()==null) || 
             (this.YSXM!=null &&
              this.YSXM.equals(other.getYSXM()))) &&
            ((this.GHKS==null && other.getGHKS()==null) || 
             (this.GHKS!=null &&
              this.GHKS.equals(other.getGHKS())));
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
        if (getTZRQs() != null) {
            _hashCode += getTZRQs().hashCode();
        }
        if (getTZRQe() != null) {
            _hashCode += getTZRQe().hashCode();
        }
        if (getYSXM() != null) {
            _hashCode += getYSXM().hashCode();
        }
        if (getGHKS() != null) {
            _hashCode += getGHKS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTzxx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetTzxx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TZRQs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TZRQs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TZRQe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TZRQe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YSXM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "YSXM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GHKS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GHKS"));
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
