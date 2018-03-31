/**
 * GetCardInfoByCARD_NOResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCardInfoByCARD_NOResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getCardInfoByCARD_NOResult;

    public GetCardInfoByCARD_NOResponse() {
    }

    public GetCardInfoByCARD_NOResponse(
           org.tempuri.ReturnExTable getCardInfoByCARD_NOResult) {
           this.getCardInfoByCARD_NOResult = getCardInfoByCARD_NOResult;
    }


    /**
     * Gets the getCardInfoByCARD_NOResult value for this GetCardInfoByCARD_NOResponse.
     * 
     * @return getCardInfoByCARD_NOResult
     */
    public org.tempuri.ReturnExTable getGetCardInfoByCARD_NOResult() {
        return getCardInfoByCARD_NOResult;
    }


    /**
     * Sets the getCardInfoByCARD_NOResult value for this GetCardInfoByCARD_NOResponse.
     * 
     * @param getCardInfoByCARD_NOResult
     */
    public void setGetCardInfoByCARD_NOResult(org.tempuri.ReturnExTable getCardInfoByCARD_NOResult) {
        this.getCardInfoByCARD_NOResult = getCardInfoByCARD_NOResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCardInfoByCARD_NOResponse)) return false;
        GetCardInfoByCARD_NOResponse other = (GetCardInfoByCARD_NOResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCardInfoByCARD_NOResult==null && other.getGetCardInfoByCARD_NOResult()==null) || 
             (this.getCardInfoByCARD_NOResult!=null &&
              this.getCardInfoByCARD_NOResult.equals(other.getGetCardInfoByCARD_NOResult())));
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
        if (getGetCardInfoByCARD_NOResult() != null) {
            _hashCode += getGetCardInfoByCARD_NOResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCardInfoByCARD_NOResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCardInfoByCARD_NOResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCardInfoByCARD_NOResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCardInfoByCARD_NOResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExTable"));
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
