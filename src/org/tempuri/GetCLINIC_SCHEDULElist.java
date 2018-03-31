/**
 * GetCLINIC_SCHEDULElist.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCLINIC_SCHEDULElist  implements java.io.Serializable {
    private java.lang.String PBKSTime;

    private java.lang.String PBJSTime;

    private java.lang.String ks;

    private java.lang.String pblx;

    public GetCLINIC_SCHEDULElist() {
    }

    public GetCLINIC_SCHEDULElist(
           java.lang.String PBKSTime,
           java.lang.String PBJSTime,
           java.lang.String ks,
           java.lang.String pblx) {
           this.PBKSTime = PBKSTime;
           this.PBJSTime = PBJSTime;
           this.ks = ks;
           this.pblx = pblx;
    }


    /**
     * Gets the PBKSTime value for this GetCLINIC_SCHEDULElist.
     * 
     * @return PBKSTime
     */
    public java.lang.String getPBKSTime() {
        return PBKSTime;
    }


    /**
     * Sets the PBKSTime value for this GetCLINIC_SCHEDULElist.
     * 
     * @param PBKSTime
     */
    public void setPBKSTime(java.lang.String PBKSTime) {
        this.PBKSTime = PBKSTime;
    }


    /**
     * Gets the PBJSTime value for this GetCLINIC_SCHEDULElist.
     * 
     * @return PBJSTime
     */
    public java.lang.String getPBJSTime() {
        return PBJSTime;
    }


    /**
     * Sets the PBJSTime value for this GetCLINIC_SCHEDULElist.
     * 
     * @param PBJSTime
     */
    public void setPBJSTime(java.lang.String PBJSTime) {
        this.PBJSTime = PBJSTime;
    }


    /**
     * Gets the ks value for this GetCLINIC_SCHEDULElist.
     * 
     * @return ks
     */
    public java.lang.String getKs() {
        return ks;
    }


    /**
     * Sets the ks value for this GetCLINIC_SCHEDULElist.
     * 
     * @param ks
     */
    public void setKs(java.lang.String ks) {
        this.ks = ks;
    }


    /**
     * Gets the pblx value for this GetCLINIC_SCHEDULElist.
     * 
     * @return pblx
     */
    public java.lang.String getPblx() {
        return pblx;
    }


    /**
     * Sets the pblx value for this GetCLINIC_SCHEDULElist.
     * 
     * @param pblx
     */
    public void setPblx(java.lang.String pblx) {
        this.pblx = pblx;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCLINIC_SCHEDULElist)) return false;
        GetCLINIC_SCHEDULElist other = (GetCLINIC_SCHEDULElist) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PBKSTime==null && other.getPBKSTime()==null) || 
             (this.PBKSTime!=null &&
              this.PBKSTime.equals(other.getPBKSTime()))) &&
            ((this.PBJSTime==null && other.getPBJSTime()==null) || 
             (this.PBJSTime!=null &&
              this.PBJSTime.equals(other.getPBJSTime()))) &&
            ((this.ks==null && other.getKs()==null) || 
             (this.ks!=null &&
              this.ks.equals(other.getKs()))) &&
            ((this.pblx==null && other.getPblx()==null) || 
             (this.pblx!=null &&
              this.pblx.equals(other.getPblx())));
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
        if (getPBKSTime() != null) {
            _hashCode += getPBKSTime().hashCode();
        }
        if (getPBJSTime() != null) {
            _hashCode += getPBJSTime().hashCode();
        }
        if (getKs() != null) {
            _hashCode += getKs().hashCode();
        }
        if (getPblx() != null) {
            _hashCode += getPblx().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCLINIC_SCHEDULElist.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCLINIC_SCHEDULElist"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PBKSTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PBKSTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PBJSTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PBJSTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pblx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "pblx"));
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
