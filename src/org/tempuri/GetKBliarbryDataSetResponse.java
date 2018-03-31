/**
 * GetKBliarbryDataSetResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetKBliarbryDataSetResponse  implements java.io.Serializable {
    private org.tempuri.GetKBliarbryDataSetResponseGetKBliarbryDataSetResult getKBliarbryDataSetResult;

    public GetKBliarbryDataSetResponse() {
    }

    public GetKBliarbryDataSetResponse(
           org.tempuri.GetKBliarbryDataSetResponseGetKBliarbryDataSetResult getKBliarbryDataSetResult) {
           this.getKBliarbryDataSetResult = getKBliarbryDataSetResult;
    }


    /**
     * Gets the getKBliarbryDataSetResult value for this GetKBliarbryDataSetResponse.
     * 
     * @return getKBliarbryDataSetResult
     */
    public org.tempuri.GetKBliarbryDataSetResponseGetKBliarbryDataSetResult getGetKBliarbryDataSetResult() {
        return getKBliarbryDataSetResult;
    }


    /**
     * Sets the getKBliarbryDataSetResult value for this GetKBliarbryDataSetResponse.
     * 
     * @param getKBliarbryDataSetResult
     */
    public void setGetKBliarbryDataSetResult(org.tempuri.GetKBliarbryDataSetResponseGetKBliarbryDataSetResult getKBliarbryDataSetResult) {
        this.getKBliarbryDataSetResult = getKBliarbryDataSetResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetKBliarbryDataSetResponse)) return false;
        GetKBliarbryDataSetResponse other = (GetKBliarbryDataSetResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getKBliarbryDataSetResult==null && other.getGetKBliarbryDataSetResult()==null) || 
             (this.getKBliarbryDataSetResult!=null &&
              this.getKBliarbryDataSetResult.equals(other.getGetKBliarbryDataSetResult())));
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
        if (getGetKBliarbryDataSetResult() != null) {
            _hashCode += getGetKBliarbryDataSetResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetKBliarbryDataSetResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetKBliarbryDataSetResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getKBliarbryDataSetResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetKBliarbryDataSetResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetKBliarbryDataSetResponse>GetKBliarbryDataSetResult"));
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
