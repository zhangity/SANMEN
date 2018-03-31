/**
 * SaveBrbqJyyzResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SaveBrbqJyyzResponse  implements java.io.Serializable {
    private java.lang.String saveBrbqJyyzResult;

    public SaveBrbqJyyzResponse() {
    }

    public SaveBrbqJyyzResponse(
           java.lang.String saveBrbqJyyzResult) {
           this.saveBrbqJyyzResult = saveBrbqJyyzResult;
    }


    /**
     * Gets the saveBrbqJyyzResult value for this SaveBrbqJyyzResponse.
     * 
     * @return saveBrbqJyyzResult
     */
    public java.lang.String getSaveBrbqJyyzResult() {
        return saveBrbqJyyzResult;
    }


    /**
     * Sets the saveBrbqJyyzResult value for this SaveBrbqJyyzResponse.
     * 
     * @param saveBrbqJyyzResult
     */
    public void setSaveBrbqJyyzResult(java.lang.String saveBrbqJyyzResult) {
        this.saveBrbqJyyzResult = saveBrbqJyyzResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaveBrbqJyyzResponse)) return false;
        SaveBrbqJyyzResponse other = (SaveBrbqJyyzResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.saveBrbqJyyzResult==null && other.getSaveBrbqJyyzResult()==null) || 
             (this.saveBrbqJyyzResult!=null &&
              this.saveBrbqJyyzResult.equals(other.getSaveBrbqJyyzResult())));
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
        if (getSaveBrbqJyyzResult() != null) {
            _hashCode += getSaveBrbqJyyzResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaveBrbqJyyzResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SaveBrbqJyyzResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saveBrbqJyyzResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SaveBrbqJyyzResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
