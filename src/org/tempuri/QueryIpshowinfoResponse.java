/**
 * QueryIpshowinfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class QueryIpshowinfoResponse  implements java.io.Serializable {
    private org.tempuri.QueryIpshowinfoResponseQueryIpshowinfoResult queryIpshowinfoResult;

    public QueryIpshowinfoResponse() {
    }

    public QueryIpshowinfoResponse(
           org.tempuri.QueryIpshowinfoResponseQueryIpshowinfoResult queryIpshowinfoResult) {
           this.queryIpshowinfoResult = queryIpshowinfoResult;
    }


    /**
     * Gets the queryIpshowinfoResult value for this QueryIpshowinfoResponse.
     * 
     * @return queryIpshowinfoResult
     */
    public org.tempuri.QueryIpshowinfoResponseQueryIpshowinfoResult getQueryIpshowinfoResult() {
        return queryIpshowinfoResult;
    }


    /**
     * Sets the queryIpshowinfoResult value for this QueryIpshowinfoResponse.
     * 
     * @param queryIpshowinfoResult
     */
    public void setQueryIpshowinfoResult(org.tempuri.QueryIpshowinfoResponseQueryIpshowinfoResult queryIpshowinfoResult) {
        this.queryIpshowinfoResult = queryIpshowinfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryIpshowinfoResponse)) return false;
        QueryIpshowinfoResponse other = (QueryIpshowinfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryIpshowinfoResult==null && other.getQueryIpshowinfoResult()==null) || 
             (this.queryIpshowinfoResult!=null &&
              this.queryIpshowinfoResult.equals(other.getQueryIpshowinfoResult())));
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
        if (getQueryIpshowinfoResult() != null) {
            _hashCode += getQueryIpshowinfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryIpshowinfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">QueryIpshowinfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryIpshowinfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "QueryIpshowinfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>QueryIpshowinfoResponse>QueryIpshowinfoResult"));
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
