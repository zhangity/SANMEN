/**
 * GetScheduleTimeForCallResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetScheduleTimeForCallResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getScheduleTimeForCallResult;

    public GetScheduleTimeForCallResponse() {
    }

    public GetScheduleTimeForCallResponse(
           org.tempuri.ReturnExTable getScheduleTimeForCallResult) {
           this.getScheduleTimeForCallResult = getScheduleTimeForCallResult;
    }


    /**
     * Gets the getScheduleTimeForCallResult value for this GetScheduleTimeForCallResponse.
     * 
     * @return getScheduleTimeForCallResult
     */
    public org.tempuri.ReturnExTable getGetScheduleTimeForCallResult() {
        return getScheduleTimeForCallResult;
    }


    /**
     * Sets the getScheduleTimeForCallResult value for this GetScheduleTimeForCallResponse.
     * 
     * @param getScheduleTimeForCallResult
     */
    public void setGetScheduleTimeForCallResult(org.tempuri.ReturnExTable getScheduleTimeForCallResult) {
        this.getScheduleTimeForCallResult = getScheduleTimeForCallResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetScheduleTimeForCallResponse)) return false;
        GetScheduleTimeForCallResponse other = (GetScheduleTimeForCallResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getScheduleTimeForCallResult==null && other.getGetScheduleTimeForCallResult()==null) || 
             (this.getScheduleTimeForCallResult!=null &&
              this.getScheduleTimeForCallResult.equals(other.getGetScheduleTimeForCallResult())));
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
        if (getGetScheduleTimeForCallResult() != null) {
            _hashCode += getGetScheduleTimeForCallResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetScheduleTimeForCallResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetScheduleTimeForCallResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getScheduleTimeForCallResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetScheduleTimeForCallResult"));
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
