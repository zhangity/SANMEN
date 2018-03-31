/**
 * GetCyxmJMCXXMResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCyxmJMCXXMResponse  implements java.io.Serializable {
    private org.tempuri.GetCyxmJMCXXMResponseGetCyxmJMCXXMResult getCyxmJMCXXMResult;

    public GetCyxmJMCXXMResponse() {
    }

    public GetCyxmJMCXXMResponse(
           org.tempuri.GetCyxmJMCXXMResponseGetCyxmJMCXXMResult getCyxmJMCXXMResult) {
           this.getCyxmJMCXXMResult = getCyxmJMCXXMResult;
    }


    /**
     * Gets the getCyxmJMCXXMResult value for this GetCyxmJMCXXMResponse.
     * 
     * @return getCyxmJMCXXMResult
     */
    public org.tempuri.GetCyxmJMCXXMResponseGetCyxmJMCXXMResult getGetCyxmJMCXXMResult() {
        return getCyxmJMCXXMResult;
    }


    /**
     * Sets the getCyxmJMCXXMResult value for this GetCyxmJMCXXMResponse.
     * 
     * @param getCyxmJMCXXMResult
     */
    public void setGetCyxmJMCXXMResult(org.tempuri.GetCyxmJMCXXMResponseGetCyxmJMCXXMResult getCyxmJMCXXMResult) {
        this.getCyxmJMCXXMResult = getCyxmJMCXXMResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCyxmJMCXXMResponse)) return false;
        GetCyxmJMCXXMResponse other = (GetCyxmJMCXXMResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCyxmJMCXXMResult==null && other.getGetCyxmJMCXXMResult()==null) || 
             (this.getCyxmJMCXXMResult!=null &&
              this.getCyxmJMCXXMResult.equals(other.getGetCyxmJMCXXMResult())));
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
        if (getGetCyxmJMCXXMResult() != null) {
            _hashCode += getGetCyxmJMCXXMResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCyxmJMCXXMResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCyxmJMCXXMResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCyxmJMCXXMResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCyxmJMCXXMResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetCyxmJMCXXMResponse>GetCyxmJMCXXMResult"));
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
