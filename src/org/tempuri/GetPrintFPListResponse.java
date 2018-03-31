/**
 * GetPrintFPListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPrintFPListResponse  implements java.io.Serializable {
    private org.tempuri.GetPrintFPListResponseGetPrintFPListResult getPrintFPListResult;

    public GetPrintFPListResponse() {
    }

    public GetPrintFPListResponse(
           org.tempuri.GetPrintFPListResponseGetPrintFPListResult getPrintFPListResult) {
           this.getPrintFPListResult = getPrintFPListResult;
    }


    /**
     * Gets the getPrintFPListResult value for this GetPrintFPListResponse.
     * 
     * @return getPrintFPListResult
     */
    public org.tempuri.GetPrintFPListResponseGetPrintFPListResult getGetPrintFPListResult() {
        return getPrintFPListResult;
    }


    /**
     * Sets the getPrintFPListResult value for this GetPrintFPListResponse.
     * 
     * @param getPrintFPListResult
     */
    public void setGetPrintFPListResult(org.tempuri.GetPrintFPListResponseGetPrintFPListResult getPrintFPListResult) {
        this.getPrintFPListResult = getPrintFPListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPrintFPListResponse)) return false;
        GetPrintFPListResponse other = (GetPrintFPListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPrintFPListResult==null && other.getGetPrintFPListResult()==null) || 
             (this.getPrintFPListResult!=null &&
              this.getPrintFPListResult.equals(other.getGetPrintFPListResult())));
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
        if (getGetPrintFPListResult() != null) {
            _hashCode += getGetPrintFPListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPrintFPListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPrintFPListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPrintFPListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPrintFPListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetPrintFPListResponse>GetPrintFPListResult"));
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
