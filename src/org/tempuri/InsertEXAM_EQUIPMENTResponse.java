/**
 * InsertEXAM_EQUIPMENTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertEXAM_EQUIPMENTResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm insertEXAM_EQUIPMENTResult;

    public InsertEXAM_EQUIPMENTResponse() {
    }

    public InsertEXAM_EQUIPMENTResponse(
           org.tempuri.ReturnExComm insertEXAM_EQUIPMENTResult) {
           this.insertEXAM_EQUIPMENTResult = insertEXAM_EQUIPMENTResult;
    }


    /**
     * Gets the insertEXAM_EQUIPMENTResult value for this InsertEXAM_EQUIPMENTResponse.
     * 
     * @return insertEXAM_EQUIPMENTResult
     */
    public org.tempuri.ReturnExComm getInsertEXAM_EQUIPMENTResult() {
        return insertEXAM_EQUIPMENTResult;
    }


    /**
     * Sets the insertEXAM_EQUIPMENTResult value for this InsertEXAM_EQUIPMENTResponse.
     * 
     * @param insertEXAM_EQUIPMENTResult
     */
    public void setInsertEXAM_EQUIPMENTResult(org.tempuri.ReturnExComm insertEXAM_EQUIPMENTResult) {
        this.insertEXAM_EQUIPMENTResult = insertEXAM_EQUIPMENTResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertEXAM_EQUIPMENTResponse)) return false;
        InsertEXAM_EQUIPMENTResponse other = (InsertEXAM_EQUIPMENTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertEXAM_EQUIPMENTResult==null && other.getInsertEXAM_EQUIPMENTResult()==null) || 
             (this.insertEXAM_EQUIPMENTResult!=null &&
              this.insertEXAM_EQUIPMENTResult.equals(other.getInsertEXAM_EQUIPMENTResult())));
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
        if (getInsertEXAM_EQUIPMENTResult() != null) {
            _hashCode += getInsertEXAM_EQUIPMENTResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertEXAM_EQUIPMENTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertEXAM_EQUIPMENTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertEXAM_EQUIPMENTResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertEXAM_EQUIPMENTResult"));
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
