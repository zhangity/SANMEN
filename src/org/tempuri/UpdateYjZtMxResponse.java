/**
 * UpdateYjZtMxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateYjZtMxResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm updateYjZtMxResult;

    public UpdateYjZtMxResponse() {
    }

    public UpdateYjZtMxResponse(
           org.tempuri.ReturnExComm updateYjZtMxResult) {
           this.updateYjZtMxResult = updateYjZtMxResult;
    }


    /**
     * Gets the updateYjZtMxResult value for this UpdateYjZtMxResponse.
     * 
     * @return updateYjZtMxResult
     */
    public org.tempuri.ReturnExComm getUpdateYjZtMxResult() {
        return updateYjZtMxResult;
    }


    /**
     * Sets the updateYjZtMxResult value for this UpdateYjZtMxResponse.
     * 
     * @param updateYjZtMxResult
     */
    public void setUpdateYjZtMxResult(org.tempuri.ReturnExComm updateYjZtMxResult) {
        this.updateYjZtMxResult = updateYjZtMxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateYjZtMxResponse)) return false;
        UpdateYjZtMxResponse other = (UpdateYjZtMxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateYjZtMxResult==null && other.getUpdateYjZtMxResult()==null) || 
             (this.updateYjZtMxResult!=null &&
              this.updateYjZtMxResult.equals(other.getUpdateYjZtMxResult())));
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
        if (getUpdateYjZtMxResult() != null) {
            _hashCode += getUpdateYjZtMxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateYjZtMxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateYjZtMxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateYjZtMxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateYjZtMxResult"));
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
