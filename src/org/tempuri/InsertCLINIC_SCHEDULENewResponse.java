/**
 * InsertCLINIC_SCHEDULENewResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertCLINIC_SCHEDULENewResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm insertCLINIC_SCHEDULENewResult;

    public InsertCLINIC_SCHEDULENewResponse() {
    }

    public InsertCLINIC_SCHEDULENewResponse(
           org.tempuri.ReturnExComm insertCLINIC_SCHEDULENewResult) {
           this.insertCLINIC_SCHEDULENewResult = insertCLINIC_SCHEDULENewResult;
    }


    /**
     * Gets the insertCLINIC_SCHEDULENewResult value for this InsertCLINIC_SCHEDULENewResponse.
     * 
     * @return insertCLINIC_SCHEDULENewResult
     */
    public org.tempuri.ReturnExComm getInsertCLINIC_SCHEDULENewResult() {
        return insertCLINIC_SCHEDULENewResult;
    }


    /**
     * Sets the insertCLINIC_SCHEDULENewResult value for this InsertCLINIC_SCHEDULENewResponse.
     * 
     * @param insertCLINIC_SCHEDULENewResult
     */
    public void setInsertCLINIC_SCHEDULENewResult(org.tempuri.ReturnExComm insertCLINIC_SCHEDULENewResult) {
        this.insertCLINIC_SCHEDULENewResult = insertCLINIC_SCHEDULENewResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertCLINIC_SCHEDULENewResponse)) return false;
        InsertCLINIC_SCHEDULENewResponse other = (InsertCLINIC_SCHEDULENewResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertCLINIC_SCHEDULENewResult==null && other.getInsertCLINIC_SCHEDULENewResult()==null) || 
             (this.insertCLINIC_SCHEDULENewResult!=null &&
              this.insertCLINIC_SCHEDULENewResult.equals(other.getInsertCLINIC_SCHEDULENewResult())));
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
        if (getInsertCLINIC_SCHEDULENewResult() != null) {
            _hashCode += getInsertCLINIC_SCHEDULENewResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertCLINIC_SCHEDULENewResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertCLINIC_SCHEDULENewResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertCLINIC_SCHEDULENewResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertCLINIC_SCHEDULENewResult"));
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
