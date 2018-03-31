/**
 * GetScheduleDoctorsByScheduleIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetScheduleDoctorsByScheduleIdResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getScheduleDoctorsByScheduleIdResult;

    public GetScheduleDoctorsByScheduleIdResponse() {
    }

    public GetScheduleDoctorsByScheduleIdResponse(
           org.tempuri.ReturnExTable getScheduleDoctorsByScheduleIdResult) {
           this.getScheduleDoctorsByScheduleIdResult = getScheduleDoctorsByScheduleIdResult;
    }


    /**
     * Gets the getScheduleDoctorsByScheduleIdResult value for this GetScheduleDoctorsByScheduleIdResponse.
     * 
     * @return getScheduleDoctorsByScheduleIdResult
     */
    public org.tempuri.ReturnExTable getGetScheduleDoctorsByScheduleIdResult() {
        return getScheduleDoctorsByScheduleIdResult;
    }


    /**
     * Sets the getScheduleDoctorsByScheduleIdResult value for this GetScheduleDoctorsByScheduleIdResponse.
     * 
     * @param getScheduleDoctorsByScheduleIdResult
     */
    public void setGetScheduleDoctorsByScheduleIdResult(org.tempuri.ReturnExTable getScheduleDoctorsByScheduleIdResult) {
        this.getScheduleDoctorsByScheduleIdResult = getScheduleDoctorsByScheduleIdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetScheduleDoctorsByScheduleIdResponse)) return false;
        GetScheduleDoctorsByScheduleIdResponse other = (GetScheduleDoctorsByScheduleIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getScheduleDoctorsByScheduleIdResult==null && other.getGetScheduleDoctorsByScheduleIdResult()==null) || 
             (this.getScheduleDoctorsByScheduleIdResult!=null &&
              this.getScheduleDoctorsByScheduleIdResult.equals(other.getGetScheduleDoctorsByScheduleIdResult())));
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
        if (getGetScheduleDoctorsByScheduleIdResult() != null) {
            _hashCode += getGetScheduleDoctorsByScheduleIdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetScheduleDoctorsByScheduleIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetScheduleDoctorsByScheduleIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getScheduleDoctorsByScheduleIdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetScheduleDoctorsByScheduleIdResult"));
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
