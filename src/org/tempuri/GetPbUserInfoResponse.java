/**
 * GetPbUserInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPbUserInfoResponse  implements java.io.Serializable {
    private org.tempuri.GetPbUserInfoResponseGetPbUserInfoResult getPbUserInfoResult;

    public GetPbUserInfoResponse() {
    }

    public GetPbUserInfoResponse(
           org.tempuri.GetPbUserInfoResponseGetPbUserInfoResult getPbUserInfoResult) {
           this.getPbUserInfoResult = getPbUserInfoResult;
    }


    /**
     * Gets the getPbUserInfoResult value for this GetPbUserInfoResponse.
     * 
     * @return getPbUserInfoResult
     */
    public org.tempuri.GetPbUserInfoResponseGetPbUserInfoResult getGetPbUserInfoResult() {
        return getPbUserInfoResult;
    }


    /**
     * Sets the getPbUserInfoResult value for this GetPbUserInfoResponse.
     * 
     * @param getPbUserInfoResult
     */
    public void setGetPbUserInfoResult(org.tempuri.GetPbUserInfoResponseGetPbUserInfoResult getPbUserInfoResult) {
        this.getPbUserInfoResult = getPbUserInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPbUserInfoResponse)) return false;
        GetPbUserInfoResponse other = (GetPbUserInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPbUserInfoResult==null && other.getGetPbUserInfoResult()==null) || 
             (this.getPbUserInfoResult!=null &&
              this.getPbUserInfoResult.equals(other.getGetPbUserInfoResult())));
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
        if (getGetPbUserInfoResult() != null) {
            _hashCode += getGetPbUserInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPbUserInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPbUserInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPbUserInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPbUserInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetPbUserInfoResponse>GetPbUserInfoResult"));
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
