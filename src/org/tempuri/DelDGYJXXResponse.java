/**
 * DelDGYJXXResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DelDGYJXXResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm delDGYJXXResult;

    public DelDGYJXXResponse() {
    }

    public DelDGYJXXResponse(
           org.tempuri.ReturnExComm delDGYJXXResult) {
           this.delDGYJXXResult = delDGYJXXResult;
    }


    /**
     * Gets the delDGYJXXResult value for this DelDGYJXXResponse.
     * 
     * @return delDGYJXXResult
     */
    public org.tempuri.ReturnExComm getDelDGYJXXResult() {
        return delDGYJXXResult;
    }


    /**
     * Sets the delDGYJXXResult value for this DelDGYJXXResponse.
     * 
     * @param delDGYJXXResult
     */
    public void setDelDGYJXXResult(org.tempuri.ReturnExComm delDGYJXXResult) {
        this.delDGYJXXResult = delDGYJXXResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelDGYJXXResponse)) return false;
        DelDGYJXXResponse other = (DelDGYJXXResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.delDGYJXXResult==null && other.getDelDGYJXXResult()==null) || 
             (this.delDGYJXXResult!=null &&
              this.delDGYJXXResult.equals(other.getDelDGYJXXResult())));
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
        if (getDelDGYJXXResult() != null) {
            _hashCode += getDelDGYJXXResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DelDGYJXXResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DelDGYJXXResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delDGYJXXResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DelDGYJXXResult"));
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
