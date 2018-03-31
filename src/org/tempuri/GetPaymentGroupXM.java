/**
 * GetPaymentGroupXM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPaymentGroupXM  implements java.io.Serializable {
    private java.lang.String PATIENT_ID;

    private java.lang.String CLINIC_ID;

    private java.lang.String as_kfrq;

    public GetPaymentGroupXM() {
    }

    public GetPaymentGroupXM(
           java.lang.String PATIENT_ID,
           java.lang.String CLINIC_ID,
           java.lang.String as_kfrq) {
           this.PATIENT_ID = PATIENT_ID;
           this.CLINIC_ID = CLINIC_ID;
           this.as_kfrq = as_kfrq;
    }


    /**
     * Gets the PATIENT_ID value for this GetPaymentGroupXM.
     * 
     * @return PATIENT_ID
     */
    public java.lang.String getPATIENT_ID() {
        return PATIENT_ID;
    }


    /**
     * Sets the PATIENT_ID value for this GetPaymentGroupXM.
     * 
     * @param PATIENT_ID
     */
    public void setPATIENT_ID(java.lang.String PATIENT_ID) {
        this.PATIENT_ID = PATIENT_ID;
    }


    /**
     * Gets the CLINIC_ID value for this GetPaymentGroupXM.
     * 
     * @return CLINIC_ID
     */
    public java.lang.String getCLINIC_ID() {
        return CLINIC_ID;
    }


    /**
     * Sets the CLINIC_ID value for this GetPaymentGroupXM.
     * 
     * @param CLINIC_ID
     */
    public void setCLINIC_ID(java.lang.String CLINIC_ID) {
        this.CLINIC_ID = CLINIC_ID;
    }


    /**
     * Gets the as_kfrq value for this GetPaymentGroupXM.
     * 
     * @return as_kfrq
     */
    public java.lang.String getAs_kfrq() {
        return as_kfrq;
    }


    /**
     * Sets the as_kfrq value for this GetPaymentGroupXM.
     * 
     * @param as_kfrq
     */
    public void setAs_kfrq(java.lang.String as_kfrq) {
        this.as_kfrq = as_kfrq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPaymentGroupXM)) return false;
        GetPaymentGroupXM other = (GetPaymentGroupXM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PATIENT_ID==null && other.getPATIENT_ID()==null) || 
             (this.PATIENT_ID!=null &&
              this.PATIENT_ID.equals(other.getPATIENT_ID()))) &&
            ((this.CLINIC_ID==null && other.getCLINIC_ID()==null) || 
             (this.CLINIC_ID!=null &&
              this.CLINIC_ID.equals(other.getCLINIC_ID()))) &&
            ((this.as_kfrq==null && other.getAs_kfrq()==null) || 
             (this.as_kfrq!=null &&
              this.as_kfrq.equals(other.getAs_kfrq())));
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
        if (getPATIENT_ID() != null) {
            _hashCode += getPATIENT_ID().hashCode();
        }
        if (getCLINIC_ID() != null) {
            _hashCode += getCLINIC_ID().hashCode();
        }
        if (getAs_kfrq() != null) {
            _hashCode += getAs_kfrq().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPaymentGroupXM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPaymentGroupXM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PATIENT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PATIENT_ID"));
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
        elemField.setFieldName("as_kfrq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_kfrq"));
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
