/**
 * DelTzxxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DelTzxxResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm delTzxxResult;

    public DelTzxxResponse() {
    }

    public DelTzxxResponse(
           org.tempuri.ReturnExComm delTzxxResult) {
           this.delTzxxResult = delTzxxResult;
    }


    /**
     * Gets the delTzxxResult value for this DelTzxxResponse.
     * 
     * @return delTzxxResult
     */
    public org.tempuri.ReturnExComm getDelTzxxResult() {
        return delTzxxResult;
    }


    /**
     * Sets the delTzxxResult value for this DelTzxxResponse.
     * 
     * @param delTzxxResult
     */
    public void setDelTzxxResult(org.tempuri.ReturnExComm delTzxxResult) {
        this.delTzxxResult = delTzxxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelTzxxResponse)) return false;
        DelTzxxResponse other = (DelTzxxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.delTzxxResult==null && other.getDelTzxxResult()==null) || 
             (this.delTzxxResult!=null &&
              this.delTzxxResult.equals(other.getDelTzxxResult())));
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
        if (getDelTzxxResult() != null) {
            _hashCode += getDelTzxxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DelTzxxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DelTzxxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delTzxxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DelTzxxResult"));
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
