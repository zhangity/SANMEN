/**
 * GetEditScheduleCheckForReservationDataTable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetEditScheduleCheckForReservationDataTable  implements java.io.Serializable {
    private java.lang.String SCHEDULE_ID;

    public GetEditScheduleCheckForReservationDataTable() {
    }

    public GetEditScheduleCheckForReservationDataTable(
           java.lang.String SCHEDULE_ID) {
           this.SCHEDULE_ID = SCHEDULE_ID;
    }


    /**
     * Gets the SCHEDULE_ID value for this GetEditScheduleCheckForReservationDataTable.
     * 
     * @return SCHEDULE_ID
     */
    public java.lang.String getSCHEDULE_ID() {
        return SCHEDULE_ID;
    }


    /**
     * Sets the SCHEDULE_ID value for this GetEditScheduleCheckForReservationDataTable.
     * 
     * @param SCHEDULE_ID
     */
    public void setSCHEDULE_ID(java.lang.String SCHEDULE_ID) {
        this.SCHEDULE_ID = SCHEDULE_ID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEditScheduleCheckForReservationDataTable)) return false;
        GetEditScheduleCheckForReservationDataTable other = (GetEditScheduleCheckForReservationDataTable) obj;
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
              this.SCHEDULE_ID.equals(other.getSCHEDULE_ID())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEditScheduleCheckForReservationDataTable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetEditScheduleCheckForReservationDataTable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCHEDULE_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SCHEDULE_ID"));
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
