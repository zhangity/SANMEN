/**
 * GetJclxListAsJcksResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetJclxListAsJcksResponse  implements java.io.Serializable {
    private org.tempuri.GetJclxListAsJcksResponseGetJclxListAsJcksResult getJclxListAsJcksResult;

    public GetJclxListAsJcksResponse() {
    }

    public GetJclxListAsJcksResponse(
           org.tempuri.GetJclxListAsJcksResponseGetJclxListAsJcksResult getJclxListAsJcksResult) {
           this.getJclxListAsJcksResult = getJclxListAsJcksResult;
    }


    /**
     * Gets the getJclxListAsJcksResult value for this GetJclxListAsJcksResponse.
     * 
     * @return getJclxListAsJcksResult
     */
    public org.tempuri.GetJclxListAsJcksResponseGetJclxListAsJcksResult getGetJclxListAsJcksResult() {
        return getJclxListAsJcksResult;
    }


    /**
     * Sets the getJclxListAsJcksResult value for this GetJclxListAsJcksResponse.
     * 
     * @param getJclxListAsJcksResult
     */
    public void setGetJclxListAsJcksResult(org.tempuri.GetJclxListAsJcksResponseGetJclxListAsJcksResult getJclxListAsJcksResult) {
        this.getJclxListAsJcksResult = getJclxListAsJcksResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetJclxListAsJcksResponse)) return false;
        GetJclxListAsJcksResponse other = (GetJclxListAsJcksResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getJclxListAsJcksResult==null && other.getGetJclxListAsJcksResult()==null) || 
             (this.getJclxListAsJcksResult!=null &&
              this.getJclxListAsJcksResult.equals(other.getGetJclxListAsJcksResult())));
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
        if (getGetJclxListAsJcksResult() != null) {
            _hashCode += getGetJclxListAsJcksResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetJclxListAsJcksResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetJclxListAsJcksResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getJclxListAsJcksResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetJclxListAsJcksResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetJclxListAsJcksResponse>GetJclxListAsJcksResult"));
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
