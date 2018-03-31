/**
 * Gf_getEpsmJygnResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getEpsmJygnResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getEpsmJygnResult;

    public Gf_getEpsmJygnResponse() {
    }

    public Gf_getEpsmJygnResponse(
           org.tempuri.ReturnExTable gf_getEpsmJygnResult) {
           this.gf_getEpsmJygnResult = gf_getEpsmJygnResult;
    }


    /**
     * Gets the gf_getEpsmJygnResult value for this Gf_getEpsmJygnResponse.
     * 
     * @return gf_getEpsmJygnResult
     */
    public org.tempuri.ReturnExTable getGf_getEpsmJygnResult() {
        return gf_getEpsmJygnResult;
    }


    /**
     * Sets the gf_getEpsmJygnResult value for this Gf_getEpsmJygnResponse.
     * 
     * @param gf_getEpsmJygnResult
     */
    public void setGf_getEpsmJygnResult(org.tempuri.ReturnExTable gf_getEpsmJygnResult) {
        this.gf_getEpsmJygnResult = gf_getEpsmJygnResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getEpsmJygnResponse)) return false;
        Gf_getEpsmJygnResponse other = (Gf_getEpsmJygnResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getEpsmJygnResult==null && other.getGf_getEpsmJygnResult()==null) || 
             (this.gf_getEpsmJygnResult!=null &&
              this.gf_getEpsmJygnResult.equals(other.getGf_getEpsmJygnResult())));
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
        if (getGf_getEpsmJygnResult() != null) {
            _hashCode += getGf_getEpsmJygnResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getEpsmJygnResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getEpsmJygnResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getEpsmJygnResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getEpsmJygnResult"));
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
