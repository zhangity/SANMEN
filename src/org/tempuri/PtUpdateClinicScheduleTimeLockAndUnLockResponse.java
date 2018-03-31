/**
 * PtUpdateClinicScheduleTimeLockAndUnLockResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class PtUpdateClinicScheduleTimeLockAndUnLockResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm ptUpdateClinicScheduleTimeLockAndUnLockResult;

    public PtUpdateClinicScheduleTimeLockAndUnLockResponse() {
    }

    public PtUpdateClinicScheduleTimeLockAndUnLockResponse(
           org.tempuri.ReturnExComm ptUpdateClinicScheduleTimeLockAndUnLockResult) {
           this.ptUpdateClinicScheduleTimeLockAndUnLockResult = ptUpdateClinicScheduleTimeLockAndUnLockResult;
    }


    /**
     * Gets the ptUpdateClinicScheduleTimeLockAndUnLockResult value for this PtUpdateClinicScheduleTimeLockAndUnLockResponse.
     * 
     * @return ptUpdateClinicScheduleTimeLockAndUnLockResult
     */
    public org.tempuri.ReturnExComm getPtUpdateClinicScheduleTimeLockAndUnLockResult() {
        return ptUpdateClinicScheduleTimeLockAndUnLockResult;
    }


    /**
     * Sets the ptUpdateClinicScheduleTimeLockAndUnLockResult value for this PtUpdateClinicScheduleTimeLockAndUnLockResponse.
     * 
     * @param ptUpdateClinicScheduleTimeLockAndUnLockResult
     */
    public void setPtUpdateClinicScheduleTimeLockAndUnLockResult(org.tempuri.ReturnExComm ptUpdateClinicScheduleTimeLockAndUnLockResult) {
        this.ptUpdateClinicScheduleTimeLockAndUnLockResult = ptUpdateClinicScheduleTimeLockAndUnLockResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PtUpdateClinicScheduleTimeLockAndUnLockResponse)) return false;
        PtUpdateClinicScheduleTimeLockAndUnLockResponse other = (PtUpdateClinicScheduleTimeLockAndUnLockResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ptUpdateClinicScheduleTimeLockAndUnLockResult==null && other.getPtUpdateClinicScheduleTimeLockAndUnLockResult()==null) || 
             (this.ptUpdateClinicScheduleTimeLockAndUnLockResult!=null &&
              this.ptUpdateClinicScheduleTimeLockAndUnLockResult.equals(other.getPtUpdateClinicScheduleTimeLockAndUnLockResult())));
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
        if (getPtUpdateClinicScheduleTimeLockAndUnLockResult() != null) {
            _hashCode += getPtUpdateClinicScheduleTimeLockAndUnLockResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PtUpdateClinicScheduleTimeLockAndUnLockResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">PtUpdateClinicScheduleTimeLockAndUnLockResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptUpdateClinicScheduleTimeLockAndUnLockResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PtUpdateClinicScheduleTimeLockAndUnLockResult"));
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
