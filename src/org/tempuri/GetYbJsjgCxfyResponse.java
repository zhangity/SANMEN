/**
 * GetYbJsjgCxfyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYbJsjgCxfyResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getYbJsjgCxfyResult;

    public GetYbJsjgCxfyResponse() {
    }

    public GetYbJsjgCxfyResponse(
           org.tempuri.ReturnExTable getYbJsjgCxfyResult) {
           this.getYbJsjgCxfyResult = getYbJsjgCxfyResult;
    }


    /**
     * Gets the getYbJsjgCxfyResult value for this GetYbJsjgCxfyResponse.
     * 
     * @return getYbJsjgCxfyResult
     */
    public org.tempuri.ReturnExTable getGetYbJsjgCxfyResult() {
        return getYbJsjgCxfyResult;
    }


    /**
     * Sets the getYbJsjgCxfyResult value for this GetYbJsjgCxfyResponse.
     * 
     * @param getYbJsjgCxfyResult
     */
    public void setGetYbJsjgCxfyResult(org.tempuri.ReturnExTable getYbJsjgCxfyResult) {
        this.getYbJsjgCxfyResult = getYbJsjgCxfyResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYbJsjgCxfyResponse)) return false;
        GetYbJsjgCxfyResponse other = (GetYbJsjgCxfyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getYbJsjgCxfyResult==null && other.getGetYbJsjgCxfyResult()==null) || 
             (this.getYbJsjgCxfyResult!=null &&
              this.getYbJsjgCxfyResult.equals(other.getGetYbJsjgCxfyResult())));
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
        if (getGetYbJsjgCxfyResult() != null) {
            _hashCode += getGetYbJsjgCxfyResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYbJsjgCxfyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYbJsjgCxfyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getYbJsjgCxfyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetYbJsjgCxfyResult"));
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
