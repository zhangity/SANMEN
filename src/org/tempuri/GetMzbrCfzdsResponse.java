/**
 * GetMzbrCfzdsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzbrCfzdsResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getMzbrCfzdsResult;

    public GetMzbrCfzdsResponse() {
    }

    public GetMzbrCfzdsResponse(
           org.tempuri.ReturnExTable getMzbrCfzdsResult) {
           this.getMzbrCfzdsResult = getMzbrCfzdsResult;
    }


    /**
     * Gets the getMzbrCfzdsResult value for this GetMzbrCfzdsResponse.
     * 
     * @return getMzbrCfzdsResult
     */
    public org.tempuri.ReturnExTable getGetMzbrCfzdsResult() {
        return getMzbrCfzdsResult;
    }


    /**
     * Sets the getMzbrCfzdsResult value for this GetMzbrCfzdsResponse.
     * 
     * @param getMzbrCfzdsResult
     */
    public void setGetMzbrCfzdsResult(org.tempuri.ReturnExTable getMzbrCfzdsResult) {
        this.getMzbrCfzdsResult = getMzbrCfzdsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzbrCfzdsResponse)) return false;
        GetMzbrCfzdsResponse other = (GetMzbrCfzdsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMzbrCfzdsResult==null && other.getGetMzbrCfzdsResult()==null) || 
             (this.getMzbrCfzdsResult!=null &&
              this.getMzbrCfzdsResult.equals(other.getGetMzbrCfzdsResult())));
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
        if (getGetMzbrCfzdsResult() != null) {
            _hashCode += getGetMzbrCfzdsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzbrCfzdsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzbrCfzdsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMzbrCfzdsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMzbrCfzdsResult"));
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
