/**
 * GetCkReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCkReportResponse  implements java.io.Serializable {
    private org.tempuri.GetCkReportResponseGetCkReportResult getCkReportResult;

    public GetCkReportResponse() {
    }

    public GetCkReportResponse(
           org.tempuri.GetCkReportResponseGetCkReportResult getCkReportResult) {
           this.getCkReportResult = getCkReportResult;
    }


    /**
     * Gets the getCkReportResult value for this GetCkReportResponse.
     * 
     * @return getCkReportResult
     */
    public org.tempuri.GetCkReportResponseGetCkReportResult getGetCkReportResult() {
        return getCkReportResult;
    }


    /**
     * Sets the getCkReportResult value for this GetCkReportResponse.
     * 
     * @param getCkReportResult
     */
    public void setGetCkReportResult(org.tempuri.GetCkReportResponseGetCkReportResult getCkReportResult) {
        this.getCkReportResult = getCkReportResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCkReportResponse)) return false;
        GetCkReportResponse other = (GetCkReportResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCkReportResult==null && other.getGetCkReportResult()==null) || 
             (this.getCkReportResult!=null &&
              this.getCkReportResult.equals(other.getGetCkReportResult())));
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
        if (getGetCkReportResult() != null) {
            _hashCode += getGetCkReportResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCkReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCkReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCkReportResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCkReportResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetCkReportResponse>GetCkReportResult"));
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
