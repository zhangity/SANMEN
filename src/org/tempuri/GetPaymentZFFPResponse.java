/**
 * GetPaymentZFFPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPaymentZFFPResponse  implements java.io.Serializable {
    private org.tempuri.GetPaymentZFFPResponseGetPaymentZFFPResult getPaymentZFFPResult;

    public GetPaymentZFFPResponse() {
    }

    public GetPaymentZFFPResponse(
           org.tempuri.GetPaymentZFFPResponseGetPaymentZFFPResult getPaymentZFFPResult) {
           this.getPaymentZFFPResult = getPaymentZFFPResult;
    }


    /**
     * Gets the getPaymentZFFPResult value for this GetPaymentZFFPResponse.
     * 
     * @return getPaymentZFFPResult
     */
    public org.tempuri.GetPaymentZFFPResponseGetPaymentZFFPResult getGetPaymentZFFPResult() {
        return getPaymentZFFPResult;
    }


    /**
     * Sets the getPaymentZFFPResult value for this GetPaymentZFFPResponse.
     * 
     * @param getPaymentZFFPResult
     */
    public void setGetPaymentZFFPResult(org.tempuri.GetPaymentZFFPResponseGetPaymentZFFPResult getPaymentZFFPResult) {
        this.getPaymentZFFPResult = getPaymentZFFPResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPaymentZFFPResponse)) return false;
        GetPaymentZFFPResponse other = (GetPaymentZFFPResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPaymentZFFPResult==null && other.getGetPaymentZFFPResult()==null) || 
             (this.getPaymentZFFPResult!=null &&
              this.getPaymentZFFPResult.equals(other.getGetPaymentZFFPResult())));
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
        if (getGetPaymentZFFPResult() != null) {
            _hashCode += getGetPaymentZFFPResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPaymentZFFPResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPaymentZFFPResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPaymentZFFPResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPaymentZFFPResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetPaymentZFFPResponse>GetPaymentZFFPResult"));
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
