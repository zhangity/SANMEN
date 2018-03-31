/**
 * DelYGPJ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DelYGPJ  implements java.io.Serializable {
    private java.lang.String YGDM;

    private java.lang.String PJLX;

    private java.lang.String LYRQ;

    public DelYGPJ() {
    }

    public DelYGPJ(
           java.lang.String YGDM,
           java.lang.String PJLX,
           java.lang.String LYRQ) {
           this.YGDM = YGDM;
           this.PJLX = PJLX;
           this.LYRQ = LYRQ;
    }


    /**
     * Gets the YGDM value for this DelYGPJ.
     * 
     * @return YGDM
     */
    public java.lang.String getYGDM() {
        return YGDM;
    }


    /**
     * Sets the YGDM value for this DelYGPJ.
     * 
     * @param YGDM
     */
    public void setYGDM(java.lang.String YGDM) {
        this.YGDM = YGDM;
    }


    /**
     * Gets the PJLX value for this DelYGPJ.
     * 
     * @return PJLX
     */
    public java.lang.String getPJLX() {
        return PJLX;
    }


    /**
     * Sets the PJLX value for this DelYGPJ.
     * 
     * @param PJLX
     */
    public void setPJLX(java.lang.String PJLX) {
        this.PJLX = PJLX;
    }


    /**
     * Gets the LYRQ value for this DelYGPJ.
     * 
     * @return LYRQ
     */
    public java.lang.String getLYRQ() {
        return LYRQ;
    }


    /**
     * Sets the LYRQ value for this DelYGPJ.
     * 
     * @param LYRQ
     */
    public void setLYRQ(java.lang.String LYRQ) {
        this.LYRQ = LYRQ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelYGPJ)) return false;
        DelYGPJ other = (DelYGPJ) obj;
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
            ((this.PJLX==null && other.getPJLX()==null) || 
             (this.PJLX!=null &&
              this.PJLX.equals(other.getPJLX()))) &&
            ((this.LYRQ==null && other.getLYRQ()==null) || 
             (this.LYRQ!=null &&
              this.LYRQ.equals(other.getLYRQ())));
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
        if (getPJLX() != null) {
            _hashCode += getPJLX().hashCode();
        }
        if (getLYRQ() != null) {
            _hashCode += getLYRQ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DelYGPJ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DelYGPJ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YGDM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "YGDM"));
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
        elemField.setFieldName("LYRQ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LYRQ"));
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
