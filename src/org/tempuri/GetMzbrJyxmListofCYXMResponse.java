/**
 * GetMzbrJyxmListofCYXMResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzbrJyxmListofCYXMResponse  implements java.io.Serializable {
    private org.tempuri.GetMzbrJyxmListofCYXMResponseGetMzbrJyxmListofCYXMResult getMzbrJyxmListofCYXMResult;

    public GetMzbrJyxmListofCYXMResponse() {
    }

    public GetMzbrJyxmListofCYXMResponse(
           org.tempuri.GetMzbrJyxmListofCYXMResponseGetMzbrJyxmListofCYXMResult getMzbrJyxmListofCYXMResult) {
           this.getMzbrJyxmListofCYXMResult = getMzbrJyxmListofCYXMResult;
    }


    /**
     * Gets the getMzbrJyxmListofCYXMResult value for this GetMzbrJyxmListofCYXMResponse.
     * 
     * @return getMzbrJyxmListofCYXMResult
     */
    public org.tempuri.GetMzbrJyxmListofCYXMResponseGetMzbrJyxmListofCYXMResult getGetMzbrJyxmListofCYXMResult() {
        return getMzbrJyxmListofCYXMResult;
    }


    /**
     * Sets the getMzbrJyxmListofCYXMResult value for this GetMzbrJyxmListofCYXMResponse.
     * 
     * @param getMzbrJyxmListofCYXMResult
     */
    public void setGetMzbrJyxmListofCYXMResult(org.tempuri.GetMzbrJyxmListofCYXMResponseGetMzbrJyxmListofCYXMResult getMzbrJyxmListofCYXMResult) {
        this.getMzbrJyxmListofCYXMResult = getMzbrJyxmListofCYXMResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzbrJyxmListofCYXMResponse)) return false;
        GetMzbrJyxmListofCYXMResponse other = (GetMzbrJyxmListofCYXMResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMzbrJyxmListofCYXMResult==null && other.getGetMzbrJyxmListofCYXMResult()==null) || 
             (this.getMzbrJyxmListofCYXMResult!=null &&
              this.getMzbrJyxmListofCYXMResult.equals(other.getGetMzbrJyxmListofCYXMResult())));
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
        if (getGetMzbrJyxmListofCYXMResult() != null) {
            _hashCode += getGetMzbrJyxmListofCYXMResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzbrJyxmListofCYXMResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzbrJyxmListofCYXMResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMzbrJyxmListofCYXMResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMzbrJyxmListofCYXMResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetMzbrJyxmListofCYXMResponse>GetMzbrJyxmListofCYXMResult"));
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
