/**
 * GetCLINIC_SCHEDULElistByWhereResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCLINIC_SCHEDULElistByWhereResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getCLINIC_SCHEDULElistByWhereResult;

    public GetCLINIC_SCHEDULElistByWhereResponse() {
    }

    public GetCLINIC_SCHEDULElistByWhereResponse(
           org.tempuri.ReturnExTable getCLINIC_SCHEDULElistByWhereResult) {
           this.getCLINIC_SCHEDULElistByWhereResult = getCLINIC_SCHEDULElistByWhereResult;
    }


    /**
     * Gets the getCLINIC_SCHEDULElistByWhereResult value for this GetCLINIC_SCHEDULElistByWhereResponse.
     * 
     * @return getCLINIC_SCHEDULElistByWhereResult
     */
    public org.tempuri.ReturnExTable getGetCLINIC_SCHEDULElistByWhereResult() {
        return getCLINIC_SCHEDULElistByWhereResult;
    }


    /**
     * Sets the getCLINIC_SCHEDULElistByWhereResult value for this GetCLINIC_SCHEDULElistByWhereResponse.
     * 
     * @param getCLINIC_SCHEDULElistByWhereResult
     */
    public void setGetCLINIC_SCHEDULElistByWhereResult(org.tempuri.ReturnExTable getCLINIC_SCHEDULElistByWhereResult) {
        this.getCLINIC_SCHEDULElistByWhereResult = getCLINIC_SCHEDULElistByWhereResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCLINIC_SCHEDULElistByWhereResponse)) return false;
        GetCLINIC_SCHEDULElistByWhereResponse other = (GetCLINIC_SCHEDULElistByWhereResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCLINIC_SCHEDULElistByWhereResult==null && other.getGetCLINIC_SCHEDULElistByWhereResult()==null) || 
             (this.getCLINIC_SCHEDULElistByWhereResult!=null &&
              this.getCLINIC_SCHEDULElistByWhereResult.equals(other.getGetCLINIC_SCHEDULElistByWhereResult())));
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
        if (getGetCLINIC_SCHEDULElistByWhereResult() != null) {
            _hashCode += getGetCLINIC_SCHEDULElistByWhereResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCLINIC_SCHEDULElistByWhereResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCLINIC_SCHEDULElistByWhereResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCLINIC_SCHEDULElistByWhereResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCLINIC_SCHEDULElistByWhereResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExTable"));
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
