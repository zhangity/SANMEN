/**
 * GetFpmxxxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetFpmxxxResponse  implements java.io.Serializable {
    private org.tempuri.GetFpmxxxResponseGetFpmxxxResult getFpmxxxResult;

    public GetFpmxxxResponse() {
    }

    public GetFpmxxxResponse(
           org.tempuri.GetFpmxxxResponseGetFpmxxxResult getFpmxxxResult) {
           this.getFpmxxxResult = getFpmxxxResult;
    }


    /**
     * Gets the getFpmxxxResult value for this GetFpmxxxResponse.
     * 
     * @return getFpmxxxResult
     */
    public org.tempuri.GetFpmxxxResponseGetFpmxxxResult getGetFpmxxxResult() {
        return getFpmxxxResult;
    }


    /**
     * Sets the getFpmxxxResult value for this GetFpmxxxResponse.
     * 
     * @param getFpmxxxResult
     */
    public void setGetFpmxxxResult(org.tempuri.GetFpmxxxResponseGetFpmxxxResult getFpmxxxResult) {
        this.getFpmxxxResult = getFpmxxxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFpmxxxResponse)) return false;
        GetFpmxxxResponse other = (GetFpmxxxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFpmxxxResult==null && other.getGetFpmxxxResult()==null) || 
             (this.getFpmxxxResult!=null &&
              this.getFpmxxxResult.equals(other.getGetFpmxxxResult())));
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
        if (getGetFpmxxxResult() != null) {
            _hashCode += getGetFpmxxxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFpmxxxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetFpmxxxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFpmxxxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetFpmxxxResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetFpmxxxResponse>GetFpmxxxResult"));
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
