/**
 * Gf_saveYktSjQdjlResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_saveYktSjQdjlResponse  implements java.io.Serializable {
    private java.lang.String gf_saveYktSjQdjlResult;

    public Gf_saveYktSjQdjlResponse() {
    }

    public Gf_saveYktSjQdjlResponse(
           java.lang.String gf_saveYktSjQdjlResult) {
           this.gf_saveYktSjQdjlResult = gf_saveYktSjQdjlResult;
    }


    /**
     * Gets the gf_saveYktSjQdjlResult value for this Gf_saveYktSjQdjlResponse.
     * 
     * @return gf_saveYktSjQdjlResult
     */
    public java.lang.String getGf_saveYktSjQdjlResult() {
        return gf_saveYktSjQdjlResult;
    }


    /**
     * Sets the gf_saveYktSjQdjlResult value for this Gf_saveYktSjQdjlResponse.
     * 
     * @param gf_saveYktSjQdjlResult
     */
    public void setGf_saveYktSjQdjlResult(java.lang.String gf_saveYktSjQdjlResult) {
        this.gf_saveYktSjQdjlResult = gf_saveYktSjQdjlResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_saveYktSjQdjlResponse)) return false;
        Gf_saveYktSjQdjlResponse other = (Gf_saveYktSjQdjlResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_saveYktSjQdjlResult==null && other.getGf_saveYktSjQdjlResult()==null) || 
             (this.gf_saveYktSjQdjlResult!=null &&
              this.gf_saveYktSjQdjlResult.equals(other.getGf_saveYktSjQdjlResult())));
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
        if (getGf_saveYktSjQdjlResult() != null) {
            _hashCode += getGf_saveYktSjQdjlResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_saveYktSjQdjlResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_saveYktSjQdjlResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_saveYktSjQdjlResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_saveYktSjQdjlResult"));
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
