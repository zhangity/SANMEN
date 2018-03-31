/**
 * GetBKResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetBKResponse  implements java.io.Serializable {
    private org.tempuri.GetBKResponseGetBKResult getBKResult;

    public GetBKResponse() {
    }

    public GetBKResponse(
           org.tempuri.GetBKResponseGetBKResult getBKResult) {
           this.getBKResult = getBKResult;
    }


    /**
     * Gets the getBKResult value for this GetBKResponse.
     * 
     * @return getBKResult
     */
    public org.tempuri.GetBKResponseGetBKResult getGetBKResult() {
        return getBKResult;
    }


    /**
     * Sets the getBKResult value for this GetBKResponse.
     * 
     * @param getBKResult
     */
    public void setGetBKResult(org.tempuri.GetBKResponseGetBKResult getBKResult) {
        this.getBKResult = getBKResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBKResponse)) return false;
        GetBKResponse other = (GetBKResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getBKResult==null && other.getGetBKResult()==null) || 
             (this.getBKResult!=null &&
              this.getBKResult.equals(other.getGetBKResult())));
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
        if (getGetBKResult() != null) {
            _hashCode += getGetBKResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBKResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetBKResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBKResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetBKResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetBKResponse>GetBKResult"));
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
