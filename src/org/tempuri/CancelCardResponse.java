/**
 * CancelCardResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CancelCardResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm cancelCardResult;

    public CancelCardResponse() {
    }

    public CancelCardResponse(
           org.tempuri.ReturnExComm cancelCardResult) {
           this.cancelCardResult = cancelCardResult;
    }


    /**
     * Gets the cancelCardResult value for this CancelCardResponse.
     * 
     * @return cancelCardResult
     */
    public org.tempuri.ReturnExComm getCancelCardResult() {
        return cancelCardResult;
    }


    /**
     * Sets the cancelCardResult value for this CancelCardResponse.
     * 
     * @param cancelCardResult
     */
    public void setCancelCardResult(org.tempuri.ReturnExComm cancelCardResult) {
        this.cancelCardResult = cancelCardResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelCardResponse)) return false;
        CancelCardResponse other = (CancelCardResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cancelCardResult==null && other.getCancelCardResult()==null) || 
             (this.cancelCardResult!=null &&
              this.cancelCardResult.equals(other.getCancelCardResult())));
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
        if (getCancelCardResult() != null) {
            _hashCode += getCancelCardResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelCardResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CancelCardResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelCardResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CancelCardResult"));
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
