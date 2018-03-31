/**
 * UpdateEXAM_EQUIPMENTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateEXAM_EQUIPMENTResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm updateEXAM_EQUIPMENTResult;

    public UpdateEXAM_EQUIPMENTResponse() {
    }

    public UpdateEXAM_EQUIPMENTResponse(
           org.tempuri.ReturnExComm updateEXAM_EQUIPMENTResult) {
           this.updateEXAM_EQUIPMENTResult = updateEXAM_EQUIPMENTResult;
    }


    /**
     * Gets the updateEXAM_EQUIPMENTResult value for this UpdateEXAM_EQUIPMENTResponse.
     * 
     * @return updateEXAM_EQUIPMENTResult
     */
    public org.tempuri.ReturnExComm getUpdateEXAM_EQUIPMENTResult() {
        return updateEXAM_EQUIPMENTResult;
    }


    /**
     * Sets the updateEXAM_EQUIPMENTResult value for this UpdateEXAM_EQUIPMENTResponse.
     * 
     * @param updateEXAM_EQUIPMENTResult
     */
    public void setUpdateEXAM_EQUIPMENTResult(org.tempuri.ReturnExComm updateEXAM_EQUIPMENTResult) {
        this.updateEXAM_EQUIPMENTResult = updateEXAM_EQUIPMENTResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateEXAM_EQUIPMENTResponse)) return false;
        UpdateEXAM_EQUIPMENTResponse other = (UpdateEXAM_EQUIPMENTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateEXAM_EQUIPMENTResult==null && other.getUpdateEXAM_EQUIPMENTResult()==null) || 
             (this.updateEXAM_EQUIPMENTResult!=null &&
              this.updateEXAM_EQUIPMENTResult.equals(other.getUpdateEXAM_EQUIPMENTResult())));
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
        if (getUpdateEXAM_EQUIPMENTResult() != null) {
            _hashCode += getUpdateEXAM_EQUIPMENTResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateEXAM_EQUIPMENTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateEXAM_EQUIPMENTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateEXAM_EQUIPMENTResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateEXAM_EQUIPMENTResult"));
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
