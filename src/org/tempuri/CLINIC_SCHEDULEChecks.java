/**
 * CLINIC_SCHEDULEChecks.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CLINIC_SCHEDULEChecks  implements java.io.Serializable {
    private java.lang.String strFirstDays;

    private java.lang.String strEndDays;

    private java.lang.String strKsdms;

    private java.lang.String strGhlb;

    public CLINIC_SCHEDULEChecks() {
    }

    public CLINIC_SCHEDULEChecks(
           java.lang.String strFirstDays,
           java.lang.String strEndDays,
           java.lang.String strKsdms,
           java.lang.String strGhlb) {
           this.strFirstDays = strFirstDays;
           this.strEndDays = strEndDays;
           this.strKsdms = strKsdms;
           this.strGhlb = strGhlb;
    }


    /**
     * Gets the strFirstDays value for this CLINIC_SCHEDULEChecks.
     * 
     * @return strFirstDays
     */
    public java.lang.String getStrFirstDays() {
        return strFirstDays;
    }


    /**
     * Sets the strFirstDays value for this CLINIC_SCHEDULEChecks.
     * 
     * @param strFirstDays
     */
    public void setStrFirstDays(java.lang.String strFirstDays) {
        this.strFirstDays = strFirstDays;
    }


    /**
     * Gets the strEndDays value for this CLINIC_SCHEDULEChecks.
     * 
     * @return strEndDays
     */
    public java.lang.String getStrEndDays() {
        return strEndDays;
    }


    /**
     * Sets the strEndDays value for this CLINIC_SCHEDULEChecks.
     * 
     * @param strEndDays
     */
    public void setStrEndDays(java.lang.String strEndDays) {
        this.strEndDays = strEndDays;
    }


    /**
     * Gets the strKsdms value for this CLINIC_SCHEDULEChecks.
     * 
     * @return strKsdms
     */
    public java.lang.String getStrKsdms() {
        return strKsdms;
    }


    /**
     * Sets the strKsdms value for this CLINIC_SCHEDULEChecks.
     * 
     * @param strKsdms
     */
    public void setStrKsdms(java.lang.String strKsdms) {
        this.strKsdms = strKsdms;
    }


    /**
     * Gets the strGhlb value for this CLINIC_SCHEDULEChecks.
     * 
     * @return strGhlb
     */
    public java.lang.String getStrGhlb() {
        return strGhlb;
    }


    /**
     * Sets the strGhlb value for this CLINIC_SCHEDULEChecks.
     * 
     * @param strGhlb
     */
    public void setStrGhlb(java.lang.String strGhlb) {
        this.strGhlb = strGhlb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CLINIC_SCHEDULEChecks)) return false;
        CLINIC_SCHEDULEChecks other = (CLINIC_SCHEDULEChecks) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strFirstDays==null && other.getStrFirstDays()==null) || 
             (this.strFirstDays!=null &&
              this.strFirstDays.equals(other.getStrFirstDays()))) &&
            ((this.strEndDays==null && other.getStrEndDays()==null) || 
             (this.strEndDays!=null &&
              this.strEndDays.equals(other.getStrEndDays()))) &&
            ((this.strKsdms==null && other.getStrKsdms()==null) || 
             (this.strKsdms!=null &&
              this.strKsdms.equals(other.getStrKsdms()))) &&
            ((this.strGhlb==null && other.getStrGhlb()==null) || 
             (this.strGhlb!=null &&
              this.strGhlb.equals(other.getStrGhlb())));
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
        if (getStrFirstDays() != null) {
            _hashCode += getStrFirstDays().hashCode();
        }
        if (getStrEndDays() != null) {
            _hashCode += getStrEndDays().hashCode();
        }
        if (getStrKsdms() != null) {
            _hashCode += getStrKsdms().hashCode();
        }
        if (getStrGhlb() != null) {
            _hashCode += getStrGhlb().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CLINIC_SCHEDULEChecks.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CLINIC_SCHEDULEChecks"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strFirstDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StrFirstDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strEndDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StrEndDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strKsdms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StrKsdms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strGhlb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StrGhlb"));
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
