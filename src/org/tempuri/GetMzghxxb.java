/**
 * GetMzghxxb.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzghxxb  implements java.io.Serializable {
    private java.lang.String dateBegin;

    private java.lang.String dateOver;

    private java.lang.String ghy;

    private java.lang.String jzhm;

    private java.lang.String ghks;

    private java.lang.String mzhm;

    private java.lang.String brxm;

    private java.lang.String czlx;

    private java.lang.String REGIST_STATUS;

    public GetMzghxxb() {
    }

    public GetMzghxxb(
           java.lang.String dateBegin,
           java.lang.String dateOver,
           java.lang.String ghy,
           java.lang.String jzhm,
           java.lang.String ghks,
           java.lang.String mzhm,
           java.lang.String brxm,
           java.lang.String czlx,
           java.lang.String REGIST_STATUS) {
           this.dateBegin = dateBegin;
           this.dateOver = dateOver;
           this.ghy = ghy;
           this.jzhm = jzhm;
           this.ghks = ghks;
           this.mzhm = mzhm;
           this.brxm = brxm;
           this.czlx = czlx;
           this.REGIST_STATUS = REGIST_STATUS;
    }


    /**
     * Gets the dateBegin value for this GetMzghxxb.
     * 
     * @return dateBegin
     */
    public java.lang.String getDateBegin() {
        return dateBegin;
    }


    /**
     * Sets the dateBegin value for this GetMzghxxb.
     * 
     * @param dateBegin
     */
    public void setDateBegin(java.lang.String dateBegin) {
        this.dateBegin = dateBegin;
    }


    /**
     * Gets the dateOver value for this GetMzghxxb.
     * 
     * @return dateOver
     */
    public java.lang.String getDateOver() {
        return dateOver;
    }


    /**
     * Sets the dateOver value for this GetMzghxxb.
     * 
     * @param dateOver
     */
    public void setDateOver(java.lang.String dateOver) {
        this.dateOver = dateOver;
    }


    /**
     * Gets the ghy value for this GetMzghxxb.
     * 
     * @return ghy
     */
    public java.lang.String getGhy() {
        return ghy;
    }


    /**
     * Sets the ghy value for this GetMzghxxb.
     * 
     * @param ghy
     */
    public void setGhy(java.lang.String ghy) {
        this.ghy = ghy;
    }


    /**
     * Gets the jzhm value for this GetMzghxxb.
     * 
     * @return jzhm
     */
    public java.lang.String getJzhm() {
        return jzhm;
    }


    /**
     * Sets the jzhm value for this GetMzghxxb.
     * 
     * @param jzhm
     */
    public void setJzhm(java.lang.String jzhm) {
        this.jzhm = jzhm;
    }


    /**
     * Gets the ghks value for this GetMzghxxb.
     * 
     * @return ghks
     */
    public java.lang.String getGhks() {
        return ghks;
    }


    /**
     * Sets the ghks value for this GetMzghxxb.
     * 
     * @param ghks
     */
    public void setGhks(java.lang.String ghks) {
        this.ghks = ghks;
    }


    /**
     * Gets the mzhm value for this GetMzghxxb.
     * 
     * @return mzhm
     */
    public java.lang.String getMzhm() {
        return mzhm;
    }


    /**
     * Sets the mzhm value for this GetMzghxxb.
     * 
     * @param mzhm
     */
    public void setMzhm(java.lang.String mzhm) {
        this.mzhm = mzhm;
    }


    /**
     * Gets the brxm value for this GetMzghxxb.
     * 
     * @return brxm
     */
    public java.lang.String getBrxm() {
        return brxm;
    }


    /**
     * Sets the brxm value for this GetMzghxxb.
     * 
     * @param brxm
     */
    public void setBrxm(java.lang.String brxm) {
        this.brxm = brxm;
    }


    /**
     * Gets the czlx value for this GetMzghxxb.
     * 
     * @return czlx
     */
    public java.lang.String getCzlx() {
        return czlx;
    }


    /**
     * Sets the czlx value for this GetMzghxxb.
     * 
     * @param czlx
     */
    public void setCzlx(java.lang.String czlx) {
        this.czlx = czlx;
    }


    /**
     * Gets the REGIST_STATUS value for this GetMzghxxb.
     * 
     * @return REGIST_STATUS
     */
    public java.lang.String getREGIST_STATUS() {
        return REGIST_STATUS;
    }


    /**
     * Sets the REGIST_STATUS value for this GetMzghxxb.
     * 
     * @param REGIST_STATUS
     */
    public void setREGIST_STATUS(java.lang.String REGIST_STATUS) {
        this.REGIST_STATUS = REGIST_STATUS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzghxxb)) return false;
        GetMzghxxb other = (GetMzghxxb) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateBegin==null && other.getDateBegin()==null) || 
             (this.dateBegin!=null &&
              this.dateBegin.equals(other.getDateBegin()))) &&
            ((this.dateOver==null && other.getDateOver()==null) || 
             (this.dateOver!=null &&
              this.dateOver.equals(other.getDateOver()))) &&
            ((this.ghy==null && other.getGhy()==null) || 
             (this.ghy!=null &&
              this.ghy.equals(other.getGhy()))) &&
            ((this.jzhm==null && other.getJzhm()==null) || 
             (this.jzhm!=null &&
              this.jzhm.equals(other.getJzhm()))) &&
            ((this.ghks==null && other.getGhks()==null) || 
             (this.ghks!=null &&
              this.ghks.equals(other.getGhks()))) &&
            ((this.mzhm==null && other.getMzhm()==null) || 
             (this.mzhm!=null &&
              this.mzhm.equals(other.getMzhm()))) &&
            ((this.brxm==null && other.getBrxm()==null) || 
             (this.brxm!=null &&
              this.brxm.equals(other.getBrxm()))) &&
            ((this.czlx==null && other.getCzlx()==null) || 
             (this.czlx!=null &&
              this.czlx.equals(other.getCzlx()))) &&
            ((this.REGIST_STATUS==null && other.getREGIST_STATUS()==null) || 
             (this.REGIST_STATUS!=null &&
              this.REGIST_STATUS.equals(other.getREGIST_STATUS())));
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
        if (getDateBegin() != null) {
            _hashCode += getDateBegin().hashCode();
        }
        if (getDateOver() != null) {
            _hashCode += getDateOver().hashCode();
        }
        if (getGhy() != null) {
            _hashCode += getGhy().hashCode();
        }
        if (getJzhm() != null) {
            _hashCode += getJzhm().hashCode();
        }
        if (getGhks() != null) {
            _hashCode += getGhks().hashCode();
        }
        if (getMzhm() != null) {
            _hashCode += getMzhm().hashCode();
        }
        if (getBrxm() != null) {
            _hashCode += getBrxm().hashCode();
        }
        if (getCzlx() != null) {
            _hashCode += getCzlx().hashCode();
        }
        if (getREGIST_STATUS() != null) {
            _hashCode += getREGIST_STATUS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzghxxb.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzghxxb"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("ghy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ghy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jzhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jzhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ghks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ghks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mzhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "mzhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brxm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "brxm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("czlx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "czlx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGIST_STATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "REGIST_STATUS"));
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
