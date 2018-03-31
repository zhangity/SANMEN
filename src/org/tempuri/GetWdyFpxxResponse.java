/**
 * GetWdyFpxxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetWdyFpxxResponse  implements java.io.Serializable {
    private org.tempuri.GetWdyFpxxResponseGetWdyFpxxResult getWdyFpxxResult;

    public GetWdyFpxxResponse() {
    }

    public GetWdyFpxxResponse(
           org.tempuri.GetWdyFpxxResponseGetWdyFpxxResult getWdyFpxxResult) {
           this.getWdyFpxxResult = getWdyFpxxResult;
    }


    /**
     * Gets the getWdyFpxxResult value for this GetWdyFpxxResponse.
     * 
     * @return getWdyFpxxResult
     */
    public org.tempuri.GetWdyFpxxResponseGetWdyFpxxResult getGetWdyFpxxResult() {
        return getWdyFpxxResult;
    }


    /**
     * Sets the getWdyFpxxResult value for this GetWdyFpxxResponse.
     * 
     * @param getWdyFpxxResult
     */
    public void setGetWdyFpxxResult(org.tempuri.GetWdyFpxxResponseGetWdyFpxxResult getWdyFpxxResult) {
        this.getWdyFpxxResult = getWdyFpxxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWdyFpxxResponse)) return false;
        GetWdyFpxxResponse other = (GetWdyFpxxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getWdyFpxxResult==null && other.getGetWdyFpxxResult()==null) || 
             (this.getWdyFpxxResult!=null &&
              this.getWdyFpxxResult.equals(other.getGetWdyFpxxResult())));
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
        if (getGetWdyFpxxResult() != null) {
            _hashCode += getGetWdyFpxxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWdyFpxxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetWdyFpxxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getWdyFpxxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetWdyFpxxResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetWdyFpxxResponse>GetWdyFpxxResult"));
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
