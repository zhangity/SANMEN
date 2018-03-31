/**
 * GetDICT_MARITAL_STATUSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDICT_MARITAL_STATUSResponse  implements java.io.Serializable {
    private org.tempuri.GetDICT_MARITAL_STATUSResponseGetDICT_MARITAL_STATUSResult getDICT_MARITAL_STATUSResult;

    public GetDICT_MARITAL_STATUSResponse() {
    }

    public GetDICT_MARITAL_STATUSResponse(
           org.tempuri.GetDICT_MARITAL_STATUSResponseGetDICT_MARITAL_STATUSResult getDICT_MARITAL_STATUSResult) {
           this.getDICT_MARITAL_STATUSResult = getDICT_MARITAL_STATUSResult;
    }


    /**
     * Gets the getDICT_MARITAL_STATUSResult value for this GetDICT_MARITAL_STATUSResponse.
     * 
     * @return getDICT_MARITAL_STATUSResult
     */
    public org.tempuri.GetDICT_MARITAL_STATUSResponseGetDICT_MARITAL_STATUSResult getGetDICT_MARITAL_STATUSResult() {
        return getDICT_MARITAL_STATUSResult;
    }


    /**
     * Sets the getDICT_MARITAL_STATUSResult value for this GetDICT_MARITAL_STATUSResponse.
     * 
     * @param getDICT_MARITAL_STATUSResult
     */
    public void setGetDICT_MARITAL_STATUSResult(org.tempuri.GetDICT_MARITAL_STATUSResponseGetDICT_MARITAL_STATUSResult getDICT_MARITAL_STATUSResult) {
        this.getDICT_MARITAL_STATUSResult = getDICT_MARITAL_STATUSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDICT_MARITAL_STATUSResponse)) return false;
        GetDICT_MARITAL_STATUSResponse other = (GetDICT_MARITAL_STATUSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDICT_MARITAL_STATUSResult==null && other.getGetDICT_MARITAL_STATUSResult()==null) || 
             (this.getDICT_MARITAL_STATUSResult!=null &&
              this.getDICT_MARITAL_STATUSResult.equals(other.getGetDICT_MARITAL_STATUSResult())));
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
        if (getGetDICT_MARITAL_STATUSResult() != null) {
            _hashCode += getGetDICT_MARITAL_STATUSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDICT_MARITAL_STATUSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDICT_MARITAL_STATUSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDICT_MARITAL_STATUSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDICT_MARITAL_STATUSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDICT_MARITAL_STATUSResponse>GetDICT_MARITAL_STATUSResult"));
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
