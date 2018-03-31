/**
 * DeleteMzbrCfxx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DeleteMzbrCfxx  implements java.io.Serializable {
    private java.lang.String cfsb;

    private java.lang.String sbxhs;

    public DeleteMzbrCfxx() {
    }

    public DeleteMzbrCfxx(
           java.lang.String cfsb,
           java.lang.String sbxhs) {
           this.cfsb = cfsb;
           this.sbxhs = sbxhs;
    }


    /**
     * Gets the cfsb value for this DeleteMzbrCfxx.
     * 
     * @return cfsb
     */
    public java.lang.String getCfsb() {
        return cfsb;
    }


    /**
     * Sets the cfsb value for this DeleteMzbrCfxx.
     * 
     * @param cfsb
     */
    public void setCfsb(java.lang.String cfsb) {
        this.cfsb = cfsb;
    }


    /**
     * Gets the sbxhs value for this DeleteMzbrCfxx.
     * 
     * @return sbxhs
     */
    public java.lang.String getSbxhs() {
        return sbxhs;
    }


    /**
     * Sets the sbxhs value for this DeleteMzbrCfxx.
     * 
     * @param sbxhs
     */
    public void setSbxhs(java.lang.String sbxhs) {
        this.sbxhs = sbxhs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteMzbrCfxx)) return false;
        DeleteMzbrCfxx other = (DeleteMzbrCfxx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cfsb==null && other.getCfsb()==null) || 
             (this.cfsb!=null &&
              this.cfsb.equals(other.getCfsb()))) &&
            ((this.sbxhs==null && other.getSbxhs()==null) || 
             (this.sbxhs!=null &&
              this.sbxhs.equals(other.getSbxhs())));
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
        if (getCfsb() != null) {
            _hashCode += getCfsb().hashCode();
        }
        if (getSbxhs() != null) {
            _hashCode += getSbxhs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteMzbrCfxx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteMzbrCfxx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cfsb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "cfsb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sbxhs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sbxhs"));
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
