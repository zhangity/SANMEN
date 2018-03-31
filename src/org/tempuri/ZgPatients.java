/**
 * ZgPatients.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZgPatients  implements java.io.Serializable {
    private java.lang.String clinicid;

    private java.lang.String czgh;

    private java.lang.String ksdm;

    private boolean zg;

    public ZgPatients() {
    }

    public ZgPatients(
           java.lang.String clinicid,
           java.lang.String czgh,
           java.lang.String ksdm,
           boolean zg) {
           this.clinicid = clinicid;
           this.czgh = czgh;
           this.ksdm = ksdm;
           this.zg = zg;
    }


    /**
     * Gets the clinicid value for this ZgPatients.
     * 
     * @return clinicid
     */
    public java.lang.String getClinicid() {
        return clinicid;
    }


    /**
     * Sets the clinicid value for this ZgPatients.
     * 
     * @param clinicid
     */
    public void setClinicid(java.lang.String clinicid) {
        this.clinicid = clinicid;
    }


    /**
     * Gets the czgh value for this ZgPatients.
     * 
     * @return czgh
     */
    public java.lang.String getCzgh() {
        return czgh;
    }


    /**
     * Sets the czgh value for this ZgPatients.
     * 
     * @param czgh
     */
    public void setCzgh(java.lang.String czgh) {
        this.czgh = czgh;
    }


    /**
     * Gets the ksdm value for this ZgPatients.
     * 
     * @return ksdm
     */
    public java.lang.String getKsdm() {
        return ksdm;
    }


    /**
     * Sets the ksdm value for this ZgPatients.
     * 
     * @param ksdm
     */
    public void setKsdm(java.lang.String ksdm) {
        this.ksdm = ksdm;
    }


    /**
     * Gets the zg value for this ZgPatients.
     * 
     * @return zg
     */
    public boolean isZg() {
        return zg;
    }


    /**
     * Sets the zg value for this ZgPatients.
     * 
     * @param zg
     */
    public void setZg(boolean zg) {
        this.zg = zg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZgPatients)) return false;
        ZgPatients other = (ZgPatients) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clinicid==null && other.getClinicid()==null) || 
             (this.clinicid!=null &&
              this.clinicid.equals(other.getClinicid()))) &&
            ((this.czgh==null && other.getCzgh()==null) || 
             (this.czgh!=null &&
              this.czgh.equals(other.getCzgh()))) &&
            ((this.ksdm==null && other.getKsdm()==null) || 
             (this.ksdm!=null &&
              this.ksdm.equals(other.getKsdm()))) &&
            this.zg == other.isZg();
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
        if (getClinicid() != null) {
            _hashCode += getClinicid().hashCode();
        }
        if (getCzgh() != null) {
            _hashCode += getCzgh().hashCode();
        }
        if (getKsdm() != null) {
            _hashCode += getKsdm().hashCode();
        }
        _hashCode += (isZg() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZgPatients.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZgPatients"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clinicid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "clinicid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("czgh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "czgh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ksdm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ksdm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "zg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
