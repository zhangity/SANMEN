/**
 * GetHisSssqQyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetHisSssqQyResponse  implements java.io.Serializable {
    private org.tempuri.GetHisSssqQyResponseGetHisSssqQyResult getHisSssqQyResult;

    public GetHisSssqQyResponse() {
    }

    public GetHisSssqQyResponse(
           org.tempuri.GetHisSssqQyResponseGetHisSssqQyResult getHisSssqQyResult) {
           this.getHisSssqQyResult = getHisSssqQyResult;
    }


    /**
     * Gets the getHisSssqQyResult value for this GetHisSssqQyResponse.
     * 
     * @return getHisSssqQyResult
     */
    public org.tempuri.GetHisSssqQyResponseGetHisSssqQyResult getGetHisSssqQyResult() {
        return getHisSssqQyResult;
    }


    /**
     * Sets the getHisSssqQyResult value for this GetHisSssqQyResponse.
     * 
     * @param getHisSssqQyResult
     */
    public void setGetHisSssqQyResult(org.tempuri.GetHisSssqQyResponseGetHisSssqQyResult getHisSssqQyResult) {
        this.getHisSssqQyResult = getHisSssqQyResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetHisSssqQyResponse)) return false;
        GetHisSssqQyResponse other = (GetHisSssqQyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getHisSssqQyResult==null && other.getGetHisSssqQyResult()==null) || 
             (this.getHisSssqQyResult!=null &&
              this.getHisSssqQyResult.equals(other.getGetHisSssqQyResult())));
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
        if (getGetHisSssqQyResult() != null) {
            _hashCode += getGetHisSssqQyResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetHisSssqQyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetHisSssqQyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getHisSssqQyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetHisSssqQyResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetHisSssqQyResponse>GetHisSssqQyResult"));
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
