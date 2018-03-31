/**
 * InsertInHospitalResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertInHospitalResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm insertInHospitalResult;

    public InsertInHospitalResponse() {
    }

    public InsertInHospitalResponse(
           org.tempuri.ReturnExComm insertInHospitalResult) {
           this.insertInHospitalResult = insertInHospitalResult;
    }


    /**
     * Gets the insertInHospitalResult value for this InsertInHospitalResponse.
     * 
     * @return insertInHospitalResult
     */
    public org.tempuri.ReturnExComm getInsertInHospitalResult() {
        return insertInHospitalResult;
    }


    /**
     * Sets the insertInHospitalResult value for this InsertInHospitalResponse.
     * 
     * @param insertInHospitalResult
     */
    public void setInsertInHospitalResult(org.tempuri.ReturnExComm insertInHospitalResult) {
        this.insertInHospitalResult = insertInHospitalResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertInHospitalResponse)) return false;
        InsertInHospitalResponse other = (InsertInHospitalResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertInHospitalResult==null && other.getInsertInHospitalResult()==null) || 
             (this.insertInHospitalResult!=null &&
              this.insertInHospitalResult.equals(other.getInsertInHospitalResult())));
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
        if (getInsertInHospitalResult() != null) {
            _hashCode += getInsertInHospitalResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertInHospitalResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertInHospitalResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertInHospitalResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertInHospitalResult"));
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
