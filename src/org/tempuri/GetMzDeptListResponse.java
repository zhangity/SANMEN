/**
 * GetMzDeptListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzDeptListResponse  implements java.io.Serializable {
    private org.tempuri.PagedItemReturnObjectDataSet getMzDeptListResult;

    public GetMzDeptListResponse() {
    }

    public GetMzDeptListResponse(
           org.tempuri.PagedItemReturnObjectDataSet getMzDeptListResult) {
           this.getMzDeptListResult = getMzDeptListResult;
    }


    /**
     * Gets the getMzDeptListResult value for this GetMzDeptListResponse.
     * 
     * @return getMzDeptListResult
     */
    public org.tempuri.PagedItemReturnObjectDataSet getGetMzDeptListResult() {
        return getMzDeptListResult;
    }


    /**
     * Sets the getMzDeptListResult value for this GetMzDeptListResponse.
     * 
     * @param getMzDeptListResult
     */
    public void setGetMzDeptListResult(org.tempuri.PagedItemReturnObjectDataSet getMzDeptListResult) {
        this.getMzDeptListResult = getMzDeptListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzDeptListResponse)) return false;
        GetMzDeptListResponse other = (GetMzDeptListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMzDeptListResult==null && other.getGetMzDeptListResult()==null) || 
             (this.getMzDeptListResult!=null &&
              this.getMzDeptListResult.equals(other.getGetMzDeptListResult())));
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
        if (getGetMzDeptListResult() != null) {
            _hashCode += getGetMzDeptListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzDeptListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzDeptListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMzDeptListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMzDeptListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "PagedItemReturnObjectDataSet"));
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
