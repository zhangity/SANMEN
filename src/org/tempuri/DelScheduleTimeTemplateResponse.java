/**
 * DelScheduleTimeTemplateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DelScheduleTimeTemplateResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm delScheduleTimeTemplateResult;

    public DelScheduleTimeTemplateResponse() {
    }

    public DelScheduleTimeTemplateResponse(
           org.tempuri.ReturnExComm delScheduleTimeTemplateResult) {
           this.delScheduleTimeTemplateResult = delScheduleTimeTemplateResult;
    }


    /**
     * Gets the delScheduleTimeTemplateResult value for this DelScheduleTimeTemplateResponse.
     * 
     * @return delScheduleTimeTemplateResult
     */
    public org.tempuri.ReturnExComm getDelScheduleTimeTemplateResult() {
        return delScheduleTimeTemplateResult;
    }


    /**
     * Sets the delScheduleTimeTemplateResult value for this DelScheduleTimeTemplateResponse.
     * 
     * @param delScheduleTimeTemplateResult
     */
    public void setDelScheduleTimeTemplateResult(org.tempuri.ReturnExComm delScheduleTimeTemplateResult) {
        this.delScheduleTimeTemplateResult = delScheduleTimeTemplateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelScheduleTimeTemplateResponse)) return false;
        DelScheduleTimeTemplateResponse other = (DelScheduleTimeTemplateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.delScheduleTimeTemplateResult==null && other.getDelScheduleTimeTemplateResult()==null) || 
             (this.delScheduleTimeTemplateResult!=null &&
              this.delScheduleTimeTemplateResult.equals(other.getDelScheduleTimeTemplateResult())));
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
        if (getDelScheduleTimeTemplateResult() != null) {
            _hashCode += getDelScheduleTimeTemplateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DelScheduleTimeTemplateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DelScheduleTimeTemplateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delScheduleTimeTemplateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DelScheduleTimeTemplateResult"));
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
