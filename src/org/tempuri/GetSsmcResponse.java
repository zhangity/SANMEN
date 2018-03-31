/**
 * GetSsmcResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSsmcResponse  implements java.io.Serializable {
    private org.tempuri.GetSsmcResponseGetSsmcResult getSsmcResult;

    public GetSsmcResponse() {
    }

    public GetSsmcResponse(
           org.tempuri.GetSsmcResponseGetSsmcResult getSsmcResult) {
           this.getSsmcResult = getSsmcResult;
    }


    /**
     * Gets the getSsmcResult value for this GetSsmcResponse.
     * 
     * @return getSsmcResult
     */
    public org.tempuri.GetSsmcResponseGetSsmcResult getGetSsmcResult() {
        return getSsmcResult;
    }


    /**
     * Sets the getSsmcResult value for this GetSsmcResponse.
     * 
     * @param getSsmcResult
     */
    public void setGetSsmcResult(org.tempuri.GetSsmcResponseGetSsmcResult getSsmcResult) {
        this.getSsmcResult = getSsmcResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSsmcResponse)) return false;
        GetSsmcResponse other = (GetSsmcResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSsmcResult==null && other.getGetSsmcResult()==null) || 
             (this.getSsmcResult!=null &&
              this.getSsmcResult.equals(other.getGetSsmcResult())));
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
        if (getGetSsmcResult() != null) {
            _hashCode += getGetSsmcResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSsmcResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSsmcResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSsmcResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSsmcResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSsmcResponse>GetSsmcResult"));
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
