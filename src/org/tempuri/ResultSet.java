/**
 * ResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ResultSet  implements java.io.Serializable {
    private boolean success;

    private java.lang.String error;

    private org.tempuri.ResultSetResultDS resultDS;

    private org.tempuri.ResultSetResultXml resultXml;

    public ResultSet() {
    }

    public ResultSet(
           boolean success,
           java.lang.String error,
           org.tempuri.ResultSetResultDS resultDS,
           org.tempuri.ResultSetResultXml resultXml) {
           this.success = success;
           this.error = error;
           this.resultDS = resultDS;
           this.resultXml = resultXml;
    }


    /**
     * Gets the success value for this ResultSet.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this ResultSet.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }


    /**
     * Gets the error value for this ResultSet.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this ResultSet.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the resultDS value for this ResultSet.
     * 
     * @return resultDS
     */
    public org.tempuri.ResultSetResultDS getResultDS() {
        return resultDS;
    }


    /**
     * Sets the resultDS value for this ResultSet.
     * 
     * @param resultDS
     */
    public void setResultDS(org.tempuri.ResultSetResultDS resultDS) {
        this.resultDS = resultDS;
    }


    /**
     * Gets the resultXml value for this ResultSet.
     * 
     * @return resultXml
     */
    public org.tempuri.ResultSetResultXml getResultXml() {
        return resultXml;
    }


    /**
     * Sets the resultXml value for this ResultSet.
     * 
     * @param resultXml
     */
    public void setResultXml(org.tempuri.ResultSetResultXml resultXml) {
        this.resultXml = resultXml;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultSet)) return false;
        ResultSet other = (ResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.success == other.isSuccess() &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.resultDS==null && other.getResultDS()==null) || 
             (this.resultDS!=null &&
              this.resultDS.equals(other.getResultDS()))) &&
            ((this.resultXml==null && other.getResultXml()==null) || 
             (this.resultXml!=null &&
              this.resultXml.equals(other.getResultXml())));
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
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getResultDS() != null) {
            _hashCode += getResultDS().hashCode();
        }
        if (getResultXml() != null) {
            _hashCode += getResultXml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResultDS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ResultSet>ResultDS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResultXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ResultSet>ResultXml"));
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
