/**
 * GetSzmxbResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSzmxbResponse  implements java.io.Serializable {
    private org.tempuri.GetSzmxbResponseGetSzmxbResult getSzmxbResult;

    public GetSzmxbResponse() {
    }

    public GetSzmxbResponse(
           org.tempuri.GetSzmxbResponseGetSzmxbResult getSzmxbResult) {
           this.getSzmxbResult = getSzmxbResult;
    }


    /**
     * Gets the getSzmxbResult value for this GetSzmxbResponse.
     * 
     * @return getSzmxbResult
     */
    public org.tempuri.GetSzmxbResponseGetSzmxbResult getGetSzmxbResult() {
        return getSzmxbResult;
    }


    /**
     * Sets the getSzmxbResult value for this GetSzmxbResponse.
     * 
     * @param getSzmxbResult
     */
    public void setGetSzmxbResult(org.tempuri.GetSzmxbResponseGetSzmxbResult getSzmxbResult) {
        this.getSzmxbResult = getSzmxbResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSzmxbResponse)) return false;
        GetSzmxbResponse other = (GetSzmxbResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSzmxbResult==null && other.getGetSzmxbResult()==null) || 
             (this.getSzmxbResult!=null &&
              this.getSzmxbResult.equals(other.getGetSzmxbResult())));
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
        if (getGetSzmxbResult() != null) {
            _hashCode += getGetSzmxbResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSzmxbResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSzmxbResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSzmxbResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSzmxbResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSzmxbResponse>GetSzmxbResult"));
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
