/**
 * GetWdyFpxxbyRQResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetWdyFpxxbyRQResponse  implements java.io.Serializable {
    private org.tempuri.GetWdyFpxxbyRQResponseGetWdyFpxxbyRQResult getWdyFpxxbyRQResult;

    public GetWdyFpxxbyRQResponse() {
    }

    public GetWdyFpxxbyRQResponse(
           org.tempuri.GetWdyFpxxbyRQResponseGetWdyFpxxbyRQResult getWdyFpxxbyRQResult) {
           this.getWdyFpxxbyRQResult = getWdyFpxxbyRQResult;
    }


    /**
     * Gets the getWdyFpxxbyRQResult value for this GetWdyFpxxbyRQResponse.
     * 
     * @return getWdyFpxxbyRQResult
     */
    public org.tempuri.GetWdyFpxxbyRQResponseGetWdyFpxxbyRQResult getGetWdyFpxxbyRQResult() {
        return getWdyFpxxbyRQResult;
    }


    /**
     * Sets the getWdyFpxxbyRQResult value for this GetWdyFpxxbyRQResponse.
     * 
     * @param getWdyFpxxbyRQResult
     */
    public void setGetWdyFpxxbyRQResult(org.tempuri.GetWdyFpxxbyRQResponseGetWdyFpxxbyRQResult getWdyFpxxbyRQResult) {
        this.getWdyFpxxbyRQResult = getWdyFpxxbyRQResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWdyFpxxbyRQResponse)) return false;
        GetWdyFpxxbyRQResponse other = (GetWdyFpxxbyRQResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getWdyFpxxbyRQResult==null && other.getGetWdyFpxxbyRQResult()==null) || 
             (this.getWdyFpxxbyRQResult!=null &&
              this.getWdyFpxxbyRQResult.equals(other.getGetWdyFpxxbyRQResult())));
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
        if (getGetWdyFpxxbyRQResult() != null) {
            _hashCode += getGetWdyFpxxbyRQResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWdyFpxxbyRQResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetWdyFpxxbyRQResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getWdyFpxxbyRQResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetWdyFpxxbyRQResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetWdyFpxxbyRQResponse>GetWdyFpxxbyRQResult"));
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
