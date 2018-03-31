/**
 * GetYsZdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYsZdResponse  implements java.io.Serializable {
    private org.tempuri.GetYsZdResponseGetYsZdResult getYsZdResult;

    public GetYsZdResponse() {
    }

    public GetYsZdResponse(
           org.tempuri.GetYsZdResponseGetYsZdResult getYsZdResult) {
           this.getYsZdResult = getYsZdResult;
    }


    /**
     * Gets the getYsZdResult value for this GetYsZdResponse.
     * 
     * @return getYsZdResult
     */
    public org.tempuri.GetYsZdResponseGetYsZdResult getGetYsZdResult() {
        return getYsZdResult;
    }


    /**
     * Sets the getYsZdResult value for this GetYsZdResponse.
     * 
     * @param getYsZdResult
     */
    public void setGetYsZdResult(org.tempuri.GetYsZdResponseGetYsZdResult getYsZdResult) {
        this.getYsZdResult = getYsZdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYsZdResponse)) return false;
        GetYsZdResponse other = (GetYsZdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getYsZdResult==null && other.getGetYsZdResult()==null) || 
             (this.getYsZdResult!=null &&
              this.getYsZdResult.equals(other.getGetYsZdResult())));
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
        if (getGetYsZdResult() != null) {
            _hashCode += getGetYsZdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYsZdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYsZdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getYsZdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetYsZdResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetYsZdResponse>GetYsZdResult"));
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
