/**
 * GetMzbrjbxxByCLINIC_IDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzbrjbxxByCLINIC_IDResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getMzbrjbxxByCLINIC_IDResult;

    public GetMzbrjbxxByCLINIC_IDResponse() {
    }

    public GetMzbrjbxxByCLINIC_IDResponse(
           org.tempuri.ReturnExTable getMzbrjbxxByCLINIC_IDResult) {
           this.getMzbrjbxxByCLINIC_IDResult = getMzbrjbxxByCLINIC_IDResult;
    }


    /**
     * Gets the getMzbrjbxxByCLINIC_IDResult value for this GetMzbrjbxxByCLINIC_IDResponse.
     * 
     * @return getMzbrjbxxByCLINIC_IDResult
     */
    public org.tempuri.ReturnExTable getGetMzbrjbxxByCLINIC_IDResult() {
        return getMzbrjbxxByCLINIC_IDResult;
    }


    /**
     * Sets the getMzbrjbxxByCLINIC_IDResult value for this GetMzbrjbxxByCLINIC_IDResponse.
     * 
     * @param getMzbrjbxxByCLINIC_IDResult
     */
    public void setGetMzbrjbxxByCLINIC_IDResult(org.tempuri.ReturnExTable getMzbrjbxxByCLINIC_IDResult) {
        this.getMzbrjbxxByCLINIC_IDResult = getMzbrjbxxByCLINIC_IDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzbrjbxxByCLINIC_IDResponse)) return false;
        GetMzbrjbxxByCLINIC_IDResponse other = (GetMzbrjbxxByCLINIC_IDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMzbrjbxxByCLINIC_IDResult==null && other.getGetMzbrjbxxByCLINIC_IDResult()==null) || 
             (this.getMzbrjbxxByCLINIC_IDResult!=null &&
              this.getMzbrjbxxByCLINIC_IDResult.equals(other.getGetMzbrjbxxByCLINIC_IDResult())));
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
        if (getGetMzbrjbxxByCLINIC_IDResult() != null) {
            _hashCode += getGetMzbrjbxxByCLINIC_IDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzbrjbxxByCLINIC_IDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzbrjbxxByCLINIC_IDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMzbrjbxxByCLINIC_IDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMzbrjbxxByCLINIC_IDResult"));
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
