/**
 * GetYsdlcxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYsdlcxResponse  implements java.io.Serializable {
    private org.tempuri.GetYsdlcxResponseGetYsdlcxResult getYsdlcxResult;

    public GetYsdlcxResponse() {
    }

    public GetYsdlcxResponse(
           org.tempuri.GetYsdlcxResponseGetYsdlcxResult getYsdlcxResult) {
           this.getYsdlcxResult = getYsdlcxResult;
    }


    /**
     * Gets the getYsdlcxResult value for this GetYsdlcxResponse.
     * 
     * @return getYsdlcxResult
     */
    public org.tempuri.GetYsdlcxResponseGetYsdlcxResult getGetYsdlcxResult() {
        return getYsdlcxResult;
    }


    /**
     * Sets the getYsdlcxResult value for this GetYsdlcxResponse.
     * 
     * @param getYsdlcxResult
     */
    public void setGetYsdlcxResult(org.tempuri.GetYsdlcxResponseGetYsdlcxResult getYsdlcxResult) {
        this.getYsdlcxResult = getYsdlcxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYsdlcxResponse)) return false;
        GetYsdlcxResponse other = (GetYsdlcxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getYsdlcxResult==null && other.getGetYsdlcxResult()==null) || 
             (this.getYsdlcxResult!=null &&
              this.getYsdlcxResult.equals(other.getGetYsdlcxResult())));
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
        if (getGetYsdlcxResult() != null) {
            _hashCode += getGetYsdlcxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYsdlcxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYsdlcxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getYsdlcxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetYsdlcxResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetYsdlcxResponse>GetYsdlcxResult"));
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
