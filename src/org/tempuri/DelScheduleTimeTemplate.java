/**
 * DelScheduleTimeTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DelScheduleTimeTemplate  implements java.io.Serializable {
    private java.lang.String[] defineS;

    public DelScheduleTimeTemplate() {
    }

    public DelScheduleTimeTemplate(
           java.lang.String[] defineS) {
           this.defineS = defineS;
    }


    /**
     * Gets the defineS value for this DelScheduleTimeTemplate.
     * 
     * @return defineS
     */
    public java.lang.String[] getDefineS() {
        return defineS;
    }


    /**
     * Sets the defineS value for this DelScheduleTimeTemplate.
     * 
     * @param defineS
     */
    public void setDefineS(java.lang.String[] defineS) {
        this.defineS = defineS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelScheduleTimeTemplate)) return false;
        DelScheduleTimeTemplate other = (DelScheduleTimeTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.defineS==null && other.getDefineS()==null) || 
             (this.defineS!=null &&
              java.util.Arrays.equals(this.defineS, other.getDefineS())));
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
        if (getDefineS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefineS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefineS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DelScheduleTimeTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DelScheduleTimeTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defineS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "defineS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
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
