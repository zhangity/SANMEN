/**
 * GetSsjlFromHisResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSsjlFromHisResponse  implements java.io.Serializable {
    private org.tempuri.GetSsjlFromHisResponseGetSsjlFromHisResult getSsjlFromHisResult;

    public GetSsjlFromHisResponse() {
    }

    public GetSsjlFromHisResponse(
           org.tempuri.GetSsjlFromHisResponseGetSsjlFromHisResult getSsjlFromHisResult) {
           this.getSsjlFromHisResult = getSsjlFromHisResult;
    }


    /**
     * Gets the getSsjlFromHisResult value for this GetSsjlFromHisResponse.
     * 
     * @return getSsjlFromHisResult
     */
    public org.tempuri.GetSsjlFromHisResponseGetSsjlFromHisResult getGetSsjlFromHisResult() {
        return getSsjlFromHisResult;
    }


    /**
     * Sets the getSsjlFromHisResult value for this GetSsjlFromHisResponse.
     * 
     * @param getSsjlFromHisResult
     */
    public void setGetSsjlFromHisResult(org.tempuri.GetSsjlFromHisResponseGetSsjlFromHisResult getSsjlFromHisResult) {
        this.getSsjlFromHisResult = getSsjlFromHisResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSsjlFromHisResponse)) return false;
        GetSsjlFromHisResponse other = (GetSsjlFromHisResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSsjlFromHisResult==null && other.getGetSsjlFromHisResult()==null) || 
             (this.getSsjlFromHisResult!=null &&
              this.getSsjlFromHisResult.equals(other.getGetSsjlFromHisResult())));
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
        if (getGetSsjlFromHisResult() != null) {
            _hashCode += getGetSsjlFromHisResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSsjlFromHisResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSsjlFromHisResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSsjlFromHisResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSsjlFromHisResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSsjlFromHisResponse>GetSsjlFromHisResult"));
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
