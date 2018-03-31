/**
 * UnReservationRegistOfClinic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UnReservationRegistOfClinic  implements java.io.Serializable {
    private java.lang.String REGIST_ID;

    private java.lang.String SCHEDULE_ID;

    private java.lang.String TIME_ID;

    public UnReservationRegistOfClinic() {
    }

    public UnReservationRegistOfClinic(
           java.lang.String REGIST_ID,
           java.lang.String SCHEDULE_ID,
           java.lang.String TIME_ID) {
           this.REGIST_ID = REGIST_ID;
           this.SCHEDULE_ID = SCHEDULE_ID;
           this.TIME_ID = TIME_ID;
    }


    /**
     * Gets the REGIST_ID value for this UnReservationRegistOfClinic.
     * 
     * @return REGIST_ID
     */
    public java.lang.String getREGIST_ID() {
        return REGIST_ID;
    }


    /**
     * Sets the REGIST_ID value for this UnReservationRegistOfClinic.
     * 
     * @param REGIST_ID
     */
    public void setREGIST_ID(java.lang.String REGIST_ID) {
        this.REGIST_ID = REGIST_ID;
    }


    /**
     * Gets the SCHEDULE_ID value for this UnReservationRegistOfClinic.
     * 
     * @return SCHEDULE_ID
     */
    public java.lang.String getSCHEDULE_ID() {
        return SCHEDULE_ID;
    }


    /**
     * Sets the SCHEDULE_ID value for this UnReservationRegistOfClinic.
     * 
     * @param SCHEDULE_ID
     */
    public void setSCHEDULE_ID(java.lang.String SCHEDULE_ID) {
        this.SCHEDULE_ID = SCHEDULE_ID;
    }


    /**
     * Gets the TIME_ID value for this UnReservationRegistOfClinic.
     * 
     * @return TIME_ID
     */
    public java.lang.String getTIME_ID() {
        return TIME_ID;
    }


    /**
     * Sets the TIME_ID value for this UnReservationRegistOfClinic.
     * 
     * @param TIME_ID
     */
    public void setTIME_ID(java.lang.String TIME_ID) {
        this.TIME_ID = TIME_ID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnReservationRegistOfClinic)) return false;
        UnReservationRegistOfClinic other = (UnReservationRegistOfClinic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.REGIST_ID==null && other.getREGIST_ID()==null) || 
             (this.REGIST_ID!=null &&
              this.REGIST_ID.equals(other.getREGIST_ID()))) &&
            ((this.SCHEDULE_ID==null && other.getSCHEDULE_ID()==null) || 
             (this.SCHEDULE_ID!=null &&
              this.SCHEDULE_ID.equals(other.getSCHEDULE_ID()))) &&
            ((this.TIME_ID==null && other.getTIME_ID()==null) || 
             (this.TIME_ID!=null &&
              this.TIME_ID.equals(other.getTIME_ID())));
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
        if (getREGIST_ID() != null) {
            _hashCode += getREGIST_ID().hashCode();
        }
        if (getSCHEDULE_ID() != null) {
            _hashCode += getSCHEDULE_ID().hashCode();
        }
        if (getTIME_ID() != null) {
            _hashCode += getTIME_ID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnReservationRegistOfClinic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UnReservationRegistOfClinic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGIST_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "REGIST_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCHEDULE_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SCHEDULE_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIME_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TIME_ID"));
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
