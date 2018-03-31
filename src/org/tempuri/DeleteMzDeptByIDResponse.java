/**
 * DeleteMzDeptByIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DeleteMzDeptByIDResponse  implements java.io.Serializable {
    private java.lang.String deleteMzDeptByIDResult;

    public DeleteMzDeptByIDResponse() {
    }

    public DeleteMzDeptByIDResponse(
           java.lang.String deleteMzDeptByIDResult) {
           this.deleteMzDeptByIDResult = deleteMzDeptByIDResult;
    }


    /**
     * Gets the deleteMzDeptByIDResult value for this DeleteMzDeptByIDResponse.
     * 
     * @return deleteMzDeptByIDResult
     */
    public java.lang.String getDeleteMzDeptByIDResult() {
        return deleteMzDeptByIDResult;
    }


    /**
     * Sets the deleteMzDeptByIDResult value for this DeleteMzDeptByIDResponse.
     * 
     * @param deleteMzDeptByIDResult
     */
    public void setDeleteMzDeptByIDResult(java.lang.String deleteMzDeptByIDResult) {
        this.deleteMzDeptByIDResult = deleteMzDeptByIDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteMzDeptByIDResponse)) return false;
        DeleteMzDeptByIDResponse other = (DeleteMzDeptByIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteMzDeptByIDResult==null && other.getDeleteMzDeptByIDResult()==null) || 
             (this.deleteMzDeptByIDResult!=null &&
              this.deleteMzDeptByIDResult.equals(other.getDeleteMzDeptByIDResult())));
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
        if (getDeleteMzDeptByIDResult() != null) {
            _hashCode += getDeleteMzDeptByIDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteMzDeptByIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteMzDeptByIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteMzDeptByIDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeleteMzDeptByIDResult"));
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
