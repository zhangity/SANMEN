/**
 * UpdateClinicScheduleTimeLockAndUnLock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateClinicScheduleTimeLockAndUnLock  implements java.io.Serializable {
    private java.lang.String time_id;

    private java.lang.String usercode;

    private java.lang.String lockbz;

    private java.lang.String locknum;

    private java.lang.String RESERVATIONLOCKBZ;

    public UpdateClinicScheduleTimeLockAndUnLock() {
    }

    public UpdateClinicScheduleTimeLockAndUnLock(
           java.lang.String time_id,
           java.lang.String usercode,
           java.lang.String lockbz,
           java.lang.String locknum,
           java.lang.String RESERVATIONLOCKBZ) {
           this.time_id = time_id;
           this.usercode = usercode;
           this.lockbz = lockbz;
           this.locknum = locknum;
           this.RESERVATIONLOCKBZ = RESERVATIONLOCKBZ;
    }


    /**
     * Gets the time_id value for this UpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @return time_id
     */
    public java.lang.String getTime_id() {
        return time_id;
    }


    /**
     * Sets the time_id value for this UpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @param time_id
     */
    public void setTime_id(java.lang.String time_id) {
        this.time_id = time_id;
    }


    /**
     * Gets the usercode value for this UpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @return usercode
     */
    public java.lang.String getUsercode() {
        return usercode;
    }


    /**
     * Sets the usercode value for this UpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @param usercode
     */
    public void setUsercode(java.lang.String usercode) {
        this.usercode = usercode;
    }


    /**
     * Gets the lockbz value for this UpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @return lockbz
     */
    public java.lang.String getLockbz() {
        return lockbz;
    }


    /**
     * Sets the lockbz value for this UpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @param lockbz
     */
    public void setLockbz(java.lang.String lockbz) {
        this.lockbz = lockbz;
    }


    /**
     * Gets the locknum value for this UpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @return locknum
     */
    public java.lang.String getLocknum() {
        return locknum;
    }


    /**
     * Sets the locknum value for this UpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @param locknum
     */
    public void setLocknum(java.lang.String locknum) {
        this.locknum = locknum;
    }


    /**
     * Gets the RESERVATIONLOCKBZ value for this UpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @return RESERVATIONLOCKBZ
     */
    public java.lang.String getRESERVATIONLOCKBZ() {
        return RESERVATIONLOCKBZ;
    }


    /**
     * Sets the RESERVATIONLOCKBZ value for this UpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @param RESERVATIONLOCKBZ
     */
    public void setRESERVATIONLOCKBZ(java.lang.String RESERVATIONLOCKBZ) {
        this.RESERVATIONLOCKBZ = RESERVATIONLOCKBZ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateClinicScheduleTimeLockAndUnLock)) return false;
        UpdateClinicScheduleTimeLockAndUnLock other = (UpdateClinicScheduleTimeLockAndUnLock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.time_id==null && other.getTime_id()==null) || 
             (this.time_id!=null &&
              this.time_id.equals(other.getTime_id()))) &&
            ((this.usercode==null && other.getUsercode()==null) || 
             (this.usercode!=null &&
              this.usercode.equals(other.getUsercode()))) &&
            ((this.lockbz==null && other.getLockbz()==null) || 
             (this.lockbz!=null &&
              this.lockbz.equals(other.getLockbz()))) &&
            ((this.locknum==null && other.getLocknum()==null) || 
             (this.locknum!=null &&
              this.locknum.equals(other.getLocknum()))) &&
            ((this.RESERVATIONLOCKBZ==null && other.getRESERVATIONLOCKBZ()==null) || 
             (this.RESERVATIONLOCKBZ!=null &&
              this.RESERVATIONLOCKBZ.equals(other.getRESERVATIONLOCKBZ())));
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
        if (getTime_id() != null) {
            _hashCode += getTime_id().hashCode();
        }
        if (getUsercode() != null) {
            _hashCode += getUsercode().hashCode();
        }
        if (getLockbz() != null) {
            _hashCode += getLockbz().hashCode();
        }
        if (getLocknum() != null) {
            _hashCode += getLocknum().hashCode();
        }
        if (getRESERVATIONLOCKBZ() != null) {
            _hashCode += getRESERVATIONLOCKBZ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateClinicScheduleTimeLockAndUnLock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateClinicScheduleTimeLockAndUnLock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "time_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usercode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "usercode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockbz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "lockbz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locknum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "locknum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESERVATIONLOCKBZ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RESERVATIONLOCKBZ"));
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
