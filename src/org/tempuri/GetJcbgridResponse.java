/**
 * GetJcbgridResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetJcbgridResponse  implements java.io.Serializable {
    private org.tempuri.GetJcbgridResponseGetJcbgridResult getJcbgridResult;

    public GetJcbgridResponse() {
    }

    public GetJcbgridResponse(
           org.tempuri.GetJcbgridResponseGetJcbgridResult getJcbgridResult) {
           this.getJcbgridResult = getJcbgridResult;
    }


    /**
     * Gets the getJcbgridResult value for this GetJcbgridResponse.
     * 
     * @return getJcbgridResult
     */
    public org.tempuri.GetJcbgridResponseGetJcbgridResult getGetJcbgridResult() {
        return getJcbgridResult;
    }


    /**
     * Sets the getJcbgridResult value for this GetJcbgridResponse.
     * 
     * @param getJcbgridResult
     */
    public void setGetJcbgridResult(org.tempuri.GetJcbgridResponseGetJcbgridResult getJcbgridResult) {
        this.getJcbgridResult = getJcbgridResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetJcbgridResponse)) return false;
        GetJcbgridResponse other = (GetJcbgridResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getJcbgridResult==null && other.getGetJcbgridResult()==null) || 
             (this.getJcbgridResult!=null &&
              this.getJcbgridResult.equals(other.getGetJcbgridResult())));
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
        if (getGetJcbgridResult() != null) {
            _hashCode += getGetJcbgridResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetJcbgridResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetJcbgridResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getJcbgridResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetJcbgridResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetJcbgridResponse>GetJcbgridResult"));
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
