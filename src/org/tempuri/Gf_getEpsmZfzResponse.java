/**
 * Gf_getEpsmZfzResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getEpsmZfzResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getEpsmZfzResult;

    public Gf_getEpsmZfzResponse() {
    }

    public Gf_getEpsmZfzResponse(
           org.tempuri.ReturnExTable gf_getEpsmZfzResult) {
           this.gf_getEpsmZfzResult = gf_getEpsmZfzResult;
    }


    /**
     * Gets the gf_getEpsmZfzResult value for this Gf_getEpsmZfzResponse.
     * 
     * @return gf_getEpsmZfzResult
     */
    public org.tempuri.ReturnExTable getGf_getEpsmZfzResult() {
        return gf_getEpsmZfzResult;
    }


    /**
     * Sets the gf_getEpsmZfzResult value for this Gf_getEpsmZfzResponse.
     * 
     * @param gf_getEpsmZfzResult
     */
    public void setGf_getEpsmZfzResult(org.tempuri.ReturnExTable gf_getEpsmZfzResult) {
        this.gf_getEpsmZfzResult = gf_getEpsmZfzResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getEpsmZfzResponse)) return false;
        Gf_getEpsmZfzResponse other = (Gf_getEpsmZfzResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getEpsmZfzResult==null && other.getGf_getEpsmZfzResult()==null) || 
             (this.gf_getEpsmZfzResult!=null &&
              this.gf_getEpsmZfzResult.equals(other.getGf_getEpsmZfzResult())));
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
        if (getGf_getEpsmZfzResult() != null) {
            _hashCode += getGf_getEpsmZfzResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getEpsmZfzResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getEpsmZfzResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getEpsmZfzResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getEpsmZfzResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExTable"));
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
