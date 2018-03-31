/**
 * GetMinCalledPatientinfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMinCalledPatientinfoResponse  implements java.io.Serializable {
    private org.tempuri.GetMinCalledPatientinfoResponseGetMinCalledPatientinfoResult getMinCalledPatientinfoResult;

    public GetMinCalledPatientinfoResponse() {
    }

    public GetMinCalledPatientinfoResponse(
           org.tempuri.GetMinCalledPatientinfoResponseGetMinCalledPatientinfoResult getMinCalledPatientinfoResult) {
           this.getMinCalledPatientinfoResult = getMinCalledPatientinfoResult;
    }


    /**
     * Gets the getMinCalledPatientinfoResult value for this GetMinCalledPatientinfoResponse.
     * 
     * @return getMinCalledPatientinfoResult
     */
    public org.tempuri.GetMinCalledPatientinfoResponseGetMinCalledPatientinfoResult getGetMinCalledPatientinfoResult() {
        return getMinCalledPatientinfoResult;
    }


    /**
     * Sets the getMinCalledPatientinfoResult value for this GetMinCalledPatientinfoResponse.
     * 
     * @param getMinCalledPatientinfoResult
     */
    public void setGetMinCalledPatientinfoResult(org.tempuri.GetMinCalledPatientinfoResponseGetMinCalledPatientinfoResult getMinCalledPatientinfoResult) {
        this.getMinCalledPatientinfoResult = getMinCalledPatientinfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMinCalledPatientinfoResponse)) return false;
        GetMinCalledPatientinfoResponse other = (GetMinCalledPatientinfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMinCalledPatientinfoResult==null && other.getGetMinCalledPatientinfoResult()==null) || 
             (this.getMinCalledPatientinfoResult!=null &&
              this.getMinCalledPatientinfoResult.equals(other.getGetMinCalledPatientinfoResult())));
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
        if (getGetMinCalledPatientinfoResult() != null) {
            _hashCode += getGetMinCalledPatientinfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMinCalledPatientinfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMinCalledPatientinfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMinCalledPatientinfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMinCalledPatientinfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetMinCalledPatientinfoResponse>GetMinCalledPatientinfoResult"));
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
