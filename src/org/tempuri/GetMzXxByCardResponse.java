/**
 * GetMzXxByCardResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzXxByCardResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getMzXxByCardResult;

    public GetMzXxByCardResponse() {
    }

    public GetMzXxByCardResponse(
           org.tempuri.ReturnExTable getMzXxByCardResult) {
           this.getMzXxByCardResult = getMzXxByCardResult;
    }


    /**
     * Gets the getMzXxByCardResult value for this GetMzXxByCardResponse.
     * 
     * @return getMzXxByCardResult
     */
    public org.tempuri.ReturnExTable getGetMzXxByCardResult() {
        return getMzXxByCardResult;
    }


    /**
     * Sets the getMzXxByCardResult value for this GetMzXxByCardResponse.
     * 
     * @param getMzXxByCardResult
     */
    public void setGetMzXxByCardResult(org.tempuri.ReturnExTable getMzXxByCardResult) {
        this.getMzXxByCardResult = getMzXxByCardResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzXxByCardResponse)) return false;
        GetMzXxByCardResponse other = (GetMzXxByCardResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMzXxByCardResult==null && other.getGetMzXxByCardResult()==null) || 
             (this.getMzXxByCardResult!=null &&
              this.getMzXxByCardResult.equals(other.getGetMzXxByCardResult())));
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
        if (getGetMzXxByCardResult() != null) {
            _hashCode += getGetMzXxByCardResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzXxByCardResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzXxByCardResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMzXxByCardResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMzXxByCardResult"));
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
