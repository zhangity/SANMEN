/**
 * GetPringListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPringListResponse  implements java.io.Serializable {
    private org.tempuri.GetPringListResponseGetPringListResult getPringListResult;

    public GetPringListResponse() {
    }

    public GetPringListResponse(
           org.tempuri.GetPringListResponseGetPringListResult getPringListResult) {
           this.getPringListResult = getPringListResult;
    }


    /**
     * Gets the getPringListResult value for this GetPringListResponse.
     * 
     * @return getPringListResult
     */
    public org.tempuri.GetPringListResponseGetPringListResult getGetPringListResult() {
        return getPringListResult;
    }


    /**
     * Sets the getPringListResult value for this GetPringListResponse.
     * 
     * @param getPringListResult
     */
    public void setGetPringListResult(org.tempuri.GetPringListResponseGetPringListResult getPringListResult) {
        this.getPringListResult = getPringListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPringListResponse)) return false;
        GetPringListResponse other = (GetPringListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPringListResult==null && other.getGetPringListResult()==null) || 
             (this.getPringListResult!=null &&
              this.getPringListResult.equals(other.getGetPringListResult())));
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
        if (getGetPringListResult() != null) {
            _hashCode += getGetPringListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPringListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPringListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPringListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPringListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetPringListResponse>GetPringListResult"));
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
