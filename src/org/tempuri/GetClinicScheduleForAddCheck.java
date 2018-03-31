/**
 * GetClinicScheduleForAddCheck.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetClinicScheduleForAddCheck  implements java.io.Serializable {
    private java.lang.String strDate;

    private java.lang.String strDepts;

    private java.lang.String strDocts;

    private java.lang.String strAmpms;

    public GetClinicScheduleForAddCheck() {
    }

    public GetClinicScheduleForAddCheck(
           java.lang.String strDate,
           java.lang.String strDepts,
           java.lang.String strDocts,
           java.lang.String strAmpms) {
           this.strDate = strDate;
           this.strDepts = strDepts;
           this.strDocts = strDocts;
           this.strAmpms = strAmpms;
    }


    /**
     * Gets the strDate value for this GetClinicScheduleForAddCheck.
     * 
     * @return strDate
     */
    public java.lang.String getStrDate() {
        return strDate;
    }


    /**
     * Sets the strDate value for this GetClinicScheduleForAddCheck.
     * 
     * @param strDate
     */
    public void setStrDate(java.lang.String strDate) {
        this.strDate = strDate;
    }


    /**
     * Gets the strDepts value for this GetClinicScheduleForAddCheck.
     * 
     * @return strDepts
     */
    public java.lang.String getStrDepts() {
        return strDepts;
    }


    /**
     * Sets the strDepts value for this GetClinicScheduleForAddCheck.
     * 
     * @param strDepts
     */
    public void setStrDepts(java.lang.String strDepts) {
        this.strDepts = strDepts;
    }


    /**
     * Gets the strDocts value for this GetClinicScheduleForAddCheck.
     * 
     * @return strDocts
     */
    public java.lang.String getStrDocts() {
        return strDocts;
    }


    /**
     * Sets the strDocts value for this GetClinicScheduleForAddCheck.
     * 
     * @param strDocts
     */
    public void setStrDocts(java.lang.String strDocts) {
        this.strDocts = strDocts;
    }


    /**
     * Gets the strAmpms value for this GetClinicScheduleForAddCheck.
     * 
     * @return strAmpms
     */
    public java.lang.String getStrAmpms() {
        return strAmpms;
    }


    /**
     * Sets the strAmpms value for this GetClinicScheduleForAddCheck.
     * 
     * @param strAmpms
     */
    public void setStrAmpms(java.lang.String strAmpms) {
        this.strAmpms = strAmpms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetClinicScheduleForAddCheck)) return false;
        GetClinicScheduleForAddCheck other = (GetClinicScheduleForAddCheck) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strDate==null && other.getStrDate()==null) || 
             (this.strDate!=null &&
              this.strDate.equals(other.getStrDate()))) &&
            ((this.strDepts==null && other.getStrDepts()==null) || 
             (this.strDepts!=null &&
              this.strDepts.equals(other.getStrDepts()))) &&
            ((this.strDocts==null && other.getStrDocts()==null) || 
             (this.strDocts!=null &&
              this.strDocts.equals(other.getStrDocts()))) &&
            ((this.strAmpms==null && other.getStrAmpms()==null) || 
             (this.strAmpms!=null &&
              this.strAmpms.equals(other.getStrAmpms())));
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
        if (getStrDate() != null) {
            _hashCode += getStrDate().hashCode();
        }
        if (getStrDepts() != null) {
            _hashCode += getStrDepts().hashCode();
        }
        if (getStrDocts() != null) {
            _hashCode += getStrDocts().hashCode();
        }
        if (getStrAmpms() != null) {
            _hashCode += getStrAmpms().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetClinicScheduleForAddCheck.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetClinicScheduleForAddCheck"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strDepts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strDepts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strDocts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strDocts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strAmpms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strAmpms"));
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
