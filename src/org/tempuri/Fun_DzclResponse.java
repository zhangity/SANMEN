/**
 * Fun_DzclResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Fun_DzclResponse  implements java.io.Serializable {
    private java.lang.String fun_DzclResult;

    public Fun_DzclResponse() {
    }

    public Fun_DzclResponse(
           java.lang.String fun_DzclResult) {
           this.fun_DzclResult = fun_DzclResult;
    }


    /**
     * Gets the fun_DzclResult value for this Fun_DzclResponse.
     * 
     * @return fun_DzclResult
     */
    public java.lang.String getFun_DzclResult() {
        return fun_DzclResult;
    }


    /**
     * Sets the fun_DzclResult value for this Fun_DzclResponse.
     * 
     * @param fun_DzclResult
     */
    public void setFun_DzclResult(java.lang.String fun_DzclResult) {
        this.fun_DzclResult = fun_DzclResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Fun_DzclResponse)) return false;
        Fun_DzclResponse other = (Fun_DzclResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fun_DzclResult==null && other.getFun_DzclResult()==null) || 
             (this.fun_DzclResult!=null &&
              this.fun_DzclResult.equals(other.getFun_DzclResult())));
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
        if (getFun_DzclResult() != null) {
            _hashCode += getFun_DzclResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Fun_DzclResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Fun_DzclResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fun_DzclResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Fun_DzclResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
