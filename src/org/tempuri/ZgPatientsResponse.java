/**
 * ZgPatientsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZgPatientsResponse  implements java.io.Serializable {
    private org.tempuri.ZgPatientsResponseZgPatientsResult zgPatientsResult;

    public ZgPatientsResponse() {
    }

    public ZgPatientsResponse(
           org.tempuri.ZgPatientsResponseZgPatientsResult zgPatientsResult) {
           this.zgPatientsResult = zgPatientsResult;
    }


    /**
     * Gets the zgPatientsResult value for this ZgPatientsResponse.
     * 
     * @return zgPatientsResult
     */
    public org.tempuri.ZgPatientsResponseZgPatientsResult getZgPatientsResult() {
        return zgPatientsResult;
    }


    /**
     * Sets the zgPatientsResult value for this ZgPatientsResponse.
     * 
     * @param zgPatientsResult
     */
    public void setZgPatientsResult(org.tempuri.ZgPatientsResponseZgPatientsResult zgPatientsResult) {
        this.zgPatientsResult = zgPatientsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZgPatientsResponse)) return false;
        ZgPatientsResponse other = (ZgPatientsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.zgPatientsResult==null && other.getZgPatientsResult()==null) || 
             (this.zgPatientsResult!=null &&
              this.zgPatientsResult.equals(other.getZgPatientsResult())));
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
        if (getZgPatientsResult() != null) {
            _hashCode += getZgPatientsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZgPatientsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZgPatientsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zgPatientsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZgPatientsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZgPatientsResponse>ZgPatientsResult"));
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
