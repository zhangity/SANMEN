/**
 * UpdateMenuResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateMenuResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm updateMenuResult;

    public UpdateMenuResponse() {
    }

    public UpdateMenuResponse(
           org.tempuri.ReturnExComm updateMenuResult) {
           this.updateMenuResult = updateMenuResult;
    }


    /**
     * Gets the updateMenuResult value for this UpdateMenuResponse.
     * 
     * @return updateMenuResult
     */
    public org.tempuri.ReturnExComm getUpdateMenuResult() {
        return updateMenuResult;
    }


    /**
     * Sets the updateMenuResult value for this UpdateMenuResponse.
     * 
     * @param updateMenuResult
     */
    public void setUpdateMenuResult(org.tempuri.ReturnExComm updateMenuResult) {
        this.updateMenuResult = updateMenuResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateMenuResponse)) return false;
        UpdateMenuResponse other = (UpdateMenuResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateMenuResult==null && other.getUpdateMenuResult()==null) || 
             (this.updateMenuResult!=null &&
              this.updateMenuResult.equals(other.getUpdateMenuResult())));
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
        if (getUpdateMenuResult() != null) {
            _hashCode += getUpdateMenuResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateMenuResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateMenuResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateMenuResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateMenuResult"));
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
