/**
 * QrJywjz.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class QrJywjz  implements java.io.Serializable {
    private org.tempuri.QrJywjzDt dt;

    private java.lang.String ysxm;

    private java.lang.String ksdm;

    private java.lang.String ksmc;

    private java.lang.String ysgh;

    public QrJywjz() {
    }

    public QrJywjz(
           org.tempuri.QrJywjzDt dt,
           java.lang.String ysxm,
           java.lang.String ksdm,
           java.lang.String ksmc,
           java.lang.String ysgh) {
           this.dt = dt;
           this.ysxm = ysxm;
           this.ksdm = ksdm;
           this.ksmc = ksmc;
           this.ysgh = ysgh;
    }


    /**
     * Gets the dt value for this QrJywjz.
     * 
     * @return dt
     */
    public org.tempuri.QrJywjzDt getDt() {
        return dt;
    }


    /**
     * Sets the dt value for this QrJywjz.
     * 
     * @param dt
     */
    public void setDt(org.tempuri.QrJywjzDt dt) {
        this.dt = dt;
    }


    /**
     * Gets the ysxm value for this QrJywjz.
     * 
     * @return ysxm
     */
    public java.lang.String getYsxm() {
        return ysxm;
    }


    /**
     * Sets the ysxm value for this QrJywjz.
     * 
     * @param ysxm
     */
    public void setYsxm(java.lang.String ysxm) {
        this.ysxm = ysxm;
    }


    /**
     * Gets the ksdm value for this QrJywjz.
     * 
     * @return ksdm
     */
    public java.lang.String getKsdm() {
        return ksdm;
    }


    /**
     * Sets the ksdm value for this QrJywjz.
     * 
     * @param ksdm
     */
    public void setKsdm(java.lang.String ksdm) {
        this.ksdm = ksdm;
    }


    /**
     * Gets the ksmc value for this QrJywjz.
     * 
     * @return ksmc
     */
    public java.lang.String getKsmc() {
        return ksmc;
    }


    /**
     * Sets the ksmc value for this QrJywjz.
     * 
     * @param ksmc
     */
    public void setKsmc(java.lang.String ksmc) {
        this.ksmc = ksmc;
    }


    /**
     * Gets the ysgh value for this QrJywjz.
     * 
     * @return ysgh
     */
    public java.lang.String getYsgh() {
        return ysgh;
    }


    /**
     * Sets the ysgh value for this QrJywjz.
     * 
     * @param ysgh
     */
    public void setYsgh(java.lang.String ysgh) {
        this.ysgh = ysgh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QrJywjz)) return false;
        QrJywjz other = (QrJywjz) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dt==null && other.getDt()==null) || 
             (this.dt!=null &&
              this.dt.equals(other.getDt()))) &&
            ((this.ysxm==null && other.getYsxm()==null) || 
             (this.ysxm!=null &&
              this.ysxm.equals(other.getYsxm()))) &&
            ((this.ksdm==null && other.getKsdm()==null) || 
             (this.ksdm!=null &&
              this.ksdm.equals(other.getKsdm()))) &&
            ((this.ksmc==null && other.getKsmc()==null) || 
             (this.ksmc!=null &&
              this.ksmc.equals(other.getKsmc()))) &&
            ((this.ysgh==null && other.getYsgh()==null) || 
             (this.ysgh!=null &&
              this.ysgh.equals(other.getYsgh())));
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
        if (getDt() != null) {
            _hashCode += getDt().hashCode();
        }
        if (getYsxm() != null) {
            _hashCode += getYsxm().hashCode();
        }
        if (getKsdm() != null) {
            _hashCode += getKsdm().hashCode();
        }
        if (getKsmc() != null) {
            _hashCode += getKsmc().hashCode();
        }
        if (getYsgh() != null) {
            _hashCode += getYsgh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QrJywjz.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">QrJywjz"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>QrJywjz>dt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ysxm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ysxm"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ksmc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ksmc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ysgh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ysgh"));
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
