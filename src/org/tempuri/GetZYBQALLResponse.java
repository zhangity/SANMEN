/**
 * GetZYBQALLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetZYBQALLResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getZYBQALLResult;

    public GetZYBQALLResponse() {
    }

    public GetZYBQALLResponse(
           org.tempuri.ReturnExTable getZYBQALLResult) {
           this.getZYBQALLResult = getZYBQALLResult;
    }


    /**
     * Gets the getZYBQALLResult value for this GetZYBQALLResponse.
     * 
     * @return getZYBQALLResult
     */
    public org.tempuri.ReturnExTable getGetZYBQALLResult() {
        return getZYBQALLResult;
    }


    /**
     * Sets the getZYBQALLResult value for this GetZYBQALLResponse.
     * 
     * @param getZYBQALLResult
     */
    public void setGetZYBQALLResult(org.tempuri.ReturnExTable getZYBQALLResult) {
        this.getZYBQALLResult = getZYBQALLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZYBQALLResponse)) return false;
        GetZYBQALLResponse other = (GetZYBQALLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getZYBQALLResult==null && other.getGetZYBQALLResult()==null) || 
             (this.getZYBQALLResult!=null &&
              this.getZYBQALLResult.equals(other.getGetZYBQALLResult())));
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
        if (getGetZYBQALLResult() != null) {
            _hashCode += getGetZYBQALLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZYBQALLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetZYBQALLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getZYBQALLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetZYBQALLResult"));
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
