/**
 * GetRegist_Of_ClinicByPatientID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetRegist_Of_ClinicByPatientID  implements java.io.Serializable {
    private java.lang.String patient_ID;

    public GetRegist_Of_ClinicByPatientID() {
    }

    public GetRegist_Of_ClinicByPatientID(
           java.lang.String patient_ID) {
           this.patient_ID = patient_ID;
    }


    /**
     * Gets the patient_ID value for this GetRegist_Of_ClinicByPatientID.
     * 
     * @return patient_ID
     */
    public java.lang.String getPatient_ID() {
        return patient_ID;
    }


    /**
     * Sets the patient_ID value for this GetRegist_Of_ClinicByPatientID.
     * 
     * @param patient_ID
     */
    public void setPatient_ID(java.lang.String patient_ID) {
        this.patient_ID = patient_ID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRegist_Of_ClinicByPatientID)) return false;
        GetRegist_Of_ClinicByPatientID other = (GetRegist_Of_ClinicByPatientID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.patient_ID==null && other.getPatient_ID()==null) || 
             (this.patient_ID!=null &&
              this.patient_ID.equals(other.getPatient_ID())));
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
        if (getPatient_ID() != null) {
            _hashCode += getPatient_ID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRegist_Of_ClinicByPatientID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetRegist_Of_ClinicByPatientID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patient_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Patient_ID"));
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
