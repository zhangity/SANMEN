/**
 * DeleteBrbqJyyzResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DeleteBrbqJyyzResponse  implements java.io.Serializable {
    private java.lang.String deleteBrbqJyyzResult;

    public DeleteBrbqJyyzResponse() {
    }

    public DeleteBrbqJyyzResponse(
           java.lang.String deleteBrbqJyyzResult) {
           this.deleteBrbqJyyzResult = deleteBrbqJyyzResult;
    }


    /**
     * Gets the deleteBrbqJyyzResult value for this DeleteBrbqJyyzResponse.
     * 
     * @return deleteBrbqJyyzResult
     */
    public java.lang.String getDeleteBrbqJyyzResult() {
        return deleteBrbqJyyzResult;
    }


    /**
     * Sets the deleteBrbqJyyzResult value for this DeleteBrbqJyyzResponse.
     * 
     * @param deleteBrbqJyyzResult
     */
    public void setDeleteBrbqJyyzResult(java.lang.String deleteBrbqJyyzResult) {
        this.deleteBrbqJyyzResult = deleteBrbqJyyzResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteBrbqJyyzResponse)) return false;
        DeleteBrbqJyyzResponse other = (DeleteBrbqJyyzResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteBrbqJyyzResult==null && other.getDeleteBrbqJyyzResult()==null) || 
             (this.deleteBrbqJyyzResult!=null &&
              this.deleteBrbqJyyzResult.equals(other.getDeleteBrbqJyyzResult())));
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
        if (getDeleteBrbqJyyzResult() != null) {
            _hashCode += getDeleteBrbqJyyzResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteBrbqJyyzResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteBrbqJyyzResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteBrbqJyyzResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeleteBrbqJyyzResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
