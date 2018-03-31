/**
 * GetXxcfjcResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetXxcfjcResponse  implements java.io.Serializable {
    private org.tempuri.GetXxcfjcResponseGetXxcfjcResult getXxcfjcResult;

    public GetXxcfjcResponse() {
    }

    public GetXxcfjcResponse(
           org.tempuri.GetXxcfjcResponseGetXxcfjcResult getXxcfjcResult) {
           this.getXxcfjcResult = getXxcfjcResult;
    }


    /**
     * Gets the getXxcfjcResult value for this GetXxcfjcResponse.
     * 
     * @return getXxcfjcResult
     */
    public org.tempuri.GetXxcfjcResponseGetXxcfjcResult getGetXxcfjcResult() {
        return getXxcfjcResult;
    }


    /**
     * Sets the getXxcfjcResult value for this GetXxcfjcResponse.
     * 
     * @param getXxcfjcResult
     */
    public void setGetXxcfjcResult(org.tempuri.GetXxcfjcResponseGetXxcfjcResult getXxcfjcResult) {
        this.getXxcfjcResult = getXxcfjcResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetXxcfjcResponse)) return false;
        GetXxcfjcResponse other = (GetXxcfjcResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getXxcfjcResult==null && other.getGetXxcfjcResult()==null) || 
             (this.getXxcfjcResult!=null &&
              this.getXxcfjcResult.equals(other.getGetXxcfjcResult())));
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
        if (getGetXxcfjcResult() != null) {
            _hashCode += getGetXxcfjcResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetXxcfjcResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetXxcfjcResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getXxcfjcResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetXxcfjcResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetXxcfjcResponse>GetXxcfjcResult"));
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
