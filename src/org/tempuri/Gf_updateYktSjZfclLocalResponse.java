/**
 * Gf_updateYktSjZfclLocalResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_updateYktSjZfclLocalResponse  implements java.io.Serializable {
    private java.lang.String gf_updateYktSjZfclLocalResult;

    public Gf_updateYktSjZfclLocalResponse() {
    }

    public Gf_updateYktSjZfclLocalResponse(
           java.lang.String gf_updateYktSjZfclLocalResult) {
           this.gf_updateYktSjZfclLocalResult = gf_updateYktSjZfclLocalResult;
    }


    /**
     * Gets the gf_updateYktSjZfclLocalResult value for this Gf_updateYktSjZfclLocalResponse.
     * 
     * @return gf_updateYktSjZfclLocalResult
     */
    public java.lang.String getGf_updateYktSjZfclLocalResult() {
        return gf_updateYktSjZfclLocalResult;
    }


    /**
     * Sets the gf_updateYktSjZfclLocalResult value for this Gf_updateYktSjZfclLocalResponse.
     * 
     * @param gf_updateYktSjZfclLocalResult
     */
    public void setGf_updateYktSjZfclLocalResult(java.lang.String gf_updateYktSjZfclLocalResult) {
        this.gf_updateYktSjZfclLocalResult = gf_updateYktSjZfclLocalResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_updateYktSjZfclLocalResponse)) return false;
        Gf_updateYktSjZfclLocalResponse other = (Gf_updateYktSjZfclLocalResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_updateYktSjZfclLocalResult==null && other.getGf_updateYktSjZfclLocalResult()==null) || 
             (this.gf_updateYktSjZfclLocalResult!=null &&
              this.gf_updateYktSjZfclLocalResult.equals(other.getGf_updateYktSjZfclLocalResult())));
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
        if (getGf_updateYktSjZfclLocalResult() != null) {
            _hashCode += getGf_updateYktSjZfclLocalResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_updateYktSjZfclLocalResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_updateYktSjZfclLocalResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_updateYktSjZfclLocalResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_updateYktSjZfclLocalResult"));
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
