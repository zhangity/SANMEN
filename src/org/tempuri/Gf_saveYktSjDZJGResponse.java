/**
 * Gf_saveYktSjDZJGResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_saveYktSjDZJGResponse  implements java.io.Serializable {
    private java.lang.String gf_saveYktSjDZJGResult;

    public Gf_saveYktSjDZJGResponse() {
    }

    public Gf_saveYktSjDZJGResponse(
           java.lang.String gf_saveYktSjDZJGResult) {
           this.gf_saveYktSjDZJGResult = gf_saveYktSjDZJGResult;
    }


    /**
     * Gets the gf_saveYktSjDZJGResult value for this Gf_saveYktSjDZJGResponse.
     * 
     * @return gf_saveYktSjDZJGResult
     */
    public java.lang.String getGf_saveYktSjDZJGResult() {
        return gf_saveYktSjDZJGResult;
    }


    /**
     * Sets the gf_saveYktSjDZJGResult value for this Gf_saveYktSjDZJGResponse.
     * 
     * @param gf_saveYktSjDZJGResult
     */
    public void setGf_saveYktSjDZJGResult(java.lang.String gf_saveYktSjDZJGResult) {
        this.gf_saveYktSjDZJGResult = gf_saveYktSjDZJGResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_saveYktSjDZJGResponse)) return false;
        Gf_saveYktSjDZJGResponse other = (Gf_saveYktSjDZJGResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_saveYktSjDZJGResult==null && other.getGf_saveYktSjDZJGResult()==null) || 
             (this.gf_saveYktSjDZJGResult!=null &&
              this.gf_saveYktSjDZJGResult.equals(other.getGf_saveYktSjDZJGResult())));
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
        if (getGf_saveYktSjDZJGResult() != null) {
            _hashCode += getGf_saveYktSjDZJGResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_saveYktSjDZJGResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_saveYktSjDZJGResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_saveYktSjDZJGResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_saveYktSjDZJGResult"));
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
