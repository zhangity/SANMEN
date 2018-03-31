/**
 * GetCLINIC_SCHEDULEResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCLINIC_SCHEDULEResponse  implements java.io.Serializable {
    private org.tempuri.GetCLINIC_SCHEDULEResponseGetCLINIC_SCHEDULEResult getCLINIC_SCHEDULEResult;

    public GetCLINIC_SCHEDULEResponse() {
    }

    public GetCLINIC_SCHEDULEResponse(
           org.tempuri.GetCLINIC_SCHEDULEResponseGetCLINIC_SCHEDULEResult getCLINIC_SCHEDULEResult) {
           this.getCLINIC_SCHEDULEResult = getCLINIC_SCHEDULEResult;
    }


    /**
     * Gets the getCLINIC_SCHEDULEResult value for this GetCLINIC_SCHEDULEResponse.
     * 
     * @return getCLINIC_SCHEDULEResult
     */
    public org.tempuri.GetCLINIC_SCHEDULEResponseGetCLINIC_SCHEDULEResult getGetCLINIC_SCHEDULEResult() {
        return getCLINIC_SCHEDULEResult;
    }


    /**
     * Sets the getCLINIC_SCHEDULEResult value for this GetCLINIC_SCHEDULEResponse.
     * 
     * @param getCLINIC_SCHEDULEResult
     */
    public void setGetCLINIC_SCHEDULEResult(org.tempuri.GetCLINIC_SCHEDULEResponseGetCLINIC_SCHEDULEResult getCLINIC_SCHEDULEResult) {
        this.getCLINIC_SCHEDULEResult = getCLINIC_SCHEDULEResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCLINIC_SCHEDULEResponse)) return false;
        GetCLINIC_SCHEDULEResponse other = (GetCLINIC_SCHEDULEResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCLINIC_SCHEDULEResult==null && other.getGetCLINIC_SCHEDULEResult()==null) || 
             (this.getCLINIC_SCHEDULEResult!=null &&
              this.getCLINIC_SCHEDULEResult.equals(other.getGetCLINIC_SCHEDULEResult())));
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
        if (getGetCLINIC_SCHEDULEResult() != null) {
            _hashCode += getGetCLINIC_SCHEDULEResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCLINIC_SCHEDULEResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCLINIC_SCHEDULEResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCLINIC_SCHEDULEResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCLINIC_SCHEDULEResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetCLINIC_SCHEDULEResponse>GetCLINIC_SCHEDULEResult"));
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
