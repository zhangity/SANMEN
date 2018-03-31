/**
 * GetZzjUserResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetZzjUserResponse  implements java.io.Serializable {
    private org.tempuri.GetZzjUserResponseGetZzjUserResult getZzjUserResult;

    public GetZzjUserResponse() {
    }

    public GetZzjUserResponse(
           org.tempuri.GetZzjUserResponseGetZzjUserResult getZzjUserResult) {
           this.getZzjUserResult = getZzjUserResult;
    }


    /**
     * Gets the getZzjUserResult value for this GetZzjUserResponse.
     * 
     * @return getZzjUserResult
     */
    public org.tempuri.GetZzjUserResponseGetZzjUserResult getGetZzjUserResult() {
        return getZzjUserResult;
    }


    /**
     * Sets the getZzjUserResult value for this GetZzjUserResponse.
     * 
     * @param getZzjUserResult
     */
    public void setGetZzjUserResult(org.tempuri.GetZzjUserResponseGetZzjUserResult getZzjUserResult) {
        this.getZzjUserResult = getZzjUserResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZzjUserResponse)) return false;
        GetZzjUserResponse other = (GetZzjUserResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getZzjUserResult==null && other.getGetZzjUserResult()==null) || 
             (this.getZzjUserResult!=null &&
              this.getZzjUserResult.equals(other.getGetZzjUserResult())));
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
        if (getGetZzjUserResult() != null) {
            _hashCode += getGetZzjUserResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZzjUserResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetZzjUserResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getZzjUserResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetZzjUserResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetZzjUserResponse>GetZzjUserResult"));
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
