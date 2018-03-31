/**
 * GetMxfyhsReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMxfyhsReportResponse  implements java.io.Serializable {
    private org.tempuri.GetMxfyhsReportResponseGetMxfyhsReportResult getMxfyhsReportResult;

    public GetMxfyhsReportResponse() {
    }

    public GetMxfyhsReportResponse(
           org.tempuri.GetMxfyhsReportResponseGetMxfyhsReportResult getMxfyhsReportResult) {
           this.getMxfyhsReportResult = getMxfyhsReportResult;
    }


    /**
     * Gets the getMxfyhsReportResult value for this GetMxfyhsReportResponse.
     * 
     * @return getMxfyhsReportResult
     */
    public org.tempuri.GetMxfyhsReportResponseGetMxfyhsReportResult getGetMxfyhsReportResult() {
        return getMxfyhsReportResult;
    }


    /**
     * Sets the getMxfyhsReportResult value for this GetMxfyhsReportResponse.
     * 
     * @param getMxfyhsReportResult
     */
    public void setGetMxfyhsReportResult(org.tempuri.GetMxfyhsReportResponseGetMxfyhsReportResult getMxfyhsReportResult) {
        this.getMxfyhsReportResult = getMxfyhsReportResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMxfyhsReportResponse)) return false;
        GetMxfyhsReportResponse other = (GetMxfyhsReportResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMxfyhsReportResult==null && other.getGetMxfyhsReportResult()==null) || 
             (this.getMxfyhsReportResult!=null &&
              this.getMxfyhsReportResult.equals(other.getGetMxfyhsReportResult())));
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
        if (getGetMxfyhsReportResult() != null) {
            _hashCode += getGetMxfyhsReportResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMxfyhsReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMxfyhsReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMxfyhsReportResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMxfyhsReportResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetMxfyhsReportResponse>GetMxfyhsReportResult"));
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
