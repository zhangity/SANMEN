/**
 * AddBkzdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AddBkzdResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm addBkzdResult;

    public AddBkzdResponse() {
    }

    public AddBkzdResponse(
           org.tempuri.ReturnExComm addBkzdResult) {
           this.addBkzdResult = addBkzdResult;
    }


    /**
     * Gets the addBkzdResult value for this AddBkzdResponse.
     * 
     * @return addBkzdResult
     */
    public org.tempuri.ReturnExComm getAddBkzdResult() {
        return addBkzdResult;
    }


    /**
     * Sets the addBkzdResult value for this AddBkzdResponse.
     * 
     * @param addBkzdResult
     */
    public void setAddBkzdResult(org.tempuri.ReturnExComm addBkzdResult) {
        this.addBkzdResult = addBkzdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddBkzdResponse)) return false;
        AddBkzdResponse other = (AddBkzdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addBkzdResult==null && other.getAddBkzdResult()==null) || 
             (this.addBkzdResult!=null &&
              this.addBkzdResult.equals(other.getAddBkzdResult())));
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
        if (getAddBkzdResult() != null) {
            _hashCode += getAddBkzdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddBkzdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddBkzdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addBkzdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AddBkzdResult"));
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
