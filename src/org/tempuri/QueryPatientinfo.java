/**
 * QueryPatientinfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class QueryPatientinfo  implements java.io.Serializable {
    private org.tempuri.PatientinfoCall patientinfo;

    public QueryPatientinfo() {
    }

    public QueryPatientinfo(
           org.tempuri.PatientinfoCall patientinfo) {
           this.patientinfo = patientinfo;
    }


    /**
     * Gets the patientinfo value for this QueryPatientinfo.
     * 
     * @return patientinfo
     */
    public org.tempuri.PatientinfoCall getPatientinfo() {
        return patientinfo;
    }


    /**
     * Sets the patientinfo value for this QueryPatientinfo.
     * 
     * @param patientinfo
     */
    public void setPatientinfo(org.tempuri.PatientinfoCall patientinfo) {
        this.patientinfo = patientinfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPatientinfo)) return false;
        QueryPatientinfo other = (QueryPatientinfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.patientinfo==null && other.getPatientinfo()==null) || 
             (this.patientinfo!=null &&
              this.patientinfo.equals(other.getPatientinfo())));
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
        if (getPatientinfo() != null) {
            _hashCode += getPatientinfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryPatientinfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">QueryPatientinfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patientinfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "patientinfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "PatientinfoCall"));
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
