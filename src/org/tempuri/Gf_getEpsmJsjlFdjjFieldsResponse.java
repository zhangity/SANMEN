/**
 * Gf_getEpsmJsjlFdjjFieldsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getEpsmJsjlFdjjFieldsResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getEpsmJsjlFdjjFieldsResult;

    public Gf_getEpsmJsjlFdjjFieldsResponse() {
    }

    public Gf_getEpsmJsjlFdjjFieldsResponse(
           org.tempuri.ReturnExTable gf_getEpsmJsjlFdjjFieldsResult) {
           this.gf_getEpsmJsjlFdjjFieldsResult = gf_getEpsmJsjlFdjjFieldsResult;
    }


    /**
     * Gets the gf_getEpsmJsjlFdjjFieldsResult value for this Gf_getEpsmJsjlFdjjFieldsResponse.
     * 
     * @return gf_getEpsmJsjlFdjjFieldsResult
     */
    public org.tempuri.ReturnExTable getGf_getEpsmJsjlFdjjFieldsResult() {
        return gf_getEpsmJsjlFdjjFieldsResult;
    }


    /**
     * Sets the gf_getEpsmJsjlFdjjFieldsResult value for this Gf_getEpsmJsjlFdjjFieldsResponse.
     * 
     * @param gf_getEpsmJsjlFdjjFieldsResult
     */
    public void setGf_getEpsmJsjlFdjjFieldsResult(org.tempuri.ReturnExTable gf_getEpsmJsjlFdjjFieldsResult) {
        this.gf_getEpsmJsjlFdjjFieldsResult = gf_getEpsmJsjlFdjjFieldsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getEpsmJsjlFdjjFieldsResponse)) return false;
        Gf_getEpsmJsjlFdjjFieldsResponse other = (Gf_getEpsmJsjlFdjjFieldsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getEpsmJsjlFdjjFieldsResult==null && other.getGf_getEpsmJsjlFdjjFieldsResult()==null) || 
             (this.gf_getEpsmJsjlFdjjFieldsResult!=null &&
              this.gf_getEpsmJsjlFdjjFieldsResult.equals(other.getGf_getEpsmJsjlFdjjFieldsResult())));
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
        if (getGf_getEpsmJsjlFdjjFieldsResult() != null) {
            _hashCode += getGf_getEpsmJsjlFdjjFieldsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getEpsmJsjlFdjjFieldsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getEpsmJsjlFdjjFieldsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getEpsmJsjlFdjjFieldsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getEpsmJsjlFdjjFieldsResult"));
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
