/**
 * ReportTheLossResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReportTheLossResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm reportTheLossResult;

    public ReportTheLossResponse() {
    }

    public ReportTheLossResponse(
           org.tempuri.ReturnExComm reportTheLossResult) {
           this.reportTheLossResult = reportTheLossResult;
    }


    /**
     * Gets the reportTheLossResult value for this ReportTheLossResponse.
     * 
     * @return reportTheLossResult
     */
    public org.tempuri.ReturnExComm getReportTheLossResult() {
        return reportTheLossResult;
    }


    /**
     * Sets the reportTheLossResult value for this ReportTheLossResponse.
     * 
     * @param reportTheLossResult
     */
    public void setReportTheLossResult(org.tempuri.ReturnExComm reportTheLossResult) {
        this.reportTheLossResult = reportTheLossResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportTheLossResponse)) return false;
        ReportTheLossResponse other = (ReportTheLossResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reportTheLossResult==null && other.getReportTheLossResult()==null) || 
             (this.reportTheLossResult!=null &&
              this.reportTheLossResult.equals(other.getReportTheLossResult())));
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
        if (getReportTheLossResult() != null) {
            _hashCode += getReportTheLossResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportTheLossResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReportTheLossResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportTheLossResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReportTheLossResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExComm"));
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
