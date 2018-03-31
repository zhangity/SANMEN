/**
 * GetSsapResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSsapResponse  implements java.io.Serializable {
    private org.tempuri.GetSsapResponseGetSsapResult getSsapResult;

    public GetSsapResponse() {
    }

    public GetSsapResponse(
           org.tempuri.GetSsapResponseGetSsapResult getSsapResult) {
           this.getSsapResult = getSsapResult;
    }


    /**
     * Gets the getSsapResult value for this GetSsapResponse.
     * 
     * @return getSsapResult
     */
    public org.tempuri.GetSsapResponseGetSsapResult getGetSsapResult() {
        return getSsapResult;
    }


    /**
     * Sets the getSsapResult value for this GetSsapResponse.
     * 
     * @param getSsapResult
     */
    public void setGetSsapResult(org.tempuri.GetSsapResponseGetSsapResult getSsapResult) {
        this.getSsapResult = getSsapResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSsapResponse)) return false;
        GetSsapResponse other = (GetSsapResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSsapResult==null && other.getGetSsapResult()==null) || 
             (this.getSsapResult!=null &&
              this.getSsapResult.equals(other.getGetSsapResult())));
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
        if (getGetSsapResult() != null) {
            _hashCode += getGetSsapResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSsapResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSsapResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSsapResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSsapResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSsapResponse>GetSsapResult"));
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
