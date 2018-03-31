/**
 * GetScheduleTimeTemplateByKsdmResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetScheduleTimeTemplateByKsdmResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getScheduleTimeTemplateByKsdmResult;

    public GetScheduleTimeTemplateByKsdmResponse() {
    }

    public GetScheduleTimeTemplateByKsdmResponse(
           org.tempuri.ReturnExTable getScheduleTimeTemplateByKsdmResult) {
           this.getScheduleTimeTemplateByKsdmResult = getScheduleTimeTemplateByKsdmResult;
    }


    /**
     * Gets the getScheduleTimeTemplateByKsdmResult value for this GetScheduleTimeTemplateByKsdmResponse.
     * 
     * @return getScheduleTimeTemplateByKsdmResult
     */
    public org.tempuri.ReturnExTable getGetScheduleTimeTemplateByKsdmResult() {
        return getScheduleTimeTemplateByKsdmResult;
    }


    /**
     * Sets the getScheduleTimeTemplateByKsdmResult value for this GetScheduleTimeTemplateByKsdmResponse.
     * 
     * @param getScheduleTimeTemplateByKsdmResult
     */
    public void setGetScheduleTimeTemplateByKsdmResult(org.tempuri.ReturnExTable getScheduleTimeTemplateByKsdmResult) {
        this.getScheduleTimeTemplateByKsdmResult = getScheduleTimeTemplateByKsdmResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetScheduleTimeTemplateByKsdmResponse)) return false;
        GetScheduleTimeTemplateByKsdmResponse other = (GetScheduleTimeTemplateByKsdmResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getScheduleTimeTemplateByKsdmResult==null && other.getGetScheduleTimeTemplateByKsdmResult()==null) || 
             (this.getScheduleTimeTemplateByKsdmResult!=null &&
              this.getScheduleTimeTemplateByKsdmResult.equals(other.getGetScheduleTimeTemplateByKsdmResult())));
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
        if (getGetScheduleTimeTemplateByKsdmResult() != null) {
            _hashCode += getGetScheduleTimeTemplateByKsdmResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetScheduleTimeTemplateByKsdmResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetScheduleTimeTemplateByKsdmResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getScheduleTimeTemplateByKsdmResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetScheduleTimeTemplateByKsdmResult"));
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
