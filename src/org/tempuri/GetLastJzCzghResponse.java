/**
 * GetLastJzCzghResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetLastJzCzghResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getLastJzCzghResult;

    public GetLastJzCzghResponse() {
    }

    public GetLastJzCzghResponse(
           org.tempuri.ReturnExTable getLastJzCzghResult) {
           this.getLastJzCzghResult = getLastJzCzghResult;
    }


    /**
     * Gets the getLastJzCzghResult value for this GetLastJzCzghResponse.
     * 
     * @return getLastJzCzghResult
     */
    public org.tempuri.ReturnExTable getGetLastJzCzghResult() {
        return getLastJzCzghResult;
    }


    /**
     * Sets the getLastJzCzghResult value for this GetLastJzCzghResponse.
     * 
     * @param getLastJzCzghResult
     */
    public void setGetLastJzCzghResult(org.tempuri.ReturnExTable getLastJzCzghResult) {
        this.getLastJzCzghResult = getLastJzCzghResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLastJzCzghResponse)) return false;
        GetLastJzCzghResponse other = (GetLastJzCzghResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getLastJzCzghResult==null && other.getGetLastJzCzghResult()==null) || 
             (this.getLastJzCzghResult!=null &&
              this.getLastJzCzghResult.equals(other.getGetLastJzCzghResult())));
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
        if (getGetLastJzCzghResult() != null) {
            _hashCode += getGetLastJzCzghResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLastJzCzghResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetLastJzCzghResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getLastJzCzghResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetLastJzCzghResult"));
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
