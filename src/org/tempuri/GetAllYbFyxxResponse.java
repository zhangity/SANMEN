/**
 * GetAllYbFyxxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllYbFyxxResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getAllYbFyxxResult;

    public GetAllYbFyxxResponse() {
    }

    public GetAllYbFyxxResponse(
           org.tempuri.ReturnExTable getAllYbFyxxResult) {
           this.getAllYbFyxxResult = getAllYbFyxxResult;
    }


    /**
     * Gets the getAllYbFyxxResult value for this GetAllYbFyxxResponse.
     * 
     * @return getAllYbFyxxResult
     */
    public org.tempuri.ReturnExTable getGetAllYbFyxxResult() {
        return getAllYbFyxxResult;
    }


    /**
     * Sets the getAllYbFyxxResult value for this GetAllYbFyxxResponse.
     * 
     * @param getAllYbFyxxResult
     */
    public void setGetAllYbFyxxResult(org.tempuri.ReturnExTable getAllYbFyxxResult) {
        this.getAllYbFyxxResult = getAllYbFyxxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllYbFyxxResponse)) return false;
        GetAllYbFyxxResponse other = (GetAllYbFyxxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllYbFyxxResult==null && other.getGetAllYbFyxxResult()==null) || 
             (this.getAllYbFyxxResult!=null &&
              this.getAllYbFyxxResult.equals(other.getGetAllYbFyxxResult())));
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
        if (getGetAllYbFyxxResult() != null) {
            _hashCode += getGetAllYbFyxxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllYbFyxxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllYbFyxxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllYbFyxxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllYbFyxxResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExTable"));
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
