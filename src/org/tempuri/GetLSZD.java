/**
 * GetLSZD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetLSZD  implements java.io.Serializable {
    private java.lang.String BRID;

    private java.lang.String CLINIC_ID;

    private java.lang.String DOCTOR_CODE;

    public GetLSZD() {
    }

    public GetLSZD(
           java.lang.String BRID,
           java.lang.String CLINIC_ID,
           java.lang.String DOCTOR_CODE) {
           this.BRID = BRID;
           this.CLINIC_ID = CLINIC_ID;
           this.DOCTOR_CODE = DOCTOR_CODE;
    }


    /**
     * Gets the BRID value for this GetLSZD.
     * 
     * @return BRID
     */
    public java.lang.String getBRID() {
        return BRID;
    }


    /**
     * Sets the BRID value for this GetLSZD.
     * 
     * @param BRID
     */
    public void setBRID(java.lang.String BRID) {
        this.BRID = BRID;
    }


    /**
     * Gets the CLINIC_ID value for this GetLSZD.
     * 
     * @return CLINIC_ID
     */
    public java.lang.String getCLINIC_ID() {
        return CLINIC_ID;
    }


    /**
     * Sets the CLINIC_ID value for this GetLSZD.
     * 
     * @param CLINIC_ID
     */
    public void setCLINIC_ID(java.lang.String CLINIC_ID) {
        this.CLINIC_ID = CLINIC_ID;
    }


    /**
     * Gets the DOCTOR_CODE value for this GetLSZD.
     * 
     * @return DOCTOR_CODE
     */
    public java.lang.String getDOCTOR_CODE() {
        return DOCTOR_CODE;
    }


    /**
     * Sets the DOCTOR_CODE value for this GetLSZD.
     * 
     * @param DOCTOR_CODE
     */
    public void setDOCTOR_CODE(java.lang.String DOCTOR_CODE) {
        this.DOCTOR_CODE = DOCTOR_CODE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLSZD)) return false;
        GetLSZD other = (GetLSZD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BRID==null && other.getBRID()==null) || 
             (this.BRID!=null &&
              this.BRID.equals(other.getBRID()))) &&
            ((this.CLINIC_ID==null && other.getCLINIC_ID()==null) || 
             (this.CLINIC_ID!=null &&
              this.CLINIC_ID.equals(other.getCLINIC_ID()))) &&
            ((this.DOCTOR_CODE==null && other.getDOCTOR_CODE()==null) || 
             (this.DOCTOR_CODE!=null &&
              this.DOCTOR_CODE.equals(other.getDOCTOR_CODE())));
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
        if (getBRID() != null) {
            _hashCode += getBRID().hashCode();
        }
        if (getCLINIC_ID() != null) {
            _hashCode += getCLINIC_ID().hashCode();
        }
        if (getDOCTOR_CODE() != null) {
            _hashCode += getDOCTOR_CODE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLSZD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetLSZD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BRID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BRID"));
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
        elemField.setFieldName("DOCTOR_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DOCTOR_CODE"));
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
