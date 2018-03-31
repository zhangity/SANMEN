/**
 * GetJcbgIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetJcbgIdResponse  implements java.io.Serializable {
    private org.tempuri.GetJcbgIdResponseGetJcbgIdResult getJcbgIdResult;

    public GetJcbgIdResponse() {
    }

    public GetJcbgIdResponse(
           org.tempuri.GetJcbgIdResponseGetJcbgIdResult getJcbgIdResult) {
           this.getJcbgIdResult = getJcbgIdResult;
    }


    /**
     * Gets the getJcbgIdResult value for this GetJcbgIdResponse.
     * 
     * @return getJcbgIdResult
     */
    public org.tempuri.GetJcbgIdResponseGetJcbgIdResult getGetJcbgIdResult() {
        return getJcbgIdResult;
    }


    /**
     * Sets the getJcbgIdResult value for this GetJcbgIdResponse.
     * 
     * @param getJcbgIdResult
     */
    public void setGetJcbgIdResult(org.tempuri.GetJcbgIdResponseGetJcbgIdResult getJcbgIdResult) {
        this.getJcbgIdResult = getJcbgIdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetJcbgIdResponse)) return false;
        GetJcbgIdResponse other = (GetJcbgIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getJcbgIdResult==null && other.getGetJcbgIdResult()==null) || 
             (this.getJcbgIdResult!=null &&
              this.getJcbgIdResult.equals(other.getGetJcbgIdResult())));
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
        if (getGetJcbgIdResult() != null) {
            _hashCode += getGetJcbgIdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetJcbgIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetJcbgIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getJcbgIdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetJcbgIdResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetJcbgIdResponse>GetJcbgIdResult"));
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
