/**
 * AddPaymentXM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AddPaymentXM  implements java.io.Serializable {
    private org.tempuri.AddPaymentXMPaymentds paymentds;

    public AddPaymentXM() {
    }

    public AddPaymentXM(
           org.tempuri.AddPaymentXMPaymentds paymentds) {
           this.paymentds = paymentds;
    }


    /**
     * Gets the paymentds value for this AddPaymentXM.
     * 
     * @return paymentds
     */
    public org.tempuri.AddPaymentXMPaymentds getPaymentds() {
        return paymentds;
    }


    /**
     * Sets the paymentds value for this AddPaymentXM.
     * 
     * @param paymentds
     */
    public void setPaymentds(org.tempuri.AddPaymentXMPaymentds paymentds) {
        this.paymentds = paymentds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddPaymentXM)) return false;
        AddPaymentXM other = (AddPaymentXM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentds==null && other.getPaymentds()==null) || 
             (this.paymentds!=null &&
              this.paymentds.equals(other.getPaymentds())));
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
        if (getPaymentds() != null) {
            _hashCode += getPaymentds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddPaymentXM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddPaymentXM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "paymentds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>AddPaymentXM>paymentds"));
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
