/**
 * ReservationClinicRegistForCall_zwResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReservationClinicRegistForCall_zwResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm reservationClinicRegistForCall_zwResult;

    public ReservationClinicRegistForCall_zwResponse() {
    }

    public ReservationClinicRegistForCall_zwResponse(
           org.tempuri.ReturnExComm reservationClinicRegistForCall_zwResult) {
           this.reservationClinicRegistForCall_zwResult = reservationClinicRegistForCall_zwResult;
    }


    /**
     * Gets the reservationClinicRegistForCall_zwResult value for this ReservationClinicRegistForCall_zwResponse.
     * 
     * @return reservationClinicRegistForCall_zwResult
     */
    public org.tempuri.ReturnExComm getReservationClinicRegistForCall_zwResult() {
        return reservationClinicRegistForCall_zwResult;
    }


    /**
     * Sets the reservationClinicRegistForCall_zwResult value for this ReservationClinicRegistForCall_zwResponse.
     * 
     * @param reservationClinicRegistForCall_zwResult
     */
    public void setReservationClinicRegistForCall_zwResult(org.tempuri.ReturnExComm reservationClinicRegistForCall_zwResult) {
        this.reservationClinicRegistForCall_zwResult = reservationClinicRegistForCall_zwResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationClinicRegistForCall_zwResponse)) return false;
        ReservationClinicRegistForCall_zwResponse other = (ReservationClinicRegistForCall_zwResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reservationClinicRegistForCall_zwResult==null && other.getReservationClinicRegistForCall_zwResult()==null) || 
             (this.reservationClinicRegistForCall_zwResult!=null &&
              this.reservationClinicRegistForCall_zwResult.equals(other.getReservationClinicRegistForCall_zwResult())));
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
        if (getReservationClinicRegistForCall_zwResult() != null) {
            _hashCode += getReservationClinicRegistForCall_zwResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationClinicRegistForCall_zwResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReservationClinicRegistForCall_zwResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationClinicRegistForCall_zwResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReservationClinicRegistForCall_zwResult"));
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
