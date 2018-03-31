/**
 * GetYbJsjgFdjjResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYbJsjgFdjjResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getYbJsjgFdjjResult;

    public GetYbJsjgFdjjResponse() {
    }

    public GetYbJsjgFdjjResponse(
           org.tempuri.ReturnExTable getYbJsjgFdjjResult) {
           this.getYbJsjgFdjjResult = getYbJsjgFdjjResult;
    }


    /**
     * Gets the getYbJsjgFdjjResult value for this GetYbJsjgFdjjResponse.
     * 
     * @return getYbJsjgFdjjResult
     */
    public org.tempuri.ReturnExTable getGetYbJsjgFdjjResult() {
        return getYbJsjgFdjjResult;
    }


    /**
     * Sets the getYbJsjgFdjjResult value for this GetYbJsjgFdjjResponse.
     * 
     * @param getYbJsjgFdjjResult
     */
    public void setGetYbJsjgFdjjResult(org.tempuri.ReturnExTable getYbJsjgFdjjResult) {
        this.getYbJsjgFdjjResult = getYbJsjgFdjjResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYbJsjgFdjjResponse)) return false;
        GetYbJsjgFdjjResponse other = (GetYbJsjgFdjjResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getYbJsjgFdjjResult==null && other.getGetYbJsjgFdjjResult()==null) || 
             (this.getYbJsjgFdjjResult!=null &&
              this.getYbJsjgFdjjResult.equals(other.getGetYbJsjgFdjjResult())));
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
        if (getGetYbJsjgFdjjResult() != null) {
            _hashCode += getGetYbJsjgFdjjResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYbJsjgFdjjResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYbJsjgFdjjResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getYbJsjgFdjjResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetYbJsjgFdjjResult"));
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
