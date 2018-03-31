/**
 * Gf_tsbmbsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_tsbmbsResponse  implements java.io.Serializable {
    private org.tempuri.Gf_tsbmbsResponseGf_tsbmbsResult gf_tsbmbsResult;

    public Gf_tsbmbsResponse() {
    }

    public Gf_tsbmbsResponse(
           org.tempuri.Gf_tsbmbsResponseGf_tsbmbsResult gf_tsbmbsResult) {
           this.gf_tsbmbsResult = gf_tsbmbsResult;
    }


    /**
     * Gets the gf_tsbmbsResult value for this Gf_tsbmbsResponse.
     * 
     * @return gf_tsbmbsResult
     */
    public org.tempuri.Gf_tsbmbsResponseGf_tsbmbsResult getGf_tsbmbsResult() {
        return gf_tsbmbsResult;
    }


    /**
     * Sets the gf_tsbmbsResult value for this Gf_tsbmbsResponse.
     * 
     * @param gf_tsbmbsResult
     */
    public void setGf_tsbmbsResult(org.tempuri.Gf_tsbmbsResponseGf_tsbmbsResult gf_tsbmbsResult) {
        this.gf_tsbmbsResult = gf_tsbmbsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_tsbmbsResponse)) return false;
        Gf_tsbmbsResponse other = (Gf_tsbmbsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_tsbmbsResult==null && other.getGf_tsbmbsResult()==null) || 
             (this.gf_tsbmbsResult!=null &&
              this.gf_tsbmbsResult.equals(other.getGf_tsbmbsResult())));
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
        if (getGf_tsbmbsResult() != null) {
            _hashCode += getGf_tsbmbsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_tsbmbsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_tsbmbsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_tsbmbsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_tsbmbsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>gf_tsbmbsResponse>gf_tsbmbsResult"));
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
