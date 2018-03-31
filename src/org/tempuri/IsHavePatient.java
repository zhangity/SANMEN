/**
 * IsHavePatient.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class IsHavePatient  implements java.io.Serializable {
    private java.lang.String RELATION_ID;

    private java.lang.String PATIENT_NAME;

    private java.lang.String SEX;

    public IsHavePatient() {
    }

    public IsHavePatient(
           java.lang.String RELATION_ID,
           java.lang.String PATIENT_NAME,
           java.lang.String SEX) {
           this.RELATION_ID = RELATION_ID;
           this.PATIENT_NAME = PATIENT_NAME;
           this.SEX = SEX;
    }


    /**
     * Gets the RELATION_ID value for this IsHavePatient.
     * 
     * @return RELATION_ID
     */
    public java.lang.String getRELATION_ID() {
        return RELATION_ID;
    }


    /**
     * Sets the RELATION_ID value for this IsHavePatient.
     * 
     * @param RELATION_ID
     */
    public void setRELATION_ID(java.lang.String RELATION_ID) {
        this.RELATION_ID = RELATION_ID;
    }


    /**
     * Gets the PATIENT_NAME value for this IsHavePatient.
     * 
     * @return PATIENT_NAME
     */
    public java.lang.String getPATIENT_NAME() {
        return PATIENT_NAME;
    }


    /**
     * Sets the PATIENT_NAME value for this IsHavePatient.
     * 
     * @param PATIENT_NAME
     */
    public void setPATIENT_NAME(java.lang.String PATIENT_NAME) {
        this.PATIENT_NAME = PATIENT_NAME;
    }


    /**
     * Gets the SEX value for this IsHavePatient.
     * 
     * @return SEX
     */
    public java.lang.String getSEX() {
        return SEX;
    }


    /**
     * Sets the SEX value for this IsHavePatient.
     * 
     * @param SEX
     */
    public void setSEX(java.lang.String SEX) {
        this.SEX = SEX;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsHavePatient)) return false;
        IsHavePatient other = (IsHavePatient) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.RELATION_ID==null && other.getRELATION_ID()==null) || 
             (this.RELATION_ID!=null &&
              this.RELATION_ID.equals(other.getRELATION_ID()))) &&
            ((this.PATIENT_NAME==null && other.getPATIENT_NAME()==null) || 
             (this.PATIENT_NAME!=null &&
              this.PATIENT_NAME.equals(other.getPATIENT_NAME()))) &&
            ((this.SEX==null && other.getSEX()==null) || 
             (this.SEX!=null &&
              this.SEX.equals(other.getSEX())));
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
        if (getRELATION_ID() != null) {
            _hashCode += getRELATION_ID().hashCode();
        }
        if (getPATIENT_NAME() != null) {
            _hashCode += getPATIENT_NAME().hashCode();
        }
        if (getSEX() != null) {
            _hashCode += getSEX().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsHavePatient.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">IsHavePatient"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RELATION_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RELATION_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PATIENT_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PATIENT_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SEX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SEX"));
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
