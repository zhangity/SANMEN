/**
 * GetScheduleTimeAmPmByScheduleIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetScheduleTimeAmPmByScheduleIdResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getScheduleTimeAmPmByScheduleIdResult;

    public GetScheduleTimeAmPmByScheduleIdResponse() {
    }

    public GetScheduleTimeAmPmByScheduleIdResponse(
           org.tempuri.ReturnExTable getScheduleTimeAmPmByScheduleIdResult) {
           this.getScheduleTimeAmPmByScheduleIdResult = getScheduleTimeAmPmByScheduleIdResult;
    }


    /**
     * Gets the getScheduleTimeAmPmByScheduleIdResult value for this GetScheduleTimeAmPmByScheduleIdResponse.
     * 
     * @return getScheduleTimeAmPmByScheduleIdResult
     */
    public org.tempuri.ReturnExTable getGetScheduleTimeAmPmByScheduleIdResult() {
        return getScheduleTimeAmPmByScheduleIdResult;
    }


    /**
     * Sets the getScheduleTimeAmPmByScheduleIdResult value for this GetScheduleTimeAmPmByScheduleIdResponse.
     * 
     * @param getScheduleTimeAmPmByScheduleIdResult
     */
    public void setGetScheduleTimeAmPmByScheduleIdResult(org.tempuri.ReturnExTable getScheduleTimeAmPmByScheduleIdResult) {
        this.getScheduleTimeAmPmByScheduleIdResult = getScheduleTimeAmPmByScheduleIdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetScheduleTimeAmPmByScheduleIdResponse)) return false;
        GetScheduleTimeAmPmByScheduleIdResponse other = (GetScheduleTimeAmPmByScheduleIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getScheduleTimeAmPmByScheduleIdResult==null && other.getGetScheduleTimeAmPmByScheduleIdResult()==null) || 
             (this.getScheduleTimeAmPmByScheduleIdResult!=null &&
              this.getScheduleTimeAmPmByScheduleIdResult.equals(other.getGetScheduleTimeAmPmByScheduleIdResult())));
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
        if (getGetScheduleTimeAmPmByScheduleIdResult() != null) {
            _hashCode += getGetScheduleTimeAmPmByScheduleIdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetScheduleTimeAmPmByScheduleIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetScheduleTimeAmPmByScheduleIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getScheduleTimeAmPmByScheduleIdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetScheduleTimeAmPmByScheduleIdResult"));
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
