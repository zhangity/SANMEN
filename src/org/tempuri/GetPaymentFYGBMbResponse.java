/**
 * GetPaymentFYGBMbResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPaymentFYGBMbResponse  implements java.io.Serializable {
    private org.tempuri.GetPaymentFYGBMbResponseGetPaymentFYGBMbResult getPaymentFYGBMbResult;

    public GetPaymentFYGBMbResponse() {
    }

    public GetPaymentFYGBMbResponse(
           org.tempuri.GetPaymentFYGBMbResponseGetPaymentFYGBMbResult getPaymentFYGBMbResult) {
           this.getPaymentFYGBMbResult = getPaymentFYGBMbResult;
    }


    /**
     * Gets the getPaymentFYGBMbResult value for this GetPaymentFYGBMbResponse.
     * 
     * @return getPaymentFYGBMbResult
     */
    public org.tempuri.GetPaymentFYGBMbResponseGetPaymentFYGBMbResult getGetPaymentFYGBMbResult() {
        return getPaymentFYGBMbResult;
    }


    /**
     * Sets the getPaymentFYGBMbResult value for this GetPaymentFYGBMbResponse.
     * 
     * @param getPaymentFYGBMbResult
     */
    public void setGetPaymentFYGBMbResult(org.tempuri.GetPaymentFYGBMbResponseGetPaymentFYGBMbResult getPaymentFYGBMbResult) {
        this.getPaymentFYGBMbResult = getPaymentFYGBMbResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPaymentFYGBMbResponse)) return false;
        GetPaymentFYGBMbResponse other = (GetPaymentFYGBMbResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPaymentFYGBMbResult==null && other.getGetPaymentFYGBMbResult()==null) || 
             (this.getPaymentFYGBMbResult!=null &&
              this.getPaymentFYGBMbResult.equals(other.getGetPaymentFYGBMbResult())));
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
        if (getGetPaymentFYGBMbResult() != null) {
            _hashCode += getGetPaymentFYGBMbResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPaymentFYGBMbResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPaymentFYGBMbResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPaymentFYGBMbResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPaymentFYGBMbResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetPaymentFYGBMbResponse>GetPaymentFYGBMbResult"));
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
