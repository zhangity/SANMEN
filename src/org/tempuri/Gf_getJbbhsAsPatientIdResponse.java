/**
 * Gf_getJbbhsAsPatientIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getJbbhsAsPatientIdResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getJbbhsAsPatientIdResult;

    public Gf_getJbbhsAsPatientIdResponse() {
    }

    public Gf_getJbbhsAsPatientIdResponse(
           org.tempuri.ReturnExTable gf_getJbbhsAsPatientIdResult) {
           this.gf_getJbbhsAsPatientIdResult = gf_getJbbhsAsPatientIdResult;
    }


    /**
     * Gets the gf_getJbbhsAsPatientIdResult value for this Gf_getJbbhsAsPatientIdResponse.
     * 
     * @return gf_getJbbhsAsPatientIdResult
     */
    public org.tempuri.ReturnExTable getGf_getJbbhsAsPatientIdResult() {
        return gf_getJbbhsAsPatientIdResult;
    }


    /**
     * Sets the gf_getJbbhsAsPatientIdResult value for this Gf_getJbbhsAsPatientIdResponse.
     * 
     * @param gf_getJbbhsAsPatientIdResult
     */
    public void setGf_getJbbhsAsPatientIdResult(org.tempuri.ReturnExTable gf_getJbbhsAsPatientIdResult) {
        this.gf_getJbbhsAsPatientIdResult = gf_getJbbhsAsPatientIdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getJbbhsAsPatientIdResponse)) return false;
        Gf_getJbbhsAsPatientIdResponse other = (Gf_getJbbhsAsPatientIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getJbbhsAsPatientIdResult==null && other.getGf_getJbbhsAsPatientIdResult()==null) || 
             (this.gf_getJbbhsAsPatientIdResult!=null &&
              this.gf_getJbbhsAsPatientIdResult.equals(other.getGf_getJbbhsAsPatientIdResult())));
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
        if (getGf_getJbbhsAsPatientIdResult() != null) {
            _hashCode += getGf_getJbbhsAsPatientIdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getJbbhsAsPatientIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getJbbhsAsPatientIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getJbbhsAsPatientIdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getJbbhsAsPatientIdResult"));
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
