/**
 * GetHzdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetHzdResponse  implements java.io.Serializable {
    private org.tempuri.GetHzdResponseGetHzdResult getHzdResult;

    public GetHzdResponse() {
    }

    public GetHzdResponse(
           org.tempuri.GetHzdResponseGetHzdResult getHzdResult) {
           this.getHzdResult = getHzdResult;
    }


    /**
     * Gets the getHzdResult value for this GetHzdResponse.
     * 
     * @return getHzdResult
     */
    public org.tempuri.GetHzdResponseGetHzdResult getGetHzdResult() {
        return getHzdResult;
    }


    /**
     * Sets the getHzdResult value for this GetHzdResponse.
     * 
     * @param getHzdResult
     */
    public void setGetHzdResult(org.tempuri.GetHzdResponseGetHzdResult getHzdResult) {
        this.getHzdResult = getHzdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetHzdResponse)) return false;
        GetHzdResponse other = (GetHzdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getHzdResult==null && other.getGetHzdResult()==null) || 
             (this.getHzdResult!=null &&
              this.getHzdResult.equals(other.getGetHzdResult())));
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
        if (getGetHzdResult() != null) {
            _hashCode += getGetHzdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetHzdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetHzdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getHzdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetHzdResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetHzdResponse>GetHzdResult"));
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
