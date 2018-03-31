/**
 * CLINIC_SCHEDULECopyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CLINIC_SCHEDULECopyResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm CLINIC_SCHEDULECopyResult;

    public CLINIC_SCHEDULECopyResponse() {
    }

    public CLINIC_SCHEDULECopyResponse(
           org.tempuri.ReturnExComm CLINIC_SCHEDULECopyResult) {
           this.CLINIC_SCHEDULECopyResult = CLINIC_SCHEDULECopyResult;
    }


    /**
     * Gets the CLINIC_SCHEDULECopyResult value for this CLINIC_SCHEDULECopyResponse.
     * 
     * @return CLINIC_SCHEDULECopyResult
     */
    public org.tempuri.ReturnExComm getCLINIC_SCHEDULECopyResult() {
        return CLINIC_SCHEDULECopyResult;
    }


    /**
     * Sets the CLINIC_SCHEDULECopyResult value for this CLINIC_SCHEDULECopyResponse.
     * 
     * @param CLINIC_SCHEDULECopyResult
     */
    public void setCLINIC_SCHEDULECopyResult(org.tempuri.ReturnExComm CLINIC_SCHEDULECopyResult) {
        this.CLINIC_SCHEDULECopyResult = CLINIC_SCHEDULECopyResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CLINIC_SCHEDULECopyResponse)) return false;
        CLINIC_SCHEDULECopyResponse other = (CLINIC_SCHEDULECopyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CLINIC_SCHEDULECopyResult==null && other.getCLINIC_SCHEDULECopyResult()==null) || 
             (this.CLINIC_SCHEDULECopyResult!=null &&
              this.CLINIC_SCHEDULECopyResult.equals(other.getCLINIC_SCHEDULECopyResult())));
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
        if (getCLINIC_SCHEDULECopyResult() != null) {
            _hashCode += getCLINIC_SCHEDULECopyResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CLINIC_SCHEDULECopyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CLINIC_SCHEDULECopyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLINIC_SCHEDULECopyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CLINIC_SCHEDULECopyResult"));
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
