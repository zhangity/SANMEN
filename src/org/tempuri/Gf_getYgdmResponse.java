/**
 * Gf_getYgdmResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getYgdmResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getYgdmResult;

    public Gf_getYgdmResponse() {
    }

    public Gf_getYgdmResponse(
           org.tempuri.ReturnExTable gf_getYgdmResult) {
           this.gf_getYgdmResult = gf_getYgdmResult;
    }


    /**
     * Gets the gf_getYgdmResult value for this Gf_getYgdmResponse.
     * 
     * @return gf_getYgdmResult
     */
    public org.tempuri.ReturnExTable getGf_getYgdmResult() {
        return gf_getYgdmResult;
    }


    /**
     * Sets the gf_getYgdmResult value for this Gf_getYgdmResponse.
     * 
     * @param gf_getYgdmResult
     */
    public void setGf_getYgdmResult(org.tempuri.ReturnExTable gf_getYgdmResult) {
        this.gf_getYgdmResult = gf_getYgdmResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getYgdmResponse)) return false;
        Gf_getYgdmResponse other = (Gf_getYgdmResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getYgdmResult==null && other.getGf_getYgdmResult()==null) || 
             (this.gf_getYgdmResult!=null &&
              this.gf_getYgdmResult.equals(other.getGf_getYgdmResult())));
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
        if (getGf_getYgdmResult() != null) {
            _hashCode += getGf_getYgdmResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getYgdmResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getYgdmResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getYgdmResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getYgdmResult"));
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
