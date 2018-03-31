/**
 * InsertScheduleTimeTemplateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertScheduleTimeTemplateResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm insertScheduleTimeTemplateResult;

    public InsertScheduleTimeTemplateResponse() {
    }

    public InsertScheduleTimeTemplateResponse(
           org.tempuri.ReturnExComm insertScheduleTimeTemplateResult) {
           this.insertScheduleTimeTemplateResult = insertScheduleTimeTemplateResult;
    }


    /**
     * Gets the insertScheduleTimeTemplateResult value for this InsertScheduleTimeTemplateResponse.
     * 
     * @return insertScheduleTimeTemplateResult
     */
    public org.tempuri.ReturnExComm getInsertScheduleTimeTemplateResult() {
        return insertScheduleTimeTemplateResult;
    }


    /**
     * Sets the insertScheduleTimeTemplateResult value for this InsertScheduleTimeTemplateResponse.
     * 
     * @param insertScheduleTimeTemplateResult
     */
    public void setInsertScheduleTimeTemplateResult(org.tempuri.ReturnExComm insertScheduleTimeTemplateResult) {
        this.insertScheduleTimeTemplateResult = insertScheduleTimeTemplateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertScheduleTimeTemplateResponse)) return false;
        InsertScheduleTimeTemplateResponse other = (InsertScheduleTimeTemplateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertScheduleTimeTemplateResult==null && other.getInsertScheduleTimeTemplateResult()==null) || 
             (this.insertScheduleTimeTemplateResult!=null &&
              this.insertScheduleTimeTemplateResult.equals(other.getInsertScheduleTimeTemplateResult())));
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
        if (getInsertScheduleTimeTemplateResult() != null) {
            _hashCode += getInsertScheduleTimeTemplateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertScheduleTimeTemplateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertScheduleTimeTemplateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertScheduleTimeTemplateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertScheduleTimeTemplateResult"));
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
