/**
 * Gf_getJbbhsAsPatientId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getJbbhsAsPatientId  implements java.io.Serializable {
    private java.lang.String as_patientid;

    private java.lang.String as_jzsj;

    public Gf_getJbbhsAsPatientId() {
    }

    public Gf_getJbbhsAsPatientId(
           java.lang.String as_patientid,
           java.lang.String as_jzsj) {
           this.as_patientid = as_patientid;
           this.as_jzsj = as_jzsj;
    }


    /**
     * Gets the as_patientid value for this Gf_getJbbhsAsPatientId.
     * 
     * @return as_patientid
     */
    public java.lang.String getAs_patientid() {
        return as_patientid;
    }


    /**
     * Sets the as_patientid value for this Gf_getJbbhsAsPatientId.
     * 
     * @param as_patientid
     */
    public void setAs_patientid(java.lang.String as_patientid) {
        this.as_patientid = as_patientid;
    }


    /**
     * Gets the as_jzsj value for this Gf_getJbbhsAsPatientId.
     * 
     * @return as_jzsj
     */
    public java.lang.String getAs_jzsj() {
        return as_jzsj;
    }


    /**
     * Sets the as_jzsj value for this Gf_getJbbhsAsPatientId.
     * 
     * @param as_jzsj
     */
    public void setAs_jzsj(java.lang.String as_jzsj) {
        this.as_jzsj = as_jzsj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getJbbhsAsPatientId)) return false;
        Gf_getJbbhsAsPatientId other = (Gf_getJbbhsAsPatientId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.as_patientid==null && other.getAs_patientid()==null) || 
             (this.as_patientid!=null &&
              this.as_patientid.equals(other.getAs_patientid()))) &&
            ((this.as_jzsj==null && other.getAs_jzsj()==null) || 
             (this.as_jzsj!=null &&
              this.as_jzsj.equals(other.getAs_jzsj())));
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
        if (getAs_patientid() != null) {
            _hashCode += getAs_patientid().hashCode();
        }
        if (getAs_jzsj() != null) {
            _hashCode += getAs_jzsj().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getJbbhsAsPatientId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getJbbhsAsPatientId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_patientid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_patientid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_jzsj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_jzsj"));
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
