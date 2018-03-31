/**
 * InsertPATIENT_MASTER_INDEXandCardResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertPATIENT_MASTER_INDEXandCardResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm insertPATIENT_MASTER_INDEXandCardResult;

    public InsertPATIENT_MASTER_INDEXandCardResponse() {
    }

    public InsertPATIENT_MASTER_INDEXandCardResponse(
           org.tempuri.ReturnExComm insertPATIENT_MASTER_INDEXandCardResult) {
           this.insertPATIENT_MASTER_INDEXandCardResult = insertPATIENT_MASTER_INDEXandCardResult;
    }


    /**
     * Gets the insertPATIENT_MASTER_INDEXandCardResult value for this InsertPATIENT_MASTER_INDEXandCardResponse.
     * 
     * @return insertPATIENT_MASTER_INDEXandCardResult
     */
    public org.tempuri.ReturnExComm getInsertPATIENT_MASTER_INDEXandCardResult() {
        return insertPATIENT_MASTER_INDEXandCardResult;
    }


    /**
     * Sets the insertPATIENT_MASTER_INDEXandCardResult value for this InsertPATIENT_MASTER_INDEXandCardResponse.
     * 
     * @param insertPATIENT_MASTER_INDEXandCardResult
     */
    public void setInsertPATIENT_MASTER_INDEXandCardResult(org.tempuri.ReturnExComm insertPATIENT_MASTER_INDEXandCardResult) {
        this.insertPATIENT_MASTER_INDEXandCardResult = insertPATIENT_MASTER_INDEXandCardResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertPATIENT_MASTER_INDEXandCardResponse)) return false;
        InsertPATIENT_MASTER_INDEXandCardResponse other = (InsertPATIENT_MASTER_INDEXandCardResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertPATIENT_MASTER_INDEXandCardResult==null && other.getInsertPATIENT_MASTER_INDEXandCardResult()==null) || 
             (this.insertPATIENT_MASTER_INDEXandCardResult!=null &&
              this.insertPATIENT_MASTER_INDEXandCardResult.equals(other.getInsertPATIENT_MASTER_INDEXandCardResult())));
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
        if (getInsertPATIENT_MASTER_INDEXandCardResult() != null) {
            _hashCode += getInsertPATIENT_MASTER_INDEXandCardResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertPATIENT_MASTER_INDEXandCardResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertPATIENT_MASTER_INDEXandCardResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertPATIENT_MASTER_INDEXandCardResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertPATIENT_MASTER_INDEXandCardResult"));
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
