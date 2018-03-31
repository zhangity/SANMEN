/**
 * Gf_getGgPjhmResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getGgPjhmResponse  implements java.io.Serializable {
    private java.lang.String gf_getGgPjhmResult;

    public Gf_getGgPjhmResponse() {
    }

    public Gf_getGgPjhmResponse(
           java.lang.String gf_getGgPjhmResult) {
           this.gf_getGgPjhmResult = gf_getGgPjhmResult;
    }


    /**
     * Gets the gf_getGgPjhmResult value for this Gf_getGgPjhmResponse.
     * 
     * @return gf_getGgPjhmResult
     */
    public java.lang.String getGf_getGgPjhmResult() {
        return gf_getGgPjhmResult;
    }


    /**
     * Sets the gf_getGgPjhmResult value for this Gf_getGgPjhmResponse.
     * 
     * @param gf_getGgPjhmResult
     */
    public void setGf_getGgPjhmResult(java.lang.String gf_getGgPjhmResult) {
        this.gf_getGgPjhmResult = gf_getGgPjhmResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getGgPjhmResponse)) return false;
        Gf_getGgPjhmResponse other = (Gf_getGgPjhmResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getGgPjhmResult==null && other.getGf_getGgPjhmResult()==null) || 
             (this.gf_getGgPjhmResult!=null &&
              this.gf_getGgPjhmResult.equals(other.getGf_getGgPjhmResult())));
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
        if (getGf_getGgPjhmResult() != null) {
            _hashCode += getGf_getGgPjhmResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getGgPjhmResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getGgPjhmResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getGgPjhmResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getGgPjhmResult"));
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
