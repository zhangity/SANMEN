/**
 * GetKBliarbryJsDataSetResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetKBliarbryJsDataSetResponse  implements java.io.Serializable {
    private org.tempuri.GetKBliarbryJsDataSetResponseGetKBliarbryJsDataSetResult getKBliarbryJsDataSetResult;

    public GetKBliarbryJsDataSetResponse() {
    }

    public GetKBliarbryJsDataSetResponse(
           org.tempuri.GetKBliarbryJsDataSetResponseGetKBliarbryJsDataSetResult getKBliarbryJsDataSetResult) {
           this.getKBliarbryJsDataSetResult = getKBliarbryJsDataSetResult;
    }


    /**
     * Gets the getKBliarbryJsDataSetResult value for this GetKBliarbryJsDataSetResponse.
     * 
     * @return getKBliarbryJsDataSetResult
     */
    public org.tempuri.GetKBliarbryJsDataSetResponseGetKBliarbryJsDataSetResult getGetKBliarbryJsDataSetResult() {
        return getKBliarbryJsDataSetResult;
    }


    /**
     * Sets the getKBliarbryJsDataSetResult value for this GetKBliarbryJsDataSetResponse.
     * 
     * @param getKBliarbryJsDataSetResult
     */
    public void setGetKBliarbryJsDataSetResult(org.tempuri.GetKBliarbryJsDataSetResponseGetKBliarbryJsDataSetResult getKBliarbryJsDataSetResult) {
        this.getKBliarbryJsDataSetResult = getKBliarbryJsDataSetResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetKBliarbryJsDataSetResponse)) return false;
        GetKBliarbryJsDataSetResponse other = (GetKBliarbryJsDataSetResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getKBliarbryJsDataSetResult==null && other.getGetKBliarbryJsDataSetResult()==null) || 
             (this.getKBliarbryJsDataSetResult!=null &&
              this.getKBliarbryJsDataSetResult.equals(other.getGetKBliarbryJsDataSetResult())));
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
        if (getGetKBliarbryJsDataSetResult() != null) {
            _hashCode += getGetKBliarbryJsDataSetResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetKBliarbryJsDataSetResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetKBliarbryJsDataSetResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getKBliarbryJsDataSetResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetKBliarbryJsDataSetResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetKBliarbryJsDataSetResponse>GetKBliarbryJsDataSetResult"));
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
