/**
 * GetReservationRegisterScheduleTimeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetReservationRegisterScheduleTimeResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getReservationRegisterScheduleTimeResult;

    public GetReservationRegisterScheduleTimeResponse() {
    }

    public GetReservationRegisterScheduleTimeResponse(
           org.tempuri.ReturnExTable getReservationRegisterScheduleTimeResult) {
           this.getReservationRegisterScheduleTimeResult = getReservationRegisterScheduleTimeResult;
    }


    /**
     * Gets the getReservationRegisterScheduleTimeResult value for this GetReservationRegisterScheduleTimeResponse.
     * 
     * @return getReservationRegisterScheduleTimeResult
     */
    public org.tempuri.ReturnExTable getGetReservationRegisterScheduleTimeResult() {
        return getReservationRegisterScheduleTimeResult;
    }


    /**
     * Sets the getReservationRegisterScheduleTimeResult value for this GetReservationRegisterScheduleTimeResponse.
     * 
     * @param getReservationRegisterScheduleTimeResult
     */
    public void setGetReservationRegisterScheduleTimeResult(org.tempuri.ReturnExTable getReservationRegisterScheduleTimeResult) {
        this.getReservationRegisterScheduleTimeResult = getReservationRegisterScheduleTimeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetReservationRegisterScheduleTimeResponse)) return false;
        GetReservationRegisterScheduleTimeResponse other = (GetReservationRegisterScheduleTimeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getReservationRegisterScheduleTimeResult==null && other.getGetReservationRegisterScheduleTimeResult()==null) || 
             (this.getReservationRegisterScheduleTimeResult!=null &&
              this.getReservationRegisterScheduleTimeResult.equals(other.getGetReservationRegisterScheduleTimeResult())));
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
        if (getGetReservationRegisterScheduleTimeResult() != null) {
            _hashCode += getGetReservationRegisterScheduleTimeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetReservationRegisterScheduleTimeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetReservationRegisterScheduleTimeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getReservationRegisterScheduleTimeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetReservationRegisterScheduleTimeResult"));
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
