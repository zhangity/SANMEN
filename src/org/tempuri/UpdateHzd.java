/**
 * UpdateHzd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateHzd  implements java.io.Serializable {
    private org.tempuri.PatientHzdClass hzd;

    public UpdateHzd() {
    }

    public UpdateHzd(
           org.tempuri.PatientHzdClass hzd) {
           this.hzd = hzd;
    }


    /**
     * Gets the hzd value for this UpdateHzd.
     * 
     * @return hzd
     */
    public org.tempuri.PatientHzdClass getHzd() {
        return hzd;
    }


    /**
     * Sets the hzd value for this UpdateHzd.
     * 
     * @param hzd
     */
    public void setHzd(org.tempuri.PatientHzdClass hzd) {
        this.hzd = hzd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateHzd)) return false;
        UpdateHzd other = (UpdateHzd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hzd==null && other.getHzd()==null) || 
             (this.hzd!=null &&
              this.hzd.equals(other.getHzd())));
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
        if (getHzd() != null) {
            _hashCode += getHzd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateHzd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateHzd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hzd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "hzd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "PatientHzdClass"));
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
