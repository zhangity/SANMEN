/**
 * GetKSZTGRXMResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetKSZTGRXMResponse  implements java.io.Serializable {
    private org.tempuri.GetKSZTGRXMResponseGetKSZTGRXMResult getKSZTGRXMResult;

    public GetKSZTGRXMResponse() {
    }

    public GetKSZTGRXMResponse(
           org.tempuri.GetKSZTGRXMResponseGetKSZTGRXMResult getKSZTGRXMResult) {
           this.getKSZTGRXMResult = getKSZTGRXMResult;
    }


    /**
     * Gets the getKSZTGRXMResult value for this GetKSZTGRXMResponse.
     * 
     * @return getKSZTGRXMResult
     */
    public org.tempuri.GetKSZTGRXMResponseGetKSZTGRXMResult getGetKSZTGRXMResult() {
        return getKSZTGRXMResult;
    }


    /**
     * Sets the getKSZTGRXMResult value for this GetKSZTGRXMResponse.
     * 
     * @param getKSZTGRXMResult
     */
    public void setGetKSZTGRXMResult(org.tempuri.GetKSZTGRXMResponseGetKSZTGRXMResult getKSZTGRXMResult) {
        this.getKSZTGRXMResult = getKSZTGRXMResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetKSZTGRXMResponse)) return false;
        GetKSZTGRXMResponse other = (GetKSZTGRXMResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getKSZTGRXMResult==null && other.getGetKSZTGRXMResult()==null) || 
             (this.getKSZTGRXMResult!=null &&
              this.getKSZTGRXMResult.equals(other.getGetKSZTGRXMResult())));
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
        if (getGetKSZTGRXMResult() != null) {
            _hashCode += getGetKSZTGRXMResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetKSZTGRXMResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetKSZTGRXMResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getKSZTGRXMResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetKSZTGRXMResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetKSZTGRXMResponse>GetKSZTGRXMResult"));
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
