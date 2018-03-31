/**
 * GetReservationRegisterClinic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetReservationRegisterClinic  implements java.io.Serializable {
    private java.lang.String TELEPHONE;

    public GetReservationRegisterClinic() {
    }

    public GetReservationRegisterClinic(
           java.lang.String TELEPHONE) {
           this.TELEPHONE = TELEPHONE;
    }


    /**
     * Gets the TELEPHONE value for this GetReservationRegisterClinic.
     * 
     * @return TELEPHONE
     */
    public java.lang.String getTELEPHONE() {
        return TELEPHONE;
    }


    /**
     * Sets the TELEPHONE value for this GetReservationRegisterClinic.
     * 
     * @param TELEPHONE
     */
    public void setTELEPHONE(java.lang.String TELEPHONE) {
        this.TELEPHONE = TELEPHONE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetReservationRegisterClinic)) return false;
        GetReservationRegisterClinic other = (GetReservationRegisterClinic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        if (getTELEPHONE() != null) {
            _hashCode += getTELEPHONE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetReservationRegisterClinic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetReservationRegisterClinic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
