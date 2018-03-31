/**
 * UpdateMZRZResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateMZRZResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm updateMZRZResult;

    public UpdateMZRZResponse() {
    }

    public UpdateMZRZResponse(
           org.tempuri.ReturnExComm updateMZRZResult) {
           this.updateMZRZResult = updateMZRZResult;
    }


    /**
     * Gets the updateMZRZResult value for this UpdateMZRZResponse.
     * 
     * @return updateMZRZResult
     */
    public org.tempuri.ReturnExComm getUpdateMZRZResult() {
        return updateMZRZResult;
    }


    /**
     * Sets the updateMZRZResult value for this UpdateMZRZResponse.
     * 
     * @param updateMZRZResult
     */
    public void setUpdateMZRZResult(org.tempuri.ReturnExComm updateMZRZResult) {
        this.updateMZRZResult = updateMZRZResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateMZRZResponse)) return false;
        UpdateMZRZResponse other = (UpdateMZRZResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateMZRZResult==null && other.getUpdateMZRZResult()==null) || 
             (this.updateMZRZResult!=null &&
              this.updateMZRZResult.equals(other.getUpdateMZRZResult())));
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
        if (getUpdateMZRZResult() != null) {
            _hashCode += getUpdateMZRZResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateMZRZResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateMZRZResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateMZRZResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateMZRZResult"));
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
