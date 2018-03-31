/**
 * GetCkfwTestResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCkfwTestResponse  implements java.io.Serializable {
    private org.tempuri.GetCkfwTestResponseGetCkfwTestResult getCkfwTestResult;

    public GetCkfwTestResponse() {
    }

    public GetCkfwTestResponse(
           org.tempuri.GetCkfwTestResponseGetCkfwTestResult getCkfwTestResult) {
           this.getCkfwTestResult = getCkfwTestResult;
    }


    /**
     * Gets the getCkfwTestResult value for this GetCkfwTestResponse.
     * 
     * @return getCkfwTestResult
     */
    public org.tempuri.GetCkfwTestResponseGetCkfwTestResult getGetCkfwTestResult() {
        return getCkfwTestResult;
    }


    /**
     * Sets the getCkfwTestResult value for this GetCkfwTestResponse.
     * 
     * @param getCkfwTestResult
     */
    public void setGetCkfwTestResult(org.tempuri.GetCkfwTestResponseGetCkfwTestResult getCkfwTestResult) {
        this.getCkfwTestResult = getCkfwTestResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCkfwTestResponse)) return false;
        GetCkfwTestResponse other = (GetCkfwTestResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCkfwTestResult==null && other.getGetCkfwTestResult()==null) || 
             (this.getCkfwTestResult!=null &&
              this.getCkfwTestResult.equals(other.getGetCkfwTestResult())));
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
        if (getGetCkfwTestResult() != null) {
            _hashCode += getGetCkfwTestResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCkfwTestResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCkfwTestResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCkfwTestResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCkfwTestResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetCkfwTestResponse>GetCkfwTestResult"));
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
