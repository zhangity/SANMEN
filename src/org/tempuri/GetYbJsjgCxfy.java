/**
 * GetYbJsjgCxfy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYbJsjgCxfy  implements java.io.Serializable {
    private java.lang.String fphm;

    private int jzlx;

    public GetYbJsjgCxfy() {
    }

    public GetYbJsjgCxfy(
           java.lang.String fphm,
           int jzlx) {
           this.fphm = fphm;
           this.jzlx = jzlx;
    }


    /**
     * Gets the fphm value for this GetYbJsjgCxfy.
     * 
     * @return fphm
     */
    public java.lang.String getFphm() {
        return fphm;
    }


    /**
     * Sets the fphm value for this GetYbJsjgCxfy.
     * 
     * @param fphm
     */
    public void setFphm(java.lang.String fphm) {
        this.fphm = fphm;
    }


    /**
     * Gets the jzlx value for this GetYbJsjgCxfy.
     * 
     * @return jzlx
     */
    public int getJzlx() {
        return jzlx;
    }


    /**
     * Sets the jzlx value for this GetYbJsjgCxfy.
     * 
     * @param jzlx
     */
    public void setJzlx(int jzlx) {
        this.jzlx = jzlx;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYbJsjgCxfy)) return false;
        GetYbJsjgCxfy other = (GetYbJsjgCxfy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fphm==null && other.getFphm()==null) || 
             (this.fphm!=null &&
              this.fphm.equals(other.getFphm()))) &&
            this.jzlx == other.getJzlx();
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
        if (getFphm() != null) {
            _hashCode += getFphm().hashCode();
        }
        _hashCode += getJzlx();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYbJsjgCxfy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYbJsjgCxfy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fphm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fphm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jzlx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jzlx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
