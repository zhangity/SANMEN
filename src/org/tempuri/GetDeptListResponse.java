/**
 * GetDeptListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDeptListResponse  implements java.io.Serializable {
    private org.tempuri.PagedItemReturnObjectDataSet getDeptListResult;

    public GetDeptListResponse() {
    }

    public GetDeptListResponse(
           org.tempuri.PagedItemReturnObjectDataSet getDeptListResult) {
           this.getDeptListResult = getDeptListResult;
    }


    /**
     * Gets the getDeptListResult value for this GetDeptListResponse.
     * 
     * @return getDeptListResult
     */
    public org.tempuri.PagedItemReturnObjectDataSet getGetDeptListResult() {
        return getDeptListResult;
    }


    /**
     * Sets the getDeptListResult value for this GetDeptListResponse.
     * 
     * @param getDeptListResult
     */
    public void setGetDeptListResult(org.tempuri.PagedItemReturnObjectDataSet getDeptListResult) {
        this.getDeptListResult = getDeptListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDeptListResponse)) return false;
        GetDeptListResponse other = (GetDeptListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDeptListResult==null && other.getGetDeptListResult()==null) || 
             (this.getDeptListResult!=null &&
              this.getDeptListResult.equals(other.getGetDeptListResult())));
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
        if (getGetDeptListResult() != null) {
            _hashCode += getGetDeptListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDeptListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDeptListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDeptListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDeptListResult"));
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
