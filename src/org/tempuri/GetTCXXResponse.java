/**
 * GetTCXXResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetTCXXResponse  implements java.io.Serializable {
    private org.tempuri.GetTCXXResponseGetTCXXResult getTCXXResult;

    public GetTCXXResponse() {
    }

    public GetTCXXResponse(
           org.tempuri.GetTCXXResponseGetTCXXResult getTCXXResult) {
           this.getTCXXResult = getTCXXResult;
    }


    /**
     * Gets the getTCXXResult value for this GetTCXXResponse.
     * 
     * @return getTCXXResult
     */
    public org.tempuri.GetTCXXResponseGetTCXXResult getGetTCXXResult() {
        return getTCXXResult;
    }


    /**
     * Sets the getTCXXResult value for this GetTCXXResponse.
     * 
     * @param getTCXXResult
     */
    public void setGetTCXXResult(org.tempuri.GetTCXXResponseGetTCXXResult getTCXXResult) {
        this.getTCXXResult = getTCXXResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTCXXResponse)) return false;
        GetTCXXResponse other = (GetTCXXResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTCXXResult==null && other.getGetTCXXResult()==null) || 
             (this.getTCXXResult!=null &&
              this.getTCXXResult.equals(other.getGetTCXXResult())));
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
        if (getGetTCXXResult() != null) {
            _hashCode += getGetTCXXResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTCXXResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetTCXXResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTCXXResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetTCXXResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetTCXXResponse>GetTCXXResult"));
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
