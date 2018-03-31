/**
 * DeleteCLINIC_SCHEDULE_TIMEResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DeleteCLINIC_SCHEDULE_TIMEResponse  implements java.io.Serializable {
    private java.lang.String deleteCLINIC_SCHEDULE_TIMEResult;

    public DeleteCLINIC_SCHEDULE_TIMEResponse() {
    }

    public DeleteCLINIC_SCHEDULE_TIMEResponse(
           java.lang.String deleteCLINIC_SCHEDULE_TIMEResult) {
           this.deleteCLINIC_SCHEDULE_TIMEResult = deleteCLINIC_SCHEDULE_TIMEResult;
    }


    /**
     * Gets the deleteCLINIC_SCHEDULE_TIMEResult value for this DeleteCLINIC_SCHEDULE_TIMEResponse.
     * 
     * @return deleteCLINIC_SCHEDULE_TIMEResult
     */
    public java.lang.String getDeleteCLINIC_SCHEDULE_TIMEResult() {
        return deleteCLINIC_SCHEDULE_TIMEResult;
    }


    /**
     * Sets the deleteCLINIC_SCHEDULE_TIMEResult value for this DeleteCLINIC_SCHEDULE_TIMEResponse.
     * 
     * @param deleteCLINIC_SCHEDULE_TIMEResult
     */
    public void setDeleteCLINIC_SCHEDULE_TIMEResult(java.lang.String deleteCLINIC_SCHEDULE_TIMEResult) {
        this.deleteCLINIC_SCHEDULE_TIMEResult = deleteCLINIC_SCHEDULE_TIMEResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteCLINIC_SCHEDULE_TIMEResponse)) return false;
        DeleteCLINIC_SCHEDULE_TIMEResponse other = (DeleteCLINIC_SCHEDULE_TIMEResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteCLINIC_SCHEDULE_TIMEResult==null && other.getDeleteCLINIC_SCHEDULE_TIMEResult()==null) || 
             (this.deleteCLINIC_SCHEDULE_TIMEResult!=null &&
              this.deleteCLINIC_SCHEDULE_TIMEResult.equals(other.getDeleteCLINIC_SCHEDULE_TIMEResult())));
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
        if (getDeleteCLINIC_SCHEDULE_TIMEResult() != null) {
            _hashCode += getDeleteCLINIC_SCHEDULE_TIMEResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteCLINIC_SCHEDULE_TIMEResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteCLINIC_SCHEDULE_TIMEResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteCLINIC_SCHEDULE_TIMEResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeleteCLINIC_SCHEDULE_TIMEResult"));
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
