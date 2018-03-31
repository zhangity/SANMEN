/**
 * GetBqYczJywjzxmResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetBqYczJywjzxmResponse  implements java.io.Serializable {
    private org.tempuri.GetBqYczJywjzxmResponseGetBqYczJywjzxmResult getBqYczJywjzxmResult;

    public GetBqYczJywjzxmResponse() {
    }

    public GetBqYczJywjzxmResponse(
           org.tempuri.GetBqYczJywjzxmResponseGetBqYczJywjzxmResult getBqYczJywjzxmResult) {
           this.getBqYczJywjzxmResult = getBqYczJywjzxmResult;
    }


    /**
     * Gets the getBqYczJywjzxmResult value for this GetBqYczJywjzxmResponse.
     * 
     * @return getBqYczJywjzxmResult
     */
    public org.tempuri.GetBqYczJywjzxmResponseGetBqYczJywjzxmResult getGetBqYczJywjzxmResult() {
        return getBqYczJywjzxmResult;
    }


    /**
     * Sets the getBqYczJywjzxmResult value for this GetBqYczJywjzxmResponse.
     * 
     * @param getBqYczJywjzxmResult
     */
    public void setGetBqYczJywjzxmResult(org.tempuri.GetBqYczJywjzxmResponseGetBqYczJywjzxmResult getBqYczJywjzxmResult) {
        this.getBqYczJywjzxmResult = getBqYczJywjzxmResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBqYczJywjzxmResponse)) return false;
        GetBqYczJywjzxmResponse other = (GetBqYczJywjzxmResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getBqYczJywjzxmResult==null && other.getGetBqYczJywjzxmResult()==null) || 
             (this.getBqYczJywjzxmResult!=null &&
              this.getBqYczJywjzxmResult.equals(other.getGetBqYczJywjzxmResult())));
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
        if (getGetBqYczJywjzxmResult() != null) {
            _hashCode += getGetBqYczJywjzxmResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBqYczJywjzxmResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetBqYczJywjzxmResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBqYczJywjzxmResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetBqYczJywjzxmResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetBqYczJywjzxmResponse>GetBqYczJywjzxmResult"));
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
