/**
 * GetMzbrJyxmList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzbrJyxmList  implements java.io.Serializable {
    private java.lang.String mzhm;

    private java.lang.String ylxhs;

    public GetMzbrJyxmList() {
    }

    public GetMzbrJyxmList(
           java.lang.String mzhm,
           java.lang.String ylxhs) {
           this.mzhm = mzhm;
           this.ylxhs = ylxhs;
    }


    /**
     * Gets the mzhm value for this GetMzbrJyxmList.
     * 
     * @return mzhm
     */
    public java.lang.String getMzhm() {
        return mzhm;
    }


    /**
     * Sets the mzhm value for this GetMzbrJyxmList.
     * 
     * @param mzhm
     */
    public void setMzhm(java.lang.String mzhm) {
        this.mzhm = mzhm;
    }


    /**
     * Gets the ylxhs value for this GetMzbrJyxmList.
     * 
     * @return ylxhs
     */
    public java.lang.String getYlxhs() {
        return ylxhs;
    }


    /**
     * Sets the ylxhs value for this GetMzbrJyxmList.
     * 
     * @param ylxhs
     */
    public void setYlxhs(java.lang.String ylxhs) {
        this.ylxhs = ylxhs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzbrJyxmList)) return false;
        GetMzbrJyxmList other = (GetMzbrJyxmList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mzhm==null && other.getMzhm()==null) || 
             (this.mzhm!=null &&
              this.mzhm.equals(other.getMzhm()))) &&
            ((this.ylxhs==null && other.getYlxhs()==null) || 
             (this.ylxhs!=null &&
              this.ylxhs.equals(other.getYlxhs())));
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
        if (getMzhm() != null) {
            _hashCode += getMzhm().hashCode();
        }
        if (getYlxhs() != null) {
            _hashCode += getYlxhs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzbrJyxmList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzbrJyxmList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mzhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "mzhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ylxhs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ylxhs"));
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
