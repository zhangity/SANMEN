/**
 * GetMzbrjbxxByCardNo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzbrjbxxByCardNo  implements java.io.Serializable {
    private java.lang.String card_No;

    public GetMzbrjbxxByCardNo() {
    }

    public GetMzbrjbxxByCardNo(
           java.lang.String card_No) {
           this.card_No = card_No;
    }


    /**
     * Gets the card_No value for this GetMzbrjbxxByCardNo.
     * 
     * @return card_No
     */
    public java.lang.String getCard_No() {
        return card_No;
    }


    /**
     * Sets the card_No value for this GetMzbrjbxxByCardNo.
     * 
     * @param card_No
     */
    public void setCard_No(java.lang.String card_No) {
        this.card_No = card_No;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzbrjbxxByCardNo)) return false;
        GetMzbrjbxxByCardNo other = (GetMzbrjbxxByCardNo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.card_No==null && other.getCard_No()==null) || 
             (this.card_No!=null &&
              this.card_No.equals(other.getCard_No())));
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
        if (getCard_No() != null) {
            _hashCode += getCard_No().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzbrjbxxByCardNo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzbrjbxxByCardNo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("card_No");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Card_No"));
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
