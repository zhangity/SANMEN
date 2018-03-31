/**
 * GetXhYpxxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetXhYpxxResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getXhYpxxResult;

    public GetXhYpxxResponse() {
    }

    public GetXhYpxxResponse(
           org.tempuri.ReturnExTable getXhYpxxResult) {
           this.getXhYpxxResult = getXhYpxxResult;
    }


    /**
     * Gets the getXhYpxxResult value for this GetXhYpxxResponse.
     * 
     * @return getXhYpxxResult
     */
    public org.tempuri.ReturnExTable getGetXhYpxxResult() {
        return getXhYpxxResult;
    }


    /**
     * Sets the getXhYpxxResult value for this GetXhYpxxResponse.
     * 
     * @param getXhYpxxResult
     */
    public void setGetXhYpxxResult(org.tempuri.ReturnExTable getXhYpxxResult) {
        this.getXhYpxxResult = getXhYpxxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetXhYpxxResponse)) return false;
        GetXhYpxxResponse other = (GetXhYpxxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getXhYpxxResult==null && other.getGetXhYpxxResult()==null) || 
             (this.getXhYpxxResult!=null &&
              this.getXhYpxxResult.equals(other.getGetXhYpxxResult())));
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
        if (getGetXhYpxxResult() != null) {
            _hashCode += getGetXhYpxxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetXhYpxxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetXhYpxxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getXhYpxxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetXhYpxxResult"));
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
