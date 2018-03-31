/**
 * DelYBandYKTJL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DelYBandYKTJL  implements java.io.Serializable {
    private java.lang.String INSURANCE;

    private java.lang.String FPHM;

    private java.lang.String JZLX;

    public DelYBandYKTJL() {
    }

    public DelYBandYKTJL(
           java.lang.String INSURANCE,
           java.lang.String FPHM,
           java.lang.String JZLX) {
           this.INSURANCE = INSURANCE;
           this.FPHM = FPHM;
           this.JZLX = JZLX;
    }


    /**
     * Gets the INSURANCE value for this DelYBandYKTJL.
     * 
     * @return INSURANCE
     */
    public java.lang.String getINSURANCE() {
        return INSURANCE;
    }


    /**
     * Sets the INSURANCE value for this DelYBandYKTJL.
     * 
     * @param INSURANCE
     */
    public void setINSURANCE(java.lang.String INSURANCE) {
        this.INSURANCE = INSURANCE;
    }


    /**
     * Gets the FPHM value for this DelYBandYKTJL.
     * 
     * @return FPHM
     */
    public java.lang.String getFPHM() {
        return FPHM;
    }


    /**
     * Sets the FPHM value for this DelYBandYKTJL.
     * 
     * @param FPHM
     */
    public void setFPHM(java.lang.String FPHM) {
        this.FPHM = FPHM;
    }


    /**
     * Gets the JZLX value for this DelYBandYKTJL.
     * 
     * @return JZLX
     */
    public java.lang.String getJZLX() {
        return JZLX;
    }


    /**
     * Sets the JZLX value for this DelYBandYKTJL.
     * 
     * @param JZLX
     */
    public void setJZLX(java.lang.String JZLX) {
        this.JZLX = JZLX;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelYBandYKTJL)) return false;
        DelYBandYKTJL other = (DelYBandYKTJL) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INSURANCE==null && other.getINSURANCE()==null) || 
             (this.INSURANCE!=null &&
              this.INSURANCE.equals(other.getINSURANCE()))) &&
            ((this.FPHM==null && other.getFPHM()==null) || 
             (this.FPHM!=null &&
              this.FPHM.equals(other.getFPHM()))) &&
            ((this.JZLX==null && other.getJZLX()==null) || 
             (this.JZLX!=null &&
              this.JZLX.equals(other.getJZLX())));
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
        if (getINSURANCE() != null) {
            _hashCode += getINSURANCE().hashCode();
        }
        if (getFPHM() != null) {
            _hashCode += getFPHM().hashCode();
        }
        if (getJZLX() != null) {
            _hashCode += getJZLX().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DelYBandYKTJL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DelYBandYKTJL"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSURANCE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "INSURANCE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FPHM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FPHM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JZLX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "JZLX"));
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
