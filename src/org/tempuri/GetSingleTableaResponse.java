/**
 * GetSingleTableaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSingleTableaResponse  implements java.io.Serializable {
    private org.tempuri.GetSingleTableaResponseGetSingleTableaResult getSingleTableaResult;

    public GetSingleTableaResponse() {
    }

    public GetSingleTableaResponse(
           org.tempuri.GetSingleTableaResponseGetSingleTableaResult getSingleTableaResult) {
           this.getSingleTableaResult = getSingleTableaResult;
    }


    /**
     * Gets the getSingleTableaResult value for this GetSingleTableaResponse.
     * 
     * @return getSingleTableaResult
     */
    public org.tempuri.GetSingleTableaResponseGetSingleTableaResult getGetSingleTableaResult() {
        return getSingleTableaResult;
    }


    /**
     * Sets the getSingleTableaResult value for this GetSingleTableaResponse.
     * 
     * @param getSingleTableaResult
     */
    public void setGetSingleTableaResult(org.tempuri.GetSingleTableaResponseGetSingleTableaResult getSingleTableaResult) {
        this.getSingleTableaResult = getSingleTableaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSingleTableaResponse)) return false;
        GetSingleTableaResponse other = (GetSingleTableaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSingleTableaResult==null && other.getGetSingleTableaResult()==null) || 
             (this.getSingleTableaResult!=null &&
              this.getSingleTableaResult.equals(other.getGetSingleTableaResult())));
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
        if (getGetSingleTableaResult() != null) {
            _hashCode += getGetSingleTableaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSingleTableaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSingleTableaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSingleTableaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSingleTableaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSingleTableaResponse>GetSingleTableaResult"));
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
