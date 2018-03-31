/**
 * GetTCMXResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetTCMXResponse  implements java.io.Serializable {
    private org.tempuri.GetTCMXResponseGetTCMXResult getTCMXResult;

    public GetTCMXResponse() {
    }

    public GetTCMXResponse(
           org.tempuri.GetTCMXResponseGetTCMXResult getTCMXResult) {
           this.getTCMXResult = getTCMXResult;
    }


    /**
     * Gets the getTCMXResult value for this GetTCMXResponse.
     * 
     * @return getTCMXResult
     */
    public org.tempuri.GetTCMXResponseGetTCMXResult getGetTCMXResult() {
        return getTCMXResult;
    }


    /**
     * Sets the getTCMXResult value for this GetTCMXResponse.
     * 
     * @param getTCMXResult
     */
    public void setGetTCMXResult(org.tempuri.GetTCMXResponseGetTCMXResult getTCMXResult) {
        this.getTCMXResult = getTCMXResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTCMXResponse)) return false;
        GetTCMXResponse other = (GetTCMXResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTCMXResult==null && other.getGetTCMXResult()==null) || 
             (this.getTCMXResult!=null &&
              this.getTCMXResult.equals(other.getGetTCMXResult())));
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
        if (getGetTCMXResult() != null) {
            _hashCode += getGetTCMXResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTCMXResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetTCMXResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTCMXResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetTCMXResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetTCMXResponse>GetTCMXResult"));
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
