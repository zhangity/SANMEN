/**
 * Gf_getEpsmFymlResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getEpsmFymlResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getEpsmFymlResult;

    public Gf_getEpsmFymlResponse() {
    }

    public Gf_getEpsmFymlResponse(
           org.tempuri.ReturnExTable gf_getEpsmFymlResult) {
           this.gf_getEpsmFymlResult = gf_getEpsmFymlResult;
    }


    /**
     * Gets the gf_getEpsmFymlResult value for this Gf_getEpsmFymlResponse.
     * 
     * @return gf_getEpsmFymlResult
     */
    public org.tempuri.ReturnExTable getGf_getEpsmFymlResult() {
        return gf_getEpsmFymlResult;
    }


    /**
     * Sets the gf_getEpsmFymlResult value for this Gf_getEpsmFymlResponse.
     * 
     * @param gf_getEpsmFymlResult
     */
    public void setGf_getEpsmFymlResult(org.tempuri.ReturnExTable gf_getEpsmFymlResult) {
        this.gf_getEpsmFymlResult = gf_getEpsmFymlResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getEpsmFymlResponse)) return false;
        Gf_getEpsmFymlResponse other = (Gf_getEpsmFymlResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getEpsmFymlResult==null && other.getGf_getEpsmFymlResult()==null) || 
             (this.gf_getEpsmFymlResult!=null &&
              this.gf_getEpsmFymlResult.equals(other.getGf_getEpsmFymlResult())));
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
        if (getGf_getEpsmFymlResult() != null) {
            _hashCode += getGf_getEpsmFymlResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getEpsmFymlResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getEpsmFymlResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getEpsmFymlResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getEpsmFymlResult"));
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
