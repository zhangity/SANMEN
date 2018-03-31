/**
 * QrJywjzResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class QrJywjzResponse  implements java.io.Serializable {
    private java.lang.String qrJywjzResult;

    public QrJywjzResponse() {
    }

    public QrJywjzResponse(
           java.lang.String qrJywjzResult) {
           this.qrJywjzResult = qrJywjzResult;
    }


    /**
     * Gets the qrJywjzResult value for this QrJywjzResponse.
     * 
     * @return qrJywjzResult
     */
    public java.lang.String getQrJywjzResult() {
        return qrJywjzResult;
    }


    /**
     * Sets the qrJywjzResult value for this QrJywjzResponse.
     * 
     * @param qrJywjzResult
     */
    public void setQrJywjzResult(java.lang.String qrJywjzResult) {
        this.qrJywjzResult = qrJywjzResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QrJywjzResponse)) return false;
        QrJywjzResponse other = (QrJywjzResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.qrJywjzResult==null && other.getQrJywjzResult()==null) || 
             (this.qrJywjzResult!=null &&
              this.qrJywjzResult.equals(other.getQrJywjzResult())));
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
        if (getQrJywjzResult() != null) {
            _hashCode += getQrJywjzResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QrJywjzResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">QrJywjzResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qrJywjzResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "QrJywjzResult"));
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
