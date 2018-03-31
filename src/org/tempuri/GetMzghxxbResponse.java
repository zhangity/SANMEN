/**
 * GetMzghxxbResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzghxxbResponse  implements java.io.Serializable {
    private org.tempuri.GetMzghxxbResponseGetMzghxxbResult getMzghxxbResult;

    public GetMzghxxbResponse() {
    }

    public GetMzghxxbResponse(
           org.tempuri.GetMzghxxbResponseGetMzghxxbResult getMzghxxbResult) {
           this.getMzghxxbResult = getMzghxxbResult;
    }


    /**
     * Gets the getMzghxxbResult value for this GetMzghxxbResponse.
     * 
     * @return getMzghxxbResult
     */
    public org.tempuri.GetMzghxxbResponseGetMzghxxbResult getGetMzghxxbResult() {
        return getMzghxxbResult;
    }


    /**
     * Sets the getMzghxxbResult value for this GetMzghxxbResponse.
     * 
     * @param getMzghxxbResult
     */
    public void setGetMzghxxbResult(org.tempuri.GetMzghxxbResponseGetMzghxxbResult getMzghxxbResult) {
        this.getMzghxxbResult = getMzghxxbResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzghxxbResponse)) return false;
        GetMzghxxbResponse other = (GetMzghxxbResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMzghxxbResult==null && other.getGetMzghxxbResult()==null) || 
             (this.getMzghxxbResult!=null &&
              this.getMzghxxbResult.equals(other.getGetMzghxxbResult())));
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
        if (getGetMzghxxbResult() != null) {
            _hashCode += getGetMzghxxbResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzghxxbResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzghxxbResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMzghxxbResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMzghxxbResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetMzghxxbResponse>GetMzghxxbResult"));
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
