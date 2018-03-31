/**
 * Gf_updateYktSjJyjlResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_updateYktSjJyjlResponse  implements java.io.Serializable {
    private java.lang.String gf_updateYktSjJyjlResult;

    public Gf_updateYktSjJyjlResponse() {
    }

    public Gf_updateYktSjJyjlResponse(
           java.lang.String gf_updateYktSjJyjlResult) {
           this.gf_updateYktSjJyjlResult = gf_updateYktSjJyjlResult;
    }


    /**
     * Gets the gf_updateYktSjJyjlResult value for this Gf_updateYktSjJyjlResponse.
     * 
     * @return gf_updateYktSjJyjlResult
     */
    public java.lang.String getGf_updateYktSjJyjlResult() {
        return gf_updateYktSjJyjlResult;
    }


    /**
     * Sets the gf_updateYktSjJyjlResult value for this Gf_updateYktSjJyjlResponse.
     * 
     * @param gf_updateYktSjJyjlResult
     */
    public void setGf_updateYktSjJyjlResult(java.lang.String gf_updateYktSjJyjlResult) {
        this.gf_updateYktSjJyjlResult = gf_updateYktSjJyjlResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_updateYktSjJyjlResponse)) return false;
        Gf_updateYktSjJyjlResponse other = (Gf_updateYktSjJyjlResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_updateYktSjJyjlResult==null && other.getGf_updateYktSjJyjlResult()==null) || 
             (this.gf_updateYktSjJyjlResult!=null &&
              this.gf_updateYktSjJyjlResult.equals(other.getGf_updateYktSjJyjlResult())));
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
        if (getGf_updateYktSjJyjlResult() != null) {
            _hashCode += getGf_updateYktSjJyjlResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_updateYktSjJyjlResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_updateYktSjJyjlResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_updateYktSjJyjlResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_updateYktSjJyjlResult"));
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
