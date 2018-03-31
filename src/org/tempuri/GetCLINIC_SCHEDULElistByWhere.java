/**
 * GetCLINIC_SCHEDULElistByWhere.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCLINIC_SCHEDULElistByWhere  implements java.io.Serializable {
    private java.lang.String strWhere;

    private java.lang.String strRoleId;

    public GetCLINIC_SCHEDULElistByWhere() {
    }

    public GetCLINIC_SCHEDULElistByWhere(
           java.lang.String strWhere,
           java.lang.String strRoleId) {
           this.strWhere = strWhere;
           this.strRoleId = strRoleId;
    }


    /**
     * Gets the strWhere value for this GetCLINIC_SCHEDULElistByWhere.
     * 
     * @return strWhere
     */
    public java.lang.String getStrWhere() {
        return strWhere;
    }


    /**
     * Sets the strWhere value for this GetCLINIC_SCHEDULElistByWhere.
     * 
     * @param strWhere
     */
    public void setStrWhere(java.lang.String strWhere) {
        this.strWhere = strWhere;
    }


    /**
     * Gets the strRoleId value for this GetCLINIC_SCHEDULElistByWhere.
     * 
     * @return strRoleId
     */
    public java.lang.String getStrRoleId() {
        return strRoleId;
    }


    /**
     * Sets the strRoleId value for this GetCLINIC_SCHEDULElistByWhere.
     * 
     * @param strRoleId
     */
    public void setStrRoleId(java.lang.String strRoleId) {
        this.strRoleId = strRoleId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCLINIC_SCHEDULElistByWhere)) return false;
        GetCLINIC_SCHEDULElistByWhere other = (GetCLINIC_SCHEDULElistByWhere) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strWhere==null && other.getStrWhere()==null) || 
             (this.strWhere!=null &&
              this.strWhere.equals(other.getStrWhere()))) &&
            ((this.strRoleId==null && other.getStrRoleId()==null) || 
             (this.strRoleId!=null &&
              this.strRoleId.equals(other.getStrRoleId())));
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
        if (getStrWhere() != null) {
            _hashCode += getStrWhere().hashCode();
        }
        if (getStrRoleId() != null) {
            _hashCode += getStrRoleId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCLINIC_SCHEDULElistByWhere.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCLINIC_SCHEDULElistByWhere"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strWhere");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strWhere"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strRoleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strRoleId"));
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
