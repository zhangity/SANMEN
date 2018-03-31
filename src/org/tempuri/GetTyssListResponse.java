/**
 * GetTyssListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetTyssListResponse  implements java.io.Serializable {
    private org.tempuri.GetTyssListResponseGetTyssListResult getTyssListResult;

    public GetTyssListResponse() {
    }

    public GetTyssListResponse(
           org.tempuri.GetTyssListResponseGetTyssListResult getTyssListResult) {
           this.getTyssListResult = getTyssListResult;
    }


    /**
     * Gets the getTyssListResult value for this GetTyssListResponse.
     * 
     * @return getTyssListResult
     */
    public org.tempuri.GetTyssListResponseGetTyssListResult getGetTyssListResult() {
        return getTyssListResult;
    }


    /**
     * Sets the getTyssListResult value for this GetTyssListResponse.
     * 
     * @param getTyssListResult
     */
    public void setGetTyssListResult(org.tempuri.GetTyssListResponseGetTyssListResult getTyssListResult) {
        this.getTyssListResult = getTyssListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTyssListResponse)) return false;
        GetTyssListResponse other = (GetTyssListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTyssListResult==null && other.getGetTyssListResult()==null) || 
             (this.getTyssListResult!=null &&
              this.getTyssListResult.equals(other.getGetTyssListResult())));
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
        if (getGetTyssListResult() != null) {
            _hashCode += getGetTyssListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTyssListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetTyssListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTyssListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetTyssListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetTyssListResponse>GetTyssListResult"));
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
