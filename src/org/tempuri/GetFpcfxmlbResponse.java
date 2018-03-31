/**
 * GetFpcfxmlbResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetFpcfxmlbResponse  implements java.io.Serializable {
    private org.tempuri.GetFpcfxmlbResponseGetFpcfxmlbResult getFpcfxmlbResult;

    public GetFpcfxmlbResponse() {
    }

    public GetFpcfxmlbResponse(
           org.tempuri.GetFpcfxmlbResponseGetFpcfxmlbResult getFpcfxmlbResult) {
           this.getFpcfxmlbResult = getFpcfxmlbResult;
    }


    /**
     * Gets the getFpcfxmlbResult value for this GetFpcfxmlbResponse.
     * 
     * @return getFpcfxmlbResult
     */
    public org.tempuri.GetFpcfxmlbResponseGetFpcfxmlbResult getGetFpcfxmlbResult() {
        return getFpcfxmlbResult;
    }


    /**
     * Sets the getFpcfxmlbResult value for this GetFpcfxmlbResponse.
     * 
     * @param getFpcfxmlbResult
     */
    public void setGetFpcfxmlbResult(org.tempuri.GetFpcfxmlbResponseGetFpcfxmlbResult getFpcfxmlbResult) {
        this.getFpcfxmlbResult = getFpcfxmlbResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFpcfxmlbResponse)) return false;
        GetFpcfxmlbResponse other = (GetFpcfxmlbResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFpcfxmlbResult==null && other.getGetFpcfxmlbResult()==null) || 
             (this.getFpcfxmlbResult!=null &&
              this.getFpcfxmlbResult.equals(other.getGetFpcfxmlbResult())));
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
        if (getGetFpcfxmlbResult() != null) {
            _hashCode += getGetFpcfxmlbResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFpcfxmlbResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetFpcfxmlbResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFpcfxmlbResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetFpcfxmlbResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetFpcfxmlbResponse>GetFpcfxmlbResult"));
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
