/**
 * Gf_getEpsmYpxxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getEpsmYpxxResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getEpsmYpxxResult;

    public Gf_getEpsmYpxxResponse() {
    }

    public Gf_getEpsmYpxxResponse(
           org.tempuri.ReturnExTable gf_getEpsmYpxxResult) {
           this.gf_getEpsmYpxxResult = gf_getEpsmYpxxResult;
    }


    /**
     * Gets the gf_getEpsmYpxxResult value for this Gf_getEpsmYpxxResponse.
     * 
     * @return gf_getEpsmYpxxResult
     */
    public org.tempuri.ReturnExTable getGf_getEpsmYpxxResult() {
        return gf_getEpsmYpxxResult;
    }


    /**
     * Sets the gf_getEpsmYpxxResult value for this Gf_getEpsmYpxxResponse.
     * 
     * @param gf_getEpsmYpxxResult
     */
    public void setGf_getEpsmYpxxResult(org.tempuri.ReturnExTable gf_getEpsmYpxxResult) {
        this.gf_getEpsmYpxxResult = gf_getEpsmYpxxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getEpsmYpxxResponse)) return false;
        Gf_getEpsmYpxxResponse other = (Gf_getEpsmYpxxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getEpsmYpxxResult==null && other.getGf_getEpsmYpxxResult()==null) || 
             (this.gf_getEpsmYpxxResult!=null &&
              this.gf_getEpsmYpxxResult.equals(other.getGf_getEpsmYpxxResult())));
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
        if (getGf_getEpsmYpxxResult() != null) {
            _hashCode += getGf_getEpsmYpxxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getEpsmYpxxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getEpsmYpxxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getEpsmYpxxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getEpsmYpxxResult"));
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
