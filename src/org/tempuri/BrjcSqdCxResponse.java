/**
 * BrjcSqdCxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class BrjcSqdCxResponse  implements java.io.Serializable {
    private java.lang.String brjcSqdCxResult;

    public BrjcSqdCxResponse() {
    }

    public BrjcSqdCxResponse(
           java.lang.String brjcSqdCxResult) {
           this.brjcSqdCxResult = brjcSqdCxResult;
    }


    /**
     * Gets the brjcSqdCxResult value for this BrjcSqdCxResponse.
     * 
     * @return brjcSqdCxResult
     */
    public java.lang.String getBrjcSqdCxResult() {
        return brjcSqdCxResult;
    }


    /**
     * Sets the brjcSqdCxResult value for this BrjcSqdCxResponse.
     * 
     * @param brjcSqdCxResult
     */
    public void setBrjcSqdCxResult(java.lang.String brjcSqdCxResult) {
        this.brjcSqdCxResult = brjcSqdCxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrjcSqdCxResponse)) return false;
        BrjcSqdCxResponse other = (BrjcSqdCxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.brjcSqdCxResult==null && other.getBrjcSqdCxResult()==null) || 
             (this.brjcSqdCxResult!=null &&
              this.brjcSqdCxResult.equals(other.getBrjcSqdCxResult())));
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
        if (getBrjcSqdCxResult() != null) {
            _hashCode += getBrjcSqdCxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BrjcSqdCxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">BrjcSqdCxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brjcSqdCxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BrjcSqdCxResult"));
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
