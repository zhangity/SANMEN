/**
 * PtGetScheduleTimeForCallResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class PtGetScheduleTimeForCallResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable ptGetScheduleTimeForCallResult;

    public PtGetScheduleTimeForCallResponse() {
    }

    public PtGetScheduleTimeForCallResponse(
           org.tempuri.ReturnExTable ptGetScheduleTimeForCallResult) {
           this.ptGetScheduleTimeForCallResult = ptGetScheduleTimeForCallResult;
    }


    /**
     * Gets the ptGetScheduleTimeForCallResult value for this PtGetScheduleTimeForCallResponse.
     * 
     * @return ptGetScheduleTimeForCallResult
     */
    public org.tempuri.ReturnExTable getPtGetScheduleTimeForCallResult() {
        return ptGetScheduleTimeForCallResult;
    }


    /**
     * Sets the ptGetScheduleTimeForCallResult value for this PtGetScheduleTimeForCallResponse.
     * 
     * @param ptGetScheduleTimeForCallResult
     */
    public void setPtGetScheduleTimeForCallResult(org.tempuri.ReturnExTable ptGetScheduleTimeForCallResult) {
        this.ptGetScheduleTimeForCallResult = ptGetScheduleTimeForCallResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PtGetScheduleTimeForCallResponse)) return false;
        PtGetScheduleTimeForCallResponse other = (PtGetScheduleTimeForCallResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ptGetScheduleTimeForCallResult==null && other.getPtGetScheduleTimeForCallResult()==null) || 
             (this.ptGetScheduleTimeForCallResult!=null &&
              this.ptGetScheduleTimeForCallResult.equals(other.getPtGetScheduleTimeForCallResult())));
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
        if (getPtGetScheduleTimeForCallResult() != null) {
            _hashCode += getPtGetScheduleTimeForCallResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PtGetScheduleTimeForCallResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">PtGetScheduleTimeForCallResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptGetScheduleTimeForCallResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PtGetScheduleTimeForCallResult"));
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
