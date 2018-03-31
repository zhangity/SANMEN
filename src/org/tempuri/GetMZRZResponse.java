/**
 * GetMZRZResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMZRZResponse  implements java.io.Serializable {
    private org.tempuri.GetMZRZResponseGetMZRZResult getMZRZResult;

    public GetMZRZResponse() {
    }

    public GetMZRZResponse(
           org.tempuri.GetMZRZResponseGetMZRZResult getMZRZResult) {
           this.getMZRZResult = getMZRZResult;
    }


    /**
     * Gets the getMZRZResult value for this GetMZRZResponse.
     * 
     * @return getMZRZResult
     */
    public org.tempuri.GetMZRZResponseGetMZRZResult getGetMZRZResult() {
        return getMZRZResult;
    }


    /**
     * Sets the getMZRZResult value for this GetMZRZResponse.
     * 
     * @param getMZRZResult
     */
    public void setGetMZRZResult(org.tempuri.GetMZRZResponseGetMZRZResult getMZRZResult) {
        this.getMZRZResult = getMZRZResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMZRZResponse)) return false;
        GetMZRZResponse other = (GetMZRZResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMZRZResult==null && other.getGetMZRZResult()==null) || 
             (this.getMZRZResult!=null &&
              this.getMZRZResult.equals(other.getGetMZRZResult())));
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
        if (getGetMZRZResult() != null) {
            _hashCode += getGetMZRZResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMZRZResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMZRZResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMZRZResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMZRZResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetMZRZResponse>GetMZRZResult"));
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
