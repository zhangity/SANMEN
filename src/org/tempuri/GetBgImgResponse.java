/**
 * GetBgImgResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetBgImgResponse  implements java.io.Serializable {
    private org.tempuri.GetBgImgResponseGetBgImgResult getBgImgResult;

    public GetBgImgResponse() {
    }

    public GetBgImgResponse(
           org.tempuri.GetBgImgResponseGetBgImgResult getBgImgResult) {
           this.getBgImgResult = getBgImgResult;
    }


    /**
     * Gets the getBgImgResult value for this GetBgImgResponse.
     * 
     * @return getBgImgResult
     */
    public org.tempuri.GetBgImgResponseGetBgImgResult getGetBgImgResult() {
        return getBgImgResult;
    }


    /**
     * Sets the getBgImgResult value for this GetBgImgResponse.
     * 
     * @param getBgImgResult
     */
    public void setGetBgImgResult(org.tempuri.GetBgImgResponseGetBgImgResult getBgImgResult) {
        this.getBgImgResult = getBgImgResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBgImgResponse)) return false;
        GetBgImgResponse other = (GetBgImgResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getBgImgResult==null && other.getGetBgImgResult()==null) || 
             (this.getBgImgResult!=null &&
              this.getBgImgResult.equals(other.getGetBgImgResult())));
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
        if (getGetBgImgResult() != null) {
            _hashCode += getGetBgImgResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBgImgResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetBgImgResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBgImgResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetBgImgResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetBgImgResponse>GetBgImgResult"));
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
