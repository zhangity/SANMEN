/**
 * QueryReadyPatientinfoTvResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class QueryReadyPatientinfoTvResponse  implements java.io.Serializable {
    private org.tempuri.QueryReadyPatientinfoTvResponseQueryReadyPatientinfoTvResult queryReadyPatientinfoTvResult;

    public QueryReadyPatientinfoTvResponse() {
    }

    public QueryReadyPatientinfoTvResponse(
           org.tempuri.QueryReadyPatientinfoTvResponseQueryReadyPatientinfoTvResult queryReadyPatientinfoTvResult) {
           this.queryReadyPatientinfoTvResult = queryReadyPatientinfoTvResult;
    }


    /**
     * Gets the queryReadyPatientinfoTvResult value for this QueryReadyPatientinfoTvResponse.
     * 
     * @return queryReadyPatientinfoTvResult
     */
    public org.tempuri.QueryReadyPatientinfoTvResponseQueryReadyPatientinfoTvResult getQueryReadyPatientinfoTvResult() {
        return queryReadyPatientinfoTvResult;
    }


    /**
     * Sets the queryReadyPatientinfoTvResult value for this QueryReadyPatientinfoTvResponse.
     * 
     * @param queryReadyPatientinfoTvResult
     */
    public void setQueryReadyPatientinfoTvResult(org.tempuri.QueryReadyPatientinfoTvResponseQueryReadyPatientinfoTvResult queryReadyPatientinfoTvResult) {
        this.queryReadyPatientinfoTvResult = queryReadyPatientinfoTvResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryReadyPatientinfoTvResponse)) return false;
        QueryReadyPatientinfoTvResponse other = (QueryReadyPatientinfoTvResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryReadyPatientinfoTvResult==null && other.getQueryReadyPatientinfoTvResult()==null) || 
             (this.queryReadyPatientinfoTvResult!=null &&
              this.queryReadyPatientinfoTvResult.equals(other.getQueryReadyPatientinfoTvResult())));
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
        if (getQueryReadyPatientinfoTvResult() != null) {
            _hashCode += getQueryReadyPatientinfoTvResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryReadyPatientinfoTvResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">QueryReadyPatientinfoTvResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryReadyPatientinfoTvResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "QueryReadyPatientinfoTvResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>QueryReadyPatientinfoTvResponse>QueryReadyPatientinfoTvResult"));
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
