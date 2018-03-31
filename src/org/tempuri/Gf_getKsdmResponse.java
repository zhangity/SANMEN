/**
 * Gf_getKsdmResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getKsdmResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getKsdmResult;

    public Gf_getKsdmResponse() {
    }

    public Gf_getKsdmResponse(
           org.tempuri.ReturnExTable gf_getKsdmResult) {
           this.gf_getKsdmResult = gf_getKsdmResult;
    }


    /**
     * Gets the gf_getKsdmResult value for this Gf_getKsdmResponse.
     * 
     * @return gf_getKsdmResult
     */
    public org.tempuri.ReturnExTable getGf_getKsdmResult() {
        return gf_getKsdmResult;
    }


    /**
     * Sets the gf_getKsdmResult value for this Gf_getKsdmResponse.
     * 
     * @param gf_getKsdmResult
     */
    public void setGf_getKsdmResult(org.tempuri.ReturnExTable gf_getKsdmResult) {
        this.gf_getKsdmResult = gf_getKsdmResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getKsdmResponse)) return false;
        Gf_getKsdmResponse other = (Gf_getKsdmResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getKsdmResult==null && other.getGf_getKsdmResult()==null) || 
             (this.gf_getKsdmResult!=null &&
              this.gf_getKsdmResult.equals(other.getGf_getKsdmResult())));
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
        if (getGf_getKsdmResult() != null) {
            _hashCode += getGf_getKsdmResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getKsdmResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getKsdmResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getKsdmResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getKsdmResult"));
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
