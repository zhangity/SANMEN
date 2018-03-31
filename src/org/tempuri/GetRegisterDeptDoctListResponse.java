/**
 * GetRegisterDeptDoctListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetRegisterDeptDoctListResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getRegisterDeptDoctListResult;

    public GetRegisterDeptDoctListResponse() {
    }

    public GetRegisterDeptDoctListResponse(
           org.tempuri.ReturnExTable getRegisterDeptDoctListResult) {
           this.getRegisterDeptDoctListResult = getRegisterDeptDoctListResult;
    }


    /**
     * Gets the getRegisterDeptDoctListResult value for this GetRegisterDeptDoctListResponse.
     * 
     * @return getRegisterDeptDoctListResult
     */
    public org.tempuri.ReturnExTable getGetRegisterDeptDoctListResult() {
        return getRegisterDeptDoctListResult;
    }


    /**
     * Sets the getRegisterDeptDoctListResult value for this GetRegisterDeptDoctListResponse.
     * 
     * @param getRegisterDeptDoctListResult
     */
    public void setGetRegisterDeptDoctListResult(org.tempuri.ReturnExTable getRegisterDeptDoctListResult) {
        this.getRegisterDeptDoctListResult = getRegisterDeptDoctListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRegisterDeptDoctListResponse)) return false;
        GetRegisterDeptDoctListResponse other = (GetRegisterDeptDoctListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getRegisterDeptDoctListResult==null && other.getGetRegisterDeptDoctListResult()==null) || 
             (this.getRegisterDeptDoctListResult!=null &&
              this.getRegisterDeptDoctListResult.equals(other.getGetRegisterDeptDoctListResult())));
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
        if (getGetRegisterDeptDoctListResult() != null) {
            _hashCode += getGetRegisterDeptDoctListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRegisterDeptDoctListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetRegisterDeptDoctListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getRegisterDeptDoctListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetRegisterDeptDoctListResult"));
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
