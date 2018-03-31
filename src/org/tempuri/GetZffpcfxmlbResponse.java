/**
 * GetZffpcfxmlbResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetZffpcfxmlbResponse  implements java.io.Serializable {
    private org.tempuri.GetZffpcfxmlbResponseGetZffpcfxmlbResult getZffpcfxmlbResult;

    public GetZffpcfxmlbResponse() {
    }

    public GetZffpcfxmlbResponse(
           org.tempuri.GetZffpcfxmlbResponseGetZffpcfxmlbResult getZffpcfxmlbResult) {
           this.getZffpcfxmlbResult = getZffpcfxmlbResult;
    }


    /**
     * Gets the getZffpcfxmlbResult value for this GetZffpcfxmlbResponse.
     * 
     * @return getZffpcfxmlbResult
     */
    public org.tempuri.GetZffpcfxmlbResponseGetZffpcfxmlbResult getGetZffpcfxmlbResult() {
        return getZffpcfxmlbResult;
    }


    /**
     * Sets the getZffpcfxmlbResult value for this GetZffpcfxmlbResponse.
     * 
     * @param getZffpcfxmlbResult
     */
    public void setGetZffpcfxmlbResult(org.tempuri.GetZffpcfxmlbResponseGetZffpcfxmlbResult getZffpcfxmlbResult) {
        this.getZffpcfxmlbResult = getZffpcfxmlbResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZffpcfxmlbResponse)) return false;
        GetZffpcfxmlbResponse other = (GetZffpcfxmlbResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getZffpcfxmlbResult==null && other.getGetZffpcfxmlbResult()==null) || 
             (this.getZffpcfxmlbResult!=null &&
              this.getZffpcfxmlbResult.equals(other.getGetZffpcfxmlbResult())));
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
        if (getGetZffpcfxmlbResult() != null) {
            _hashCode += getGetZffpcfxmlbResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZffpcfxmlbResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetZffpcfxmlbResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getZffpcfxmlbResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetZffpcfxmlbResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetZffpcfxmlbResponse>GetZffpcfxmlbResult"));
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
