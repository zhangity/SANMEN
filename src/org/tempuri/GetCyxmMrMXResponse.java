/**
 * GetCyxmMrMXResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCyxmMrMXResponse  implements java.io.Serializable {
    private org.tempuri.GetCyxmMrMXResponseGetCyxmMrMXResult getCyxmMrMXResult;

    public GetCyxmMrMXResponse() {
    }

    public GetCyxmMrMXResponse(
           org.tempuri.GetCyxmMrMXResponseGetCyxmMrMXResult getCyxmMrMXResult) {
           this.getCyxmMrMXResult = getCyxmMrMXResult;
    }


    /**
     * Gets the getCyxmMrMXResult value for this GetCyxmMrMXResponse.
     * 
     * @return getCyxmMrMXResult
     */
    public org.tempuri.GetCyxmMrMXResponseGetCyxmMrMXResult getGetCyxmMrMXResult() {
        return getCyxmMrMXResult;
    }


    /**
     * Sets the getCyxmMrMXResult value for this GetCyxmMrMXResponse.
     * 
     * @param getCyxmMrMXResult
     */
    public void setGetCyxmMrMXResult(org.tempuri.GetCyxmMrMXResponseGetCyxmMrMXResult getCyxmMrMXResult) {
        this.getCyxmMrMXResult = getCyxmMrMXResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCyxmMrMXResponse)) return false;
        GetCyxmMrMXResponse other = (GetCyxmMrMXResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCyxmMrMXResult==null && other.getGetCyxmMrMXResult()==null) || 
             (this.getCyxmMrMXResult!=null &&
              this.getCyxmMrMXResult.equals(other.getGetCyxmMrMXResult())));
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
        if (getGetCyxmMrMXResult() != null) {
            _hashCode += getGetCyxmMrMXResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCyxmMrMXResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCyxmMrMXResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCyxmMrMXResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCyxmMrMXResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetCyxmMrMXResponse>GetCyxmMrMXResult"));
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
