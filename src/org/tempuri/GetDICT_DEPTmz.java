/**
 * GetDICT_DEPTmz.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDICT_DEPTmz  implements java.io.Serializable {
    private java.lang.String strWhere;

    private java.lang.String strRoleId;

    public GetDICT_DEPTmz() {
    }

    public GetDICT_DEPTmz(
           java.lang.String strWhere,
           java.lang.String strRoleId) {
           this.strWhere = strWhere;
           this.strRoleId = strRoleId;
    }


    /**
     * Gets the strWhere value for this GetDICT_DEPTmz.
     * 
     * @return strWhere
     */
    public java.lang.String getStrWhere() {
        return strWhere;
    }


    /**
     * Sets the strWhere value for this GetDICT_DEPTmz.
     * 
     * @param strWhere
     */
    public void setStrWhere(java.lang.String strWhere) {
        this.strWhere = strWhere;
    }


    /**
     * Gets the strRoleId value for this GetDICT_DEPTmz.
     * 
     * @return strRoleId
     */
    public java.lang.String getStrRoleId() {
        return strRoleId;
    }


    /**
     * Sets the strRoleId value for this GetDICT_DEPTmz.
     * 
     * @param strRoleId
     */
    public void setStrRoleId(java.lang.String strRoleId) {
        this.strRoleId = strRoleId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDICT_DEPTmz)) return false;
        GetDICT_DEPTmz other = (GetDICT_DEPTmz) obj;
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
        new org.apache.axis.description.TypeDesc(GetDICT_DEPTmz.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDICT_DEPTmz"));
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
