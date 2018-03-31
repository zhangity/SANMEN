/**
 * GetGhMzxxSfHzHjResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetGhMzxxSfHzHjResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getGhMzxxSfHzHjResult;

    public GetGhMzxxSfHzHjResponse() {
    }

    public GetGhMzxxSfHzHjResponse(
           org.tempuri.ReturnExTable getGhMzxxSfHzHjResult) {
           this.getGhMzxxSfHzHjResult = getGhMzxxSfHzHjResult;
    }


    /**
     * Gets the getGhMzxxSfHzHjResult value for this GetGhMzxxSfHzHjResponse.
     * 
     * @return getGhMzxxSfHzHjResult
     */
    public org.tempuri.ReturnExTable getGetGhMzxxSfHzHjResult() {
        return getGhMzxxSfHzHjResult;
    }


    /**
     * Sets the getGhMzxxSfHzHjResult value for this GetGhMzxxSfHzHjResponse.
     * 
     * @param getGhMzxxSfHzHjResult
     */
    public void setGetGhMzxxSfHzHjResult(org.tempuri.ReturnExTable getGhMzxxSfHzHjResult) {
        this.getGhMzxxSfHzHjResult = getGhMzxxSfHzHjResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGhMzxxSfHzHjResponse)) return false;
        GetGhMzxxSfHzHjResponse other = (GetGhMzxxSfHzHjResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getGhMzxxSfHzHjResult==null && other.getGetGhMzxxSfHzHjResult()==null) || 
             (this.getGhMzxxSfHzHjResult!=null &&
              this.getGhMzxxSfHzHjResult.equals(other.getGetGhMzxxSfHzHjResult())));
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
        if (getGetGhMzxxSfHzHjResult() != null) {
            _hashCode += getGetGhMzxxSfHzHjResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGhMzxxSfHzHjResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetGhMzxxSfHzHjResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getGhMzxxSfHzHjResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetGhMzxxSfHzHjResult"));
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
