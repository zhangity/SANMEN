/**
 * GetRegistOfClinicByRegistIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetRegistOfClinicByRegistIdResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getRegistOfClinicByRegistIdResult;

    public GetRegistOfClinicByRegistIdResponse() {
    }

    public GetRegistOfClinicByRegistIdResponse(
           org.tempuri.ReturnExTable getRegistOfClinicByRegistIdResult) {
           this.getRegistOfClinicByRegistIdResult = getRegistOfClinicByRegistIdResult;
    }


    /**
     * Gets the getRegistOfClinicByRegistIdResult value for this GetRegistOfClinicByRegistIdResponse.
     * 
     * @return getRegistOfClinicByRegistIdResult
     */
    public org.tempuri.ReturnExTable getGetRegistOfClinicByRegistIdResult() {
        return getRegistOfClinicByRegistIdResult;
    }


    /**
     * Sets the getRegistOfClinicByRegistIdResult value for this GetRegistOfClinicByRegistIdResponse.
     * 
     * @param getRegistOfClinicByRegistIdResult
     */
    public void setGetRegistOfClinicByRegistIdResult(org.tempuri.ReturnExTable getRegistOfClinicByRegistIdResult) {
        this.getRegistOfClinicByRegistIdResult = getRegistOfClinicByRegistIdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRegistOfClinicByRegistIdResponse)) return false;
        GetRegistOfClinicByRegistIdResponse other = (GetRegistOfClinicByRegistIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getRegistOfClinicByRegistIdResult==null && other.getGetRegistOfClinicByRegistIdResult()==null) || 
             (this.getRegistOfClinicByRegistIdResult!=null &&
              this.getRegistOfClinicByRegistIdResult.equals(other.getGetRegistOfClinicByRegistIdResult())));
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
        if (getGetRegistOfClinicByRegistIdResult() != null) {
            _hashCode += getGetRegistOfClinicByRegistIdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRegistOfClinicByRegistIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetRegistOfClinicByRegistIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getRegistOfClinicByRegistIdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetRegistOfClinicByRegistIdResult"));
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
