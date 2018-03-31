/**
 * GetDICT_RELATIONSHIPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDICT_RELATIONSHIPResponse  implements java.io.Serializable {
    private org.tempuri.GetDICT_RELATIONSHIPResponseGetDICT_RELATIONSHIPResult getDICT_RELATIONSHIPResult;

    public GetDICT_RELATIONSHIPResponse() {
    }

    public GetDICT_RELATIONSHIPResponse(
           org.tempuri.GetDICT_RELATIONSHIPResponseGetDICT_RELATIONSHIPResult getDICT_RELATIONSHIPResult) {
           this.getDICT_RELATIONSHIPResult = getDICT_RELATIONSHIPResult;
    }


    /**
     * Gets the getDICT_RELATIONSHIPResult value for this GetDICT_RELATIONSHIPResponse.
     * 
     * @return getDICT_RELATIONSHIPResult
     */
    public org.tempuri.GetDICT_RELATIONSHIPResponseGetDICT_RELATIONSHIPResult getGetDICT_RELATIONSHIPResult() {
        return getDICT_RELATIONSHIPResult;
    }


    /**
     * Sets the getDICT_RELATIONSHIPResult value for this GetDICT_RELATIONSHIPResponse.
     * 
     * @param getDICT_RELATIONSHIPResult
     */
    public void setGetDICT_RELATIONSHIPResult(org.tempuri.GetDICT_RELATIONSHIPResponseGetDICT_RELATIONSHIPResult getDICT_RELATIONSHIPResult) {
        this.getDICT_RELATIONSHIPResult = getDICT_RELATIONSHIPResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDICT_RELATIONSHIPResponse)) return false;
        GetDICT_RELATIONSHIPResponse other = (GetDICT_RELATIONSHIPResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDICT_RELATIONSHIPResult==null && other.getGetDICT_RELATIONSHIPResult()==null) || 
             (this.getDICT_RELATIONSHIPResult!=null &&
              this.getDICT_RELATIONSHIPResult.equals(other.getGetDICT_RELATIONSHIPResult())));
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
        if (getGetDICT_RELATIONSHIPResult() != null) {
            _hashCode += getGetDICT_RELATIONSHIPResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDICT_RELATIONSHIPResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDICT_RELATIONSHIPResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDICT_RELATIONSHIPResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDICT_RELATIONSHIPResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDICT_RELATIONSHIPResponse>GetDICT_RELATIONSHIPResult"));
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
