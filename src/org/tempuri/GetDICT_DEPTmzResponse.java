/**
 * GetDICT_DEPTmzResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDICT_DEPTmzResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getDICT_DEPTmzResult;

    public GetDICT_DEPTmzResponse() {
    }

    public GetDICT_DEPTmzResponse(
           org.tempuri.ReturnExTable getDICT_DEPTmzResult) {
           this.getDICT_DEPTmzResult = getDICT_DEPTmzResult;
    }


    /**
     * Gets the getDICT_DEPTmzResult value for this GetDICT_DEPTmzResponse.
     * 
     * @return getDICT_DEPTmzResult
     */
    public org.tempuri.ReturnExTable getGetDICT_DEPTmzResult() {
        return getDICT_DEPTmzResult;
    }


    /**
     * Sets the getDICT_DEPTmzResult value for this GetDICT_DEPTmzResponse.
     * 
     * @param getDICT_DEPTmzResult
     */
    public void setGetDICT_DEPTmzResult(org.tempuri.ReturnExTable getDICT_DEPTmzResult) {
        this.getDICT_DEPTmzResult = getDICT_DEPTmzResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDICT_DEPTmzResponse)) return false;
        GetDICT_DEPTmzResponse other = (GetDICT_DEPTmzResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDICT_DEPTmzResult==null && other.getGetDICT_DEPTmzResult()==null) || 
             (this.getDICT_DEPTmzResult!=null &&
              this.getDICT_DEPTmzResult.equals(other.getGetDICT_DEPTmzResult())));
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
        if (getGetDICT_DEPTmzResult() != null) {
            _hashCode += getGetDICT_DEPTmzResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDICT_DEPTmzResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDICT_DEPTmzResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDICT_DEPTmzResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDICT_DEPTmzResult"));
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
