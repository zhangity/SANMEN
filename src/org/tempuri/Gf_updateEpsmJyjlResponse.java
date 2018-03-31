/**
 * Gf_updateEpsmJyjlResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_updateEpsmJyjlResponse  implements java.io.Serializable {
    private java.lang.String gf_updateEpsmJyjlResult;

    public Gf_updateEpsmJyjlResponse() {
    }

    public Gf_updateEpsmJyjlResponse(
           java.lang.String gf_updateEpsmJyjlResult) {
           this.gf_updateEpsmJyjlResult = gf_updateEpsmJyjlResult;
    }


    /**
     * Gets the gf_updateEpsmJyjlResult value for this Gf_updateEpsmJyjlResponse.
     * 
     * @return gf_updateEpsmJyjlResult
     */
    public java.lang.String getGf_updateEpsmJyjlResult() {
        return gf_updateEpsmJyjlResult;
    }


    /**
     * Sets the gf_updateEpsmJyjlResult value for this Gf_updateEpsmJyjlResponse.
     * 
     * @param gf_updateEpsmJyjlResult
     */
    public void setGf_updateEpsmJyjlResult(java.lang.String gf_updateEpsmJyjlResult) {
        this.gf_updateEpsmJyjlResult = gf_updateEpsmJyjlResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_updateEpsmJyjlResponse)) return false;
        Gf_updateEpsmJyjlResponse other = (Gf_updateEpsmJyjlResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_updateEpsmJyjlResult==null && other.getGf_updateEpsmJyjlResult()==null) || 
             (this.gf_updateEpsmJyjlResult!=null &&
              this.gf_updateEpsmJyjlResult.equals(other.getGf_updateEpsmJyjlResult())));
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
        if (getGf_updateEpsmJyjlResult() != null) {
            _hashCode += getGf_updateEpsmJyjlResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_updateEpsmJyjlResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_updateEpsmJyjlResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_updateEpsmJyjlResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_updateEpsmJyjlResult"));
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
