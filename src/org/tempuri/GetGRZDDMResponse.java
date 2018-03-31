/**
 * GetGRZDDMResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetGRZDDMResponse  implements java.io.Serializable {
    private org.tempuri.GetGRZDDMResponseGetGRZDDMResult getGRZDDMResult;

    public GetGRZDDMResponse() {
    }

    public GetGRZDDMResponse(
           org.tempuri.GetGRZDDMResponseGetGRZDDMResult getGRZDDMResult) {
           this.getGRZDDMResult = getGRZDDMResult;
    }


    /**
     * Gets the getGRZDDMResult value for this GetGRZDDMResponse.
     * 
     * @return getGRZDDMResult
     */
    public org.tempuri.GetGRZDDMResponseGetGRZDDMResult getGetGRZDDMResult() {
        return getGRZDDMResult;
    }


    /**
     * Sets the getGRZDDMResult value for this GetGRZDDMResponse.
     * 
     * @param getGRZDDMResult
     */
    public void setGetGRZDDMResult(org.tempuri.GetGRZDDMResponseGetGRZDDMResult getGRZDDMResult) {
        this.getGRZDDMResult = getGRZDDMResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGRZDDMResponse)) return false;
        GetGRZDDMResponse other = (GetGRZDDMResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getGRZDDMResult==null && other.getGetGRZDDMResult()==null) || 
             (this.getGRZDDMResult!=null &&
              this.getGRZDDMResult.equals(other.getGetGRZDDMResult())));
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
        if (getGetGRZDDMResult() != null) {
            _hashCode += getGetGRZDDMResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGRZDDMResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetGRZDDMResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getGRZDDMResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetGRZDDMResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetGRZDDMResponse>GetGRZDDMResult"));
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
