/**
 * GetTakeReservationRegisterClinicResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetTakeReservationRegisterClinicResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getTakeReservationRegisterClinicResult;

    public GetTakeReservationRegisterClinicResponse() {
    }

    public GetTakeReservationRegisterClinicResponse(
           org.tempuri.ReturnExTable getTakeReservationRegisterClinicResult) {
           this.getTakeReservationRegisterClinicResult = getTakeReservationRegisterClinicResult;
    }


    /**
     * Gets the getTakeReservationRegisterClinicResult value for this GetTakeReservationRegisterClinicResponse.
     * 
     * @return getTakeReservationRegisterClinicResult
     */
    public org.tempuri.ReturnExTable getGetTakeReservationRegisterClinicResult() {
        return getTakeReservationRegisterClinicResult;
    }


    /**
     * Sets the getTakeReservationRegisterClinicResult value for this GetTakeReservationRegisterClinicResponse.
     * 
     * @param getTakeReservationRegisterClinicResult
     */
    public void setGetTakeReservationRegisterClinicResult(org.tempuri.ReturnExTable getTakeReservationRegisterClinicResult) {
        this.getTakeReservationRegisterClinicResult = getTakeReservationRegisterClinicResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTakeReservationRegisterClinicResponse)) return false;
        GetTakeReservationRegisterClinicResponse other = (GetTakeReservationRegisterClinicResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTakeReservationRegisterClinicResult==null && other.getGetTakeReservationRegisterClinicResult()==null) || 
             (this.getTakeReservationRegisterClinicResult!=null &&
              this.getTakeReservationRegisterClinicResult.equals(other.getGetTakeReservationRegisterClinicResult())));
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
        if (getGetTakeReservationRegisterClinicResult() != null) {
            _hashCode += getGetTakeReservationRegisterClinicResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTakeReservationRegisterClinicResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetTakeReservationRegisterClinicResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTakeReservationRegisterClinicResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetTakeReservationRegisterClinicResult"));
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
