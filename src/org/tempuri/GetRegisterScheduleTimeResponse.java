/**
 * GetRegisterScheduleTimeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetRegisterScheduleTimeResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getRegisterScheduleTimeResult;

    public GetRegisterScheduleTimeResponse() {
    }

    public GetRegisterScheduleTimeResponse(
           org.tempuri.ReturnExTable getRegisterScheduleTimeResult) {
           this.getRegisterScheduleTimeResult = getRegisterScheduleTimeResult;
    }


    /**
     * Gets the getRegisterScheduleTimeResult value for this GetRegisterScheduleTimeResponse.
     * 
     * @return getRegisterScheduleTimeResult
     */
    public org.tempuri.ReturnExTable getGetRegisterScheduleTimeResult() {
        return getRegisterScheduleTimeResult;
    }


    /**
     * Sets the getRegisterScheduleTimeResult value for this GetRegisterScheduleTimeResponse.
     * 
     * @param getRegisterScheduleTimeResult
     */
    public void setGetRegisterScheduleTimeResult(org.tempuri.ReturnExTable getRegisterScheduleTimeResult) {
        this.getRegisterScheduleTimeResult = getRegisterScheduleTimeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRegisterScheduleTimeResponse)) return false;
        GetRegisterScheduleTimeResponse other = (GetRegisterScheduleTimeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getRegisterScheduleTimeResult==null && other.getGetRegisterScheduleTimeResult()==null) || 
             (this.getRegisterScheduleTimeResult!=null &&
              this.getRegisterScheduleTimeResult.equals(other.getGetRegisterScheduleTimeResult())));
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
        if (getGetRegisterScheduleTimeResult() != null) {
            _hashCode += getGetRegisterScheduleTimeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRegisterScheduleTimeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetRegisterScheduleTimeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getRegisterScheduleTimeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetRegisterScheduleTimeResult"));
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
