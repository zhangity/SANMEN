/**
 * GetPageMenuListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPageMenuListResponse  implements java.io.Serializable {
    private org.tempuri.PagedItemReturnObjectDataSet getPageMenuListResult;

    public GetPageMenuListResponse() {
    }

    public GetPageMenuListResponse(
           org.tempuri.PagedItemReturnObjectDataSet getPageMenuListResult) {
           this.getPageMenuListResult = getPageMenuListResult;
    }


    /**
     * Gets the getPageMenuListResult value for this GetPageMenuListResponse.
     * 
     * @return getPageMenuListResult
     */
    public org.tempuri.PagedItemReturnObjectDataSet getGetPageMenuListResult() {
        return getPageMenuListResult;
    }


    /**
     * Sets the getPageMenuListResult value for this GetPageMenuListResponse.
     * 
     * @param getPageMenuListResult
     */
    public void setGetPageMenuListResult(org.tempuri.PagedItemReturnObjectDataSet getPageMenuListResult) {
        this.getPageMenuListResult = getPageMenuListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPageMenuListResponse)) return false;
        GetPageMenuListResponse other = (GetPageMenuListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPageMenuListResult==null && other.getGetPageMenuListResult()==null) || 
             (this.getPageMenuListResult!=null &&
              this.getPageMenuListResult.equals(other.getGetPageMenuListResult())));
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
        if (getGetPageMenuListResult() != null) {
            _hashCode += getGetPageMenuListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPageMenuListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPageMenuListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPageMenuListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPageMenuListResult"));
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
