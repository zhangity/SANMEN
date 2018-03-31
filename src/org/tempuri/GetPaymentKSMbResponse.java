/**
 * GetPaymentKSMbResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPaymentKSMbResponse  implements java.io.Serializable {
    private org.tempuri.GetPaymentKSMbResponseGetPaymentKSMbResult getPaymentKSMbResult;

    public GetPaymentKSMbResponse() {
    }

    public GetPaymentKSMbResponse(
           org.tempuri.GetPaymentKSMbResponseGetPaymentKSMbResult getPaymentKSMbResult) {
           this.getPaymentKSMbResult = getPaymentKSMbResult;
    }


    /**
     * Gets the getPaymentKSMbResult value for this GetPaymentKSMbResponse.
     * 
     * @return getPaymentKSMbResult
     */
    public org.tempuri.GetPaymentKSMbResponseGetPaymentKSMbResult getGetPaymentKSMbResult() {
        return getPaymentKSMbResult;
    }


    /**
     * Sets the getPaymentKSMbResult value for this GetPaymentKSMbResponse.
     * 
     * @param getPaymentKSMbResult
     */
    public void setGetPaymentKSMbResult(org.tempuri.GetPaymentKSMbResponseGetPaymentKSMbResult getPaymentKSMbResult) {
        this.getPaymentKSMbResult = getPaymentKSMbResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPaymentKSMbResponse)) return false;
        GetPaymentKSMbResponse other = (GetPaymentKSMbResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPaymentKSMbResult==null && other.getGetPaymentKSMbResult()==null) || 
             (this.getPaymentKSMbResult!=null &&
              this.getPaymentKSMbResult.equals(other.getGetPaymentKSMbResult())));
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
        if (getGetPaymentKSMbResult() != null) {
            _hashCode += getGetPaymentKSMbResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPaymentKSMbResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPaymentKSMbResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPaymentKSMbResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPaymentKSMbResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetPaymentKSMbResponse>GetPaymentKSMbResult"));
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
