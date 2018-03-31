/**
 * GetGhXzKsDyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetGhXzKsDyResponse  implements java.io.Serializable {
    private org.tempuri.GetGhXzKsDyResponseGetGhXzKsDyResult getGhXzKsDyResult;

    public GetGhXzKsDyResponse() {
    }

    public GetGhXzKsDyResponse(
           org.tempuri.GetGhXzKsDyResponseGetGhXzKsDyResult getGhXzKsDyResult) {
           this.getGhXzKsDyResult = getGhXzKsDyResult;
    }


    /**
     * Gets the getGhXzKsDyResult value for this GetGhXzKsDyResponse.
     * 
     * @return getGhXzKsDyResult
     */
    public org.tempuri.GetGhXzKsDyResponseGetGhXzKsDyResult getGetGhXzKsDyResult() {
        return getGhXzKsDyResult;
    }


    /**
     * Sets the getGhXzKsDyResult value for this GetGhXzKsDyResponse.
     * 
     * @param getGhXzKsDyResult
     */
    public void setGetGhXzKsDyResult(org.tempuri.GetGhXzKsDyResponseGetGhXzKsDyResult getGhXzKsDyResult) {
        this.getGhXzKsDyResult = getGhXzKsDyResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGhXzKsDyResponse)) return false;
        GetGhXzKsDyResponse other = (GetGhXzKsDyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getGhXzKsDyResult==null && other.getGetGhXzKsDyResult()==null) || 
             (this.getGhXzKsDyResult!=null &&
              this.getGhXzKsDyResult.equals(other.getGetGhXzKsDyResult())));
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
        if (getGetGhXzKsDyResult() != null) {
            _hashCode += getGetGhXzKsDyResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGhXzKsDyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetGhXzKsDyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getGhXzKsDyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetGhXzKsDyResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetGhXzKsDyResponse>GetGhXzKsDyResult"));
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
