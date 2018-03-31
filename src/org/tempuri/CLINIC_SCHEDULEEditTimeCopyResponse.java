/**
 * CLINIC_SCHEDULEEditTimeCopyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CLINIC_SCHEDULEEditTimeCopyResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm CLINIC_SCHEDULEEditTimeCopyResult;

    public CLINIC_SCHEDULEEditTimeCopyResponse() {
    }

    public CLINIC_SCHEDULEEditTimeCopyResponse(
           org.tempuri.ReturnExComm CLINIC_SCHEDULEEditTimeCopyResult) {
           this.CLINIC_SCHEDULEEditTimeCopyResult = CLINIC_SCHEDULEEditTimeCopyResult;
    }


    /**
     * Gets the CLINIC_SCHEDULEEditTimeCopyResult value for this CLINIC_SCHEDULEEditTimeCopyResponse.
     * 
     * @return CLINIC_SCHEDULEEditTimeCopyResult
     */
    public org.tempuri.ReturnExComm getCLINIC_SCHEDULEEditTimeCopyResult() {
        return CLINIC_SCHEDULEEditTimeCopyResult;
    }


    /**
     * Sets the CLINIC_SCHEDULEEditTimeCopyResult value for this CLINIC_SCHEDULEEditTimeCopyResponse.
     * 
     * @param CLINIC_SCHEDULEEditTimeCopyResult
     */
    public void setCLINIC_SCHEDULEEditTimeCopyResult(org.tempuri.ReturnExComm CLINIC_SCHEDULEEditTimeCopyResult) {
        this.CLINIC_SCHEDULEEditTimeCopyResult = CLINIC_SCHEDULEEditTimeCopyResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CLINIC_SCHEDULEEditTimeCopyResponse)) return false;
        CLINIC_SCHEDULEEditTimeCopyResponse other = (CLINIC_SCHEDULEEditTimeCopyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CLINIC_SCHEDULEEditTimeCopyResult==null && other.getCLINIC_SCHEDULEEditTimeCopyResult()==null) || 
             (this.CLINIC_SCHEDULEEditTimeCopyResult!=null &&
              this.CLINIC_SCHEDULEEditTimeCopyResult.equals(other.getCLINIC_SCHEDULEEditTimeCopyResult())));
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
        if (getCLINIC_SCHEDULEEditTimeCopyResult() != null) {
            _hashCode += getCLINIC_SCHEDULEEditTimeCopyResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CLINIC_SCHEDULEEditTimeCopyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CLINIC_SCHEDULEEditTimeCopyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLINIC_SCHEDULEEditTimeCopyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CLINIC_SCHEDULEEditTimeCopyResult"));
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
