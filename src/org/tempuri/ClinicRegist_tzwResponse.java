/**
 * ClinicRegist_tzwResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ClinicRegist_tzwResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm clinicRegist_tzwResult;

    public ClinicRegist_tzwResponse() {
    }

    public ClinicRegist_tzwResponse(
           org.tempuri.ReturnExComm clinicRegist_tzwResult) {
           this.clinicRegist_tzwResult = clinicRegist_tzwResult;
    }


    /**
     * Gets the clinicRegist_tzwResult value for this ClinicRegist_tzwResponse.
     * 
     * @return clinicRegist_tzwResult
     */
    public org.tempuri.ReturnExComm getClinicRegist_tzwResult() {
        return clinicRegist_tzwResult;
    }


    /**
     * Sets the clinicRegist_tzwResult value for this ClinicRegist_tzwResponse.
     * 
     * @param clinicRegist_tzwResult
     */
    public void setClinicRegist_tzwResult(org.tempuri.ReturnExComm clinicRegist_tzwResult) {
        this.clinicRegist_tzwResult = clinicRegist_tzwResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClinicRegist_tzwResponse)) return false;
        ClinicRegist_tzwResponse other = (ClinicRegist_tzwResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clinicRegist_tzwResult==null && other.getClinicRegist_tzwResult()==null) || 
             (this.clinicRegist_tzwResult!=null &&
              this.clinicRegist_tzwResult.equals(other.getClinicRegist_tzwResult())));
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
        if (getClinicRegist_tzwResult() != null) {
            _hashCode += getClinicRegist_tzwResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClinicRegist_tzwResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ClinicRegist_tzwResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clinicRegist_tzwResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ClinicRegist_tzwResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExComm"));
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
