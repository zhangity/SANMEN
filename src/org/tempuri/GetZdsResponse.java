/**
 * GetZdsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetZdsResponse  implements java.io.Serializable {
    private org.tempuri.GetZdsResponseGetZdsResult getZdsResult;

    public GetZdsResponse() {
    }

    public GetZdsResponse(
           org.tempuri.GetZdsResponseGetZdsResult getZdsResult) {
           this.getZdsResult = getZdsResult;
    }


    /**
     * Gets the getZdsResult value for this GetZdsResponse.
     * 
     * @return getZdsResult
     */
    public org.tempuri.GetZdsResponseGetZdsResult getGetZdsResult() {
        return getZdsResult;
    }


    /**
     * Sets the getZdsResult value for this GetZdsResponse.
     * 
     * @param getZdsResult
     */
    public void setGetZdsResult(org.tempuri.GetZdsResponseGetZdsResult getZdsResult) {
        this.getZdsResult = getZdsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZdsResponse)) return false;
        GetZdsResponse other = (GetZdsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getZdsResult==null && other.getGetZdsResult()==null) || 
             (this.getZdsResult!=null &&
              this.getZdsResult.equals(other.getGetZdsResult())));
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
        if (getGetZdsResult() != null) {
            _hashCode += getGetZdsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZdsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetZdsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getZdsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetZdsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetZdsResponse>GetZdsResult"));
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
