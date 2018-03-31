/**
 * DelZfzdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DelZfzdResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm delZfzdResult;

    public DelZfzdResponse() {
    }

    public DelZfzdResponse(
           org.tempuri.ReturnExComm delZfzdResult) {
           this.delZfzdResult = delZfzdResult;
    }


    /**
     * Gets the delZfzdResult value for this DelZfzdResponse.
     * 
     * @return delZfzdResult
     */
    public org.tempuri.ReturnExComm getDelZfzdResult() {
        return delZfzdResult;
    }


    /**
     * Sets the delZfzdResult value for this DelZfzdResponse.
     * 
     * @param delZfzdResult
     */
    public void setDelZfzdResult(org.tempuri.ReturnExComm delZfzdResult) {
        this.delZfzdResult = delZfzdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelZfzdResponse)) return false;
        DelZfzdResponse other = (DelZfzdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.delZfzdResult==null && other.getDelZfzdResult()==null) || 
             (this.delZfzdResult!=null &&
              this.delZfzdResult.equals(other.getDelZfzdResult())));
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
        if (getDelZfzdResult() != null) {
            _hashCode += getDelZfzdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DelZfzdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DelZfzdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delZfzdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DelZfzdResult"));
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
