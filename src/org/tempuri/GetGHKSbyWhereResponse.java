/**
 * GetGHKSbyWhereResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetGHKSbyWhereResponse  implements java.io.Serializable {
    private org.tempuri.GetGHKSbyWhereResponseGetGHKSbyWhereResult getGHKSbyWhereResult;

    public GetGHKSbyWhereResponse() {
    }

    public GetGHKSbyWhereResponse(
           org.tempuri.GetGHKSbyWhereResponseGetGHKSbyWhereResult getGHKSbyWhereResult) {
           this.getGHKSbyWhereResult = getGHKSbyWhereResult;
    }


    /**
     * Gets the getGHKSbyWhereResult value for this GetGHKSbyWhereResponse.
     * 
     * @return getGHKSbyWhereResult
     */
    public org.tempuri.GetGHKSbyWhereResponseGetGHKSbyWhereResult getGetGHKSbyWhereResult() {
        return getGHKSbyWhereResult;
    }


    /**
     * Sets the getGHKSbyWhereResult value for this GetGHKSbyWhereResponse.
     * 
     * @param getGHKSbyWhereResult
     */
    public void setGetGHKSbyWhereResult(org.tempuri.GetGHKSbyWhereResponseGetGHKSbyWhereResult getGHKSbyWhereResult) {
        this.getGHKSbyWhereResult = getGHKSbyWhereResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGHKSbyWhereResponse)) return false;
        GetGHKSbyWhereResponse other = (GetGHKSbyWhereResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getGHKSbyWhereResult==null && other.getGetGHKSbyWhereResult()==null) || 
             (this.getGHKSbyWhereResult!=null &&
              this.getGHKSbyWhereResult.equals(other.getGetGHKSbyWhereResult())));
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
        if (getGetGHKSbyWhereResult() != null) {
            _hashCode += getGetGHKSbyWhereResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGHKSbyWhereResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetGHKSbyWhereResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getGHKSbyWhereResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetGHKSbyWhereResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetGHKSbyWhereResponse>GetGHKSbyWhereResult"));
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
