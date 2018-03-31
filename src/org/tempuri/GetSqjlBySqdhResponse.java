/**
 * GetSqjlBySqdhResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSqjlBySqdhResponse  implements java.io.Serializable {
    private org.tempuri.GetSqjlBySqdhResponseGetSqjlBySqdhResult getSqjlBySqdhResult;

    public GetSqjlBySqdhResponse() {
    }

    public GetSqjlBySqdhResponse(
           org.tempuri.GetSqjlBySqdhResponseGetSqjlBySqdhResult getSqjlBySqdhResult) {
           this.getSqjlBySqdhResult = getSqjlBySqdhResult;
    }


    /**
     * Gets the getSqjlBySqdhResult value for this GetSqjlBySqdhResponse.
     * 
     * @return getSqjlBySqdhResult
     */
    public org.tempuri.GetSqjlBySqdhResponseGetSqjlBySqdhResult getGetSqjlBySqdhResult() {
        return getSqjlBySqdhResult;
    }


    /**
     * Sets the getSqjlBySqdhResult value for this GetSqjlBySqdhResponse.
     * 
     * @param getSqjlBySqdhResult
     */
    public void setGetSqjlBySqdhResult(org.tempuri.GetSqjlBySqdhResponseGetSqjlBySqdhResult getSqjlBySqdhResult) {
        this.getSqjlBySqdhResult = getSqjlBySqdhResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSqjlBySqdhResponse)) return false;
        GetSqjlBySqdhResponse other = (GetSqjlBySqdhResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSqjlBySqdhResult==null && other.getGetSqjlBySqdhResult()==null) || 
             (this.getSqjlBySqdhResult!=null &&
              this.getSqjlBySqdhResult.equals(other.getGetSqjlBySqdhResult())));
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
        if (getGetSqjlBySqdhResult() != null) {
            _hashCode += getGetSqjlBySqdhResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSqjlBySqdhResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSqjlBySqdhResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSqjlBySqdhResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSqjlBySqdhResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSqjlBySqdhResponse>GetSqjlBySqdhResult"));
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
