/**
 * SaveBlmbResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SaveBlmbResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm saveBlmbResult;

    public SaveBlmbResponse() {
    }

    public SaveBlmbResponse(
           org.tempuri.ReturnExComm saveBlmbResult) {
           this.saveBlmbResult = saveBlmbResult;
    }


    /**
     * Gets the saveBlmbResult value for this SaveBlmbResponse.
     * 
     * @return saveBlmbResult
     */
    public org.tempuri.ReturnExComm getSaveBlmbResult() {
        return saveBlmbResult;
    }


    /**
     * Sets the saveBlmbResult value for this SaveBlmbResponse.
     * 
     * @param saveBlmbResult
     */
    public void setSaveBlmbResult(org.tempuri.ReturnExComm saveBlmbResult) {
        this.saveBlmbResult = saveBlmbResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaveBlmbResponse)) return false;
        SaveBlmbResponse other = (SaveBlmbResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.saveBlmbResult==null && other.getSaveBlmbResult()==null) || 
             (this.saveBlmbResult!=null &&
              this.saveBlmbResult.equals(other.getSaveBlmbResult())));
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
        if (getSaveBlmbResult() != null) {
            _hashCode += getSaveBlmbResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaveBlmbResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SaveBlmbResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saveBlmbResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SaveBlmbResult"));
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
