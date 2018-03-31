/**
 * GetREGIST_OF_CLINICModelByWhereResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetREGIST_OF_CLINICModelByWhereResponse  implements java.io.Serializable {
    private org.tempuri.REGIST_OF_CLINIC getREGIST_OF_CLINICModelByWhereResult;

    public GetREGIST_OF_CLINICModelByWhereResponse() {
    }

    public GetREGIST_OF_CLINICModelByWhereResponse(
           org.tempuri.REGIST_OF_CLINIC getREGIST_OF_CLINICModelByWhereResult) {
           this.getREGIST_OF_CLINICModelByWhereResult = getREGIST_OF_CLINICModelByWhereResult;
    }


    /**
     * Gets the getREGIST_OF_CLINICModelByWhereResult value for this GetREGIST_OF_CLINICModelByWhereResponse.
     * 
     * @return getREGIST_OF_CLINICModelByWhereResult
     */
    public org.tempuri.REGIST_OF_CLINIC getGetREGIST_OF_CLINICModelByWhereResult() {
        return getREGIST_OF_CLINICModelByWhereResult;
    }


    /**
     * Sets the getREGIST_OF_CLINICModelByWhereResult value for this GetREGIST_OF_CLINICModelByWhereResponse.
     * 
     * @param getREGIST_OF_CLINICModelByWhereResult
     */
    public void setGetREGIST_OF_CLINICModelByWhereResult(org.tempuri.REGIST_OF_CLINIC getREGIST_OF_CLINICModelByWhereResult) {
        this.getREGIST_OF_CLINICModelByWhereResult = getREGIST_OF_CLINICModelByWhereResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetREGIST_OF_CLINICModelByWhereResponse)) return false;
        GetREGIST_OF_CLINICModelByWhereResponse other = (GetREGIST_OF_CLINICModelByWhereResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getREGIST_OF_CLINICModelByWhereResult==null && other.getGetREGIST_OF_CLINICModelByWhereResult()==null) || 
             (this.getREGIST_OF_CLINICModelByWhereResult!=null &&
              this.getREGIST_OF_CLINICModelByWhereResult.equals(other.getGetREGIST_OF_CLINICModelByWhereResult())));
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
        if (getGetREGIST_OF_CLINICModelByWhereResult() != null) {
            _hashCode += getGetREGIST_OF_CLINICModelByWhereResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetREGIST_OF_CLINICModelByWhereResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetREGIST_OF_CLINICModelByWhereResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getREGIST_OF_CLINICModelByWhereResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetREGIST_OF_CLINICModelByWhereResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "REGIST_OF_CLINIC"));
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
