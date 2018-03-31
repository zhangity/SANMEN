/**
 * MedicalBankResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class MedicalBankResponse  implements java.io.Serializable {
    private org.tempuri.MedicalBankResponseMedicalBankResult medicalBankResult;

    public MedicalBankResponse() {
    }

    public MedicalBankResponse(
           org.tempuri.MedicalBankResponseMedicalBankResult medicalBankResult) {
           this.medicalBankResult = medicalBankResult;
    }


    /**
     * Gets the medicalBankResult value for this MedicalBankResponse.
     * 
     * @return medicalBankResult
     */
    public org.tempuri.MedicalBankResponseMedicalBankResult getMedicalBankResult() {
        return medicalBankResult;
    }


    /**
     * Sets the medicalBankResult value for this MedicalBankResponse.
     * 
     * @param medicalBankResult
     */
    public void setMedicalBankResult(org.tempuri.MedicalBankResponseMedicalBankResult medicalBankResult) {
        this.medicalBankResult = medicalBankResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedicalBankResponse)) return false;
        MedicalBankResponse other = (MedicalBankResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medicalBankResult==null && other.getMedicalBankResult()==null) || 
             (this.medicalBankResult!=null &&
              this.medicalBankResult.equals(other.getMedicalBankResult())));
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
        if (getMedicalBankResult() != null) {
            _hashCode += getMedicalBankResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MedicalBankResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">MedicalBankResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medicalBankResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MedicalBankResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>MedicalBankResponse>MedicalBankResult"));
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
