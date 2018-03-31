/**
 * UpdateCyxmMrMxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateCyxmMrMxResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm updateCyxmMrMxResult;

    public UpdateCyxmMrMxResponse() {
    }

    public UpdateCyxmMrMxResponse(
           org.tempuri.ReturnExComm updateCyxmMrMxResult) {
           this.updateCyxmMrMxResult = updateCyxmMrMxResult;
    }


    /**
     * Gets the updateCyxmMrMxResult value for this UpdateCyxmMrMxResponse.
     * 
     * @return updateCyxmMrMxResult
     */
    public org.tempuri.ReturnExComm getUpdateCyxmMrMxResult() {
        return updateCyxmMrMxResult;
    }


    /**
     * Sets the updateCyxmMrMxResult value for this UpdateCyxmMrMxResponse.
     * 
     * @param updateCyxmMrMxResult
     */
    public void setUpdateCyxmMrMxResult(org.tempuri.ReturnExComm updateCyxmMrMxResult) {
        this.updateCyxmMrMxResult = updateCyxmMrMxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateCyxmMrMxResponse)) return false;
        UpdateCyxmMrMxResponse other = (UpdateCyxmMrMxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateCyxmMrMxResult==null && other.getUpdateCyxmMrMxResult()==null) || 
             (this.updateCyxmMrMxResult!=null &&
              this.updateCyxmMrMxResult.equals(other.getUpdateCyxmMrMxResult())));
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
        if (getUpdateCyxmMrMxResult() != null) {
            _hashCode += getUpdateCyxmMrMxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCyxmMrMxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateCyxmMrMxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateCyxmMrMxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateCyxmMrMxResult"));
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
