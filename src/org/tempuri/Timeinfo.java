/**
 * Timeinfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Timeinfo  implements java.io.Serializable {
    private int schedule_id;

    private java.lang.String schedule_date;

    private java.lang.String ampm;

    private java.lang.String time_start;

    private java.lang.String time_end;

    private java.lang.String doctor_code;

    private java.lang.String doctor_name;

    private java.lang.String dept_code;

    private java.lang.String dept_name;

    private java.lang.String ipadress;

    public Timeinfo() {
    }

    public Timeinfo(
           int schedule_id,
           java.lang.String schedule_date,
           java.lang.String ampm,
           java.lang.String time_start,
           java.lang.String time_end,
           java.lang.String doctor_code,
           java.lang.String doctor_name,
           java.lang.String dept_code,
           java.lang.String dept_name,
           java.lang.String ipadress) {
           this.schedule_id = schedule_id;
           this.schedule_date = schedule_date;
           this.ampm = ampm;
           this.time_start = time_start;
           this.time_end = time_end;
           this.doctor_code = doctor_code;
           this.doctor_name = doctor_name;
           this.dept_code = dept_code;
           this.dept_name = dept_name;
           this.ipadress = ipadress;
    }


    /**
     * Gets the schedule_id value for this Timeinfo.
     * 
     * @return schedule_id
     */
    public int getSchedule_id() {
        return schedule_id;
    }


    /**
     * Sets the schedule_id value for this Timeinfo.
     * 
     * @param schedule_id
     */
    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }


    /**
     * Gets the schedule_date value for this Timeinfo.
     * 
     * @return schedule_date
     */
    public java.lang.String getSchedule_date() {
        return schedule_date;
    }


    /**
     * Sets the schedule_date value for this Timeinfo.
     * 
     * @param schedule_date
     */
    public void setSchedule_date(java.lang.String schedule_date) {
        this.schedule_date = schedule_date;
    }


    /**
     * Gets the ampm value for this Timeinfo.
     * 
     * @return ampm
     */
    public java.lang.String getAmpm() {
        return ampm;
    }


    /**
     * Sets the ampm value for this Timeinfo.
     * 
     * @param ampm
     */
    public void setAmpm(java.lang.String ampm) {
        this.ampm = ampm;
    }


    /**
     * Gets the time_start value for this Timeinfo.
     * 
     * @return time_start
     */
    public java.lang.String getTime_start() {
        return time_start;
    }


    /**
     * Sets the time_start value for this Timeinfo.
     * 
     * @param time_start
     */
    public void setTime_start(java.lang.String time_start) {
        this.time_start = time_start;
    }


    /**
     * Gets the time_end value for this Timeinfo.
     * 
     * @return time_end
     */
    public java.lang.String getTime_end() {
        return time_end;
    }


    /**
     * Sets the time_end value for this Timeinfo.
     * 
     * @param time_end
     */
    public void setTime_end(java.lang.String time_end) {
        this.time_end = time_end;
    }


    /**
     * Gets the doctor_code value for this Timeinfo.
     * 
     * @return doctor_code
     */
    public java.lang.String getDoctor_code() {
        return doctor_code;
    }


    /**
     * Sets the doctor_code value for this Timeinfo.
     * 
     * @param doctor_code
     */
    public void setDoctor_code(java.lang.String doctor_code) {
        this.doctor_code = doctor_code;
    }


    /**
     * Gets the doctor_name value for this Timeinfo.
     * 
     * @return doctor_name
     */
    public java.lang.String getDoctor_name() {
        return doctor_name;
    }


    /**
     * Sets the doctor_name value for this Timeinfo.
     * 
     * @param doctor_name
     */
    public void setDoctor_name(java.lang.String doctor_name) {
        this.doctor_name = doctor_name;
    }


    /**
     * Gets the dept_code value for this Timeinfo.
     * 
     * @return dept_code
     */
    public java.lang.String getDept_code() {
        return dept_code;
    }


    /**
     * Sets the dept_code value for this Timeinfo.
     * 
     * @param dept_code
     */
    public void setDept_code(java.lang.String dept_code) {
        this.dept_code = dept_code;
    }


    /**
     * Gets the dept_name value for this Timeinfo.
     * 
     * @return dept_name
     */
    public java.lang.String getDept_name() {
        return dept_name;
    }


    /**
     * Sets the dept_name value for this Timeinfo.
     * 
     * @param dept_name
     */
    public void setDept_name(java.lang.String dept_name) {
        this.dept_name = dept_name;
    }


    /**
     * Gets the ipadress value for this Timeinfo.
     * 
     * @return ipadress
     */
    public java.lang.String getIpadress() {
        return ipadress;
    }


    /**
     * Sets the ipadress value for this Timeinfo.
     * 
     * @param ipadress
     */
    public void setIpadress(java.lang.String ipadress) {
        this.ipadress = ipadress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Timeinfo)) return false;
        Timeinfo other = (Timeinfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.schedule_id == other.getSchedule_id() &&
            ((this.schedule_date==null && other.getSchedule_date()==null) || 
             (this.schedule_date!=null &&
              this.schedule_date.equals(other.getSchedule_date()))) &&
            ((this.ampm==null && other.getAmpm()==null) || 
             (this.ampm!=null &&
              this.ampm.equals(other.getAmpm()))) &&
            ((this.time_start==null && other.getTime_start()==null) || 
             (this.time_start!=null &&
              this.time_start.equals(other.getTime_start()))) &&
            ((this.time_end==null && other.getTime_end()==null) || 
             (this.time_end!=null &&
              this.time_end.equals(other.getTime_end()))) &&
            ((this.doctor_code==null && other.getDoctor_code()==null) || 
             (this.doctor_code!=null &&
              this.doctor_code.equals(other.getDoctor_code()))) &&
            ((this.doctor_name==null && other.getDoctor_name()==null) || 
             (this.doctor_name!=null &&
              this.doctor_name.equals(other.getDoctor_name()))) &&
            ((this.dept_code==null && other.getDept_code()==null) || 
             (this.dept_code!=null &&
              this.dept_code.equals(other.getDept_code()))) &&
            ((this.dept_name==null && other.getDept_name()==null) || 
             (this.dept_name!=null &&
              this.dept_name.equals(other.getDept_name()))) &&
            ((this.ipadress==null && other.getIpadress()==null) || 
             (this.ipadress!=null &&
              this.ipadress.equals(other.getIpadress())));
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
        _hashCode += getSchedule_id();
        if (getSchedule_date() != null) {
            _hashCode += getSchedule_date().hashCode();
        }
        if (getAmpm() != null) {
            _hashCode += getAmpm().hashCode();
        }
        if (getTime_start() != null) {
            _hashCode += getTime_start().hashCode();
        }
        if (getTime_end() != null) {
            _hashCode += getTime_end().hashCode();
        }
        if (getDoctor_code() != null) {
            _hashCode += getDoctor_code().hashCode();
        }
        if (getDoctor_name() != null) {
            _hashCode += getDoctor_name().hashCode();
        }
        if (getDept_code() != null) {
            _hashCode += getDept_code().hashCode();
        }
        if (getDept_name() != null) {
            _hashCode += getDept_name().hashCode();
        }
        if (getIpadress() != null) {
            _hashCode += getIpadress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Timeinfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Timeinfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedule_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Schedule_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedule_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Schedule_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ampm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Ampm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Time_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_end");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Time_end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doctor_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Doctor_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doctor_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Doctor_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dept_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Dept_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dept_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Dept_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipadress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Ipadress"));
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
