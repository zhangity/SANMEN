/**
 * GetSingleTableResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSingleTableResponse  implements java.io.Serializable {
    private org.tempuri.GetSingleTableResponseGetSingleTableResult getSingleTableResult;

    public GetSingleTableResponse() {
    }

    public GetSingleTableResponse(
           org.tempuri.GetSingleTableResponseGetSingleTableResult getSingleTableResult) {
           this.getSingleTableResult = getSingleTableResult;
    }


    /**
     * Gets the getSingleTableResult value for this GetSingleTableResponse.
     * 
     * @return getSingleTableResult
     */
    public org.tempuri.GetSingleTableResponseGetSingleTableResult getGetSingleTableResult() {
        return getSingleTableResult;
    }


    /**
     * Sets the getSingleTableResult value for this GetSingleTableResponse.
     * 
     * @param getSingleTableResult
     */
    public void setGetSingleTableResult(org.tempuri.GetSingleTableResponseGetSingleTableResult getSingleTableResult) {
        this.getSingleTableResult = getSingleTableResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSingleTableResponse)) return false;
        GetSingleTableResponse other = (GetSingleTableResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSingleTableResult==null && other.getGetSingleTableResult()==null) || 
             (this.getSingleTableResult!=null &&
              this.getSingleTableResult.equals(other.getGetSingleTableResult())));
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
        if (getGetSingleTableResult() != null) {
            _hashCode += getGetSingleTableResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSingleTableResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSingleTableResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSingleTableResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSingleTableResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSingleTableResponse>GetSingleTableResult"));
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
