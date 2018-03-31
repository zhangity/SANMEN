/**
 * GetlsmxPatientLsDoucumentsPathResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetlsmxPatientLsDoucumentsPathResponse  implements java.io.Serializable {
    private org.tempuri.GetlsmxPatientLsDoucumentsPathResponseGetlsmxPatientLsDoucumentsPathResult getlsmxPatientLsDoucumentsPathResult;

    public GetlsmxPatientLsDoucumentsPathResponse() {
    }

    public GetlsmxPatientLsDoucumentsPathResponse(
           org.tempuri.GetlsmxPatientLsDoucumentsPathResponseGetlsmxPatientLsDoucumentsPathResult getlsmxPatientLsDoucumentsPathResult) {
           this.getlsmxPatientLsDoucumentsPathResult = getlsmxPatientLsDoucumentsPathResult;
    }


    /**
     * Gets the getlsmxPatientLsDoucumentsPathResult value for this GetlsmxPatientLsDoucumentsPathResponse.
     * 
     * @return getlsmxPatientLsDoucumentsPathResult
     */
    public org.tempuri.GetlsmxPatientLsDoucumentsPathResponseGetlsmxPatientLsDoucumentsPathResult getGetlsmxPatientLsDoucumentsPathResult() {
        return getlsmxPatientLsDoucumentsPathResult;
    }


    /**
     * Sets the getlsmxPatientLsDoucumentsPathResult value for this GetlsmxPatientLsDoucumentsPathResponse.
     * 
     * @param getlsmxPatientLsDoucumentsPathResult
     */
    public void setGetlsmxPatientLsDoucumentsPathResult(org.tempuri.GetlsmxPatientLsDoucumentsPathResponseGetlsmxPatientLsDoucumentsPathResult getlsmxPatientLsDoucumentsPathResult) {
        this.getlsmxPatientLsDoucumentsPathResult = getlsmxPatientLsDoucumentsPathResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetlsmxPatientLsDoucumentsPathResponse)) return false;
        GetlsmxPatientLsDoucumentsPathResponse other = (GetlsmxPatientLsDoucumentsPathResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getlsmxPatientLsDoucumentsPathResult==null && other.getGetlsmxPatientLsDoucumentsPathResult()==null) || 
             (this.getlsmxPatientLsDoucumentsPathResult!=null &&
              this.getlsmxPatientLsDoucumentsPathResult.equals(other.getGetlsmxPatientLsDoucumentsPathResult())));
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
        if (getGetlsmxPatientLsDoucumentsPathResult() != null) {
            _hashCode += getGetlsmxPatientLsDoucumentsPathResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetlsmxPatientLsDoucumentsPathResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetlsmxPatientLsDoucumentsPathResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getlsmxPatientLsDoucumentsPathResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetlsmxPatientLsDoucumentsPathResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetlsmxPatientLsDoucumentsPathResponse>GetlsmxPatientLsDoucumentsPathResult"));
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
