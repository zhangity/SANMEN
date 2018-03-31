/**
 * GetDICT_INSURANCEResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDICT_INSURANCEResponse  implements java.io.Serializable {
    private org.tempuri.GetDICT_INSURANCEResponseGetDICT_INSURANCEResult getDICT_INSURANCEResult;

    public GetDICT_INSURANCEResponse() {
    }

    public GetDICT_INSURANCEResponse(
           org.tempuri.GetDICT_INSURANCEResponseGetDICT_INSURANCEResult getDICT_INSURANCEResult) {
           this.getDICT_INSURANCEResult = getDICT_INSURANCEResult;
    }


    /**
     * Gets the getDICT_INSURANCEResult value for this GetDICT_INSURANCEResponse.
     * 
     * @return getDICT_INSURANCEResult
     */
    public org.tempuri.GetDICT_INSURANCEResponseGetDICT_INSURANCEResult getGetDICT_INSURANCEResult() {
        return getDICT_INSURANCEResult;
    }


    /**
     * Sets the getDICT_INSURANCEResult value for this GetDICT_INSURANCEResponse.
     * 
     * @param getDICT_INSURANCEResult
     */
    public void setGetDICT_INSURANCEResult(org.tempuri.GetDICT_INSURANCEResponseGetDICT_INSURANCEResult getDICT_INSURANCEResult) {
        this.getDICT_INSURANCEResult = getDICT_INSURANCEResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDICT_INSURANCEResponse)) return false;
        GetDICT_INSURANCEResponse other = (GetDICT_INSURANCEResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDICT_INSURANCEResult==null && other.getGetDICT_INSURANCEResult()==null) || 
             (this.getDICT_INSURANCEResult!=null &&
              this.getDICT_INSURANCEResult.equals(other.getGetDICT_INSURANCEResult())));
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
        if (getGetDICT_INSURANCEResult() != null) {
            _hashCode += getGetDICT_INSURANCEResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDICT_INSURANCEResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDICT_INSURANCEResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDICT_INSURANCEResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDICT_INSURANCEResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDICT_INSURANCEResponse>GetDICT_INSURANCEResult"));
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
