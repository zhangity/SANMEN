/**
 * UpdateBkXmlResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateBkXmlResponse  implements java.io.Serializable {
    private java.lang.String updateBkXmlResult;

    public UpdateBkXmlResponse() {
    }

    public UpdateBkXmlResponse(
           java.lang.String updateBkXmlResult) {
           this.updateBkXmlResult = updateBkXmlResult;
    }


    /**
     * Gets the updateBkXmlResult value for this UpdateBkXmlResponse.
     * 
     * @return updateBkXmlResult
     */
    public java.lang.String getUpdateBkXmlResult() {
        return updateBkXmlResult;
    }


    /**
     * Sets the updateBkXmlResult value for this UpdateBkXmlResponse.
     * 
     * @param updateBkXmlResult
     */
    public void setUpdateBkXmlResult(java.lang.String updateBkXmlResult) {
        this.updateBkXmlResult = updateBkXmlResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateBkXmlResponse)) return false;
        UpdateBkXmlResponse other = (UpdateBkXmlResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateBkXmlResult==null && other.getUpdateBkXmlResult()==null) || 
             (this.updateBkXmlResult!=null &&
              this.updateBkXmlResult.equals(other.getUpdateBkXmlResult())));
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
        if (getUpdateBkXmlResult() != null) {
            _hashCode += getUpdateBkXmlResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateBkXmlResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateBkXmlResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateBkXmlResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateBkXmlResult"));
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
