/**
 * UpdateYjZtMx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateYjZtMx  implements java.io.Serializable {
    private org.tempuri.UpdateYjZtMxDt dt;

    public UpdateYjZtMx() {
    }

    public UpdateYjZtMx(
           org.tempuri.UpdateYjZtMxDt dt) {
           this.dt = dt;
    }


    /**
     * Gets the dt value for this UpdateYjZtMx.
     * 
     * @return dt
     */
    public org.tempuri.UpdateYjZtMxDt getDt() {
        return dt;
    }


    /**
     * Sets the dt value for this UpdateYjZtMx.
     * 
     * @param dt
     */
    public void setDt(org.tempuri.UpdateYjZtMxDt dt) {
        this.dt = dt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateYjZtMx)) return false;
        UpdateYjZtMx other = (UpdateYjZtMx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dt==null && other.getDt()==null) || 
             (this.dt!=null &&
              this.dt.equals(other.getDt())));
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
        if (getDt() != null) {
            _hashCode += getDt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateYjZtMx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateYjZtMx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>UpdateYjZtMx>dt"));
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
