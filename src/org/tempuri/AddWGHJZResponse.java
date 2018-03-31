/**
 * AddWGHJZResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AddWGHJZResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm addWGHJZResult;

    public AddWGHJZResponse() {
    }

    public AddWGHJZResponse(
           org.tempuri.ReturnExComm addWGHJZResult) {
           this.addWGHJZResult = addWGHJZResult;
    }


    /**
     * Gets the addWGHJZResult value for this AddWGHJZResponse.
     * 
     * @return addWGHJZResult
     */
    public org.tempuri.ReturnExComm getAddWGHJZResult() {
        return addWGHJZResult;
    }


    /**
     * Sets the addWGHJZResult value for this AddWGHJZResponse.
     * 
     * @param addWGHJZResult
     */
    public void setAddWGHJZResult(org.tempuri.ReturnExComm addWGHJZResult) {
        this.addWGHJZResult = addWGHJZResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddWGHJZResponse)) return false;
        AddWGHJZResponse other = (AddWGHJZResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addWGHJZResult==null && other.getAddWGHJZResult()==null) || 
             (this.addWGHJZResult!=null &&
              this.addWGHJZResult.equals(other.getAddWGHJZResult())));
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
        if (getAddWGHJZResult() != null) {
            _hashCode += getAddWGHJZResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddWGHJZResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddWGHJZResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addWGHJZResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AddWGHJZResult"));
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
