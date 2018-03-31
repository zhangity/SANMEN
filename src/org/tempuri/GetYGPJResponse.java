/**
 * GetYGPJResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYGPJResponse  implements java.io.Serializable {
    private org.tempuri.GetYGPJResponseGetYGPJResult getYGPJResult;

    public GetYGPJResponse() {
    }

    public GetYGPJResponse(
           org.tempuri.GetYGPJResponseGetYGPJResult getYGPJResult) {
           this.getYGPJResult = getYGPJResult;
    }


    /**
     * Gets the getYGPJResult value for this GetYGPJResponse.
     * 
     * @return getYGPJResult
     */
    public org.tempuri.GetYGPJResponseGetYGPJResult getGetYGPJResult() {
        return getYGPJResult;
    }


    /**
     * Sets the getYGPJResult value for this GetYGPJResponse.
     * 
     * @param getYGPJResult
     */
    public void setGetYGPJResult(org.tempuri.GetYGPJResponseGetYGPJResult getYGPJResult) {
        this.getYGPJResult = getYGPJResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYGPJResponse)) return false;
        GetYGPJResponse other = (GetYGPJResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getYGPJResult==null && other.getGetYGPJResult()==null) || 
             (this.getYGPJResult!=null &&
              this.getYGPJResult.equals(other.getGetYGPJResult())));
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
        if (getGetYGPJResult() != null) {
            _hashCode += getGetYGPJResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYGPJResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYGPJResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getYGPJResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetYGPJResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetYGPJResponse>GetYGPJResult"));
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
