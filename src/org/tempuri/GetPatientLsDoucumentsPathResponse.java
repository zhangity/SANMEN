/**
 * GetPatientLsDoucumentsPathResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPatientLsDoucumentsPathResponse  implements java.io.Serializable {
    private org.tempuri.GetPatientLsDoucumentsPathResponseGetPatientLsDoucumentsPathResult getPatientLsDoucumentsPathResult;

    public GetPatientLsDoucumentsPathResponse() {
    }

    public GetPatientLsDoucumentsPathResponse(
           org.tempuri.GetPatientLsDoucumentsPathResponseGetPatientLsDoucumentsPathResult getPatientLsDoucumentsPathResult) {
           this.getPatientLsDoucumentsPathResult = getPatientLsDoucumentsPathResult;
    }


    /**
     * Gets the getPatientLsDoucumentsPathResult value for this GetPatientLsDoucumentsPathResponse.
     * 
     * @return getPatientLsDoucumentsPathResult
     */
    public org.tempuri.GetPatientLsDoucumentsPathResponseGetPatientLsDoucumentsPathResult getGetPatientLsDoucumentsPathResult() {
        return getPatientLsDoucumentsPathResult;
    }


    /**
     * Sets the getPatientLsDoucumentsPathResult value for this GetPatientLsDoucumentsPathResponse.
     * 
     * @param getPatientLsDoucumentsPathResult
     */
    public void setGetPatientLsDoucumentsPathResult(org.tempuri.GetPatientLsDoucumentsPathResponseGetPatientLsDoucumentsPathResult getPatientLsDoucumentsPathResult) {
        this.getPatientLsDoucumentsPathResult = getPatientLsDoucumentsPathResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPatientLsDoucumentsPathResponse)) return false;
        GetPatientLsDoucumentsPathResponse other = (GetPatientLsDoucumentsPathResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPatientLsDoucumentsPathResult==null && other.getGetPatientLsDoucumentsPathResult()==null) || 
             (this.getPatientLsDoucumentsPathResult!=null &&
              this.getPatientLsDoucumentsPathResult.equals(other.getGetPatientLsDoucumentsPathResult())));
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
        if (getGetPatientLsDoucumentsPathResult() != null) {
            _hashCode += getGetPatientLsDoucumentsPathResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPatientLsDoucumentsPathResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPatientLsDoucumentsPathResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPatientLsDoucumentsPathResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPatientLsDoucumentsPathResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetPatientLsDoucumentsPathResponse>GetPatientLsDoucumentsPathResult"));
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
