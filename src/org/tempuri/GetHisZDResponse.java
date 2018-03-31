/**
 * GetHisZDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetHisZDResponse  implements java.io.Serializable {
    private org.tempuri.GetHisZDResponseGetHisZDResult getHisZDResult;

    public GetHisZDResponse() {
    }

    public GetHisZDResponse(
           org.tempuri.GetHisZDResponseGetHisZDResult getHisZDResult) {
           this.getHisZDResult = getHisZDResult;
    }


    /**
     * Gets the getHisZDResult value for this GetHisZDResponse.
     * 
     * @return getHisZDResult
     */
    public org.tempuri.GetHisZDResponseGetHisZDResult getGetHisZDResult() {
        return getHisZDResult;
    }


    /**
     * Sets the getHisZDResult value for this GetHisZDResponse.
     * 
     * @param getHisZDResult
     */
    public void setGetHisZDResult(org.tempuri.GetHisZDResponseGetHisZDResult getHisZDResult) {
        this.getHisZDResult = getHisZDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetHisZDResponse)) return false;
        GetHisZDResponse other = (GetHisZDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getHisZDResult==null && other.getGetHisZDResult()==null) || 
             (this.getHisZDResult!=null &&
              this.getHisZDResult.equals(other.getGetHisZDResult())));
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
        if (getGetHisZDResult() != null) {
            _hashCode += getGetHisZDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetHisZDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetHisZDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getHisZDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetHisZDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetHisZDResponse>GetHisZDResult"));
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
