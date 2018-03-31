/**
 * UpdateYyfEditorMbResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateYyfEditorMbResponse  implements java.io.Serializable {
    private java.lang.String updateYyfEditorMbResult;

    public UpdateYyfEditorMbResponse() {
    }

    public UpdateYyfEditorMbResponse(
           java.lang.String updateYyfEditorMbResult) {
           this.updateYyfEditorMbResult = updateYyfEditorMbResult;
    }


    /**
     * Gets the updateYyfEditorMbResult value for this UpdateYyfEditorMbResponse.
     * 
     * @return updateYyfEditorMbResult
     */
    public java.lang.String getUpdateYyfEditorMbResult() {
        return updateYyfEditorMbResult;
    }


    /**
     * Sets the updateYyfEditorMbResult value for this UpdateYyfEditorMbResponse.
     * 
     * @param updateYyfEditorMbResult
     */
    public void setUpdateYyfEditorMbResult(java.lang.String updateYyfEditorMbResult) {
        this.updateYyfEditorMbResult = updateYyfEditorMbResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateYyfEditorMbResponse)) return false;
        UpdateYyfEditorMbResponse other = (UpdateYyfEditorMbResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateYyfEditorMbResult==null && other.getUpdateYyfEditorMbResult()==null) || 
             (this.updateYyfEditorMbResult!=null &&
              this.updateYyfEditorMbResult.equals(other.getUpdateYyfEditorMbResult())));
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
        if (getUpdateYyfEditorMbResult() != null) {
            _hashCode += getUpdateYyfEditorMbResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateYyfEditorMbResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateYyfEditorMbResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateYyfEditorMbResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateYyfEditorMbResult"));
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
