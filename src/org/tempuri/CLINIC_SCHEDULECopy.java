/**
 * CLINIC_SCHEDULECopy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CLINIC_SCHEDULECopy  implements java.io.Serializable {
    private java.lang.String strFirstDays;

    private java.lang.String strFirstDayd;

    private java.lang.String czgh;

    private java.lang.String strKsdms;

    private java.lang.String strGhlb;

    public CLINIC_SCHEDULECopy() {
    }

    public CLINIC_SCHEDULECopy(
           java.lang.String strFirstDays,
           java.lang.String strFirstDayd,
           java.lang.String czgh,
           java.lang.String strKsdms,
           java.lang.String strGhlb) {
           this.strFirstDays = strFirstDays;
           this.strFirstDayd = strFirstDayd;
           this.czgh = czgh;
           this.strKsdms = strKsdms;
           this.strGhlb = strGhlb;
    }


    /**
     * Gets the strFirstDays value for this CLINIC_SCHEDULECopy.
     * 
     * @return strFirstDays
     */
    public java.lang.String getStrFirstDays() {
        return strFirstDays;
    }


    /**
     * Sets the strFirstDays value for this CLINIC_SCHEDULECopy.
     * 
     * @param strFirstDays
     */
    public void setStrFirstDays(java.lang.String strFirstDays) {
        this.strFirstDays = strFirstDays;
    }


    /**
     * Gets the strFirstDayd value for this CLINIC_SCHEDULECopy.
     * 
     * @return strFirstDayd
     */
    public java.lang.String getStrFirstDayd() {
        return strFirstDayd;
    }


    /**
     * Sets the strFirstDayd value for this CLINIC_SCHEDULECopy.
     * 
     * @param strFirstDayd
     */
    public void setStrFirstDayd(java.lang.String strFirstDayd) {
        this.strFirstDayd = strFirstDayd;
    }


    /**
     * Gets the czgh value for this CLINIC_SCHEDULECopy.
     * 
     * @return czgh
     */
    public java.lang.String getCzgh() {
        return czgh;
    }


    /**
     * Sets the czgh value for this CLINIC_SCHEDULECopy.
     * 
     * @param czgh
     */
    public void setCzgh(java.lang.String czgh) {
        this.czgh = czgh;
    }


    /**
     * Gets the strKsdms value for this CLINIC_SCHEDULECopy.
     * 
     * @return strKsdms
     */
    public java.lang.String getStrKsdms() {
        return strKsdms;
    }


    /**
     * Sets the strKsdms value for this CLINIC_SCHEDULECopy.
     * 
     * @param strKsdms
     */
    public void setStrKsdms(java.lang.String strKsdms) {
        this.strKsdms = strKsdms;
    }


    /**
     * Gets the strGhlb value for this CLINIC_SCHEDULECopy.
     * 
     * @return strGhlb
     */
    public java.lang.String getStrGhlb() {
        return strGhlb;
    }


    /**
     * Sets the strGhlb value for this CLINIC_SCHEDULECopy.
     * 
     * @param strGhlb
     */
    public void setStrGhlb(java.lang.String strGhlb) {
        this.strGhlb = strGhlb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CLINIC_SCHEDULECopy)) return false;
        CLINIC_SCHEDULECopy other = (CLINIC_SCHEDULECopy) obj;
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
            ((this.strFirstDayd==null && other.getStrFirstDayd()==null) || 
             (this.strFirstDayd!=null &&
              this.strFirstDayd.equals(other.getStrFirstDayd()))) &&
            ((this.czgh==null && other.getCzgh()==null) || 
             (this.czgh!=null &&
              this.czgh.equals(other.getCzgh()))) &&
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
        if (getStrFirstDayd() != null) {
            _hashCode += getStrFirstDayd().hashCode();
        }
        if (getCzgh() != null) {
            _hashCode += getCzgh().hashCode();
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
        new org.apache.axis.description.TypeDesc(CLINIC_SCHEDULECopy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CLINIC_SCHEDULECopy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strFirstDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StrFirstDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strFirstDayd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StrFirstDayd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("czgh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Czgh"));
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
