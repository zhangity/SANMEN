/**
 * InsertReservationRegistOfClinicResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertReservationRegistOfClinicResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm insertReservationRegistOfClinicResult;

    public InsertReservationRegistOfClinicResponse() {
    }

    public InsertReservationRegistOfClinicResponse(
           org.tempuri.ReturnExComm insertReservationRegistOfClinicResult) {
           this.insertReservationRegistOfClinicResult = insertReservationRegistOfClinicResult;
    }


    /**
     * Gets the insertReservationRegistOfClinicResult value for this InsertReservationRegistOfClinicResponse.
     * 
     * @return insertReservationRegistOfClinicResult
     */
    public org.tempuri.ReturnExComm getInsertReservationRegistOfClinicResult() {
        return insertReservationRegistOfClinicResult;
    }


    /**
     * Sets the insertReservationRegistOfClinicResult value for this InsertReservationRegistOfClinicResponse.
     * 
     * @param insertReservationRegistOfClinicResult
     */
    public void setInsertReservationRegistOfClinicResult(org.tempuri.ReturnExComm insertReservationRegistOfClinicResult) {
        this.insertReservationRegistOfClinicResult = insertReservationRegistOfClinicResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertReservationRegistOfClinicResponse)) return false;
        InsertReservationRegistOfClinicResponse other = (InsertReservationRegistOfClinicResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertReservationRegistOfClinicResult==null && other.getInsertReservationRegistOfClinicResult()==null) || 
             (this.insertReservationRegistOfClinicResult!=null &&
              this.insertReservationRegistOfClinicResult.equals(other.getInsertReservationRegistOfClinicResult())));
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
        if (getInsertReservationRegistOfClinicResult() != null) {
            _hashCode += getInsertReservationRegistOfClinicResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertReservationRegistOfClinicResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertReservationRegistOfClinicResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertReservationRegistOfClinicResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertReservationRegistOfClinicResult"));
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
