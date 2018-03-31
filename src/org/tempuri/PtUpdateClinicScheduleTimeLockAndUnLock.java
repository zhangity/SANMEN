/**
 * PtUpdateClinicScheduleTimeLockAndUnLock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class PtUpdateClinicScheduleTimeLockAndUnLock  implements java.io.Serializable {
    private java.lang.String userID;

    private java.lang.String password;

    private java.lang.String timeId;

    private java.lang.String lockbz;

    private java.lang.String lockNum;

    public PtUpdateClinicScheduleTimeLockAndUnLock() {
    }

    public PtUpdateClinicScheduleTimeLockAndUnLock(
           java.lang.String userID,
           java.lang.String password,
           java.lang.String timeId,
           java.lang.String lockbz,
           java.lang.String lockNum) {
           this.userID = userID;
           this.password = password;
           this.timeId = timeId;
           this.lockbz = lockbz;
           this.lockNum = lockNum;
    }


    /**
     * Gets the userID value for this PtUpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this PtUpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }


    /**
     * Gets the password value for this PtUpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this PtUpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the timeId value for this PtUpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @return timeId
     */
    public java.lang.String getTimeId() {
        return timeId;
    }


    /**
     * Sets the timeId value for this PtUpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @param timeId
     */
    public void setTimeId(java.lang.String timeId) {
        this.timeId = timeId;
    }


    /**
     * Gets the lockbz value for this PtUpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @return lockbz
     */
    public java.lang.String getLockbz() {
        return lockbz;
    }


    /**
     * Sets the lockbz value for this PtUpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @param lockbz
     */
    public void setLockbz(java.lang.String lockbz) {
        this.lockbz = lockbz;
    }


    /**
     * Gets the lockNum value for this PtUpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @return lockNum
     */
    public java.lang.String getLockNum() {
        return lockNum;
    }


    /**
     * Sets the lockNum value for this PtUpdateClinicScheduleTimeLockAndUnLock.
     * 
     * @param lockNum
     */
    public void setLockNum(java.lang.String lockNum) {
        this.lockNum = lockNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PtUpdateClinicScheduleTimeLockAndUnLock)) return false;
        PtUpdateClinicScheduleTimeLockAndUnLock other = (PtUpdateClinicScheduleTimeLockAndUnLock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.timeId==null && other.getTimeId()==null) || 
             (this.timeId!=null &&
              this.timeId.equals(other.getTimeId()))) &&
            ((this.lockbz==null && other.getLockbz()==null) || 
             (this.lockbz!=null &&
              this.lockbz.equals(other.getLockbz()))) &&
            ((this.lockNum==null && other.getLockNum()==null) || 
             (this.lockNum!=null &&
              this.lockNum.equals(other.getLockNum())));
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
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getTimeId() != null) {
            _hashCode += getTimeId().hashCode();
        }
        if (getLockbz() != null) {
            _hashCode += getLockbz().hashCode();
        }
        if (getLockNum() != null) {
            _hashCode += getLockNum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PtUpdateClinicScheduleTimeLockAndUnLock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">PtUpdateClinicScheduleTimeLockAndUnLock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TimeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockbz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Lockbz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LockNum"));
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
