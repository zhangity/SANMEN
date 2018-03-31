/**
 * GetPaymentTCXXResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPaymentTCXXResponse  implements java.io.Serializable {
    private org.tempuri.GetPaymentTCXXResponseGetPaymentTCXXResult getPaymentTCXXResult;

    public GetPaymentTCXXResponse() {
    }

    public GetPaymentTCXXResponse(
           org.tempuri.GetPaymentTCXXResponseGetPaymentTCXXResult getPaymentTCXXResult) {
           this.getPaymentTCXXResult = getPaymentTCXXResult;
    }


    /**
     * Gets the getPaymentTCXXResult value for this GetPaymentTCXXResponse.
     * 
     * @return getPaymentTCXXResult
     */
    public org.tempuri.GetPaymentTCXXResponseGetPaymentTCXXResult getGetPaymentTCXXResult() {
        return getPaymentTCXXResult;
    }


    /**
     * Sets the getPaymentTCXXResult value for this GetPaymentTCXXResponse.
     * 
     * @param getPaymentTCXXResult
     */
    public void setGetPaymentTCXXResult(org.tempuri.GetPaymentTCXXResponseGetPaymentTCXXResult getPaymentTCXXResult) {
        this.getPaymentTCXXResult = getPaymentTCXXResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPaymentTCXXResponse)) return false;
        GetPaymentTCXXResponse other = (GetPaymentTCXXResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPaymentTCXXResult==null && other.getGetPaymentTCXXResult()==null) || 
             (this.getPaymentTCXXResult!=null &&
              this.getPaymentTCXXResult.equals(other.getGetPaymentTCXXResult())));
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
        if (getGetPaymentTCXXResult() != null) {
            _hashCode += getGetPaymentTCXXResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPaymentTCXXResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPaymentTCXXResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPaymentTCXXResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPaymentTCXXResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetPaymentTCXXResponse>GetPaymentTCXXResult"));
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
