/**
 * GetBkXmlResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetBkXmlResponse  implements java.io.Serializable {
    private org.tempuri.GetBkXmlResponseGetBkXmlResult getBkXmlResult;

    public GetBkXmlResponse() {
    }

    public GetBkXmlResponse(
           org.tempuri.GetBkXmlResponseGetBkXmlResult getBkXmlResult) {
           this.getBkXmlResult = getBkXmlResult;
    }


    /**
     * Gets the getBkXmlResult value for this GetBkXmlResponse.
     * 
     * @return getBkXmlResult
     */
    public org.tempuri.GetBkXmlResponseGetBkXmlResult getGetBkXmlResult() {
        return getBkXmlResult;
    }


    /**
     * Sets the getBkXmlResult value for this GetBkXmlResponse.
     * 
     * @param getBkXmlResult
     */
    public void setGetBkXmlResult(org.tempuri.GetBkXmlResponseGetBkXmlResult getBkXmlResult) {
        this.getBkXmlResult = getBkXmlResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBkXmlResponse)) return false;
        GetBkXmlResponse other = (GetBkXmlResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getBkXmlResult==null && other.getGetBkXmlResult()==null) || 
             (this.getBkXmlResult!=null &&
              this.getBkXmlResult.equals(other.getGetBkXmlResult())));
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
        if (getGetBkXmlResult() != null) {
            _hashCode += getGetBkXmlResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBkXmlResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetBkXmlResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBkXmlResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetBkXmlResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetBkXmlResponse>GetBkXmlResult"));
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
