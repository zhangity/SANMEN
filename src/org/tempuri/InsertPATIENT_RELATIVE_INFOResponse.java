/**
 * InsertPATIENT_RELATIVE_INFOResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertPATIENT_RELATIVE_INFOResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm insertPATIENT_RELATIVE_INFOResult;

    public InsertPATIENT_RELATIVE_INFOResponse() {
    }

    public InsertPATIENT_RELATIVE_INFOResponse(
           org.tempuri.ReturnExComm insertPATIENT_RELATIVE_INFOResult) {
           this.insertPATIENT_RELATIVE_INFOResult = insertPATIENT_RELATIVE_INFOResult;
    }


    /**
     * Gets the insertPATIENT_RELATIVE_INFOResult value for this InsertPATIENT_RELATIVE_INFOResponse.
     * 
     * @return insertPATIENT_RELATIVE_INFOResult
     */
    public org.tempuri.ReturnExComm getInsertPATIENT_RELATIVE_INFOResult() {
        return insertPATIENT_RELATIVE_INFOResult;
    }


    /**
     * Sets the insertPATIENT_RELATIVE_INFOResult value for this InsertPATIENT_RELATIVE_INFOResponse.
     * 
     * @param insertPATIENT_RELATIVE_INFOResult
     */
    public void setInsertPATIENT_RELATIVE_INFOResult(org.tempuri.ReturnExComm insertPATIENT_RELATIVE_INFOResult) {
        this.insertPATIENT_RELATIVE_INFOResult = insertPATIENT_RELATIVE_INFOResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertPATIENT_RELATIVE_INFOResponse)) return false;
        InsertPATIENT_RELATIVE_INFOResponse other = (InsertPATIENT_RELATIVE_INFOResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertPATIENT_RELATIVE_INFOResult==null && other.getInsertPATIENT_RELATIVE_INFOResult()==null) || 
             (this.insertPATIENT_RELATIVE_INFOResult!=null &&
              this.insertPATIENT_RELATIVE_INFOResult.equals(other.getInsertPATIENT_RELATIVE_INFOResult())));
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
        if (getInsertPATIENT_RELATIVE_INFOResult() != null) {
            _hashCode += getInsertPATIENT_RELATIVE_INFOResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertPATIENT_RELATIVE_INFOResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertPATIENT_RELATIVE_INFOResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertPATIENT_RELATIVE_INFOResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertPATIENT_RELATIVE_INFOResult"));
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
