/**
 * GetCyxmMrResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCyxmMrResponse  implements java.io.Serializable {
    private org.tempuri.GetCyxmMrResponseGetCyxmMrResult getCyxmMrResult;

    public GetCyxmMrResponse() {
    }

    public GetCyxmMrResponse(
           org.tempuri.GetCyxmMrResponseGetCyxmMrResult getCyxmMrResult) {
           this.getCyxmMrResult = getCyxmMrResult;
    }


    /**
     * Gets the getCyxmMrResult value for this GetCyxmMrResponse.
     * 
     * @return getCyxmMrResult
     */
    public org.tempuri.GetCyxmMrResponseGetCyxmMrResult getGetCyxmMrResult() {
        return getCyxmMrResult;
    }


    /**
     * Sets the getCyxmMrResult value for this GetCyxmMrResponse.
     * 
     * @param getCyxmMrResult
     */
    public void setGetCyxmMrResult(org.tempuri.GetCyxmMrResponseGetCyxmMrResult getCyxmMrResult) {
        this.getCyxmMrResult = getCyxmMrResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCyxmMrResponse)) return false;
        GetCyxmMrResponse other = (GetCyxmMrResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCyxmMrResult==null && other.getGetCyxmMrResult()==null) || 
             (this.getCyxmMrResult!=null &&
              this.getCyxmMrResult.equals(other.getGetCyxmMrResult())));
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
        if (getGetCyxmMrResult() != null) {
            _hashCode += getGetCyxmMrResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCyxmMrResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCyxmMrResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCyxmMrResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCyxmMrResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetCyxmMrResponse>GetCyxmMrResult"));
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
