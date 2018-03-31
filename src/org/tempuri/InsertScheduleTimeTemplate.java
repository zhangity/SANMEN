/**
 * InsertScheduleTimeTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertScheduleTimeTemplate  implements java.io.Serializable {
    private java.lang.String ksdm;

    private java.lang.String ksmc;

    private java.lang.String doctor_code;

    private java.lang.String time_start;

    private java.lang.String time_end;

    private java.lang.String registernums;

    private java.lang.String create_code;

    public InsertScheduleTimeTemplate() {
    }

    public InsertScheduleTimeTemplate(
           java.lang.String ksdm,
           java.lang.String ksmc,
           java.lang.String doctor_code,
           java.lang.String time_start,
           java.lang.String time_end,
           java.lang.String registernums,
           java.lang.String create_code) {
           this.ksdm = ksdm;
           this.ksmc = ksmc;
           this.doctor_code = doctor_code;
           this.time_start = time_start;
           this.time_end = time_end;
           this.registernums = registernums;
           this.create_code = create_code;
    }


    /**
     * Gets the ksdm value for this InsertScheduleTimeTemplate.
     * 
     * @return ksdm
     */
    public java.lang.String getKsdm() {
        return ksdm;
    }


    /**
     * Sets the ksdm value for this InsertScheduleTimeTemplate.
     * 
     * @param ksdm
     */
    public void setKsdm(java.lang.String ksdm) {
        this.ksdm = ksdm;
    }


    /**
     * Gets the ksmc value for this InsertScheduleTimeTemplate.
     * 
     * @return ksmc
     */
    public java.lang.String getKsmc() {
        return ksmc;
    }


    /**
     * Sets the ksmc value for this InsertScheduleTimeTemplate.
     * 
     * @param ksmc
     */
    public void setKsmc(java.lang.String ksmc) {
        this.ksmc = ksmc;
    }


    /**
     * Gets the doctor_code value for this InsertScheduleTimeTemplate.
     * 
     * @return doctor_code
     */
    public java.lang.String getDoctor_code() {
        return doctor_code;
    }


    /**
     * Sets the doctor_code value for this InsertScheduleTimeTemplate.
     * 
     * @param doctor_code
     */
    public void setDoctor_code(java.lang.String doctor_code) {
        this.doctor_code = doctor_code;
    }


    /**
     * Gets the time_start value for this InsertScheduleTimeTemplate.
     * 
     * @return time_start
     */
    public java.lang.String getTime_start() {
        return time_start;
    }


    /**
     * Sets the time_start value for this InsertScheduleTimeTemplate.
     * 
     * @param time_start
     */
    public void setTime_start(java.lang.String time_start) {
        this.time_start = time_start;
    }


    /**
     * Gets the time_end value for this InsertScheduleTimeTemplate.
     * 
     * @return time_end
     */
    public java.lang.String getTime_end() {
        return time_end;
    }


    /**
     * Sets the time_end value for this InsertScheduleTimeTemplate.
     * 
     * @param time_end
     */
    public void setTime_end(java.lang.String time_end) {
        this.time_end = time_end;
    }


    /**
     * Gets the registernums value for this InsertScheduleTimeTemplate.
     * 
     * @return registernums
     */
    public java.lang.String getRegisternums() {
        return registernums;
    }


    /**
     * Sets the registernums value for this InsertScheduleTimeTemplate.
     * 
     * @param registernums
     */
    public void setRegisternums(java.lang.String registernums) {
        this.registernums = registernums;
    }


    /**
     * Gets the create_code value for this InsertScheduleTimeTemplate.
     * 
     * @return create_code
     */
    public java.lang.String getCreate_code() {
        return create_code;
    }


    /**
     * Sets the create_code value for this InsertScheduleTimeTemplate.
     * 
     * @param create_code
     */
    public void setCreate_code(java.lang.String create_code) {
        this.create_code = create_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertScheduleTimeTemplate)) return false;
        InsertScheduleTimeTemplate other = (InsertScheduleTimeTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ksdm==null && other.getKsdm()==null) || 
             (this.ksdm!=null &&
              this.ksdm.equals(other.getKsdm()))) &&
            ((this.ksmc==null && other.getKsmc()==null) || 
             (this.ksmc!=null &&
              this.ksmc.equals(other.getKsmc()))) &&
            ((this.doctor_code==null && other.getDoctor_code()==null) || 
             (this.doctor_code!=null &&
              this.doctor_code.equals(other.getDoctor_code()))) &&
            ((this.time_start==null && other.getTime_start()==null) || 
             (this.time_start!=null &&
              this.time_start.equals(other.getTime_start()))) &&
            ((this.time_end==null && other.getTime_end()==null) || 
             (this.time_end!=null &&
              this.time_end.equals(other.getTime_end()))) &&
            ((this.registernums==null && other.getRegisternums()==null) || 
             (this.registernums!=null &&
              this.registernums.equals(other.getRegisternums()))) &&
            ((this.create_code==null && other.getCreate_code()==null) || 
             (this.create_code!=null &&
              this.create_code.equals(other.getCreate_code())));
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
        if (getKsdm() != null) {
            _hashCode += getKsdm().hashCode();
        }
        if (getKsmc() != null) {
            _hashCode += getKsmc().hashCode();
        }
        if (getDoctor_code() != null) {
            _hashCode += getDoctor_code().hashCode();
        }
        if (getTime_start() != null) {
            _hashCode += getTime_start().hashCode();
        }
        if (getTime_end() != null) {
            _hashCode += getTime_end().hashCode();
        }
        if (getRegisternums() != null) {
            _hashCode += getRegisternums().hashCode();
        }
        if (getCreate_code() != null) {
            _hashCode += getCreate_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertScheduleTimeTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertScheduleTimeTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ksdm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ksdm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ksmc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ksmc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doctor_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "doctor_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "time_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_end");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "time_end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registernums");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "registernums"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "create_code"));
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
