/**
 * GetDICT_DIAGNOSIS_TYPEResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDICT_DIAGNOSIS_TYPEResponse  implements java.io.Serializable {
    private org.tempuri.GetDICT_DIAGNOSIS_TYPEResponseGetDICT_DIAGNOSIS_TYPEResult getDICT_DIAGNOSIS_TYPEResult;

    public GetDICT_DIAGNOSIS_TYPEResponse() {
    }

    public GetDICT_DIAGNOSIS_TYPEResponse(
           org.tempuri.GetDICT_DIAGNOSIS_TYPEResponseGetDICT_DIAGNOSIS_TYPEResult getDICT_DIAGNOSIS_TYPEResult) {
           this.getDICT_DIAGNOSIS_TYPEResult = getDICT_DIAGNOSIS_TYPEResult;
    }


    /**
     * Gets the getDICT_DIAGNOSIS_TYPEResult value for this GetDICT_DIAGNOSIS_TYPEResponse.
     * 
     * @return getDICT_DIAGNOSIS_TYPEResult
     */
    public org.tempuri.GetDICT_DIAGNOSIS_TYPEResponseGetDICT_DIAGNOSIS_TYPEResult getGetDICT_DIAGNOSIS_TYPEResult() {
        return getDICT_DIAGNOSIS_TYPEResult;
    }


    /**
     * Sets the getDICT_DIAGNOSIS_TYPEResult value for this GetDICT_DIAGNOSIS_TYPEResponse.
     * 
     * @param getDICT_DIAGNOSIS_TYPEResult
     */
    public void setGetDICT_DIAGNOSIS_TYPEResult(org.tempuri.GetDICT_DIAGNOSIS_TYPEResponseGetDICT_DIAGNOSIS_TYPEResult getDICT_DIAGNOSIS_TYPEResult) {
        this.getDICT_DIAGNOSIS_TYPEResult = getDICT_DIAGNOSIS_TYPEResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDICT_DIAGNOSIS_TYPEResponse)) return false;
        GetDICT_DIAGNOSIS_TYPEResponse other = (GetDICT_DIAGNOSIS_TYPEResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDICT_DIAGNOSIS_TYPEResult==null && other.getGetDICT_DIAGNOSIS_TYPEResult()==null) || 
             (this.getDICT_DIAGNOSIS_TYPEResult!=null &&
              this.getDICT_DIAGNOSIS_TYPEResult.equals(other.getGetDICT_DIAGNOSIS_TYPEResult())));
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
        if (getGetDICT_DIAGNOSIS_TYPEResult() != null) {
            _hashCode += getGetDICT_DIAGNOSIS_TYPEResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDICT_DIAGNOSIS_TYPEResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDICT_DIAGNOSIS_TYPEResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDICT_DIAGNOSIS_TYPEResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDICT_DIAGNOSIS_TYPEResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDICT_DIAGNOSIS_TYPEResponse>GetDICT_DIAGNOSIS_TYPEResult"));
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
