/**
 * UpdatePring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdatePring  implements java.io.Serializable {
    private java.lang.String pringbgId;

    private java.lang.String type;

    private java.lang.String bgsj;

    private java.lang.String gh;

    public UpdatePring() {
    }

    public UpdatePring(
           java.lang.String pringbgId,
           java.lang.String type,
           java.lang.String bgsj,
           java.lang.String gh) {
           this.pringbgId = pringbgId;
           this.type = type;
           this.bgsj = bgsj;
           this.gh = gh;
    }


    /**
     * Gets the pringbgId value for this UpdatePring.
     * 
     * @return pringbgId
     */
    public java.lang.String getPringbgId() {
        return pringbgId;
    }


    /**
     * Sets the pringbgId value for this UpdatePring.
     * 
     * @param pringbgId
     */
    public void setPringbgId(java.lang.String pringbgId) {
        this.pringbgId = pringbgId;
    }


    /**
     * Gets the type value for this UpdatePring.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this UpdatePring.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the bgsj value for this UpdatePring.
     * 
     * @return bgsj
     */
    public java.lang.String getBgsj() {
        return bgsj;
    }


    /**
     * Sets the bgsj value for this UpdatePring.
     * 
     * @param bgsj
     */
    public void setBgsj(java.lang.String bgsj) {
        this.bgsj = bgsj;
    }


    /**
     * Gets the gh value for this UpdatePring.
     * 
     * @return gh
     */
    public java.lang.String getGh() {
        return gh;
    }


    /**
     * Sets the gh value for this UpdatePring.
     * 
     * @param gh
     */
    public void setGh(java.lang.String gh) {
        this.gh = gh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdatePring)) return false;
        UpdatePring other = (UpdatePring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pringbgId==null && other.getPringbgId()==null) || 
             (this.pringbgId!=null &&
              this.pringbgId.equals(other.getPringbgId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.bgsj==null && other.getBgsj()==null) || 
             (this.bgsj!=null &&
              this.bgsj.equals(other.getBgsj()))) &&
            ((this.gh==null && other.getGh()==null) || 
             (this.gh!=null &&
              this.gh.equals(other.getGh())));
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
        if (getPringbgId() != null) {
            _hashCode += getPringbgId().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getBgsj() != null) {
            _hashCode += getBgsj().hashCode();
        }
        if (getGh() != null) {
            _hashCode += getGh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdatePring.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdatePring"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pringbgId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "pringbgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bgsj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "bgsj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gh"));
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
