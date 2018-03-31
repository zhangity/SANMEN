/**
 * GetOldCardResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetOldCardResponse  implements java.io.Serializable {
    private org.tempuri.GetOldCardResponseGetOldCardResult getOldCardResult;

    public GetOldCardResponse() {
    }

    public GetOldCardResponse(
           org.tempuri.GetOldCardResponseGetOldCardResult getOldCardResult) {
           this.getOldCardResult = getOldCardResult;
    }


    /**
     * Gets the getOldCardResult value for this GetOldCardResponse.
     * 
     * @return getOldCardResult
     */
    public org.tempuri.GetOldCardResponseGetOldCardResult getGetOldCardResult() {
        return getOldCardResult;
    }


    /**
     * Sets the getOldCardResult value for this GetOldCardResponse.
     * 
     * @param getOldCardResult
     */
    public void setGetOldCardResult(org.tempuri.GetOldCardResponseGetOldCardResult getOldCardResult) {
        this.getOldCardResult = getOldCardResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOldCardResponse)) return false;
        GetOldCardResponse other = (GetOldCardResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getOldCardResult==null && other.getGetOldCardResult()==null) || 
             (this.getOldCardResult!=null &&
              this.getOldCardResult.equals(other.getGetOldCardResult())));
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
        if (getGetOldCardResult() != null) {
            _hashCode += getGetOldCardResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOldCardResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetOldCardResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getOldCardResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetOldCardResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetOldCardResponse>GetOldCardResult"));
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
