/**
 * GetNbZds.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetNbZds  implements java.io.Serializable {
    private java.lang.String zd;

    private java.lang.String NBYBBZ;

    private java.lang.String zyxy;

    public GetNbZds() {
    }

    public GetNbZds(
           java.lang.String zd,
           java.lang.String NBYBBZ,
           java.lang.String zyxy) {
           this.zd = zd;
           this.NBYBBZ = NBYBBZ;
           this.zyxy = zyxy;
    }


    /**
     * Gets the zd value for this GetNbZds.
     * 
     * @return zd
     */
    public java.lang.String getZd() {
        return zd;
    }


    /**
     * Sets the zd value for this GetNbZds.
     * 
     * @param zd
     */
    public void setZd(java.lang.String zd) {
        this.zd = zd;
    }


    /**
     * Gets the NBYBBZ value for this GetNbZds.
     * 
     * @return NBYBBZ
     */
    public java.lang.String getNBYBBZ() {
        return NBYBBZ;
    }


    /**
     * Sets the NBYBBZ value for this GetNbZds.
     * 
     * @param NBYBBZ
     */
    public void setNBYBBZ(java.lang.String NBYBBZ) {
        this.NBYBBZ = NBYBBZ;
    }


    /**
     * Gets the zyxy value for this GetNbZds.
     * 
     * @return zyxy
     */
    public java.lang.String getZyxy() {
        return zyxy;
    }


    /**
     * Sets the zyxy value for this GetNbZds.
     * 
     * @param zyxy
     */
    public void setZyxy(java.lang.String zyxy) {
        this.zyxy = zyxy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetNbZds)) return false;
        GetNbZds other = (GetNbZds) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.zd==null && other.getZd()==null) || 
             (this.zd!=null &&
              this.zd.equals(other.getZd()))) &&
            ((this.NBYBBZ==null && other.getNBYBBZ()==null) || 
             (this.NBYBBZ!=null &&
              this.NBYBBZ.equals(other.getNBYBBZ()))) &&
            ((this.zyxy==null && other.getZyxy()==null) || 
             (this.zyxy!=null &&
              this.zyxy.equals(other.getZyxy())));
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
        if (getZd() != null) {
            _hashCode += getZd().hashCode();
        }
        if (getNBYBBZ() != null) {
            _hashCode += getNBYBBZ().hashCode();
        }
        if (getZyxy() != null) {
            _hashCode += getZyxy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNbZds.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetNbZds"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Zd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NBYBBZ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NBYBBZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zyxy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "zyxy"));
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
