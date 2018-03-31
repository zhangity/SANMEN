/**
 * GetSFZHbyBRIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSFZHbyBRIDResponse  implements java.io.Serializable {
    private java.lang.String getSFZHbyBRIDResult;

    public GetSFZHbyBRIDResponse() {
    }

    public GetSFZHbyBRIDResponse(
           java.lang.String getSFZHbyBRIDResult) {
           this.getSFZHbyBRIDResult = getSFZHbyBRIDResult;
    }


    /**
     * Gets the getSFZHbyBRIDResult value for this GetSFZHbyBRIDResponse.
     * 
     * @return getSFZHbyBRIDResult
     */
    public java.lang.String getGetSFZHbyBRIDResult() {
        return getSFZHbyBRIDResult;
    }


    /**
     * Sets the getSFZHbyBRIDResult value for this GetSFZHbyBRIDResponse.
     * 
     * @param getSFZHbyBRIDResult
     */
    public void setGetSFZHbyBRIDResult(java.lang.String getSFZHbyBRIDResult) {
        this.getSFZHbyBRIDResult = getSFZHbyBRIDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSFZHbyBRIDResponse)) return false;
        GetSFZHbyBRIDResponse other = (GetSFZHbyBRIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSFZHbyBRIDResult==null && other.getGetSFZHbyBRIDResult()==null) || 
             (this.getSFZHbyBRIDResult!=null &&
              this.getSFZHbyBRIDResult.equals(other.getGetSFZHbyBRIDResult())));
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
        if (getGetSFZHbyBRIDResult() != null) {
            _hashCode += getGetSFZHbyBRIDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSFZHbyBRIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSFZHbyBRIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSFZHbyBRIDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSFZHbyBRIDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
