/**
 * ClinicRegist_zwResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ClinicRegist_zwResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm clinicRegist_zwResult;

    public ClinicRegist_zwResponse() {
    }

    public ClinicRegist_zwResponse(
           org.tempuri.ReturnExComm clinicRegist_zwResult) {
           this.clinicRegist_zwResult = clinicRegist_zwResult;
    }


    /**
     * Gets the clinicRegist_zwResult value for this ClinicRegist_zwResponse.
     * 
     * @return clinicRegist_zwResult
     */
    public org.tempuri.ReturnExComm getClinicRegist_zwResult() {
        return clinicRegist_zwResult;
    }


    /**
     * Sets the clinicRegist_zwResult value for this ClinicRegist_zwResponse.
     * 
     * @param clinicRegist_zwResult
     */
    public void setClinicRegist_zwResult(org.tempuri.ReturnExComm clinicRegist_zwResult) {
        this.clinicRegist_zwResult = clinicRegist_zwResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClinicRegist_zwResponse)) return false;
        ClinicRegist_zwResponse other = (ClinicRegist_zwResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clinicRegist_zwResult==null && other.getClinicRegist_zwResult()==null) || 
             (this.clinicRegist_zwResult!=null &&
              this.clinicRegist_zwResult.equals(other.getClinicRegist_zwResult())));
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
        if (getClinicRegist_zwResult() != null) {
            _hashCode += getClinicRegist_zwResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClinicRegist_zwResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ClinicRegist_zwResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clinicRegist_zwResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ClinicRegist_zwResult"));
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
