/**
 * GetMzbrjbxxByCardNoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzbrjbxxByCardNoResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getMzbrjbxxByCardNoResult;

    public GetMzbrjbxxByCardNoResponse() {
    }

    public GetMzbrjbxxByCardNoResponse(
           org.tempuri.ReturnExTable getMzbrjbxxByCardNoResult) {
           this.getMzbrjbxxByCardNoResult = getMzbrjbxxByCardNoResult;
    }


    /**
     * Gets the getMzbrjbxxByCardNoResult value for this GetMzbrjbxxByCardNoResponse.
     * 
     * @return getMzbrjbxxByCardNoResult
     */
    public org.tempuri.ReturnExTable getGetMzbrjbxxByCardNoResult() {
        return getMzbrjbxxByCardNoResult;
    }


    /**
     * Sets the getMzbrjbxxByCardNoResult value for this GetMzbrjbxxByCardNoResponse.
     * 
     * @param getMzbrjbxxByCardNoResult
     */
    public void setGetMzbrjbxxByCardNoResult(org.tempuri.ReturnExTable getMzbrjbxxByCardNoResult) {
        this.getMzbrjbxxByCardNoResult = getMzbrjbxxByCardNoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzbrjbxxByCardNoResponse)) return false;
        GetMzbrjbxxByCardNoResponse other = (GetMzbrjbxxByCardNoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMzbrjbxxByCardNoResult==null && other.getGetMzbrjbxxByCardNoResult()==null) || 
             (this.getMzbrjbxxByCardNoResult!=null &&
              this.getMzbrjbxxByCardNoResult.equals(other.getGetMzbrjbxxByCardNoResult())));
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
        if (getGetMzbrjbxxByCardNoResult() != null) {
            _hashCode += getGetMzbrjbxxByCardNoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzbrjbxxByCardNoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzbrjbxxByCardNoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMzbrjbxxByCardNoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMzbrjbxxByCardNoResult"));
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
