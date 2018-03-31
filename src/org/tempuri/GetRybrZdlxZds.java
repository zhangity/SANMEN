/**
 * GetRybrZdlxZds.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetRybrZdlxZds  implements java.io.Serializable {
    private java.lang.String patient_id;

    private java.lang.String zdlxdm;

    public GetRybrZdlxZds() {
    }

    public GetRybrZdlxZds(
           java.lang.String patient_id,
           java.lang.String zdlxdm) {
           this.patient_id = patient_id;
           this.zdlxdm = zdlxdm;
    }


    /**
     * Gets the patient_id value for this GetRybrZdlxZds.
     * 
     * @return patient_id
     */
    public java.lang.String getPatient_id() {
        return patient_id;
    }


    /**
     * Sets the patient_id value for this GetRybrZdlxZds.
     * 
     * @param patient_id
     */
    public void setPatient_id(java.lang.String patient_id) {
        this.patient_id = patient_id;
    }


    /**
     * Gets the zdlxdm value for this GetRybrZdlxZds.
     * 
     * @return zdlxdm
     */
    public java.lang.String getZdlxdm() {
        return zdlxdm;
    }


    /**
     * Sets the zdlxdm value for this GetRybrZdlxZds.
     * 
     * @param zdlxdm
     */
    public void setZdlxdm(java.lang.String zdlxdm) {
        this.zdlxdm = zdlxdm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRybrZdlxZds)) return false;
        GetRybrZdlxZds other = (GetRybrZdlxZds) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.patient_id==null && other.getPatient_id()==null) || 
             (this.patient_id!=null &&
              this.patient_id.equals(other.getPatient_id()))) &&
            ((this.zdlxdm==null && other.getZdlxdm()==null) || 
             (this.zdlxdm!=null &&
              this.zdlxdm.equals(other.getZdlxdm())));
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
        if (getPatient_id() != null) {
            _hashCode += getPatient_id().hashCode();
        }
        if (getZdlxdm() != null) {
            _hashCode += getZdlxdm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRybrZdlxZds.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetRybrZdlxZds"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patient_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "patient_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zdlxdm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "zdlxdm"));
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
