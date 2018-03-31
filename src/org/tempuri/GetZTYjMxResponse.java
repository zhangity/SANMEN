/**
 * GetZTYjMxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetZTYjMxResponse  implements java.io.Serializable {
    private org.tempuri.GetZTYjMxResponseGetZTYjMxResult getZTYjMxResult;

    public GetZTYjMxResponse() {
    }

    public GetZTYjMxResponse(
           org.tempuri.GetZTYjMxResponseGetZTYjMxResult getZTYjMxResult) {
           this.getZTYjMxResult = getZTYjMxResult;
    }


    /**
     * Gets the getZTYjMxResult value for this GetZTYjMxResponse.
     * 
     * @return getZTYjMxResult
     */
    public org.tempuri.GetZTYjMxResponseGetZTYjMxResult getGetZTYjMxResult() {
        return getZTYjMxResult;
    }


    /**
     * Sets the getZTYjMxResult value for this GetZTYjMxResponse.
     * 
     * @param getZTYjMxResult
     */
    public void setGetZTYjMxResult(org.tempuri.GetZTYjMxResponseGetZTYjMxResult getZTYjMxResult) {
        this.getZTYjMxResult = getZTYjMxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZTYjMxResponse)) return false;
        GetZTYjMxResponse other = (GetZTYjMxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getZTYjMxResult==null && other.getGetZTYjMxResult()==null) || 
             (this.getZTYjMxResult!=null &&
              this.getZTYjMxResult.equals(other.getGetZTYjMxResult())));
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
        if (getGetZTYjMxResult() != null) {
            _hashCode += getGetZTYjMxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZTYjMxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetZTYjMxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getZTYjMxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetZTYjMxResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetZTYjMxResponse>GetZTYjMxResult"));
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
