/**
 * Gf_getYKTJsjlZxlshResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getYKTJsjlZxlshResponse  implements java.io.Serializable {
    private java.lang.String gf_getYKTJsjlZxlshResult;

    public Gf_getYKTJsjlZxlshResponse() {
    }

    public Gf_getYKTJsjlZxlshResponse(
           java.lang.String gf_getYKTJsjlZxlshResult) {
           this.gf_getYKTJsjlZxlshResult = gf_getYKTJsjlZxlshResult;
    }


    /**
     * Gets the gf_getYKTJsjlZxlshResult value for this Gf_getYKTJsjlZxlshResponse.
     * 
     * @return gf_getYKTJsjlZxlshResult
     */
    public java.lang.String getGf_getYKTJsjlZxlshResult() {
        return gf_getYKTJsjlZxlshResult;
    }


    /**
     * Sets the gf_getYKTJsjlZxlshResult value for this Gf_getYKTJsjlZxlshResponse.
     * 
     * @param gf_getYKTJsjlZxlshResult
     */
    public void setGf_getYKTJsjlZxlshResult(java.lang.String gf_getYKTJsjlZxlshResult) {
        this.gf_getYKTJsjlZxlshResult = gf_getYKTJsjlZxlshResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getYKTJsjlZxlshResponse)) return false;
        Gf_getYKTJsjlZxlshResponse other = (Gf_getYKTJsjlZxlshResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getYKTJsjlZxlshResult==null && other.getGf_getYKTJsjlZxlshResult()==null) || 
             (this.gf_getYKTJsjlZxlshResult!=null &&
              this.gf_getYKTJsjlZxlshResult.equals(other.getGf_getYKTJsjlZxlshResult())));
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
        if (getGf_getYKTJsjlZxlshResult() != null) {
            _hashCode += getGf_getYKTJsjlZxlshResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getYKTJsjlZxlshResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getYKTJsjlZxlshResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getYKTJsjlZxlshResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getYKTJsjlZxlshResult"));
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
