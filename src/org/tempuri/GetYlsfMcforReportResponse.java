/**
 * GetYlsfMcforReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYlsfMcforReportResponse  implements java.io.Serializable {
    private org.tempuri.GetYlsfMcforReportResponseGetYlsfMcforReportResult getYlsfMcforReportResult;

    public GetYlsfMcforReportResponse() {
    }

    public GetYlsfMcforReportResponse(
           org.tempuri.GetYlsfMcforReportResponseGetYlsfMcforReportResult getYlsfMcforReportResult) {
           this.getYlsfMcforReportResult = getYlsfMcforReportResult;
    }


    /**
     * Gets the getYlsfMcforReportResult value for this GetYlsfMcforReportResponse.
     * 
     * @return getYlsfMcforReportResult
     */
    public org.tempuri.GetYlsfMcforReportResponseGetYlsfMcforReportResult getGetYlsfMcforReportResult() {
        return getYlsfMcforReportResult;
    }


    /**
     * Sets the getYlsfMcforReportResult value for this GetYlsfMcforReportResponse.
     * 
     * @param getYlsfMcforReportResult
     */
    public void setGetYlsfMcforReportResult(org.tempuri.GetYlsfMcforReportResponseGetYlsfMcforReportResult getYlsfMcforReportResult) {
        this.getYlsfMcforReportResult = getYlsfMcforReportResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYlsfMcforReportResponse)) return false;
        GetYlsfMcforReportResponse other = (GetYlsfMcforReportResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getYlsfMcforReportResult==null && other.getGetYlsfMcforReportResult()==null) || 
             (this.getYlsfMcforReportResult!=null &&
              this.getYlsfMcforReportResult.equals(other.getGetYlsfMcforReportResult())));
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
        if (getGetYlsfMcforReportResult() != null) {
            _hashCode += getGetYlsfMcforReportResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYlsfMcforReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYlsfMcforReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getYlsfMcforReportResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetYlsfMcforReportResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetYlsfMcforReportResponse>GetYlsfMcforReportResult"));
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
