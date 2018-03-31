/**
 * UpdateCfAndYjJssjResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateCfAndYjJssjResponse  implements java.io.Serializable {
    private java.lang.String updateCfAndYjJssjResult;

    public UpdateCfAndYjJssjResponse() {
    }

    public UpdateCfAndYjJssjResponse(
           java.lang.String updateCfAndYjJssjResult) {
           this.updateCfAndYjJssjResult = updateCfAndYjJssjResult;
    }


    /**
     * Gets the updateCfAndYjJssjResult value for this UpdateCfAndYjJssjResponse.
     * 
     * @return updateCfAndYjJssjResult
     */
    public java.lang.String getUpdateCfAndYjJssjResult() {
        return updateCfAndYjJssjResult;
    }


    /**
     * Sets the updateCfAndYjJssjResult value for this UpdateCfAndYjJssjResponse.
     * 
     * @param updateCfAndYjJssjResult
     */
    public void setUpdateCfAndYjJssjResult(java.lang.String updateCfAndYjJssjResult) {
        this.updateCfAndYjJssjResult = updateCfAndYjJssjResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateCfAndYjJssjResponse)) return false;
        UpdateCfAndYjJssjResponse other = (UpdateCfAndYjJssjResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateCfAndYjJssjResult==null && other.getUpdateCfAndYjJssjResult()==null) || 
             (this.updateCfAndYjJssjResult!=null &&
              this.updateCfAndYjJssjResult.equals(other.getUpdateCfAndYjJssjResult())));
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
        if (getUpdateCfAndYjJssjResult() != null) {
            _hashCode += getUpdateCfAndYjJssjResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCfAndYjJssjResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateCfAndYjJssjResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateCfAndYjJssjResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateCfAndYjJssjResult"));
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
