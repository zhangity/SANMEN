/**
 * GetScheduleTimeTemplateByDefineId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetScheduleTimeTemplateByDefineId  implements java.io.Serializable {
    private java.lang.String defineid;

    public GetScheduleTimeTemplateByDefineId() {
    }

    public GetScheduleTimeTemplateByDefineId(
           java.lang.String defineid) {
           this.defineid = defineid;
    }


    /**
     * Gets the defineid value for this GetScheduleTimeTemplateByDefineId.
     * 
     * @return defineid
     */
    public java.lang.String getDefineid() {
        return defineid;
    }


    /**
     * Sets the defineid value for this GetScheduleTimeTemplateByDefineId.
     * 
     * @param defineid
     */
    public void setDefineid(java.lang.String defineid) {
        this.defineid = defineid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetScheduleTimeTemplateByDefineId)) return false;
        GetScheduleTimeTemplateByDefineId other = (GetScheduleTimeTemplateByDefineId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.defineid==null && other.getDefineid()==null) || 
             (this.defineid!=null &&
              this.defineid.equals(other.getDefineid())));
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
        if (getDefineid() != null) {
            _hashCode += getDefineid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetScheduleTimeTemplateByDefineId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetScheduleTimeTemplateByDefineId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defineid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "defineid"));
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
