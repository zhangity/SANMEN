/**
 * GetWdyFpxxbyRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetWdyFpxxbyRQ  implements java.io.Serializable {
    private java.lang.String patientid;

    private java.lang.String ksrq;

    private java.lang.String jsrq;

    public GetWdyFpxxbyRQ() {
    }

    public GetWdyFpxxbyRQ(
           java.lang.String patientid,
           java.lang.String ksrq,
           java.lang.String jsrq) {
           this.patientid = patientid;
           this.ksrq = ksrq;
           this.jsrq = jsrq;
    }


    /**
     * Gets the patientid value for this GetWdyFpxxbyRQ.
     * 
     * @return patientid
     */
    public java.lang.String getPatientid() {
        return patientid;
    }


    /**
     * Sets the patientid value for this GetWdyFpxxbyRQ.
     * 
     * @param patientid
     */
    public void setPatientid(java.lang.String patientid) {
        this.patientid = patientid;
    }


    /**
     * Gets the ksrq value for this GetWdyFpxxbyRQ.
     * 
     * @return ksrq
     */
    public java.lang.String getKsrq() {
        return ksrq;
    }


    /**
     * Sets the ksrq value for this GetWdyFpxxbyRQ.
     * 
     * @param ksrq
     */
    public void setKsrq(java.lang.String ksrq) {
        this.ksrq = ksrq;
    }


    /**
     * Gets the jsrq value for this GetWdyFpxxbyRQ.
     * 
     * @return jsrq
     */
    public java.lang.String getJsrq() {
        return jsrq;
    }


    /**
     * Sets the jsrq value for this GetWdyFpxxbyRQ.
     * 
     * @param jsrq
     */
    public void setJsrq(java.lang.String jsrq) {
        this.jsrq = jsrq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWdyFpxxbyRQ)) return false;
        GetWdyFpxxbyRQ other = (GetWdyFpxxbyRQ) obj;
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
            ((this.ksrq==null && other.getKsrq()==null) || 
             (this.ksrq!=null &&
              this.ksrq.equals(other.getKsrq()))) &&
            ((this.jsrq==null && other.getJsrq()==null) || 
             (this.jsrq!=null &&
              this.jsrq.equals(other.getJsrq())));
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
        if (getKsrq() != null) {
            _hashCode += getKsrq().hashCode();
        }
        if (getJsrq() != null) {
            _hashCode += getJsrq().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWdyFpxxbyRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetWdyFpxxbyRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patientid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "patientid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ksrq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ksrq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jsrq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jsrq"));
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
