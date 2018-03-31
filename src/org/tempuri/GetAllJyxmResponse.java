/**
 * GetAllJyxmResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllJyxmResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getAllJyxmResult;

    public GetAllJyxmResponse() {
    }

    public GetAllJyxmResponse(
           org.tempuri.ReturnExTable getAllJyxmResult) {
           this.getAllJyxmResult = getAllJyxmResult;
    }


    /**
     * Gets the getAllJyxmResult value for this GetAllJyxmResponse.
     * 
     * @return getAllJyxmResult
     */
    public org.tempuri.ReturnExTable getGetAllJyxmResult() {
        return getAllJyxmResult;
    }


    /**
     * Sets the getAllJyxmResult value for this GetAllJyxmResponse.
     * 
     * @param getAllJyxmResult
     */
    public void setGetAllJyxmResult(org.tempuri.ReturnExTable getAllJyxmResult) {
        this.getAllJyxmResult = getAllJyxmResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllJyxmResponse)) return false;
        GetAllJyxmResponse other = (GetAllJyxmResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllJyxmResult==null && other.getGetAllJyxmResult()==null) || 
             (this.getAllJyxmResult!=null &&
              this.getAllJyxmResult.equals(other.getGetAllJyxmResult())));
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
        if (getGetAllJyxmResult() != null) {
            _hashCode += getGetAllJyxmResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllJyxmResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllJyxmResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllJyxmResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllJyxmResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExTable"));
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
