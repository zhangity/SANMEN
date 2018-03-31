/**
 * ReturnExComm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReturnExComm  implements java.io.Serializable {
    private java.lang.String errorMess;

    private boolean success;

    private java.lang.String exJg;

    private int number;

    public ReturnExComm() {
    }

    public ReturnExComm(
           java.lang.String errorMess,
           boolean success,
           java.lang.String exJg,
           int number) {
           this.errorMess = errorMess;
           this.success = success;
           this.exJg = exJg;
           this.number = number;
    }


    /**
     * Gets the errorMess value for this ReturnExComm.
     * 
     * @return errorMess
     */
    public java.lang.String getErrorMess() {
        return errorMess;
    }


    /**
     * Sets the errorMess value for this ReturnExComm.
     * 
     * @param errorMess
     */
    public void setErrorMess(java.lang.String errorMess) {
        this.errorMess = errorMess;
    }


    /**
     * Gets the success value for this ReturnExComm.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this ReturnExComm.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }


    /**
     * Gets the exJg value for this ReturnExComm.
     * 
     * @return exJg
     */
    public java.lang.String getExJg() {
        return exJg;
    }


    /**
     * Sets the exJg value for this ReturnExComm.
     * 
     * @param exJg
     */
    public void setExJg(java.lang.String exJg) {
        this.exJg = exJg;
    }


    /**
     * Gets the number value for this ReturnExComm.
     * 
     * @return number
     */
    public int getNumber() {
        return number;
    }


    /**
     * Sets the number value for this ReturnExComm.
     * 
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReturnExComm)) return false;
        ReturnExComm other = (ReturnExComm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorMess==null && other.getErrorMess()==null) || 
             (this.errorMess!=null &&
              this.errorMess.equals(other.getErrorMess()))) &&
            this.success == other.isSuccess() &&
            ((this.exJg==null && other.getExJg()==null) || 
             (this.exJg!=null &&
              this.exJg.equals(other.getExJg()))) &&
            this.number == other.getNumber();
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
        if (getErrorMess() != null) {
            _hashCode += getErrorMess().hashCode();
        }
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExJg() != null) {
            _hashCode += getExJg().hashCode();
        }
        _hashCode += getNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReturnExComm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExComm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ErrorMess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exJg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ExJg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
