/**
 * GetPaymentYjMbResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPaymentYjMbResponse  implements java.io.Serializable {
    private org.tempuri.GetPaymentYjMbResponseGetPaymentYjMbResult getPaymentYjMbResult;

    public GetPaymentYjMbResponse() {
    }

    public GetPaymentYjMbResponse(
           org.tempuri.GetPaymentYjMbResponseGetPaymentYjMbResult getPaymentYjMbResult) {
           this.getPaymentYjMbResult = getPaymentYjMbResult;
    }


    /**
     * Gets the getPaymentYjMbResult value for this GetPaymentYjMbResponse.
     * 
     * @return getPaymentYjMbResult
     */
    public org.tempuri.GetPaymentYjMbResponseGetPaymentYjMbResult getGetPaymentYjMbResult() {
        return getPaymentYjMbResult;
    }


    /**
     * Sets the getPaymentYjMbResult value for this GetPaymentYjMbResponse.
     * 
     * @param getPaymentYjMbResult
     */
    public void setGetPaymentYjMbResult(org.tempuri.GetPaymentYjMbResponseGetPaymentYjMbResult getPaymentYjMbResult) {
        this.getPaymentYjMbResult = getPaymentYjMbResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPaymentYjMbResponse)) return false;
        GetPaymentYjMbResponse other = (GetPaymentYjMbResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPaymentYjMbResult==null && other.getGetPaymentYjMbResult()==null) || 
             (this.getPaymentYjMbResult!=null &&
              this.getPaymentYjMbResult.equals(other.getGetPaymentYjMbResult())));
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
        if (getGetPaymentYjMbResult() != null) {
            _hashCode += getGetPaymentYjMbResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPaymentYjMbResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPaymentYjMbResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPaymentYjMbResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPaymentYjMbResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetPaymentYjMbResponse>GetPaymentYjMbResult"));
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
