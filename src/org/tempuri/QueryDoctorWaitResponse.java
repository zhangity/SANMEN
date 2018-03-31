/**
 * QueryDoctorWaitResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class QueryDoctorWaitResponse  implements java.io.Serializable {
    private org.tempuri.QueryDoctorWaitResponseQueryDoctorWaitResult queryDoctorWaitResult;

    public QueryDoctorWaitResponse() {
    }

    public QueryDoctorWaitResponse(
           org.tempuri.QueryDoctorWaitResponseQueryDoctorWaitResult queryDoctorWaitResult) {
           this.queryDoctorWaitResult = queryDoctorWaitResult;
    }


    /**
     * Gets the queryDoctorWaitResult value for this QueryDoctorWaitResponse.
     * 
     * @return queryDoctorWaitResult
     */
    public org.tempuri.QueryDoctorWaitResponseQueryDoctorWaitResult getQueryDoctorWaitResult() {
        return queryDoctorWaitResult;
    }


    /**
     * Sets the queryDoctorWaitResult value for this QueryDoctorWaitResponse.
     * 
     * @param queryDoctorWaitResult
     */
    public void setQueryDoctorWaitResult(org.tempuri.QueryDoctorWaitResponseQueryDoctorWaitResult queryDoctorWaitResult) {
        this.queryDoctorWaitResult = queryDoctorWaitResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryDoctorWaitResponse)) return false;
        QueryDoctorWaitResponse other = (QueryDoctorWaitResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryDoctorWaitResult==null && other.getQueryDoctorWaitResult()==null) || 
             (this.queryDoctorWaitResult!=null &&
              this.queryDoctorWaitResult.equals(other.getQueryDoctorWaitResult())));
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
        if (getQueryDoctorWaitResult() != null) {
            _hashCode += getQueryDoctorWaitResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryDoctorWaitResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">QueryDoctorWaitResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryDoctorWaitResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "QueryDoctorWaitResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>QueryDoctorWaitResponse>QueryDoctorWaitResult"));
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
