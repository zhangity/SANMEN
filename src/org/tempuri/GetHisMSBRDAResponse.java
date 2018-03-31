/**
 * GetHisMSBRDAResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetHisMSBRDAResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getHisMSBRDAResult;

    public GetHisMSBRDAResponse() {
    }

    public GetHisMSBRDAResponse(
           org.tempuri.ReturnExTable getHisMSBRDAResult) {
           this.getHisMSBRDAResult = getHisMSBRDAResult;
    }


    /**
     * Gets the getHisMSBRDAResult value for this GetHisMSBRDAResponse.
     * 
     * @return getHisMSBRDAResult
     */
    public org.tempuri.ReturnExTable getGetHisMSBRDAResult() {
        return getHisMSBRDAResult;
    }


    /**
     * Sets the getHisMSBRDAResult value for this GetHisMSBRDAResponse.
     * 
     * @param getHisMSBRDAResult
     */
    public void setGetHisMSBRDAResult(org.tempuri.ReturnExTable getHisMSBRDAResult) {
        this.getHisMSBRDAResult = getHisMSBRDAResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetHisMSBRDAResponse)) return false;
        GetHisMSBRDAResponse other = (GetHisMSBRDAResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getHisMSBRDAResult==null && other.getGetHisMSBRDAResult()==null) || 
             (this.getHisMSBRDAResult!=null &&
              this.getHisMSBRDAResult.equals(other.getGetHisMSBRDAResult())));
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
        if (getGetHisMSBRDAResult() != null) {
            _hashCode += getGetHisMSBRDAResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetHisMSBRDAResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetHisMSBRDAResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getHisMSBRDAResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetHisMSBRDAResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExTable"));
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
