/**
 * GetZffpcfxmlb.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetZffpcfxmlb  implements java.io.Serializable {
    private java.lang.String lx;

    private java.lang.String hm;

    private java.lang.String FPHM;

    public GetZffpcfxmlb() {
    }

    public GetZffpcfxmlb(
           java.lang.String lx,
           java.lang.String hm,
           java.lang.String FPHM) {
           this.lx = lx;
           this.hm = hm;
           this.FPHM = FPHM;
    }


    /**
     * Gets the lx value for this GetZffpcfxmlb.
     * 
     * @return lx
     */
    public java.lang.String getLx() {
        return lx;
    }


    /**
     * Sets the lx value for this GetZffpcfxmlb.
     * 
     * @param lx
     */
    public void setLx(java.lang.String lx) {
        this.lx = lx;
    }


    /**
     * Gets the hm value for this GetZffpcfxmlb.
     * 
     * @return hm
     */
    public java.lang.String getHm() {
        return hm;
    }


    /**
     * Sets the hm value for this GetZffpcfxmlb.
     * 
     * @param hm
     */
    public void setHm(java.lang.String hm) {
        this.hm = hm;
    }


    /**
     * Gets the FPHM value for this GetZffpcfxmlb.
     * 
     * @return FPHM
     */
    public java.lang.String getFPHM() {
        return FPHM;
    }


    /**
     * Sets the FPHM value for this GetZffpcfxmlb.
     * 
     * @param FPHM
     */
    public void setFPHM(java.lang.String FPHM) {
        this.FPHM = FPHM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZffpcfxmlb)) return false;
        GetZffpcfxmlb other = (GetZffpcfxmlb) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lx==null && other.getLx()==null) || 
             (this.lx!=null &&
              this.lx.equals(other.getLx()))) &&
            ((this.hm==null && other.getHm()==null) || 
             (this.hm!=null &&
              this.hm.equals(other.getHm()))) &&
            ((this.FPHM==null && other.getFPHM()==null) || 
             (this.FPHM!=null &&
              this.FPHM.equals(other.getFPHM())));
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
        if (getLx() != null) {
            _hashCode += getLx().hashCode();
        }
        if (getHm() != null) {
            _hashCode += getHm().hashCode();
        }
        if (getFPHM() != null) {
            _hashCode += getFPHM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZffpcfxmlb.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetZffpcfxmlb"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "lx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "hm"));
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
