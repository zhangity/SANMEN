/**
 * Gf_getBrwjssjAllResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getBrwjssjAllResponse  implements java.io.Serializable {
    private org.tempuri.Gf_getBrwjssjAllResponseGf_getBrwjssjAllResult gf_getBrwjssjAllResult;

    public Gf_getBrwjssjAllResponse() {
    }

    public Gf_getBrwjssjAllResponse(
           org.tempuri.Gf_getBrwjssjAllResponseGf_getBrwjssjAllResult gf_getBrwjssjAllResult) {
           this.gf_getBrwjssjAllResult = gf_getBrwjssjAllResult;
    }


    /**
     * Gets the gf_getBrwjssjAllResult value for this Gf_getBrwjssjAllResponse.
     * 
     * @return gf_getBrwjssjAllResult
     */
    public org.tempuri.Gf_getBrwjssjAllResponseGf_getBrwjssjAllResult getGf_getBrwjssjAllResult() {
        return gf_getBrwjssjAllResult;
    }


    /**
     * Sets the gf_getBrwjssjAllResult value for this Gf_getBrwjssjAllResponse.
     * 
     * @param gf_getBrwjssjAllResult
     */
    public void setGf_getBrwjssjAllResult(org.tempuri.Gf_getBrwjssjAllResponseGf_getBrwjssjAllResult gf_getBrwjssjAllResult) {
        this.gf_getBrwjssjAllResult = gf_getBrwjssjAllResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getBrwjssjAllResponse)) return false;
        Gf_getBrwjssjAllResponse other = (Gf_getBrwjssjAllResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getBrwjssjAllResult==null && other.getGf_getBrwjssjAllResult()==null) || 
             (this.gf_getBrwjssjAllResult!=null &&
              this.gf_getBrwjssjAllResult.equals(other.getGf_getBrwjssjAllResult())));
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
        if (getGf_getBrwjssjAllResult() != null) {
            _hashCode += getGf_getBrwjssjAllResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getBrwjssjAllResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getBrwjssjAllResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getBrwjssjAllResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getBrwjssjAllResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>gf_getBrwjssjAllResponse>gf_getBrwjssjAllResult"));
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
