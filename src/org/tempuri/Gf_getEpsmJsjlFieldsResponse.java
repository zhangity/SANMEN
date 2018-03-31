/**
 * Gf_getEpsmJsjlFieldsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getEpsmJsjlFieldsResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getEpsmJsjlFieldsResult;

    public Gf_getEpsmJsjlFieldsResponse() {
    }

    public Gf_getEpsmJsjlFieldsResponse(
           org.tempuri.ReturnExTable gf_getEpsmJsjlFieldsResult) {
           this.gf_getEpsmJsjlFieldsResult = gf_getEpsmJsjlFieldsResult;
    }


    /**
     * Gets the gf_getEpsmJsjlFieldsResult value for this Gf_getEpsmJsjlFieldsResponse.
     * 
     * @return gf_getEpsmJsjlFieldsResult
     */
    public org.tempuri.ReturnExTable getGf_getEpsmJsjlFieldsResult() {
        return gf_getEpsmJsjlFieldsResult;
    }


    /**
     * Sets the gf_getEpsmJsjlFieldsResult value for this Gf_getEpsmJsjlFieldsResponse.
     * 
     * @param gf_getEpsmJsjlFieldsResult
     */
    public void setGf_getEpsmJsjlFieldsResult(org.tempuri.ReturnExTable gf_getEpsmJsjlFieldsResult) {
        this.gf_getEpsmJsjlFieldsResult = gf_getEpsmJsjlFieldsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getEpsmJsjlFieldsResponse)) return false;
        Gf_getEpsmJsjlFieldsResponse other = (Gf_getEpsmJsjlFieldsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getEpsmJsjlFieldsResult==null && other.getGf_getEpsmJsjlFieldsResult()==null) || 
             (this.gf_getEpsmJsjlFieldsResult!=null &&
              this.gf_getEpsmJsjlFieldsResult.equals(other.getGf_getEpsmJsjlFieldsResult())));
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
        if (getGf_getEpsmJsjlFieldsResult() != null) {
            _hashCode += getGf_getEpsmJsjlFieldsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getEpsmJsjlFieldsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getEpsmJsjlFieldsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getEpsmJsjlFieldsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getEpsmJsjlFieldsResult"));
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
