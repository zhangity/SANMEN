/**
 * LockCLINICResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class LockCLINICResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm lockCLINICResult;

    public LockCLINICResponse() {
    }

    public LockCLINICResponse(
           org.tempuri.ReturnExComm lockCLINICResult) {
           this.lockCLINICResult = lockCLINICResult;
    }


    /**
     * Gets the lockCLINICResult value for this LockCLINICResponse.
     * 
     * @return lockCLINICResult
     */
    public org.tempuri.ReturnExComm getLockCLINICResult() {
        return lockCLINICResult;
    }


    /**
     * Sets the lockCLINICResult value for this LockCLINICResponse.
     * 
     * @param lockCLINICResult
     */
    public void setLockCLINICResult(org.tempuri.ReturnExComm lockCLINICResult) {
        this.lockCLINICResult = lockCLINICResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LockCLINICResponse)) return false;
        LockCLINICResponse other = (LockCLINICResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lockCLINICResult==null && other.getLockCLINICResult()==null) || 
             (this.lockCLINICResult!=null &&
              this.lockCLINICResult.equals(other.getLockCLINICResult())));
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
        if (getLockCLINICResult() != null) {
            _hashCode += getLockCLINICResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LockCLINICResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">LockCLINICResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockCLINICResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LockCLINICResult"));
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
