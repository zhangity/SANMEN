/**
 * GetGhMzSrHzReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetGhMzSrHzReportResponse  implements java.io.Serializable {
    private org.tempuri.GetGhMzSrHzReportResponseGetGhMzSrHzReportResult getGhMzSrHzReportResult;

    public GetGhMzSrHzReportResponse() {
    }

    public GetGhMzSrHzReportResponse(
           org.tempuri.GetGhMzSrHzReportResponseGetGhMzSrHzReportResult getGhMzSrHzReportResult) {
           this.getGhMzSrHzReportResult = getGhMzSrHzReportResult;
    }


    /**
     * Gets the getGhMzSrHzReportResult value for this GetGhMzSrHzReportResponse.
     * 
     * @return getGhMzSrHzReportResult
     */
    public org.tempuri.GetGhMzSrHzReportResponseGetGhMzSrHzReportResult getGetGhMzSrHzReportResult() {
        return getGhMzSrHzReportResult;
    }


    /**
     * Sets the getGhMzSrHzReportResult value for this GetGhMzSrHzReportResponse.
     * 
     * @param getGhMzSrHzReportResult
     */
    public void setGetGhMzSrHzReportResult(org.tempuri.GetGhMzSrHzReportResponseGetGhMzSrHzReportResult getGhMzSrHzReportResult) {
        this.getGhMzSrHzReportResult = getGhMzSrHzReportResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGhMzSrHzReportResponse)) return false;
        GetGhMzSrHzReportResponse other = (GetGhMzSrHzReportResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getGhMzSrHzReportResult==null && other.getGetGhMzSrHzReportResult()==null) || 
             (this.getGhMzSrHzReportResult!=null &&
              this.getGhMzSrHzReportResult.equals(other.getGetGhMzSrHzReportResult())));
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
        if (getGetGhMzSrHzReportResult() != null) {
            _hashCode += getGetGhMzSrHzReportResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGhMzSrHzReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetGhMzSrHzReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getGhMzSrHzReportResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetGhMzSrHzReportResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetGhMzSrHzReportResponse>GetGhMzSrHzReportResult"));
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
