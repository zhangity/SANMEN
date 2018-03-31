/**
 * GetClinicScheduleTimeDataTableResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetClinicScheduleTimeDataTableResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getClinicScheduleTimeDataTableResult;

    public GetClinicScheduleTimeDataTableResponse() {
    }

    public GetClinicScheduleTimeDataTableResponse(
           org.tempuri.ReturnExTable getClinicScheduleTimeDataTableResult) {
           this.getClinicScheduleTimeDataTableResult = getClinicScheduleTimeDataTableResult;
    }


    /**
     * Gets the getClinicScheduleTimeDataTableResult value for this GetClinicScheduleTimeDataTableResponse.
     * 
     * @return getClinicScheduleTimeDataTableResult
     */
    public org.tempuri.ReturnExTable getGetClinicScheduleTimeDataTableResult() {
        return getClinicScheduleTimeDataTableResult;
    }


    /**
     * Sets the getClinicScheduleTimeDataTableResult value for this GetClinicScheduleTimeDataTableResponse.
     * 
     * @param getClinicScheduleTimeDataTableResult
     */
    public void setGetClinicScheduleTimeDataTableResult(org.tempuri.ReturnExTable getClinicScheduleTimeDataTableResult) {
        this.getClinicScheduleTimeDataTableResult = getClinicScheduleTimeDataTableResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetClinicScheduleTimeDataTableResponse)) return false;
        GetClinicScheduleTimeDataTableResponse other = (GetClinicScheduleTimeDataTableResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getClinicScheduleTimeDataTableResult==null && other.getGetClinicScheduleTimeDataTableResult()==null) || 
             (this.getClinicScheduleTimeDataTableResult!=null &&
              this.getClinicScheduleTimeDataTableResult.equals(other.getGetClinicScheduleTimeDataTableResult())));
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
        if (getGetClinicScheduleTimeDataTableResult() != null) {
            _hashCode += getGetClinicScheduleTimeDataTableResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetClinicScheduleTimeDataTableResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetClinicScheduleTimeDataTableResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getClinicScheduleTimeDataTableResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetClinicScheduleTimeDataTableResult"));
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
