/**
 * GetYpxxByTsbzResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYpxxByTsbzResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getYpxxByTsbzResult;

    public GetYpxxByTsbzResponse() {
    }

    public GetYpxxByTsbzResponse(
           org.tempuri.ReturnExTable getYpxxByTsbzResult) {
           this.getYpxxByTsbzResult = getYpxxByTsbzResult;
    }


    /**
     * Gets the getYpxxByTsbzResult value for this GetYpxxByTsbzResponse.
     * 
     * @return getYpxxByTsbzResult
     */
    public org.tempuri.ReturnExTable getGetYpxxByTsbzResult() {
        return getYpxxByTsbzResult;
    }


    /**
     * Sets the getYpxxByTsbzResult value for this GetYpxxByTsbzResponse.
     * 
     * @param getYpxxByTsbzResult
     */
    public void setGetYpxxByTsbzResult(org.tempuri.ReturnExTable getYpxxByTsbzResult) {
        this.getYpxxByTsbzResult = getYpxxByTsbzResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYpxxByTsbzResponse)) return false;
        GetYpxxByTsbzResponse other = (GetYpxxByTsbzResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getYpxxByTsbzResult==null && other.getGetYpxxByTsbzResult()==null) || 
             (this.getYpxxByTsbzResult!=null &&
              this.getYpxxByTsbzResult.equals(other.getGetYpxxByTsbzResult())));
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
        if (getGetYpxxByTsbzResult() != null) {
            _hashCode += getGetYpxxByTsbzResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYpxxByTsbzResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYpxxByTsbzResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getYpxxByTsbzResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetYpxxByTsbzResult"));
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
