/**
 * GetExcelMzRzXXResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetExcelMzRzXXResponse  implements java.io.Serializable {
    private org.tempuri.GetExcelMzRzXXResponseGetExcelMzRzXXResult getExcelMzRzXXResult;

    public GetExcelMzRzXXResponse() {
    }

    public GetExcelMzRzXXResponse(
           org.tempuri.GetExcelMzRzXXResponseGetExcelMzRzXXResult getExcelMzRzXXResult) {
           this.getExcelMzRzXXResult = getExcelMzRzXXResult;
    }


    /**
     * Gets the getExcelMzRzXXResult value for this GetExcelMzRzXXResponse.
     * 
     * @return getExcelMzRzXXResult
     */
    public org.tempuri.GetExcelMzRzXXResponseGetExcelMzRzXXResult getGetExcelMzRzXXResult() {
        return getExcelMzRzXXResult;
    }


    /**
     * Sets the getExcelMzRzXXResult value for this GetExcelMzRzXXResponse.
     * 
     * @param getExcelMzRzXXResult
     */
    public void setGetExcelMzRzXXResult(org.tempuri.GetExcelMzRzXXResponseGetExcelMzRzXXResult getExcelMzRzXXResult) {
        this.getExcelMzRzXXResult = getExcelMzRzXXResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetExcelMzRzXXResponse)) return false;
        GetExcelMzRzXXResponse other = (GetExcelMzRzXXResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getExcelMzRzXXResult==null && other.getGetExcelMzRzXXResult()==null) || 
             (this.getExcelMzRzXXResult!=null &&
              this.getExcelMzRzXXResult.equals(other.getGetExcelMzRzXXResult())));
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
        if (getGetExcelMzRzXXResult() != null) {
            _hashCode += getGetExcelMzRzXXResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExcelMzRzXXResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetExcelMzRzXXResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getExcelMzRzXXResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetExcelMzRzXXResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetExcelMzRzXXResponse>GetExcelMzRzXXResult"));
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
