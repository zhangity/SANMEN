/**
 * DelExamPb.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DelExamPb  implements java.io.Serializable {
    private java.lang.String SERIAL_ID;

    private java.lang.String EXAM_DATE;

    public DelExamPb() {
    }

    public DelExamPb(
           java.lang.String SERIAL_ID,
           java.lang.String EXAM_DATE) {
           this.SERIAL_ID = SERIAL_ID;
           this.EXAM_DATE = EXAM_DATE;
    }


    /**
     * Gets the SERIAL_ID value for this DelExamPb.
     * 
     * @return SERIAL_ID
     */
    public java.lang.String getSERIAL_ID() {
        return SERIAL_ID;
    }


    /**
     * Sets the SERIAL_ID value for this DelExamPb.
     * 
     * @param SERIAL_ID
     */
    public void setSERIAL_ID(java.lang.String SERIAL_ID) {
        this.SERIAL_ID = SERIAL_ID;
    }


    /**
     * Gets the EXAM_DATE value for this DelExamPb.
     * 
     * @return EXAM_DATE
     */
    public java.lang.String getEXAM_DATE() {
        return EXAM_DATE;
    }


    /**
     * Sets the EXAM_DATE value for this DelExamPb.
     * 
     * @param EXAM_DATE
     */
    public void setEXAM_DATE(java.lang.String EXAM_DATE) {
        this.EXAM_DATE = EXAM_DATE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelExamPb)) return false;
        DelExamPb other = (DelExamPb) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SERIAL_ID==null && other.getSERIAL_ID()==null) || 
             (this.SERIAL_ID!=null &&
              this.SERIAL_ID.equals(other.getSERIAL_ID()))) &&
            ((this.EXAM_DATE==null && other.getEXAM_DATE()==null) || 
             (this.EXAM_DATE!=null &&
              this.EXAM_DATE.equals(other.getEXAM_DATE())));
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
        if (getSERIAL_ID() != null) {
            _hashCode += getSERIAL_ID().hashCode();
        }
        if (getEXAM_DATE() != null) {
            _hashCode += getEXAM_DATE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DelExamPb.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DelExamPb"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SERIAL_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SERIAL_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXAM_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EXAM_DATE"));
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
