/**
 * GetPatientMasterbyModelResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPatientMasterbyModelResponse  implements java.io.Serializable {
    private org.tempuri.Patient_Master_Index getPatientMasterbyModelResult;

    public GetPatientMasterbyModelResponse() {
    }

    public GetPatientMasterbyModelResponse(
           org.tempuri.Patient_Master_Index getPatientMasterbyModelResult) {
           this.getPatientMasterbyModelResult = getPatientMasterbyModelResult;
    }


    /**
     * Gets the getPatientMasterbyModelResult value for this GetPatientMasterbyModelResponse.
     * 
     * @return getPatientMasterbyModelResult
     */
    public org.tempuri.Patient_Master_Index getGetPatientMasterbyModelResult() {
        return getPatientMasterbyModelResult;
    }


    /**
     * Sets the getPatientMasterbyModelResult value for this GetPatientMasterbyModelResponse.
     * 
     * @param getPatientMasterbyModelResult
     */
    public void setGetPatientMasterbyModelResult(org.tempuri.Patient_Master_Index getPatientMasterbyModelResult) {
        this.getPatientMasterbyModelResult = getPatientMasterbyModelResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPatientMasterbyModelResponse)) return false;
        GetPatientMasterbyModelResponse other = (GetPatientMasterbyModelResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPatientMasterbyModelResult==null && other.getGetPatientMasterbyModelResult()==null) || 
             (this.getPatientMasterbyModelResult!=null &&
              this.getPatientMasterbyModelResult.equals(other.getGetPatientMasterbyModelResult())));
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
        if (getGetPatientMasterbyModelResult() != null) {
            _hashCode += getGetPatientMasterbyModelResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPatientMasterbyModelResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPatientMasterbyModelResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPatientMasterbyModelResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPatientMasterbyModelResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Patient_Master_Index"));
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
