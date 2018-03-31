/**
 * Gf_getEpsmBrwjssjResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getEpsmBrwjssjResponse  implements java.io.Serializable {
    private org.tempuri.Gf_getEpsmBrwjssjResponseGf_getEpsmBrwjssjResult gf_getEpsmBrwjssjResult;

    public Gf_getEpsmBrwjssjResponse() {
    }

    public Gf_getEpsmBrwjssjResponse(
           org.tempuri.Gf_getEpsmBrwjssjResponseGf_getEpsmBrwjssjResult gf_getEpsmBrwjssjResult) {
           this.gf_getEpsmBrwjssjResult = gf_getEpsmBrwjssjResult;
    }


    /**
     * Gets the gf_getEpsmBrwjssjResult value for this Gf_getEpsmBrwjssjResponse.
     * 
     * @return gf_getEpsmBrwjssjResult
     */
    public org.tempuri.Gf_getEpsmBrwjssjResponseGf_getEpsmBrwjssjResult getGf_getEpsmBrwjssjResult() {
        return gf_getEpsmBrwjssjResult;
    }


    /**
     * Sets the gf_getEpsmBrwjssjResult value for this Gf_getEpsmBrwjssjResponse.
     * 
     * @param gf_getEpsmBrwjssjResult
     */
    public void setGf_getEpsmBrwjssjResult(org.tempuri.Gf_getEpsmBrwjssjResponseGf_getEpsmBrwjssjResult gf_getEpsmBrwjssjResult) {
        this.gf_getEpsmBrwjssjResult = gf_getEpsmBrwjssjResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getEpsmBrwjssjResponse)) return false;
        Gf_getEpsmBrwjssjResponse other = (Gf_getEpsmBrwjssjResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getEpsmBrwjssjResult==null && other.getGf_getEpsmBrwjssjResult()==null) || 
             (this.gf_getEpsmBrwjssjResult!=null &&
              this.gf_getEpsmBrwjssjResult.equals(other.getGf_getEpsmBrwjssjResult())));
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
        if (getGf_getEpsmBrwjssjResult() != null) {
            _hashCode += getGf_getEpsmBrwjssjResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getEpsmBrwjssjResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getEpsmBrwjssjResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getEpsmBrwjssjResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getEpsmBrwjssjResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>gf_getEpsmBrwjssjResponse>gf_getEpsmBrwjssjResult"));
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
