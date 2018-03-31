/**
 * QueryPatientinfoWjzResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class QueryPatientinfoWjzResponse  implements java.io.Serializable {
    private org.tempuri.QueryPatientinfoWjzResponseQueryPatientinfoWjzResult queryPatientinfoWjzResult;

    public QueryPatientinfoWjzResponse() {
    }

    public QueryPatientinfoWjzResponse(
           org.tempuri.QueryPatientinfoWjzResponseQueryPatientinfoWjzResult queryPatientinfoWjzResult) {
           this.queryPatientinfoWjzResult = queryPatientinfoWjzResult;
    }


    /**
     * Gets the queryPatientinfoWjzResult value for this QueryPatientinfoWjzResponse.
     * 
     * @return queryPatientinfoWjzResult
     */
    public org.tempuri.QueryPatientinfoWjzResponseQueryPatientinfoWjzResult getQueryPatientinfoWjzResult() {
        return queryPatientinfoWjzResult;
    }


    /**
     * Sets the queryPatientinfoWjzResult value for this QueryPatientinfoWjzResponse.
     * 
     * @param queryPatientinfoWjzResult
     */
    public void setQueryPatientinfoWjzResult(org.tempuri.QueryPatientinfoWjzResponseQueryPatientinfoWjzResult queryPatientinfoWjzResult) {
        this.queryPatientinfoWjzResult = queryPatientinfoWjzResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPatientinfoWjzResponse)) return false;
        QueryPatientinfoWjzResponse other = (QueryPatientinfoWjzResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryPatientinfoWjzResult==null && other.getQueryPatientinfoWjzResult()==null) || 
             (this.queryPatientinfoWjzResult!=null &&
              this.queryPatientinfoWjzResult.equals(other.getQueryPatientinfoWjzResult())));
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
        if (getQueryPatientinfoWjzResult() != null) {
            _hashCode += getQueryPatientinfoWjzResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryPatientinfoWjzResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">QueryPatientinfoWjzResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryPatientinfoWjzResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "QueryPatientinfoWjzResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>QueryPatientinfoWjzResponse>QueryPatientinfoWjzResult"));
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
