/**
 * GetSsapByKsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSsapByKsResponse  implements java.io.Serializable {
    private org.tempuri.GetSsapByKsResponseGetSsapByKsResult getSsapByKsResult;

    public GetSsapByKsResponse() {
    }

    public GetSsapByKsResponse(
           org.tempuri.GetSsapByKsResponseGetSsapByKsResult getSsapByKsResult) {
           this.getSsapByKsResult = getSsapByKsResult;
    }


    /**
     * Gets the getSsapByKsResult value for this GetSsapByKsResponse.
     * 
     * @return getSsapByKsResult
     */
    public org.tempuri.GetSsapByKsResponseGetSsapByKsResult getGetSsapByKsResult() {
        return getSsapByKsResult;
    }


    /**
     * Sets the getSsapByKsResult value for this GetSsapByKsResponse.
     * 
     * @param getSsapByKsResult
     */
    public void setGetSsapByKsResult(org.tempuri.GetSsapByKsResponseGetSsapByKsResult getSsapByKsResult) {
        this.getSsapByKsResult = getSsapByKsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSsapByKsResponse)) return false;
        GetSsapByKsResponse other = (GetSsapByKsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSsapByKsResult==null && other.getGetSsapByKsResult()==null) || 
             (this.getSsapByKsResult!=null &&
              this.getSsapByKsResult.equals(other.getGetSsapByKsResult())));
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
        if (getGetSsapByKsResult() != null) {
            _hashCode += getGetSsapByKsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSsapByKsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSsapByKsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSsapByKsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSsapByKsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSsapByKsResponse>GetSsapByKsResult"));
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
