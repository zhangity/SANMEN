/**
 * GetBlNjbgResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetBlNjbgResponse  implements java.io.Serializable {
    private org.tempuri.GetBlNjbgResponseGetBlNjbgResult getBlNjbgResult;

    public GetBlNjbgResponse() {
    }

    public GetBlNjbgResponse(
           org.tempuri.GetBlNjbgResponseGetBlNjbgResult getBlNjbgResult) {
           this.getBlNjbgResult = getBlNjbgResult;
    }


    /**
     * Gets the getBlNjbgResult value for this GetBlNjbgResponse.
     * 
     * @return getBlNjbgResult
     */
    public org.tempuri.GetBlNjbgResponseGetBlNjbgResult getGetBlNjbgResult() {
        return getBlNjbgResult;
    }


    /**
     * Sets the getBlNjbgResult value for this GetBlNjbgResponse.
     * 
     * @param getBlNjbgResult
     */
    public void setGetBlNjbgResult(org.tempuri.GetBlNjbgResponseGetBlNjbgResult getBlNjbgResult) {
        this.getBlNjbgResult = getBlNjbgResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBlNjbgResponse)) return false;
        GetBlNjbgResponse other = (GetBlNjbgResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getBlNjbgResult==null && other.getGetBlNjbgResult()==null) || 
             (this.getBlNjbgResult!=null &&
              this.getBlNjbgResult.equals(other.getGetBlNjbgResult())));
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
        if (getGetBlNjbgResult() != null) {
            _hashCode += getGetBlNjbgResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBlNjbgResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetBlNjbgResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBlNjbgResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetBlNjbgResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetBlNjbgResponse>GetBlNjbgResult"));
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
