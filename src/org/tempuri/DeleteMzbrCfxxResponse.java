/**
 * DeleteMzbrCfxxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DeleteMzbrCfxxResponse  implements java.io.Serializable {
    private java.lang.String deleteMzbrCfxxResult;

    public DeleteMzbrCfxxResponse() {
    }

    public DeleteMzbrCfxxResponse(
           java.lang.String deleteMzbrCfxxResult) {
           this.deleteMzbrCfxxResult = deleteMzbrCfxxResult;
    }


    /**
     * Gets the deleteMzbrCfxxResult value for this DeleteMzbrCfxxResponse.
     * 
     * @return deleteMzbrCfxxResult
     */
    public java.lang.String getDeleteMzbrCfxxResult() {
        return deleteMzbrCfxxResult;
    }


    /**
     * Sets the deleteMzbrCfxxResult value for this DeleteMzbrCfxxResponse.
     * 
     * @param deleteMzbrCfxxResult
     */
    public void setDeleteMzbrCfxxResult(java.lang.String deleteMzbrCfxxResult) {
        this.deleteMzbrCfxxResult = deleteMzbrCfxxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteMzbrCfxxResponse)) return false;
        DeleteMzbrCfxxResponse other = (DeleteMzbrCfxxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteMzbrCfxxResult==null && other.getDeleteMzbrCfxxResult()==null) || 
             (this.deleteMzbrCfxxResult!=null &&
              this.deleteMzbrCfxxResult.equals(other.getDeleteMzbrCfxxResult())));
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
        if (getDeleteMzbrCfxxResult() != null) {
            _hashCode += getDeleteMzbrCfxxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteMzbrCfxxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteMzbrCfxxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteMzbrCfxxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeleteMzbrCfxxResult"));
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
