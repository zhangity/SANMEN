/**
 * GetCopyScheduleCheckForReservationDataTableResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCopyScheduleCheckForReservationDataTableResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getCopyScheduleCheckForReservationDataTableResult;

    public GetCopyScheduleCheckForReservationDataTableResponse() {
    }

    public GetCopyScheduleCheckForReservationDataTableResponse(
           org.tempuri.ReturnExTable getCopyScheduleCheckForReservationDataTableResult) {
           this.getCopyScheduleCheckForReservationDataTableResult = getCopyScheduleCheckForReservationDataTableResult;
    }


    /**
     * Gets the getCopyScheduleCheckForReservationDataTableResult value for this GetCopyScheduleCheckForReservationDataTableResponse.
     * 
     * @return getCopyScheduleCheckForReservationDataTableResult
     */
    public org.tempuri.ReturnExTable getGetCopyScheduleCheckForReservationDataTableResult() {
        return getCopyScheduleCheckForReservationDataTableResult;
    }


    /**
     * Sets the getCopyScheduleCheckForReservationDataTableResult value for this GetCopyScheduleCheckForReservationDataTableResponse.
     * 
     * @param getCopyScheduleCheckForReservationDataTableResult
     */
    public void setGetCopyScheduleCheckForReservationDataTableResult(org.tempuri.ReturnExTable getCopyScheduleCheckForReservationDataTableResult) {
        this.getCopyScheduleCheckForReservationDataTableResult = getCopyScheduleCheckForReservationDataTableResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCopyScheduleCheckForReservationDataTableResponse)) return false;
        GetCopyScheduleCheckForReservationDataTableResponse other = (GetCopyScheduleCheckForReservationDataTableResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCopyScheduleCheckForReservationDataTableResult==null && other.getGetCopyScheduleCheckForReservationDataTableResult()==null) || 
             (this.getCopyScheduleCheckForReservationDataTableResult!=null &&
              this.getCopyScheduleCheckForReservationDataTableResult.equals(other.getGetCopyScheduleCheckForReservationDataTableResult())));
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
        if (getGetCopyScheduleCheckForReservationDataTableResult() != null) {
            _hashCode += getGetCopyScheduleCheckForReservationDataTableResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCopyScheduleCheckForReservationDataTableResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCopyScheduleCheckForReservationDataTableResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCopyScheduleCheckForReservationDataTableResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCopyScheduleCheckForReservationDataTableResult"));
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
