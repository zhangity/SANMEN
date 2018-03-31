/**
 * DeleteEXAM_EQUIPMENTByIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DeleteEXAM_EQUIPMENTByIDResponse  implements java.io.Serializable {
    private java.lang.String deleteEXAM_EQUIPMENTByIDResult;

    public DeleteEXAM_EQUIPMENTByIDResponse() {
    }

    public DeleteEXAM_EQUIPMENTByIDResponse(
           java.lang.String deleteEXAM_EQUIPMENTByIDResult) {
           this.deleteEXAM_EQUIPMENTByIDResult = deleteEXAM_EQUIPMENTByIDResult;
    }


    /**
     * Gets the deleteEXAM_EQUIPMENTByIDResult value for this DeleteEXAM_EQUIPMENTByIDResponse.
     * 
     * @return deleteEXAM_EQUIPMENTByIDResult
     */
    public java.lang.String getDeleteEXAM_EQUIPMENTByIDResult() {
        return deleteEXAM_EQUIPMENTByIDResult;
    }


    /**
     * Sets the deleteEXAM_EQUIPMENTByIDResult value for this DeleteEXAM_EQUIPMENTByIDResponse.
     * 
     * @param deleteEXAM_EQUIPMENTByIDResult
     */
    public void setDeleteEXAM_EQUIPMENTByIDResult(java.lang.String deleteEXAM_EQUIPMENTByIDResult) {
        this.deleteEXAM_EQUIPMENTByIDResult = deleteEXAM_EQUIPMENTByIDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteEXAM_EQUIPMENTByIDResponse)) return false;
        DeleteEXAM_EQUIPMENTByIDResponse other = (DeleteEXAM_EQUIPMENTByIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteEXAM_EQUIPMENTByIDResult==null && other.getDeleteEXAM_EQUIPMENTByIDResult()==null) || 
             (this.deleteEXAM_EQUIPMENTByIDResult!=null &&
              this.deleteEXAM_EQUIPMENTByIDResult.equals(other.getDeleteEXAM_EQUIPMENTByIDResult())));
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
        if (getDeleteEXAM_EQUIPMENTByIDResult() != null) {
            _hashCode += getDeleteEXAM_EQUIPMENTByIDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteEXAM_EQUIPMENTByIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteEXAM_EQUIPMENTByIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteEXAM_EQUIPMENTByIDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeleteEXAM_EQUIPMENTByIDResult"));
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
