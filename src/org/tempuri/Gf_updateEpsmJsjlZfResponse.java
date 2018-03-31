/**
 * Gf_updateEpsmJsjlZfResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_updateEpsmJsjlZfResponse  implements java.io.Serializable {
    private java.lang.String gf_updateEpsmJsjlZfResult;

    public Gf_updateEpsmJsjlZfResponse() {
    }

    public Gf_updateEpsmJsjlZfResponse(
           java.lang.String gf_updateEpsmJsjlZfResult) {
           this.gf_updateEpsmJsjlZfResult = gf_updateEpsmJsjlZfResult;
    }


    /**
     * Gets the gf_updateEpsmJsjlZfResult value for this Gf_updateEpsmJsjlZfResponse.
     * 
     * @return gf_updateEpsmJsjlZfResult
     */
    public java.lang.String getGf_updateEpsmJsjlZfResult() {
        return gf_updateEpsmJsjlZfResult;
    }


    /**
     * Sets the gf_updateEpsmJsjlZfResult value for this Gf_updateEpsmJsjlZfResponse.
     * 
     * @param gf_updateEpsmJsjlZfResult
     */
    public void setGf_updateEpsmJsjlZfResult(java.lang.String gf_updateEpsmJsjlZfResult) {
        this.gf_updateEpsmJsjlZfResult = gf_updateEpsmJsjlZfResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_updateEpsmJsjlZfResponse)) return false;
        Gf_updateEpsmJsjlZfResponse other = (Gf_updateEpsmJsjlZfResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_updateEpsmJsjlZfResult==null && other.getGf_updateEpsmJsjlZfResult()==null) || 
             (this.gf_updateEpsmJsjlZfResult!=null &&
              this.gf_updateEpsmJsjlZfResult.equals(other.getGf_updateEpsmJsjlZfResult())));
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
        if (getGf_updateEpsmJsjlZfResult() != null) {
            _hashCode += getGf_updateEpsmJsjlZfResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_updateEpsmJsjlZfResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_updateEpsmJsjlZfResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_updateEpsmJsjlZfResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_updateEpsmJsjlZfResult"));
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
