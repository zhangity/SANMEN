/**
 * GetYsYjMxforReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYsYjMxforReportResponse  implements java.io.Serializable {
    private org.tempuri.GetYsYjMxforReportResponseGetYsYjMxforReportResult getYsYjMxforReportResult;

    public GetYsYjMxforReportResponse() {
    }

    public GetYsYjMxforReportResponse(
           org.tempuri.GetYsYjMxforReportResponseGetYsYjMxforReportResult getYsYjMxforReportResult) {
           this.getYsYjMxforReportResult = getYsYjMxforReportResult;
    }


    /**
     * Gets the getYsYjMxforReportResult value for this GetYsYjMxforReportResponse.
     * 
     * @return getYsYjMxforReportResult
     */
    public org.tempuri.GetYsYjMxforReportResponseGetYsYjMxforReportResult getGetYsYjMxforReportResult() {
        return getYsYjMxforReportResult;
    }


    /**
     * Sets the getYsYjMxforReportResult value for this GetYsYjMxforReportResponse.
     * 
     * @param getYsYjMxforReportResult
     */
    public void setGetYsYjMxforReportResult(org.tempuri.GetYsYjMxforReportResponseGetYsYjMxforReportResult getYsYjMxforReportResult) {
        this.getYsYjMxforReportResult = getYsYjMxforReportResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYsYjMxforReportResponse)) return false;
        GetYsYjMxforReportResponse other = (GetYsYjMxforReportResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getYsYjMxforReportResult==null && other.getGetYsYjMxforReportResult()==null) || 
             (this.getYsYjMxforReportResult!=null &&
              this.getYsYjMxforReportResult.equals(other.getGetYsYjMxforReportResult())));
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
        if (getGetYsYjMxforReportResult() != null) {
            _hashCode += getGetYsYjMxforReportResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYsYjMxforReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYsYjMxforReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getYsYjMxforReportResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetYsYjMxforReportResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetYsYjMxforReportResponse>GetYsYjMxforReportResult"));
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
