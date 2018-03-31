/**
 * GetGhMzxxCreateTjResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetGhMzxxCreateTjResponse  implements java.io.Serializable {
    private org.tempuri.GetGhMzxxCreateTjResponseGetGhMzxxCreateTjResult getGhMzxxCreateTjResult;

    public GetGhMzxxCreateTjResponse() {
    }

    public GetGhMzxxCreateTjResponse(
           org.tempuri.GetGhMzxxCreateTjResponseGetGhMzxxCreateTjResult getGhMzxxCreateTjResult) {
           this.getGhMzxxCreateTjResult = getGhMzxxCreateTjResult;
    }


    /**
     * Gets the getGhMzxxCreateTjResult value for this GetGhMzxxCreateTjResponse.
     * 
     * @return getGhMzxxCreateTjResult
     */
    public org.tempuri.GetGhMzxxCreateTjResponseGetGhMzxxCreateTjResult getGetGhMzxxCreateTjResult() {
        return getGhMzxxCreateTjResult;
    }


    /**
     * Sets the getGhMzxxCreateTjResult value for this GetGhMzxxCreateTjResponse.
     * 
     * @param getGhMzxxCreateTjResult
     */
    public void setGetGhMzxxCreateTjResult(org.tempuri.GetGhMzxxCreateTjResponseGetGhMzxxCreateTjResult getGhMzxxCreateTjResult) {
        this.getGhMzxxCreateTjResult = getGhMzxxCreateTjResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGhMzxxCreateTjResponse)) return false;
        GetGhMzxxCreateTjResponse other = (GetGhMzxxCreateTjResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getGhMzxxCreateTjResult==null && other.getGetGhMzxxCreateTjResult()==null) || 
             (this.getGhMzxxCreateTjResult!=null &&
              this.getGhMzxxCreateTjResult.equals(other.getGetGhMzxxCreateTjResult())));
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
        if (getGetGhMzxxCreateTjResult() != null) {
            _hashCode += getGetGhMzxxCreateTjResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGhMzxxCreateTjResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetGhMzxxCreateTjResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getGhMzxxCreateTjResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetGhMzxxCreateTjResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetGhMzxxCreateTjResponse>GetGhMzxxCreateTjResult"));
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
