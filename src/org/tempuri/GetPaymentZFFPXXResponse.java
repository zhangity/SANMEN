/**
 * GetPaymentZFFPXXResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPaymentZFFPXXResponse  implements java.io.Serializable {
    private org.tempuri.GetPaymentZFFPXXResponseGetPaymentZFFPXXResult getPaymentZFFPXXResult;

    public GetPaymentZFFPXXResponse() {
    }

    public GetPaymentZFFPXXResponse(
           org.tempuri.GetPaymentZFFPXXResponseGetPaymentZFFPXXResult getPaymentZFFPXXResult) {
           this.getPaymentZFFPXXResult = getPaymentZFFPXXResult;
    }


    /**
     * Gets the getPaymentZFFPXXResult value for this GetPaymentZFFPXXResponse.
     * 
     * @return getPaymentZFFPXXResult
     */
    public org.tempuri.GetPaymentZFFPXXResponseGetPaymentZFFPXXResult getGetPaymentZFFPXXResult() {
        return getPaymentZFFPXXResult;
    }


    /**
     * Sets the getPaymentZFFPXXResult value for this GetPaymentZFFPXXResponse.
     * 
     * @param getPaymentZFFPXXResult
     */
    public void setGetPaymentZFFPXXResult(org.tempuri.GetPaymentZFFPXXResponseGetPaymentZFFPXXResult getPaymentZFFPXXResult) {
        this.getPaymentZFFPXXResult = getPaymentZFFPXXResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPaymentZFFPXXResponse)) return false;
        GetPaymentZFFPXXResponse other = (GetPaymentZFFPXXResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPaymentZFFPXXResult==null && other.getGetPaymentZFFPXXResult()==null) || 
             (this.getPaymentZFFPXXResult!=null &&
              this.getPaymentZFFPXXResult.equals(other.getGetPaymentZFFPXXResult())));
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
        if (getGetPaymentZFFPXXResult() != null) {
            _hashCode += getGetPaymentZFFPXXResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPaymentZFFPXXResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPaymentZFFPXXResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPaymentZFFPXXResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPaymentZFFPXXResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetPaymentZFFPXXResponse>GetPaymentZFFPXXResult"));
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
