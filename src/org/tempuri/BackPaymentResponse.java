/**
 * BackPaymentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class BackPaymentResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm backPaymentResult;

    public BackPaymentResponse() {
    }

    public BackPaymentResponse(
           org.tempuri.ReturnExComm backPaymentResult) {
           this.backPaymentResult = backPaymentResult;
    }


    /**
     * Gets the backPaymentResult value for this BackPaymentResponse.
     * 
     * @return backPaymentResult
     */
    public org.tempuri.ReturnExComm getBackPaymentResult() {
        return backPaymentResult;
    }


    /**
     * Sets the backPaymentResult value for this BackPaymentResponse.
     * 
     * @param backPaymentResult
     */
    public void setBackPaymentResult(org.tempuri.ReturnExComm backPaymentResult) {
        this.backPaymentResult = backPaymentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BackPaymentResponse)) return false;
        BackPaymentResponse other = (BackPaymentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.backPaymentResult==null && other.getBackPaymentResult()==null) || 
             (this.backPaymentResult!=null &&
              this.backPaymentResult.equals(other.getBackPaymentResult())));
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
        if (getBackPaymentResult() != null) {
            _hashCode += getBackPaymentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BackPaymentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">BackPaymentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backPaymentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BackPaymentResult"));
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
