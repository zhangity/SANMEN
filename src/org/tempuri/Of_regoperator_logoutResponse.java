/**
 * Of_regoperator_logoutResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Of_regoperator_logoutResponse  implements java.io.Serializable {
    private java.lang.String of_regoperator_logoutResult;

    public Of_regoperator_logoutResponse() {
    }

    public Of_regoperator_logoutResponse(
           java.lang.String of_regoperator_logoutResult) {
           this.of_regoperator_logoutResult = of_regoperator_logoutResult;
    }


    /**
     * Gets the of_regoperator_logoutResult value for this Of_regoperator_logoutResponse.
     * 
     * @return of_regoperator_logoutResult
     */
    public java.lang.String getOf_regoperator_logoutResult() {
        return of_regoperator_logoutResult;
    }


    /**
     * Sets the of_regoperator_logoutResult value for this Of_regoperator_logoutResponse.
     * 
     * @param of_regoperator_logoutResult
     */
    public void setOf_regoperator_logoutResult(java.lang.String of_regoperator_logoutResult) {
        this.of_regoperator_logoutResult = of_regoperator_logoutResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Of_regoperator_logoutResponse)) return false;
        Of_regoperator_logoutResponse other = (Of_regoperator_logoutResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.of_regoperator_logoutResult==null && other.getOf_regoperator_logoutResult()==null) || 
             (this.of_regoperator_logoutResult!=null &&
              this.of_regoperator_logoutResult.equals(other.getOf_regoperator_logoutResult())));
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
        if (getOf_regoperator_logoutResult() != null) {
            _hashCode += getOf_regoperator_logoutResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Of_regoperator_logoutResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">of_regoperator_logoutResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("of_regoperator_logoutResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "of_regoperator_logoutResult"));
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
