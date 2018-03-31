/**
 * GetCyjcxmResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCyjcxmResponse  implements java.io.Serializable {
    private org.tempuri.GetCyjcxmResponseGetCyjcxmResult getCyjcxmResult;

    public GetCyjcxmResponse() {
    }

    public GetCyjcxmResponse(
           org.tempuri.GetCyjcxmResponseGetCyjcxmResult getCyjcxmResult) {
           this.getCyjcxmResult = getCyjcxmResult;
    }


    /**
     * Gets the getCyjcxmResult value for this GetCyjcxmResponse.
     * 
     * @return getCyjcxmResult
     */
    public org.tempuri.GetCyjcxmResponseGetCyjcxmResult getGetCyjcxmResult() {
        return getCyjcxmResult;
    }


    /**
     * Sets the getCyjcxmResult value for this GetCyjcxmResponse.
     * 
     * @param getCyjcxmResult
     */
    public void setGetCyjcxmResult(org.tempuri.GetCyjcxmResponseGetCyjcxmResult getCyjcxmResult) {
        this.getCyjcxmResult = getCyjcxmResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCyjcxmResponse)) return false;
        GetCyjcxmResponse other = (GetCyjcxmResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCyjcxmResult==null && other.getGetCyjcxmResult()==null) || 
             (this.getCyjcxmResult!=null &&
              this.getCyjcxmResult.equals(other.getGetCyjcxmResult())));
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
        if (getGetCyjcxmResult() != null) {
            _hashCode += getGetCyjcxmResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCyjcxmResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCyjcxmResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCyjcxmResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCyjcxmResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetCyjcxmResponse>GetCyjcxmResult"));
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
