/**
 * GetAllJcxmResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllJcxmResponse  implements java.io.Serializable {
    private org.tempuri.GetAllJcxmResponseGetAllJcxmResult getAllJcxmResult;

    public GetAllJcxmResponse() {
    }

    public GetAllJcxmResponse(
           org.tempuri.GetAllJcxmResponseGetAllJcxmResult getAllJcxmResult) {
           this.getAllJcxmResult = getAllJcxmResult;
    }


    /**
     * Gets the getAllJcxmResult value for this GetAllJcxmResponse.
     * 
     * @return getAllJcxmResult
     */
    public org.tempuri.GetAllJcxmResponseGetAllJcxmResult getGetAllJcxmResult() {
        return getAllJcxmResult;
    }


    /**
     * Sets the getAllJcxmResult value for this GetAllJcxmResponse.
     * 
     * @param getAllJcxmResult
     */
    public void setGetAllJcxmResult(org.tempuri.GetAllJcxmResponseGetAllJcxmResult getAllJcxmResult) {
        this.getAllJcxmResult = getAllJcxmResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllJcxmResponse)) return false;
        GetAllJcxmResponse other = (GetAllJcxmResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllJcxmResult==null && other.getGetAllJcxmResult()==null) || 
             (this.getAllJcxmResult!=null &&
              this.getAllJcxmResult.equals(other.getGetAllJcxmResult())));
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
        if (getGetAllJcxmResult() != null) {
            _hashCode += getGetAllJcxmResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllJcxmResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllJcxmResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllJcxmResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllJcxmResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetAllJcxmResponse>GetAllJcxmResult"));
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
