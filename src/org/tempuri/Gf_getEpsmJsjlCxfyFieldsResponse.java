/**
 * Gf_getEpsmJsjlCxfyFieldsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getEpsmJsjlCxfyFieldsResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getEpsmJsjlCxfyFieldsResult;

    public Gf_getEpsmJsjlCxfyFieldsResponse() {
    }

    public Gf_getEpsmJsjlCxfyFieldsResponse(
           org.tempuri.ReturnExTable gf_getEpsmJsjlCxfyFieldsResult) {
           this.gf_getEpsmJsjlCxfyFieldsResult = gf_getEpsmJsjlCxfyFieldsResult;
    }


    /**
     * Gets the gf_getEpsmJsjlCxfyFieldsResult value for this Gf_getEpsmJsjlCxfyFieldsResponse.
     * 
     * @return gf_getEpsmJsjlCxfyFieldsResult
     */
    public org.tempuri.ReturnExTable getGf_getEpsmJsjlCxfyFieldsResult() {
        return gf_getEpsmJsjlCxfyFieldsResult;
    }


    /**
     * Sets the gf_getEpsmJsjlCxfyFieldsResult value for this Gf_getEpsmJsjlCxfyFieldsResponse.
     * 
     * @param gf_getEpsmJsjlCxfyFieldsResult
     */
    public void setGf_getEpsmJsjlCxfyFieldsResult(org.tempuri.ReturnExTable gf_getEpsmJsjlCxfyFieldsResult) {
        this.gf_getEpsmJsjlCxfyFieldsResult = gf_getEpsmJsjlCxfyFieldsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getEpsmJsjlCxfyFieldsResponse)) return false;
        Gf_getEpsmJsjlCxfyFieldsResponse other = (Gf_getEpsmJsjlCxfyFieldsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getEpsmJsjlCxfyFieldsResult==null && other.getGf_getEpsmJsjlCxfyFieldsResult()==null) || 
             (this.gf_getEpsmJsjlCxfyFieldsResult!=null &&
              this.gf_getEpsmJsjlCxfyFieldsResult.equals(other.getGf_getEpsmJsjlCxfyFieldsResult())));
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
        if (getGf_getEpsmJsjlCxfyFieldsResult() != null) {
            _hashCode += getGf_getEpsmJsjlCxfyFieldsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getEpsmJsjlCxfyFieldsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getEpsmJsjlCxfyFieldsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getEpsmJsjlCxfyFieldsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getEpsmJsjlCxfyFieldsResult"));
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
