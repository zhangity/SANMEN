/**
 * MedicalBank.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class MedicalBank  implements java.io.Serializable {
    private org.tempuri.MedicalBankXe xe;

    public MedicalBank() {
    }

    public MedicalBank(
           org.tempuri.MedicalBankXe xe) {
           this.xe = xe;
    }


    /**
     * Gets the xe value for this MedicalBank.
     * 
     * @return xe
     */
    public org.tempuri.MedicalBankXe getXe() {
        return xe;
    }


    /**
     * Sets the xe value for this MedicalBank.
     * 
     * @param xe
     */
    public void setXe(org.tempuri.MedicalBankXe xe) {
        this.xe = xe;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedicalBank)) return false;
        MedicalBank other = (MedicalBank) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.xe==null && other.getXe()==null) || 
             (this.xe!=null &&
              this.xe.equals(other.getXe())));
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
        if (getXe() != null) {
            _hashCode += getXe().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MedicalBank.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">MedicalBank"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "xe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>MedicalBank>xe"));
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
