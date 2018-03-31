/**
 * UpdateScheduleTimeTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateScheduleTimeTemplate  implements java.io.Serializable {
    private java.lang.String defineid;

    private java.lang.String time_start;

    private java.lang.String time_end;

    private java.lang.String registernums;

    private java.lang.String update_code;

    public UpdateScheduleTimeTemplate() {
    }

    public UpdateScheduleTimeTemplate(
           java.lang.String defineid,
           java.lang.String time_start,
           java.lang.String time_end,
           java.lang.String registernums,
           java.lang.String update_code) {
           this.defineid = defineid;
           this.time_start = time_start;
           this.time_end = time_end;
           this.registernums = registernums;
           this.update_code = update_code;
    }


    /**
     * Gets the defineid value for this UpdateScheduleTimeTemplate.
     * 
     * @return defineid
     */
    public java.lang.String getDefineid() {
        return defineid;
    }


    /**
     * Sets the defineid value for this UpdateScheduleTimeTemplate.
     * 
     * @param defineid
     */
    public void setDefineid(java.lang.String defineid) {
        this.defineid = defineid;
    }


    /**
     * Gets the time_start value for this UpdateScheduleTimeTemplate.
     * 
     * @return time_start
     */
    public java.lang.String getTime_start() {
        return time_start;
    }


    /**
     * Sets the time_start value for this UpdateScheduleTimeTemplate.
     * 
     * @param time_start
     */
    public void setTime_start(java.lang.String time_start) {
        this.time_start = time_start;
    }


    /**
     * Gets the time_end value for this UpdateScheduleTimeTemplate.
     * 
     * @return time_end
     */
    public java.lang.String getTime_end() {
        return time_end;
    }


    /**
     * Sets the time_end value for this UpdateScheduleTimeTemplate.
     * 
     * @param time_end
     */
    public void setTime_end(java.lang.String time_end) {
        this.time_end = time_end;
    }


    /**
     * Gets the registernums value for this UpdateScheduleTimeTemplate.
     * 
     * @return registernums
     */
    public java.lang.String getRegisternums() {
        return registernums;
    }


    /**
     * Sets the registernums value for this UpdateScheduleTimeTemplate.
     * 
     * @param registernums
     */
    public void setRegisternums(java.lang.String registernums) {
        this.registernums = registernums;
    }


    /**
     * Gets the update_code value for this UpdateScheduleTimeTemplate.
     * 
     * @return update_code
     */
    public java.lang.String getUpdate_code() {
        return update_code;
    }


    /**
     * Sets the update_code value for this UpdateScheduleTimeTemplate.
     * 
     * @param update_code
     */
    public void setUpdate_code(java.lang.String update_code) {
        this.update_code = update_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateScheduleTimeTemplate)) return false;
        UpdateScheduleTimeTemplate other = (UpdateScheduleTimeTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.defineid==null && other.getDefineid()==null) || 
             (this.defineid!=null &&
              this.defineid.equals(other.getDefineid()))) &&
            ((this.time_start==null && other.getTime_start()==null) || 
             (this.time_start!=null &&
              this.time_start.equals(other.getTime_start()))) &&
            ((this.time_end==null && other.getTime_end()==null) || 
             (this.time_end!=null &&
              this.time_end.equals(other.getTime_end()))) &&
            ((this.registernums==null && other.getRegisternums()==null) || 
             (this.registernums!=null &&
              this.registernums.equals(other.getRegisternums()))) &&
            ((this.update_code==null && other.getUpdate_code()==null) || 
             (this.update_code!=null &&
              this.update_code.equals(other.getUpdate_code())));
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
        if (getDefineid() != null) {
            _hashCode += getDefineid().hashCode();
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
        if (getUpdate_code() != null) {
            _hashCode += getUpdate_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateScheduleTimeTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateScheduleTimeTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defineid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "defineid"));
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
        elemField.setFieldName("update_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "update_code"));
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
