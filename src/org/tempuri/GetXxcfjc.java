/**
 * GetXxcfjc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetXxcfjc  implements java.io.Serializable {
    private java.lang.String brid;

    private java.lang.String dateBegin;

    private java.lang.String dateOver;

    private java.lang.String ysdm;

    public GetXxcfjc() {
    }

    public GetXxcfjc(
           java.lang.String brid,
           java.lang.String dateBegin,
           java.lang.String dateOver,
           java.lang.String ysdm) {
           this.brid = brid;
           this.dateBegin = dateBegin;
           this.dateOver = dateOver;
           this.ysdm = ysdm;
    }


    /**
     * Gets the brid value for this GetXxcfjc.
     * 
     * @return brid
     */
    public java.lang.String getBrid() {
        return brid;
    }


    /**
     * Sets the brid value for this GetXxcfjc.
     * 
     * @param brid
     */
    public void setBrid(java.lang.String brid) {
        this.brid = brid;
    }


    /**
     * Gets the dateBegin value for this GetXxcfjc.
     * 
     * @return dateBegin
     */
    public java.lang.String getDateBegin() {
        return dateBegin;
    }


    /**
     * Sets the dateBegin value for this GetXxcfjc.
     * 
     * @param dateBegin
     */
    public void setDateBegin(java.lang.String dateBegin) {
        this.dateBegin = dateBegin;
    }


    /**
     * Gets the dateOver value for this GetXxcfjc.
     * 
     * @return dateOver
     */
    public java.lang.String getDateOver() {
        return dateOver;
    }


    /**
     * Sets the dateOver value for this GetXxcfjc.
     * 
     * @param dateOver
     */
    public void setDateOver(java.lang.String dateOver) {
        this.dateOver = dateOver;
    }


    /**
     * Gets the ysdm value for this GetXxcfjc.
     * 
     * @return ysdm
     */
    public java.lang.String getYsdm() {
        return ysdm;
    }


    /**
     * Sets the ysdm value for this GetXxcfjc.
     * 
     * @param ysdm
     */
    public void setYsdm(java.lang.String ysdm) {
        this.ysdm = ysdm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetXxcfjc)) return false;
        GetXxcfjc other = (GetXxcfjc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.brid==null && other.getBrid()==null) || 
             (this.brid!=null &&
              this.brid.equals(other.getBrid()))) &&
            ((this.dateBegin==null && other.getDateBegin()==null) || 
             (this.dateBegin!=null &&
              this.dateBegin.equals(other.getDateBegin()))) &&
            ((this.dateOver==null && other.getDateOver()==null) || 
             (this.dateOver!=null &&
              this.dateOver.equals(other.getDateOver()))) &&
            ((this.ysdm==null && other.getYsdm()==null) || 
             (this.ysdm!=null &&
              this.ysdm.equals(other.getYsdm())));
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
        if (getBrid() != null) {
            _hashCode += getBrid().hashCode();
        }
        if (getDateBegin() != null) {
            _hashCode += getDateBegin().hashCode();
        }
        if (getDateOver() != null) {
            _hashCode += getDateOver().hashCode();
        }
        if (getYsdm() != null) {
            _hashCode += getYsdm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetXxcfjc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetXxcfjc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "brid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateBegin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dateBegin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOver");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dateOver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ysdm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ysdm"));
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
