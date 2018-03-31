/**
 * InsertBlwsInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertBlwsInfoResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm insertBlwsInfoResult;

    public InsertBlwsInfoResponse() {
    }

    public InsertBlwsInfoResponse(
           org.tempuri.ReturnExComm insertBlwsInfoResult) {
           this.insertBlwsInfoResult = insertBlwsInfoResult;
    }


    /**
     * Gets the insertBlwsInfoResult value for this InsertBlwsInfoResponse.
     * 
     * @return insertBlwsInfoResult
     */
    public org.tempuri.ReturnExComm getInsertBlwsInfoResult() {
        return insertBlwsInfoResult;
    }


    /**
     * Sets the insertBlwsInfoResult value for this InsertBlwsInfoResponse.
     * 
     * @param insertBlwsInfoResult
     */
    public void setInsertBlwsInfoResult(org.tempuri.ReturnExComm insertBlwsInfoResult) {
        this.insertBlwsInfoResult = insertBlwsInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertBlwsInfoResponse)) return false;
        InsertBlwsInfoResponse other = (InsertBlwsInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertBlwsInfoResult==null && other.getInsertBlwsInfoResult()==null) || 
             (this.insertBlwsInfoResult!=null &&
              this.insertBlwsInfoResult.equals(other.getInsertBlwsInfoResult())));
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
        if (getInsertBlwsInfoResult() != null) {
            _hashCode += getInsertBlwsInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertBlwsInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertBlwsInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertBlwsInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertBlwsInfoResult"));
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
