/**
 * TIMEPbb.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class TIMEPbb  implements java.io.Serializable {
    private java.lang.String SCHEDULE_ID;

    private java.lang.String SCHEDULE_DATE;

    private java.lang.String startTime;

    private java.lang.String endTime;

    private int addmin;

    public TIMEPbb() {
    }

    public TIMEPbb(
           java.lang.String SCHEDULE_ID,
           java.lang.String SCHEDULE_DATE,
           java.lang.String startTime,
           java.lang.String endTime,
           int addmin) {
           this.SCHEDULE_ID = SCHEDULE_ID;
           this.SCHEDULE_DATE = SCHEDULE_DATE;
           this.startTime = startTime;
           this.endTime = endTime;
           this.addmin = addmin;
    }


    /**
     * Gets the SCHEDULE_ID value for this TIMEPbb.
     * 
     * @return SCHEDULE_ID
     */
    public java.lang.String getSCHEDULE_ID() {
        return SCHEDULE_ID;
    }


    /**
     * Sets the SCHEDULE_ID value for this TIMEPbb.
     * 
     * @param SCHEDULE_ID
     */
    public void setSCHEDULE_ID(java.lang.String SCHEDULE_ID) {
        this.SCHEDULE_ID = SCHEDULE_ID;
    }


    /**
     * Gets the SCHEDULE_DATE value for this TIMEPbb.
     * 
     * @return SCHEDULE_DATE
     */
    public java.lang.String getSCHEDULE_DATE() {
        return SCHEDULE_DATE;
    }


    /**
     * Sets the SCHEDULE_DATE value for this TIMEPbb.
     * 
     * @param SCHEDULE_DATE
     */
    public void setSCHEDULE_DATE(java.lang.String SCHEDULE_DATE) {
        this.SCHEDULE_DATE = SCHEDULE_DATE;
    }


    /**
     * Gets the startTime value for this TIMEPbb.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this TIMEPbb.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this TIMEPbb.
     * 
     * @return endTime
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this TIMEPbb.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the addmin value for this TIMEPbb.
     * 
     * @return addmin
     */
    public int getAddmin() {
        return addmin;
    }


    /**
     * Sets the addmin value for this TIMEPbb.
     * 
     * @param addmin
     */
    public void setAddmin(int addmin) {
        this.addmin = addmin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TIMEPbb)) return false;
        TIMEPbb other = (TIMEPbb) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SCHEDULE_ID==null && other.getSCHEDULE_ID()==null) || 
             (this.SCHEDULE_ID!=null &&
              this.SCHEDULE_ID.equals(other.getSCHEDULE_ID()))) &&
            ((this.SCHEDULE_DATE==null && other.getSCHEDULE_DATE()==null) || 
             (this.SCHEDULE_DATE!=null &&
              this.SCHEDULE_DATE.equals(other.getSCHEDULE_DATE()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            this.addmin == other.getAddmin();
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
        if (getSCHEDULE_ID() != null) {
            _hashCode += getSCHEDULE_ID().hashCode();
        }
        if (getSCHEDULE_DATE() != null) {
            _hashCode += getSCHEDULE_DATE().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        _hashCode += getAddmin();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TIMEPbb.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">TIMEPbb"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCHEDULE_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SCHEDULE_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCHEDULE_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SCHEDULE_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addmin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "addmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
