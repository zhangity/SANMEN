/**
 * GetFpsfxmlbResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetFpsfxmlbResponse  implements java.io.Serializable {
    private org.tempuri.GetFpsfxmlbResponseGetFpsfxmlbResult getFpsfxmlbResult;

    public GetFpsfxmlbResponse() {
    }

    public GetFpsfxmlbResponse(
           org.tempuri.GetFpsfxmlbResponseGetFpsfxmlbResult getFpsfxmlbResult) {
           this.getFpsfxmlbResult = getFpsfxmlbResult;
    }


    /**
     * Gets the getFpsfxmlbResult value for this GetFpsfxmlbResponse.
     * 
     * @return getFpsfxmlbResult
     */
    public org.tempuri.GetFpsfxmlbResponseGetFpsfxmlbResult getGetFpsfxmlbResult() {
        return getFpsfxmlbResult;
    }


    /**
     * Sets the getFpsfxmlbResult value for this GetFpsfxmlbResponse.
     * 
     * @param getFpsfxmlbResult
     */
    public void setGetFpsfxmlbResult(org.tempuri.GetFpsfxmlbResponseGetFpsfxmlbResult getFpsfxmlbResult) {
        this.getFpsfxmlbResult = getFpsfxmlbResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFpsfxmlbResponse)) return false;
        GetFpsfxmlbResponse other = (GetFpsfxmlbResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFpsfxmlbResult==null && other.getGetFpsfxmlbResult()==null) || 
             (this.getFpsfxmlbResult!=null &&
              this.getFpsfxmlbResult.equals(other.getGetFpsfxmlbResult())));
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
        if (getGetFpsfxmlbResult() != null) {
            _hashCode += getGetFpsfxmlbResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFpsfxmlbResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetFpsfxmlbResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFpsfxmlbResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetFpsfxmlbResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetFpsfxmlbResponse>GetFpsfxmlbResult"));
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
