/**
 * GetTysListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetTysListResponse  implements java.io.Serializable {
    private org.tempuri.GetTysListResponseGetTysListResult getTysListResult;

    public GetTysListResponse() {
    }

    public GetTysListResponse(
           org.tempuri.GetTysListResponseGetTysListResult getTysListResult) {
           this.getTysListResult = getTysListResult;
    }


    /**
     * Gets the getTysListResult value for this GetTysListResponse.
     * 
     * @return getTysListResult
     */
    public org.tempuri.GetTysListResponseGetTysListResult getGetTysListResult() {
        return getTysListResult;
    }


    /**
     * Sets the getTysListResult value for this GetTysListResponse.
     * 
     * @param getTysListResult
     */
    public void setGetTysListResult(org.tempuri.GetTysListResponseGetTysListResult getTysListResult) {
        this.getTysListResult = getTysListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTysListResponse)) return false;
        GetTysListResponse other = (GetTysListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTysListResult==null && other.getGetTysListResult()==null) || 
             (this.getTysListResult!=null &&
              this.getTysListResult.equals(other.getGetTysListResult())));
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
        if (getGetTysListResult() != null) {
            _hashCode += getGetTysListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTysListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetTysListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTysListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetTysListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetTysListResponse>GetTysListResult"));
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
