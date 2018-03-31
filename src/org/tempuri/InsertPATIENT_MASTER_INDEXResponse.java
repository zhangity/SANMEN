/**
 * InsertPATIENT_MASTER_INDEXResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertPATIENT_MASTER_INDEXResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm insertPATIENT_MASTER_INDEXResult;

    public InsertPATIENT_MASTER_INDEXResponse() {
    }

    public InsertPATIENT_MASTER_INDEXResponse(
           org.tempuri.ReturnExComm insertPATIENT_MASTER_INDEXResult) {
           this.insertPATIENT_MASTER_INDEXResult = insertPATIENT_MASTER_INDEXResult;
    }


    /**
     * Gets the insertPATIENT_MASTER_INDEXResult value for this InsertPATIENT_MASTER_INDEXResponse.
     * 
     * @return insertPATIENT_MASTER_INDEXResult
     */
    public org.tempuri.ReturnExComm getInsertPATIENT_MASTER_INDEXResult() {
        return insertPATIENT_MASTER_INDEXResult;
    }


    /**
     * Sets the insertPATIENT_MASTER_INDEXResult value for this InsertPATIENT_MASTER_INDEXResponse.
     * 
     * @param insertPATIENT_MASTER_INDEXResult
     */
    public void setInsertPATIENT_MASTER_INDEXResult(org.tempuri.ReturnExComm insertPATIENT_MASTER_INDEXResult) {
        this.insertPATIENT_MASTER_INDEXResult = insertPATIENT_MASTER_INDEXResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertPATIENT_MASTER_INDEXResponse)) return false;
        InsertPATIENT_MASTER_INDEXResponse other = (InsertPATIENT_MASTER_INDEXResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertPATIENT_MASTER_INDEXResult==null && other.getInsertPATIENT_MASTER_INDEXResult()==null) || 
             (this.insertPATIENT_MASTER_INDEXResult!=null &&
              this.insertPATIENT_MASTER_INDEXResult.equals(other.getInsertPATIENT_MASTER_INDEXResult())));
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
        if (getInsertPATIENT_MASTER_INDEXResult() != null) {
            _hashCode += getInsertPATIENT_MASTER_INDEXResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertPATIENT_MASTER_INDEXResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertPATIENT_MASTER_INDEXResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertPATIENT_MASTER_INDEXResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertPATIENT_MASTER_INDEXResult"));
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
