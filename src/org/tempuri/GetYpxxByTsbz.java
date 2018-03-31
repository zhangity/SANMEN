/**
 * GetYpxxByTsbz.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYpxxByTsbz  implements java.io.Serializable {
    private java.lang.String pym;

    private java.lang.String yfsb;

    private java.lang.String cflx;

    private int count;

    private java.lang.String tsbzs;

    public GetYpxxByTsbz() {
    }

    public GetYpxxByTsbz(
           java.lang.String pym,
           java.lang.String yfsb,
           java.lang.String cflx,
           int count,
           java.lang.String tsbzs) {
           this.pym = pym;
           this.yfsb = yfsb;
           this.cflx = cflx;
           this.count = count;
           this.tsbzs = tsbzs;
    }


    /**
     * Gets the pym value for this GetYpxxByTsbz.
     * 
     * @return pym
     */
    public java.lang.String getPym() {
        return pym;
    }


    /**
     * Sets the pym value for this GetYpxxByTsbz.
     * 
     * @param pym
     */
    public void setPym(java.lang.String pym) {
        this.pym = pym;
    }


    /**
     * Gets the yfsb value for this GetYpxxByTsbz.
     * 
     * @return yfsb
     */
    public java.lang.String getYfsb() {
        return yfsb;
    }


    /**
     * Sets the yfsb value for this GetYpxxByTsbz.
     * 
     * @param yfsb
     */
    public void setYfsb(java.lang.String yfsb) {
        this.yfsb = yfsb;
    }


    /**
     * Gets the cflx value for this GetYpxxByTsbz.
     * 
     * @return cflx
     */
    public java.lang.String getCflx() {
        return cflx;
    }


    /**
     * Sets the cflx value for this GetYpxxByTsbz.
     * 
     * @param cflx
     */
    public void setCflx(java.lang.String cflx) {
        this.cflx = cflx;
    }


    /**
     * Gets the count value for this GetYpxxByTsbz.
     * 
     * @return count
     */
    public int getCount() {
        return count;
    }


    /**
     * Sets the count value for this GetYpxxByTsbz.
     * 
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }


    /**
     * Gets the tsbzs value for this GetYpxxByTsbz.
     * 
     * @return tsbzs
     */
    public java.lang.String getTsbzs() {
        return tsbzs;
    }


    /**
     * Sets the tsbzs value for this GetYpxxByTsbz.
     * 
     * @param tsbzs
     */
    public void setTsbzs(java.lang.String tsbzs) {
        this.tsbzs = tsbzs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYpxxByTsbz)) return false;
        GetYpxxByTsbz other = (GetYpxxByTsbz) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pym==null && other.getPym()==null) || 
             (this.pym!=null &&
              this.pym.equals(other.getPym()))) &&
            ((this.yfsb==null && other.getYfsb()==null) || 
             (this.yfsb!=null &&
              this.yfsb.equals(other.getYfsb()))) &&
            ((this.cflx==null && other.getCflx()==null) || 
             (this.cflx!=null &&
              this.cflx.equals(other.getCflx()))) &&
            this.count == other.getCount() &&
            ((this.tsbzs==null && other.getTsbzs()==null) || 
             (this.tsbzs!=null &&
              this.tsbzs.equals(other.getTsbzs())));
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
        if (getPym() != null) {
            _hashCode += getPym().hashCode();
        }
        if (getYfsb() != null) {
            _hashCode += getYfsb().hashCode();
        }
        if (getCflx() != null) {
            _hashCode += getCflx().hashCode();
        }
        _hashCode += getCount();
        if (getTsbzs() != null) {
            _hashCode += getTsbzs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYpxxByTsbz.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYpxxByTsbz"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pym");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "pym"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yfsb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "yfsb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cflx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "cflx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tsbzs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "tsbzs"));
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
