/**
 * GetblbgResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetblbgResponse  implements java.io.Serializable {
    private org.tempuri.GetblbgResponseGetblbgResult getblbgResult;

    public GetblbgResponse() {
    }

    public GetblbgResponse(
           org.tempuri.GetblbgResponseGetblbgResult getblbgResult) {
           this.getblbgResult = getblbgResult;
    }


    /**
     * Gets the getblbgResult value for this GetblbgResponse.
     * 
     * @return getblbgResult
     */
    public org.tempuri.GetblbgResponseGetblbgResult getGetblbgResult() {
        return getblbgResult;
    }


    /**
     * Sets the getblbgResult value for this GetblbgResponse.
     * 
     * @param getblbgResult
     */
    public void setGetblbgResult(org.tempuri.GetblbgResponseGetblbgResult getblbgResult) {
        this.getblbgResult = getblbgResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetblbgResponse)) return false;
        GetblbgResponse other = (GetblbgResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getblbgResult==null && other.getGetblbgResult()==null) || 
             (this.getblbgResult!=null &&
              this.getblbgResult.equals(other.getGetblbgResult())));
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
        if (getGetblbgResult() != null) {
            _hashCode += getGetblbgResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetblbgResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetblbgResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getblbgResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetblbgResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetblbgResponse>GetblbgResult"));
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
