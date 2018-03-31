/**
 * PtReservationClinicRegistForCall_zwResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class PtReservationClinicRegistForCall_zwResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm ptReservationClinicRegistForCall_zwResult;

    public PtReservationClinicRegistForCall_zwResponse() {
    }

    public PtReservationClinicRegistForCall_zwResponse(
           org.tempuri.ReturnExComm ptReservationClinicRegistForCall_zwResult) {
           this.ptReservationClinicRegistForCall_zwResult = ptReservationClinicRegistForCall_zwResult;
    }


    /**
     * Gets the ptReservationClinicRegistForCall_zwResult value for this PtReservationClinicRegistForCall_zwResponse.
     * 
     * @return ptReservationClinicRegistForCall_zwResult
     */
    public org.tempuri.ReturnExComm getPtReservationClinicRegistForCall_zwResult() {
        return ptReservationClinicRegistForCall_zwResult;
    }


    /**
     * Sets the ptReservationClinicRegistForCall_zwResult value for this PtReservationClinicRegistForCall_zwResponse.
     * 
     * @param ptReservationClinicRegistForCall_zwResult
     */
    public void setPtReservationClinicRegistForCall_zwResult(org.tempuri.ReturnExComm ptReservationClinicRegistForCall_zwResult) {
        this.ptReservationClinicRegistForCall_zwResult = ptReservationClinicRegistForCall_zwResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PtReservationClinicRegistForCall_zwResponse)) return false;
        PtReservationClinicRegistForCall_zwResponse other = (PtReservationClinicRegistForCall_zwResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ptReservationClinicRegistForCall_zwResult==null && other.getPtReservationClinicRegistForCall_zwResult()==null) || 
             (this.ptReservationClinicRegistForCall_zwResult!=null &&
              this.ptReservationClinicRegistForCall_zwResult.equals(other.getPtReservationClinicRegistForCall_zwResult())));
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
        if (getPtReservationClinicRegistForCall_zwResult() != null) {
            _hashCode += getPtReservationClinicRegistForCall_zwResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PtReservationClinicRegistForCall_zwResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">PtReservationClinicRegistForCall_zwResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptReservationClinicRegistForCall_zwResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PtReservationClinicRegistForCall_zwResult"));
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
