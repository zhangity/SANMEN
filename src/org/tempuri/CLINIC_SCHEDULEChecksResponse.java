/**
 * CLINIC_SCHEDULEChecksResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CLINIC_SCHEDULEChecksResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable CLINIC_SCHEDULEChecksResult;

    public CLINIC_SCHEDULEChecksResponse() {
    }

    public CLINIC_SCHEDULEChecksResponse(
           org.tempuri.ReturnExTable CLINIC_SCHEDULEChecksResult) {
           this.CLINIC_SCHEDULEChecksResult = CLINIC_SCHEDULEChecksResult;
    }


    /**
     * Gets the CLINIC_SCHEDULEChecksResult value for this CLINIC_SCHEDULEChecksResponse.
     * 
     * @return CLINIC_SCHEDULEChecksResult
     */
    public org.tempuri.ReturnExTable getCLINIC_SCHEDULEChecksResult() {
        return CLINIC_SCHEDULEChecksResult;
    }


    /**
     * Sets the CLINIC_SCHEDULEChecksResult value for this CLINIC_SCHEDULEChecksResponse.
     * 
     * @param CLINIC_SCHEDULEChecksResult
     */
    public void setCLINIC_SCHEDULEChecksResult(org.tempuri.ReturnExTable CLINIC_SCHEDULEChecksResult) {
        this.CLINIC_SCHEDULEChecksResult = CLINIC_SCHEDULEChecksResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CLINIC_SCHEDULEChecksResponse)) return false;
        CLINIC_SCHEDULEChecksResponse other = (CLINIC_SCHEDULEChecksResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CLINIC_SCHEDULEChecksResult==null && other.getCLINIC_SCHEDULEChecksResult()==null) || 
             (this.CLINIC_SCHEDULEChecksResult!=null &&
              this.CLINIC_SCHEDULEChecksResult.equals(other.getCLINIC_SCHEDULEChecksResult())));
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
        if (getCLINIC_SCHEDULEChecksResult() != null) {
            _hashCode += getCLINIC_SCHEDULEChecksResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CLINIC_SCHEDULEChecksResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CLINIC_SCHEDULEChecksResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLINIC_SCHEDULEChecksResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CLINIC_SCHEDULEChecksResult"));
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
