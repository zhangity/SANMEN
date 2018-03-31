/**
 * Gf_updateYktSjJsztResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_updateYktSjJsztResponse  implements java.io.Serializable {
    private java.lang.String gf_updateYktSjJsztResult;

    public Gf_updateYktSjJsztResponse() {
    }

    public Gf_updateYktSjJsztResponse(
           java.lang.String gf_updateYktSjJsztResult) {
           this.gf_updateYktSjJsztResult = gf_updateYktSjJsztResult;
    }


    /**
     * Gets the gf_updateYktSjJsztResult value for this Gf_updateYktSjJsztResponse.
     * 
     * @return gf_updateYktSjJsztResult
     */
    public java.lang.String getGf_updateYktSjJsztResult() {
        return gf_updateYktSjJsztResult;
    }


    /**
     * Sets the gf_updateYktSjJsztResult value for this Gf_updateYktSjJsztResponse.
     * 
     * @param gf_updateYktSjJsztResult
     */
    public void setGf_updateYktSjJsztResult(java.lang.String gf_updateYktSjJsztResult) {
        this.gf_updateYktSjJsztResult = gf_updateYktSjJsztResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_updateYktSjJsztResponse)) return false;
        Gf_updateYktSjJsztResponse other = (Gf_updateYktSjJsztResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_updateYktSjJsztResult==null && other.getGf_updateYktSjJsztResult()==null) || 
             (this.gf_updateYktSjJsztResult!=null &&
              this.gf_updateYktSjJsztResult.equals(other.getGf_updateYktSjJsztResult())));
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
        if (getGf_updateYktSjJsztResult() != null) {
            _hashCode += getGf_updateYktSjJsztResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_updateYktSjJsztResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_updateYktSjJsztResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_updateYktSjJsztResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_updateYktSjJsztResult"));
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
