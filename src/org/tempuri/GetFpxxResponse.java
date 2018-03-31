/**
 * GetFpxxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetFpxxResponse  implements java.io.Serializable {
    private org.tempuri.GetFpxxResponseGetFpxxResult getFpxxResult;

    public GetFpxxResponse() {
    }

    public GetFpxxResponse(
           org.tempuri.GetFpxxResponseGetFpxxResult getFpxxResult) {
           this.getFpxxResult = getFpxxResult;
    }


    /**
     * Gets the getFpxxResult value for this GetFpxxResponse.
     * 
     * @return getFpxxResult
     */
    public org.tempuri.GetFpxxResponseGetFpxxResult getGetFpxxResult() {
        return getFpxxResult;
    }


    /**
     * Sets the getFpxxResult value for this GetFpxxResponse.
     * 
     * @param getFpxxResult
     */
    public void setGetFpxxResult(org.tempuri.GetFpxxResponseGetFpxxResult getFpxxResult) {
        this.getFpxxResult = getFpxxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFpxxResponse)) return false;
        GetFpxxResponse other = (GetFpxxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFpxxResult==null && other.getGetFpxxResult()==null) || 
             (this.getFpxxResult!=null &&
              this.getFpxxResult.equals(other.getGetFpxxResult())));
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
        if (getGetFpxxResult() != null) {
            _hashCode += getGetFpxxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFpxxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetFpxxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFpxxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetFpxxResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetFpxxResponse>GetFpxxResult"));
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
