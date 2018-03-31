/**
 * AddTzxx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AddTzxx  implements java.io.Serializable {
    private java.lang.String YGDM;

    private java.lang.String YGXM;

    private java.lang.String GHKS;

    private java.lang.String GHKSDM;

    private java.lang.String TZRQ;

    private java.lang.String CREATEUSER;

    private java.lang.String GHLB;

    public AddTzxx() {
    }

    public AddTzxx(
           java.lang.String YGDM,
           java.lang.String YGXM,
           java.lang.String GHKS,
           java.lang.String GHKSDM,
           java.lang.String TZRQ,
           java.lang.String CREATEUSER,
           java.lang.String GHLB) {
           this.YGDM = YGDM;
           this.YGXM = YGXM;
           this.GHKS = GHKS;
           this.GHKSDM = GHKSDM;
           this.TZRQ = TZRQ;
           this.CREATEUSER = CREATEUSER;
           this.GHLB = GHLB;
    }


    /**
     * Gets the YGDM value for this AddTzxx.
     * 
     * @return YGDM
     */
    public java.lang.String getYGDM() {
        return YGDM;
    }


    /**
     * Sets the YGDM value for this AddTzxx.
     * 
     * @param YGDM
     */
    public void setYGDM(java.lang.String YGDM) {
        this.YGDM = YGDM;
    }


    /**
     * Gets the YGXM value for this AddTzxx.
     * 
     * @return YGXM
     */
    public java.lang.String getYGXM() {
        return YGXM;
    }


    /**
     * Sets the YGXM value for this AddTzxx.
     * 
     * @param YGXM
     */
    public void setYGXM(java.lang.String YGXM) {
        this.YGXM = YGXM;
    }


    /**
     * Gets the GHKS value for this AddTzxx.
     * 
     * @return GHKS
     */
    public java.lang.String getGHKS() {
        return GHKS;
    }


    /**
     * Sets the GHKS value for this AddTzxx.
     * 
     * @param GHKS
     */
    public void setGHKS(java.lang.String GHKS) {
        this.GHKS = GHKS;
    }


    /**
     * Gets the GHKSDM value for this AddTzxx.
     * 
     * @return GHKSDM
     */
    public java.lang.String getGHKSDM() {
        return GHKSDM;
    }


    /**
     * Sets the GHKSDM value for this AddTzxx.
     * 
     * @param GHKSDM
     */
    public void setGHKSDM(java.lang.String GHKSDM) {
        this.GHKSDM = GHKSDM;
    }


    /**
     * Gets the TZRQ value for this AddTzxx.
     * 
     * @return TZRQ
     */
    public java.lang.String getTZRQ() {
        return TZRQ;
    }


    /**
     * Sets the TZRQ value for this AddTzxx.
     * 
     * @param TZRQ
     */
    public void setTZRQ(java.lang.String TZRQ) {
        this.TZRQ = TZRQ;
    }


    /**
     * Gets the CREATEUSER value for this AddTzxx.
     * 
     * @return CREATEUSER
     */
    public java.lang.String getCREATEUSER() {
        return CREATEUSER;
    }


    /**
     * Sets the CREATEUSER value for this AddTzxx.
     * 
     * @param CREATEUSER
     */
    public void setCREATEUSER(java.lang.String CREATEUSER) {
        this.CREATEUSER = CREATEUSER;
    }


    /**
     * Gets the GHLB value for this AddTzxx.
     * 
     * @return GHLB
     */
    public java.lang.String getGHLB() {
        return GHLB;
    }


    /**
     * Sets the GHLB value for this AddTzxx.
     * 
     * @param GHLB
     */
    public void setGHLB(java.lang.String GHLB) {
        this.GHLB = GHLB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddTzxx)) return false;
        AddTzxx other = (AddTzxx) obj;
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
            ((this.YGXM==null && other.getYGXM()==null) || 
             (this.YGXM!=null &&
              this.YGXM.equals(other.getYGXM()))) &&
            ((this.GHKS==null && other.getGHKS()==null) || 
             (this.GHKS!=null &&
              this.GHKS.equals(other.getGHKS()))) &&
            ((this.GHKSDM==null && other.getGHKSDM()==null) || 
             (this.GHKSDM!=null &&
              this.GHKSDM.equals(other.getGHKSDM()))) &&
            ((this.TZRQ==null && other.getTZRQ()==null) || 
             (this.TZRQ!=null &&
              this.TZRQ.equals(other.getTZRQ()))) &&
            ((this.CREATEUSER==null && other.getCREATEUSER()==null) || 
             (this.CREATEUSER!=null &&
              this.CREATEUSER.equals(other.getCREATEUSER()))) &&
            ((this.GHLB==null && other.getGHLB()==null) || 
             (this.GHLB!=null &&
              this.GHLB.equals(other.getGHLB())));
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
        if (getYGXM() != null) {
            _hashCode += getYGXM().hashCode();
        }
        if (getGHKS() != null) {
            _hashCode += getGHKS().hashCode();
        }
        if (getGHKSDM() != null) {
            _hashCode += getGHKSDM().hashCode();
        }
        if (getTZRQ() != null) {
            _hashCode += getTZRQ().hashCode();
        }
        if (getCREATEUSER() != null) {
            _hashCode += getCREATEUSER().hashCode();
        }
        if (getGHLB() != null) {
            _hashCode += getGHLB().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddTzxx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddTzxx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YGDM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "YGDM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YGXM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "YGXM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GHKS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GHKS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GHKSDM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GHKSDM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TZRQ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TZRQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CREATEUSER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CREATEUSER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GHLB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GHLB"));
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
