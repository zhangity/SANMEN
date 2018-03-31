/**
 * GetDICT_BLOOD_GROUPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDICT_BLOOD_GROUPResponse  implements java.io.Serializable {
    private org.tempuri.GetDICT_BLOOD_GROUPResponseGetDICT_BLOOD_GROUPResult getDICT_BLOOD_GROUPResult;

    public GetDICT_BLOOD_GROUPResponse() {
    }

    public GetDICT_BLOOD_GROUPResponse(
           org.tempuri.GetDICT_BLOOD_GROUPResponseGetDICT_BLOOD_GROUPResult getDICT_BLOOD_GROUPResult) {
           this.getDICT_BLOOD_GROUPResult = getDICT_BLOOD_GROUPResult;
    }


    /**
     * Gets the getDICT_BLOOD_GROUPResult value for this GetDICT_BLOOD_GROUPResponse.
     * 
     * @return getDICT_BLOOD_GROUPResult
     */
    public org.tempuri.GetDICT_BLOOD_GROUPResponseGetDICT_BLOOD_GROUPResult getGetDICT_BLOOD_GROUPResult() {
        return getDICT_BLOOD_GROUPResult;
    }


    /**
     * Sets the getDICT_BLOOD_GROUPResult value for this GetDICT_BLOOD_GROUPResponse.
     * 
     * @param getDICT_BLOOD_GROUPResult
     */
    public void setGetDICT_BLOOD_GROUPResult(org.tempuri.GetDICT_BLOOD_GROUPResponseGetDICT_BLOOD_GROUPResult getDICT_BLOOD_GROUPResult) {
        this.getDICT_BLOOD_GROUPResult = getDICT_BLOOD_GROUPResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDICT_BLOOD_GROUPResponse)) return false;
        GetDICT_BLOOD_GROUPResponse other = (GetDICT_BLOOD_GROUPResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDICT_BLOOD_GROUPResult==null && other.getGetDICT_BLOOD_GROUPResult()==null) || 
             (this.getDICT_BLOOD_GROUPResult!=null &&
              this.getDICT_BLOOD_GROUPResult.equals(other.getGetDICT_BLOOD_GROUPResult())));
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
        if (getGetDICT_BLOOD_GROUPResult() != null) {
            _hashCode += getGetDICT_BLOOD_GROUPResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDICT_BLOOD_GROUPResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDICT_BLOOD_GROUPResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDICT_BLOOD_GROUPResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDICT_BLOOD_GROUPResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDICT_BLOOD_GROUPResponse>GetDICT_BLOOD_GROUPResult"));
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
