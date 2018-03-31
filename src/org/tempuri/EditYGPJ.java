/**
 * EditYGPJ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class EditYGPJ  implements java.io.Serializable {
    private java.lang.String YGDM;

    private java.lang.String LYRQ;

    private java.lang.String PJLX;

    private java.lang.String QSHM;

    private java.lang.String ZZHM;

    private java.lang.String SYHM;

    public EditYGPJ() {
    }

    public EditYGPJ(
           java.lang.String YGDM,
           java.lang.String LYRQ,
           java.lang.String PJLX,
           java.lang.String QSHM,
           java.lang.String ZZHM,
           java.lang.String SYHM) {
           this.YGDM = YGDM;
           this.LYRQ = LYRQ;
           this.PJLX = PJLX;
           this.QSHM = QSHM;
           this.ZZHM = ZZHM;
           this.SYHM = SYHM;
    }


    /**
     * Gets the YGDM value for this EditYGPJ.
     * 
     * @return YGDM
     */
    public java.lang.String getYGDM() {
        return YGDM;
    }


    /**
     * Sets the YGDM value for this EditYGPJ.
     * 
     * @param YGDM
     */
    public void setYGDM(java.lang.String YGDM) {
        this.YGDM = YGDM;
    }


    /**
     * Gets the LYRQ value for this EditYGPJ.
     * 
     * @return LYRQ
     */
    public java.lang.String getLYRQ() {
        return LYRQ;
    }


    /**
     * Sets the LYRQ value for this EditYGPJ.
     * 
     * @param LYRQ
     */
    public void setLYRQ(java.lang.String LYRQ) {
        this.LYRQ = LYRQ;
    }


    /**
     * Gets the PJLX value for this EditYGPJ.
     * 
     * @return PJLX
     */
    public java.lang.String getPJLX() {
        return PJLX;
    }


    /**
     * Sets the PJLX value for this EditYGPJ.
     * 
     * @param PJLX
     */
    public void setPJLX(java.lang.String PJLX) {
        this.PJLX = PJLX;
    }


    /**
     * Gets the QSHM value for this EditYGPJ.
     * 
     * @return QSHM
     */
    public java.lang.String getQSHM() {
        return QSHM;
    }


    /**
     * Sets the QSHM value for this EditYGPJ.
     * 
     * @param QSHM
     */
    public void setQSHM(java.lang.String QSHM) {
        this.QSHM = QSHM;
    }


    /**
     * Gets the ZZHM value for this EditYGPJ.
     * 
     * @return ZZHM
     */
    public java.lang.String getZZHM() {
        return ZZHM;
    }


    /**
     * Sets the ZZHM value for this EditYGPJ.
     * 
     * @param ZZHM
     */
    public void setZZHM(java.lang.String ZZHM) {
        this.ZZHM = ZZHM;
    }


    /**
     * Gets the SYHM value for this EditYGPJ.
     * 
     * @return SYHM
     */
    public java.lang.String getSYHM() {
        return SYHM;
    }


    /**
     * Sets the SYHM value for this EditYGPJ.
     * 
     * @param SYHM
     */
    public void setSYHM(java.lang.String SYHM) {
        this.SYHM = SYHM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EditYGPJ)) return false;
        EditYGPJ other = (EditYGPJ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.YGDM==null && other.getYGDM()==null) || 
             (this.YGDM!=null &&
              this.YGDM.equals(other.getYGDM()))) &&
            ((this.LYRQ==null && other.getLYRQ()==null) || 
             (this.LYRQ!=null &&
              this.LYRQ.equals(other.getLYRQ()))) &&
            ((this.PJLX==null && other.getPJLX()==null) || 
             (this.PJLX!=null &&
              this.PJLX.equals(other.getPJLX()))) &&
            ((this.QSHM==null && other.getQSHM()==null) || 
             (this.QSHM!=null &&
              this.QSHM.equals(other.getQSHM()))) &&
            ((this.ZZHM==null && other.getZZHM()==null) || 
             (this.ZZHM!=null &&
              this.ZZHM.equals(other.getZZHM()))) &&
            ((this.SYHM==null && other.getSYHM()==null) || 
             (this.SYHM!=null &&
              this.SYHM.equals(other.getSYHM())));
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
        if (getYGDM() != null) {
            _hashCode += getYGDM().hashCode();
        }
        if (getLYRQ() != null) {
            _hashCode += getLYRQ().hashCode();
        }
        if (getPJLX() != null) {
            _hashCode += getPJLX().hashCode();
        }
        if (getQSHM() != null) {
            _hashCode += getQSHM().hashCode();
        }
        if (getZZHM() != null) {
            _hashCode += getZZHM().hashCode();
        }
        if (getSYHM() != null) {
            _hashCode += getSYHM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EditYGPJ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">EditYGPJ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YGDM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "YGDM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LYRQ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LYRQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PJLX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PJLX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QSHM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "QSHM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZZHM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZZHM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SYHM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SYHM"));
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
