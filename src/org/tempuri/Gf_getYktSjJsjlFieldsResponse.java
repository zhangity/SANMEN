/**
 * Gf_getYktSjJsjlFieldsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getYktSjJsjlFieldsResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getYktSjJsjlFieldsResult;

    public Gf_getYktSjJsjlFieldsResponse() {
    }

    public Gf_getYktSjJsjlFieldsResponse(
           org.tempuri.ReturnExTable gf_getYktSjJsjlFieldsResult) {
           this.gf_getYktSjJsjlFieldsResult = gf_getYktSjJsjlFieldsResult;
    }


    /**
     * Gets the gf_getYktSjJsjlFieldsResult value for this Gf_getYktSjJsjlFieldsResponse.
     * 
     * @return gf_getYktSjJsjlFieldsResult
     */
    public org.tempuri.ReturnExTable getGf_getYktSjJsjlFieldsResult() {
        return gf_getYktSjJsjlFieldsResult;
    }


    /**
     * Sets the gf_getYktSjJsjlFieldsResult value for this Gf_getYktSjJsjlFieldsResponse.
     * 
     * @param gf_getYktSjJsjlFieldsResult
     */
    public void setGf_getYktSjJsjlFieldsResult(org.tempuri.ReturnExTable gf_getYktSjJsjlFieldsResult) {
        this.gf_getYktSjJsjlFieldsResult = gf_getYktSjJsjlFieldsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getYktSjJsjlFieldsResponse)) return false;
        Gf_getYktSjJsjlFieldsResponse other = (Gf_getYktSjJsjlFieldsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getYktSjJsjlFieldsResult==null && other.getGf_getYktSjJsjlFieldsResult()==null) || 
             (this.gf_getYktSjJsjlFieldsResult!=null &&
              this.gf_getYktSjJsjlFieldsResult.equals(other.getGf_getYktSjJsjlFieldsResult())));
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
        if (getGf_getYktSjJsjlFieldsResult() != null) {
            _hashCode += getGf_getYktSjJsjlFieldsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getYktSjJsjlFieldsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getYktSjJsjlFieldsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getYktSjJsjlFieldsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getYktSjJsjlFieldsResult"));
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
