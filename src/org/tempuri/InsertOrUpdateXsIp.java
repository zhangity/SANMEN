/**
 * InsertOrUpdateXsIp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertOrUpdateXsIp  implements java.io.Serializable {
    private java.lang.String dnip;

    private java.lang.String xsip;

    private java.lang.String zsmc;

    private java.lang.String xsxh;

    private java.lang.String czlx;

    private java.lang.String fpip;

    public InsertOrUpdateXsIp() {
    }

    public InsertOrUpdateXsIp(
           java.lang.String dnip,
           java.lang.String xsip,
           java.lang.String zsmc,
           java.lang.String xsxh,
           java.lang.String czlx,
           java.lang.String fpip) {
           this.dnip = dnip;
           this.xsip = xsip;
           this.zsmc = zsmc;
           this.xsxh = xsxh;
           this.czlx = czlx;
           this.fpip = fpip;
    }


    /**
     * Gets the dnip value for this InsertOrUpdateXsIp.
     * 
     * @return dnip
     */
    public java.lang.String getDnip() {
        return dnip;
    }


    /**
     * Sets the dnip value for this InsertOrUpdateXsIp.
     * 
     * @param dnip
     */
    public void setDnip(java.lang.String dnip) {
        this.dnip = dnip;
    }


    /**
     * Gets the xsip value for this InsertOrUpdateXsIp.
     * 
     * @return xsip
     */
    public java.lang.String getXsip() {
        return xsip;
    }


    /**
     * Sets the xsip value for this InsertOrUpdateXsIp.
     * 
     * @param xsip
     */
    public void setXsip(java.lang.String xsip) {
        this.xsip = xsip;
    }


    /**
     * Gets the zsmc value for this InsertOrUpdateXsIp.
     * 
     * @return zsmc
     */
    public java.lang.String getZsmc() {
        return zsmc;
    }


    /**
     * Sets the zsmc value for this InsertOrUpdateXsIp.
     * 
     * @param zsmc
     */
    public void setZsmc(java.lang.String zsmc) {
        this.zsmc = zsmc;
    }


    /**
     * Gets the xsxh value for this InsertOrUpdateXsIp.
     * 
     * @return xsxh
     */
    public java.lang.String getXsxh() {
        return xsxh;
    }


    /**
     * Sets the xsxh value for this InsertOrUpdateXsIp.
     * 
     * @param xsxh
     */
    public void setXsxh(java.lang.String xsxh) {
        this.xsxh = xsxh;
    }


    /**
     * Gets the czlx value for this InsertOrUpdateXsIp.
     * 
     * @return czlx
     */
    public java.lang.String getCzlx() {
        return czlx;
    }


    /**
     * Sets the czlx value for this InsertOrUpdateXsIp.
     * 
     * @param czlx
     */
    public void setCzlx(java.lang.String czlx) {
        this.czlx = czlx;
    }


    /**
     * Gets the fpip value for this InsertOrUpdateXsIp.
     * 
     * @return fpip
     */
    public java.lang.String getFpip() {
        return fpip;
    }


    /**
     * Sets the fpip value for this InsertOrUpdateXsIp.
     * 
     * @param fpip
     */
    public void setFpip(java.lang.String fpip) {
        this.fpip = fpip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertOrUpdateXsIp)) return false;
        InsertOrUpdateXsIp other = (InsertOrUpdateXsIp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dnip==null && other.getDnip()==null) || 
             (this.dnip!=null &&
              this.dnip.equals(other.getDnip()))) &&
            ((this.xsip==null && other.getXsip()==null) || 
             (this.xsip!=null &&
              this.xsip.equals(other.getXsip()))) &&
            ((this.zsmc==null && other.getZsmc()==null) || 
             (this.zsmc!=null &&
              this.zsmc.equals(other.getZsmc()))) &&
            ((this.xsxh==null && other.getXsxh()==null) || 
             (this.xsxh!=null &&
              this.xsxh.equals(other.getXsxh()))) &&
            ((this.czlx==null && other.getCzlx()==null) || 
             (this.czlx!=null &&
              this.czlx.equals(other.getCzlx()))) &&
            ((this.fpip==null && other.getFpip()==null) || 
             (this.fpip!=null &&
              this.fpip.equals(other.getFpip())));
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
        if (getDnip() != null) {
            _hashCode += getDnip().hashCode();
        }
        if (getXsip() != null) {
            _hashCode += getXsip().hashCode();
        }
        if (getZsmc() != null) {
            _hashCode += getZsmc().hashCode();
        }
        if (getXsxh() != null) {
            _hashCode += getXsxh().hashCode();
        }
        if (getCzlx() != null) {
            _hashCode += getCzlx().hashCode();
        }
        if (getFpip() != null) {
            _hashCode += getFpip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertOrUpdateXsIp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertOrUpdateXsIp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dnip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xsip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "xsip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zsmc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "zsmc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xsxh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "xsxh"));
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
        elemField.setFieldName("fpip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fpip"));
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
