/**
 * EditKSGRCYXM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class EditKSGRCYXM  implements java.io.Serializable {
    private java.lang.String KSDM;

    private java.lang.String SSDM;

    private org.tempuri.EditKSGRCYXMDs ds;

    public EditKSGRCYXM() {
    }

    public EditKSGRCYXM(
           java.lang.String KSDM,
           java.lang.String SSDM,
           org.tempuri.EditKSGRCYXMDs ds) {
           this.KSDM = KSDM;
           this.SSDM = SSDM;
           this.ds = ds;
    }


    /**
     * Gets the KSDM value for this EditKSGRCYXM.
     * 
     * @return KSDM
     */
    public java.lang.String getKSDM() {
        return KSDM;
    }


    /**
     * Sets the KSDM value for this EditKSGRCYXM.
     * 
     * @param KSDM
     */
    public void setKSDM(java.lang.String KSDM) {
        this.KSDM = KSDM;
    }


    /**
     * Gets the SSDM value for this EditKSGRCYXM.
     * 
     * @return SSDM
     */
    public java.lang.String getSSDM() {
        return SSDM;
    }


    /**
     * Sets the SSDM value for this EditKSGRCYXM.
     * 
     * @param SSDM
     */
    public void setSSDM(java.lang.String SSDM) {
        this.SSDM = SSDM;
    }


    /**
     * Gets the ds value for this EditKSGRCYXM.
     * 
     * @return ds
     */
    public org.tempuri.EditKSGRCYXMDs getDs() {
        return ds;
    }


    /**
     * Sets the ds value for this EditKSGRCYXM.
     * 
     * @param ds
     */
    public void setDs(org.tempuri.EditKSGRCYXMDs ds) {
        this.ds = ds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EditKSGRCYXM)) return false;
        EditKSGRCYXM other = (EditKSGRCYXM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.KSDM==null && other.getKSDM()==null) || 
             (this.KSDM!=null &&
              this.KSDM.equals(other.getKSDM()))) &&
            ((this.SSDM==null && other.getSSDM()==null) || 
             (this.SSDM!=null &&
              this.SSDM.equals(other.getSSDM()))) &&
            ((this.ds==null && other.getDs()==null) || 
             (this.ds!=null &&
              this.ds.equals(other.getDs())));
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
        if (getKSDM() != null) {
            _hashCode += getKSDM().hashCode();
        }
        if (getSSDM() != null) {
            _hashCode += getSSDM().hashCode();
        }
        if (getDs() != null) {
            _hashCode += getDs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EditKSGRCYXM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">EditKSGRCYXM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KSDM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "KSDM"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>EditKSGRCYXM>ds"));
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
