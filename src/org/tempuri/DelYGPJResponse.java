/**
 * DelYGPJResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DelYGPJResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm delYGPJResult;

    public DelYGPJResponse() {
    }

    public DelYGPJResponse(
           org.tempuri.ReturnExComm delYGPJResult) {
           this.delYGPJResult = delYGPJResult;
    }


    /**
     * Gets the delYGPJResult value for this DelYGPJResponse.
     * 
     * @return delYGPJResult
     */
    public org.tempuri.ReturnExComm getDelYGPJResult() {
        return delYGPJResult;
    }


    /**
     * Sets the delYGPJResult value for this DelYGPJResponse.
     * 
     * @param delYGPJResult
     */
    public void setDelYGPJResult(org.tempuri.ReturnExComm delYGPJResult) {
        this.delYGPJResult = delYGPJResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelYGPJResponse)) return false;
        DelYGPJResponse other = (DelYGPJResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.delYGPJResult==null && other.getDelYGPJResult()==null) || 
             (this.delYGPJResult!=null &&
              this.delYGPJResult.equals(other.getDelYGPJResult())));
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
        if (getDelYGPJResult() != null) {
            _hashCode += getDelYGPJResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DelYGPJResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DelYGPJResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delYGPJResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DelYGPJResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExComm"));
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
