/**
 * Gf_getEpsmFyxxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getEpsmFyxxResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getEpsmFyxxResult;

    public Gf_getEpsmFyxxResponse() {
    }

    public Gf_getEpsmFyxxResponse(
           org.tempuri.ReturnExTable gf_getEpsmFyxxResult) {
           this.gf_getEpsmFyxxResult = gf_getEpsmFyxxResult;
    }


    /**
     * Gets the gf_getEpsmFyxxResult value for this Gf_getEpsmFyxxResponse.
     * 
     * @return gf_getEpsmFyxxResult
     */
    public org.tempuri.ReturnExTable getGf_getEpsmFyxxResult() {
        return gf_getEpsmFyxxResult;
    }


    /**
     * Sets the gf_getEpsmFyxxResult value for this Gf_getEpsmFyxxResponse.
     * 
     * @param gf_getEpsmFyxxResult
     */
    public void setGf_getEpsmFyxxResult(org.tempuri.ReturnExTable gf_getEpsmFyxxResult) {
        this.gf_getEpsmFyxxResult = gf_getEpsmFyxxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getEpsmFyxxResponse)) return false;
        Gf_getEpsmFyxxResponse other = (Gf_getEpsmFyxxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getEpsmFyxxResult==null && other.getGf_getEpsmFyxxResult()==null) || 
             (this.gf_getEpsmFyxxResult!=null &&
              this.gf_getEpsmFyxxResult.equals(other.getGf_getEpsmFyxxResult())));
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
        if (getGf_getEpsmFyxxResult() != null) {
            _hashCode += getGf_getEpsmFyxxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getEpsmFyxxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getEpsmFyxxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getEpsmFyxxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getEpsmFyxxResult"));
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
