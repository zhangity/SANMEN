/**
 * GetXtdbgResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetXtdbgResponse  implements java.io.Serializable {
    private org.tempuri.GetXtdbgResponseGetXtdbgResult getXtdbgResult;

    public GetXtdbgResponse() {
    }

    public GetXtdbgResponse(
           org.tempuri.GetXtdbgResponseGetXtdbgResult getXtdbgResult) {
           this.getXtdbgResult = getXtdbgResult;
    }


    /**
     * Gets the getXtdbgResult value for this GetXtdbgResponse.
     * 
     * @return getXtdbgResult
     */
    public org.tempuri.GetXtdbgResponseGetXtdbgResult getGetXtdbgResult() {
        return getXtdbgResult;
    }


    /**
     * Sets the getXtdbgResult value for this GetXtdbgResponse.
     * 
     * @param getXtdbgResult
     */
    public void setGetXtdbgResult(org.tempuri.GetXtdbgResponseGetXtdbgResult getXtdbgResult) {
        this.getXtdbgResult = getXtdbgResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetXtdbgResponse)) return false;
        GetXtdbgResponse other = (GetXtdbgResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getXtdbgResult==null && other.getGetXtdbgResult()==null) || 
             (this.getXtdbgResult!=null &&
              this.getXtdbgResult.equals(other.getGetXtdbgResult())));
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
        if (getGetXtdbgResult() != null) {
            _hashCode += getGetXtdbgResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetXtdbgResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetXtdbgResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getXtdbgResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetXtdbgResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetXtdbgResponse>GetXtdbgResult"));
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
