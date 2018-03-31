/**
 * GetMzbrBlwsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzbrBlwsResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getMzbrBlwsResult;

    public GetMzbrBlwsResponse() {
    }

    public GetMzbrBlwsResponse(
           org.tempuri.ReturnExTable getMzbrBlwsResult) {
           this.getMzbrBlwsResult = getMzbrBlwsResult;
    }


    /**
     * Gets the getMzbrBlwsResult value for this GetMzbrBlwsResponse.
     * 
     * @return getMzbrBlwsResult
     */
    public org.tempuri.ReturnExTable getGetMzbrBlwsResult() {
        return getMzbrBlwsResult;
    }


    /**
     * Sets the getMzbrBlwsResult value for this GetMzbrBlwsResponse.
     * 
     * @param getMzbrBlwsResult
     */
    public void setGetMzbrBlwsResult(org.tempuri.ReturnExTable getMzbrBlwsResult) {
        this.getMzbrBlwsResult = getMzbrBlwsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzbrBlwsResponse)) return false;
        GetMzbrBlwsResponse other = (GetMzbrBlwsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMzbrBlwsResult==null && other.getGetMzbrBlwsResult()==null) || 
             (this.getMzbrBlwsResult!=null &&
              this.getMzbrBlwsResult.equals(other.getGetMzbrBlwsResult())));
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
        if (getGetMzbrBlwsResult() != null) {
            _hashCode += getGetMzbrBlwsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzbrBlwsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzbrBlwsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMzbrBlwsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMzbrBlwsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExTable"));
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
