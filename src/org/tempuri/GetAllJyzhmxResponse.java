/**
 * GetAllJyzhmxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllJyzhmxResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getAllJyzhmxResult;

    public GetAllJyzhmxResponse() {
    }

    public GetAllJyzhmxResponse(
           org.tempuri.ReturnExTable getAllJyzhmxResult) {
           this.getAllJyzhmxResult = getAllJyzhmxResult;
    }


    /**
     * Gets the getAllJyzhmxResult value for this GetAllJyzhmxResponse.
     * 
     * @return getAllJyzhmxResult
     */
    public org.tempuri.ReturnExTable getGetAllJyzhmxResult() {
        return getAllJyzhmxResult;
    }


    /**
     * Sets the getAllJyzhmxResult value for this GetAllJyzhmxResponse.
     * 
     * @param getAllJyzhmxResult
     */
    public void setGetAllJyzhmxResult(org.tempuri.ReturnExTable getAllJyzhmxResult) {
        this.getAllJyzhmxResult = getAllJyzhmxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllJyzhmxResponse)) return false;
        GetAllJyzhmxResponse other = (GetAllJyzhmxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllJyzhmxResult==null && other.getGetAllJyzhmxResult()==null) || 
             (this.getAllJyzhmxResult!=null &&
              this.getAllJyzhmxResult.equals(other.getGetAllJyzhmxResult())));
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
        if (getGetAllJyzhmxResult() != null) {
            _hashCode += getGetAllJyzhmxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllJyzhmxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllJyzhmxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllJyzhmxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllJyzhmxResult"));
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
