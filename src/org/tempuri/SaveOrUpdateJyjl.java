/**
 * SaveOrUpdateJyjl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SaveOrUpdateJyjl  implements java.io.Serializable {
    private java.lang.String YWXLH;

    private java.lang.String JYGN;

    private java.lang.String QRBZ;

    private java.lang.String SQSJ;

    private java.lang.String QRSJ;

    private java.lang.String YBKH;

    private java.lang.String CZGH;

    private java.lang.String ZXLSH;

    public SaveOrUpdateJyjl() {
    }

    public SaveOrUpdateJyjl(
           java.lang.String YWXLH,
           java.lang.String JYGN,
           java.lang.String QRBZ,
           java.lang.String SQSJ,
           java.lang.String QRSJ,
           java.lang.String YBKH,
           java.lang.String CZGH,
           java.lang.String ZXLSH) {
           this.YWXLH = YWXLH;
           this.JYGN = JYGN;
           this.QRBZ = QRBZ;
           this.SQSJ = SQSJ;
           this.QRSJ = QRSJ;
           this.YBKH = YBKH;
           this.CZGH = CZGH;
           this.ZXLSH = ZXLSH;
    }


    /**
     * Gets the YWXLH value for this SaveOrUpdateJyjl.
     * 
     * @return YWXLH
     */
    public java.lang.String getYWXLH() {
        return YWXLH;
    }


    /**
     * Sets the YWXLH value for this SaveOrUpdateJyjl.
     * 
     * @param YWXLH
     */
    public void setYWXLH(java.lang.String YWXLH) {
        this.YWXLH = YWXLH;
    }


    /**
     * Gets the JYGN value for this SaveOrUpdateJyjl.
     * 
     * @return JYGN
     */
    public java.lang.String getJYGN() {
        return JYGN;
    }


    /**
     * Sets the JYGN value for this SaveOrUpdateJyjl.
     * 
     * @param JYGN
     */
    public void setJYGN(java.lang.String JYGN) {
        this.JYGN = JYGN;
    }


    /**
     * Gets the QRBZ value for this SaveOrUpdateJyjl.
     * 
     * @return QRBZ
     */
    public java.lang.String getQRBZ() {
        return QRBZ;
    }


    /**
     * Sets the QRBZ value for this SaveOrUpdateJyjl.
     * 
     * @param QRBZ
     */
    public void setQRBZ(java.lang.String QRBZ) {
        this.QRBZ = QRBZ;
    }


    /**
     * Gets the SQSJ value for this SaveOrUpdateJyjl.
     * 
     * @return SQSJ
     */
    public java.lang.String getSQSJ() {
        return SQSJ;
    }


    /**
     * Sets the SQSJ value for this SaveOrUpdateJyjl.
     * 
     * @param SQSJ
     */
    public void setSQSJ(java.lang.String SQSJ) {
        this.SQSJ = SQSJ;
    }


    /**
     * Gets the QRSJ value for this SaveOrUpdateJyjl.
     * 
     * @return QRSJ
     */
    public java.lang.String getQRSJ() {
        return QRSJ;
    }


    /**
     * Sets the QRSJ value for this SaveOrUpdateJyjl.
     * 
     * @param QRSJ
     */
    public void setQRSJ(java.lang.String QRSJ) {
        this.QRSJ = QRSJ;
    }


    /**
     * Gets the YBKH value for this SaveOrUpdateJyjl.
     * 
     * @return YBKH
     */
    public java.lang.String getYBKH() {
        return YBKH;
    }


    /**
     * Sets the YBKH value for this SaveOrUpdateJyjl.
     * 
     * @param YBKH
     */
    public void setYBKH(java.lang.String YBKH) {
        this.YBKH = YBKH;
    }


    /**
     * Gets the CZGH value for this SaveOrUpdateJyjl.
     * 
     * @return CZGH
     */
    public java.lang.String getCZGH() {
        return CZGH;
    }


    /**
     * Sets the CZGH value for this SaveOrUpdateJyjl.
     * 
     * @param CZGH
     */
    public void setCZGH(java.lang.String CZGH) {
        this.CZGH = CZGH;
    }


    /**
     * Gets the ZXLSH value for this SaveOrUpdateJyjl.
     * 
     * @return ZXLSH
     */
    public java.lang.String getZXLSH() {
        return ZXLSH;
    }


    /**
     * Sets the ZXLSH value for this SaveOrUpdateJyjl.
     * 
     * @param ZXLSH
     */
    public void setZXLSH(java.lang.String ZXLSH) {
        this.ZXLSH = ZXLSH;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaveOrUpdateJyjl)) return false;
        SaveOrUpdateJyjl other = (SaveOrUpdateJyjl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.YWXLH==null && other.getYWXLH()==null) || 
             (this.YWXLH!=null &&
              this.YWXLH.equals(other.getYWXLH()))) &&
            ((this.JYGN==null && other.getJYGN()==null) || 
             (this.JYGN!=null &&
              this.JYGN.equals(other.getJYGN()))) &&
            ((this.QRBZ==null && other.getQRBZ()==null) || 
             (this.QRBZ!=null &&
              this.QRBZ.equals(other.getQRBZ()))) &&
            ((this.SQSJ==null && other.getSQSJ()==null) || 
             (this.SQSJ!=null &&
              this.SQSJ.equals(other.getSQSJ()))) &&
            ((this.QRSJ==null && other.getQRSJ()==null) || 
             (this.QRSJ!=null &&
              this.QRSJ.equals(other.getQRSJ()))) &&
            ((this.YBKH==null && other.getYBKH()==null) || 
             (this.YBKH!=null &&
              this.YBKH.equals(other.getYBKH()))) &&
            ((this.CZGH==null && other.getCZGH()==null) || 
             (this.CZGH!=null &&
              this.CZGH.equals(other.getCZGH()))) &&
            ((this.ZXLSH==null && other.getZXLSH()==null) || 
             (this.ZXLSH!=null &&
              this.ZXLSH.equals(other.getZXLSH())));
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
        if (getYWXLH() != null) {
            _hashCode += getYWXLH().hashCode();
        }
        if (getJYGN() != null) {
            _hashCode += getJYGN().hashCode();
        }
        if (getQRBZ() != null) {
            _hashCode += getQRBZ().hashCode();
        }
        if (getSQSJ() != null) {
            _hashCode += getSQSJ().hashCode();
        }
        if (getQRSJ() != null) {
            _hashCode += getQRSJ().hashCode();
        }
        if (getYBKH() != null) {
            _hashCode += getYBKH().hashCode();
        }
        if (getCZGH() != null) {
            _hashCode += getCZGH().hashCode();
        }
        if (getZXLSH() != null) {
            _hashCode += getZXLSH().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaveOrUpdateJyjl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SaveOrUpdateJyjl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YWXLH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "YWXLH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JYGN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "JYGN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QRBZ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "QRBZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SQSJ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SQSJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QRSJ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "QRSJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YBKH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "YBKH"));
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
        elemField.setFieldName("ZXLSH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZXLSH"));
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
