/**
 * GetKBliarbryJsDataSetaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetKBliarbryJsDataSetaResponse  implements java.io.Serializable {
    private org.tempuri.GetKBliarbryJsDataSetaResponseGetKBliarbryJsDataSetaResult getKBliarbryJsDataSetaResult;

    public GetKBliarbryJsDataSetaResponse() {
    }

    public GetKBliarbryJsDataSetaResponse(
           org.tempuri.GetKBliarbryJsDataSetaResponseGetKBliarbryJsDataSetaResult getKBliarbryJsDataSetaResult) {
           this.getKBliarbryJsDataSetaResult = getKBliarbryJsDataSetaResult;
    }


    /**
     * Gets the getKBliarbryJsDataSetaResult value for this GetKBliarbryJsDataSetaResponse.
     * 
     * @return getKBliarbryJsDataSetaResult
     */
    public org.tempuri.GetKBliarbryJsDataSetaResponseGetKBliarbryJsDataSetaResult getGetKBliarbryJsDataSetaResult() {
        return getKBliarbryJsDataSetaResult;
    }


    /**
     * Sets the getKBliarbryJsDataSetaResult value for this GetKBliarbryJsDataSetaResponse.
     * 
     * @param getKBliarbryJsDataSetaResult
     */
    public void setGetKBliarbryJsDataSetaResult(org.tempuri.GetKBliarbryJsDataSetaResponseGetKBliarbryJsDataSetaResult getKBliarbryJsDataSetaResult) {
        this.getKBliarbryJsDataSetaResult = getKBliarbryJsDataSetaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetKBliarbryJsDataSetaResponse)) return false;
        GetKBliarbryJsDataSetaResponse other = (GetKBliarbryJsDataSetaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getKBliarbryJsDataSetaResult==null && other.getGetKBliarbryJsDataSetaResult()==null) || 
             (this.getKBliarbryJsDataSetaResult!=null &&
              this.getKBliarbryJsDataSetaResult.equals(other.getGetKBliarbryJsDataSetaResult())));
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
        if (getGetKBliarbryJsDataSetaResult() != null) {
            _hashCode += getGetKBliarbryJsDataSetaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetKBliarbryJsDataSetaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetKBliarbryJsDataSetaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getKBliarbryJsDataSetaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetKBliarbryJsDataSetaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetKBliarbryJsDataSetaResponse>GetKBliarbryJsDataSetaResult"));
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
