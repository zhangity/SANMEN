/**
 * UpEXAMSCHEDULE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpEXAMSCHEDULE  implements java.io.Serializable {
    private java.lang.String SERIAL_ID;

    private java.lang.String CLINIC_ID;

    private java.lang.String SQDNum;

    public UpEXAMSCHEDULE() {
    }

    public UpEXAMSCHEDULE(
           java.lang.String SERIAL_ID,
           java.lang.String CLINIC_ID,
           java.lang.String SQDNum) {
           this.SERIAL_ID = SERIAL_ID;
           this.CLINIC_ID = CLINIC_ID;
           this.SQDNum = SQDNum;
    }


    /**
     * Gets the SERIAL_ID value for this UpEXAMSCHEDULE.
     * 
     * @return SERIAL_ID
     */
    public java.lang.String getSERIAL_ID() {
        return SERIAL_ID;
    }


    /**
     * Sets the SERIAL_ID value for this UpEXAMSCHEDULE.
     * 
     * @param SERIAL_ID
     */
    public void setSERIAL_ID(java.lang.String SERIAL_ID) {
        this.SERIAL_ID = SERIAL_ID;
    }


    /**
     * Gets the CLINIC_ID value for this UpEXAMSCHEDULE.
     * 
     * @return CLINIC_ID
     */
    public java.lang.String getCLINIC_ID() {
        return CLINIC_ID;
    }


    /**
     * Sets the CLINIC_ID value for this UpEXAMSCHEDULE.
     * 
     * @param CLINIC_ID
     */
    public void setCLINIC_ID(java.lang.String CLINIC_ID) {
        this.CLINIC_ID = CLINIC_ID;
    }


    /**
     * Gets the SQDNum value for this UpEXAMSCHEDULE.
     * 
     * @return SQDNum
     */
    public java.lang.String getSQDNum() {
        return SQDNum;
    }


    /**
     * Sets the SQDNum value for this UpEXAMSCHEDULE.
     * 
     * @param SQDNum
     */
    public void setSQDNum(java.lang.String SQDNum) {
        this.SQDNum = SQDNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpEXAMSCHEDULE)) return false;
        UpEXAMSCHEDULE other = (UpEXAMSCHEDULE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SERIAL_ID==null && other.getSERIAL_ID()==null) || 
             (this.SERIAL_ID!=null &&
              this.SERIAL_ID.equals(other.getSERIAL_ID()))) &&
            ((this.CLINIC_ID==null && other.getCLINIC_ID()==null) || 
             (this.CLINIC_ID!=null &&
              this.CLINIC_ID.equals(other.getCLINIC_ID()))) &&
            ((this.SQDNum==null && other.getSQDNum()==null) || 
             (this.SQDNum!=null &&
              this.SQDNum.equals(other.getSQDNum())));
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
        if (getSERIAL_ID() != null) {
            _hashCode += getSERIAL_ID().hashCode();
        }
        if (getCLINIC_ID() != null) {
            _hashCode += getCLINIC_ID().hashCode();
        }
        if (getSQDNum() != null) {
            _hashCode += getSQDNum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpEXAMSCHEDULE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpEXAMSCHEDULE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SERIAL_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SERIAL_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLINIC_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CLINIC_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SQDNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SQDNum"));
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
