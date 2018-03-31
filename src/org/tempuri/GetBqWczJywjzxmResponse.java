/**
 * GetBqWczJywjzxmResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetBqWczJywjzxmResponse  implements java.io.Serializable {
    private org.tempuri.GetBqWczJywjzxmResponseGetBqWczJywjzxmResult getBqWczJywjzxmResult;

    public GetBqWczJywjzxmResponse() {
    }

    public GetBqWczJywjzxmResponse(
           org.tempuri.GetBqWczJywjzxmResponseGetBqWczJywjzxmResult getBqWczJywjzxmResult) {
           this.getBqWczJywjzxmResult = getBqWczJywjzxmResult;
    }


    /**
     * Gets the getBqWczJywjzxmResult value for this GetBqWczJywjzxmResponse.
     * 
     * @return getBqWczJywjzxmResult
     */
    public org.tempuri.GetBqWczJywjzxmResponseGetBqWczJywjzxmResult getGetBqWczJywjzxmResult() {
        return getBqWczJywjzxmResult;
    }


    /**
     * Sets the getBqWczJywjzxmResult value for this GetBqWczJywjzxmResponse.
     * 
     * @param getBqWczJywjzxmResult
     */
    public void setGetBqWczJywjzxmResult(org.tempuri.GetBqWczJywjzxmResponseGetBqWczJywjzxmResult getBqWczJywjzxmResult) {
        this.getBqWczJywjzxmResult = getBqWczJywjzxmResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBqWczJywjzxmResponse)) return false;
        GetBqWczJywjzxmResponse other = (GetBqWczJywjzxmResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getBqWczJywjzxmResult==null && other.getGetBqWczJywjzxmResult()==null) || 
             (this.getBqWczJywjzxmResult!=null &&
              this.getBqWczJywjzxmResult.equals(other.getGetBqWczJywjzxmResult())));
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
        if (getGetBqWczJywjzxmResult() != null) {
            _hashCode += getGetBqWczJywjzxmResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBqWczJywjzxmResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetBqWczJywjzxmResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBqWczJywjzxmResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetBqWczJywjzxmResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetBqWczJywjzxmResponse>GetBqWczJywjzxmResult"));
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
