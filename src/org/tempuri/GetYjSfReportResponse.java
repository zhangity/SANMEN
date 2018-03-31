/**
 * GetYjSfReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYjSfReportResponse  implements java.io.Serializable {
    private org.tempuri.GetYjSfReportResponseGetYjSfReportResult getYjSfReportResult;

    public GetYjSfReportResponse() {
    }

    public GetYjSfReportResponse(
           org.tempuri.GetYjSfReportResponseGetYjSfReportResult getYjSfReportResult) {
           this.getYjSfReportResult = getYjSfReportResult;
    }


    /**
     * Gets the getYjSfReportResult value for this GetYjSfReportResponse.
     * 
     * @return getYjSfReportResult
     */
    public org.tempuri.GetYjSfReportResponseGetYjSfReportResult getGetYjSfReportResult() {
        return getYjSfReportResult;
    }


    /**
     * Sets the getYjSfReportResult value for this GetYjSfReportResponse.
     * 
     * @param getYjSfReportResult
     */
    public void setGetYjSfReportResult(org.tempuri.GetYjSfReportResponseGetYjSfReportResult getYjSfReportResult) {
        this.getYjSfReportResult = getYjSfReportResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYjSfReportResponse)) return false;
        GetYjSfReportResponse other = (GetYjSfReportResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getYjSfReportResult==null && other.getGetYjSfReportResult()==null) || 
             (this.getYjSfReportResult!=null &&
              this.getYjSfReportResult.equals(other.getGetYjSfReportResult())));
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
        if (getGetYjSfReportResult() != null) {
            _hashCode += getGetYjSfReportResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYjSfReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYjSfReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getYjSfReportResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetYjSfReportResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetYjSfReportResponse>GetYjSfReportResult"));
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
