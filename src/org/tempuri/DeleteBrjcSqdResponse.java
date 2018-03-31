/**
 * DeleteBrjcSqdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DeleteBrjcSqdResponse  implements java.io.Serializable {
    private java.lang.String deleteBrjcSqdResult;

    public DeleteBrjcSqdResponse() {
    }

    public DeleteBrjcSqdResponse(
           java.lang.String deleteBrjcSqdResult) {
           this.deleteBrjcSqdResult = deleteBrjcSqdResult;
    }


    /**
     * Gets the deleteBrjcSqdResult value for this DeleteBrjcSqdResponse.
     * 
     * @return deleteBrjcSqdResult
     */
    public java.lang.String getDeleteBrjcSqdResult() {
        return deleteBrjcSqdResult;
    }


    /**
     * Sets the deleteBrjcSqdResult value for this DeleteBrjcSqdResponse.
     * 
     * @param deleteBrjcSqdResult
     */
    public void setDeleteBrjcSqdResult(java.lang.String deleteBrjcSqdResult) {
        this.deleteBrjcSqdResult = deleteBrjcSqdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteBrjcSqdResponse)) return false;
        DeleteBrjcSqdResponse other = (DeleteBrjcSqdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteBrjcSqdResult==null && other.getDeleteBrjcSqdResult()==null) || 
             (this.deleteBrjcSqdResult!=null &&
              this.deleteBrjcSqdResult.equals(other.getDeleteBrjcSqdResult())));
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
        if (getDeleteBrjcSqdResult() != null) {
            _hashCode += getDeleteBrjcSqdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteBrjcSqdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteBrjcSqdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteBrjcSqdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeleteBrjcSqdResult"));
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
