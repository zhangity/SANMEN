/**
 * FillCardResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class FillCardResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm fillCardResult;

    public FillCardResponse() {
    }

    public FillCardResponse(
           org.tempuri.ReturnExComm fillCardResult) {
           this.fillCardResult = fillCardResult;
    }


    /**
     * Gets the fillCardResult value for this FillCardResponse.
     * 
     * @return fillCardResult
     */
    public org.tempuri.ReturnExComm getFillCardResult() {
        return fillCardResult;
    }


    /**
     * Sets the fillCardResult value for this FillCardResponse.
     * 
     * @param fillCardResult
     */
    public void setFillCardResult(org.tempuri.ReturnExComm fillCardResult) {
        this.fillCardResult = fillCardResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FillCardResponse)) return false;
        FillCardResponse other = (FillCardResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fillCardResult==null && other.getFillCardResult()==null) || 
             (this.fillCardResult!=null &&
              this.fillCardResult.equals(other.getFillCardResult())));
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
        if (getFillCardResult() != null) {
            _hashCode += getFillCardResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FillCardResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">FillCardResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fillCardResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FillCardResult"));
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
