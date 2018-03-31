/**
 * QyZfzdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class QyZfzdResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm qyZfzdResult;

    public QyZfzdResponse() {
    }

    public QyZfzdResponse(
           org.tempuri.ReturnExComm qyZfzdResult) {
           this.qyZfzdResult = qyZfzdResult;
    }


    /**
     * Gets the qyZfzdResult value for this QyZfzdResponse.
     * 
     * @return qyZfzdResult
     */
    public org.tempuri.ReturnExComm getQyZfzdResult() {
        return qyZfzdResult;
    }


    /**
     * Sets the qyZfzdResult value for this QyZfzdResponse.
     * 
     * @param qyZfzdResult
     */
    public void setQyZfzdResult(org.tempuri.ReturnExComm qyZfzdResult) {
        this.qyZfzdResult = qyZfzdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QyZfzdResponse)) return false;
        QyZfzdResponse other = (QyZfzdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.qyZfzdResult==null && other.getQyZfzdResult()==null) || 
             (this.qyZfzdResult!=null &&
              this.qyZfzdResult.equals(other.getQyZfzdResult())));
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
        if (getQyZfzdResult() != null) {
            _hashCode += getQyZfzdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QyZfzdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">QyZfzdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qyZfzdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "QyZfzdResult"));
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
