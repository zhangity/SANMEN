/**
 * GetRegistClinicJzh.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetRegistClinicJzh  implements java.io.Serializable {
    private java.lang.String ksdm;

    private java.lang.String mzlb;

    public GetRegistClinicJzh() {
    }

    public GetRegistClinicJzh(
           java.lang.String ksdm,
           java.lang.String mzlb) {
           this.ksdm = ksdm;
           this.mzlb = mzlb;
    }


    /**
     * Gets the ksdm value for this GetRegistClinicJzh.
     * 
     * @return ksdm
     */
    public java.lang.String getKsdm() {
        return ksdm;
    }


    /**
     * Sets the ksdm value for this GetRegistClinicJzh.
     * 
     * @param ksdm
     */
    public void setKsdm(java.lang.String ksdm) {
        this.ksdm = ksdm;
    }


    /**
     * Gets the mzlb value for this GetRegistClinicJzh.
     * 
     * @return mzlb
     */
    public java.lang.String getMzlb() {
        return mzlb;
    }


    /**
     * Sets the mzlb value for this GetRegistClinicJzh.
     * 
     * @param mzlb
     */
    public void setMzlb(java.lang.String mzlb) {
        this.mzlb = mzlb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRegistClinicJzh)) return false;
        GetRegistClinicJzh other = (GetRegistClinicJzh) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ksdm==null && other.getKsdm()==null) || 
             (this.ksdm!=null &&
              this.ksdm.equals(other.getKsdm()))) &&
            ((this.mzlb==null && other.getMzlb()==null) || 
             (this.mzlb!=null &&
              this.mzlb.equals(other.getMzlb())));
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
        if (getKsdm() != null) {
            _hashCode += getKsdm().hashCode();
        }
        if (getMzlb() != null) {
            _hashCode += getMzlb().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRegistClinicJzh.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetRegistClinicJzh"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ksdm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ksdm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mzlb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "mzlb"));
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
