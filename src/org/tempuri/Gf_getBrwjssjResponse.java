/**
 * Gf_getBrwjssjResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getBrwjssjResponse  implements java.io.Serializable {
    private org.tempuri.Gf_getBrwjssjResponseGf_getBrwjssjResult gf_getBrwjssjResult;

    public Gf_getBrwjssjResponse() {
    }

    public Gf_getBrwjssjResponse(
           org.tempuri.Gf_getBrwjssjResponseGf_getBrwjssjResult gf_getBrwjssjResult) {
           this.gf_getBrwjssjResult = gf_getBrwjssjResult;
    }


    /**
     * Gets the gf_getBrwjssjResult value for this Gf_getBrwjssjResponse.
     * 
     * @return gf_getBrwjssjResult
     */
    public org.tempuri.Gf_getBrwjssjResponseGf_getBrwjssjResult getGf_getBrwjssjResult() {
        return gf_getBrwjssjResult;
    }


    /**
     * Sets the gf_getBrwjssjResult value for this Gf_getBrwjssjResponse.
     * 
     * @param gf_getBrwjssjResult
     */
    public void setGf_getBrwjssjResult(org.tempuri.Gf_getBrwjssjResponseGf_getBrwjssjResult gf_getBrwjssjResult) {
        this.gf_getBrwjssjResult = gf_getBrwjssjResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getBrwjssjResponse)) return false;
        Gf_getBrwjssjResponse other = (Gf_getBrwjssjResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getBrwjssjResult==null && other.getGf_getBrwjssjResult()==null) || 
             (this.gf_getBrwjssjResult!=null &&
              this.gf_getBrwjssjResult.equals(other.getGf_getBrwjssjResult())));
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
        if (getGf_getBrwjssjResult() != null) {
            _hashCode += getGf_getBrwjssjResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getBrwjssjResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getBrwjssjResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getBrwjssjResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getBrwjssjResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>gf_getBrwjssjResponse>gf_getBrwjssjResult"));
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
