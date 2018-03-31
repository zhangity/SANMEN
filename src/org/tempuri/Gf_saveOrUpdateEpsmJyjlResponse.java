/**
 * Gf_saveOrUpdateEpsmJyjlResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_saveOrUpdateEpsmJyjlResponse  implements java.io.Serializable {
    private java.lang.String gf_saveOrUpdateEpsmJyjlResult;

    public Gf_saveOrUpdateEpsmJyjlResponse() {
    }

    public Gf_saveOrUpdateEpsmJyjlResponse(
           java.lang.String gf_saveOrUpdateEpsmJyjlResult) {
           this.gf_saveOrUpdateEpsmJyjlResult = gf_saveOrUpdateEpsmJyjlResult;
    }


    /**
     * Gets the gf_saveOrUpdateEpsmJyjlResult value for this Gf_saveOrUpdateEpsmJyjlResponse.
     * 
     * @return gf_saveOrUpdateEpsmJyjlResult
     */
    public java.lang.String getGf_saveOrUpdateEpsmJyjlResult() {
        return gf_saveOrUpdateEpsmJyjlResult;
    }


    /**
     * Sets the gf_saveOrUpdateEpsmJyjlResult value for this Gf_saveOrUpdateEpsmJyjlResponse.
     * 
     * @param gf_saveOrUpdateEpsmJyjlResult
     */
    public void setGf_saveOrUpdateEpsmJyjlResult(java.lang.String gf_saveOrUpdateEpsmJyjlResult) {
        this.gf_saveOrUpdateEpsmJyjlResult = gf_saveOrUpdateEpsmJyjlResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_saveOrUpdateEpsmJyjlResponse)) return false;
        Gf_saveOrUpdateEpsmJyjlResponse other = (Gf_saveOrUpdateEpsmJyjlResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_saveOrUpdateEpsmJyjlResult==null && other.getGf_saveOrUpdateEpsmJyjlResult()==null) || 
             (this.gf_saveOrUpdateEpsmJyjlResult!=null &&
              this.gf_saveOrUpdateEpsmJyjlResult.equals(other.getGf_saveOrUpdateEpsmJyjlResult())));
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
        if (getGf_saveOrUpdateEpsmJyjlResult() != null) {
            _hashCode += getGf_saveOrUpdateEpsmJyjlResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_saveOrUpdateEpsmJyjlResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_saveOrUpdateEpsmJyjlResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_saveOrUpdateEpsmJyjlResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_saveOrUpdateEpsmJyjlResult"));
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
