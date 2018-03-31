/**
 * InsertMenuResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertMenuResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm insertMenuResult;

    public InsertMenuResponse() {
    }

    public InsertMenuResponse(
           org.tempuri.ReturnExComm insertMenuResult) {
           this.insertMenuResult = insertMenuResult;
    }


    /**
     * Gets the insertMenuResult value for this InsertMenuResponse.
     * 
     * @return insertMenuResult
     */
    public org.tempuri.ReturnExComm getInsertMenuResult() {
        return insertMenuResult;
    }


    /**
     * Sets the insertMenuResult value for this InsertMenuResponse.
     * 
     * @param insertMenuResult
     */
    public void setInsertMenuResult(org.tempuri.ReturnExComm insertMenuResult) {
        this.insertMenuResult = insertMenuResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertMenuResponse)) return false;
        InsertMenuResponse other = (InsertMenuResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertMenuResult==null && other.getInsertMenuResult()==null) || 
             (this.insertMenuResult!=null &&
              this.insertMenuResult.equals(other.getInsertMenuResult())));
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
        if (getInsertMenuResult() != null) {
            _hashCode += getInsertMenuResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertMenuResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertMenuResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertMenuResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertMenuResult"));
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
