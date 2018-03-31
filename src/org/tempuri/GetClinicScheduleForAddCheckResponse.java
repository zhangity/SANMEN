/**
 * GetClinicScheduleForAddCheckResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetClinicScheduleForAddCheckResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getClinicScheduleForAddCheckResult;

    public GetClinicScheduleForAddCheckResponse() {
    }

    public GetClinicScheduleForAddCheckResponse(
           org.tempuri.ReturnExTable getClinicScheduleForAddCheckResult) {
           this.getClinicScheduleForAddCheckResult = getClinicScheduleForAddCheckResult;
    }


    /**
     * Gets the getClinicScheduleForAddCheckResult value for this GetClinicScheduleForAddCheckResponse.
     * 
     * @return getClinicScheduleForAddCheckResult
     */
    public org.tempuri.ReturnExTable getGetClinicScheduleForAddCheckResult() {
        return getClinicScheduleForAddCheckResult;
    }


    /**
     * Sets the getClinicScheduleForAddCheckResult value for this GetClinicScheduleForAddCheckResponse.
     * 
     * @param getClinicScheduleForAddCheckResult
     */
    public void setGetClinicScheduleForAddCheckResult(org.tempuri.ReturnExTable getClinicScheduleForAddCheckResult) {
        this.getClinicScheduleForAddCheckResult = getClinicScheduleForAddCheckResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetClinicScheduleForAddCheckResponse)) return false;
        GetClinicScheduleForAddCheckResponse other = (GetClinicScheduleForAddCheckResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getClinicScheduleForAddCheckResult==null && other.getGetClinicScheduleForAddCheckResult()==null) || 
             (this.getClinicScheduleForAddCheckResult!=null &&
              this.getClinicScheduleForAddCheckResult.equals(other.getGetClinicScheduleForAddCheckResult())));
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
        if (getGetClinicScheduleForAddCheckResult() != null) {
            _hashCode += getGetClinicScheduleForAddCheckResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetClinicScheduleForAddCheckResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetClinicScheduleForAddCheckResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getClinicScheduleForAddCheckResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetClinicScheduleForAddCheckResult"));
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
