/**
 * InsertShjlResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertShjlResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm insertShjlResult;

    public InsertShjlResponse() {
    }

    public InsertShjlResponse(
           org.tempuri.ReturnExComm insertShjlResult) {
           this.insertShjlResult = insertShjlResult;
    }


    /**
     * Gets the insertShjlResult value for this InsertShjlResponse.
     * 
     * @return insertShjlResult
     */
    public org.tempuri.ReturnExComm getInsertShjlResult() {
        return insertShjlResult;
    }


    /**
     * Sets the insertShjlResult value for this InsertShjlResponse.
     * 
     * @param insertShjlResult
     */
    public void setInsertShjlResult(org.tempuri.ReturnExComm insertShjlResult) {
        this.insertShjlResult = insertShjlResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertShjlResponse)) return false;
        InsertShjlResponse other = (InsertShjlResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertShjlResult==null && other.getInsertShjlResult()==null) || 
             (this.insertShjlResult!=null &&
              this.insertShjlResult.equals(other.getInsertShjlResult())));
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
        if (getInsertShjlResult() != null) {
            _hashCode += getInsertShjlResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertShjlResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertShjlResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertShjlResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertShjlResult"));
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
