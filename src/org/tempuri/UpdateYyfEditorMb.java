/**
 * UpdateYyfEditorMb.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateYyfEditorMb  implements java.io.Serializable {
    private java.lang.String mbid;

    private java.lang.String mbmc;

    private java.lang.String ywy;

    private java.lang.String mbxml;

    private java.lang.String version;

    private java.lang.String ksdm;

    public UpdateYyfEditorMb() {
    }

    public UpdateYyfEditorMb(
           java.lang.String mbid,
           java.lang.String mbmc,
           java.lang.String ywy,
           java.lang.String mbxml,
           java.lang.String version,
           java.lang.String ksdm) {
           this.mbid = mbid;
           this.mbmc = mbmc;
           this.ywy = ywy;
           this.mbxml = mbxml;
           this.version = version;
           this.ksdm = ksdm;
    }


    /**
     * Gets the mbid value for this UpdateYyfEditorMb.
     * 
     * @return mbid
     */
    public java.lang.String getMbid() {
        return mbid;
    }


    /**
     * Sets the mbid value for this UpdateYyfEditorMb.
     * 
     * @param mbid
     */
    public void setMbid(java.lang.String mbid) {
        this.mbid = mbid;
    }


    /**
     * Gets the mbmc value for this UpdateYyfEditorMb.
     * 
     * @return mbmc
     */
    public java.lang.String getMbmc() {
        return mbmc;
    }


    /**
     * Sets the mbmc value for this UpdateYyfEditorMb.
     * 
     * @param mbmc
     */
    public void setMbmc(java.lang.String mbmc) {
        this.mbmc = mbmc;
    }


    /**
     * Gets the ywy value for this UpdateYyfEditorMb.
     * 
     * @return ywy
     */
    public java.lang.String getYwy() {
        return ywy;
    }


    /**
     * Sets the ywy value for this UpdateYyfEditorMb.
     * 
     * @param ywy
     */
    public void setYwy(java.lang.String ywy) {
        this.ywy = ywy;
    }


    /**
     * Gets the mbxml value for this UpdateYyfEditorMb.
     * 
     * @return mbxml
     */
    public java.lang.String getMbxml() {
        return mbxml;
    }


    /**
     * Sets the mbxml value for this UpdateYyfEditorMb.
     * 
     * @param mbxml
     */
    public void setMbxml(java.lang.String mbxml) {
        this.mbxml = mbxml;
    }


    /**
     * Gets the version value for this UpdateYyfEditorMb.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this UpdateYyfEditorMb.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the ksdm value for this UpdateYyfEditorMb.
     * 
     * @return ksdm
     */
    public java.lang.String getKsdm() {
        return ksdm;
    }


    /**
     * Sets the ksdm value for this UpdateYyfEditorMb.
     * 
     * @param ksdm
     */
    public void setKsdm(java.lang.String ksdm) {
        this.ksdm = ksdm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateYyfEditorMb)) return false;
        UpdateYyfEditorMb other = (UpdateYyfEditorMb) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mbid==null && other.getMbid()==null) || 
             (this.mbid!=null &&
              this.mbid.equals(other.getMbid()))) &&
            ((this.mbmc==null && other.getMbmc()==null) || 
             (this.mbmc!=null &&
              this.mbmc.equals(other.getMbmc()))) &&
            ((this.ywy==null && other.getYwy()==null) || 
             (this.ywy!=null &&
              this.ywy.equals(other.getYwy()))) &&
            ((this.mbxml==null && other.getMbxml()==null) || 
             (this.mbxml!=null &&
              this.mbxml.equals(other.getMbxml()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.ksdm==null && other.getKsdm()==null) || 
             (this.ksdm!=null &&
              this.ksdm.equals(other.getKsdm())));
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
        if (getMbid() != null) {
            _hashCode += getMbid().hashCode();
        }
        if (getMbmc() != null) {
            _hashCode += getMbmc().hashCode();
        }
        if (getYwy() != null) {
            _hashCode += getYwy().hashCode();
        }
        if (getMbxml() != null) {
            _hashCode += getMbxml().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getKsdm() != null) {
            _hashCode += getKsdm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateYyfEditorMb.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateYyfEditorMb"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mbid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "mbid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mbmc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "mbmc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ywy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ywy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mbxml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "mbxml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ksdm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ksdm"));
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
