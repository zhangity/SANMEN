/**
 * Gf_getEpsmJszResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getEpsmJszResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getEpsmJszResult;

    public Gf_getEpsmJszResponse() {
    }

    public Gf_getEpsmJszResponse(
           org.tempuri.ReturnExTable gf_getEpsmJszResult) {
           this.gf_getEpsmJszResult = gf_getEpsmJszResult;
    }


    /**
     * Gets the gf_getEpsmJszResult value for this Gf_getEpsmJszResponse.
     * 
     * @return gf_getEpsmJszResult
     */
    public org.tempuri.ReturnExTable getGf_getEpsmJszResult() {
        return gf_getEpsmJszResult;
    }


    /**
     * Sets the gf_getEpsmJszResult value for this Gf_getEpsmJszResponse.
     * 
     * @param gf_getEpsmJszResult
     */
    public void setGf_getEpsmJszResult(org.tempuri.ReturnExTable gf_getEpsmJszResult) {
        this.gf_getEpsmJszResult = gf_getEpsmJszResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getEpsmJszResponse)) return false;
        Gf_getEpsmJszResponse other = (Gf_getEpsmJszResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getEpsmJszResult==null && other.getGf_getEpsmJszResult()==null) || 
             (this.gf_getEpsmJszResult!=null &&
              this.gf_getEpsmJszResult.equals(other.getGf_getEpsmJszResult())));
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
        if (getGf_getEpsmJszResult() != null) {
            _hashCode += getGf_getEpsmJszResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getEpsmJszResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getEpsmJszResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getEpsmJszResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getEpsmJszResult"));
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
