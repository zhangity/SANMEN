/**
 * GetDqjyxmgs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDqjyxmgs  implements java.io.Serializable {
    private java.lang.String bah;

    private java.lang.String hyid;

    public GetDqjyxmgs() {
    }

    public GetDqjyxmgs(
           java.lang.String bah,
           java.lang.String hyid) {
           this.bah = bah;
           this.hyid = hyid;
    }


    /**
     * Gets the bah value for this GetDqjyxmgs.
     * 
     * @return bah
     */
    public java.lang.String getBah() {
        return bah;
    }


    /**
     * Sets the bah value for this GetDqjyxmgs.
     * 
     * @param bah
     */
    public void setBah(java.lang.String bah) {
        this.bah = bah;
    }


    /**
     * Gets the hyid value for this GetDqjyxmgs.
     * 
     * @return hyid
     */
    public java.lang.String getHyid() {
        return hyid;
    }


    /**
     * Sets the hyid value for this GetDqjyxmgs.
     * 
     * @param hyid
     */
    public void setHyid(java.lang.String hyid) {
        this.hyid = hyid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDqjyxmgs)) return false;
        GetDqjyxmgs other = (GetDqjyxmgs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bah==null && other.getBah()==null) || 
             (this.bah!=null &&
              this.bah.equals(other.getBah()))) &&
            ((this.hyid==null && other.getHyid()==null) || 
             (this.hyid!=null &&
              this.hyid.equals(other.getHyid())));
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
        if (getBah() != null) {
            _hashCode += getBah().hashCode();
        }
        if (getHyid() != null) {
            _hashCode += getHyid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDqjyxmgs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDqjyxmgs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bah");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "bah"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hyid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "hyid"));
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
