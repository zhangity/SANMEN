/**
 * GetBackPaymentBRXXResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetBackPaymentBRXXResponse  implements java.io.Serializable {
    private org.tempuri.GetBackPaymentBRXXResponseGetBackPaymentBRXXResult getBackPaymentBRXXResult;

    public GetBackPaymentBRXXResponse() {
    }

    public GetBackPaymentBRXXResponse(
           org.tempuri.GetBackPaymentBRXXResponseGetBackPaymentBRXXResult getBackPaymentBRXXResult) {
           this.getBackPaymentBRXXResult = getBackPaymentBRXXResult;
    }


    /**
     * Gets the getBackPaymentBRXXResult value for this GetBackPaymentBRXXResponse.
     * 
     * @return getBackPaymentBRXXResult
     */
    public org.tempuri.GetBackPaymentBRXXResponseGetBackPaymentBRXXResult getGetBackPaymentBRXXResult() {
        return getBackPaymentBRXXResult;
    }


    /**
     * Sets the getBackPaymentBRXXResult value for this GetBackPaymentBRXXResponse.
     * 
     * @param getBackPaymentBRXXResult
     */
    public void setGetBackPaymentBRXXResult(org.tempuri.GetBackPaymentBRXXResponseGetBackPaymentBRXXResult getBackPaymentBRXXResult) {
        this.getBackPaymentBRXXResult = getBackPaymentBRXXResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBackPaymentBRXXResponse)) return false;
        GetBackPaymentBRXXResponse other = (GetBackPaymentBRXXResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getBackPaymentBRXXResult==null && other.getGetBackPaymentBRXXResult()==null) || 
             (this.getBackPaymentBRXXResult!=null &&
              this.getBackPaymentBRXXResult.equals(other.getGetBackPaymentBRXXResult())));
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
        if (getGetBackPaymentBRXXResult() != null) {
            _hashCode += getGetBackPaymentBRXXResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBackPaymentBRXXResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetBackPaymentBRXXResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBackPaymentBRXXResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetBackPaymentBRXXResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetBackPaymentBRXXResponse>GetBackPaymentBRXXResult"));
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
