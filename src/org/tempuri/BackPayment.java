/**
 * BackPayment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class BackPayment  implements java.io.Serializable {
    private java.lang.String FPHM;

    private java.lang.String CZGH;

    private java.lang.String as_zf_ybzh;

    private java.lang.String as_zf_dzlsh;

    private java.lang.String as_zdjbh;

    private java.lang.String mzlb;

    public BackPayment() {
    }

    public BackPayment(
           java.lang.String FPHM,
           java.lang.String CZGH,
           java.lang.String as_zf_ybzh,
           java.lang.String as_zf_dzlsh,
           java.lang.String as_zdjbh,
           java.lang.String mzlb) {
           this.FPHM = FPHM;
           this.CZGH = CZGH;
           this.as_zf_ybzh = as_zf_ybzh;
           this.as_zf_dzlsh = as_zf_dzlsh;
           this.as_zdjbh = as_zdjbh;
           this.mzlb = mzlb;
    }


    /**
     * Gets the FPHM value for this BackPayment.
     * 
     * @return FPHM
     */
    public java.lang.String getFPHM() {
        return FPHM;
    }


    /**
     * Sets the FPHM value for this BackPayment.
     * 
     * @param FPHM
     */
    public void setFPHM(java.lang.String FPHM) {
        this.FPHM = FPHM;
    }


    /**
     * Gets the CZGH value for this BackPayment.
     * 
     * @return CZGH
     */
    public java.lang.String getCZGH() {
        return CZGH;
    }


    /**
     * Sets the CZGH value for this BackPayment.
     * 
     * @param CZGH
     */
    public void setCZGH(java.lang.String CZGH) {
        this.CZGH = CZGH;
    }


    /**
     * Gets the as_zf_ybzh value for this BackPayment.
     * 
     * @return as_zf_ybzh
     */
    public java.lang.String getAs_zf_ybzh() {
        return as_zf_ybzh;
    }


    /**
     * Sets the as_zf_ybzh value for this BackPayment.
     * 
     * @param as_zf_ybzh
     */
    public void setAs_zf_ybzh(java.lang.String as_zf_ybzh) {
        this.as_zf_ybzh = as_zf_ybzh;
    }


    /**
     * Gets the as_zf_dzlsh value for this BackPayment.
     * 
     * @return as_zf_dzlsh
     */
    public java.lang.String getAs_zf_dzlsh() {
        return as_zf_dzlsh;
    }


    /**
     * Sets the as_zf_dzlsh value for this BackPayment.
     * 
     * @param as_zf_dzlsh
     */
    public void setAs_zf_dzlsh(java.lang.String as_zf_dzlsh) {
        this.as_zf_dzlsh = as_zf_dzlsh;
    }


    /**
     * Gets the as_zdjbh value for this BackPayment.
     * 
     * @return as_zdjbh
     */
    public java.lang.String getAs_zdjbh() {
        return as_zdjbh;
    }


    /**
     * Sets the as_zdjbh value for this BackPayment.
     * 
     * @param as_zdjbh
     */
    public void setAs_zdjbh(java.lang.String as_zdjbh) {
        this.as_zdjbh = as_zdjbh;
    }


    /**
     * Gets the mzlb value for this BackPayment.
     * 
     * @return mzlb
     */
    public java.lang.String getMzlb() {
        return mzlb;
    }


    /**
     * Sets the mzlb value for this BackPayment.
     * 
     * @param mzlb
     */
    public void setMzlb(java.lang.String mzlb) {
        this.mzlb = mzlb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BackPayment)) return false;
        BackPayment other = (BackPayment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.FPHM==null && other.getFPHM()==null) || 
             (this.FPHM!=null &&
              this.FPHM.equals(other.getFPHM()))) &&
            ((this.CZGH==null && other.getCZGH()==null) || 
             (this.CZGH!=null &&
              this.CZGH.equals(other.getCZGH()))) &&
            ((this.as_zf_ybzh==null && other.getAs_zf_ybzh()==null) || 
             (this.as_zf_ybzh!=null &&
              this.as_zf_ybzh.equals(other.getAs_zf_ybzh()))) &&
            ((this.as_zf_dzlsh==null && other.getAs_zf_dzlsh()==null) || 
             (this.as_zf_dzlsh!=null &&
              this.as_zf_dzlsh.equals(other.getAs_zf_dzlsh()))) &&
            ((this.as_zdjbh==null && other.getAs_zdjbh()==null) || 
             (this.as_zdjbh!=null &&
              this.as_zdjbh.equals(other.getAs_zdjbh()))) &&
            ((this.mzlb==null && other.getMzlb()==null) || 
             (this.mzlb!=null &&
              this.mzlb.equals(other.getMzlb())));
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
        if (getFPHM() != null) {
            _hashCode += getFPHM().hashCode();
        }
        if (getCZGH() != null) {
            _hashCode += getCZGH().hashCode();
        }
        if (getAs_zf_ybzh() != null) {
            _hashCode += getAs_zf_ybzh().hashCode();
        }
        if (getAs_zf_dzlsh() != null) {
            _hashCode += getAs_zf_dzlsh().hashCode();
        }
        if (getAs_zdjbh() != null) {
            _hashCode += getAs_zdjbh().hashCode();
        }
        if (getMzlb() != null) {
            _hashCode += getMzlb().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BackPayment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">BackPayment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FPHM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FPHM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CZGH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CZGH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_zf_ybzh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_zf_ybzh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_zf_dzlsh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_zf_dzlsh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_zdjbh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_zdjbh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mzlb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "mzlb"));
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
