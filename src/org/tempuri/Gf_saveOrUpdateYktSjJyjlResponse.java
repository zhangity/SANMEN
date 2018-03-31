/**
 * Gf_saveOrUpdateYktSjJyjlResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_saveOrUpdateYktSjJyjlResponse  implements java.io.Serializable {
    private java.lang.String gf_saveOrUpdateYktSjJyjlResult;

    public Gf_saveOrUpdateYktSjJyjlResponse() {
    }

    public Gf_saveOrUpdateYktSjJyjlResponse(
           java.lang.String gf_saveOrUpdateYktSjJyjlResult) {
           this.gf_saveOrUpdateYktSjJyjlResult = gf_saveOrUpdateYktSjJyjlResult;
    }


    /**
     * Gets the gf_saveOrUpdateYktSjJyjlResult value for this Gf_saveOrUpdateYktSjJyjlResponse.
     * 
     * @return gf_saveOrUpdateYktSjJyjlResult
     */
    public java.lang.String getGf_saveOrUpdateYktSjJyjlResult() {
        return gf_saveOrUpdateYktSjJyjlResult;
    }


    /**
     * Sets the gf_saveOrUpdateYktSjJyjlResult value for this Gf_saveOrUpdateYktSjJyjlResponse.
     * 
     * @param gf_saveOrUpdateYktSjJyjlResult
     */
    public void setGf_saveOrUpdateYktSjJyjlResult(java.lang.String gf_saveOrUpdateYktSjJyjlResult) {
        this.gf_saveOrUpdateYktSjJyjlResult = gf_saveOrUpdateYktSjJyjlResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_saveOrUpdateYktSjJyjlResponse)) return false;
        Gf_saveOrUpdateYktSjJyjlResponse other = (Gf_saveOrUpdateYktSjJyjlResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_saveOrUpdateYktSjJyjlResult==null && other.getGf_saveOrUpdateYktSjJyjlResult()==null) || 
             (this.gf_saveOrUpdateYktSjJyjlResult!=null &&
              this.gf_saveOrUpdateYktSjJyjlResult.equals(other.getGf_saveOrUpdateYktSjJyjlResult())));
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
        if (getGf_saveOrUpdateYktSjJyjlResult() != null) {
            _hashCode += getGf_saveOrUpdateYktSjJyjlResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_saveOrUpdateYktSjJyjlResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_saveOrUpdateYktSjJyjlResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_saveOrUpdateYktSjJyjlResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_saveOrUpdateYktSjJyjlResult"));
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
