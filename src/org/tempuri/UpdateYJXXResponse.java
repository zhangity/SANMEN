/**
 * UpdateYJXXResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateYJXXResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm updateYJXXResult;

    public UpdateYJXXResponse() {
    }

    public UpdateYJXXResponse(
           org.tempuri.ReturnExComm updateYJXXResult) {
           this.updateYJXXResult = updateYJXXResult;
    }


    /**
     * Gets the updateYJXXResult value for this UpdateYJXXResponse.
     * 
     * @return updateYJXXResult
     */
    public org.tempuri.ReturnExComm getUpdateYJXXResult() {
        return updateYJXXResult;
    }


    /**
     * Sets the updateYJXXResult value for this UpdateYJXXResponse.
     * 
     * @param updateYJXXResult
     */
    public void setUpdateYJXXResult(org.tempuri.ReturnExComm updateYJXXResult) {
        this.updateYJXXResult = updateYJXXResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateYJXXResponse)) return false;
        UpdateYJXXResponse other = (UpdateYJXXResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateYJXXResult==null && other.getUpdateYJXXResult()==null) || 
             (this.updateYJXXResult!=null &&
              this.updateYJXXResult.equals(other.getUpdateYJXXResult())));
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
        if (getUpdateYJXXResult() != null) {
            _hashCode += getUpdateYJXXResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateYJXXResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateYJXXResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateYJXXResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateYJXXResult"));
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
