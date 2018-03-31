/**
 * ExecuteFunctionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ExecuteFunctionResponse  implements java.io.Serializable {
    private org.tempuri.ResultSet executeFunctionResult;

    public ExecuteFunctionResponse() {
    }

    public ExecuteFunctionResponse(
           org.tempuri.ResultSet executeFunctionResult) {
           this.executeFunctionResult = executeFunctionResult;
    }


    /**
     * Gets the executeFunctionResult value for this ExecuteFunctionResponse.
     * 
     * @return executeFunctionResult
     */
    public org.tempuri.ResultSet getExecuteFunctionResult() {
        return executeFunctionResult;
    }


    /**
     * Sets the executeFunctionResult value for this ExecuteFunctionResponse.
     * 
     * @param executeFunctionResult
     */
    public void setExecuteFunctionResult(org.tempuri.ResultSet executeFunctionResult) {
        this.executeFunctionResult = executeFunctionResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecuteFunctionResponse)) return false;
        ExecuteFunctionResponse other = (ExecuteFunctionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.executeFunctionResult==null && other.getExecuteFunctionResult()==null) || 
             (this.executeFunctionResult!=null &&
              this.executeFunctionResult.equals(other.getExecuteFunctionResult())));
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
        if (getExecuteFunctionResult() != null) {
            _hashCode += getExecuteFunctionResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExecuteFunctionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ExecuteFunctionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executeFunctionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ExecuteFunctionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResultSet"));
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
