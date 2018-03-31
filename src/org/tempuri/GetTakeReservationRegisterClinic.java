/**
 * GetTakeReservationRegisterClinic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetTakeReservationRegisterClinic  implements java.io.Serializable {
    private java.lang.String PATIENT_ID;

    private java.lang.String TELEPHONE;

    public GetTakeReservationRegisterClinic() {
    }

    public GetTakeReservationRegisterClinic(
           java.lang.String PATIENT_ID,
           java.lang.String TELEPHONE) {
           this.PATIENT_ID = PATIENT_ID;
           this.TELEPHONE = TELEPHONE;
    }


    /**
     * Gets the PATIENT_ID value for this GetTakeReservationRegisterClinic.
     * 
     * @return PATIENT_ID
     */
    public java.lang.String getPATIENT_ID() {
        return PATIENT_ID;
    }


    /**
     * Sets the PATIENT_ID value for this GetTakeReservationRegisterClinic.
     * 
     * @param PATIENT_ID
     */
    public void setPATIENT_ID(java.lang.String PATIENT_ID) {
        this.PATIENT_ID = PATIENT_ID;
    }


    /**
     * Gets the TELEPHONE value for this GetTakeReservationRegisterClinic.
     * 
     * @return TELEPHONE
     */
    public java.lang.String getTELEPHONE() {
        return TELEPHONE;
    }


    /**
     * Sets the TELEPHONE value for this GetTakeReservationRegisterClinic.
     * 
     * @param TELEPHONE
     */
    public void setTELEPHONE(java.lang.String TELEPHONE) {
        this.TELEPHONE = TELEPHONE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTakeReservationRegisterClinic)) return false;
        GetTakeReservationRegisterClinic other = (GetTakeReservationRegisterClinic) obj;
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
            ((this.TELEPHONE==null && other.getTELEPHONE()==null) || 
             (this.TELEPHONE!=null &&
              this.TELEPHONE.equals(other.getTELEPHONE())));
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
        if (getTELEPHONE() != null) {
            _hashCode += getTELEPHONE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTakeReservationRegisterClinic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetTakeReservationRegisterClinic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PATIENT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PATIENT_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TELEPHONE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TELEPHONE"));
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
