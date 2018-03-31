/**
 * Fun_DzxzResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Fun_DzxzResponse  implements java.io.Serializable {
    private java.lang.String fun_DzxzResult;

    public Fun_DzxzResponse() {
    }

    public Fun_DzxzResponse(
           java.lang.String fun_DzxzResult) {
           this.fun_DzxzResult = fun_DzxzResult;
    }


    /**
     * Gets the fun_DzxzResult value for this Fun_DzxzResponse.
     * 
     * @return fun_DzxzResult
     */
    public java.lang.String getFun_DzxzResult() {
        return fun_DzxzResult;
    }


    /**
     * Sets the fun_DzxzResult value for this Fun_DzxzResponse.
     * 
     * @param fun_DzxzResult
     */
    public void setFun_DzxzResult(java.lang.String fun_DzxzResult) {
        this.fun_DzxzResult = fun_DzxzResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Fun_DzxzResponse)) return false;
        Fun_DzxzResponse other = (Fun_DzxzResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fun_DzxzResult==null && other.getFun_DzxzResult()==null) || 
             (this.fun_DzxzResult!=null &&
              this.fun_DzxzResult.equals(other.getFun_DzxzResult())));
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
        if (getFun_DzxzResult() != null) {
            _hashCode += getFun_DzxzResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Fun_DzxzResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Fun_DzxzResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fun_DzxzResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Fun_DzxzResult"));
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
