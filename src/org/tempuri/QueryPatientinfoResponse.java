/**
 * QueryPatientinfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class QueryPatientinfoResponse  implements java.io.Serializable {
    private org.tempuri.QueryPatientinfoResponseQueryPatientinfoResult queryPatientinfoResult;

    public QueryPatientinfoResponse() {
    }

    public QueryPatientinfoResponse(
           org.tempuri.QueryPatientinfoResponseQueryPatientinfoResult queryPatientinfoResult) {
           this.queryPatientinfoResult = queryPatientinfoResult;
    }


    /**
     * Gets the queryPatientinfoResult value for this QueryPatientinfoResponse.
     * 
     * @return queryPatientinfoResult
     */
    public org.tempuri.QueryPatientinfoResponseQueryPatientinfoResult getQueryPatientinfoResult() {
        return queryPatientinfoResult;
    }


    /**
     * Sets the queryPatientinfoResult value for this QueryPatientinfoResponse.
     * 
     * @param queryPatientinfoResult
     */
    public void setQueryPatientinfoResult(org.tempuri.QueryPatientinfoResponseQueryPatientinfoResult queryPatientinfoResult) {
        this.queryPatientinfoResult = queryPatientinfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPatientinfoResponse)) return false;
        QueryPatientinfoResponse other = (QueryPatientinfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryPatientinfoResult==null && other.getQueryPatientinfoResult()==null) || 
             (this.queryPatientinfoResult!=null &&
              this.queryPatientinfoResult.equals(other.getQueryPatientinfoResult())));
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
        if (getQueryPatientinfoResult() != null) {
            _hashCode += getQueryPatientinfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryPatientinfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">QueryPatientinfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryPatientinfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "QueryPatientinfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>QueryPatientinfoResponse>QueryPatientinfoResult"));
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
