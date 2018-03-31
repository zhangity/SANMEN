/**
 * UpdatePATIENT_RELATIVE_INFOResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdatePATIENT_RELATIVE_INFOResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm updatePATIENT_RELATIVE_INFOResult;

    public UpdatePATIENT_RELATIVE_INFOResponse() {
    }

    public UpdatePATIENT_RELATIVE_INFOResponse(
           org.tempuri.ReturnExComm updatePATIENT_RELATIVE_INFOResult) {
           this.updatePATIENT_RELATIVE_INFOResult = updatePATIENT_RELATIVE_INFOResult;
    }


    /**
     * Gets the updatePATIENT_RELATIVE_INFOResult value for this UpdatePATIENT_RELATIVE_INFOResponse.
     * 
     * @return updatePATIENT_RELATIVE_INFOResult
     */
    public org.tempuri.ReturnExComm getUpdatePATIENT_RELATIVE_INFOResult() {
        return updatePATIENT_RELATIVE_INFOResult;
    }


    /**
     * Sets the updatePATIENT_RELATIVE_INFOResult value for this UpdatePATIENT_RELATIVE_INFOResponse.
     * 
     * @param updatePATIENT_RELATIVE_INFOResult
     */
    public void setUpdatePATIENT_RELATIVE_INFOResult(org.tempuri.ReturnExComm updatePATIENT_RELATIVE_INFOResult) {
        this.updatePATIENT_RELATIVE_INFOResult = updatePATIENT_RELATIVE_INFOResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdatePATIENT_RELATIVE_INFOResponse)) return false;
        UpdatePATIENT_RELATIVE_INFOResponse other = (UpdatePATIENT_RELATIVE_INFOResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updatePATIENT_RELATIVE_INFOResult==null && other.getUpdatePATIENT_RELATIVE_INFOResult()==null) || 
             (this.updatePATIENT_RELATIVE_INFOResult!=null &&
              this.updatePATIENT_RELATIVE_INFOResult.equals(other.getUpdatePATIENT_RELATIVE_INFOResult())));
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
        if (getUpdatePATIENT_RELATIVE_INFOResult() != null) {
            _hashCode += getUpdatePATIENT_RELATIVE_INFOResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdatePATIENT_RELATIVE_INFOResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdatePATIENT_RELATIVE_INFOResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatePATIENT_RELATIVE_INFOResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdatePATIENT_RELATIVE_INFOResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExComm"));
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
