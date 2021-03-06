/**
 * DeleteBk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DeleteBk  implements java.io.Serializable {
    private java.lang.String CLINIC_ID;

    private java.lang.String scz;

    private java.lang.String mr_id;

    public DeleteBk() {
    }

    public DeleteBk(
           java.lang.String CLINIC_ID,
           java.lang.String scz,
           java.lang.String mr_id) {
           this.CLINIC_ID = CLINIC_ID;
           this.scz = scz;
           this.mr_id = mr_id;
    }


    /**
     * Gets the CLINIC_ID value for this DeleteBk.
     * 
     * @return CLINIC_ID
     */
    public java.lang.String getCLINIC_ID() {
        return CLINIC_ID;
    }


    /**
     * Sets the CLINIC_ID value for this DeleteBk.
     * 
     * @param CLINIC_ID
     */
    public void setCLINIC_ID(java.lang.String CLINIC_ID) {
        this.CLINIC_ID = CLINIC_ID;
    }


    /**
     * Gets the scz value for this DeleteBk.
     * 
     * @return scz
     */
    public java.lang.String getScz() {
        return scz;
    }


    /**
     * Sets the scz value for this DeleteBk.
     * 
     * @param scz
     */
    public void setScz(java.lang.String scz) {
        this.scz = scz;
    }


    /**
     * Gets the mr_id value for this DeleteBk.
     * 
     * @return mr_id
     */
    public java.lang.String getMr_id() {
        return mr_id;
    }


    /**
     * Sets the mr_id value for this DeleteBk.
     * 
     * @param mr_id
     */
    public void setMr_id(java.lang.String mr_id) {
        this.mr_id = mr_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteBk)) return false;
        DeleteBk other = (DeleteBk) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CLINIC_ID==null && other.getCLINIC_ID()==null) || 
             (this.CLINIC_ID!=null &&
              this.CLINIC_ID.equals(other.getCLINIC_ID()))) &&
            ((this.scz==null && other.getScz()==null) || 
             (this.scz!=null &&
              this.scz.equals(other.getScz()))) &&
            ((this.mr_id==null && other.getMr_id()==null) || 
             (this.mr_id!=null &&
              this.mr_id.equals(other.getMr_id())));
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
        if (getCLINIC_ID() != null) {
            _hashCode += getCLINIC_ID().hashCode();
        }
        if (getScz() != null) {
            _hashCode += getScz().hashCode();
        }
        if (getMr_id() != null) {
            _hashCode += getMr_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteBk.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteBk"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLINIC_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CLINIC_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "scz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mr_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "mr_id"));
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
