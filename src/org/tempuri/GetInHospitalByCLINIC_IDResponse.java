/**
 * GetInHospitalByCLINIC_IDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetInHospitalByCLINIC_IDResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getInHospitalByCLINIC_IDResult;

    public GetInHospitalByCLINIC_IDResponse() {
    }

    public GetInHospitalByCLINIC_IDResponse(
           org.tempuri.ReturnExTable getInHospitalByCLINIC_IDResult) {
           this.getInHospitalByCLINIC_IDResult = getInHospitalByCLINIC_IDResult;
    }


    /**
     * Gets the getInHospitalByCLINIC_IDResult value for this GetInHospitalByCLINIC_IDResponse.
     * 
     * @return getInHospitalByCLINIC_IDResult
     */
    public org.tempuri.ReturnExTable getGetInHospitalByCLINIC_IDResult() {
        return getInHospitalByCLINIC_IDResult;
    }


    /**
     * Sets the getInHospitalByCLINIC_IDResult value for this GetInHospitalByCLINIC_IDResponse.
     * 
     * @param getInHospitalByCLINIC_IDResult
     */
    public void setGetInHospitalByCLINIC_IDResult(org.tempuri.ReturnExTable getInHospitalByCLINIC_IDResult) {
        this.getInHospitalByCLINIC_IDResult = getInHospitalByCLINIC_IDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetInHospitalByCLINIC_IDResponse)) return false;
        GetInHospitalByCLINIC_IDResponse other = (GetInHospitalByCLINIC_IDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getInHospitalByCLINIC_IDResult==null && other.getGetInHospitalByCLINIC_IDResult()==null) || 
             (this.getInHospitalByCLINIC_IDResult!=null &&
              this.getInHospitalByCLINIC_IDResult.equals(other.getGetInHospitalByCLINIC_IDResult())));
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
        if (getGetInHospitalByCLINIC_IDResult() != null) {
            _hashCode += getGetInHospitalByCLINIC_IDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetInHospitalByCLINIC_IDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetInHospitalByCLINIC_IDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getInHospitalByCLINIC_IDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetInHospitalByCLINIC_IDResult"));
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
