/**
 * ReservationClinicRegist_zwResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReservationClinicRegist_zwResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm reservationClinicRegist_zwResult;

    public ReservationClinicRegist_zwResponse() {
    }

    public ReservationClinicRegist_zwResponse(
           org.tempuri.ReturnExComm reservationClinicRegist_zwResult) {
           this.reservationClinicRegist_zwResult = reservationClinicRegist_zwResult;
    }


    /**
     * Gets the reservationClinicRegist_zwResult value for this ReservationClinicRegist_zwResponse.
     * 
     * @return reservationClinicRegist_zwResult
     */
    public org.tempuri.ReturnExComm getReservationClinicRegist_zwResult() {
        return reservationClinicRegist_zwResult;
    }


    /**
     * Sets the reservationClinicRegist_zwResult value for this ReservationClinicRegist_zwResponse.
     * 
     * @param reservationClinicRegist_zwResult
     */
    public void setReservationClinicRegist_zwResult(org.tempuri.ReturnExComm reservationClinicRegist_zwResult) {
        this.reservationClinicRegist_zwResult = reservationClinicRegist_zwResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationClinicRegist_zwResponse)) return false;
        ReservationClinicRegist_zwResponse other = (ReservationClinicRegist_zwResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reservationClinicRegist_zwResult==null && other.getReservationClinicRegist_zwResult()==null) || 
             (this.reservationClinicRegist_zwResult!=null &&
              this.reservationClinicRegist_zwResult.equals(other.getReservationClinicRegist_zwResult())));
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
        if (getReservationClinicRegist_zwResult() != null) {
            _hashCode += getReservationClinicRegist_zwResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationClinicRegist_zwResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReservationClinicRegist_zwResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationClinicRegist_zwResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReservationClinicRegist_zwResult"));
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
