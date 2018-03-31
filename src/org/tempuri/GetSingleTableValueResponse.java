/**
 * GetSingleTableValueResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSingleTableValueResponse  implements java.io.Serializable {
    private org.tempuri.GetSingleTableValueResponseGetSingleTableValueResult getSingleTableValueResult;

    public GetSingleTableValueResponse() {
    }

    public GetSingleTableValueResponse(
           org.tempuri.GetSingleTableValueResponseGetSingleTableValueResult getSingleTableValueResult) {
           this.getSingleTableValueResult = getSingleTableValueResult;
    }


    /**
     * Gets the getSingleTableValueResult value for this GetSingleTableValueResponse.
     * 
     * @return getSingleTableValueResult
     */
    public org.tempuri.GetSingleTableValueResponseGetSingleTableValueResult getGetSingleTableValueResult() {
        return getSingleTableValueResult;
    }


    /**
     * Sets the getSingleTableValueResult value for this GetSingleTableValueResponse.
     * 
     * @param getSingleTableValueResult
     */
    public void setGetSingleTableValueResult(org.tempuri.GetSingleTableValueResponseGetSingleTableValueResult getSingleTableValueResult) {
        this.getSingleTableValueResult = getSingleTableValueResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSingleTableValueResponse)) return false;
        GetSingleTableValueResponse other = (GetSingleTableValueResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSingleTableValueResult==null && other.getGetSingleTableValueResult()==null) || 
             (this.getSingleTableValueResult!=null &&
              this.getSingleTableValueResult.equals(other.getGetSingleTableValueResult())));
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
        if (getGetSingleTableValueResult() != null) {
            _hashCode += getGetSingleTableValueResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSingleTableValueResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSingleTableValueResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSingleTableValueResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSingleTableValueResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSingleTableValueResponse>GetSingleTableValueResult"));
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
