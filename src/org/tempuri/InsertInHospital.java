/**
 * InsertInHospital.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertInHospital  implements java.io.Serializable {
    private org.tempuri.CLINIC_INHOSPITAL inHospital;

    public InsertInHospital() {
    }

    public InsertInHospital(
           org.tempuri.CLINIC_INHOSPITAL inHospital) {
           this.inHospital = inHospital;
    }


    /**
     * Gets the inHospital value for this InsertInHospital.
     * 
     * @return inHospital
     */
    public org.tempuri.CLINIC_INHOSPITAL getInHospital() {
        return inHospital;
    }


    /**
     * Sets the inHospital value for this InsertInHospital.
     * 
     * @param inHospital
     */
    public void setInHospital(org.tempuri.CLINIC_INHOSPITAL inHospital) {
        this.inHospital = inHospital;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertInHospital)) return false;
        InsertInHospital other = (InsertInHospital) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inHospital==null && other.getInHospital()==null) || 
             (this.inHospital!=null &&
              this.inHospital.equals(other.getInHospital())));
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
        if (getInHospital() != null) {
            _hashCode += getInHospital().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertInHospital.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertInHospital"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inHospital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "inHospital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "CLINIC_INHOSPITAL"));
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
