/**
 * DelYjZtResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DelYjZtResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm delYjZtResult;

    public DelYjZtResponse() {
    }

    public DelYjZtResponse(
           org.tempuri.ReturnExComm delYjZtResult) {
           this.delYjZtResult = delYjZtResult;
    }


    /**
     * Gets the delYjZtResult value for this DelYjZtResponse.
     * 
     * @return delYjZtResult
     */
    public org.tempuri.ReturnExComm getDelYjZtResult() {
        return delYjZtResult;
    }


    /**
     * Sets the delYjZtResult value for this DelYjZtResponse.
     * 
     * @param delYjZtResult
     */
    public void setDelYjZtResult(org.tempuri.ReturnExComm delYjZtResult) {
        this.delYjZtResult = delYjZtResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelYjZtResponse)) return false;
        DelYjZtResponse other = (DelYjZtResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.delYjZtResult==null && other.getDelYjZtResult()==null) || 
             (this.delYjZtResult!=null &&
              this.delYjZtResult.equals(other.getDelYjZtResult())));
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
        if (getDelYjZtResult() != null) {
            _hashCode += getDelYjZtResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DelYjZtResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DelYjZtResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delYjZtResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DelYjZtResult"));
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
