/**
 * EXAM_EQUIPMENT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class EXAM_EQUIPMENT  implements java.io.Serializable {
    private int SERIAL_ID;

    private java.lang.String LAB_DEPT_CODE;

    private java.lang.String LAB_DEPT_NAME;

    private java.lang.String ROOM_NUM;

    private java.lang.String EQUIPMENT_NUM;

    private java.lang.String ITEM_CODE;

    private java.lang.String ITEM_NAME;

    private java.lang.String AVERAGE_TIME;

    private java.lang.String IS_SCHEDULE;

    private java.util.Calendar CREATE_TIME;

    private java.util.Calendar UPDATE_TIME;

    private java.lang.String readinessTime;

    public EXAM_EQUIPMENT() {
    }

    public EXAM_EQUIPMENT(
           int SERIAL_ID,
           java.lang.String LAB_DEPT_CODE,
           java.lang.String LAB_DEPT_NAME,
           java.lang.String ROOM_NUM,
           java.lang.String EQUIPMENT_NUM,
           java.lang.String ITEM_CODE,
           java.lang.String ITEM_NAME,
           java.lang.String AVERAGE_TIME,
           java.lang.String IS_SCHEDULE,
           java.util.Calendar CREATE_TIME,
           java.util.Calendar UPDATE_TIME,
           java.lang.String readinessTime) {
           this.SERIAL_ID = SERIAL_ID;
           this.LAB_DEPT_CODE = LAB_DEPT_CODE;
           this.LAB_DEPT_NAME = LAB_DEPT_NAME;
           this.ROOM_NUM = ROOM_NUM;
           this.EQUIPMENT_NUM = EQUIPMENT_NUM;
           this.ITEM_CODE = ITEM_CODE;
           this.ITEM_NAME = ITEM_NAME;
           this.AVERAGE_TIME = AVERAGE_TIME;
           this.IS_SCHEDULE = IS_SCHEDULE;
           this.CREATE_TIME = CREATE_TIME;
           this.UPDATE_TIME = UPDATE_TIME;
           this.readinessTime = readinessTime;
    }


    /**
     * Gets the SERIAL_ID value for this EXAM_EQUIPMENT.
     * 
     * @return SERIAL_ID
     */
    public int getSERIAL_ID() {
        return SERIAL_ID;
    }


    /**
     * Sets the SERIAL_ID value for this EXAM_EQUIPMENT.
     * 
     * @param SERIAL_ID
     */
    public void setSERIAL_ID(int SERIAL_ID) {
        this.SERIAL_ID = SERIAL_ID;
    }


    /**
     * Gets the LAB_DEPT_CODE value for this EXAM_EQUIPMENT.
     * 
     * @return LAB_DEPT_CODE
     */
    public java.lang.String getLAB_DEPT_CODE() {
        return LAB_DEPT_CODE;
    }


    /**
     * Sets the LAB_DEPT_CODE value for this EXAM_EQUIPMENT.
     * 
     * @param LAB_DEPT_CODE
     */
    public void setLAB_DEPT_CODE(java.lang.String LAB_DEPT_CODE) {
        this.LAB_DEPT_CODE = LAB_DEPT_CODE;
    }


    /**
     * Gets the LAB_DEPT_NAME value for this EXAM_EQUIPMENT.
     * 
     * @return LAB_DEPT_NAME
     */
    public java.lang.String getLAB_DEPT_NAME() {
        return LAB_DEPT_NAME;
    }


    /**
     * Sets the LAB_DEPT_NAME value for this EXAM_EQUIPMENT.
     * 
     * @param LAB_DEPT_NAME
     */
    public void setLAB_DEPT_NAME(java.lang.String LAB_DEPT_NAME) {
        this.LAB_DEPT_NAME = LAB_DEPT_NAME;
    }


    /**
     * Gets the ROOM_NUM value for this EXAM_EQUIPMENT.
     * 
     * @return ROOM_NUM
     */
    public java.lang.String getROOM_NUM() {
        return ROOM_NUM;
    }


    /**
     * Sets the ROOM_NUM value for this EXAM_EQUIPMENT.
     * 
     * @param ROOM_NUM
     */
    public void setROOM_NUM(java.lang.String ROOM_NUM) {
        this.ROOM_NUM = ROOM_NUM;
    }


    /**
     * Gets the EQUIPMENT_NUM value for this EXAM_EQUIPMENT.
     * 
     * @return EQUIPMENT_NUM
     */
    public java.lang.String getEQUIPMENT_NUM() {
        return EQUIPMENT_NUM;
    }


    /**
     * Sets the EQUIPMENT_NUM value for this EXAM_EQUIPMENT.
     * 
     * @param EQUIPMENT_NUM
     */
    public void setEQUIPMENT_NUM(java.lang.String EQUIPMENT_NUM) {
        this.EQUIPMENT_NUM = EQUIPMENT_NUM;
    }


    /**
     * Gets the ITEM_CODE value for this EXAM_EQUIPMENT.
     * 
     * @return ITEM_CODE
     */
    public java.lang.String getITEM_CODE() {
        return ITEM_CODE;
    }


    /**
     * Sets the ITEM_CODE value for this EXAM_EQUIPMENT.
     * 
     * @param ITEM_CODE
     */
    public void setITEM_CODE(java.lang.String ITEM_CODE) {
        this.ITEM_CODE = ITEM_CODE;
    }


    /**
     * Gets the ITEM_NAME value for this EXAM_EQUIPMENT.
     * 
     * @return ITEM_NAME
     */
    public java.lang.String getITEM_NAME() {
        return ITEM_NAME;
    }


    /**
     * Sets the ITEM_NAME value for this EXAM_EQUIPMENT.
     * 
     * @param ITEM_NAME
     */
    public void setITEM_NAME(java.lang.String ITEM_NAME) {
        this.ITEM_NAME = ITEM_NAME;
    }


    /**
     * Gets the AVERAGE_TIME value for this EXAM_EQUIPMENT.
     * 
     * @return AVERAGE_TIME
     */
    public java.lang.String getAVERAGE_TIME() {
        return AVERAGE_TIME;
    }


    /**
     * Sets the AVERAGE_TIME value for this EXAM_EQUIPMENT.
     * 
     * @param AVERAGE_TIME
     */
    public void setAVERAGE_TIME(java.lang.String AVERAGE_TIME) {
        this.AVERAGE_TIME = AVERAGE_TIME;
    }


    /**
     * Gets the IS_SCHEDULE value for this EXAM_EQUIPMENT.
     * 
     * @return IS_SCHEDULE
     */
    public java.lang.String getIS_SCHEDULE() {
        return IS_SCHEDULE;
    }


    /**
     * Sets the IS_SCHEDULE value for this EXAM_EQUIPMENT.
     * 
     * @param IS_SCHEDULE
     */
    public void setIS_SCHEDULE(java.lang.String IS_SCHEDULE) {
        this.IS_SCHEDULE = IS_SCHEDULE;
    }


    /**
     * Gets the CREATE_TIME value for this EXAM_EQUIPMENT.
     * 
     * @return CREATE_TIME
     */
    public java.util.Calendar getCREATE_TIME() {
        return CREATE_TIME;
    }


    /**
     * Sets the CREATE_TIME value for this EXAM_EQUIPMENT.
     * 
     * @param CREATE_TIME
     */
    public void setCREATE_TIME(java.util.Calendar CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }


    /**
     * Gets the UPDATE_TIME value for this EXAM_EQUIPMENT.
     * 
     * @return UPDATE_TIME
     */
    public java.util.Calendar getUPDATE_TIME() {
        return UPDATE_TIME;
    }


    /**
     * Sets the UPDATE_TIME value for this EXAM_EQUIPMENT.
     * 
     * @param UPDATE_TIME
     */
    public void setUPDATE_TIME(java.util.Calendar UPDATE_TIME) {
        this.UPDATE_TIME = UPDATE_TIME;
    }


    /**
     * Gets the readinessTime value for this EXAM_EQUIPMENT.
     * 
     * @return readinessTime
     */
    public java.lang.String getReadinessTime() {
        return readinessTime;
    }


    /**
     * Sets the readinessTime value for this EXAM_EQUIPMENT.
     * 
     * @param readinessTime
     */
    public void setReadinessTime(java.lang.String readinessTime) {
        this.readinessTime = readinessTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EXAM_EQUIPMENT)) return false;
        EXAM_EQUIPMENT other = (EXAM_EQUIPMENT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.SERIAL_ID == other.getSERIAL_ID() &&
            ((this.LAB_DEPT_CODE==null && other.getLAB_DEPT_CODE()==null) || 
             (this.LAB_DEPT_CODE!=null &&
              this.LAB_DEPT_CODE.equals(other.getLAB_DEPT_CODE()))) &&
            ((this.LAB_DEPT_NAME==null && other.getLAB_DEPT_NAME()==null) || 
             (this.LAB_DEPT_NAME!=null &&
              this.LAB_DEPT_NAME.equals(other.getLAB_DEPT_NAME()))) &&
            ((this.ROOM_NUM==null && other.getROOM_NUM()==null) || 
             (this.ROOM_NUM!=null &&
              this.ROOM_NUM.equals(other.getROOM_NUM()))) &&
            ((this.EQUIPMENT_NUM==null && other.getEQUIPMENT_NUM()==null) || 
             (this.EQUIPMENT_NUM!=null &&
              this.EQUIPMENT_NUM.equals(other.getEQUIPMENT_NUM()))) &&
            ((this.ITEM_CODE==null && other.getITEM_CODE()==null) || 
             (this.ITEM_CODE!=null &&
              this.ITEM_CODE.equals(other.getITEM_CODE()))) &&
            ((this.ITEM_NAME==null && other.getITEM_NAME()==null) || 
             (this.ITEM_NAME!=null &&
              this.ITEM_NAME.equals(other.getITEM_NAME()))) &&
            ((this.AVERAGE_TIME==null && other.getAVERAGE_TIME()==null) || 
             (this.AVERAGE_TIME!=null &&
              this.AVERAGE_TIME.equals(other.getAVERAGE_TIME()))) &&
            ((this.IS_SCHEDULE==null && other.getIS_SCHEDULE()==null) || 
             (this.IS_SCHEDULE!=null &&
              this.IS_SCHEDULE.equals(other.getIS_SCHEDULE()))) &&
            ((this.CREATE_TIME==null && other.getCREATE_TIME()==null) || 
             (this.CREATE_TIME!=null &&
              this.CREATE_TIME.equals(other.getCREATE_TIME()))) &&
            ((this.UPDATE_TIME==null && other.getUPDATE_TIME()==null) || 
             (this.UPDATE_TIME!=null &&
              this.UPDATE_TIME.equals(other.getUPDATE_TIME()))) &&
            ((this.readinessTime==null && other.getReadinessTime()==null) || 
             (this.readinessTime!=null &&
              this.readinessTime.equals(other.getReadinessTime())));
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
        _hashCode += getSERIAL_ID();
        if (getLAB_DEPT_CODE() != null) {
            _hashCode += getLAB_DEPT_CODE().hashCode();
        }
        if (getLAB_DEPT_NAME() != null) {
            _hashCode += getLAB_DEPT_NAME().hashCode();
        }
        if (getROOM_NUM() != null) {
            _hashCode += getROOM_NUM().hashCode();
        }
        if (getEQUIPMENT_NUM() != null) {
            _hashCode += getEQUIPMENT_NUM().hashCode();
        }
        if (getITEM_CODE() != null) {
            _hashCode += getITEM_CODE().hashCode();
        }
        if (getITEM_NAME() != null) {
            _hashCode += getITEM_NAME().hashCode();
        }
        if (getAVERAGE_TIME() != null) {
            _hashCode += getAVERAGE_TIME().hashCode();
        }
        if (getIS_SCHEDULE() != null) {
            _hashCode += getIS_SCHEDULE().hashCode();
        }
        if (getCREATE_TIME() != null) {
            _hashCode += getCREATE_TIME().hashCode();
        }
        if (getUPDATE_TIME() != null) {
            _hashCode += getUPDATE_TIME().hashCode();
        }
        if (getReadinessTime() != null) {
            _hashCode += getReadinessTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EXAM_EQUIPMENT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "EXAM_EQUIPMENT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SERIAL_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SERIAL_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LAB_DEPT_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LAB_DEPT_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LAB_DEPT_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LAB_DEPT_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROOM_NUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ROOM_NUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EQUIPMENT_NUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EQUIPMENT_NUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITEM_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ITEM_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITEM_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ITEM_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AVERAGE_TIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AVERAGE_TIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IS_SCHEDULE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IS_SCHEDULE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CREATE_TIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CREATE_TIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UPDATE_TIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UPDATE_TIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readinessTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReadinessTime"));
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
