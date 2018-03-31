/**
 * GetZffpsfxmlbResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetZffpsfxmlbResponse  implements java.io.Serializable {
    private org.tempuri.GetZffpsfxmlbResponseGetZffpsfxmlbResult getZffpsfxmlbResult;

    public GetZffpsfxmlbResponse() {
    }

    public GetZffpsfxmlbResponse(
           org.tempuri.GetZffpsfxmlbResponseGetZffpsfxmlbResult getZffpsfxmlbResult) {
           this.getZffpsfxmlbResult = getZffpsfxmlbResult;
    }


    /**
     * Gets the getZffpsfxmlbResult value for this GetZffpsfxmlbResponse.
     * 
     * @return getZffpsfxmlbResult
     */
    public org.tempuri.GetZffpsfxmlbResponseGetZffpsfxmlbResult getGetZffpsfxmlbResult() {
        return getZffpsfxmlbResult;
    }


    /**
     * Sets the getZffpsfxmlbResult value for this GetZffpsfxmlbResponse.
     * 
     * @param getZffpsfxmlbResult
     */
    public void setGetZffpsfxmlbResult(org.tempuri.GetZffpsfxmlbResponseGetZffpsfxmlbResult getZffpsfxmlbResult) {
        this.getZffpsfxmlbResult = getZffpsfxmlbResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZffpsfxmlbResponse)) return false;
        GetZffpsfxmlbResponse other = (GetZffpsfxmlbResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getZffpsfxmlbResult==null && other.getGetZffpsfxmlbResult()==null) || 
             (this.getZffpsfxmlbResult!=null &&
              this.getZffpsfxmlbResult.equals(other.getGetZffpsfxmlbResult())));
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
        if (getGetZffpsfxmlbResult() != null) {
            _hashCode += getGetZffpsfxmlbResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZffpsfxmlbResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetZffpsfxmlbResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getZffpsfxmlbResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetZffpsfxmlbResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetZffpsfxmlbResponse>GetZffpsfxmlbResult"));
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
