/**
 * GetRegistClinicXXforHMD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetRegistClinicXXforHMD  implements java.io.Serializable {
    private java.lang.String RESERVATIONLOCKNUM;

    public GetRegistClinicXXforHMD() {
    }

    public GetRegistClinicXXforHMD(
           java.lang.String RESERVATIONLOCKNUM) {
           this.RESERVATIONLOCKNUM = RESERVATIONLOCKNUM;
    }


    /**
     * Gets the RESERVATIONLOCKNUM value for this GetRegistClinicXXforHMD.
     * 
     * @return RESERVATIONLOCKNUM
     */
    public java.lang.String getRESERVATIONLOCKNUM() {
        return RESERVATIONLOCKNUM;
    }


    /**
     * Sets the RESERVATIONLOCKNUM value for this GetRegistClinicXXforHMD.
     * 
     * @param RESERVATIONLOCKNUM
     */
    public void setRESERVATIONLOCKNUM(java.lang.String RESERVATIONLOCKNUM) {
        this.RESERVATIONLOCKNUM = RESERVATIONLOCKNUM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRegistClinicXXforHMD)) return false;
        GetRegistClinicXXforHMD other = (GetRegistClinicXXforHMD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.RESERVATIONLOCKNUM==null && other.getRESERVATIONLOCKNUM()==null) || 
             (this.RESERVATIONLOCKNUM!=null &&
              this.RESERVATIONLOCKNUM.equals(other.getRESERVATIONLOCKNUM())));
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
        if (getRESERVATIONLOCKNUM() != null) {
            _hashCode += getRESERVATIONLOCKNUM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRegistClinicXXforHMD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetRegistClinicXXforHMD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESERVATIONLOCKNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RESERVATIONLOCKNUM"));
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
