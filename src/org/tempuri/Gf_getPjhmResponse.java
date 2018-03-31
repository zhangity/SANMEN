/**
 * Gf_getPjhmResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getPjhmResponse  implements java.io.Serializable {
    private java.lang.String gf_getPjhmResult;

    public Gf_getPjhmResponse() {
    }

    public Gf_getPjhmResponse(
           java.lang.String gf_getPjhmResult) {
           this.gf_getPjhmResult = gf_getPjhmResult;
    }


    /**
     * Gets the gf_getPjhmResult value for this Gf_getPjhmResponse.
     * 
     * @return gf_getPjhmResult
     */
    public java.lang.String getGf_getPjhmResult() {
        return gf_getPjhmResult;
    }


    /**
     * Sets the gf_getPjhmResult value for this Gf_getPjhmResponse.
     * 
     * @param gf_getPjhmResult
     */
    public void setGf_getPjhmResult(java.lang.String gf_getPjhmResult) {
        this.gf_getPjhmResult = gf_getPjhmResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getPjhmResponse)) return false;
        Gf_getPjhmResponse other = (Gf_getPjhmResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getPjhmResult==null && other.getGf_getPjhmResult()==null) || 
             (this.gf_getPjhmResult!=null &&
              this.gf_getPjhmResult.equals(other.getGf_getPjhmResult())));
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
        if (getGf_getPjhmResult() != null) {
            _hashCode += getGf_getPjhmResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getPjhmResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getPjhmResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getPjhmResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getPjhmResult"));
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
