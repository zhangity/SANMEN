/**
 * GetSingleColumnValueaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSingleColumnValueaResponse  implements java.io.Serializable {
    private java.lang.Object getSingleColumnValueaResult;

    public GetSingleColumnValueaResponse() {
    }

    public GetSingleColumnValueaResponse(
           java.lang.Object getSingleColumnValueaResult) {
           this.getSingleColumnValueaResult = getSingleColumnValueaResult;
    }


    /**
     * Gets the getSingleColumnValueaResult value for this GetSingleColumnValueaResponse.
     * 
     * @return getSingleColumnValueaResult
     */
    public java.lang.Object getGetSingleColumnValueaResult() {
        return getSingleColumnValueaResult;
    }


    /**
     * Sets the getSingleColumnValueaResult value for this GetSingleColumnValueaResponse.
     * 
     * @param getSingleColumnValueaResult
     */
    public void setGetSingleColumnValueaResult(java.lang.Object getSingleColumnValueaResult) {
        this.getSingleColumnValueaResult = getSingleColumnValueaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSingleColumnValueaResponse)) return false;
        GetSingleColumnValueaResponse other = (GetSingleColumnValueaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSingleColumnValueaResult==null && other.getGetSingleColumnValueaResult()==null) || 
             (this.getSingleColumnValueaResult!=null &&
              this.getSingleColumnValueaResult.equals(other.getGetSingleColumnValueaResult())));
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
        if (getGetSingleColumnValueaResult() != null) {
            _hashCode += getGetSingleColumnValueaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSingleColumnValueaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSingleColumnValueaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSingleColumnValueaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSingleColumnValueaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
