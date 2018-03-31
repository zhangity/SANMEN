/**
 * Gf_getEpsmJsjlZxlshResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getEpsmJsjlZxlshResponse  implements java.io.Serializable {
    private java.lang.String gf_getEpsmJsjlZxlshResult;

    public Gf_getEpsmJsjlZxlshResponse() {
    }

    public Gf_getEpsmJsjlZxlshResponse(
           java.lang.String gf_getEpsmJsjlZxlshResult) {
           this.gf_getEpsmJsjlZxlshResult = gf_getEpsmJsjlZxlshResult;
    }


    /**
     * Gets the gf_getEpsmJsjlZxlshResult value for this Gf_getEpsmJsjlZxlshResponse.
     * 
     * @return gf_getEpsmJsjlZxlshResult
     */
    public java.lang.String getGf_getEpsmJsjlZxlshResult() {
        return gf_getEpsmJsjlZxlshResult;
    }


    /**
     * Sets the gf_getEpsmJsjlZxlshResult value for this Gf_getEpsmJsjlZxlshResponse.
     * 
     * @param gf_getEpsmJsjlZxlshResult
     */
    public void setGf_getEpsmJsjlZxlshResult(java.lang.String gf_getEpsmJsjlZxlshResult) {
        this.gf_getEpsmJsjlZxlshResult = gf_getEpsmJsjlZxlshResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getEpsmJsjlZxlshResponse)) return false;
        Gf_getEpsmJsjlZxlshResponse other = (Gf_getEpsmJsjlZxlshResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getEpsmJsjlZxlshResult==null && other.getGf_getEpsmJsjlZxlshResult()==null) || 
             (this.gf_getEpsmJsjlZxlshResult!=null &&
              this.gf_getEpsmJsjlZxlshResult.equals(other.getGf_getEpsmJsjlZxlshResult())));
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
        if (getGf_getEpsmJsjlZxlshResult() != null) {
            _hashCode += getGf_getEpsmJsjlZxlshResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getEpsmJsjlZxlshResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getEpsmJsjlZxlshResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getEpsmJsjlZxlshResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getEpsmJsjlZxlshResult"));
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
