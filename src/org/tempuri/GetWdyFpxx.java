/**
 * GetWdyFpxx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetWdyFpxx  implements java.io.Serializable {
    private java.lang.String patientid;

    private java.lang.String sfrq;

    public GetWdyFpxx() {
    }

    public GetWdyFpxx(
           java.lang.String patientid,
           java.lang.String sfrq) {
           this.patientid = patientid;
           this.sfrq = sfrq;
    }


    /**
     * Gets the patientid value for this GetWdyFpxx.
     * 
     * @return patientid
     */
    public java.lang.String getPatientid() {
        return patientid;
    }


    /**
     * Sets the patientid value for this GetWdyFpxx.
     * 
     * @param patientid
     */
    public void setPatientid(java.lang.String patientid) {
        this.patientid = patientid;
    }


    /**
     * Gets the sfrq value for this GetWdyFpxx.
     * 
     * @return sfrq
     */
    public java.lang.String getSfrq() {
        return sfrq;
    }


    /**
     * Sets the sfrq value for this GetWdyFpxx.
     * 
     * @param sfrq
     */
    public void setSfrq(java.lang.String sfrq) {
        this.sfrq = sfrq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWdyFpxx)) return false;
        GetWdyFpxx other = (GetWdyFpxx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.patientid==null && other.getPatientid()==null) || 
             (this.patientid!=null &&
              this.patientid.equals(other.getPatientid()))) &&
            ((this.sfrq==null && other.getSfrq()==null) || 
             (this.sfrq!=null &&
              this.sfrq.equals(other.getSfrq())));
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
        if (getPatientid() != null) {
            _hashCode += getPatientid().hashCode();
        }
        if (getSfrq() != null) {
            _hashCode += getSfrq().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWdyFpxx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetWdyFpxx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patientid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "patientid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sfrq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sfrq"));
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
