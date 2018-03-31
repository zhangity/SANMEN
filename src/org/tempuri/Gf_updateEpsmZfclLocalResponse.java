/**
 * Gf_updateEpsmZfclLocalResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_updateEpsmZfclLocalResponse  implements java.io.Serializable {
    private java.lang.String gf_updateEpsmZfclLocalResult;

    public Gf_updateEpsmZfclLocalResponse() {
    }

    public Gf_updateEpsmZfclLocalResponse(
           java.lang.String gf_updateEpsmZfclLocalResult) {
           this.gf_updateEpsmZfclLocalResult = gf_updateEpsmZfclLocalResult;
    }


    /**
     * Gets the gf_updateEpsmZfclLocalResult value for this Gf_updateEpsmZfclLocalResponse.
     * 
     * @return gf_updateEpsmZfclLocalResult
     */
    public java.lang.String getGf_updateEpsmZfclLocalResult() {
        return gf_updateEpsmZfclLocalResult;
    }


    /**
     * Sets the gf_updateEpsmZfclLocalResult value for this Gf_updateEpsmZfclLocalResponse.
     * 
     * @param gf_updateEpsmZfclLocalResult
     */
    public void setGf_updateEpsmZfclLocalResult(java.lang.String gf_updateEpsmZfclLocalResult) {
        this.gf_updateEpsmZfclLocalResult = gf_updateEpsmZfclLocalResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_updateEpsmZfclLocalResponse)) return false;
        Gf_updateEpsmZfclLocalResponse other = (Gf_updateEpsmZfclLocalResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_updateEpsmZfclLocalResult==null && other.getGf_updateEpsmZfclLocalResult()==null) || 
             (this.gf_updateEpsmZfclLocalResult!=null &&
              this.gf_updateEpsmZfclLocalResult.equals(other.getGf_updateEpsmZfclLocalResult())));
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
        if (getGf_updateEpsmZfclLocalResult() != null) {
            _hashCode += getGf_updateEpsmZfclLocalResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_updateEpsmZfclLocalResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_updateEpsmZfclLocalResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_updateEpsmZfclLocalResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_updateEpsmZfclLocalResult"));
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
