/**
 * InsertCLINIC_SCHEDULENew.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertCLINIC_SCHEDULENew  implements java.io.Serializable {
    private org.tempuri.CLINIC_SCHEDULE model;

    private java.lang.String strAmPm;

    private java.lang.String strAddOrEditBz;

    public InsertCLINIC_SCHEDULENew() {
    }

    public InsertCLINIC_SCHEDULENew(
           org.tempuri.CLINIC_SCHEDULE model,
           java.lang.String strAmPm,
           java.lang.String strAddOrEditBz) {
           this.model = model;
           this.strAmPm = strAmPm;
           this.strAddOrEditBz = strAddOrEditBz;
    }


    /**
     * Gets the model value for this InsertCLINIC_SCHEDULENew.
     * 
     * @return model
     */
    public org.tempuri.CLINIC_SCHEDULE getModel() {
        return model;
    }


    /**
     * Sets the model value for this InsertCLINIC_SCHEDULENew.
     * 
     * @param model
     */
    public void setModel(org.tempuri.CLINIC_SCHEDULE model) {
        this.model = model;
    }


    /**
     * Gets the strAmPm value for this InsertCLINIC_SCHEDULENew.
     * 
     * @return strAmPm
     */
    public java.lang.String getStrAmPm() {
        return strAmPm;
    }


    /**
     * Sets the strAmPm value for this InsertCLINIC_SCHEDULENew.
     * 
     * @param strAmPm
     */
    public void setStrAmPm(java.lang.String strAmPm) {
        this.strAmPm = strAmPm;
    }


    /**
     * Gets the strAddOrEditBz value for this InsertCLINIC_SCHEDULENew.
     * 
     * @return strAddOrEditBz
     */
    public java.lang.String getStrAddOrEditBz() {
        return strAddOrEditBz;
    }


    /**
     * Sets the strAddOrEditBz value for this InsertCLINIC_SCHEDULENew.
     * 
     * @param strAddOrEditBz
     */
    public void setStrAddOrEditBz(java.lang.String strAddOrEditBz) {
        this.strAddOrEditBz = strAddOrEditBz;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertCLINIC_SCHEDULENew)) return false;
        InsertCLINIC_SCHEDULENew other = (InsertCLINIC_SCHEDULENew) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.strAmPm==null && other.getStrAmPm()==null) || 
             (this.strAmPm!=null &&
              this.strAmPm.equals(other.getStrAmPm()))) &&
            ((this.strAddOrEditBz==null && other.getStrAddOrEditBz()==null) || 
             (this.strAddOrEditBz!=null &&
              this.strAddOrEditBz.equals(other.getStrAddOrEditBz())));
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
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getStrAmPm() != null) {
            _hashCode += getStrAmPm().hashCode();
        }
        if (getStrAddOrEditBz() != null) {
            _hashCode += getStrAddOrEditBz().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertCLINIC_SCHEDULENew.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertCLINIC_SCHEDULENew"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "CLINIC_SCHEDULE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strAmPm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strAmPm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strAddOrEditBz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strAddOrEditBz"));
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
