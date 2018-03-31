/**
 * UpPbysResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpPbysResponse  implements java.io.Serializable {
    private org.tempuri.PagedItemReturnObjectDataSet upPbysResult;

    public UpPbysResponse() {
    }

    public UpPbysResponse(
           org.tempuri.PagedItemReturnObjectDataSet upPbysResult) {
           this.upPbysResult = upPbysResult;
    }


    /**
     * Gets the upPbysResult value for this UpPbysResponse.
     * 
     * @return upPbysResult
     */
    public org.tempuri.PagedItemReturnObjectDataSet getUpPbysResult() {
        return upPbysResult;
    }


    /**
     * Sets the upPbysResult value for this UpPbysResponse.
     * 
     * @param upPbysResult
     */
    public void setUpPbysResult(org.tempuri.PagedItemReturnObjectDataSet upPbysResult) {
        this.upPbysResult = upPbysResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpPbysResponse)) return false;
        UpPbysResponse other = (UpPbysResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.upPbysResult==null && other.getUpPbysResult()==null) || 
             (this.upPbysResult!=null &&
              this.upPbysResult.equals(other.getUpPbysResult())));
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
        if (getUpPbysResult() != null) {
            _hashCode += getUpPbysResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpPbysResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpPbysResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upPbysResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpPbysResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "PagedItemReturnObjectDataSet"));
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
