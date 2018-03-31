/**
 * CancelBackPaymentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CancelBackPaymentResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm cancelBackPaymentResult;

    public CancelBackPaymentResponse() {
    }

    public CancelBackPaymentResponse(
           org.tempuri.ReturnExComm cancelBackPaymentResult) {
           this.cancelBackPaymentResult = cancelBackPaymentResult;
    }


    /**
     * Gets the cancelBackPaymentResult value for this CancelBackPaymentResponse.
     * 
     * @return cancelBackPaymentResult
     */
    public org.tempuri.ReturnExComm getCancelBackPaymentResult() {
        return cancelBackPaymentResult;
    }


    /**
     * Sets the cancelBackPaymentResult value for this CancelBackPaymentResponse.
     * 
     * @param cancelBackPaymentResult
     */
    public void setCancelBackPaymentResult(org.tempuri.ReturnExComm cancelBackPaymentResult) {
        this.cancelBackPaymentResult = cancelBackPaymentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelBackPaymentResponse)) return false;
        CancelBackPaymentResponse other = (CancelBackPaymentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cancelBackPaymentResult==null && other.getCancelBackPaymentResult()==null) || 
             (this.cancelBackPaymentResult!=null &&
              this.cancelBackPaymentResult.equals(other.getCancelBackPaymentResult())));
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
        if (getCancelBackPaymentResult() != null) {
            _hashCode += getCancelBackPaymentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelBackPaymentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CancelBackPaymentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelBackPaymentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CancelBackPaymentResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExComm"));
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
