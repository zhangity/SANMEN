/**
 * GetPatientMasterbyID_NO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPatientMasterbyID_NO  implements java.io.Serializable {
    private java.lang.String ID_NO;

    private java.lang.String ID_TYPE;

    public GetPatientMasterbyID_NO() {
    }

    public GetPatientMasterbyID_NO(
           java.lang.String ID_NO,
           java.lang.String ID_TYPE) {
           this.ID_NO = ID_NO;
           this.ID_TYPE = ID_TYPE;
    }


    /**
     * Gets the ID_NO value for this GetPatientMasterbyID_NO.
     * 
     * @return ID_NO
     */
    public java.lang.String getID_NO() {
        return ID_NO;
    }


    /**
     * Sets the ID_NO value for this GetPatientMasterbyID_NO.
     * 
     * @param ID_NO
     */
    public void setID_NO(java.lang.String ID_NO) {
        this.ID_NO = ID_NO;
    }


    /**
     * Gets the ID_TYPE value for this GetPatientMasterbyID_NO.
     * 
     * @return ID_TYPE
     */
    public java.lang.String getID_TYPE() {
        return ID_TYPE;
    }


    /**
     * Sets the ID_TYPE value for this GetPatientMasterbyID_NO.
     * 
     * @param ID_TYPE
     */
    public void setID_TYPE(java.lang.String ID_TYPE) {
        this.ID_TYPE = ID_TYPE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPatientMasterbyID_NO)) return false;
        GetPatientMasterbyID_NO other = (GetPatientMasterbyID_NO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID_NO==null && other.getID_NO()==null) || 
             (this.ID_NO!=null &&
              this.ID_NO.equals(other.getID_NO()))) &&
            ((this.ID_TYPE==null && other.getID_TYPE()==null) || 
             (this.ID_TYPE!=null &&
              this.ID_TYPE.equals(other.getID_TYPE())));
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
        if (getID_NO() != null) {
            _hashCode += getID_NO().hashCode();
        }
        if (getID_TYPE() != null) {
            _hashCode += getID_TYPE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPatientMasterbyID_NO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPatientMasterbyID_NO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ID_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ID_TYPE"));
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
