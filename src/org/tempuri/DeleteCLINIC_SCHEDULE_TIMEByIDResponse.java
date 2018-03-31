/**
 * DeleteCLINIC_SCHEDULE_TIMEByIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DeleteCLINIC_SCHEDULE_TIMEByIDResponse  implements java.io.Serializable {
    private java.lang.String deleteCLINIC_SCHEDULE_TIMEByIDResult;

    public DeleteCLINIC_SCHEDULE_TIMEByIDResponse() {
    }

    public DeleteCLINIC_SCHEDULE_TIMEByIDResponse(
           java.lang.String deleteCLINIC_SCHEDULE_TIMEByIDResult) {
           this.deleteCLINIC_SCHEDULE_TIMEByIDResult = deleteCLINIC_SCHEDULE_TIMEByIDResult;
    }


    /**
     * Gets the deleteCLINIC_SCHEDULE_TIMEByIDResult value for this DeleteCLINIC_SCHEDULE_TIMEByIDResponse.
     * 
     * @return deleteCLINIC_SCHEDULE_TIMEByIDResult
     */
    public java.lang.String getDeleteCLINIC_SCHEDULE_TIMEByIDResult() {
        return deleteCLINIC_SCHEDULE_TIMEByIDResult;
    }


    /**
     * Sets the deleteCLINIC_SCHEDULE_TIMEByIDResult value for this DeleteCLINIC_SCHEDULE_TIMEByIDResponse.
     * 
     * @param deleteCLINIC_SCHEDULE_TIMEByIDResult
     */
    public void setDeleteCLINIC_SCHEDULE_TIMEByIDResult(java.lang.String deleteCLINIC_SCHEDULE_TIMEByIDResult) {
        this.deleteCLINIC_SCHEDULE_TIMEByIDResult = deleteCLINIC_SCHEDULE_TIMEByIDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteCLINIC_SCHEDULE_TIMEByIDResponse)) return false;
        DeleteCLINIC_SCHEDULE_TIMEByIDResponse other = (DeleteCLINIC_SCHEDULE_TIMEByIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteCLINIC_SCHEDULE_TIMEByIDResult==null && other.getDeleteCLINIC_SCHEDULE_TIMEByIDResult()==null) || 
             (this.deleteCLINIC_SCHEDULE_TIMEByIDResult!=null &&
              this.deleteCLINIC_SCHEDULE_TIMEByIDResult.equals(other.getDeleteCLINIC_SCHEDULE_TIMEByIDResult())));
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
        if (getDeleteCLINIC_SCHEDULE_TIMEByIDResult() != null) {
            _hashCode += getDeleteCLINIC_SCHEDULE_TIMEByIDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteCLINIC_SCHEDULE_TIMEByIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteCLINIC_SCHEDULE_TIMEByIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteCLINIC_SCHEDULE_TIMEByIDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeleteCLINIC_SCHEDULE_TIMEByIDResult"));
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
