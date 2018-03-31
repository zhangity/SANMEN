/**
 * MzZDSaveResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class MzZDSaveResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm mzZDSaveResult;

    public MzZDSaveResponse() {
    }

    public MzZDSaveResponse(
           org.tempuri.ReturnExComm mzZDSaveResult) {
           this.mzZDSaveResult = mzZDSaveResult;
    }


    /**
     * Gets the mzZDSaveResult value for this MzZDSaveResponse.
     * 
     * @return mzZDSaveResult
     */
    public org.tempuri.ReturnExComm getMzZDSaveResult() {
        return mzZDSaveResult;
    }


    /**
     * Sets the mzZDSaveResult value for this MzZDSaveResponse.
     * 
     * @param mzZDSaveResult
     */
    public void setMzZDSaveResult(org.tempuri.ReturnExComm mzZDSaveResult) {
        this.mzZDSaveResult = mzZDSaveResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MzZDSaveResponse)) return false;
        MzZDSaveResponse other = (MzZDSaveResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mzZDSaveResult==null && other.getMzZDSaveResult()==null) || 
             (this.mzZDSaveResult!=null &&
              this.mzZDSaveResult.equals(other.getMzZDSaveResult())));
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
        if (getMzZDSaveResult() != null) {
            _hashCode += getMzZDSaveResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MzZDSaveResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">MzZDSaveResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mzZDSaveResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MzZDSaveResult"));
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
