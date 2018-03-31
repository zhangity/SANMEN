/**
 * Gf_getEpsmJbxxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getEpsmJbxxResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getEpsmJbxxResult;

    public Gf_getEpsmJbxxResponse() {
    }

    public Gf_getEpsmJbxxResponse(
           org.tempuri.ReturnExTable gf_getEpsmJbxxResult) {
           this.gf_getEpsmJbxxResult = gf_getEpsmJbxxResult;
    }


    /**
     * Gets the gf_getEpsmJbxxResult value for this Gf_getEpsmJbxxResponse.
     * 
     * @return gf_getEpsmJbxxResult
     */
    public org.tempuri.ReturnExTable getGf_getEpsmJbxxResult() {
        return gf_getEpsmJbxxResult;
    }


    /**
     * Sets the gf_getEpsmJbxxResult value for this Gf_getEpsmJbxxResponse.
     * 
     * @param gf_getEpsmJbxxResult
     */
    public void setGf_getEpsmJbxxResult(org.tempuri.ReturnExTable gf_getEpsmJbxxResult) {
        this.gf_getEpsmJbxxResult = gf_getEpsmJbxxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getEpsmJbxxResponse)) return false;
        Gf_getEpsmJbxxResponse other = (Gf_getEpsmJbxxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getEpsmJbxxResult==null && other.getGf_getEpsmJbxxResult()==null) || 
             (this.gf_getEpsmJbxxResult!=null &&
              this.gf_getEpsmJbxxResult.equals(other.getGf_getEpsmJbxxResult())));
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
        if (getGf_getEpsmJbxxResult() != null) {
            _hashCode += getGf_getEpsmJbxxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getEpsmJbxxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getEpsmJbxxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getEpsmJbxxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getEpsmJbxxResult"));
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
