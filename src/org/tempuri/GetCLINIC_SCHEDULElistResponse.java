/**
 * GetCLINIC_SCHEDULElistResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCLINIC_SCHEDULElistResponse  implements java.io.Serializable {
    private org.tempuri.GetCLINIC_SCHEDULElistResponseGetCLINIC_SCHEDULElistResult getCLINIC_SCHEDULElistResult;

    public GetCLINIC_SCHEDULElistResponse() {
    }

    public GetCLINIC_SCHEDULElistResponse(
           org.tempuri.GetCLINIC_SCHEDULElistResponseGetCLINIC_SCHEDULElistResult getCLINIC_SCHEDULElistResult) {
           this.getCLINIC_SCHEDULElistResult = getCLINIC_SCHEDULElistResult;
    }


    /**
     * Gets the getCLINIC_SCHEDULElistResult value for this GetCLINIC_SCHEDULElistResponse.
     * 
     * @return getCLINIC_SCHEDULElistResult
     */
    public org.tempuri.GetCLINIC_SCHEDULElistResponseGetCLINIC_SCHEDULElistResult getGetCLINIC_SCHEDULElistResult() {
        return getCLINIC_SCHEDULElistResult;
    }


    /**
     * Sets the getCLINIC_SCHEDULElistResult value for this GetCLINIC_SCHEDULElistResponse.
     * 
     * @param getCLINIC_SCHEDULElistResult
     */
    public void setGetCLINIC_SCHEDULElistResult(org.tempuri.GetCLINIC_SCHEDULElistResponseGetCLINIC_SCHEDULElistResult getCLINIC_SCHEDULElistResult) {
        this.getCLINIC_SCHEDULElistResult = getCLINIC_SCHEDULElistResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCLINIC_SCHEDULElistResponse)) return false;
        GetCLINIC_SCHEDULElistResponse other = (GetCLINIC_SCHEDULElistResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCLINIC_SCHEDULElistResult==null && other.getGetCLINIC_SCHEDULElistResult()==null) || 
             (this.getCLINIC_SCHEDULElistResult!=null &&
              this.getCLINIC_SCHEDULElistResult.equals(other.getGetCLINIC_SCHEDULElistResult())));
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
        if (getGetCLINIC_SCHEDULElistResult() != null) {
            _hashCode += getGetCLINIC_SCHEDULElistResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCLINIC_SCHEDULElistResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCLINIC_SCHEDULElistResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCLINIC_SCHEDULElistResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCLINIC_SCHEDULElistResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetCLINIC_SCHEDULElistResponse>GetCLINIC_SCHEDULElistResult"));
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
