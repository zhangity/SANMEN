/**
 * GetScheduleTimeTemplateByDoctorCodeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetScheduleTimeTemplateByDoctorCodeResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getScheduleTimeTemplateByDoctorCodeResult;

    public GetScheduleTimeTemplateByDoctorCodeResponse() {
    }

    public GetScheduleTimeTemplateByDoctorCodeResponse(
           org.tempuri.ReturnExTable getScheduleTimeTemplateByDoctorCodeResult) {
           this.getScheduleTimeTemplateByDoctorCodeResult = getScheduleTimeTemplateByDoctorCodeResult;
    }


    /**
     * Gets the getScheduleTimeTemplateByDoctorCodeResult value for this GetScheduleTimeTemplateByDoctorCodeResponse.
     * 
     * @return getScheduleTimeTemplateByDoctorCodeResult
     */
    public org.tempuri.ReturnExTable getGetScheduleTimeTemplateByDoctorCodeResult() {
        return getScheduleTimeTemplateByDoctorCodeResult;
    }


    /**
     * Sets the getScheduleTimeTemplateByDoctorCodeResult value for this GetScheduleTimeTemplateByDoctorCodeResponse.
     * 
     * @param getScheduleTimeTemplateByDoctorCodeResult
     */
    public void setGetScheduleTimeTemplateByDoctorCodeResult(org.tempuri.ReturnExTable getScheduleTimeTemplateByDoctorCodeResult) {
        this.getScheduleTimeTemplateByDoctorCodeResult = getScheduleTimeTemplateByDoctorCodeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetScheduleTimeTemplateByDoctorCodeResponse)) return false;
        GetScheduleTimeTemplateByDoctorCodeResponse other = (GetScheduleTimeTemplateByDoctorCodeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getScheduleTimeTemplateByDoctorCodeResult==null && other.getGetScheduleTimeTemplateByDoctorCodeResult()==null) || 
             (this.getScheduleTimeTemplateByDoctorCodeResult!=null &&
              this.getScheduleTimeTemplateByDoctorCodeResult.equals(other.getGetScheduleTimeTemplateByDoctorCodeResult())));
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
        if (getGetScheduleTimeTemplateByDoctorCodeResult() != null) {
            _hashCode += getGetScheduleTimeTemplateByDoctorCodeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetScheduleTimeTemplateByDoctorCodeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetScheduleTimeTemplateByDoctorCodeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getScheduleTimeTemplateByDoctorCodeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetScheduleTimeTemplateByDoctorCodeResult"));
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
