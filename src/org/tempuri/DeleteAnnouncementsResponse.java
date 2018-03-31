/**
 * DeleteAnnouncementsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DeleteAnnouncementsResponse  implements java.io.Serializable {
    private int deleteAnnouncementsResult;

    public DeleteAnnouncementsResponse() {
    }

    public DeleteAnnouncementsResponse(
           int deleteAnnouncementsResult) {
           this.deleteAnnouncementsResult = deleteAnnouncementsResult;
    }


    /**
     * Gets the deleteAnnouncementsResult value for this DeleteAnnouncementsResponse.
     * 
     * @return deleteAnnouncementsResult
     */
    public int getDeleteAnnouncementsResult() {
        return deleteAnnouncementsResult;
    }


    /**
     * Sets the deleteAnnouncementsResult value for this DeleteAnnouncementsResponse.
     * 
     * @param deleteAnnouncementsResult
     */
    public void setDeleteAnnouncementsResult(int deleteAnnouncementsResult) {
        this.deleteAnnouncementsResult = deleteAnnouncementsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteAnnouncementsResponse)) return false;
        DeleteAnnouncementsResponse other = (DeleteAnnouncementsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.deleteAnnouncementsResult == other.getDeleteAnnouncementsResult();
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
        _hashCode += getDeleteAnnouncementsResult();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteAnnouncementsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteAnnouncementsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteAnnouncementsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeleteAnnouncementsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
