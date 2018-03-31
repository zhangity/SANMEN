/**
 * GetExam_ScheduleByItemID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetExam_ScheduleByItemID  implements java.io.Serializable {
    private java.lang.String itemID;

    private java.lang.String EXAM_DATE;

    private java.lang.String EQUIPMENT_NUMstr;

    private java.lang.String ID_NO;

    private java.lang.String TELEPHONE;

    public GetExam_ScheduleByItemID() {
    }

    public GetExam_ScheduleByItemID(
           java.lang.String itemID,
           java.lang.String EXAM_DATE,
           java.lang.String EQUIPMENT_NUMstr,
           java.lang.String ID_NO,
           java.lang.String TELEPHONE) {
           this.itemID = itemID;
           this.EXAM_DATE = EXAM_DATE;
           this.EQUIPMENT_NUMstr = EQUIPMENT_NUMstr;
           this.ID_NO = ID_NO;
           this.TELEPHONE = TELEPHONE;
    }


    /**
     * Gets the itemID value for this GetExam_ScheduleByItemID.
     * 
     * @return itemID
     */
    public java.lang.String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this GetExam_ScheduleByItemID.
     * 
     * @param itemID
     */
    public void setItemID(java.lang.String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the EXAM_DATE value for this GetExam_ScheduleByItemID.
     * 
     * @return EXAM_DATE
     */
    public java.lang.String getEXAM_DATE() {
        return EXAM_DATE;
    }


    /**
     * Sets the EXAM_DATE value for this GetExam_ScheduleByItemID.
     * 
     * @param EXAM_DATE
     */
    public void setEXAM_DATE(java.lang.String EXAM_DATE) {
        this.EXAM_DATE = EXAM_DATE;
    }


    /**
     * Gets the EQUIPMENT_NUMstr value for this GetExam_ScheduleByItemID.
     * 
     * @return EQUIPMENT_NUMstr
     */
    public java.lang.String getEQUIPMENT_NUMstr() {
        return EQUIPMENT_NUMstr;
    }


    /**
     * Sets the EQUIPMENT_NUMstr value for this GetExam_ScheduleByItemID.
     * 
     * @param EQUIPMENT_NUMstr
     */
    public void setEQUIPMENT_NUMstr(java.lang.String EQUIPMENT_NUMstr) {
        this.EQUIPMENT_NUMstr = EQUIPMENT_NUMstr;
    }


    /**
     * Gets the ID_NO value for this GetExam_ScheduleByItemID.
     * 
     * @return ID_NO
     */
    public java.lang.String getID_NO() {
        return ID_NO;
    }


    /**
     * Sets the ID_NO value for this GetExam_ScheduleByItemID.
     * 
     * @param ID_NO
     */
    public void setID_NO(java.lang.String ID_NO) {
        this.ID_NO = ID_NO;
    }


    /**
     * Gets the TELEPHONE value for this GetExam_ScheduleByItemID.
     * 
     * @return TELEPHONE
     */
    public java.lang.String getTELEPHONE() {
        return TELEPHONE;
    }


    /**
     * Sets the TELEPHONE value for this GetExam_ScheduleByItemID.
     * 
     * @param TELEPHONE
     */
    public void setTELEPHONE(java.lang.String TELEPHONE) {
        this.TELEPHONE = TELEPHONE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetExam_ScheduleByItemID)) return false;
        GetExam_ScheduleByItemID other = (GetExam_ScheduleByItemID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            ((this.EXAM_DATE==null && other.getEXAM_DATE()==null) || 
             (this.EXAM_DATE!=null &&
              this.EXAM_DATE.equals(other.getEXAM_DATE()))) &&
            ((this.EQUIPMENT_NUMstr==null && other.getEQUIPMENT_NUMstr()==null) || 
             (this.EQUIPMENT_NUMstr!=null &&
              this.EQUIPMENT_NUMstr.equals(other.getEQUIPMENT_NUMstr()))) &&
            ((this.ID_NO==null && other.getID_NO()==null) || 
             (this.ID_NO!=null &&
              this.ID_NO.equals(other.getID_NO()))) &&
            ((this.TELEPHONE==null && other.getTELEPHONE()==null) || 
             (this.TELEPHONE!=null &&
              this.TELEPHONE.equals(other.getTELEPHONE())));
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
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        if (getEXAM_DATE() != null) {
            _hashCode += getEXAM_DATE().hashCode();
        }
        if (getEQUIPMENT_NUMstr() != null) {
            _hashCode += getEQUIPMENT_NUMstr().hashCode();
        }
        if (getID_NO() != null) {
            _hashCode += getID_NO().hashCode();
        }
        if (getTELEPHONE() != null) {
            _hashCode += getTELEPHONE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExam_ScheduleByItemID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetExam_ScheduleByItemID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ItemID"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EQUIPMENT_NUMstr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EQUIPMENT_NUMstr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ID_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TELEPHONE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TELEPHONE"));
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
