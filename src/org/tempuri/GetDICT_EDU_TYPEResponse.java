/**
 * GetDICT_EDU_TYPEResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDICT_EDU_TYPEResponse  implements java.io.Serializable {
    private org.tempuri.GetDICT_EDU_TYPEResponseGetDICT_EDU_TYPEResult getDICT_EDU_TYPEResult;

    public GetDICT_EDU_TYPEResponse() {
    }

    public GetDICT_EDU_TYPEResponse(
           org.tempuri.GetDICT_EDU_TYPEResponseGetDICT_EDU_TYPEResult getDICT_EDU_TYPEResult) {
           this.getDICT_EDU_TYPEResult = getDICT_EDU_TYPEResult;
    }


    /**
     * Gets the getDICT_EDU_TYPEResult value for this GetDICT_EDU_TYPEResponse.
     * 
     * @return getDICT_EDU_TYPEResult
     */
    public org.tempuri.GetDICT_EDU_TYPEResponseGetDICT_EDU_TYPEResult getGetDICT_EDU_TYPEResult() {
        return getDICT_EDU_TYPEResult;
    }


    /**
     * Sets the getDICT_EDU_TYPEResult value for this GetDICT_EDU_TYPEResponse.
     * 
     * @param getDICT_EDU_TYPEResult
     */
    public void setGetDICT_EDU_TYPEResult(org.tempuri.GetDICT_EDU_TYPEResponseGetDICT_EDU_TYPEResult getDICT_EDU_TYPEResult) {
        this.getDICT_EDU_TYPEResult = getDICT_EDU_TYPEResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDICT_EDU_TYPEResponse)) return false;
        GetDICT_EDU_TYPEResponse other = (GetDICT_EDU_TYPEResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDICT_EDU_TYPEResult==null && other.getGetDICT_EDU_TYPEResult()==null) || 
             (this.getDICT_EDU_TYPEResult!=null &&
              this.getDICT_EDU_TYPEResult.equals(other.getGetDICT_EDU_TYPEResult())));
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
        if (getGetDICT_EDU_TYPEResult() != null) {
            _hashCode += getGetDICT_EDU_TYPEResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDICT_EDU_TYPEResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDICT_EDU_TYPEResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDICT_EDU_TYPEResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDICT_EDU_TYPEResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDICT_EDU_TYPEResponse>GetDICT_EDU_TYPEResult"));
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
