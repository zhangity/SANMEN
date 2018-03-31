/**
 * GetYJGrcyXMResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYJGrcyXMResponse  implements java.io.Serializable {
    private org.tempuri.GetYJGrcyXMResponseGetYJGrcyXMResult getYJGrcyXMResult;

    public GetYJGrcyXMResponse() {
    }

    public GetYJGrcyXMResponse(
           org.tempuri.GetYJGrcyXMResponseGetYJGrcyXMResult getYJGrcyXMResult) {
           this.getYJGrcyXMResult = getYJGrcyXMResult;
    }


    /**
     * Gets the getYJGrcyXMResult value for this GetYJGrcyXMResponse.
     * 
     * @return getYJGrcyXMResult
     */
    public org.tempuri.GetYJGrcyXMResponseGetYJGrcyXMResult getGetYJGrcyXMResult() {
        return getYJGrcyXMResult;
    }


    /**
     * Sets the getYJGrcyXMResult value for this GetYJGrcyXMResponse.
     * 
     * @param getYJGrcyXMResult
     */
    public void setGetYJGrcyXMResult(org.tempuri.GetYJGrcyXMResponseGetYJGrcyXMResult getYJGrcyXMResult) {
        this.getYJGrcyXMResult = getYJGrcyXMResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYJGrcyXMResponse)) return false;
        GetYJGrcyXMResponse other = (GetYJGrcyXMResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getYJGrcyXMResult==null && other.getGetYJGrcyXMResult()==null) || 
             (this.getYJGrcyXMResult!=null &&
              this.getYJGrcyXMResult.equals(other.getGetYJGrcyXMResult())));
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
        if (getGetYJGrcyXMResult() != null) {
            _hashCode += getGetYJGrcyXMResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYJGrcyXMResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYJGrcyXMResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getYJGrcyXMResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetYJGrcyXMResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetYJGrcyXMResponse>GetYJGrcyXMResult"));
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
