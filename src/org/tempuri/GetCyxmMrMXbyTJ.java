/**
 * GetCyxmMrMXbyTJ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCyxmMrMXbyTJ  implements java.io.Serializable {
    private java.lang.String gytjs;

    private java.lang.String SSDM;

    public GetCyxmMrMXbyTJ() {
    }

    public GetCyxmMrMXbyTJ(
           java.lang.String gytjs,
           java.lang.String SSDM) {
           this.gytjs = gytjs;
           this.SSDM = SSDM;
    }


    /**
     * Gets the gytjs value for this GetCyxmMrMXbyTJ.
     * 
     * @return gytjs
     */
    public java.lang.String getGytjs() {
        return gytjs;
    }


    /**
     * Sets the gytjs value for this GetCyxmMrMXbyTJ.
     * 
     * @param gytjs
     */
    public void setGytjs(java.lang.String gytjs) {
        this.gytjs = gytjs;
    }


    /**
     * Gets the SSDM value for this GetCyxmMrMXbyTJ.
     * 
     * @return SSDM
     */
    public java.lang.String getSSDM() {
        return SSDM;
    }


    /**
     * Sets the SSDM value for this GetCyxmMrMXbyTJ.
     * 
     * @param SSDM
     */
    public void setSSDM(java.lang.String SSDM) {
        this.SSDM = SSDM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCyxmMrMXbyTJ)) return false;
        GetCyxmMrMXbyTJ other = (GetCyxmMrMXbyTJ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gytjs==null && other.getGytjs()==null) || 
             (this.gytjs!=null &&
              this.gytjs.equals(other.getGytjs()))) &&
            ((this.SSDM==null && other.getSSDM()==null) || 
             (this.SSDM!=null &&
              this.SSDM.equals(other.getSSDM())));
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
        if (getGytjs() != null) {
            _hashCode += getGytjs().hashCode();
        }
        if (getSSDM() != null) {
            _hashCode += getSSDM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCyxmMrMXbyTJ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCyxmMrMXbyTJ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gytjs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gytjs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSDM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SSDM"));
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
