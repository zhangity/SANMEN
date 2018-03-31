/**
 * GetTRIAGE_RECORDSModelResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetTRIAGE_RECORDSModelResponse  implements java.io.Serializable {
    private org.tempuri.TRIAGE_RECORDS getTRIAGE_RECORDSModelResult;

    public GetTRIAGE_RECORDSModelResponse() {
    }

    public GetTRIAGE_RECORDSModelResponse(
           org.tempuri.TRIAGE_RECORDS getTRIAGE_RECORDSModelResult) {
           this.getTRIAGE_RECORDSModelResult = getTRIAGE_RECORDSModelResult;
    }


    /**
     * Gets the getTRIAGE_RECORDSModelResult value for this GetTRIAGE_RECORDSModelResponse.
     * 
     * @return getTRIAGE_RECORDSModelResult
     */
    public org.tempuri.TRIAGE_RECORDS getGetTRIAGE_RECORDSModelResult() {
        return getTRIAGE_RECORDSModelResult;
    }


    /**
     * Sets the getTRIAGE_RECORDSModelResult value for this GetTRIAGE_RECORDSModelResponse.
     * 
     * @param getTRIAGE_RECORDSModelResult
     */
    public void setGetTRIAGE_RECORDSModelResult(org.tempuri.TRIAGE_RECORDS getTRIAGE_RECORDSModelResult) {
        this.getTRIAGE_RECORDSModelResult = getTRIAGE_RECORDSModelResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTRIAGE_RECORDSModelResponse)) return false;
        GetTRIAGE_RECORDSModelResponse other = (GetTRIAGE_RECORDSModelResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTRIAGE_RECORDSModelResult==null && other.getGetTRIAGE_RECORDSModelResult()==null) || 
             (this.getTRIAGE_RECORDSModelResult!=null &&
              this.getTRIAGE_RECORDSModelResult.equals(other.getGetTRIAGE_RECORDSModelResult())));
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
        if (getGetTRIAGE_RECORDSModelResult() != null) {
            _hashCode += getGetTRIAGE_RECORDSModelResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTRIAGE_RECORDSModelResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetTRIAGE_RECORDSModelResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTRIAGE_RECORDSModelResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetTRIAGE_RECORDSModelResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "TRIAGE_RECORDS"));
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
