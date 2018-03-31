/**
 * InsertCLINIC_SCHEDULEResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertCLINIC_SCHEDULEResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm insertCLINIC_SCHEDULEResult;

    public InsertCLINIC_SCHEDULEResponse() {
    }

    public InsertCLINIC_SCHEDULEResponse(
           org.tempuri.ReturnExComm insertCLINIC_SCHEDULEResult) {
           this.insertCLINIC_SCHEDULEResult = insertCLINIC_SCHEDULEResult;
    }


    /**
     * Gets the insertCLINIC_SCHEDULEResult value for this InsertCLINIC_SCHEDULEResponse.
     * 
     * @return insertCLINIC_SCHEDULEResult
     */
    public org.tempuri.ReturnExComm getInsertCLINIC_SCHEDULEResult() {
        return insertCLINIC_SCHEDULEResult;
    }


    /**
     * Sets the insertCLINIC_SCHEDULEResult value for this InsertCLINIC_SCHEDULEResponse.
     * 
     * @param insertCLINIC_SCHEDULEResult
     */
    public void setInsertCLINIC_SCHEDULEResult(org.tempuri.ReturnExComm insertCLINIC_SCHEDULEResult) {
        this.insertCLINIC_SCHEDULEResult = insertCLINIC_SCHEDULEResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertCLINIC_SCHEDULEResponse)) return false;
        InsertCLINIC_SCHEDULEResponse other = (InsertCLINIC_SCHEDULEResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertCLINIC_SCHEDULEResult==null && other.getInsertCLINIC_SCHEDULEResult()==null) || 
             (this.insertCLINIC_SCHEDULEResult!=null &&
              this.insertCLINIC_SCHEDULEResult.equals(other.getInsertCLINIC_SCHEDULEResult())));
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
        if (getInsertCLINIC_SCHEDULEResult() != null) {
            _hashCode += getInsertCLINIC_SCHEDULEResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertCLINIC_SCHEDULEResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertCLINIC_SCHEDULEResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertCLINIC_SCHEDULEResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertCLINIC_SCHEDULEResult"));
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
