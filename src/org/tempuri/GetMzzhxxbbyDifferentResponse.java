/**
 * GetMzzhxxbbyDifferentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzzhxxbbyDifferentResponse  implements java.io.Serializable {
    private org.tempuri.GetMzzhxxbbyDifferentResponseGetMzzhxxbbyDifferentResult getMzzhxxbbyDifferentResult;

    public GetMzzhxxbbyDifferentResponse() {
    }

    public GetMzzhxxbbyDifferentResponse(
           org.tempuri.GetMzzhxxbbyDifferentResponseGetMzzhxxbbyDifferentResult getMzzhxxbbyDifferentResult) {
           this.getMzzhxxbbyDifferentResult = getMzzhxxbbyDifferentResult;
    }


    /**
     * Gets the getMzzhxxbbyDifferentResult value for this GetMzzhxxbbyDifferentResponse.
     * 
     * @return getMzzhxxbbyDifferentResult
     */
    public org.tempuri.GetMzzhxxbbyDifferentResponseGetMzzhxxbbyDifferentResult getGetMzzhxxbbyDifferentResult() {
        return getMzzhxxbbyDifferentResult;
    }


    /**
     * Sets the getMzzhxxbbyDifferentResult value for this GetMzzhxxbbyDifferentResponse.
     * 
     * @param getMzzhxxbbyDifferentResult
     */
    public void setGetMzzhxxbbyDifferentResult(org.tempuri.GetMzzhxxbbyDifferentResponseGetMzzhxxbbyDifferentResult getMzzhxxbbyDifferentResult) {
        this.getMzzhxxbbyDifferentResult = getMzzhxxbbyDifferentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzzhxxbbyDifferentResponse)) return false;
        GetMzzhxxbbyDifferentResponse other = (GetMzzhxxbbyDifferentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMzzhxxbbyDifferentResult==null && other.getGetMzzhxxbbyDifferentResult()==null) || 
             (this.getMzzhxxbbyDifferentResult!=null &&
              this.getMzzhxxbbyDifferentResult.equals(other.getGetMzzhxxbbyDifferentResult())));
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
        if (getGetMzzhxxbbyDifferentResult() != null) {
            _hashCode += getGetMzzhxxbbyDifferentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzzhxxbbyDifferentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzzhxxbbyDifferentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMzzhxxbbyDifferentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMzzhxxbbyDifferentResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetMzzhxxbbyDifferentResponse>GetMzzhxxbbyDifferentResult"));
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
