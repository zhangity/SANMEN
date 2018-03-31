/**
 * GetFpxx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetFpxx  implements java.io.Serializable {
    private java.lang.String dateBegin;

    private java.lang.String dateOver;

    private java.lang.String brxm;

    private java.lang.String sky;

    private java.lang.String fphm1;

    private java.lang.String fphm2;

    private java.lang.String INSURANCE_CODE;

    private java.lang.String ID_NO;

    private java.lang.String brid;

    public GetFpxx() {
    }

    public GetFpxx(
           java.lang.String dateBegin,
           java.lang.String dateOver,
           java.lang.String brxm,
           java.lang.String sky,
           java.lang.String fphm1,
           java.lang.String fphm2,
           java.lang.String INSURANCE_CODE,
           java.lang.String ID_NO,
           java.lang.String brid) {
           this.dateBegin = dateBegin;
           this.dateOver = dateOver;
           this.brxm = brxm;
           this.sky = sky;
           this.fphm1 = fphm1;
           this.fphm2 = fphm2;
           this.INSURANCE_CODE = INSURANCE_CODE;
           this.ID_NO = ID_NO;
           this.brid = brid;
    }


    /**
     * Gets the dateBegin value for this GetFpxx.
     * 
     * @return dateBegin
     */
    public java.lang.String getDateBegin() {
        return dateBegin;
    }


    /**
     * Sets the dateBegin value for this GetFpxx.
     * 
     * @param dateBegin
     */
    public void setDateBegin(java.lang.String dateBegin) {
        this.dateBegin = dateBegin;
    }


    /**
     * Gets the dateOver value for this GetFpxx.
     * 
     * @return dateOver
     */
    public java.lang.String getDateOver() {
        return dateOver;
    }


    /**
     * Sets the dateOver value for this GetFpxx.
     * 
     * @param dateOver
     */
    public void setDateOver(java.lang.String dateOver) {
        this.dateOver = dateOver;
    }


    /**
     * Gets the brxm value for this GetFpxx.
     * 
     * @return brxm
     */
    public java.lang.String getBrxm() {
        return brxm;
    }


    /**
     * Sets the brxm value for this GetFpxx.
     * 
     * @param brxm
     */
    public void setBrxm(java.lang.String brxm) {
        this.brxm = brxm;
    }


    /**
     * Gets the sky value for this GetFpxx.
     * 
     * @return sky
     */
    public java.lang.String getSky() {
        return sky;
    }


    /**
     * Sets the sky value for this GetFpxx.
     * 
     * @param sky
     */
    public void setSky(java.lang.String sky) {
        this.sky = sky;
    }


    /**
     * Gets the fphm1 value for this GetFpxx.
     * 
     * @return fphm1
     */
    public java.lang.String getFphm1() {
        return fphm1;
    }


    /**
     * Sets the fphm1 value for this GetFpxx.
     * 
     * @param fphm1
     */
    public void setFphm1(java.lang.String fphm1) {
        this.fphm1 = fphm1;
    }


    /**
     * Gets the fphm2 value for this GetFpxx.
     * 
     * @return fphm2
     */
    public java.lang.String getFphm2() {
        return fphm2;
    }


    /**
     * Sets the fphm2 value for this GetFpxx.
     * 
     * @param fphm2
     */
    public void setFphm2(java.lang.String fphm2) {
        this.fphm2 = fphm2;
    }


    /**
     * Gets the INSURANCE_CODE value for this GetFpxx.
     * 
     * @return INSURANCE_CODE
     */
    public java.lang.String getINSURANCE_CODE() {
        return INSURANCE_CODE;
    }


    /**
     * Sets the INSURANCE_CODE value for this GetFpxx.
     * 
     * @param INSURANCE_CODE
     */
    public void setINSURANCE_CODE(java.lang.String INSURANCE_CODE) {
        this.INSURANCE_CODE = INSURANCE_CODE;
    }


    /**
     * Gets the ID_NO value for this GetFpxx.
     * 
     * @return ID_NO
     */
    public java.lang.String getID_NO() {
        return ID_NO;
    }


    /**
     * Sets the ID_NO value for this GetFpxx.
     * 
     * @param ID_NO
     */
    public void setID_NO(java.lang.String ID_NO) {
        this.ID_NO = ID_NO;
    }


    /**
     * Gets the brid value for this GetFpxx.
     * 
     * @return brid
     */
    public java.lang.String getBrid() {
        return brid;
    }


    /**
     * Sets the brid value for this GetFpxx.
     * 
     * @param brid
     */
    public void setBrid(java.lang.String brid) {
        this.brid = brid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFpxx)) return false;
        GetFpxx other = (GetFpxx) obj;
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
            ((this.brxm==null && other.getBrxm()==null) || 
             (this.brxm!=null &&
              this.brxm.equals(other.getBrxm()))) &&
            ((this.sky==null && other.getSky()==null) || 
             (this.sky!=null &&
              this.sky.equals(other.getSky()))) &&
            ((this.fphm1==null && other.getFphm1()==null) || 
             (this.fphm1!=null &&
              this.fphm1.equals(other.getFphm1()))) &&
            ((this.fphm2==null && other.getFphm2()==null) || 
             (this.fphm2!=null &&
              this.fphm2.equals(other.getFphm2()))) &&
            ((this.INSURANCE_CODE==null && other.getINSURANCE_CODE()==null) || 
             (this.INSURANCE_CODE!=null &&
              this.INSURANCE_CODE.equals(other.getINSURANCE_CODE()))) &&
            ((this.ID_NO==null && other.getID_NO()==null) || 
             (this.ID_NO!=null &&
              this.ID_NO.equals(other.getID_NO()))) &&
            ((this.brid==null && other.getBrid()==null) || 
             (this.brid!=null &&
              this.brid.equals(other.getBrid())));
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
        if (getBrxm() != null) {
            _hashCode += getBrxm().hashCode();
        }
        if (getSky() != null) {
            _hashCode += getSky().hashCode();
        }
        if (getFphm1() != null) {
            _hashCode += getFphm1().hashCode();
        }
        if (getFphm2() != null) {
            _hashCode += getFphm2().hashCode();
        }
        if (getINSURANCE_CODE() != null) {
            _hashCode += getINSURANCE_CODE().hashCode();
        }
        if (getID_NO() != null) {
            _hashCode += getID_NO().hashCode();
        }
        if (getBrid() != null) {
            _hashCode += getBrid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFpxx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetFpxx"));
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
        elemField.setFieldName("brxm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "brxm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sky");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sky"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fphm1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fphm1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fphm2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fphm2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSURANCE_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "INSURANCE_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ID_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "brid"));
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
