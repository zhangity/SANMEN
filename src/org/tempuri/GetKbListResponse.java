/**
 * GetKbListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetKbListResponse  implements java.io.Serializable {
    private org.tempuri.GetKbListResponseGetKbListResult getKbListResult;

    public GetKbListResponse() {
    }

    public GetKbListResponse(
           org.tempuri.GetKbListResponseGetKbListResult getKbListResult) {
           this.getKbListResult = getKbListResult;
    }


    /**
     * Gets the getKbListResult value for this GetKbListResponse.
     * 
     * @return getKbListResult
     */
    public org.tempuri.GetKbListResponseGetKbListResult getGetKbListResult() {
        return getKbListResult;
    }


    /**
     * Sets the getKbListResult value for this GetKbListResponse.
     * 
     * @param getKbListResult
     */
    public void setGetKbListResult(org.tempuri.GetKbListResponseGetKbListResult getKbListResult) {
        this.getKbListResult = getKbListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetKbListResponse)) return false;
        GetKbListResponse other = (GetKbListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getKbListResult==null && other.getGetKbListResult()==null) || 
             (this.getKbListResult!=null &&
              this.getKbListResult.equals(other.getGetKbListResult())));
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
        if (getGetKbListResult() != null) {
            _hashCode += getGetKbListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetKbListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetKbListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getKbListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetKbListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetKbListResponse>GetKbListResult"));
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
