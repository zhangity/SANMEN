/**
 * GetXxzl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetXxzl  implements java.io.Serializable {
    private java.lang.String dateBegin;

    private java.lang.String dateOver;

    private java.lang.String brxm;

    private java.lang.String INSURANCE_CODE;

    private java.lang.String ID_NO;

    private java.lang.String brid;

    private java.lang.String DOCTOR_CODE;

    public GetXxzl() {
    }

    public GetXxzl(
           java.lang.String dateBegin,
           java.lang.String dateOver,
           java.lang.String brxm,
           java.lang.String INSURANCE_CODE,
           java.lang.String ID_NO,
           java.lang.String brid,
           java.lang.String DOCTOR_CODE) {
           this.dateBegin = dateBegin;
           this.dateOver = dateOver;
           this.brxm = brxm;
           this.INSURANCE_CODE = INSURANCE_CODE;
           this.ID_NO = ID_NO;
           this.brid = brid;
           this.DOCTOR_CODE = DOCTOR_CODE;
    }


    /**
     * Gets the dateBegin value for this GetXxzl.
     * 
     * @return dateBegin
     */
    public java.lang.String getDateBegin() {
        return dateBegin;
    }


    /**
     * Sets the dateBegin value for this GetXxzl.
     * 
     * @param dateBegin
     */
    public void setDateBegin(java.lang.String dateBegin) {
        this.dateBegin = dateBegin;
    }


    /**
     * Gets the dateOver value for this GetXxzl.
     * 
     * @return dateOver
     */
    public java.lang.String getDateOver() {
        return dateOver;
    }


    /**
     * Sets the dateOver value for this GetXxzl.
     * 
     * @param dateOver
     */
    public void setDateOver(java.lang.String dateOver) {
        this.dateOver = dateOver;
    }


    /**
     * Gets the brxm value for this GetXxzl.
     * 
     * @return brxm
     */
    public java.lang.String getBrxm() {
        return brxm;
    }


    /**
     * Sets the brxm value for this GetXxzl.
     * 
     * @param brxm
     */
    public void setBrxm(java.lang.String brxm) {
        this.brxm = brxm;
    }


    /**
     * Gets the INSURANCE_CODE value for this GetXxzl.
     * 
     * @return INSURANCE_CODE
     */
    public java.lang.String getINSURANCE_CODE() {
        return INSURANCE_CODE;
    }


    /**
     * Sets the INSURANCE_CODE value for this GetXxzl.
     * 
     * @param INSURANCE_CODE
     */
    public void setINSURANCE_CODE(java.lang.String INSURANCE_CODE) {
        this.INSURANCE_CODE = INSURANCE_CODE;
    }


    /**
     * Gets the ID_NO value for this GetXxzl.
     * 
     * @return ID_NO
     */
    public java.lang.String getID_NO() {
        return ID_NO;
    }


    /**
     * Sets the ID_NO value for this GetXxzl.
     * 
     * @param ID_NO
     */
    public void setID_NO(java.lang.String ID_NO) {
        this.ID_NO = ID_NO;
    }


    /**
     * Gets the brid value for this GetXxzl.
     * 
     * @return brid
     */
    public java.lang.String getBrid() {
        return brid;
    }


    /**
     * Sets the brid value for this GetXxzl.
     * 
     * @param brid
     */
    public void setBrid(java.lang.String brid) {
        this.brid = brid;
    }


    /**
     * Gets the DOCTOR_CODE value for this GetXxzl.
     * 
     * @return DOCTOR_CODE
     */
    public java.lang.String getDOCTOR_CODE() {
        return DOCTOR_CODE;
    }


    /**
     * Sets the DOCTOR_CODE value for this GetXxzl.
     * 
     * @param DOCTOR_CODE
     */
    public void setDOCTOR_CODE(java.lang.String DOCTOR_CODE) {
        this.DOCTOR_CODE = DOCTOR_CODE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetXxzl)) return false;
        GetXxzl other = (GetXxzl) obj;
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
            ((this.INSURANCE_CODE==null && other.getINSURANCE_CODE()==null) || 
             (this.INSURANCE_CODE!=null &&
              this.INSURANCE_CODE.equals(other.getINSURANCE_CODE()))) &&
            ((this.ID_NO==null && other.getID_NO()==null) || 
             (this.ID_NO!=null &&
              this.ID_NO.equals(other.getID_NO()))) &&
            ((this.brid==null && other.getBrid()==null) || 
             (this.brid!=null &&
              this.brid.equals(other.getBrid()))) &&
            ((this.DOCTOR_CODE==null && other.getDOCTOR_CODE()==null) || 
             (this.DOCTOR_CODE!=null &&
              this.DOCTOR_CODE.equals(other.getDOCTOR_CODE())));
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
        if (getINSURANCE_CODE() != null) {
            _hashCode += getINSURANCE_CODE().hashCode();
        }
        if (getID_NO() != null) {
            _hashCode += getID_NO().hashCode();
        }
        if (getBrid() != null) {
            _hashCode += getBrid().hashCode();
        }
        if (getDOCTOR_CODE() != null) {
            _hashCode += getDOCTOR_CODE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetXxzl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetXxzl"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOCTOR_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DOCTOR_CODE"));
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
